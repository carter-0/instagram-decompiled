package X;

import android.graphics.Rect;
import com.instagram.creation.base.CropInfo;

/* renamed from: X.9z3  reason: invalid class name and case insensitive filesystem */
public abstract class C395009z3 {
    public static final CropInfo A00(int i, int i2) {
        int min = Math.min(i, i2);
        Rect rect = new Rect(0, 0, min, min);
        if (i > i2) {
            rect.offsetTo(AnonymousClass1GB.A01((((float) i) / 2.0f) - (((float) min) / 2.0f)), 0);
        } else if (i < i2) {
            rect.offsetTo(0, AnonymousClass1GB.A01((((float) i2) / 2.0f) - (((float) min) / 2.0f)));
        }
        return new CropInfo(rect, i, i2);
    }
}
