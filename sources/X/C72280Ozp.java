package X;

import com.instagram.camera.effect.models.CameraAREffect;

/* renamed from: X.Ozp  reason: case insensitive filesystem */
public final class C72280Ozp implements C312266e6 {
    public final /* synthetic */ OFY A00;

    public final void DBd(boolean z, String str) {
    }

    public final void De5(String str) {
    }

    public final void De6() {
    }

    public final void Dj6() {
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [X.Ps0, java.lang.Object] */
    public final void EDY(String str) {
        0qQ.A0B(str, 0);
        OFY ofy = this.A00;
        LPQ.A01(ofy.A01);
        C70505O9e o9e = ofy.A00;
        if (o9e != null) {
            C69112Ner ner = o9e.A00;
            AnonymousClass8DM r1 = (AnonymousClass8DM) ner.A0U.getValue();
            AnonymousClass87G B0Q = r1.B0Q(r1.B0X(str));
            if (B0Q != null) {
                C71111Ocu ocu = ner.A0H;
                ocu.A05(new Object());
                CameraAREffect A002 = B0Q.A00();
                if (A002 != null) {
                    ocu.A03(new C72907POr(A002));
                    return;
                }
                return;
            }
            return;
        }
        0qQ.A0F("listener");
        throw AnonymousClass00P.createAndThrow();
    }

    public C72280Ozp(OFY ofy) {
        this.A00 = ofy;
    }
}
