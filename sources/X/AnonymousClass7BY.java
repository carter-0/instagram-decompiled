package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectShareTargetLoggingInfo;
import java.util.Collection;

/* renamed from: X.7BY  reason: invalid class name */
public final class AnonymousClass7BY implements AnonymousClass0lh {
    public final C327527Bd A00;
    public final C327507Bb A01;
    public final 1wn A02;
    public final UserSession A03;

    public final void onSessionWillEnd() {
        A05(false);
    }

    public static AnonymousClass7BY A00(UserSession userSession) {
        return (AnonymousClass7BY) userSession.A01(AnonymousClass7BY.class, new AnonymousClass7BZ(userSession));
    }

    public final ImmutableList A01() {
        C327507Bb r1 = this.A01;
        r1.A01.writeLock().lock();
        C327517Bc r2 = r1.A00;
        try {
            C327527Bd r12 = this.A00;
            r12.A03.A00();
            ImmutableList copyOf = ImmutableList.copyOf((Collection) r12.A00);
            if (r2 != null) {
                r2.close();
            }
            return copyOf;
        } catch (Throwable th) {
            C9153RRe.A00(th, th);
            throw th;
        }
    }

    public final void A02(DirectShareTarget directShareTarget) {
        C327507Bb r1 = this.A01;
        r1.A01.writeLock().lock();
        C327517Bc r5 = r1.A00;
        try {
            C327527Bd r4 = this.A00;
            r4.A03.A00();
            r4.A00(directShareTarget, false);
            r4.A00.add(0, directShareTarget);
            r4.A02.ATE(new RAM(r4, directShareTarget, System.currentTimeMillis()));
            if (r5 != null) {
                r5.close();
            }
        } catch (Throwable th) {
            C9153RRe.A00(th, th);
            throw th;
        }
    }

    public final void A03(DirectShareTarget directShareTarget) {
        C327507Bb r1 = this.A01;
        r1.A01.writeLock().lock();
        C327517Bc r2 = r1.A00;
        try {
            this.A00.A00(directShareTarget, true);
            if (r2 != null) {
                r2.close();
            }
        } catch (Throwable th) {
            C9153RRe.A00(th, th);
            throw th;
        }
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [com.instagram.model.direct.DirectShareTargetLoggingInfo, java.lang.Object] */
    public final void A04(DirectShareTarget directShareTarget, int i) {
        C327507Bb r1 = this.A01;
        r1.A01.writeLock().lock();
        C327517Bc r4 = r1.A00;
        try {
            C327527Bd r3 = this.A00;
            r3.A03.A00();
            DirectShareTargetLoggingInfo directShareTargetLoggingInfo = ((DirectShareTarget) r3.A00.get(i)).A08;
            if (directShareTargetLoggingInfo != null) {
                Double d = directShareTargetLoggingInfo.A01;
                Boolean bool = directShareTargetLoggingInfo.A00;
                ? obj = new Object();
                obj.A01 = d;
                obj.A00 = bool;
                directShareTarget.A08 = obj;
            }
            r3.A00.set(i, directShareTarget);
            if (r4 != null) {
                r4.close();
            }
        } catch (Throwable th) {
            C9153RRe.A00(th, th);
            throw th;
        }
    }

    public final void A05(boolean z) {
        C327507Bb r1 = this.A01;
        r1.A01.writeLock().lock();
        C327517Bc r3 = r1.A00;
        try {
            C327527Bd r2 = this.A00;
            r2.A03.A00();
            r2.A00.clear();
            if (z) {
                r2.A02.ATE(new C8798R9z(r2));
            }
            AnonymousClass1Nd.A00(this.A03).A02(this.A02, AnonymousClass3KA.class);
            if (r3 != null) {
                r3.close();
            }
        } catch (Throwable th) {
            C9153RRe.A00(th, th);
            throw th;
        }
    }

    public AnonymousClass7BY(UserSession userSession) {
        C327497Ba r2 = new C327497Ba(this);
        this.A02 = r2;
        C327507Bb r1 = new C327507Bb();
        this.A01 = r1;
        this.A00 = new C327527Bd(userSession, r1);
        this.A03 = userSession;
        AnonymousClass1Nd.A00(userSession).A01(r2, AnonymousClass3KA.class);
    }
}
