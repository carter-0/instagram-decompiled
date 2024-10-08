package X;

import com.facebook.flipper.plugins.uidebugger.model.Inspectable;
import com.facebook.flipper.plugins.uidebugger.model.InspectableObject$Companion;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* renamed from: X.UIm  reason: case insensitive filesystem */
public final class C14987UIm extends Inspectable {
    public static final C255463uA[] A01 = {new C258613zM(C360278eK.A00, (C255463uA) Inspectable.A00.getValue())};
    public static final InspectableObject$Companion Companion = new Object();
    public final Map A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C14987UIm) && 0qQ.A0K(this.A00, ((C14987UIm) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ C14987UIm(Map map, int i) {
        if (1 != (i & 1)) {
            VJ6.A00(C20470WsC.A01, i, 1);
            throw AnonymousClass00P.createAndThrow();
        } else {
            this.A00 = map;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InspectableObject(fields=");
        return AnonymousClass7TG.A0n(this.A00, sb);
    }
}
