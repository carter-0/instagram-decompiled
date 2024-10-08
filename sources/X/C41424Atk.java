package X;

import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.Atk  reason: case insensitive filesystem */
public final /* synthetic */ class C41424Atk implements C62320sa {
    public final /* synthetic */ AnonymousClass80D A00;

    public /* synthetic */ C41424Atk(AnonymousClass80D r1) {
        this.A00 = r1;
    }

    public final Object invoke() {
        ArrayList arrayList = this.A00.A2t;
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return null;
    }
}
