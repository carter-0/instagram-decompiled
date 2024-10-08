package X;

import android.app.Activity;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.constants.AudioTrackType;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.search.tabloader.MusicOverlaySearchTab;
import java.util.Map;

/* renamed from: X.LLy  reason: case insensitive filesystem */
public abstract class C64080LLy {
    public static L3O A00;
    public static 1Xj A01;
    public static C331157Pu A02;
    public static String A03;
    public static String A04;

    public static final String A00(AudioOverlayTrack audioOverlayTrack, String str) {
        MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
        if (musicAssetModel != null) {
            return C59670JTa.A05(C59670JTa.A01(MusicProduct.BOOST_AUDIO_BROWSER, audioOverlayTrack, musicAssetModel, str));
        }
        return null;
    }

    public static final void A01(Activity activity, L3O l3o, UserSession userSession, 1Xj r15, String str, boolean z) {
        C16678UzE uzE;
        String str2 = str;
        if (A02 == null) {
            if (str == null) {
                str2 = AnonymousClass7TG.A0j();
            }
            A04 = str2;
            A01 = r15;
            A00 = l3o;
            A03 = null;
            if (!AnonymousClass1GD.A03()) {
                activity.getTheme().applyStyle(R.style.MusicCreationLightOverlayTheme, true);
            }
            AnonymousClass80X r9 = AnonymousClass80X.UNINITIALIZED;
            MusicProduct musicProduct = MusicProduct.BOOST_AUDIO_BROWSER;
            ImmutableList of = ImmutableList.of(AudioTrackType.ORIGINAL, AudioTrackType.REACTIVE);
            0qQ.A07(of);
            K6I A012 = LJS.A01((C3515589i) null, of, musicProduct, userSession, MusicOverlaySearchTab.A03, r9, str2, (Map) null);
            A012.A03 = new C65508LuW(activity, userSession, A012, z);
            WGU A002 = WGU.A00(userSession);
            if (z) {
                uzE = C16678UzE.AUDIO_SELECTION_MUSIC_BROWSER;
            } else {
                uzE = C16678UzE.AUDIO_SWAP_MUSIC_BROWSER;
            }
            A002.A0Q(uzE.toString());
            C331127Pr A0e = DbX.A0e(userSession, true);
            A0e.A03 = 1.0f;
            A0e.A06 = activity.getColor(2Yu.A0C(activity));
            A0e.A0T = A012;
            A02 = A0e.A00().A02(activity, A012);
        }
    }
}
