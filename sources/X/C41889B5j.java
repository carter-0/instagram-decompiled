package X;

import android.os.Parcelable;
import com.instagram.api.schemas.MusicInfoImpl;
import com.instagram.api.schemas.MusicNoteResponseInfo;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.B5j  reason: case insensitive filesystem */
public abstract class C41889B5j {
    public static MusicNoteResponseInfo parseFromJson(16F r12) {
        0qQ.A0B(r12, 0);
        try {
            if (r12.A11() != 16L.A0D) {
                r12.A0z();
                return null;
            }
            Boolean bool = null;
            Boolean bool2 = null;
            MusicInfoImpl musicInfoImpl = null;
            Integer num = null;
            User user = null;
            String str = null;
            while (r12.A1J() != 16L.A09) {
                String A0q = r12.A0q();
                r12.A1J();
                if ("is_reshare_eligible".equals(A0q)) {
                    bool = Boolean.valueOf(r12.A0d());
                } else if ("is_spotify_save_eligible".equals(A0q)) {
                    bool2 = Boolean.valueOf(r12.A0d());
                } else if ("music_info".equals(A0q)) {
                    musicInfoImpl = 1dj.parseFromJson(r12);
                } else if ("num_spotify_saves".equals(A0q)) {
                    num = Integer.valueOf(r12.A1D());
                } else if ("original_author".equals(A0q)) {
                    Parcelable.Creator creator = User.CREATOR;
                    user = 1aC.A00(r12, false);
                } else if ("selected_lyrics".equals(A0q)) {
                    if (r12.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r12.A1P();
                    }
                }
                r12.A0z();
            }
            if (musicInfoImpl != null || !(r12 instanceof 0c9)) {
                return new MusicNoteResponseInfo(musicInfoImpl, user, bool, bool2, num, str);
            }
            AnonymousClass7TF.A1L("music_info", r12, "MusicNoteResponseInfo");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
