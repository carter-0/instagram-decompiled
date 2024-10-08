package X;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: X.Pyx  reason: case insensitive filesystem */
public final class C7205Pyx implements C46213DQr {
    public boolean A00;
    public final C7204Pyw A01;
    public final HashSet A02 = AnonymousClass7TE.A1F();

    public final synchronized boolean A8f(String str) {
        if (!this.A00) {
            this.A02.addAll(this.A01.A02());
            this.A00 = true;
        }
        return this.A02.add(str);
    }

    public final synchronized boolean A8g(String str) {
        boolean add;
        if (!this.A00) {
            this.A02.addAll(this.A01.A02());
            this.A00 = true;
        }
        HashSet hashSet = this.A02;
        add = hashSet.add(str);
        ArrayList A012 = this.A01.A01(str);
        if (!A012.isEmpty()) {
            hashSet.removeAll(A012);
        }
        return add;
    }

    public C7205Pyx(Context context) {
        File A0s = JTO.A0s(context.getCacheDir(), "duplicate_notif_id.cache");
        this.A01 = new C7204Pyw(A0s, 4096);
    }
}
