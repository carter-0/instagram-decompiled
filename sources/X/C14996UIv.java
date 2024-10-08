package X;

import com.facebook.flipper.plugins.uidebugger.model.InspectableValue;
import com.facebook.flipper.plugins.uidebugger.model.InspectableValue$SpaceBox$Companion;
import com.facebook.flipper.plugins.uidebugger.model.SpaceBox;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* renamed from: X.UIv  reason: case insensitive filesystem */
public final class C14996UIv extends InspectableValue {
    public static final InspectableValue$SpaceBox$Companion Companion = new Object();
    public final SpaceBox A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C14996UIv) && 0qQ.A0K(this.A00, ((C14996UIv) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ C14996UIv(SpaceBox spaceBox, int i) {
        if (1 != (i & 1)) {
            VJ6.A00(C20479WsL.A01, i, 1);
            throw AnonymousClass00P.createAndThrow();
        } else {
            this.A00 = spaceBox;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SpaceBox(value=");
        return AnonymousClass7TG.A0n(this.A00, sb);
    }
}
