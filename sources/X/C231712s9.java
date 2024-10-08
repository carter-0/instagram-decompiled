package X;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.instagram.android.R;
import com.instagram.api.schemas.SuggestedUsersStyle;
import com.instagram.common.session.UserSession;
import com.instagram.util.recyclerview.GridLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1;
import com.instagram.util.recyclerview.LinearLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1;

/* renamed from: X.2s9  reason: invalid class name and case insensitive filesystem */
public final class C231712s9 extends C231632rz {
    public C252553pI A00;
    public C2363633l A01;
    public C2357130x A02;
    public 1wn A03;
    public final Context A04;
    public final UserSession A05;
    public final C229992ok A06;
    public final C231722sA A07;
    public final Fragment A08;
    public final AnonymousClass0iw A09;
    public final C229992ok A0A;
    public final C230022on A0B;
    public final Integer A0C;

    public C231712s9(Context context, Fragment fragment, AnonymousClass0iw r4, UserSession userSession, C229992ok r6, C229992ok r7, C230022on r8, Integer num, boolean z) {
        0qQ.A0B(context, 1);
        0qQ.A0B(fragment, 2);
        0qQ.A0B(r6, 4);
        0qQ.A0B(r8, 5);
        0qQ.A0B(num, 8);
        this.A04 = context;
        this.A08 = fragment;
        this.A05 = userSession;
        this.A06 = r6;
        this.A0B = r8;
        this.A0A = r7;
        this.A09 = r4;
        this.A0C = num;
        this.A07 = new C231722sA(context, userSession);
        C231732sB.A00 = z;
    }

    public final String getBinderGroupName() {
        return "SuggestedUsers";
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        0qQ.A0B(obj, 1);
        String str = ((AnonymousClass3UH) obj).A0F;
        if (str == null) {
            str = "";
        }
        if (str.length() == 0) {
            return str.hashCode();
        }
        return obj.hashCode();
    }

