package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class SMi {
    public static List A00 = Arrays.asList(new String[]{"com.instagram.android", "com.instagram.barcelona", "com.facebook.katana", "com.facebook.wakizashi", "com.facebook.orca"});
    public static Map A01;

    public static Map A01() {
        if (A01 == null) {
            HashMap A1E = AnonymousClass7TE.A1E();
            A01 = A1E;
            A1E.put("com.facebook.wakizashi", "350685531728");
            A01.put("com.facebook.orca", "256002347743983");
            A01.put(AnonymousClass000.A00(1190), "121876164619130");
            A01.put("com.whatsapp", "306069495113");
            A01.put("com.instagram.android", "567067343352427");
            A01.put("com.instagram.bolt", "295940867235646");
            A01.put("com.instagram.layout", "881555691867714");
            A01.put("com.facebook.groups", "358698234273213");
            A01.put("com.facebook.moments", "794956213882720");
            A01.put("com.facebook.slingshot", "255620677933453");
            A01.put("com.oculus.home", "1548792348668883");
            A01.put("com.oculus.horizon", "1437758943160428");
            A01.put("com.facebook.lite", "275254692598279");
            A01.put("com.instagram.barcelona", AnonymousClass000.A00(2068));
        }
        return Collections.unmodifiableMap(A01);
    }

    public static String A00(String str) {
        if (A01().containsKey(str)) {
            return DbT.A11(str, A01());
        }
        return str;
    }
}
