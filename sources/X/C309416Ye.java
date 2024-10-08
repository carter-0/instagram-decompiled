package X;

import android.os.Bundle;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.search.common.analytics.SearchContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6Ye  reason: invalid class name and case insensitive filesystem */
public final class C309416Ye {
    public int A00;
    public long A01;
    public AnonymousClass3BN A02;
    public ReelViewerConfig A03;
    public AnonymousClass3BQ A04;
    public AnonymousClass3BU A05;
    public SearchContext A06;
    public Float A07;
    public Integer A08;
    public Integer A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public ArrayList A0O;
    public ArrayList A0P;
    public ArrayList A0Q;
    public ArrayList A0R;
    public HashMap A0S;
    public HashMap A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public String A0e;
    public String A0f;
    public String A0g;
    public String A0h;
    public String A0i;

    public final void A01(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        this.A0i = userSession.A05;
    }

    public final void A02(UserSession userSession, String str, List list) {
        0qQ.A0B(list, 0);
        0qQ.A0B(userSession, 2);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        AnonymousClass3BN r3 = new AnonymousClass3BN(userSession, list);
        Iterator it = list.iterator();
        AnonymousClass6WH r7 = null;
        Reel reel = null;
        while (it.hasNext()) {
            Reel reel2 = (Reel) it.next();
            if (2Ob.A00(reel2.getId(), str)) {
                reel = reel2;
            }
            arrayList2.add(reel2.getId());
        }
        if (reel != null) {
            r7 = new AnonymousClass6WH(userSession, reel);
        }
        int A002 = AnonymousClass6WI.A00(userSession, r7, arrayList, list);
        if (A002 < 0) {
            String str2 = userSession.A06;
            Iterator it2 = list.iterator();
            String str3 = "";
            while (it2.hasNext()) {
                C239023El A003 = C239023El.A00(',');
                Iterator it3 = new C13247TRn(str3, ((Reel) it2.next()).getId(), new Object[0]).iterator();
                StringBuilder sb = new StringBuilder();
                A003.A03(sb, it3);
                str3 = sb.toString();
            }
            if (str3.startsWith(",")) {
                str3 = str3.substring(1);
            }
            0wb.A03("InvalidOffset", StringFormatUtil.formatStrLocaleSafe("Reel with ID: %s for logged in user ID: %s, not found in reels.\nReelIds: %s", str, str2, str3));
        }
        int max = Math.max(A002, 0);
        this.A02 = r3;
        this.A0O = arrayList;
        this.A0Q = arrayList2;
        this.A00 = max;
        this.A0e = str;
    }

    public final void A03(AnonymousClass3BQ r2) {
        0qQ.A0B(r2, 0);
        this.A04 = r2;
    }

    public final void A05(String str) {
        0qQ.A0B(str, 0);
        this.A0f = str;
    }

    public final void A06(String str) {
        0qQ.A0B(str, 0);
        this.A0g = str;
    }

    public final void A07(String str) {
        0qQ.A0B(str, 0);
        this.A0h = str;
    }

    public final void A08(String str) {
        0qQ.A0B(str, 0);
        this.A0N = str;
    }

    public final void A09(ArrayList arrayList) {
        0qQ.A0B(arrayList, 0);
        this.A0O = arrayList;
    }

    public final void A0A(ArrayList arrayList) {
        0qQ.A0B(arrayList, 0);
        this.A0Q = arrayList;
    }

