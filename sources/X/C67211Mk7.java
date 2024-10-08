package X;

import java.util.Iterator;

/* renamed from: X.Mk7  reason: case insensitive filesystem */
public abstract class C67211Mk7 implements AnonymousClass0lh {
    public String A00;
    public String A01;
    public final C67212Mk8 A02;
    public final C74341PtH A03;

    public C67211Mk7(C74341PtH ptH) {
        0qQ.A0B(ptH, 1);
        this.A03 = ptH;
        C67212Mk8 mk8 = new C67212Mk8();
        this.A02 = mk8;
        mk8.A0E = new C67213Mk9(ptH);
        mk8.A00 = 1;
    }

    public final void A03(C74414PuU puU) {
        0qQ.A0B(puU, 0);
        C74414PuU puU2 = (C74414PuU) puU.FKf(this.A00);
        C67212Mk8 mk8 = this.A02;
        String BK4 = puU2.BK4(this.A01);
        Long A0u = C51968G9o.A0u();
        17k.A07(mk8.A0E, "Must init with a valid delegate first!");
        BK4.getClass();
        if (mk8.A0F != null) {
            C67212Mk8.A00(mk8, A0u, puU2, BK4);
        }
    }

    public final void A04(C74414PuU puU) {
        0qQ.A0B(puU, 0);
        C74414PuU puU2 = (C74414PuU) puU.FKf(this.A00);
        C67212Mk8 mk8 = this.A02;
        String BK4 = puU2.BK4(this.A01);
        Long A0u = C51968G9o.A0u();
        17k.A07(mk8.A0E, "Must init with a valid delegate first!");
        BK4.getClass();
        if (mk8.A0F != null) {
            int i = -1;
            0yf r1 = mk8.A09;
            Number number = (Number) r1.get(BK4);
            if (number != null) {
                i = Math.max(number.intValue(), -1);
            }
            r1.put(BK4, Integer.valueOf(i));
            int i2 = -1;
            0yf r12 = mk8.A07;
            Number number2 = (Number) r12.get(BK4);
            if (number2 != null) {
                i2 = Math.max(number2.intValue(), -1);
            }
            r12.put(BK4, Integer.valueOf(i2));
            0yf r13 = mk8.A05;
            if (r13.containsKey(BK4)) {
                0KC.A0D("RankingImpressionLoggingManager", "Previous impression has not stopped yet, check your logging logic");
                return;
            }
            r13.put(BK4, A0u);
            0yf r2 = mk8.A02;
            Number number3 = (Number) r2.get(BK4);
            int i3 = 1;
            if (number3 != null) {
                i3 = 1 + number3.intValue();
            }
            r2.put(BK4, Integer.valueOf(i3));
            if (mk8.A00 == 0 || !mk8.A06.containsKey(BK4)) {
                mk8.A06.put(BK4, puU2);
            }
        }
    }

    public final void onSessionWillEnd() {
        this.A01 = null;
    }

    public final void A00() {
        C67212Mk8 mk8 = this.A02;
        17k.A07(mk8.A0E, "Must init with a valid delegate first!");
        if (mk8.A0F == null) {
            mk8.A0F = AnonymousClass7TF.A0b();
            mk8.A01 = mk8.A0D.now();
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, X.OHD] */
    public final void A01() {
        C67212Mk8 mk8 = this.A02;
        Long A0u = C51968G9o.A0u();
        17k.A07(mk8.A0E, "Must init with a valid delegate first!");
        17k.A07(A0u, "Timestamp is null!");
        if (mk8.A0F != null) {
            0yf r12 = mk8.A06;
            Iterator it = r12.keySet().iterator();
            while (it.hasNext()) {
                String A18 = AnonymousClass7TE.A18(it);
                Object obj = r12.get(A18);
                C67212Mk8.A00(mk8, A0u, obj, A18);
                if (mk8.A00 != 0) {
                    int A0M = AnonymousClass7TE.A0M(mk8.A02.get(A18));
                    long A0R = AnonymousClass7TE.A0R(mk8.A08.get(A18));
                    0yf r2 = mk8.A09;
                    if (r2.get(A18) != null) {
                        r2.get(A18);
                    }
                    0yf r22 = mk8.A07;
                    if (r22.get(A18) != null) {
                        r22.get(A18);
                    }
                    long A0R2 = AnonymousClass7TE.A0R(mk8.A0B.get(A18));
                    long A0R3 = AnonymousClass7TE.A0R(mk8.A03.get(A18));
                    long A0R4 = AnonymousClass7TE.A0R(mk8.A04.get(A18));
                    0yf r11 = mk8.A0A;
                    if (r11.containsKey(A18)) {
                        r11.get(A18);
                    }
                    if (A0R2 >= 0) {
                        mk8.A0F.getClass();
                        obj.getClass();
                        boolean contains = mk8.A0C.contains(A18);
                        ? obj2 = new Object();
                        obj2.A04 = A0R2;
                        obj2.A03 = A0R;
                        obj2.A01 = A0R3;
                        obj2.A02 = A0R4;
                        obj2.A00 = A0M;
                        obj2.A06 = contains;
                        obj2.A05 = obj;
                        mk8.A0E.A00.Cit(obj2, contains);
                    }
                }
            }
            mk8.A0F = null;
            r12.clear();
            mk8.A02.clear();
            mk8.A05.clear();
            mk8.A0B.clear();
            mk8.A08.clear();
            mk8.A09.clear();
            mk8.A07.clear();
            mk8.A03.clear();
            mk8.A04.clear();
            mk8.A0C.clear();
        }
    }

    public final void A02(C74414PuU puU) {
        C67212Mk8 mk8 = this.A02;
        String BK4 = ((C74414PuU) puU.FKf(this.A00)).BK4(this.A01);
        17k.A07(mk8.A0E, "Must init with a valid delegate first!");
        BK4.getClass();
        if (mk8.A0F != null) {
            mk8.A0C.add(BK4);
        }
    }

    public final void A05(String str) {
        String A0b;
        if (0mp.A0B(str)) {
            A0b = null;
        } else {
            if (this.A01 == null) {
                A0b = AnonymousClass7TF.A0b();
            }
            this.A00 = str;
        }
        this.A01 = A0b;
        this.A00 = str;
    }
}
