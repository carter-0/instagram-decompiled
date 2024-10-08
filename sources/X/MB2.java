package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;

public final class MB2 implements Callable {
    public final Context A00;
    public final Bitmap A01;
    public final Bitmap A02;
    public final MS6 A03;
    public final boolean A04;
    public final boolean A05;

    public final /* bridge */ /* synthetic */ Object call() {
        File file;
        Bitmap bitmap = this.A02;
        Bitmap bitmap2 = this.A01;
        if (bitmap2 != null && !bitmap.isRecycled()) {
            JTO.A0B(bitmap).drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
        }
        boolean z = this.A05;
        Context context = this.A00;
        if (z) {
            file = 0qc.A00(context, ".jpg");
        } else {
            try {
                file = File.createTempFile(AnonymousClass000.A00(3929), ".jpg", context.getFilesDir());
            } catch (IOException e) {
                0KC.A0F("PhotoFileUtil", AnonymousClass000.A00(4138), e);
                file = null;
            }
        }
        if (file == null) {
            11Z.A02(new C66024M8j(this, (String) null, false));
            return null;
        }
        boolean A0K = 1MF.A0K(context, Bitmap.CompressFormat.JPEG, bitmap, file);
        if (this.A04) {
            bitmap.recycle();
        }
        if (!A0K) {
            11Z.A02(new C66024M8j(this, (String) null, false));
            return null;
        }
        if (z) {
            C59730JVo.A08(context, file);
        }
        11Z.A02(new C66024M8j(this, file.getPath(), true));
        return file.getPath();
    }

    public MB2(Context context, Bitmap bitmap, Bitmap bitmap2, MS6 ms6, boolean z, boolean z2) {
        this.A00 = context;
        this.A02 = bitmap;
        this.A01 = bitmap2;
        this.A04 = z;
        this.A05 = z2;
        this.A03 = ms6;
    }
}
