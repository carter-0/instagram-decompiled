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
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.List;

public final class UZW extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "PromoteCreateAudienceInterestFragment";
    public EditText A00;
    public TextView A01;
    public RecyclerView A02;
    public RecyclerView A03;
    public WGU A04;
    public C18784W1k A05;
    public UAI A06;
    public C14793U9n A07;
    public PromoteData A08;
    public PromoteState A09;
    public UserSession A0A;
    public C18643Vvl A0B;
    public C18761Vzw A0C;
    public final TextWatcher A0D = new W7b(this, 3);
    public final C17767Vfe A0E = new C17767Vfe(this);
    public final WOT A0F = new WOT(this);
    public final C17956Vin A0G = new C17956Vin();

    public final void configureActionBar(2da r6) {
        0qQ.A0B(r6, 0);
        C13992Tns.A0r(r6, 2131970315);
        r6.Eu4(true);
        Context context = getContext();
        if (context != null) {
            C18643Vvl vvl = new C18643Vvl(context, r6);
            this.A0B = vvl;
            vvl.A01(new WBB(this, 10), AnonymousClass05K.A1F);
            C18643Vvl vvl2 = this.A0B;
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

    /* JADX WARNING: type inference failed for: r3v0, types: [X.07Z, X.UZW, androidx.fragment.app.Fragment] */
    public final void onAttach(Context context) {
        0qQ.A0B(context, 0);
        UZW.super.onAttach(context);
        XAI activity = getActivity();
        if (activity != null) {
            this.A08 = activity.Bhh();
            XA9 activity2 = getActivity();
            if (activity2 != null) {
                this.A09 = activity2.Bhj();
                PromoteData promoteData = this.A08;
                String str = "promoteData";
                if (promoteData != null) {
                    UserSession userSession = promoteData.A0y;
                    this.A0A = userSession;
                    this.A05 = new C18784W1k(getActivity(), this, userSession);
                    UserSession userSession2 = this.A0A;
                    if (userSession2 != null) {
                        this.A04 = WGU.A00(userSession2);
                        return;
                    }
                    str = "session";
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c6, code lost:
        if (r1 != false) goto L_0x00c8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0142  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r14, android.os.Bundle r15) {
        /*
            r13 = this;
            r0 = 0
            X.0qQ.A0B(r14, r0)
            super.onViewCreated(r14, r15)
            r1 = 2131428240(0x7f0b0390, float:1.8478119E38)
            android.view.View r0 = r14.findViewById(r1)
            X.0qQ.A07(r0)
            X.UzE r10 = X.C16678UzE.INTERESTS_SELECTION
            android.view.View r8 = X.AnonymousClass7TE.A0b(r14, r1)
            androidx.fragment.app.FragmentActivity r9 = r13.requireActivity()
            com.instagram.business.promote.model.PromoteData r12 = r13.A08
            if (r12 != 0) goto L_0x0029
            java.lang.String r0 = "promoteData"
        L_0x0021:
            X.0qQ.A0F(r0)
        L_0x0024:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0029:
            X.W1k r11 = r13.A05
            if (r11 != 0) goto L_0x0030
            java.lang.String r0 = "dataFetcher"
            goto L_0x0021
        L_0x0030:
            X.Vzw r7 = new X.Vzw
            r7.<init>(r8, r9, r10, r11, r12)
            r13.A0C = r7
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
            java.lang.String r9 = "searchEditText"
            if (r1 == 0) goto L_0x0078
            r0 = 2131970318(0x7f13490e, float:1.9577584E38)
            r1.setHint(r0)
            android.widget.EditText r1 = r13.A00
            if (r1 == 0) goto L_0x0078
            android.text.TextWatcher r0 = r13.A0D
            r1.addTextChangedListener(r0)
            android.widget.TextView r1 = r13.A01
            if (r1 != 0) goto L_0x007c
            java.lang.String r9 = "searchEmptyStateTextView"
        L_0x0078:
            X.0qQ.A0F(r9)
            goto L_0x0024
        L_0x007c:
            r0 = 2131970317(0x7f13490d, float:1.9577582E38)
            r1.setText(r0)
            X.WOT r0 = r13.A0F
            X.U9n r1 = new X.U9n
            r1.<init>(r0)
            r13.A07 = r1
            androidx.recyclerview.widget.RecyclerView r0 = r13.A02
            if (r0 != 0) goto L_0x0092
            java.lang.String r9 = "interestTypeaheadRecyclerView"
            goto L_0x0078
        L_0x0092:
            r0.setAdapter(r1)
            com.instagram.business.promote.model.PromoteData r6 = r13.A08
            java.lang.String r5 = "promoteData"
            if (r6 == 0) goto L_0x00ab
            android.content.Context r4 = r13.getContext()
            java.lang.String r3 = "Required value was null."
            if (r4 == 0) goto L_0x015d
            X.Vfe r2 = r13.A0E
            X.W1k r1 = r13.A05
            if (r1 != 0) goto L_0x00b0
            java.lang.String r5 = "dataFetcher"
        L_0x00ab:
            X.0qQ.A0F(r5)
            goto L_0x0024
        L_0x00b0:
            X.UAI r0 = new X.UAI
            r0.<init>(r4, r1, r2, r6)
            r13.A06 = r0
            com.instagram.business.promote.model.PromoteData r0 = r13.A08
            if (r0 == 0) goto L_0x00ab
            com.instagram.business.promote.model.PromoteAudienceInfo r0 = r0.A0q
            java.util.List r0 = r0.A08
            if (r0 == 0) goto L_0x00c8
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x00c9
        L_0x00c8:
            r0 = 1
        L_0x00c9:
            java.lang.String r9 = "selectedAndSuggestedInterestsAdapter"
            if (r0 != 0) goto L_0x0122
            X.UAI r8 = r13.A06
            if (r8 == 0) goto L_0x0078
            com.instagram.business.promote.model.PromoteData r0 = r13.A08
            if (r0 == 0) goto L_0x00ab
            com.instagram.business.promote.model.PromoteAudienceInfo r0 = r0.A0q
            java.util.List r0 = r0.A08
            if (r0 == 0) goto L_0x0157
            java.util.List r7 = X.00k.A0a(r0)
        L_0x00df:
            java.util.List r3 = r8.A06
            r3.clear()
            java.util.List r0 = r8.A04
            r0.clear()
            r3.addAll(r7)
            r8.A01()
            X.W1k r6 = r8.A01
            com.instagram.business.promote.model.PromoteData r0 = r8.A03
            java.lang.String r5 = r0.A1S
            X.WyC r2 = X.C20739WyC.A00
            r1 = 1
            X.WMm r0 = new X.WMm
            r0.<init>((int) r1, (X.0sP) r2)
            java.util.List r4 = X.C256393vh.A02(r0, r3)
            boolean r3 = r7.isEmpty()
            X.0eM r0 = r8.A07
            java.lang.Object r2 = r0.getValue()
            X.1P0 r2 = (X.1P0) r2
            com.instagram.common.session.UserSession r1 = r6.A08
            X.WGU r0 = r6.A02
            java.lang.String r0 = r0.A03
            X.1OC r0 = X.W2V.A05(r1, r5, r0, r4, r3)
            X.C18784W1k.A02(r6, r2, r0)
        L_0x011a:
            androidx.recyclerview.widget.RecyclerView r1 = r13.A03
            if (r1 != 0) goto L_0x0142
            java.lang.String r9 = "selectedAndSuggestedInterestsRecyclerView"
            goto L_0x0078
        L_0x0122:
            com.instagram.business.promote.model.PromoteData r0 = r13.A08
            if (r0 == 0) goto L_0x00ab
            com.instagram.common.session.UserSession r3 = r0.A0y
            X.0qQ.A06(r3)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36312402299454567(0x8101f000000467, double:3.0274476602582746E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x011a
            X.UAI r8 = r13.A06
            if (r8 == 0) goto L_0x0078
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            goto L_0x00df
        L_0x0142:
            X.UAI r0 = r13.A06
            if (r0 == 0) goto L_0x0078
            r1.setAdapter(r0)
            r13.A00()
            A01(r13)
            X.WGU r0 = r13.A04
            if (r0 == 0) goto L_0x0156
            X.C13988Tno.A1J(r0, r10)
        L_0x0156:
            return
        L_0x0157:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x015d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UZW.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    private final void A00() {
        String str;
        TextView textView = this.A01;
        if (textView == null) {
            str = "searchEmptyStateTextView";
        } else {
            EditText editText = this.A00;
            if (editText == null) {
                str = "searchEditText";
            } else {
                int A0C2 = C13988Tno.A0C(editText);
                int i = 8;
                if (A0C2 == 0) {
                    i = 0;
                }
                textView.setVisibility(i);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A01(UZW uzw) {
        String str;
        C18761Vzw vzw = uzw.A0C;
        if (vzw == null) {
            str = "audiencePotentialReachController";
        } else {
            PromoteData promoteData = uzw.A08;
            if (promoteData == null) {
                str = "promoteData";
            } else {
                C18578VuU A012 = C18167Vmh.A01(promoteData);
                UAI uai = uzw.A06;
                if (uai == null) {
                    str = "selectedAndSuggestedInterestsAdapter";
                } else {
                    A012.A08 = DbU.A0K(uai.A06);
                    vzw.A02(A012.A01());
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A02(UZW uzw, List list) {
        String str;
        EditText editText = uzw.A00;
        if (editText == null) {
            str = "searchEditText";
        } else {
            Editable text = editText.getText();
            0qQ.A07(text);
            str = "selectedAndSuggestedInterestsAdapter";
            if (AnonymousClass7TF.A1Q(text.length())) {
                List emptyList = Collections.emptyList();
                0qQ.A07(emptyList);
                C14793U9n u9n = uzw.A07;
                if (u9n != null) {
                    u9n.A00 = emptyList;
                    u9n.notifyDataSetChanged();
                    UAI uai = uzw.A06;
                    if (uai != null) {
                        uai.A01();
                    }
                }
                0qQ.A0F("interestTypeaheadAdapter");
                throw AnonymousClass00P.createAndThrow();
            }
            C14793U9n u9n2 = uzw.A07;
            if (u9n2 != null) {
                u9n2.A00 = list;
                u9n2.notifyDataSetChanged();
                UAI uai2 = uzw.A06;
                if (uai2 != null) {
                    uai2.A05.clear();
                    uai2.notifyDataSetChanged();
                }
            }
            0qQ.A0F("interestTypeaheadAdapter");
            throw AnonymousClass00P.createAndThrow();
            uzw.A00();
            return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        UserSession userSession = this.A0A;
        if (userSession != null) {
            return userSession;
        }
        DbS.A14();
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-381281180);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_create_audience_interest_view, viewGroup, false);
        AnonymousClass0fD.A09(-284304989, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1660940792);
        super.onDestroyView();
        C18761Vzw vzw = this.A0C;
        if (vzw == null) {
            0qQ.A0F("audiencePotentialReachController");
            throw AnonymousClass00P.createAndThrow();
        }
        vzw.A0A.A00();
        vzw.A00 = C18598Vup.A01;
        this.A04 = null;
        AnonymousClass0fD.A09(-2114358183, A022);
    }
}
