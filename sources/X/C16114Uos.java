package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Uos  reason: case insensitive filesystem */
public final class C16114Uos extends 17P implements C21045XAz {
    public final List BYc() {
        return A08(-1249474914, C16115Uot.class);
    }

    public final List C48() {
        return A08(-1543665910, C16115Uot.class);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, X.XAz, X.Uos] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(V8I.A00(this), this);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.Uos] */
    public final Integer ArZ() {
        return getOptionalIntValueByHashCode(-1791284941);
    }

    public final String Avv() {
        return A0i(2068129058);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.Uos] */
    public final Boolean B60() {
        return getOptionalBooleanValueByHashCode(-673660814);
    }

    public final String Biw() {
        return A0j(659010373);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.Uos] */
    public final Integer CEs() {
        return getOptionalIntValueByHashCode(1931473547);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.Uos] */
    public final Boolean CEu() {
        return getOptionalBooleanValueByHashCode(-2100963494);
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [com.facebook.pando.TreeJNI, X.17P, X.Uos] */
    public final UNZ FB0() {
        ArrayList arrayList;
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(-1791284941);
        String A0i = A0i(2068129058);
        String A0i2 = A0i(-209971210);
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-673660814);
        String A0e = A0e();
        List BYc = BYc();
        ArrayList arrayList2 = null;
        if (BYc != null) {
            arrayList = AnonymousClass7TF.A0p(BYc);
            Iterator it = BYc.iterator();
            while (it.hasNext()) {
                C13991Tnr.A1Q(arrayList, it);
            }
        } else {
            arrayList = null;
        }
        String A0i3 = A0i(-1165870106);
        String A0j = A0j(659010373);
        String A0i4 = A0i(-132220081);
        List C48 = C48();
        if (C48 != null) {
            arrayList2 = AnonymousClass7TF.A0p(C48);
            Iterator it2 = C48.iterator();
            while (it2.hasNext()) {
                C13991Tnr.A1Q(arrayList2, it2);
            }
        }
        return new UNZ(optionalBooleanValueByHashCode, getOptionalBooleanValueByHashCode(-2100963494), optionalIntValueByHashCode, getOptionalIntValueByHashCode(1931473547), A0i, A0i2, A0e, A0i3, A0j, A0i4, C41845B3m.A0p(this), arrayList, arrayList2);
    }

    public final String getEndBackgroundColor() {
        return A0i(-209971210);
    }

    public final String getId() {
        return A0e();
    }

    public final String getQuestion() {
        return A0i(-1165870106);
    }

    public final String getStartBackgroundColor() {
        return A0i(-132220081);
    }

    public final String getTextColor() {
        return C41845B3m.A0p(this);
    }
}
