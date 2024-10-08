package X;

import android.content.Intent;

/* renamed from: X.Dwl  reason: case insensitive filesystem */
public final class C47374Dwl extends C48159Ea1 {
    public final int A00;
    public final int A01;
    public final Intent A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47374Dwl) {
                C47374Dwl dwl = (C47374Dwl) obj;
                if (!(this.A00 == dwl.A00 && this.A01 == dwl.A01 && 0qQ.A0K(this.A02, dwl.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A00 * 31) + this.A01) * 31) + AnonymousClass7TG.A0C(this.A02);
    }

    public C47374Dwl(int i, int i2, Intent intent) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = intent;
    }
}
