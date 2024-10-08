package X;

import com.google.android.gms.common.Feature;

public final class TRT extends UnsupportedOperationException {
    public final Feature A00;

    public final String getMessage() {
        return "Missing ".concat(String.valueOf(String.valueOf(this.A00)));
    }

    public TRT(Feature feature) {
        this.A00 = feature;
    }
}
