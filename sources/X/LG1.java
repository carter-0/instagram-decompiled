package X;

import java.util.Map;

public final class LG1 {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final Map A04;
    public final boolean A05;

    public LG1(String str, String str2, Map map, int i, int i2) {
        0qQ.A0B(map, 2);
        this.A03 = str;
        this.A04 = map;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = str2;
        this.A05 = map.containsKey("root");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LG1) {
                LG1 lg1 = (LG1) obj;
                if (!0qQ.A0K(this.A03, lg1.A03) || !0qQ.A0K(this.A04, lg1.A04) || Float.compare(0.033f, 0.033f) != 0 || this.A00 != lg1.A00 || this.A01 != lg1.A01 || !0qQ.A0K(this.A02, lg1.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A03);
        return C41845B3m.A01(this.A02, (((AnonymousClass7TF.A00(AnonymousClass7TF.A07(this.A04, A0O), 0.033f) + this.A00) * 31) + this.A01) * 31);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ODRCDLInitializationParameters(revisionId=");
        A1A.append(this.A03);
        A1A.append(", avatarConfig=");
        A1A.append(this.A04);
        A1A.append(", fixedElapsedTimeForAnimation=");
        A1A.append(0.033f);
        A1A.append(", lod=");
        A1A.append(this.A00);
        A1A.append(", textureSize=");
        A1A.append(this.A01);
        A1A.append(", assetProfile=");
        return C51975G9x.A0i(this.A02, A1A);
    }
}
