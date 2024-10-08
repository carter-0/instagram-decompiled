package X;

import com.instagram.music.search.MusicOverlayResultsListController;

/* renamed from: X.K6z  reason: case insensitive filesystem */
public abstract class C61425K6z extends AnonymousClass4DH implements AnonymousClass4DU, MU3 {
    public static final String __redex_internal_original_name = "MusicOverlaySearchFragment";
    public Runnable A00;

    public final boolean isOrganicEligible() {
        return false;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void A02(String str) {
        String str2;
        if (this instanceof C61992KUp) {
            C61992KUp kUp = (C61992KUp) this;
            29H A0K = JTS.A0K(kUp.A0F);
            AnonymousClass80X r0 = kUp.A05;
            if (r0 != null) {
                A0K.A0F(str, r0.toString());
                C61992KUp.A01(kUp, str, false, false);
                return;
            }
            str2 = "captureState";
        } else {
            C61991KUo kUo = (C61991KUo) this;
            29H A0K2 = JTS.A0K(kUo.A0A);
            AnonymousClass80X r02 = kUo.A05;
            if (r02 != null) {
                A0K2.A0F(str, r02.toString());
                C65512Lua lua = kUo.A02;
                if (lua == null) {
                    str2 = "musicSearchResultsView";
                } else {
                    MusicOverlayResultsListController musicOverlayResultsListController = lua.A02;
                    musicOverlayResultsListController.A0C.EHu(false);
                    musicOverlayResultsListController.A0G.A04 = str;
                    lua.A00 = false;
                    C61991KUo.A01(kUo, str, false, false);
                    return;
                }
            }
            str2 = "captureState";
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A03(String str, boolean z) {
        String str2;
        1Ng A0R;
        C64658Lfk lfk;
        if (this instanceof C61992KUp) {
            C61992KUp kUp = (C61992KUp) this;
            AnonymousClass0eM r2 = kUp.A0F;
            29H A0K = JTS.A0K(r2);
            AnonymousClass80X r0 = kUp.A05;
            if (r0 != null) {
                A0K.A0F(str, r0.toString());
                C65512Lua lua = kUp.A02;
                if (lua != null) {
                    if (!C61992KUp.A01(kUp, str, z, !z)) {
                        lua.A00();
                    }
                    MusicOverlayResultsListController musicOverlayResultsListController = lua.A02;
                    musicOverlayResultsListController.A06();
                    musicOverlayResultsListController.A0G.A04 = str;
                    A0R = DbX.A0R(r2);
                    lfk = new C64658Lfk(C61992KUp.A00(kUp).A01);
                }
                str2 = "musicSearchResultsView";
                0qQ.A0F(str2);
                throw AnonymousClass00P.createAndThrow();
            }
            str2 = "captureState";
            0qQ.A0F(str2);
            throw AnonymousClass00P.createAndThrow();
        }
        C61991KUo kUo = (C61991KUo) this;
        AnonymousClass0eM r22 = kUo.A0A;
        29H A0K2 = JTS.A0K(r22);
        AnonymousClass80X r02 = kUo.A05;
        if (r02 != null) {
            A0K2.A0F(str, r02.toString());
            C65512Lua lua2 = kUo.A02;
            if (lua2 != null) {
                if (!C61991KUo.A01(kUo, str, z, !z)) {
                    lua2.A00();
                }
                MusicOverlayResultsListController musicOverlayResultsListController2 = lua2.A02;
                musicOverlayResultsListController2.A06();
                musicOverlayResultsListController2.A0G.A04 = str;
                A0R = DbX.A0R(r22);
                lfk = new C64658Lfk(str);
            }
            str2 = "musicSearchResultsView";
            0qQ.A0F(str2);
            throw AnonymousClass00P.createAndThrow();
        }
        str2 = "captureState";
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
        A0R.A05(lfk);
    }

    public final void onResume() {
        int A02 = AnonymousClass0fD.A02(356683307);
        super.onResume();
        Runnable runnable = this.A00;
        if (runnable != null) {
            runnable.run();
        }
        this.A00 = null;
        AnonymousClass0fD.A09(-1403182846, A02);
    }
}
