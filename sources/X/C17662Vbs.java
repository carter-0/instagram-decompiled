package X;

import com.instagram.model.reels.Reel;

/* renamed from: X.Vbs  reason: case insensitive filesystem */
public final class C17662Vbs {
    public static int A08;
    public static int A09;
    public final int A00;
    public final long A01;
    public final 1Xj A02;
    public final Reel A03;
    public final C255773uh A04;
    public final Integer A05;
    public final String A06;
    public final String A07;

    public C17662Vbs(Reel reel, C255773uh r5, Integer num, int i, long j) {
        1Xj r2;
        StringBuilder sb;
        int i2;
        String str;
        int i3;
        this.A04 = r5;
        String str2 = null;
        if (r5 != null) {
            r2 = r5.A0b;
        } else {
            r2 = null;
        }
        this.A02 = r2;
        this.A03 = reel;
        this.A00 = i;
        this.A07 = reel != null ? reel.getId() : str2;
        this.A05 = num;
        this.A01 = j;
        int intValue = num.intValue();
        if (intValue == 0) {
            sb = new StringBuilder();
            sb.append("empty-space-");
            i2 = A09;
            A09 = i2 + 1;
        } else if (intValue != 3) {
            if (intValue != 2) {
                i3 = 3550;
            } else {
                sb = new StringBuilder();
                i3 = 4118;
            }
            sb.append(AnonymousClass000.A00(i3));
            i2 = A08;
            A08 = i2 + 1;
        } else {
            r2.getClass();
            str = r2.getId();
            this.A06 = str;
        }
        str = Pxe.A0z(sb, i2);
        this.A06 = str;
    }
}
