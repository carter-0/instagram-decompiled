package X;

import android.os.Bundle;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.MusicBrowseCategory;
import com.instagram.music.search.tabloader.MusicOverlaySearchTab;
import java.io.Serializable;
import java.util.Map;

/* renamed from: X.KvZ  reason: case insensitive filesystem */
public abstract class C63352KvZ {
    public static final C61423K6w A00(C3515589i r5, C59725JVj jVj, ImmutableList immutableList, ImmutableList immutableList2, MusicProduct musicProduct, UserSession userSession, MusicAttributionConfig musicAttributionConfig, MusicBrowseCategory musicBrowseCategory, MusicOverlaySearchTab musicOverlaySearchTab, AnonymousClass80X r14, String str, String str2, String str3, Map map, int i, boolean z, boolean z2) {
        0qQ.A0B(userSession, 0);
        C51974G9v.A0d(3, musicProduct, immutableList, str, r14);
        0qQ.A0B(jVj, 7);
        C61423K6w k6w = new C61423K6w();
        Bundle A09 = DbY.A09(userSession);
        A09.putParcelable("MusicOverlayBrowseResultsFragment.music_browse_category", musicBrowseCategory);
        A09.putParcelable("MusicOverlayBrowseResultsFragment.music_overlay_search_tab", musicOverlaySearchTab);
        A09.putParcelable("MusicOverlayBrowseResultsFragment.music_attribution_config", musicAttributionConfig);
        A09.putSerializable("music_product", musicProduct);
        A09.putParcelableArrayList("audio_type_to_exclude", AnonymousClass7TE.A1D(immutableList));
        A09.putString("browse_session_full_id", str);
        A09.putSerializable("capture_state", r14);
        A09.putSerializable("camera_surface_type", jVj);
        A09.putSerializable("camera_music_browser_entry_point", r5);
        A09.putSerializable("camera_already_attached_tracks", immutableList2);
        A09.putBoolean("MusicOverlayBrowseResultsFragment.is_tabbed_fragment", z);
        A09.putInt("list_bottom_padding_px", i);
        A09.putString("media_id", str2);
        A09.putBoolean("MusicOverlayBrowseResultsFragment.should_use_light_mode", z2);
        A09.putSerializable("visual_features", (Serializable) map);
        A09.putString("MusicOverlayBrowseResultsFragment.audio_browser_surface", str3);
        k6w.setArguments(A09);
        return k6w;
    }
}
