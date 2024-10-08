package X;

import android.util.ArrayMap;

/* renamed from: X.WpG  reason: case insensitive filesystem */
public final class C20321WpG implements Runnable {
    public final /* synthetic */ ArrayMap A00;
    public final /* synthetic */ W00 A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public C20321WpG(ArrayMap arrayMap, W00 w00, String str, String str2) {
        this.A01 = w00;
        this.A03 = str;
        this.A02 = str2;
        this.A00 = arrayMap;
    }

    public final void run() {
        W00 w00 = this.A01;
        String str = this.A03;
        String str2 = this.A02;
        SKX.A02(this.A00, w00.A00, SKX.A00(str, str2));
    }
}
