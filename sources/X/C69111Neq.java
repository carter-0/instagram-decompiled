package X;

import android.content.Context;
import android.graphics.drawable.InsetDrawable;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.Neq  reason: case insensitive filesystem */
public final class C69111Neq extends C71135OdY {
    public int A00;
    public C55866Hon A01;
    public Dc2 A02;
    public Dc2 A03;
    public N9C A04;
    public Integer A05;
    public boolean A06;
    public boolean A07 = true;
    public boolean A08;
    public Integer A09;
    public final View A0A;
    public final UserSession A0B;
    public final OKY A0C;
    public final PMM A0D = PMM.A00;
    public final C71111Ocu A0E;
    public final ArrayList A0F = AnonymousClass7TE.A1C();
    public final ArrayList A0G = AnonymousClass7TE.A1C();
    public final AnonymousClass0eM A0H = C73922Pm2.A01(this, 44);
    public final AnonymousClass0eM A0I = C73922Pm2.A01(this, 46);
    public final AnonymousClass0eM A0J = C73922Pm2.A01(this, 47);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69111Neq(View view, UserSession userSession, OKY oky, C71111Ocu ocu) {
        super(DbS.A0z(N9C.class));
        C51972G9s.A1D(ocu, oky);
        this.A0A = view;
        this.A0B = userSession;
        this.A0E = ocu;
        this.A0C = oky;
    }

