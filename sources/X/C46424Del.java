package X;

import android.os.Bundle;
import com.instagram.feed.intf.ContextualFeedNetworkConfig;
import com.instagram.search.common.analytics.SearchContext;
import instagram.features.feed.fragment.ContextualFeedFragment;
import java.util.ArrayList;

/* renamed from: X.Del  reason: case insensitive filesystem */
public final class C46424Del {
    public Bundle A00;
    public Bundle A01;
    public 0jB A02;
    public ContextualFeedNetworkConfig A03;
    public SearchContext A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public ArrayList A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final String A0G;

    public static Bundle A02(Bundle bundle, Bundle bundle2, 0jB r28, ContextualFeedNetworkConfig contextualFeedNetworkConfig, SearchContext searchContext, String str, String str2, String str3, String str4, String str5, ArrayList arrayList, boolean z) {
        return A01(bundle, bundle2, r28, contextualFeedNetworkConfig, searchContext, (String) null, str, str2, (String) null, str3, str4, (String) null, (String) null, str5, (String) null, (String) null, arrayList, 0, 0, 0, false, false, false, false, z, true);
    }

    public static Bundle A03(Bundle bundle, ContextualFeedNetworkConfig contextualFeedNetworkConfig, String str, String str2, String str3, String str4, ArrayList arrayList, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return A00((Bundle) null, bundle, (0jB) null, contextualFeedNetworkConfig, (SearchContext) null, (Integer) null, str, str2, (String) null, str3, str4, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, arrayList, 0, z, false, false, false, false, z2, z3, false, z4, z5);
    }

    public static Bundle A04(Bundle bundle, String str, String str2, String str3, String str4, String str5, String str6, ArrayList arrayList) {
        return A00((Bundle) null, bundle, (0jB) null, (ContextualFeedNetworkConfig) null, (SearchContext) null, (Integer) null, str, str2, (String) null, str3, str4, (String) null, (String) null, (String) null, (String) null, str5, (String) null, (String) null, str6, (String) null, arrayList, 0, false, false, false, false, false, false, false, false, true, false);
    }

    public static Bundle A05(Bundle bundle, String str, String str2, String str3, String str4, String str5, ArrayList arrayList) {
        return A00((Bundle) null, bundle, (0jB) null, (ContextualFeedNetworkConfig) null, (SearchContext) null, (Integer) null, str, str2, (String) null, str3, str4, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, str5, (String) null, arrayList, 0, false, false, false, false, false, false, false, false, true, false);
    }

    public final void A08(C14005To7 to7) {
        0qQ.A0B(to7, 0);
        Bundle bundle = this.A00;
        if (bundle == null) {
            bundle = AnonymousClass7TE.A0a();
            this.A00 = bundle;
        }
        to7.A01(bundle);
    }

    public final void A09(ArrayList arrayList) {
        0qQ.A0B(arrayList, 0);
        this.A0B = arrayList;
    }

    public final ContextualFeedFragment A07() {
        ContextualFeedFragment contextualFeedFragment = new ContextualFeedFragment();
        contextualFeedFragment.setArguments(A06());
        return contextualFeedFragment;
    }

    public C46424Del(String str) {
        this.A0G = str;
    }

