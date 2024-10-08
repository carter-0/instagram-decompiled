package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.JrO  reason: case insensitive filesystem */
public final class C60793JrO extends C62698Kky {
    public final C60792JrN A00;
    public final String A01;
    public final List A02;
    public final Map A03;
    public final Map A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60793JrO) {
                C60793JrO jrO = (C60793JrO) obj;
                if (!0qQ.A0K(this.A01, jrO.A01) || !0qQ.A0K(this.A02, jrO.A02) || !0qQ.A0K(this.A00, jrO.A00) || !0qQ.A0K(this.A05, jrO.A05) || !0qQ.A0K(this.A03, jrO.A03) || !0qQ.A0K(this.A04, jrO.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((AnonymousClass7TF.A07(this.A00, ((AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A04);
    }

    public C60793JrO(C60792JrN jrN, String str, String str2, List list, Map map, Map map2) {
        this.A01 = str;
        this.A02 = list;
        this.A00 = jrN;
        this.A05 = str2;
        this.A03 = map;
        this.A04 = map2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("TemplateAssetData(renderConfigHash=");
        A1A.append(this.A01);
        A1A.append(", mediaTemplateIds=");
        A1A.append(this.A02);
        A1A.append(", outputSpec=");
        A1A.append(this.A00);
        A1A.append(", franzRenderConfigId=");
        A1A.append(this.A05);
        A1A.append(", templateInfoMapById=");
        A1A.append(this.A03);
        A1A.append(", templateMetaDataInfoMapById=");
        return AnonymousClass7TG.A0n(this.A04, A1A);
    }
}
