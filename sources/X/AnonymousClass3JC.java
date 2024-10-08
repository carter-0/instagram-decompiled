package X;

import com.facebook.pando.Summary;

/* renamed from: X.3JC  reason: invalid class name */
public final class AnonymousClass3JC extends 1XQ implements AnonymousClass3JD, 1XU {
    public final Summary A00;
    public final Object A01;
    public final long A02;

    public final /* synthetic */ void EQF(String str) {
    }

    public final Integer B87() {
        if (this.A01 == null) {
            return AnonymousClass05K.A0N;
        }
        return C347607x5.A00(this.A00);
    }

    public final Object Bny() {
        return this.A01;
    }

    public final Summary C2v() {
        return this.A00;
    }

    public final boolean CPt() {
        Summary summary = this.A00;
        if (0qQ.A0K(summary.source, "stale_cache") || 0qQ.A0K(summary.source, "fresh_cache")) {
            return true;
        }
        return false;
    }

    public final void EQE(long j) {
        throw new UnsupportedOperationException("setCacheReadLatency not supported for IGGraphQLResult");
    }

    public final void EQG(long j) {
        throw new UnsupportedOperationException("setCachedResponseTimeStamp not supported for IGGraphQLResult");
    }

    public AnonymousClass3JC(Summary summary, Object obj, int i) {
        this.A01 = obj;
        this.A00 = summary;
        this.A02 = System.currentTimeMillis();
        String str = summary.source;
        if (0qQ.A0K(str, "stale_cache") || 0qQ.A0K(str, "fresh_cache")) {
            this.mFromDiskCache = true;
        }
        this.mStatusCode = i;
    }

    public final long AjJ() {
        if (!CPt()) {
            return -1;
        }
        Summary summary = this.A00;
        return summary.cacheEndTime - summary.cacheStartTime;
    }

    public final long AjP() {
        if (!CPt()) {
            return -1;
        }
        return this.A02 - this.A00.cacheAge;
    }

    public AnonymousClass3JC(Summary summary, Object obj) {
        this(summary, obj, 200);
    }
}
