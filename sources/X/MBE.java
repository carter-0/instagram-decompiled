package X;

import com.instagram.model.reels.Reel;
import java.util.Set;
import java.util.function.Predicate;

public final /* synthetic */ class MBE implements Predicate {
    public final /* synthetic */ Set A00;

    public /* synthetic */ MBE(Set set) {
        this.A00 = set;
    }

    public final boolean test(Object obj) {
        return !this.A00.contains(((Reel) obj).getId());
    }
}
