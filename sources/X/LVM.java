package X;

import android.content.Context;
import android.media.MediaScannerConnection;
import android.net.Uri;
import java.util.Queue;

public final class LVM implements MediaScannerConnection.MediaScannerConnectionClient {
    public final AnonymousClass0eM A00;
    public final String A01;
    public final Queue A02;

    private final void A00() {
        Queue queue = this.A02;
        if (queue.isEmpty()) {
            ((MediaScannerConnection) this.A00.getValue()).disconnect();
            return;
        }
        Object remove = queue.remove();
        if (remove != null) {
            String str = (String) remove;
            AnonymousClass0eM r1 = this.A00;
            if (((MediaScannerConnection) r1.getValue()).isConnected()) {
                ((MediaScannerConnection) r1.getValue()).scanFile(str, this.A01);
            } else {
                0wb.A03("MediaScannerUtil", "MediaScannerConnection was not connected successfully");
            }
        } else {
            throw AnonymousClass7TE.A0y();
        }
    }

    public LVM(Context context, String str, Queue queue) {
        this.A02 = queue;
        this.A01 = str;
        this.A00 = AnonymousClass0eN.A01(new MJ4(10, context, this));
    }

    public final void onMediaScannerConnected() {
        A00();
    }

    public final void onScanCompleted(String str, Uri uri) {
        A00();
    }
}
