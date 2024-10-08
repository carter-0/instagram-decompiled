package X;

import com.facebook.common.stringformat.StringFormatUtil;

/* renamed from: X.3L6  reason: invalid class name */
public final class AnonymousClass3L6 implements AnonymousClass3L3 {
    public int A00;
    public int A01;
    public final AnonymousClass3L5 A02;
    public final AnonymousClass0eK A03;

    public final String Ara() {
        int i = this.A00 + 1;
        this.A00 = i;
        if (i > this.A02.A00) {
            this.A01++;
            this.A00 = 0;
        }
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%d&%s&%d", 1, this.A03.get(), Integer.valueOf(this.A01));
        if (!0qQ.A0K(formatStrLocaleSafe, C298095ss.A00)) {
            C298095ss.A00 = formatStrLocaleSafe;
        }
        0qQ.A0A(formatStrLocaleSafe);
        return formatStrLocaleSafe;
    }

    public AnonymousClass3L6(AnonymousClass3L5 r1, AnonymousClass0eK r2) {
        this.A03 = r2;
        this.A02 = r1;
    }
}
