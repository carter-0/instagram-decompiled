package X;

/* renamed from: X.AQp  reason: case insensitive filesystem */
public final class C40084AQp implements C41805B1k {
    public final /* synthetic */ AVS A00;

    public C40084AQp(AVS avs) {
        this.A00 = avs;
    }

    public final C367508qr AWT(int i, int i2) {
        return new C367508qr(i / 4, i2);
    }

    public final C367508qr AWU(int i, int i2, int i3) {
        C367508qr A002 = C392439uo.A00(new C367508qr(i, i2), i3, i3);
        int i4 = A002.A01;
        int i5 = i4 - (i4 % 4);
        return new C367508qr(i5, (int) (((float) A002.A00) * (((float) i5) / ((float) i4))));
    }
}
