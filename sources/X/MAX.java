package X;

import java.util.Comparator;

public final class MAX implements Comparator {
    public static final MAX A00 = new MAX();

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int i;
        String pk;
        MVW mvw = (MVW) obj;
        MVW mvw2 = (MVW) obj2;
        AnonymousClass7TG.A1N(mvw, mvw2);
        long AsD = mvw.AsD() - mvw2.AsD();
        if (AsD == 0) {
            String pk2 = mvw.getPk();
            if (pk2 == null || (pk = mvw2.getPk()) == null || (i = pk2.compareTo(pk)) == 0) {
                return mvw.hashCode() - mvw2.hashCode();
            }
        } else {
            i = -1;
            if (AsD > 0) {
                return 1;
            }
        }
        return i;
    }
}
