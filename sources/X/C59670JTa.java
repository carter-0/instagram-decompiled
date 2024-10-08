package X;

import android.net.Uri;
import com.instagram.api.schemas.AudioMutingInfo;
import com.instagram.api.schemas.MusicMuteAudioReason;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.AudioType;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicDataSource;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.user.model.User;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.JTa  reason: case insensitive filesystem */
public abstract class C59670JTa {
    public static final MusicOverlayStickerModel A03(MusicProduct musicProduct, MusicAssetModel musicAssetModel, Integer num, Integer num2, String str) {
        return A02(musicProduct, musicAssetModel, num, (Integer) null, num2, (Integer) null, str, (String) null, (List) null);
    }

    public static final MusicOverlayStickerModel A04(MusicProduct musicProduct, MusicAssetModel musicAssetModel, Integer num, String str) {
        0qQ.A0B(str, 2);
        return A03(musicProduct, musicAssetModel, num, Integer.valueOf(musicAssetModel.A05()), str);
    }

    public static final MusicDataSource A00(MusicOverlayStickerModel musicOverlayStickerModel) {
        String str;
        String str2;
        String str3 = musicOverlayStickerModel.A0g;
        String str4 = null;
        if (str3 != null && (str2 = musicOverlayStickerModel.A0W) != null) {
            String str5 = musicOverlayStickerModel.A0S;
            User user = musicOverlayStickerModel.A05;
            if (user != null) {
                str4 = user.getId();
            }
            return new MusicDataSource((Uri) null, AudioType.MUSIC, str3, str2, str5, str4);
        } else if (!AnonymousClass7TF.A1Y(musicOverlayStickerModel.A0D, true) || (str = musicOverlayStickerModel.A0d) == null) {
            String format = String.format("Progressive Download Url and Dash Manifest cannot both be null for music asset id: %s", Arrays.copyOf(new Object[]{musicOverlayStickerModel.A0S}, 1));
            0qQ.A07(format);
            0kD.A0E("MusicOverlayStickerModel", format, (Throwable) null);
            return new MusicDataSource();
        } else {
            Uri A09 = JTQ.A09(str);
            String str6 = musicOverlayStickerModel.A0S;
            User user2 = musicOverlayStickerModel.A05;
            if (user2 != null) {
                str4 = user2.getId();
            }
            return new MusicDataSource(A09, AudioType.MUSIC, (String) null, (String) null, str6, str4);
        }
    }

    public static MusicOverlayStickerModel A01(MusicProduct musicProduct, AudioOverlayTrack audioOverlayTrack, MusicAssetModel musicAssetModel, String str) {
        return A03(musicProduct, musicAssetModel, Integer.valueOf(audioOverlayTrack.A02), Integer.valueOf(audioOverlayTrack.A03), str);
    }

