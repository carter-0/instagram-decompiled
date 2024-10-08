package X;

import com.facebook.stash.core.FileStash;
import java.util.Map;

/* renamed from: X.2jB  reason: invalid class name and case insensitive filesystem */
public final class C227392jB extends 1LQ {
    public final C227152ij A00;

    public final boolean remove(String str) {
        0qQ.A0B(str, 0);
        this.A00.A00.A03(str);
        return this.A00.remove(str);
    }

    public final boolean removeAll() {
        1FL r2 = this.A00.A00;
        1FL.A00(r2);
        Map map = r2.A02;
        synchronized (map) {
            map.clear();
            r2.A00 = true;
        }
        1FL.A01(r2);
        return this.A00.removeAll();
    }

    public C227392jB(FileStash fileStash, C227152ij r2) {
        super(fileStash);
        this.A00 = r2;
    }

    public final boolean remove(String str, int i) {
        0qQ.A0B(str, 0);
        this.A00.A00.A03(str);
        return this.A00.remove(str, i);
    }
}
