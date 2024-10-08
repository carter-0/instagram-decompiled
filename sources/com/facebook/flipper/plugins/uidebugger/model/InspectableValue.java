package com.facebook.flipper.plugins.uidebugger.model;

import X.0eO;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.C20623WwH;
import X.C255463uA;
import kotlinx.serialization.Serializable;

@Serializable
public abstract class InspectableValue extends Inspectable {
    public static final AnonymousClass0eM A00 = AnonymousClass0eN.A00(0eO.A03, C20623WwH.A00);
    public static final Companion Companion = new Object();

    public final class Companion {
        public final C255463uA serializer() {
            return (C255463uA) InspectableValue.A00.getValue();
        }
    }
}
