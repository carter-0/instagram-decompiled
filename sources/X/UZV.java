package X;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.api.schemas.AdvantageAudienceData;
import com.instagram.api.schemas.TargetingRelaxationConstants;
import java.util.List;

public final class UZV extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "PromoteCreateAudienceInterestFragmentV2";
    public EditText A00;
    public TextView A01;
    public RecyclerView A02;
    public RecyclerView A03;
    public C17325VRe A04;
    public C18620VvD A05;
    public UAD A06;
    public C14793U9n A07;
    public C18643Vvl A08;
    public final TextWatcher A09 = new W7b(this, 4);
    public final C17768Vff A0A = new C17768Vff(this);
    public final WOU A0B = new WOU(this);
    public final C17956Vin A0C = new C17956Vin();
    public final AnonymousClass0eM A0D = C20702WxZ.A00(this, 10);
    public final AnonymousClass0eM A0E = C227642jf.A02(this);
    public final AnonymousClass0eM A0F = new C227862kA(new C20702WxZ(this, 11), new C20702WxZ(this, 12), new C41566AwY(22, (Object) null, this), new 0Yh(U92.class));

    public final void configureActionBar(2da r6) {
        0qQ.A0B(r6, 0);
        C13992Tns.A0r(r6, 2131970315);
        r6.Eu4(true);
        Context context = getContext();
        if (context != null) {
            C18643Vvl vvl = new C18643Vvl(context, r6);
            this.A08 = vvl;
            vvl.A01(new WBB(this, 11), AnonymousClass05K.A1F);
            C18643Vvl vvl2 = this.A08;
            if (vvl2 == null) {
                0qQ.A0F("actionBarButtonController");
                throw AnonymousClass00P.createAndThrow();
            } else {
                vvl2.A02(true);
            }
        } else {
            throw AnonymousClass7TE.A0y();
        }
    }

    public final String getModuleName() {
        return "promote_create_audience_interest";
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.07Z, X.UZV, androidx.fragment.app.Fragment] */
    public final void onAttach(Context context) {
        0qQ.A0B(context, 0);
        UZV.super.onAttach(context);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            this.A04 = new C17325VRe(activity, this, AnonymousClass7TE.A0l(this.A0E));
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [X.07Z, X.UZV, androidx.fragment.app.Fragment, java.lang.Object, X.4DH] */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b9, code lost:
        if (r1 != false) goto L_0x00bb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r14, android.os.Bundle r15) {
        /*
            r13 = this;
            r3 = 0
            X.0qQ.A0B(r14, r3)
            super.onViewCreated(r14, r15)
            r0 = 2131428240(0x7f0b0390, float:1.8478119E38)
            android.view.View r5 = X.AnonymousClass7TE.A0b(r14, r0)
            X.0eM r4 = r13.A0E
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r4)
            androidx.fragment.app.FragmentActivity r1 = r13.getActivity()
            X.VvD r0 = new X.VvD
            r0.<init>(r2, r1, r5)
            r13.A05 = r0
            r0 = 2131440778(0x7f0b348a, float:1.8503549E38)
            android.view.View r0 = r14.findViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            r13.A00 = r0
            r0 = 2131440796(0x7f0b349c, float:1.8503585E38)
            android.widget.TextView r0 = X.AnonymousClass7TE.A0d(r14, r0)
            r13.A01 = r0
            r0 = 2131443352(0x7f0b3e98, float:1.850877E38)
            androidx.recyclerview.widget.RecyclerView r0 = X.DbZ.A0F(r14, r0)
            r13.A02 = r0
            r0 = 2131441047(0x7f0b3597, float:1.8504095E38)
            androidx.recyclerview.widget.RecyclerView r0 = X.DbZ.A0F(r14, r0)
            r13.A03 = r0
            android.widget.EditText r1 = r13.A00
            if (r1 == 0) goto L_0x004f
            r0 = 2131970318(0x7f13490e, float:1.9577584E38)
            r1.setHint(r0)
        L_0x004f:
            android.widget.EditText r1 = r13.A00
            if (r1 == 0) goto L_0x0058
            android.text.TextWatcher r0 = r13.A09
            r1.addTextChangedListener(r0)
        L_0x0058:
            android.widget.TextView r1 = r13.A01
            if (r1 == 0) goto L_0x0062
            r0 = 2131970317(0x7f13490d, float:1.9577582E38)
            r1.setText(r0)
        L_0x0062:
            X.WOU r0 = r13.A0B
            X.U9n r1 = new X.U9n
            r1.<init>(r0)
            r13.A07 = r1
            androidx.recyclerview.widget.RecyclerView r0 = r13.A02
            if (r0 == 0) goto L_0x0072
            r0.setAdapter(r1)
        L_0x0072:
            com.instagram.common.session.UserSession r10 = X.AnonymousClass7TE.A0l(r4)
            X.0eM r5 = r13.A0F
            java.lang.Object r0 = r5.getValue()
            X.U92 r0 = (X.U92) r0
            java.lang.String r11 = r0.A05
            java.lang.String r1 = "Required value was null."
            if (r11 == 0) goto L_0x0117
            android.content.Context r7 = r13.getContext()
            if (r7 == 0) goto L_0x0111
            X.0eM r2 = r13.A0D
            X.WGU r0 = X.C13990Tnq.A0M(r2)
            java.lang.String r12 = r0.A03
            X.0qQ.A07(r12)
            X.Vff r9 = r13.A0A
            X.VRe r8 = r13.A04
            if (r8 != 0) goto L_0x00a5
            java.lang.String r6 = "dataFetcher"
        L_0x009d:
            X.0qQ.A0F(r6)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00a5:
            X.UAD r6 = new X.UAD
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r13.A06 = r6
            X.ULv r0 = X.U92.A00(r5)
            java.util.List r0 = r0.A08
            if (r0 == 0) goto L_0x00bb
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x00bc
        L_0x00bb:
            r0 = 1
        L_0x00bc:
            java.lang.String r6 = "selectedAndSuggestedInterestsAdapter"
            if (r0 != 0) goto L_0x00f3
            X.ULv r0 = X.U92.A00(r5)
            java.util.List r1 = r0.A08
            if (r1 == 0) goto L_0x00cf
            X.UAD r0 = r13.A06
            if (r0 == 0) goto L_0x009d
            r0.A02(r1)
        L_0x00cf:
            androidx.recyclerview.widget.RecyclerView r1 = r13.A03
            if (r1 == 0) goto L_0x00da
            X.UAD r0 = r13.A06
            if (r0 == 0) goto L_0x009d
            r1.setAdapter(r0)
        L_0x00da:
            r13.A00()
            A01(r13)
            X.WGU r1 = X.C13990Tnq.A0M(r2)
            X.UzE r0 = X.C16678UzE.INTERESTS_SELECTION
            X.C13988Tno.A1J(r1, r0)
            X.0xx r1 = X.AnonymousClass07a.A00(r13)
            r0 = 9
            X.MG7.A01(r13, r1, r0)
            return
        L_0x00f3:
            X.0lg r4 = X.AnonymousClass7TF.A0L(r4, r3)
            X.0Tu r3 = X.0Tu.A05
            r0 = 36312402299454567(0x8101f000000467, double:3.0274476602582746E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 == 0) goto L_0x00cf
            X.UAD r1 = r13.A06
            if (r1 == 0) goto L_0x009d
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.A02(r0)
            goto L_0x00cf
        L_0x0111:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0117:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UZV.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    private final void A00() {
        Editable editable;
        TextView textView = this.A01;
        if (textView != null) {
            EditText editText = this.A00;
            if (editText != null) {
                editable = editText.getText();
            } else {
                editable = null;
            }
            int i = 0;
            if (!(editable == null || editable.length() == 0)) {
                i = 8;
            }
            textView.setVisibility(i);
        }
    }

    public static final void A01(UZV uzv) {
        AnonymousClass0eM r0 = uzv.A0F;
        U92 u92 = (U92) r0.getValue();
        C15053ULv A002 = U92.A00(r0);
        UAD uad = uzv.A06;
        if (uad == null) {
            0qQ.A0F("selectedAndSuggestedInterestsAdapter");
            throw AnonymousClass00P.createAndThrow();
        } else {
            u92.A0E(C15053ULv.A00((AdvantageAudienceData) null, (TargetingRelaxationConstants) null, A002, (String) null, (List) null, (List) null, DbU.A0K(uad.A08), 0, 0, 959, false));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r1 == 0) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.UZV r4, java.util.List r5) {
        /*
            android.widget.EditText r0 = r4.A00
            if (r0 == 0) goto L_0x0011
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x0011
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x0012
        L_0x0011:
            r0 = 1
        L_0x0012:
            java.lang.String r3 = "selectedAndSuggestedInterestsAdapter"
            java.lang.String r2 = "interestTypeaheadAdapter"
            if (r0 == 0) goto L_0x0033
            java.util.List r1 = java.util.Collections.emptyList()
            X.0qQ.A07(r1)
            X.U9n r0 = r4.A07
            if (r0 == 0) goto L_0x0049
            r0.A00 = r1
            r0.notifyDataSetChanged()
            X.UAD r0 = r4.A06
            if (r0 == 0) goto L_0x004d
            r0.A00()
        L_0x002f:
            r4.A00()
            return
        L_0x0033:
            X.U9n r0 = r4.A07
            if (r0 == 0) goto L_0x0049
            r0.A00 = r5
            r0.notifyDataSetChanged()
            X.UAD r1 = r4.A06
            if (r1 == 0) goto L_0x004d
            java.util.List r0 = r1.A07
            r0.clear()
            r1.notifyDataSetChanged()
            goto L_0x002f
        L_0x0049:
            X.0qQ.A0F(r2)
            goto L_0x0050
        L_0x004d:
            X.0qQ.A0F(r3)
        L_0x0050:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UZV.A02(X.UZV, java.util.List):void");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0E);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1748021489);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_create_audience_interest_view, viewGroup, false);
        AnonymousClass0fD.A09(-930434088, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1721698488);
        super.onDestroyView();
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
        this.A03 = null;
        C18620VvD vvD = this.A05;
        if (vvD != null) {
            vvD.A01();
        }
        this.A05 = null;
        AnonymousClass0fD.A09(-537545345, A022);
    }
}
