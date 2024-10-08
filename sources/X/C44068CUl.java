package X;

import com.instagram.api.schemas.AvatarNoteResponseInfo;
import com.instagram.api.schemas.MediaType;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CUl  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44068CUl {
    public static Map A00(AvatarNoteResponseInfo avatarNoteResponseInfo) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (avatarNoteResponseInfo.AeT() != null) {
            MediaType AeT = avatarNoteResponseInfo.AeT();
            0qQ.A0B(AeT, 0);
            A1H.put("avatar_sticker_media_type", AeT.A00);
        }
        if (avatarNoteResponseInfo.AeU() != null) {
            A1H.put("avatar_sticker_template_id", avatarNoteResponseInfo.AeU());
        }
        if (avatarNoteResponseInfo.AmP() != null) {
            A1H.put("cdn_url", avatarNoteResponseInfo.AmP());
        }
        return 0Yt.A0B(A1H);
    }
}
