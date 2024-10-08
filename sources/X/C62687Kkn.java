package X;

/* renamed from: X.Kkn  reason: case insensitive filesystem */
public final class C62687Kkn extends Exception {
    public final String A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        Class<?> cls;
        C62687Kkn kkn;
        String str;
        String str2;
        if (this != obj) {
            Class<?> cls2 = getClass();
            String str3 = null;
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (0qQ.A0K(cls2, cls)) {
                if (obj instanceof C62687Kkn) {
                    kkn = (C62687Kkn) obj;
                } else {
                    kkn = null;
                }
                String str4 = this.A00;
                if (kkn != null) {
                    str = kkn.A00;
                } else {
                    str = null;
                }
                if (0qQ.A0K(str4, str)) {
                    String str5 = this.A02;
                    if (kkn != null) {
                        str2 = kkn.A02;
                    } else {
                        str2 = null;
                    }
                    if (0qQ.A0K(str5, str2)) {
                        String str6 = this.A01;
                        if (kkn != null) {
                            str3 = kkn.A01;
                        }
                        if (!0qQ.A0K(str6, str3)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A0G = ((JTR.A0G(this.A00) * 31) + JTR.A0G(this.A02)) * 31;
        String str = this.A01;
        if (str != null) {
            i = str.hashCode();
        }
        return A0G + i;
    }

    public final String toString() {
        return 002.A14("GenAIImageQueryServerException(errorCode=", this.A00, ", errorTitle=", this.A02, ", errorDescription=", this.A01, ')');
    }

    public C62687Kkn(String str, String str2, String str3) {
        this.A00 = str;
        this.A02 = str2;
        this.A01 = str3;
    }
}
