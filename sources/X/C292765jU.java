package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.5jU  reason: invalid class name and case insensitive filesystem */
public final class C292765jU extends 1P0 {
    public final /* synthetic */ C292735jR A00;

    public C292765jU(C292735jR r1) {
        this.A00 = r1;
    }

    public final void onFail(C268654dm r3) {
        int A03 = AnonymousClass0fD.A03(1468206441);
        0qQ.A0B(r3, 0);
        AnonymousClass0fD.A0A(1010188423, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        int A03 = AnonymousClass0fD.A03(756951280);
        C292745jS r12 = (C292745jS) obj;
        int A032 = AnonymousClass0fD.A03(-773717894);
        0qQ.A0B(r12, 0);
        C292735jR r6 = this.A00;
        long currentTimeMillis = System.currentTimeMillis();
        List<String> list = r12.A01;
        if (list != null) {
            for (String A02 : list) {
                1Xj A022 = 1E7.A00(r6.A00.A00).A02(A02);
                if (A022 != null) {
                    A022.A4D(Long.valueOf(currentTimeMillis));
                }
            }
            List<String> list2 = r12.A00;
            if (list2 != null) {
                for (String str2 : list2) {
                    C228572lt r1 = r6.A00;
                    UserSession userSession = r1.A00;
                    1Xj A023 = 1E7.A00(userSession).A02(str2);
                    if (A023 != null) {
                        1Xg r2 = (1Xg) r6.A01.get(str2);
                        if (r2 != null) {
                            String sessionId = r1.A02.getSessionId();
                            0xI A01 = 0xI.A01("ig_feed_media_invalidated", "feed_timeline");
                            0qQ.A0A(A01);
                            A01.A0C("feed_item_type", r2.A06.toString());
                            1Xj A024 = 1Xi.A02(r2.A05);
                            if (A024 != null) {
                                A01.A0C("media_id", A024.getId());
                                A01.A0C("delivery_flags", C243413Yr.A00(A024.A0e));
                                A01.A09("is_ad", Boolean.valueOf(A024.CcK()));
                            }
                            A01.A0C(Dbf.A02(21, 10, 84), sessionId);
                            C60510iO.A00(userSession).EFq(A01);
                        }
                        A023.A4D((Long) null);
                    }
                }
                AnonymousClass0fD.A0A(-683925504, A032);
                AnonymousClass0fD.A0A(-559411492, A03);
                return;
            }
            str = "invalidMediaIds";
        } else {
            str = "validMediaIds";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
