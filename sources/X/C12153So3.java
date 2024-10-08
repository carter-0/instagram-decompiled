package X;

import com.facebook.odin.model.FeatureData;
import com.facebook.odin.model.OdinContext;
import com.facebook.odin.model.Type;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.So3  reason: case insensitive filesystem */
public final class C12153So3 implements C258943zt {
    public final Double A00;
    public final String A01;
    public final String A02;

    public final String getId() {
        return this.A02;
    }

    public C12153So3(Double d, String str, String str2) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = d;
    }

    public final AnonymousClass40G ATg(OdinContext odinContext) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        Double d = this.A00;
        if (d != null) {
            A1C.add(new FeatureData((Type) null, this.A01, (String) null, (List) null, d.doubleValue(), 16374, 0));
        }
        if (A1C.isEmpty()) {
            return new AnonymousClass40G(0sn.A00, "scroll speed config parse error", false);
        }
        return Pxf.A0M(A1C);
    }
}
