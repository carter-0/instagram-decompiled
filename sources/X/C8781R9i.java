package X;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* renamed from: X.R9i  reason: case insensitive filesystem */
public final class C8781R9i extends 2Cl {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C18594Vul A02;
    public final /* synthetic */ ByteBuffer A03;

    public final int getRunnableId() {
        return 333;
    }

    public final void onFail(Exception exc) {
        0qQ.A0B(exc, 0);
        this.A02.A03(exc);
    }

    public C8781R9i(C18594Vul vul, ByteBuffer byteBuffer, int i, int i2) {
        this.A03 = byteBuffer;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = vul;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        try {
            ByteBuffer byteBuffer = this.A03;
            int i = this.A01;
            int i2 = this.A00;
            C7245Q0r.A02(byteBuffer, i, i2);
            Bitmap A0B = AnonymousClass7TF.A0B(i, i2);
            A0B.copyPixelsFromBuffer(byteBuffer);
            this.A02.A04(A0B);
            return null;
        } catch (RuntimeException e) {
            throw new Exception(e);
        } catch (OutOfMemoryError e2) {
            throw new Exception(e2);
        }
    }
}
