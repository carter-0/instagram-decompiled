package X;

import com.instagram.api.schemas.FanClubInfoDict;
import com.instagram.common.session.UserSession;

/* renamed from: X.KOl  reason: case insensitive filesystem */
public final class C61846KOl extends LSR {
    public AnonymousClass3Q2 A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final AnonymousClass0iw A04;
    public final UserSession A05;
    public final LRK A06;
    public final AnonymousClass0eM A07 = AnonymousClass1YB.A00(C66296MMf.A00(this, 23));
    public final 05G A08;
    public final AnonymousClass0Ud A09;
    public final boolean A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61846KOl(AnonymousClass0iw r2, UserSession userSession, LRK lrk, boolean z) {
        super(lrk);
        DbW.A1N(userSession, 2, r2);
        this.A06 = lrk;
        this.A05 = userSession;
        this.A0A = z;
        this.A04 = r2;
        02z A10 = DbS.A10(new C61044Jvi());
        this.A08 = A10;
        this.A09 = A10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        if (r0.A01() != false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.GAX A00(X.C61846KOl r6, X.C61075JwD r7, boolean r8) {
        /*
            X.JwH r1 = r7.A06
            r3 = 0
            if (r1 == 0) goto L_0x007a
            java.lang.Object r0 = r1.A01
        L_0x0007:
            r5 = 1
            if (r0 != 0) goto L_0x0010
            if (r1 == 0) goto L_0x0078
            java.lang.Object r0 = r1.A00
            if (r0 == 0) goto L_0x0078
        L_0x0010:
            r4 = 1
        L_0x0011:
            X.Jw0 r0 = r7.A07
            if (r0 == 0) goto L_0x001c
            boolean r0 = r0.A01()
            r2 = 1
            if (r0 == 0) goto L_0x001d
        L_0x001c:
            r2 = 0
        L_0x001d:
            java.util.List r0 = r7.A0X
            java.lang.Integer r1 = X.C63216KtN.A00(r0)
            X.JxB r0 = r7.A08
            if (r0 != 0) goto L_0x0028
            r5 = 0
        L_0x0028:
            boolean r0 = r6.A0A
            if (r0 == 0) goto L_0x0038
            r1 = 2131961789(0x7f1327bd, float:1.9560285E38)
        L_0x002f:
            r0 = 2131955227(0x7f130e1b, float:1.9546976E38)
        L_0x0032:
            X.GAX r3 = new X.GAX
            r3.<init>(r1, r0)
        L_0x0037:
            return r3
        L_0x0038:
            if (r5 == 0) goto L_0x003e
            r1 = 2131956668(0x7f1313bc, float:1.9549898E38)
            goto L_0x002f
        L_0x003e:
            if (r4 == 0) goto L_0x0044
            r1 = 2131962856(0x7f132be8, float:1.9562449E38)
            goto L_0x002f
        L_0x0044:
            if (r2 == 0) goto L_0x004a
            r1 = 2131969866(0x7f13474a, float:1.9576667E38)
            goto L_0x002f
        L_0x004a:
            boolean r0 = r7.A0h
            if (r0 == 0) goto L_0x0052
            r1 = 2131955229(0x7f130e1d, float:1.954698E38)
            goto L_0x002f
        L_0x0052:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x005a
            r1 = 2131955226(0x7f130e1a, float:1.9546973E38)
            goto L_0x002f
        L_0x005a:
            X.JwI r0 = r7.A01
            if (r0 == 0) goto L_0x0037
            if (r8 != 0) goto L_0x0071
            X.0eM r0 = r6.A07
            java.lang.Object r3 = X.AnonymousClass7TE.A14(r0)
            X.LSk r3 = (X.LSk) r3
            java.lang.String r2 = "user"
            java.lang.String r1 = "share_sheet"
            java.lang.String r0 = "tap_audience"
            X.LSk.A03(r3, r2, r1, r0)
        L_0x0071:
            r1 = 2131955998(0x7f13111e, float:1.954854E38)
            r0 = 2131955228(0x7f130e1c, float:1.9546978E38)
            goto L_0x0032
        L_0x0078:
            r4 = 0
            goto L_0x0011
        L_0x007a:
            r0 = r3
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61846KOl.A00(X.KOl, X.JwD, boolean):X.GAX");
    }

    public static final void A01(C61846KOl kOl, AnonymousClass3QO r3, AnonymousClass3Q2 r4) {
        String fanClubId;
        FanClubInfoDict B3v = DbS.A0h(kOl.A05, AnonymousClass0t1.A01).B3v();
        String str = null;
        if (!(B3v == null || (fanClubId = B3v.getFanClubId()) == null || r3 != AnonymousClass3QO.FAN_CLUB)) {
            str = fanClubId;
        }
        r4.A2q = str;
    }
}
