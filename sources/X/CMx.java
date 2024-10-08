package X;

import com.instagram.api.schemas.AudioBrowserPlaylistType;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.List;

public final class CMx extends 17P implements C66566MWu {
    public List A00;

    public final AudioBrowserPlaylistType BdL() {
        return (AudioBrowserPlaylistType) A0N(816650631, DLW.A00);
    }

    public final List Bf2() {
        List list = this.A00;
        if (list == null) {
            return A08(696989833, CN8.class);
        }
        return list;
    }

    public final String Aab() {
        return A0i(-757853179);
    }

    public final ImageUrl BEO() {
        return A0A(-737588055);
    }

    public final C66566MWu E7u(1E9 r4) {
        ArrayList arrayList;
        List<C66564MWs> Bf2 = Bf2();
        if (Bf2 != null) {
            arrayList = AnonymousClass7TG.A0r(Bf2);
            for (C66564MWs mWs : Bf2) {
                mWs.E7z(r4);
                arrayList.add(mWs);
            }
        } else {
            arrayList = null;
        }
        this.A00 = arrayList;
        return this;
    }

    public final String getId() {
        return C41845B3m.A0m(this);
    }

    public final String getSubtitle() {
        return A0U();
    }

    public final String getTitle() {
        return A0S();
    }
}
