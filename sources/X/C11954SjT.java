package X;

import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;

/* renamed from: X.SjT  reason: case insensitive filesystem */
public final class C11954SjT implements C13535Tc7 {
    public final Resources A00;

    public final C13698TfG AEG(SHV shv) {
        return new C11936SjA(this.A00, shv.A00(Uri.class, ParcelFileDescriptor.class));
    }

    public C11954SjT(Resources resources) {
        this.A00 = resources;
    }
}
