package X;

import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Pd3  reason: case insensitive filesystem */
public final class C73461Pd3 implements AnonymousClass0eK {
    public final /* synthetic */ C254703su A00;
    public final /* synthetic */ C65701gB A01;
    public final /* synthetic */ C254763t0 A02;
    public final /* synthetic */ 2FW A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ AnonymousClass0eK A05;

    public C73461Pd3(C254703su r1, C65701gB r2, C254763t0 r3, 2FW r4, String str, AnonymousClass0eK r6) {
        this.A05 = r6;
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = str;
        this.A02 = r3;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        Long l;
        Long l2;
        String str;
        Long l3;
        User user = (User) this.A05.get();
        2FW r11 = this.A03;
        C254703su r9 = this.A00;
        Object obj = r9.A1T;
        C65701gB r7 = this.A01;
        Long l4 = r7.A04;
        long j = r7.A00;
        String str2 = this.A04;
        C66665MaY maY = r7.A02;
        boolean z = maY.A07;
        C70621ODs oDs = maY.A00;
        if (oDs == null || (l3 = oDs.A01) == null) {
            l = null;
        } else {
            l = C66582MXn.A0n(l3);
        }
        C70621ODs oDs2 = r7.A02.A00;
        if (oDs2 != null) {
            l2 = oDs2.A02;
        } else {
            l2 = null;
        }
        if (r9.A1R()) {
            str = r9.A1V;
        } else {
            str = null;
        }
        return C254703su.A01((C2606546n) null, (AnonymousClass5FY) null, (C254933tI) null, this.A02, r11, (2FW) null, user, r7.A02.A01, l4, l, l2, (Long) null, obj, (Object) null, str2, str, (List) null, (List) null, j, z, true, false);
    }
}
