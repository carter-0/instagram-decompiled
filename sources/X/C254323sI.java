package X;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* renamed from: X.3sI  reason: invalid class name and case insensitive filesystem */
public final class C254323sI {
    public long A00;
    public final String A01;
    public final List A02;
    public final List A03;
    public final List A04;
    public final List A05;
    public final List A06;
    public final List A07;

    public final boolean A00() {
        if (!this.A07.isEmpty() || !this.A02.isEmpty() || !this.A06.isEmpty() || !this.A04.isEmpty() || !this.A03.isEmpty() || !this.A05.isEmpty() || this.A00 != -1) {
            return false;
        }
        return true;
    }

    public final String toString() {
        String format;
        StringBuilder sb = new StringBuilder();
        String str = this.A01;
        String substring = str.substring(0, Math.min(str.length(), 10));
        0qQ.A07(substring);
        sb.append(002.A0R("Entry id: ", substring));
        sb.append(10);
        sb.append("t_0:");
        sb.append(10);
        sb.append(C56191HuK.A01(this.A07));
        sb.append(10);
        sb.append("t_50:");
        sb.append(10);
        sb.append(C56191HuK.A01(this.A02));
        sb.append(10);
        sb.append("t_100:");
        sb.append(10);
        sb.append(C56191HuK.A01(this.A04));
        sb.append(10);
        sb.append("t_50c:");
        sb.append(10);
        sb.append(C56191HuK.A01(this.A03));
        sb.append(10);
        sb.append("t_100c:");
        sb.append(10);
        sb.append(C56191HuK.A01(this.A05));
        sb.append(10);
        long j = this.A00;
        if (j == -1) {
            format = "N/A";
        } else {
            format = new SimpleDateFormat("mm:ss.SSS", Locale.ENGLISH).format(new Date(j));
            0qQ.A07(format);
        }
        sb.append(002.A0R("full impression: ", format));
        sb.append(10);
        String obj = sb.toString();
        0qQ.A07(obj);
        return obj;
    }

    public C254323sI(String str, List list, List list2, List list3, List list4, List list5, List list6, long j) {
        this.A01 = str;
        this.A07 = list;
        this.A02 = list2;
        this.A06 = list3;
        this.A04 = list4;
        this.A03 = list5;
        this.A05 = list6;
        this.A00 = j;
    }
}
