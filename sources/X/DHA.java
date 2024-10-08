package X;

import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

public final /* synthetic */ class DHA implements B1V {
    public final /* synthetic */ AnonymousClass7Z6 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ List A08;
    public final /* synthetic */ boolean A09;

    public /* synthetic */ DHA(AnonymousClass7Z6 r1, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, boolean z) {
        this.A00 = r1;
        this.A09 = z;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A05 = str5;
        this.A08 = list;
        this.A06 = str6;
        this.A07 = str7;
    }

    public final 1bp AXP(C70621ODs oDs, DirectThreadKey directThreadKey, Boolean bool, Long l) {
        AnonymousClass7Z6 r0 = this.A00;
        boolean z = this.A09;
        String str = this.A01;
        String str2 = this.A02;
        String str3 = this.A03;
        String str4 = this.A04;
        String str5 = this.A05;
        List list = this.A08;
        String str6 = this.A06;
        String str7 = this.A07;
        C66665MaY A052 = C66669Mac.A05(r0.A00, oDs, C65461cf.class, str, z);
        long A0H = AnonymousClass7TG.A0H();
        QP8 qp8 = new QP8(list, str5, str4, str2, str3, 9);
        1bp r12 = new 1bp(A052, directThreadKey, l, A0H);
        r12.A02 = str6;
        r12.A03 = str7;
        r12.A00 = qp8;
        return r12;
    }
}