    public final Bundle A06() {
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("ContextualFeedFragment.ARGUMENT_MEDIA_INITIAL_POSITION", this.A08);
        A0a.putStringArrayList("ContextualFeedFragment.ARGUMENT_MEDIA_ID_LIST", this.A0B);
        A0a.putString("ContextualFeedFragment.ARGUMENT_FEED_TITLE", this.A07);
        A0a.putString("ContextualFeedFragment.ARGUMENT_FEED_SUBTITLE", (String) null);
        A0a.putBoolean("ContextualFeedFragment.ARGUMENT_IS_NAVIGATION_FROM_FULL_AUDIENCE_MEDIA_GRID", false);
        A0a.putString("ContextualFeedFragment.ARGUMENT_TAB_ANALYTICS_NAME", (String) null);
        A0a.putString(AnonymousClass000.A00(41), this.A0G);
        A0a.putString(C273654mx.A00(34), (String) null);
        A0a.putString(AnonymousClass000.A00(213), (String) null);
        A0a.putBoolean(AnonymousClass000.A00(215), false);
        A0a.putString(AnonymousClass000.A00(103), this.A06);
        A0a.putParcelable(AnonymousClass000.A00(427), this.A03);
        A0a.putBoolean("ContextualFeedFragment.ARGUMENT_SHOULD_SHOW_EDIT_IN_ACTION_BAR", false);
        A0a.putBoolean("ContextualFeedFragment.ARGUMENT_SHOW_ACTION_BAR_WHEN_SCROLL_DOWN", this.A0F);
        A0a.putString(AnonymousClass000.A00(216), (String) null);
        A0a.putString("ContextualFeedFragment.ARGUMENT_PRIOR_MODULE", this.A09);
        A0a.putBundle("ContextualFeedFragment.ARGUMENT_EXTRA_ANALYTICS", this.A00);
        Bundle bundle = this.A01;
        if (bundle != null) {
            A0a.putAll(bundle);
        }
        A0a.putString(AnonymousClass000.A00(58), this.A0A);
        0jB r1 = this.A02;
        if (r1 != null) {
            A0a.putSerializable("ContextualFeedFragment.ARGUMENT_NAVIGATION_EVENT_EXTRA.V2", r1);
        }
        A0a.putBoolean("ContextualFeedFragment.ARGUMENT_IS_ELIGIBLE_FOR_REALTIME_SIGNAL_REPORTING", this.A0C);
        A0a.putBoolean("ContextualFeedFragment.ARGUMENT_SET_PAGING", false);
        A0a.putString(C273654mx.A00(106), (String) null);
        A0a.putBoolean("ContextualFeedFragment.ARGUMENT_SHOULD_HIDE_UFI_BUTTONS", this.A0D);
        A0a.putInt("ContextualFeedFragment.ARGUMENT_GRID_INDEX", 0);
        String str = this.A05;
        if (str != null) {
            A0a.putString("ContextualFeedFragment.ARGUMENT_CONTENT_SCHEDULING_ENTRY_POINT", str);
        }
        A0a.putBoolean("ContextualFeedFragment.ARGUMENT_SHOULD_OPEN_CAROUSEL_INDEX_OF_TAGGED_PHOTO", false);
        SearchContext searchContext = this.A04;
        if (searchContext != null) {
            A0a.putParcelable("ContextualFeedFragment.SEARCH_CONTEXT", searchContext);
        }
        A0a.putBoolean("ContextualFeedFragment.ARGUMENT_SHOULD_USE_BASE_DIFF_UTIL", true);
        A0a.putBoolean("ContextualFeedFragment.ARGUMENT_USER_ELIGIBLE_FOR_PROFILE_FEED_AD", true);
        A0a.putBoolean("ContextualFeedFragment.ARGUMENT_IS_HUNT_AND_PECK_ENTRY", false);
        A0a.putBoolean(AnonymousClass000.A00(214), false);
        A0a.putBoolean("ContextualFeedFragment.ARGUMENT_SHOULD_SHOW_BOOST_GUIDANCE_BAR", this.A0E);
        A0a.putBoolean("ContextualFeedFragment.ARGUMENT_SHOULD_SHOW_TOP_STICKY_BANNER", false);
        return A0a;
    }

