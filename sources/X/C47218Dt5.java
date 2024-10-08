package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.TextAppMentionType;
import com.instagram.user.model.User;

/* renamed from: X.Dt5  reason: case insensitive filesystem */
public final class C47218Dt5 extends AnonymousClass0T0 implements C51955G8y {
    public final TextAppMentionType A00;
    public final User A01;

    public final C51955G8y E9N(1E9 r1) {
        return this;
    }

    public final C47218Dt5 FCR(1E9 r1) {
        return this;
    }

    public final C47218Dt5 FCS(1E6 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47218Dt5) {
                C47218Dt5 dt5 = (C47218Dt5) obj;
                if (this.A00 != dt5.A00 || !0qQ.A0K(this.A01, dt5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final TextAppMentionType BRg() {
        return this.A00;
    }

    public final User BRj() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTTextAppMentionTextFragment", C48354EdB.A00(this));
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public C47218Dt5(TextAppMentionType textAppMentionType, User user) {
        this.A00 = textAppMentionType;
        this.A01 = user;
    }
}
