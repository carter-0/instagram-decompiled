package X;

import java.util.function.Function;

/* renamed from: X.FwI  reason: case insensitive filesystem */
public final class C51568FwI implements Function {
    public final int A00;

    public C51568FwI(int i) {
        this.A00 = i;
    }

    public final Object apply(Object obj) {
        switch (this.A00) {
            case 0:
                return ((C8208QkH) obj).A0B();
            case 1:
                return ((G8G) obj).getUsername();
            case 2:
                return ((C306876Nw) ((C306886Nx) obj)).A02.getId();
            default:
                return ((C247733gp) obj).A08;
        }
    }
}
