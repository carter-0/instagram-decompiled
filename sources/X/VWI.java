package X;

import android.graphics.Camera;
import android.graphics.Paint;
import android.text.TextPaint;

public final class VWI {
    public final Camera A00;
    public final Paint.FontMetrics A01;
    public final TextPaint A02;

    public VWI(TextPaint textPaint) {
        this.A02 = textPaint;
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        0qQ.A07(fontMetrics);
        this.A01 = fontMetrics;
        Camera camera = new Camera();
        this.A00 = camera;
        camera.setLocation(0.0f, 0.0f, 8.0f);
    }
}
