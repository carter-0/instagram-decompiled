package com.shopify.checkout.models;

import X.AnonymousClass00P;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C20539WtK;
import X.C255463uA;
import X.VJ6;
import kotlinx.serialization.Serializable;

@Serializable
public final class ProgressButton {
    public static final Companion Companion = new Object();
    public final ProgressButtonStage A00;
    public final ProgressButtonState A01;

    public final class Companion {
        public final C255463uA serializer() {
            return C20539WtK.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProgressButton) {
                ProgressButton progressButton = (ProgressButton) obj;
                if (!(this.A01 == progressButton.A01 && this.A00 == progressButton.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ ProgressButton(ProgressButtonStage progressButtonStage, ProgressButtonState progressButtonState, int i) {
        if (3 != (i & 3)) {
            VJ6.A00(C20539WtK.A01, i, 3);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A01 = progressButtonState;
        this.A00 = progressButtonStage;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TE.A0K(this.A01));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProgressButton(state=");
        sb.append(this.A01);
        sb.append(", stage=");
        return AnonymousClass7TG.A0n(this.A00, sb);
    }
}
