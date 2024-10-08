package X;

import com.instagram.common.notifications.push.intf.PushChannelType;
import java.util.List;

/* renamed from: X.6BJ  reason: invalid class name */
public final class AnonymousClass6BJ {
    public static final AnonymousClass6BK A0R = new Object();
    public static final AnonymousClass5ER A0S = new AnonymousClass5ER(0, 0);
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final C69450Nlu A05;
    public final PushChannelType A06;
    public final Integer A07;
    public final Long A08;
    public final Long A09;
    public final Long A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final List A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;

    public AnonymousClass6BJ(PushChannelType pushChannelType, Integer num, Long l, Long l2, Long l3, Long l4, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, long j, boolean z, boolean z2, boolean z3) {
        String str12 = str2;
        String str13 = str3;
        String str14 = str10;
        String str15 = str11;
        String str16 = str6;
        String str17 = "empty-or-null-ig4a";
        this.A0F = str5 == null ? str17 : str5;
        this.A0G = str6 == null ? str17 : str16;
        this.A0C = str2 == null ? str17 : str12;
        this.A0M = str11 == null ? str17 : str15;
        this.A0E = str4 != null ? str4 : str17;
        this.A06 = pushChannelType == null ? PushChannelType.A0D : pushChannelType;
        this.A03 = l3 != null ? l3.longValue() : 0;
        this.A0O = z;
        String str18 = "";
        this.A0D = str3 == null ? str18 : str13;
        this.A0K = str18;
        this.A05 = null;
        this.A08 = null;
        this.A0A = l4;
        this.A07 = num;
        this.A04 = j;
        this.A0Q = z3;
        this.A02 = l2 != null ? l2.longValue() : 0;
        this.A0B = str;
        this.A0H = str7;
        this.A0N = list;
        this.A0L = str10 == null ? str18 : str14;
        this.A0J = str9 != null ? str9 : str18;
        this.A00 = 0;
        this.A01 = 0;
        this.A0P = z2;
        this.A09 = l;
        this.A0I = str8;
    }

    public AnonymousClass6BJ(C66628MZp mZp) {
        long j;
        long j2;
        long j3;
        String str = mZp.A0F;
        String str2 = "empty-or-null-ig4a";
        this.A0F = str == null ? str2 : str;
        String str3 = mZp.A0G;
        this.A0G = str3 == null ? str2 : str3;
        String str4 = mZp.A0C;
        this.A0C = str4 == null ? str2 : str4;
        String str5 = mZp.A0M;
        this.A0M = str5 == null ? str2 : str5;
        String str6 = mZp.A0E;
        this.A0E = str6 != null ? str6 : str2;
        PushChannelType pushChannelType = mZp.A02;
        this.A06 = pushChannelType == null ? PushChannelType.A0D : pushChannelType;
        Long l = mZp.A09;
        long j4 = 0;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        this.A03 = j;
        this.A0O = mZp.A0O;
        String str7 = mZp.A0D;
        String str8 = "";
        this.A0D = str7 == null ? str8 : str7;
        String str9 = mZp.A0K;
        this.A0K = str9 == null ? str8 : str9;
        this.A05 = mZp.A01;
        this.A08 = mZp.A05;
        this.A0A = mZp.A0A;
        this.A07 = mZp.A03;
        this.A04 = mZp.A00;
        this.A0Q = mZp.A0Q;
        Long l2 = mZp.A08;
        if (l2 != null) {
            j2 = l2.longValue();
        } else {
            j2 = 0;
        }
        this.A02 = j2;
        this.A0B = mZp.A0B;
        this.A0H = mZp.A0H;
        this.A0N = mZp.A0N;
        String str10 = mZp.A0L;
        this.A0L = str10 == null ? str8 : str10;
        String str11 = mZp.A0J;
        this.A0J = str11 != null ? str11 : str8;
        Long l3 = mZp.A04;
        if (l3 != null) {
            j3 = l3.longValue();
        } else {
            j3 = 0;
        }
        this.A00 = j3;
        Long l4 = mZp.A07;
        this.A01 = l4 != null ? l4.longValue() : j4;
        this.A0P = mZp.A0P;
        this.A09 = mZp.A06;
        this.A0I = mZp.A0I;
    }
}
