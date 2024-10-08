package X;

import android.os.Bundle;

/* renamed from: X.9Th  reason: invalid class name and case insensitive filesystem */
public final class C379299Th implements AnonymousClass05T {
    public final /* synthetic */ AnonymousClass7JD A00;

    public C379299Th(AnonymousClass7JD r1) {
        this.A00 = r1;
    }

    public final boolean D4z(Bundle bundle, AnonymousClass05V r6, int i) {
        0qQ.A0B(r6, 0);
        if ((i & 1) != 0) {
            try {
                r6.A00.A00.requestPermission();
            } catch (RuntimeException e) {
                0KC.A0F("InputConnectionHelper", "failed to acquire content connection permissions", e);
                return false;
            }
        }
        return this.A00.Dbf(r6);
    }
}
