package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.NoteEmojiReactionInfoIntf;
import com.instagram.user.model.User;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.9wO  reason: invalid class name and case insensitive filesystem */
public abstract /* synthetic */ class C393409wO {
    public static Map A00(NoteEmojiReactionInfoIntf noteEmojiReactionInfoIntf) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (noteEmojiReactionInfoIntf.getEmoji() != null) {
            A1H.put("emoji", noteEmojiReactionInfoIntf.getEmoji());
        }
        if (noteEmojiReactionInfoIntf.Cdw() != null) {
            A1H.put(C273654mx.A00(792), noteEmojiReactionInfoIntf.Cdw());
        }
        User CCd = noteEmojiReactionInfoIntf.CCd();
        if (CCd != null) {
            A1H.put(PublicKeyCredentialControllerUtility.JSON_KEY_USER, CCd.A08());
        }
        return 0Yt.A0B(A1H);
    }
}
