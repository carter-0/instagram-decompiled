package X;

import com.facebook.flipper.plugins.uidebugger.model.InspectableValue;
import com.facebook.flipper.plugins.uidebugger.model.InspectableValue$Size$Companion;
import com.facebook.flipper.plugins.uidebugger.model.Size;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* renamed from: X.UIu  reason: case insensitive filesystem */
public final class C14995UIu extends InspectableValue {
    public static final InspectableValue$Size$Companion Companion = new Object();
    public final Size A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C14995UIu) && 0qQ.A0K(this.A00, ((C14995UIu) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ C14995UIu(Size size, int i) {
        if (1 != (i & 1)) {
            VJ6.A00(C20478WsK.A01, i, 1);
            throw AnonymousClass00P.createAndThrow();
        } else {
            this.A00 = size;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Size(value=");
        return AnonymousClass7TG.A0n(this.A00, sb);
    }
}
