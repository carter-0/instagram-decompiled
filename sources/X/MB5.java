package X;

import java.util.concurrent.Callable;

public final class MB5 implements Callable {
    public final int A00;
    public final int A01;
    public final Object A02;

    public MB5(JXF jxf, int i, int i2) {
        this.A00 = i2;
        this.A02 = jxf;
        this.A01 = i;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        1Vg r4;
        AnonymousClass1WV r3;
        C251983oI r1;
        C60340gF r0;
        switch (this.A00) {
            case 0:
                ((C353308Hc) this.A02).A01.A08(this.A01);
                return AnonymousClass7TE.A0v();
            case 1:
                AnonymousClass2NS r5 = (AnonymousClass2NS) this.A02;
                r4 = r5.A02;
                r3 = r4.acquire();
                r3.ADa(1, (long) this.A01);
                r1 = r5.A01;
                r1.beginTransaction();
                r0 = AnonymousClass7TF.A10(r1, r3);
                break;
            case 2:
                JXF jxf = (JXF) this.A02;
                r4 = jxf.A03;
                r3 = r4.acquire();
                r3.ADa(1, (long) this.A01);
                r1 = jxf.A02;
                r1.beginTransaction();
                r0 = AnonymousClass7TF.A10(r1, r3);
                break;
            default:
                JXF jxf2 = (JXF) this.A02;
                r4 = jxf2.A04;
                r3 = r4.acquire();
                r3.ADa(1, 1);
                r3.ADa(2, (long) this.A01);
                try {
                    r1 = jxf2.A02;
                    r1.beginTransaction();
                    r0 = AnonymousClass7TF.A10(r1, r3);
                    break;
                } catch (Throwable th) {
                    r4.release(r3);
                    throw th;
                }
        }
        r1.endTransaction();
        r4.release(r3);
        return r0;
    }

    public MB5(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }
}
