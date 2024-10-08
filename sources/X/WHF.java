package X;

import com.facebook.flipper.plugins.bloksdebugger.InstructionWithTs;
import com.facebook.flipper.plugins.bloksdebugger.SLog$Companion;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
public final class WHF implements InstructionWithTs {
    public static final SLog$Companion Companion = new Object();
    public final long A00;
    public final Object A01;
    public final String A02;

    @Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ WHF(Object obj, String str, @Serializable(with = C20432WrI.class) int i, long j) {
        if (7 != (i & 7)) {
            VJ6.A00(C20450Wrs.A01, i, 7);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A02 = str;
        this.A01 = obj;
        this.A00 = j;
    }
}
