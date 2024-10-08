package X;

import com.facebook.flipper.plugins.uidebugger.model.InspectableValue;
import com.facebook.flipper.plugins.uidebugger.model.InspectableValue$Enum$Companion;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* renamed from: X.UIs  reason: case insensitive filesystem */
public final class C14993UIs extends InspectableValue {
    public static final InspectableValue$Enum$Companion Companion = new Object();
    public final String A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C14993UIs) && 0qQ.A0K(this.A00, ((C14993UIs) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ C14993UIs(String str, int i) {
        if (1 != (i & 1)) {
            VJ6.A00(C20476WsI.A01, i, 1);
            throw AnonymousClass00P.createAndThrow();
        } else {
            this.A00 = str;
        }
    }

    public final String toString() {
        return G9w.A0k("Enum(value=", this.A00);
    }
}
