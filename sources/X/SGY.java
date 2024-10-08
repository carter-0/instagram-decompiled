package X;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ColorSpace;
import android.graphics.HardwareBufferRenderer;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.hardware.HardwareBuffer;
import android.os.Build;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class SGY {
    public static final SGY A00 = new Object();
    public static final AnonymousClass0eM A01 = AnonymousClass0eN.A00(0eO.A02, TVQ.A00);

    public final boolean A00() {
        try {
            if (Build.VERSION.SDK_INT != 34) {
                return false;
            }
            HardwareBuffer create = HardwareBuffer.create(32, 32, 1, 1, 768);
            0qQ.A07(create);
            HardwareBufferRenderer hardwareBufferRenderer = new HardwareBufferRenderer(create);
            RenderNode renderNode = new RenderNode("test");
            renderNode.setPosition(0, 0, 32, 32);
            RecordingCanvas beginRecording = renderNode.beginRecording();
            0qQ.A07(beginRecording);
            Paint paint = new Paint();
            paint.setTextSize(32.0f);
            beginRecording.drawColor(-65536);
            beginRecording.drawText("⬜", 0.0f, 32.0f, paint);
            renderNode.endRecording();
            hardwareBufferRenderer.setContentRoot(renderNode);
            CountDownLatch countDownLatch = new CountDownLatch(1);
            HardwareBufferRenderer.RenderRequest obtainRenderRequest = hardwareBufferRenderer.obtainRenderRequest();
            ColorSpace.Named named = ColorSpace.Named.BT2020_PQ;
            obtainRenderRequest.setColorSpace(ColorSpace.get(named)).draw(TO1.A00, new TOZ(countDownLatch));
            if (countDownLatch.await(5, TimeUnit.SECONDS)) {
                Bitmap wrapHardwareBuffer = Bitmap.wrapHardwareBuffer(create, ColorSpace.get(named));
                0qQ.A0A(wrapHardwareBuffer);
                Color convert = wrapHardwareBuffer.copy(Bitmap.Config.ARGB_8888, false).getColor(16, 16).convert(ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB));
                0qQ.A07(convert);
                if (((double) convert.red()) <= 1.0d && ((double) convert.green()) <= 1.0d) {
                    if (((double) convert.blue()) <= 1.0d) {
                        return false;
                    }
                }
                return true;
            }
            throw new TimeoutException();
        } catch (Exception e) {
            AnonymousClass7TG.A1I(0wj.A01, "emoji_bug_detection_error", e, 245701013);
            0KC.A0G("EmojiHdrBugUtil", "emoji bug detection error", e);
            return true;
        }
    }
}
