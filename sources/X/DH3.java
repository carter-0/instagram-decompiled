package X;

import com.instagram.api.schemas.SocialContextType;
import com.instagram.model.direct.DirectThreadKey;

public final /* synthetic */ class DH3 implements B1V {
    public final /* synthetic */ SocialContextType A00;
    public final /* synthetic */ AnonymousClass7Z6 A01;
    public final /* synthetic */ 1Xj A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public /* synthetic */ DH3(SocialContextType socialContextType, AnonymousClass7Z6 r2, 1Xj r3, String str, String str2, boolean z) {
        this.A01 = r2;
        this.A05 = z;
        this.A03 = str;
        this.A02 = r3;
        this.A04 = str2;
        this.A00 = socialContextType;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.77X] */
    public final 1bp AXP(C70621ODs oDs, DirectThreadKey directThreadKey, Boolean bool, Long l) {
        String str;
        AnonymousClass7Z6 r0 = this.A01;
        boolean z = this.A05;
        String str2 = this.A03;
        1Xj r3 = this.A02;
        String str3 = this.A04;
        SocialContextType socialContextType = this.A00;
        C66665MaY A042 = C66669Mac.A04(r0.A00, oDs, AnonymousClass1e7.class, str2, (String) null, z);
        long A0H = AnonymousClass7TG.A0H();
        0qQ.A0B(directThreadKey, 2);
        1bp r4 = new 1bp(A042, directThreadKey, l, A0H);
        ? obj = new Object();
        obj.A01 = r3;
        obj.A03 = str3;
        r4.A00 = obj;
        r4.A01 = str3;
        int ordinal = socialContextType.ordinal();
        if (ordinal == 1) {
            str = "BLEND";
        } else if (ordinal != 15) {
            str = null;
        } else {
            str = "SPOTLIGHT";
        }
        r4.A02 = str;
        return r4;
    }
}
