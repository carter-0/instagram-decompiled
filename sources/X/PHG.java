package X;

import android.webkit.MimeTypeMap;
import com.instagram.common.session.UserSession;
import com.instagram.direct.send.MsysAvatarStickerSender$sendSecureAvatarStickerMessage$1;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

public final class PHG implements C320986tO {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C317966o8 A01;
    public final /* synthetic */ C254933tI A02;
    public final /* synthetic */ C67499Mot A03;
    public final /* synthetic */ C254743sy A04;

    public final /* synthetic */ void DH4(X9T x9t, String str, String str2) {
    }

    public final void DOa(C20997X8u x8u, String str, String str2) {
        String str3;
        0qQ.A0B(str2, 2);
        JSONObject A11 = DbS.A11();
        JSONObject A112 = DbS.A11();
        try {
            A112.put("is_avatar_sticker", AnonymousClass7TE.A0v());
        } catch (JSONException unused) {
        }
        try {
            A11.put("ig_avatar_sticker", A112);
        } catch (JSONException unused2) {
        }
        UserSession userSession = this.A00;
        userSession.A01(O8I.class, C73913Plo.A00(userSession, 32));
        File A0t = AnonymousClass7TE.A0t(str2);
        C317966o8 r1 = this.A01;
        int i = (int) r1.A01;
        int i2 = (int) r1.A00;
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(JTP.A0o(r1.A0H)));
        if (mimeTypeFromExtension == null) {
            mimeTypeFromExtension = "image/webp";
        }
        C254933tI r0 = this.A02;
        if (r0 != null) {
            str3 = r0.A0T;
        } else {
            str3 = null;
        }
        MsysThreadId A06 = C66647MaG.A06(this.A04);
        0qQ.A0B(A06, 9);
        AnonymousClass7TE.A1Z(new MsysAvatarStickerSender$sendSecureAvatarStickerMessage$1(userSession, A06, A0t, mimeTypeFromExtension, str3, (String) null, (String) null, (AnonymousClass4D7) null, i2, i), AnonymousClass1HX.A01(988639276, 3));
    }

    public final /* synthetic */ void DOb(C20997X8u x8u, String str, String str2, String str3) {
    }

    public final void DaG(String str, float f) {
    }

    public final void onError(String str) {
    }

    public PHG(UserSession userSession, C317966o8 r2, C254933tI r3, C67499Mot mot, C254743sy r5) {
        this.A00 = userSession;
        this.A01 = r2;
        this.A03 = mot;
        this.A02 = r3;
        this.A04 = r5;
    }

    public final /* synthetic */ boolean EsB() {
        return false;
    }
}
