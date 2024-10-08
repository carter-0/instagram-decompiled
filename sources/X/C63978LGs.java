package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicOverlayStickerModel;

/* renamed from: X.LGs  reason: case insensitive filesystem */
public abstract class C63978LGs {
    public static final void A00(AnonymousClass0iw r3, UserSession userSession, MusicOverlayStickerModel musicOverlayStickerModel, String str, String str2) {
        long j;
        double d;
        Long A10;
        AnonymousClass7TG.A1O(userSession, str);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r3, userSession), "instagram_organic_interact_bottom_sheet_action");
        Long l = null;
        if (A0e.isSampled()) {
            DbS.A1J(A0e, str2);
            0bb r32 = new 0bb();
            String str3 = musicOverlayStickerModel.A0S;
            if (str3 == null || (A10 = AnonymousClass7TE.A10(str3)) == null) {
                j = 0;
            } else {
                j = A10.longValue();
            }
            r32.A05("audio_asset_id", Long.valueOf(j));
            Integer num = musicOverlayStickerModel.A0O;
            if (num != null) {
                d = (double) num.intValue();
            } else {
                d = 0.0d;
            }
            r32.A04("length", Double.valueOf(d));
            r32.A06("song_name", musicOverlayStickerModel.A0m);
            r32.A06("artist_name", musicOverlayStickerModel.A0Y);
            Integer num2 = musicOverlayStickerModel.A0K;
            if (num2 != null) {
                l = C51969G9p.A0r(num2);
            }
            r32.A05(TraceFieldType.StartTime, l);
            A0e.AAK(r32, "extra_data");
            A0e.AAJ("containermodule", str);
            A0e.Cgf();
        }
    }

    public static final void A01(AnonymousClass0iw r3, UserSession userSession, MusicOverlayStickerModel musicOverlayStickerModel, String str, String str2, String str3, String str4) {
        Long l;
        String str5;
        String str6;
        Long l2;
        Integer num;
        Integer num2;
        String str7;
        AnonymousClass7TG.A1O(userSession, str);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r3, userSession), "instagram_organic_interact_bottom_sheet_nav");
        Long l3 = null;
        if (A0e.isSampled()) {
            A0e.AAJ("navigate_to", str2);
            A0e.AAJ("containermodule", str);
            C51965G9l.A1I(A0e, str3);
            0bb r4 = new 0bb();
            r4.A06("format", str4);
            if (musicOverlayStickerModel == null || (str7 = musicOverlayStickerModel.A0S) == null) {
                l = null;
            } else {
                l = AnonymousClass7TE.A10(str7);
            }
            r4.A05("audio_asset_id", l);
            if (musicOverlayStickerModel != null) {
                str5 = musicOverlayStickerModel.A0m;
            } else {
                str5 = null;
            }
            r4.A06("song_name", str5);
            if (musicOverlayStickerModel != null) {
                str6 = musicOverlayStickerModel.A0Y;
            } else {
                str6 = null;
            }
            r4.A06("artist_name", str6);
            if (musicOverlayStickerModel == null || (num2 = musicOverlayStickerModel.A0K) == null) {
                l2 = null;
            } else {
                l2 = C51969G9p.A0r(num2);
            }
            r4.A05(TraceFieldType.StartTime, l2);
            if (!(musicOverlayStickerModel == null || (num = musicOverlayStickerModel.A0O) == null)) {
                l3 = C51969G9p.A0r(num);
            }
            r4.A05("length", l3);
            A0e.AAK(r4, "extra_data");
            A0e.Cgf();
        }
    }
}
