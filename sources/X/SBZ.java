package X;

public abstract class SBZ {
    public static final String[] A00 = {"cache", "files", "databases"};

    public static final String A00(String str) {
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            boolean A1a = Dbb.A1a(str, i2);
            if (z) {
                if (!A1a) {
                    break;
                }
                length--;
            } else if (!A1a) {
                z = true;
            } else {
                i++;
            }
        }
        String A0d = Pxf.A0d(new 11S("^/+").A00(Dba.A0c(str, length, i), ""), "/+$", "");
        int length2 = A0d.length() - 1;
        int i3 = 0;
        boolean z2 = false;
        while (i3 <= length2) {
            int i4 = length2;
            if (!z2) {
                i4 = i3;
            }
            boolean A1a2 = Dbb.A1a(A0d, i4);
            if (z2) {
                if (!A1a2) {
                    break;
                }
                length2--;
            } else if (!A1a2) {
                z2 = true;
            } else {
                i3++;
            }
        }
        return Dba.A0c(A0d, length2, i3);
    }
}
