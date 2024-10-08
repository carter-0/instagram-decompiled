package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class FVD implements AnonymousClass0iw, C51920G7o {
    public static final String __redex_internal_original_name = "VideoCallArEffectUrlHandler";

    public final boolean EHn() {
        return false;
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void CI1(Bundle bundle, FragmentActivity fragmentActivity, AnonymousClass0wW r10) {
        AnonymousClass7TG.A1T(bundle, fragmentActivity, r10);
        UserSession A00 = 0Gl.A00(r10);
        C49895FBy.A00(A00.A03.A06(), this, A00, bundle.getString("effect_id_key"), bundle.getString("ch_key"), bundle.getString("revisionID_key"));
        fragmentActivity.finish();
    }

    public final /* bridge */ /* synthetic */ Bundle AFW(AnonymousClass0wW r2, String str) {
        return null;
    }
}
