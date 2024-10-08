package X;

import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.Ad0  reason: case insensitive filesystem */
public final /* synthetic */ class C40491Ad0 implements B1V {
    public final /* synthetic */ AnonymousClass7Z6 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ C40491Ad0(AnonymousClass7Z6 r1, String str, String str2, boolean z) {
        this.A00 = r1;
        this.A03 = z;
        this.A01 = str;
        this.A02 = str2;
    }

    public final 1bp AXP(C70621ODs oDs, DirectThreadKey directThreadKey, Boolean bool, Long l) {
        AnonymousClass7Z6 r1 = this.A00;
        boolean z = this.A03;
        String str = this.A01;
        String str2 = this.A02;
        DirectThreadKey directThreadKey2 = directThreadKey;
        Long l2 = l;
        1bp r12 = new 1bp(C66669Mac.A04(r1.A00, oDs, C66251lD.class, str, (String) null, z), directThreadKey2, l2, AnonymousClass7TG.A0H());
        r12.A00 = str2;
        return r12;
    }
}
