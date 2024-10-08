package X;

import com.instagram.user.model.User;

/* renamed from: X.EBv  reason: case insensitive filesystem */
public final class C47661EBv extends 1P0 {
    public User A00;
    public Throwable A01;
    public final 0lg A02;

    public C47661EBv(0lg r1) {
        this.A02 = r1;
    }

    public final void onFail(C268654dm r3) {
        int A03 = AnonymousClass0fD.A03(-291074964);
        this.A01 = r3.A01();
        AnonymousClass0fD.A0A(-2133985259, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-3671906);
        DvP dvP = (DvP) obj;
        int A032 = AnonymousClass0fD.A03(719646149);
        AnonymousClass1Nd.A00(this.A02).A00(new FWT(dvP.A00));
        this.A00 = dvP.A00;
        AnonymousClass0fD.A0A(-285580168, A032);
        AnonymousClass0fD.A0A(-399945647, A03);
    }
}
