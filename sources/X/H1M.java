package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.spinner.SpinnerImageView;

public final class H1M extends AnonymousClass4DH implements AnonymousClass4DU, X7t {
    public static final String __redex_internal_original_name = "CreatorInspirationHubAudioFragment";
    public Context A00;
    public FragmentActivity A01;
    public RecyclerView A02;
    public C234502xy A03;
    public U94 A04;
    public SpinnerImageView A05;
    public final AnonymousClass0eM A06 = AnonymousClass1YB.A00(new GW6(this, 32));
    public final AnonymousClass0eM A07 = AnonymousClass1YB.A00(new GW6(this, 36));
    public final AnonymousClass0eM A08 = AnonymousClass1YB.A00(new GW6(this, 37));
    public final AnonymousClass0eM A09 = C227642jf.A02(this);
    public final C320506sU A0A = new C320506sU(AnonymousClass8ZN.CREATOR_INSPIRATION_HUB_AUDIO, AnonymousClass7TG.A0j());

    public final String getModuleName() {
        return "ig_creator_inspiration_hub_audio";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        07U r7;
        View view2 = view;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A05 = DbX.A0k(view);
        RecyclerView A0I = DbT.A0I(view, R.id.creator_inspiration_hub_audio_recycler_view);
        this.A02 = A0I;
        String str = "audioRecyclerView";
        if (A0I != null) {
            Context context = this.A00;
            if (context == null) {
                str = "context";
            } else {
                DbU.A15(context, A0I, 1, false);
                RecyclerView recyclerView = this.A02;
                if (recyclerView != null) {
                    U94 u94 = this.A04;
                    if (u94 == null) {
                        str = "audioAdapter";
                    } else {
                        recyclerView.setAdapter(u94);
                        if (AnonymousClass7TF.A1Z(this.A08)) {
                            r7 = 07U.A04;
                        } else {
                            r7 = 07U.A05;
                        }
                        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
                        AnonymousClass0xx A002 = AnonymousClass07a.A00(viewLifecycleOwner);
                        MHF mhf = new MHF(view2, viewLifecycleOwner, r7, this, (AnonymousClass4D7) null, 16);
                        19B r3 = 19B.A00;
                        1Eo.A05(r3, mhf, A002);
                        1Eo.A05(r3, new MFR(this, (AnonymousClass4D7) null, 5), DbV.A0J(this));
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final AnonymousClass8ZN A00(String str) {
        if (0qQ.A0K(str, "trending")) {
            return AnonymousClass8ZN.CREATOR_INSPIRATION_HUB_AUDIO_TRENDING_LIST;
        }
        if (0qQ.A0K(str, AnonymousClass000.A00(348))) {
            return AnonymousClass8ZN.CREATOR_INSPIRATION_HUB_AUDIO_POPULAR_WITH_YOUR_FOLLOWERS;
        }
        return AnonymousClass8ZN.CREATOR_INSPIRATION_HUB_AUDIO;
    }

    public final void D05(C16181Uq6 uq6) {
        2YL r2 = (2YL) AnonymousClass7TE.A14(this.A06);
        C58105ImR.A01(r2, uq6, C318116oQ.A00(r2), 8);
    }

    public final void DLx(C16181Uq6 uq6) {
        2YL r2 = (2YL) AnonymousClass7TE.A14(this.A06);
        C58105ImR.A01(r2, uq6, C318116oQ.A00(r2), 6);
    }

    public final void Dgd(C16181Uq6 uq6) {
        ((C52963GgG) AnonymousClass7TE.A14(this.A06)).A0H(uq6);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A09);
    }

    public final void onCreate(Bundle bundle) {
        Integer num;
        int A022 = AnonymousClass0fD.A02(1126910063);
        H1M.super.onCreate(bundle);
        this.A00 = requireContext();
        this.A01 = requireActivity();
        Context context = this.A00;
        if (context != null) {
            AnonymousClass0eM r4 = this.A09;
            UserSession A0l = AnonymousClass7TE.A0l(r4);
            Context context2 = this.A00;
            if (context2 != null) {
                this.A03 = C234472xv.A00(context, A0l, this, new C234462xu(context2, AnonymousClass7TE.A0l(r4)), "CreatorInspirationHubAudioTab", C234472xv.A02(A0l));
                UserSession A0l2 = AnonymousClass7TE.A0l(r4);
                C234502xy r12 = this.A03;
                if (r12 != null) {
                    C320506sU r9 = this.A0A;
                    0lg A0L = AnonymousClass7TF.A0L(r4, 0);
                    0Tu r5 = 0Tu.A05;
                    boolean A062 = 182.A06(r5, A0L, 36328401052908874L);
                    if (182.A06(r5, AnonymousClass7TF.A0L(r4, 0), 36328555671797164L)) {
                        num = AnonymousClass05K.A0Y;
                    } else {
                        num = AnonymousClass05K.A0N;
                    }
                    Context context3 = this.A00;
                    if (context3 != null) {
                        this.A04 = new U94(context3, r9, this, A0l2, r12, this, num, new C58142In8(this, 64), true, A062, false, false);
                        AnonymousClass0fD.A09(-1265700368, A022);
                        return;
                    }
                } else {
                    IllegalStateException A0y = AnonymousClass7TE.A0y();
                    AnonymousClass0fD.A09(1813928357, A022);
                    throw A0y;
                }
            }
        }
        0qQ.A0F("context");
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1513247930);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.creator_inspiration_hub_audio_fragment, viewGroup, false);
        AnonymousClass0fD.A09(551207502, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(140378624);
        super.onDestroy();
        C234502xy r0 = this.A03;
        if (r0 != null) {
            r0.release();
        }
        this.A03 = null;
        AnonymousClass0fD.A09(1940842838, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-1939328512);
        H1M.super.onPause();
        C234502xy r1 = this.A03;
        if (r1 != null) {
            r1.EHu(false);
        }
        AnonymousClass0fD.A09(-1618105195, A022);
    }
}
