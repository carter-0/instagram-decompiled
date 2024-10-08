package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.regex.Matcher;

/* renamed from: X.5gt  reason: invalid class name and case insensitive filesystem */
public final class C291275gt extends 0sz implements Collection, C62650uo {
    public final /* synthetic */ C291265gs A00;

    public final boolean isEmpty() {
        return false;
    }

    public C291275gt(C291265gs r1) {
        this.A00 = r1;
    }

    public final int A08() {
        return this.A00.A01.groupCount() + 1;
    }

    public final C291285gu A09(int i) {
        Matcher matcher = this.A00.A01;
        2HY A0C = C229632nm.A0C(matcher.start(i), matcher.end(i));
        if (A0C.A00 < 0) {
            return null;
        }
        String group = matcher.group(i);
        0qQ.A07(group);
        return new C291285gu(group, A0C);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null || (obj instanceof C291285gu)) {
            return C291275gt.super.contains(obj);
        }
        return false;
    }

    public final Iterator iterator() {
        return new AnonymousClass3T4(C242173Sx.A0E(new J6L(this, 24), 00k.A0o(0sr.A1R(this))));
    }
}
