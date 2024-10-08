package X;

import android.content.Context;
import android.os.SystemClock;
import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.6bg  reason: invalid class name and case insensitive filesystem */
public final class C310826bg implements C250603lj {
    public final 1Ng A00;
    public final Context A01;
    public final C46505Dg8 A02;
    public final UserSession A03;

    public final void ATF(AnonymousClass30Y r23, C252093oY r24) {
        C250183l2 r1;
        AnonymousClass3OA r0;
        String str;
        Integer num;
        C250513lZ injected;
        AnonymousClass30Y r3 = r23;
        0qQ.A0B(r3, 0);
        C252093oY r2 = r24;
        0qQ.A0B(r2, 1);
        AnonymousClass6YZ r15 = (AnonymousClass6YZ) r3.A04;
        1Xj r02 = r15.A01.A0b;
        if (r02 == null || (injected = r02.A0C.getInjected()) == null) {
            r1 = null;
        } else {
            r1 = injected.AaH();
        }
        Object obj = r3.A03;
        C250973mM r12 = (C250973mM) obj;
        UserSession userSession = this.A03;
        C255773uh A08 = r12.A08(userSession);
        C46505Dg8 dg8 = this.A02;
        if (dg8 != null) {
            AtomicBoolean atomicBoolean = dg8.A08;
            if (!atomicBoolean.get() || dg8.A02 != null) {
                Context context = this.A01;
                0qQ.A06(obj);
                0qQ.A0B(A08, 1);
                if (!C297785sK.A0l(r12) && !C309506Yn.A06(context, userSession, A08, r12) && C316216lI.A0B(context) && !C297785sK.A0G(userSession, A08) && !A08.A0N().booleanValue()) {
                    UserSession userSession2 = dg8.A06;
                    if (C295435o9.A00(r1, userSession2, true) && (r0 = A08.A0g) != null && (str = r0.A0S) != null) {
                        long j = (long) r15.A00;
                        if (!atomicBoolean.get()) {
                            C309426Yf r8 = r15.A03;
                            if (r8.A0R == null) {
                                r8.A0R = new F2N(AnonymousClass05K.A00, str);
                                dg8.A02 = r8;
                            }
                        }
                        F2N f2n = r15.A03.A0R;
                        if (f2n != null) {
                            int intValue = r2.CEk(r3).intValue();
                            if (intValue == 0) {
                                f2n.A01 = 0;
                                num = f2n.A02;
                                dg8.A03 = num;
                                long uptimeMillis = SystemClock.uptimeMillis();
                                long j2 = f2n.A00;
                                long j3 = 0;
                                if (j2 != 0) {
                                    j3 = uptimeMillis - j2;
                                }
                                f2n.A00 = uptimeMillis;
                                f2n.A01 = j3;
                            } else if (intValue != 1) {
                                C46505Dg8.A00(dg8);
                                f2n.A00 = 0;
                                1wn r22 = dg8.A01;
                                if (r22 != null) {
                                    AnonymousClass1Nd.A00(userSession2).A02(r22, C57060INa.class);
                                }
                                dg8.A01 = null;
                                return;
                            } else {
                                boolean z = atomicBoolean.get();
                                long uptimeMillis2 = SystemClock.uptimeMillis();
                                long j4 = f2n.A00;
                                long j5 = 0;
                                if (j4 != 0) {
                                    j5 = uptimeMillis2 - j4;
                                }
                                f2n.A00 = uptimeMillis2;
                                long j6 = f2n.A01 + j5;
                                f2n.A01 = j6;
                                long j7 = dg8.A04;
                                if (f2n.A02.intValue() == 0 && j6 >= j7 && atomicBoolean.compareAndSet(false, true)) {
                                    f2n.A02 = AnonymousClass05K.A01;
                                }
                                if (!z && atomicBoolean.get()) {
                                    String str2 = dg8.A07;
                                    C54034GyJ gyJ = new C54034GyJ(dg8.A05, userSession2, A08, str2, j);
                                    dg8.A00 = gyJ;
                                    gyJ.Cis();
                                }
                                num = f2n.A02;
                            }
                            if (num.intValue() == 1) {
                                this.A00.A00(new C57060INa(str));
                            }
                        }
                    }
                }
            }
        }
    }

    public C310826bg(Context context, C46505Dg8 dg8, UserSession userSession) {
        this.A02 = dg8;
        this.A03 = userSession;
        this.A01 = context;
        this.A00 = AnonymousClass1Nd.A00(userSession);
    }
}
