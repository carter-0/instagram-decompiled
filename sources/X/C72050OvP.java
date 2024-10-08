package X;

import android.util.Pair;
import com.instagram.common.session.UserSession;

/* renamed from: X.OvP  reason: case insensitive filesystem */
public final /* synthetic */ class C72050OvP implements AnonymousClass68Z {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C304566Ea A01;
    public final /* synthetic */ C352218Cl A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ Long A04;
    public final /* synthetic */ Long A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    public /* synthetic */ C72050OvP(C304566Ea r1, C352218Cl r2, Integer num, Long l, Long l2, String str, long j, boolean z) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = j;
        this.A03 = num;
        this.A04 = l;
        this.A07 = z;
        this.A06 = str;
        this.A05 = l2;
    }

    public final Object apply(Object obj) {
        C304566Ea r0 = this.A01;
        C352218Cl r11 = this.A02;
        long j = this.A00;
        Integer num = this.A03;
        Long l = this.A04;
        boolean z = this.A07;
        String str = this.A06;
        Long l2 = this.A05;
        Pair pair = (Pair) obj;
        C68314NAb nAb = (C68314NAb) pair.first;
        String A022 = C304566Ea.A02(nAb, r11.A06());
        17k.A07(A022, "Failed to resolve Image ID");
        String A023 = C304566Ea.A02(nAb, r11.A06());
        17k.A07(A023, "Failed to resolve preview ID");
        int i = r11.A06;
        int i2 = r11.A09;
        Integer valueOf = Integer.valueOf(i);
        Integer valueOf2 = Integer.valueOf(i2);
        String A062 = r11.A06();
        long length = r11.A03().length();
        UserSession userSession = r0.A03;
        String A0k = DbS.A0k();
        return 1aU.A07(new OxY((AnonymousClass67N) pair.second, userSession, valueOf, valueOf2, valueOf, valueOf2, num, l2, l, "image/jpeg", A062, A023, A022, str, A0k, 2, 0, j, length, z), AnonymousClass6F9.A00("rxmailbox_send_secure_image_message"));
    }
}
