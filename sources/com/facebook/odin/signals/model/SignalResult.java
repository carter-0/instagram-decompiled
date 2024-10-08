package com.facebook.odin.signals.model;

import X.0Yh;
import X.0Yt;
import X.0qQ;
import X.0sm;
import X.AnonymousClass0T0;
import X.AnonymousClass409;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C255453u9;
import X.C255463uA;
import X.C258613zM;
import X.C258663zR;
import X.C2592140v;
import X.C51974G9v;
import X.C66580MXl;
import com.facebook.odin.model.OdinContext;
import java.util.Map;
import kotlinx.serialization.ContextualSerializer;
import kotlinx.serialization.Serializable;

@Serializable
public final class SignalResult extends AnonymousClass0T0 {
    public static final C255463uA[] A09;
    public static final Companion Companion = new Object();
    public final long A00;
    public final OdinContext A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final Map A05;
    public final Map A06;
    public final Map A07;
    public final Map A08;

    public final class Companion {
        public final C255463uA serializer() {
            return SignalResult$$serializer.INSTANCE;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, com.facebook.odin.signals.model.SignalResult$Companion] */
    static {
        C255453u9 r1 = C255453u9.A01;
        A09 = new C255463uA[]{null, null, new C258613zM(r1, C258663zR.A00), new C258613zM(r1, C2592140v.A00), new C258613zM(r1, r1), new C258613zM(r1, new AnonymousClass409(r1)), null, null, new ContextualSerializer(new 0Yh(OdinContext.class), new C255463uA[0])};
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SignalResult) {
                SignalResult signalResult = (SignalResult) obj;
                if (!0qQ.A0K(this.A03, signalResult.A03) || !0qQ.A0K(this.A04, signalResult.A04) || !0qQ.A0K(this.A06, signalResult.A06) || !0qQ.A0K(this.A05, signalResult.A05) || !0qQ.A0K(this.A08, signalResult.A08) || !0qQ.A0K(this.A07, signalResult.A07) || !0qQ.A0K(this.A02, signalResult.A02) || this.A00 != signalResult.A00 || !0qQ.A0K(this.A01, signalResult.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A072 = AnonymousClass7TF.A07(this.A08, AnonymousClass7TF.A07(this.A05, AnonymousClass7TF.A07(this.A06, (AnonymousClass7TE.A0O(this.A03) + AnonymousClass7TG.A0E(this.A04)) * 31)));
        return AnonymousClass7TF.A01(this.A00, (AnonymousClass7TF.A07(this.A07, A072) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C66580MXl.A1V("(id:", this.A03, sb);
        Map map = this.A06;
        if (!map.isEmpty()) {
            sb.append(AnonymousClass7TG.A0m(map, ",L: ", new StringBuilder()));
        }
        Map map2 = this.A05;
        if (!map2.isEmpty()) {
            sb.append(AnonymousClass7TG.A0m(map2, ",F: ", new StringBuilder()));
        }
        Map map3 = this.A08;
        if (!map3.isEmpty()) {
            sb.append(AnonymousClass7TG.A0m(map3, ",S: ", new StringBuilder()));
        }
        Map map4 = this.A07;
        if (!map4.isEmpty()) {
            sb.append(AnonymousClass7TG.A0m(map4, ",SL: ", new StringBuilder()));
        }
        String A0l = AnonymousClass7TF.A0l(")", sb);
        0qQ.A07(A0l);
        return A0l;
    }

    public /* synthetic */ SignalResult(OdinContext odinContext, String str, String str2, String str3, Map map, Map map2, Map map3, Map map4, int i, long j) {
        this.A03 = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.A04 = null;
        } else {
            this.A04 = str2;
        }
        if ((i & 4) == 0) {
            this.A06 = 0Yt.A0E();
        } else {
            this.A06 = map;
        }
        if ((i & 8) == 0) {
            this.A05 = 0Yt.A0E();
        } else {
            this.A05 = map2;
        }
        if ((i & 16) == 0) {
            this.A08 = 0Yt.A0E();
        } else {
            this.A08 = map3;
        }
        if ((i & 32) == 0) {
            this.A07 = 0Yt.A0E();
        } else {
            this.A07 = map4;
        }
        if ((i & 64) == 0) {
            this.A02 = null;
        } else {
            this.A02 = str3;
        }
        if ((i & 128) == 0) {
            this.A00 = 0;
        } else {
            this.A00 = j;
        }
        if ((i & 256) == 0) {
            this.A01 = null;
        } else {
            this.A01 = odinContext;
        }
    }

    public SignalResult() {
        0sm A0E = 0Yt.A0E();
        0sm A0E2 = 0Yt.A0E();
        0sm A0E3 = 0Yt.A0E();
        0sm A0E4 = 0Yt.A0E();
        C51974G9v.A0d(3, A0E, A0E2, A0E3, A0E4);
        this.A03 = "";
        this.A04 = null;
        this.A06 = A0E;
        this.A05 = A0E2;
        this.A08 = A0E3;
        this.A07 = A0E4;
        this.A02 = null;
        this.A00 = 0;
        this.A01 = null;
    }
}
