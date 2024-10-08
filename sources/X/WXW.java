package X;

import com.instagram.giphy.webp.IgWebPAnim;
import java.io.File;

public final class WXW implements AnonymousClass734 {
    public final IgWebPAnim A00;
    public final Integer A01;

    public WXW(String str, Integer num) {
        0qQ.A0B(str, 1);
        this.A01 = num;
        AnonymousClass73L r0 = IgWebPAnim.Companion;
        this.A00 = new IgWebPAnim(new File(str));
    }

    public final C20997X8u ALs() {
        try {
            return new WXU(this.A00.createDecoder(), this.A01);
        } catch (RuntimeException unused) {
            throw new Exception(C273654mx.A00(1263));
        }
    }
}
