package X;

import com.facebook.flipper.plugins.uidebugger.model.InspectableValue;
import com.facebook.flipper.plugins.uidebugger.model.InspectableValue$Unknown$Companion;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* renamed from: X.UIx  reason: case insensitive filesystem */
public final class C14998UIx extends InspectableValue {
    public static final InspectableValue$Unknown$Companion Companion = new Object();
    public final String A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C14998UIx) && 0qQ.A0K(this.A00, ((C14998UIx) obj).A00));
    }

    @Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ C14998UIx(String str, int i) {
        if (1 != (i & 1)) {
            VJ6.A00(C20481WsN.A01, i, 1);
            throw AnonymousClass00P.createAndThrow();
        } else {
            this.A00 = str;
        }
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0E(this.A00);
    }

    public final String toString() {
        return G9w.A0k("Unknown(value=", this.A00);
    }
}
