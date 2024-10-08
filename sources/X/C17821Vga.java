package X;

/* renamed from: X.Vga  reason: case insensitive filesystem */
public final class C17821Vga {
    public final String A00;
    public final String A01;
    public final String A02;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ShowreelNativeActionParameter{mName='");
        sb.append(this.A00);
        sb.append('\'');
        sb.append(", mValue='");
        sb.append(this.A02);
        sb.append('\'');
        sb.append(", mType='");
        sb.append(this.A01);
        sb.append('\'');
        return Pxg.A0x(sb);
    }

    public C17821Vga(String str, String str2, String str3) {
        this.A00 = str;
        this.A02 = str2;
        this.A01 = str3;
    }
}
