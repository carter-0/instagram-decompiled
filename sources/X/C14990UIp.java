package X;

import com.facebook.flipper.plugins.uidebugger.model.Color;
import com.facebook.flipper.plugins.uidebugger.model.InspectableValue;
import com.facebook.flipper.plugins.uidebugger.model.InspectableValue$Color$Companion;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* renamed from: X.UIp  reason: case insensitive filesystem */
public final class C14990UIp extends InspectableValue {
    public static final InspectableValue$Color$Companion Companion = new Object();
    public final Color A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C14990UIp) && 0qQ.A0K(this.A00, ((C14990UIp) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ C14990UIp(Color color, int i) {
        if (1 != (i & 1)) {
            VJ6.A00(C20473WsF.A01, i, 1);
            throw AnonymousClass00P.createAndThrow();
        } else {
            this.A00 = color;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Color(value=");
        return AnonymousClass7TG.A0n(this.A00, sb);
    }
}
