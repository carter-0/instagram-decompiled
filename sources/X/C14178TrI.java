package X;

import com.instagram.discovery.related.model.RelatedItem;
import com.instagram.explore.topiccluster.ExploreTopicCluster;

/* renamed from: X.TrI  reason: case insensitive filesystem */
public final class C14178TrI implements AnonymousClass340 {
    public final int A00;
    public final Object A01;

    public C14178TrI(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final Object C9G(int i) {
        Object A0O;
        switch (this.A00) {
            case 0:
                U9j u9j = (U9j) this.A01;
                if (!(u9j instanceof C15950UlL)) {
                    A0O = 00k.A0O(u9j.A04, i);
                } else if (i == 0) {
                    return null;
                } else {
                    A0O = 00k.A0O(u9j.A04, i - 1);
                }
                return (RelatedItem) A0O;
            case 2:
                return C70285O0p.A00((C67687MsP) this.A01, i);
            case 3:
                return ((C14031ToX) this.A01).A01(i);
            case 4:
                return ((C55852HoZ) this.A01).A03.get(i);
            default:
                return null;
        }
    }

    public final Class C9H(Object obj) {
        switch (this.A00) {
            case 0:
            case 2:
            case 3:
                0qQ.A0B(obj, 0);
                return obj.getClass();
            case 1:
                return ExploreTopicCluster.class;
            case 4:
                return 1Xj.class;
            default:
                return null;
        }
    }
}
