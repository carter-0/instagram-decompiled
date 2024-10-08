package X;

import android.graphics.Bitmap;

public final class QOO extends C268764dx {
    public final int A00;

    public QOO(int i, Float f) {
        if (f != null) {
            int floatValue = (int) (f.floatValue() * 255.0f);
            if (floatValue < 0) {
                floatValue = 0;
            } else if (floatValue > 255) {
                floatValue = 255;
            }
            i = (i & 16777215) | (floatValue << 24);
        }
        this.A00 = i;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Tint. tintColor=");
        A1A.append(i);
        AnonymousClass7TG.A0m((Object) null, ", mode=", A1A).getClass();
    }

    public final void A01(Bitmap bitmap) {
        0qQ.A0B(bitmap, 0);
        JTO.A0B(bitmap).drawColor(this.A00);
    }
}
