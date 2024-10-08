package X;

import com.instagram.video.live.mvvm.model.repository.IgLiveQuestionsRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9KC  reason: invalid class name */
public final class AnonymousClass9KC extends AnonymousClass1Ek implements 0sK {
    public Object A00;
    public Object A01;
    public final int A02;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9KC(Object obj, AnonymousClass4D7 r3, int i) {
        super(3, r3);
        this.A02 = i;
        this.A03 = obj;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        int i;
        AnonymousClass4D7 r6 = (AnonymousClass4D7) obj3;
        switch (this.A02) {
            case 0:
                obj4 = this.A03;
                i = 0;
                break;
            case 1:
                obj4 = this.A03;
                i = 1;
                break;
            case 2:
                obj4 = this.A03;
                i = 2;
                break;
            default:
                obj4 = this.A03;
                i = 3;
                break;
        }
        AnonymousClass9KC r1 = new AnonymousClass9KC(obj4, r6, i);
        r1.A00 = obj;
        r1.A01 = obj2;
        return r1.invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass2Fj r2;
        Object obj2;
        int i = this.A02;
        0eS.A00(obj);
        switch (i) {
            case 0:
                List list = (List) this.A00;
                M1Y m1y = (M1Y) this.A01;
                if (m1y == null) {
                    return list;
                }
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (0qQ.A0K(((M1Y) next).A06, m1y.A06)) {
                            if (next != null) {
                                return list;
                            }
                        }
                    }
                }
                ArrayList arrayList = new ArrayList(list);
                ArrayList arrayList2 = arrayList;
                arrayList.add(0, m1y);
                return arrayList2;
            case 1:
                Object obj3 = this.A00;
                C361278fx r4 = (C361278fx) this.A01;
                if (0qQ.A0K(obj3, AnonymousClass8IZ.A00)) {
                    return null;
                }
                int i2 = r4.A00;
                if (i2 != 3 && i2 != 4) {
                    return r4;
                }
                2YL r1 = (2YL) this.A03;
                C318136oS A002 = C318116oQ.A00(r1);
                C66183MGu mGu = new C66183MGu(r1, (AnonymousClass4D7) null, 45);
                1Eo.A03(AnonymousClass05K.A00, 19B.A00, mGu, A002);
                return r4;
            case 2:
                C71062aE r12 = ((2ab) this.A03).A00;
                int i3 = ((2aX) this.A00).A01;
                return new 2aX(r12, (List) this.A01, i3, i3);
            default:
                AnonymousClass9I5 r7 = (AnonymousClass9I5) this.A00;
                C20864X1q x1q = (C20864X1q) this.A01;
                if (x1q != null) {
                    C313886hJ r8 = (C313886hJ) this.A03;
                    if (x1q instanceof C19831WgC) {
                        IgLiveQuestionsRepository igLiveQuestionsRepository = r8.A08;
                        Long l = igLiveQuestionsRepository.A02;
                        if (l != null) {
                            long j = ((C19831WgC) x1q).A01;
                            if (l.longValue() == j) {
                                igLiveQuestionsRepository.A09(C391379sn.ANSWERED, j);
                                obj2 = null;
                                igLiveQuestionsRepository.A02 = null;
                                r2 = r8.A03;
                            }
                        }
                    } else if ((x1q instanceof C19832WgD) && r8.A05 != C313666go.BROADCASTER) {
                        long j2 = ((C19832WgD) x1q).A01;
                        IgLiveQuestionsRepository igLiveQuestionsRepository2 = r8.A08;
                        Long l2 = igLiveQuestionsRepository2.A02;
                        if (l2 == null || j2 != l2.longValue()) {
                            Long valueOf = Long.valueOf(j2);
                            igLiveQuestionsRepository2.A02 = valueOf;
                            igLiveQuestionsRepository2.A09(C391379sn.CURRENT, j2);
                            r2 = r8.A03;
                            obj2 = igLiveQuestionsRepository2.A08.get(valueOf);
                        }
                    }
                    r2.A0B(obj2);
                }
                return new C61052Jvq((Object) x1q, r7.A00, 8, r7.A01);
        }
    }
}
