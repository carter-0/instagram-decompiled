package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.TextAppUserFavoriteNotificationPostType;

/* renamed from: X.Dt6  reason: case insensitive filesystem */
public final class C47219Dt6 extends AnonymousClass0T0 implements C51951G8u {
    public final TextAppUserFavoriteNotificationPostType A00;
    public final Boolean A01;

    public final C47219Dt6 FCa() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47219Dt6) {
                C47219Dt6 dt6 = (C47219Dt6) obj;
                if (!0qQ.A0K(this.A01, dt6.A01) || this.A00 != dt6.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final TextAppUserFavoriteNotificationPostType BWd() {
        return this.A00;
    }

    public final Boolean CaC() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTTextAppUserFavoriteNotificationSetting", C48356EdD.A00(this));
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public C47219Dt6(TextAppUserFavoriteNotificationPostType textAppUserFavoriteNotificationPostType, Boolean bool) {
        this.A01 = bool;
        this.A00 = textAppUserFavoriteNotificationPostType;
    }
}
