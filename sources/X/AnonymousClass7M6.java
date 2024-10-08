package X;

import android.app.Activity;
import android.content.Context;
import android.view.Window;
import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7M6  reason: invalid class name */
public final class AnonymousClass7M6 implements AnonymousClass3KO {
    public AnonymousClass3KG A00;
    public AnonymousClass3KQ A01;
    public boolean A02;
    public final Activity A03;
    public final Context A04;
    public final 1a8 A05 = new 1a8(C318146oT.A01);
    public final UserSession A06;
    public final C333517Zg A07;
    public final List A08;
    public final AnonymousClass9IV A09;
    public final AnonymousClass9IV A0A;
    public final AnonymousClass9IV A0B;
    public final AnonymousClass0eK A0C;

    private final boolean A01(AnonymousClass9IV r4) {
        C332187Tz r0 = (C332187Tz) r4.A01;
        boolean CXh = r0.CXh();
        if (!CXh && !r0.CXi()) {
            return false;
        }
        ((AnonymousClass7M2) r4.A00).Cly((C254793t3) this.A0C.get(), CXh);
        return true;
    }

    public static final boolean A02(AnonymousClass7M6 r2) {
        List<AnonymousClass9IV> list = r2.A08;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (AnonymousClass9IV r0 : list) {
                if (((C332187Tz) r0.A01).CdC()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void DhB(long j) {
        if (!A01(this.A0A) && !A01(this.A0B)) {
            A01(this.A09);
        }
    }

    public AnonymousClass7M6(Activity activity, Context context, AnonymousClass9IV r5, AnonymousClass9IV r6, AnonymousClass9IV r7, UserSession userSession, C333517Zg r9, AnonymousClass0eK r10) {
        this.A03 = activity;
        this.A06 = userSession;
        this.A0A = r5;
        this.A0B = r6;
        this.A09 = r7;
        this.A0C = r10;
        this.A04 = context;
        this.A07 = r9;
        this.A08 = 0sr.A1Q(new AnonymousClass9IV[]{r5, r6, r7});
    }

    public static final void A00(Window window, AnonymousClass7M6 r5) {
        if (A02(r5) && !C2604245p.A03(r5.A04)) {
            List<AnonymousClass9IV> list = r5.A08;
            boolean z = list instanceof Collection;
            if (!z || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((C332187Tz) ((AnonymousClass9IV) it.next()).A01).CXh()) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (!z || !list.isEmpty()) {
                for (AnonymousClass9IV r0 : list) {
                    if (((C332187Tz) r0.A01).CXi()) {
                        AnonymousClass79I A002 = AnonymousClass79I.A02.A00();
                        if (window != null) {
                            A002.A01(window, "ScreenshotNotificationManager");
                            return;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            }
        } else if (!r5.A02) {
            r5.A02 = true;
        } else {
            return;
        }
        AnonymousClass79I A003 = AnonymousClass79I.A02.A00();
        if (window != null) {
            A003.A02(window, "ScreenshotNotificationManager");
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
