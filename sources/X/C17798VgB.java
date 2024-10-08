package X;

import com.facebook.common.stringformat.StringFormatUtil;

/* renamed from: X.VgB  reason: case insensitive filesystem */
public final class C17798VgB {
    public final C16519UwO A00;
    public final String A01;

    public final String toString() {
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("[%s:%s]", this.A00, this.A01);
        0qQ.A07(formatStrLocaleSafe);
        return formatStrLocaleSafe;
    }

    public C17798VgB(C16519UwO uwO, String str) {
        this.A00 = uwO;
        this.A01 = str;
    }
}
