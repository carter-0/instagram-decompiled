package X;

import com.facebook.flipper.plugins.bloksdebugger.FnTableRead$Companion;
import com.facebook.flipper.plugins.bloksdebugger.Instruction;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
public final class WHE implements Instruction {
    public static final FnTableRead$Companion Companion = new Object();
    public final String A00;
    public final String A01;

    @Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ WHE(String str, String str2, int i) {
        if (3 != (i & 3)) {
            VJ6.A00(C20447Wrp.A01, i, 3);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A01 = str;
        this.A00 = str2;
    }
}
