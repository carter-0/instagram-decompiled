package X;

import android.hardware.Camera;
import java.util.concurrent.Callable;

/* renamed from: X.AsT  reason: case insensitive filesystem */
public final class C41346AsT implements Callable {
    public final int A00;
    public final int A01;
    public final Object A02;

    public C41346AsT(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    public final Object call() {
        int i;
        int i2;
        int i3;
        int i4;
        switch (this.A00) {
            case 0:
                AnonymousClass9RJ r4 = (AnonymousClass9RJ) this.A02;
                int i5 = this.A01;
                r4.A0E("Can not update preview display rotation");
                r4.A01 = i5;
                r4.A0Z.getClass();
                if (r4.A0b == null) {
                    r4.A0Z.setDisplayOrientation(AnonymousClass9RJ.A00(r4, r4.A01));
                } else {
                    boolean FNS = r4.A0b.FNS();
                    Camera camera = r4.A0Z;
                    if (FNS) {
                        i3 = 0;
                    } else {
                        i3 = r4.A01;
                    }
                    camera.setDisplayOrientation(AnonymousClass9RJ.A00(r4, i3));
                    C341047mF r3 = r4.A0b;
                    int i6 = r4.A01;
                    if (i6 == 1) {
                        i4 = 90;
                    } else if (i6 != 2) {
                        i4 = 270;
                        if (i6 != 3) {
                            i4 = 0;
                        }
                    } else {
                        i4 = 180;
                    }
                    r3.D0F(i4);
                }
                C342717p3 Bt2 = r4.Bt2();
                Object A022 = Bt2.A02(C342717p3.A0q);
                A022.getClass();
                C343047pa r0 = (C343047pa) A022;
                AnonymousClass9RJ.A09(r4, r0.A02, r0.A01);
                return new C343367q6(r4.AlD(), (C343367q6) null, Bt2, r4.A00, false);
            case 1:
                AnonymousClass9RJ r42 = (AnonymousClass9RJ) this.A02;
                int i7 = this.A01;
                C340577lU.A00(30, 0, (Object) null);
                AnonymousClass0fI r02 = AnonymousClass0fI.$redex_init_class;
                Camera open = Camera.open(i7);
                if (0BU.A04()) {
                    0BU.A03(open);
                }
                C340577lU.A00(31, 0, (Object) null);
                C341877nf r2 = r42.A0a;
                if (r2 == null) {
                    return open;
                }
                String A023 = r42.A0Q.A02();
                if (r2.A00.isEmpty()) {
                    return open;
                }
                C342057ny.A00(new C343017pX(r2, A023));
                return open;
            case 2:
                AnonymousClass9RJ r1 = (AnonymousClass9RJ) this.A02;
                i = this.A01;
                if (r1.isConnected() && r1.A0e) {
                    r1.A0M.A00(i);
                    break;
                } else {
                    i = 0;
                    break;
                }
            case 3:
                AnonymousClass9RZ r22 = (AnonymousClass9RZ) this.A02;
                int i8 = this.A01;
                if (!AnonymousClass9RZ.A03(r22)) {
                    if (AnonymousClass9RZ.A06 == null) {
                        r22.A00.A06("Number of cameras must be loaded on background thread.");
                        AnonymousClass9RZ.A02(r22);
                    }
                    Camera.CameraInfo[] cameraInfoArr = AnonymousClass9RZ.A06;
                    i = 0;
                    if (cameraInfoArr != null) {
                        int length = cameraInfoArr.length;
                        i2 = 0;
                        while (i < length) {
                            if (cameraInfoArr[i].facing == i8) {
                                i2++;
                            }
                            i++;
                        }
                    }
                } else if (i8 == 0) {
                    i2 = AnonymousClass9RZ.A04;
                } else if (i8 != 1) {
                    i2 = 0;
                } else {
                    i2 = AnonymousClass9RZ.A05;
                }
                i = i2;
                break;
            default:
                return Boolean.valueOf(((AnonymousClass9RZ) this.A02).A08(this.A01));
        }
        return Integer.valueOf(i);
    }
}
