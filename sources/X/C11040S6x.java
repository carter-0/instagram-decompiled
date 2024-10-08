package X;

/* renamed from: X.S6x  reason: case insensitive filesystem */
public abstract class C11040S6x {
    public int A00;
    public C10585Ruf A01;
    public C10585Ruf A02;
    public Object A03;

    public final Object A00() {
        C10585Ruf ruf = this.A02;
        if (ruf != null) {
            this.A03 = ruf.A02;
        }
        this.A02 = null;
        this.A01 = null;
        this.A00 = 0;
        Object obj = this.A03;
        if (obj == null) {
            return A01(12);
        }
        return obj;
    }

    public final Object A01(int i) {
        if (this instanceof C8256QmA) {
            return new short[i];
        }
        if (this instanceof C8255Qm9) {
            return new long[i];
        }
        if (this instanceof Qm8) {
            return new int[i];
        }
        if (this instanceof Qm7) {
            return new float[i];
        }
        if (this instanceof Qm6) {
            return new double[i];
        }
        if (this instanceof Qm5) {
            return new byte[i];
        }
        return new boolean[i];
    }

    public final Object A02(Object obj, int i) {
        C10585Ruf ruf = new C10585Ruf(obj, i);
        if (this.A01 == null) {
            this.A02 = ruf;
            this.A01 = ruf;
        } else {
            C10585Ruf ruf2 = this.A02;
            if (ruf2.A00 == null) {
                ruf2.A00 = ruf;
                this.A02 = ruf;
            } else {
                throw Pxe.A0i();
            }
        }
        this.A00 += i;
        int i2 = i + i;
        if (i >= 16384) {
            i2 = (i >> 2) + i;
        }
        return A01(i2);
    }

    public final Object A03(Object obj, int i) {
        int i2 = this.A00 + i;
        Object A012 = A01(i2);
        int i3 = 0;
        for (C10585Ruf ruf = this.A01; ruf != null; ruf = ruf.A00) {
            Object obj2 = ruf.A02;
            int i4 = ruf.A01;
            System.arraycopy(obj2, 0, A012, i3, i4);
            i3 += i4;
        }
        System.arraycopy(obj, 0, A012, i3, i);
        int i5 = i3 + i;
        if (i5 == i2) {
            return A012;
        }
        throw AnonymousClass7TE.A0z(002.A02(i2, i5, "Should have gotten ", " entries, got "));
    }
}
