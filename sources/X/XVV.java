package X;

import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Collections;

public abstract class XVV {
    public static void A00(AnonymousClass46C r4, byte b, int i) {
        if (i <= 0) {
            throw new RuntimeException("Maximum skip depth exceeded");
        } else if (b == 2) {
            r4.A0Z();
        } else if (b == 3) {
            r4.A06();
        } else if (b == 4) {
            r4.A07();
        } else if (b == 6) {
            r4.A0H();
        } else if (b == 8) {
            r4.A09();
        } else if (b != 19) {
            int i2 = 0;
            switch (b) {
                case 10:
                    r4.A0A();
                    return;
                case 11:
                    r4.A0a();
                    return;
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    r4.A0F(Collections.emptyMap());
                    while (true) {
                        byte b2 = r4.A0B().A00;
                        if (b2 == 0) {
                            r4.A0I();
                            return;
                        }
                        A00(r4, b2, i - 1);
                    }
                case 13:
                    C21967Xmy A0D = r4.A0D();
                    while (true) {
                        int i3 = A0D.A02;
                        if (i3 < 0) {
                            throw new RuntimeException("Peeking into a map not supported, likely because it's sized");
                        } else if (i2 < i3) {
                            int i4 = i - 1;
                            A00(r4, A0D.A00, i4);
                            A00(r4, A0D.A01, i4);
                            i2++;
                        } else {
                            return;
                        }
                    }
                case 14:
                    C21962Xmr A0E = r4.A0E();
                    while (true) {
                        int i5 = A0E.A01;
                        if (i5 < 0) {
                            throw new RuntimeException("Peeking into a set not supported, likely because it's sized");
                        } else if (i2 < i5) {
                            A00(r4, A0E.A00, i - 1);
                            i2++;
                        } else {
                            return;
                        }
                    }
                case 15:
                    C21961Xmq A0C = r4.A0C();
                    while (true) {
                        int i6 = A0C.A01;
                        if (i6 < 0) {
                            throw new RuntimeException("Peeking into a list not supported, likely because it's sized");
                        } else if (i2 < i6) {
                            A00(r4, A0C.A00, i - 1);
                            i2++;
                        } else {
                            return;
                        }
                    }
                default:
                    throw new RuntimeException(002.A0O("Invalid type encountered during skipping: ", b));
            }
        } else {
            r4.A08();
        }
    }
}
