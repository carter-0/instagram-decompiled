package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.7Bd  reason: invalid class name and case insensitive filesystem */
public final class C327527Bd {
    public List A00 = new LinkedList();
    public final UserSession A01;
    public final C61480nO A02;
    public final C327507Bb A03;

    public final void A00(DirectShareTarget directShareTarget, boolean z) {
        this.A03.A00();
        boolean A0Q = directShareTarget.A0Q();
        List list = this.A00;
        if (A0Q) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                DirectShareTarget directShareTarget2 = (DirectShareTarget) it.next();
                if (directShareTarget2.A0Q()) {
                    this.A00.remove(directShareTarget2);
                    break;
                }
            }
        } else {
            list.remove(directShareTarget);
        }
        if (z) {
            this.A02.ATE(new RAB(this, directShareTarget));
        }
    }

    public C327527Bd(UserSession userSession, C327507Bb r5) {
        this.A01 = userSession;
        this.A03 = r5;
        this.A02 = 0nY.A00();
        r5.A01.writeLock().lock();
        C327517Bc r2 = r5.A00;
        try {
            this.A03.A00();
            this.A02.ATE(new C327537Be(userSession, this));
            if (r2 != null) {
                r2.close();
            }
        } catch (Throwable th) {
            C9153RRe.A00(th, th);
            throw th;
        }
    }
}
