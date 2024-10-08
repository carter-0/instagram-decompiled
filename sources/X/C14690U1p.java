package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Arrays;

/* renamed from: X.U1p  reason: case insensitive filesystem */
public final class C14690U1p extends Handler {
    public final /* synthetic */ WMB A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14690U1p(Looper looper, WMB wmb) {
        super(looper);
        this.A00 = wmb;
    }

    public final void handleMessage(Message message) {
        byte[] bArr = (byte[]) message.obj;
        if (bArr != null) {
            for (WM9 wm9 : this.A00.A08) {
                WM9.A00(wm9);
                if (Arrays.equals(wm9.A04, bArr)) {
                    if (message.what == 2 && wm9.A00 == 4) {
                        WM9.A03(wm9, false);
                        return;
                    }
                    return;
                }
            }
        }
    }
}
