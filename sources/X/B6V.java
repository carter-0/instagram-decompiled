package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ImmutablePandoUserTagInfoDict;
import com.instagram.api.schemas.UserTagInfoDictIntf;
import java.util.ArrayList;
import java.util.List;

public final class B6V extends 17P implements C256193vN {
    public List A00;

    public final List CHj() {
        List list = this.A00;
        if (list == null) {
            return A0o(3365, ImmutablePandoUserTagInfoDict.class);
        }
        return list;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.B6V, X.3vN] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, B4S.A00(this));
    }

    public final C256193vN E9W(1E9 r4) {
        List<UserTagInfoDictIntf> CHj = CHj();
        ArrayList A0r = AnonymousClass7TG.A0r(CHj);
        for (UserTagInfoDictIntf userTagInfoDictIntf : CHj) {
            userTagInfoDictIntf.E9V(r4);
            A0r.add(userTagInfoDictIntf);
        }
        this.A00 = A0r;
        return this;
    }

    public final C256183vM FDD(1E9 r4) {
        List<UserTagInfoDictIntf> CHj = CHj();
        ArrayList arrayList = new ArrayList(0Yv.A1E(CHj, 10));
        for (UserTagInfoDictIntf FDC : CHj) {
            arrayList.add(FDC.FDC(r4));
        }
        return new C256183vM(arrayList);
    }

    public final C256183vM FDE(1E6 r2) {
        return FDD(C41846B3n.A0S(r2));
    }
}
