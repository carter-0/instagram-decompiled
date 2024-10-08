package X;

import android.util.SparseArray;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.filterkit.TextureAsset;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.8Kb  reason: invalid class name and case insensitive filesystem */
public final class C353958Kb extends 1Yt {
    public SparseArray A00;
    public final UserSession A01;
    public final C353978Kd A02 = A01(0);

    public static final SparseArray A00(C353958Kb r28) {
        C353958Kb r3 = r28;
        SparseArray sparseArray = r3.A00;
        if (sparseArray == null) {
            synchronized (r3) {
                sparseArray = r3.A00;
                if (sparseArray == null) {
                    sparseArray = C353968Kc.A00(r3.A01);
                    sparseArray.put(803, new C353978Kd((Integer) null, "enhance", (String) null, "Enhance", new LinkedList(), 803, R.drawable.filter_normal, false));
                    sparseArray.put(804, new C353978Kd((Integer) null, "Enhance", (String) null, "EnhanceDebug", new LinkedList(), 804, R.drawable.filter_normal, false));
                    sparseArray.put(816, new C353978Kd((Integer) null, "split_screen", (String) null, "dummy_shader_name", new LinkedList(), 816, 0, false));
                    LinkedList linkedList = new LinkedList();
                    linkedList.add(new TextureAsset("map", "lark/map.png"));
                    sparseArray.put(615, new C353978Kd((Integer) null, "Lark", (String) null, "Lark", linkedList, 615, 0, false));
                    LinkedList linkedList2 = new LinkedList();
                    linkedList2.add(new TextureAsset("map", "reyes/map.png"));
                    sparseArray.put(614, new C353978Kd((Integer) null, "Reyes", (String) null, "StandardColorMap", linkedList2, 614, 0, false));
                    LinkedList linkedList3 = new LinkedList();
                    linkedList3.add(new TextureAsset("map", "juno/map.png"));
                    sparseArray.put(613, new C353978Kd((Integer) null, "Juno", (String) null, "StandardColorMap", linkedList3, 613, 0, false));
                    LinkedList linkedList4 = new LinkedList();
                    linkedList4.add(new TextureAsset("map", "aden/map.png"));
                    sparseArray.put(612, new C353978Kd((Integer) null, "Aden", (String) null, "StandardColorMap", linkedList4, 612, 0, false));
                    LinkedList linkedList5 = new LinkedList();
                    linkedList5.add(new TextureAsset("map", "perpetua/map.png"));
                    linkedList5.add(new TextureAsset("overlay_map", "perpetua/overlay_map.png"));
                    sparseArray.put(608, new C353978Kd((Integer) null, "Perpetua", (String) null, "Perpetua", linkedList5, 608, 0, false));
                    LinkedList linkedList6 = new LinkedList();
                    linkedList6.add(new TextureAsset("map", "ludwig/map.png"));
                    sparseArray.put(603, new C353978Kd((Integer) null, "Ludwig", (String) null, "Ludwig", linkedList6, 603, 0, false));
                    LinkedList linkedList7 = new LinkedList();
                    linkedList7.add(new TextureAsset("map", "slumber/map.png"));
                    sparseArray.put(605, new C353978Kd((Integer) null, "Slumber", (String) null, "Slumber", linkedList7, 605, 0, false));
                    LinkedList linkedList8 = new LinkedList();
                    linkedList8.add(new TextureAsset("map", "crema/map.png"));
                    sparseArray.put(616, new C353978Kd((Integer) null, "Crema", (String) null, "StandardColorMap", linkedList8, 616, 0, false));
                    LinkedList linkedList9 = new LinkedList();
                    linkedList9.add(new TextureAsset("map", "amaro/map.png"));
                    linkedList9.add(new TextureAsset("overlay_map", "amaro/overlay_map.png"));
                    linkedList9.add(new TextureAsset("blackboard", "shared/blackboard.png"));
                    sparseArray.put(24, new C353978Kd((Integer) null, "Amaro", (String) null, "Amaro", linkedList9, 24, 0, false));
                    LinkedList linkedList10 = new LinkedList();
                    linkedList10.add(new TextureAsset("map", "mayfair/colorGradient.png"));
                    linkedList10.add(new TextureAsset("glowField", "mayfair/glowField.png"));
                    linkedList10.add(new TextureAsset("overlay", "mayfair/overlayMap100.png"));
                    linkedList10.add(new TextureAsset("colorOverlay", "mayfair/colorOverlay.png"));
                    sparseArray.put(17, new C353978Kd((Integer) null, "Mayfair", (String) null, "Mayfair", linkedList10, 17, 0, false));
                    LinkedList linkedList11 = new LinkedList();
                    linkedList11.add(new TextureAsset("map", "rise/map.png"));
                    linkedList11.add(new TextureAsset("overlay_map", "shared/overlay_map.png"));
                    linkedList11.add(new TextureAsset("blackboard", "shared/blackboard.png"));
                    sparseArray.put(23, new C353978Kd((Integer) null, "Rise", (String) null, "Rise", linkedList11, 23, 0, false));
                    LinkedList linkedList12 = new LinkedList();
                    linkedList12.add(new TextureAsset("map", "valencia/map.png"));
                    linkedList12.add(new TextureAsset("gradient_map", "valencia/gradient_map.png"));
                    sparseArray.put(25, new C353978Kd((Integer) null, "Valencia", (String) null, "Valencia", linkedList12, 25, 0, false));
                    LinkedList linkedList13 = new LinkedList();
                    linkedList13.add(new TextureAsset("map", "x_pro2/map.png"));
                    linkedList13.add(new TextureAsset("vignette_map_plus_darker", "shared/vignette_map_plus_darker.png"));
                    sparseArray.put(1, new C353978Kd((Integer) null, "X-Pro II", (String) null, "XPro2", linkedList13, 1, 0, false));
                    LinkedList linkedList14 = new LinkedList();
                    linkedList14.add(new TextureAsset("map", "sierra/map.png"));
                    linkedList14.add(new TextureAsset("smoke", "sierra/smoke.png"));
                    linkedList14.add(new TextureAsset("vignette", "sierra/vignette.png"));
                    linkedList14.add(new TextureAsset("overlay_map", "amaro/overlay_map.png"));
                    linkedList14.add(new TextureAsset("soft_light", "sierra/soft_light.png"));
                    sparseArray.put(27, new C353978Kd((Integer) null, "Sierra", (String) null, "Sierra", linkedList14, 27, 0, false));
                    LinkedList linkedList15 = new LinkedList();
                    linkedList15.add(new TextureAsset("glowMap", "willow/glowField.png"));
                    linkedList15.add(new TextureAsset("overlayMap", "willow/overlayMap81.png"));
                    linkedList15.add(new TextureAsset("borderTexture", "willow/borderTexture.png"));
                    linkedList15.add(new TextureAsset("vignette", "willow/willowVignette.png"));
                    linkedList15.add(new TextureAsset("softLightMap", "willow/willowSoftLight100.png"));
                    linkedList15.add(new TextureAsset("map", "willow/willowMap.png"));
                    sparseArray.put(28, new C353978Kd((Integer) null, "Willow", (String) null, "Willow", linkedList15, 28, 0, false));
                    LinkedList linkedList16 = new LinkedList();
                    linkedList16.add(new TextureAsset("map", "lo_fi/map.png"));
                    linkedList16.add(new TextureAsset("vignette_map", "lo_fi/vignette_map.png"));
                    sparseArray.put(2, new C353978Kd((Integer) null, "Lo-Fi", (String) null, "LoFi", linkedList16, 2, 0, false));
                    LinkedList linkedList17 = new LinkedList();
                    linkedList17.add(new TextureAsset("map", "inkwell/map.png"));
                    sparseArray.put(10, new C353978Kd((Integer) null, "Inkwell", (String) null, "Inkwell", linkedList17, 10, 0, false));
                    LinkedList linkedList18 = new LinkedList();
                    linkedList18.add(new TextureAsset("map", "nashville/map.png"));
                    sparseArray.put(15, new C353978Kd((Integer) null, "Nashville", (String) null, "Nashville", linkedList18, 15, 0, false));
                    sparseArray.put(1010, new C353978Kd((Integer) null, "Hyper", "Hyper", "hyper", new LinkedList(), 1010, 0, false));
                    sparseArray.put(1011, new C353978Kd((Integer) null, "Rosy", "Rosy", "rosy", new LinkedList(), 1011, 0, false));
                    sparseArray.put(1012, new C353978Kd((Integer) null, "Emerald", (String) null, "emerald", new LinkedList(), 1012, 0, false));
                    sparseArray.put(1013, new C353978Kd((Integer) null, "Midnight", "Midnight", "midnight", new LinkedList(), 1013, 0, false));
                    sparseArray.put(IgNetworkConsentStorage.MAX_ENTRIES, new C353978Kd((Integer) null, "Fade", "Fade", "fade", new LinkedList(), IgNetworkConsentStorage.MAX_ENTRIES, 0, false));
                    sparseArray.put(1001, new C353978Kd((Integer) null, "Fade Warm", (String) null, "fade_warm", new LinkedList(), 1001, 0, false));
                    sparseArray.put(1002, new C353978Kd((Integer) null, "Fade Cool", (String) null, "fade_cool", new LinkedList(), 1002, 0, false));
                    sparseArray.put(1003, new C353978Kd((Integer) null, "Simple", "Simple", "subtle", new LinkedList(), 1003, 0, false));
                    sparseArray.put(1004, new C353978Kd((Integer) null, "Simple Warm", (String) null, "subtle_warm", new LinkedList(), 1004, 0, false));
                    sparseArray.put(1005, new C353978Kd((Integer) null, "Simple Cool", (String) null, "subtle_cool", new LinkedList(), 1005, 0, false));
                    sparseArray.put(1006, new C353978Kd((Integer) null, "Boost", "Boost", "boost", new LinkedList(), 1006, 0, false));
                    sparseArray.put(1007, new C353978Kd((Integer) null, "Boost Warm", (String) null, "boost_warm", new LinkedList(), 1007, 0, false));
                    sparseArray.put(1008, new C353978Kd((Integer) null, "Boost Cool", (String) null, "boost_cool", new LinkedList(), 1008, 0, false));
                    sparseArray.put(1009, new C353978Kd((Integer) null, "Graphite", "Graphite", "grayscale", new LinkedList(), 1009, 0, false));
                    sparseArray.put(1100, new C353978Kd((Integer) null, "Grainy", "Grainy", "grainy", new LinkedList(), 1100, 0, false));
                    sparseArray.put(1101, new C353978Kd((Integer) null, "Gritty", "Gritty", "gritty", new LinkedList(), 1101, 0, false));
                    sparseArray.put(1102, new C353978Kd((Integer) null, "Halo", (String) null, "halo", new LinkedList(), 1102, 0, false));
                    sparseArray.put(1103, new C353978Kd((Integer) null, "Color Leak", "Color Leak", "color_leak", new LinkedList(), 1103, 0, false));
                    sparseArray.put(1104, new C353978Kd((Integer) null, "Soft Light", "Soft Light", "soft_light", new LinkedList(), 1104, 0, false));
                    sparseArray.put(1105, new C353978Kd((Integer) null, "Zoom Blur", "Zoom Blur", "zoom_blur", new LinkedList(), 1105, 0, false));
                    sparseArray.put(1106, new C353978Kd((Integer) null, "Handheld", "Handheld", "handheld", new LinkedList(), 1106, 0, false));
                    sparseArray.put(1107, new C353978Kd((Integer) null, "Moire", "Moire", "moire", new LinkedList(), 1107, 0, false));
                    sparseArray.put(1108, new C353978Kd((Integer) null, "Lo-Res", "Lo-Res", "lo_res", new LinkedList(), 1108, 0, false));
                    sparseArray.put(1109, new C353978Kd((Integer) null, "Wavy", (String) null, "wavy", new LinkedList(), 1109, 0, false));
                    sparseArray.put(1110, new C353978Kd((Integer) null, "Wide Angle", (String) null, "wide_angle", new LinkedList(), 1110, 0, false));
                    LinkedList linkedList19 = new LinkedList();
                    linkedList19.add(new TextureAsset("map", "video/clarendon/Glacial1.png"));
                    linkedList19.add(new TextureAsset("map2", "video/clarendon/Glacial2.png"));
                    sparseArray.put(112, new C353978Kd((Integer) null, "Clarendon", (String) null, "Clarendon", linkedList19, 112, 0, false));
                    LinkedList linkedList20 = new LinkedList();
                    linkedList20.add(new TextureAsset("map1", "video/moon/curves1.png"));
                    linkedList20.add(new TextureAsset("map2", "video/moon/curves2.png"));
                    sparseArray.put(111, new C353978Kd((Integer) null, "Moon", (String) null, "Moon", linkedList20, 111, 0, false));
                    sparseArray.put(644, new C353978Kd((Integer) null, "Pixelated", (String) null, "Pixelated", new LinkedList(), 644, R.drawable.filter_normal, false));
                    LinkedList linkedList21 = new LinkedList();
                    Integer num = AnonymousClass05K.A0C;
                    int i = R.drawable.filter_normal;
                    sparseArray.put(753, new C353978Kd(num, "gradient_transform", (String) null, "GradientBackgroundTextured", linkedList21, 753, i, false));
                    sparseArray.put(754, new C353978Kd(num, "GradientAndBitmapBackgroundTextured", (String) null, "GradientAndBitmapBackgroundTextured", new LinkedList(), 754, i, false));
                    r3.A00 = sparseArray;
                }
            }
        }
        return sparseArray;
    }

