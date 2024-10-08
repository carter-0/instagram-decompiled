package X;

import com.facebook.common.stringformat.StringFormatUtil;

public final class S2C {
    public String A00;
    public String A01;
    public String A02;

    public final String toString() {
        return StringFormatUtil.formatStrLocaleSafe("Name %s, hash %s, url %s", this.A02, this.A01, this.A00);
    }
}
