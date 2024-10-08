package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.instagram.reels.music.external.pulseanimation.PulseAnimation;

/* renamed from: X.Jdu  reason: case insensitive filesystem */
public final class C60041Jdu extends View {
    public final /* synthetic */ PulseAnimation A00;

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        PulseAnimation pulseAnimation = this.A00;
        if (pulseAnimation.A07 != null) {
            float min = (float) (Math.min(getWidth(), getHeight()) / 2);
            Paint paint = pulseAnimation.A07;
            if (paint == null) {
                0qQ.A0F("paint");
                throw AnonymousClass00P.createAndThrow();
            } else {
                canvas.drawCircle(min, min, min, paint);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60041Jdu(Context context, PulseAnimation pulseAnimation) {
        super(context);
        this.A00 = pulseAnimation;
        setVisibility(4);
    }
}
