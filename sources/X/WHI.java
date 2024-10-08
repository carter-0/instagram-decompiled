package X;

import com.facebook.flipper.plugins.uidebugger.model.Action$BooleanAction$Companion;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
public final class WHI implements X0V {
    public static final Action$BooleanAction$Companion Companion = new Object();
    public final String A00;
    public final boolean A01;
    public final 0sP A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WHI) {
                WHI whi = (WHI) obj;
                if (!0qQ.A0K(this.A00, whi.A00) || this.A01 != whi.A01 || !0qQ.A0K(this.A02, whi.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    @Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ WHI(String str, int i, boolean z) {
        if (3 != (i & 3)) {
            VJ6.A00(C20454Wrw.A01, i, 3);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A00 = str;
        this.A01 = z;
        this.A02 = C20715Wxo.A00;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A09(this.A01, AnonymousClass7TE.A0O(this.A00)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BooleanAction(title=");
        sb.append(this.A00);
        sb.append(", value=");
        sb.append(this.A01);
        sb.append(", action=");
        return AnonymousClass7TG.A0n(this.A02, sb);
    }
}
