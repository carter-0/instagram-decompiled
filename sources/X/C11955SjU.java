package X;

import android.content.res.Resources;
import android.net.Uri;
import java.io.InputStream;

/* renamed from: X.SjU  reason: case insensitive filesystem */
public final class C11955SjU implements C13535Tc7 {
    public final Resources A00;

    public final C13698TfG AEG(SHV shv) {
        return new C11936SjA(this.A00, shv.A00(Uri.class, InputStream.class));
    }

    public C11955SjU(Resources resources) {
        this.A00 = resources;
    }
}
