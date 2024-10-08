package X;

import java.util.Locale;

/* renamed from: X.5hs  reason: invalid class name and case insensitive filesystem */
public final class C291785hs {
    public final Locale A00;

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C291785hs)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return 0qQ.A0K(this.A00.toLanguageTag(), ((C291785hs) obj).A00.toLanguageTag());
    }

    public final int hashCode() {
        return this.A00.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.A00.toLanguageTag();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C291785hs(java.lang.String r5) {
        /*
            r4 = this;
            java.util.Locale r3 = java.util.Locale.forLanguageTag(r5)
            java.lang.String r1 = r3.toLanguageTag()
            java.lang.String r0 = "und"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x001d
            java.lang.String r2 = "Locale"
            java.lang.String r1 = "The language tag "
            java.lang.String r0 = " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'."
            java.lang.String r0 = X.002.A0g(r1, r5, r0)
            android.util.Log.e(r2, r0)
        L_0x001d:
            r4.<init>((java.util.Locale) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C291785hs.<init>(java.lang.String):void");
    }

    public C291785hs(Locale locale) {
        this.A00 = locale;
    }
}
