package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.io.File;
import java.io.OutputStream;

public final class K0K extends 1FF {
    public final Context A00;
    public final boolean A01;

    /* JADX WARNING: type inference failed for: r3v0, types: [X.K0K, java.io.File] */
    public final void AIX() {
        Context context = this.A00;
        if (context != null && this.A01) {
            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            intent.setData(Uri.fromFile(this));
            context.sendBroadcast(intent);
        }
    }

    public K0K(Context context, File file, boolean z) {
        super(file.getPath());
        this.A00 = context;
        this.A01 = z;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.K0K, java.io.File] */
    public final OutputStream CGq() {
        return JTO.A0t(this);
    }
}
