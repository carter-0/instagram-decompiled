package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.user.model.User;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.A0p  reason: case insensitive filesystem */
public abstract /* synthetic */ class C39573A0p {
    public static Map A00(AnonymousClass8YG r3) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r3.Ae8() != null) {
            A1H.put("auxiliary_message", r3.Ae8());
        }
        if (r3.Ais() != null) {
            A1H.put("button_text_color", r3.Ais());
        }
        if (r3.AqD() != null) {
            A1H.put(C273654mx.A00(135), r3.AqD().FHC());
        }
        if (r3.getEndBackgroundColor() != null) {
            A1H.put("end_background_color", r3.getEndBackgroundColor());
        }
        if (r3.B8a() != null) {
            A1H.put("fundraiser_sticker_type", r3.B8a());
        }
        if (r3.BEy() != null) {
            A1H.put("ig_charity_id", r3.BEy());
        }
        r3.BZD();
        A1H.put(AnonymousClass000.A00(181), Integer.valueOf(r3.BZD()));
        if (r3.getPk() != null) {
            A1H.put("pk", r3.getPk());
        }
        if (r3.Bxv() != null) {
            A1H.put("source_name", r3.Bxv());
        }
        if (r3.getStartBackgroundColor() != null) {
            A1H.put("start_background_color", r3.getStartBackgroundColor());
        }
        if (r3.C2c() != null) {
            A1H.put("subtitle_color", r3.C2c());
        }
        if (r3.getTitle() != null) {
            A1H.put(DialogModule.KEY_TITLE, r3.getTitle());
        }
        if (r3.C7r() != null) {
            A1H.put("title_color", r3.C7r());
        }
        User CCd = r3.CCd();
        if (CCd != null) {
            A1H.put(PublicKeyCredentialControllerUtility.JSON_KEY_USER, CCd.A08());
        }
        return 0Yt.A0B(A1H);
    }
}
