package X;

import com.facebook.pando.Summary;

/* renamed from: X.3si  reason: invalid class name and case insensitive filesystem */
public final class C254583si implements AnonymousClass3JD {
    public final Summary A00;
    public final Object A01;

    public final Integer B87() {
        return C347607x5.A00(this.A00);
    }

    public final Object Bny() {
        return this.A01;
    }

    public final Summary C2v() {
        return this.A00;
    }

    public C254583si(Summary summary, Object obj) {
        this.A01 = obj;
        this.A00 = summary;
        if (!0qQ.A0K(summary.source, "stale_cache")) {
            0qQ.A0K(summary.source, "fresh_cache");
        }
    }
}
