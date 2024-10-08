package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.api.schemas.SoundPlatformProduct;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lot  reason: case insensitive filesystem */
public final class C65190Lot implements MVS {
    public View A00;
    public RecyclerView A01;
    public final UserSession A02;
    public final C63877LAg A03;
    public final KOC A04;
    public final AnonymousClass80P A05 = AnonymousClass80P.MUSIC;
    public final AnonymousClass4DH A06;

    public final /* synthetic */ void ADm() {
    }

    public final View ANH() {
        String str;
        Context requireContext = this.A06.requireContext();
        LinearLayout linearLayout = new LinearLayout(requireContext);
        linearLayout.setOrientation(1);
        JTS.A0x(linearLayout);
        View inflate = LayoutInflater.from(requireContext).inflate(R.layout.add_music_row, linearLayout, false);
        this.A00 = inflate;
        if (inflate == null) {
            str = "musicRowView";
        } else {
            linearLayout.addView(inflate);
            View inflate2 = LayoutInflater.from(requireContext).inflate(R.layout.add_music_suggestions, linearLayout, false);
            0qQ.A0C(inflate2, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            RecyclerView recyclerView = (RecyclerView) inflate2;
            this.A01 = recyclerView;
            if (recyclerView == null) {
                str = "musicSuggestionsRecyclerView";
            } else {
                linearLayout.addView(recyclerView);
                return linearLayout;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final C62674Kka B1s() {
        return null;
    }

    public final AnonymousClass80P BHl() {
        return this.A05;
    }

    public final void CsQ() {
        String str = "musicSuggestionsRecyclerView";
        if (!C56327Hwe.A01(SoundPlatformProduct.IG_MUSIC_ON_FEED, this.A02)) {
            C63877LAg lAg = this.A03;
            RecyclerView recyclerView = this.A01;
            if (recyclerView != null) {
                lAg.A07.invoke(new M78(recyclerView, lAg));
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        C63877LAg lAg2 = this.A03;
        RecyclerView recyclerView2 = this.A01;
        if (recyclerView2 != null) {
            0sP r3 = lAg2.A07;
            r3.invoke(new M77(recyclerView2, lAg2));
            View view = this.A00;
            if (view == null) {
                str = "musicRowView";
            } else {
                RecyclerView recyclerView3 = this.A01;
                if (recyclerView3 != null) {
                    r3.invoke(new C66032M8r(view, recyclerView3, lAg2));
                    AnonymousClass4DH r0 = this.A06;
                    07U r32 = 07U.A05;
                    AnonymousClass07Z viewLifecycleOwner = r0.getViewLifecycleOwner();
                    AnonymousClass7TE.A1Z(MHO.A03(viewLifecycleOwner, r32, this, (AnonymousClass4D7) null, 14), AnonymousClass07a.A00(viewLifecycleOwner));
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public C65190Lot(AnonymousClass4DH r2, UserSession userSession, C63877LAg lAg, KOC koc) {
        C51974G9v.A1P(r2, userSession, lAg, koc);
        this.A06 = r2;
        this.A02 = userSession;
        this.A03 = lAg;
        this.A04 = koc;
    }
}
