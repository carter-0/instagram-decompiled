package com.facebook.secure.file.format.extended.jni;

import X.0dV;
import X.0qQ;
import X.C51974G9v;
import X.C69738NrN;
import com.facebook.jni.HybridData;
import java.util.List;

public final class Magi {
    public static final C69738NrN Companion = new Object();
    public final HybridData mHybridData;

    public final class MatchResult {
        public final String error;
        public final String extension;
        public final boolean match;
        public final String mimeType;

        public final String getError() {
            return this.error;
        }

        public final String getExtension() {
            return this.extension;
        }

        public final boolean getMatch() {
            return this.match;
        }

        public final String getMimeType() {
            return this.mimeType;
        }

        public MatchResult(boolean z, String str, String str2, String str3) {
            C51974G9v.A1M(str, str2, str3);
            this.match = z;
            this.extension = str;
            this.mimeType = str2;
            this.error = str3;
        }
    }

    public static final native HybridData initHybrid0();

    public static final native long nativeCreate();

    public static final native void nativeDispose(long j);

    public static final native MatchResult nativeMatch(long j, String str, List list, List list2);

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.NrN] */
    static {
        0dV.A0C("magi-jni");
    }

    public Magi() {
        this(initHybrid0());
    }

    public Magi(HybridData hybridData) {
        0qQ.A0B(hybridData, 1);
        this.mHybridData = hybridData;
    }
}
