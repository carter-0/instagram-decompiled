package X;

import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.UfJ  reason: case insensitive filesystem */
public final class C15591UfJ extends 1P0 {
    public final /* synthetic */ C230152p2 A00;
    public final /* synthetic */ C230132oy A01;
    public final /* synthetic */ Hashtag A02;

    public C15591UfJ(C230152p2 r1, C230132oy r2, Hashtag hashtag) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = hashtag;
    }

    public final void onFail(C268654dm r7) {
        int A03 = AnonymousClass0fD.A03(1273218457);
        Hashtag hashtag = this.A02;
        Throwable A012 = r7.A01();
        C230132oy r0 = this.A01;
        C18683Vwh.A02(r0.A02, r0.A03, hashtag, "create", A012);
        this.A00.DIh(r7, hashtag);
        AnonymousClass0fD.A0A(872435098, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(1485382630);
        int A032 = AnonymousClass0fD.A03(-1056873453);
        this.A00.DIi((AnonymousClass1XT) obj, this.A02);
        AnonymousClass0fD.A0A(2041244388, A032);
        AnonymousClass0fD.A0A(651420072, A03);
    }
}
