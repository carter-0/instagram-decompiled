package X;

import com.instagram.model.keyword.Keyword;
import java.util.Comparator;

/* renamed from: X.5lD  reason: invalid class name and case insensitive filesystem */
public final class C293705lD implements Comparator {
    public static final C293705lD A00 = new C293705lD();

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        double d;
        Keyword keyword = (Keyword) obj2;
        Double d2 = ((Keyword) obj).A01;
        double d3 = 0.0d;
        if (d2 != null) {
            d = d2.doubleValue();
        } else {
            d = 0.0d;
        }
        Double d4 = keyword.A01;
        if (d4 != null) {
            d3 = d4.doubleValue();
        }
        if (d < d3) {
            return 1;
        }
        if (d3 > d) {
            return -1;
        }
        return 0;
    }
}
