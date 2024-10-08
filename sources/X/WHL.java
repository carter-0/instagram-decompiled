package X;

import com.facebook.flipper.plugins.uidebugger.model.ActionIcon$Fb$Companion;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
public final class WHL implements X0W {
    public static final ActionIcon$Fb$Companion Companion = new Object();
    public final String A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof WHL) && 0qQ.A0K(this.A00, ((WHL) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ WHL(String str, int i) {
        if (1 != (i & 1)) {
            VJ6.A00(C20457Wrz.A01, i, 1);
            throw AnonymousClass00P.createAndThrow();
        } else {
            this.A00 = str;
        }
    }

    public final String toString() {
        return G9w.A0k("Fb(iconName=", this.A00);
    }
}
