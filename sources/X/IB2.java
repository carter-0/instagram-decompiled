package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment;
import java.util.Collections;

public final class IB2 implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final String A02;

    public IB2(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    /* JADX WARNING: type inference failed for: r0v32, types: [X.HDO, X.6UX] */
    public final void onClick(View view) {
        int A05;
        int i;
        String str;
        switch (this.A00) {
            case 0:
                A05 = AnonymousClass0fD.A05(-1392488510);
                C54103GzY gzY = (C54103GzY) this.A01;
                C71093OcF A012 = ORV.A01(gzY.requireActivity(), (AnonymousClass0iw) gzY.A02.getValue(), AnonymousClass7TE.A0l(gzY.A05), C14068TpH.BCN_POST_TIFU, C16677UzD.MEDIA, this.A02);
                A012.A01 = (User) gzY.A03.getValue();
                A012.A0H = true;
                C16666Uz2 uz2 = C16666Uz2.CHEVRON_BUTTON;
                0qQ.A0B(uz2, 0);
                A012.A02 = uz2;
                C71093OcF.A00((C331157Pu) null, A012);
                i = -1774715281;
                break;
            case 1:
                A05 = AnonymousClass0fD.A05(-454719160);
                if (((Fragment) this.A01).getContext() != null) {
                    String str2 = this.A02;
                    C310346aq r2 = C310346aq.ERROR;
                    C310336ap A0a = DbS.A0a();
                    A0a.A0D = str2;
                    A0a.A0C = r2;
                    Dbb.A1Q(A0a);
                }
                i = 669565220;
                break;
            case 2:
                A05 = AnonymousClass0fD.A05(-623434338);
                C54139H0j h0j = (C54139H0j) this.A01;
                HOV hov = h0j.A00;
                if (hov != null) {
                    UserSession A0l = AnonymousClass7TE.A0l(h0j.A03);
                    1Xj r5 = h0j.A01;
                    if (r5 != null) {
                        0qQ.A0B(A0l, 1);
                        C55209Hdz.A00(hov, h0j, A0l, r5, AnonymousClass05K.A0N, (String) null, AnonymousClass7TE.A1H());
                        FH7.A03(h0j.requireContext(), this.A02);
                        i = -593281173;
                        break;
                    } else {
                        str = "entryMedia";
                    }
                } else {
                    str = "entrySurface";
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            case 3:
                EffectsPageFragment effectsPageFragment = (EffectsPageFragment) this.A01;
                String str3 = this.A02;
                C49845F9k.A00(effectsPageFragment.requireActivity(), effectsPageFragment.A07, str3);
                return;
            case 4:
                EffectsPageFragment effectsPageFragment2 = (EffectsPageFragment) this.A01;
                String str4 = this.A02;
                Reel reel = effectsPageFragment2.A09;
                if (reel != null) {
                    C57308IWr iWr = new C57308IWr(effectsPageFragment2.mEffectThumbnail, effectsPageFragment2.A0D);
                    AnonymousClass32A r4 = effectsPageFragment2.A0C;
                    r4.A0C = effectsPageFragment2.A0B.A04;
                    ? r0 = new AnonymousClass6UX();
                    r0.A00 = iWr;
                    r4.A05 = r0;
                    r4.A05(reel, AnonymousClass3BQ.REEL_BOTTOM_SHEET_AGGREGATE_STORIES, iWr, Collections.singletonList(reel), Collections.singletonList(reel), Collections.singletonList(reel));
                    C264044Oj.A00(effectsPageFragment2.A07).Ckq(28D.A13, str4);
                    return;
                }
                return;
            default:
                A05 = AnonymousClass0fD.A05(-306907502);
                GVT gvt = (GVT) this.A01;
                C49845F9k.A00(gvt.requireActivity(), AnonymousClass7TE.A0l(gvt.A0o), this.A02);
                i = 1539467614;
                break;
        }
        AnonymousClass0fD.A0C(i, A05);
    }
}
