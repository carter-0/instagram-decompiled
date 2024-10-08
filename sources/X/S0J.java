package X;

import android.content.Context;

public final class S0J {
    public final C635813i A00;

    public S0J(Context context, C9137RQm rQm) {
        0qQ.A0B(context, 1);
        this.A00 = new C635913j(new T06(context, rQm));
    }

    public final int A00() {
        Object obj = this.A00.get();
        if (obj != null) {
            C11194SEu sEu = (C11194SEu) obj;
            1Uk r3 = sEu.A02;
            if (r3.getInt("activated", 0) == 0) {
                return r3.getInt("native_version_override", sEu.A01);
            }
            return r3.getInt("activated", 0);
        }
        throw AnonymousClass7TE.A0y();
    }
}
