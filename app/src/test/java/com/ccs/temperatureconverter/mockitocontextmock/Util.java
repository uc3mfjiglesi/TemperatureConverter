package com.ccs.temperatureconverter.mockitocontextmock;

import android.content.Context;

import java.io.FileOutputStream;

/**
 * Created by javier1 on 14/2/17.
 */

public class Util {
    public static void writeConfiguration(Context ctx ) {
        try (FileOutputStream openFileOutput =
                     ctx.openFileOutput( "config.txt", Context.MODE_PRIVATE);) {

            openFileOutput.write("This is a test1.".getBytes());
            openFileOutput.write("This is a test2.".getBytes());
        } catch (Exception e) {
            // not handled
        }
    }
}
