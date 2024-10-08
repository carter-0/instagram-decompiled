package X;

import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Oaa  reason: case insensitive filesystem */
public abstract class C71057Oaa {
    public static final Set A00 = C66580MXl.A12(AnonymousClass7TE.A1I(2FW.A0G));

    public static final boolean A01(C74541Pwa pwa, C74552Pwl pwl, int i) {
        N8N n8n;
        N8N A002 = C70100NxG.A00(pwa, pwl, i);
        int i2 = i + 1;
        if (i2 != pwl.getCount()) {
            boolean A1R = AnonymousClass7TF.A1R(pwl.Azt(i2));
            if (pwl.BmP(i2) != null || pwl.CTx(i2) || A1R) {
                return false;
            }
            n8n = C70100NxG.A00(pwa, pwl, i2);
        } else {
            n8n = null;
        }
        if (!A02(n8n, A002, false)) {
            return false;
        }
        C70464O7p Bjo = pwl.Bjo(i);
        if (Bjo == null || Bjo.A00.size() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean A02(N8N n8n, N8N n8n2, boolean z) {
        if (n8n == null || !AnonymousClass7F3.A00(n8n, n8n2)) {
            return false;
        }
        long j = n8n.A00;
        long j2 = n8n2.A00;
        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
        if (Math.abs(timeUnit.toSeconds(j) - timeUnit.toSeconds(j2)) >= 60) {
            return false;
        }
        boolean z2 = !z;
        2FW r1 = n8n.A01;
        Set set = A00;
        if (set.contains(r1)) {
            return false;
        }
        2FW r2 = 2FW.A0s;
        if (r1 == r2 && z2 && !n8n.A02) {
            return false;
        }
        2FW r12 = n8n2.A01;
        if (set.contains(r12)) {
            return false;
        }
        if (r12 != r2 || !z || n8n2.A02) {
            return true;
        }
        return false;
    }

    public static final boolean A00(C74541Pwa pwa, C74552Pwl pwl, int i) {
        N8N A002;
        N8N A003 = C70100NxG.A00(pwa, pwl, i);
        if (i == 0) {
            A002 = null;
        } else {
            A002 = C70100NxG.A00(pwa, pwl, i - 1);
        }
        boolean A1R = AnonymousClass7TF.A1R(pwl.Azt(i));
        if (pwl.BmP(i) != null || pwl.CTx(i) || A1R || !A02(A002, A003, true)) {
            return false;
        }
        C70464O7p Bjo = pwl.Bjo(i - 1);
        if (Bjo == null || Bjo.A00.size() == 0) {
            return true;
        }
        return false;
    }
}
