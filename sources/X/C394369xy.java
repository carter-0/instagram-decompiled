package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;

/* renamed from: X.9xy  reason: invalid class name and case insensitive filesystem */
public abstract class C394369xy {
    public static final Bitmap A00(Bitmap bitmap, TargetViewSizeProvider targetViewSizeProvider) {
        0qQ.A0B(targetViewSizeProvider, 1);
        AnonymousClass81W r0 = ((NineSixteenLayoutConfigImpl) targetViewSizeProvider).A0K;
        int width = r0.getWidth();
        int height = r0.getHeight();
        RectF A0Y = AnonymousClass7TE.A0Y();
        float width2 = (float) bitmap.getWidth();
        float height2 = (float) bitmap.getHeight();
        float f = (float) width;
        float f2 = (float) height;
        float max = Math.max(Math.abs(f / width2), Math.abs(f2 / height2));
        float abs = Math.abs(width2 * max);
        float abs2 = Math.abs(height2 * max);
        float f3 = (float) ((int) ((f - abs) * 0.5f));
        float f4 = (float) ((int) ((f2 - abs2) * 0.5f));
        A0Y.set(f3, f4, abs + f3, abs2 + f4);
        Rect A0W = AnonymousClass7TE.A0W();
        A0Y.roundOut(A0W);
        Bitmap A00 = 0fO.A00(bitmap, A0W.width(), A0W.height(), true);
        0qQ.A07(A00);
        return A00;
    }
}
