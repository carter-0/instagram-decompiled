package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.Uv2  reason: case insensitive filesystem */
public final class C16446Uv2 extends C15291UZw {
    public static final String __redex_internal_original_name = "ReelCountdownShareFragment";
    public 28D A00 = 28D.A5J;
    public C19476WaO A01;
    public User A02;

    public final String getModuleName() {
        return "reel_countdown_share_fragment";
    }

    public final void onCreate(Bundle bundle) {
        User user;
        int A022 = AnonymousClass0fD.A02(-1992852846);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = C13991Tnr.A09(requireArguments, "ReelCountdownShareConstants.ARGUMENTS_KEY_CAMERA_ENTRY_POINT");
        String string = requireArguments.getString("ReelCountdownShareConstants.ARGUMENTS_KEY_COUNTDOWN_STICKER_CREATOR_USER_ID");
        if (string != null) {
            UserSession userSession = this.A00;
            0qQ.A07(userSession);
            user = DbV.A0j(userSession, string);
        } else {
            user = null;
        }
        this.A02 = user;
        try {
            0c5 r2 = 0c9.A04;
            UserSession userSession2 = this.A00;
            0qQ.A07(userSession2);
            BGi parseFromJson = C45635Czl.parseFromJson(r2.A01(userSession2, JTP.A0m(requireArguments, "ReelCountdownShareConstants.ARGUMENTS_KEY_COUNTDOWN_STICKER_MODEL_JSON")));
            0qQ.A07(parseFromJson);
            this.A01 = new C19476WaO(parseFromJson, C19476WaO.A03);
        } catch (IOException unused) {
            0wb.A03(__redex_internal_original_name, "Could not parse json CountdownStickerModel for countdown re-share.");
        }
        AnonymousClass0fD.A09(-1541751706, A022);
    }
}
