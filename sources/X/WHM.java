package X;

import com.facebook.flipper.plugins.uidebugger.model.ActionIcon$Local$Companion;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
public final class WHM implements X0W {
    public static final ActionIcon$Local$Companion Companion = new Object();
    public final String A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof WHM) && 0qQ.A0K(this.A00, ((WHM) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ WHM(String str, int i) {
        if (1 != (i & 1)) {
            VJ6.A00(C20458Ws0.A01, i, 1);
            throw AnonymousClass00P.createAndThrow();
        } else {
            this.A00 = str;
        }
    }

    public final String toString() {
        return G9w.A0k("Local(iconFullPath=", this.A00);
    }
}
