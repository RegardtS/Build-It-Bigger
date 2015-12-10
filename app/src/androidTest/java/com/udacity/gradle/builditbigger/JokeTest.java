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


    private Context instrumantationCtx;

    public void testStringNotNull(){

        instrumantationCtx = getInstrumentation().getContext();



        final Object randomLock = new Object();
        final Semaphore sem =
                new Semaphore(1);
        final EndpointsAsyncTask x = new EndpointsAsyncTask(){

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                try {
                    Log.wtf("regi", "resutl==1");
                    sem.acquire();
                    Log.wtf("regi", "resutl==2");
                } catch (Exception e){
                    Log.wtf("regi", "resutl==3");
                    e.printStackTrace();
                }
            }

            @Override
            protected void onPostExecute(String result) {
                super.onPostExecute(result);
                Log.wtf("regi", "resutl==" + result);
                sem.release();


                assertNotNull(result);
                assertTrue(result.isEmpty());

            }
        };





        try {


                    x.execute(new Pair<Context, String>(instrumantationCtx, "Manfred"));


            Log.wtf("regi", "resutl==4");
            sem.acquire();
            Log.wtf("regi", "resutl==5");




        } catch (Throwable throwable ){

            throwable.printStackTrace();
            Log.wtf("regi", throwable.getMessage());
            System.out.println(throwable.getMessage());
            assertTrue(false);
        }finally {
            assertTrue(false);
        }


    }


}
