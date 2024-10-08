package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import com.instagram.android.R;

/* renamed from: X.9xs  reason: invalid class name and case insensitive filesystem */
public abstract class C394309xs {
    public static final Bitmap A00(Resources resources, Bitmap bitmap) {
        float f;
        boolean A1Z = AnonymousClass7TG.A1Z(bitmap, resources);
        float A01 = AnonymousClass7TE.A01(resources, R.dimen.action_button_settings_height);
        float width = (float) bitmap.getWidth();
        float height = (float) bitmap.getHeight();
        if (width > height) {
            f = A01;
            A01 = (A01 / height) * width;
        } else {
            f = (A01 / width) * height;
        }
        Bitmap A00 = 0fO.A00(bitmap, AnonymousClass1GB.A01(A01), AnonymousClass1GB.A01(f), A1Z);
        0qQ.A07(A00);
        return A00;
    }
}
