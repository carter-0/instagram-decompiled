package X;

import org.json.JSONObject;

/* renamed from: X.JrQ  reason: case insensitive filesystem */
public final class C60795JrQ extends C62698Kky {
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final JSONObject A08;
    public final boolean A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60795JrQ) {
                C60795JrQ jrQ = (C60795JrQ) obj;
                if (!0qQ.A0K(this.A07, jrQ.A07) || !0qQ.A0K(this.A06, jrQ.A06) || !0qQ.A0K(this.A08, jrQ.A08) || !0qQ.A0K(this.A03, jrQ.A03) || this.A09 != jrQ.A09 || this.A01 != jrQ.A01 || this.A02 != jrQ.A02 || !0qQ.A0K(this.A04, jrQ.A04) || this.A00 != jrQ.A00 || !0qQ.A0K(this.A05, jrQ.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((AnonymousClass7TF.A09(this.A09, ((((((AnonymousClass7TG.A0E(this.A07) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A08)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + this.A01) * 31) + this.A02) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + this.A00) * 31) + C41845B3m.A00(this.A05);
    }

    public C60795JrQ(String str, String str2, String str3, String str4, String str5, JSONObject jSONObject, int i, int i2, int i3, boolean z) {
        this.A07 = str;
        this.A06 = str2;
        this.A08 = jSONObject;
        this.A03 = str3;
        this.A09 = z;
        this.A01 = i;
        this.A02 = i2;
        this.A04 = str4;
        this.A00 = i3;
        this.A05 = str5;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("UserAvatarData(revisionId=");
        A1A.append(this.A07);
        A1A.append(", renderConfigHash=");
        A1A.append(this.A06);
        A1A.append(", config=");
        A1A.append(this.A08);
        A1A.append(", arEffectId=");
        A1A.append(this.A03);
        A1A.append(", isOdrEnabled=");
        A1A.append(this.A09);
        A1A.append(", lod=");
        A1A.append(this.A01);
        A1A.append(", textureSize=");
        A1A.append(this.A02);
        A1A.append(", assetProfile=");
        A1A.append(this.A04);
        A1A.append(", cacheVersion=");
        A1A.append(this.A00);
        A1A.append(", avatarStyle=");
        return C51975G9x.A0i(this.A05, A1A);
    }
}
