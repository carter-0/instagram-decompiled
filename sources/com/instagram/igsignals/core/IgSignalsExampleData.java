package com.instagram.igsignals.core;

import X.0wb;
import X.AnonymousClass00P;
import X.AnonymousClass409;
import X.AnonymousClass9FA;
import X.AnonymousClass9FC;
import X.C20507Wsn;
import X.C20508Wso;
import X.C20509Wsp;
import X.C250863mB;
import X.C255463uA;
import X.MOI;
import X.VJ6;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
public final class IgSignalsExampleData {
    public static final C255463uA[] A06;
    public static final Companion Companion = new Object();
    public final double A00;
    public final long A01;
    public final String A02;
    public final List A03;
    public final List A04;
    public final List A05;

    public final class Companion {
        public static final IgSignalsExampleData A00(String str) {
            AnonymousClass9FC A00 = AnonymousClass9FA.A00(MOI.A00, C250863mB.A03);
            try {
                C255463uA[] r0 = IgSignalsExampleData.A06;
                return (IgSignalsExampleData) A00.A00(str, C20507Wsn.A00);
            } catch (Exception | IllegalStateException unused) {
                0wb.A03("IgSignalsExample", "Corrupted example data");
                return null;
            }
        }

        public final C255463uA serializer() {
            return C20507Wsn.A00;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, com.instagram.igsignals.core.IgSignalsExampleData$Companion] */
    static {
        C20508Wso wso = C20508Wso.A00;
        A06 = new C255463uA[]{null, null, new AnonymousClass409(wso), null, new AnonymousClass409(wso), new AnonymousClass409(C20509Wsp.A00)};
    }

    public IgSignalsExampleData(String str, List list, List list2, List list3, double d, long j) {
        this.A02 = str;
        this.A00 = d;
        this.A03 = list;
        this.A01 = j;
        this.A04 = list2;
        this.A05 = list3;
    }

    public /* synthetic */ IgSignalsExampleData(String str, List list, List list2, List list3, double d, int i, long j) {
        if (63 != (i & 63)) {
            VJ6.A00(C20507Wsn.A01, i, 63);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A02 = str;
        this.A00 = d;
        this.A03 = list;
        this.A01 = j;
        this.A04 = list2;
        this.A05 = list3;
    }
}
