package X;

import com.facebook.pando.TreeJNI;
import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.List;
import java.util.Map;

/* renamed from: X.B5h  reason: case insensitive filesystem */
public final class C41888B5h extends 17P implements C293585l1 {
    public List A00;
    public List A01;
    public List A02;

    public final Map BQI() {
        return null;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.XEJ, X.XEF] */
    public final XEJ A0q() {
        TreeJNI reinterpret = reinterpret(XEE.class);
        0qQ.A07(reinterpret);
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        XEE xee = (XEE) C41845B3m.A0S(reinterpret, 0se.A0M(AnonymousClass7TE.A1L(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, "ok"))).applyToTree(reinterpret);
        0qQ.A0A(xee);
        0qQ.A0B(xee, 1);
        ? xef = new XEF(xee);
        xef.A01 = -1;
        xef.A00 = -1;
        return xef;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, X.B5h] */
    public final List Ao0() {
        List list = this.A00;
        if (list == null) {
            return getOptionalTreeListByHashCode(1367927716, B5k.class);
        }
        return list;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, X.B5h] */
    public final List BJe() {
        List list = this.A02;
        if (list == null) {
            return getOptionalTreeListByHashCode(-1339914410, C43908CIh.class);
        }
        return list;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, X.B5h] */
    public final C276114sa BaO() {
        C276114sa r0 = (AnonymousClass6A1) getTreeValueByHashCode(1726143873, AnonymousClass6A1.class);
        if (r0 == null) {
            C298855u9 A002 = C276114sa.A00.A00(false);
            A002.A00 = null;
            r0 = A002.A00();
        }
        C276114sa r02 = r0;
        if (r02 != null) {
            return r02;
        }
        throw AnonymousClass7TE.A0z("Required field 'paging_info' was either missing or null for GetUserClipsResponse.");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, X.B5h] */
    public final List getItems() {
        List list = this.A01;
        if (list != null) {
            return list;
        }
        ImmutableList optionalTreeListByHashCode = getOptionalTreeListByHashCode(100526016, B5k.class);
        if (optionalTreeListByHashCode == null) {
            return 0sn.A00;
        }
        return optionalTreeListByHashCode;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.B5h] */
    public final String AqM() {
        return getStringValueByHashCode(1759802346);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.B5h] */
    public final String Bl8() {
        return getStringValueByHashCode(-1198642808);
    }

    public final Boolean CBC() {
        return A0B(2079275687);
    }
}
