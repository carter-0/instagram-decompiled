package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public final class Q4O implements C276424tJ {
    public Integer A00;
    public Object A01;
    public String A02;
    public final Stack A03;
    public final Stack A04;
    public final C276804tv A05;
    public final C307896Rx A06;
    public final C12785T6v A07 = new Object();

    public final Integer Crg() {
        RES res;
        Integer num;
        this.A02 = null;
        this.A00 = null;
        Stack stack = this.A03;
        Stack stack2 = this.A04;
        Iterator it = (Iterator) stack2.peek();
        int ordinal = ((RES) stack.peek()).ordinal();
        if (ordinal == 0) {
            this.A00 = AnonymousClass05K.A0C;
            stack.pop();
            res = RES.ObjectReadName;
            stack.push(res);
        } else if (ordinal != 1) {
            if (ordinal == 2) {
                stack.pop();
                stack.push(RES.ObjectReadName);
            } else if (ordinal == 3) {
                this.A00 = AnonymousClass05K.A00;
                stack.pop();
                res = RES.ArrayReadValue;
                stack.push(res);
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
            } else if (obj instanceof C280064zw) {
                num = AnonymousClass05K.A0u;
            } else if (obj instanceof String) {
                num = AnonymousClass05K.A0j;
            } else if (obj instanceof List) {
                stack2.push(((List) obj).iterator());
                stack.push(RES.ArrayReadValue);
                num = AnonymousClass05K.A00;
            } else if (obj instanceof Map) {
                stack2.push(((Map) obj).entrySet().iterator());
                stack.push(RES.ObjectReadName);
                num = AnonymousClass05K.A0C;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("unknown value type");
                sb.append(obj);
                throw new IllegalStateException(sb.toString());
            }
            this.A00 = num;
        } else {
            this.A01 = null;
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                this.A02 = (String) entry.getKey();
                this.A01 = entry.getValue();
                this.A00 = AnonymousClass05K.A0Y;
                stack.pop();
                res = RES.ObjectReadValue;
                stack.push(res);
            } else {
                this.A00 = AnonymousClass05K.A0N;
                stack.pop();
                stack2.pop();
            }
        }
        return this.A00;
    }

    public final Object AwB() {
        if (this.A05 != null) {
            C307896Rx r1 = this.A06;
            Object obj = this.A01;
            0qQ.A0A(r1);
            DbS.A1Y(obj);
            return C276764tr.A00(r1, (String) obj);
        }
        throw AnonymousClass7TE.A0z("Attempted to get a delegate parser when none exists.");
    }

    public final String E2H() {
        return this.A02;
    }

    public final Integer E2K() {
        return this.A00;
    }

    public final C276444tL E2L() {
        C12785T6v t6v = this.A07;
        t6v.A00 = this.A01;
        return t6v;
    }

    public final void Evn() {
        Integer num = this.A00;
        Integer num2 = AnonymousClass05K.A00;
        if (num == num2 || num == AnonymousClass05K.A0C) {
            int i = 1;
            while (true) {
                Integer Crg = Crg();
                if (Crg == num2 || Crg == AnonymousClass05K.A0C) {
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

    /* JADX WARNING: type inference failed for: r0v0, types: [X.T6v, java.lang.Object] */
    public Q4O(C276804tv r4, C307896Rx r5, Iterator it) {
        Stack stack = new Stack();
        this.A04 = stack;
        Stack stack2 = new Stack();
        this.A03 = stack2;
        this.A06 = r5;
        stack.add(it);
        stack2.add(RES.ReadObject);
        this.A05 = r4;
    }
}