    public static Bundle A00(Bundle bundle, Bundle bundle2, 0jB r7, ContextualFeedNetworkConfig contextualFeedNetworkConfig, SearchContext searchContext, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, ArrayList arrayList, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        Bundle A0A2 = DbZ.A0A(str4, str2, arrayList, z4);
        A0A2.putString("ContextualFeedFragment.ARGUMENT_TAB_ANALYTICS_NAME", str14);
        A0A2.putString(AnonymousClass000.A00(41), str5);
        A0A2.putString(C273654mx.A00(34), str6);
        A0A2.putString(AnonymousClass000.A00(213), str3);
        A0A2.putBoolean(AnonymousClass000.A00(215), z5);
        A0A2.putString(AnonymousClass000.A00(103), str);
        A0A2.putParcelable(AnonymousClass000.A00(427), contextualFeedNetworkConfig);
        A0A2.putBoolean("ContextualFeedFragment.ARGUMENT_SHOULD_SHOW_EDIT_IN_ACTION_BAR", z7);
        A0A2.putBoolean("ContextualFeedFragment.ARGUMENT_SHOW_ACTION_BAR_WHEN_SCROLL_DOWN", z10);
        A0A2.putString(AnonymousClass000.A00(216), str7);
        A0A2.putString("ContextualFeedFragment.ARGUMENT_PRIOR_MODULE", str10);
        A0A2.putBundle("ContextualFeedFragment.ARGUMENT_EXTRA_ANALYTICS", bundle);
        if (bundle2 != null) {
            A0A2.putAll(bundle2);
        }
        A0A2.putString(AnonymousClass000.A00(58), str13);
        if (r7 != null) {
            A0A2.putSerializable("ContextualFeedFragment.ARGUMENT_NAVIGATION_EVENT_EXTRA.V2", r7);
        }
        A0A2.putBoolean("ContextualFeedFragment.ARGUMENT_IS_ELIGIBLE_FOR_REALTIME_SIGNAL_REPORTING", z2);
        A0A2.putBoolean("ContextualFeedFragment.ARGUMENT_SET_PAGING", z);
        A0A2.putString(C273654mx.A00(106), str11);
        A0A2.putBoolean("ContextualFeedFragment.ARGUMENT_SHOULD_HIDE_UFI_BUTTONS", z6);
        A0A2.putInt("ContextualFeedFragment.ARGUMENT_GRID_INDEX", i);
        A0A2.putBoolean("ContextualFeedFragment.ARGUMENT_SHOULD_OPEN_CAROUSEL_INDEX_OF_TAGGED_PHOTO", false);
        if (num != null) {
            A0A2.putInt(AnonymousClass000.A00(2183), num.intValue());
        }
        if (searchContext != null) {
            A0A2.putParcelable("ContextualFeedFragment.SEARCH_CONTEXT", searchContext);
        }
        String str15 = str12;
        if (str12 != null) {
            A0A2.putString("ContextualFeedFragment.ARGUMENT_SEED_MEDIA_ID", str15);
        }
        String str16 = str8;
        if (str8 != null) {
            A0A2.putString("ContextualFeedFragment.ARGUMENT_PARENT_CAROUSEL_MEDIA_ID", str16);
        }
        String str17 = str9;
        if (str9 != null) {
            A0A2.putString("ContextualFeedFragment.ARGUMENT_PARENT_CAROUSEL_MEDIA_THUMBNAIL_URL", str17);
        }
        A0A2.putBoolean("ContextualFeedFragment.ARGUMENT_SHOULD_USE_BASE_DIFF_UTIL", z9);
        A0A2.putBoolean("ContextualFeedFragment.ARGUMENT_USER_ELIGIBLE_FOR_PROFILE_FEED_AD", true);
        A0A2.putBoolean("ContextualFeedFragment.ARGUMENT_IS_HUNT_AND_PECK_ENTRY", false);
        A0A2.putBoolean(AnonymousClass000.A00(214), z3);
        A0A2.putBoolean("ContextualFeedFragment.ARGUMENT_SHOULD_SHOW_BOOST_GUIDANCE_BAR", false);
        A0A2.putBoolean("ContextualFeedFragment.ARGUMENT_SHOULD_SHOW_TOP_STICKY_BANNER", z8);
        return A0A2;
    }

