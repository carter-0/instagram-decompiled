package X;

import com.facebook.flipper.plugins.uidebugger.model.Action$UnitAction$Companion;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.Serializable;

@Serializable
public final class WHJ implements X0V {
    public static final C255463uA[] A03 = {null, PolymorphicSerializer.A00(X0W.class)};
    public static final Action$UnitAction$Companion Companion = new Object();
    public final X0W A00;
    public final String A01;
    public final C62320sa A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WHJ) {
                WHJ whj = (WHJ) obj;
                if (!0qQ.A0K(this.A01, whj.A01) || !0qQ.A0K(this.A00, whj.A00) || !0qQ.A0K(this.A02, whj.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    @Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ WHJ(X0W x0w, String str, int i) {
        if (3 != (i & 3)) {
            VJ6.A00(C20455Wrx.A01, i, 3);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A01 = str;
        this.A00 = x0w;
        this.A02 = C20621WwF.A00;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0O(this.A01)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UnitAction(title=");
        sb.append(this.A01);
        sb.append(", actionIcon=");
        sb.append(this.A00);
        sb.append(", action=");
        return AnonymousClass7TG.A0n(this.A02, sb);
    }
}
