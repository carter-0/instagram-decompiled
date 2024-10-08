package X;

import java.util.HashMap;

/* renamed from: X.ATy  reason: case insensitive filesystem */
public final class C40158ATy implements C353688Ir {
    public final int A00;

    public C40158ATy(int i) {
        this.A00 = i;
    }

    public final void Ew7(String str, String str2, Throwable th) {
        if (this.A00 != 0) {
            0kD.A0I("SceneUnderstandingResourceLoader", th, AnonymousClass7TF.A0w("SceneUnderstandingResourceLoader", str2));
            return;
        }
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("SceneUnderstandingResourceLoader", str2);
        0kD.A0I("SceneUnderstandingResourceLoader", (Throwable) null, A1E);
    }
}
