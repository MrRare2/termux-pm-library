/*
**
** Copyright 2007, The Android Open Source Project
**
** Licensed under the Apache License, Version 2.0 (the "License");
** you may not use this file except in compliance with the License.
** You may obtain a copy of the License at
**
**     http://www.apache.org/licenses/LICENSE-2.0
**
** Unless required by applicable law or agreed to in writing, software
** distributed under the License is distributed on an "AS IS" BASIS,
** WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
** See the License for the specific language governing permissions and
** limitations under the License.
*/


package com.termux.pm;

import android.app.Activity;
import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Handler;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.security.InvalidParameterException;

public class Pm extends BaseCommand {
    
    private int mRepeat = 0;
    private String mReceiverPermission;
    
    private final Application app;
    
    public Am(PrintStream out, PrintStream err, Application app) {
        super(out, err);
        if (app == null) throw new InvalidParameterException("app context can't be null");
        this.app = app;
    }
    
    
    @Override
    public void onShowUsage(PrintStream out) {
        PrintWriter pw = new PrintWriter(out);
	/*
        pw.println(
                "usage: am [subcommand] [options]\n" +
                "usage: am start [-D] [-N] [-W] [-P <FILE>] [--start-profiler <FILE>]\n" +
                "               [--sampling INTERVAL] [-R COUNT] [-S]\n" +
                "               [--track-allocation] [--user <USER_ID> | current] <INTENT>\n" +
                "       am startservice [--user <USER_ID> | current] <INTENT>\n" +
                "       am stopservice [--user <USER_ID> | current] <INTENT>\n" +
                "       am broadcast [--user <USER_ID> | all | current] <INTENT>\n" +
                "       am to-uri [INTENT]\n" +
                "       am to-intent-uri [INTENT]\n" +
                "       am to-app-uri [INTENT]\n" +
                "\n" +
                "am start: start an Activity.  Options are:\n" +
                "    -D: enable debugging\n" +
                "    -N: enable native debugging\n" +
                "    -W: wait for launch to complete\n" +
                "    --start-profiler <FILE>: start profiler and send results to <FILE>\n" +
                "    --sampling INTERVAL: use sample profiling with INTERVAL microseconds\n" +
                "        between samples (use with --start-profiler)\n" +
                "    -P <FILE>: like above, but profiling stops when app goes idle\n" +
                "    -R: repeat the activity launch <COUNT> times.  Prior to each repeat,\n" +
                "        the top activity will be finished.\n" +
                "    -S: force stop the target app before starting the activity\n" +
                "    --track-allocation: enable tracking of object allocations\n" +
                "    --user <USER_ID> | current: Specify which user to run as; if not\n" +
                "        specified then run as the current user.\n" +
                "    --stack <STACK_ID>: Specify into which stack should the activity be put." +
                "\n" +
                "am startservice: start a Service.  Options are:\n" +
                "    --user <USER_ID> | current: Specify which user to run as; if not\n" +
                "        specified then run as the current user.\n" +
                "\n" +
                "am stopservice: stop a Service.  Options are:\n" +
                "    --user <USER_ID> | current: Specify which user to run as; if not\n" +
                "        specified then run as the current user.\n" +
                "\n" +
                "am broadcast: send a broadcast Intent.  Options are:\n" +
                "    --user <USER_ID> | all | current: Specify which user to send to; if not\n" +
                "        specified then send to all users.\n" +
                "    --receiver-permission <PERMISSION>: Require receiver to hold permission.\n" +
                "\n" +
                "am to-uri: print the given Intent specification as a URI.\n" +
                "\n" +
                "am to-intent-uri: print the given Intent specification as an intent: URI.\n" +
                "\n" +
                "am to-app-uri: print the given Intent specification as an android-app: URI.\n" +
                "\n"
        );
        IntentCmd.printIntentArgsHelp(pw, "");*/
	pw.println("pm help message stub\n");
        pw.flush();
    }
    
    @Override
    public void onRun() throws Exception {
        String op = nextArgRequired();
        switch (op) {
            case "start":
                runStart();
                break;
            /*case "startservice":
                runStartService();
                break;
            case "stopservice":
                runStopService();
                break;
            case "broadcast":
                sendBroadcast();
                break;
            case "to-uri":
                runToUri(0);
                break;
            case "to-intent-uri":
                runToUri(Intent.URI_INTENT_SCHEME);
                break;
            case "to-app-uri":
                runToUri(Intent.URI_ANDROID_APP_SCHEME);
                break;*/
            default:
                showError("Error: unknown command '" + op + "'");
                break;
        }
    }
    
    private void runStart() throws Exception {
	out.println("pm start stub\n");
    }
  }
}
