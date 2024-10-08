package X;

import android.graphics.PointF;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.ShA  reason: case insensitive filesystem */
public final class C11824ShA implements C13520Tbp {
    public static final C11824ShA A00 = new Object();
    public static final SNH A01 = SNH.A01("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    /* JADX WARNING: type inference failed for: r0v1, types: [X.S3U, java.lang.Object] */
    public final /* bridge */ /* synthetic */ Object E1k(C12828T8z t8z, float f) {
        Integer num = AnonymousClass05K.A0C;
        C12828T8z t8z2 = t8z;
        t8z2.A0J();
        String str = null;
        Integer num2 = num;
        String str2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float f2 = 0.0f;
        int i = 0;
        float f3 = 0.0f;
        float f4 = 0.0f;
        int i2 = 0;
        int i3 = 0;
        float f5 = 0.0f;
        boolean z = true;
        while (t8z2.A0Q()) {
            switch (t8z2.A0D(A01)) {
                case 0:
                    str = t8z2.A0G();
                    continue;
                case 1:
                    str2 = t8z2.A0G();
                    continue;
                case 2:
                    f2 = Pxh.A02(t8z2);
                    continue;
                case 3:
                    int A0C = t8z2.A0C();
                    if (A0C > 2 || A0C < 0) {
                        num2 = num;
                        break;
                    } else {
                        num2 = AnonymousClass05K.A00(3)[A0C];
                        continue;
                    }
                case 4:
                    i = t8z2.A0C();
                    continue;
                case 5:
                    f3 = Pxh.A02(t8z2);
                    continue;
                case 6:
                    f4 = Pxh.A02(t8z2);
                    continue;
                case 7:
                    i2 = C11400SRv.A01(t8z2);
                    continue;
                case 8:
                    i3 = C11400SRv.A01(t8z2);
                    continue;
                case 9:
                    f5 = Pxh.A02(t8z2);
                    continue;
                case 10:
                    z = t8z2.A0R();
                    continue;
                case 11:
                    t8z2.A0I();
                    pointF = new PointF(Pxh.A02(t8z2) * f, Pxh.A02(t8z2) * f);
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    t8z2.A0I();
                    pointF2 = new PointF(Pxh.A02(t8z2) * f, Pxh.A02(t8z2) * f);
                    break;
                default:
                    t8z2.A0M();
                    t8z2.A0N();
                    continue;
            }
            t8z2.A0K();
        }
        t8z2.A0L();
        ? obj = new Object();
        obj.A0B = str;
        obj.A0A = str2;
        obj.A02 = f2;
        obj.A09 = num2;
        obj.A06 = i;
        obj.A01 = f3;
        obj.A00 = f4;
        obj.A04 = i2;
        obj.A05 = i3;
        obj.A03 = f5;
        obj.A0C = z;
        obj.A07 = pointF;
        obj.A08 = pointF2;
        return obj;
    }
}
