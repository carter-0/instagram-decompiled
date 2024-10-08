package X;

import com.facebook.common.dextricks.Constants;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.WFa  reason: case insensitive filesystem */
public abstract class C18973WFa implements C21007X9g {
    public static final C18636VvY A02 = new C18636VvY(32);
    public int A00;
    public final AtomicLong A01 = new AtomicLong(0);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.V3b, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v3, types: [X.V3b, java.lang.Object] */
    public static C16718V3b A00(InputStream inputStream, boolean z) {
        C18636VvY vvY = A02;
        C16718V3b v3b = (C16718V3b) vvY.A00();
        C16718V3b v3b2 = v3b;
        if (v3b == null) {
            byte[] bArr = new byte[Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP];
            ? obj = new Object();
            obj.A01 = null;
            obj.A02 = bArr;
            obj.A00 = 0;
            v3b2 = obj;
        }
        byte[] bArr2 = v3b2.A02;
        byte[] bArr3 = bArr2;
        int i = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr2, i, bArr2.length - i);
                if (read == -1) {
                    break;
                }
                i += read;
                int length = bArr2.length;
                if (i >= length) {
                    byte[] bArr4 = new byte[(length << 1)];
                    System.arraycopy(bArr2, 0, bArr4, 0, length);
                    bArr2 = bArr4;
                }
            } catch (IOException e) {
                if (!z || i == 0) {
                    vvY.A02(v3b2);
                    if (z) {
                        1yR.A0R.A04(e);
                        return null;
                    }
                    throw e;
                }
            }
        }
        if (bArr3 != bArr2) {
            vvY.A02(v3b2);
            ? obj2 = new Object();
            obj2.A01 = null;
            obj2.A02 = bArr2;
            obj2.A00 = i;
            return obj2;
        }
        v3b2.A00 = i;
        return v3b2;
    }

    public static void A01(C16718V3b v3b) {
        if (v3b.A02.length == 131072) {
            v3b.A01 = null;
            A02.A02(v3b);
        }
    }

    public C18973WFa(int i) {
        this.A00 = i;
    }
}
