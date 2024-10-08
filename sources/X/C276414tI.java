package X;

import com.instagram.react.modules.base.IgReactQEModule;
import java.io.IOException;

/* renamed from: X.4tI  reason: invalid class name and case insensitive filesystem */
public final class C276414tI implements C276424tJ {
    public final 16F A00;
    public final C276434tK A01 = new Object();

    public final Object AwB() {
        return this.A00;
    }

    public final Integer Crg() {
        this.A00.A1J();
        return E2K();
    }

    public final String E2H() {
        String A0q = this.A00.A0q();
        if (A0q != null) {
            return A0q;
        }
        throw new IOException("Parsed field has unexpected null name");
    }

    public final Integer E2K() {
        16L A11 = this.A00.A11();
        if (A11 != null) {
            switch (A11.ordinal()) {
                case 0:
                    return AnonymousClass05K.A02;
                case 1:
                    return AnonymousClass05K.A0C;
                case 2:
                    return AnonymousClass05K.A0N;
                case 3:
                    return AnonymousClass05K.A00;
                case 4:
                    return AnonymousClass05K.A01;
                case 5:
                    return AnonymousClass05K.A0Y;
                case 6:
                    throw new IllegalStateException("embedded object is not supported");
                case 7:
                    return AnonymousClass05K.A0j;
                case 8:
                case 9:
                    return AnonymousClass05K.A15;
                case 10:
                case 11:
                    return AnonymousClass05K.A1F;
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    return AnonymousClass05K.A1I;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("unknown token");
        sb.append(A11);
        throw new IllegalStateException(sb.toString());
    }

    public final C276444tL E2L() {
        C276434tK r1 = this.A01;
        r1.A00 = this.A00;
        return r1;
    }

    public final void Evn() {
        this.A00.A0z();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4tK, java.lang.Object] */
    public C276414tI(16F r2) {
        this.A00 = r2;
    }
}
