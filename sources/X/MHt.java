package X;

import java.util.List;
import java.util.Map;

public final class MHt extends AnonymousClass1Ek implements 0sJ {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;
    public final Object A04;
    public final String A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MHt(C69068Ne7 ne7, String str, AnonymousClass4D7 r4, int i) {
        super(4, r4);
        this.A03 = i;
        this.A04 = ne7;
        this.A05 = str;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2 = this.A03;
        AnonymousClass4D7 r8 = (AnonymousClass4D7) obj4;
        C69068Ne7 ne7 = (C69068Ne7) this.A04;
        String str = this.A05;
        if (i2 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        MHt mHt = new MHt(ne7, str, r8, i);
        mHt.A00 = obj;
        mHt.A01 = obj2;
        mHt.A02 = obj3;
        return mHt.invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.A03;
        0eS.A00(obj);
        List list = (List) this.A00;
        List list2 = (List) this.A01;
        Object obj2 = this.A02;
        if (i != 0) {
            return C69068Ne7.A00((C69068Ne7) this.A04, this.A05, list, list2, 0sn.A00, (Map) obj2);
        }
        return C69068Ne7.A00((C69068Ne7) this.A04, this.A05, list, list2, (List) obj2, 0Yt.A0E());
    }
}
