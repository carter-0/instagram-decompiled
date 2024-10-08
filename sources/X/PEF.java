package X;

import com.instagram.model.direct.DirectThreadKey;

public final /* synthetic */ class PEF implements B1V {
    public final /* synthetic */ AnonymousClass7Z6 A00;
    public final /* synthetic */ C247733gp A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public /* synthetic */ PEF(AnonymousClass7Z6 r1, C247733gp r2, String str, String str2, String str3) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = r2;
        this.A03 = str2;
        this.A04 = str3;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.OG7, java.lang.Object] */
    public final 1bp AXP(C70621ODs oDs, DirectThreadKey directThreadKey, Boolean bool, Long l) {
        AnonymousClass7Z6 r0 = this.A00;
        String str = this.A02;
        C247733gp r6 = this.A01;
        String str2 = this.A03;
        String str3 = this.A04;
        C66665MaY A05 = C66669Mac.A05(r0.A00, oDs, C65561e1.class, str, false);
        String str4 = r6.A0G;
        String str5 = r6.A0d;
        str5.getClass();
        long A0H = AnonymousClass7TG.A0H();
        String str6 = r6.A0D;
        str6.getClass();
        AnonymousClass7TG.A1Q(directThreadKey, str4);
        0qQ.A0B(str3, 6);
        1bp r62 = new 1bp(A05, directThreadKey, l, A0H);
        ? obj = new Object();
        obj.A00 = str4;
        obj.A03 = str5;
        obj.A02 = str2;
        obj.A04 = str3;
        obj.A01 = str6;
        r62.A00 = obj;
        return r62;
    }
}
