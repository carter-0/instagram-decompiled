package com.instagram.rtc.stateprovider;

import X.0eS;
import X.0sK;
import X.0sn;
import X.AnonymousClass0t1;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C51970G9q;
import X.C60340gF;
import X.C61034JvY;
import X.C62320sa;
import X.C69281Nih;
import X.C70903OQv;
import X.C74154Ppv;
import X.DbT;
import X.DbV;
import X.L2O;
import X.N3Z;
import X.N9D;
import X.OAC;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.rtc.stateprovider.RtcCallOutgoingStateProvider$outgoingModel$1", f = "RtcCallOutgoingStateProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class RtcCallOutgoingStateProvider$outgoingModel$1 extends AnonymousClass1Ek implements 0sK {
    public /* synthetic */ Object A00;
    public /* synthetic */ Object A01;
    public final /* synthetic */ OAC A02;
    public final /* synthetic */ C62320sa A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RtcCallOutgoingStateProvider$outgoingModel$1(OAC oac, AnonymousClass4D7 r3, C62320sa r4, boolean z, boolean z2) {
        super(3, r3);
        this.A04 = z;
        this.A05 = z2;
        this.A03 = r4;
        this.A02 = oac;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z = this.A04;
        boolean z2 = this.A05;
        C62320sa r4 = this.A03;
        RtcCallOutgoingStateProvider$outgoingModel$1 rtcCallOutgoingStateProvider$outgoingModel$1 = new RtcCallOutgoingStateProvider$outgoingModel$1(this.A02, (AnonymousClass4D7) obj3, r4, z, z2);
        rtcCallOutgoingStateProvider$outgoingModel$1.A00 = obj;
        rtcCallOutgoingStateProvider$outgoingModel$1.A01 = obj2;
        return rtcCallOutgoingStateProvider$outgoingModel$1.invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0eS.A00(obj);
        C69281Nih nih = (C69281Nih) this.A00;
        L2O l2o = (L2O) this.A01;
        C69281Nih nih2 = C69281Nih.A03;
        if (nih == nih2) {
            return new N9D(nih2, "", 0sn.A00, false, false, this.A04, this.A05);
        }
        N3Z n3z = (N3Z) this.A03.invoke();
        if (n3z != null) {
            return new N9D(nih, n3z.A03, n3z.A06, C51970G9q.A1W(n3z.A07.size(), 1), n3z.A08, this.A04, this.A05);
        }
        Map map = l2o.A00;
        OAC oac = this.A02;
        Collection values = map.values();
        ArrayList<C61034JvY> A1C = AnonymousClass7TE.A1C();
        for (Object next : values) {
            DbV.A1U(next, A1C, C70903OQv.A01((C61034JvY) next, AnonymousClass0t1.A01.A01(oac.A00)) ? 1 : 0);
        }
        ArrayList A0r = AnonymousClass7TG.A0r(A1C);
        for (C61034JvY jvY : A1C) {
            A0r.add(jvY.A03);
        }
        Collection values2 = map.values();
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        for (Object next2 : values2) {
            DbV.A1U(next2, A1C2, C70903OQv.A01((C61034JvY) next2, AnonymousClass0t1.A01.A01(oac.A00)) ? 1 : 0);
        }
        return new N9D(nih, DbT.A0z(", ", A1C2, C74154Ppv.A00), A0r, C51970G9q.A1W(map.size(), 2), false, false, false);
    }
}
