package X;

import android.os.Handler;

/* renamed from: X.Lj9  reason: case insensitive filesystem */
public final class C64847Lj9 implements C41815B1v {
    public final /* synthetic */ C61738KKd A00;
    public final /* synthetic */ String A01;

    public final void DXr() {
    }

    public C64847Lj9(C61738KKd kKd, String str) {
        this.A00 = kKd;
        this.A01 = str;
    }

    public final void DOX() {
        C61738KKd kKd = this.A00;
        String str = this.A01;
        if (kKd.A03 && kKd.A01.equals(str)) {
            Handler handler = kKd.A09;
            Runnable runnable = kKd.A0F;
            handler.removeCallbacks(runnable);
            handler.postDelayed(runnable, 200);
        }
    }
}
