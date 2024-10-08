package X;

/* renamed from: X.Xwi  reason: case insensitive filesystem */
public abstract class C22176Xwi implements YAf {
    public final int A00;
    public final XnD A01;
    public final XZ0 A02;
    public final YBX A03;
    public final String A04;
    public final int[] A05;
    public final Object[] A06;
    public final String[] A07;
    public final String[] A08;

    public YAf ENL(Boolean bool, int i) {
        if (bool == null) {
            A00(2);
            return this;
        }
        this.A06[2] = bool;
        return this;
    }

    public YAf A00(int i) {
        this.A06[i] = null;
        return this;
    }

    public YAf ENJ(Long l, int i) {
        if (l == null) {
            A00(i);
            return this;
        }
        this.A06[i] = l;
        return this;
    }

    public YAf ENK(String str, int i) {
        if (str == null) {
            A00(i);
            return this;
        }
        this.A06[i] = str;
        return this;
    }

    public C22176Xwi(XZ0 xz0, XZ2 xz2, YBX ybx, Object[] objArr) {
        XnD xnD;
        this.A03 = ybx;
        this.A02 = xz0;
        synchronized (xz2) {
            String str = objArr[0];
            String str2 = objArr[1];
            String[] strArr = objArr[4];
            String[] strArr2 = objArr[2];
            String str3 = objArr[6];
            01r r1 = xz2.A00;
            xnD = (XnD) r1.get(str);
            if (xnD == null) {
                xnD = new XnD(str2, str3, strArr, strArr2);
                r1.put(str, xnD);
            }
        }
        this.A01 = xnD;
        String[] strArr3 = objArr[2];
        this.A07 = strArr3;
        this.A00 = AnonymousClass7TE.A0M(objArr[3]);
        this.A08 = objArr[4];
        this.A05 = objArr[5];
        int A0M = AnonymousClass7TE.A0M(objArr[7]);
        String str4 = objArr[8];
        this.A04 = str4;
        this.A06 = new Object[(str4 == null ? strArr3.length + A0M : AnonymousClass7TE.A0M(objArr[9]))];
    }
}
