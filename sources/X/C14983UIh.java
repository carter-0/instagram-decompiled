package X;

import com.facebook.flipper.plugins.bloksdebugger.Event;
import com.facebook.flipper.plugins.bloksdebugger.InitialState$Companion;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* renamed from: X.UIh  reason: case insensitive filesystem */
public final class C14983UIh extends Event {
    public static final InitialState$Companion Companion = new Object();
    public final Object A00;
    public final String A01;
    public final String A02;
    public final String A03;

    @Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ C14983UIh(Object obj, String str, @Serializable(with = C20432WrI.class) String str2, String str3, int i) {
        if (15 != (i & 15)) {
            VJ6.A00(C20448Wrq.A01, i, 15);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A03 = str;
        this.A00 = obj;
        this.A02 = str2;
        this.A01 = str3;
    }
}