    public final List A02(boolean z) {
        UserSession userSession = this.A01;
        List list = C353968Kc.A00;
        if (list == null) {
            List A1P = 0sr.A1P(new Integer[]{null, 810, 813, 643, 114, 640, 706, 703, 705, 707, 709, 710, 702, 642});
            Integer valueOf = Integer.valueOf(IgNetworkConsentStorage.MAX_ENTRIES);
            List A1P2 = 0sr.A1P(new Integer[]{0, 810, 813, 1009, valueOf, 1003, 1006, 1100, 1104, 1103, 1010, 642, 1105, 1106, 1107, 1108});
            list = 0sr.A1P(new Integer[]{null, valueOf, 1003, 1006, 706, 1009, 1101, 1100, 1104, 1103, 1010, 1011, 1013, 1105, 1106});
            0Tu r3 = 0Tu.A05;
            if ((182.A06(r3, userSession, 36326988008601707L) && z) || (182.A06(r3, userSession, 36326988008536170L) && !z)) {
                list = A1P2;
            } else if (!182.A06(r3, userSession, 36326988008667244L) || z) {
                list = A1P;
            }
            C353968Kc.A00 = list;
        }
        return list;
    }

    public C353958Kb(UserSession userSession) {
        this.A01 = userSession;
    }

    public final C353978Kd A01(int i) {
        Object obj = A00(this).get(i);
        0qQ.A07(obj);
        return (C353978Kd) obj;
    }
}
