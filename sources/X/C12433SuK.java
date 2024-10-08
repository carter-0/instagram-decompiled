package X;

import android.content.Context;
import com.instagram.android.R;

/* renamed from: X.SuK  reason: case insensitive filesystem */
public final class C12433SuK implements C13895TjI {
    public final String A00;
    public final int A01;
    public final int A02;
    public final String A03;

    public final int AtB() {
        return this.A01;
    }

    public final int AtF() {
        return this.A02;
    }

    public final String getDescription() {
        return this.A03;
    }

    public final String getText() {
        return this.A00;
    }

    public C12433SuK(Context context) {
        String string;
        String str;
        String string2 = context != null ? context.getString(R.string.f0nameremoved) : null;
        String str2 = "";
        string2 = string2 == null ? str2 : string2;
        String A10 = C66580MXl.A10(string2, (context == null || (str = context.getString(R.string.f0nameremoved)) == null) ? str2 : str);
        0qQ.A07(A10);
        this.A00 = A10;
        this.A01 = string2.length();
        this.A02 = A10.length();
        if (!(context == null || (string = context.getString(R.string.f0nameremoved)) == null)) {
            str2 = string;
        }
        this.A03 = str2;
    }
}
