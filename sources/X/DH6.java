package X;

import com.instagram.model.direct.DirectThreadKey;
import java.util.Collections;

public final /* synthetic */ class DH6 implements B1V {
    public final /* synthetic */ AnonymousClass7Z6 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public /* synthetic */ DH6(AnonymousClass7Z6 r1, String str, String str2, String str3, String str4, boolean z) {
        this.A00 = r1;
        this.A05 = z;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
    }

    public final 1bp AXP(C70621ODs oDs, DirectThreadKey directThreadKey, Boolean bool, Long l) {
        AnonymousClass7Z6 r0 = this.A00;
        boolean z = this.A05;
        String str = this.A01;
        String str2 = this.A02;
        String str3 = this.A03;
        String str4 = this.A04;
        1bp r5 = new 1bp(C66669Mac.A05(r0.A00, oDs, C65651fJ.class, str, z), directThreadKey, l, AnonymousClass7TG.A0H());
        r5.A00 = str2;
        r5.A01 = Collections.singletonList(C71152OeO.A0J(str3, str4, (String) null));
        return r5;
    }
}
