package X;

import com.instagram.save.model.SavedCollection;
import java.util.List;

public final class IXL implements JOV {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public IXL(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void ALd(String str, int i) {
        String str2 = str;
        int i2 = i;
        switch (this.A00) {
            case 0:
                H5L h5l = (H5L) this.A01;
                C56669I6y.A04(h5l.A03.requireContext(), h5l.A04, h5l.A05, h5l.A0E, str, (List) this.A02, i2);
                h5l.A02();
                return;
            case 1:
                H5L h5l2 = (H5L) this.A01;
                I1X i1x = h5l2.A0F;
                str.getClass();
                i1x.A03(new I8G(this, str, i2), str, h5l2.A06.A02.size());
                return;
            default:
                H15 h15 = (H15) this.A01;
                List list = (List) this.A02;
                SavedCollection savedCollection = h15.A0C;
                if (savedCollection != null) {
                    C56669I6y.A04(h15.requireContext(), h15, h15.A05, savedCollection, str2, list, i2);
                }
                H15.A02(h15);
                return;
        }
    }
}
