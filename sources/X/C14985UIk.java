package X;

import com.facebook.flipper.plugins.bloksdebugger.Event;
import com.facebook.flipper.plugins.bloksdebugger.Instruction;
import com.facebook.flipper.plugins.bloksdebugger.ScriptExecuted$Companion;
import com.facebook.flipper.plugins.bloksdebugger.ScriptStatus;
import java.util.List;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* renamed from: X.UIk  reason: case insensitive filesystem */
public final class C14985UIk extends Event {
    public static final C255463uA[] A09 = {null, C258643zP.A00("com.facebook.flipper.plugins.bloksdebugger.ScriptStatus", ScriptStatus.values()), null, new AnonymousClass409(C255453u9.A01), new AnonymousClass409(C20803WzG.A00(new 0Yh(WHC.class), new 0Yh(Instruction.class))), null, null, null, null};
    public static final ScriptExecuted$Companion Companion = new Object();
    public final long A00;
    public final ScriptStatus A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;
    public final List A08;

    @Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ C14985UIk(ScriptStatus scriptStatus, Object obj, Object obj2, @Serializable(with = C20432WrI.class) String str, String str2, String str3, List list, @Serializable(with = C20432WrI.class) List list2, int i, long j) {
        if (511 != (i & 511)) {
            VJ6.A00(C20451Wrt.A01, i, 511);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A04 = str;
        this.A01 = scriptStatus;
        this.A03 = obj;
        this.A07 = list;
        this.A08 = list2;
        this.A06 = str2;
        this.A02 = obj2;
        this.A05 = str3;
        this.A00 = j;
    }
}
