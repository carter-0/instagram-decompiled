package com.facebook.cameracore.mediapipeline.services.experimentconfig.implementation.common;

import X.0qQ;
import X.AnonymousClass05K;
import X.AnonymousClass932;
import X.AnonymousClass933;
import X.C312576ei;
import com.facebook.cameracore.mediapipeline.services.experimentconfig.interfaces.ARExperimentConfig;
import com.facebook.jni.HybridData;

public final class ARExperimentConfigImpl extends ARExperimentConfig {
    public final C312576ei arExperimentUtil;

    private final native HybridData initHybrid();

    public String getString(int i, String str) {
        Integer num;
        0qQ.A0B(str, 1);
        C312576ei r2 = this.arExperimentUtil;
        if (r2 == null) {
            return str;
        }
        if (i >= 0) {
            Integer[] numArr = AnonymousClass932.A03;
            if (i < numArr.length) {
                num = numArr[i];
                return r2.C1l(num, str);
            }
        }
        num = AnonymousClass05K.A00;
        return r2.C1l(num, str);
    }

    public boolean getBool(int i, boolean z) {
        AnonymousClass933 r0;
        C312576ei r2 = this.arExperimentUtil;
        if (r2 == null) {
            return z;
        }
        if (i >= 0) {
            AnonymousClass933[] r1 = AnonymousClass932.A00;
            if (i < r1.length) {
                r0 = r1[i];
                return r2.Ags(r0, z);
            }
        }
        r0 = AnonymousClass933.Dummy;
        return r2.Ags(r0, z);
    }

    public boolean getBoolWithoutLogging(int i, boolean z) {
        AnonymousClass933 r0;
        C312576ei r2 = this.arExperimentUtil;
        if (r2 == null) {
            return z;
        }
        if (i >= 0) {
            AnonymousClass933[] r1 = AnonymousClass932.A00;
            if (i < r1.length) {
                r0 = r1[i];
                return r2.Agu(r0, z);
            }
        }
        r0 = AnonymousClass933.Dummy;
        return r2.Agu(r0, z);
    }

    public double getDouble(int i, double d) {
        Integer num;
        C312576ei r2 = this.arExperimentUtil;
        if (r2 == null) {
            return d;
        }
        if (i >= 0) {
            Integer[] numArr = AnonymousClass932.A01;
            if (i < numArr.length) {
                num = numArr[i];
                return r2.Ayf(num, d);
            }
        }
        num = AnonymousClass05K.A00;
        return r2.Ayf(num, d);
    }

    public long getLong(int i, long j) {
        Integer num;
        C312576ei r2 = this.arExperimentUtil;
        if (r2 == null) {
            return j;
        }
        if (i >= 0) {
            Integer[] numArr = AnonymousClass932.A02;
            if (i < numArr.length) {
                num = numArr[i];
                return r2.BOQ(num, j);
            }
        }
        num = AnonymousClass05K.A00;
        return r2.BOQ(num, j);
    }

    public ARExperimentConfigImpl(C312576ei r2) {
        this.mHybridData = initHybrid();
        this.arExperimentUtil = r2;
    }

    public ARExperimentConfigImpl() {
        this((C312576ei) null);
    }
}
