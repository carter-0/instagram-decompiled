package X;

import android.media.MediaScannerConnection;
import android.net.Uri;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;

/* renamed from: X.SVp  reason: case insensitive filesystem */
public final class C11452SVp implements MediaScannerConnection.OnScanCompletedListener {
    public final /* synthetic */ QZ2 A00;

    public C11452SVp(QZ2 qz2) {
        this.A00 = qz2;
    }

    public final void onScanCompleted(String str, Uri uri) {
        C13904TjR tjR = this.A00.A02;
        if (uri != null) {
            tjR.resolve(uri.toString());
        } else {
            Pxi.A1K(CameraRollManager.ERROR_UNABLE_TO_SAVE, tjR, "Could not add image to gallery");
        }
    }
}
