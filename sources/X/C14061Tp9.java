package X;

import android.content.Context;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.reels.interactive.view.AvatarView;

/* renamed from: X.Tp9  reason: case insensitive filesystem */
public final class C14061Tp9 extends AnonymousClass3NK implements TextWatcher, View.OnFocusChangeListener, AnonymousClass8Z3 {
    public int A00;
    public View A01;
    public View A02;
    public View A03;
    public EditText A04;
    public TextView A05;
    public TextView A06;
    public C71662eb A07;
    public AvatarView A08;
    public C19477WaP A09;
    public JMB A0A;
    public String A0B;
    public String A0C;
    public boolean A0D;
    public TextView A0E;
    public CharSequence A0F = "";
    public final Context A0G;
    public final UserSession A0H;
    public final String A0I;
    public final String A0J;
    public final ViewStub A0K;
    public final C314636ib A0L;
    public final C20963X6q A0M;
    public final AnonymousClass8Z5 A0N;
    public final Runnable A0O = new C14062TpA(this);

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0164, code lost:
        if (r1 != true) goto L_0x0166;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(android.view.View r10, X.C19477WaP r11, X.JMB r12, X.AnonymousClass17L r13, java.lang.String r14, java.lang.String r15, int r16) {
        /*
            r9 = this;
            r3 = 0
            android.view.View r0 = r9.A01
            if (r0 != 0) goto L_0x00bf
            android.view.ViewStub r0 = r9.A0K
            android.view.View r4 = r0.inflate()
            r9.A01 = r4
            if (r4 == 0) goto L_0x00bf
            r0 = 19
            X.WBC.A00(r4, r0, r9)
            r0 = 2131438993(0x7f0b2d91, float:1.8499929E38)
            android.view.View r6 = X.AnonymousClass7TF.A0G(r4, r0)
            X.8Z5 r0 = r9.A0N
            r0.A02 = r6
            r0 = 2131438996(0x7f0b2d94, float:1.8499935E38)
            android.view.View r0 = r4.findViewById(r0)
            com.instagram.reels.interactive.view.AvatarView r0 = (com.instagram.reels.interactive.view.AvatarView) r0
            r9.A08 = r0
            r0 = 2131438997(0x7f0b2d95, float:1.8499937E38)
            android.view.View r0 = r4.findViewById(r0)
            r9.A03 = r0
            r0 = 2131439007(0x7f0b2d9f, float:1.8499957E38)
            android.widget.TextView r0 = X.DbU.A0G(r4, r0)
            r9.A06 = r0
            if (r0 == 0) goto L_0x0041
            X.ABM.A01(r0)
        L_0x0041:
            r0 = 2131438995(0x7f0b2d93, float:1.8499933E38)
            android.view.View r0 = r4.findViewById(r0)
            r9.A02 = r0
            r0 = 2131438994(0x7f0b2d92, float:1.849993E38)
            android.widget.EditText r0 = X.DbU.A0E(r4, r0)
            r9.A04 = r0
            if (r0 == 0) goto L_0x005b
            r0.addTextChangedListener(r9)
            r0.setOnFocusChangeListener(r9)
        L_0x005b:
            r0 = 2131429534(0x7f0b089e, float:1.8480743E38)
            android.widget.TextView r2 = X.DbU.A0G(r4, r0)
            X.0qQ.A0A(r2)
            X.3NG r0 = new X.3NG
            r0.<init>(r2)
            r0.A01(r2)
            r0.A04 = r9
            r5 = 1
            r0.A0C = r5
            r0.A00()
            r9.A0E = r2
            if (r2 == 0) goto L_0x0081
            android.content.Context r1 = r9.A0G
            r0 = 2131952027(0x7f13019b, float:1.9540485E38)
            X.DbU.A12(r1, r2, r0)
        L_0x0081:
            r0 = 2131439009(0x7f0b2da1, float:1.8499961E38)
            android.widget.TextView r2 = X.DbU.A0G(r4, r0)
            X.0qQ.A0A(r2)
            X.3NG r0 = new X.3NG
            r0.<init>(r2)
            r0.A01(r6)
            r0.A04 = r9
            r0.A07 = r5
            r0.A0C = r5
            r0.A00()
            r9.A05 = r2
            if (r2 == 0) goto L_0x00a8
            android.content.Context r1 = r9.A0G
            r0 = 2131952037(0x7f1301a5, float:1.9540505E38)
            X.DbU.A12(r1, r2, r0)
        L_0x00a8:
            r0 = 2131438978(0x7f0b2d82, float:1.8499898E38)
            android.view.View r1 = r4.findViewById(r0)
            boolean r0 = r1 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x02c7
            android.view.ViewStub r1 = (android.view.ViewStub) r1
        L_0x00b5:
            X.2eb r0 = new X.2eb
            r0.<init>(r1)
            r9.A07 = r0
            r9.A00()
        L_0x00bf:
            r9.A0C = r14
            r9.A09 = r11
            r0 = r16
            r9.A00 = r0
            r9.A0A = r12
            r9.A0B = r15
            boolean r1 = r11.A08()
            X.6ib r0 = r9.A0L
            r0.A00(r13, r1)
            android.view.View r0 = r9.A01
            if (r0 == 0) goto L_0x013f
            X.WaP r0 = r9.A09
            if (r0 != 0) goto L_0x018b
            android.widget.TextView r0 = r9.A06
            if (r0 == 0) goto L_0x00e3
            X.DbS.A1C(r0)
        L_0x00e3:
            android.widget.TextView r1 = r9.A06
            if (r1 == 0) goto L_0x00f0
            android.content.Context r0 = r9.A0G
            int r0 = X.C19477WaP.A01(r0)
            r1.setTextColor(r0)
        L_0x00f0:
            android.widget.EditText r1 = r9.A04
            if (r1 == 0) goto L_0x00fd
            android.content.Context r0 = r9.A0G
            int r0 = X.C19477WaP.A01(r0)
            r1.setTextColor(r0)
        L_0x00fd:
            android.widget.EditText r2 = r9.A04
            if (r2 == 0) goto L_0x0111
            android.content.Context r0 = r9.A0G
            int r1 = X.C19477WaP.A01(r0)
            r0 = 1060320051(0x3f333333, float:0.7)
            int r0 = X.0nH.A07(r1, r0)
            r2.setHintTextColor(r0)
        L_0x0111:
            android.view.View r0 = r9.A03
            if (r0 == 0) goto L_0x0126
            android.graphics.drawable.Drawable r2 = r0.getBackground()
            if (r2 == 0) goto L_0x0126
            android.content.Context r0 = r9.A0G
            int r1 = X.C19477WaP.A00(r0)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC
            r2.setColorFilter(r1, r0)
        L_0x0126:
            com.instagram.reels.interactive.view.AvatarView r1 = r9.A08
            if (r1 == 0) goto L_0x0133
            android.content.Context r0 = r9.A0G
            int r0 = X.C19477WaP.A00(r0)
            r1.setStrokeColor(r0)
        L_0x0133:
            android.widget.TextView r2 = r9.A05
            if (r2 == 0) goto L_0x013f
            android.content.Context r1 = r9.A0G
            r0 = 2131239646(0x7f0822de, float:1.8095605E38)
            X.DbU.A11(r1, r2, r0)
        L_0x013f:
            android.view.View r6 = r9.A01
            if (r6 == 0) goto L_0x0177
            java.lang.String r1 = "QuestionTextResponseComposerController"
            r5 = 1
            android.view.View[] r0 = new android.view.View[]{r10}
            X.Vc0 r4 = new X.Vc0
            r4.<init>(r6, r1, r0)
            r0 = 12
            r4.A00 = r0
            r0 = 15
            r4.A02 = r0
            android.content.Context r2 = r9.A0G
            X.WaP r0 = r9.A09
            if (r0 == 0) goto L_0x0166
            boolean r1 = r0.A08()
            r0 = 2131099787(0x7f06008b, float:1.7811937E38)
            if (r1 == r5) goto L_0x0169
        L_0x0166:
            r0 = 2131099782(0x7f060086, float:1.7811927E38)
        L_0x0169:
            int r0 = r2.getColor(r0)
            r4.A03 = r0
            X.U1A r0 = new X.U1A
            r0.<init>(r4)
            r6.setBackground(r0)
        L_0x0177:
            android.view.View r0 = r9.A01
            if (r0 == 0) goto L_0x017e
            r0.setVisibility(r3)
        L_0x017e:
            android.widget.EditText r0 = r9.A04
            if (r0 == 0) goto L_0x0185
            r0.requestFocus()
        L_0x0185:
            X.X6q r0 = r9.A0M
            r0.DbD()
            return
        L_0x018b:
            android.widget.TextView r1 = r9.A06
            r4 = 0
            if (r1 == 0) goto L_0x0197
            java.lang.String r0 = r0.A05()
            r1.setText(r0)
        L_0x0197:
            X.WaP r1 = r9.A09
            if (r1 == 0) goto L_0x01bd
            android.content.Context r0 = r9.A0G
            int r2 = r1.A04(r0)
            android.widget.TextView r0 = r9.A06
            if (r0 == 0) goto L_0x01a8
            r0.setTextColor(r2)
        L_0x01a8:
            android.widget.EditText r1 = r9.A04
            if (r1 == 0) goto L_0x01b6
            r0 = 1058642330(0x3f19999a, float:0.6)
            int r0 = X.0nH.A07(r2, r0)
            r1.setHintTextColor(r0)
        L_0x01b6:
            android.widget.EditText r0 = r9.A04
            if (r0 == 0) goto L_0x01bd
            r0.setTextColor(r2)
        L_0x01bd:
            X.WaP r0 = r9.A09
            r5 = 1
            if (r0 == 0) goto L_0x0212
            android.content.Context r6 = r9.A0G
            int r8 = r0.A03(r6)
            android.view.View r0 = r9.A03
            if (r0 == 0) goto L_0x01d7
            android.graphics.drawable.Drawable r1 = r0.getBackground()
            if (r1 == 0) goto L_0x01d7
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC
            r1.setColorFilter(r8, r0)
        L_0x01d7:
            com.instagram.reels.interactive.view.AvatarView r0 = r9.A08
            if (r0 == 0) goto L_0x01de
            r0.setStrokeColor(r8)
        L_0x01de:
            android.view.View r0 = r9.A02
            if (r0 == 0) goto L_0x01f1
            android.graphics.drawable.Drawable r2 = r0.getBackground()
            if (r2 == 0) goto L_0x01f1
            int r1 = X.AnonymousClass6YG.A01(r6, r8)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC
            r2.setColorFilter(r1, r0)
        L_0x01f1:
            int r0 = android.graphics.Color.red(r8)
            float r7 = (float) r0
            r1 = 1132396544(0x437f0000, float:255.0)
            float r7 = r7 / r1
            int r0 = android.graphics.Color.green(r8)
            float r6 = (float) r0
            float r6 = r6 / r1
            int r0 = android.graphics.Color.blue(r8)
            float r2 = (float) r0
            float r2 = r2 / r1
            r1 = 1
            int r0 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x02aa
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x02aa
        L_0x020e:
            r0 = r1 ^ 1
            r9.A0D = r0
        L_0x0212:
            boolean r0 = r9.A0D
            android.widget.TextView r2 = r9.A05
            if (r0 == 0) goto L_0x02a1
            if (r2 == 0) goto L_0x0222
            android.content.Context r1 = r9.A0G
            r0 = 2131239649(0x7f0822e1, float:1.809561E38)
        L_0x021f:
            X.DbU.A11(r1, r2, r0)
        L_0x0222:
            X.WaP r0 = r9.A09
            if (r0 == 0) goto L_0x029f
            boolean r0 = r0.A08()
            if (r0 != r5) goto L_0x029f
        L_0x022c:
            r1 = 8
            com.instagram.reels.interactive.view.AvatarView r0 = r9.A08
            if (r5 == 0) goto L_0x02b2
            if (r0 == 0) goto L_0x0237
            r0.setVisibility(r1)
        L_0x0237:
            android.content.Context r6 = r9.A0G
            int r2 = X.AnonymousClass7TG.A02(r6)
            android.widget.TextView r0 = r9.A06
            if (r0 == 0) goto L_0x0245
            android.view.ViewGroup$LayoutParams r4 = r0.getLayoutParams()
        L_0x0245:
            boolean r0 = r4 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x025b
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            if (r4 == 0) goto L_0x025b
            X.WaP r0 = r9.A09
            if (r0 == 0) goto L_0x029a
            int r0 = r0.A02()
            if (r0 <= 0) goto L_0x029a
            r0 = 0
        L_0x0258:
            r4.setMargins(r2, r3, r2, r0)
        L_0x025b:
            X.WaP r5 = r9.A09
            if (r5 == 0) goto L_0x013f
            X.2eb r0 = r9.A07
            if (r0 == 0) goto L_0x013f
            android.view.View r4 = r0.A01()
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r4 == 0) goto L_0x013f
            X.WaP r0 = r9.A09
            if (r0 == 0) goto L_0x02ad
            int r0 = r0.A02()
            if (r0 <= 0) goto L_0x02ad
            android.content.res.Resources r2 = r6.getResources()
            r1 = 2131820615(0x7f110047, float:1.927395E38)
            int r0 = r5.A02()
            java.lang.String r0 = X.DbY.A0d(r2, r0, r1)
            r4.setText(r0)
            r4.setVisibility(r3)
            int r1 = r5.A04(r6)
            r0 = 1058642330(0x3f19999a, float:0.6)
            int r0 = X.0nH.A07(r1, r0)
            r4.setTextColor(r0)
            goto L_0x013f
        L_0x029a:
            int r0 = X.AnonymousClass7TH.A01(r6)
            goto L_0x0258
        L_0x029f:
            r5 = 0
            goto L_0x022c
        L_0x02a1:
            if (r2 == 0) goto L_0x0222
            android.content.Context r1 = r9.A0G
            r0 = 2131239646(0x7f0822de, float:1.8095605E38)
            goto L_0x021f
        L_0x02aa:
            r1 = 0
            goto L_0x020e
        L_0x02ad:
            r4.setVisibility(r1)
            goto L_0x013f
        L_0x02b2:
            if (r0 == 0) goto L_0x02b7
            r0.setAvatarUser(r13)
        L_0x02b7:
            com.instagram.reels.interactive.view.AvatarView r0 = r9.A08
            if (r0 == 0) goto L_0x02be
            r0.setVisibility(r3)
        L_0x02be:
            X.2eb r0 = r9.A07
            if (r0 == 0) goto L_0x013f
            r0.A03(r1)
            goto L_0x013f
        L_0x02c7:
            r1 = 0
            goto L_0x00b5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14061Tp9.A02(android.view.View, X.WaP, X.JMB, X.17L, java.lang.String, java.lang.String, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r1 != true) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Dqe(android.view.View r17) {
        /*
            r16 = this;
            r1 = 0
            r3 = r17
            X.0qQ.A0B(r3, r1)
            r9 = r16
            android.widget.TextView r0 = r9.A0E
            r2 = 1
            if (r3 != r0) goto L_0x0011
            A01(r9)
        L_0x0010:
            return r2
        L_0x0011:
            android.widget.TextView r0 = r9.A05
            if (r3 != r0) goto L_0x0010
            r0.setEnabled(r1)
            android.widget.TextView r3 = r9.A05
            if (r3 == 0) goto L_0x002f
            X.WaP r0 = r9.A09
            if (r0 == 0) goto L_0x0029
            boolean r1 = r0.A08()
            r0 = 2131971030(0x7f134bd6, float:1.9579028E38)
            if (r1 == r2) goto L_0x002c
        L_0x0029:
            r0 = 2131971046(0x7f134be6, float:1.957906E38)
        L_0x002c:
            r3.setText(r0)
        L_0x002f:
            boolean r0 = r9.A0D
            if (r0 == 0) goto L_0x003f
            android.widget.TextView r3 = r9.A05
            if (r3 == 0) goto L_0x003f
            android.content.Context r1 = r9.A0G
            r0 = 2131100697(0x7f060419, float:1.7813783E38)
            X.DbT.A17(r1, r3, r0)
        L_0x003f:
            android.widget.TextView r4 = r9.A05
            if (r4 == 0) goto L_0x004a
            java.lang.Runnable r3 = r9.A0O
            r0 = 750(0x2ee, double:3.705E-321)
            r4.postDelayed(r3, r0)
        L_0x004a:
            X.WaP r0 = r9.A09
            if (r0 == 0) goto L_0x00dd
            boolean r0 = r0.A08()
            if (r0 != r2) goto L_0x00dd
        L_0x0054:
            java.lang.String r10 = r9.A0C
            X.WaP r11 = r9.A09
            r1 = 0
            if (r11 == 0) goto L_0x0010
            X.UNR r0 = r11.A00
            java.lang.String r0 = r0.A08
            if (r0 == 0) goto L_0x0010
            if (r10 == 0) goto L_0x0010
            android.widget.EditText r0 = r9.A04
            if (r0 == 0) goto L_0x006b
            android.text.Editable r1 = r0.getText()
        L_0x006b:
            java.lang.String r8 = java.lang.String.valueOf(r1)
            X.UNR r0 = r11.A00
            java.lang.String r7 = r0.A08
            if (r7 != 0) goto L_0x0077
            java.lang.String r7 = ""
        L_0x0077:
            java.lang.String r6 = r9.A0I
            java.lang.String r5 = r9.A0B
            java.lang.String r4 = r9.A0J
            int r3 = r9.A00
            boolean r0 = r11.A08()
            X.1Oj r1 = new X.1Oj
            r1.<init>()
            r1.A02 = r10
            r1.A03 = r7
            r1.A05 = r8
            r1.A04 = r6
            r1.A01 = r5
            r1.A06 = r4
            r1.A00 = r3
            r1.A07 = r0
            com.instagram.common.session.UserSession r0 = r9.A0H
            X.1Ou r0 = X.1Ou.A01(r0)
            r0.A0A(r1)
            X.JMB r1 = r9.A0A
            if (r1 == 0) goto L_0x0010
            X.Upc r1 = (X.C16151Upc) r1
            X.WaP r0 = r1.A0D
            if (r0 == 0) goto L_0x00d6
            X.UNR r3 = r0.A00
            X.0qQ.A0B(r3, r2)
            java.lang.String r9 = r3.A04
            java.lang.Boolean r6 = r3.A01
            java.lang.String r10 = r3.A05
            java.lang.String r11 = r3.A06
            java.lang.String r12 = r3.A07
            java.lang.String r13 = r3.A08
            com.instagram.reels.question.constants.QuestionStickerType r5 = r3.A00
            java.util.List r15 = r3.A0A
            java.lang.String r14 = r3.A09
            java.lang.Boolean r7 = r3.A02
            int r3 = r0.A02()
            int r3 = r3 + 1
            long r3 = (long) r3
            java.lang.Long r8 = java.lang.Long.valueOf(r3)
            X.UNR r4 = new X.UNR
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0.A00 = r4
        L_0x00d6:
            X.C16151Upc.A00(r1)
            r1.invalidateSelf()
            return r2
        L_0x00dd:
            com.instagram.common.session.UserSession r0 = r9.A0H
            X.0xY r1 = X.AnonymousClass7TF.A0N(r0)
            java.lang.String r0 = "has_ever_responded_to_story_question"
            r1.E5T(r0, r2)
            r1.apply()
            goto L_0x0054
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14061Tp9.Dqe(android.view.View):boolean");
    }

    public final void DzC(int i, int i2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0060, code lost:
        if (r1 == 0) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0086, code lost:
        if (r1 != true) goto L_0x0088;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void afterTextChanged(android.text.Editable r8) {
        /*
            r7 = this;
            r2 = 0
            X.0qQ.A0B(r8, r2)
            android.widget.EditText r0 = r7.A04
            if (r0 == 0) goto L_0x004d
            int r1 = r0.getLineCount()
            r0 = 3
            if (r1 <= r0) goto L_0x004d
            int r1 = r8.length()
            java.lang.CharSequence r0 = r7.A0F
            r8.replace(r2, r1, r0)
        L_0x0018:
            r7.A00()
            android.view.View r0 = r7.A01
            if (r0 == 0) goto L_0x009e
            android.widget.EditText r0 = r7.A04
            if (r0 == 0) goto L_0x004b
            android.text.Editable r0 = r0.getText()
        L_0x0027:
            java.lang.String r6 = java.lang.String.valueOf(r0)
            int r5 = r6.length()
            r3 = 1
            int r5 = r5 - r3
            r4 = 0
            r1 = 0
        L_0x0033:
            if (r2 > r5) goto L_0x0055
            r0 = r5
            if (r1 != 0) goto L_0x0039
            r0 = r2
        L_0x0039:
            boolean r0 = X.Dbc.A13(r6, r0)
            if (r1 != 0) goto L_0x0046
            if (r0 != 0) goto L_0x0043
            r1 = 1
            goto L_0x0033
        L_0x0043:
            int r2 = r2 + 1
            goto L_0x0033
        L_0x0046:
            if (r0 == 0) goto L_0x0055
            int r5 = r5 + -1
            goto L_0x0033
        L_0x004b:
            r0 = 0
            goto L_0x0027
        L_0x004d:
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>(r8)
            r7.A0F = r0
            goto L_0x0018
        L_0x0055:
            java.lang.String r0 = X.Dba.A0c(r6, r5, r2)
            if (r0 == 0) goto L_0x0062
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x0063
        L_0x0062:
            r0 = 1
        L_0x0063:
            r1 = r0 ^ 1
            android.widget.TextView r0 = r7.A05
            if (r0 == 0) goto L_0x0070
            if (r1 != 0) goto L_0x006d
            r4 = 8
        L_0x006d:
            r0.setVisibility(r4)
        L_0x0070:
            android.widget.TextView r0 = r7.A05
            if (r0 == 0) goto L_0x0077
            r0.setEnabled(r1)
        L_0x0077:
            android.widget.TextView r2 = r7.A05
            if (r2 == 0) goto L_0x008e
            X.WaP r0 = r7.A09
            if (r0 == 0) goto L_0x0088
            boolean r1 = r0.A08()
            r0 = 2131969581(0x7f13462d, float:1.9576089E38)
            if (r1 == r3) goto L_0x008b
        L_0x0088:
            r0 = 2131973082(0x7f1353da, float:1.958319E38)
        L_0x008b:
            r2.setText(r0)
        L_0x008e:
            boolean r0 = r7.A0D
            android.widget.TextView r2 = r7.A05
            if (r0 == 0) goto L_0x009f
            if (r2 == 0) goto L_0x009e
            android.content.Context r1 = r7.A0G
            r0 = 2131099989(0x7f060155, float:1.7812347E38)
        L_0x009b:
            X.DbT.A17(r1, r2, r0)
        L_0x009e:
            return
        L_0x009f:
            if (r2 == 0) goto L_0x009e
            android.content.Context r1 = r7.A0G
            r0 = 2131099843(0x7f0600c3, float:1.781205E38)
            goto L_0x009b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14061Tp9.afterTextChanged(android.text.Editable):void");
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onFocusChange(View view, boolean z) {
        0qQ.A0B(view, 0);
        AnonymousClass8Z5 r1 = this.A0N;
        AnonymousClass3E6 r0 = r1.A07;
        if (z) {
            r0.A9Y(r1);
            0nA.A0Q(view);
            return;
        }
        r0.EEH(r1);
        0nA.A0N(view);
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        if (r1 == 0) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00() {
        /*
            r3 = this;
            android.view.View r0 = r3.A01
            if (r0 == 0) goto L_0x0026
            android.widget.EditText r0 = r3.A04
            if (r0 == 0) goto L_0x0015
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x0015
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x0016
        L_0x0015:
            r0 = 1
        L_0x0016:
            r2 = r0 ^ 1
            android.widget.EditText r1 = r3.A04
            if (r1 == 0) goto L_0x0026
            r0 = 8388611(0x800003, float:1.1754948E-38)
            if (r2 == 0) goto L_0x0023
            r0 = 17
        L_0x0023:
            r1.setGravity(r0)
        L_0x0026:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14061Tp9.A00():void");
    }

    public static final void A01(C14061Tp9 tp9) {
        EditText editText;
        View view = tp9.A01;
        if (view != null) {
            view.setVisibility(8);
            if (!(tp9.A01 == null || (editText = tp9.A04) == null)) {
                DbS.A1C(editText);
            }
            EditText editText2 = tp9.A04;
            if (editText2 != null) {
                editText2.clearFocus();
            }
            TextView textView = tp9.A05;
            if (textView != null) {
                textView.removeCallbacks(tp9.A0O);
            }
            tp9.A0L.A00 = false;
            tp9.A0M.DbC();
        }
    }

    public final void DMp() {
        TextView textView = this.A06;
        if (textView != null) {
            textView.clearFocus();
        }
        A01(this);
    }

    public C14061Tp9(ViewStub viewStub, UserSession userSession, AnonymousClass3E6 r5, C314636ib r6, C20963X6q x6q, String str, String str2) {
        C51974G9v.A1P(viewStub, r5, userSession, r6);
        C51972G9s.A1E(str, str2);
        this.A0K = viewStub;
        Context A0S = AnonymousClass7TE.A0S(viewStub);
        this.A0G = A0S;
        this.A0N = new AnonymousClass8Z5(A0S, r5, this);
        this.A0H = userSession;
        this.A0L = r6;
        this.A0M = x6q;
        this.A0I = str;
        this.A0J = str2;
        this.A00 = -1;
        this.A0B = "unknown";
    }
}
