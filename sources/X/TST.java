package X;

import java.util.HashMap;
import java.util.Locale;

public final class TST extends HashMap<String, C8218QkR> {
    public final Locale A00;

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return super.get(((String) obj).toLowerCase(this.A00));
    }

    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return super.put(((String) obj).toLowerCase(this.A00), obj2);
    }

    public TST(Locale locale) {
        this.A00 = locale;
    }

    @Deprecated
    public TST() {
        this(Locale.getDefault());
    }
}
