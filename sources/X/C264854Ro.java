package X;

import com.facebook.common.dextricks.Constants;
import java.util.Arrays;

/* renamed from: X.4Ro  reason: invalid class name and case insensitive filesystem */
public final class C264854Ro {
    public int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final C256683wB[] A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C264854Ro r5 = (C264854Ro) obj;
            if (!this.A03.equals(r5.A03) || !Arrays.equals(this.A04, r5.A04)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int hashCode = ((527 + this.A03.hashCode()) * 31) + Arrays.hashCode(this.A04);
        this.A00 = hashCode;
        return hashCode;
    }

    public C264854Ro(String str, C256683wB... r11) {
        String str2;
        int length = r11.length;
        C256703wD.A03(length > 0);
        this.A03 = str;
        this.A04 = r11;
        this.A01 = length;
        int A002 = 2Kn.A00(r11[0].A0W);
        this.A02 = A002 == -1 ? 2Kn.A00(r11[0].A0S) : A002;
        C256683wB[] r8 = this.A04;
        C256683wB r1 = r8[0];
        String str3 = r1.A0V;
        String str4 = str3;
        str4 = (str3 == null || str3.equals("und")) ? "" : str4;
        int i = r1.A0E;
        int i2 = i | Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
        int i3 = 1;
        while (i3 < r8.length) {
            String str5 = r8[i3].A0V;
            String str6 = str5;
            if (!str4.equals((str5 == null || str5.equals("und")) ? "" : str6)) {
                str2 = "languages";
            } else {
                int i4 = r8[i3].A0E;
                if (i2 != (i4 | Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET)) {
                    str3 = Integer.toBinaryString(i);
                    str5 = Integer.toBinaryString(i4);
                    str2 = "role flags";
                } else {
                    i3++;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Different ");
            sb.append(str2);
            sb.append(" combined in one TrackGroup: '");
            sb.append(str3);
            sb.append("' (track 0) and '");
            sb.append(str5);
            sb.append("' (track ");
            sb.append(i3);
            sb.append(")");
            2AG.A05("TrackGroup", "", new IllegalStateException(sb.toString()));
            return;
        }
    }
}
