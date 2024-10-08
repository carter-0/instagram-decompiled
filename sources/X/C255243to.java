package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.3to  reason: invalid class name and case insensitive filesystem */
public final class C255243to extends AnonymousClass0T0 implements C255253tp {
    public final C255233tn A00;
    public final Hashtag A01;

    public final C255243to F5Q() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C255243to) {
                C255243to r5 = (C255243to) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Hashtag hashtag = this.A01;
        int i = 0;
        int hashCode = (hashtag == null ? 0 : hashtag.hashCode()) * 31;
        C255233tn r0 = this.A00;
        if (r0 != null) {
            i = r0.hashCode();
        }
        return hashCode + i;
    }

    public final Hashtag BCW() {
        return this.A01;
    }

    public final C255233tn CCb() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTLinkedEntity", C46337Dcf.A00(this));
    }

    public C255243to(C255233tn r1, Hashtag hashtag) {
        this.A01 = hashtag;
        this.A00 = r1;
    }
}
