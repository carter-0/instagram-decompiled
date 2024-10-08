package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GAq  reason: case insensitive filesystem */
public final class C51993GAq extends C230622pv {
    public final UserSession A00;
    public final C232852uY A01;
    public final AnonymousClass4DU A02;
    public final String A03;

    public final /* bridge */ /* synthetic */ void A00(Object obj, long j, Object obj2) {
        int i;
        C267324bN r5 = (C267324bN) obj;
        C52058GDe gDe = (C52058GDe) obj2;
        AnonymousClass7TF.A1H(r5, gDe);
        1Xj r9 = r5.A02;
        if (r9 != null) {
            C232852uY r14 = this.A01;
            AnonymousClass4DU r10 = this.A02;
            AnonymousClass3W1 r0 = gDe.A0E;
            if (r0 != null) {
                i = r0.getPosition();
            } else {
                i = -1;
            }
            long j2 = j;
            C254523sc A012 = r14.A01((C254223s8) null, r9, r10, i, j2);
            A012.A6L = this.A03;
            UserSession userSession = this.A00;
            if (AnonymousClass7TF.A0R(0Tu.A06, userSession, 36330067499958708L).booleanValue()) {
                C52058GDe.A08(r5, gDe, userSession, j2);
            }
            C233822wX.A0F(userSession, A012, r9, r10, AnonymousClass05K.A00, -1, false);
        }
    }

    public C51993GAq(UserSession userSession, C232852uY r2, AnonymousClass4DU r3, String str) {
        this.A03 = str;
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = userSession;
    }
}
