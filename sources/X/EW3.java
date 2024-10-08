package X;

import java.util.Arrays;
import java.util.List;

public enum EW3 {
    A05("publish_actions"),
    A03("email"),
    A07(new String[0]),
    A06("manage_pages", "publish_actions", "publish_pages"),
    A04("manage_pages", "publish_actions", "publish_pages", "email");
    
    public List A00;

    /* access modifiers changed from: public */
    static {
        EW3[] ew3Arr;
        A01 = 0oU.A00(ew3Arr);
    }

    /* access modifiers changed from: public */
    EW3(String... strArr) {
        this.A00 = 0sr.A1P(Arrays.copyOf(strArr, strArr.length));
    }
}
