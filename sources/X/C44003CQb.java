package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.UrpRendererType;
import com.instagram.model.showreel.IgShowreelCompositionAssetInfoIntf;
import com.instagram.model.showreel.ImmutablePandoIgShowreelCompositionAssetInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.CQb  reason: case insensitive filesystem */
public final class C44003CQb extends 17P implements DUE {
    public final List Ace() {
        return A08(1587841910, ImmutablePandoIgShowreelCompositionAssetInfo.class);
    }

    public final UrpRendererType Blw() {
        return (UrpRendererType) A0M(242813238, DN6.A00);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.CQb, X.DUE, com.facebook.pando.TreeJNI] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44558Cgs.A00(this));
    }

    public final String BOF() {
        return A0i(-894921330);
    }

    public final String Bm0() {
        return A0h(-1727004274);
    }

    public final String C4Z() {
        return A0i(1769642752);
    }

    public final BI5 FD2() {
        ArrayList arrayList;
        List<IgShowreelCompositionAssetInfoIntf> Ace = Ace();
        if (Ace != null) {
            arrayList = AnonymousClass7TG.A0r(Ace);
            for (IgShowreelCompositionAssetInfoIntf FFw : Ace) {
                arrayList.add(FFw.FFw());
            }
        } else {
            arrayList = null;
        }
        return new BI5(Blw(), A0i(-894921330), A0h(-1727004274), A0i(1769642752), arrayList);
    }
}
