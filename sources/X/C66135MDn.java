package X;

import androidx.paging.PageEvent$Insert;
import androidx.paging.PageFetcherSnapshot;

/* renamed from: X.MDn  reason: case insensitive filesystem */
public final class C66135MDn extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public Object A0A;
    public Object A0B;
    public Object A0C;
    public Object A0D;
    public final int A0E = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66135MDn(PageEvent$Insert pageEvent$Insert, AnonymousClass4D7 r3) {
        super(r3);
        this.A05 = pageEvent$Insert;
    }

    public static void A00(Object obj, Object obj2, Object obj3, Object obj4, C66135MDn mDn) {
        mDn.A09 = obj;
        mDn.A0A = obj2;
        mDn.A0B = obj3;
        mDn.A0C = obj4;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.4D7, X.MDn] */
    public final Object invokeSuspend(Object obj) {
        if (this.A0E != 0) {
            this.A02 = obj;
            this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
            return PageFetcherSnapshot.A00((LFi) null, (C62448Kfy) null, (PageFetcherSnapshot) this.A01, this);
        }
        this.A04 = obj;
        this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        return ((C62942Kou) this.A05).A01(this, (0sL) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66135MDn(PageFetcherSnapshot pageFetcherSnapshot, AnonymousClass4D7 r3) {
        super(r3);
        this.A01 = pageFetcherSnapshot;
    }
}
