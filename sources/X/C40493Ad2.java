package X;

import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;

/* renamed from: X.Ad2  reason: case insensitive filesystem */
public final /* synthetic */ class C40493Ad2 implements B1V {
    public final /* synthetic */ AnonymousClass7Z6 A00;
    public final /* synthetic */ DirectAnimatedMedia A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ C40493Ad2(AnonymousClass7Z6 r1, DirectAnimatedMedia directAnimatedMedia, String str, boolean z) {
        this.A00 = r1;
        this.A03 = z;
        this.A02 = str;
        this.A01 = directAnimatedMedia;
    }

    public final 1bp AXP(C70621ODs oDs, DirectThreadKey directThreadKey, Boolean bool, Long l) {
        AnonymousClass7Z6 r0 = this.A00;
        boolean z = this.A03;
        String str = this.A02;
        DirectAnimatedMedia directAnimatedMedia = this.A01;
        1bp r3 = new 1bp(C66669Mac.A05(r0.A00, oDs, 1cX.class, str, z), directThreadKey, l, AnonymousClass7TG.A0H());
        r3.A03 = directAnimatedMedia;
        r3.A01 = null;
        return r3;
    }
}
