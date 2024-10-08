package X;

import java.util.Map;

/* renamed from: X.5nd  reason: invalid class name and case insensitive filesystem */
public final class C295135nd implements AnonymousClass66d {
    public final /* synthetic */ C295115nb A00;

    public C295135nd(C295115nb r1) {
        this.A00 = r1;
    }

    public final void onNewNotification(String str, AnonymousClass2Lq r6, Map map) {
        if (r6 != null) {
            C295115nb r3 = this.A00;
            C295145ne r2 = (C295145ne) r3.A02.remove(r6);
            if (r2 != null) {
                r3.A01.removeObserver(r3.A00, str, r6);
                r2.DfW(map);
            }
        }
    }
}
