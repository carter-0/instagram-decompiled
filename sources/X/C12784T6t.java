package X;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/* renamed from: X.T6t  reason: case insensitive filesystem */
public final class C12784T6t implements C276424tJ {
    public Integer A00;
    public Object A01;
    public String A02;
    public final Stack A03;
    public final Stack A04;
    public final 16F A05;
    public final T6u A06 = new Object();

    /* JADX WARNING: type inference failed for: r0v1, types: [X.T6u, java.lang.Object] */
    public C12784T6t(16F r4, Iterator it) {
        0qQ.A0B(it, 1);
        this.A05 = r4;
        Stack stack = new Stack();
        this.A04 = stack;
        Stack stack2 = new Stack();
        this.A03 = stack2;
        stack.add(it);
        stack2.add(REZ.ReadObject);
    }

    public final Integer Crg() {
        REZ rez;
        Integer num;
        this.A02 = null;
        this.A00 = null;
        Stack stack = this.A03;
        REZ rez2 = (REZ) stack.peek();
        Stack stack2 = this.A04;
        Iterator it = (Iterator) stack2.peek();
        if (rez2 != null) {
            int ordinal = rez2.ordinal();
            if (ordinal == 0) {
                this.A00 = AnonymousClass05K.A0C;
                stack.pop();
                rez = REZ.ObjectReadName;
                stack.push(rez);
            } else if (ordinal != 1) {
                if (ordinal == 2) {
                    stack.pop();
                    stack.push(REZ.ObjectReadName);
                } else if (ordinal == 3) {
                    this.A00 = AnonymousClass05K.A00;
                    stack.pop();
                    rez = REZ.ArrayReadValue;
                    stack.push(rez);
                } else if (ordinal == 4) {
                    this.A01 = null;
                    if (it.hasNext()) {
                        this.A01 = it.next();
                    } else {
                        this.A00 = AnonymousClass05K.A01;
                        stack2.pop();
                        stack.pop();
                    }
                }
                Object obj = this.A01;
                if (obj == null) {
                    num = AnonymousClass05K.A1I;
                } else if (obj instanceof Boolean) {
                    num = AnonymousClass05K.A1F;
                } else if (obj instanceof Number) {
                    num = AnonymousClass05K.A15;
                } else if (obj instanceof String) {
                    num = AnonymousClass05K.A0j;
                } else if (obj instanceof List) {
                    stack2.push(C51966G9m.A1H(obj));
                    stack.push(REZ.ArrayReadValue);
                    num = AnonymousClass05K.A00;
                } else if (obj instanceof Map) {
                    stack2.push(AnonymousClass7TF.A0u((Map) obj));
                    stack.push(REZ.ObjectReadName);
                    num = AnonymousClass05K.A0C;
                } else {
                    throw C66582MXn.A0k(obj, "unknown value type ", AnonymousClass7TE.A1A());
                }
                this.A00 = num;
            } else {
                this.A01 = null;
                if (it.hasNext()) {
                    Object next = it.next();
                    0qQ.A0C(next, "null cannot be cast to non-null type kotlin.collections.Map.Entry<*, *>");
                    Map.Entry entry = (Map.Entry) next;
                    String A13 = DbT.A13(entry);
                    this.A02 = A13;
                    if (A13 == null) {
                        1Kn.A02("bloks_null_name", "Field name should not be null");
                    }
                    this.A01 = entry.getValue();
                    this.A00 = AnonymousClass05K.A0Y;
                    stack.pop();
                    rez = REZ.ObjectReadValue;
                    stack.push(rez);
                } else {
                    this.A00 = AnonymousClass05K.A0N;
                    stack.pop();
                    stack2.pop();
                }
            }
            Integer num2 = this.A00;
            if (num2 != null) {
                return num2;
            }
            throw new IOException();
        }
        throw AnonymousClass7TE.A1K();
    }

    public final Object AwB() {
        return this.A05;
    }

    public final String E2H() {
        if (this.A02 == null) {
            1Kn.A02("bloks_null_name", "Field name should not be null");
        }
        return this.A02;
    }

    public final Integer E2K() {
        Integer num = this.A00;
        if (num != null) {
            return num;
        }
        throw new IOException();
    }

    public final C276444tL E2L() {
        T6u t6u = this.A06;
        Object obj = this.A01;
        if (obj != null) {
            t6u.A00 = obj;
            return t6u;
        }
        throw new IOException();
    }

    public final void Evn() {
        Integer E2K = E2K();
        Integer num = AnonymousClass05K.A00;
        if (E2K == num || E2K() == AnonymousClass05K.A0C) {
            int i = 1;
            while (true) {
                Integer Crg = Crg();
                if (Crg == num || Crg == AnonymousClass05K.A0C) {
                    i++;
                } else if (Crg == AnonymousClass05K.A01 || Crg == AnonymousClass05K.A0N) {
                    i--;
                }
                if (i == 0) {
                    return;
                }
            }
        }
    }
}
