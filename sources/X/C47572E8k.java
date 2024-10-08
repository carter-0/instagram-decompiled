package X;

import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.E8k  reason: case insensitive filesystem */
public final class C47572E8k extends C331047Ph {
    public final C47613E9z A00;
    public final List A01 = AnonymousClass7TE.A1C();

    public C47572E8k(AnonymousClass0iw r2, C47410E1c e1c) {
        C47613E9z e9z = new C47613E9z(r2, e1c);
        this.A00 = e9z;
        A0B(e9z);
    }

    public final ArrayList A0C() {
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (C49487EwS ewS : this.A01) {
            if (ewS.A00) {
                User user = ewS.A01;
                0qQ.A07(user);
                A1C.add(user);
            }
        }
        return A1C;
    }
}
