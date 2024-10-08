package X;

import android.content.ContentResolver;
import android.net.Uri;

/* renamed from: X.Sjf  reason: case insensitive filesystem */
public final class C11964Sjf implements C13535Tc7, C13536Tc8 {
    public final ContentResolver A00;

    public final C13812Thf AEE(Uri uri) {
        return new C11885SiI(this.A00, uri);
    }

    public final C13698TfG AEG(SHV shv) {
        return new C11940SjE(this);
    }

    public C11964Sjf(ContentResolver contentResolver) {
        this.A00 = contentResolver;
    }
}
