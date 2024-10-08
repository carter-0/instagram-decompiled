package X;

import java.nio.charset.Charset;

/* renamed from: X.5Kx  reason: invalid class name and case insensitive filesystem */
public final class C284085Kx implements C284095Ky {
    public static final AnonymousClass5L0 A01 = new C284105Kz();
    public final AnonymousClass5L0 A00;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.5L2, java.lang.Object, X.5L0] */
    public C284085Kx() {
        AnonymousClass5L0 r0;
        AnonymousClass5L1 r4 = AnonymousClass5L1.A00;
        try {
            r0 = (AnonymousClass5L0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            r0 = A01;
        }
        ? obj = new Object();
        obj.A00 = new AnonymousClass5L0[]{r4, r0};
        Charset charset = C284045Ks.A03;
        this.A00 = obj;
    }
}
