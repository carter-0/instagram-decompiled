package X;

import java.util.List;
import java.util.regex.Matcher;

/* renamed from: X.5gs  reason: invalid class name and case insensitive filesystem */
public final class C291265gs {
    public List A00;
    public final Matcher A01;
    public final C291275gt A02 = new C291275gt(this);
    public final CharSequence A03;

    /* JADX WARNING: type inference failed for: r0v1, types: [X.66s, java.util.List] */
    public final List A00() {
        List list = this.A00;
        if (list != null) {
            return list;
        }
        ? r0 = new C3029666s(this);
        this.A00 = r0;
        return r0;
    }

    public final 2HY A01() {
        Matcher matcher = this.A01;
        return C229632nm.A0C(matcher.start(), matcher.end());
    }

    public final C291265gs A02() {
        Matcher matcher = this.A01;
        int end = matcher.end();
        int i = 0;
        if (matcher.end() == matcher.start()) {
            i = 1;
        }
        int i2 = end + i;
        CharSequence charSequence = this.A03;
        if (i2 > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        0qQ.A07(matcher2);
        if (matcher2.find(i2)) {
            return new C291265gs(charSequence, matcher2);
        }
        return null;
    }

    public C291265gs(CharSequence charSequence, Matcher matcher) {
        this.A01 = matcher;
        this.A03 = charSequence;
    }
}
