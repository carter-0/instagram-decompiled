package X;

import java.nio.charset.Charset;

/* renamed from: X.9Bb  reason: invalid class name and case insensitive filesystem */
public final class C374859Bb {
    public static final AnonymousClass9Bd A01 = new C374869Bc();
    public final AnonymousClass9Bd A00;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.9Bd, java.lang.Object, X.9Bf] */
    public C374859Bb() {
        AnonymousClass9Bd r0;
        C374879Be r4 = C374879Be.A00;
        try {
            r0 = (AnonymousClass9Bd) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            r0 = A01;
        }
        ? obj = new Object();
        obj.A00 = new AnonymousClass9Bd[]{r4, r0};
        Charset charset = AnonymousClass97S.A04;
        this.A00 = obj;
    }
}
