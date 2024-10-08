package X;

import com.instagram.common.session.UserSession;

public final class IT0 implements C232842uX {
    public final UserSession A00;

    public final void ChS(1Xj r1, AnonymousClass4DU r2, int i, int i2) {
    }

    public final void ChT(1Xj r1, AnonymousClass4DU r2, int i, int i2) {
    }

    public final void ChU(1Xj r1, AnonymousClass4DU r2, int i, int i2) {
    }

    public final void ChW(1Xj r1, AnonymousClass4DU r2, int i, int i2, long j) {
    }

    public final void ChX(1Xj r1, AnonymousClass4DU r2, int i, int i2) {
    }

    public final /* bridge */ /* synthetic */ void Cir(0jB r2, 1Nv r3, AnonymousClass4DU r4, int i, int i2) {
        C72694PFy pFy = (C72694PFy) r3;
        AnonymousClass7TG.A1N(r4, pFy);
        A00(r2, pFy, r4, "impression");
    }

    public final /* bridge */ /* synthetic */ void Cke(0jB r2, 1Nv r3, AnonymousClass4DU r4, int i, int i2) {
        C72694PFy pFy = (C72694PFy) r3;
        AnonymousClass7TG.A1N(r4, pFy);
        A00(r2, pFy, r4, "sub_impression");
    }

    public final /* bridge */ /* synthetic */ void Ckf(1Nv r3, AnonymousClass4DU r4, int i, int i2) {
        C72694PFy pFy = (C72694PFy) r3;
        0qQ.A0B(pFy, 1);
        A00((0jB) null, pFy, r4, C273654mx.A00(401));
    }

    public final /* bridge */ /* synthetic */ void Cku(C254223s8 r3, 1Nv r4, AnonymousClass4DU r5, int i, int i2, long j) {
        C72694PFy pFy = (C72694PFy) r4;
        0qQ.A0B(pFy, 1);
        C254523sc A04 = C254513sb.A04(pFy, r5, "time_spent");
        A04.A0B(j);
        pFy.A00(A04);
        DbU.A1R(A04.A00(), this.A00);
    }

    public final /* bridge */ /* synthetic */ void ClD(1Nv r3, AnonymousClass4DU r4, int i, int i2) {
        C72694PFy pFy = (C72694PFy) r3;
        0qQ.A0B(pFy, 1);
        A00((0jB) null, pFy, r4, C273654mx.A00(3480));
    }

    public IT0(UserSession userSession) {
        this.A00 = userSession;
    }

    private final void A00(0jB r3, C72694PFy pFy, AnonymousClass4DU r5, String str) {
        C254523sc A04 = C254513sb.A04(pFy, r5, str);
        A04.A0E(r3);
        pFy.A00(A04);
        DbU.A1R(A04.A00(), this.A00);
    }
}
