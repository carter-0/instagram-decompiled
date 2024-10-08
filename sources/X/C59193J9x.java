package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;

/* renamed from: X.J9x  reason: case insensitive filesystem */
public final class C59193J9x extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59193J9x(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2, int i3, long j) {
        super(2);
        this.A00 = i3;
        this.A04 = obj;
        this.A03 = j;
        this.A06 = obj2;
        this.A07 = obj3;
        this.A05 = obj4;
        this.A01 = i;
        this.A02 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object obj3 = obj;
        Object obj4 = obj2;
        switch (this.A00) {
            case 0:
                long j = this.A03;
                I5L.A00(C51966G9m.A0R(obj3, obj4), (Alignment) this.A04, (C56020HrS) this.A07, (C62320sa) this.A06, (0sL) this.A05, C51966G9m.A01(this.A01), this.A02, j);
                break;
            case 1:
                long j2 = this.A03;
                0sL r5 = (0sL) this.A06;
                C62320sa r4 = (C62320sa) this.A07;
                C56230Hux.A00(C51966G9m.A0R(obj3, obj4), (Modifier) this.A05, r4, r5, (AnonymousClass62P) this.A04, C51966G9m.A01(this.A01), this.A02, j2);
                break;
            case 2:
                LazyListState lazyListState = (LazyListState) this.A04;
                C52971GgO ggO = (C52971GgO) this.A07;
                long j3 = this.A03;
                I6M.A01(lazyListState, C51966G9m.A0R(obj3, obj4), (Modifier) this.A05, ggO, (C334047aa) this.A06, C51966G9m.A01(this.A01), this.A02, j3);
                break;
            default:
                C336607et r42 = (C336607et) obj3;
                AnonymousClass7TF.A1H(r42, obj4);
                AnonymousClass3XV r1 = 2WX.A02;
                Integer num = AnonymousClass05K.A00;
                2WX A002 = AnonymousClass9JR.A00(AnonymousClass9JR.A00((2WX) null, num, 0, ((long) ((0rk) this.A05).A00) | 9221401712017801216L), AnonymousClass05K.A04, 0, ((long) this.A02) | 9221401712017801216L);
                C56065HsE hsE = (C56065HsE) this.A06;
                int i = this.A01;
                long j4 = this.A03;
                Object obj5 = this.A07;
                return C51967G9n.A0Q(new C53776Gu5(C51974G9v.A0O((2WX) null, AnonymousClass05K.A01, num, 100.0f, 0), hsE.A00, C58688Ivx.A00(hsE, obj5, 8), j4, AnonymousClass7TF.A1S(AnonymousClass7TE.A0M(((2Wa) this.A04).A03), i)), AnonymousClass7TG.A0S(r42.A00), r42, A002);
        }
        return C60340gF.A00;
    }
}
