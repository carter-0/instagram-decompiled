package X;

import com.facebook.pando.TreeJNI;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public final class T6F implements 1Fk {
    public final int A00;
    public final 1FX A01;
    public final C278804xY A02;
    public final 0sP A03;

    public /* synthetic */ T6F(C278804xY r3, 0sP r4, int i) {
        1NX r0 = new 1NX((File) null);
        AnonymousClass7TG.A1O(r4, r3);
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = i;
        this.A01 = r0;
    }

    public final /* bridge */ /* synthetic */ 1XR AWn(2ZL r5, InputStream inputStream) {
        1Fn A012;
        0qQ.A0B(inputStream, 1);
        C13758TgU createApiFrameworkParser = this.A02.createApiFrameworkParser(false);
        try {
            int i = this.A00;
            if (i <= 0) {
                while (true) {
                    byte[] bArr = new byte[Math.min(inputStream.available(), 4096)];
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    createApiFrameworkParser.parseByteArray(bArr, read);
                }
            } else {
                byte[] bArr2 = new byte[i];
                int read2 = inputStream.read(bArr2);
                while (read2 != -1) {
                    createApiFrameworkParser.parseByteArray(bArr2, read2);
                    read2 = inputStream.read(bArr2);
                }
            }
            0sP r1 = this.A03;
            TreeJNI complete = createApiFrameworkParser.complete(XEE.class);
            0qQ.A07(complete);
            1XU r3 = (XEF) r1.invoke(complete);
            if ((r3 instanceof 1XU) && (A012 = r5.A01(AnonymousClass000.A00(2542))) != null) {
                String str = A012.A01;
                0qQ.A06(str);
                r3.EQG(Long.parseLong(str));
            }
            return r3;
        } catch (RuntimeException e) {
            throw new IOException(e);
        }
    }

    public final void onStart() {
    }

    public final void onFinish() {
        this.A01.onFinish();
    }
}
