package X;

import android.content.Context;

/* renamed from: X.Npn  reason: case insensitive filesystem */
public abstract class C69665Npn {
    public final String A00(Context context) {
        if (this instanceof C68808NXs) {
            C68808NXs nXs = (C68808NXs) this;
            String A16 = AnonymousClass7TE.A16(context, nXs.A00);
            String str = nXs.A01;
            if (str != null) {
                return C66580MXl.A10(A16, str);
            }
            return A16;
        }
        C68807NXr nXr = (C68807NXr) this;
        String str2 = nXr.A00;
        if (str2 != null) {
            return C66580MXl.A10(nXr.A01, str2);
        }
        return nXr.A01;
    }
}
