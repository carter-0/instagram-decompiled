package X;

import java.util.Map;
import java.util.Random;

/* renamed from: X.4yX  reason: invalid class name and case insensitive filesystem */
public final class C279374yX implements C279334yT {
    public final Random A00 = new Random();
    public final C279364yW A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.Thm] */
    public final C13818Thm B2F(Integer num) {
        C13818Thm sol;
        0qQ.A0B(num, 0);
        if (this.A00.nextInt(10) != 0) {
            return new Object();
        }
        if (num.equals(AnonymousClass05K.A01)) {
            sol = new C12195Sok(this.A01, num, this.A02);
        } else {
            sol = new C12196Sol(this.A01, num, this.A03);
        }
        return sol;
    }

    public final void EFt(Integer num, String str, Map map) {
        0qQ.A0B(num, 0);
        0qQ.A0B(str, 1);
        0qQ.A0B(map, 2);
        C13818Thm B2F = B2F(num);
        if (B2F.isSampled()) {
            for (Map.Entry entry : map.entrySet()) {
                B2F.ABT((String) entry.getKey(), (String) entry.getValue());
            }
            B2F.A9M(str);
            B2F.report();
        }
    }

    public final void EGq(Integer num, String str, Map map) {
        0qQ.A0B(num, 0);
        0qQ.A0B(str, 1);
        0qQ.A0B(map, 2);
        C13818Thm B2F = B2F(num);
        if (B2F.isSampled()) {
            for (Map.Entry entry : map.entrySet()) {
                B2F.ABT((String) entry.getKey(), (String) entry.getValue());
            }
            B2F.A8R(new Exception(str));
            B2F.report();
        }
    }

    public C279374yX(C279364yW r2, AnonymousClass0eM r3, AnonymousClass0eM r4) {
        this.A03 = r3;
        this.A02 = r4;
        this.A01 = r2;
    }
}
