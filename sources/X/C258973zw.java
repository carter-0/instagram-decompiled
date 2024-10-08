package X;

import com.facebook.odin.model.FeatureData;
import com.facebook.odin.model.OdinContext;
import com.facebook.odin.model.Type;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/* renamed from: X.3zw  reason: invalid class name and case insensitive filesystem */
public final class C258973zw implements C258943zt {
    public final AnonymousClass0JP A00;

    public C258973zw(AnonymousClass0JP r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final AnonymousClass40G ATg(OdinContext odinContext) {
        long now = (this.A00.now() / 1000) * 1000;
        C255463uA[] r0 = FeatureData.A0E;
        Type type = Type.LONG;
        Date date = new Date(now);
        Calendar instance = Calendar.getInstance();
        0qQ.A07(instance);
        instance.setTime(date);
        int i = instance.get(1);
        int i2 = instance.get(2);
        int i3 = instance.get(5);
        instance.clear();
        instance.set(i, i2, i3);
        Date time = instance.getTime();
        0qQ.A07(time);
        List singletonList = Collections.singletonList(new FeatureData(type, "2620", (String) null, (List) null, 0.0d, 16376, now - time.getTime()));
        0qQ.A07(singletonList);
        return new AnonymousClass40G(singletonList, (String) null, true);
    }

    public final String getId() {
        return "DateTime";
    }
}
