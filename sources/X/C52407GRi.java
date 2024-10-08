package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.GRi  reason: case insensitive filesystem */
public abstract /* synthetic */ class C52407GRi {
    public static int A00(C268014cc r6, AnonymousClass5RD r7, List list, int i) {
        ArrayList A0m = C51970G9q.A0m(list);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            C268084cj A0J = G9w.A0J(list, i2);
            Integer num = AnonymousClass05K.A01;
            A0m.add(new C52408GRj(A0J, num, num));
        }
        return r7.Cnx(GR5.A00(r6), A0m, C51971G9r.A0L(i)).getHeight();
    }

    public static int A01(C268014cc r7, AnonymousClass5RD r8, List list, int i) {
        ArrayList A0m = C51970G9q.A0m(list);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            A0m.add(new C52408GRj((C268084cj) list.get(i2), AnonymousClass05K.A01, AnonymousClass05K.A00));
        }
        return r8.Cnx(GR5.A00(r7), A0m, AnonymousClass5SF.A04(0, Integer.MAX_VALUE, 0, i)).getWidth();
    }

    public static int A02(C268014cc r7, AnonymousClass5RD r8, List list, int i) {
        ArrayList A0m = C51970G9q.A0m(list);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            A0m.add(new C52408GRj((C268084cj) list.get(i2), AnonymousClass05K.A00, AnonymousClass05K.A01));
        }
        return r8.Cnx(GR5.A00(r7), A0m, C51971G9r.A0L(i)).getHeight();
    }

    public static int A03(C268014cc r6, AnonymousClass5RD r7, List list, int i) {
        ArrayList A0m = C51970G9q.A0m(list);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            C268084cj A0J = G9w.A0J(list, i2);
            Integer num = AnonymousClass05K.A00;
            A0m.add(new C52408GRj(A0J, num, num));
        }
        return r7.Cnx(GR5.A00(r6), A0m, AnonymousClass5SF.A04(0, Integer.MAX_VALUE, 0, i)).getWidth();
    }
}
