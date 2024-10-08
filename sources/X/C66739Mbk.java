package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Mbk  reason: case insensitive filesystem */
public final class C66739Mbk {
    public 2EM A00;
    public C2611948q A01;
    public final FragmentActivity A02;
    public final UserSession A03;
    public final C74564PxD A04;
    public final C3253572b A05;
    public final C3253572b A06;
    public final C3253572b A07;
    public final C3253572b A08;
    public final C3253572b A09;

    public C66739Mbk(Context context, FragmentActivity fragmentActivity, UserSession userSession, C74564PxD pxD, C322776wO r13) {
        this.A03 = userSession;
        this.A02 = fragmentActivity;
        this.A04 = pxD;
        C3253572b r4 = new C3253572b();
        this.A06 = r4;
        C3253572b r6 = new C3253572b();
        this.A09 = r6;
        C3253572b r5 = new C3253572b();
        this.A07 = r5;
        C3253572b r3 = new C3253572b();
        this.A08 = r3;
        C3253572b r2 = new C3253572b();
        this.A05 = r2;
        A02(context, AnonymousClass43A.A00, C2611948q.ALL);
        A00();
        r4.A06 = r13;
        int A032 = AnonymousClass7TF.A03(context, R.attr.igds_color_primary_background);
        r4.A00 = A032;
        r4.A0L = true;
        r4.A0P = true;
        r6.A02 = R.drawable.loadmore_icon_refresh_compound;
        r6.A00 = A032;
        r5.A00 = r4.A00;
        r5.A05 = new C71395Oju(this, 34);
        r3.A00 = r4.A00;
        r3.A0D = context.getString(2131964311);
        r3.A07 = context.getString(2131964310);
        r2.A00 = r4.A00;
        r2.A0D = context.getString(2131963038);
        r2.A07 = context.getString(2131963037);
        r2.A0C = context.getString(2131963039);
        r2.A06 = new C67477MoX(this, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0042, code lost:
        if ((r0 instanceof X.2Ej) != false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0044, code lost:
        if (r10 != false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0046, code lost:
        r1 = r7.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        if (r1 == null) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004c, code lost:
        if (r1 != X.C2611948q.A03) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004e, code lost:
        r1 = r7.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0050, code lost:
        if (r1 == null) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0058, code lost:
        if (r1.equals(X.C67224MkK.A00) == false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005a, code lost:
        r4 = r7.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005d, code lost:
        r1 = r7.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0063, code lost:
        if (r1.isLoading() != false) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0069, code lost:
        if (r1.CJm() == false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x006b, code lost:
        r4 = r7.A07;
        r3 = X.C320156rr.ERROR;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0070, code lost:
        r1 = r7.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0072, code lost:
        if (r1 == null) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0076, code lost:
        if (r1 == X.AnonymousClass2EL.A00) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x007a, code lost:
        if (r1 == X.AnonymousClass2EX.A00) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x007e, code lost:
        if ((r1 instanceof X.C300895y8) != false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0082, code lost:
        if ((r1 instanceof X.2Ej) != false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0084, code lost:
        r1 = r7.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0086, code lost:
        if (r1 == null) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x008a, code lost:
        if (r1 == X.C2611948q.A03) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x008f, code lost:
        if (r8 == X.AnonymousClass05K.A0C) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0091, code lost:
        r4 = r7.A09;
        r3 = X.C320156rr.LOADING;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C67289MlO A01(java.lang.Integer r8, boolean r9, boolean r10) {
        /*
            r7 = this;
            r0 = 2
            X.0qQ.A0B(r8, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            java.lang.String r6 = "emptyFilter"
            java.lang.String r5 = "emptyMode"
            r2 = 0
            if (r8 == r0) goto L_0x002e
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r8 != r0) goto L_0x008d
            X.72b r4 = r7.A08
        L_0x0013:
            X.6rr r3 = X.C320156rr.EMPTY
        L_0x0015:
            X.2EM r1 = r7.A00
            if (r1 == 0) goto L_0x0096
            X.48q r0 = r7.A01
            if (r0 == 0) goto L_0x009a
            X.MlO r2 = new X.MlO
            r2.<init>(r1, r0, r4, r3)
            X.72b r0 = r7.A06
            X.6wO r1 = r0.A06
            if (r1 == 0) goto L_0x002d
            X.6rr r0 = r2.A03
            r1.DBz(r0)
        L_0x002d:
            return r2
        L_0x002e:
            if (r9 == 0) goto L_0x0044
            X.2EM r1 = r7.A00
            if (r1 == 0) goto L_0x0096
            X.5y8 r0 = X.C300895y8.A00
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0044
            X.2EM r0 = r7.A00
            if (r0 == 0) goto L_0x0096
            boolean r0 = r0 instanceof X.2Ej
            if (r0 == 0) goto L_0x0046
        L_0x0044:
            if (r10 == 0) goto L_0x005d
        L_0x0046:
            X.48q r1 = r7.A01
            if (r1 == 0) goto L_0x009a
            X.48q r0 = X.C2611948q.ALL
            if (r1 != r0) goto L_0x005d
            X.2EM r1 = r7.A00
            if (r1 == 0) goto L_0x0096
            X.MkK r0 = X.C67224MkK.A00
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x002d
        L_0x005a:
            X.72b r4 = r7.A06
            goto L_0x0013
        L_0x005d:
            X.PxD r1 = r7.A04
            boolean r0 = r1.isLoading()
            if (r0 != 0) goto L_0x0091
            boolean r0 = r1.CJm()
            if (r0 == 0) goto L_0x0070
            X.72b r4 = r7.A07
            X.6rr r3 = X.C320156rr.ERROR
            goto L_0x0015
        L_0x0070:
            X.2EM r1 = r7.A00
            if (r1 == 0) goto L_0x0096
            X.2EL r0 = X.AnonymousClass2EL.A00
            if (r1 == r0) goto L_0x005a
            X.2EX r0 = X.AnonymousClass2EX.A00
            if (r1 == r0) goto L_0x005a
            boolean r0 = r1 instanceof X.C300895y8
            if (r0 != 0) goto L_0x005a
            boolean r0 = r1 instanceof X.2Ej
            if (r0 != 0) goto L_0x005a
            X.48q r1 = r7.A01
            if (r1 == 0) goto L_0x009a
            X.48q r0 = X.C2611948q.ALL
            if (r1 == r0) goto L_0x002d
            goto L_0x005a
        L_0x008d:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r8 != r0) goto L_0x002d
        L_0x0091:
            X.72b r4 = r7.A09
            X.6rr r3 = X.C320156rr.LOADING
            goto L_0x0015
        L_0x0096:
            X.0qQ.A0F(r5)
            goto L_0x009d
        L_0x009a:
            X.0qQ.A0F(r6)
        L_0x009d:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66739Mbk.A01(java.lang.Integer, boolean, boolean):X.MlO");
    }

    private final void A00() {
        C3253572b r2;
        int i;
        C2611948q r1 = this.A01;
        String str = "emptyFilter";
        if (r1 != null) {
            if (r1 == C2611948q.BOOKED) {
                r2 = this.A06;
                i = R.drawable.instagram_calendar_outline_96;
            } else if (r1 == C2611948q.ORDERED) {
                r2 = this.A06;
                i = R.drawable.instagram_shopping_cart_outline_96;
            } else if (r1 == C2611948q.PAID) {
                r2 = this.A06;
                i = R.drawable.instagram_receipt_outline_96;
            } else if (r1 == C2611948q.SHIPPED) {
                r2 = this.A06;
                i = R.drawable.instagram_orders_outline_96;
            } else if (r1 == C2611948q.LEAD) {
                r2 = this.A06;
                i = R.drawable.instagram_save_outline_96;
            } else if (r1 == C2611948q.IMPORTANT || r1 == C2611948q.FOLLOW_UP) {
                r2 = this.A06;
                i = R.drawable.instagram_star_outline_96;
            } else {
                C67224MkK mkK = this.A00;
                str = "emptyMode";
                if (mkK != null) {
                    if (mkK == AnonymousClass2EX.A00) {
                        r2 = this.A06;
                        i = R.drawable.instagram_channels_outline_96;
                    } else if (mkK == C67224MkK.A00) {
                        r2 = this.A06;
                        i = R.drawable.instagram_lock_outline_96;
                    } else {
                        boolean A002 = 2Iw.A00(this.A03);
                        r2 = this.A06;
                        i = R.drawable.empty_state_direct;
                        if (A002) {
                            i = R.drawable.instagram_app_messenger_outline_96;
                        }
                    }
                }
            }
            r2.A02 = i;
            return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0114, code lost:
        r3 = r8.getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0118, code lost:
        r2 = X.AnonymousClass7TE.A16(r8, 2131959467);
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x013d, code lost:
        r0 = r7.A06;
        r0.A0D = r1;
        r0.A07 = r3;
        r0.A0C = r2;
        r7.A00 = r9;
        r7.A01 = r10;
        A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x014c, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(android.content.Context r8, X.2EM r9, X.C2611948q r10) {
        /*
            r7 = this;
            int r0 = r10.ordinal()
            java.lang.String r2 = ""
            switch(r0) {
                case 0: goto L_0x0120;
                case 1: goto L_0x010a;
                case 2: goto L_0x00ff;
                case 3: goto L_0x0009;
                case 4: goto L_0x0009;
                case 5: goto L_0x0009;
                case 6: goto L_0x00cb;
                case 7: goto L_0x0009;
                case 8: goto L_0x00c0;
                case 9: goto L_0x00b5;
                case 10: goto L_0x00aa;
                case 11: goto L_0x0094;
                case 12: goto L_0x0088;
                case 13: goto L_0x007c;
                case 14: goto L_0x0070;
                case 15: goto L_0x0064;
                case 16: goto L_0x0058;
                case 17: goto L_0x004c;
                case 18: goto L_0x0009;
                case 19: goto L_0x0040;
                case 20: goto L_0x0034;
                case 21: goto L_0x0028;
                case 22: goto L_0x009f;
                case 23: goto L_0x001c;
                case 24: goto L_0x0010;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.String r0 = "Invalid filter"
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)
            throw r0
        L_0x0010:
            r0 = 2131959497(0x7f131ec9, float:1.9555636E38)
            java.lang.String r1 = r8.getString(r0)
            r0 = 2131959478(0x7f131eb6, float:1.9555598E38)
            goto L_0x0114
        L_0x001c:
            r0 = 2131959496(0x7f131ec8, float:1.9555634E38)
            java.lang.String r1 = r8.getString(r0)
            r0 = 2131959477(0x7f131eb5, float:1.9555596E38)
            goto L_0x0114
        L_0x0028:
            r0 = 2131959495(0x7f131ec7, float:1.9555632E38)
            java.lang.String r1 = r8.getString(r0)
            r0 = 2131959476(0x7f131eb4, float:1.9555594E38)
            goto L_0x0114
        L_0x0034:
            r0 = 2131959498(0x7f131eca, float:1.9555638E38)
            java.lang.String r1 = r8.getString(r0)
            r0 = 2131959479(0x7f131eb7, float:1.95556E38)
            goto L_0x0114
        L_0x0040:
            r0 = 2131959488(0x7f131ec0, float:1.9555618E38)
            java.lang.String r1 = r8.getString(r0)
            r0 = 2131959469(0x7f131ead, float:1.955558E38)
            goto L_0x0114
        L_0x004c:
            r0 = 2131959499(0x7f131ecb, float:1.955564E38)
            java.lang.String r1 = r8.getString(r0)
            r0 = 2131959480(0x7f131eb8, float:1.9555602E38)
            goto L_0x0114
        L_0x0058:
            r0 = 2131959502(0x7f131ece, float:1.9555646E38)
            java.lang.String r1 = r8.getString(r0)
            r0 = 2131959483(0x7f131ebb, float:1.9555608E38)
            goto L_0x0114
        L_0x0064:
            r0 = 2131959501(0x7f131ecd, float:1.9555644E38)
            java.lang.String r1 = r8.getString(r0)
            r0 = 2131959482(0x7f131eba, float:1.9555606E38)
            goto L_0x0114
        L_0x0070:
            r0 = 2131959500(0x7f131ecc, float:1.9555642E38)
            java.lang.String r1 = r8.getString(r0)
            r0 = 2131959481(0x7f131eb9, float:1.9555604E38)
            goto L_0x0114
        L_0x007c:
            r0 = 2131959489(0x7f131ec1, float:1.955562E38)
            java.lang.String r1 = r8.getString(r0)
            r0 = 2131959470(0x7f131eae, float:1.9555581E38)
            goto L_0x0114
        L_0x0088:
            r0 = 2131959504(0x7f131ed0, float:1.955565E38)
            java.lang.String r1 = r8.getString(r0)
            r0 = 2131959487(0x7f131ebf, float:1.9555616E38)
            goto L_0x0114
        L_0x0094:
            r0 = 2131959490(0x7f131ec2, float:1.9555622E38)
            java.lang.String r1 = r8.getString(r0)
            r0 = 2131959471(0x7f131eaf, float:1.9555583E38)
            goto L_0x0114
        L_0x009f:
            r0 = 2131959492(0x7f131ec4, float:1.9555626E38)
            java.lang.String r1 = r8.getString(r0)
            r0 = 2131959473(0x7f131eb1, float:1.9555587E38)
            goto L_0x0114
        L_0x00aa:
            r0 = 2131959493(0x7f131ec5, float:1.9555628E38)
            java.lang.String r1 = r8.getString(r0)
            r0 = 2131959474(0x7f131eb2, float:1.955559E38)
            goto L_0x0114
        L_0x00b5:
            r0 = 2131959503(0x7f131ecf, float:1.9555648E38)
            java.lang.String r1 = r8.getString(r0)
            r0 = 2131959484(0x7f131ebc, float:1.955561E38)
            goto L_0x0114
        L_0x00c0:
            r0 = 2131959506(0x7f131ed2, float:1.9555654E38)
            java.lang.String r1 = r8.getString(r0)
            r0 = 2131959485(0x7f131ebd, float:1.9555612E38)
            goto L_0x0114
        L_0x00cb:
            r0 = 2131959491(0x7f131ec3, float:1.9555624E38)
            java.lang.String r1 = r8.getString(r0)
            com.instagram.common.session.UserSession r6 = r7.A03
            androidx.fragment.app.FragmentActivity r5 = r7.A02
            r0 = 2131959468(0x7f131eac, float:1.9555577E38)
            java.lang.String r4 = X.AnonymousClass7TE.A16(r8, r0)
            r0 = 2131959472(0x7f131eb0, float:1.9555585E38)
            java.lang.String r2 = X.AnonymousClass7TE.A16(r8, r0)
            java.lang.String r0 = "line.separator"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            java.lang.String r0 = X.002.A0g(r2, r0, r4)
            android.text.SpannableStringBuilder r3 = X.DbS.A0C(r0)
            int r2 = X.DbV.A02(r8)
            X.ESg r0 = new X.ESg
            r0.<init>((androidx.fragment.app.FragmentActivity) r5, (com.instagram.common.session.UserSession) r6, (int) r2)
            X.AnonymousClass7AV.A05(r3, r0, r4)
            goto L_0x0118
        L_0x00ff:
            r0 = 2131959494(0x7f131ec6, float:1.955563E38)
            java.lang.String r1 = r8.getString(r0)
            r0 = 2131959475(0x7f131eb3, float:1.9555591E38)
            goto L_0x0114
        L_0x010a:
            r0 = 2131959505(0x7f131ed1, float:1.9555652E38)
            java.lang.String r1 = r8.getString(r0)
            r0 = 2131959486(0x7f131ebe, float:1.9555614E38)
        L_0x0114:
            java.lang.String r3 = r8.getString(r0)
        L_0x0118:
            r0 = 2131959467(0x7f131eab, float:1.9555575E38)
            java.lang.String r2 = X.AnonymousClass7TE.A16(r8, r0)
            goto L_0x013d
        L_0x0120:
            X.2EL r0 = X.AnonymousClass2EL.A00
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x014d
            r0 = 2131964249(0x7f133159, float:1.9565274E38)
            java.lang.String r1 = r8.getString(r0)
            r0 = 2131964248(0x7f133158, float:1.9565272E38)
            java.lang.String r3 = r8.getString(r0)
            r0 = 2131964264(0x7f133168, float:1.9565305E38)
        L_0x0139:
            java.lang.String r2 = r8.getString(r0)
        L_0x013d:
            X.72b r0 = r7.A06
            r0.A0D = r1
            r0.A07 = r3
            r0.A0C = r2
            r7.A00 = r9
            r7.A01 = r10
            r7.A00()
            return
        L_0x014d:
            X.2EX r0 = X.AnonymousClass2EX.A00
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0164
            r0 = 2131964308(0x7f133194, float:1.9565394E38)
            java.lang.String r1 = r8.getString(r0)
            r0 = 2131964307(0x7f133193, float:1.9565392E38)
        L_0x015f:
            java.lang.String r3 = r8.getString(r0)
            goto L_0x013d
        L_0x0164:
            X.MkK r0 = X.C67224MkK.A00
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0177
            r0 = 2131963792(0x7f132f90, float:1.9564347E38)
            java.lang.String r1 = r8.getString(r0)
            r0 = 2131963791(0x7f132f8f, float:1.9564345E38)
            goto L_0x015f
        L_0x0177:
            X.5y8 r0 = X.C300895y8.A00
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x018a
            r0 = 2131959932(0x7f13207c, float:1.9556518E38)
            java.lang.String r1 = r8.getString(r0)
            r0 = 2131959931(0x7f13207b, float:1.9556516E38)
            goto L_0x015f
        L_0x018a:
            boolean r0 = r9 instanceof X.2Ej
            if (r0 == 0) goto L_0x01a0
            r0 = 2131958839(0x7f131c37, float:1.9554302E38)
            java.lang.String r1 = r8.getString(r0)
            r0 = 2131958837(0x7f131c35, float:1.9554297E38)
            java.lang.String r3 = r8.getString(r0)
            r0 = 2131958838(0x7f131c36, float:1.95543E38)
            goto L_0x0139
        L_0x01a0:
            r0 = 2131959530(0x7f131eea, float:1.9555703E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r8, r0)
            r0 = 2131959529(0x7f131ee9, float:1.95557E38)
            java.lang.String r3 = X.AnonymousClass7TE.A16(r8, r0)
            r0 = 2131960299(0x7f1321eb, float:1.9557263E38)
            goto L_0x0139
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66739Mbk.A02(android.content.Context, X.2EM, X.48q):void");
    }
}
