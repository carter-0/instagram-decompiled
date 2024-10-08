package X;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

public abstract class SQL {
    public static final PointF A00 = new PointF();

    public static int A00(float f, float f2) {
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        int i4 = i % i2;
        if (!Pxf.A1R(i ^ i2) && i4 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }

    public static void A01(Path path, SHA sha) {
        Path path2 = path;
        path.reset();
        PointF pointF = sha.A00;
        path.moveTo(pointF.x, pointF.y);
        PointF pointF2 = A00;
        pointF2.set(pointF.x, pointF.y);
        int i = 0;
        while (true) {
            List list = sha.A02;
            if (i >= list.size()) {
                break;
            }
            SH9 sh9 = (SH9) list.get(i);
            PointF pointF3 = sh9.A00;
            PointF pointF4 = sh9.A01;
            PointF pointF5 = sh9.A02;
            if (!pointF3.equals(pointF2) || !pointF4.equals(pointF5)) {
                path2.cubicTo(pointF3.x, pointF3.y, pointF4.x, pointF4.y, pointF5.x, pointF5.y);
            } else {
                path2.lineTo(pointF5.x, pointF5.y);
            }
            pointF2.set(pointF5.x, pointF5.y);
            i++;
        }
        if (sha.A01) {
            path2.close();
        }
    }

    public static void A02(C13914TlG tlG, SPM spm, SPM spm2, List list, int i) {
        if (spm.A01(tlG.getName(), i)) {
            String name = tlG.getName();
            SPM spm3 = new SPM(spm2);
            spm3.A01.add(name);
            SPM spm4 = new SPM(spm3);
            spm4.A00 = tlG;
            list.add(spm4);
        }
    }
}