    public static Bundle A01(Bundle bundle, Bundle bundle2, 0jB r7, ContextualFeedNetworkConfig contextualFeedNetworkConfig, SearchContext searchContext, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, ArrayList arrayList, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        Bundle A0A2 = DbZ.A0A(str5, str3, arrayList, z2);
        A0A2.putString("ContextualFeedFragment.ARGUMENT_TAB_ANALYTICS_NAME", str11);
        A0A2.putString(AnonymousClass000.A00(41), str6);
        A0A2.putString(C273654mx.A00(34), (String) null);
        A0A2.putString(AnonymousClass000.A00(213), (String) null);
        A0A2.putBoolean(AnonymousClass000.A00(215), false);
        A0A2.putString(AnonymousClass000.A00(103), str2);
        A0A2.putParcelable(AnonymousClass000.A00(427), contextualFeedNetworkConfig);
        A0A2.putBoolean("ContextualFeedFragment.ARGUMENT_SHOULD_SHOW_EDIT_IN_ACTION_BAR", z5);
        A0A2.putBoolean("ContextualFeedFragment.ARGUMENT_SHOW_ACTION_BAR_WHEN_SCROLL_DOWN", false);
        A0A2.putString(AnonymousClass000.A00(216), (String) null);
        A0A2.putString("ContextualFeedFragment.ARGUMENT_PRIOR_MODULE", str7);
        A0A2.putBundle("ContextualFeedFragment.ARGUMENT_EXTRA_ANALYTICS", bundle);
        if (bundle2 != null) {
            A0A2.putAll(bundle2);
        }
        A0A2.putString(AnonymousClass000.A00(58), str9);
        if (r7 != null) {
            A0A2.putSerializable("ContextualFeedFragment.ARGUMENT_NAVIGATION_EVENT_EXTRA.V2", r7);
        }
        A0A2.putBoolean("ContextualFeedFragment.ARGUMENT_IS_ELIGIBLE_FOR_REALTIME_SIGNAL_REPORTING", false);
        A0A2.putBoolean("ContextualFeedFragment.ARGUMENT_SET_PAGING", false);
        A0A2.putString(C273654mx.A00(106), (String) null);
        A0A2.putBoolean("ContextualFeedFragment.ARGUMENT_SHOULD_HIDE_UFI_BUTTONS", z3);
        String str12 = str10;
        if (str10 != null) {
            A0A2.putString(AnonymousClass000.A00(2182), str12);
            A0A2.putInt("ContextualFeedFragment.ARGUMENTS_SOURCE_MEDIA_CAROUSEL_INDEX", i2);
            A0A2.putInt("ContextualFeedFragment.ARGUMENTS_SOURCE_MEDIA_POSITION", i3);
        }
        A0A2.putInt("ContextualFeedFragment.ARGUMENT_GRID_INDEX", i);
        if (str != null) {
            A0A2.putString("ContextualFeedFragment.ARGUMENT_CONTENT_SCHEDULING_ENTRY_POINT", str);
        }
        A0A2.putBoolean("ContextualFeedFragment.ARGUMENT_SHOULD_OPEN_CAROUSEL_INDEX_OF_TAGGED_PHOTO", z4);
        if (str4 != null) {
            A0A2.putString("ContextualFeedFragment.ARGUMENT_HOST_PROFILE_USER_ID", str4);
        }
        if (searchContext != null) {
            A0A2.putParcelable("ContextualFeedFragment.SEARCH_CONTEXT", searchContext);
        }
        String str13 = str8;
        if (str8 != null) {
            A0A2.putString("ContextualFeedFragment.ARGUMENT_SEED_MEDIA_ID", str13);
        }
        A0A2.putBoolean("ContextualFeedFragment.ARGUMENT_SHOULD_USE_BASE_DIFF_UTIL", true);
        A0A2.putBoolean("ContextualFeedFragment.ARGUMENT_USER_ELIGIBLE_FOR_PROFILE_FEED_AD", z6);
        A0A2.putBoolean("ContextualFeedFragment.ARGUMENT_IS_HUNT_AND_PECK_ENTRY", z);
        A0A2.putBoolean(AnonymousClass000.A00(214), false);
        A0A2.putBoolean("ContextualFeedFragment.ARGUMENT_SHOULD_SHOW_BOOST_GUIDANCE_BAR", false);
        A0A2.putBoolean("ContextualFeedFragment.ARGUMENT_SHOULD_SHOW_TOP_STICKY_BANNER", false);
        return A0A2;
    }
}
