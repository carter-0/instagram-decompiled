package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.4vs  reason: invalid class name and case insensitive filesystem */
public final class C277874vs extends AnonymousClass0T0 implements C277884vt {
    public final boolean A00;

    public final C277874vs F4X() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C277874vs) && this.A00 == ((C277874vs) obj).A00);
    }

    public final boolean CVs() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("is_invite_only_branding_enabled", Boolean.valueOf(this.A00));
        return new TreeUpdaterJNI("XDTIGLiveInviteOnly", 0Yt.A0B(linkedHashMap));
    }

    public final int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public C277874vs(boolean z) {
        this.A00 = z;
    }
}
