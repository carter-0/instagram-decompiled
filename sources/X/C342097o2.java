package X;

import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: X.7o2  reason: invalid class name and case insensitive filesystem */
public final class C342097o2 implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C340597lW A02;
    public final /* synthetic */ C340167ko A03;
    public final /* synthetic */ C342067nz A04;

    public C342097o2(C340597lW r1, C340167ko r2, C342067nz r3, int i, int i2) {
        this.A02 = r1;
        this.A04 = r3;
        this.A03 = r2;
        this.A00 = i;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C340577lU.A00(11, 0, (Object) null);
        C340597lW r2 = this.A02;
        if (!(r2.A0m == null || r2.A0m == this.A04.A02)) {
            r2.A0m.ECm(r2.A0m.C3J());
        }
        C342067nz r3 = this.A04;
        C341047mF r1 = r3.A02;
        r2.A0m = r1;
        C341897nh r0 = (C341897nh) r1.BYV(C341897nh.A00);
        r2.A0C = r0;
        if (r0 == null) {
            r2.A0C = C341897nh.A01;
        }
        r2.A0F = r3;
        C340167ko r4 = this.A03;
        r2.A0A = r4;
        Map map = (Map) r4.AXG(C340167ko.A02);
        if (!map.isEmpty()) {
            C340777lo r12 = r2.A0O;
            if (!map.isEmpty()) {
                r12.A00 = map;
                if (r12.A02.A09()) {
                    C340777lo.A03(r12);
                }
            }
        }
        r2.A01 = this.A00;
        r2.A0H = ((Boolean) r4.AXG(C340167ko.A0F)).booleanValue();
        C340777lo r5 = r2.A0O;
        int i = this.A01;
        if (r5.A02.A09()) {
            C340777lo.A02(r5);
            int i2 = 1;
            if (i == 1) {
                i2 = 0;
            }
            if (!r5.A09(i2)) {
                if (r5.A05 == null) {
                    throw new RuntimeException("Logical cameras not initialised!");
                } else if (r5.A05.length == 0) {
                    throw new C382449di();
                } else if (i != 0 || !r5.A09(0)) {
                    if (i != 1 || !r5.A09(1)) {
                        StringBuilder sb = new StringBuilder("Camera 2 API - Could not get CameraInfo for CameraFacing id: ");
                        sb.append(i);
                        sb.append(" Number Of Cameras: ");
                        sb.append(C340777lo.A06);
                        sb.append(" BACK: ");
                        boolean z = C340777lo.A07;
                        sb.append(z);
                        sb.append(" FRONT: ");
                        sb.append(z);
                        C342617ot[] r22 = r5.A05;
                        if (r22 != null) {
                            sb.append(" Camera Info size: ");
                            sb.append(r1);
                            sb.append(" Camera lenses: ");
                            for (C342617ot r02 : r22) {
                                sb.append(r02.A01);
                                sb.append(" ");
                            }
                        } else {
                            sb.append(" Camera Info NULL");
                        }
                        throw new RuntimeException(sb.toString());
                    }
                    C340577lU.A03("CameraInventory", "Requested front camera doesn't exist, using back instead");
                    i = 0;
                } else {
                    C340577lU.A03("CameraInventory", "Requested back camera doesn't exist, using front instead");
                    i = 1;
                }
            }
            r2.A07 = new C342627ou();
            String A07 = r5.A07(i);
            try {
                C340597lW.A03(r2, A07);
                r2.A0B(A07);
                C340597lW.A01(r2);
                C340597lW.A02(r2, (Float) null, A07);
                C343367q6 r52 = new C343367q6(r2.AlD(), (C343367q6) null, r2.Bt2(), r2.A00, false);
                C340577lU.A00(12, r2.A00, r52);
                return r52;
            } catch (Exception e) {
                C340577lU.A00(13, 0, e);
                r2.APU((AnonymousClass8GD) null);
                throw e;
            }
        } else {
            throw new RuntimeException("Cannot resolve camera facing, not on the Optic thread");
        }
    }
}
