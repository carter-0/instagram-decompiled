package X;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Handler;
import com.facebook.common.stringformat.StringFormatUtil;
import java.nio.Buffer;

/* renamed from: X.WpV  reason: case insensitive filesystem */
public final class C20332WpV implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ VLI A02;
    public final /* synthetic */ C14965UHd A03;
    public final /* synthetic */ Buffer A04;

    public C20332WpV(VLI vli, C14965UHd uHd, Buffer buffer, int i, int i2) {
        this.A03 = uHd;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = vli;
        this.A04 = buffer;
    }

    public final void run() {
        C17813VgQ vgQ;
        Throwable th;
        C14965UHd uHd = this.A03;
        int i = this.A01;
        int i2 = this.A00;
        try {
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            if (createBitmap != null) {
                try {
                    createBitmap.copyPixelsFromBuffer(this.A04);
                    C17813VgQ vgQ2 = this.A02.A00;
                    C18660VwH vwH = vgQ2.A01;
                    vwH.A0L.DD4(7);
                    Handler handler = vwH.A0G;
                    handler.post(new C20128Wlo(createBitmap, vgQ2));
                    vwH.A0W = false;
                    handler.post(new C19923Whs(vgQ2));
                    vwH.A0J.A04(vgQ2.A02);
                    vwH.A0W = false;
                    return;
                } catch (Throwable th2) {
                    String obj = th2.toString();
                    Integer valueOf = Integer.valueOf(this.A04.capacity());
                    Integer valueOf2 = Integer.valueOf(createBitmap.getAllocationByteCount());
                    Integer valueOf3 = Integer.valueOf(uHd.A03);
                    Integer valueOf4 = Integer.valueOf(uHd.A00);
                    Integer valueOf5 = Integer.valueOf(i);
                    Integer valueOf6 = Integer.valueOf(i2);
                    RectF rectF = uHd.A04;
                    String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("Could not save photo, copyPixelsFromBuffer Failed: %s, ib.capacity: %d, bitmap-bytecount:%d, doesFitInMemory:%b, mWidth:%d, mHeight:%d, croppedWidth:%d, croppedHeight:%d, mCropRect:(l:%f,t:%f,r:%f,b:%f)", new Object[]{obj, valueOf, valueOf2, true, valueOf3, valueOf4, valueOf5, valueOf6, Float.valueOf(rectF.left), Float.valueOf(rectF.top), Float.valueOf(rectF.right), Float.valueOf(rectF.bottom)});
                    0KC.A0J("PhotoOutput", formatStrLocaleSafe, th2);
                    vgQ = this.A02.A00;
                    th = new RuntimeException(formatStrLocaleSafe);
                }
            }
        } catch (Exception e) {
            0KC.A0F("IgBitmapUtilImpl", "Exception when creating bitmap", e);
        }
        vgQ = this.A02.A00;
        th = new NullPointerException(002.A02(i, i2, "Failed to create bitmap with dimensions: ", "x"));
        vgQ.A00(th);
    }
}
