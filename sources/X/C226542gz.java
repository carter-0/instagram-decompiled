package X;

import android.util.Pair;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: X.2gz  reason: invalid class name and case insensitive filesystem */
public final class C226542gz implements AnonymousClass2h0 {
    public final /* bridge */ /* synthetic */ Object AJs(File file) {
        byte[] bArr;
        ByteBuffer wrap;
        C71532dv A00;
        FileInputStream fileInputStream;
        if (file == null) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(file);
            bArr = 15P.A00(fileInputStream);
            try {
                fileInputStream.close();
            } catch (FileNotFoundException | IOException unused) {
            }
        } catch (FileNotFoundException | IOException unused2) {
            bArr = null;
        } catch (Throwable th) {
            C9153RRe.A00(th, th);
        }
        if (bArr == null || (A00 = C226502gv.A00(wrap)) == null) {
            return null;
        }
        return Pair.create((wrap = ByteBuffer.wrap(bArr)), A00);
        throw th;
    }
}
