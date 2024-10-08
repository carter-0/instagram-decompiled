package com.facebook.rp.platform.callutil;

import X.0eS;
import X.0r1;
import X.0rm;
import X.0sL;
import X.0sP;
import X.0sn;
import X.1Hj;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C241603Pv;
import X.C51971G9r;
import X.C60340gF;
import X.C69560No4;
import X.C73540PeW;
import X.NCB;
import X.NCD;
import X.OOX;
import X.OX3;
import com.meta.foa.session.FoaUserSession;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.rp.platform.callutil.WaitForCallConditionKt$waitForCallCondition$3", f = "WaitForCallCondition.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {})
public final class WaitForCallConditionKt$waitForCallCondition$3 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C73540PeW A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ 0sP A04;
    public final /* synthetic */ 0sP A05;
    public final /* synthetic */ 0r1 A06;
    public final /* synthetic */ 0rm A07;
    public final /* synthetic */ 0rm A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaitForCallConditionKt$waitForCallCondition$3(C73540PeW peW, String str, AnonymousClass4D7 r4, 0sP r5, 0sP r6, 0r1 r7, 0rm r8, 0rm r9, long j) {
        super(2, r4);
        this.A01 = j;
        this.A04 = r5;
        this.A02 = peW;
        this.A03 = str;
        this.A06 = r7;
        this.A08 = r8;
        this.A07 = r9;
        this.A05 = r6;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4D7, com.facebook.rp.platform.callutil.WaitForCallConditionKt$waitForCallCondition$3] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r13) {
        long j = this.A01;
        0sP r4 = this.A04;
        return new WaitForCallConditionKt$waitForCallCondition$3(this.A02, this.A03, r13, r4, this.A05, this.A06, this.A08, this.A07, j);
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [X.4D7, com.facebook.rp.platform.callutil.WaitForCallConditionKt$waitForCallCondition$3] */
    public final Object invokeSuspend(Object obj) {
        0r1 r4;
        0rm r3;
        0rm r2;
        0sP r1;
        C69560No4 no4;
        1Hj r22 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            long j = this.A01;
            this.A00 = 1;
            if (C241603Pv.A01(this, j) == r22) {
                return r22;
            }
        }
        0sP r12 = this.A04;
        C73540PeW peW = this.A02;
        if (C51971G9r.A1a(peW.B9B().invoke(), r12)) {
            OX3.A02((FoaUserSession) null, "wait_for_call_condition_timeout_but_condition_passed", this.A03, (String) null, 0sn.A00, (Map) null, true);
            r4 = this.A06;
            r3 = this.A08;
            r2 = this.A07;
            r1 = this.A05;
            no4 = new NCB(peW);
        } else {
            r4 = this.A06;
            r3 = this.A08;
            r2 = this.A07;
            r1 = this.A05;
            no4 = NCD.A00;
        }
        OOX.A01(no4, r1, r4, r3, r2);
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((WaitForCallConditionKt$waitForCallCondition$3) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
