package X;

import android.content.Context;
import android.net.Uri;
import java.net.URL;

/* renamed from: X.SrS  reason: case insensitive filesystem */
public final class C12322SrS implements C13725Tfv {
    public C13725Tfv A00;

    public final C7232Q0d AU7(Uri uri) {
        C349257zq.A03("DefaultVideoMetadataExtractor.extract");
        C7232Q0d AU7 = this.A00.AU7(uri);
        C349257zq.A01();
        return AU7;
    }

    public final C7232Q0d AU8(URL url) {
        C349257zq.A03("DefaultVideoMetadataExtractor.extract");
        C7232Q0d AU8 = this.A00.AU8(url);
        C349257zq.A01();
        return AU8;
    }

    public C12322SrS(Context context) {
        this.A00 = new C7259Q1i(context, false);
    }
}
