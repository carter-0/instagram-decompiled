package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.H8h  reason: case insensitive filesystem */
public final class C54335H8h extends C230372pW {
    public final UserSession A00;
    public final AnonymousClass4DU A01;
    public final List A02;
    public final AnonymousClass0eM A03 = C58715IwO.A00(this, 0eO.A02, 40);
    public final Context A04;
    public final String A05;

    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        C267324bN r4 = (C267324bN) obj;
        C52058GDe gDe = (C52058GDe) obj2;
        AnonymousClass7TF.A1H(r4, gDe);
        AnonymousClass2yJ.A00(AnonymousClass05K.A03);
        A00(r4, gDe, "impression");
        C3728893a A0p = C51965G9l.A0p(this.A03);
        if (A0p != null) {
            C52058GDe.A06(r4, gDe, this.A01, A0p, false);
        }
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        C267324bN r4 = (C267324bN) obj;
        C52058GDe gDe = (C52058GDe) obj2;
        boolean A1Z = AnonymousClass7TG.A1Z(r4, gDe);
        A00(r4, gDe, "sub_impression");
        C3728893a A0p = C51965G9l.A0p(this.A03);
        if (A0p != null) {
            C52058GDe.A06(r4, gDe, this.A01, A0p, A1Z);
        }
    }

    public C54335H8h(Context context, UserSession userSession, AnonymousClass4DU r5, String str, List list) {
        super(C51972G9s.A0c(userSession));
        this.A00 = userSession;
        this.A05 = str;
        this.A01 = r5;
        this.A02 = list;
        this.A04 = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b9, code lost:
        r0 = java.lang.Integer.valueOf((r4 - r3) - 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00bf, code lost:
        if (r0 == null) goto L_0x00c4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00(X.C267324bN r12, X.C52058GDe r13, java.lang.String r14) {
        /*
            r11 = this;
            X.3OA r2 = r12.A07()
            if (r2 == 0) goto L_0x00db
            com.instagram.common.session.UserSession r6 = r11.A00
            r0 = 0
            X.2uY r1 = new X.2uY
            r1.<init>(r6, r0)
            X.4DU r5 = r11.A01
            X.3W1 r7 = r13.A0E
            if (r7 == 0) goto L_0x00e9
            int r0 = r7.getPosition()
        L_0x0018:
            X.3sc r8 = r1.A06(r5, r2, r14, r0)
            if (r8 == 0) goto L_0x00db
            r8.A03()
            r8.A02()
            java.lang.String r0 = r11.A05
            r8.A6L = r0
            r8.A0K(r6, r2)
            java.lang.String r0 = r2.A0f
            r8.A5W = r0
            X.1Xj r2 = r12.A02
            if (r7 == 0) goto L_0x00e6
            android.util.Pair r1 = r7.A04()
            if (r1 == 0) goto L_0x0045
            java.lang.Object r0 = r1.first
            java.lang.String r0 = (java.lang.String) r0
            r8.A6P = r0
            java.lang.Object r0 = r1.second
            java.lang.String r0 = (java.lang.String) r0
            r8.A69 = r0
        L_0x0045:
            if (r2 == 0) goto L_0x0053
            java.lang.Integer r0 = r2.A2J()
            if (r0 == 0) goto L_0x0053
            int r0 = r0.intValue()
            r8.A0E = r0
        L_0x0053:
            if (r1 == 0) goto L_0x0065
            java.lang.Object r0 = r1.first
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x005d
            r8.A6E = r0
        L_0x005d:
            java.lang.Object r0 = r1.second
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0065
            r8.A6D = r0
        L_0x0065:
            if (r7 == 0) goto L_0x00e4
            android.util.Pair r1 = r7.A03()
            if (r1 == 0) goto L_0x0085
            java.lang.Object r0 = r1.first
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0079
            int r0 = r0.intValue()
            r8.A0D = r0
        L_0x0079:
            java.lang.Object r0 = r1.second
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0085
            int r0 = r0.intValue()
            r8.A0C = r0
        L_0x0085:
            java.lang.Integer r1 = X.C51968G9o.A0s(r7)
        L_0x0089:
            java.util.List r10 = r11.A02
            r9 = 1
            if (r10 == 0) goto L_0x00c4
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x00c4
            if (r1 == 0) goto L_0x00c4
            int r4 = r1.intValue()
            int r3 = r4 - r9
        L_0x009c:
            r0 = -1
            if (r0 >= r3) goto L_0x00df
            java.lang.Object r2 = X.00k.A0O(r10, r3)
            X.4bN r2 = (X.C267324bN) r2
            if (r2 == 0) goto L_0x00dc
            X.5o2 r1 = r2.A01
            X.5o2 r0 = X.C295365o2.AD
            if (r1 == r0) goto L_0x00b9
            X.5o2 r1 = r2.A01
            X.5o2 r0 = X.C295365o2.AD_PREVIEW
            if (r1 == r0) goto L_0x00b9
            X.3OA r0 = r2.A07()
            if (r0 == 0) goto L_0x00dc
        L_0x00b9:
            int r4 = r4 - r3
            int r4 = r4 - r9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            if (r0 == 0) goto L_0x00c4
        L_0x00c1:
            r8.A0Q(r0)
        L_0x00c4:
            r8.A8A = r9
            X.C51965G9l.A1T(r6, r8)
            X.G9w.A1M(r6, r8)
            if (r7 == 0) goto L_0x00d8
            int r0 = r7.getPosition()
            java.lang.Long r0 = X.DbS.A0j(r0)
            r8.A3Q = r0
        L_0x00d8:
            X.C233822wX.A0H(r6, r8, r5)
        L_0x00db:
            return
        L_0x00dc:
            int r3 = r3 + -1
            goto L_0x009c
        L_0x00df:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x00c1
        L_0x00e4:
            r1 = 0
            goto L_0x0089
        L_0x00e6:
            r1 = 0
            goto L_0x0045
        L_0x00e9:
            r0 = -1
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54335H8h.A00(X.4bN, X.GDe, java.lang.String):void");
    }
}
