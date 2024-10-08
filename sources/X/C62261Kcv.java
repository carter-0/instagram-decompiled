package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.instagram.api.schemas.LiveUserPaySupportTier;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import com.instagram.user.model.User;
import com.instagram.video.live.mvvm.view.postlive.IgLiveExploreLiveBaseFragment;

/* renamed from: X.Kcv  reason: case insensitive filesystem */
public final class C62261Kcv extends IgLiveExploreLiveBaseFragment implements AnonymousClass4DU {
    public static final String __redex_internal_original_name = "IgLiveExploreLiveViewerFragment";
    public C270194gL A00;
    public C65808M0a A01;
    public String A02;
    public String A03 = "suggested_live_unspecified";
    public String A04;
    public C59720JVe A05;
    public boolean A06 = true;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08 = C227642jf.A02(this);

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass0eM r4 = this.A07;
        DbV.A1F(getViewLifecycleOwner(), ((C60221Jhe) r4.getValue()).A02, new J6T(20, (Object) view, (Object) this), 68);
        DbZ.A1C(this, MHB.A01(this, (AnonymousClass4D7) null, 7), ((C60221Jhe) r4.getValue()).A0C);
    }

    public final String getModuleName() {
        return this.A03;
    }

    public C62261Kcv() {
        C66302MMl mMl = new C66302MMl(this, 30);
        AnonymousClass0eM A012 = C66302MMl.A01(new C66302MMl(this, 32), 0eO.A02, 33);
        this.A07 = DbS.A0I(new C66302MMl(A012, 34), mMl, C66304MMn.A01(A012, (Object) null, 46), DbS.A0z(C60221Jhe.class));
    }

    public final void onCreate(Bundle bundle) {
        C270194gL r0;
        String str;
        LiveUserPaySupportTier liveUserPaySupportTier;
        int i;
        Reel A0M;
        int A022 = AnonymousClass0fD.A02(486974069);
        C62261Kcv.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString("ARG_SOURCE_BROADCAST_ID");
        if (string == null || (A0M = ReelStore.A03(AnonymousClass7TE.A0l(this.A08)).A0M(string)) == null) {
            r0 = null;
        } else {
            r0 = A0M.A0H;
        }
        this.A00 = r0;
        boolean z = requireArguments.getBoolean("ARG_IS_POST_LIVE", true);
        this.A06 = z;
        if (z) {
            str = "post_live";
        } else {
            str = "explore_live";
        }
        this.A02 = str;
        C313786h0 r6 = C313776gz.A0K;
        AnonymousClass0eM r5 = this.A08;
        this.A05 = r6.A00(AnonymousClass7TE.A0l(r5), C313666go.VIEWER).A03();
        C270194gL r02 = this.A00;
        if (r02 != null) {
            Context requireContext = requireContext();
            UserSession A0l = AnonymousClass7TE.A0l(r5);
            User A032 = r02.A03();
            C278094wG r03 = r02.A03;
            if (r03 != null) {
                liveUserPaySupportTier = r03.A01;
                Integer num = r03.A04;
                if (num != null) {
                    i = num.intValue();
                }
                i = 0;
            } else {
                liveUserPaySupportTier = null;
                i = 0;
            }
            boolean z2 = this.A06;
            AnonymousClass0eM r1 = this.A07;
            boolean z3 = false;
            if (DbT.A00(((C60221Jhe) r1.getValue()).A08.A02.A00, "key_ig_live_upsell_number_times") <= 5) {
                z3 = true;
            }
            this.A01 = new C65808M0a(requireContext, liveUserPaySupportTier, A0l, this, A032, this, new C66302MMl(this, 31), i, z2, z3);
            2YL A0H = DbS.A0H(r1);
            C66184MGv.A02(A0H, C318116oQ.A00(A0H), 33);
        }
        this.A04 = requireArguments.getString("ARG_VIEWER_SESSION_ID", "");
        this.A03 = requireArguments.getString("ARG_MODULE_NAME", this.A03);
        C60221Jhe jhe = (C60221Jhe) this.A07.getValue();
        String str2 = this.A04;
        if (str2 == null) {
            0qQ.A0F("viewerSessionId");
            throw AnonymousClass00P.createAndThrow();
        }
        jhe.A00 = str2;
        if (this.A00 == null) {
            0wb.A03(this.A03, 002.A0R("Broadcast is null for id: ", string));
        }
        AnonymousClass0fD.A09(153628081, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(588488114);
        ((C60221Jhe) this.A07.getValue()).A02.A05(getViewLifecycleOwner());
        super.onDestroyView();
        AnonymousClass0fD.A09(-1702705470, A022);
    }
}
