package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Mg1  reason: case insensitive filesystem */
public final class C66968Mg1 implements C250603lj {
    public boolean A00;
    public boolean A01;
    public final UserSession A02;
    public final float A03;
    public final long A04;
    public final AnonymousClass4AY A05;

    public C66968Mg1(UserSession userSession, AnonymousClass4AY r8) {
        0qQ.A0B(r8, 2);
        this.A02 = userSession;
        this.A05 = r8;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        0Tu r4 = 0Tu.A05;
        this.A04 = timeUnit.toMillis((long) 182.A00(r4, userSession, 37166980532404669L));
        this.A03 = (float) 182.A00(r4, userSession, 37166980532339132L);
    }

    public final void ATF(AnonymousClass30Y r9, C252093oY r10) {
        0qQ.A0B(r9, 0);
        0qQ.A0B(r10, 1);
        int intValue = r10.CEk(r9).intValue();
        if (intValue == 0) {
            AnonymousClass4AY r1 = this.A05;
            Object obj = r9.A03;
            0qQ.A06(obj);
            r1.FJa((AnonymousClass4AB) obj, true);
        } else if (intValue != 1) {
            AnonymousClass4AY r7 = this.A05;
            Object obj2 = r9.A03;
            0qQ.A06(obj2);
            AnonymousClass4AB r6 = (AnonymousClass4AB) obj2;
            r7.FJa(r6, false);
            if (this.A00) {
                r7.Dyw(r6);
            }
            if (this.A01) {
                long B0M = r10.B0M(r9);
                if (182.A06(0Tu.A05, this.A02, 36327739627813531L)) {
                    r7.Cj8(r6, B0M);
                } else {
                    r7.FHX(r6, B0M);
                }
            }
        } else {
            long B0M2 = r10.B0M(r9);
            float CFe = r10.CFe(r9);
            if (B0M2 >= 250) {
                if (!182.A06(0Tu.A05, this.A02, 36327739627747994L) || CFe >= 0.5f) {
                    this.A01 = true;
                }
            }
            if (182.A06(0Tu.A05, this.A02, 36322555602151668L) && B0M2 >= this.A04 && CFe > this.A03) {
                this.A00 = true;
                this.A05.DLq((AnonymousClass4AB) r9.A03, B0M2);
            }
        }
    }
}
