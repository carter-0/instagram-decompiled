package X;

import android.net.Uri;
import android.util.Pair;
import java.io.FileNotFoundException;

public abstract class SKY {
    public static final Uri A01(String str) {
        0qQ.A0B(str, 0);
        Uri A09 = DbT.A09(str);
        String scheme = A09.getScheme();
        if (0qQ.A0K(scheme, "file")) {
            String path = A09.getPath();
            if (path == null || path.length() == 0) {
                throw AnonymousClass7TF.A0W("Invalid input file URI passed to the transcoder: ", str);
            } else if (JTQ.A1Z(path)) {
                return A09;
            } else {
                throw new FileNotFoundException(002.A0R("Input file to the transcoder is not found: ", str));
            }
        } else {
            throw AnonymousClass7TF.A0W("Transcoder only support local files as input (file://). Invalid input file URI scheme: ", scheme);
        }
    }

    public static final long A00(Double d) {
        if (d == null) {
            return -1;
        }
        double doubleValue = d.doubleValue();
        if (doubleValue >= 0.0d) {
            return (long) (doubleValue * 1000.0d);
        }
        return -1;
    }

    public static final Pair A02(C7232Q0d q0d, C10570RuP ruP) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j;
        long j2;
        int min;
        if (ruP != null) {
            Pair pair = ruP.A02;
            i4 = Pxf.A05(pair);
            i = Pxf.A04(pair);
            Pair pair2 = ruP.A00;
            i5 = Pxf.A05(pair2);
            i2 = Pxf.A04(pair2);
            Pair pair3 = ruP.A01;
            i6 = Pxf.A05(pair3);
            i3 = Pxf.A04(pair3);
        } else {
            i = 5000000;
            i2 = 2500000;
            i3 = 1000000;
            i4 = 1920;
            i5 = 1280;
            i6 = 1280;
        }
        int max = Math.max(q0d.A03, q0d.A05);
        if (max > 1920) {
            j = q0d.A06;
            j2 = (long) i;
        } else if (max > 1280) {
            min = (int) Math.min(q0d.A06, (long) i2);
            i4 = i5;
            return Pxf.A0K(Integer.valueOf(i4), min);
        } else {
            i4 = Math.min(max, i6);
            j = q0d.A06;
            j2 = (long) i3;
        }
        min = (int) Math.min(j, j2);
        return Pxf.A0K(Integer.valueOf(i4), min);
    }
}
