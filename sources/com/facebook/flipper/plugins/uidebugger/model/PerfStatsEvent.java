package com.facebook.flipper.plugins.uidebugger.model;

import X.AnonymousClass00P;
import X.C16705V2i;
import X.C20484WsQ;
import X.C255463uA;
import X.VJ6;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
public final class PerfStatsEvent {
    public static final Companion Companion = new Object();
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final long A0A;
    public final long A0B;

    public final class Companion {
        public final C255463uA serializer() {
            return C20484WsQ.A00;
        }
    }

    @Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ PerfStatsEvent(int i, int i2, int i3, int i4, int i5, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        if (4095 != (i & 4095)) {
            VJ6.A00(C20484WsQ.A01, i, 4095);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A0B = j;
        this.A01 = i2;
        this.A00 = i3;
        this.A09 = j2;
        this.A0A = j3;
        this.A07 = j4;
        this.A05 = j5;
        this.A04 = j6;
        this.A06 = j7;
        this.A08 = j8;
        this.A02 = i4;
        this.A03 = i5;
    }
}
