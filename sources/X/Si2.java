package X;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.facebook.common.dextricks.Constants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class Si2 implements C13691Tf9 {
    public final C13691Tf9 A00;
    public final ST0 A01;
    public final List A02;

    public final /* bridge */ /* synthetic */ C13796ThF ANe(C11856Shi shi, Object obj, int i, int i2) {
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
        try {
            byte[] bArr = new byte[Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            byteArrayOutputStream.flush();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (byteArray == null) {
                return null;
            }
            return this.A00.ANe(shi, ByteBuffer.wrap(byteArray), i, i2);
        } catch (IOException e) {
            if (!Log.isLoggable("StreamGifDecoder", 5)) {
                return null;
            }
            Log.w("StreamGifDecoder", "Error reading data from stream", e);
            return null;
        }
    }

    public final /* bridge */ /* synthetic */ boolean CJU(C11856Shi shi, Object obj) {
        InputStream inputStream = (InputStream) obj;
        if (!AnonymousClass7TE.A1a(shi.A00(C10060Rlx.A01))) {
            if (SKE.A01(this.A01, inputStream, this.A02) != ImageHeaderParser$ImageType.GIF) {
                return false;
            }
            return true;
        }
        return false;
    }

    public Si2(C13691Tf9 tf9, ST0 st0, List list) {
        this.A02 = list;
        this.A00 = tf9;
        this.A01 = st0;
    }
}
