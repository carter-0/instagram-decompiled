package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Uap  reason: case insensitive filesystem */
public final class C15339Uap extends AnonymousClass4DH implements AnonymousClass4DU, AnonymousClass4DR, C227272iw {
    public static final String __redex_internal_original_name = "LeadAdsCreativesFragment";
    public RecyclerView A00;
    public 2el A01;
    public boolean A02;
    public 2dZ A03;
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A01(new C20696WxS(this, 44));
    public final AnonymousClass0eM A05;
    public final UB1 A06;

    public C15339Uap() {
        C20696WxS wxS = new C20696WxS(this, 0);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C73660PhZ(new C73660PhZ(this, 47), 48));
        this.A05 = new C227862kA(new C73660PhZ(A002, 49), wxS, new C73666Phf(37, (Object) null, A002), new 0Yh(C14777U8n.class));
        this.A06 = new UB1(this, 9);
    }

    public final String getModuleName() {
        return "lead_ad_question_page";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return true;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass0eM r2 = this.A05;
        C14777U8n u8n = (C14777U8n) r2.getValue();
        C18460Vs9 vs9 = u8n.A03;
        XB6 xb6 = vs9.A00;
        if (xb6 != null) {
            xb6.Cgq(C18460Vs9.A00(vs9, (String) null), vs9.A01, "lead_gen_creatives_context_card", "creatives_context_card_impression", "impression");
        }
        for (X4H CAZ : (Iterable) u8n.A05.getValue()) {
            C16518UwN CAZ2 = CAZ.CAZ();
            if (CAZ2 != C16518UwN.HEADER) {
                String name = CAZ2.name();
                0qQ.A0B(name, 0);
                if (xb6 != null) {
                    xb6.Cgq(C18460Vs9.A00(vs9, name), vs9.A01, "lead_gen_creatives_context_card", "creatives_context_card_section_impression", "impression");
                }
            }
        }
        RecyclerView A0I = DbT.A0I(view, R.id.creatives_recycler_view);
        this.A00 = A0I;
        if (A0I != null) {
            DbY.A16(this, A0I);
        }
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            recyclerView.setItemAnimator((AnonymousClass3AS) null);
        }
        RecyclerView recyclerView2 = this.A00;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(new C14791U9g(this, new C17779Vfq(this)));
        }
        DbV.A1F(getViewLifecycleOwner(), ((C14777U8n) r2.getValue()).A01, new C20786Wyx(this, 8), 6);
        WB9.A00(view.requireViewById(R.id.bottom_button_layout), 67, this);
        2el A0U = DbY.A0U();
        this.A01 = A0U;
        Dba.A0z(view, A0U, this);
        if (((C14777U8n) r2.getValue()).A00) {
            this.A03 = DbU.A0L(this, 2dZ.A0t);
            RecyclerView recyclerView3 = this.A00;
            if (recyclerView3 != null) {
                recyclerView3.A15(this.A06);
            }
        }
        UserSession userSession = ((C14777U8n) r2.getValue()).A02;
        2el r0 = this.A01;
        if (r0 == null) {
            0qQ.A0F("viewpointManager");
            throw AnonymousClass00P.createAndThrow();
        }
        new C55943Hq7(userSession, r0, this).A00(view, C18490Vsl.A05.A00(this.mArguments, C16610Uy6.A06, ((C14777U8n) r2.getValue()).A02.A05, getParentFragmentManager().A0M()));
        C244083ac.A05(AnonymousClass7TF.A0G(view, R.id.bottom_button_layout), C244063aa.CTA);
        W1T.A00(this);
    }

    public static final void A00(C15339Uap uap, int i) {
        boolean z;
        if (((C14777U8n) uap.A05.getValue()).A00) {
            uap.A03 = DbU.A0L(uap, 2dZ.A0t);
            RecyclerView recyclerView = uap.A00;
            if (recyclerView != null) {
                recyclerView.A15(uap.A06);
            }
            2dZ r3 = uap.A03;
            if (r3 != null) {
                if (i == 0) {
                    r3.A0U(R.attr.igds_color_primary_text_on_media);
                    r3.ENd(uap.requireContext().getDrawable(R.color.fds_transparent));
                    z = true;
                } else {
                    r3.A0U(R.attr.igds_color_primary_icon);
                    r3.ENd(uap.requireContext().getDrawable(2Yu.A0H(uap.requireContext(), R.attr.actionBarBackgroundColor)));
                    z = false;
                }
                uap.A02 = z;
            }
        }
    }

    public final boolean COC() {
        return ((C14777U8n) this.A05.getValue()).A00;
    }

    public final AnonymousClass0wW getSession() {
        return ((C14777U8n) this.A05.getValue()).A02;
    }

    public final boolean onBackPressed() {
        AnonymousClass0eM r3 = this.A05;
        if (((C14777U8n) r3.getValue()).A09) {
            return false;
        }
        W1T.A00.A03(this, ((C14777U8n) r3.getValue()).A02, ((C14777U8n) r3.getValue()).A08);
        return true;
    }

    public final void configureActionBar(2da r2) {
        Dbb.A1J(r2);
        Dbc.A0k(r2);
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            A00(this, recyclerView.computeVerticalScrollOffset());
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-403363995);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.lead_gen_fragment_creatives, viewGroup, false);
        AnonymousClass0fD.A09(1819189002, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-523379370);
        super.onDestroyView();
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            recyclerView.setAdapter((2Rw) null);
        }
        this.A00 = null;
        AnonymousClass0fD.A09(-23063712, A022);
    }
}
