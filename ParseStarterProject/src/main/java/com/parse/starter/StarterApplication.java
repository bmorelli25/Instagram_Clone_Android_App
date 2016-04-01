/*
 * Copyright (c) 2015-present, Parse, LLC.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */
package com.parse.starter;

import android.app.Application;
import android.util.Log;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseUser;
import com.parse.SaveCallback;


public class StarterApplication extends Application {

  @Override
  public void onCreate() {
    super.onCreate();

    // Enable Local Datastore.
    Parse.enableLocalDatastore(this);

    // Add your initialization code here
    Parse.initialize(new Parse.Configuration.Builder(getApplicationContext())
            .applicationId("instagram65418FUIE83f1fa3ER3")
            .clientKey(null)
            .server("https://instagram318.herokuapp.com/parse/")
    .build()
    );
/*
      ParseObject gameScore = new ParseObject("GameScore");
      gameScore.put("score", 1337);
      gameScore.put("playerName", "Sean Plott");
      gameScore.put("cheatMode", false);
      gameScore.saveInBackground(new SaveCallback() {
          public void done(ParseException e) {
              if (e == null) {
                  Log.i("Parse", "Save Succeeded");
              } else {
                  Log.i("Parse", "Save Failed");
              }
          }
      });

*/
     // ParseUser.enableAutomaticUser();
    ParseACL defaultACL = new ParseACL();
    // Optionally enable public read access.
    // defaultACL.setPublicReadAccess(true);
    ParseACL.setDefaultACL(defaultACL, true);
  }
}
