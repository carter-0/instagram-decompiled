package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class U84 extends 0ho implements X49 {
    public final 0ho A00 = this;
    public final Map A01 = new HashMap();
    public final UserSession A02;
    public final List A03;

    public U84(0hq r2, UserSession userSession, List list) {
        super(r2, 0);
        this.A02 = userSession;
        this.A03 = list;
    }

    public final Fragment A00(int i) {
        boolean z = false;
        if (i <= 1) {
            C54172H1s h1s = new C54172H1s();
            Bundle bundle = new Bundle();
            1Xg r2 = ((C17926ViH) this.A03.get(i)).A02;
            if (r2 != null) {
                1Xj A022 = 1Xi.A02(r2.A05);
                if (A022 != null) {
                    bundle.putString(AnonymousClass000.A00(2113), A022.getId());
                    if (r2.A06 == 1UQ.A0H) {
                        z = true;
                    }
                    bundle.putBoolean(AnonymousClass000.A00(2112), z);
                    DbU.A1D(bundle, this.A02);
                    h1s.setArguments(bundle);
                    this.A01.put(Integer.valueOf(i), new WeakReference(h1s));
                    return h1s;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw DbW.A0a("Invalid position: ", i);
    }

    public final int getCount() {
        return 2;
    }

    public final int getItemPosition(Object obj) {
        return -2;
    }

    public final void notifyDataSetChanged() {
        this.A00.notifyDataSetChanged();
    }
}
