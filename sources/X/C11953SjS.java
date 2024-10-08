package X;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;

/* renamed from: X.SjS  reason: case insensitive filesystem */
public final class C11953SjS implements C13535Tc7 {
    public final Resources A00;

    public final C13698TfG AEG(SHV shv) {
        return new C11936SjA(this.A00, shv.A00(Uri.class, AssetFileDescriptor.class));
    }

    public C11953SjS(Resources resources) {
        this.A00 = resources;
    }
}
