package X;

import android.content.Context;
import android.net.Uri;
import java.io.File;

/* renamed from: X.SjZ  reason: case insensitive filesystem */
public abstract class C11958SjZ implements C13535Tc7 {
    public final Context A00;
    public final Class A01;

    public final C13698TfG AEG(SHV shv) {
        Context context = this.A00;
        Class cls = this.A01;
        return new C11937SjB(context, shv.A00(File.class, cls), shv.A00(Uri.class, cls), cls);
    }

    public C11958SjZ(Context context, Class cls) {
        this.A00 = context;
        this.A01 = cls;
    }
}
