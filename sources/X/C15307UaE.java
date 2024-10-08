package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.checkbox.IgdsCheckBox;
import com.instagram.leadgen.core.api.LeadGenInfoFieldTypes;
import com.instagram.leadgen.organic.model.LeadFormCustomQuestion;
import com.instagram.leadgen.organic.model.LeadGenFormData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.UaE  reason: case insensitive filesystem */
public final class C15307UaE extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "LeadGenCreateFormFragmentV2";
    public IgdsBottomButtonLayout A00;
    public W0D A01;
    public C262204Co A02;
    public final List A03 = new ArrayList();
    public final AnonymousClass0eM A04;

    public final void configureActionBar(2da r7) {
        0qQ.A0B(r7, 0);
        C13992Tns.A0s(r7, getString(2131964777));
        W0D A002 = W0D.A00(this, r7);
        this.A01 = A002;
        A002.A04(true);
        String A0m = DbU.A0m(this, 2131964784);
        WBA wba = new WBA((Object) this, 33);
        2da r0 = A002.A01;
        r0.Eiy(A0m, wba);
        r0.ARb(0, false);
        W0D w0d = this.A01;
        if (w0d != null) {
            w0d.A01.ARb(0, true);
        }
    }

    public final String getModuleName() {
        return "lead_gen_create_form_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass0eM r5 = this.A04;
        C14787U8y A0T = C13990Tnq.A0T(r5);
        WYZ wyz = A0T.A04;
        Long l = A0T.A07;
        String str2 = A0T.A08;
        0qQ.A0B(str2, 1);
        WYZ.A03(wyz, l, "lead_gen_create_form", "create_form_screen_impression", str2);
        C14787U8y A0T2 = C13990Tnq.A0T(r5);
        C59732JVq jVq = A0T2.A01;
        LeadGenFormData leadGenFormData = A0T2.A06;
        jVq.A01 = leadGenFormData.A09;
        jVq.A00 = leadGenFormData.A07;
        jVq.A02 = leadGenFormData.A0A;
        View A0G = AnonymousClass7TF.A0G(view, R.id.add_custom_question_row);
        boolean z = false;
        float f = 0.4f;
        if (C14787U8y.A00(r5).A06.size() < 3) {
            z = true;
            f = 1.0f;
        }
        A0G.setAlpha(f);
        AnonymousClass0fU.A00(new WB2(6, (Object) this, z), A0G);
        AnonymousClass7TF.A0G(view, R.id.name_subtitle).setVisibility(8);
        IgdsCheckBox igdsCheckBox = (IgdsCheckBox) AnonymousClass7TF.A0F(view, R.id.phone_checkbox);
        LeadGenInfoFieldTypes leadGenInfoFieldTypes = LeadGenInfoFieldTypes.PHONE;
        igdsCheckBox.post(new C20230WnU(igdsCheckBox, C13990Tnq.A0T(r5).A01.A01));
        C18922WCz.A00(igdsCheckBox, this, leadGenInfoFieldTypes, 3);
        IgdsCheckBox igdsCheckBox2 = (IgdsCheckBox) AnonymousClass7TF.A0F(view, R.id.email_checkbox);
        LeadGenInfoFieldTypes leadGenInfoFieldTypes2 = LeadGenInfoFieldTypes.A0A;
        igdsCheckBox2.post(new C20230WnU(igdsCheckBox2, C13990Tnq.A0T(r5).A01.A00));
        C18922WCz.A00(igdsCheckBox2, this, leadGenInfoFieldTypes2, 3);
        IgdsCheckBox igdsCheckBox3 = (IgdsCheckBox) AnonymousClass7TF.A0F(view, R.id.zip_checkbox);
        LeadGenInfoFieldTypes leadGenInfoFieldTypes3 = LeadGenInfoFieldTypes.ZIP;
        igdsCheckBox3.post(new C20230WnU(igdsCheckBox3, C13990Tnq.A0T(r5).A01.A02));
        C18922WCz.A00(igdsCheckBox3, this, leadGenInfoFieldTypes3, 3);
        Dbb.A0t(view, R.id.zip_checkbox_container, 0);
        View A0G2 = AnonymousClass7TF.A0G(view, R.id.see_all_row);
        A0G2.setVisibility(8);
        DbU.A1G(AnonymousClass7TG.A0R(A0G2, R.id.primary_text), this, 2131970406);
        List list = this.A03;
        List A1P = 0sr.A1P(new Integer[]{Integer.valueOf(R.id.question_1), Integer.valueOf(R.id.question_2), Integer.valueOf(R.id.question_3)});
        ArrayList A0r = AnonymousClass7TG.A0r(A1P);
        Iterator it = A1P.iterator();
        while (it.hasNext()) {
            A0r.add(view.requireViewById(AnonymousClass7TG.A0F(it)));
        }
        Iterator it2 = A0r.iterator();
        while (it2.hasNext()) {
            View A0H = JTO.A0H(it2);
            0qQ.A0A(A0H);
            A0H.setVisibility(8);
        }
        list.addAll(A0r);
        int size = C14787U8y.A00(r5).A06.size();
        for (int i = 0; i < size; i++) {
            View view2 = (View) 00k.A0O(list, i);
            if (view2 != null) {
                view2.setVisibility(0);
                WB1.A00(view2, this, i, 8);
                TextView A0R = AnonymousClass7TG.A0R(view2, R.id.primary_text);
                LeadFormCustomQuestion leadFormCustomQuestion = (LeadFormCustomQuestion) 00k.A0O(C14787U8y.A00(r5).A06, i);
                if (leadFormCustomQuestion != null) {
                    str = leadFormCustomQuestion.A01;
                } else {
                    str = null;
                }
                A0R.setText(str);
            }
        }
        Drawable drawable = requireContext().getDrawable(R.drawable.instagram_chevron_right_pano_outline_8);
        if (drawable != null) {
            DbX.A11(requireContext(), drawable, 2Yu.A09(getContext()));
        } else {
            drawable = null;
        }
        TextView A0R2 = AnonymousClass7TG.A0R(view, R.id.advanced_settings_text_view);
        A0R2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        WBA.A00(A0R2, 30, this);
        IgdsBottomButtonLayout A0Q = C13990Tnq.A0Q(view);
        this.A00 = A0Q;
        if (A0Q != null) {
            A0Q.setFooterText(VK1.A00.A08(getActivity(), requireContext(), C13990Tnq.A0T(r5).A02));
            A0Q.setPrimaryAction(getString(2131964789), new WBA((Object) this, 31));
        }
        DbV.A1F(getViewLifecycleOwner(), C13990Tnq.A0T(r5).A00, new C20786Wyx(this, 34), 14);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return C13990Tnq.A0T(this.A04).A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003b, code lost:
        if (r2 != false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002b, code lost:
        if (r1.A02 != false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onBackPressed() {
        /*
            r7 = this;
            X.0eM r6 = r7.A04
            X.U8y r0 = X.C13990Tnq.A0T(r6)
            X.2Fk r0 = r0.A00
            java.lang.Object r0 = r0.A02()
            r5 = 1
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r5)
            if (r0 != 0) goto L_0x008c
            android.view.View r0 = X.C13991Tnr.A06(r7)
            X.0nA.A0N(r0)
            X.U8y r0 = X.C13990Tnq.A0T(r6)
            X.JVq r1 = r0.A01
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x002d
            boolean r0 = r1.A01
            if (r0 != 0) goto L_0x002d
            boolean r0 = r1.A02
            r2 = 0
            if (r0 == 0) goto L_0x002e
        L_0x002d:
            r2 = 1
        L_0x002e:
            com.instagram.leadgen.organic.model.LeadGenFormData r0 = X.C14787U8y.A00(r6)
            java.util.ArrayList r0 = r0.A06
            boolean r0 = X.DbT.A1b(r0)
            if (r0 != 0) goto L_0x003d
            r1 = 0
            if (r2 == 0) goto L_0x003e
        L_0x003d:
            r1 = 1
        L_0x003e:
            X.U8y r0 = X.C13990Tnq.A0T(r6)
            if (r1 == 0) goto L_0x008d
            X.WYZ r4 = r0.A04
            java.lang.Long r3 = r0.A07
            java.lang.String r2 = r0.A08
            X.0qQ.A0B(r2, r5)
            java.lang.String r1 = "lead_gen_create_form"
            java.lang.String r0 = "discard_form_confirmation_action_sheet_impression"
            X.WYZ.A02(r4, r3, r1, r0, r2)
            android.content.Context r1 = r7.requireContext()
            X.U8y r0 = X.C13990Tnq.A0T(r6)
            com.instagram.common.session.UserSession r0 = r0.A02
            X.Dg1 r3 = new X.Dg1
            r3.<init>(r1, r0)
            android.content.Context r1 = r7.requireContext()
            r0 = 2131964774(0x7f133366, float:1.956634E38)
            java.lang.String r2 = r1.getString(r0)
            android.content.Context r1 = r7.requireContext()
            r0 = 2131964773(0x7f133365, float:1.9566337E38)
            java.lang.String r0 = r1.getString(r0)
            r3.A0D(r2, r0)
            r2 = 2131964772(0x7f133364, float:1.9566335E38)
            r1 = 32
            X.WBA r0 = new X.WBA
            r0.<init>((java.lang.Object) r7, (int) r1)
            r3.A02(r0, r2)
            X.C49945FFy.A00(r7, r3)
        L_0x008c:
            return r5
        L_0x008d:
            r0.A02()
            X.U8y r0 = X.C13990Tnq.A0T(r6)
            X.WYZ r4 = r0.A04
            java.lang.Long r3 = r0.A07
            java.lang.String r2 = r0.A08
            X.0qQ.A0B(r2, r5)
            java.lang.String r1 = "lead_gen_create_form"
            java.lang.String r0 = "cancel"
            X.WYZ.A02(r4, r3, r1, r0, r2)
            A00(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15307UaE.onBackPressed():boolean");
    }

    public C15307UaE() {
        C20691WxN wxN = new C20691WxN(this, 40);
        AnonymousClass0eM A002 = C20691WxN.A00(new C20691WxN(this, 37), 0eO.A02, 38);
        this.A04 = new C227862kA(new C20691WxN(A002, 39), wxN, new C20612Wvt(14, (Object) null, A002), new 0Yh(C14787U8y.class));
    }

    public static final void A00(C15307UaE uaE) {
        C13990Tnq.A0y(uaE.requireActivity(), C13990Tnq.A0T(uaE.A04).A02);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-2060144653);
        C15307UaE.super.onCreate(bundle);
        C14787U8y A0T = C13990Tnq.A0T(this.A04);
        Context requireContext = requireContext();
        LeadGenFormData leadGenFormData = A0T.A06;
        if (leadGenFormData.A04.length() == 0) {
            leadGenFormData.A00(W33.A02(requireContext));
        }
        AnonymousClass0fD.A09(-1780625040, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1933020551);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_lead_gen_create_form, viewGroup, false);
        AnonymousClass0fD.A09(-256843372, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-685860793);
        super.onDestroyView();
        this.A00 = null;
        this.A03.clear();
        AnonymousClass0fD.A09(647858112, A022);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.07Z, androidx.fragment.app.Fragment, X.UaE] */
    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(1091322285);
        C15307UaE.super.onStart();
        this.A02 = C20592WvV.A00(this, C13990Tnq.A0T(this.A04).A0A, 30);
        AnonymousClass0fD.A09(-746303718, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-915431612);
        C15307UaE.super.onStop();
        this.A02 = JTQ.A0n(this.A02);
        AnonymousClass0fD.A09(1886569171, A022);
    }
}
