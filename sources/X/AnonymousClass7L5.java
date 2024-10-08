package X;

import android.os.Bundle;

/* renamed from: X.7L5  reason: invalid class name */
public final class AnonymousClass7L5 {
    public boolean A00;
    public final String A01;
    public final String A02;
    public final C62320sa A03;

    public AnonymousClass7L5(Bundle bundle, String str, String str2, C62320sa r5) {
        0qQ.A0B(str, 2);
        this.A02 = str2;
        this.A03 = r5;
        this.A01 = AnonymousClass7L6.A00(str);
        this.A00 = bundle == null;
    }

    public final String A00() {
        String str;
        2Eq r0;
        if (!this.A00) {
            str = this.A02;
            if (str == null) {
                C62320sa r02 = this.A03;
                if (!(r02 == null || (r0 = (2Eq) r02.invoke()) == null || !r0.COb())) {
                    str = 002.A0R(this.A01, ":subsequent_sends");
                }
            }
            this.A00 = false;
            return str;
        }
        str = this.A01;
        this.A00 = false;
        return str;
    }
}
