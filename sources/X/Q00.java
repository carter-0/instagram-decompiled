package X;

import com.facebook.common.stringformat.StringFormatUtil;
import java.io.IOException;

public final class Q00 extends IOException {
    public final int A00;

    public Q00(int i) {
        super(StringFormatUtil.formatStrLocaleSafe("Empty response body with status code %d", Integer.valueOf(i)));
        this.A00 = i;
    }
}
