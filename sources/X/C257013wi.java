package X;

import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3wi  reason: invalid class name and case insensitive filesystem */
public final class C257013wi {
    public float A00;
    public C256683wB A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public Map A06;
    public Map A07;
    public final int A08;
    public final long A09;
    public final long A0A;
    public final long A0B;
    public final long A0C;
    public final C256683wB A0D;
    public final C256683wB A0E;
    public final C256683wB A0F;
    public final String A0G;
    public final StringBuilder A0H = new StringBuilder();
    public final ArrayList A0I = new ArrayList();
    public final boolean A0J;
    public final C256683wB[] A0K;
    public final List A0L;

    public static void A00(C257023wj r4, String str, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(":[");
        sb2.append(r4.A01);
        sb2.append("-");
        sb2.append(r4.A02);
        sb2.append("-");
        sb2.append(r4.A04);
        sb2.append("-");
        sb2.append(r4.A03);
        sb2.append("];");
        sb.append(sb2.toString());
    }

    public final String A01() {
        StringBuilder sb = new StringBuilder();
        for (C256943wb r1 : this.A0L) {
            if (sb.length() > 0) {
                sb.append(";");
            }
            sb.append(r1.A00);
        }
        return sb.toString();
    }

    public final String A02() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.A0I.iterator();
        while (it.hasNext()) {
            String str = ((C256963wd) it.next()).A00;
            if (sb.length() > 0) {
                sb.append(";");
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public final void A03(AnonymousClass4U3 r4, String str) {
        String str2 = r4.A00;
        StringBuilder sb = this.A0H;
        String A0g = 002.A0g(str2, " ", str);
        if (sb.length() > 0) {
            sb.append(";");
        }
        sb.append(A0g);
    }

    public final void A04(String str, int i, long j, long j2, long j3, long j4) {
        if (str == null || str.isEmpty()) {
            str = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
        }
        this.A07.put(str, new C257023wj(i, j, j2, j3, j4));
    }

    public C257013wi(C256683wB r11, C256683wB r12, C256683wB r13, String str, String str2, String str3, String str4, String str5, List list, C256683wB[] r20, float f, int i, long j, long j2, long j3, long j4, boolean z) {
        this.A0A = j / 1000;
        this.A09 = j2 / 1000;
        this.A0B = j4 / 1000;
        this.A0C = j3 / 1000;
        this.A0D = r11;
        this.A0K = r20;
        this.A0E = r12;
        this.A0F = r13;
        this.A0L = list;
        this.A08 = i;
        this.A0G = str;
        this.A0J = z;
        this.A04 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A05 = str5;
        this.A07 = new HashMap();
        this.A06 = new HashMap();
        this.A00 = f;
    }
}
