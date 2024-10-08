package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StoryTextAttributionType;
import java.util.ArrayList;
import java.util.List;

public final class CPo extends 17P implements DTS {
    public final StoryTextAttributionType AdA() {
        return (StoryTextAttributionType) A0M(115027706, C46110DMp.A00);
    }

    public final List Agp() {
        return A0o(1975239120, CPn.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CPo, X.DTS] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44455CfD.A00(this));
    }

    public final BHS FBi() {
        StoryTextAttributionType AdA = AdA();
        List<C46263DSs> Agp = Agp();
        ArrayList A0r = AnonymousClass7TG.A0r(Agp);
        for (C46263DSs FBj : Agp) {
            A0r.add(FBj.FBj());
        }
        return new BHS(AdA, A0P(), A0r);
    }

    public final String getText() {
        return A0P();
    }
}
