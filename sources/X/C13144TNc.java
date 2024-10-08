package X;

import java.io.ByteArrayOutputStream;
import java.util.concurrent.Callable;

/* renamed from: X.TNc  reason: case insensitive filesystem */
public final class C13144TNc implements Callable {
    public final int A00;
    public final int A01;
    public final C10830Ryq A02;
    public final ByteArrayOutputStream A03;

    public final /* bridge */ /* synthetic */ Object call() {
        C10830Ryq ryq = this.A02;
        ByteArrayOutputStream byteArrayOutputStream = this.A03;
        int i = this.A01;
        int i2 = this.A00;
        String str = ryq.A08;
        if (str != null) {
            return ryq.A04.A03(ryq.A05, byteArrayOutputStream, str, i, i2);
        }
        return C11259SHt.A00(AnonymousClass7TE.A0w("transcodeImageV2: missing inputFilePath"));
    }

    public C13144TNc(C10830Ryq ryq, ByteArrayOutputStream byteArrayOutputStream, int i, int i2) {
        this.A02 = ryq;
        this.A03 = byteArrayOutputStream;
        this.A01 = i;
        this.A00 = i2;
    }
}
