package X;

import com.facebook.flipper.plugins.uidebugger.model.Inspectable;
import com.facebook.flipper.plugins.uidebugger.model.InspectableArray$Companion;
import java.util.List;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* renamed from: X.UIl  reason: case insensitive filesystem */
public final class C14986UIl extends Inspectable {
    public static final C255463uA[] A01 = {new AnonymousClass409((C255463uA) Inspectable.A00.getValue())};
    public static final InspectableArray$Companion Companion = new Object();
    public final List A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C14986UIl) && 0qQ.A0K(this.A00, ((C14986UIl) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ C14986UIl(List list, int i) {
        if (1 != (i & 1)) {
            VJ6.A00(C20469WsB.A01, i, 1);
            throw AnonymousClass00P.createAndThrow();
        } else {
            this.A00 = list;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InspectableArray(items=");
        return AnonymousClass7TG.A0n(this.A00, sb);
    }
}
