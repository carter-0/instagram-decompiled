package X;

import com.facebook.flipper.plugins.bloksdebugger.ClientState;
import com.facebook.flipper.plugins.bloksdebugger.InstructionWithTs;
import com.facebook.flipper.plugins.bloksdebugger.Log$Companion;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
public final class WHG implements InstructionWithTs {
    public static final Log$Companion Companion = new Object();
    public final long A00;
    public final ClientState A01;
    public final Object A02;
    public final String A03;

    @Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ WHG(ClientState clientState, Object obj, @Serializable(with = C20432WrI.class) String str, int i, long j) {
        if (15 != (i & 15)) {
            VJ6.A00(C20449Wrr.A01, i, 15);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A03 = str;
        this.A02 = obj;
        this.A01 = clientState;
        this.A00 = j;
    }
}
