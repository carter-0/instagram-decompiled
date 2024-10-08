package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: X.Q6q  reason: case insensitive filesystem */
public final class C7359Q6q extends AsyncTask {
    public int A00;
    public int A01;
    public Context A02;
    public Bitmap A03;
    public RectF A04;
    public Uri A05;

    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        try {
            Bitmap A002 = RVN.A00(this.A03, this.A00);
            this.A03 = A002;
            float A022 = JTO.A02(A002) / ((float) this.A01);
            RectF rectF = this.A04;
            float f = rectF.left * A022;
            float f2 = rectF.top * A022;
            float width = rectF.width() * A022;
            float height = rectF.height() * A022;
            if (f < 0.0f) {
                f = 0.0f;
            }
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if ((f + width) - 1.0f >= JTO.A02(this.A03)) {
                width = JTO.A02(this.A03) - f;
            }
            if ((f2 + height) - 1.0f >= JTO.A01(this.A03)) {
                height = JTO.A01(this.A03) - f2;
            }
            Bitmap bitmap = this.A03;
            0fO.A03(bitmap);
            this.A03 = Bitmap.createBitmap(bitmap, (int) f, (int) f2, (int) width, (int) height);
            OutputStream openOutputStream = this.A02.getContentResolver().openOutputStream(this.A05);
            if (openOutputStream != null) {
                0fO.A02(Bitmap.CompressFormat.JPEG, this.A03, openOutputStream, 100);
                openOutputStream.close();
            }
            this.A03.recycle();
            return null;
        } catch (IOException | IllegalArgumentException e) {
            e.printStackTrace();
            return e;
        }
    }

    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Context context;
        Intent A0G;
        Throwable th = (Throwable) obj;
        if (th == null) {
            SS4.A00 = this.A00;
            RectF rectF = this.A04;
            if (rectF == null) {
                SS4.A01 = null;
            } else {
                RectF rectF2 = SS4.A01;
                if (rectF2 == null) {
                    rectF2 = AnonymousClass7TE.A0Y();
                    SS4.A01 = rectF2;
                }
                rectF2.set(rectF);
            }
            context = this.A02;
            Uri uri = this.A05;
            A0G = Pxe.A0G("crop_action_crop_completed");
            A0G.putExtra("extra_uri", uri);
        } else {
            context = this.A02;
            A0G = Pxe.A0G("crop_action_crop_completed");
            A0G.putExtra("extra_error", th);
        }
        0b6.A00().A06().A0C(context, A0G);
    }
}
