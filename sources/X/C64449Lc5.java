package X;

import com.instagram.pendingmedia.model.constants.ShareType;
import java.util.EnumSet;

/* renamed from: X.Lc5  reason: case insensitive filesystem */
public final class C64449Lc5 implements 1UV {
    public final /* synthetic */ EnumSet A00;

    public C64449Lc5(EnumSet enumSet) {
        this.A00 = enumSet;
    }

    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
        ShareType shareType;
        1us r3 = (1us) obj;
        EnumSet enumSet = this.A00;
        if (r3 != null) {
            shareType = r3.BtR();
        } else {
            shareType = null;
        }
        return enumSet.contains(shareType);
    }
}
