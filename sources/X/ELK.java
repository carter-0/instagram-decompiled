package X;

public final class ELK extends C48220Eb1 {
    public String A00;
    public String A01;
    public String A02;

    public final int hashCode() {
        int i;
        int i2;
        String str = this.A02;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        String str2 = this.A01;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.A00;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return i5 + i3;
    }
}
