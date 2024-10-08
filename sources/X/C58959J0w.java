package X;

import java.util.List;

/* renamed from: X.J0w  reason: case insensitive filesystem */
public final class C58959J0w extends 0Yg implements 0sP {
    public static final C58959J0w A00 = new C58959J0w();

    public C58959J0w() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass5RW r0;
        C289295dM r02;
        0qQ.A0B(obj, 0);
        List list = (List) obj;
        C291805hu r03 = C291805hu.A03;
        Object obj2 = list.get(0);
        long j = AnonymousClass5RW.A01;
        C56870IFr iFr = C56494HzQ.A0E;
        0qQ.A0K(obj2, false);
        Number number = null;
        if (obj2 != null) {
            r0 = (AnonymousClass5RW) iFr.A00.invoke(obj2);
        } else {
            r0 = null;
        }
        0qQ.A0A(r0);
        long j2 = r0.A00;
        Object obj3 = list.get(1);
        C56870IFr iFr2 = C56494HzQ.A0F;
        0qQ.A0K(obj3, false);
        if (obj3 != null) {
            r02 = (C289295dM) iFr2.A00.invoke(obj3);
        } else {
            r02 = null;
        }
        0qQ.A0A(r02);
        long j3 = r02.A00;
        Object obj4 = list.get(2);
        if (obj4 != null) {
            number = (Number) obj4;
        }
        0qQ.A0A(number);
        return new C291805hu(number.floatValue(), j2, j3);
    }
}
