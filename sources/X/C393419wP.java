package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.NotePogImageDictIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.9wP  reason: invalid class name and case insensitive filesystem */
public abstract /* synthetic */ class C393419wP {
    public static Map A00(NotePogImageDictIntf notePogImageDictIntf) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (notePogImageDictIntf.getId() != null) {
            A1H.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, notePogImageDictIntf.getId());
        }
        if (notePogImageDictIntf.BGL() != null) {
            A1H.put("image_url", notePogImageDictIntf.BGL());
        }
        if (notePogImageDictIntf.getPk() != null) {
            A1H.put("pk", notePogImageDictIntf.getPk());
        }
        return 0Yt.A0B(A1H);
    }
}
