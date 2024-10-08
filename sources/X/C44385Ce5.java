package X;

import com.instagram.user.model.User;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Ce5  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44385Ce5 {
    public static Map A00(DV4 dv4) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        User Acz = dv4.Acz();
        if (Acz != null) {
            A1H.put("attribution", Acz.A08());
        }
        if (dv4.Aeo() != null) {
            A1H.put("background_image_url", dv4.Aeo());
        }
        if (dv4.Arf() != null) {
            A1H.put("countdown_id", dv4.Arf());
        }
        if (dv4.Awy() != null) {
            A1H.put("digit_card_color", dv4.Awy());
        }
        if (dv4.Awz() != null) {
            A1H.put("digit_color", dv4.Awz());
        }
        if (dv4.getEndBackgroundColor() != null) {
            A1H.put("end_background_color", dv4.getEndBackgroundColor());
        }
        if (dv4.B1l() != null) {
            A1H.put("end_ts", dv4.B1l());
        }
        if (dv4.B71() != null) {
            A1H.put("following_enabled", dv4.B71());
        }
        if (dv4.CYm() != null) {
            A1H.put("is_owner", dv4.CYm());
        }
        if (dv4.getStartBackgroundColor() != null) {
            A1H.put("start_background_color", dv4.getStartBackgroundColor());
        }
        if (dv4.getText() != null) {
            C41845B3m.A10(dv4.getText(), A1H);
        }
        if (dv4.getTextColor() != null) {
            A1H.put("text_color", dv4.getTextColor());
        }
        if (dv4.CF5() != null) {
            A1H.put("viewer_is_following", dv4.CF5());
        }
        return 0Yt.A0B(A1H);
    }
}
