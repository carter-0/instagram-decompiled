package X;

import com.instagram.save.model.SavedCollection;
import java.util.List;

public final class IXN implements JOW {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public IXN(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void Coi(SavedCollection savedCollection) {
        switch (this.A00) {
            case 0:
                H5L h5l = (H5L) this.A01;
                C56669I6y.A05(h5l.A03.requireContext(), h5l.A04, h5l.A05, savedCollection, (List) this.A02);
                h5l.A02();
                return;
            case 1:
                H5L h5l2 = (H5L) this.A01;
                h5l2.A0F.A03(new C56718I8y(7, (Object) this, (Object) savedCollection), savedCollection.A0G, h5l2.A06.A02.size());
                return;
            default:
                H15 h15 = (H15) this.A01;
                C56669I6y.A05(h15.requireContext(), h15, h15.A05, savedCollection, (List) this.A02);
                H15.A02(h15);
                return;
        }
    }
}
