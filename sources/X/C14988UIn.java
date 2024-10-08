package X;

import com.facebook.flipper.plugins.uidebugger.model.InspectableValue;
import com.facebook.flipper.plugins.uidebugger.model.InspectableValue$Boolean$Companion;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* renamed from: X.UIn  reason: case insensitive filesystem */
public final class C14988UIn extends InspectableValue {
    public static final InspectableValue$Boolean$Companion Companion = new Object();
    public final boolean A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C14988UIn) && this.A00 == ((C14988UIn) obj).A00);
    }

    public final String toString() {
        return 002.A0L("Boolean(value=", ')', this.A00);
    }

    @Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ C14988UIn(int i, boolean z) {
        if (1 != (i & 1)) {
            VJ6.A00(C20471WsD.A01, i, 1);
            throw AnonymousClass00P.createAndThrow();
        } else {
            this.A00 = z;
        }
    }

    public final int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }
}
