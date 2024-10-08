package X;

import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.IntentAwareAdsInfo;
import com.instagram.common.session.UserSession;
import com.instagram.model.androidlink.AndroidLink;

/* renamed from: X.GAv  reason: case insensitive filesystem */
public final class C51998GAv extends C230372pW {
    public static final 0bY A0D = DbW.A0G();
    public C258103yT A00;
    public final Context A01;
    public final IntentAwareAdsInfo A02;
    public final UserSession A03;
    public final AnonymousClass4DU A04;
    public final String A05;
    public final AnonymousClass0eM A06;
    public final boolean A07;
    public final boolean A08;
    public final FragmentActivity A09;
    public final C232852uY A0A;
    public final AnonymousClass93U A0B;
    public final String A0C;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C51998GAv(android.content.Context r5, androidx.fragment.app.FragmentActivity r6, com.instagram.api.schemas.IntentAwareAdsInfo r7, X.1Bk r8, com.instagram.common.session.UserSession r9, X.C232852uY r10, X.AnonymousClass4DU r11, X.AnonymousClass93U r12, java.lang.String r13, java.lang.String r14) {
        /*
            r4 = this;
            r3 = 8
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321954307057516(0x810aa00005276c, double:3.033488388329227E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            if (r0 != 0) goto L_0x004f
            X.2r5 r0 = new X.2r5
            r0.<init>()
        L_0x0014:
            X.2n2 r0 = (X.C229222n2) r0
            r4.<init>(r8, r0)
            r4.A0C = r13
            r4.A05 = r14
            r4.A04 = r11
            r4.A0A = r10
            r4.A03 = r9
            r4.A0B = r12
            r4.A01 = r5
            r4.A02 = r7
            r4.A09 = r6
            X.0eO r1 = X.0eO.A02
            X.Ivo r0 = new X.Ivo
            r0.<init>(r4, r3)
            X.0eM r0 = X.AnonymousClass0eN.A00(r1, r0)
            r4.A06 = r0
            r0 = 36315614935256500(0x8104dc00040db4, double:3.029479344075663E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            r4.A07 = r0
            r0 = 36315614935190963(0x8104dc00030db3, double:3.029479344034217E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            r4.A08 = r0
            return
        L_0x004f:
            X.GJg r0 = X.C52215GJg.A00
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51998GAv.<init>(android.content.Context, androidx.fragment.app.FragmentActivity, com.instagram.api.schemas.IntentAwareAdsInfo, X.1Bk, com.instagram.common.session.UserSession, X.2uY, X.4DU, X.93U, java.lang.String, java.lang.String):void");
    }

    private final void A00(C267324bN r11, C52058GDe gDe) {
        int i;
        String Avj;
        Uri A002;
        FragmentActivity fragmentActivity;
        UserSession userSession = this.A03;
        if (182.A06(0Tu.A05, userSession, 36330853479105336L)) {
            1Xj A0s = C51966G9m.A0s(r11);
            AnonymousClass3W1 r0 = gDe.A0E;
            if (r0 != null) {
                i = r0.A02;
            } else {
                i = 0;
            }
            Context context = this.A01;
            AndroidLink A022 = AnonymousClass47K.A02(context, userSession, A0s, i, false);
            if (A022 != null && (Avj = A022.Avj()) != null && (A002 = 0cp.A00(A0D, Avj)) != null && A002.isHierarchical()) {
                String queryParameter = A002.getQueryParameter("app_id");
                String queryParameter2 = A002.getQueryParameter("merchant_id");
                String queryParameter3 = A002.getQueryParameter("ad_id");
                String queryParameter4 = A002.getQueryParameter("ad_tracking_token");
                if (0qQ.A0K(queryParameter, "com.bloks.www.bloks.commerce.cart.singlemerchantcart") && queryParameter2 != null && queryParameter3 != null && queryParameter4 != null && (fragmentActivity = this.A09) != null) {
                    C249713kF.A00.A0d(context, fragmentActivity, userSession, queryParameter2, queryParameter3, queryParameter4, this.A04.getModuleName());
                }
            }
        }
    }

    private final void A01(C267324bN r7, C52058GDe gDe) {
        int i;
        AnonymousClass47L r1;
        if (r7.A0X) {
            UserSession userSession = this.A03;
            if (182.A06(0Tu.A05, userSession, 2342155196766225367L)) {
                1Xj A0s = C51966G9m.A0s(r7);
                AnonymousClass3W1 r0 = gDe.A0E;
                if (r0 != null) {
                    i = r0.A02;
                } else {
                    i = 0;
                }
                AndroidLink A022 = AnonymousClass47K.A02(this.A01, userSession, A0s, i, false);
                if (A022 != null) {
                    r1 = C271714jT.A01(A022);
                } else {
                    r1 = null;
                }
                if (r1 == AnonymousClass47L.AD_DESTINATION_SHOPPING_PDP) {
                    C258103yT r02 = this.A00;
                    if (r02 == null) {
                        r02 = new C258103yT(userSession);
                        this.A00 = r02;
                    }
                    r02.A00((Context) null);
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v21, types: [java.lang.Object, X.HxK] */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x03b4, code lost:
        if (r4 != null) goto L_0x0103;
     */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0287  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x02bb  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0354  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x035a  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0368  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x039b  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x039e  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x03a1  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x03a4  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x03ab  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x03ae  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0285 A[EDGE_INSN: B:202:0x0285->B:139:0x0285 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x019b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A02(X.C267324bN r19, X.C52058GDe r20, java.lang.String r21) {
        /*
            r18 = this;
            r14 = r19
            X.3OA r5 = r14.A06()
            r8 = r18
            X.2uY r1 = r8.A0A
            X.4DU r15 = r8.A04
            r6 = r20
            X.3W1 r4 = r6.A0E
            r13 = -1
            if (r4 == 0) goto L_0x03be
            int r0 = r4.getPosition()
        L_0x0017:
            r2 = r21
            X.3sc r3 = r1.A06(r15, r5, r2, r0)
            if (r3 == 0) goto L_0x0359
            r3.A03()
            X.3OA r0 = r14.A06()
            boolean r0 = r0.A0w
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A1h = r0
            r3.A02()
            java.lang.String r0 = r8.A0C
            r3.A6L = r0
            com.instagram.common.session.UserSession r2 = r8.A03
            r3.A0K(r2, r5)
            X.C51965G9l.A1T(r2, r3)
            X.1Xj r0 = r5.A0K
            r17 = r0
            r7 = 0
            if (r4 == 0) goto L_0x03bb
            android.util.Pair r1 = r4.A04()
            if (r1 == 0) goto L_0x0056
            java.lang.Object r0 = r1.first
            java.lang.String r0 = (java.lang.String) r0
            r3.A6P = r0
            java.lang.Object r0 = r1.second
            java.lang.String r0 = (java.lang.String) r0
            r3.A69 = r0
        L_0x0056:
            java.lang.Integer r0 = r17.A2J()
            if (r0 == 0) goto L_0x0062
            int r0 = r0.intValue()
            r3.A0E = r0
        L_0x0062:
            if (r1 == 0) goto L_0x0074
            java.lang.Object r0 = r1.first
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x006c
            r3.A6E = r0
        L_0x006c:
            java.lang.Object r0 = r1.second
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0074
            r3.A6D = r0
        L_0x0074:
            if (r4 == 0) goto L_0x00b7
            android.util.Pair r1 = r4.A03()
            if (r1 == 0) goto L_0x0094
            java.lang.Object r0 = r1.first
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0088
            int r0 = r0.intValue()
            r3.A0D = r0
        L_0x0088:
            java.lang.Object r0 = r1.second
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0094
            int r0 = r0.intValue()
            r3.A0C = r0
        L_0x0094:
            int r0 = r4.A0a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r4.A0Z
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.Pair r1 = android.util.Pair.create(r1, r0)
            X.0qQ.A07(r1)
            java.lang.Object r0 = r1.first
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L_0x00af
            r3.A3F = r0
        L_0x00af:
            java.lang.Object r0 = r1.second
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L_0x00b7
            r3.A3E = r0
        L_0x00b7:
            boolean r0 = r8.A07
            if (r0 == 0) goto L_0x00db
            java.util.List r0 = r17.A3S()
            if (r0 == 0) goto L_0x00c3
            r3.A7h = r0
        L_0x00c3:
            if (r4 == 0) goto L_0x00db
            java.util.List r1 = r4.A1i
            java.util.List r0 = r4.A1h
            android.util.Pair r1 = android.util.Pair.create(r1, r0)
            if (r1 == 0) goto L_0x00db
            java.lang.Object r0 = r1.first
            java.util.List r0 = (java.util.List) r0
            r3.A7m = r0
            java.lang.Object r0 = r1.second
            java.util.List r0 = (java.util.List) r0
            r3.A7l = r0
        L_0x00db:
            boolean r0 = r8.A08
            if (r0 == 0) goto L_0x03b4
            if (r4 == 0) goto L_0x03b8
            java.util.List r1 = r4.A1i
            java.util.List r0 = r4.A1h
            android.util.Pair r1 = android.util.Pair.create(r1, r0)
            if (r1 == 0) goto L_0x0103
            java.lang.Object r0 = r1.first
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x03b1
            java.lang.Integer r0 = X.C51968G9o.A0t(r0)
        L_0x00f5:
            r3.A2o = r0
            java.lang.Object r0 = r1.second
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0101
            java.lang.Integer r7 = X.C51968G9o.A0t(r0)
        L_0x0101:
            r3.A2n = r7
        L_0x0103:
            int r0 = r4.A0H
        L_0x0105:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A0Q(r0)
            if (r4 == 0) goto L_0x03ae
            int r0 = r4.A0J
        L_0x0110:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A0R(r0)
            if (r4 == 0) goto L_0x03ab
            int r0 = r4.A0N
        L_0x011b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A0U(r0)
            r7 = 0
            X.C233822wX.A0G(r2, r3, r5, r7)
            X.3y4 r0 = r5.A0I
            if (r0 == 0) goto L_0x0138
            X.XB5 r0 = r0.BUi()
            if (r0 == 0) goto L_0x0138
            java.lang.String r0 = r0.getId()
            if (r0 == 0) goto L_0x0138
            r3.A4V = r0
        L_0x0138:
            X.0Tu r10 = X.0Tu.A05
            r0 = 36323118243261300(0x810baf00062b74, double:3.034224466271295E-306)
            boolean r0 = X.182.A06(r10, r2, r0)
            if (r0 == 0) goto L_0x03a4
            X.Tnz r9 = X.GPt.A00(r2)
            X.HxK r1 = new X.HxK
            r1.<init>()
            X.GPu r0 = new X.GPu
            r0.<init>(r9, r1)
        L_0x0153:
            X.JPY r0 = (X.JPY) r0
            java.lang.String r0 = r0.ByN(r14)
            if (r0 == 0) goto L_0x015d
            r3.A6i = r0
        L_0x015d:
            boolean r0 = r6.A0O
            r3.A8A = r0
            java.util.ArrayList r0 = X.GYJ.A00(r14)
            r3.A7U = r0
            r16 = 1
            r0 = r17
            X.1Xy r0 = r0.A0C
            java.util.List r0 = r0.BxO()
            r12 = 0
            if (r0 == 0) goto L_0x03a1
            java.lang.Object r9 = X.00k.A0J(r0)
            X.3yf r9 = (X.C258223yf) r9
        L_0x017a:
            X.0jB r11 = r3.A0s
            if (r11 != 0) goto L_0x0182
            X.0jB r11 = X.C51965G9l.A0k()
        L_0x0182:
            r3.A0s = r11
            X.0j9 r1 = X.C271774jZ.A85
            if (r9 == 0) goto L_0x039e
            com.instagram.api.schemas.SocialContextType r0 = r9.BxW()
            if (r0 == 0) goto L_0x039e
            int r0 = r0.ordinal()
            java.lang.Long r0 = X.DbS.A0j(r0)
        L_0x0196:
            r11.A04(r1, r0)
            if (r9 == 0) goto L_0x039b
            com.instagram.api.schemas.SocialContextType r1 = r9.BxW()
        L_0x019f:
            com.instagram.api.schemas.SocialContextType r0 = com.instagram.api.schemas.SocialContextType.LIKED_BY
            if (r1 != r0) goto L_0x0384
            r0 = 36328053160491940(0x81102c00033ba4, double:3.037345327799268E-306)
            boolean r0 = X.182.A06(r10, r2, r0)
            if (r0 == 0) goto L_0x0384
            X.0Tu r11 = X.0Tu.A06
            r0 = 36328053160426403(0x81102c00023ba3, double:3.0373453277578224E-306)
            boolean r0 = X.182.A06(r11, r2, r0)
            if (r0 == 0) goto L_0x0384
            r0 = 36328053160557477(0x81102c00043ba5, double:3.037345327840714E-306)
            boolean r0 = X.182.A06(r11, r2, r0)
            if (r0 == 0) goto L_0x01d1
            r0 = 36328053160360866(0x81102c00013ba2, double:3.0373453277163766E-306)
            boolean r0 = X.182.A06(r11, r2, r0)
            if (r0 != 0) goto L_0x0384
        L_0x01d1:
            boolean r0 = r14.A0F()
            if (r0 != 0) goto L_0x0384
            X.1Xj r0 = X.C51966G9m.A0s(r14)
            boolean r0 = r0.A5o()
            if (r0 != 0) goto L_0x0384
            X.1Xj r0 = X.C51966G9m.A0s(r14)
            boolean r0 = r0.A5n()
            if (r0 != 0) goto L_0x0384
            X.1Xj r0 = X.C51966G9m.A0s(r14)
            boolean r0 = r0.A5e()
            if (r0 != 0) goto L_0x0384
            X.1iA r1 = r14.A0J
            X.1iA r0 = X.1iA.A0B
            if (r1 == r0) goto L_0x0384
            com.instagram.api.schemas.AdFormatType r0 = com.instagram.api.schemas.AdFormatType.H_SCROLL
            com.instagram.api.schemas.AdFormatType r1 = r14.A0E
            if (r0 == r1) goto L_0x0384
            com.instagram.api.schemas.AdFormatType r0 = com.instagram.api.schemas.AdFormatType.GRID
            if (r0 == r1) goto L_0x0384
            X.0jB r9 = r3.A0s
            if (r9 == 0) goto L_0x0210
            X.0j9 r1 = X.C271774jZ.A86
            java.lang.String r0 = "liked_by_bubble"
            r9.A04(r1, r0)
        L_0x0210:
            X.G9w.A1M(r2, r3)
            boolean r0 = r5.A0t
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A1P = r0
            java.lang.Integer r0 = r17.A2P()
            java.lang.String r0 = X.DbX.A0t(r0)
            r3.A5h = r0
            com.instagram.api.schemas.IntentAwareAdsInfoIntf r0 = r14.A00()
            if (r0 != 0) goto L_0x022d
            com.instagram.api.schemas.IntentAwareAdsInfo r0 = r8.A02
        L_0x022d:
            r3.A0D(r0)
            java.lang.String r0 = r8.A05
            if (r0 == 0) goto L_0x0238
            java.lang.Long r7 = X.AnonymousClass7TE.A10(r0)
        L_0x0238:
            r3.A3l = r7
            r0 = 36318509745641661(0x81077e002918bd, double:3.031310033819705E-306)
            boolean r0 = X.182.A06(r10, r2, r0)
            if (r0 == 0) goto L_0x0251
            boolean r0 = r6.A0X
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A1z = r0
            java.lang.String r0 = r6.A0K
            r3.A4z = r0
        L_0x0251:
            X.1Xj r7 = r14.A02
            X.0Tu r9 = X.0Tu.A06
            r0 = 36321584939542052(0x810a4a00002624, double:3.033254798825124E-306)
            boolean r0 = X.182.A06(r9, r2, r0)
            if (r0 == 0) goto L_0x0285
            r0 = 36321584942818883(0x810a4a00322643, double:3.033254800897405E-306)
            boolean r0 = X.182.A06(r9, r2, r0)
            if (r0 == 0) goto L_0x0285
            if (r7 == 0) goto L_0x0285
            X.1Xy r0 = r7.A0C
            X.4xI r0 = r0.Aq4()
            if (r0 == 0) goto L_0x0285
            java.util.List r1 = r0.AiA()
            if (r1 == 0) goto L_0x0285
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x035e
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x035e
        L_0x0285:
            if (r4 == 0) goto L_0x029b
            int r0 = r4.A0F
            if (r0 == r13) goto L_0x028d
            r3.A0J = r0
        L_0x028d:
            int r0 = r4.A0T
            if (r0 == r13) goto L_0x0293
            r3.A0W = r0
        L_0x0293:
            java.lang.String r0 = r4.A1P
            if (r0 != 0) goto L_0x0299
            java.lang.String r0 = ""
        L_0x0299:
            r3.A6M = r0
        L_0x029b:
            java.lang.Double r0 = r6.A00
            if (r0 == 0) goto L_0x035a
            double r0 = r0.doubleValue()
        L_0x02a3:
            r3.A03 = r0
            java.lang.Integer r0 = r6.A02
            int r0 = X.C51967G9n.A04(r0, r13)
            r3.A0Y = r0
            java.lang.Double r0 = r6.A01
            if (r0 == 0) goto L_0x02b7
            double r0 = r0.doubleValue()
            r3.A02 = r0
        L_0x02b7:
            java.lang.Long r0 = r6.A04
            if (r0 == 0) goto L_0x02d0
            long r0 = r0.longValue()
            long r6 = X.C51966G9m.A07(r0)
            double r0 = (double) r6
            r6 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r0 = r0 / r6
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r3.A2c = r0
        L_0x02d0:
            if (r4 == 0) goto L_0x0302
            r0 = 36322916379404959(0x810b8000002a9f, double:3.034096806755704E-306)
            boolean r0 = X.182.A06(r9, r2, r0)
            if (r0 == 0) goto L_0x0302
            X.1Xj r1 = r14.A02
            if (r1 == 0) goto L_0x0302
            X.3OA r0 = r14.A06()
            boolean r0 = r0.A0t
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A1P = r0
            X.2wp r0 = new X.2wp
            r0.<init>(r2)
            java.lang.Boolean r1 = r0.A01(r1)
            r0 = r16
            boolean r0 = X.AnonymousClass7TF.A1Y(r1, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A1s = r0
        L_0x0302:
            java.lang.String r4 = r5.A0b
            if (r4 == 0) goto L_0x0315
            X.0jB r1 = r3.A0m
            if (r1 != 0) goto L_0x0310
            X.0jB r1 = X.C51965G9l.A0k()
            r3.A0m = r1
        L_0x0310:
            X.0j9 r0 = X.C271774jZ.A1i
            r1.A04(r0, r4)
        L_0x0315:
            android.content.Context r8 = r8.A01
            int r0 = X.0nA.A09(r8)
            float r0 = (float) r0
            float r7 = X.0nA.A01(r8, r0)
            int r0 = X.0nA.A08(r8)
            float r0 = (float) r0
            float r6 = X.0nA.A01(r8, r0)
            android.util.DisplayMetrics r0 = X.0nA.A0H(r8)
            float r4 = r0.density
            int r0 = X.0nA.A09(r8)
            float r1 = (float) r0
            float r0 = r17.A0l()
            float r1 = r1 / r0
            float r0 = X.0nA.A01(r8, r1)
            r3.A04(r7, r6, r4)
            java.util.HashMap r4 = X.AnonymousClass7TE.A1E()
            java.lang.String r1 = "media_height"
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r4.put(r1, r0)
            r3.A0Y(r4)
            java.lang.String r0 = r5.A0c
            if (r0 == 0) goto L_0x0356
            r3.A5X = r0
        L_0x0356:
            X.C233822wX.A0H(r2, r3, r15)
        L_0x0359:
            return
        L_0x035a:
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            goto L_0x02a3
        L_0x035e:
            java.util.Iterator r7 = r1.iterator()
        L_0x0362:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0285
            java.lang.Object r0 = r7.next()
            X.4xG r0 = (X.C278624xG) r0
            com.instagram.api.schemas.IGConsiderAndBrowseType r1 = r0.CGB()
            com.instagram.api.schemas.IGConsiderAndBrowseType r0 = com.instagram.api.schemas.IGConsiderAndBrowseType.REELS_TAP_ON_CAPTION_AND_BROWSE
            if (r1 != r0) goto L_0x0362
            java.lang.String r0 = "caption_and_browse"
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1D(r0)
            r3.A7T = r0
            goto L_0x0285
        L_0x0384:
            X.0jB r11 = r3.A0s
            if (r11 == 0) goto L_0x0210
            X.0j9 r1 = X.C271774jZ.A86
            if (r9 == 0) goto L_0x0396
            com.instagram.api.schemas.SocialContextType r0 = r9.BxW()
            if (r0 == 0) goto L_0x0396
            java.lang.String r12 = r0.name()
        L_0x0396:
            r11.A04(r1, r12)
            goto L_0x0210
        L_0x039b:
            r1 = r7
            goto L_0x019f
        L_0x039e:
            r0 = r7
            goto L_0x0196
        L_0x03a1:
            r9 = r7
            goto L_0x017a
        L_0x03a4:
            X.GI7 r0 = new X.GI7
            r0.<init>()
            goto L_0x0153
        L_0x03ab:
            r0 = -1
            goto L_0x011b
        L_0x03ae:
            r0 = -1
            goto L_0x0110
        L_0x03b1:
            r0 = r7
            goto L_0x00f5
        L_0x03b4:
            if (r4 == 0) goto L_0x03b8
            goto L_0x0103
        L_0x03b8:
            r0 = -1
            goto L_0x0105
        L_0x03bb:
            r1 = r7
            goto L_0x0056
        L_0x03be:
            r0 = -1
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51998GAv.A02(X.4bN, X.GDe, java.lang.String):void");
    }

    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        int i;
        AnonymousClass47L r1;
        C267324bN r7 = (C267324bN) obj;
        C52058GDe gDe = (C52058GDe) obj2;
        AnonymousClass7TF.A1H(r7, gDe);
        r7.A06();
        A02(r7, gDe, "impression");
        1Xj A0s = C51966G9m.A0s(r7);
        AnonymousClass3W1 r4 = gDe.A0E;
        if (r4 != null) {
            i = r4.A02;
        } else {
            i = 0;
        }
        Context context = this.A01;
        UserSession userSession = this.A03;
        AndroidLink A022 = AnonymousClass47K.A02(context, userSession, A0s, i, false);
        if (A022 != null) {
            r1 = C271714jT.A01(A022);
        } else {
            r1 = null;
        }
        if (r1 == AnonymousClass47L.AD_DESTINATION_DIRECT_MESSAGE) {
            AnonymousClass59S.A06("REELS_AD_IMPRESSION", userSession, C51966G9m.A0s(r7));
        }
        AnonymousClass2yJ.A00(AnonymousClass05K.A0C);
        if (r4 != null && r4.A0H == 0) {
            AnonymousClass2yJ.A00(AnonymousClass05K.A0N);
        }
        A01(r7, gDe);
        A00(r7, gDe);
        C3728893a A0p = C51965G9l.A0p(this.A06);
        if (A0p != null) {
            C52058GDe.A07(r7, gDe, this.A04, A0p, false);
        }
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        C267324bN r4 = (C267324bN) obj;
        C52058GDe gDe = (C52058GDe) obj2;
        boolean A1Z = AnonymousClass7TG.A1Z(r4, gDe);
        A02(r4, gDe, "sub_impression");
        A01(r4, gDe);
        A00(r4, gDe);
        C3728893a A0p = C51965G9l.A0p(this.A06);
        if (A0p != null) {
            C52058GDe.A07(r4, gDe, this.A04, A0p, A1Z);
        }
    }
}
