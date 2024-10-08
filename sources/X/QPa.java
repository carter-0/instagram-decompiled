package X;

import android.content.Intent;

public final class QPa extends AnonymousClass0T0 implements C13422Ta8 {
    public final Intent A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof QPa) {
                QPa qPa = (QPa) obj;
                if (!0qQ.A0K(this.A00, qPa.A00) || this.A01 != qPa.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public QPa(Intent intent, boolean z) {
        this.A00 = intent;
        this.A01 = z;
    }
}
