package X;

import com.facebook.flipper.plugins.uidebugger.model.Bounds;
import com.facebook.flipper.plugins.uidebugger.model.InspectableValue;
import com.facebook.flipper.plugins.uidebugger.model.InspectableValue$Bounds$Companion;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* renamed from: X.UIo  reason: case insensitive filesystem */
public final class C14989UIo extends InspectableValue {
    public static final InspectableValue$Bounds$Companion Companion = new Object();
    public final Bounds A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C14989UIo) && 0qQ.A0K(this.A00, ((C14989UIo) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ C14989UIo(Bounds bounds, int i) {
        if (1 != (i & 1)) {
            VJ6.A00(C20472WsE.A01, i, 1);
            throw AnonymousClass00P.createAndThrow();
        } else {
            this.A00 = bounds;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Bounds(value=");
        return AnonymousClass7TG.A0n(this.A00, sb);
    }
}
