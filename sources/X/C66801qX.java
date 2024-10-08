package X;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.1qX  reason: invalid class name and case insensitive filesystem */
public final class C66801qX {
    public final int A00;
    public final C61520nU A01;
    public final Set A02 = new CopyOnWriteArraySet();

    public static final int A00(AnonymousClass3OB r1) {
        int ordinal;
        if (r1 == null) {
            ordinal = -1;
        } else {
            ordinal = r1.ordinal();
        }
        switch (ordinal) {
            case 1:
                return 5;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 2;
            case 5:
                return 1;
            default:
                return 0;
        }
    }

    public C66801qX(C61520nU r2, int i) {
        this.A00 = i;
        this.A01 = r2;
    }
}