    public static final void A02(C310336ap r5, C69111Neq neq, C62320sa r7, C62320sa r8) {
        A03(r5, neq, r7, r8, false, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:116:0x03a1, code lost:
        r1 = new java.lang.Object[1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x03a3, code lost:
        r1[0] = r5[0];
        r1 = r3.getString(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x03ab, code lost:
        X.0qQ.A07(r1);
        r0 = r5[1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x03b0, code lost:
        A0A(r1, (java.lang.String) null, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x03b3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x041b, code lost:
        A0B(r0, r1, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b9, code lost:
        r1 = X.AnonymousClass7TE.A16(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0153, code lost:
        r0 = r2.getApplicationContext();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0218, code lost:
        if (r3.length() == 0) goto L_0x021a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x02ac, code lost:
        X.C59689JTv.A09(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x02af, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void A0I(X.C74269Prx r15) {
        /*
            r14 = this;
            r5 = r15
            X.N9C r5 = (X.N9C) r5
            r13 = 0
            X.0qQ.A0B(r5, r13)
            r8 = r14
            boolean r0 = r14.A08
            if (r0 != 0) goto L_0x041e
            long r3 = java.lang.System.currentTimeMillis()
            long r0 = r5.A00
            long r3 = r3 - r0
            r1 = 500(0x1f4, double:2.47E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x041e
            r14.A04 = r5
            java.lang.Integer r4 = r5.A01
            int r0 = r4.intValue()
            r7 = 2
            r10 = 0
            r12 = 1
            switch(r0) {
                case 0: goto L_0x002c;
                case 1: goto L_0x040a;
                case 2: goto L_0x013f;
                case 3: goto L_0x0159;
                case 4: goto L_0x0048;
                case 5: goto L_0x00a2;
                case 6: goto L_0x009a;
                case 7: goto L_0x020d;
                case 8: goto L_0x023f;
                case 9: goto L_0x024a;
                case 10: goto L_0x00aa;
                case 11: goto L_0x00b2;
                case 12: goto L_0x0092;
                case 13: goto L_0x010f;
                case 14: goto L_0x0171;
                case 15: goto L_0x00bf;
                case 16: goto L_0x0070;
                case 17: goto L_0x007d;
                case 18: goto L_0x0203;
                case 19: goto L_0x0363;
                case 20: goto L_0x02a0;
                case 21: goto L_0x02b0;
                case 22: goto L_0x0057;
                case 23: goto L_0x033e;
                case 24: goto L_0x02e2;
                case 25: goto L_0x026b;
                case 26: goto L_0x026b;
                case 27: goto L_0x026b;
                case 28: goto L_0x0375;
                case 29: goto L_0x0375;
                case 30: goto L_0x038a;
                case 31: goto L_0x03e7;
                case 32: goto L_0x0398;
                case 33: goto L_0x00db;
                case 34: goto L_0x03b4;
                case 35: goto L_0x00ee;
                case 36: goto L_0x03c5;
                case 37: goto L_0x03d6;
                default: goto L_0x0027;
            }
        L_0x0027:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x002c:
            android.content.Context r2 = X.C71135OdY.A0C(r14)
            com.instagram.common.session.UserSession r1 = r14.A0B
            X.0Tu r0 = X.0Tu.A05
            boolean r1 = X.182.A05(r0, r1)
            r0 = 2131954432(0x7f130b00, float:1.9545363E38)
            if (r1 == 0) goto L_0x0040
            r0 = 2131954431(0x7f130aff, float:1.9545361E38)
        L_0x0040:
            java.lang.String r1 = X.AnonymousClass7TE.A16(r2, r0)
            java.lang.String r0 = "call_adding_user_failed_group_full"
            goto L_0x041b
        L_0x0048:
            android.content.Context r1 = X.C71135OdY.A0C(r14)
            r0 = 2131956821(0x7f131455, float:1.9550209E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r1, r0)
            java.lang.String r0 = "cowatch_interop_upgrade_failure"
            goto L_0x041b
        L_0x0057:
            android.content.Context r3 = X.C71135OdY.A0C(r14)
            r0 = 2131967929(0x7f133fb9, float:1.9572738E38)
            java.lang.String r2 = X.AnonymousClass7TE.A16(r3, r0)
            r1 = 2131238547(0x7f081e93, float:1.8093376E38)
            r0 = 2131974659(0x7f135a03, float:1.9586388E38)
            java.lang.String r0 = r3.getString(r0)
            r14.A09(r2, r0, r1)
            return
        L_0x0070:
            android.content.Context r3 = X.C71135OdY.A0C(r14)
            r2 = 2131954535(0x7f130b67, float:1.9545572E38)
            java.lang.Object[] r1 = new java.lang.Object[r12]
            java.lang.String[] r5 = r5.A04
            goto L_0x03a3
        L_0x007d:
            android.view.View r3 = r14.A0A
            android.content.Context r2 = r3.getContext()
            r1 = 2131954536(0x7f130b68, float:1.9545574E38)
            java.lang.String[] r0 = r5.A04
            r0 = r0[r13]
            java.lang.String r0 = X.DbY.A0c(r2, r0, r1)
            r3.announceForAccessibility(r0)
            return
        L_0x0092:
            android.content.Context r2 = X.C71135OdY.A0C(r14)
            r0 = 2131954449(0x7f130b11, float:1.9545398E38)
            goto L_0x00b9
        L_0x009a:
            android.content.Context r2 = X.C71135OdY.A0C(r14)
            r0 = 2131954437(0x7f130b05, float:1.9545373E38)
            goto L_0x00b9
        L_0x00a2:
            android.content.Context r2 = X.C71135OdY.A0C(r14)
            r0 = 2131954462(0x7f130b1e, float:1.9545424E38)
            goto L_0x00b9
        L_0x00aa:
            android.content.Context r2 = X.C71135OdY.A0C(r14)
            r0 = 2131954436(0x7f130b04, float:1.9545371E38)
            goto L_0x00b9
        L_0x00b2:
            android.content.Context r2 = X.C71135OdY.A0C(r14)
            r0 = 2131954434(0x7f130b02, float:1.9545367E38)
        L_0x00b9:
            java.lang.String r1 = X.AnonymousClass7TE.A16(r2, r0)
            goto L_0x0153
        L_0x00bf:
            android.content.Context r4 = X.C71135OdY.A0C(r14)
            r1 = 2131957125(0x7f131585, float:1.9550825E38)
            java.lang.String[] r3 = r5.A04
            r0 = r3[r13]
            java.lang.String r2 = X.DbY.A0c(r4, r0, r1)
            r0 = 2131976227(0x7f136023, float:1.9589569E38)
            java.lang.String r1 = r4.getString(r0)
            r0 = r3[r12]
            r14.A0A(r2, r1, r0)
            return
        L_0x00db:
            android.view.View r0 = r14.A0A
            android.content.res.Resources r1 = X.DbU.A05(r0)
            r0 = 2131972737(0x7f135281, float:1.958249E38)
            java.lang.String r1 = X.AnonymousClass7TF.A0d(r1, r0)
            java.lang.String r0 = "screen_share_start_sharing_failed"
            r14.A0B(r0, r1, r12)
            return
        L_0x00ee:
            android.content.Context r4 = X.C71135OdY.A0C(r14)
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131972744(0x7f135288, float:1.9582504E38)
            java.lang.String r3 = X.AnonymousClass7TF.A0d(r1, r0)
            r2 = 2131238976(0x7f082040, float:1.8094246E38)
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131972745(0x7f135289, float:1.9582506E38)
            java.lang.String r0 = r1.getString(r0)
            r14.A09(r3, r0, r2)
            return
        L_0x010f:
            android.content.Context r3 = X.C71135OdY.A0C(r14)
            r0 = 2131972474(0x7f13517a, float:1.9581957E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r3, r0)
            r0 = 2131238518(0x7f081e76, float:1.8093317E38)
            X.6ap r2 = X.DbV.A0W()
            r2.A0D = r1
            r2.A03()
            android.graphics.drawable.InsetDrawable r1 = r14.A00(r0)
            r0 = 2131100036(0x7f060184, float:1.7812442E38)
            int r0 = r3.getColor(r0)
            r2.A08(r1, r0)
            r2.A06()
            X.PlL r1 = X.C73884PlL.A00
            X.PlM r0 = X.C73885PlM.A00
            A02(r2, r14, r1, r0)
            return
        L_0x013f:
            java.lang.String[] r0 = r5.A04
            r3 = r0[r13]
            r1 = r0[r12]
            android.content.Context r2 = X.C71135OdY.A0C(r14)
            r0 = 2131954474(0x7f130b2a, float:1.9545448E38)
            java.lang.String r1 = X.DbV.A0u(r2, r3, r1, r0)
            X.0qQ.A07(r1)
        L_0x0153:
            android.content.Context r0 = r2.getApplicationContext()
            goto L_0x02ac
        L_0x0159:
            java.lang.String[] r1 = r5.A04
            int r0 = r1.length
            if (r0 <= r12) goto L_0x016f
            r2 = r1[r12]
        L_0x0160:
            r1 = r1[r13]
            java.lang.String r0 = ""
            r14.A0A(r1, r0, r2)
            X.OKY r1 = r14.A0C
            X.PKT r0 = X.PKT.A00
            r1.A00(r0)
            return
        L_0x016f:
            r2 = 0
            goto L_0x0160
        L_0x0171:
            java.lang.String[] r3 = r5.A04
            X.OKY r1 = r14.A0C
            X.PKL r0 = X.PKL.A00
            r1.A00(r0)
            int r0 = r3.length
            android.content.Context r2 = X.C71135OdY.A0C(r14)
            if (r0 != 0) goto L_0x01f9
            r0 = 2131956820(0x7f131454, float:1.9550207E38)
            java.lang.String r6 = r2.getString(r0)
        L_0x0188:
            X.0qQ.A0A(r6)
            r0 = 2131237815(0x7f081bb7, float:1.8091891E38)
            android.graphics.drawable.Drawable r5 = r2.getDrawable(r0)
            r0 = 2131956819(0x7f131453, float:1.9550204E38)
            java.lang.String r4 = r2.getString(r0)
            X.0qQ.A0B(r6, r12)
            X.0eM r2 = r14.A0H
            java.lang.Object r1 = r2.getValue()
            X.PMO r1 = (X.PMO) r1
            X.OA9 r0 = new X.OA9
            r0.<init>(r14)
            r1.A00 = r0
            java.lang.Object r1 = r2.getValue()
            X.PMO r1 = (X.PMO) r1
            android.os.Handler r3 = r1.A01
            java.lang.Runnable r2 = r1.A04
            r3.removeCallbacks(r2)
            X.0eM r0 = r1.A08
            X.C66582MXn.A1L(r6, r0)
            if (r5 == 0) goto L_0x01ca
            X.0eM r0 = r1.A07
            java.lang.Object r0 = r0.getValue()
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0.setImageDrawable(r5)
        L_0x01ca:
            if (r4 == 0) goto L_0x01d1
            X.0eM r0 = r1.A05
            X.C66582MXn.A1L(r4, r0)
        L_0x01d1:
            X.0eM r0 = r1.A06
            java.lang.Object r0 = r0.getValue()
            X.N1V r0 = (X.N1V) r0
            android.view.View r1 = r1.A02
            r1.setOnTouchListener(r0)
            int r0 = r1.getMeasuredHeight()
            float r0 = (float) r0
            android.view.ViewPropertyAnimator r1 = r1.animate()
            float r0 = -r0
            android.view.ViewPropertyAnimator r0 = r1.translationY(r0)
            android.view.ViewPropertyAnimator r0 = X.C66581MXm.A0D(r0)
            r0.start()
            r0 = 4000(0xfa0, double:1.9763E-320)
            r3.postDelayed(r2, r0)
            return
        L_0x01f9:
            r1 = 2131956818(0x7f131452, float:1.9550202E38)
            r0 = r3[r13]
            java.lang.String r6 = X.DbW.A0h(r2, r0, r1)
            goto L_0x0188
        L_0x0203:
            java.lang.String[] r0 = r5.A04
            r1 = r0[r13]
            android.view.View r0 = r14.A0A
            r0.announceForAccessibility(r1)
            return
        L_0x020d:
            java.lang.String[] r4 = r5.A04
            r3 = r4[r13]
            if (r3 == 0) goto L_0x021a
            int r1 = r3.length()
            r0 = 0
            if (r1 != 0) goto L_0x021b
        L_0x021a:
            r0 = 1
        L_0x021b:
            android.content.Context r2 = X.C71135OdY.A0C(r14)
            if (r0 == 0) goto L_0x0235
            r1 = 2131972468(0x7f135174, float:1.9581944E38)
            r0 = r4[r12]
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
        L_0x022a:
            java.lang.String r1 = r2.getString(r1, r0)
            X.0qQ.A0A(r1)
            r0 = r4[r7]
            goto L_0x03b0
        L_0x0235:
            r1 = 2131972470(0x7f135176, float:1.9581948E38)
            r0 = r4[r12]
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r0}
            goto L_0x022a
        L_0x023f:
            java.lang.String[] r5 = r5.A04
            android.content.Context r3 = X.C71135OdY.A0C(r14)
            r2 = 2131972471(0x7f135177, float:1.958195E38)
            goto L_0x03a1
        L_0x024a:
            java.lang.String[] r5 = r5.A04
            android.view.View r0 = r14.A0A
            android.content.res.Resources r4 = X.DbU.A05(r0)
            r3 = 2131820932(0x7f110184, float:1.9274593E38)
            r0 = r5[r7]
            int r2 = java.lang.Integer.parseInt(r0)
            r1 = r5[r13]
            int r0 = java.lang.Integer.parseInt(r0)
            java.lang.Object[] r0 = X.C51968G9o.A1Z(r1, r0)
            java.lang.String r1 = r4.getQuantityString(r3, r2, r0)
            goto L_0x03ab
        L_0x026b:
            java.lang.String[] r0 = r5.A04
            r1 = r0[r13]
            r4 = r0[r12]
            r0 = r0[r7]
            int r3 = java.lang.Integer.parseInt(r0)
            r0 = 2131239004(0x7f08205c, float:1.8094303E38)
            X.6ap r2 = X.DbV.A0W()
            r2.A0D = r1
            r2.A02()
            android.graphics.drawable.InsetDrawable r1 = r14.A00(r0)
            android.content.Context r0 = X.C71135OdY.A0C(r14)
            int r0 = X.DbV.A01(r0)
            r2.A08(r1, r0)
            if (r4 == 0) goto L_0x0296
            r2.A0I = r4
        L_0x0296:
            r2.A01 = r3
            X.PlL r1 = X.C73884PlL.A00
            X.PlM r0 = X.C73885PlM.A00
            A02(r2, r14, r1, r0)
            return
        L_0x02a0:
            java.lang.String[] r0 = r5.A04
            r1 = r0[r13]
            android.content.Context r0 = X.C71135OdY.A0C(r14)
            android.content.Context r0 = r0.getApplicationContext()
        L_0x02ac:
            X.C59689JTv.A09(r0, r1)
            return
        L_0x02b0:
            java.lang.String[] r1 = r5.A04
            X.0qQ.A0B(r1, r13)
            int r0 = r1.length
            if (r0 == 0) goto L_0x02d6
            r2 = r1[r13]
            if (r2 == 0) goto L_0x02d6
            int r0 = r2.length()
            if (r0 == 0) goto L_0x02d6
            android.content.Context r1 = X.C71135OdY.A0C(r14)
            r0 = 2131954444(0x7f130b0c, float:1.9545387E38)
            java.lang.String r9 = X.DbW.A0h(r1, r2, r0)
        L_0x02cd:
            X.0qQ.A0A(r9)
            java.lang.String r11 = ""
            A06(r8, r9, r10, r11, r12, r13)
            return
        L_0x02d6:
            android.content.Context r1 = X.C71135OdY.A0C(r14)
            r0 = 2131954445(0x7f130b0d, float:1.954539E38)
            java.lang.String r9 = r1.getString(r0)
            goto L_0x02cd
        L_0x02e2:
            java.lang.String[] r0 = r5.A04
            r3 = r0[r13]
            r6 = r0[r12]
            r0 = r0[r7]
            boolean r2 = java.lang.Boolean.parseBoolean(r0)
            android.content.Context r1 = X.C71135OdY.A0C(r14)
            r0 = 2131953264(0x7f130670, float:1.9542994E38)
            if (r2 == 0) goto L_0x02fa
            r0 = 2131953266(0x7f130672, float:1.9542998E38)
        L_0x02fa:
            java.lang.String r5 = X.C51967G9n.A0p(r1, r0)
            r0 = 2131954535(0x7f130b67, float:1.9545572E38)
            java.lang.String r4 = X.DbY.A0c(r1, r3, r0)
            r0 = 2131953265(0x7f130671, float:1.9542996E38)
            java.lang.String r3 = X.AnonymousClass7TE.A16(r1, r0)
            r0 = 45
            X.Pm2 r2 = new X.Pm2
            r2.<init>(r14, r0)
            X.6ap r1 = X.DbV.A0W()
            r1.A0D = r4
            r1.A0G = r3
            r1.A0L = r12
            if (r5 == 0) goto L_0x0321
            r1.A0I = r5
        L_0x0321:
            if (r6 == 0) goto L_0x0334
            int r0 = r6.length()
            if (r0 == 0) goto L_0x0334
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.DbS.A0V(r6)
            r1.A09 = r0
            X.6ar r0 = X.C310356ar.CIRCULAR
            r1.A0B(r0)
        L_0x0334:
            r0 = 7000(0x1b58, float:9.809E-42)
            r1.A01 = r0
            X.PlL r0 = X.C73884PlL.A00
            A02(r1, r14, r0, r2)
            return
        L_0x033e:
            java.lang.String[] r3 = r5.A04
            int r0 = r3.length
            if (r0 != 0) goto L_0x0352
            android.content.Context r1 = X.C71135OdY.A0C(r14)
            r0 = 2131972467(0x7f135173, float:1.9581942E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r1, r0)
            r14.A08(r0)
            return
        L_0x0352:
            android.content.Context r2 = X.C71135OdY.A0C(r14)
            r1 = 2131972466(0x7f135172, float:1.958194E38)
            r0 = r3[r13]
            java.lang.String r0 = X.DbY.A0c(r2, r0, r1)
            r14.A08(r0)
            return
        L_0x0363:
            java.lang.String[] r1 = r5.A04
            r9 = r1[r13]
            int r0 = r1.length
            if (r0 <= r12) goto L_0x0372
            r11 = r1[r12]
        L_0x036c:
            boolean r12 = r5.A03
            A06(r8, r9, r10, r11, r12, r13)
            return
        L_0x0372:
            java.lang.String r11 = ""
            goto L_0x036c
        L_0x0375:
            java.lang.String[] r0 = r5.A04
            r3 = r0[r13]
            r2 = r0[r12]
            r1 = r0[r7]
            java.lang.Integer r0 = X.AnonymousClass05K.A0L
            if (r4 != r0) goto L_0x0387
            java.lang.Integer r0 = X.AnonymousClass05K.A00
        L_0x0383:
            r14.A07(r0, r3, r2, r1)
            return
        L_0x0387:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x0383
        L_0x038a:
            java.lang.String[] r0 = r5.A04
            r3 = r0[r13]
            r2 = r0[r12]
            r1 = r0[r7]
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r14.A07(r0, r3, r2, r1)
            return
        L_0x0398:
            java.lang.String[] r5 = r5.A04
            android.content.Context r3 = X.C71135OdY.A0C(r14)
            r2 = 2131972469(0x7f135175, float:1.9581946E38)
        L_0x03a1:
            java.lang.Object[] r1 = new java.lang.Object[r12]
        L_0x03a3:
            r0 = r5[r13]
            r1[r13] = r0
            java.lang.String r1 = r3.getString(r2, r1)
        L_0x03ab:
            X.0qQ.A07(r1)
            r0 = r5[r12]
        L_0x03b0:
            r14.A0A(r1, r10, r0)
            return
        L_0x03b4:
            java.lang.String[] r0 = r5.A04
            r2 = r0[r13]
            r1 = r0[r12]
            int r0 = r1.length()
            if (r0 != 0) goto L_0x03c1
            r1 = r10
        L_0x03c1:
            r14.A0A(r2, r10, r1)
            return
        L_0x03c5:
            java.lang.String[] r0 = r5.A04
            r2 = r0[r13]
            r1 = r0[r12]
            int r0 = r1.length()
            if (r0 != 0) goto L_0x03d2
            r1 = r10
        L_0x03d2:
            r14.A0A(r2, r10, r1)
            return
        L_0x03d6:
            java.lang.String[] r0 = r5.A04
            r2 = r0[r13]
            r1 = r0[r12]
            int r0 = r1.length()
            if (r0 != 0) goto L_0x03e3
            r1 = r10
        L_0x03e3:
            r14.A0A(r2, r10, r1)
            return
        L_0x03e7:
            java.lang.String[] r0 = r5.A04
            r1 = r0[r13]
            r0 = r0[r12]
            int r0 = java.lang.Integer.parseInt(r0)
            X.6ap r2 = X.DbV.A0W()
            r2.A0D = r1
            if (r0 <= 0) goto L_0x0406
            r2.A01 = r0
        L_0x03fb:
            X.PlL r4 = X.C73884PlL.A00
            X.PlM r5 = X.C73885PlM.A00
            r3 = r14
            r6 = r12
            r7 = r13
            A03(r2, r3, r4, r5, r6, r7)
            return
        L_0x0406:
            r2.A06()
            goto L_0x03fb
        L_0x040a:
            java.lang.String[] r0 = r5.A04
            r2 = r0[r13]
            android.content.Context r1 = X.C71135OdY.A0C(r14)
            r0 = 2131954430(0x7f130afe, float:1.954536E38)
            java.lang.String r1 = X.DbY.A0c(r1, r2, r0)
            java.lang.String r0 = "call_adding_user_failed"
        L_0x041b:
            r14.A0B(r0, r1, r13)
        L_0x041e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69111Neq.A0I(X.Prx):void");
    }

    public static final void A01(C74474PvU pvU, C56000Hr6 hr6, C69111Neq neq, C62320sa r4, C62320sa r5, boolean z) {
        if (neq.A05 == null) {
            neq.A0F.add(new C61071Jw9(hr6, r4, r5, z));
            A04(neq);
        } else if (!neq.A08) {
            hr6.A03 = new C72726PHg(pvU, neq, r4, r5);
            C55866Hon A002 = hr6.A00();
            ((AnonymousClass3M8) neq.A0J.getValue()).A07(A002);
            if (z) {
                neq.A01 = A002;
            }
        }
    }

    public static final void A03(C310336ap r2, C69111Neq neq, C62320sa r4, C62320sa r5, boolean z, boolean z2) {
        Dc2 dc2;
        if (z2 && (dc2 = neq.A03) != null) {
            ((AnonymousClass3M8) neq.A0J.getValue()).A09(dc2);
            neq.A03 = null;
        }
        if (neq.A05 == null) {
            neq.A0G.add(new C61071Jw9(r2, r4, r5, z));
            A04(neq);
            return;
        }
        r2.A0A(new IVU(2, r5, neq, r4));
        Dc2 A002 = r2.A00();
        ((AnonymousClass3M8) neq.A0J.getValue()).A0A(A002);
        if (z2) {
            neq.A03 = A002;
        } else if (z) {
            neq.A02 = A002;
        }
    }

    public static final void A04(C69111Neq neq) {
        if (DbT.A1b(neq.A0G) || DbT.A1b(neq.A0F)) {
            neq.A0E.A06(PO7.A00, 1000);
        }
    }

    public static final void A05(C69111Neq neq) {
        int i;
        Integer num = neq.A05;
        if (!neq.A07 || neq.A06 || num == null) {
            i = neq.A00;
        } else {
            i = num.intValue();
        }
        Integer num2 = neq.A09;
        if (num2 == null || i != num2.intValue()) {
            AnonymousClass0eM r0 = neq.A0I;
            View A0c = AnonymousClass7TE.A0c(r0);
            if (num2 == null) {
                A0c.setTranslationY((float) (-i));
            } else {
                C66580MXl.A1A(A0c);
                C66581MXm.A0D(AnonymousClass7TE.A0c(r0).animate().translationY((float) (-i))).start();
            }
            neq.A09 = Integer.valueOf(i);
        }
    }

    private final InsetDrawable A00(int i) {
        Context A0C2 = C71135OdY.A0C(this);
        return new InsetDrawable(A0C2.getDrawable(i), A0C2.getResources().getDimensionPixelOffset(R.dimen.abc_control_corner_material));
    }

    public static final void A06(C69111Neq neq, CharSequence charSequence, Integer num, String str, boolean z, boolean z2) {
        C310336ap A0W = DbV.A0W();
        A0W.A0D = charSequence;
        A0W.A0I = str;
        if (charSequence instanceof SpannableStringBuilder) {
            MovementMethod instance = LinkMovementMethod.getInstance();
            0qQ.A07(instance);
            A0W.A05 = instance;
        }
        if (num != null) {
            A0W.A01 = num.intValue();
        }
        if (z) {
            A0W.A06();
        }
        A03(A0W, neq, C73884PlL.A00, C73885PlM.A00, true, z2);
    }

    private final void A07(Integer num, String str, String str2, String str3) {
        String A16 = AnonymousClass7TE.A16(C71135OdY.A0C(this), 2131964224);
        C310336ap A0W = DbV.A0W();
        A0W.A0D = str;
        A0W.A0I = str2;
        A0W.A0B(C310356ar.CIRCULAR);
        A0W.A09 = DbS.A0V(str3);
        A0W.A0G = A16;
        A0W.A0L = true;
        A0W.A01 = 7000;
        A02(A0W, this, new C58691Iw0(11, num, this), new C58691Iw0(10, num, this));
    }

    private final void A08(String str) {
        C310336ap A0W = DbV.A0W();
        A0W.A0D = str;
        A0W.A02();
        Context A0C2 = C71135OdY.A0C(this);
        A0W.A08(new InsetDrawable(A0C2.getDrawable(R.drawable.instagram_bluetooth_pano_outline_24), A0C2.getResources().getDimensionPixelOffset(R.dimen.abc_button_padding_horizontal_material)), A0C2.getColor(2Yu.A0E(A0C2)));
        A0W.A06();
        A02(A0W, this, C73884PlL.A00, C73885PlM.A00);
    }

    private final void A09(String str, String str2, int i) {
        C310336ap A0W = DbV.A0W();
        A0W.A0D = str;
        A0W.A02();
        A0W.A08(A00(i), DbV.A01(C71135OdY.A0C(this)));
        if (str2 != null) {
            A0W.A0I = str2;
        }
        A0W.A06();
        A02(A0W, this, C73884PlL.A00, C73885PlM.A00);
    }

    private final void A0A(String str, String str2, String str3) {
        C310336ap A0W = DbV.A0W();
        A0W.A0D = str;
        if (!(str3 == null || str3.length() == 0)) {
            A0W.A09 = DbS.A0V(str3);
            A0W.A0B(C310356ar.CIRCULAR);
        }
        if (str2 != null) {
            A0W.A0I = str2;
        }
        A02(A0W, this, C73884PlL.A00, C73885PlM.A00);
    }

    private final void A0B(String str, String str2, boolean z) {
        C310336ap A0X = DbV.A0X();
        A0X.A0H = str;
        A0X.A0D = str2;
        if (z) {
            A0X.A06();
        }
        A02(A0X, this, C73884PlL.A00, C73885PlM.A00);
    }
}
