package X;

import android.os.Handler;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

public final class GCL implements C250603lj {
    public boolean A00;
    public C267324bN A01;
    public final Handler A02 = AnonymousClass7TF.A0D();
    public final FragmentActivity A03;
    public final UserSession A04;
    public final C52012GBj A05;
    public final HashMap A06 = AnonymousClass7TE.A1E();

    public final void ATF(AnonymousClass30Y r15, C252093oY r16) {
        C267324bN r10;
        long j;
        long A0D;
        C257913yA r11;
        Integer Aw5;
        0Tu r8;
        long j2;
        long j3;
        long j4;
        C252093oY r1 = r16;
        boolean A1U = AnonymousClass7TF.A1U(0, r15, r1);
        Object obj = r15.A04;
        C52058GDe gDe = (C52058GDe) obj;
        AnonymousClass3W1 r4 = gDe.A0E;
        if (r4 != null) {
            int hashCode = r4.hashCode();
            int A0A = C51968G9o.A0A(r15, r1);
            if (A0A == 0) {
                C52012GBj gBj = this.A05;
                C267324bN A042 = C52012GBj.A04(gBj);
                this.A01 = A042;
                if (A042 != null && !A042.CcK()) {
                    this.A01 = gBj.A0C(C52012GBj.A00(gBj, A1U ? 1 : 0));
                }
            } else if (A0A != A1U) {
                if (this.A00) {
                    HashMap hashMap = this.A06;
                    Integer valueOf = Integer.valueOf(hashCode);
                    Runnable runnable = (Runnable) hashMap.get(valueOf);
                    if (runnable != null) {
                        this.A02.removeCallbacks(runnable);
                        hashMap.remove(valueOf);
                    }
                    Integer num = r4.A10;
                    Integer num2 = AnonymousClass05K.A00;
                    if (num != num2) {
                        r4.A0Z(num2);
                    }
                }
            } else if (r1.CFe(r15) == 1.0f && (r10 = this.A01) != null) {
                AnonymousClass71K r82 = GJ7.A00;
                UserSession userSession = this.A04;
                if (r82.A0I(r10, userSession)) {
                    C57775IgG igG = new C57775IgG(r4);
                    HashMap hashMap2 = this.A06;
                    Integer valueOf2 = Integer.valueOf(hashCode);
                    if (!hashMap2.containsKey(valueOf2)) {
                        if (C55257Hem.A00(this.A03, r10, userSession)) {
                            0Tu r112 = 0Tu.A06;
                            boolean A062 = 182.A06(r112, userSession, 36317543376360743L);
                            0qQ.A06(obj);
                            j = r82.A0E(r10, gDe, userSession, A062);
                            if (!A062 || !C55258Hen.A00(userSession).A00(r10)) {
                                j4 = 36599018352938335L;
                            } else {
                                j4 = 36599018353266018L;
                            }
                            A0D = 182.A01(r112, userSession, j4);
                        } else {
                            boolean z = false;
                            if (!r10.CcK()) {
                                z = true;
                            }
                            j = 0;
                            if (!(z || (r11 = r10.A06().A0N) == null || (Aw5 = r11.Aw5()) == null)) {
                                j = (long) Aw5.intValue();
                            }
                            0qQ.A06(obj);
                            A0D = r82.A0D(r10, gDe, userSession);
                        }
                        long j5 = j + A0D;
                        1Xj r2 = r10.A02;
                        if (r2 != null) {
                            long A1B = r2.A1B();
                            if (A1B != 0) {
                                j3 = Math.max(j5, A1B + r82.A0F(r10, userSession));
                                hashMap2.put(valueOf2, igG);
                                this.A02.postDelayed(igG, j3);
                            }
                        }
                        if (r82.A0G(r10, userSession)) {
                            r8 = 0Tu.A06;
                            j2 = 36605516637803768L;
                        } else {
                            boolean A0K = r82.A0K(r10, userSession, false);
                            r8 = 0Tu.A06;
                            if (A0K) {
                                j2 = 36607277574198816L;
                            } else {
                                j2 = 36597038373145299L;
                            }
                        }
                        long A012 = 182.A01(r8, userSession, j2);
                        0qQ.A0A(Long.valueOf(A012));
                        j3 = A012 + j5;
                        hashMap2.put(valueOf2, igG);
                        this.A02.postDelayed(igG, j3);
                    }
                }
            }
        }
    }

    public GCL(FragmentActivity fragmentActivity, UserSession userSession, C52012GBj gBj) {
        AnonymousClass7TG.A1U(userSession, gBj, fragmentActivity);
        this.A04 = userSession;
        this.A05 = gBj;
        this.A03 = fragmentActivity;
    }
}
