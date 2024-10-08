package X;

import java.util.List;

/* renamed from: X.7Ex  reason: invalid class name and case insensitive filesystem */
public final class C328467Ex implements Runnable {
    public final /* synthetic */ AnonymousClass7ZX A00;
    public final /* synthetic */ List A01;

    public C328467Ex(AnonymousClass7ZX r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public final void run() {
        AnonymousClass7ZX r1 = this.A00;
        if (!r1.A0W) {
            r1.A0W = true;
            1y1.A00(r1.A0g).A06(r1.A0f.getModuleName(), this.A01);
            return;
        }
        1y1.A00(r1.A0g).A05(r1.A0f.getModuleName(), this.A01);
    }
}
