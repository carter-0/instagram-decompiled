package com.instagram.jobscheduler.bgfetch;

import X.AnonymousClass00P;
import X.AnonymousClass0T0;
import X.C20511Wsr;
import X.C255463uA;
import X.C51968G9o;
import X.VJ6;
import kotlinx.serialization.Serializable;

@Serializable
public final class IgBgFetchJob extends AnonymousClass0T0 {
    public static final Companion Companion = new Object();
    public final int A00;
    public final long A01;

    public final class Companion {
        public final C255463uA serializer() {
            return C20511Wsr.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IgBgFetchJob) {
                IgBgFetchJob igBgFetchJob = (IgBgFetchJob) obj;
                if (!(this.A00 == igBgFetchJob.A00 && this.A01 == igBgFetchJob.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ IgBgFetchJob(int i, int i2, long j) {
        if (3 != (i & 3)) {
            VJ6.A00(C20511Wsr.A01, i, 3);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A00 = i2;
        this.A01 = j;
    }

    public final int hashCode() {
        return (this.A00 * 31) + C51968G9o.A03(this.A01);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A00);
        sb.append(':');
        sb.append(this.A01);
        return sb.toString();
    }

    public IgBgFetchJob(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }
}
