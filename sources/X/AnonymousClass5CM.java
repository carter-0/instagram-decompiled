package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.5CM  reason: invalid class name */
public final class AnonymousClass5CM implements AnonymousClass5CN {
    public final 1L5 A00;
    public final AnonymousClass5CQ A01;
    public final AnonymousClass5CO A02;
    public final C282125Bt A03;
    public final C230432pc A04;
    public final AnonymousClass0eM A05;

    public /* synthetic */ AnonymousClass5CM(UserSession userSession, 1L5 r5, AnonymousClass5CO r6, C282125Bt r7, C230432pc r8, int i) {
        AnonymousClass5CQ r1 = null;
        r7 = (i & 8) != 0 ? new AnonymousClass5CL(r8) : r7;
        r6 = (i & 16) != 0 ? new AnonymousClass5CO(userSession, r5, "ad_and_netego_realtime_information", "organic_realtime_information") : r6;
        if ((i & 32) != 0) {
            if ((r8 != C230432pc.STORIES || !182.A06(0Tu.A05, userSession, 36313540465854549L)) && (r8 != C230432pc.EXPLORE || !182.A06(0Tu.A05, userSession, 36313540465920086L))) {
                r1 = new AnonymousClass5CP();
            } else {
                r1 = new C57350IYh(userSession);
            }
        }
        0qQ.A0B(r6, 5);
        0qQ.A0B(r1, 6);
        this.A04 = r8;
        this.A00 = r5;
        this.A03 = r7;
        this.A02 = r6;
        this.A01 = r1;
        this.A05 = AnonymousClass0eN.A01(new C377209Ky(userSession, 40));
        if (!182.A06(0Tu.A05, userSession, 36317676519953857L)) {
            this.A05.getValue().hashCode();
        }
    }

    public final HashMap AUO(String str) {
        AnonymousClass0eM r2 = this.A05;
        List ELB = ((1Kv) r2.getValue()).ELB(this.A03);
        ((1Kv) r2.getValue()).EEd(ELB);
        HashMap A022 = this.A02.A02(str, ELB);
        this.A01.DDp(this.A04, A022);
        return A022;
    }
}
