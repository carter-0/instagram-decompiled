package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.save.analytics.SaveToCollectionsParentInsightsHost;
import com.instagram.save.api.SaveApiUtil;
import com.instagram.search.common.analytics.SearchContext;

/* renamed from: X.6iz  reason: invalid class name and case insensitive filesystem */
public final class C314876iz implements AnonymousClass324 {
    public final Activity A00;
    public final 1Ng A01;
    public final AnonymousClass4DJ A02;
    public final UserSession A03;
    public final AnonymousClass4DU A04;
    public final C273384mU A05;
    public final C249763kK A06;
    public final Fragment A07;

    public final void DgX(1Xj r10, AnonymousClass3W1 r11, C59612JQg jQg, int i) {
        AnonymousClass3W1 r6 = r11;
        int i2 = r11.A03;
        r11.A08();
        UserSession userSession = this.A03;
        1Xj r5 = r10;
        int i3 = i;
        if (C225892f5.A00(userSession).A0O(r10)) {
            r10.A3i();
            if (!r10.A3i().isEmpty()) {
                this.A05.EHY("dialog");
                new C55969Hqa(this.A00, userSession, jQg).A00(new I92(this), r5, r6, i2, i3);
                return;
            }
        }
        A00(r10, this, i2, i);
    }

    public final void DgZ(1Xj r11, AnonymousClass3W1 r12, int i) {
        0jB r0;
        Activity activity = this.A00;
        if (activity.getCurrentFocus() != null) {
            0nA.A0N(activity.getCurrentFocus());
        }
        AnonymousClass4DU r5 = this.A04;
        UserSession userSession = this.A03;
        I6U.A04(userSession, r11, r5, "long_press", i);
        this.A05.EHY("bottom_sheet");
        C55115HcO.A00();
        C249763kK r8 = this.A06;
        String str = userSession.A05;
        String moduleName = r5.getModuleName();
        boolean isSponsoredEligible = r5.isSponsoredEligible();
        boolean isOrganicEligible = r5.isOrganicEligible();
        if (r5 instanceof C232682uF) {
            r0 = ((C232682uF) r5).E4l(r11);
        } else {
            r0 = null;
        }
        SaveToCollectionsParentInsightsHost saveToCollectionsParentInsightsHost = new SaveToCollectionsParentInsightsHost(r0, moduleName, isSponsoredEligible, isOrganicEligible);
        0qQ.A0B(r11, 0);
        0qQ.A0B(r12, 1);
        0qQ.A0B(str, 4);
        C54171H1q h1q = new C54171H1q();
        Bundle bundle = new Bundle();
        bundle.putString("SaveToCollectionsFragment.ARGS_MEDIA_ID", r11.getId());
        bundle.putInt("SaveToCollectionsFragment.ARGS_CAROUSEL_INDEX", r12.A03);
        bundle.putInt("SaveToCollectionsFragment.ARGS_POSITION", i);
        bundle.putString("SaveToCollectionsFragment.ARGS_COLLECTION_ID_VIEWING", (String) null);
        bundle.putString("SaveToCollectionsFragment.ARGS_SESSION_ID", r8.getSessionId());
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", str);
        bundle.putString("SaveToCollectionsFragment.ARGS_NAVIGATION_TYPE", "long_press");
        bundle.putParcelable("SaveToCollectionsFragment.ARGS_PARENT_MODULE", saveToCollectionsParentInsightsHost);
        h1q.setArguments(bundle);
        AnonymousClass37D A012 = AnonymousClass37D.A00.A01(activity);
        if (A012 != null) {
            A012.A0Q(new HFS(this));
            A012.A0Q(h1q);
            A012.A0I(h1q);
        }
        this.A01.A05(new C57076INq(true));
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.Hj6, java.lang.Object] */
    public static void A00(1Xj r16, C314876iz r17, int i, int i2) {
        C243373Ym r9;
        C314876iz r2 = r17;
        UserSession userSession = r2.A03;
        1Xj r6 = r16;
        if (C225892f5.A00(userSession).A0O(r6)) {
            r9 = C243373Ym.NOT_SAVED;
        } else {
            r9 = C243373Ym.SAVED;
        }
        AnonymousClass4DU r7 = r2.A04;
        Activity activity = r2.A00;
        C249763kK r11 = r2.A06;
        IX8 ix8 = new IX8(r9, r2);
        0qQ.A0B(r6, 0);
        0qQ.A0B(userSession, 6);
        Activity activity2 = activity;
        SaveApiUtil.A04(activity, activity2, userSession, r6, r7, ix8, r9, (SearchContext) null, r11, (String) null, (String) null, (String) null, i2, i, -1);
        1Ng r1 = r2.A01;
        ? obj = new Object();
        obj.A00 = r6;
        r1.A00(C55120HcT.A00(obj));
        r2.A05.EHd();
    }

    public final C59612JQg CBn() {
        return new IXX(this);
    }

    public C314876iz(Fragment fragment, UserSession userSession, AnonymousClass4DU r4, C273384mU r5, C249763kK r6) {
        this.A07 = fragment;
        this.A00 = fragment.requireActivity();
        this.A02 = (AnonymousClass4DJ) fragment;
        this.A05 = r5;
        this.A06 = r6;
        this.A04 = r4;
        this.A03 = userSession;
        this.A01 = AnonymousClass1Nd.A00(userSession);
    }
}
