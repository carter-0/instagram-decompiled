package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger;
import java.util.concurrent.Callable;

/* renamed from: X.Ask  reason: case insensitive filesystem */
public final class C41363Ask implements Callable {
    public final /* synthetic */ AnonymousClass797 A00;
    public final /* synthetic */ C254933tI A01;
    public final /* synthetic */ C66665MaY A02;
    public final /* synthetic */ AnonymousClass7UH A03;
    public final /* synthetic */ C333537Zi A04;
    public final /* synthetic */ DirectThreadKey A05;
    public final /* synthetic */ C254743sy A06;
    public final /* synthetic */ C63822L8d A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;

    public C41363Ask(AnonymousClass797 r1, C254933tI r2, C66665MaY maY, AnonymousClass7UH r4, C333537Zi r5, DirectThreadKey directThreadKey, C254743sy r7, C63822L8d l8d, String str, String str2, boolean z, boolean z2) {
        this.A02 = maY;
        this.A05 = directThreadKey;
        this.A04 = r5;
        this.A00 = r1;
        this.A07 = l8d;
        this.A09 = str;
        this.A06 = r7;
        this.A0B = z;
        this.A01 = r2;
        this.A08 = str2;
        this.A03 = r4;
        this.A0A = z2;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C66665MaY maY = this.A02;
        DirectThreadKey directThreadKey = this.A05;
        C333537Zi r9 = this.A04;
        Context context = r9.A02;
        UserSession userSession = r9.A03;
        AnonymousClass797 r3 = this.A00;
        C63822L8d l8d = this.A07;
        String str = this.A09;
        C2609947v A002 = LTU.A00(context, userSession, r3, directThreadKey, l8d, Integer.valueOf(maY.A03.hashCode()), str);
        C254743sy r1 = this.A06;
        boolean z = this.A0B;
        Long A012 = OQO.A01(userSession, r1);
        long A0H = AnonymousClass7TG.A0H();
        C254933tI r6 = this.A01;
        1bp r12 = new 1bp(maY, directThreadKey, A012, A0H);
        r12.A01 = A002;
        r12.A00 = r6;
        String str2 = this.A08;
        if (str2 != null) {
            this.A03.A05(str2, true);
            IGFOAMessagingLocalSendSpeedLogger A003 = C328727Fx.A00(userSession, Integer.valueOf(str2.hashCode()));
            if (A003 != null) {
                A003.onLogDispatchSendMutationStart();
            }
        }
        C333537Zi.A09(r9, (Integer) null, str, r12.A06(), directThreadKey.A00, 5, 1, 0, 0, AnonymousClass7TE.A0t(l8d.A01).length(), z, this.A0A);
        1Ou.A01(userSession).A0A(r12);
        C3265677h.A0g(userSession, directThreadKey, 2FW.A1k, r12.A06(), r12.A02.A09);
        return C60340gF.A00;
    }
}
