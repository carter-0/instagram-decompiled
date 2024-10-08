package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.3WU  reason: invalid class name */
public final class AnonymousClass3WU implements AnonymousClass3WV {
    public final AnonymousClass30S A00;

    /* JADX WARNING: type inference failed for: r2v1, types: [X.30a, X.30Z] */
    public final void A85(C245833dY r8, int i) {
        0qQ.A0B(r8, 1);
        AnonymousClass30S r6 = this.A00;
        if (r6 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append(':');
            C247733gp r1 = r8.A01;
            sb.append(r1.A0E);
            sb.append(':');
            sb.append(r1.A0G);
            String obj = sb.toString();
            UserSession userSession = r6.A01;
            AnonymousClass30X r3 = r6.A00;
            Object obj2 = r3.A03;
            AnonymousClass30X r0 = AnonymousClass30X.A02;
            ? r2 = new C2354830a(obj2, r8, obj);
            r2.A00 = userSession;
            r2.A00 = r3;
            r2.A01 = r3.A00;
            AnonymousClass30T r02 = r6.A05;
            0qQ.A06(obj2);
            r02.Csc(r2, (1Xj) obj2, r8);
            r6.A03.A01(new AnonymousClass30X(r2), obj);
        }
    }

    public final void ECB(View view, int i, Object obj, Object obj2) {
        String A0H;
        0qQ.A0B(obj, 2);
        0qQ.A0B(obj2, 3);
        AnonymousClass30S r3 = this.A00;
        if (r3 != null) {
            if (obj2 instanceof C245833dY) {
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append(':');
                C247733gp r1 = ((C245833dY) obj2).A01;
                sb.append(r1.A0E);
                sb.append(':');
                sb.append(r1.A0G);
                A0H = sb.toString();
            } else {
                1Xj A02 = 1Xi.A02(obj);
                if (A02 == null || (A0H = 002.A0H(A02.getId(), ':', i)) == null) {
                    throw new IllegalStateException("Tried to to register view with unknown model");
                }
            }
            r3.A05.Dcw(view, i, obj, obj2);
            2el r12 = r3.A02;
            r12.A05(view, r3.A03.A00(A0H));
            C245843dZ.A00 = new WeakReference(r12);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.30a, X.30Z] */
    public final void A82(int i) {
        AnonymousClass30S r7 = this.A00;
        if (r7 != null) {
            Object obj = r7.A00.A03;
            0qQ.A06(obj);
            String A0H = 002.A0H(((1Xj) obj).getId(), ':', i);
            UserSession userSession = r7.A01;
            AnonymousClass30X r4 = r7.A00;
            Object obj2 = r4.A03;
            Object obj3 = r4.A04;
            AnonymousClass30X r0 = AnonymousClass30X.A02;
            ? r2 = new C2354830a(obj2, obj3, A0H);
            r2.A00 = userSession;
            r2.A00 = r4;
            r2.A01 = r4.A00;
            AnonymousClass30T r1 = r7.A05;
            0qQ.A06(obj2);
            Object obj4 = r7.A00.A04;
            0qQ.A06(obj4);
            r1.Csa(r2, (1Xj) obj2, (AnonymousClass3W1) obj4);
            r7.A03.A01(r2.A01(), A0H);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.30a, X.30Z] */
    public final void A87(int i) {
        AnonymousClass30S r7 = this.A00;
        if (r7 != null) {
            Object obj = r7.A00.A03;
            0qQ.A06(obj);
            String A0H = 002.A0H(((1Xj) obj).getId(), ':', i);
            UserSession userSession = r7.A01;
            AnonymousClass30X r4 = r7.A00;
            Object obj2 = r4.A03;
            Object obj3 = r4.A04;
            AnonymousClass30X r0 = AnonymousClass30X.A02;
            ? r2 = new C2354830a(obj2, obj3, A0H);
            r2.A00 = userSession;
            r2.A00 = r4;
            r2.A01 = r4.A00;
            r7.A05.Csd(r2);
            r7.A03.A01(r2.A01(), A0H);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.30a, X.30Z] */
    public final void A88(int i) {
        AnonymousClass30S r7 = this.A00;
        if (r7 != null) {
            Object obj = r7.A00.A03;
            0qQ.A06(obj);
            String A0H = 002.A0H(((1Xj) obj).getId(), ':', i);
            UserSession userSession = r7.A01;
            AnonymousClass30X r4 = r7.A00;
            Object obj2 = r4.A03;
            Object obj3 = r4.A04;
            AnonymousClass30X r0 = AnonymousClass30X.A02;
            ? r2 = new C2354830a(obj2, obj3, A0H);
            r2.A00 = userSession;
            r2.A00 = r4;
            r2.A01 = r4.A00;
            AnonymousClass30T r1 = r7.A05;
            0qQ.A06(obj2);
            Object obj4 = r7.A00.A04;
            0qQ.A06(obj4);
            r1.Cse(r2, (1Xj) obj2, (AnonymousClass3W1) obj4);
            r7.A03.A01(r2.A01(), A0H);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.30a, X.30Z] */
    public final void A8V(int i) {
        AnonymousClass30S r7 = this.A00;
        if (r7 != null) {
            Object obj = r7.A00.A03;
            0qQ.A06(obj);
            String A0H = 002.A0H(((1Xj) obj).getId(), ':', i);
            UserSession userSession = r7.A01;
            AnonymousClass30X r4 = r7.A00;
            Object obj2 = r4.A03;
            Object obj3 = r4.A04;
            AnonymousClass30X r0 = AnonymousClass30X.A02;
            ? r2 = new C2354830a(obj2, obj3, A0H);
            r2.A00 = userSession;
            r2.A00 = r4;
            r2.A01 = r4.A00;
            r7.A05.Csf(r2);
            r7.A03.A01(r2.A01(), A0H);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.30a, X.30Z] */
    public final void A8i(int i) {
        AnonymousClass30S r7 = this.A00;
        if (r7 != null) {
            Object obj = r7.A00.A03;
            0qQ.A06(obj);
            String A0H = 002.A0H(((1Xj) obj).getId(), ':', i);
            UserSession userSession = r7.A01;
            AnonymousClass30X r4 = r7.A00;
            Object obj2 = r4.A03;
            Object obj3 = r4.A04;
            AnonymousClass30X r0 = AnonymousClass30X.A02;
            ? r2 = new C2354830a(obj2, obj3, A0H);
            r2.A00 = userSession;
            r2.A00 = r4;
            r2.A01 = r4.A00;
            AnonymousClass30T r1 = r7.A05;
            0qQ.A06(obj2);
            Object obj4 = r7.A00.A04;
            0qQ.A06(obj4);
            r1.Csh(r2, (1Xj) obj2, (AnonymousClass3W1) obj4);
            r7.A03.A01(r2.A01(), A0H);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.30a, X.30Z] */
    public final void AAB(int i) {
        AnonymousClass30S r7 = this.A00;
        if (r7 != null) {
            Object obj = r7.A00.A03;
            0qQ.A06(obj);
            String A0H = 002.A0H(((1Xj) obj).getId(), ':', i);
            UserSession userSession = r7.A01;
            AnonymousClass30X r4 = r7.A00;
            Object obj2 = r4.A03;
            Object obj3 = r4.A04;
            AnonymousClass30X r0 = AnonymousClass30X.A02;
            ? r2 = new C2354830a(obj2, obj3, A0H);
            r2.A00 = userSession;
            r2.A00 = r4;
            r2.A01 = r4.A00;
            AnonymousClass30T r1 = r7.A05;
            0qQ.A06(obj2);
            Object obj4 = r7.A00.A04;
            0qQ.A06(obj4);
            r1.Csk(r2, (1Xj) obj2, (AnonymousClass3W1) obj4, i);
            r7.A03.A01(r2.A01(), A0H);
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.30a, X.30Z] */
    public final void E49(1Xj r6, AnonymousClass3W1 r7) {
        AnonymousClass30S r4 = this.A00;
        if (r4 != null) {
            1Xj r0 = null;
            AnonymousClass3OA r1 = r4.A00.A00;
            if (r1 != null) {
                r0 = r1.A0K;
            }
            if (!r6.equals(r0)) {
                UserSession userSession = r4.A01;
                String id = r6.getId();
                if (id != null) {
                    ? r12 = new C2354830a(r6, r7, id);
                    r12.A00 = userSession;
                    r4.A05.Csj(r12, r6, r7);
                    r4.A00 = new AnonymousClass30X(r12);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.30a, X.30Z] */
    public final void E4A(AnonymousClass3W1 r7, AnonymousClass3OA r8) {
        AnonymousClass30S r5 = this.A00;
        if (r5 != null) {
            UserSession userSession = r5.A01;
            1Xj r3 = r8.A0K;
            String id = r3.getId();
            if (id != null) {
                AnonymousClass30X r0 = AnonymousClass30X.A02;
                ? r1 = new C2354830a(r3, r7, id);
                r1.A00 = userSession;
                r1.A01 = r8;
                r5.A05.Csj(r1, r3, r7);
                r5.A00 = new AnonymousClass30X(r1);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void FJ8(View view) {
        AnonymousClass30S r0 = this.A00;
        if (r0 != null) {
            r0.A02.A04(view);
            C245843dZ.A00 = null;
        }
    }

    public AnonymousClass3WU(AnonymousClass30S r1) {
        this.A00 = r1;
    }
}
