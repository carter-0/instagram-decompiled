package X;

import com.instagram.common.session.UserSession;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5l9  reason: invalid class name and case insensitive filesystem */
public final class C293665l9 implements 0lm {
    public static final long A0A = TimeUnit.HOURS.toMillis(5);
    public 1OC A00;
    public final UserSession A01;
    public final C293675lA A02 = new C293675lA();
    public final Comparator A03 = C293705lD.A00;
    public final Comparator A04 = C293695lC.A00;
    public final AnonymousClass0eM A05 = AnonymousClass0eN.A01(new C377209Ky(this, 18));
    public final AnonymousClass0eM A06 = AnonymousClass0eN.A01(new C377209Ky(this, 19));
    public final AnonymousClass0eM A07 = AnonymousClass0eN.A01(new C377209Ky(this, 20));
    public final C61410nE A08 = C61410nE.A00;
    public final C293685lB A09 = new C293685lB(this);

    public final synchronized void A02() {
        if (!((Boolean) this.A07.getValue()).booleanValue()) {
            AnonymousClass0eM r1 = this.A06;
            if (!((C363368jb) r1.getValue()).A02) {
                ((C363368jb) r1.getValue()).A03();
                C363368jb r6 = (C363368jb) r1.getValue();
                long j = r6.A00;
                if (j == -1) {
                    j = r6.A03.getLong(AnonymousClass000.A00(4754), -1);
                    r6.A00 = j;
                }
                if (j < System.currentTimeMillis()) {
                    A01();
                    A00(this);
                }
            }
        }
    }

    public final synchronized void onUserSessionWillEnd(boolean z) {
        if (!((Boolean) this.A07.getValue()).booleanValue()) {
            1OC r0 = this.A00;
            if (r0 != null) {
                r0.cancel();
                this.A00 = null;
            }
            ((C363368jb) this.A06.getValue()).A01();
        }
    }

    public static final void A00(C293665l9 r3) {
        if (!((Boolean) r3.A07.getValue()).booleanValue() && r3.A00 == null && ((Boolean) r3.A05.getValue()).booleanValue()) {
            1NY r2 = new 1NY(r3.A01, -2);
            r2.A05();
            r2.A0A("fbsearch/search_entity_bootstrap/");
            r2.A0Q(NH4.class, OR8.class);
            1OC A0M = r2.A0M();
            A0M.A00 = r3.A09;
            r3.A00 = A0M;
            1ES.A03(A0M);
        }
    }

    public final void A01() {
        if (!((Boolean) this.A07.getValue()).booleanValue()) {
            AnonymousClass0eM r1 = this.A06;
            ((C363368jb) r1.getValue()).A01();
            ((C363368jb) r1.getValue()).A02();
        }
    }

    public C293665l9(UserSession userSession) {
        this.A01 = userSession;
    }
}
