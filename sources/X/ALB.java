package X;

import android.hardware.Camera;

public final /* synthetic */ class ALB implements Camera.PictureCallback {
    public final /* synthetic */ AnonymousClass9RJ A00;
    public final /* synthetic */ C364018kj A01;
    public final /* synthetic */ C363988kg A02;
    public final /* synthetic */ C364158kx A03;

    public /* synthetic */ ALB(AnonymousClass9RJ r1, C364018kj r2, C363988kg r3, C364158kx r4) {
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final void onPictureTaken(byte[] bArr, Camera camera) {
        AnonymousClass9RJ r1 = this.A00;
        C364158kx r5 = this.A03;
        C363988kg r4 = this.A02;
        C364018kj r3 = this.A01;
        r5.A01(C363858kS.A0b, bArr);
        C340167ko r2 = r1.A06;
        r2.getClass();
        r1.A0D(r2, r3, r4, r5, (C363858kS) null);
        AnonymousClass9S3.A00(r1.A0L).countDown();
    }
}
