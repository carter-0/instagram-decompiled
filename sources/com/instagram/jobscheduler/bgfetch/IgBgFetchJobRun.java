package com.instagram.jobscheduler.bgfetch;

import X.AnonymousClass00P;
import X.C20512Wss;
import X.C255463uA;
import X.VJ6;
import kotlinx.serialization.Serializable;

@Serializable
public final class IgBgFetchJobRun {
    public static final Companion Companion = new Object();
    public long A00;
    public long A01;
    public final int A02;
    public final long A03;

    public final class Companion {
        public final C255463uA serializer() {
            return C20512Wss.A00;
        }
    }

    public IgBgFetchJobRun(int i, long j) {
        this.A02 = i;
        this.A03 = j;
        this.A01 = -1;
        this.A00 = -1;
    }

    public /* synthetic */ IgBgFetchJobRun(int i, int i2, long j, long j2, long j3) {
        if (3 != (i & 3)) {
            VJ6.A00(C20512Wss.A01, i, 3);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A02 = i2;
        this.A03 = j;
        if ((i & 4) == 0) {
            this.A01 = -1;
        } else {
            this.A01 = j2;
        }
        if ((i & 8) == 0) {
            this.A00 = -1;
        } else {
            this.A00 = j3;
        }
    }
}