    public final int getViewTypeCount() {
        return 4;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0340: MOVE  (r1v26 X.MvF) = (r1v24 X.MvF)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x024c  */
    public final void bindView(int r36, android.view.View r37, java.lang.Object r38, java.lang.Object r39) {
        /*
            r35 = this;
            r11 = r39
            r7 = r38
            r0 = -1369753895(0xffffffffae5b36d9, float:-4.984355E-11)
            int r17 = X.AnonymousClass0fD.A03(r0)
            r10 = 1
            r34 = r37
            r0 = r34
            X.0qQ.A0B(r0, r10)
            r14 = 2
            X.0qQ.A0B(r7, r14)
            r13 = 3
            X.0qQ.A0B(r11, r13)
            r8 = r35
            r1 = r36
            if (r36 == 0) goto L_0x009d
            if (r1 == r10) goto L_0x0047
            if (r1 == r14) goto L_0x0047
            if (r1 != r13) goto L_0x0440
            X.33l r3 = r8.A01
            if (r3 == 0) goto L_0x0033
            com.instagram.common.session.UserSession r2 = r8.A05
            r1 = r7
            X.3UH r1 = (X.AnonymousClass3UH) r1
            r3.A01(r0, r2, r1, r11)
        L_0x0033:
            X.2ok r9 = r8.A06
            X.3UH r7 = (X.AnonymousClass3UH) r7
        L_0x0037:
            X.3O9 r7 = (X.AnonymousClass3O9) r7
        L_0x0039:
            r0 = r34
            r9.EBq(r0, r7)
        L_0x003e:
            r1 = 1806106058(0x6ba6fdca, float:4.0376034E26)
            r0 = r17
            X.AnonymousClass0fD.A0A(r1, r0)
            return
        L_0x0047:
            java.lang.Object r6 = r34.getTag()
            if (r6 == 0) goto L_0x003e
            X.2ok r9 = r8.A0A
            android.content.Context r5 = r8.A04
            androidx.fragment.app.Fragment r4 = r8.A08
            com.instagram.common.session.UserSession r3 = r8.A05
            X.OEG r6 = (X.OEG) r6
            if (r9 == 0) goto L_0x007a
            r2 = r7
            X.3UH r2 = (X.AnonymousClass3UH) r2
            X.4aa r11 = (X.C266934aa) r11
            X.2sA r1 = r8.A07
            java.lang.Integer r0 = r8.A0C
            r20 = r3
            r21 = r9
            r22 = r6
            r23 = r1
            r24 = r11
            r25 = r2
            r26 = r0
            r18 = r5
            r19 = r4
            X.C70284O0o.A00(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            X.3O9 r7 = (X.AnonymousClass3O9) r7
            goto L_0x0039
        L_0x007a:
            X.2ok r9 = r8.A06
            r2 = r7
            X.3UH r2 = (X.AnonymousClass3UH) r2
            X.4aa r11 = (X.C266934aa) r11
            X.2sA r1 = r8.A07
            java.lang.Integer r0 = r8.A0C
            r20 = r3
            r21 = r9
            r22 = r6
            r23 = r1
            r24 = r11
            r25 = r2
            r26 = r0
            r18 = r5
            r19 = r4
            X.C70284O0o.A00(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            X.3O9 r7 = (X.AnonymousClass3O9) r7
            goto L_0x0039
        L_0x009d:
            java.lang.Object r6 = r34.getTag()
            if (r6 == 0) goto L_0x003e
            X.3Yz r6 = (X.C243493Yz) r6
            r5 = r7
            X.3UH r5 = (X.AnonymousClass3UH) r5
            X.30x r12 = r8.A02
            if (r12 == 0) goto L_0x0384
            android.content.Context r4 = r8.A04
            androidx.fragment.app.Fragment r0 = r8.A08
            r20 = r0
            com.instagram.common.session.UserSession r3 = r8.A05
            X.2ok r0 = r8.A06
            r24 = r0
            X.4aa r11 = (X.C266934aa) r11
            X.2sA r0 = r8.A07
            r25 = r0
            X.0iw r2 = r8.A09
            X.2on r0 = r8.A0B
            r18 = r0
            java.lang.Integer r1 = r8.A0C
            r9 = 0
            X.0qQ.A0B(r4, r9)
            r0 = r20
            X.0qQ.A0B(r0, r10)
            X.0qQ.A0B(r3, r14)
            X.0qQ.A0B(r6, r13)
            r13 = 4
            r0 = r24
            X.0qQ.A0B(r0, r13)
            r0 = 6
            X.0qQ.A0B(r5, r0)
            r0 = 7
            X.0qQ.A0B(r11, r0)
            r14 = 8
            r0 = r25
            X.0qQ.A0B(r0, r14)
            r0 = 9
            X.0qQ.A0B(r2, r0)
            r2 = 10
            r0 = r18
            X.0qQ.A0B(r0, r2)
            r0 = 11
            X.0qQ.A0B(r1, r0)
            android.view.View r0 = r6.A02
            r33 = r0
            boolean r0 = r11.A06
            r1 = 8
            if (r0 == 0) goto L_0x0106
            r1 = 0
        L_0x0106:
            r0 = r33
            r0.setVisibility(r1)
            java.lang.String r13 = r5.A0K
            if (r13 == 0) goto L_0x0143
            int r0 = r13.length()
            if (r0 == 0) goto L_0x0143
            X.1Av r0 = X.1Au.A00(r3)
            X.0xa r1 = r0.A01
            java.lang.String r0 = "show_suggestion_netego_unit_type_in_header"
            boolean r0 = r1.getBoolean(r0, r9)
            if (r0 == 0) goto L_0x013e
            java.lang.String r2 = " ("
            X.1UQ r0 = r5.A05
            if (r0 != 0) goto L_0x012b
            X.1UQ r0 = X.1UQ.A0v
        L_0x012b:
            java.lang.String r1 = r0.name()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r0)
            X.0qQ.A07(r1)
            r0 = 41
            java.lang.String r13 = X.002.A0h(r13, r2, r1, r0)
        L_0x013e:
            android.widget.TextView r0 = r6.A07
            r0.setText(r13)
        L_0x0143:
            java.lang.String r0 = r5.A0J
            android.widget.TextView r2 = r6.A06
            r2.setText(r0)
            if (r0 == 0) goto L_0x0153
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x0155
        L_0x0153:
            r0 = 8
        L_0x0155:
            r2.setVisibility(r0)
            android.widget.TextView r2 = r6.A04
            boolean r0 = r11.A0A
            if (r0 == 0) goto L_0x0163
            boolean r1 = r11.A0B
            r0 = 0
            if (r1 == 0) goto L_0x0164
        L_0x0163:
            r0 = 4
        L_0x0164:
            r2.setVisibility(r0)
            androidx.constraintlayout.widget.ConstraintLayout r1 = r6.A08
            boolean r15 = r11.A0B
            r0 = 8
            if (r15 == 0) goto L_0x0170
            r0 = 0
        L_0x0170:
            r1.setVisibility(r0)
            android.view.View r0 = r6.A01
            r32 = r0
            boolean r0 = r11.A0B
            r15 = 0
            if (r0 == 0) goto L_0x017e
            r15 = 8
        L_0x017e:
            r0 = r32
            r0.setVisibility(r15)
            java.lang.String r15 = r5.A0A
            if (r15 == 0) goto L_0x0195
            int r0 = r15.length()
            if (r0 == 0) goto L_0x0195
            r2.setText(r15)
            android.widget.TextView r0 = r6.A03
            r0.setText(r15)
        L_0x0195:
            r16 = 0
            r0 = 2131100375(0x7f0602d7, float:1.781313E38)
            int r0 = X.1QE.A00(r0)
            int r0 = r4.getColor(r0)
            r2.setTextColor(r0)
            X.5jo r15 = new X.5jo
            r0 = r24
            r15.<init>(r0, r6, r5)
            X.AnonymousClass0fU.A00(r15, r2)
            X.AnonymousClass0fU.A00(r15, r1)
            boolean r0 = r5.A0R
            if (r0 == 0) goto L_0x0273
            com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r1 = r6.A09
            r1.setVisibility(r9)
            X.IBE r0 = new X.IBE
            r0.<init>(r11, r5, r12)
            X.AnonymousClass0fU.A00(r0, r1)
            boolean r0 = r11.A0A
            if (r0 == 0) goto L_0x01fd
            boolean r0 = r11.A0B
            if (r0 != 0) goto L_0x01fd
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            java.lang.String r0 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"
            X.0qQ.A0C(r1, r0)
            X.2dQ r1 = (X.C71492dQ) r1
            r0 = -1
            r1.A0M = r0
            r0 = 2131436842(0x7f0b252a, float:1.8495566E38)
            r1.A0r = r0
            r2.setLayoutParams(r1)
            int r12 = r2.getPaddingTop()
            int r1 = r2.getPaddingEnd()
            int r0 = r2.getPaddingBottom()
            r2.setPaddingRelative(r9, r12, r1, r0)
            if (r13 == 0) goto L_0x026d
            int r0 = r13.length()
            if (r0 == 0) goto L_0x026d
            android.widget.TextView r0 = r6.A05
            r0.setVisibility(r9)
        L_0x01fd:
            X.1UQ r1 = r5.A05
            if (r1 != 0) goto L_0x0203
            X.1UQ r1 = X.1UQ.A0v
        L_0x0203:
            java.lang.String r12 = r5.A0B
            X.1UQ r2 = X.1UQ.A0v
            if (r1 == r2) goto L_0x0252
            X.1UQ r0 = X.1UQ.A0r
            if (r1 == r0) goto L_0x0252
            X.1UQ r0 = X.1UQ.A0n
            if (r1 != r0) goto L_0x024f
            if (r12 == 0) goto L_0x024f
        L_0x0213:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            java.lang.String r1 = "large"
            boolean r1 = X.0qQ.A0K(r12, r1)
            if (r1 != 0) goto L_0x0233
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            java.lang.String r1 = "medium_large"
            boolean r1 = X.0qQ.A0K(r12, r1)
            if (r1 != 0) goto L_0x0233
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            java.lang.String r1 = "medium"
            boolean r1 = X.0qQ.A0K(r12, r1)
            if (r1 != 0) goto L_0x0233
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
        L_0x0233:
            java.lang.Integer r13 = X.AnonymousClass05K.A00
            if (r0 != r13) goto L_0x024c
            int r1 = X.0nA.A09(r4)
            float r1 = (float) r1
            float r1 = X.0nA.A01(r4, r1)
            int r12 = (int) r1
            r1 = 320(0x140, float:4.48E-43)
            if (r12 > r1) goto L_0x024c
            java.lang.Integer r0 = X.AnonymousClass05K.A01
        L_0x0247:
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            if (r0 != r1) goto L_0x02ed
            goto L_0x02ac
        L_0x024c:
            if (r0 == r13) goto L_0x02ac
            goto L_0x0247
        L_0x024f:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            goto L_0x0233
        L_0x0252:
            X.0Tu r14 = X.0Tu.A05
            r0 = 36893515669636054(0x831275000103d6, double:3.3949460955167703E-306)
            java.lang.String r13 = X.182.A04(r14, r3, r0)
            boolean r13 = X.00l.A0W(r13)
            if (r13 == 0) goto L_0x0268
            if (r12 != 0) goto L_0x0213
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x0233
        L_0x0268:
            java.lang.String r12 = X.182.A04(r14, r3, r0)
            goto L_0x0213
        L_0x026d:
            android.widget.TextView r0 = r6.A05
            r0.setVisibility(r14)
            goto L_0x01fd
        L_0x0273:
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
            int r13 = r1.getDimensionPixelSize(r0)
            int r12 = r2.getPaddingTop()
            int r1 = r2.getPaddingEnd()
            int r0 = r2.getPaddingBottom()
            r2.setPaddingRelative(r13, r12, r1, r0)
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            java.lang.String r0 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"
            X.0qQ.A0C(r1, r0)
            X.2dQ r1 = (X.C71492dQ) r1
            r1.A0M = r9
            r0 = -1
            r1.A0r = r0
            r2.setLayoutParams(r1)
            com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r1 = r6.A09
            r1.setVisibility(r14)
            r0 = r16
            r1.setOnClickListener(r0)
            goto L_0x01fd
        L_0x02ac:
            com.instagram.ui.recyclerpager.HorizontalRecyclerPager r12 = r6.A0A     // Catch:{ IllegalStateException -> 0x02b4 }
            X.3V7 r1 = r6.A00     // Catch:{ IllegalStateException -> 0x02b4 }
            r12.A12(r1)     // Catch:{ IllegalStateException -> 0x02b4 }
            goto L_0x02bb
        L_0x02b4:
            java.lang.String r12 = "SuggestedUsersRowViewBinder"
            java.lang.String r1 = "item decoration not in recyclerview"
            X.0wb.A03(r12, r1)
        L_0x02bb:
            android.content.res.Resources r14 = r4.getResources()
            r1 = 2131165196(0x7f07000c, float:1.7944602E38)
            int r15 = r14.getDimensionPixelSize(r1)
            r1 = 2131165231(0x7f07002f, float:1.7944673E38)
            int r12 = r14.getDimensionPixelSize(r1)
            com.instagram.ui.recyclerpager.HorizontalRecyclerPager r13 = r6.A0A
            X.0nA.A0Z(r13, r15)
            X.0nA.A0b(r13, r15)
            r1 = r33
            X.0nA.A0Z(r1, r12)
            r13.A01 = r15
            r1 = 2131165195(0x7f07000b, float:1.79446E38)
            int r12 = r14.getDimensionPixelSize(r1)
            X.3V7 r1 = new X.3V7
            r1.<init>(r12, r12)
            r6.A00 = r1
            r13.A11(r1)
        L_0x02ed:
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            if (r0 == r1) goto L_0x0301
            android.view.ViewGroup$LayoutParams r13 = r32.getLayoutParams()
            android.content.res.Resources r12 = r4.getResources()
            r1 = 2131165184(0x7f070000, float:1.7944578E38)
            int r1 = r12.getDimensionPixelSize(r1)
            r13.height = r1
        L_0x0301:
            X.1UQ r1 = r5.A05
            if (r1 == 0) goto L_0x0307
            if (r1 != r2) goto L_0x043c
        L_0x0307:
            X.0Tu r1 = X.0Tu.A06
            r12 = 36312913400563236(0x81026700000624, double:3.027770882657436E-306)
            boolean r12 = X.182.A06(r1, r3, r12)
            if (r12 == 0) goto L_0x043c
            r30 = 1
            r12 = 36312913401021989(0x81026700070625, double:3.027770882947553E-306)
            boolean r1 = X.182.A06(r1, r3, r12)
            r31 = 1
            if (r1 != 0) goto L_0x0325
        L_0x0323:
            r31 = 0
        L_0x0325:
            X.1UQ r1 = r5.A05
            if (r1 == 0) goto L_0x032b
            if (r1 != r2) goto L_0x03d5
        L_0x032b:
            X.0Tu r12 = X.0Tu.A06
            r1 = 36316577007669762(0x8105bc00001202, double:3.0300877625437646E-306)
            boolean r1 = X.182.A06(r12, r3, r1)
            if (r1 == 0) goto L_0x03d5
            com.instagram.ui.recyclerpager.HorizontalRecyclerPager r2 = r6.A0A
            X.2Rw r1 = r2.A0A
            boolean r0 = r1 instanceof X.C67811MvF
            if (r0 == 0) goto L_0x03b0
            X.MvF r1 = (X.C67811MvF) r1
            if (r1 == 0) goto L_0x03b0
            boolean r0 = r11.A08
            if (r0 != 0) goto L_0x03aa
            X.3UH r0 = r1.A01
            boolean r0 = X.0qQ.A0K(r0, r5)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x03aa
            r1.notifyDataSetChanged()
            int r1 = r5.A00
            r0 = -1
            if (r1 == r0) goto L_0x035f
            r2.A0o(r1)
            r5.A00 = r0
        L_0x035f:
            X.0Tu r9 = X.0Tu.A05
            r0 = 36325484769850347(0x810dd6000033eb, double:3.035721067215446E-306)
            boolean r0 = X.182.A06(r9, r3, r0)
            if (r0 == 0) goto L_0x0384
            r0 = 2130970269(0x7f04069d, float:1.7549243E38)
            int r0 = X.2Yu.A0H(r4, r0)
            int r1 = r4.getColor(r0)
            r0 = r33
            r0.setBackgroundColor(r1)
            r2.setBackgroundColor(r1)
            r0 = r32
            r0.setBackgroundColor(r1)
        L_0x0384:
            java.lang.String r1 = r5.A0H
            if (r1 == 0) goto L_0x03a6
            java.lang.String r0 = "middle_state"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x03a6
            X.1wn r0 = r8.A03
            if (r0 != 0) goto L_0x03a6
            X.INw r2 = new X.INw
            r2.<init>(r6)
            r8.A03 = r2
            com.instagram.common.session.UserSession r0 = r8.A05
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r0)
            java.lang.Class<X.INd> r0 = X.C57063INd.class
            r1.A01(r2, r0)
        L_0x03a6:
            X.2ok r9 = r8.A06
            goto L_0x0037
        L_0x03aa:
            r11.A08 = r9
            r1.A00(r5)
            goto L_0x035f
        L_0x03b0:
            r24.DpN()
            X.MvF r11 = new X.MvF
            r1 = r18
            r0 = r24
            r11.<init>(r4, r3, r0, r1)
            r11.A00(r5)
            r2.setAdapter(r11)
            r14 = 10
            X.8gZ r0 = new X.8gZ
            r13 = r9
            r15 = r14
            r16 = r9
            r12 = r9
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16)
            r2.A11(r0)
            r2.A05 = r10
            goto L_0x035f
        L_0x03d5:
            com.instagram.ui.recyclerpager.HorizontalRecyclerPager r2 = r6.A0A
            X.2Rw r1 = r2.A0A
            boolean r10 = r1 instanceof X.C292975jp
            if (r10 == 0) goto L_0x0403
            X.5jp r1 = (X.C292975jp) r1
            if (r1 == 0) goto L_0x0403
            boolean r0 = r11.A08
            if (r0 != 0) goto L_0x03fd
            X.3UH r0 = r1.A03
            boolean r0 = X.0qQ.A0K(r0, r5)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x03fd
            r1.notifyDataSetChanged()
        L_0x03f2:
            boolean r0 = r11.A07
            if (r0 != 0) goto L_0x035f
            int r0 = r11.A03
            r2.A0o(r0)
            goto L_0x035f
        L_0x03fd:
            r11.A08 = r9
            r1.A02(r5)
            goto L_0x03f2
        L_0x0403:
            r24.DpN()
            androidx.fragment.app.FragmentActivity r19 = r20.requireActivity()
            android.content.Context r12 = r20.requireContext()
            X.0gy r9 = X.AnonymousClass07i.A00(r20)
            X.2lw r10 = new X.2lw
            r1 = r16
            r10.<init>(r12, r9, r1)
            X.5jq r9 = new X.5jq
            r9.<init>(r6)
            X.5jp r1 = new X.5jp
            r20 = r4
            r21 = r2
            r22 = r3
            r23 = r10
            r26 = r11
            r27 = r18
            r28 = r0
            r29 = r9
            r18 = r1
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r1.A02(r5)
            r2.setAdapter(r1)
            goto L_0x03f2
        L_0x043c:
            r30 = 0
            goto L_0x0323
        L_0x0440:
            java.lang.String r0 = "Unknown viewType = "
            java.lang.String r0 = X.002.A0O(r0, r1)
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>(r0)
            r1 = 2127759860(0x7ed309f4, float:1.4025939E38)
            r0 = r17
            X.AnonymousClass0fD.A0A(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C231712s9.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0057, code lost:
        if (r5 == 1) goto L_0x0059;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(X.C232672uC r10, java.lang.Object r11, java.lang.Object r12) {
        /*
            r9 = this;
            X.3UH r11 = (X.AnonymousClass3UH) r11
            X.4aa r12 = (X.C266934aa) r12
            if (r11 == 0) goto L_0x008d
            X.2sA r7 = r9.A07
            com.instagram.api.schemas.SuggestedUsersStyle r8 = X.C266964ad.A00(r11)
            com.instagram.api.schemas.SuggestedUsersStyle r0 = r7.A01
            if (r0 == 0) goto L_0x001a
            if (r0 == r8) goto L_0x001a
            r0 = 0
            r7.A01 = r0
            java.util.Queue r0 = r7.A04
            r0.clear()
        L_0x001a:
            com.instagram.api.schemas.SuggestedUsersStyle r0 = r7.A01
            if (r0 != 0) goto L_0x007d
            r7.A01 = r8
            int r5 = r8.ordinal()
            r0 = 1
            if (r5 == r0) goto L_0x006b
            r0 = 3
            if (r5 == r0) goto L_0x006b
            r0 = 2
            android.content.Context r6 = r7.A02
            com.instagram.common.session.UserSession r4 = r7.A03
            X.0m8 r3 = X.C231722sA.A00(r8, r7)
            if (r5 == r0) goto L_0x0065
            X.OzL r0 = new X.OzL
            r0.<init>(r7)
        L_0x003a:
            X.0m6 r0 = (X.AnonymousClass0m6) r0
            r2 = 2131627989(0x7f0e0fd5, float:1.8883258E38)
            X.4ag r1 = new X.4ag
            r1.<init>(r6, r4, r0)
        L_0x0044:
            r3.A00(r1, r2)
            X.0m8 r4 = X.C231722sA.A00(r8, r7)
            X.4ah r3 = new X.4ah
            r3.<init>(r7)
            r2 = 3
            if (r5 == r2) goto L_0x0059
            r0 = 1
            r1 = 2131629540(0x7f0e15e4, float:1.8886404E38)
            if (r5 != r0) goto L_0x005c
        L_0x0059:
            r1 = 2131629553(0x7f0e15f1, float:1.888643E38)
        L_0x005c:
            r0 = 0
        L_0x005d:
            r4.A00(r3, r1)
            int r0 = r0 + 1
            if (r0 >= r2) goto L_0x007d
            goto L_0x005d
        L_0x0065:
            X.4af r0 = new X.4af
            r0.<init>(r7)
            goto L_0x003a
        L_0x006b:
            X.0m8 r3 = X.C231722sA.A00(r8, r7)
            X.OzK r0 = new X.OzK
            r0.<init>(r7)
            r2 = 2131627993(0x7f0e0fd9, float:1.8883266E38)
            X.OzJ r1 = new X.OzJ
            r1.<init>(r0)
            goto L_0x0044
        L_0x007d:
            r4 = 1
            r3 = 3
            r2 = 0
            if (r12 == 0) goto L_0x008e
            boolean r0 = r12.CdP()
            if (r0 != r4) goto L_0x008e
            if (r10 == 0) goto L_0x008d
            r10.A7U(r3)
        L_0x008d:
            return
        L_0x008e:
            com.instagram.api.schemas.SuggestedUsersStyle r0 = X.C266964ad.A00(r11)
            int r1 = r0.ordinal()
            if (r1 == r3) goto L_0x00a9
            r4 = 2
            r0 = 1
            if (r1 == r0) goto L_0x00a9
            if (r10 == 0) goto L_0x00a1
            r10.A7U(r2)
        L_0x00a1:
            if (r12 == 0) goto L_0x008d
            X.2ok r0 = r9.A06
            r0.A9R(r11, r12)
            return
        L_0x00a9:
            if (r10 == 0) goto L_0x00a1
            r10.A7U(r4)
            goto L_0x00a1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C231712s9.buildRowViewTypes(X.2uC, java.lang.Object, java.lang.Object):void");
    }

    public final void onViewDetachedFromWindow(View view, int i, Object obj, Object obj2) {
        if (this.A03 != null) {
            AnonymousClass1Nd.A00(this.A05).A02(this.A03, C57063INd.class);
            this.A03 = null;
        }
    }

    public final View createView(int i, ViewGroup viewGroup) {
        View view;
        Object obj;
        C252553pI linearLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1;
        SuggestedUsersStyle suggestedUsersStyle;
        int A032 = AnonymousClass0fD.A03(-57023346);
        0qQ.A0B(viewGroup, 1);
        if (i != 0) {
            if (i == 1) {
                suggestedUsersStyle = SuggestedUsersStyle.WITH_CONTENT_THUMBNAIL;
            } else if (i == 2) {
                suggestedUsersStyle = SuggestedUsersStyle.EMBEDDED_WITH_CONTENT_THUMBNAIL;
            } else if (i == 3) {
                view = C2363733m.A00(this.A04, viewGroup, "v1", 2);
            } else {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(002.A0O("Unknown viewType = ", i));
                AnonymousClass0fD.A0A(754858343, A032);
                throw illegalArgumentException;
            }
            C231722sA r1 = this.A07;
            view = r1.A00;
            r1.A00 = null;
            if (view == null || (view.getTag() != null && !(view.getTag() instanceof OEG))) {
                int i2 = 2132018211;
                if (suggestedUsersStyle == SuggestedUsersStyle.EMBEDDED_WITH_CONTENT_THUMBNAIL) {
                    i2 = 2132018210;
                }
                view = LayoutInflater.from(new ContextThemeWrapper(viewGroup.getContext(), i2)).inflate(R.layout.netego_carousel_redesign, viewGroup, false);
                0qQ.A0A(view);
                obj = new OEG(view);
                view.setTag(obj);
            }
        } else {
            UserSession userSession = this.A05;
            boolean A062 = 182.A06(0Tu.A05, userSession, 36316577007669762L);
            C252553pI r2 = null;
            Context context = this.A04;
            C252553pI r12 = this.A00;
            if (A062) {
                if (r12 instanceof GridLayoutManager) {
                    r2 = r12;
                }
                linearLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1 = new GridLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1(context);
            } else {
                if (r12 instanceof LinearLayoutManager) {
                    r2 = r12;
                }
                linearLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1 = new LinearLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1(context, true);
            }
            if (r2 != null) {
                linearLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1.A1P(r2.A1M());
            }
            this.A00 = linearLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1;
            C231722sA r13 = this.A07;
            view = r13.A00;
            r13.A00 = null;
            if (view == null || (view.getTag() != null && !(view.getTag() instanceof C243493Yz))) {
                0qQ.A0B(userSession, 0);
                0qQ.A0B(context, 1);
                view = LayoutInflater.from(context).inflate(R.layout.netego_carousel, viewGroup, false);
                0qQ.A0A(view);
                obj = new C243493Yz(context, view, userSession);
                view.setTag(obj);
            } else {
                Object tag = view.getTag();
                if (tag != null) {
                    ((C243493Yz) tag).A0A.setLayoutManager(linearLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1);
                }
            }
        }
        AnonymousClass0fD.A0A(1439887763, A032);
        return view;
    }
}
