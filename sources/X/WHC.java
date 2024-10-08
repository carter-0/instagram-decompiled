package X;

import com.facebook.flipper.plugins.bloksdebugger.BridgedFn$Companion;
import com.facebook.flipper.plugins.bloksdebugger.Instruction;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
public final class WHC implements Instruction {
    public static final BridgedFn$Companion Companion = new Object();
    public final String A00;

    @Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ WHC(String str, int i) {
        if (1 != (i & 1)) {
            VJ6.A00(C20444Wrm.A01, i, 1);
            throw AnonymousClass00P.createAndThrow();
        } else {
            this.A00 = str;
        }
    }
}
