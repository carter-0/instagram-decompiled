package X;

import java.util.Collection;
import java.util.Set;

/* renamed from: X.5Pf  reason: invalid class name and case insensitive filesystem */
public class C284985Pf<K, V> extends 0sw<K, V> implements C284995Pg<K, V> {
    public static final C284985Pf A02 = new C284985Pf(C285005Ph.A04, 0);
    public final C285005Ph A00;
    public final int A01;

    public final int A00() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ Collection A01() {
        return new C22477Y5w(this);
    }

    public final Set A02() {
        return new C294295mD(this);
    }

    public final /* bridge */ /* synthetic */ Set A03() {
        return new Y68(this);
    }

    public final C284985Pf A04(Object obj, Object obj2) {
        int i;
        C285005Ph r2 = this.A00;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        C285125Pv A0C = r2.A0C(obj, obj2, i, 0);
        if (A0C == null) {
            return this;
        }
        return new C284985Pf(A0C.A00, size() + A0C.A01);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.5Yb, X.5Ya, X.5YZ] */
    public final /* bridge */ /* synthetic */ C286855Yb AEp() {
        if (!(this instanceof AnonymousClass5RL)) {
            return new C286845Ya(this);
        }
        AnonymousClass5RL r1 = (AnonymousClass5RL) this;
        ? r0 = new C286845Ya(r1);
        r0.A00 = r1;
        return r0;
    }

    public boolean containsKey(Object obj) {
        int i;
        C285005Ph r2 = this.A00;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return r2.A0K(obj, i, 0);
    }

    public Object get(Object obj) {
        int i;
        C285005Ph r2 = this.A00;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return r2.A0J(i, obj, 0);
    }

    public C284985Pf(C285005Ph r1, int i) {
        this.A00 = r1;
        this.A01 = i;
    }
}
