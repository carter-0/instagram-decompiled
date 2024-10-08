package X;

import com.facebook.quickpromotion.sdk.fetcher.ondemand.OnDemandSurfaceTriggerCache;
import com.instagram.screentime.IGScreenTimeApi;

/* renamed from: X.9Je  reason: invalid class name and case insensitive filesystem */
public final class C376749Je extends C64101El {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;
    public final Object A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C376749Je(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A06 = i;
        this.A07 = obj;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.9Je, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        int i = this.A06;
        this.A05 = obj;
        this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        if (i != 0) {
            return ((IGScreenTimeApi) this.A07).A01((String) null, this, 0);
        }
        return OnDemandSurfaceTriggerCache.A00((AnonymousClass42S) null, (OnDemandSurfaceTriggerCache) this.A07, (Object) null, this, false);
    }
}
