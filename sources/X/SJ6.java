package X;

public final class SJ6 {
    public static final Class[] A02 = new Class[0];
    public final String A00;
    public final Class[] A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj != null && obj.getClass() == getClass()) {
                SJ6 sj6 = (SJ6) obj;
                if (this.A00.equals(sj6.A00)) {
                    Class[] clsArr = sj6.A01;
                    Class[] clsArr2 = this.A01;
                    int length = clsArr2.length;
                    if (clsArr.length == length) {
                        int i = 0;
                        while (i < length) {
                            if (clsArr[i] == clsArr2[i]) {
                                i++;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode() + this.A01.length;
    }

    public final String toString() {
        return 002.A06(this.A01.length, this.A00, "(", "-args)");
    }

    public SJ6(String str, Class[] clsArr) {
        this.A00 = str;
        this.A01 = clsArr == null ? A02 : clsArr;
    }
}
