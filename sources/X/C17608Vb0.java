package X;

import java.io.File;

/* renamed from: X.Vb0  reason: case insensitive filesystem */
public final class C17608Vb0 {
    public C17845Vgy A00;
    public boolean A01;
    public File[] A02;
    public File[] A03;
    public final String A04;
    public final long[] A05;
    public final /* synthetic */ C19867Wgu A06;

    public C17608Vb0(C19867Wgu wgu, String str) {
        this.A06 = wgu;
        this.A04 = str;
        int i = wgu.A06;
        this.A05 = new long[i];
        this.A02 = new File[i];
        this.A03 = new File[i];
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i2 = 0; i2 < i; i2 = 1) {
            sb.append(i2);
            File[] fileArr = this.A02;
            File file = wgu.A07;
            fileArr[i2] = new File(file, sb.toString());
            sb.append(".tmp");
            this.A03[i2] = new File(file, sb.toString());
            sb.setLength(length);
        }
    }
}
