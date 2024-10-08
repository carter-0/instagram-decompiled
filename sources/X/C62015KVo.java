package X;

/* renamed from: X.KVo  reason: case insensitive filesystem */
public final class C62015KVo extends C64386Lb3 {
    public final /* synthetic */ AnonymousClass3Q2 A00;

    public C62015KVo(AnonymousClass3Q2 r1) {
        this.A00 = r1;
    }

    public final void onBytesTransferred(long j, long j2) {
        super.onBytesTransferred(j, j2);
        if (j2 > 0) {
            this.A00.A0g(AnonymousClass05K.A01, (double) (((float) j) / ((float) j2)));
        }
    }
}
