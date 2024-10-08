package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.7fE  reason: invalid class name and case insensitive filesystem */
public final class C336817fE extends 0Yg implements 0sP {
    public static final C336817fE A00 = new C336817fE();

    public C336817fE() {
        super(1);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, X.7hN, X.7hM] */
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C62320sa r1;
        C336597es r6 = (C336597es) ((C337887h4) obj).A01;
        C251263mp r5 = r6.A02;
        if (r5 == null && ((r1 = r6.A04) == null || (r5 = (C251263mp) r1.invoke()) == null)) {
            return null;
        }
        ? obj2 = new Object();
        boolean z = r6.A05;
        if (z) {
            obj2.A00(Boolean.valueOf(z), "is_full_span");
        }
        obj2.A00(r6.A03, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        float f = r6.A01;
        if (0.0f <= f && f <= 100.0f) {
            obj2.A00(Float.valueOf(f), "parent_width_percent");
        }
        float f2 = r6.A00;
        if (0.0f <= f2 && f2 <= 100.0f) {
            obj2.A00(Float.valueOf(f2), "parent_height_percent");
        }
        obj2.A00 = r5;
        return new C338347ho(obj2);
    }
}
