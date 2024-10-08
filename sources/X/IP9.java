package X;

import android.graphics.Rect;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Set;

public final class IP9 implements C250603lj {
    public final Set A00 = AnonymousClass7TE.A1F();

    public final void ATF(AnonymousClass30Y r7, C252093oY r8) {
        AnonymousClass7TG.A1N(r7, r8);
        1Xj r2 = (1Xj) r7.A03;
        AnonymousClass3W1 r5 = (AnonymousClass3W1) r7.A04;
        if (r8.CFe(r7) >= 0.5f) {
            Rect A0W = AnonymousClass7TE.A0W();
            r8.B9a(A0W, r7);
            int i = A0W.bottom;
            Rect A0W2 = AnonymousClass7TE.A0W();
            r8.B9Y(A0W2, r7);
            if (i == A0W2.bottom) {
                Set set = this.A00;
                if (!set.contains(r2.getId())) {
                    set.add(r2.getId());
                    0qQ.A0A(r5);
                    if (!r5.A3E) {
                        IZO izo = new IZO(r2, r5, set);
                        C256113vF r22 = r5.A0r;
                        if (r22 == null) {
                            r22 = new C256113vF();
                            r5.A0r = r22;
                        }
                        r22.A00 = izo;
                        List list = r22.A02.A04;
                        list.clear();
                        list.add(C51965G9l.A0v(r22.A00));
                        WeakReference weakReference = r22.A01;
                        if (weakReference != null) {
                            list.add(weakReference);
                        }
                        if (!r5.A3E) {
                            C256113vF r0 = r5.A0r;
                            if (r0 == null) {
                                r5.A0r = new C256113vF();
                            } else {
                                r0.A00();
                            }
                            C256113vF r02 = r5.A0r;
                            if (r02 != null) {
                                r02.A01(3000, 300);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
        this.A00.remove(r2.getId());
    }
}
