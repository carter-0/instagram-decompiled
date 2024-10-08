package X;

import com.facebook.flipper.plugins.uidebugger.model.InspectableValue;
import com.facebook.flipper.plugins.uidebugger.model.InspectableValue$Text$Companion;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* renamed from: X.UIw  reason: case insensitive filesystem */
public final class C14997UIw extends InspectableValue {
    public static final InspectableValue$Text$Companion Companion = new Object();
    public final String A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C14997UIw) && 0qQ.A0K(this.A00, ((C14997UIw) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ C14997UIw(String str, int i) {
        if (1 != (i & 1)) {
            VJ6.A00(C20480WsM.A01, i, 1);
            throw AnonymousClass00P.createAndThrow();
        } else {
            this.A00 = str;
        }
    }

    public final String toString() {
        return G9w.A0k("Text(value=", this.A00);
    }
}
