package X;

import com.facebook.flipper.plugins.bloksdebugger.InstructionWithTs;
import com.facebook.flipper.plugins.bloksdebugger.StateUpdate$Companion;
import java.util.List;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
public final class WHH implements InstructionWithTs {
    public static final C255463uA[] A06 = {null, null, null, null, null, new AnonymousClass409(C360278eK.A00)};
    public static final StateUpdate$Companion Companion = new Object();
    public final long A00;
    public final Object A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;

    @Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ WHH(Object obj, String str, String str2, String str3, @Serializable(with = C20432WrI.class) List list, int i, long j) {
        if (63 != (i & 63)) {
            VJ6.A00(C20452Wru.A01, i, 63);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A00 = j;
        this.A04 = str;
        this.A03 = str2;
        this.A01 = obj;
        this.A02 = str3;
        this.A05 = list;
    }
}