    public static final MusicOverlayStickerModel A02(MusicProduct musicProduct, MusicAssetModel musicAssetModel, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, List list) {
        MusicAssetModel musicAssetModel2 = musicAssetModel;
        String str3 = str2;
        String str4 = musicAssetModel2.A09;
        boolean z = musicAssetModel2.A0L;
        String str5 = musicAssetModel2.A0E;
        String str6 = musicAssetModel2.A0B;
        ImageUrl imageUrl = musicAssetModel2.A03;
        SimpleImageUrl simpleImageUrl = musicAssetModel2.A02;
        if (simpleImageUrl == null) {
            simpleImageUrl = DbS.A0V("");
        }
        String str7 = musicAssetModel2.A0C;
        String str8 = musicAssetModel2.A0D;
        int i = musicAssetModel2.A00;
        boolean z2 = musicAssetModel2.A0O;
        0sn r0 = musicAssetModel2.A0J;
        if (r0 == null) {
            r0 = 0sn.A00;
        }
        if (str2 == null) {
            str3 = "";
        }
        User user = musicAssetModel2.A06;
        boolean z3 = musicAssetModel2.A0P;
        boolean z4 = musicAssetModel2.A0Q;
        boolean z5 = musicAssetModel2.A0R;
        boolean z6 = musicAssetModel2.A0S;
        boolean z7 = musicAssetModel2.A0T;
        boolean z8 = musicAssetModel2.A0U;
        String str9 = musicAssetModel2.A0F;
        String str10 = musicAssetModel2.A0G;
        String str11 = musicAssetModel2.A0H;
        String A0b = AnonymousClass7TF.A0b();
        String str12 = musicAssetModel2.A0I;
        String str13 = str6;
        String str14 = str7;
        return new MusicOverlayStickerModel((AudioMutingInfo) null, (MusicMuteAudioReason) null, musicProduct, imageUrl, simpleImageUrl, user, false, (Boolean) null, Boolean.valueOf(z2), (Boolean) null, Boolean.valueOf(z3), Boolean.valueOf(z4), Boolean.valueOf(z5), Boolean.valueOf(z7), Boolean.valueOf(z8), (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, num3, num2, num4, Integer.valueOf(i), num, 0, str4, (String) null, str5, str13, str, (String) null, str14, (String) null, str8, (String) null, (String) null, str3, (String) null, str9, str10, "", str11, (String) null, (String) null, "", (String) null, A0b, str12, (String) null, list, (List) null, r0, z, z6, false);
    }

    public static final String A05(MusicOverlayStickerModel musicOverlayStickerModel) {
        StringWriter A0v = JTO.A0v();
        17W A0Q = JTO.A0Q(A0v);
        0qQ.A0A(A0Q);
        A07(A0Q, musicOverlayStickerModel);
        return JTR.A12(A0Q, A0v);
    }

    public static final String A06(MusicOverlayStickerModel musicOverlayStickerModel) {
        StringWriter A0v = JTO.A0v();
        17W A0Q = JTO.A0Q(A0v);
        0qQ.A0A(A0Q);
        A08(A0Q, musicOverlayStickerModel);
        return JTR.A12(A0Q, A0v);
    }

    public static final void A07(17Z r3, MusicOverlayStickerModel musicOverlayStickerModel) {
        String str;
        r3.A0c();
        r3.A0R("audio_asset_id", musicOverlayStickerModel.A0S);
        r3.A0R("audio_cluster_id", musicOverlayStickerModel.A0T);
        r3.A0P(AnonymousClass000.A00(518), AnonymousClass7TG.A0A(musicOverlayStickerModel.A0K));
        r3.A0P(C273654mx.A00(137), AnonymousClass7TG.A0A(musicOverlayStickerModel.A0M));
        r3.A0P(AnonymousClass000.A00(732), C51967G9n.A04(musicOverlayStickerModel.A0O, 0));
        r3.A0R("browse_session_id", musicOverlayStickerModel.A0U);
        MusicProduct musicProduct = musicOverlayStickerModel.A02;
        if (musicProduct == null || (str = C14245TsS.A00(musicProduct)) == null) {
            str = "";
        }
        r3.A0R("product", str);
        r3.A0R("song_name", musicOverlayStickerModel.A0m);
        r3.A0R("artist_name", musicOverlayStickerModel.A0Y);
        r3.A0R("alacorn_session_id", musicOverlayStickerModel.A0Q);
        r3.A0Z();
    }

    public static final void A08(17Z r3, MusicOverlayStickerModel musicOverlayStickerModel) {
        r3.A0c();
        r3.A0R("original_media_id", musicOverlayStickerModel.A0e);
        r3.A0R("audio_asset_id", musicOverlayStickerModel.A0S);
        r3.A0P(C273654mx.A00(3362), AnonymousClass7TG.A0A(musicOverlayStickerModel.A0M));
        r3.A0P("start_time_in_audio_ms", AnonymousClass7TG.A0A(musicOverlayStickerModel.A0K));
        r3.A0P("duration_ms", C51967G9n.A04(musicOverlayStickerModel.A0O, 0));
        r3.A0Z();
    }
}
