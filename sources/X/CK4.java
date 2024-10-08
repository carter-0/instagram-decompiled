package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ConfirmationStyle;
import com.instagram.api.schemas.ConfirmationTitleStyle;
import com.instagram.api.schemas.MediaOptionStyle;
import com.instagram.api.schemas.UndoStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class CK4 extends 17P implements AnonymousClass1eD {
    public final /* synthetic */ C45446CwZ AKC() {
        return new C45446CwZ(this);
    }

    public final ConfirmationStyle Apx() {
        return (ConfirmationStyle) A0N(861360423, C46051DKi.A00);
    }

    public final ConfirmationTitleStyle Apz() {
        return (ConfirmationTitleStyle) A0N(-688405504, C46052DKj.A00);
    }

    public final List B73() {
        return A08(285639531, CKB.class);
    }

    public final C246213eD B74() {
        return (C246213eD) A05(1511899534, CKC.class);
    }

    public final MediaOptionStyle C7w() {
        return (MediaOptionStyle) A0N(859734282, C46053DKk.A00);
    }

    public final UndoStyle CBP() {
        return (UndoStyle) A0N(-2023154026, C46054DKl.A00);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.1eD, X.CK4] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C41861B4f.A00(this));
    }

    public final String Apv() {
        return A0i(1274199916);
    }

    public final String Apw() {
        return A0i(1274397251);
    }

    public final String Apy() {
        return A0i(861951438);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CK4] */
    public final Boolean B1L() {
        return getOptionalBooleanValueByHashCode(95971477);
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [com.facebook.pando.TreeJNI, X.CK4, X.17P] */
    public final 1eB F35() {
        ArrayList arrayList;
        String A0i = A0i(1274199916);
        String A0i2 = A0i(1274397251);
        ConfirmationStyle Apx = Apx();
        String A0i3 = A0i(861951438);
        ConfirmationTitleStyle Apz = Apz();
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(95971477);
        List B73 = B73();
        C246203eC r4 = null;
        if (B73 != null) {
            arrayList = AnonymousClass7TG.A0r(B73);
            Iterator it = B73.iterator();
            while (it.hasNext()) {
                C41846B3n.A1X(arrayList, it);
            }
        } else {
            arrayList = null;
        }
        C246213eD B74 = B74();
        if (B74 != null) {
            r4 = B74.F3E();
        }
        return new 1eB(Apx, Apz, r4, C7w(), CBP(), optionalBooleanValueByHashCode, A0i, A0i2, A0i3, A0Y(), arrayList);
    }

    public final String getTitle() {
        return A0Y();
    }
}
