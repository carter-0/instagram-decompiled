package X;

import android.os.Handler;
import java.util.List;

/* renamed from: X.AQo  reason: case insensitive filesystem */
public final class C40083AQo implements C341737nR {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ C341737nR A01;
    public final /* synthetic */ B16 A02;
    public final /* synthetic */ C341627nG A03;
    public final /* synthetic */ List A04;

    public C40083AQo(Handler handler, C341737nR r2, B16 b16, C341627nG r4, List list) {
        this.A03 = r4;
        this.A01 = r2;
        this.A00 = handler;
        this.A02 = b16;
        this.A04 = list;
    }

    public final void onError(Throwable th) {
        this.A03.A06(new AUP(this));
    }

    public final void onSuccess() {
        C18091VlL.A00(this.A00, this.A01);
        B16 b16 = this.A02;
        if (b16 != null) {
            b16.onFinished();
        }
    }
}
