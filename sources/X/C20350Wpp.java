package X;

import android.util.ArrayMap;

/* renamed from: X.Wpp  reason: case insensitive filesystem */
public final class C20350Wpp implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ ArrayMap A01;
    public final /* synthetic */ W00 A02;
    public final /* synthetic */ C16529UwZ A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public C20350Wpp(ArrayMap arrayMap, W00 w00, C16529UwZ uwZ, String str, String str2, String str3, long j) {
        this.A02 = w00;
        this.A06 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A03 = uwZ;
        this.A01 = arrayMap;
        this.A00 = j;
    }

    public final void run() {
        W00 w00 = this.A02;
        String str = this.A06;
        String str2 = this.A05;
        String str3 = this.A04;
        C16529UwZ uwZ = this.A03;
        ArrayMap arrayMap = this.A01;
        W00.A01(w00, uwZ, str, str2, str3, this.A00);
        SKX.A02(arrayMap, w00.A00, SKX.A00(str, str2));
    }
}
