package X;

/* renamed from: X.6Ir  reason: invalid class name and case insensitive filesystem */
public final class C305596Ir implements C305606Is {
    public int A00;
    public AnonymousClass6It A01;
    public final C285045Pl A02 = new C285045Pl(new AnonymousClass6It[16]);

    public static final void A00(C305596Ir r3, int i) {
        if (i < 0 || i >= r3.A00) {
            throw new IndexOutOfBoundsException(002.A02(i, r3.A00, "Index ", ", size "));
        }
    }

    public final void A01(int i, Object obj) {
        if (i < 0) {
            throw new IllegalArgumentException(002.A0O("size should be >=0, but was ", i));
        } else if (i != 0) {
            int i2 = this.A00;
            AnonymousClass6It r1 = new AnonymousClass6It(i2, i, obj);
            this.A00 = i2 + i;
            this.A02.A09(r1);
        }
    }

    public final AnonymousClass6It AX1(int i) {
        A00(this, i);
        AnonymousClass6It r0 = this.A01;
        if (r0 != null) {
            int i2 = r0.A01;
            if (i < r0.A00 + i2 && i2 <= i) {
                return r0;
            }
        }
        C285045Pl r02 = this.A02;
        AnonymousClass6It r03 = (AnonymousClass6It) r02.A02[AnonymousClass6Iy.A00(r02, i)];
        this.A01 = r03;
        return r03;
    }
}
