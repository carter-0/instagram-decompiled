package X;

import com.instagram.api.schemas.AudioBrowserCategoryType;
import java.util.ArrayList;
import java.util.List;

public final class CIU extends 17P implements C66563MWr {
    public List A00;

    public final AudioBrowserCategoryType AmL() {
        return (AudioBrowserCategoryType) A0N(338885083, DKE.A00);
    }

    public final List Bf2() {
        List list = this.A00;
        if (list == null) {
            return A0o(696989833, C43961CMy.class);
        }
        return list;
    }

    public final C66563MWr E79(1E9 r4) {
        List<DS0> Bf2 = Bf2();
        ArrayList A0r = AnonymousClass7TG.A0r(Bf2);
        for (DS0 ds0 : Bf2) {
            ds0.E7v(r4);
            A0r.add(ds0);
        }
        this.A00 = A0r;
        return this;
    }

    public final String getId() {
        return C41845B3m.A0m(this);
    }

    public final String getTitle() {
        return A0S();
    }
}
