package X;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: X.Pyy  reason: case insensitive filesystem */
public final class C7206Pyy implements C46213DQr {
    public C7204Pyw A00;
    public boolean A01;
    public final HashSet A02 = AnonymousClass7TE.A1F();

    public final synchronized boolean A8f(String str) {
        boolean z;
        z = false;
        0qQ.A0B(str, 0);
        if (!this.A01) {
            this.A02.addAll(this.A00.A02());
            this.A01 = true;
        }
        String A022 = 0mp.A02(str);
        if (A022 != null) {
            z = this.A02.add(A022);
        }
        return z;
    }

    public final synchronized boolean A8g(String str) {
        boolean z;
        z = false;
        0qQ.A0B(str, 0);
        if (!this.A01) {
            this.A02.addAll(this.A00.A02());
            this.A01 = true;
        }
        String A022 = 0mp.A02(str);
        if (A022 != null) {
            HashSet hashSet = this.A02;
            z = hashSet.add(A022);
            ArrayList A012 = this.A00.A01(A022);
            if (!A012.isEmpty()) {
                hashSet.removeAll(A012);
            }
        }
        return z;
    }

    public C7206Pyy(File file, int i) {
        this.A00 = new C7204Pyw(file, Integer.valueOf(i));
    }
}
