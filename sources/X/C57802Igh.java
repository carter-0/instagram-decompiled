package X;

import android.util.LongSparseArray;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;

/* renamed from: X.Igh  reason: case insensitive filesystem */
public final /* synthetic */ class C57802Igh implements Runnable {
    public final /* synthetic */ LongSparseArray A00;
    public final /* synthetic */ AndroidContentCaptureManager A01;

    public /* synthetic */ C57802Igh(LongSparseArray longSparseArray, AndroidContentCaptureManager androidContentCaptureManager) {
        this.A01 = androidContentCaptureManager;
        this.A00 = longSparseArray;
    }

    public final void run() {
        I6C.A00(this.A00, this.A01);
    }
}
