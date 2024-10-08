package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import java.util.List;

public abstract class AIN {
    public static final List A00;
    public static final List A01;

    public static final Drawable A00(Context context, UserSession userSession, Af0 af0, boolean z) {
        Drawable r3;
        int ordinal = af0.A03.ordinal();
        Context context2 = context;
        if (ordinal != 7) {
            UserSession userSession2 = userSession;
            if (ordinal == 0) {
                r3 = A02(context2, userSession, af0.BUu(), af0.A00, z);
            } else if (ordinal == 1) {
                r3 = A01(context2, userSession, af0.BUu(), af0.A00, z);
            } else if (ordinal == 8) {
                r3 = new AnonymousClass9XJ(context2, userSession2, af0.BUu(), af0.A00, z);
            } else {
                throw AnonymousClass7TE.A0z("Unsupported music overlay sticker display type");
            }
        } else {
            r3 = new AnonymousClass9XI(context, af0.BUu(), af0.A00);
        }
        return r3;
    }

    static {
        AnonymousClass6KJ r1 = AnonymousClass6KJ.MUSIC_ONLY;
        AnonymousClass6KJ r2 = AnonymousClass6KJ.LYRICS_DYNAMIC_REVEAL;
        AnonymousClass6KJ r3 = AnonymousClass6KJ.LYRICS_TYPEWRITER;
        AnonymousClass6KJ r4 = AnonymousClass6KJ.LYRICS_KARAOKE;
        AnonymousClass6KJ r5 = AnonymousClass6KJ.LYRICS_CUBE_REVEAL;
        AnonymousClass6KJ r6 = AnonymousClass6KJ.MUSIC_OVERLAY_SIMPLE;
        AnonymousClass6KJ r7 = AnonymousClass6KJ.MUSIC_OVERLAY_ALBUM_ART;
        AnonymousClass6KJ r8 = AnonymousClass6KJ.MUSIC_VINYL;
        A00 = 0sr.A1P(new AnonymousClass6KJ[]{r1, r2, r3, r4, r5, r6, r7, r8});
        A01 = 0sr.A1P(new AnonymousClass6KJ[]{r1, r7, r6, r8, r2, r5, r4, r3});
    }

    public static final AnonymousClass9XH A01(Context context, UserSession userSession, MusicOverlayStickerModel musicOverlayStickerModel, int i, boolean z) {
        0Tu r2 = 0Tu.A05;
        UserSession userSession2 = userSession;
        boolean A06 = 182.A06(r2, userSession, 36323229912017934L);
        Context context2 = context;
        MusicOverlayStickerModel musicOverlayStickerModel2 = musicOverlayStickerModel;
        int i2 = i;
        boolean z2 = z;
        if (A06 || 182.A06(r2, userSession2, 36320992234251266L)) {
            return new AnonymousClass9XH(context2, userSession2, musicOverlayStickerModel2, i2, z2, true);
        }
        return new AnonymousClass9XH(context2, userSession2, musicOverlayStickerModel2, i2, z2, true);
    }

    public static final AnonymousClass9XG A02(Context context, UserSession userSession, MusicOverlayStickerModel musicOverlayStickerModel, int i, boolean z) {
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36323229912017934L) || 182.A06(r2, userSession, 36320992234251266L)) {
            return new AnonymousClass9XG(context, userSession, musicOverlayStickerModel, i, z);
        }
        return new AnonymousClass9XG(context, userSession, musicOverlayStickerModel, i, z);
    }
}
