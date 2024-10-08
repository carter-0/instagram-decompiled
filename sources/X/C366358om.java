package X;

import com.instagram.camera.effect.models.CameraAREffect;

/* renamed from: X.8om  reason: invalid class name and case insensitive filesystem */
public final class C366358om implements C347477ws {
    public final /* synthetic */ C366308of A00;

    public final void DBX() {
    }

    public C366358om(C366308of r1) {
        this.A00 = r1;
    }

    public final void D49() {
        C366308of r2 = this.A00;
        ((C3508886t) r2.A0B.getValue()).A04 = true;
        r2.A08.DBU();
    }

    public final void Dgc() {
        AnonymousClass87G A02;
        CameraAREffect A002;
        C366308of r4 = this.A00;
        AnonymousClass876 r1 = r4.A00;
        if (r1 != null && (A02 = r1.A02(r1.A00)) != null && (A002 = A02.A00()) != null) {
            boolean CbC = A002.CbC();
            ((C347487wt) r4.A0D.getValue()).setBookmarkIcon(!CbC);
            AnonymousClass86i r0 = r4.A08;
            if (CbC) {
                r0.DBf(A002);
            } else {
                r0.DBc(A002);
            }
        }
    }
}
