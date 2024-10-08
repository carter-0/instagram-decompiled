package X;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import com.instagram.android.R;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.leadgen.core.ui.LeadGenCreateFormImageView;
import com.instagram.leadgen.organic.model.LeadGenFormData;
import com.instagram.ui.widget.textview.IgAutoCompleteTextView;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;

/* renamed from: X.UaN  reason: case insensitive filesystem */
public abstract class C15315UaN extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "LeadGenCreateFormBaseFragment";
    public View A00;
    public View A01;
    public Group A02;
    public Group A03;
    public NestedScrollView A04;
    public IgTextView A05;
    public IgdsBottomButtonLayout A06;
    public LeadGenCreateFormImageView A07;
    public IgAutoCompleteTextView A08;
    public AnonymousClass3E6 A09;
    public W0D A0A;
    public C262204Co A0B;
    public C262204Co A0C;
    public final Rect A0D = new Rect();
    public final List A0E = new ArrayList();
    public final AnonymousClass0eM A0F = new C227862kA(new C20696WxS(this, 40), new C20696WxS(this, 39), new C73666Phf(48, (Object) null, this), new 0Yh(C60247Ji4.class));
    public final C252213ok A0G = new WTW(this, 1);

    public final void configureActionBar(2da r3) {
        String A0m;
        0qQ.A0B(r3, 0);
        if (DbX.A1b(A02().A05)) {
            A0m = getString(2131964790);
        } else if (this instanceof C16000Umh) {
            A0m = DbU.A0m(this, 2131964777);
        } else {
            A0m = DbU.A0m(this, 2131970571);
        }
        0qQ.A0A(A0m);
        C13992Tns.A0s(r3, A0m);
        this.A0A = W0D.A00(this, r3);
        A01(this, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x019e, code lost:
        if (r0 == false) goto L_0x01a0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r9, android.os.Bundle r10) {
        /*
            r8 = this;
            r3 = 0
            X.0qQ.A0B(r9, r3)
            super.onViewCreated(r9, r10)
            X.U8w r1 = r8.A02()
            boolean r0 = r1 instanceof X.C16045UnY
            if (r0 == 0) goto L_0x024f
            X.UnY r1 = (X.C16045UnY) r1
            X.WYZ r5 = r1.A02
            java.lang.Long r4 = r1.A05
            java.lang.String r2 = X.C14786U8w.A00(r1)
            java.lang.String r1 = "lead_gen_create_form"
            java.lang.String r0 = "create_form_screen_impression"
            X.WYZ.A03(r5, r4, r1, r0, r2)
        L_0x0020:
            X.U8w r0 = r8.A02()
            r0.A05()
            r0 = 2131435343(0x7f0b1f4f, float:1.8492525E38)
            android.view.View r0 = r9.findViewById(r0)
            androidx.core.widget.NestedScrollView r0 = (androidx.core.widget.NestedScrollView) r0
            r8.A04 = r0
            r0 = 2131437234(0x7f0b26b2, float:1.849636E38)
            android.view.View r0 = r9.requireViewById(r0)
            androidx.constraintlayout.widget.Group r0 = (androidx.constraintlayout.widget.Group) r0
            r8.A03 = r0
            r0 = 2131433858(0x7f0b1982, float:1.8489514E38)
            android.view.View r0 = r9.requireViewById(r0)
            androidx.constraintlayout.widget.Group r0 = (androidx.constraintlayout.widget.Group) r0
            r8.A02 = r0
            r0 = 2131433845(0x7f0b1975, float:1.8489487E38)
            android.view.View r0 = r9.findViewById(r0)
            r8.A00 = r0
            r0 = 2131427728(0x7f0b0190, float:1.847708E38)
            com.instagram.common.ui.base.IgTextView r0 = X.DbT.A0a(r9, r0)
            r8.A05 = r0
            r0 = 2131430887(0x7f0b0de7, float:1.8483488E38)
            android.view.View r0 = r9.requireViewById(r0)
            com.instagram.leadgen.core.ui.LeadGenCreateFormImageView r0 = (com.instagram.leadgen.core.ui.LeadGenCreateFormImageView) r0
            r8.A07 = r0
            com.instagram.common.ui.base.IgTextView r1 = r8.A05
            if (r1 == 0) goto L_0x006e
            r0 = 62
            X.WB9.A00(r1, r0, r8)
        L_0x006e:
            com.instagram.leadgen.core.ui.LeadGenCreateFormImageView r1 = r8.A07
            if (r1 == 0) goto L_0x0077
            r0 = 63
            X.WB9.A00(r1, r0, r8)
        L_0x0077:
            r0 = 2131443996(0x7f0b411c, float:1.8510076E38)
            android.view.View r2 = r9.findViewById(r0)
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r2 = (com.instagram.ui.widget.textview.IgAutoCompleteTextView) r2
            r8.A08 = r2
            if (r2 == 0) goto L_0x00b9
            r1 = 8
            X.WBI r0 = new X.WBI
            r0.<init>(r8, r1)
            r2.setOnFocusChangeListener(r0)
            r0 = 6
            r2.setImeOptions(r0)
            r0 = 1
            r2.setRawInputType(r0)
            r1 = 60
            android.text.InputFilter$LengthFilter r0 = new android.text.InputFilter$LengthFilter
            r0.<init>(r1)
            android.text.InputFilter$LengthFilter[] r0 = new android.text.InputFilter.LengthFilter[]{r0}
            r2.setFilters(r0)
            X.U8w r0 = r8.A02()
            java.lang.String r0 = r0.A03()
            r2.setText(r0)
            r1 = 11
            X.W7b r0 = new X.W7b
            r0.<init>(r8, r1)
            r2.addTextChangedListener(r0)
        L_0x00b9:
            r0 = 2131443995(0x7f0b411b, float:1.8510074E38)
            android.view.View r1 = r9.findViewById(r0)
            r8.A01 = r1
            if (r1 == 0) goto L_0x00c9
            X.WAw r0 = X.C18884WAw.A00
            X.AnonymousClass0fU.A00(r0, r1)
        L_0x00c9:
            r0 = 2131427699(0x7f0b0173, float:1.8477022E38)
            android.view.View r5 = X.AnonymousClass7TF.A0G(r9, r0)
            X.U8w r0 = r8.A02()
            int r4 = r0.A01()
            r1 = 3
            r2 = 0
            r0 = 1053609165(0x3ecccccd, float:0.4)
            if (r4 >= r1) goto L_0x00e2
            r2 = 1
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x00e2:
            r5.setAlpha(r0)
            r1 = 1
            X.WB2 r0 = new X.WB2
            r0.<init>((X.C15315UaN) r8, (int) r1, (boolean) r2)
            X.AnonymousClass0fU.A00(r0, r5)
            X.U8w r1 = r8.A02()
            boolean r0 = r1 instanceof X.C16046UnZ
            if (r0 == 0) goto L_0x0116
            X.UnZ r1 = (X.C16046UnZ) r1
            boolean r0 = r1.A0A
            if (r0 == 0) goto L_0x0116
            r0 = 2131431216(0x7f0b0f30, float:1.8484155E38)
            android.widget.TextView r1 = X.DbU.A0G(r9, r0)
            r0 = 2131964764(0x7f13335c, float:1.9566319E38)
            X.DbU.A1G(r1, r8, r0)
            r0 = 2131431215(0x7f0b0f2f, float:1.8484153E38)
            android.widget.TextView r1 = X.DbU.A0G(r9, r0)
            r0 = 2131964762(0x7f13335a, float:1.9566315E38)
            X.DbU.A1G(r1, r8, r0)
        L_0x0116:
            r0 = 2131436785(0x7f0b24f1, float:1.849545E38)
            android.view.View r2 = X.AnonymousClass7TF.A0G(r9, r0)
            X.U8w r1 = r8.A02()
            boolean r0 = r1 instanceof X.C16046UnZ
            if (r0 == 0) goto L_0x024c
            X.UnZ r1 = (X.C16046UnZ) r1
            boolean r0 = r1.A09
        L_0x0129:
            r0 = r0 ^ 1
            r4 = 0
            int r0 = X.DbW.A01(r0)
            r2.setVisibility(r0)
            r0 = 2131437616(0x7f0b2830, float:1.8497136E38)
            android.view.View r5 = X.AnonymousClass7TF.A0F(r9, r0)
            com.instagram.igds.components.checkbox.IgdsCheckBox r5 = (com.instagram.igds.components.checkbox.IgdsCheckBox) r5
            com.instagram.leadgen.core.api.LeadGenInfoFieldTypes r2 = com.instagram.leadgen.core.api.LeadGenInfoFieldTypes.PHONE
            X.U8w r0 = r8.A02()
            X.JVq r0 = r0.A01
            boolean r1 = r0.A01
            X.WnQ r0 = new X.WnQ
            r0.<init>(r5, r1)
            r5.post(r0)
            X.C18922WCz.A00(r5, r8, r2, r3)
            r0 = 2131432278(0x7f0b1356, float:1.8486309E38)
            android.view.View r5 = X.AnonymousClass7TF.A0F(r9, r0)
            com.instagram.igds.components.checkbox.IgdsCheckBox r5 = (com.instagram.igds.components.checkbox.IgdsCheckBox) r5
            com.instagram.leadgen.core.api.LeadGenInfoFieldTypes r2 = com.instagram.leadgen.core.api.LeadGenInfoFieldTypes.A0A
            X.U8w r0 = r8.A02()
            X.JVq r0 = r0.A01
            boolean r1 = r0.A00
            X.WnQ r0 = new X.WnQ
            r0.<init>(r5, r1)
            r5.post(r0)
            X.C18922WCz.A00(r5, r8, r2, r3)
            X.U8w r1 = r8.A02()
            X.JVq r0 = r1.A01
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x022c
            boolean r0 = r1 instanceof X.C16045UnY
            if (r0 != 0) goto L_0x022c
            X.UnZ r1 = (X.C16046UnZ) r1
            boolean r0 = r1.A07
            if (r0 == 0) goto L_0x022c
        L_0x0183:
            r0 = 2131444114(0x7f0b4192, float:1.8510315E38)
            android.view.View r2 = X.AnonymousClass7TF.A0G(r9, r0)
            X.U8w r1 = r8.A02()
            X.JVq r0 = r1.A01
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x01a0
            boolean r0 = r1 instanceof X.C16045UnY
            if (r0 != 0) goto L_0x01a0
            X.UnZ r1 = (X.C16046UnZ) r1
            boolean r0 = r1.A07
            r1 = 8
            if (r0 != 0) goto L_0x01a1
        L_0x01a0:
            r1 = 0
        L_0x01a1:
            r2.setVisibility(r1)
            r0 = 2131440930(0x7f0b3522, float:1.8503857E38)
            android.view.View r2 = X.AnonymousClass7TF.A0G(r9, r0)
            X.U8w r1 = r8.A02()
            X.JVq r0 = r1.A01
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0229
            boolean r0 = r1 instanceof X.C16045UnY
            if (r0 != 0) goto L_0x0229
            X.UnZ r1 = (X.C16046UnZ) r1
            boolean r0 = r1.A07
            if (r0 == 0) goto L_0x0229
        L_0x01bf:
            r2.setVisibility(r4)
            r6 = 2131438192(0x7f0b2a70, float:1.8498304E38)
            android.widget.TextView r1 = X.AnonymousClass7TG.A0R(r2, r6)
            r0 = 2131970406(0x7f134966, float:1.9577762E38)
            X.DbU.A1G(r1, r8, r0)
            r0 = 64
            X.WB9.A00(r2, r0, r8)
            X.U8w r1 = r8.A02()
            boolean r0 = r1 instanceof X.C16046UnZ
            if (r0 == 0) goto L_0x01ef
            X.UnZ r1 = (X.C16046UnZ) r1
            boolean r0 = r1.A0A
            if (r0 == 0) goto L_0x01ef
            r0 = 2131431208(0x7f0b0f28, float:1.8484139E38)
            android.widget.TextView r1 = X.DbU.A0G(r9, r0)
            r0 = 2131964755(0x7f133353, float:1.95663E38)
            X.DbU.A1G(r1, r8, r0)
        L_0x01ef:
            java.util.List r5 = r8.A0E
            r0 = 2131438936(0x7f0b2d58, float:1.8499813E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r4 = 0
            r0 = 2131438937(0x7f0b2d59, float:1.8499815E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131438938(0x7f0b2d5a, float:1.8499817E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer[] r0 = new java.lang.Integer[]{r2, r1, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            java.util.ArrayList r7 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0217:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x025e
            int r0 = X.AnonymousClass7TG.A0F(r1)
            android.view.View r0 = r9.requireViewById(r0)
            r7.add(r0)
            goto L_0x0217
        L_0x0229:
            r4 = 8
            goto L_0x01bf
        L_0x022c:
            r0 = 2131444113(0x7f0b4191, float:1.8510313E38)
            android.view.View r5 = X.AnonymousClass7TF.A0F(r9, r0)
            com.instagram.igds.components.checkbox.IgdsCheckBox r5 = (com.instagram.igds.components.checkbox.IgdsCheckBox) r5
            com.instagram.leadgen.core.api.LeadGenInfoFieldTypes r2 = com.instagram.leadgen.core.api.LeadGenInfoFieldTypes.ZIP
            X.U8w r0 = r8.A02()
            X.JVq r0 = r0.A01
            boolean r1 = r0.A02
            X.WnQ r0 = new X.WnQ
            r0.<init>(r5, r1)
            r5.post(r0)
            X.C18922WCz.A00(r5, r8, r2, r3)
            goto L_0x0183
        L_0x024c:
            r0 = 0
            goto L_0x0129
        L_0x024f:
            X.UnZ r1 = (X.C16046UnZ) r1
            X.WYX r4 = r1.A00
            java.lang.Long r2 = r1.A04
            java.lang.String r1 = "lead_gen_create_form"
            java.lang.String r0 = "create_form_screen_impression"
            X.WYX.A02(r4, r2, r1, r0)
            goto L_0x0020
        L_0x025e:
            java.util.Iterator r2 = r7.iterator()
        L_0x0262:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0275
            android.view.View r1 = X.JTO.A0H(r2)
            X.0qQ.A0A(r1)
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x0262
        L_0x0275:
            r5.addAll(r7)
            X.U8w r0 = r8.A02()
            int r2 = r0.A01()
        L_0x0280:
            if (r4 >= r2) goto L_0x02c9
            java.lang.Object r1 = X.00k.A0O(r5, r4)
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L_0x02b0
            r1.setVisibility(r3)
            r0 = 6
            X.WB1.A00(r1, r8, r4, r0)
            android.widget.TextView r1 = X.AnonymousClass7TG.A0R(r1, r6)
            X.U8w r7 = r8.A02()
            boolean r0 = r7 instanceof X.C16045UnY
            if (r0 == 0) goto L_0x02b3
            X.UnY r7 = (X.C16045UnY) r7
            com.instagram.leadgen.organic.model.LeadGenFormData r0 = r7.A04
            java.util.ArrayList r0 = r0.A06
            java.lang.Object r0 = X.00k.A0O(r0, r4)
            com.instagram.leadgen.organic.model.LeadFormCustomQuestion r0 = (com.instagram.leadgen.organic.model.LeadFormCustomQuestion) r0
            if (r0 == 0) goto L_0x02c7
            java.lang.String r0 = r0.A01
        L_0x02ad:
            r1.setText(r0)
        L_0x02b0:
            int r4 = r4 + 1
            goto L_0x0280
        L_0x02b3:
            X.UnZ r7 = (X.C16046UnZ) r7
            com.instagram.business.promote.model.PromoteData r0 = r7.A02
            java.util.List r0 = r0.A1t
            X.0qQ.A06(r0)
            java.lang.Object r0 = X.00k.A0O(r0, r4)
            X.GSY r0 = (X.GSY) r0
            if (r0 == 0) goto L_0x02c7
            java.lang.String r0 = r0.A03
            goto L_0x02ad
        L_0x02c7:
            r0 = 0
            goto L_0x02ad
        L_0x02c9:
            android.content.Context r1 = r8.requireContext()
            r0 = 2131238092(0x7f081ccc, float:1.8092453E38)
            android.graphics.drawable.Drawable r4 = r1.getDrawable(r0)
            r2 = 0
            if (r4 == 0) goto L_0x0368
            android.content.Context r1 = r8.requireContext()
            android.content.Context r0 = r8.getContext()
            int r0 = X.2Yu.A09(r0)
            X.DbX.A11(r1, r4, r0)
        L_0x02e6:
            r0 = 2131427822(0x7f0b01ee, float:1.8477271E38)
            android.widget.TextView r1 = X.AnonymousClass7TG.A0R(r9, r0)
            r1.setCompoundDrawablesWithIntrinsicBounds(r2, r2, r4, r2)
            r0 = 61
            X.WB9.A00(r1, r0, r8)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r4 = X.C13990Tnq.A0Q(r9)
            r8.A06 = r4
            if (r4 == 0) goto L_0x033e
            r7 = r8
            boolean r6 = r8 instanceof X.C16000Umh
            if (r6 == 0) goto L_0x031f
            X.Umh r7 = (X.C16000Umh) r7
            X.W3L r5 = X.VK1.A00
            android.content.Context r2 = r7.requireContext()
            X.0eM r0 = r7.A00
            java.lang.Object r0 = r0.getValue()
            X.UnY r0 = (X.C16045UnY) r0
            com.instagram.common.session.UserSession r1 = r0.A00
            androidx.fragment.app.FragmentActivity r0 = r7.getActivity()
            android.text.SpannableStringBuilder r0 = r5.A08(r0, r2, r1)
            r4.setFooterText(r0)
        L_0x031f:
            X.U8w r1 = r8.A02()
            boolean r0 = r1 instanceof X.C16045UnY
            if (r0 != 0) goto L_0x035e
            X.UnZ r1 = (X.C16046UnZ) r1
            java.lang.String r0 = r1.A05
            if (r0 == 0) goto L_0x035e
            r0 = 2131964783(0x7f13336f, float:1.9566357E38)
        L_0x0330:
            java.lang.String r2 = r8.getString(r0)
            r1 = 65
            X.WB9 r0 = new X.WB9
            r0.<init>((java.lang.Object) r8, (int) r1)
            r4.setPrimaryAction(r2, r0)
        L_0x033e:
            X.3E5 r1 = X.AnonymousClass3E4.A01(r8, r3, r3)
            r8.A09 = r1
            X.3ok r0 = r8.A0G
            r1.A9Y(r0)
            X.U8w r0 = r8.A02()
            X.2Fk r3 = r0.A00
            X.07Z r2 = r8.getViewLifecycleOwner()
            r0 = 6
            X.Wyx r1 = new X.Wyx
            r1.<init>(r8, r0)
            r0 = 4
            X.DbV.A1F(r2, r3, r1, r0)
            return
        L_0x035e:
            if (r6 == 0) goto L_0x0364
            r0 = 2131964789(0x7f133375, float:1.956637E38)
            goto L_0x0330
        L_0x0364:
            r0 = 2131964767(0x7f13335f, float:1.9566325E38)
            goto L_0x0330
        L_0x0368:
            r4 = r2
            goto L_0x02e6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15315UaN.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A01(C15315UaN uaN, boolean z) {
        W0D w0d = uaN.A0A;
        if (w0d != null) {
            w0d.A04(!z);
            int i = 2131964784;
            if (z) {
                i = 2131964878;
            }
            String A0m = DbU.A0m(uaN, i);
            WB2 wb2 = new WB2(uaN, 2, z);
            2da r0 = w0d.A01;
            r0.Eiy(A0m, wb2);
            r0.ARb(0, false);
            W0D w0d2 = uaN.A0A;
            if (w0d2 != null) {
                w0d2.A01.ARb(0, true);
            }
        }
    }

    public final C14786U8w A02() {
        AnonymousClass0eM r0;
        if (this instanceof C16000Umh) {
            r0 = ((C16000Umh) this).A00;
        } else {
            r0 = ((C15999Umg) this).A00;
        }
        return (C14786U8w) r0.getValue();
    }

    public final void A03() {
        if (this instanceof C16000Umh) {
            C16000Umh umh = (C16000Umh) this;
            C13990Tnq.A0y(umh.requireActivity(), ((C16045UnY) umh.A00.getValue()).A00);
            return;
        }
        DbT.A1I(this);
    }

    public static final void A00(C15315UaN uaN) {
        C14786U8w A022 = uaN.A02();
        if (A022 instanceof C16045UnY) {
            C16045UnY unY = (C16045UnY) A022;
            WYZ.A03(unY.A02, unY.A05, "lead_gen_create_form", "cover_photo_selection_bottom_sheet_impression", C14786U8w.A00(unY));
        } else {
            C16046UnZ unZ = (C16046UnZ) A022;
            WYX.A02(unZ.A00, unZ.A04, "lead_gen_create_form", "cover_photo_selection_bottom_sheet_impression");
        }
        0nA.A0N(C13991Tnr.A06(uaN));
        UYu uYu = new UYu();
        DbZ.A1B(uYu, "IgSessionManager.SESSION_TOKEN_KEY", uaN.A02().A02().A05);
        C331127Pr r1 = new C331127Pr(uaN.A02().A02());
        r1.A0d = uaN.getString(2131964781);
        r1.A1G = true;
        DbS.A1S(r1, true);
        r1.A0T = new C19678Wdg(uYu, 1);
        r1.A0X = new C19689Wdr(uYu);
        DbY.A13(uaN, uYu, r1);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return A02().A02();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
        if (r1.A02 != false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
        if (r2 != false) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onBackPressed() {
        /*
            r6 = this;
            X.U8w r0 = r6.A02()
            X.2Fk r0 = r0.A00
            java.lang.Object r0 = r0.A02()
            X.Jvy r0 = (X.C61060Jvy) r0
            r5 = 1
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.A03
            if (r0 != r5) goto L_0x0014
            return r5
        L_0x0014:
            android.view.View r0 = X.C13991Tnr.A06(r6)
            X.0nA.A0N(r0)
            X.U8w r1 = r6.A02()
            boolean r0 = r1 instanceof X.C16046UnZ
            if (r0 == 0) goto L_0x00cf
            X.UnZ r1 = (X.C16046UnZ) r1
            boolean r2 = r1.A09
        L_0x0027:
            X.U8w r0 = r6.A02()
            X.JVq r1 = r0.A01
            boolean r0 = r1.A00
            if (r2 == 0) goto L_0x00c7
            if (r0 == 0) goto L_0x003c
            boolean r0 = r1.A01
            if (r0 == 0) goto L_0x003c
        L_0x0037:
            boolean r0 = r1.A02
            r2 = 0
            if (r0 == 0) goto L_0x003d
        L_0x003c:
            r2 = 1
        L_0x003d:
            X.U8w r1 = r6.A02()
            boolean r0 = r1 instanceof X.C16045UnY
            if (r0 == 0) goto L_0x00b9
            X.UnY r1 = (X.C16045UnY) r1
            com.instagram.leadgen.organic.model.LeadGenFormData r0 = r1.A04
            java.util.ArrayList r0 = r0.A06
            boolean r0 = X.DbT.A1b(r0)
        L_0x004f:
            if (r0 != 0) goto L_0x0054
            r0 = 0
            if (r2 == 0) goto L_0x0055
        L_0x0054:
            r0 = 1
        L_0x0055:
            X.U8w r1 = r6.A02()
            if (r0 == 0) goto L_0x00d2
            boolean r0 = r1 instanceof X.C16045UnY
            if (r0 == 0) goto L_0x00ab
            X.UnY r1 = (X.C16045UnY) r1
            X.WYZ r4 = r1.A02
            java.lang.Long r3 = r1.A05
            java.lang.String r2 = X.C14786U8w.A00(r1)
            java.lang.String r1 = "lead_gen_create_form"
            java.lang.String r0 = "discard_form_confirmation_action_sheet_impression"
            X.WYZ.A02(r4, r3, r1, r0, r2)
        L_0x0070:
            android.content.Context r1 = r6.requireContext()
            X.U8w r0 = r6.A02()
            com.instagram.common.session.UserSession r0 = r0.A02()
            X.Dg1 r3 = new X.Dg1
            r3.<init>(r1, r0)
            android.content.Context r1 = r6.requireContext()
            r0 = 2131964774(0x7f133366, float:1.956634E38)
            java.lang.String r2 = r1.getString(r0)
            android.content.Context r1 = r6.requireContext()
            r0 = 2131964773(0x7f133365, float:1.9566337E38)
            java.lang.String r0 = r1.getString(r0)
            r3.A0D(r2, r0)
            r2 = 2131964772(0x7f133364, float:1.9566335E38)
            r1 = 66
            X.WB9 r0 = new X.WB9
            r0.<init>((java.lang.Object) r6, (int) r1)
            r3.A02(r0, r2)
            X.C49945FFy.A00(r6, r3)
            return r5
        L_0x00ab:
            X.UnZ r1 = (X.C16046UnZ) r1
            X.WYX r3 = r1.A00
            java.lang.Long r2 = r1.A04
            java.lang.String r1 = "lead_gen_create_form"
            java.lang.String r0 = "discard_form_confirmation_action_sheet_impression"
            X.WYX.A01(r3, r2, r1, r0)
            goto L_0x0070
        L_0x00b9:
            X.UnZ r1 = (X.C16046UnZ) r1
            com.instagram.business.promote.model.PromoteData r0 = r1.A02
            java.util.List r0 = r0.A1t
            X.0qQ.A06(r0)
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            goto L_0x004f
        L_0x00c7:
            if (r0 != 0) goto L_0x003c
            boolean r0 = r1.A01
            if (r0 != 0) goto L_0x003c
            goto L_0x0037
        L_0x00cf:
            r2 = 0
            goto L_0x0027
        L_0x00d2:
            r1.A04()
            X.U8w r1 = r6.A02()
            boolean r0 = r1 instanceof X.C16045UnY
            if (r0 == 0) goto L_0x00f2
            X.UnY r1 = (X.C16045UnY) r1
            X.WYZ r4 = r1.A02
            java.lang.Long r3 = r1.A05
            java.lang.String r2 = X.C14786U8w.A00(r1)
            java.lang.String r1 = "lead_gen_create_form"
            java.lang.String r0 = "cancel"
            X.WYZ.A02(r4, r3, r1, r0, r2)
        L_0x00ee:
            r6.A03()
            return r5
        L_0x00f2:
            X.UnZ r1 = (X.C16046UnZ) r1
            X.WYX r3 = r1.A00
            java.lang.Long r2 = r1.A04
            java.lang.String r1 = "lead_gen_create_form"
            java.lang.String r0 = "cancel"
            X.WYX.A01(r3, r2, r1, r0)
            goto L_0x00ee
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15315UaN.onBackPressed():boolean");
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1232804419);
        C15315UaN.super.onCreate(bundle);
        C14786U8w A023 = A02();
        Context requireContext = requireContext();
        if (A023 instanceof C16045UnY) {
            C16045UnY unY = (C16045UnY) A023;
            LeadGenFormData leadGenFormData = unY.A04;
            if (leadGenFormData.A04.length() == 0) {
                leadGenFormData.A00(W33.A02(requireContext));
            }
            AnonymousClass7TF.A1O(unY.A05, false);
        } else {
            C16046UnZ unZ = (C16046UnZ) A023;
            PromoteData promoteData = unZ.A02;
            String str = promoteData.A1N;
            if (str == null || str.length() == 0) {
                promoteData.A1N = W33.A02(requireContext);
            }
            AnonymousClass7TF.A1O(unZ.A05, false);
            unZ.A04.Epw(promoteData.A0z);
            if (unZ.A09) {
                promoteData.A1s.add(VEP.A00(requireContext, C16604Uxy.A06));
                promoteData.A1s.add(VEP.A00(requireContext, C16604Uxy.A04));
            }
        }
        AnonymousClass0fD.A09(715772090, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(846366407);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_lead_gen_create_form, viewGroup, false);
        AnonymousClass0fD.A09(1294879675, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-885225031);
        super.onDestroy();
        AnonymousClass3E6 r0 = this.A09;
        if (r0 != null) {
            r0.onDestroy();
        }
        AnonymousClass0fD.A09(1550356155, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-61125546);
        super.onDestroyView();
        this.A04 = null;
        this.A06 = null;
        this.A07 = null;
        this.A03 = null;
        this.A08 = null;
        this.A01 = null;
        this.A02 = null;
        this.A00 = null;
        this.A05 = null;
        this.A0E.clear();
        AnonymousClass3E6 r1 = this.A09;
        if (r1 != null) {
            r1.EEH(this.A0G);
        }
        AnonymousClass0fD.A09(-132841912, A022);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.07Z, X.UaN, androidx.fragment.app.Fragment] */
    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(473784600);
        C15315UaN.super.onStart();
        this.A0B = C20592WvV.A00(this, A02().A03, 13);
        this.A0C = C20592WvV.A00(this, ((C60247Ji4) this.A0F.getValue()).A08, 14);
        AnonymousClass3E6 r0 = this.A09;
        if (r0 != null) {
            JTP.A17(this, r0);
        }
        AnonymousClass0fD.A09(1130170888, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-74071909);
        C15315UaN.super.onStop();
        C262204Co r0 = this.A0B;
        if (r0 != null) {
            r0.AG7((CancellationException) null);
        }
        C262204Co r02 = this.A0C;
        if (r02 != null) {
            r02.AG7((CancellationException) null);
        }
        this.A0B = null;
        this.A0C = null;
        AnonymousClass3E6 r03 = this.A09;
        if (r03 != null) {
            r03.onStop();
        }
        AnonymousClass0fD.A09(2122529723, A022);
    }
}
