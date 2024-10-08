package X;

import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.U9h  reason: case insensitive filesystem */
public final class C14792U9h extends C322136vJ {
    public static final U9R A04 = new U9R(1);
    public final UserSession A00;
    public final AnonymousClass4DU A01;
    public final UKU A02;
    public final C18077Vl6 A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14792U9h(UserSession userSession, AnonymousClass4DU r3, UKU uku, C18077Vl6 vl6) {
        super((C252303ot) A04);
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A03 = vl6;
        this.A01 = r3;
        this.A02 = uku;
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        UserSession userSession = this.A00;
        C16527UwW uwW = C16527UwW.values()[i];
        AnonymousClass7TF.A1B(userSession, 0, uwW);
        switch (uwW.ordinal()) {
            case 0:
                return new C16032UnL(DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.lead_gen_view_holder_short_answer_question, false), userSession);
            case 1:
            case 3:
            case 4:
                return new C16030UnJ(DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.lead_gen_view_holder_multiple_choice_question, false), userSession);
            case 2:
                return new C16027UnG(DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.lead_gen_view_holder_slider, false), userSession);
            case 5:
                return new C16031UnK(DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.lead_gen_viewholder_customer_info, false), userSession);
            case 6:
                return new C16028UnH(DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.lead_gen_view_holder_store_locator, false), userSession);
            case 7:
                return new C16033UnM(DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.lead_gen_view_holder_date_time_question, false), userSession);
            case 8:
                return new C14898UEa(DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.lead_gen_view_holder_loading, false), userSession);
            case 9:
                return new C16029UnI(DbT.A0D(DbV.A0D(viewGroup), viewGroup, R.layout.lead_gen_view_holder_disqualified_lead, false), userSession);
            case 10:
                return new C14898UEa(DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.lead_gen_view_holder_single_screen_privacy_policy, false), userSession);
            case 11:
                return new C16026UnF(DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.lead_gen_view_holder_error, false), userSession);
            default:
                throw new RuntimeException();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v27, resolved type: X.WBG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: X.WB4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v32, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v33, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v36, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v44, resolved type: X.OjA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v45, resolved type: X.OjA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v38, resolved type: X.OjA} */
    /* JADX WARNING: type inference failed for: r5v6, types: [android.view.View$OnClickListener] */
    /* JADX WARNING: type inference failed for: r4v26, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r7v7, types: [X.Umt, X.Un0] */
    /* JADX WARNING: type inference failed for: r7v11, types: [X.Umx, X.Un0] */
    /* JADX WARNING: type inference failed for: r4v60, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r4v81, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r4v89, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0436, code lost:
        if (r8 == false) goto L_0x0438;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0460  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0474  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x02eb  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0311  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x036e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onBindViewHolder(X.C249703kE r29, int r30) {
        /*
            r28 = this;
            r3 = r29
            X.UEa r3 = (X.C14898UEa) r3
            r2 = 0
            X.0qQ.A0B(r3, r2)
            r5 = r28
            r16 = r30
            r0 = r16
            java.lang.Object r1 = r5.getItem(r0)
            X.0qQ.A07(r1)
            X.UKy r1 = (X.C15045UKy) r1
            X.Vl6 r0 = r5.A03
            X.4DU r4 = r5.A01
            r27 = r4
            X.UKU r4 = r5.A02
            r26 = r4
            r4 = r27
            X.C51973G9u.A1E(r1, r0, r4)
            r17 = 3
            r5 = r26
            r4 = r17
            X.0qQ.A0B(r5, r4)
            r3.A00 = r0
            X.N4R r4 = r1.A00
            java.lang.Object r5 = r4.A00
            X.4Yx r5 = (X.C266444Yx) r5
            if (r5 == 0) goto L_0x004c
            android.view.View r4 = r3.itemView
            android.content.res.Resources r4 = X.C66580MXl.A0B(r4)
            java.lang.CharSequence r5 = r5.A00(r4)
            if (r5 == 0) goto L_0x004c
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r4 = r3.A09
            if (r4 == 0) goto L_0x004c
            r4.setPrimaryActionText(r5)
        L_0x004c:
            X.UKg r8 = r1.A02
            androidx.constraintlayout.widget.ConstraintLayout r9 = r3.A04
            r10 = 8
            r6 = 1
            if (r9 == 0) goto L_0x005d
            r4 = 8
            if (r8 == 0) goto L_0x005a
            r4 = 0
        L_0x005a:
            r9.setVisibility(r4)
        L_0x005d:
            if (r8 == 0) goto L_0x016e
            if (r9 == 0) goto L_0x016e
            r4 = 2131430749(0x7f0b0d5d, float:1.8483208E38)
            android.widget.TextView r7 = X.DbW.A0B(r9, r4)
            android.content.Context r5 = X.JTQ.A06(r3)
            X.4Yx r4 = r8.A02
            java.lang.CharSequence r4 = X.C66909Mes.A00(r5, r4)
            r7.setText(r4)
            r4 = 2131430748(0x7f0b0d5c, float:1.8483206E38)
            android.widget.TextView r5 = X.DbW.A0B(r9, r4)
            java.lang.Integer r4 = r8.A05
            int r4 = r4.intValue()
            if (r4 == r2) goto L_0x0281
            if (r4 != r6) goto L_0x06b8
            android.content.Context r7 = X.DbS.A07(r3)
            r4 = 2131961000(0x7f1324a8, float:1.9558685E38)
            java.lang.String r11 = X.AnonymousClass7TE.A16(r7, r4)
            java.util.List r8 = r8.A07
            r4 = 10
            java.lang.String r7 = X.002.A0D(r11, r4)
            r9 = 0
            java.lang.String r4 = ""
            java.lang.String r4 = X.00k.A0P(r7, r11, r4, r8, r9)
        L_0x00a0:
            boolean r7 = X.C51966G9m.A1X(r4)
            if (r7 == 0) goto L_0x00a7
            r10 = 0
        L_0x00a7:
            r5.setVisibility(r10)
            r5.setText(r4)
            android.content.Context r8 = X.DbS.A07(r3)
            r7 = 2131966723(0x7f133b03, float:1.9570292E38)
            java.lang.String r8 = X.AnonymousClass7TE.A16(r8, r7)
            java.util.Locale r7 = X.AnonymousClass1Q2.A02()
            java.lang.String r10 = X.DbT.A12(r7, r8)
            android.content.Context r8 = X.DbS.A07(r3)
            r7 = 2131961564(0x7f1326dc, float:1.9559828E38)
            java.lang.String r7 = r8.getString(r7)
            java.lang.String r8 = X.C66580MXl.A10(r7, r10)
            android.content.Context r7 = X.JTQ.A06(r3)
            int r24 = X.AnonymousClass0nB.A01(r7)
            android.view.View r7 = r3.itemView
            android.content.res.Resources r11 = X.DbU.A05(r7)
            r7 = 2131165205(0x7f070015, float:1.794462E38)
            int r7 = r11.getDimensionPixelOffset(r7)
            int r7 = r7 * 2
            int r24 = r24 - r7
            android.text.Layout$Alignment r19 = android.text.Layout.Alignment.ALIGN_NORMAL
            android.text.TextPaint r20 = r5.getPaint()
            if (r20 != 0) goto L_0x00f5
            android.text.TextPaint r20 = new android.text.TextPaint
            r20.<init>()
        L_0x00f5:
            r22 = 0
            r23 = 1065353216(0x3f800000, float:1.0)
            X.0rN r7 = new X.0rN
            r18 = r7
            r21 = r9
            r25 = r2
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            r11 = r17
            java.lang.String r8 = X.C252993q2.A02(r7, r4, r8, r11)
            X.0qQ.A07(r8)
            boolean r7 = r8.equals(r4)
            if (r7 != 0) goto L_0x012d
            android.text.SpannableStringBuilder r11 = new android.text.SpannableStringBuilder
            r11.<init>(r8)
            int r12 = r8.length()
            int r7 = r10.length()
            android.text.style.StyleSpan r10 = new android.text.style.StyleSpan
            r10.<init>(r6)
            int r8 = r12 - r7
            r7 = 17
            r11.setSpan(r10, r8, r12, r7)
            r8 = r11
        L_0x012d:
            r5.setText(r8)
            X.Vl6 r10 = r3.A00
            if (r10 == 0) goto L_0x015b
            boolean r13 = r8.equals(r4)
            X.UwW r7 = r1.A03
            java.lang.String r12 = r7.toString()
            X.0qQ.A0B(r12, r6)
            X.Umf r7 = r10.A00
            X.VsB r11 = X.C16039UnS.A00(r7)
            X.XB6 r10 = r11.A00
            java.lang.String r7 = r11.A01
            if (r13 == 0) goto L_0x027d
            java.lang.String r14 = "inline_context_card_short_description_impression"
        L_0x014f:
            android.os.Bundle r11 = X.C18462VsB.A00(r11, r12, r9)
            java.lang.String r13 = "lead_gen_multi_step_consumer_questions"
            java.lang.String r15 = "impression"
            r12 = r7
            r10.Cgq(r11, r12, r13, r14, r15)
        L_0x015b:
            boolean r7 = r8.equals(r4)
            if (r7 != 0) goto L_0x016e
            X.WA3 r7 = new X.WA3
            r8 = r1
            r9 = r3
            r10 = r5
            r11 = r4
            r12 = r6
            r7.<init>(r8, r9, r10, r11, r12)
            X.AnonymousClass0fU.A00(r7, r5)
        L_0x016e:
            boolean r4 = r3 instanceof X.C16028UnH
            if (r4 == 0) goto L_0x02c1
            r15 = r3
            X.UnH r15 = (X.C16028UnH) r15
            boolean r13 = X.AnonymousClass7TF.A1U(r2, r1, r0)
            com.instagram.leadgen.core.ui.LeadGenFormStoreLocatorView r12 = r15.A00
            java.util.List r14 = r1.A08
            java.lang.Object r7 = r14.get(r2)
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r7 = (com.instagram.leadgen.core.model.LeadGenFormBaseQuestion) r7
            boolean r5 = r1.A0B
            boolean r4 = r1.A0A
            r19 = r4
            r12.A0G(r7, r2, r5, r4)
            r5 = 24
            X.MPB r4 = new X.MPB
            r4.<init>((int) r5, (java.lang.Object) r0, (java.lang.Object) r1)
            r12.setCountryPickerClickListener(r4)
            X.WYf r4 = new X.WYf
            r4.<init>(r13, r0, r1, r15)
            r12.setSearchKeyChangeListener(r4)
            java.util.List r4 = r1.A09
            r23 = r4
            java.lang.Object r11 = r14.get(r2)
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r11 = (com.instagram.leadgen.core.model.LeadGenFormBaseQuestion) r11
            X.0qQ.A0B(r4, r2)
            X.0qQ.A0B(r11, r13)
            android.widget.RadioGroup r4 = r12.A02
            r22 = r4
            r22.removeAllViews()
            r4 = r23
            boolean r4 = r4 instanceof java.util.Collection
            if (r4 == 0) goto L_0x0261
            boolean r4 = r23.isEmpty()
            if (r4 == 0) goto L_0x0261
        L_0x01c1:
            java.lang.String r4 = ""
            r12.A0F(r11, r4)
        L_0x01c6:
            boolean r4 = X.AnonymousClass7TE.A1b(r23)
            r7 = 8
            int r5 = X.DbW.A01(r4)
            r4 = r22
            r4.setVisibility(r5)
            com.instagram.common.ui.base.IgTextView r5 = r12.A03
            boolean r4 = r23.isEmpty()
            if (r4 == 0) goto L_0x01de
            r7 = 0
        L_0x01de:
            r5.setVisibility(r7)
            java.util.Iterator r18 = r23.iterator()
        L_0x01e5:
            boolean r4 = r18.hasNext()
            if (r4 == 0) goto L_0x028e
            java.lang.Object r10 = r18.next()
            X.UKN r10 = (X.UKN) r10
            android.content.Context r5 = X.AnonymousClass7TE.A0S(r12)
            r4 = 0
            com.instagram.igds.components.textcell.IgdsListCell r9 = new com.instagram.igds.components.textcell.IgdsListCell
            r9.<init>(r5, r4)
            X.Njo r4 = X.C69349Njo.TYPE_RADIO
            r9.setTextCellType(r4)
            java.lang.String r8 = r10.A04
            if (r8 != 0) goto L_0x0206
            java.lang.String r8 = ""
        L_0x0206:
            java.util.Locale r4 = X.AnonymousClass1Q2.A02()
            java.text.NumberFormat r7 = java.text.NumberFormat.getInstance(r4)
            r7.setGroupingUsed(r13)
            r7.setMaximumFractionDigits(r13)
            double r4 = r10.A00
            java.lang.String r4 = r7.format(r4)
            r7 = 32
            java.lang.String r5 = r10.A02
            java.lang.String r5 = X.002.A0T(r4, r5, r7)
            java.lang.String r4 = " · "
            java.lang.String r4 = X.002.A0g(r8, r4, r5)
            android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder
            r5.<init>(r4)
            android.text.style.StyleSpan r4 = new android.text.style.StyleSpan
            r4.<init>(r13)
            X.AnonymousClass7AV.A03(r5, r4, r8)
            r9.A0I(r5)
            java.lang.String r4 = r10.A01
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r9.A0H(r4)
            java.lang.String r4 = r11.A00
            java.lang.String r7 = r10.A03
            boolean r4 = X.0qQ.A0K(r4, r7)
            r9.setChecked(r4)
            X.IEA r5 = new X.IEA
            r4 = r17
            r5.<init>(r4, r11, r10, r12)
            r9.A0D(r5)
            java.util.Map r4 = r12.A05
            r4.put(r7, r9)
            r4 = r22
            r4.addView(r9)
            goto L_0x01e5
        L_0x0261:
            java.util.Iterator r7 = r23.iterator()
        L_0x0265:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = r7.next()
            X.UKN r4 = (X.UKN) r4
            java.lang.String r5 = r11.A00
            java.lang.String r4 = r4.A03
            boolean r4 = X.0qQ.A0K(r5, r4)
            if (r4 == 0) goto L_0x0265
            goto L_0x01c6
        L_0x027d:
            java.lang.String r14 = "inline_context_card_long_description_impression"
            goto L_0x014f
        L_0x0281:
            java.util.List r8 = r8.A07
            java.lang.String r7 = "\n"
            r9 = 0
            java.lang.String r4 = ""
            java.lang.String r4 = X.00k.A0P(r7, r4, r4, r8, r9)
            goto L_0x00a0
        L_0x028e:
            java.lang.String r4 = r12.A00
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x029f
            boolean r4 = X.AnonymousClass7TE.A1b(r23)
            if (r4 == 0) goto L_0x029f
            X.0nA.A0N(r12)
        L_0x029f:
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r7 = r15.A09
            r13 = 0
            if (r7 == 0) goto L_0x02a7
            r7.setVisibility(r2)
        L_0x02a7:
            if (r19 == 0) goto L_0x02b4
            java.lang.Object r4 = r14.get(r2)
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r4 = (com.instagram.leadgen.core.model.LeadGenFormBaseQuestion) r4
            boolean r4 = r4.A0I
            if (r4 == 0) goto L_0x02b4
            r13 = 1
        L_0x02b4:
            if (r7 == 0) goto L_0x02e7
            r9 = 6
            X.OjA r5 = new X.OjA
            r8 = r5
            r10 = r0
            r11 = r1
            r12 = r15
            r8.<init>(r9, r10, r11, r12, r13)
            goto L_0x02e4
        L_0x02c1:
            boolean r4 = r3 instanceof X.C16027UnG
            if (r4 == 0) goto L_0x0377
            r8 = r3
            X.UnG r8 = (X.C16027UnG) r8
            boolean r7 = X.AnonymousClass7TF.A1U(r2, r1, r0)
            com.instagram.leadgen.core.ui.LeadGenFormSliderQuestionView r5 = r8.A00
            java.util.List r4 = r1.A08
            java.lang.Object r4 = r4.get(r2)
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r4 = (com.instagram.leadgen.core.model.LeadGenFormBaseQuestion) r4
            r5.A0G(r4, r2, r7, r2)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r7 = r8.A09
            if (r7 == 0) goto L_0x02e7
            r4 = 41
            X.WB4 r5 = new X.WB4
            r5.<init>(r4, r0, r1, r8)
        L_0x02e4:
            r7.setPrimaryActionOnClickListener(r5)
        L_0x02e7:
            com.instagram.common.ui.base.IgTextView r7 = r3.A07
            if (r7 == 0) goto L_0x0304
            com.instagram.leadgen.core.model.privacypolicy.LeadGenPrivacyPolicy r5 = r1.A05
            boolean r4 = r1.A0G
            r0 = 0
            if (r5 != 0) goto L_0x02f4
            r0 = 8
        L_0x02f4:
            r7.setVisibility(r0)
            if (r5 != 0) goto L_0x0371
            r3.A01 = r6
        L_0x02fb:
            android.view.ViewTreeObserver r4 = r7.getViewTreeObserver()
            android.view.ViewTreeObserver$OnPreDrawListener r0 = r3.A03
            r4.addOnPreDrawListener(r0)
        L_0x0304:
            android.view.View r5 = r3.itemView
            X.0qQ.A06(r5)
            X.UwW r0 = r1.A03
            int r1 = X.DbU.A02(r0, r2)
            if (r1 == r6) goto L_0x036e
            if (r1 == r2) goto L_0x036b
            r0 = 5
            if (r1 != r0) goto L_0x036a
            X.Uy6 r4 = X.C16610Uy6.A07
        L_0x0318:
            com.instagram.common.session.UserSession r6 = r3.A06
            java.lang.String r7 = r6.A05
            r0 = r17
            X.0qQ.A0B(r7, r0)
            r0 = r26
            int r2 = r0.A00
            int r2 = r2 + r30
            java.lang.String r1 = r0.A02
            java.lang.String r0 = "p:"
            java.lang.String r0 = X.002.A0O(r0, r2)
            java.lang.String[] r0 = new java.lang.String[]{r1, r7, r0}
            java.util.List r1 = X.0sr.A1P(r0)
            java.lang.String r0 = "_"
            java.lang.String r7 = X.C66581MXm.A0w(r0, r1)
            X.UGq r2 = new X.UGq
            r2.<init>()
            java.lang.String r1 = "lead_gen_multi_step_consumer_questions"
            java.lang.String r0 = "flow_name"
            r2.A06(r0, r1)
            java.lang.String r1 = "consumer_question_multi_step_page_impression"
            java.lang.String r0 = "flow_step"
            r2.A06(r0, r1)
            java.lang.String r1 = r4.A02
            java.lang.String r0 = "question_type"
            r2.A06(r0, r1)
            X.Vsl r4 = new X.Vsl
            r0 = r26
            r4.<init>(r2, r0, r7)
            X.2el r2 = r3.A08
            X.Hq7 r1 = new X.Hq7
            r0 = r27
            r1.<init>(r6, r2, r0)
            r1.A00(r5, r4)
        L_0x036a:
            return
        L_0x036b:
            X.Uy6 r4 = X.C16610Uy6.A09
            goto L_0x0318
        L_0x036e:
            X.Uy6 r4 = X.C16610Uy6.A08
            goto L_0x0318
        L_0x0371:
            com.instagram.common.session.UserSession r0 = r3.A06
            X.VEQ.A00(r7, r0, r5, r4)
            goto L_0x02fb
        L_0x0377:
            boolean r4 = r3 instanceof X.C16025UnE
            if (r4 == 0) goto L_0x038b
            X.0qQ.A0B(r0, r6)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r7 = r3.A09
            if (r7 == 0) goto L_0x02e7
            r4 = 58
            X.WBG r5 = new X.WBG
            r5.<init>(r4, r3, r0)
            goto L_0x02e4
        L_0x038b:
            boolean r4 = r3 instanceof X.C16032UnL
            if (r4 == 0) goto L_0x03fd
            r11 = r3
            X.UnL r11 = (X.C16032UnL) r11
            boolean r9 = X.AnonymousClass7TF.A1U(r2, r1, r0)
            r11.A00 = r1
            boolean r4 = r1.A0C
            r11.A01 = r4
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r7 = r11.A09
            if (r7 == 0) goto L_0x03a3
            r7.setPrimaryButtonEnabled(r9)
        L_0x03a3:
            com.instagram.leadgen.core.ui.LeadGenFormShortAnswerQuestionView r10 = r11.A03
            X.WYj r4 = new X.WYj
            r4.<init>(r0)
            r10.A02 = r4
            java.util.List r4 = r1.A08
            java.lang.Object r8 = r4.get(r2)
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r8 = (com.instagram.leadgen.core.model.LeadGenFormBaseQuestion) r8
            boolean r5 = r1.A0B
            boolean r4 = r1.A0A
            r10.A0G(r8, r2, r5, r4)
            X.WYe r4 = new X.WYe
            r4.<init>(r9, r0, r11)
            r10.A01 = r4
            if (r7 == 0) goto L_0x03ce
            r5 = 57
            X.WBG r4 = new X.WBG
            r4.<init>(r5, r11, r0)
            r7.setPrimaryActionOnClickListener(r4)
        L_0x03ce:
            boolean r9 = r1.A0D
            if (r9 == 0) goto L_0x03f5
            com.instagram.common.typedurl.ImageUrl r8 = r1.A01
            if (r8 == 0) goto L_0x03f5
            boolean r0 = r1.A0H
            if (r0 != 0) goto L_0x03f5
            com.instagram.common.ui.widget.imageview.CircularImageView r5 = r11.A02
            r5.setVisibility(r2)
            java.lang.String r4 = "LeadGenShortAnswerQuestionViewHolder"
            X.0xG r0 = new X.0xG
            r0.<init>(r4)
            r5.setUrl(r8, r0)
        L_0x03e9:
            r10.setUpLabelTextStyle(r9)
        L_0x03ec:
            if (r7 == 0) goto L_0x02e7
            X.3aa r0 = X.C244063aa.CTA
            X.C244083ac.A05(r7, r0)
            goto L_0x02e7
        L_0x03f5:
            com.instagram.common.ui.widget.imageview.CircularImageView r4 = r11.A02
            r0 = 8
            r4.setVisibility(r0)
            goto L_0x03e9
        L_0x03fd:
            boolean r4 = r3 instanceof X.C16030UnJ
            if (r4 == 0) goto L_0x04a5
            r10 = r3
            X.UnJ r10 = (X.C16030UnJ) r10
            boolean r7 = X.AnonymousClass7TF.A1U(r2, r1, r0)
            r10.A00 = r1
            com.instagram.leadgen.core.ui.LeadGenFormSingleMultipleChoiceQuestionView r9 = r10.A02
            X.WYe r4 = new X.WYe
            r4.<init>(r2, r0, r10)
            r9.A01 = r4
            java.util.List r12 = r1.A08
            java.lang.Object r5 = r12.get(r2)
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r5 = (com.instagram.leadgen.core.model.LeadGenFormBaseQuestion) r5
            boolean r4 = r1.A0B
            boolean r8 = r1.A0A
            r9.A0G(r5, r2, r4, r8)
            r11 = 0
            java.lang.Object r13 = r12.get(r2)
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r13 = (com.instagram.leadgen.core.model.LeadGenFormBaseQuestion) r13
            java.lang.Object r4 = r12.get(r2)
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r4 = (com.instagram.leadgen.core.model.LeadGenFormBaseQuestion) r4
            java.lang.String r12 = r4.A00
            boolean r4 = r13.A0I
            if (r4 == 0) goto L_0x0438
            r5 = 1
            if (r8 != 0) goto L_0x0439
        L_0x0438:
            r5 = 0
        L_0x0439:
            r4 = r12
            if (r12 != 0) goto L_0x043e
            java.lang.String r4 = r13.A00
        L_0x043e:
            boolean r4 = X.00l.A0W(r4)
            if (r4 == 0) goto L_0x047c
            if (r5 != 0) goto L_0x047c
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r8 = r10.A09
            if (r8 == 0) goto L_0x0454
            r0 = 8
            r8.setVisibility(r0)
        L_0x044f:
            X.3aa r0 = X.C244063aa.CTA
            X.C244083ac.A05(r8, r0)
        L_0x0454:
            boolean r8 = r1.A0D
            if (r8 == 0) goto L_0x0474
            com.instagram.common.typedurl.ImageUrl r7 = r1.A01
            if (r7 == 0) goto L_0x0474
            boolean r0 = r1.A0H
            if (r0 != 0) goto L_0x0474
            com.instagram.common.ui.widget.imageview.CircularImageView r5 = r10.A01
            r5.setVisibility(r2)
            java.lang.String r4 = "LeadGenMultipleChoiceQuestionViewHolder"
            X.0xG r0 = new X.0xG
            r0.<init>(r4)
            r5.setUrl(r7, r0)
        L_0x046f:
            r9.setUpTextStyle(r8)
            goto L_0x02e7
        L_0x0474:
            com.instagram.common.ui.widget.imageview.CircularImageView r4 = r10.A01
            r0 = 8
            r4.setVisibility(r0)
            goto L_0x046f
        L_0x047c:
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r8 = r10.A09
            if (r8 == 0) goto L_0x0483
            r8.setVisibility(r2)
        L_0x0483:
            java.util.List r4 = r13.A0C
            if (r4 == 0) goto L_0x048e
            boolean r4 = r4.contains(r12)
            if (r4 != r7) goto L_0x048e
            r11 = 1
        L_0x048e:
            if (r8 == 0) goto L_0x0454
            android.content.Context r5 = X.DbS.A07(r10)
            r4 = 2131964674(0x7f133302, float:1.9566136E38)
            java.lang.String r7 = r5.getString(r4)
            r5 = 5
            X.WB2 r4 = new X.WB2
            r4.<init>((int) r5, (java.lang.Object) r0, (boolean) r11)
            r8.setPrimaryAction(r7, r4)
            goto L_0x044f
        L_0x04a5:
            boolean r4 = r3 instanceof X.C16024UnD
            if (r4 != 0) goto L_0x02e7
            boolean r4 = r3 instanceof X.C16026UnF
            if (r4 == 0) goto L_0x04bc
            r4 = r3
            X.UnF r4 = (X.C16026UnF) r4
            X.0qQ.A0B(r0, r6)
            com.instagram.common.ui.base.IgTextView r5 = r4.A00
            r4 = 24
            X.WBA.A00(r5, r4, r0)
            goto L_0x02e7
        L_0x04bc:
            boolean r4 = r3 instanceof X.C16029UnI
            if (r4 == 0) goto L_0x04ea
            r7 = r3
            X.UnI r7 = (X.C16029UnI) r7
            X.AnonymousClass7TG.A1N(r1, r0)
            com.instagram.leadgen.core.model.disqualifyingscreen.LeadGenDisqualifyingScreenData r9 = r1.A04
            if (r9 == 0) goto L_0x02e7
            com.instagram.common.ui.base.IgTextView r5 = r7.A01
            java.lang.String r4 = r9.A01
            r5.setText(r4)
            com.instagram.common.ui.base.IgTextView r5 = r7.A00
            java.lang.String r4 = r9.A00
            r5.setText(r4)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r8 = r7.A09
            if (r8 == 0) goto L_0x02e7
            java.lang.String r7 = r9.A02
            r5 = 56
            X.WBG r4 = new X.WBG
            r4.<init>(r5, r9, r0)
            r8.setPrimaryAction(r7, r4)
            goto L_0x02e7
        L_0x04ea:
            boolean r4 = r3 instanceof X.C16033UnM
            if (r4 == 0) goto L_0x0553
            r10 = r3
            X.UnM r10 = (X.C16033UnM) r10
            X.AnonymousClass7TF.A1H(r1, r0)
            r4 = 0
            X.C16033UnM.A01(r1, r10, r4)
            com.instagram.leadgen.core.ui.LeadGenFormDateTimeQuestionView r9 = r10.A01
            X.WYf r4 = new X.WYf
            r4.<init>(r2, r0, r1, r10)
            r9.A01 = r4
            java.util.List r4 = r1.A08
            java.lang.Object r7 = r4.get(r2)
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r7 = (com.instagram.leadgen.core.model.LeadGenFormBaseQuestion) r7
            boolean r5 = r1.A0B
            boolean r4 = r1.A0A
            r9.A0G(r7, r2, r5, r4)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r7 = r10.A09
            if (r7 == 0) goto L_0x0521
            r7.setVisibility(r2)
            r5 = 55
            X.WBG r4 = new X.WBG
            r4.<init>(r5, r10, r0)
            r7.setPrimaryActionOnClickListener(r4)
        L_0x0521:
            r5 = 40
            X.WB4 r4 = new X.WB4
            r4.<init>(r5, r0, r1, r10)
            r9.setDateTimePickerClickListener(r4)
            boolean r8 = r1.A0D
            if (r8 == 0) goto L_0x054b
            com.instagram.common.typedurl.ImageUrl r7 = r1.A01
            if (r7 == 0) goto L_0x054b
            boolean r0 = r1.A0H
            if (r0 != 0) goto L_0x054b
            com.instagram.common.ui.widget.imageview.CircularImageView r5 = r10.A00
            r5.setVisibility(r2)
            java.lang.String r4 = "LeadGenDateTimeQuestionViewHolder"
            X.0xG r0 = new X.0xG
            r0.<init>(r4)
            r5.setUrl(r7, r0)
        L_0x0546:
            r9.setUpLabelTextStyle(r8)
            goto L_0x02e7
        L_0x054b:
            com.instagram.common.ui.widget.imageview.CircularImageView r4 = r10.A00
            r0 = 8
            r4.setVisibility(r0)
            goto L_0x0546
        L_0x0553:
            r11 = r3
            X.UnK r11 = (X.C16031UnK) r11
            boolean r13 = X.AnonymousClass7TF.A1U(r2, r1, r0)
            com.instagram.common.ui.base.IgTextView r5 = r11.A01
            java.lang.String r7 = r1.A06
            r4 = 8
            if (r7 == 0) goto L_0x0563
            r4 = 0
        L_0x0563:
            r5.setVisibility(r4)
            r5.setText(r7)
            com.instagram.common.ui.base.IgLinearLayout r12 = r11.A00
            r12.removeAllViews()
            java.util.List r4 = r1.A08
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r10 = r4.iterator()
        L_0x0579:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto L_0x059e
            java.lang.Object r8 = r10.next()
            r4 = r8
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r4 = (com.instagram.leadgen.core.model.LeadGenFormBaseQuestion) r4
            X.Uxp r7 = r4.A03
            X.Uxp r4 = X.C16595Uxp.A0O
            if (r7 != r4) goto L_0x0591
            boolean r4 = r1.A0F
            if (r4 == 0) goto L_0x0591
            goto L_0x0579
        L_0x0591:
            X.Uxp r4 = X.C16595Uxp.A0A
            if (r7 != r4) goto L_0x059a
            boolean r4 = r1.A0E
            if (r4 == 0) goto L_0x059a
            goto L_0x0579
        L_0x059a:
            r9.add(r8)
            goto L_0x0579
        L_0x059e:
            java.util.Iterator r14 = r9.iterator()
        L_0x05a2:
            boolean r4 = r14.hasNext()
            if (r4 == 0) goto L_0x0654
            java.lang.Object r10 = r14.next()
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r10 = (com.instagram.leadgen.core.model.LeadGenFormBaseQuestion) r10
            X.Uxp r4 = r10.A03
            int r4 = r4.ordinal()
            switch(r4) {
                case 0: goto L_0x05a2;
                case 1: goto L_0x05a2;
                case 2: goto L_0x05a2;
                case 3: goto L_0x05a2;
                case 5: goto L_0x0616;
                case 10: goto L_0x063f;
                case 11: goto L_0x05ef;
                case 12: goto L_0x05ef;
                case 22: goto L_0x0616;
                case 33: goto L_0x05a2;
                default: goto L_0x05b7;
            }
        L_0x05b7:
            android.content.Context r8 = X.JTQ.A06(r11)
            r4 = 0
            X.Un0 r7 = new X.Un0
            r7.<init>(r8, r4, r2)
        L_0x05c1:
            X.U6n r7 = (X.C14746U6n) r7
            if (r7 == 0) goto L_0x05a2
            boolean r8 = r1.A0B
            boolean r4 = r1.A0A
            r7.A0G(r10, r2, r8, r4)
            X.WYd r4 = new X.WYd
            r4.<init>(r0, r13)
            r7.A01 = r4
            X.WYi r4 = new X.WYi
            r4.<init>(r0)
            r7.A02 = r4
            boolean r4 = r1.A0G
            if (r4 == 0) goto L_0x05eb
            boolean r4 = r7 instanceof X.Un0
            if (r4 == 0) goto L_0x05eb
            r8 = r7
            X.Un0 r8 = (X.Un0) r8
            if (r8 == 0) goto L_0x05eb
            r4 = 6
            r8.setImeOption(r4)
        L_0x05eb:
            r12.addView(r7)
            goto L_0x05a2
        L_0x05ef:
            boolean r4 = r10.A0J
            if (r4 == 0) goto L_0x05b7
            boolean r4 = r1.A0B
            android.content.Context r9 = X.JTQ.A06(r11)
            r8 = 0
            if (r4 == 0) goto L_0x0609
            r7 = 22
            X.MPB r4 = new X.MPB
            r4.<init>((int) r7, (java.lang.Object) r0, (java.lang.Object) r10)
            com.instagram.leadgen.core.ui.LeadGenFormPrismZipView r7 = new com.instagram.leadgen.core.ui.LeadGenFormPrismZipView
            r7.<init>(r9, r8, r2, r4)
            goto L_0x05c1
        L_0x0609:
            r7 = 23
            X.MPB r4 = new X.MPB
            r4.<init>((int) r7, (java.lang.Object) r0, (java.lang.Object) r10)
            com.instagram.leadgen.core.ui.LeadGenFormZipView r7 = new com.instagram.leadgen.core.ui.LeadGenFormZipView
            r7.<init>(r9, r8, r2, r4)
            goto L_0x05c1
        L_0x0616:
            boolean r4 = r10.A0J
            if (r4 == 0) goto L_0x05b7
            boolean r4 = r1.A0B
            android.content.Context r9 = X.JTQ.A06(r11)
            r8 = 0
            if (r4 == 0) goto L_0x0632
            r7 = 20
            X.MPB r4 = new X.MPB
            r4.<init>((int) r7, (java.lang.Object) r0, (java.lang.Object) r10)
            X.Umv r7 = new X.Umv
            r7.<init>(r9, r8, r2)
            r7.A01 = r4
            goto L_0x05c1
        L_0x0632:
            r7 = 21
            X.MPB r4 = new X.MPB
            r4.<init>((int) r7, (java.lang.Object) r0, (java.lang.Object) r10)
            X.Umu r7 = new X.Umu
            r7.<init>(r9, r8, r2, r4)
            goto L_0x05c1
        L_0x063f:
            android.content.Context r9 = X.JTQ.A06(r11)
            r8 = 0
            r7 = 19
            X.MPB r4 = new X.MPB
            r4.<init>((int) r7, (java.lang.Object) r0, (java.lang.Object) r10)
            X.Umt r7 = new X.Umt
            r7.<init>(r9, r8, r2)
            r7.A00 = r4
            goto L_0x05c1
        L_0x0654:
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r7 = r11.A09
            if (r7 == 0) goto L_0x0662
            r8 = 54
            X.WBG r4 = new X.WBG
            r4.<init>(r8, r11, r0)
            r7.setPrimaryActionOnClickListener(r4)
        L_0x0662:
            boolean r10 = r1.A0D
            if (r10 == 0) goto L_0x06b0
            com.instagram.common.typedurl.ImageUrl r9 = r1.A01
            if (r9 == 0) goto L_0x06b0
            boolean r0 = r1.A0H
            if (r0 != 0) goto L_0x06b0
            com.instagram.common.ui.widget.imageview.CircularImageView r8 = r11.A03
            r8.setVisibility(r2)
            java.lang.String r4 = "LeadGenShortAnswerQuestionViewHolder"
            X.0xG r0 = new X.0xG
            r0.<init>(r4)
            r8.setUrl(r9, r0)
        L_0x067d:
            com.instagram.common.ui.base.IgTextView r4 = r11.A02
            if (r10 == 0) goto L_0x069b
            r0 = 17
            r4.setGravity(r0)
            r5.setGravity(r0)
            r0 = 2132018660(0x7f1405e4, float:1.9675633E38)
            r4.setTextAppearance(r0)
        L_0x068f:
            X.3aa r0 = X.C244063aa.TITLE
            X.C244083ac.A05(r4, r0)
            X.3aa r0 = X.C244063aa.CAPTION
            X.C244083ac.A05(r5, r0)
            goto L_0x03ec
        L_0x069b:
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r4.setGravity(r0)
            r5.setGravity(r0)
            r0 = 2132018633(0x7f1405c9, float:1.9675578E38)
            r4.setTextAppearance(r0)
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT_BOLD
            r4.setTypeface(r0)
            goto L_0x068f
        L_0x06b0:
            com.instagram.common.ui.widget.imageview.CircularImageView r4 = r11.A03
            r0 = 8
            r4.setVisibility(r0)
            goto L_0x067d
        L_0x06b8:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14792U9h.onBindViewHolder(X.3kE, int):void");
    }

    public final /* bridge */ /* synthetic */ void onViewRecycled(C249703kE r2) {
        C14898UEa uEa = (C14898UEa) r2;
        0qQ.A0B(uEa, 0);
        uEa.A02();
    }

    public final int getItemViewType(int i) {
        int A032 = AnonymousClass0fD.A03(1647839108);
        int ordinal = ((C15045UKy) getItem(i)).A03.ordinal();
        AnonymousClass0fD.A0A(1423493045, A032);
        return ordinal;
    }

    public final void onCurrentListChanged(List list, List list2) {
        C16527UwW uwW;
        AnonymousClass7TG.A1N(list, list2);
        C15998Umf umf = this.A03.A00;
        ViewPager2 viewPager2 = umf.A00;
        if (viewPager2 != null) {
            int i = viewPager2.A00;
            C15045UKy uKy = (C15045UKy) 00k.A0O(list, i);
            C16527UwW uwW2 = null;
            if (uKy != null) {
                uwW = uKy.A03;
            } else {
                uwW = null;
            }
            C15045UKy uKy2 = (C15045UKy) 00k.A0O(list2, i);
            if (uKy2 != null) {
                uwW2 = uKy2.A03;
            }
            C16527UwW uwW3 = C16527UwW.LOADING;
            if (uwW == uwW3 && uwW2 != uwW3) {
                C13990Tnq.A0R(umf).A03(i);
            }
        }
    }
}
