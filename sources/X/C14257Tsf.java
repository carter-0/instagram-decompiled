package X;

import android.hardware.Camera;
import android.os.SystemClock;
import java.util.List;

/* renamed from: X.Tsf  reason: case insensitive filesystem */
public final class C14257Tsf implements Camera.PreviewCallback {
    public final /* synthetic */ C14255Tsd A00;

    public C14257Tsf(C14255Tsd tsd) {
        this.A00 = tsd;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.8kR, java.lang.Object] */
    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        if (bArr != null) {
            C364268l9.A00().A02();
            ? obj = new Object();
            C14255Tsd tsd = this.A00;
            int i = tsd.A00;
            C343047pa r0 = tsd.A01;
            int i2 = r0.A02;
            int i3 = r0.A01;
            obj.A09 = bArr;
            obj.A01 = i;
            obj.A02 = i2;
            obj.A00 = i3;
            obj.A03 = SystemClock.elapsedRealtimeNanos();
            List list = tsd.A03.A00;
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((B17) list.get(i4)).DZ8(obj);
            }
        }
    }
}
