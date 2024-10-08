package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.leadgen.core.ui.LeadGenFormHeaderView;
import com.instagram.leadgen.core.ui.LeadGenFormHeaderViewWithoutWelcomeMessage;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.LinkedHashMap;
import java.util.Map;

public final class UZQ extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "LeadGenPreviewFragmentV2";
    public IgLinearLayout A00;
    public IgLinearLayout A01;
    public IgTextView A02;
    public IgdsBottomButtonLayout A03;
    public LeadGenFormHeaderViewWithoutWelcomeMessage A04;
    public SpinnerImageView A05;
    public LeadGenFormHeaderView A06;
    public C262204Co A07;
    public final AnonymousClass0eM A08;
    public final Map A09 = new LinkedHashMap();

    public final String getModuleName() {
        return "organic_lead_gen_form_preview";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass0eM r7 = this.A08;
        C14764U8a u8a = (C14764U8a) r7.getValue();
        boolean z = u8a.A0G;
        WYZ wyz = u8a.A08;
        Long l = u8a.A09;
        String str3 = u8a.A0A;
        if (z) {
            0qQ.A0B(str3, 1);
            str = "lead_gen_review_form";
            str2 = "review_lead_gen_form_impression";
        } else {
            0qQ.A0B(str3, 1);
            str = "lead_gen_preview_form";
            str2 = "preview_lead_gen_form_impression";
        }
        WYZ.A03(wyz, l, str, str2, str3);
        this.A05 = DbX.A0k(view);
        DbV.A1F(getViewLifecycleOwner(), ((C14764U8a) r7.getValue()).A04, new C20786Wyx(this, 42), 19);
        C20786Wyx.A00(getViewLifecycleOwner(), ((C14764U8a) r7.getValue()).A03, this, 43, 19);
        this.A03 = C13990Tnq.A0Q(view);
        C20786Wyx.A00(getViewLifecycleOwner(), ((C14764U8a) r7.getValue()).A02, this, 44, 19);
        C20786Wyx.A00(getViewLifecycleOwner(), ((C14764U8a) r7.getValue()).A01, this, 45, 19);
        C20786Wyx.A00(getViewLifecycleOwner(), ((C14764U8a) r7.getValue()).A00, this, 46, 19);
        LeadGenFormHeaderView leadGenFormHeaderView = (LeadGenFormHeaderView) view.findViewById(R.id.lead_form_header_view);
        this.A06 = leadGenFormHeaderView;
        AnonymousClass7TH.A0R(leadGenFormHeaderView);
        this.A04 = (LeadGenFormHeaderViewWithoutWelcomeMessage) view.findViewById(R.id.lead_form_header_view_without_welcome_message);
        this.A00 = (IgLinearLayout) view.findViewById(R.id.custom_questions_container);
        this.A01 = (IgLinearLayout) view.findViewById(R.id.customer_info_questions_container);
        IgTextView A0X = JTO.A0X(view, R.id.inline_legal_text);
        this.A02 = A0X;
        if (A0X != null) {
            DbT.A1H(A0X);
        }
        C14764U8a u8a2 = (C14764U8a) r7.getValue();
        DbY.A19(u8a2, new MH3(u8a2, (AnonymousClass4D7) null, 5), new C18059Vki(u8a2.A07).A02(u8a2.A0B, u8a2.A06.A00));
        C20786Wyx.A00(getViewLifecycleOwner(), ((C14764U8a) r7.getValue()).A05, this, 47, 19);
        Dbb.A0t(view, R.id.preview_warning_banner, 0);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return ((C14764U8a) this.A08.getValue()).A07;
    }

    public UZQ() {
        C58180Ink ink = new C58180Ink(this, 4);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C58180Ink(new C58180Ink(this, 1), 2));
        this.A08 = new C227862kA(new C58180Ink(A002, 3), ink, new C20612Wvt(30, (Object) null, A002), new 0Yh(C14764U8a.class));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: X.Un0} */
    /* JADX WARNING: type inference failed for: r2v3, types: [X.Umt, X.Un0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(com.instagram.common.ui.base.IgLinearLayout r6, X.UZQ r7, java.util.List r8) {
        /*
            r6.removeAllViews()
            java.util.Iterator r5 = r8.iterator()
        L_0x0007:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0053
            java.lang.Object r4 = r5.next()
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r4 = (com.instagram.leadgen.core.model.LeadGenFormBaseQuestion) r4
            X.Uxp r0 = r4.A03
            int r1 = r0.ordinal()
            r0 = 33
            if (r1 == r0) goto L_0x0007
            r3 = 0
            if (r1 == r3) goto L_0x004e
            r0 = 10
            if (r1 == r0) goto L_0x0041
            android.content.Context r1 = r7.requireContext()
            r0 = 0
            X.Un0 r2 = new X.Un0
            r2.<init>(r1, r0, r3)
        L_0x002e:
            X.U6n r2 = (X.C14746U6n) r2
            if (r2 == 0) goto L_0x0007
            java.util.Map r0 = r7.A09
            r0.put(r4, r2)
            r2.setEnabled(r3)
            r2.A0G(r4, r3, r3, r3)
            r6.addView(r2)
            goto L_0x0007
        L_0x0041:
            android.content.Context r1 = r7.requireContext()
            r0 = 0
            X.Umt r2 = new X.Umt
            r2.<init>(r1, r0, r3)
            r2.A00 = r0
            goto L_0x002e
        L_0x004e:
            X.U6n r2 = X.C14746U6n.A00(r7, r4)
            goto L_0x002e
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UZQ.A00(com.instagram.common.ui.base.IgLinearLayout, X.UZQ, java.util.List):void");
    }

    public final void configureActionBar(2da r1) {
        Dbb.A1J(r1);
        Dbc.A0k(r1);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1930566239);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.lead_gen_fragment_form_preview, viewGroup, false);
        AnonymousClass0fD.A09(249616064, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(107703101);
        super.onDestroyView();
        this.A06 = null;
        this.A04 = null;
        this.A00 = null;
        this.A01 = null;
        this.A03 = null;
        this.A02 = null;
        this.A05 = null;
        AnonymousClass0fD.A09(-1202460531, A022);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.07Z, X.UZQ, androidx.fragment.app.Fragment] */
    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(2008389492);
        UZQ.super.onStart();
        this.A07 = C20592WvV.A00(this, ((C14764U8a) this.A08.getValue()).A0D, 36);
        AnonymousClass0fD.A09(1759815954, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(776065195);
        UZQ.super.onStop();
        this.A07 = JTQ.A0n(this.A07);
        AnonymousClass0fD.A09(1547695357, A022);
    }
}
