package X;

import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.Execution;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

/* renamed from: X.5pK  reason: invalid class name and case insensitive filesystem */
public abstract class C296025pK {
    public static final void A00(OFG ofg, InputStream inputStream, OutputStream outputStream) {
        byte[] bArr;
        OFG ofg2;
        try {
            synchronized (C296035pL.class) {
                int i = C296035pL.A00 + 1;
                C296035pL.A00 = i;
                if (i > 10) {
                    0KC.A0P("ByteArrayPool", "Too many byte array objects allocated: %,d", new Object[]{Integer.valueOf(i)});
                }
                ArrayList arrayList = C296035pL.A01;
                if (!arrayList.isEmpty()) {
                    bArr = (byte[]) arrayList.remove(arrayList.size() - 1);
                } else {
                    bArr = new byte[1024];
                }
            }
            long j = 0;
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    ofg2 = ofg;
                    if (read <= 0) {
                        break;
                    }
                    outputStream.write(bArr, 0, read);
                    j += (long) read;
                    if (ofg != null) {
                        ofg.A00 = j;
                        Execution.executeAsync(new C68356NBs(ofg2, j - ofg.A00, j), (AccountSession) null, 3);
                    }
                } catch (Throwable th) {
                    th = th;
                    C296035pL.A00(bArr);
                    throw th;
                }
            }
            if (ofg != null) {
                ofg.A00 = j;
                Execution.executeAsync(new C68356NBs(ofg2, j - ofg.A00, j), (AccountSession) null, 3);
            }
            C296035pL.A00(bArr);
        } catch (Throwable th2) {
            th = th2;
            bArr = null;
            C296035pL.A00(bArr);
            throw th;
        }
    }
}
