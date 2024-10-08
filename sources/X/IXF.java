package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;

public final class IXF implements AnonymousClass324 {
    public final Fragment A00;
    public final UserSession A01;
    public final C56561I1p A02;
    public final AnonymousClass323 A03;
    public final SavedCollection A04;

    public final C59612JQg CBn() {
        return new IXY(this, 1);
    }

    public final void DgX(1Xj r4, AnonymousClass3W1 r5, C59612JQg jQg, int i) {
        this.A03.DgX(r4, r5, new IXY(this, 1), i);
    }

    public final void DgZ(1Xj r3, AnonymousClass3W1 r4, int i) {
        SavedCollection savedCollection = this.A04;
        if (savedCollection != null) {
            this.A03.A03(r3, r4, savedCollection.A0F, i);
        } else {
            this.A03.DgZ(r3, r4, i);
        }
    }

    public IXF(Fragment fragment, UserSession userSession, C56561I1p i1p, AnonymousClass323 r4, SavedCollection savedCollection) {
        this.A00 = fragment;
        this.A03 = r4;
        this.A02 = i1p;
        this.A01 = userSession;
        this.A04 = savedCollection;
    }
}
