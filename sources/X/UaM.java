package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.leadgen.core.api.LeadForm;
import com.instagram.ui.widget.radiogroup.IgRadioGroup;

public final class UaM extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "LeadGenManageFormsFragment";
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public IgdsBottomButtonLayout A04;
    public IgRadioGroup A05;
    public W0D A06;
    public C262204Co A07;
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09;

    public static final void A01(UaM uaM, boolean z, boolean z2) {
        AnonymousClass6ST r10 = new AnonymousClass6ST(uaM.requireContext(), true);
        r10.A00(uaM.requireContext().getString(2131969783));
        r10.setCancelable(false);
        C16060Unn A022 = uaM.A02();
        boolean z3 = z;
        A022.A04.A06(A022.A06, C13989Tnp.A0p(A022.A03), A022.A07, z3, z2);
        DbV.A1F(uaM.getViewLifecycleOwner(), ((U8M) uaM.A08.getValue()).A00, new C14307Tth(uaM, r10, 2, z2, z3), 16);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003e, code lost:
        if (r1.A00 == null) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void configureActionBar(X.2da r4) {
        /*
            r3 = this;
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.Unn r0 = r3.A02()
            X.Uxw r1 = r0.A05
            X.Uxw r0 = X.C16602Uxw.A04
            if (r1 != r0) goto L_0x0045
            java.lang.String r0 = ""
        L_0x0010:
            X.C13992Tns.A0s(r4, r0)
            X.Unn r0 = r3.A02()
            boolean r0 = r0.A09
            if (r0 != 0) goto L_0x0044
            X.W0D r2 = X.W0D.A00(r3, r4)
            r3.A06 = r2
            r1 = 9
            X.WBA r0 = new X.WBA
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.A02(r0)
            X.W0D r2 = r3.A06
            if (r2 == 0) goto L_0x0044
            X.Unn r0 = r3.A02()
            com.instagram.leadgen.core.model.LeadGenBaseFormList r1 = r0.A02()
            com.instagram.leadgen.core.api.LeadForm r0 = r1.A01
            if (r0 == 0) goto L_0x0040
            com.instagram.api.schemas.XIGIGBoostCallToAction r1 = r1.A00
            r0 = 1
            if (r1 != 0) goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            r2.A03(r0)
        L_0x0044:
            return
        L_0x0045:
            r0 = 2131964829(0x7f13339d, float:1.956645E38)
            java.lang.String r0 = r3.getString(r0)
            X.0qQ.A0A(r0)
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UaM.configureActionBar(X.2da):void");
    }

    public final String getModuleName() {
        return "lead_gen_manage_forms_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A02 = view.requireViewById(R.id.lead_form_list_loading_spinner);
        this.A00 = view.requireViewById(R.id.lead_gen_fragment_content);
        this.A05 = (IgRadioGroup) view.requireViewById(R.id.lead_form_radio_group);
        this.A03 = view.requireViewById(R.id.see_all_row);
        this.A04 = C13990Tnq.A0Q(view);
        DbV.A1F(getViewLifecycleOwner(), A02().A03, new C20786Wyx(this, 22), 9);
        DbV.A1F(getViewLifecycleOwner(), A02().A04, new MPB(18, (Object) view, (Object) this), 9);
    }

    public final C16060Unn A02() {
        return (C16060Unn) this.A09.getValue();
    }

    public UaM() {
        C20700WxW wxW = new C20700WxW(this, 26);
        C20700WxW wxW2 = new C20700WxW(this, 19);
        0eO r8 = 0eO.A02;
        AnonymousClass0eM A002 = C20700WxW.A00(wxW2, r8, 20);
        this.A09 = new C227862kA(new C20700WxW(A002, 21), wxW, new C20612Wvt(22, (Object) null, A002), new 0Yh(C16060Unn.class));
        C20700WxW wxW3 = new C20700WxW(this, 25);
        AnonymousClass0eM A003 = C20700WxW.A00(new C20700WxW(this, 22), r8, 23);
        this.A08 = new C227862kA(new C20700WxW(A003, 24), wxW3, new C20612Wvt(23, (Object) null, A003), new 0Yh(U8M.class));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if (r1.A00 == null) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r1.A00 == null) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.UaM r3) {
        /*
            X.Unn r0 = r3.A02()
            boolean r0 = r0.A09
            if (r0 == 0) goto L_0x0022
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r2 = r3.A04
            if (r2 == 0) goto L_0x0021
            X.Unn r0 = r3.A02()
            com.instagram.leadgen.core.model.LeadGenBaseFormList r1 = r0.A02()
            com.instagram.leadgen.core.api.LeadForm r0 = r1.A01
            if (r0 == 0) goto L_0x001d
            com.instagram.api.schemas.XIGIGBoostCallToAction r1 = r1.A00
            r0 = 1
            if (r1 != 0) goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            r2.setPrimaryButtonEnabled(r0)
        L_0x0021:
            return
        L_0x0022:
            X.W0D r2 = r3.A06
            if (r2 == 0) goto L_0x0021
            X.Unn r0 = r3.A02()
            com.instagram.leadgen.core.model.LeadGenBaseFormList r1 = r0.A02()
            com.instagram.leadgen.core.api.LeadForm r0 = r1.A01
            if (r0 == 0) goto L_0x0037
            com.instagram.api.schemas.XIGIGBoostCallToAction r1 = r1.A00
            r0 = 1
            if (r1 != 0) goto L_0x0038
        L_0x0037:
            r0 = 0
        L_0x0038:
            r2.A03(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UaM.A00(X.UaM):void");
    }

    public final void A03() {
        String str;
        int i;
        int i2;
        LeadForm leadForm = A02().A03.A01;
        String str2 = null;
        if (leadForm != null) {
            str = leadForm.A03;
        } else {
            str = null;
        }
        LeadForm leadForm2 = A02().A01;
        if (leadForm2 != null) {
            str2 = leadForm2.A03;
        }
        boolean z = !0qQ.A0K(str, str2);
        boolean z2 = false;
        boolean A1a = C51969G9p.A1a(A02().A03.A00, A02().A00);
        if (A02().A00 == null) {
            z2 = true;
        }
        if (!z && !A1a) {
            C250563lf.A0Z(requireActivity(), A02().A02);
        } else if (z2) {
            A01(this, true, true);
        } else {
            C358248ab A0H = Dba.A0H(this);
            A0H.A0s(true);
            if (z) {
                i = 2131964875;
                if (A1a) {
                    i = 2131964877;
                }
            } else {
                i = 0;
                if (A1a) {
                    i = 2131964876;
                }
            }
            A0H.A09(i);
            if (z) {
                i2 = 2131964873;
                if (A1a) {
                    i2 = 2131964872;
                }
            } else {
                i2 = 0;
                if (A1a) {
                    i2 = 2131964871;
                }
            }
            A0H.A08(i2);
            A0H.A0I(new LUU(this, 1, z, A1a), 2131964874);
            A0H.A0H(new LUU(this, 2, z, A1a), 2131964870);
            A0H.A0B(new W4Z(this, 0, z, A1a));
            A0H.A0g(new C18845W5o(this, 0, z, A1a));
            DbT.A1V(A0H);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return A02().A01();
    }

    public final boolean onBackPressed() {
        C16060Unn A022 = A02();
        C18028Vk6 vk6 = A022.A05;
        String A032 = A022.A03();
        0qQ.A0B(A032, 0);
        XB6.A01(vk6.A00, A032, "lead_gen_manage_lead_forms_and_cta", "cancel");
        return A02().A02;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1071905143);
        UaM.super.onCreate(bundle);
        C16060Unn A023 = A02();
        A023.A00 = A023.A03.A00;
        C16060Unn A024 = A02();
        FragmentActivity requireActivity = requireActivity();
        String str = A024.A00;
        if (str != null) {
            C14785U8v.A00(A024, str);
        } else {
            C18794W2b.A02(requireActivity, AnonymousClass07i.A00(requireActivity), new C19182WOo((Object) A024, 3), A024.A01(), false);
        }
        AnonymousClass0fD.A09(-481085528, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1689995325);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.lead_gen_manage_forms_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-768294279, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-594585239);
        super.onDestroyView();
        this.A02 = null;
        this.A00 = null;
        this.A05 = null;
        this.A03 = null;
        this.A01 = null;
        this.A04 = null;
        this.A06 = null;
        AnonymousClass0fD.A09(-1632203289, A022);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.07Z, X.UaM, androidx.fragment.app.Fragment] */
    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(-1068257244);
        UaM.super.onStart();
        this.A07 = C20592WvV.A00(this, A02().A07, 20);
        AnonymousClass0fD.A09(7621792, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(941528203);
        UaM.super.onStop();
        this.A07 = JTQ.A0n(this.A07);
        AnonymousClass0fD.A09(-678752561, A022);
    }
}
