package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Ton  reason: case insensitive filesystem */
public final class C14046Ton implements Runnable {
    public final /* synthetic */ AnonymousClass4CO A00;
    public final /* synthetic */ ArrayList A01;

    public C14046Ton(AnonymousClass4CO r1, ArrayList arrayList) {
        this.A00 = r1;
        this.A01 = arrayList;
    }

    public final void run() {
        ArrayList arrayList = this.A01;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.A00.A0W((C249703kE) it.next());
        }
        arrayList.clear();
        this.A00.A01.remove(arrayList);
    }
}
