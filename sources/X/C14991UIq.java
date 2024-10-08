package X;

import com.facebook.flipper.plugins.uidebugger.model.Coordinate3D;
import com.facebook.flipper.plugins.uidebugger.model.InspectableValue;
import com.facebook.flipper.plugins.uidebugger.model.InspectableValue$Coordinate3D$Companion;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* renamed from: X.UIq  reason: case insensitive filesystem */
public final class C14991UIq extends InspectableValue {
    public static final InspectableValue$Coordinate3D$Companion Companion = new Object();
    public final Coordinate3D A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C14991UIq) && 0qQ.A0K(this.A00, ((C14991UIq) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ C14991UIq(Coordinate3D coordinate3D, int i) {
        if (1 != (i & 1)) {
            VJ6.A00(C20475WsH.A01, i, 1);
            throw AnonymousClass00P.createAndThrow();
        } else {
            this.A00 = coordinate3D;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Coordinate3D(value=");
        return AnonymousClass7TG.A0n(this.A00, sb);
    }
}
