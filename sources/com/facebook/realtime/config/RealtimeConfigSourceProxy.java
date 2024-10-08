package com.facebook.realtime.config;

import X.C253333qc;

public class RealtimeConfigSourceProxy {
    public final C253333qc mConfigSource;

    public boolean getGlobalBool(String str, boolean z) {
        return this.mConfigSource.getGlobalBool(str, z);
    }

    public int getGlobalInt(String str, int i) {
        return this.mConfigSource.getGlobalInt(str, i);
    }

    public String getGlobalString(String str, String str2) {
        return this.mConfigSource.getGlobalString(str, str2);
    }

    public boolean getLiveConfigBool(String str, String str2, boolean z) {
        return this.mConfigSource.getBoolForContext(str, str2, z);
    }

    public String getLiveConfigString(String str, String str2, String str3) {
        this.mConfigSource.getStringForContext(str, str2, str3);
        return str3;
    }

    public RealtimeConfigSourceProxy(C253333qc r1) {
        this.mConfigSource = r1;
    }

    public double getGlobalDouble(String str, double d) {
        return d;
    }

    public double getLiveConfigDouble(String str, String str2, double d) {
        return d;
    }

    public int getLiveConfigInt(String str, String str2, int i) {
        return i;
    }
}
