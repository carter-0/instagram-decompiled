package X;

import android.os.Build;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.6d6  reason: invalid class name and case insensitive filesystem */
public abstract class C311696d6 {
    public static final C311716d8 A00(Bundle bundle, UserSession userSession) {
        Serializable serializable;
        Serializable serializable2;
        Serializable serializable3;
        0qQ.A0B(userSession, 0);
        Bundle bundle2 = bundle;
        ArrayList<String> stringArrayList = bundle2.getStringArrayList("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_SELECTED_REEL_IDS");
        if (stringArrayList != null) {
            ArrayList<String> stringArrayList2 = bundle2.getStringArrayList("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_SOURCE_REEL_IDS");
            if (stringArrayList2 != null) {
                int i = Build.VERSION.SDK_INT;
                if (i >= 33) {
                    serializable = bundle2.getSerializable("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_SOURCE_MODULE", AnonymousClass3BQ.class);
                } else {
                    serializable = bundle2.getSerializable("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_SOURCE_MODULE");
                }
                AnonymousClass3BQ r11 = (AnonymousClass3BQ) serializable;
                if (r11 != null) {
                    String string = bundle2.getString("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_TRAY_SESSION_ID");
                    if (string != null) {
                        int i2 = bundle2.getInt("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_NEW_STORY_REEL_COUNT", -1);
                        Integer valueOf = Integer.valueOf(i2);
                        if (i2 == -1 || valueOf == null) {
                            throw new IllegalStateException("viewedStoryReelCount must not be null");
                        }
                        int i3 = bundle2.getInt("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_NEW_STORY_REEL_COUNT", -1);
                        Integer valueOf2 = Integer.valueOf(i3);
                        if (i3 == -1 || valueOf2 == null) {
                            throw new IllegalStateException("newStoryReelCount must not be null");
                        }
                        Boolean A00 = C311706d7.A00(bundle2, "ReelViewerFragment.ARGUMENTS_KEY_EXTRA_HAS_OWN_STORY_REEL");
                        if (A00 != null) {
                            boolean booleanValue = A00.booleanValue();
                            int i4 = bundle2.getInt("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_LIVE_REEL_COUNT", -1);
                            Integer valueOf3 = Integer.valueOf(i4);
                            if (i4 == -1 || valueOf3 == null) {
                                throw new IllegalStateException("liveReelCount must not be null");
                            }
                            Long valueOf4 = Long.valueOf(bundle2.getLong("ReelViewerFragment.ARGUMENTS_REEL_VIEWER_LAUNCH_START_TIMESTAMP", 0));
                            Boolean valueOf5 = Boolean.valueOf(bundle2.getBoolean("ReelViewerFragment.ARGUMENTS_REEL_VIEWER_LAUNCH_PRELOAD_SUCCESS", false));
                            Boolean valueOf6 = Boolean.valueOf(bundle2.getBoolean("ReelViewerFragment.ARGUMENTS_KEY_REEL_VIEWER_RECENTLY_DELETED_MODE", false));
                            String string2 = bundle2.getString("ReelViewerFragment.ARGUMENTS_KEY_REEL_VIEWER_ANIMATOR_HANDLE");
                            String string3 = bundle2.getString("ReelViewerFragment.ARGUMENTS_KEY_REEL_VIEWER_HIDE_ANIMATION_COORDINATOR_HANDLE");
                            String string4 = bundle2.getString("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_DATA_CUT_FILTERING_TAG");
                            Integer valueOf7 = Integer.valueOf(bundle2.getInt("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_MID_FEED_TRAY_CLIENT_POSITION"));
                            String string5 = bundle2.getString("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_REEL_SERVER_INFO");
                            String string6 = bundle2.getString("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_RTC_MESSAGE");
                            String string7 = bundle2.getString("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_BLOKS_APP_ID");
                            String string8 = bundle2.getString("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_BLOKS_PARAMS");
                            String string9 = bundle2.getString("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_EMOJI_REACT");
                            String string10 = bundle2.getString("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_AVATAR_REACT");
                            String string11 = bundle2.getString("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_PUSH_NOTIF_TYPE");
                            String string12 = bundle2.getString("shopping_session_id");
                            String string13 = bundle2.getString("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_STORY_RANKING_TOKEN");
                            Boolean valueOf8 = Boolean.valueOf(bundle2.getBoolean("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_FORCE_LOAD_REELS"));
                            String string14 = bundle2.getString("ReelViewerFragment.ARGUMENTS_KEY_OVERRIDE_STARTING_ITEM_ID_IN_FIRST_REEL");
                            Integer valueOf9 = Integer.valueOf(bundle2.getInt("ReelViewerFragment.ARGUMENTS_KEY_OVERRIDE_STARTING_INDEX_IN_FIRST_REEL", -1));
                            Boolean valueOf10 = Boolean.valueOf(bundle2.getBoolean("ReelViewerFragment.ARGUMENTS_KEY_STORY_INTERSTITIAL"));
                            Integer valueOf11 = Integer.valueOf(bundle2.getInt("ReelViewerFragment.ARGUMENTS_KEY_OVERRIDE_STARTING_INDEX_IN_FIRST_REEL", -1));
                            Boolean valueOf12 = Boolean.valueOf(bundle2.getBoolean("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_SHOW_DASHBOARD"));
                            Boolean valueOf13 = Boolean.valueOf(bundle2.getBoolean("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_SHOW_REPORT"));
                            Boolean valueOf14 = Boolean.valueOf(bundle2.getBoolean("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_SHOW_MISINFORMATION_FACT_CHECK"));
                            Boolean valueOf15 = Boolean.valueOf(bundle2.getBoolean("ReelViewerFragment.ARGUMENTS_KEY_ANIMATE_INTERSTITIAL_OVERLAY"));
                            if (i >= 33) {
                                serializable2 = bundle2.getSerializable("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_MEDIA_REQUEST_PARAMS", Object.class);
                            } else {
                                serializable2 = bundle2.getSerializable("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_MEDIA_REQUEST_PARAMS");
                            }
                            Map map = (Map) serializable2;
                            if (i >= 33) {
                                serializable3 = bundle2.getSerializable("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_REEL_TO_REEL_ITEM_IDS_FILTER", Object.class);
                            } else {
                                serializable3 = bundle2.getSerializable("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_REEL_TO_REEL_ITEM_IDS_FILTER");
                            }
                            return new C311716d8(r11, (SearchContext) bundle2.getParcelable("arguments_search_context"), valueOf5, valueOf6, valueOf8, valueOf10, valueOf12, valueOf13, valueOf14, valueOf15, valueOf7, valueOf9, valueOf11, valueOf4, string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, bundle2.getString("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_LAUNCHED_REEL_ID"), bundle2.getString("ReelViewerFragment.ARGUMENTS_KEY_EXTRA_REEL_VIEWER_BOTTOM_SHEET_MANAGER_HANDLE"), bundle2.getString("ReelViewerFragment.ARGUMENTS_KEY_ACHIEVEMENT_ENTRY_POINT"), stringArrayList, stringArrayList2, bundle2.getStringArrayList("ReelViewerFragment.ARGUMENTS_KEY_EARNED_ACHIEVEMENT_IDS"), map, (Map) serializable3, i2, i3, i4, booleanValue);
                        }
                        throw new IllegalStateException("hasOwnStoryReel must not be null");
                    }
                    throw new IllegalStateException("traySessioId must not be null");
                }
                throw new IllegalStateException("sourceModule must not be null");
            }
            throw new IllegalStateException("sourceReelIds must not be null");
        }
        throw new IllegalStateException("selectedReelIds must not be null");
    }
}
