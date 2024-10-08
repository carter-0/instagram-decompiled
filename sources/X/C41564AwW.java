package X;

import android.os.Handler;

/* renamed from: X.AwW  reason: case insensitive filesystem */
public final class C41564AwW extends 0Yg implements C62320sa {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Handler A01;
    public final /* synthetic */ Runnable A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41564AwW(Handler handler, Runnable runnable, long j) {
        super(0);
        this.A01 = handler;
        this.A02 = runnable;
        this.A00 = j;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        this.A01.postDelayed(this.A02, this.A00);
        return C60340gF.A00;
    }
}
