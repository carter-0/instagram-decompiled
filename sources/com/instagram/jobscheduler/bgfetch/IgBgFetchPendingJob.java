package com.instagram.jobscheduler.bgfetch;

import X.0qQ;
import X.AnonymousClass00P;
import X.C20514Wsu;
import X.C255463uA;
import X.VJ6;
import kotlinx.serialization.Serializable;

@Serializable
public final class IgBgFetchPendingJob {
    public static final Companion Companion = new Object();
    public final long A00;
    public final IgBgFetchJob A01;

    public final class Companion {
        public final C255463uA serializer() {
            return C20514Wsu.A00;
        }
    }

    public /* synthetic */ IgBgFetchPendingJob(IgBgFetchJob igBgFetchJob, int i, long j) {
        if (3 != (i & 3)) {
            VJ6.A00(C20514Wsu.A01, i, 3);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A01 = igBgFetchJob;
        this.A00 = j;
    }

    public IgBgFetchPendingJob(IgBgFetchJob igBgFetchJob, long j) {
        0qQ.A0B(igBgFetchJob, 1);
        this.A01 = igBgFetchJob;
        this.A00 = j;
    }
}
