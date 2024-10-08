package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.60H  reason: invalid class name */
public final class AnonymousClass60H extends AnonymousClass0T0 implements AnonymousClass60I {
    public final String A00;

    public AnonymousClass60H(String str) {
        0qQ.A0B(str, 1);
        this.A00 = str;
    }

    public final AnonymousClass60H F8H() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass60H) && 0qQ.A0K(this.A00, ((AnonymousClass60H) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.A00;
        if (str != null) {
            linkedHashMap.put("prompt_text", str);
        }
        return new TreeUpdaterJNI("XDTPromptReplyNoteResponseInfo", 0Yt.A0B(linkedHashMap));
    }
}
