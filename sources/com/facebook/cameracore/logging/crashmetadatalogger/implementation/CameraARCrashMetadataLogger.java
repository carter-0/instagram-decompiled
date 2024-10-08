package com.facebook.cameracore.logging.crashmetadatalogger.implementation;

import X.0qQ;
import com.facebook.breakpad.BreakpadManager;
import java.util.HashSet;
import java.util.Iterator;

public final class CameraARCrashMetadataLogger {
    public HashSet loggedKeys = new HashSet();

    public final synchronized void cleanupBreakpadData() {
        Iterator it = this.loggedKeys.iterator();
        0qQ.A07(it);
        while (it.hasNext()) {
            Object next = it.next();
            0qQ.A07(next);
            BreakpadManager.removeCustomData((String) next);
        }
        this.loggedKeys.clear();
    }

    public final synchronized void setBreakpadData(String str, String str2) {
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 1);
        BreakpadManager.setCustomData(str, str2, new Object[0]);
        this.loggedKeys.add(str);
    }

    public final void setLoggedKeys(HashSet hashSet) {
        0qQ.A0B(hashSet, 0);
        this.loggedKeys = hashSet;
    }

    public final HashSet getLoggedKeys() {
        return this.loggedKeys;
    }
}
