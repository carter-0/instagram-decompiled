package X;

import com.facebook.msys.mci.UrlResponse;
import java.io.File;

/* renamed from: X.5pM  reason: invalid class name and case insensitive filesystem */
public final class C296045pM {
    public final UrlResponse A00;
    public final File A01;
    public final byte[] A02;

    public C296045pM(UrlResponse urlResponse, File file, byte[] bArr) {
        if (bArr == null && file == null) {
            throw new IllegalArgumentException("Must provide either a non-null responseBody or downloadFile");
        }
        this.A01 = file;
        this.A02 = bArr;
        this.A00 = urlResponse;
    }
}
