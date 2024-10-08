package X;

import com.facebook.flipper.plugins.uidebugger.model.InspectableValue;
import com.facebook.flipper.plugins.uidebugger.model.InspectableValue$Number$Companion;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* renamed from: X.UIt  reason: case insensitive filesystem */
public final class C14994UIt extends InspectableValue {
    public static final InspectableValue$Number$Companion Companion = new Object();
    public final Number A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C14994UIt) && 0qQ.A0K(this.A00, ((C14994UIt) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ C14994UIt(Number number, @Serializable(with = C20433WrJ.class) int i) {
        if (1 != (i & 1)) {
            VJ6.A00(C20477WsJ.A01, i, 1);
            throw AnonymousClass00P.createAndThrow();
        } else {
            this.A00 = number;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AnonymousClass000.A00(2389));
        return AnonymousClass7TG.A0n(this.A00, sb);
    }
}
