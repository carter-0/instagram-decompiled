package X;

import android.os.Bundle;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.search.tabloader.MusicOverlaySearchTab;
import java.io.Serializable;
import java.util.Map;

public abstract class LJS {
    public static final K6I A01(C3515589i r15, ImmutableList immutableList, MusicProduct musicProduct, UserSession userSession, MusicOverlaySearchTab musicOverlaySearchTab, AnonymousClass80X r20, String str, Map map) {
        return A00((C62642Kk4) null, r15, (C371088xY) null, immutableList, (ImmutableList) null, musicProduct, userSession, (MusicAttributionConfig) null, musicOverlaySearchTab, r20, str, (String) null, (String) null, map, false, false, false);
    }

    public static final K6I A00(C62642Kk4 kk4, C3515589i r5, C371088xY r6, ImmutableList immutableList, ImmutableList immutableList2, MusicProduct musicProduct, UserSession userSession, MusicAttributionConfig musicAttributionConfig, MusicOverlaySearchTab musicOverlaySearchTab, AnonymousClass80X r13, String str, String str2, String str3, Map map, boolean z, boolean z2, boolean z3) {
        Map map2 = map;
        C51972G9s.A1C(str, immutableList);
        Bundle A09 = DbY.A09(userSession);
        A09.putString(AnonymousClass000.A00(172), str);
        A09.putSerializable("music_product", musicProduct);
        A09.putSerializable("capture_state", r13);
        A09.putBoolean("is_from_share_sheet", z);
        A09.putParcelableArrayList("audio_track_type_to_exclude", AnonymousClass7TE.A1D(immutableList));
        if (musicOverlaySearchTab != null) {
            A09.putParcelable("default_focused_tab", musicOverlaySearchTab);
        }
        if (musicAttributionConfig != null) {
            A09.putParcelable("preload_music_attribution_config", musicAttributionConfig);
        }
        A09.putSerializable("music_browser_entry_point", r5);
        A09.putSerializable("attached_tracks", immutableList2);
        A09.putString("media_id", str2);
        A09.putString("args_pre_filled_search_term", str3);
        A09.putSerializable("surface_element", r6);
        A09.putSerializable("audio_editor_entry_point", kk4);
        A09.putBoolean("should_use_light_mode", z2);
        A09.putSerializable("visual_features", (Serializable) map2);
        A09.putBoolean("enable_share_from_spotify", z3);
        K6I k6i = new K6I();
        k6i.setArguments(A09);
        return k6i;
    }
}
