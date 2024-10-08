package X;

import android.os.Bundle;
import android.os.Parcelable;

/* renamed from: X.Nsa  reason: case insensitive filesystem */
public abstract class C69813Nsa {
    public static final NJ2 A00(Parcelable parcelable, Parcelable parcelable2, C74547Pwg pwg, String str) {
        AnonymousClass7TF.A1C(str, 0, pwg);
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("IgSessionManager.SESSION_TOKEN_KEY", str);
        A0a.putParcelable("GDPRPrivacyCheckFragment.ARGUMENT_BUGREPORT", parcelable);
        A0a.putParcelable("GDPRPrivacyCheckFragment.ARGUMENT_COMPOSER_VIEWMODEL", parcelable2);
        A0a.putAll(pwg.E2f());
        NJ2 nj2 = new NJ2();
        nj2.setArguments(A0a);
        return nj2;
    }
}
