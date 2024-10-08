package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.instagram.android.R;
import java.io.File;
import java.util.Random;
import java.util.concurrent.Callable;

/* renamed from: X.MAx  reason: case insensitive filesystem */
public final class C66090MAx implements Callable {
    public final long A00;
    public final Context A01;
    public final Paint A02;
    public final Rect A03 = AnonymousClass7TE.A0W();

    public final /* bridge */ /* synthetic */ Object call() {
        Bitmap bitmap;
        Context context = this.A01;
        if (C59990Jcz.A09 == null) {
            File A0s = JTO.A0s(context.getExternalFilesDir((String) null), "StaticAnimationDrawable");
            C59990Jcz.A09 = A0s;
            A0s.mkdirs();
        }
        File A0s2 = JTO.A0s(C59990Jcz.A09, "static_tile_1");
        if (A0s2.exists()) {
            bitmap = 1NK.A00().A0G(C253833rU.A01(A0s2));
            if (bitmap == null) {
                A0s2.delete();
            }
            System.currentTimeMillis();
            bitmap.getWidth();
            bitmap.getHeight();
            bitmap.getByteCount();
            return bitmap;
        }
        int A05 = AnonymousClass7TE.A05((float) 0nA.A09(context), 0.333f);
        bitmap = Bitmap.createBitmap(A05, A05, Bitmap.Config.ARGB_8888);
        Canvas A0B = JTO.A0B(bitmap);
        Random random = new Random();
        int round = Math.round(0nA.A00(context, 1.0f));
        for (int i = 0; i < A05; i += round) {
            int i2 = 0;
            while (i2 < A05) {
                Paint paint = this.A02;
                paint.setAlpha(random.nextInt(255));
                Rect rect = this.A03;
                int i3 = i2 + round;
                rect.set(i, i2, i + round, i3);
                A0B.drawRect(rect, paint);
                i2 = i3;
            }
        }
        0fO.A02(Bitmap.CompressFormat.PNG, bitmap, JTO.A0t(A0s2.getCanonicalFile()), 100);
        System.currentTimeMillis();
        bitmap.getWidth();
        bitmap.getHeight();
        bitmap.getByteCount();
        return bitmap;
    }

    public C66090MAx(Context context, long j) {
        this.A01 = context;
        this.A00 = j;
        Paint A0V = AnonymousClass7TE.A0V(2);
        this.A02 = A0V;
        AnonymousClass4D6 r0 = C59990Jcz.A0A;
        AnonymousClass7TE.A1N(context, A0V, R.color.grey_5);
        AnonymousClass7TE.A1Q(A0V);
    }
}
