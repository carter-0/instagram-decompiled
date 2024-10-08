package X;

import com.facebook.odin.model.FeatureData;
import com.facebook.odin.model.OdinContext;
import com.facebook.odin.model.Type;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3zx  reason: invalid class name and case insensitive filesystem */
public final class C258983zx implements C258943zt {
    public final 0xa A00;
    public final AnonymousClass0JP A01;

    public C258983zx(AnonymousClass0JP r2, 0xa r3) {
        0qQ.A0B(r3, 1);
        0qQ.A0B(r2, 2);
        this.A00 = r3;
        this.A01 = r2;
    }

    public final AnonymousClass40G ATg(OdinContext odinContext) {
        ArrayList arrayList = new ArrayList();
        long now = this.A01.now();
        0xa r4 = this.A00;
        long j = r4.getLong("last_app_foreground_timestamp", -1);
        if (j != -1) {
            arrayList.add(new FeatureData(Type.LONG, "3614", (String) null, (List) null, 0.0d, 16376, (now - j) / 1000));
        }
        long j2 = r4.getLong("last_app_background_timestamp", -1);
        if (j2 != -1) {
            arrayList.add(new FeatureData(Type.LONG, "3613", (String) null, (List) null, 0.0d, 16376, (now - j2) / 1000));
        }
        if (arrayList.isEmpty()) {
            return new AnonymousClass40G(0sn.A00, "no time since foreground background signals available", false);
        }
        return new AnonymousClass40G(arrayList, (String) null, true);
    }

    public final String getId() {
        return "TimeSinceAppForegroundBackground";
    }
}
