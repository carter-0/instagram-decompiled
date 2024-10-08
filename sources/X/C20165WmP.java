package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.WmP  reason: case insensitive filesystem */
public final class C20165WmP implements Runnable {
    public final /* synthetic */ AnonymousClass4CO A00;
    public final /* synthetic */ ArrayList A01;

    public C20165WmP(AnonymousClass4CO r1, ArrayList arrayList) {
        this.A00 = r1;
        this.A01 = arrayList;
    }

    public final void run() {
        ArrayList arrayList = this.A01;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C16737V3u v3u = (C16737V3u) it.next();
            this.A00.A0Z(v3u.A04, v3u.A00, v3u.A01, v3u.A02, v3u.A03);
        }
        arrayList.clear();
        this.A00.A05.remove(arrayList);
    }
}
