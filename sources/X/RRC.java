package X;

public abstract class RRC {
    public final RRC A00(String str, 0sP r9) {
        if (!(this instanceof C7482QFl)) {
            return this;
        }
        C7482QFl qFl = (C7482QFl) this;
        Object obj = qFl.A02;
        if (C51971G9r.A1a(obj, r9)) {
            return qFl;
        }
        return new C7483QFm(qFl.A00, qFl.A01, obj, qFl.A03, str);
    }

    public final Object A01() {
        if (this instanceof C7482QFl) {
            return ((C7482QFl) this).A02;
        }
        C7483QFm qFm = (C7483QFm) this;
        int intValue = qFm.A01.intValue();
        if (intValue == 0) {
            throw qFm.A00;
        } else if (intValue == 1) {
            String str = qFm.A04;
            Object obj = qFm.A02;
            String str2 = qFm.A03;
            0qQ.A0B(obj, 0);
            0qQ.A0B(str2, 1);
            String A0m = AnonymousClass7TG.A0m(obj, " value: ", AnonymousClass7TF.A0n(str2));
            0qQ.A0B(str, 0);
            0qQ.A0B(A0m, 1);
            return null;
        } else if (intValue == 2) {
            return null;
        } else {
            throw AnonymousClass7TE.A1K();
        }
    }
}
