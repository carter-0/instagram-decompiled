package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4Yg  reason: invalid class name and case insensitive filesystem */
public final class C266274Yg implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C263694Mz A01;
    public final /* synthetic */ AnonymousClass4Yf A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ boolean A05;

    public C266274Yg(C263694Mz r1, AnonymousClass4Yf r2, String str, List list, long j, boolean z) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = j;
        this.A03 = str;
        this.A04 = list;
        this.A05 = z;
    }

    public final void run() {
        Iterator it = this.A01.A00.iterator();
        while (it.hasNext()) {
            C263654Mv r2 = (C263654Mv) it.next();
            AnonymousClass4Yf r3 = this.A02;
            long j = this.A00;
            String str = this.A03;
            List list = this.A04;
            if (list == null) {
                list = new ArrayList();
            }
            r2.DAN(r3, str, list, j, this.A05);
        }
    }
}
