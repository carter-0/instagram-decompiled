package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class NQ6 extends C232232tF {
    public final AnonymousClass0iw A00;
    public final AnonymousClass2t9 A01;
    public final UserSession A02;
    public final X47 A03;
    public final X47 A04;
    public final C17960Vit A05;
    public final C56023HrV A06;
    public final 0sP A07;
    public final boolean A08;
    public final X47 A09;

    public NQ6(AnonymousClass0iw r3, AnonymousClass2t9 r4, UserSession userSession, X47 x47, X47 x472, X47 x473, C17960Vit vit, C56023HrV hrV, 0sP r11, boolean z) {
        0qQ.A0B(vit, 1);
        C51974G9v.A0d(3, userSession, x47, x472, x473);
        0qQ.A0B(r4, 7);
        0qQ.A0B(hrV, 10);
        this.A05 = vit;
        this.A00 = r3;
        this.A02 = userSession;
        this.A04 = x47;
        this.A03 = x472;
        this.A09 = x473;
        this.A01 = r4;
        this.A07 = r11;
        this.A08 = z;
        this.A06 = hrV;
        vit.A00.A0O = false;
    }

    /* JADX WARNING: type inference failed for: r2v38, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r2v39, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r2v60, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r2v61, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r8v20, types: [android.widget.TextView, com.instagram.common.ui.text.ExpandableTextView, android.view.View, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0722, code lost:
        r5.EBK(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0725, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02f3  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x033e  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x056a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x027a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r34, X.C249703kE r35) {
        /*
            r33 = this;
            r1 = r35
            r3 = r34
            X.Nfk r3 = (X.C69161Nfk) r3
            X.MzF r1 = (X.C68048MzF) r1
            r0 = 0
            boolean r4 = X.AnonymousClass7TF.A1U(r0, r3, r1)
            X.OMy r2 = r3.A00
            if (r2 == 0) goto L_0x0023
            java.lang.Integer r2 = r2.A01()
        L_0x0015:
            int r2 = r2.intValue()
            r5 = r33
            switch(r2) {
                case 0: goto L_0x037d;
                case 1: goto L_0x037d;
                case 2: goto L_0x0031;
                case 3: goto L_0x037d;
                case 4: goto L_0x037d;
                case 5: goto L_0x0732;
                case 6: goto L_0x002a;
                case 7: goto L_0x0732;
                default: goto L_0x001e;
            }
        L_0x001e:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0023:
            X.N3A r2 = r3.A01
            if (r2 == 0) goto L_0x0742
            java.lang.Integer r2 = r2.A04
            goto L_0x0015
        L_0x002a:
            java.lang.String r0 = "Threads HCM is not supported here. Must use Compose"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x0031:
            X.N3A r6 = r3.A01
            if (r6 == 0) goto L_0x0732
            java.lang.Integer r2 = r6.A04
            int r3 = r2.intValue()
            r24 = 2
            r2 = r24
            if (r3 != r2) goto L_0x0376
            com.instagram.common.session.UserSession r11 = r5.A02
            X.0Tu r10 = X.DbS.A0J(r11, r0)
            r2 = 36328340923170038(0x81106f00013cf6, double:3.037527310075625E-306)
            boolean r2 = X.182.A06(r10, r11, r2)
            if (r2 == 0) goto L_0x0732
            X.Vit r2 = r5.A05
            r32 = r2
            X.X47 r9 = r5.A03
            X.HrV r2 = r5.A06
            r31 = r2
            r3 = r32
            r2 = r24
            X.0qQ.A0B(r3, r2)
            r23 = 3
            r3 = r23
            r2 = r31
            X.C51973G9u.A0r(r3, r11, r9, r2)
            android.view.View r2 = r1.A01
            r22 = r2
            X.C66580MXl.A1R(r22)
            r8 = r22
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            android.view.View[] r12 = X.0nA.A10(r8)
            int r5 = r12.length
            r3 = 0
        L_0x007d:
            r7 = 8
            if (r3 >= r5) goto L_0x0089
            r2 = r12[r3]
            r2.setVisibility(r7)
            int r3 = r3 + 1
            goto L_0x007d
        L_0x0089:
            android.content.Context r21 = r22.getContext()
            r3 = 2131436268(0x7f0b22ec, float:1.8494402E38)
            r2 = r22
            android.view.View r2 = r2.findViewById(r3)
            if (r2 == 0) goto L_0x0359
            r2 = r22
            android.view.View r5 = r2.findViewById(r3)
        L_0x009e:
            boolean r2 = r6.A07
            if (r2 == 0) goto L_0x0353
            r2 = 0
        L_0x00a3:
            r5.setPadding(r0, r0, r0, r2)
            r2 = 2131436276(0x7f0b22f4, float:1.8494418E38)
            android.view.View r20 = X.AnonymousClass7TE.A0b(r5, r2)
            r2 = 2131436267(0x7f0b22eb, float:1.84944E38)
            android.widget.TextView r8 = X.DbW.A0B(r5, r2)
            android.content.res.Resources r3 = r5.getResources()
            r2 = 2131972826(0x7f1352da, float:1.958267E38)
            java.lang.CharSequence r2 = r3.getText(r2)
            r8.setText(r2)
            r2 = 36328340923497720(0x81106f00063cf8, double:3.037527310282852E-306)
            boolean r19 = X.182.A06(r10, r11, r2)
            r2 = 2131436265(0x7f0b22e9, float:1.8494396E38)
            android.view.View r8 = X.AnonymousClass7TE.A0b(r5, r2)
            com.instagram.common.ui.text.ExpandableTextView r8 = (com.instagram.common.ui.text.ExpandableTextView) r8
            r12 = 2147483647(0x7fffffff, float:NaN)
            if (r19 == 0) goto L_0x034e
            r2 = 36609815900526524(0x82106f000b17bc, double:3.2155332191646264E-306)
            int r3 = X.DbS.A04(r10, r11, r2)
            r8.setCollapsedLines(r3)
            r8.A01 = r12
            r2 = r32
            X.UZq r2 = r2.A00
            boolean r2 = r2.A0O
            if (r2 != 0) goto L_0x034e
            r8.setMaxLines(r3)
        L_0x00f2:
            r2 = 2131436266(0x7f0b22ea, float:1.8494398E38)
            android.view.View r10 = r5.requireViewById(r2)
            boolean r3 = r10 instanceof android.view.ViewStub
            r2 = 4
            java.lang.String r2 = X.Pxd.A00(r2)
            if (r3 == 0) goto L_0x0108
            android.view.ViewStub r10 = (android.view.ViewStub) r10
            android.view.View r10 = r10.inflate()
        L_0x0108:
            X.0qQ.A0C(r10, r2)
            com.facebook.shimmer.ShimmerFrameLayout r10 = (com.facebook.shimmer.ShimmerFrameLayout) r10
            X.Jw0 r13 = r6.A01
            if (r13 == 0) goto L_0x01d6
            boolean r2 = r6.A06
            if (r2 == 0) goto L_0x01d6
            r2 = 2131436270(0x7f0b22ee, float:1.8494406E38)
            android.view.View r12 = r5.requireViewById(r2)
            boolean r3 = r12 instanceof android.view.ViewStub
            java.lang.String r2 = "null cannot be cast to non-null type com.instagram.common.ui.base.IgLinearLayout"
            if (r3 == 0) goto L_0x0128
            android.view.ViewStub r12 = (android.view.ViewStub) r12
            android.view.View r12 = r12.inflate()
        L_0x0128:
            X.0qQ.A0C(r12, r2)
            r2 = 2131440797(0x7f0b349d, float:1.8503588E38)
            android.widget.ImageView r18 = X.DbX.A0J(r12, r2)
            android.widget.TextView r17 = X.C66582MXn.A0F(r12)
            r2 = 2131435466(0x7f0b1fca, float:1.8492775E38)
            android.widget.TextView r16 = X.AnonymousClass7TG.A0R(r12, r2)
            r3 = 0
            java.lang.String r14 = r13.A03
            X.NkY r2 = X.C69394NkY.GOOGLE
            boolean r2 = X.Dba.A1X(r2, r14)
            r15 = 2131238542(0x7f081e8e, float:1.8093366E38)
            if (r2 == 0) goto L_0x014e
            r15 = 2131238543(0x7f081e8f, float:1.8093368E38)
        L_0x014e:
            r14 = r21
            r2 = r18
            X.DbU.A13(r14, r2, r15)
            java.lang.String r14 = r13.A04
            r2 = r17
            r2.setText(r14)
            java.lang.String r2 = r13.A02
            if (r2 == 0) goto L_0x0177
            android.net.Uri r2 = X.0cp.A03(r2)
            java.lang.String r14 = r2.getHost()
            if (r14 == 0) goto L_0x0177
            java.lang.String r2 = "^www\\."
            X.11S r3 = new X.11S
            r3.<init>(r2)
            java.lang.String r2 = ""
            java.lang.String r3 = r3.A01(r14, r2)
        L_0x0177:
            r2 = r16
            r2.setText(r3)
            X.3NG r3 = X.AnonymousClass7TE.A0m(r12)
            X.H7k r2 = new X.H7k
            r25 = r2
            r26 = r24
            r27 = r31
            r28 = r6
            r29 = r21
            r30 = r11
            r25.<init>(r26, r27, r28, r29, r30)
            r3.A04 = r2
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            r3.A05 = r2
            r3.A00()
            java.lang.Object r14 = r13.A00
            java.util.List r14 = (java.util.List) r14
            java.lang.Object r13 = r13.A01
            java.util.List r13 = (java.util.List) r13
            r2 = 2131436271(0x7f0b22ef, float:1.8494408E38)
            android.view.View r12 = X.AnonymousClass7TE.A0b(r5, r2)
            if (r14 == 0) goto L_0x01d6
            boolean r2 = r14.isEmpty()
            if (r2 != 0) goto L_0x01d6
            if (r13 == 0) goto L_0x01d6
            boolean r2 = r13.isEmpty()
            if (r2 != 0) goto L_0x01d6
            r12.setVisibility(r0)
            X.30J r2 = X.AnonymousClass30J.SECONDS
            long r2 = X.AnonymousClass30K.A03(r2, r4)
            r25 = 45
            X.IxG r11 = new X.IxG
            r24 = r11
            r26 = r6
            r27 = r13
            r28 = r14
            r29 = r32
            r24.<init>(r25, r26, r27, r28, r29)
            X.AnonymousClass0mH.A00(r12, r11, r2)
        L_0x01d6:
            java.lang.CharSequence r3 = r6.A03
            boolean r2 = X.00l.A0W(r3)
            if (r2 == 0) goto L_0x033e
            r2 = r20
            r2.setVisibility(r7)
            r8.setVisibility(r7)
            r10.setVisibility(r0)
            r10.A02()
            r9.EBK(r10, r6)
        L_0x01ef:
            r2 = r32
            X.UZq r7 = r2.A00
            boolean r2 = r7.A0O
            if (r2 != 0) goto L_0x0335
            int r2 = r22.getWidth()
            if (r2 != 0) goto L_0x0304
            X.IDy r3 = new X.IDy
            r2 = r23
            r3.<init>(r2, r6, r1, r8)
            android.view.ViewTreeObserver r2 = r22.getViewTreeObserver()
            r2.addOnGlobalLayoutListener(r3)
        L_0x020b:
            r2 = 2131436275(0x7f0b22f3, float:1.8494416E38)
            android.view.View r15 = X.AnonymousClass7TE.A0b(r5, r2)
            r2 = 2131436274(0x7f0b22f2, float:1.8494414E38)
            android.view.View r10 = X.AnonymousClass7TE.A0b(r5, r2)
            X.0r1 r18 = new X.0r1
            r18.<init>()
            boolean r2 = r6.A05
            if (r2 == 0) goto L_0x0228
            r15.setVisibility(r0)
            r10.setVisibility(r0)
        L_0x0228:
            X.30J r9 = X.AnonymousClass30J.SECONDS
            if (r19 == 0) goto L_0x02f3
            long r2 = X.AnonymousClass30K.A03(r9, r0)
            r23 = 15
            X.Ixb r13 = new X.Ixb
            r22 = r13
            r24 = r31
            r25 = r32
            r26 = r1
            r27 = r8
            r28 = r6
            r22.<init>(r23, r24, r25, r26, r27, r28)
        L_0x0243:
            X.AnonymousClass0mH.A00(r8, r13, r2)
            long r2 = X.AnonymousClass30K.A03(r9, r4)
            r13 = 14
            X.Ixk r12 = new X.Ixk
            r14 = r21
            r16 = r6
            r17 = r10
            r19 = r32
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            X.AnonymousClass0mH.A00(r15, r12, r2)
            long r2 = X.AnonymousClass30K.A03(r9, r4)
            r9 = 16
            X.Ixb r8 = new X.Ixb
            r11 = r1
            r12 = r6
            r13 = r32
            r14 = r15
            r8.<init>(r9, r10, r11, r12, r13, r14)
            X.AnonymousClass0mH.A00(r10, r8, r2)
            r5.setVisibility(r0)
            boolean r3 = r6.A06
            X.TpO r1 = r7.A06
            java.lang.String r6 = "grid"
            if (r1 == 0) goto L_0x036e
            com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager r1 = r1.A02
            if (r1 == 0) goto L_0x02f1
            X.Tu0 r1 = r1.A06
            android.graphics.Rect r1 = r1.A00(r0)
            if (r1 == 0) goto L_0x02f1
            int r2 = r1.bottom
        L_0x0288:
            int r5 = r7.A00
            if (r5 != 0) goto L_0x02d8
            r7.A00 = r2
        L_0x028e:
            int r1 = r7.A00
            if (r2 <= r1) goto L_0x02d7
            boolean r1 = r7.A0M
            if (r1 != 0) goto L_0x02d7
            boolean r1 = r7.A0N
            if (r1 != 0) goto L_0x02d7
            X.TpO r1 = r7.A06
            if (r1 == 0) goto L_0x036e
            com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager r1 = r1.A02
            if (r1 == 0) goto L_0x02d7
            X.Tu0 r1 = r1.A06
            android.graphics.Rect r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x02d7
            int r0 = r0.bottom
            if (r0 == 0) goto L_0x02d7
            r5 = 130(0x82, double:6.4E-322)
            r7.A0M = r4
            int r0 = r7.A00
            android.animation.ValueAnimator r2 = X.JTQ.A05(r0, r2)
            r2.setDuration(r5)
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            r2.setInterpolator(r0)
            X.OeW r0 = new X.OeW
            r0.<init>(r4, r7, r3)
            r2.addListener(r0)
            r1 = 6
            X.W4K r0 = new X.W4K
            r0.<init>(r1, r2, r7)
            r2.addUpdateListener(r0)
            r2.start()
        L_0x02d7:
            return
        L_0x02d8:
            boolean r1 = r7.A0N
            if (r1 != 0) goto L_0x028e
            if (r3 == 0) goto L_0x02e9
            android.content.Context r1 = r7.requireContext()
            int r1 = X.AnonymousClass7TG.A03(r1)
            int r5 = r5 - r1
            r7.A00 = r5
        L_0x02e9:
            X.TpO r1 = r7.A06
            if (r1 == 0) goto L_0x036e
            r1.A04(r5, r2)
            goto L_0x028e
        L_0x02f1:
            r2 = 0
            goto L_0x0288
        L_0x02f3:
            long r2 = X.AnonymousClass30K.A03(r9, r4)
            r14 = 19
            X.PqU r13 = new X.PqU
            r12 = r31
            r11 = r32
            r13.<init>((int) r14, (java.lang.Object) r12, (java.lang.Object) r11, (java.lang.Object) r6)
            goto L_0x0243
        L_0x0304:
            int r11 = r22.getWidth()
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            boolean r2 = r9 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r2 == 0) goto L_0x033c
            android.view.ViewGroup$MarginLayoutParams r9 = (android.view.ViewGroup.MarginLayoutParams) r9
            int r10 = r9.getMarginStart()
        L_0x0316:
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            boolean r2 = r9 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r2 == 0) goto L_0x033a
            android.view.ViewGroup$MarginLayoutParams r9 = (android.view.ViewGroup.MarginLayoutParams) r9
            int r2 = r9.getMarginEnd()
        L_0x0324:
            int r10 = r10 + r2
            int r11 = r11 - r10
            android.content.res.Resources r9 = X.DbU.A05(r8)
            r2 = 2131972827(0x7f1352db, float:1.9582673E38)
            java.lang.String r2 = X.AnonymousClass7TF.A0d(r9, r2)
            android.text.SpannableStringBuilder r3 = r8.A00(r3, r2, r11)
        L_0x0335:
            r8.setText(r3)
            goto L_0x020b
        L_0x033a:
            r2 = 0
            goto L_0x0324
        L_0x033c:
            r10 = 0
            goto L_0x0316
        L_0x033e:
            r2 = r20
            r2.setVisibility(r0)
            r10.setVisibility(r7)
            r8.setVisibility(r0)
            r9.EBK(r8, r6)
            goto L_0x01ef
        L_0x034e:
            r8.setMaxLines(r12)
            goto L_0x00f2
        L_0x0353:
            int r2 = X.AnonymousClass7TG.A06(r21)
            goto L_0x00a3
        L_0x0359:
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r21)
            r2 = 2131626943(0x7f0e0bbf, float:1.8881136E38)
            android.view.View r5 = r3.inflate(r2, r8, r0)
            java.lang.String r2 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout"
            X.0qQ.A0C(r5, r2)
            r8.addView(r5)
            goto L_0x009e
        L_0x036e:
            X.0qQ.A0F(r6)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0376:
            java.lang.String r0 = "Unhandled type for Parallel HCM Model"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x037d:
            X.OMy r3 = r3.A00
            if (r3 == 0) goto L_0x0732
            java.lang.Integer r2 = r3.A01()
            int r2 = r2.intValue()
            switch(r2) {
                case 0: goto L_0x0393;
                case 1: goto L_0x0500;
                case 2: goto L_0x038c;
                case 3: goto L_0x0680;
                case 4: goto L_0x062f;
                case 5: goto L_0x0732;
                case 6: goto L_0x072b;
                case 7: goto L_0x0732;
                default: goto L_0x038c;
            }
        L_0x038c:
            java.lang.String r0 = "Unhandled type for SERP HCM Model"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0393:
            boolean r2 = r5.A08
            if (r2 == 0) goto L_0x0732
            X.OSw r7 = X.C70949OSw.A01
            X.Vit r2 = r5.A05
            X.0iw r13 = r5.A00
            com.instagram.common.session.UserSession r15 = r5.A02
            X.X47 r6 = r5.A04
            X.2t9 r14 = r5.A01
            X.AnonymousClass7TG.A1Q(r2, r13)
            r8 = 4
            X.0qQ.A0B(r15, r8)
            X.AnonymousClass7TG.A1S(r6, r14)
            X.OHT r12 = new X.OHT
            r16 = r3
            r17 = r1
            r18 = r6
            r19 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            X.NLn r9 = new X.NLn
            r9.<init>(r12)
            java.util.List r10 = r3.A08
            if (r10 != 0) goto L_0x0410
            boolean r10 = r3.A09
            if (r10 != 0) goto L_0x0410
            r3.A09 = r4
            X.OLm r4 = r3.A00()
            X.N2k r4 = r4.A00
            if (r4 == 0) goto L_0x04fc
            com.instagram.user.model.User r4 = r4.A04
            if (r4 == 0) goto L_0x04fc
            java.lang.String r12 = r4.getId()
        L_0x03d9:
            X.OLm r4 = r3.A00()
            X.N2k r4 = r4.A00
            if (r4 == 0) goto L_0x04f9
            int r11 = r4.A03
        L_0x03e3:
            X.Dbr r10 = new X.Dbr
            r10.<init>(r12)
            r4 = 0
            X.1NY r10 = X.AnonymousClass94C.A02(r15, r4, r10, r4)
            r4 = 2327(0x917, float:3.261E-42)
            java.lang.String r12 = X.C273654mx.A00(r4)
            java.lang.String r4 = "true"
            r10.A9m(r12, r4)
            java.lang.String r12 = "only_fetch_first_carousel_media"
            java.lang.String r4 = "false"
            r10.A9m(r12, r4)
            java.lang.String r4 = "count"
            r10.A0C(r4, r11)
            r10.A03()
            X.1OC r4 = r10.A0M()
            r4.A00 = r9
            X.1ES.A03(r4)
        L_0x0410:
            android.view.View r4 = r1.A01
            r4.setPadding(r0, r0, r0, r0)
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout r9 = r1.A0H
            r9.setStrokeWidth(r0)
            X.OLm r9 = r3.A00()
            X.N2k r9 = r9.A00
            if (r9 == 0) goto L_0x04ba
            com.instagram.user.model.User r9 = r9.A04
            if (r9 == 0) goto L_0x04ba
            com.instagram.common.ui.widget.imageview.IgImageView r11 = r1.A00()
            r10 = 8
            r11.setVisibility(r10)
            com.instagram.ui.widget.gradientspinner.GradientSpinner r11 = r1.A0G
            r11.setVisibility(r8)
            r11.A04()
            com.instagram.common.ui.widget.imageview.CircularImageView r8 = r1.A0A
            X.DbU.A1S(r13, r8, r9)
            com.instagram.common.ui.base.IgFrameLayout r10 = r1.A06
            android.view.ViewGroup$LayoutParams r12 = r10.getLayoutParams()
            r8 = -2
            r12.width = r8
            X.C66580MXl.A1B(r10, r8)
            X.1OP r8 = X.1OP.$redex_init_class
            com.instagram.model.reels.Reel r8 = X.AnonymousClass3PQ.A02(r15, r9)
            if (r8 == 0) goto L_0x046a
            r11.setVisibility(r0)
            r11.A02()
            r17 = 3
            X.OjF r0 = new X.OjF
            r16 = r0
            r18 = r3
            r20 = r15
            r21 = r9
            r22 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22)
            X.AnonymousClass0fU.A00(r0, r10)
        L_0x046a:
            java.lang.String r12 = r9.getUsername()
            java.lang.StringBuilder r8 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = r9.getFullName()
            r8.append(r0)
            java.lang.String r0 = r9.getFullName()
            java.lang.String r10 = ""
            boolean r0 = X.0qQ.A0K(r0, r10)
            if (r0 != 0) goto L_0x0496
            X.4Cl r0 = r9.A03
            java.lang.String r0 = r0.BxN()
            boolean r0 = X.0qQ.A0K(r0, r10)
            if (r0 != 0) goto L_0x0496
            java.lang.String r0 = " • "
            r8.append(r0)
        L_0x0496:
            X.4Cl r0 = r9.A03
            java.lang.String r0 = r0.BxN()
            java.lang.String r11 = X.AnonymousClass7TF.A0l(r0, r8)
            java.lang.String r10 = r3.A07
            X.Mnc r8 = r7.A00
            android.widget.TextView r7 = r1.A02
            r8.A03(r7, r12)
            android.widget.TextView r0 = r1.A03
            r8.A03(r0, r11)
            android.widget.TextView r0 = r1.A04
            r8.A03(r0, r10)
            boolean r0 = r9.isVerified()
            X.C244273av.A0C(r7, r0)
        L_0x04ba:
            r0 = 3
            X.C71409Ok8.A01(r4, r0, r3, r2)
            X.OLm r0 = r3.A00()
            X.N2k r0 = r0.A00
            if (r0 == 0) goto L_0x04f6
            float r7 = r0.A00
        L_0x04c8:
            X.OLm r0 = r3.A00()
            X.N2k r0 = r0.A00
            if (r0 == 0) goto L_0x04f3
            float r2 = r0.A01
        L_0x04d2:
            X.OLm r0 = r3.A00()
            X.N2k r0 = r0.A00
            if (r0 == 0) goto L_0x04f0
            float r0 = r0.A02
        L_0x04dc:
            r8 = r14
            r9 = r3
            r10 = r1
            r11 = r7
            r12 = r2
            r13 = r0
            X.C67421Mnc.A02(r8, r9, r10, r11, r12, r13)
            r6.EBK(r4, r3)
            X.0sP r2 = r5.A07
            androidx.recyclerview.widget.RecyclerView r0 = r1.A05
            r2.invoke(r0)
            return
        L_0x04f0:
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x04dc
        L_0x04f3:
            r2 = 1061158912(0x3f400000, float:0.75)
            goto L_0x04d2
        L_0x04f6:
            r7 = 1065353216(0x3f800000, float:1.0)
            goto L_0x04c8
        L_0x04f9:
            r11 = 6
            goto L_0x03e3
        L_0x04fc:
            java.lang.String r12 = ""
            goto L_0x03d9
        L_0x0500:
            X.OSx r9 = X.C70950OSx.A01
            X.Vit r8 = r5.A05
            X.0iw r6 = r5.A00
            com.instagram.common.session.UserSession r2 = r5.A02
            r17 = r2
            X.X47 r7 = r5.A04
            X.C51974G9v.A1M(r8, r6, r2)
            r2 = 5
            X.0qQ.A0B(r7, r2)
            X.OLm r2 = r3.A00()
            X.MWx r16 = r2.A00()
            X.O8z r2 = r3.A01
            r10 = 0
            if (r2 == 0) goto L_0x05f4
            java.lang.String r2 = r2.A00
            if (r2 == 0) goto L_0x05f4
            com.instagram.common.typedurl.SimpleImageUrl r2 = X.DbS.A0V(r2)
        L_0x0528:
            com.instagram.common.typedurl.SimpleImageUrl r12 = new com.instagram.common.typedurl.SimpleImageUrl
            r12.<init>(r2)
            java.lang.Integer r11 = X.AnonymousClass05K.A01
            java.lang.Integer r2 = r1.A00
            if (r2 == r11) goto L_0x0541
            r5 = 8
            com.instagram.common.ui.widget.imageview.CircularImageView r2 = r1.A09
            r2.setVisibility(r5)
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r2 = r1.A0F
            r2.setVisibility(r0)
            r1.A00 = r11
        L_0x0541:
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r1.A00()
            r2.setUrl(r12, r6)
        L_0x0548:
            java.lang.String r5 = r3.A03
            java.lang.String r12 = r3.A06
            java.lang.String r2 = r3.A07
            X.0qQ.A0B(r5, r4)
            X.Mnc r11 = r9.A00
            android.widget.TextView r13 = r1.A02
            r11.A03(r13, r5)
            android.widget.TextView r5 = r1.A03
            r11.A03(r5, r12)
            android.widget.TextView r12 = r1.A04
            r11.A03(r12, r2)
            android.view.View r9 = r1.A01
            r2 = 4
            X.C71409Ok8.A01(r9, r2, r3, r8)
            if (r16 == 0) goto L_0x05e7
            boolean r2 = r16.isExplicit()
            if (r2 != r4) goto L_0x05a7
            android.text.SpannableStringBuilder r14 = X.C51965G9l.A0E()
            android.content.Context r5 = r5.getContext()
            r2 = 2131239311(0x7f08218f, float:1.8094925E38)
            android.graphics.drawable.Drawable r8 = r5.getDrawable(r2)
            if (r8 == 0) goto L_0x05a7
            android.graphics.drawable.Drawable r15 = r8.mutate()
            if (r15 == 0) goto L_0x0590
            int r5 = X.DbV.A01(r5)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            r15.setColorFilter(r5, r2)
        L_0x0590:
            java.lang.String r2 = r3.A03
            r14.append(r2)
            java.lang.String r2 = " "
            r14.append(r2)
            X.AnonymousClass7TG.A13(r8)
            int r2 = r14.length()
            X.C263324Kh.A02(r8, r14, r2, r0, r0)
            r13.setText(r14)
        L_0x05a7:
            boolean r2 = r16.Cdd()
            if (r2 != r4) goto L_0x05e7
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout r2 = r1.A0H
            android.content.Context r13 = r2.getContext()
            r2 = 2131231393(0x7f0802a1, float:1.8078866E38)
            android.graphics.drawable.Drawable r8 = r13.getDrawable(r2)
            if (r8 == 0) goto L_0x05f2
            android.content.res.Resources r4 = r13.getResources()
            r2 = 2131165308(0x7f07007c, float:1.794483E38)
            int r5 = r4.getDimensionPixelSize(r2)
            r2 = 2130971412(0x7f040b14, float:1.7551562E38)
            int r4 = X.AnonymousClass7TF.A03(r13, r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            r8.setColorFilter(r4, r2)
            r8.setBounds(r0, r0, r5, r5)
        L_0x05d6:
            r12.setCompoundDrawables(r8, r10, r10, r10)
            android.content.res.Resources r2 = r13.getResources()
            r0 = 2131165217(0x7f070021, float:1.7944645E38)
            int r0 = r2.getDimensionPixelSize(r0)
            r12.setCompoundDrawablePadding(r0)
        L_0x05e7:
            java.util.List r2 = r3.A08
            r0 = r17
            r11.A04(r6, r0, r1, r2)
            r7.EBK(r9, r3)
            return
        L_0x05f2:
            r8 = r10
            goto L_0x05d6
        L_0x05f4:
            if (r16 == 0) goto L_0x05fc
            com.instagram.common.typedurl.ImageUrl r2 = r16.As5()
            goto L_0x0528
        L_0x05fc:
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r1.A00()
            android.content.Context r5 = r2.getContext()
            r2 = 2131231513(0x7f080319, float:1.807911E38)
            android.graphics.drawable.Drawable r12 = r5.getDrawable(r2)
            if (r12 == 0) goto L_0x062a
            java.lang.Integer r11 = X.AnonymousClass05K.A01
            java.lang.Integer r2 = r1.A00
            if (r2 == r11) goto L_0x0621
            r5 = 8
            com.instagram.common.ui.widget.imageview.CircularImageView r2 = r1.A09
            r2.setVisibility(r5)
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r2 = r1.A0F
            r2.setVisibility(r0)
            r1.A00 = r11
        L_0x0621:
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r1.A00()
            r2.setImageDrawable(r12)
            goto L_0x0548
        L_0x062a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x062f:
            X.OSz r12 = X.C70952OSz.A01
            X.Vit r10 = r5.A05
            X.0iw r9 = r5.A00
            com.instagram.common.session.UserSession r8 = r5.A02
            X.X47 r5 = r5.A04
            X.C51974G9v.A1M(r10, r9, r8)
            r0 = 5
            X.0qQ.A0B(r5, r0)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r1.A00()
            android.content.Context r2 = r0.getContext()
            r0 = 2131231393(0x7f0802a1, float:1.8078866E38)
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r0)
            if (r0 == 0) goto L_0x067b
            X.C67421Mnc.A01(r0, r1)
            java.lang.String r11 = r3.A03
            java.lang.String r7 = r3.A06
            java.lang.String r6 = r3.A07
            X.0qQ.A0B(r11, r4)
            X.Mnc r2 = r12.A00
            android.widget.TextView r0 = r1.A02
            r2.A03(r0, r11)
            android.widget.TextView r0 = r1.A03
            r2.A03(r0, r7)
            android.widget.TextView r0 = r1.A04
            r2.A03(r0, r6)
            android.view.View r4 = r1.A01
            r0 = 7
            X.C71409Ok8.A01(r4, r0, r3, r10)
            java.util.List r0 = r3.A08
            r2.A04(r9, r8, r1, r0)
            goto L_0x0722
        L_0x067b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0680:
            X.OSy r10 = X.C70951OSy.A01
            X.Vit r6 = r5.A05
            com.instagram.common.session.UserSession r12 = r5.A02
            X.X47 r5 = r5.A04
            r2 = 2
            X.C51973G9u.A0r(r2, r6, r12, r5)
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r1.A00()
            android.content.Context r7 = r2.getContext()
            r2 = 2131238503(0x7f081e67, float:1.8093287E38)
            android.graphics.drawable.Drawable r2 = r7.getDrawable(r2)
            if (r2 == 0) goto L_0x0726
            X.C67421Mnc.A01(r2, r1)
            java.lang.String r9 = r3.A03
            java.lang.String r8 = r3.A06
            java.lang.String r7 = r3.A07
            X.0qQ.A0B(r9, r4)
            X.Mnc r4 = r10.A00
            android.widget.TextView r2 = r1.A02
            r4.A03(r2, r9)
            android.widget.TextView r2 = r1.A03
            r4.A03(r2, r8)
            android.widget.TextView r2 = r1.A04
            r4.A03(r2, r7)
            android.view.View r4 = r1.A01
            r2 = 6
            X.C71409Ok8.A01(r4, r2, r3, r6)
            X.OLm r2 = r3.A00()
            X.UKm r2 = r2.A02
            if (r2 == 0) goto L_0x0722
            X.OEr r2 = r2.A02
            if (r2 == 0) goto L_0x0722
            java.util.List r2 = r2.A01
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x0722
            X.OLm r2 = r3.A00()
            X.UKm r11 = r2.A02
            double r7 = X.C14723U4m.A0p
            com.instagram.common.ui.base.IgFrameLayout r7 = r1.A08
            android.content.Context r9 = r7.getContext()
            X.Vuc r8 = new X.Vuc
            r8.<init>()
            r8.A0A = r0
            r8.A0E = r0
            java.lang.String r2 = "ig_hcm_map"
            r8.A06 = r2
            java.lang.String r2 = "HighConfidenceModuleViewBinder.kt"
            r8.A01(r2)
            X.U4m r10 = new X.U4m
            r10.<init>((android.content.Context) r9, (X.C18585Vuc) r8)
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout r2 = r1.A0H
            X.0nA.A0X(r2, r0)
            int r1 = X.C67421Mnc.A00(r1)
            float r2 = (float) r1
            r1 = 1082130432(0x40800000, float:4.0)
            float r2 = r2 / r1
            r1 = 1071877689(0x3fe38e39, float:1.7777778)
            float r2 = r2 * r1
            int r1 = (int) r2
            X.0nA.A0V(r7, r1)
            r7.addView(r10)
            r1 = 0
            r10.D6V(r1)
            r7.setVisibility(r0)
            X.WFR r9 = new X.WFR
            r13 = r3
            r14 = r6
            r9.<init>(r10, r11, r12, r13, r14)
            r10.A0G(r9)
        L_0x0722:
            r5.EBK(r4, r3)
            return
        L_0x0726:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x072b:
            java.lang.String r0 = "Threads HCM is not supported here. Must use Compose"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x0732:
            com.instagram.common.ui.base.IgFrameLayout r3 = r1.A07
            r2 = 8
            r3.setVisibility(r2)
            r3.setPadding(r0, r0, r0, r0)
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout r0 = r1.A0H
            r0.setVisibility(r2)
            return
        L_0x0742:
            java.lang.String r0 = "HighConfidenceModule not initialized"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NQ6.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return C69161Nfk.class;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        View A0A = DbU.A0A(layoutInflater, viewGroup, R.layout.layout_high_confidence_module, false);
        A0A.setTag(new C68048MzF(A0A));
        return new C68048MzF(A0A);
    }
}
