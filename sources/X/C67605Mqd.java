package X;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: X.Mqd  reason: case insensitive filesystem */
public final class C67605Mqd {
    public final C61080JwI A00;
    public final String A01;
    public final List A02;
    public final Map A03;
    public final byte[] A04;

    public C67605Mqd(C61080JwI jwI, String str, List list, Map map, byte[] bArr) {
        0qQ.A0B(bArr, 2);
        this.A01 = str;
        this.A04 = bArr;
        this.A03 = map;
        this.A02 = list;
        this.A00 = jwI;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ShowreelNativeRenderableDocument{name='");
        A1A.append(this.A01);
        A1A.append("', document=");
        String arrays = Arrays.toString(this.A04);
        0qQ.A07(arrays);
        A1A.append(arrays);
        A1A.append(", bitmaps=");
        A1A.append(this.A03);
        A1A.append(", states=");
        A1A.append(this.A02);
        A1A.append(", metadata=");
        A1A.append(this.A00);
        return C51967G9n.A0r(A1A, '}');
    }
}
