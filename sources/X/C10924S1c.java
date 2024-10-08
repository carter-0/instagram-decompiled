package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.S1c  reason: case insensitive filesystem */
public final class C10924S1c {
    public final 02U A00;
    public final String A01;
    public final List A02;

    public final String toString() {
        return 002.A0S("LoadPath{decodePaths=", Arrays.toString(this.A02.toArray()), '}');
    }

    public C10924S1c(02U r8, Class cls, Class cls2, Class cls3, List list) {
        this.A00 = r8;
        if (!list.isEmpty()) {
            this.A02 = list;
            this.A01 = 002.A15("Failed LoadPath{", cls.getSimpleName(), "->", cls2.getSimpleName(), "->", cls3.getSimpleName(), "}");
            return;
        }
        throw AnonymousClass7TE.A0w("Must not be empty.");
    }
}
