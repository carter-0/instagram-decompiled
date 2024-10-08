package X;

import java.io.File;
import java.io.FileDescriptor;

public final class LOF {
    public static final C63575KzO A06 = new C63575KzO(4);
    public static final C63575KzO A07 = new C63575KzO(0);
    public static final C63575KzO A08 = new C63575KzO(1);
    public static final C63575KzO A09 = new C63575KzO(2);
    public static final C63575KzO A0A = new C63575KzO(3);
    public static final C63575KzO A0B = new C63575KzO(5);
    public final int A00;
    public final LOF A01;
    public final File A02;
    public final FileDescriptor A03;
    public final String A04;
    public final boolean A05;

    public final Object A00(C63575KzO kzO) {
        int i = kzO.A00;
        if (i == 0) {
            return this.A02;
        }
        if (i == 1) {
            return this.A03;
        }
        if (i == 2) {
            return this.A04;
        }
        if (i == 3) {
            return Boolean.valueOf(this.A05);
        }
        if (i != 4) {
            return Integer.valueOf(this.A00);
        }
        return this.A01;
    }

    public LOF(C63931LDq lDq) {
        File file = lDq.A02;
        if (file == null && lDq.A04 == null && lDq.A03 == null) {
            throw AnonymousClass7TE.A0w("A video output destination must be specified");
        }
        this.A02 = file;
        this.A03 = lDq.A03;
        this.A04 = lDq.A04;
        this.A05 = lDq.A05;
        this.A01 = lDq.A01;
        this.A00 = lDq.A00;
    }
}
