package com.instagram.igsignals.core;

import X.0qQ;
import X.C18751Vzm;
import X.C20509Wsp;
import X.C255453u9;
import X.C255463uA;
import X.C258613zM;
import X.C258703zV;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.Serializable;

@Serializable
public final class IgSignalsModelPrediction {
    public static final C255463uA[] A07 = {null, new C258613zM(C255453u9.A01, C258703zV.A00), null, null, null, null, null};
    public static final Companion Companion = new Object();
    public long A00;
    public long A01;
    public C18751Vzm A02;
    public final double A03;
    public final String A04;
    public final Map A05;
    public final boolean A06;

    public final class Companion {
        public final C255463uA serializer() {
            return C20509Wsp.A00;
        }
    }

    public IgSignalsModelPrediction(String str, Map map, double d, boolean z) {
        0qQ.A0B(map, 2);
        this.A03 = d;
        this.A05 = map;
        this.A06 = z;
        this.A04 = str;
        this.A01 = -1;
        this.A00 = -1;
    }

    public /* synthetic */ IgSignalsModelPrediction(C18751Vzm vzm, String str, Map map, double d, int i, long j, long j2, boolean z) {
        this.A03 = (i & 1) == 0 ? -1.0d : d;
        if ((i & 2) == 0) {
            this.A05 = new HashMap();
        } else {
            this.A05 = map;
        }
        if ((i & 4) == 0) {
            this.A06 = true;
        } else {
            this.A06 = z;
        }
        if ((i & 8) == 0) {
            this.A04 = null;
        } else {
            this.A04 = str;
        }
        if ((i & 16) == 0) {
            this.A02 = null;
        } else {
            this.A02 = vzm;
        }
        if ((i & 32) == 0) {
            this.A01 = -1;
        } else {
            this.A01 = j;
        }
        if ((i & 64) == 0) {
            this.A00 = -1;
        } else {
            this.A00 = j2;
        }
    }

    public IgSignalsModelPrediction() {
        this((String) null, new HashMap(), -1.0d, true);
    }
}
