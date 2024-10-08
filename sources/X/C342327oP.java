package X;

import com.instagram.camera.effect.models.CameraAREffect;

/* renamed from: X.7oP  reason: invalid class name and case insensitive filesystem */
public final class C342327oP implements C347477ws {
    public final /* synthetic */ AnonymousClass86m A00;

    public C342327oP(AnonymousClass86m r1) {
        this.A00 = r1;
    }

    public final void D49() {
        this.A00.A0V.DBU();
    }

    public final void DBX() {
        AnonymousClass86m.A06(this.A00);
    }

    public final void Dgc() {
        CameraAREffect A002;
        AnonymousClass86m r2 = this.A00;
        if (r2.A0A != null && (A002 = AnonymousClass86m.A00(r2)) != null) {
            boolean CbC = A002.CbC();
            AnonymousClass86i r0 = r2.A0V;
            if (CbC) {
                r0.DBf(A002);
            } else {
                r0.DBc(A002);
            }
            C347487wt r22 = r2.A0A;
            if (r22 == null) {
                return;
            }
            if (r22.A01) {
                r22.setBookmarkIconExpanded(!CbC);
            } else {
                r22.setBookmarkIcon(!CbC);
            }
        }
    }
}
