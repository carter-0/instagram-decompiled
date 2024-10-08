package X;

import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import java.util.Map;

/* renamed from: X.8p8  reason: invalid class name and case insensitive filesystem */
public abstract class C366508p8 {
    public static final Map A00;
    public static final Map A01;

    public static final int A00(String str) {
        0qQ.A0B(str, 0);
        Number number = (Number) A01.get(str);
        if (number != null) {
            return number.intValue();
        }
        return 0;
    }

    static {
        0eP[] r173 = new 0eP[64];
        System.arraycopy(new 0eP[]{new 0eP((Integer) null, "normal"), new 0eP(112, "clarendon"), new 0eP(114, "gingham"), new 0eP(111, "moon"), new 0eP(615, "lark"), new 0eP(614, "reyes"), new 0eP(613, "juno"), new 0eP(605, "slumber"), new 0eP(616, "crema"), new 0eP(603, "ludwig"), new 0eP(612, "aden"), new 0eP(608, "perpetua"), new 0eP(24, "amaro"), new 0eP(17, "mayfair"), new 0eP(23, "rise"), new 0eP(25, "valencia"), new 0eP(1, "xpro2"), new 0eP(27, "sierra"), new 0eP(28, "willow"), new 0eP(2, "lo_fi"), new 0eP(10, "inkwell"), new 0eP(15, "nashville"), new 0eP(753, "gradient_transform"), new 0eP(803, "enhance"), new 0eP(702, "dramatic_bw"), new 0eP(706, "crystal_clear"), new 0eP(705, "cinema_blue")}, 0, r173, 0, 27);
        0eP r0 = new 0eP(703, "cinema_red");
        0eP r02 = new 0eP(707, "vintage");
        0eP r03 = new 0eP(710, "pastel_sky");
        0eP r04 = new 0eP(709, "pastel_pink");
        0eP r05 = new 0eP(642, "crazy_color");
        0eP r06 = new 0eP(643, "subtle_color");
        0eP r07 = new 0eP(640, "bright_contrast");
        0eP r08 = new 0eP(816, "split_screen");
        0eP r09 = new 0eP(810, "paris");
        0eP r010 = new 0eP(813, "los_angeles");
        0eP r011 = new 0eP(-3, "image_overlay");
        0eP r012 = new 0eP(1010, "hyper");
        0eP r013 = new 0eP(1011, "rosy");
        0eP r014 = new 0eP(1012, "emerald");
        0eP r015 = new 0eP(1013, "midnight");
        Integer valueOf = Integer.valueOf(IgNetworkConsentStorage.MAX_ENTRIES);
        0eP r146 = r0;
        System.arraycopy(new 0eP[]{r146, r02, r03, r04, r05, r06, r07, r08, r09, r010, r011, r012, r013, r014, r015, new 0eP(valueOf, "fade"), new 0eP(1001, "fade_warm"), new 0eP(1002, "fade_cool"), new 0eP(1003, "subtle"), new 0eP(1004, "subtle_warm"), new 0eP(1005, "subtle_cool"), new 0eP(1006, "boost"), new 0eP(1007, "boost_warm"), new 0eP(1008, "boost_cool"), new 0eP(1009, "grayscale"), new 0eP(1100, "grainy"), new 0eP(1101, "gritty")}, 0, r173, 27, 27);
        0eP r4 = new 0eP(1102, "halo");
        0eP r1462 = r4;
        System.arraycopy(new 0eP[]{r1462, new 0eP(1103, "color_leak"), new 0eP(1104, "soft_light"), new 0eP(1105, "zoom_blur"), new 0eP(1106, "handheld"), new 0eP(1107, "moire"), new 0eP(1108, "lo_res"), new 0eP(1109, "wavy"), new 0eP(1110, "wide_angle"), new 0eP(1112, "color_grading")}, 0, r173, 54, 10);
        A00 = 0Yt.A06(r173);
        0eP[] r166 = new 0eP[64];
        0eP r016 = new 0eP("normal", (Integer) null);
        0eP r139 = r016;
        System.arraycopy(new 0eP[]{r139, new 0eP("clarendon", 112), new 0eP("gingham", 114), new 0eP("moon", 111), new 0eP("lark", 615), new 0eP("reyes", 614), new 0eP("juno", 613), new 0eP("slumber", 605), new 0eP("crema", 616), new 0eP("ludwig", 603), new 0eP("aden", 612), new 0eP("perpetua", 608), new 0eP("amaro", 24), new 0eP("mayfair", 17), new 0eP("rise", 23), new 0eP("valencia", 25), new 0eP("xpro2", 1), new 0eP("sierra", 27), new 0eP("willow", 28), new 0eP("lo_fi", 2), new 0eP("inkwell", 10), new 0eP("nashville", 15), new 0eP("gradient_transform", 753), new 0eP("enhance", 803), new 0eP("dramatic_bw", 702), new 0eP("crystal_clear", 706), new 0eP("cinema_blue", 705)}, 0, r166, 0, 27);
        0eP r017 = new 0eP("cinema_red", 703);
        0eP r018 = new 0eP("vintage", 707);
        0eP r019 = new 0eP("pastel_sky", 710);
        0eP r117 = r017;
        0eP r118 = r018;
        0eP r119 = r019;
        System.arraycopy(new 0eP[]{r117, r118, r119, new 0eP("pastel_pink", 709), new 0eP("crazy_color", 642), new 0eP("subtle_color", 643), new 0eP("bright_contrast", 640), new 0eP("split_screen", 816), new 0eP("paris", 810), new 0eP("los_angeles", 813), new 0eP("image_overlay", -3), new 0eP("hyper", 1010), new 0eP("rosy", 1011), new 0eP("emerald", 1012), new 0eP("midnight", 1013), new 0eP("fade", valueOf), new 0eP("fade_warm", 1001), new 0eP("fade_cool", 1002), new 0eP("subtle", 1003), new 0eP("subtle_warm", 1004), new 0eP("subtle_cool", 1005), new 0eP("boost", 1006), new 0eP("boost_warm", 1007), new 0eP("boost_cool", 1008), new 0eP("grayscale", 1009), new 0eP("grainy", 1100), new 0eP("gritty", 1101)}, 0, r166, 27, 27);
        System.arraycopy(new 0eP[]{new 0eP("halo", 1102), new 0eP("color_leak", 1103), new 0eP("soft_light", 1104), new 0eP("zoom_blur", 1105), new 0eP("handheld", 1106), new 0eP("moire", 1107), new 0eP("lo_res", 1108), new 0eP("wavy", 1109), new 0eP("wide_angle", 1110), new 0eP("color_grading", 1112)}, 0, r166, 54, 10);
        A01 = 0Yt.A06(r166);
    }

    public static final String A01(int i) {
        Object obj = A00.get(Integer.valueOf(i));
        if (obj != null) {
            return (String) obj;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
