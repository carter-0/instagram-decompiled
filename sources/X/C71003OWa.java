package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerLinearLayout;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.List;

/* renamed from: X.OWa  reason: case insensitive filesystem */
public final class C71003OWa {
    public ViewGroup A00;
    public ViewGroup A01;
    public C69339Nje A02;
    public AnonymousClass7L0 A03;
    public C45275Cte A04;
    public List A05;
    public final Activity A06;
    public final LayoutInflater A07;
    public final View A08;
    public final AnonymousClass0iw A09;
    public final UserSession A0A;
    public final OL7 A0B;
    public final User A0C;
    public final String A0D;
    public final AnonymousClass0eM A0E;
    public final AnonymousClass0eM A0F;
    public final 0sK A0G;
    public final boolean A0H;

    public static final boolean A00(List list) {
        if (list == null) {
            return false;
        }
        C71814OrH orH = C71814OrH.A00;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (Object apply : list) {
                if (!orH.apply(apply)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void A01() {
        ViewGroup viewGroup = this.A00;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.A00 = null;
        }
        ViewGroup viewGroup2 = this.A01;
        if (viewGroup2 != null) {
            viewGroup2.removeAllViews();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01bb, code lost:
        if (r6 != null) goto L_0x01bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0219, code lost:
        if (X.AnonymousClass7TF.A1Z(r11.A0F) == false) goto L_0x021b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x034d, code lost:
        if (r41 != false) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0072, code lost:
        if (r41 == false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007c, code lost:
        if (r21.A0k != null) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x010d, code lost:
        if (r10.isEmpty() != false) goto L_0x00a4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.AnonymousClass9IV r34, X.C45275Cte r35, X.C254703su r36, java.util.List r37, boolean r38, boolean r39, boolean r40, boolean r41, boolean r42) {
        /*
            r33 = this;
            r11 = r33
            r10 = r37
            java.util.List r0 = r11.A05
            boolean r0 = X.0qQ.A0K(r10, r0)
            r19 = r35
            if (r0 == 0) goto L_0x0027
            r0 = r34
            if (r34 == 0) goto L_0x0027
            java.lang.Object r1 = r0.A01
            java.util.List r0 = r11.A05
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0027
            X.Cte r1 = r11.A04
            r0 = r19
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 == 0) goto L_0x0027
            return
        L_0x0027:
            android.view.ViewGroup r1 = r11.A01
            if (r1 != 0) goto L_0x0048
            android.view.View r1 = r11.A08
            r0 = 2131434829(0x7f0b1d4d, float:1.8491483E38)
            android.view.View r1 = r1.findViewById(r0)
            boolean r0 = r1 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x0113
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            r0 = 2131624987(0x7f0e041b, float:1.887717E38)
            android.view.View r1 = X.JTP.A0H(r1, r0)
            X.C66580MXl.A1R(r1)
        L_0x0044:
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
        L_0x0046:
            r11.A01 = r1
        L_0x0048:
            r3 = 0
            r21 = r36
            r9 = r41
            if (r41 != 0) goto L_0x0051
            if (r42 == 0) goto L_0x0074
        L_0x0051:
            boolean r0 = r1 instanceof android.widget.LinearLayout
            if (r0 == 0) goto L_0x0110
            if (r1 == 0) goto L_0x0110
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
        L_0x005b:
            boolean r0 = r1 instanceof android.widget.LinearLayout.LayoutParams
            if (r0 == 0) goto L_0x0072
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            if (r1 == 0) goto L_0x0072
            X.0eM r0 = r11.A0E
            int r0 = X.DbX.A07(r0)
            r1.topMargin = r0
            android.view.ViewGroup r0 = r11.A01
            if (r0 == 0) goto L_0x0072
            r0.setLayoutParams(r1)
        L_0x0072:
            if (r41 != 0) goto L_0x007e
        L_0x0074:
            if (r36 == 0) goto L_0x007e
            r0 = r21
            X.5Cg r0 = r0.A0k
            r29 = 0
            if (r0 == 0) goto L_0x0080
        L_0x007e:
            r29 = 1
        L_0x0080:
            android.view.ViewGroup r0 = r11.A01
            if (r0 == 0) goto L_0x065b
            r11.A01()
            r30 = r38
            r20 = r39
            r32 = r40
            if (r29 == 0) goto L_0x013d
            boolean r0 = A00(r10)
            if (r0 == 0) goto L_0x0106
            if (r37 == 0) goto L_0x0106
            X.OrI r2 = X.C71815OrI.A00
            boolean r0 = r10 instanceof java.util.Collection
            if (r0 == 0) goto L_0x00f2
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x00f2
        L_0x00a3:
            r10 = r3
        L_0x00a4:
            r0 = 1
        L_0x00a5:
            r14 = r0 ^ 1
            boolean r16 = A00(r10)
            android.view.ViewGroup r5 = r11.A01
            if (r5 == 0) goto L_0x022b
            android.view.ViewGroup r0 = r11.A00
            if (r0 != 0) goto L_0x022b
            android.view.LayoutInflater r2 = r11.A07
            r0 = 2131624989(0x7f0e041d, float:1.8877173E38)
            android.view.View r1 = r2.inflate(r0, r5)
            if (r1 == 0) goto L_0x022b
            r0 = 2131431661(0x7f0b10ed, float:1.8485058E38)
            android.view.View r12 = r1.findViewById(r0)
            android.view.ViewGroup r12 = (android.view.ViewGroup) r12
            if (r12 == 0) goto L_0x022b
            if (r38 == 0) goto L_0x00e2
            com.instagram.common.session.UserSession r4 = r11.A0A
            X.0Tu r3 = X.0Tu.A06
            r0 = 36329779737149767(0x8111be00004147, double:3.038437221830044E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 == 0) goto L_0x00e2
            android.app.Activity r1 = r11.A06
            r0 = 2131100052(0x7f060194, float:1.7812475E38)
            X.DbT.A16(r1, r12, r0)
        L_0x00e2:
            r0 = 2131624977(0x7f0e0411, float:1.8877149E38)
            android.view.View r6 = X.DbU.A08(r2, r0)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r11.A00 = r6
            java.lang.String r13 = "Required value was null."
            if (r6 == 0) goto L_0x0138
            goto L_0x011a
        L_0x00f2:
            java.util.Iterator r1 = r10.iterator()
        L_0x00f6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00a3
            java.lang.Object r0 = r1.next()
            boolean r0 = r2.apply(r0)
            if (r0 != 0) goto L_0x00f6
        L_0x0106:
            if (r37 == 0) goto L_0x00a4
            boolean r1 = r10.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x00a5
            goto L_0x00a4
        L_0x0110:
            r1 = r3
            goto L_0x005b
        L_0x0113:
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 != 0) goto L_0x0044
            r1 = 0
            goto L_0x0046
        L_0x011a:
            int r4 = r5.getPaddingStart()     // Catch:{ NotFoundException -> 0x01ea }
            r3 = 0
            int r1 = r5.getPaddingEnd()     // Catch:{ NotFoundException -> 0x01ea }
            android.content.res.Resources r5 = X.DbU.A05(r5)     // Catch:{ NotFoundException -> 0x01ea }
            r0 = 2131165196(0x7f07000c, float:1.7944602E38)
            if (r14 == 0) goto L_0x012f
            r0 = 2131165204(0x7f070014, float:1.7944619E38)
        L_0x012f:
            int r0 = r5.getDimensionPixelSize(r0)     // Catch:{ NotFoundException -> 0x01ea }
            r6.setPadding(r4, r3, r1, r0)     // Catch:{ NotFoundException -> 0x01ea }
            goto L_0x01f4
        L_0x0138:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r13)     // Catch:{ NotFoundException -> 0x01ea }
            throw r0     // Catch:{ NotFoundException -> 0x01ea }
        L_0x013d:
            if (r39 != 0) goto L_0x022b
            if (r40 != 0) goto L_0x022b
            android.view.ViewGroup r0 = r11.A00
            if (r0 != 0) goto L_0x022b
            android.view.LayoutInflater r8 = r11.A07
            r1 = 2131624981(0x7f0e0415, float:1.8877157E38)
            android.view.ViewGroup r0 = r11.A01
            android.view.View r7 = r8.inflate(r1, r0)
            if (r7 == 0) goto L_0x022b
            r0 = 2131434830(0x7f0b1d4e, float:1.8491485E38)
            android.view.View r6 = r7.findViewById(r0)
            r0 = 2131434831(0x7f0b1d4f, float:1.8491487E38)
            android.view.View r1 = r7.findViewById(r0)
            r13 = 0
            if (r42 == 0) goto L_0x01e5
            boolean r0 = r1 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x01e5
            com.instagram.user.model.User r0 = r11.A0C
            if (r0 == 0) goto L_0x01e5
            boolean r0 = r0.A1X()
            if (r0 != 0) goto L_0x01e5
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            android.view.View r1 = r1.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.ui.base.IgTextView"
            X.0qQ.A0C(r1, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r5 = 0
            r1.setVisibility(r5)
            android.content.res.Resources r4 = r1.getResources()
            r0 = 2131958586(0x7f131b3a, float:1.9553788E38)
            X.DbU.A1A(r4, r1, r0)
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r1.setGravity(r0)
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            boolean r0 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x01bb
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            if (r3 == 0) goto L_0x01bb
            r1 = 2131165184(0x7f070000, float:1.7944578E38)
            r0 = 2131165184(0x7f070000, float:1.7944578E38)
            int r12 = r4.getDimensionPixelSize(r1)
            r1 = 2131165207(0x7f070017, float:1.7944625E38)
            int r2 = r4.getDimensionPixelSize(r1)
            int r1 = r4.getDimensionPixelSize(r0)
            r0 = 2131165230(0x7f07002e, float:1.7944671E38)
            int r0 = r4.getDimensionPixelSize(r0)
            r3.setMargins(r12, r2, r1, r0)
        L_0x01bb:
            if (r6 == 0) goto L_0x01c0
        L_0x01bd:
            r6.setVisibility(r5)
        L_0x01c0:
            r0 = 2131431659(0x7f0b10eb, float:1.8485053E38)
            android.view.View r1 = X.AnonymousClass7TE.A0b(r7, r0)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r0 = 2131624977(0x7f0e0411, float:1.8877149E38)
            android.view.View r0 = r8.inflate(r0, r13)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r11.A00 = r0
            int r0 = r1.getChildCount()
            if (r0 <= 0) goto L_0x01dd
            r1.removeAllViews()
        L_0x01dd:
            android.view.ViewGroup r0 = r11.A00
            if (r0 == 0) goto L_0x022b
            r1.addView(r0)
            goto L_0x022b
        L_0x01e5:
            if (r6 == 0) goto L_0x01c0
            r5 = 8
            goto L_0x01bd
        L_0x01ea:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            java.lang.String r0 = "DirectInstantReplyController"
            X.0KC.A0C(r0, r1)
        L_0x01f4:
            android.view.ViewGroup r1 = r11.A00
            boolean r0 = r1 instanceof android.widget.LinearLayout
            if (r0 == 0) goto L_0x034d
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            if (r1 == 0) goto L_0x0202
            r0 = 1
            r1.setOrientation(r0)
        L_0x0202:
            if (r41 == 0) goto L_0x0351
            android.view.ViewGroup r1 = r11.A00
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.LinearLayout"
            X.0qQ.A0C(r1, r0)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0 = 8388613(0x800005, float:1.175495E-38)
            r1.setGravity(r0)
        L_0x0213:
            X.0eM r0 = r11.A0F
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 != 0) goto L_0x0351
        L_0x021b:
            int r0 = r12.getChildCount()
            if (r0 <= 0) goto L_0x0224
            r12.removeAllViews()
        L_0x0224:
            android.view.ViewGroup r0 = r11.A00
            if (r0 == 0) goto L_0x022b
            r12.addView(r0)
        L_0x022b:
            android.view.ViewGroup r0 = r11.A00
            if (r0 == 0) goto L_0x065b
            if (r10 == 0) goto L_0x0624
            if (r36 == 0) goto L_0x034a
            r0 = r21
            X.7AG r0 = r0.A0Q
            if (r0 == 0) goto L_0x034a
            java.lang.String r12 = r0.A05
        L_0x023b:
            java.util.Iterator r15 = r10.iterator()
            r7 = 0
        L_0x0240:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x04c9
            java.lang.Object r4 = r15.next()
            int r14 = r7 + 1
            if (r7 >= 0) goto L_0x0256
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0256:
            X.4ou r4 = (X.C274694ou) r4
            if (r4 == 0) goto L_0x04c9
            android.view.ViewGroup r6 = r11.A00
            java.lang.String r0 = "Required value was null."
            if (r6 == 0) goto L_0x04c4
            android.view.LayoutInflater r1 = r11.A07
            r0 = 2131624985(0x7f0e0419, float:1.8877165E38)
            r5 = 0
            android.view.View r3 = r1.inflate(r0, r6, r5)
            java.lang.String r1 = r4.A05
            X.0qQ.A07(r1)
            java.lang.String r2 = r4.A03
            if (r3 == 0) goto L_0x0347
            X.Oja r0 = new X.Oja
            r23 = r11
            r24 = r4
            r25 = r1
            r26 = r2
            r27 = r12
            r28 = r7
            r31 = r20
            r22 = r0
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            X.AnonymousClass0fU.A00(r0, r3)
            r0 = 2131434835(0x7f0b1d53, float:1.8491495E38)
            android.widget.TextView r0 = X.AnonymousClass7TE.A0d(r3, r0)
            if (r0 == 0) goto L_0x0297
            r0.setText(r1)
        L_0x0297:
            if (r42 == 0) goto L_0x02bb
            if (r0 == 0) goto L_0x02bb
            r13 = 1092616192(0x41200000, float:10.0)
            int r1 = r1.length()
            r8 = 2
            int r1 = r1 / r8
            float r2 = (float) r1
            float r2 = r2 * r13
            r1 = 1126629376(0x43270000, float:167.0)
            float r2 = java.lang.Math.max(r2, r1)
            android.content.res.Resources r1 = r0.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = android.util.TypedValue.applyDimension(r8, r2, r1)
            int r1 = (int) r1
            r0.setMaxWidth(r1)
        L_0x02bb:
            java.lang.String r1 = r4.A01
            java.lang.String r0 = "appointment_booking_cta"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x02e6
            boolean r0 = r11.A0H
            if (r0 == 0) goto L_0x02e6
            com.instagram.common.session.UserSession r8 = r11.A0A
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317036569170702(0x8106270000130e, double:3.030378391087465E-306)
            boolean r0 = X.182.A06(r2, r8, r0)
            if (r0 == 0) goto L_0x02e6
            if (r3 == 0) goto L_0x02e6
            r0 = 2131434834(0x7f0b1d52, float:1.8491493E38)
            android.view.View r0 = r3.findViewById(r0)
            if (r0 == 0) goto L_0x02e6
            r0.setVisibility(r5)
        L_0x02e6:
            r6.addView(r3)
            if (r29 == 0) goto L_0x0344
            java.lang.Boolean r0 = r4.A00
            if (r0 == 0) goto L_0x0344
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0344
            X.OL7 r6 = r11.A0B
            long r0 = (long) r7
            X.0wc r3 = r6.A01
            java.lang.String r2 = "igd_default_icebreaker_impression"
            X.0Aj r5 = X.AnonymousClass7TE.A0e(r3, r2)
            boolean r2 = r5.isSampled()
            if (r2 == 0) goto L_0x0344
            long r2 = r6.A00
            java.lang.Long r3 = java.lang.Long.valueOf(r2)
            java.lang.String r2 = "professional_igid"
            r5.A9F(r2, r3)
            com.instagram.common.session.UserSession r2 = r6.A02
            java.lang.String r2 = r2.A06
            java.lang.Long r3 = X.DbV.A0q(r2)
            java.lang.String r2 = "consumer_igid"
            r5.A9F(r2, r3)
            java.lang.String r6 = r4.A02
            java.lang.String r3 = ""
            if (r6 != 0) goto L_0x0325
            r6 = r3
        L_0x0325:
            java.lang.String r2 = "icebreaker_id"
            r5.AAJ(r2, r6)
            java.lang.String r6 = r4.A06
            if (r6 != 0) goto L_0x032f
            r6 = r3
        L_0x032f:
            java.lang.String r2 = "vertical"
            r5.AAJ(r2, r6)
            java.lang.String r2 = r4.A04
            if (r2 == 0) goto L_0x0339
            r3 = r2
        L_0x0339:
            java.lang.String r2 = "subvertical"
            r5.AAJ(r2, r3)
            X.C66581MXm.A1E(r5, r0)
            r5.Cgf()
        L_0x0344:
            r7 = r14
            goto L_0x0240
        L_0x0347:
            r0 = 0
            goto L_0x0297
        L_0x034a:
            r12 = 0
            goto L_0x023b
        L_0x034d:
            if (r41 == 0) goto L_0x0351
            goto L_0x0213
        L_0x0351:
            android.view.ViewGroup r1 = r11.A00
            if (r1 == 0) goto L_0x021b
            r0 = 2131624979(0x7f0e0413, float:1.8877153E38)
            r8 = 0
            android.view.View r7 = r2.inflate(r0, r1, r8)
            if (r7 == 0) goto L_0x021b
            android.view.ViewGroup r0 = r11.A00
            if (r0 == 0) goto L_0x05b5
            r0.addView(r7)
            com.instagram.user.model.User r0 = r11.A0C
            r18 = r0
            if (r0 == 0) goto L_0x021b
            android.content.res.Resources r6 = r7.getResources()
            r0 = 2131434831(0x7f0b1d4f, float:1.8491487E38)
            android.view.View r5 = r7.findViewById(r0)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 2131431662(0x7f0b10ee, float:1.848506E38)
            android.view.View r4 = r7.requireViewById(r0)
            r0 = 2131434841(0x7f0b1d59, float:1.8491507E38)
            android.widget.TextView r3 = X.DbU.A0G(r7, r0)
            r0 = 2131434837(0x7f0b1d55, float:1.84915E38)
            android.widget.TextView r15 = X.DbU.A0G(r7, r0)
            X.0qQ.A0A(r6)
            r13 = 0
            if (r16 == 0) goto L_0x039c
            r0 = 2131958889(0x7f131c69, float:1.9554403E38)
            java.lang.String r13 = r6.getString(r0)     // Catch:{ NotFoundException -> 0x03ab }
            goto L_0x03ab
        L_0x039c:
            r1 = 2131959587(0x7f131f23, float:1.9555819E38)
            java.lang.String r0 = r18.getUsername()     // Catch:{ NotFoundException -> 0x03ab }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ NotFoundException -> 0x03ab }
            java.lang.String r13 = r6.getString(r1, r0)     // Catch:{ NotFoundException -> 0x03ab }
        L_0x03ab:
            r17 = 1
            r1 = 2131960758(0x7f1323b6, float:1.9558194E38)
            java.lang.String r0 = r18.B8Q()     // Catch:{ NotFoundException -> 0x03bd }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ NotFoundException -> 0x03bd }
            java.lang.String r1 = r6.getString(r1, r0)     // Catch:{ NotFoundException -> 0x03bd }
            goto L_0x03be
        L_0x03bd:
            r1 = 0
        L_0x03be:
            if (r5 == 0) goto L_0x021b
            java.lang.String r16 = "DirectInstantReplyController"
            r2 = 8
            if (r35 == 0) goto L_0x040e
            if (r15 == 0) goto L_0x03cf
            r0 = r19
            java.lang.String r0 = r0.A01
            r15.setText(r0)
        L_0x03cf:
            if (r4 == 0) goto L_0x03d4
            r4.setVisibility(r8)
        L_0x03d4:
            if (r14 == 0) goto L_0x0414
            if (r4 == 0) goto L_0x03e4
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
        L_0x03dc:
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            if (r1 == 0) goto L_0x0403
            r0 = 2131165195(0x7f07000b, float:1.79446E38)
            goto L_0x03e6
        L_0x03e4:
            r1 = 0
            goto L_0x03dc
        L_0x03e6:
            int r15 = r6.getDimensionPixelSize(r0)     // Catch:{ NotFoundException -> 0x03f9 }
            r1.topMargin = r15     // Catch:{ NotFoundException -> 0x03f9 }
            if (r39 != 0) goto L_0x03f0
            if (r40 == 0) goto L_0x03f2
        L_0x03f0:
            r0 = 2131165184(0x7f070000, float:1.7944578E38)
        L_0x03f2:
            int r0 = r6.getDimensionPixelSize(r0)     // Catch:{ NotFoundException -> 0x03f9 }
            r1.bottomMargin = r0     // Catch:{ NotFoundException -> 0x03f9 }
            goto L_0x0403
        L_0x03f9:
            r0 = move-exception
            java.lang.String r15 = r0.getMessage()
            r0 = r16
            X.0KC.A0C(r0, r15)
        L_0x0403:
            if (r4 == 0) goto L_0x0408
            r4.setLayoutParams(r1)
        L_0x0408:
            if (r3 == 0) goto L_0x041c
            r3.setVisibility(r2)
            goto L_0x041c
        L_0x040e:
            if (r4 == 0) goto L_0x042f
            r4.setVisibility(r2)
            goto L_0x042f
        L_0x0414:
            if (r3 == 0) goto L_0x041c
            r3.setText(r1)
            r3.setVisibility(r8)
        L_0x041c:
            X.OL7 r4 = r11.A0B
            r0 = r19
            java.lang.String r0 = r0.A00
            if (r0 != 0) goto L_0x0426
            r17 = 0
        L_0x0426:
            java.lang.String r3 = "welcome_message_thread_impression"
            r1 = r17
            r0 = r20
            r4.A00(r3, r14, r1, r0)
        L_0x042f:
            if (r39 != 0) goto L_0x0433
            if (r40 == 0) goto L_0x044f
        L_0x0433:
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()     // Catch:{ NotFoundException -> 0x0445 }
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0     // Catch:{ NotFoundException -> 0x0445 }
            if (r0 == 0) goto L_0x0441
            int r1 = X.AnonymousClass7TE.A0B(r6)     // Catch:{ NotFoundException -> 0x0445 }
            r0.topMargin = r1     // Catch:{ NotFoundException -> 0x0445 }
        L_0x0441:
            r5.setLayoutParams(r0)     // Catch:{ NotFoundException -> 0x0445 }
            goto L_0x044f
        L_0x0445:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            r0 = r16
            X.0KC.A0C(r0, r1)
        L_0x044f:
            if (r41 == 0) goto L_0x0457
            r0 = 8388613(0x800005, float:1.175495E-38)
            r5.setGravity(r0)
        L_0x0457:
            if (r14 == 0) goto L_0x04b9
            r5.setVisibility(r8)
            if (r13 == 0) goto L_0x0461
            r5.setText(r13)
        L_0x0461:
            com.instagram.common.session.UserSession r3 = r11.A0A
            X.0Tu r4 = X.0Tu.A05
            r0 = 36314867610684266(0x81042e00000b6a, double:3.029006733006948E-306)
            boolean r0 = X.182.A06(r4, r3, r0)
            if (r0 == 0) goto L_0x021b
            X.7GH r1 = X.AnonymousClass7GF.A00(r3)
            java.lang.String r3 = r18.getId()
            int r0 = r3.length()
            if (r0 <= 0) goto L_0x04ae
            java.lang.String r0 = r1.A03
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x04ae
            r0 = 1
            r1.A06 = r0
            java.lang.String r0 = r11.A0D
            r1.A04 = r0
            r0 = 2131434157(0x7f0b1aad, float:1.849012E38)
            android.widget.TextView r3 = X.AnonymousClass7TG.A0R(r7, r0)
            r2 = 0
            if (r6 == 0) goto L_0x04a6
            r1 = 2131959447(0x7f131e97, float:1.9555535E38)
            java.lang.String r0 = r18.getUsername()     // Catch:{ NotFoundException -> 0x04a6 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ NotFoundException -> 0x04a6 }
            java.lang.String r2 = r6.getString(r1, r0)     // Catch:{ NotFoundException -> 0x04a6 }
        L_0x04a6:
            r3.setVisibility(r8)
            r3.setText(r2)
            goto L_0x021b
        L_0x04ae:
            r1.A01()
            r0 = 2131434157(0x7f0b1aad, float:1.849012E38)
            X.Dbb.A0t(r7, r0, r2)
            goto L_0x021b
        L_0x04b9:
            r5.setVisibility(r2)
            r0 = 2131434157(0x7f0b1aad, float:1.849012E38)
            X.Dbb.A0t(r7, r0, r2)
            goto L_0x021b
        L_0x04c4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x04c9:
            X.OL7 r2 = r11.A0B
            X.Nje r5 = r11.A02
            if (r29 == 0) goto L_0x055f
            if (r5 != 0) goto L_0x04d3
            X.Nje r5 = X.C69339Nje.A04
        L_0x04d3:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r30)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r32)
            X.0wc r1 = r2.A01
            java.lang.String r0 = "direct_thread_icebreaker_impression"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x0624
            X.N0d r7 = new X.N0d
            r7.<init>()
            long r0 = r2.A00
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "author_id"
            r7.A05(r0, r1)
            java.util.ArrayList r1 = X.C69995NvZ.A00(r10)
            java.lang.String r0 = "title"
            r7.A07(r0, r1)
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r8 = r10.iterator()
        L_0x050a:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0520
            java.lang.Object r0 = r8.next()
            X.4ou r0 = (X.C274694ou) r0
            if (r0 == 0) goto L_0x050a
            java.lang.String r0 = r0.A03
            if (r0 == 0) goto L_0x050a
            r1.add(r0)
            goto L_0x050a
        L_0x0520:
            java.lang.String r0 = "payload"
            r7.A07(r0, r1)
            X.NmG r1 = r5.A00
            java.lang.String r0 = "entry_point"
            r7.A01(r1, r0)
            int r0 = r10.size()
            java.lang.Long r1 = X.DbS.A0j(r0)
            java.lang.String r0 = "size"
            r7.A05(r0, r1)
            java.lang.String r0 = "automated_message"
            r3.AAK(r7, r0)
            X.N0e r5 = new X.N0e
            r5.<init>()
            java.lang.String r1 = r2.A03
            java.lang.String r0 = "id"
            r5.A06(r0, r1)
            java.lang.String r0 = "thread"
            r3.AAK(r5, r0)
            r0 = 769(0x301, float:1.078E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r3.A7p(r0, r6)
            java.lang.String r0 = "is_ctd_ib_override"
            r3.A7p(r0, r4)
            goto L_0x0621
        L_0x055f:
            if (r5 != 0) goto L_0x0563
            X.Nje r5 = X.C69339Nje.A06
        L_0x0563:
            if (r36 == 0) goto L_0x05b3
            r0 = r21
            X.7AG r0 = r0.A0Q
            if (r0 == 0) goto L_0x05b3
            java.lang.String r6 = r0.A05
        L_0x056d:
            r7 = 0
            X.0wc r1 = r2.A01
            java.lang.String r0 = "direct_thread_quickreply_impression"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x0624
            X.N0h r4 = new X.N0h
            r4.<init>()
            long r0 = r2.A00
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "author_id"
            r4.A05(r0, r1)
            java.util.ArrayList r1 = X.C69995NvZ.A00(r10)
            java.lang.String r0 = "title"
            r4.A07(r0, r1)
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r1 = r10.iterator()
        L_0x059d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x05ba
            java.lang.Object r0 = r1.next()
            X.4ou r0 = (X.C274694ou) r0
            if (r0 == 0) goto L_0x059d
            java.lang.String r0 = r0.A03
            if (r0 == 0) goto L_0x059d
            r8.add(r0)
            goto L_0x059d
        L_0x05b3:
            r6 = 0
            goto L_0x056d
        L_0x05b5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r13)
            throw r0
        L_0x05ba:
            java.lang.String r0 = "payload"
            r4.A07(r0, r8)
            X.NmG r1 = r5.A00
            java.lang.String r0 = "entry_point"
            r4.A01(r1, r0)
            int r0 = r10.size()
            java.lang.Long r1 = X.DbS.A0j(r0)
            java.lang.String r0 = "size"
            r4.A05(r0, r1)
            X.N0i r5 = new X.N0i
            r5.<init>()
            java.lang.String r1 = r2.A03
            java.lang.String r0 = "id"
            r5.A06(r0, r1)
            boolean r0 = X.AnonymousClass7TE.A1b(r10)
            if (r0 == 0) goto L_0x0617
            java.lang.Object r0 = r10.get(r7)
            X.4ou r0 = (X.C274694ou) r0
            if (r0 == 0) goto L_0x0661
            java.lang.String r1 = r0.A03
        L_0x05ef:
            java.lang.String r0 = "ai_bot_quick_reply_payload"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0617
            r0 = 38
            java.lang.String r2 = "type"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.util.Map r0 = r4.A00
            r0.put(r2, r1)
            java.lang.String r0 = "prev_bot_response_id"
            r4.A06(r0, r6)
            java.util.ArrayList r1 = X.C69995NvZ.A00(r10)
            java.lang.String r0 = "item_ids"
            r4.A07(r0, r1)
            X.XSV r0 = X.XSV.A02
            r5.A01(r0, r2)
        L_0x0617:
            java.lang.String r0 = "automated_message"
            r3.AAK(r4, r0)
            java.lang.String r0 = "thread"
            r3.AAK(r5, r0)
        L_0x0621:
            r3.Cgf()
        L_0x0624:
            if (r41 != 0) goto L_0x0628
            if (r42 == 0) goto L_0x0641
        L_0x0628:
            if (r10 == 0) goto L_0x0641
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x0641
            com.instagram.common.session.UserSession r0 = r11.A0A
            X.7I6 r0 = X.AnonymousClass7I4.A00(r0)
            int r2 = X.AnonymousClass7I6.A00(r0)
            java.lang.String r1 = "icebreakers_rendered"
            X.02m r0 = r0.A06
            r0.markerPoint(r2, r1)
        L_0x0641:
            r11.A05 = r10
            r0 = r19
            r11.A04 = r0
            android.view.ViewGroup r1 = r11.A01
            if (r1 == 0) goto L_0x0654
            r0 = 2131434835(0x7f0b1d53, float:1.8491495E38)
            android.view.View r0 = r1.findViewById(r0)
            if (r0 != 0) goto L_0x065b
        L_0x0654:
            X.Cte r0 = r11.A04
            if (r0 != 0) goto L_0x065b
            r11.A01()
        L_0x065b:
            X.7L0 r0 = r11.A03
            r11.A03(r0, r9)
            return
        L_0x0661:
            r1 = 0
            goto L_0x05ef
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71003OWa.A02(X.9IV, X.Cte, X.3su, java.util.List, boolean, boolean, boolean, boolean, boolean):void");
    }

    public final void A03(AnonymousClass7L0 r4, boolean z) {
        if (r4 != null) {
            this.A03 = r4;
            ViewGroup viewGroup = this.A00;
            if (viewGroup != null) {
                if (z) {
                    viewGroup.setBackgroundColor(r4.A02);
                }
                0kx r2 = new 0kx(viewGroup);
                while (r2.hasNext()) {
                    View view = (View) r2.next();
                    if (view instanceof RoundedCornerLinearLayout) {
                        view.setBackgroundColor(r4.A04);
                    }
                }
            }
        }
    }

    public final void A04(boolean z, boolean z2) {
        C45275Cte cte = this.A04;
        if (cte != null) {
            this.A0B.A00("welcome_message_thread_first_message_sent", z, AnonymousClass7TF.A1V(cte.A00), z2);
        }
    }

    public C71003OWa(Activity activity, LayoutInflater layoutInflater, View view, AnonymousClass0iw r6, UserSession userSession, User user, String str, 0sK r10, boolean z) {
        String str2;
        C51972G9s.A1D(layoutInflater, userSession);
        AnonymousClass7TF.A1G(r6, 7, r10);
        this.A06 = activity;
        this.A08 = view;
        this.A07 = layoutInflater;
        this.A0A = userSession;
        this.A0C = user;
        this.A09 = r6;
        this.A0H = z;
        this.A0G = r10;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        this.A0D = str2;
        this.A0B = new OL7(r6, userSession, str, DbX.A0r(user));
        this.A0F = AnonymousClass1YB.A00(new C73918Ply(this, 6));
        this.A0E = AnonymousClass1YB.A00(new C73918Ply(this, 5));
    }
}
