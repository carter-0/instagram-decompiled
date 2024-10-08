package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GAp  reason: case insensitive filesystem */
public final class C51992GAp extends C230372pW {
    public final UserSession A00;
    public final C232852uY A01;
    public final AnonymousClass4DU A02;
    public final AnonymousClass0eM A03 = C58715IwO.A00(this, 0eO.A02, 39);

    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        AnonymousClass3W1 r8;
        C267324bN r15 = (C267324bN) obj;
        C52058GDe gDe = (C52058GDe) obj2;
        AnonymousClass7TF.A1H(r15, gDe);
        1Xj r6 = r15.A02;
        if (r6 != null && (r8 = gDe.A0E) != null) {
            UserSession userSession = this.A00;
            int position = r8.getPosition();
            int i = r8.A03;
            AnonymousClass4DU r7 = this.A02;
            C254433sT.A01(userSession, this.A01, r6, r7, r8, (Boolean) null, (Boolean) null, (Boolean) null, position, i);
            C3728893a A0p = C51965G9l.A0p(this.A03);
            if (A0p != null) {
                A0p.A03(r15, r7.getModuleName(), r8.getPosition(), false);
            }
        }
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        AnonymousClass3W1 r3;
        C267324bN r14 = (C267324bN) obj;
        C52058GDe gDe = (C52058GDe) obj2;
        boolean A1Z = AnonymousClass7TG.A1Z(r14, gDe);
        1Xj r7 = r14.A02;
        if (r7 != null && (r3 = gDe.A0E) != null) {
            UserSession userSession = this.A00;
            int position = r3.getPosition();
            int i = r3.A03;
            AnonymousClass4DU r8 = this.A02;
            C254433sT.A02(userSession, this.A01, r7, r8, (Boolean) null, (Boolean) null, position, i);
            C3728893a A0p = C51965G9l.A0p(this.A03);
            if (A0p != null) {
                A0p.A03(r14, r8.getModuleName(), r3.getPosition(), A1Z);
            }
        }
    }

    public C51992GAp(UserSession userSession, C232852uY r4, AnonymousClass4DU r5) {
        super(C51972G9s.A0b(userSession));
        this.A02 = r5;
        this.A01 = r4;
        this.A00 = userSession;
    }
}
