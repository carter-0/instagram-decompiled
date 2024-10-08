package X;

import com.facebook.flipper.plugins.uidebugger.model.Coordinate;
import com.facebook.flipper.plugins.uidebugger.model.InspectableValue;
import com.facebook.flipper.plugins.uidebugger.model.InspectableValue$Coordinate$Companion;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* renamed from: X.UIr  reason: case insensitive filesystem */
public final class C14992UIr extends InspectableValue {
    public static final InspectableValue$Coordinate$Companion Companion = new Object();
    public final Coordinate A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C14992UIr) && 0qQ.A0K(this.A00, ((C14992UIr) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ C14992UIr(Coordinate coordinate, int i) {
        if (1 != (i & 1)) {
            VJ6.A00(C20474WsG.A01, i, 1);
            throw AnonymousClass00P.createAndThrow();
        } else {
            this.A00 = coordinate;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Coordinate(value=");
        return AnonymousClass7TG.A0n(this.A00, sb);
    }
}
