package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: X.S3z  reason: case insensitive filesystem */
public abstract class C10987S3z {
    public final AnonymousClass0eK A00;

    public abstract Fragment A01(Bundle bundle, String str);

    public Fragment A00(Bundle bundle, String str) {
        AnonymousClass0eK r0 = this.A00;
        r0.getClass();
        Fragment fragment = (Fragment) r0.get();
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putBundle("CHILD_FRAGMENT_BUNDLE", bundle);
        A0a.putString("CHILD_FRAGMENT_IDENTIFIER", str);
        fragment.setArguments(A0a);
        return fragment;
    }

    public C10987S3z(AnonymousClass0eK r1) {
        this.A00 = r1;
    }
}
