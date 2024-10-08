package X;

import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.Xtl  reason: case insensitive filesystem */
public final class C22030Xtl {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public Map A05;
    public Map A06;
    public Map A07;

    public static 0Aj A00(C22030Xtl xtl, 0wc r4, String str) {
        0Aj A002 = r4.A00(r4.A00, str);
        A002.AAJ("step", xtl.A04);
        A002.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, xtl.A01);
        return A002;
    }

    public static void A02(0Aj r2, C22030Xtl xtl) {
        r2.AAJ("component", xtl.A00);
    }

    public static void A05(0Aj r2, C22030Xtl xtl, String str) {
        r2.AAJ("waterfall_id", str);
        if (xtl.A0A() != null) {
            r2.A9H("default_values", xtl.A0A());
        }
    }

    public static void A06(0Aj r2, C22030Xtl xtl, String str) {
        r2.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        r2.AAJ("step", xtl.A04);
    }

    public final Map A09() {
        Map map = this.A05;
        if (map == null) {
            return null;
        }
        return Collections.unmodifiableMap(map);
    }

    public final Map A0A() {
        Map map = this.A06;
        if (map == null) {
            return null;
        }
        return Collections.unmodifiableMap(map);
    }

    public final Map A0B() {
        Map map = this.A07;
        if (map == null) {
            return null;
        }
        return Collections.unmodifiableMap(map);
    }

    public C22030Xtl(String str, String str2, String str3, String str4, String str5, Map map, Map map2, Map map3) {
        this.A04 = str;
        this.A01 = str2;
        this.A06 = map;
        this.A07 = map2;
        this.A05 = map3;
        this.A00 = str3;
        this.A03 = str4;
        this.A02 = str5;
    }

    public static void A01(0Aj r2, C22030Xtl xtl) {
        if (xtl.A0B() != null) {
            r2.A9H("selected_values", xtl.A0B());
        }
    }

    public static void A03(0Aj r2, C22030Xtl xtl) {
        if (xtl.A0A() != null) {
            r2.A9H("default_values", xtl.A0A());
        }
    }

    public static void A04(0Aj r2, C22030Xtl xtl) {
        if (xtl.A09() != null) {
            r2.A9H("available_options", xtl.A09());
        }
    }

    public static void A07(0Aj r2, C22030Xtl xtl, String str, String str2) {
        r2.AAJ(str, str2);
        r2.AAJ("error_message", xtl.A03);
        r2.AAJ("component", xtl.A00);
        String str3 = xtl.A02;
        if (str3 != null) {
            r2.AAJ("error_identifier", str3);
        }
    }

    public static void A08(0Aj r2, C22030Xtl xtl, String str, String str2) {
        r2.AAJ(str, str2);
        r2.AAJ("component", xtl.A00);
    }
}
