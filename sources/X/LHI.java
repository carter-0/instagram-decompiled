package X;

import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelType;
import com.instagram.reels.store.ReelStore;
import com.instagram.user.model.User;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract class LHI {
    public static final LinkedHashMap A00(ReelStore reelStore, User user, Integer num, Integer num2, List list) {
        MAY may;
        Integer num3;
        0qQ.A0B(reelStore, 1);
        if (num.intValue() != 0) {
            may = new MAY(2);
        } else {
            may = new MAY(1);
        }
        List<C60991Jun> A0g = 00k.A0g(list, may);
        int i = 0;
        if (num2 != null) {
            int intValue = num2.intValue();
            for (C60991Jun jun : A0g) {
                i += jun.A00;
            }
            i = intValue - i;
        }
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (i > 0 && num == AnonymousClass05K.A00) {
            A01(A1H, i);
        }
        for (C60991Jun jun2 : A0g) {
            String str = jun2.A04;
            if (str != null) {
                1Nr r9 = new 1Nr(user);
                int i2 = jun2.A00;
                ReelType reelType = jun2.A03;
                Reel A0M = reelStore.A0M(str);
                if (A0M == null || ((num3 = A0M.A0e) != null && !num3.equals(Integer.valueOf(i2)))) {
                    A0M = new Reel(r9, str, true);
                    A0M.A1W = false;
                    A0M.A0P = reelType;
                    ReelStore.A0B(A0M, reelStore, A0M.getId());
                }
                A1H.put(A0M.getId(), new AnonymousClass34S(jun2, A0M));
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        if (i > 0 && num == AnonymousClass05K.A01) {
            A01(A1H, i);
        }
        return A1H;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.Jun, java.lang.Object] */
    public static final void A01(Map map, int i) {
        ? obj = new Object();
        obj.A04 = null;
        obj.A01 = 0;
        obj.A00 = 0;
        obj.A02 = null;
        obj.A03 = null;
        obj.A00 = i;
        map.put("placeholder", new AnonymousClass34S(obj, new Reel((1Ns) null, "placeholder", false)));
    }
}
