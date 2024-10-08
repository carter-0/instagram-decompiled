package X;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: X.Lbw  reason: case insensitive filesystem */
public final class C64441Lbw implements 1FG {
    public final ContentValues A00;
    public final Context A01;
    public final Uri A02;

    public final void AIX() {
        Uri uri = this.A02;
        if (uri != null) {
            long currentTimeMillis = System.currentTimeMillis();
            ContentValues contentValues = this.A00;
            Long valueOf = Long.valueOf(currentTimeMillis);
            contentValues.put("date_added", valueOf);
            contentValues.put(AnonymousClass000.A00(4690), valueOf);
            if (Build.VERSION.SDK_INT >= 29) {
                contentValues.put("datetaken", valueOf);
                contentValues.put("is_pending", C51967G9n.A0k());
            }
            this.A01.getContentResolver().update(uri, contentValues, (String) null, (String[]) null);
            return;
        }
        throw JTO.A0u("Content Resolver resource is not available");
    }

    public final OutputStream CGq() {
        Uri uri = this.A02;
        if (uri != null) {
            OutputStream openOutputStream = this.A01.getContentResolver().openOutputStream(uri);
            if (openOutputStream != null) {
                return openOutputStream;
            }
            throw JTO.A0u("CRWritableResource returned a null output stream");
        }
        throw JTO.A0u("Content Resolver resource is not available");
    }

    public C64441Lbw(ContentValues contentValues, Context context, Uri uri) {
        this.A01 = context;
        this.A00 = contentValues;
        this.A02 = uri;
    }

    public final void FNs(InputStream inputStream) {
        1FU.A00(inputStream, CGq());
    }
}
