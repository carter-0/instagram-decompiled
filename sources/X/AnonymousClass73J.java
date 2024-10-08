package X;

import com.instagram.giphy.webp.IgWebPAnim;
import java.io.File;

/* renamed from: X.73J  reason: invalid class name */
public final class AnonymousClass73J implements AnonymousClass734 {
    public final IgWebPAnim A00;

    public final C20997X8u ALs() {
        try {
            return new C14026ToS(this.A00.createDecoder());
        } catch (RuntimeException unused) {
            throw new Exception("Failed to decode animated webp");
        }
    }

    public AnonymousClass73J(String str) {
        AnonymousClass73L r0 = IgWebPAnim.Companion;
        this.A00 = new IgWebPAnim(new File(str));
    }
}
