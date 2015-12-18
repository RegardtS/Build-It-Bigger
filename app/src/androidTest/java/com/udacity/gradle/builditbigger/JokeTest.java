package com.udacity.gradle.builditbigger;


import android.content.Context;
import android.os.AsyncTask;
import android.support.v4.util.Pair;
import android.test.AndroidTestCase;
import android.test.InstrumentationTestCase;
import android.util.Log;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;


/**
 * Created by regardtschindler on 2015/12/08.
 */


public class JokeTest extends InstrumentationTestCase {

    public void testStringNotNull(){

        Context instrumantationCtx = getInstrumentation().getContext();

        final Semaphore sem =new Semaphore(1);
        final EndpointsAsyncTask x = new EndpointsAsyncTask(){

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                try {
                    sem.acquire();
                } catch (Exception e){
                    e.printStackTrace();
                    throw new AssertionError();
                }
            }

            @Override
            protected void onPostExecute(String result) {
                sem.release();

                assertNotNull(result);
                assertFalse(result.isEmpty());
            }
        };
        try {

            x.execute(new Pair<Context, String>(instrumantationCtx, "Manfred"));
            sem.acquire();
        } catch (Throwable throwable ){
            throw new AssertionError();
        }


    }


}
