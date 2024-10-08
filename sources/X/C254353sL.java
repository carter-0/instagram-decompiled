package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3sL  reason: invalid class name and case insensitive filesystem */
public final class C254353sL implements C254363sM {
    public final C254233s9 A00;
    public final C254343sK A01;
    public final C254253sB A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.A03;
        sb.append(002.A05(str.hashCode(), "itemHash: ", ", sessionId: ", this.A05));
        sb.append(10);
        List<Object> list = this.A06;
        ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
        for (Object obj : list) {
            arrayList.add(obj.toString());
        }
        sb.append(00k.A0P("\n", "", "", arrayList, (0sP) null));
        sb.append(10);
        sb.append(002.A0R("itemId: ", str));
        sb.append(10);
        String obj2 = sb.toString();
        0qQ.A07(obj2);
        return obj2;
    }

    public C254353sL(C254233s9 r1, C254343sK r2, C254253sB r3, String str, String str2, String str3, List list) {
        this.A06 = list;
        this.A05 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
