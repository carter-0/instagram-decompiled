package X;

import java.util.List;

public final class JK2 extends 0Yg implements 0sI {
    public final /* synthetic */ 2Wa A00;
    public final /* synthetic */ C53296Gli A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JK2(2Wa r2, C53296Gli gli) {
        super(5);
        this.A01 = gli;
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        C51965G9l.A1U(obj);
        int A0M = AnonymousClass7TE.A0M(obj2);
        C51965G9l.A1U(obj3);
        C51965G9l.A1U(obj4);
        C51965G9l.A1U(obj5);
        C53296Gli gli = this.A01;
        List list = gli.A04;
        int size = list.size();
        int i = gli.A00;
        if (size < i && A0M * 5 > list.size() - 10) {
            DbS.A1U(gli.A01.A00);
        }
        boolean A1T = AnonymousClass7TF.A1T(list.size(), i);
        2Wa r1 = this.A00;
        if (A1T != C51969G9p.A1V(r1)) {
            C51967G9n.A1I(r1, A1T);
        }
        return C60340gF.A00;
    }
}
