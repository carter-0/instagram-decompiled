package X;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: X.Aqm  reason: case insensitive filesystem */
public final class C41250Aqm implements Runnable {
    public final /* synthetic */ C345667tt A00;
    public final /* synthetic */ A3F A01;
    public final /* synthetic */ C343047pa A02;
    public final /* synthetic */ File A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ byte[] A06;

    public C41250Aqm(C345667tt r1, A3F a3f, C343047pa r3, File file, byte[] bArr, boolean z, boolean z2) {
        this.A00 = r1;
        this.A04 = z;
        this.A06 = bArr;
        this.A03 = file;
        this.A02 = r3;
        this.A05 = z2;
        this.A01 = a3f;
    }

    public final void run() {
        File file;
        Exception e;
        boolean z = this.A04;
        byte[] bArr = this.A06;
        if (z) {
            file = this.A03;
            if (!AHH.A03()) {
                e = null;
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        fileOutputStream.write(bArr, 0, bArr.length);
                    } catch (IOException e2) {
                        e = e2;
                    } catch (Throwable th) {
                        th = th;
                        try {
                            fileOutputStream.close();
                            throw th;
                        } catch (IOException unused) {
                            throw th;
                        }
                    }
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused2) {
                    }
                } catch (IOException e3) {
                    e = e3;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } else {
                throw AnonymousClass7TE.A15("Method processJpegToJpegFile must be invoked on a background thread");
            }
        } else {
            C343047pa r2 = this.A02;
            boolean z2 = this.A05;
            file = this.A03;
            if (!AHH.A03()) {
                Bitmap A012 = AHH.A01((C343047pa) null, r2, bArr, z2);
                if (A012 == null) {
                    e = AnonymousClass7TE.A15("Failed to generate bitmap.");
                } else {
                    e = AHH.A02(A012, file);
                }
            } else {
                throw AnonymousClass7TE.A15("Method processJpegToBitmapFile must be invoked on a background thread");
            }
        }
        ALI.A05(this.A01, file, e);
    }
}
