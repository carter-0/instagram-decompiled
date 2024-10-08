package com.facebook.flipper.plugins.uidebugger.model;

import X.0eO;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.C20622WwG;
import X.C255463uA;
import kotlinx.serialization.Serializable;

@Serializable
public abstract class Inspectable {
    public static final AnonymousClass0eM A00 = AnonymousClass0eN.A00(0eO.A03, C20622WwG.A00);
    public static final Companion Companion = new Object();

    public final class Companion {
        public final C255463uA serializer() {
            return (C255463uA) Inspectable.A00.getValue();
        }
    }
}
