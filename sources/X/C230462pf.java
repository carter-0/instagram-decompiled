package X;

import com.instagram.common.session.UserSession;
import java.util.UUID;

/* renamed from: X.2pf  reason: invalid class name and case insensitive filesystem */
public final class C230462pf {
    public final UserSession A00;
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A01(new C377209Ky(this, 41));
    public final boolean A02;
    public final C230422pb A03;
    public final C230452pe A04;
    public final C230432pc A05;

    public static final void A00(C230462pf r13, C230472pg r14, Object obj, Object obj2, float f, long j, long j2) {
        C230462pf r1 = r13;
        C230422pb r10 = r13.A03;
        Object obj3 = obj2;
        AnonymousClass9JO AUM = r10.AUM(obj, obj3);
        String obj4 = UUID.randomUUID().toString();
        0qQ.A07(obj4);
        C230472pg r5 = r14;
        ((1Kv) r1.A01.getValue()).DUD(new AnonymousClass9IV(new AnonymousClass9J4(AUM, r5, AnonymousClass4EC.COLLECTED_TO_MEMORY, C233162v9.SEEN_STATE, r1.A05, obj4), (C253513qu) r10.AUN(r5, obj, obj3, f, j, j2)));
    }

    public C230462pf(UserSession userSession, C230422pb r5, C230452pe r6, C230432pc r7) {
        this.A00 = userSession;
        this.A04 = r6;
        this.A03 = r5;
        this.A05 = r7;
        boolean A06 = 182.A06(0Tu.A05, userSession, 36317676519953857L);
        this.A02 = A06;
        if (!A06) {
            this.A01.getValue().hashCode();
        }
    }
}
