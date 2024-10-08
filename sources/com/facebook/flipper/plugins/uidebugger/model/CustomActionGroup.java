package com.facebook.flipper.plugins.uidebugger.model;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass409;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C16705V2i;
import X.C20464Ws6;
import X.C255463uA;
import X.VJ6;
import X.X0V;
import X.X0W;
import java.util.List;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.Serializable;

@Serializable
public final class CustomActionGroup {
    public static final C255463uA[] A03 = {null, PolymorphicSerializer.A00(X0W.class), new AnonymousClass409(PolymorphicSerializer.A00(X0V.class))};
    public static final Companion Companion = new Object();
    public final X0W A00;
    public final String A01;
    public final List A02;

    public final class Companion {
        public final C255463uA serializer() {
            return C20464Ws6.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CustomActionGroup) {
                CustomActionGroup customActionGroup = (CustomActionGroup) obj;
                if (!0qQ.A0K(this.A01, customActionGroup.A01) || !0qQ.A0K(this.A00, customActionGroup.A00) || !0qQ.A0K(this.A02, customActionGroup.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    @Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ CustomActionGroup(X0W x0w, String str, List list, int i) {
        if (7 != (i & 7)) {
            VJ6.A00(C20464Ws6.A01, i, 7);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A01 = str;
        this.A00 = x0w;
        this.A02 = list;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0O(this.A01)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CustomActionGroup(title=");
        sb.append(this.A01);
        sb.append(", actionIcon=");
        sb.append(this.A00);
        sb.append(", actions=");
        return AnonymousClass7TG.A0n(this.A02, sb);
    }
}
