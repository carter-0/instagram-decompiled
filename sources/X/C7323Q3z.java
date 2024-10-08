package X;

import java.util.Map;

/* renamed from: X.Q3z  reason: case insensitive filesystem */
public final class C7323Q3z {
    public final C7318Q3u A00;
    public final T9F A01;
    public final String A02;
    public final String A03;
    public final Map A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7323Q3z) {
                C7323Q3z q3z = (C7323Q3z) obj;
                if (!0qQ.A0K(this.A00, q3z.A00) || !0qQ.A0K(this.A02, q3z.A02) || !0qQ.A0K(this.A04, q3z.A04) || !0qQ.A0K(this.A03, q3z.A03) || !0qQ.A0K(this.A01, q3z.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A08(this.A02, AnonymousClass7TE.A0K(this.A00)))) + AnonymousClass7TG.A0C(this.A01);
    }

    public C7323Q3z(C7318Q3u q3u, T9F t9f, String str, String str2, Map map) {
        this.A00 = q3u;
        this.A02 = str;
        this.A04 = map;
        this.A03 = str2;
        this.A01 = t9f;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("BloksBatchedComponentQueryParseResult(componentParseResult=");
        A1A.append(this.A00);
        A1A.append(", appId=");
        A1A.append(this.A02);
        A1A.append(", consumedParams=");
        A1A.append(this.A04);
        A1A.append(", rawComponentPayload=");
        A1A.append(this.A03);
        A1A.append(", resources=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
