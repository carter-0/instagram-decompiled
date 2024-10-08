package X;

import com.facebook.odin.model.FeatureData;
import com.facebook.odin.model.OdinContext;
import com.facebook.odin.model.Type;
import java.util.ArrayList;
import java.util.List;

public final class AT6 implements C258943zt {
    public final C59721JVf A00;
    public final C2604745u A01;

    public AT6(C59721JVf jVf, C2604745u r3) {
        0qQ.A0B(r3, 1);
        this.A01 = r3;
        this.A00 = jVf;
    }

    public final String getId() {
        return "RelaxedSharedPrefs";
    }

    public final AnonymousClass40G ATg(OdinContext odinContext) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        C59721JVf jVf = this.A00;
        for (String str : (List) jVf.A01) {
            long A002 = this.A01.A00(str, Long.MAX_VALUE);
            if (A002 != Long.MAX_VALUE) {
                A1C.add(new FeatureData(Type.LONG, str, (String) null, (List) null, 0.0d, 16376, A002));
            }
        }
        for (String str2 : (List) jVf.A00) {
            C2604745u r3 = this.A01;
            0qQ.A0B(str2, 0);
            float f = r3.A00.getFloat(002.A0T("scroll_speed", str2, '_'), Float.MAX_VALUE);
            if (AnonymousClass7TE.A00(Float.MAX_VALUE, f) >= 1.0E-4f) {
                A1C.add(new FeatureData(Type.DOUBLE, str2, (String) null, (List) null, (double) f, 16372, 0));
            }
        }
        return new AnonymousClass40G(A1C, (String) null, true);
    }
}
