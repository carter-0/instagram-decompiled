package X;

/* renamed from: X.5jB  reason: invalid class name and case insensitive filesystem */
public final class C292575jB implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C256683wB A01;
    public final /* synthetic */ C264324Pl A02;

    public C292575jB(C256683wB r1, C264324Pl r2, int i) {
        this.A02 = r2;
        this.A00 = i;
        this.A01 = r1;
    }

    public final void run() {
        AnonymousClass4PC r1 = this.A02.A01;
        int i = this.A00;
        C256683wB r0 = this.A01;
        AnonymousClass4OS r7 = ((AnonymousClass4P8) r1).A05;
        Integer valueOf = Integer.valueOf(i);
        int i2 = r0.A05;
        Integer valueOf2 = Integer.valueOf(i2);
        int i3 = r0.A0L;
        Integer valueOf3 = Integer.valueOf(i3);
        int i4 = r0.A0A;
        28J.A02(r7, "onDecoderPerfReport avgDecodeTimeMsPerFrame:%d, bitrate:%d, width:%d, height:%d", new Object[]{valueOf, valueOf2, valueOf3, Integer.valueOf(i4)});
        r7.A0v.D80(i, i3, i4, i2);
    }
}
