package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.WmQ  reason: case insensitive filesystem */
public final class C20166WmQ implements Runnable {
    public final /* synthetic */ AnonymousClass4CO A00;
    public final /* synthetic */ ArrayList A01;

    public C20166WmQ(AnonymousClass4CO r1, ArrayList arrayList) {
        this.A00 = r1;
        this.A01 = arrayList;
    }

    public final void run() {
        ArrayList arrayList = this.A01;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.A00.A0a((V4L) it.next());
        }
        arrayList.clear();
        this.A00.A03.remove(arrayList);
    }
}
