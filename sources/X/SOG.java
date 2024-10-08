package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.net.Uri;
import android.os.AsyncTask;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Map;

public final class SOG {
    public static final SOG A06 = new SOG();
    public Uri A00;
    public Uri A01;
    public Map A02 = AnonymousClass7TE.A1E();
    public Map A03 = AnonymousClass7TE.A1E();
    public boolean A04;
    public final Object A05 = Pxe.A0p();

    public static Bitmap A00(Context context, Uri uri) {
        InputStream inputStream;
        while (true) {
            try {
                inputStream = context.getContentResolver().openInputStream(uri);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                inputStream = null;
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = 1;
            try {
                return BitmapFactory.decodeStream(inputStream, (Rect) null, options);
            } catch (OutOfMemoryError unused) {
                int i = options.inSampleSize;
                if (i >= 64) {
                    return null;
                }
                options.inSampleSize = i * 2;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.AsyncTask, X.Q6p] */
    public final void A01(Context context, Uri uri, C13708TfS tfS, String str, boolean z, boolean z2) {
        synchronized (this.A05) {
            Map map = this.A03;
            boolean containsKey = map.containsKey(uri);
            map.put(uri, tfS);
            if (!containsKey) {
                Context applicationContext = context.getApplicationContext();
                ? asyncTask = new AsyncTask();
                asyncTask.A00 = applicationContext;
                asyncTask.A02 = uri;
                asyncTask.A04 = z;
                asyncTask.A05 = z2;
                asyncTask.A03 = str;
                asyncTask.A01 = null;
                asyncTask.execute(new Void[0]);
            }
        }
    }
}
