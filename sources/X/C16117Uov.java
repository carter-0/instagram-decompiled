package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.INLINE_SURVEY_QUESTION_TYPES;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Uov  reason: case insensitive filesystem */
public final class C16117Uov extends 17P implements C21041XAu {
    public final List Abw() {
        return A08(-847398795, C16116Uou.class);
    }

    public final INLINE_SURVEY_QUESTION_TYPES CAP() {
        return (INLINE_SURVEY_QUESTION_TYPES) A0N(3575610, C20735Wy8.A00);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, X.Uov, X.XAu] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(V8M.A00(this), this);
    }

    public final String Axp() {
        return A0i(-297021103);
    }

    public final String BWJ() {
        return A0j(-1115571352);
    }

    public final String Bcp() {
        return A0i(598246771);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.Uov] */
    public final Boolean C2H() {
        return getOptionalBooleanValueByHashCode(-260188249);
    }

    public final String C2J() {
        return A0i(53546228);
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [com.facebook.pando.TreeJNI, X.Uov, X.17P] */
    public final C15059UNc FCG() {
        ArrayList arrayList;
        List<C21033XAm> Abw = Abw();
        if (Abw != null) {
            arrayList = AnonymousClass7TG.A0r(Abw);
            for (C21033XAm FCC : Abw) {
                arrayList.add(FCC.FCC());
            }
        } else {
            arrayList = null;
        }
        String A0i = A0i(-297021103);
        String A0e = A0e();
        String A0j = A0j(-1115571352);
        String A0i2 = A0i(598246771);
        return new C15059UNc(CAP(), getOptionalBooleanValueByHashCode(-260188249), A0i, A0e, A0j, A0i2, A0i(53546228), A0Y(), arrayList);
    }

    public final String getId() {
        return A0e();
    }

    public final String getTitle() {
        return A0Y();
    }
}
