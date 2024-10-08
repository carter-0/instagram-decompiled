package X;

import android.content.Context;

/* renamed from: X.StR  reason: case insensitive filesystem */
public final class C12401StR implements C13883Tj6 {
    public final String A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C12401StR) && 0qQ.A0K(this.A00, ((C12401StR) obj).A00));
    }

    public final String toString() {
        return 002.A0S("StaticTextStringResource(text=", this.A00, ')');
    }

    public static C12401StR A01(String str) {
        return new C12401StR(str);
    }

    public final CharSequence C1h(Context context) {
        return this.A00;
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0E(this.A00);
    }

    public C12401StR(String str) {
        this.A00 = str;
    }

    public static C12401StR A00(C250663lr r0, String str, int i) {
        return new C12401StR(r0.getOptionalStringField(i, str));
    }
}
