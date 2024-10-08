package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;

/* renamed from: X.COl  reason: case insensitive filesystem */
public final class C43975COl extends 17P implements DV4 {
    public User A00;

    public final User Acz() {
        return this.A00;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.DV4, X.COl] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44385Ce5.A00(this));
    }

    public final String Aeo() {
        return A0i(-168253766);
    }

    public final String Arf() {
        return A0j(1677107689);
    }

    public final String Awy() {
        return A0i(-1549938746);
    }

    public final String Awz() {
        return A0i(1047508433);
    }

    public final Long B1l() {
        return A0L(-1298761629);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.COl] */
    public final Boolean B71() {
        return getOptionalBooleanValueByHashCode(-588909);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.COl] */
    public final Boolean CF5() {
        return getOptionalBooleanValueByHashCode(-2069450039);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.COl] */
    public final Boolean CYm() {
        return getOptionalBooleanValueByHashCode(121133918);
    }

    public final DV4 E8P(1E9 r2) {
        this.A00 = C41848B3p.A1B(r2, this, -309882753);
        return this;
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [com.facebook.pando.TreeJNI, X.COl, X.17P] */
    public final BGi F9k(1E9 r15) {
        User user;
        User A0b;
        ImmutablePandoUserDict A0Z = C41845B3m.A0Z(this, -309882753);
        if (A0Z == null || (A0b = C41845B3m.A0b(r15, A0Z)) == null) {
            user = null;
        } else {
            user = C41846B3n.A0b(r15, A0b);
        }
        String A0i = A0i(-168253766);
        String A0j = A0j(1677107689);
        String A0i2 = A0i(-1549938746);
        String A0i3 = A0i(1047508433);
        String A0i4 = A0i(-209971210);
        Long A0L = A0L(-1298761629);
        return new BGi(user, getOptionalBooleanValueByHashCode(-588909), getOptionalBooleanValueByHashCode(121133918), getOptionalBooleanValueByHashCode(-2069450039), A0L, A0i, A0j, A0i2, A0i3, A0i4, A0i(-132220081), A0X(), C41845B3m.A0p(this));
    }

    public final BGi F9l(1E6 r2) {
        return F9k(C41846B3n.A0S(r2));
    }

    public final String getEndBackgroundColor() {
        return A0i(-209971210);
    }

    public final String getStartBackgroundColor() {
        return A0i(-132220081);
    }

    public final String getText() {
        return A0X();
    }

    public final String getTextColor() {
        return C41845B3m.A0p(this);
    }
}
