package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6Ga  reason: invalid class name and case insensitive filesystem */
public final class C304996Ga extends AnonymousClass69H implements C305006Gb {
    public List A00;
    public final C305596Ir A01 = new C305596Ir();

    public final /* synthetic */ void Cf4(Object obj, 0sK r3) {
        Cf3(obj, (Object) null, r3);
    }

    public final void Ey2(Object obj, Object obj2, 0sK r6) {
        List list = this.A00;
        if (list == null) {
            list = new ArrayList();
            this.A00 = list;
        }
        list.add(Integer.valueOf(this.A01.A00));
        Cf3((Object) null, (Object) null, r6);
    }

    public final void Cf3(Object obj, Object obj2, 0sK r10) {
        AnonymousClass9L6 r5;
        C305596Ir r6 = this.A01;
        if (obj != null) {
            r5 = new AnonymousClass9L6(obj, 16);
        } else {
            r5 = null;
        }
        r6.A01(1, new C305616Iu(r5, new AnonymousClass9L6(obj2, 17), new AnonymousClass5PJ(-1010194746, true, new AnonymousClass9LQ(r10, 0))));
    }

    public final void CfA(0sP r3, 0sP r4, 0sJ r5, int i) {
        this.A01.A01(i, new C305616Iu(r3, r4, r5));
    }

    public final /* synthetic */ void CfB(0sP r2, 0sJ r3, int i) {
        CfA(r2, C41671AyO.A00, r3, i);
    }

    public C304996Ga(0sP r2) {
        r2.invoke(this);
    }
}
