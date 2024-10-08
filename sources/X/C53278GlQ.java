package X;

import com.instagram.api.schemas.AFI_TYPE;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.GlQ  reason: case insensitive filesystem */
public final class C53278GlQ extends AnonymousClass0T0 {
    public final AFI_TYPE A00;
    public final C275524qU A01;
    public final String A02;
    public final HashMap A03;
    public final List A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53278GlQ) {
                C53278GlQ glQ = (C53278GlQ) obj;
                if (!0qQ.A0K(this.A02, glQ.A02) || this.A00 != glQ.A00 || !0qQ.A0K(this.A03, glQ.A03) || !0qQ.A0K(this.A04, glQ.A04) || !0qQ.A0K(this.A01, glQ.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0O(this.A02)))));
    }

    public C53278GlQ(AFI_TYPE afi_type, C275524qU r3, String str, HashMap hashMap, List list) {
        C51974G9v.A1P(str, afi_type, hashMap, list);
        0qQ.A0B(r3, 5);
        this.A02 = str;
        this.A00 = afi_type;
        this.A03 = hashMap;
        this.A04 = list;
        this.A01 = r3;
    }
}
