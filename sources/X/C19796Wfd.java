package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Wfd  reason: case insensitive filesystem */
public final class C19796Wfd implements AnonymousClass7Q7 {
    public final int A00;
    public final Object A01;

    public C19796Wfd(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final boolean AJe(String str) {
        HAI hai;
        UserSession A0l;
        switch (this.A00) {
            case 0:
                0qQ.A0B(str, 0);
                return ((C52469GTv) this.A01).A00().AJe(str);
            case 1:
                0qQ.A0B(str, 0);
                C15381Ube ube = (C15381Ube) this.A01;
                hai = ube.A08;
                if (hai != null) {
                    A0l = AnonymousClass7TE.A0l(ube.A0i);
                    break;
                } else {
                    0qQ.A0F("dataSource");
                    throw AnonymousClass00P.createAndThrow();
                }
            default:
                C15357Ub9 ub9 = (C15357Ub9) this.A01;
                hai = ub9.A08;
                A0l = ub9.A02;
                break;
        }
        return hai.A09(A0l, str);
    }

    public final void FK4() {
        C14227TsA tsA;
        switch (this.A00) {
            case 0:
                ((C52469GTv) this.A01).A00().AV9();
                return;
            case 1:
                tsA = ((C15381Ube) this.A01).A06;
                if (tsA == null) {
                    DbS.A13();
                    throw AnonymousClass00P.createAndThrow();
                }
                break;
            default:
                tsA = ((C15357Ub9) this.A01).A06;
                break;
        }
        C14227TsA.A00(tsA);
    }
}
