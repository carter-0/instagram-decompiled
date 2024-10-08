package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import com.facebook.fxcropapp.ig.IgCropActivity;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/* renamed from: X.Q6o  reason: case insensitive filesystem */
public final class C7357Q6o extends AsyncTask {
    public Drawable A00;
    public C10206RoN A01;
    public String A02;

    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        String str = this.A02;
        if (str == null) {
            return AnonymousClass7TE.A11("Failed to load icon");
        }
        try {
            URLConnection openConnection = new URL(str).openConnection();
            0fi.A02(openConnection, 1716580836);
            this.A00 = new BitmapDrawable(Resources.getSystem(), BitmapFactory.decodeStream(0fi.A00(openConnection, -2039668637)));
            return null;
        } catch (IOException e) {
            return e;
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.content.Context, com.facebook.fxcropapp.ig.IgCropActivity] */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Drawable drawable;
        if (obj == null && (drawable = this.A00) != null) {
            C10206RoN roN = this.A01;
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            ? r3 = roN.A00;
            float f = IgCropActivity.A02;
            if (r3.A01 != null && bitmap != null) {
                int i = (int) IgCropActivity.A02;
                BitmapDrawable bitmapDrawable = new BitmapDrawable(r3.getResources(), 0fO.A00(bitmap, i, i, false));
                bitmapDrawable.mutate();
                bitmapDrawable.setTint(-1);
                r3.A01.setCompoundDrawablesWithIntrinsicBounds(bitmapDrawable, (Drawable) null, (Drawable) null, (Drawable) null);
                r3.A01.invalidate();
            }
        }
    }
}