    public final Bundle A00() {
        AnonymousClass3BN r0;
        if (this.A0O == null || this.A0Q == null || this.A04 == null || this.A0N == null || this.A02 == null) {
            0wb.A03("ReelViewerFragmentParams", "ReelViewerFragmentParams builder validatation failed!");
        }
        if (this.A04 == AnonymousClass3BQ.PUSH_NOTIFICATION && (r0 = this.A02) != null && r0.A01.A00.A01 == 0 && this.A0G == null) {
            0wb.A03("ReelViewerFragmentParams", "Source is push notification but push notification type is missing (non-live notification)");
        }
        if (this.A03 == null) {
            this.A03 = ReelViewerConfig.A00();
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_SELECTED_REEL_IDS", this.A0O);
        bundle.putStringArrayList("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_SOURCE_REEL_IDS", this.A0Q);
        bundle.putString("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_LAUNCHED_REEL_ID", this.A0e);
        bundle.putSerializable("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_SOURCE_MODULE", this.A04);
        bundle.putString("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_PUSH_NOTIF_TYPE", this.A0G);
        bundle.putString("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_TRAY_SESSION_ID", this.A0N);
        bundle.putBoolean("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_FORCE_LOAD_REELS", this.A0V);
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", this.A0i);
        bundle.putInt("ReelViewerFragment.ARGUMENTS_KEY_SELECTED_REEL_INDEX", this.A00);
        AnonymousClass3BN r02 = this.A02;
        if (r02 != null) {
            bundle.putInt("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_VIEWED_STORY_REEL_COUNT", r02.A01.A01.A03);
            AnonymousClass3BN r03 = this.A02;
            0qQ.A0A(r03);
            bundle.putInt("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_NEW_STORY_REEL_COUNT", r03.A01.A01.A01);
            AnonymousClass3BN r04 = this.A02;
            0qQ.A0A(r04);
            boolean z = false;
            if (r04.A01.A01.A02 != 0) {
                z = true;
            }
            bundle.putBoolean("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_HAS_OWN_STORY_REEL", z);
            AnonymousClass3BN r05 = this.A02;
            0qQ.A0A(r05);
            bundle.putInt("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_LIVE_REEL_COUNT", r05.A01.A00.A01);
        }
        bundle.putString("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_STORY_RANKING_TOKEN", this.A0M);
        bundle.putLong("ReelViewerFragment.ARGUMENTS_REEL_VIEWER_LAUNCH_START_TIMESTAMP", this.A01);
        bundle.putBoolean("ReelViewerFragment.ARGUMENTS_REEL_VIEWER_LAUNCH_PRELOAD_SUCCESS", this.A0d);
        bundle.putBoolean("ReelViewerFragment.ARGUMENTS_KEY_REEL_VIEWER_RECENTLY_DELETED_MODE", this.A0W);
        bundle.putBoolean("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_SHOW_DASHBOARD", this.A0Z);
        bundle.putBoolean("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_SHOW_REPORT", this.A0b);
        bundle.putBoolean("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_SHOW_MISINFORMATION_FACT_CHECK", this.A0a);
        bundle.putBoolean("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_SHOW_STORY_COMMENT_SHEET", this.A0c);
        bundle.putStringArrayList("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_STORY_MENTIONS_PRESELECTED_USER_IDS", this.A0R);
        bundle.putBoolean("ReelViewerFragment.ARGUMENTS_KEY_ANIMATE_INTERSTITIAL_OVERLAY", this.A0X);
        bundle.putBoolean("ReelViewerFragment.ARGUMENTS_KEY_STORY_INTERSTITIAL", this.A0Y);
        bundle.putSerializable("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_MEDIA_REQUEST_PARAMS", this.A0S);
        bundle.putBoolean("ReelViewerFragment.ARGUMENTS_KEY_IS_MOMENT", false);
        bundle.putString("ReelViewerFragment.ARGUMENTS_KEY_REEL_VIEWER_ANIMATOR_HANDLE", this.A0f);
        bundle.putString("ReelViewerFragment.ARGUMENTS_KEY_REEL_VIEWER_HIDE_ANIMATION_COORDINATOR_HANDLE", this.A0h);
        bundle.putSerializable("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_REEL_TO_REEL_ITEM_IDS_FILTER", this.A0T);
        bundle.putString("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_DATA_CUT_FILTERING_TAG", this.A0F);
        Integer num = this.A08;
        if (num != null) {
            bundle.putInt("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_MID_FEED_TRAY_CLIENT_POSITION", num.intValue());
        }
        String str = this.A0L;
        if (str != null) {
            bundle.putString("ReelViewerFragment.ARGUMENTS_KEY_OVERRIDE_STARTING_ITEM_ID_IN_FIRST_REEL", str);
        }
        Integer num2 = this.A09;
        if (num2 != null) {
            bundle.putInt("ReelViewerFragment.ARGUMENTS_KEY_OVERRIDE_STARTING_INDEX_IN_FIRST_REEL", num2.intValue());
        }
        bundle.putParcelable("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_REEL_VIEWER_CONFIG", this.A03);
        String str2 = this.A0g;
        if (str2 != null) {
            bundle.putString("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_REEL_VIEWER_BOTTOM_SHEET_MANAGER_HANDLE", str2);
        }
        String str3 = this.A0E;
        if (str3 != null) {
            bundle.putString("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_EMOJI_REACT", str3);
        }
        String str4 = this.A0B;
        if (str4 != null) {
            bundle.putString("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_AVATAR_REACT", str4);
        }
        String str5 = this.A0H;
        if (str5 != null) {
            bundle.putString("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_REEL_SERVER_INFO", str5);
        }
        String str6 = this.A0J;
        if (str6 != null) {
            bundle.putString("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_RTC_MESSAGE", str6);
        }
        String str7 = this.A0C;
        if (str7 != null) {
            bundle.putString("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_BLOKS_APP_ID", str7);
        }
        String str8 = this.A0D;
        if (str8 != null) {
            bundle.putString("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_BLOKS_PARAMS", str8);
        }
        String str9 = this.A0K;
        if (str9 != null) {
            bundle.putString("shopping_session_id", str9);
        }
        SearchContext searchContext = this.A06;
        if (searchContext != null) {
            bundle.putParcelable("arguments_search_context", searchContext);
        }
        ArrayList arrayList = this.A0P;
        if (arrayList != null) {
            bundle.putStringArrayList("ReelViewerFragment.ARGUMENTS_KEY_EARNED_ACHIEVEMENT_IDS", arrayList);
        }
        String str10 = this.A0A;
        if (str10 != null) {
            bundle.putString("ReelViewerFragment.ARGUMENTS_KEY_ACHIEVEMENT_ENTRY_POINT", str10);
        }
        AnonymousClass3BU r1 = this.A05;
        if (r1 != null) {
            bundle.putSerializable("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_MEDIA_REQUEST_REASON", r1);
        }
        bundle.putBoolean("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_ENTERING_FROM_TRAY_END_CARD", this.A0U);
        Float f = this.A07;
        if (f != null) {
            bundle.putFloat("ReelViewerFragment.ARGUMENTS_KEY_STARTING_ITEM_PROGRESS", f.floatValue());
        }
        String str11 = this.A0I;
        if (str11 != null) {
            bundle.putString("ReelViewerFragment.ARGUMENTS_REEL_TRAY_TYPE", str11);
        }
        return bundle;
    }

    public final /* bridge */ /* synthetic */ void A04(Integer num) {
        int intValue = num.intValue();
        if (this.A0L == null) {
            this.A09 = Integer.valueOf(intValue);
            return;
        }
        throw new IllegalStateException("You're calling both setStartingItemIdInReel() and setStartingPositionInReel(). You should only be using one of them.");
    }
}
