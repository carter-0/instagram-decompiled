package X;

import android.graphics.Rect;
import android.view.ViewGroup;

/* renamed from: X.AqK  reason: case insensitive filesystem */
public final class C41222AqK implements Runnable {
    public final /* synthetic */ Rect A00;
    public final /* synthetic */ ViewGroup A01;
    public final /* synthetic */ C21040XAt A02;
    public final /* synthetic */ C255783ui A03;

    public C41222AqK(Rect rect, ViewGroup viewGroup, C21040XAt xAt, C255783ui r4) {
        this.A00 = rect;
        this.A02 = xAt;
        this.A01 = viewGroup;
        this.A03 = r4;
    }

    public final void run() {
        Rect rect = this.A00;
        float width = (float) rect.width();
        C21040XAt xAt = this.A02;
        Float BaA = xAt.BaA();
        if (BaA != null) {
            ViewGroup viewGroup = this.A01;
            float floatValue = ((width * (1.0f - (BaA.floatValue() * 2.0f))) / AnonymousClass7TE.A02(viewGroup)) * 0.95f;
            viewGroup.setScaleX(floatValue);
            viewGroup.setScaleY(floatValue);
            int centerX = rect.centerX();
            float f = (float) rect.bottom;
            float height = (float) rect.height();
            Float Aim = xAt.Aim();
            if (Aim != null) {
                float floatValue2 = f - ((height * Aim.floatValue()) / 2.0f);
                float height2 = (float) rect.height();
                Float BaA2 = xAt.BaA();
                if (BaA2 != null) {
                    float floatValue3 = floatValue2 - ((height2 * BaA2.floatValue()) / 2.0f);
                    C255783ui r7 = this.A03;
                    float exactCenterX = rect.exactCenterX();
                    float exactCenterY = rect.exactCenterY();
                    float f2 = ((float) centerX) - exactCenterX;
                    double d = (double) (r7.A01 * 2.0f * 3.1415927f);
                    float cos = (float) Math.cos(d);
                    float f3 = floatValue3 - exactCenterY;
                    float sin = (float) Math.sin(d);
                    viewGroup.setX((((cos * f2) - (sin * f3)) + exactCenterX) - ((float) (viewGroup.getWidth() / 2)));
                    viewGroup.setY((((f2 * sin) + (f3 * cos)) + exactCenterY) - ((float) (viewGroup.getHeight() / 2)));
                    viewGroup.setRotation(r7.A01 * 360.0f);
                    return;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}
