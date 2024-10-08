package X;

import android.text.TextUtils;
import java.util.Collections;
import java.util.List;

public final class S0P {
    public final List A00;

    public final String toString() {
        return TextUtils.join(",", this.A00.toArray());
    }

    public S0P(List list) {
        this.A00 = Collections.unmodifiableList(AnonymousClass7TE.A1D(list));
    }
}
