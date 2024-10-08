package X;

import com.instagram.music.common.model.InstagramAudioApplySource;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LJe  reason: case insensitive filesystem */
public abstract class C64017LJe {
    public static final void A01(17Z r6, InstagramAudioApplySource instagramAudioApplySource, MusicOverlayStickerModel musicOverlayStickerModel, String str, float f) {
        String str2;
        Boolean bool = musicOverlayStickerModel.A0E;
        Boolean A0v = AnonymousClass7TE.A0v();
        if (0qQ.A0K(bool, A0v)) {
            str2 = "remix";
        } else {
            str2 = "song";
        }
        r6.A0q(str2);
        r6.A0c();
        r6.A0O("volume_level", f);
        boolean A0K = 0qQ.A0K(musicOverlayStickerModel.A0A, A0v);
        String str3 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        String str4 = "0";
        if (A0K) {
            str4 = str3;
        }
        r6.A0R("is_saved", str4);
        r6.A0R("artist_name", musicOverlayStickerModel.A0Y);
        r6.A0R("audio_asset_id", musicOverlayStickerModel.A0S);
        r6.A0R("audio_cluster_id", musicOverlayStickerModel.A0T);
        r6.A0R("track_name", musicOverlayStickerModel.A0m);
        if (0qQ.A0K(musicOverlayStickerModel.A0G, A0v)) {
            str3 = "0";
        }
        r6.A0R("is_picked_precapture", str3);
        if (0qQ.A0K(bool, A0v)) {
            r6.A0R("original_media_id", musicOverlayStickerModel.A0e);
        }
        if (str != null) {
            r6.A0R("audio_platform_app_id", str);
        }
        if (instagramAudioApplySource != null) {
            r6.A0P("audio_apply_source", instagramAudioApplySource.A00);
        }
        r6.A0Z();
    }

    public static final String A00(InstagramAudioApplySource instagramAudioApplySource, MusicOverlayStickerModel musicOverlayStickerModel, AnonymousClass3QS r11, String str, List list) {
        String str2;
        float f;
        float f2;
        Object obj;
        StringWriter A0v = JTO.A0v();
        17W A0K = AnonymousClass7TF.A0K(A0v);
        if (list == null || list.size() <= 1 || musicOverlayStickerModel == null) {
            A0K.A0q("original");
            A0K.A0c();
            str2 = "volume_level";
            A0K.A0O(str2, r11.A00);
            C357588Yu r1 = (C357588Yu) r11.A01.A01;
            if (r1 != null) {
                A0K.A0q("voice_effects");
                A0K.A0b();
                A0K.A0t(r1.A04);
                A0K.A0Y();
            }
            List list2 = (List) r11.A01.A00;
            if (AnonymousClass7TE.A1b(list2)) {
                A0K.A0q("sound_effects");
                Iterator A0v2 = JTP.A0v(A0K, list2);
                while (A0v2.hasNext()) {
                    String str3 = ((C381699cB) A0v2.next()).A04;
                    if (str3 != null) {
                        A0K.A0t(str3);
                    }
                }
                A0K.A0Y();
            }
            A0K.A0Z();
            if (musicOverlayStickerModel != null) {
                AnonymousClass51I A00 = r11.A00(AnonymousClass51J.AUDIO_TRACK);
                if (A00 != null) {
                    f2 = A00.A00;
                } else {
                    f2 = 1.0f;
                }
                A01(A0K, instagramAudioApplySource, musicOverlayStickerModel, str, f2);
            }
        } else {
            A0K.A0q("original");
            A0K.A0c();
            str2 = "volume_level";
            A0K.A0O(str2, r11.A00);
            A0K.A0q(C273654mx.A00(3110));
            A0K.A0b();
            AnonymousClass51J r7 = AnonymousClass51J.AUDIO_TRACK;
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (AnonymousClass51I r12 : r11.A03) {
                if (r12.A04 == r7) {
                    A1C.add(r12);
                }
            }
            Iterator it = A1C.iterator();
            while (it.hasNext()) {
                AnonymousClass51I r72 = (AnonymousClass51I) it.next();
                A0K.A0c();
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (0qQ.A0K(((MusicOverlayStickerModel) obj).A0b, r72.A06)) {
                        break;
                    }
                }
                MusicOverlayStickerModel musicOverlayStickerModel2 = (MusicOverlayStickerModel) obj;
                if (musicOverlayStickerModel2 == null) {
                    musicOverlayStickerModel2 = musicOverlayStickerModel;
                }
                A01(A0K, instagramAudioApplySource, musicOverlayStickerModel2, str, r72.A00);
                A0K.A0Z();
            }
            A0K.A0Y();
            A0K.A0Z();
        }
        AnonymousClass51J r13 = AnonymousClass51J.VOICEOVER;
        if (r11.A00(r13) != null) {
            AnonymousClass51I A002 = r11.A00(r13);
            A0K.A0q("voiceover");
            A0K.A0c();
            if (A002 != null) {
                f = A002.A00;
            } else {
                f = 1.0f;
            }
            A0K.A0O(str2, f);
            A0K.A0Z();
        }
        String str4 = r11.A02;
        if (str4 != null) {
            A0K.A0R("original_audio_title", str4);
        }
        String A0k = AnonymousClass7TG.A0k(A0K, A0v);
        0qQ.A07(A0k);
        return A0k;
    }
}
