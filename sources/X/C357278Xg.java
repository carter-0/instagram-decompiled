package X;

import com.instagram.common.gallery.Medium;
import java.util.Comparator;

/* renamed from: X.8Xg  reason: invalid class name and case insensitive filesystem */
public final class C357278Xg implements Comparator {
    public static final C357278Xg A00 = new C357278Xg();

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Medium medium = (Medium) obj;
        Medium medium2 = (Medium) obj2;
        if (medium == null) {
            return -1;
        }
        if (medium2 != null) {
            long j = medium.A0C;
            long j2 = medium2.A0C;
            if (j > j2) {
                return -1;
            }
            if (j == j2) {
                long j3 = medium.A0D;
                long j4 = medium2.A0D;
                if (j3 > j4) {
                    return -1;
                }
                if (j3 == j4) {
                    int i = medium.A05;
                    int i2 = medium2.A05;
                    if (i < i2) {
                        return -1;
                    }
                    if (i != i2) {
                        return 1;
                    }
                    return 0;
                }
            }
        }
        return 1;
    }
}
