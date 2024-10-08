package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.3ow  reason: invalid class name and case insensitive filesystem */
public abstract class C252333ow extends C252343ox {
    public int A00 = 0;
    public double A01;
    public final Map A02 = new HashMap();
    public final C233402vf A03;
    public final C249863kU A04;

    public 1PW A0M(AnonymousClass30Y r14, C252093oY r15) {
        C252093oY r8 = r15;
        if (r15.CFe(r14) >= 0.5f) {
            C249863kU r6 = this.A04;
            C233472vm A09 = A09(r6.A00().BTb());
            A09.getClass();
            double A002 = A09.A00();
            double A0L = A0L(r15) / 1000.0d;
            this.A05.BtU().A00(A0L);
            if (Double.compare(A0L, A002) >= 0) {
                1PW r9 = new 1PW(AnonymousClass05K.A0C);
                r9.A01("time_rule_did_meet");
                r9.A00 = A0L;
                A0F(r8, r9, r6.A00().BTb(), this.A03.BYj(), A04(r14.A04));
                return r9;
            }
        }
        return 1PW.A0K;
    }

    public abstract boolean A0O(AnonymousClass30Y r1, C252093oY r2);

    public abstract boolean A0Q(String str);

    public final double A0L(C252093oY r7) {
        long j = 0;
        for (Map.Entry value : this.A02.entrySet()) {
            j += ((C254213s7) value.getValue()).A01(r7);
        }
        return ((double) j) + this.A01;
    }

    public final C254213s7 A0N(AnonymousClass30Y r5, C252093oY r6) {
        this.A04.getClass();
        Map map = this.A02;
        String str = r5.A05;
        C254213s7 r2 = (C254213s7) map.get(str);
        if (r2 == null) {
            r2 = new C254213s7();
            if (A0O(r5, r6)) {
                map.put(str, r2);
            }
        }
        if (A0Q(this.A04.BJS(r5.A03))) {
            this.A01 = A0L(r6);
            map.clear();
            r2.A02();
        }
        return r2;
    }

    public boolean A0P(Object obj) {
        this.A04.getClass();
        if (this.A04.CcL(obj) || this.A04.CYA(obj)) {
            return true;
        }
        return false;
    }

    public C252333ow(C233372vc r2, C233402vf r3, C249863kU r4, C233522vr r5, boolean z) {
        super(r2, r5, z);
        this.A04 = r4;
        this.A03 = r3;
    }

    public void A0E(AnonymousClass30Y r3, C252093oY r4, Object obj, int i) {
        boolean A0P = A0P(obj);
        super.A0E(r3, r4, obj, i);
        if (A0P) {
            this.A02.clear();
            this.A01 = 0.0d;
        }
    }
}
