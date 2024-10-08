package X;

import android.os.Handler;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

public final class GE9 implements C250603lj {
    public boolean A00;
    public C267324bN A01;
    public final Handler A02 = AnonymousClass7TF.A0D();
    public final UserSession A03;
    public final C52012GBj A04;
    public final HashMap A05 = AnonymousClass7TE.A1E();

    public final void ATF(AnonymousClass30Y r8, C252093oY r9) {
        1Xj r0;
        boolean A1U = AnonymousClass7TF.A1U(0, r8, r9);
        AnonymousClass3W1 r1 = ((C52058GDe) r8.A04).A0E;
        if (r1 != null) {
            int hashCode = r1.hashCode();
            int A0A = C51968G9o.A0A(r8, r9);
            if (A0A == 0) {
                C52012GBj gBj = this.A04;
                C267324bN A042 = C52012GBj.A04(gBj);
                this.A01 = A042;
                if (A042 != null && !A042.CcK()) {
                    this.A01 = gBj.A0C(C52012GBj.A00(gBj, A1U ? 1 : 0));
                }
            } else if (A0A != A1U) {
                if (this.A00) {
                    HashMap hashMap = this.A05;
                    Integer valueOf = Integer.valueOf(hashCode);
                    Runnable runnable = (Runnable) hashMap.get(valueOf);
                    if (runnable != null) {
                        this.A02.removeCallbacks(runnable);
                        hashMap.remove(valueOf);
                    }
                    boolean z = r1.A27;
                    boolean z2 = r1.A25;
                    if (z) {
                        if (z2 != A1U) {
                            r1.A25 = A1U;
                        } else {
                            return;
                        }
                    } else if (z2) {
                        r1.A25 = false;
                    } else {
                        return;
                    }
                    AnonymousClass3W1.A00(r1, 65);
                }
            } else if (r9.CFe(r8) == 1.0f) {
                C267324bN r02 = this.A01;
                if (r02 != null) {
                    r0 = r02.A02;
                } else {
                    r0 = null;
                }
                UserSession userSession = this.A03;
                if (GED.A03(userSession, r0) && !r1.A25) {
                    HashMap hashMap2 = this.A05;
                    Integer valueOf2 = Integer.valueOf(hashCode);
                    if (!hashMap2.containsKey(valueOf2)) {
                        C57774IgF igF = new C57774IgF(r1);
                        long A012 = 182.A01(C51965G9l.A0Z(userSession, 0), userSession, 36603059916575592L);
                        hashMap2.put(valueOf2, igF);
                        this.A02.postDelayed(igF, A012);
                    }
                }
            }
        }
    }

    public GE9(UserSession userSession, C52012GBj gBj) {
        AnonymousClass7TG.A1O(userSession, gBj);
        this.A03 = userSession;
        this.A04 = gBj;
    }
}
