package X;

import android.graphics.Bitmap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public final class SOA {
    public static final Bitmap.Config[] A03 = {Bitmap.Config.ALPHA_8};
    public static final Bitmap.Config[] A04 = {Bitmap.Config.ARGB_4444};
    public static final Bitmap.Config[] A05;
    public static final Bitmap.Config[] A06;
    public static final Bitmap.Config[] A07 = {Bitmap.Config.RGB_565};
    public final C11036S6o A00 = new C11036S6o();
    public final QH5 A01 = new C10169Rnk();
    public final Map A02 = AnonymousClass7TE.A1E();

    static {
        Bitmap.Config[] configArr = (Bitmap.Config[]) Arrays.copyOf(new Bitmap.Config[]{Bitmap.Config.ARGB_8888, null}, 3);
        configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        A05 = configArr;
        A06 = configArr;
    }

    public static void A00(Bitmap bitmap, SOA soa, Integer num) {
        Bitmap.Config config = bitmap.getConfig();
        Map map = soa.A02;
        Map map2 = (Map) map.get(config);
        if (map2 == null) {
            map2 = new TreeMap();
            map.put(config, map2);
        }
        Number A14 = C51966G9m.A14(num, map2);
        if (A14 != null) {
            int intValue = A14.intValue();
            if (intValue == 1) {
                map2.remove(num);
            } else {
                C66580MXl.A1T(num, map2, intValue - 1);
            }
        } else {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("Tried to decrement empty size, size: ");
            A1A.append(num);
            A1A.append(", removed: ");
            int A012 = C11424STg.A01(bitmap);
            Bitmap.Config config2 = bitmap.getConfig();
            StringBuilder A1A2 = AnonymousClass7TE.A1A();
            Pxh.A1P(A1A2);
            A1A2.append(A012);
            A1A2.append("](");
            A1A.append(Pxg.A0q(config2, A1A2));
            throw AnonymousClass7TE.A11(AnonymousClass7TG.A0m(soa, ", this: ", A1A));
        }
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("SizeConfigStrategy{groupedMap=");
        A1A.append(this.A00);
        A1A.append(", sortedSizes=(");
        Map map = this.A02;
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            A1A.append(A1J.getKey());
            A1A.append('[');
            A1A.append(A1J.getValue());
            A1A.append("], ");
        }
        if (!map.isEmpty()) {
            A1A.replace(A1A.length() - 2, A1A.length(), "");
        }
        return AnonymousClass7TF.A0l(")}", A1A);
    }
}
