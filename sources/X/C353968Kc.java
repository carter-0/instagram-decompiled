package X;

import android.util.SparseArray;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.filterkit.TextureAsset;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.8Kc  reason: invalid class name and case insensitive filesystem */
public abstract class C353968Kc {
    public static List A00;
    public static List A01;

    public static final SparseArray A00(UserSession userSession) {
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, new C353978Kd((Integer) null, 182.A06(0Tu.A05, userSession, 36320760307131215L) ? "Original" : ReactProgressBarViewManager.DEFAULT_STYLE, (String) null, ReactProgressBarViewManager.DEFAULT_STYLE, new LinkedList(), 0, R.drawable.filter_normal, false));
        sparseArray.put(-2, new C353978Kd((Integer) null, "OES", (String) null, "OES", new LinkedList(), -2, 0, false));
        sparseArray.put(-1, new C353978Kd((Integer) null, "YUV", (String) null, "YUV", new LinkedList(), -1, 0, false));
        LinkedList linkedList = new LinkedList();
        linkedList.add(new TextureAsset("map", "video/gingham/curves1.png"));
        linkedList.add(new TextureAsset("mapLgg", "video/gingham/curves_lgg.png"));
        sparseArray.put(114, new C353978Kd((Integer) null, "Gingham", "Lagos", "Gingham", linkedList, 114, R.drawable.lagos, false));
        LinkedList linkedList2 = new LinkedList();
        linkedList2.add(new TextureAsset("map", "brightcontrast/map.png"));
        sparseArray.put(640, new C353978Kd((Integer) null, "BrightContrast", "Melbourne", "StandardColorMap", linkedList2, 640, R.drawable.melbourne, false));
        LinkedList linkedList3 = new LinkedList();
        linkedList3.add(new TextureAsset("map", "crazycolor/map.png"));
        linkedList3.add(new TextureAsset("overlay_map", "crazycolor/overlay_map.png"));
        sparseArray.put(642, new C353978Kd((Integer) null, "Crazy", "Rio de Janeiro", "CrazyColor", linkedList3, 642, R.drawable.rio, false));
        LinkedList linkedList4 = new LinkedList();
        linkedList4.add(new TextureAsset("map", "subtlecolor/map.png"));
        sparseArray.put(643, new C353978Kd((Integer) null, "Subtle", "Oslo", "StandardColorMap", linkedList4, 643, R.drawable.oslo, false));
        sparseArray.put(810, new C353978Kd(AnonymousClass05K.A0N, "paris", "Paris", "Retouching", new LinkedList(), 810, R.drawable.paris, false));
        sparseArray.put(811, new C353978Kd(AnonymousClass05K.A0Y, "TouchUp", "Touch Up", "IGFastRetouchingFilter", new LinkedList(), 811, R.drawable.paris, true));
        LinkedList linkedList5 = new LinkedList();
        linkedList5.add(new TextureAsset("sLookup", "magic/map.png"));
        sparseArray.put(813, new C353978Kd(AnonymousClass05K.A0j, "Magic", "Los Angeles", "Magic", linkedList5, 813, R.drawable.la, false));
        LinkedList linkedList6 = new LinkedList();
        linkedList6.add(new TextureAsset("uColorLut", "tint/clut_bw.png"));
        Integer num = AnonymousClass05K.A01;
        sparseArray.put(702, new C353978Kd(num, "DramaticBlackWhite", "Tokyo", "Tint", linkedList6, 702, R.drawable.tokyo, false));
        LinkedList linkedList7 = new LinkedList();
        linkedList7.add(new TextureAsset("uColorLut", "tint/clut_cinema_red.png"));
        Integer num2 = num;
        String str = "Tint";
        sparseArray.put(703, new C353978Kd(num2, "CinemaRed", "Abu Dhabi", str, linkedList7, 703, R.drawable.abu, false));
        LinkedList linkedList8 = new LinkedList();
        linkedList8.add(new TextureAsset("uColorLut", "tint/clut_cinema_blue.png"));
        sparseArray.put(705, new C353978Kd(num2, "CinemaBlue", "Buenos Aires", str, linkedList8, 705, R.drawable.buenos, false));
        LinkedList linkedList9 = new LinkedList();
        linkedList9.add(new TextureAsset("uColorLut", "tint/clut_clear.png"));
        sparseArray.put(706, new C353978Kd(num2, "CrystalClear", "Jakarta", str, linkedList9, 706, R.drawable.jakarta, false));
        LinkedList linkedList10 = new LinkedList();
        linkedList10.add(new TextureAsset("uColorLut", "tint/clut_vintage.png"));
        sparseArray.put(707, new C353978Kd(num2, "Vintage", "New York", str, linkedList10, 707, R.drawable.newyork, false));
        LinkedList linkedList11 = new LinkedList();
        linkedList11.add(new TextureAsset("uColorLut", "tint/clut_pastel_pink.png"));
        sparseArray.put(709, new C353978Kd(num2, "PastelPink", "Jaipur", str, linkedList11, 709, R.drawable.jaipur, false));
        LinkedList linkedList12 = new LinkedList();
        linkedList12.add(new TextureAsset("uColorLut", "tint/clut_pastel_sky.png"));
        sparseArray.put(710, new C353978Kd(num2, "PastelSky", "Cairo", str, linkedList12, 710, R.drawable.cairo, false));
        LinkedList linkedList13 = new LinkedList();
        linkedList13.add(new TextureAsset("uColorLut", "tint/clut_bw.png"));
        sparseArray.put(702, new C353978Kd(num, "DramaticBlackWhite", "Tokyo", "Tint", linkedList13, 702, R.drawable.tokyo, false));
        LinkedList linkedList14 = new LinkedList();
        Integer num3 = AnonymousClass05K.A0C;
        int i = R.drawable.filter_normal;
        sparseArray.put(753, new C353978Kd(num3, "GradientBackgroundTextured", (String) null, "GradientBackgroundTextured", linkedList14, 753, i, false));
        sparseArray.put(754, new C353978Kd(num3, "GradientAndBitmapBackgroundTextured", (String) null, "GradientAndBitmapBackgroundTextured", new LinkedList(), 754, i, false));
        sparseArray.put(1112, new C353978Kd(AnonymousClass05K.A0u, "ColorGrading", "AI Filter", "ColorGrading", new LinkedList(), 1112, R.drawable.filter_normal, false));
        return sparseArray;
    }
}
