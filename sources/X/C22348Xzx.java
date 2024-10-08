package X;

import android.util.SparseArray;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Xzx  reason: case insensitive filesystem */
public final class C22348Xzx implements C229392nJ {
    public UserSession A00;

    public final SparseArray AMV() {
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(R.id.bloks_ig_session, this.A00);
        return sparseArray;
    }

    public final C229702nt AgE() {
        return new C229692ns((C229662np) null, (C229162mw) null, new C229672nq(this.A00), (C249393jf) null, C229652no.A00, (C229612nk) null);
    }
}
