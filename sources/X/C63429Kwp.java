package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.Kwp  reason: case insensitive filesystem */
public abstract class C63429Kwp {
    public static final KYb A00(Bundle bundle, UserSession userSession) {
        0qQ.A0B(userSession, 0);
        UserSession A07 = 09i.A0A.A07(bundle);
        if (A07 != null) {
            userSession = A07;
        }
        Fragment r2 = new AnonymousClass4DH();
        r2.A04 = userSession;
        AnonymousClass818 valueOf = AnonymousClass818.valueOf(C320236s2.A01(bundle, "args_entrypoint"));
        0qQ.A0B(valueOf, 0);
        r2.A02 = valueOf;
        AnonymousClass819 valueOf2 = AnonymousClass819.valueOf(C320236s2.A01(bundle, "args_upsell_variant"));
        0qQ.A0B(valueOf2, 0);
        r2.A03 = valueOf2;
        r2.A00 = bundle.getInt("args_num_of_views", -1);
        r2.A00 = bundle.getBoolean("args_is_story_enabled", false);
        bundle.getBoolean("args_is_post_enabled", false);
        r2.A09 = bundle.getBoolean("args_is_after_fbc", false);
        KYZ kyz = (KYZ) userSession.A01(KYZ.class, new C20699WxV(userSession, 11));
        MUE mue = kyz.A05;
        if (mue == null) {
            mue = new C65640LxH(kyz);
            kyz.A05 = mue;
        }
        r2.A05 = mue;
        r2.A01 = bundle.getInt("arg_nux_attempt_qpl_instance_key", 0);
        JTU.A0k(bundle, r2);
        r2.setArguments(bundle);
        return r2;
    }
}
