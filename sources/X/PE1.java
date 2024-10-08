package X;

import android.text.TextUtils;
import com.instagram.model.direct.DirectShareTargetLoggingInfo;
import java.util.List;

public final class PE1 implements C74414PuU {
    public String A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final AnonymousClass9VB A05;
    public final DirectShareTargetLoggingInfo A06;
    public final C254783t2 A07;
    public final Integer A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final List A0E;
    public final boolean A0F;
    public final boolean A0G;

    public final String BK4(String str) {
        return 002.A06(this.A03, this.A00, this.A09, str);
    }

    public final /* bridge */ /* synthetic */ Object FKf(String str) {
        String str2 = str;
        if (TextUtils.equals(this.A00, str2)) {
            return this;
        }
        String str3 = this.A09;
        C254783t2 r13 = this.A07;
        List list = this.A0E;
        boolean z = this.A0F;
        boolean z2 = this.A0G;
        int i = this.A01;
        int i2 = this.A02;
        int i3 = this.A04;
        int i4 = this.A03;
        Integer num = this.A08;
        String str4 = this.A0C;
        String str5 = this.A0B;
        DirectShareTargetLoggingInfo directShareTargetLoggingInfo = this.A06;
        AnonymousClass9VB r1 = this.A05;
        boolean z3 = z;
        int i5 = i4;
        int i6 = i3;
        int i7 = i2;
        int i8 = i;
        List list2 = list;
        return new PE1(r1, directShareTargetLoggingInfo, r13, num, str3, str2, str4, str5, this.A0D, list2, i8, i7, i6, i5, z3, z2);
    }

    public PE1(AnonymousClass9VB r2, DirectShareTargetLoggingInfo directShareTargetLoggingInfo, C254783t2 r4, Integer num, String str, String str2, String str3, String str4, String str5, List list, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        this.A09 = str;
        this.A07 = r4;
        this.A0F = z;
        this.A0G = z2;
        this.A01 = i;
        this.A02 = i2;
        this.A04 = i3;
        this.A03 = i4;
        this.A08 = num;
        this.A00 = str2;
        this.A0C = str3;
        this.A0B = str4;
        this.A0E = list;
        this.A0A = BK4(str3);
        this.A06 = directShareTargetLoggingInfo;
        this.A05 = r2;
        this.A0D = str5;
    }
}
