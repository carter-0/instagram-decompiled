package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Qho  reason: case insensitive filesystem */
public final class C8155Qho extends 16Q {
    public int A00 = 1;
    public final 16F[] A01;

    public C8155Qho(16F[] r2) {
        this.A00 = r2[0];
        this.A01 = r2;
    }

    public static C8155Qho A00(16F r1, 16F r2) {
        16F[] r0;
        if (!(r2 instanceof C8155Qho)) {
            r0 = new 16F[]{r1, r2};
        } else {
            ArrayList A14 = DbV.A14(r1);
            ((C8155Qho) r2).A1U(A14);
            r0 = (16F[]) A14.toArray(new 16F[A14.size()]);
        }
        return new C8155Qho(r0);
    }

    public final 16F A0z() {
        16L A10 = this.A00.A10();
        if (A10 == 16L.A0D || A10 == 16L.A0C) {
            int i = 1;
            while (true) {
                16L A1J = A1J();
                if (A1J == null) {
                    break;
                } else if (A1J.A05) {
                    i++;
                } else if (A1J.A04 && i - 1 == 0) {
                    return this;
                }
            }
        }
        return this;
    }

    public final 16L A1J() {
        16F r0 = this.A00;
        if (r0 == null) {
            return null;
        }
        16L A1J = r0.A1J();
        if (A1J == null) {
            do {
                int i = this.A00;
                16F[] r1 = this.A01;
                if (i >= r1.length) {
                    return null;
                }
                this.A00 = i + 1;
                16F r02 = r1[i];
                this.A00 = r02;
                A1J = r02.A1J();
            } while (A1J == null);
        }
        return A1J;
    }

    public final void A1U(List list) {
        C8155Qho[] qhoArr = this.A01;
        int length = qhoArr.length;
        for (int i = this.A00 - 1; i < length; i++) {
            C8155Qho qho = qhoArr[i];
            if (qho instanceof C8155Qho) {
                qho.A1U(list);
            } else {
                list.add(qho);
            }
        }
    }

    public final void close() {
        while (true) {
            this.A00.close();
            int i = this.A00;
            16F[] r1 = this.A01;
            if (i < r1.length) {
                this.A00 = i + 1;
                this.A00 = r1[i];
            } else {
                return;
            }
        }
    }
}
