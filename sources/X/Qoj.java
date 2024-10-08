package X;

import com.facebook.react.modules.intent.IntentModule;
import java.util.HashMap;

public final class Qoj extends C11335SNp {
    public long A00;
    public String A01;
    public String A02;
    public String A03;

    public final String toString() {
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("category", this.A01);
        A1E.put("action", this.A03);
        A1E.put("label", this.A02);
        return C11335SNp.A01(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, Long.valueOf(this.A00), A1E);
    }
}
