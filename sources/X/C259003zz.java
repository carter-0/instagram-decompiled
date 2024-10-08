package X;

import com.facebook.odin.model.OdinContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.3zz  reason: invalid class name and case insensitive filesystem */
public final class C259003zz implements C258943zt {
    public final C258993zy A00;
    public final String A01;
    public final List A02;

    public C259003zz(C258993zy r2, String str, List list) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A02 = list;
        this.A00 = r2;
    }

    public final AnonymousClass40G ATg(OdinContext odinContext) {
        C258993zy r4 = this.A00;
        if (r4 != null) {
            r4.A00();
        }
        ArrayList arrayList = new ArrayList();
        for (C258943zt r0 : this.A02) {
            AnonymousClass40G ATg = r0.ATg(odinContext);
            if (r4 != null) {
                r4.A03(002.A0R("extracted_", r0.getId()), String.valueOf(ATg.A02));
            }
            if (ATg.A02) {
                arrayList.addAll((Collection) ATg.A00);
            }
        }
        if (r4 != null) {
            r4.A04(true, (String) null);
        }
        return new AnonymousClass40G(arrayList, (String) null, true);
    }

    public final String getId() {
        return this.A01;
    }
}
