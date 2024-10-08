package X;

import java.util.regex.Pattern;

/* renamed from: X.MgZ  reason: case insensitive filesystem */
public final class C67001MgZ extends 0Yg implements C62320sa {
    public final int A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67001MgZ(int i, int i2) {
        super(0);
        this.A00 = i2;
        this.A01 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                return new C56838IEj(this.A01);
            case 1:
                return String.valueOf(this.A01);
            case 2:
                Integer num = AnonymousClass05K.A15;
                Pattern compile = Pattern.compile("(?<=[\\s*_~'\"(]|^)(`)(\\S(?:.*?\\S)??)(`)(?=[\\s\\w*_~,.;:!?'\")]|$)");
                0qQ.A07(compile);
                return new C67071Mhm(C67071Mhm.A06, new C67072Mhn(this.A01), num, compile, false, true);
            case 3:
                return new C354128Kt(this.A01);
            default:
                return Integer.valueOf(this.A01);
        }
    }
}
