package X;

import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.UfK  reason: case insensitive filesystem */
public final class C15592UfK extends 1P0 {
    public final /* synthetic */ C230152p2 A00;
    public final /* synthetic */ C230132oy A01;
    public final /* synthetic */ Hashtag A02;

    public C15592UfK(C230152p2 r1, C230132oy r2, Hashtag hashtag) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = hashtag;
    }

    public final void onFail(C268654dm r7) {
        int A03 = AnonymousClass0fD.A03(-1486997183);
        Hashtag hashtag = this.A02;
        Throwable A012 = r7.A01();
        C230132oy r0 = this.A01;
        C18683Vwh.A02(r0.A02, r0.A03, hashtag, "destroy", A012);
        this.A00.DIk(r7, hashtag);
        AnonymousClass0fD.A0A(-170444392, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1604182502);
        int A032 = AnonymousClass0fD.A03(1825763183);
        this.A00.DIl((AnonymousClass1XT) obj, this.A02);
        AnonymousClass0fD.A0A(-1295126810, A032);
        AnonymousClass0fD.A0A(1246253292, A03);
    }
}
