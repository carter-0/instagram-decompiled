package X;

import android.os.Bundle;
import java.util.Map;

/* renamed from: X.VtN  reason: case insensitive filesystem */
public final class C18523VtN {
    public static final C18972WEz A00(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("key_screen_container_props_bundle");
        if (bundle2 == null) {
            return null;
        }
        boolean z = bundle2.getBoolean("key_from_config_change");
        Integer A0o = DbV.A0o(bundle2, "key_content_parse_result");
        C3034368u r7 = (C3034368u) C14615TzM.A01(C3034368u.class, A0o);
        if (r7 != null) {
            Integer A0o2 = DbV.A0o(bundle2, "key_tree_params");
            Class<Map> cls = Map.class;
            Map map = (Map) C14615TzM.A01(cls, A0o2);
            if (map != null) {
                String string = bundle2.getString("key_analytics_module");
                Integer A0o3 = DbV.A0o(bundle2, "key_analytics_extras");
                boolean z2 = bundle2.getBoolean("key_animate_on_navigation");
                Integer A0o4 = DbV.A0o(bundle2, "key_container_config");
                return new C18972WEz((C13690Tf8) C14615TzM.A01(C13690Tf8.class, A0o4), r7, Boolean.valueOf(z2), string, 0sr.A1P(new Integer[]{A0o, A0o2, A0o3, A0o4}), map, (Map) C14615TzM.A01(cls, A0o3), true, z);
            }
            throw new IllegalStateException("Must have non-null tree params");
        }
        throw new IllegalStateException("Must have a non-null content ParseResult");
    }

    public final C18972WEz A01(Bundle bundle) {
        try {
            C18972WEz A00 = A00(bundle);
            if (A00 != null) {
                return A00;
            }
            throw new IllegalStateException("args Bundle must contain ScreenContainerProps");
        } catch (RuntimeException e) {
            throw new Exception(e);
        }
    }
}
