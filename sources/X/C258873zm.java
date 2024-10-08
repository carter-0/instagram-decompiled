package X;

import java.util.Set;

/* renamed from: X.3zm  reason: invalid class name and case insensitive filesystem */
public final class C258873zm implements C258883zn {
    public final C227392jB A00;
    public final Set A01;

    public final void E5K(String str, String str2, long j) {
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 1);
        byte[] bytes = str2.getBytes(AnonymousClass15Q.A05);
        0qQ.A07(bytes);
        C227392jB r0 = this.A00;
        r0.write(str, bytes);
        r0.A00.A00.A04(str, Long.valueOf(System.currentTimeMillis() + j), "eviction_timestamps");
    }

    public final String getString(String str) {
        0qQ.A0B(str, 0);
        C227392jB r1 = this.A00;
        if (r1.hasKey(str)) {
            byte[] readResourceToMemory = r1.readResourceToMemory(str);
            if (readResourceToMemory == null) {
                readResourceToMemory = new byte[0];
            }
            return new String(readResourceToMemory, AnonymousClass15Q.A05);
        }
        throw new Exception("no such key");
    }

    public C258873zm(C227392jB r2) {
        this.A00 = r2;
        r2.getItemCount();
        Set allKeys = r2.getAllKeys();
        0qQ.A07(allKeys);
        this.A01 = allKeys;
        r2.getSizeBytes();
    }
}
