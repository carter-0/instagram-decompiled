package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

public final class IOG implements C61110lV {
    public long A00;
    public final FragmentActivity A01;
    public final UserSession A02;
    public final String A03;
    public final C62320sa A04;
    public final C62320sa A05;

    public IOG(FragmentActivity fragmentActivity, UserSession userSession, String str, C62320sa r5, C62320sa r6) {
        0qQ.A0B(str, 5);
        this.A02 = userSession;
        this.A01 = fragmentActivity;
        this.A04 = r5;
        this.A05 = r6;
        this.A03 = str;
    }

    public final void onAppBackgrounded() {
        int A032 = AnonymousClass0fD.A03(-454722141);
        this.A00 = System.currentTimeMillis();
        AnonymousClass0fD.A0A(-637837355, A032);
    }

    public final void onAppForegrounded() {
        AnonymousClass37D A012;
        int A032 = AnonymousClass0fD.A03(1489043476);
        UserSession userSession = this.A02;
        0Tu r4 = 0Tu.A05;
        if (182.A06(r4, userSession, 36320287860007117L) && !AnonymousClass37X.A00(userSession).A05) {
            long currentTimeMillis = System.currentTimeMillis() - this.A00;
            String str = this.A03;
            if (0qQ.A0K(str, "clips_viewer_clips_media_notes_stack") && currentTimeMillis > 182.A01(r4, userSession, 36609738590787500L)) {
                this.A01.finish();
            }
            if (0qQ.A0K(C71342cb.A00(userSession).A03(), str) && ((A012 = AnonymousClass37D.A00.A01(this.A01)) == null || !((AnonymousClass37F) A012).A0g)) {
                long A013 = 182.A01(r4, userSession, 36601762836320591L);
                long A014 = 182.A01(r4, userSession, 36601762836123982L);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                if (currentTimeMillis >= timeUnit.toMillis(A013) && currentTimeMillis < timeUnit.toMillis(A014)) {
                    boolean A06 = 182.A06(r4, userSession, 36320287859679434L);
                    boolean A062 = 182.A06(r4, userSession, 36320287859876043L);
                    boolean A063 = 182.A06(r4, userSession, 36320287859941580L);
                    C62320sa r0 = this.A04;
                    r0.invoke();
                    C52012GBj gBj = (C52012GBj) r0.invoke();
                    if (gBj != null && gBj.A06() < gBj.A08()) {
                        C62320sa r7 = this.A05;
                        C295365o2 r02 = ((GD6) r7.invoke()).A0A.A0E(gBj.A06() + 1).A01;
                        C295365o2 r3 = C295365o2.ORGANIC;
                        if (r02 != r3) {
                            if (!A062) {
                                if (A063) {
                                    int A064 = gBj.A06() + 1;
                                    int A08 = gBj.A08();
                                    while (true) {
                                        if (A064 > A08) {
                                            break;
                                        } else if (GD6.A01(r7).A0E(A064).A01 != r3) {
                                            A064++;
                                        } else if (A064 != gBj.A06() && A064 >= 0 && A064 <= gBj.A08()) {
                                            gBj.A0I(A064, A06);
                                        }
                                    }
                                }
                            }
                        }
                        gBj.A0L(A06);
                    }
                }
            }
        }
        AnonymousClass0fD.A0A(-237439164, A032);
    }
}
