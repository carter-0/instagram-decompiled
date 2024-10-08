package X;

import android.graphics.Bitmap;
import android.graphics.Color;
import java.nio.ByteBuffer;

public final class S24 {
    public Bitmap A00 = null;
    public ByteBuffer A01 = null;
    public final C10473Rso A02 = new Object();

    public final ByteBuffer A00() {
        Bitmap bitmap = this.A00;
        if (bitmap == null) {
            return this.A01;
        }
        int width = bitmap.getWidth();
        int height = this.A00.getHeight();
        int i = width * height;
        int[] iArr = new int[i];
        this.A00.getPixels(iArr, 0, width, 0, 0, width, height);
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((int) ((((float) Color.red(iArr[i2])) * 0.299f) + (((float) Color.green(iArr[i2])) * 0.587f) + (((float) Color.blue(iArr[i2])) * 0.114f)));
        }
        return ByteBuffer.wrap(bArr);
    }
}
