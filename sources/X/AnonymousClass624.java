package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.624  reason: invalid class name */
public final class AnonymousClass624 implements AnonymousClass621 {
    public static final AnonymousClass625 A03 = new Object();
    public final int A00;
    public final C67671vk A01;
    public final boolean A02;

    public AnonymousClass624(C67671vk r2, int i, boolean z) {
        0qQ.A0B(r2, 1);
        this.A01 = r2;
        this.A00 = i;
        this.A02 = z;
    }

    public static final UserSession A00(AnonymousClass624 r1) {
        UserSession userSession = r1.A01.A00;
        if (userSession != null) {
            return userSession;
        }
        throw new RuntimeException("Trying to access showreel without session init");
    }

    public final boolean Erw() {
        return this.A02;
    }

    public final /* synthetic */ boolean Esj() {
        return true;
    }

    public final XFB A01() {
        int A012;
        long A013;
        UserSession A002 = A00(this);
        0Tu r3 = 0Tu.A05;
        boolean A06 = 182.A06(r3, A002, 36321400256013646L);
        boolean A062 = 182.A06(r3, A00(this), 36321400256144719L);
        if (A06 || A062) {
            A012 = (int) 182.A01(r3, A00(this), 36602875232654146L);
            if (A06 || A062) {
                A013 = 182.A01(r3, A00(this), 36602875232785219L);
                Long valueOf = Long.valueOf(A013);
                0qQ.A0A(valueOf);
                return new XFB(A012, valueOf.longValue(), A06, A062);
            }
        } else {
            A012 = 0;
        }
        A013 = 0;
        Long valueOf2 = Long.valueOf(A013);
        0qQ.A0A(valueOf2);
        return new XFB(A012, valueOf2.longValue(), A06, A062);
    }

    public final int Az1() {
        return (int) 182.A01(0Tu.A05, A00(this), 36592253780623741L);
    }

    public final boolean CPR() {
        return 182.A06(0Tu.A05, A00(this), 36310778804175125L);
    }

    public final boolean CVg() {
        return 182.A06(0Tu.A05, A00(this), 36310778804961560L);
    }

    public final boolean CZX() {
        return 182.A06(0Tu.A05, A00(this), 36310778804568342L);
    }

    public final boolean CZY() {
        return 182.A06(0Tu.A05, A00(this), 36310778805747995L);
    }
}
