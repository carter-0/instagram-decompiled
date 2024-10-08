package X;

import org.json.JSONException;

/* renamed from: X.PqC  reason: case insensitive filesystem */
public final class C74170PqC extends 0Yg implements 0sP {
    public static final C74170PqC A00 = new C74170PqC();

    public C74170PqC() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        byte[] bArr = (byte[]) obj;
        0qQ.A0B(bArr, 0);
        try {
            return C66580MXl.A17(new String(bArr, AnonymousClass15Q.A05));
        } catch (JSONException unused) {
            return null;
        }
    }
}
