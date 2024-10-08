package com.facebook.flipper.plugins.uidebugger.model;

import X.002;
import X.AnonymousClass00P;
import X.C16705V2i;
import X.C20459Ws1;
import X.C255463uA;
import X.VJ6;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
public final class Bounds {
    public static final Companion Companion = new Object();
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public final class Companion {
        public final C255463uA serializer() {
            return C20459Ws1.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Bounds) {
                Bounds bounds = (Bounds) obj;
                if (!(this.A02 == bounds.A02 && this.A03 == bounds.A03 && this.A01 == bounds.A01 && this.A00 == bounds.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.A02 * 31) + this.A03) * 31) + this.A01) * 31) + this.A00;
    }

    public final String toString() {
        return 002.A0w("Bounds(x=", ", y=", ", width=", ", height=", ')', this.A02, this.A03, this.A01, this.A00);
    }

    @Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ Bounds(int i, int i2, int i3, int i4, int i5) {
        if (15 != (i & 15)) {
            VJ6.A00(C20459Ws1.A01, i, 15);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A02 = i2;
        this.A03 = i3;
        this.A01 = i4;
        this.A00 = i5;
    }
}
