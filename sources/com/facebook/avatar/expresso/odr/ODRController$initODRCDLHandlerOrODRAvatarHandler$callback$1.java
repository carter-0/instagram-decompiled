package com.facebook.avatar.expresso.odr;

import X.0V2;
import X.0eS;
import X.0qQ;
import X.0sK;
import X.1Hj;
import X.AnonymousClass00P;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C262224Cq;
import X.C51972G9s;
import X.C51973G9u;
import X.C59703JUk;
import X.C60340gF;
import X.C60784JrF;
import X.C60785JrG;
import X.C60787JrI;
import X.C60794JrP;
import X.C60795JrQ;
import X.C62696Kkw;
import X.C64164LRf;
import X.JTP;
import X.MTI;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.avatar.expresso.odr.ODRController$initODRCDLHandlerOrODRAvatarHandler$callback$1", f = "ODRController.kt", i = {}, l = {353, 357, 362}, m = "invokeSuspend", n = {}, s = {})
public final class ODRController$initODRCDLHandlerOrODRAvatarHandler$callback$1 extends AnonymousClass1Ek implements 0sK {
    public int A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ Object A02;
    public final /* synthetic */ ODRController A03;
    public final /* synthetic */ C60794JrP A04;
    public final /* synthetic */ C60795JrQ A05;
    public final /* synthetic */ C262224Cq A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ODRController$initODRCDLHandlerOrODRAvatarHandler$callback$1(ODRController oDRController, C60794JrP jrP, C60795JrQ jrQ, AnonymousClass4D7 r5, C262224Cq r6) {
        super(3, r5);
        this.A06 = r6;
        this.A03 = oDRController;
        this.A05 = jrQ;
        this.A04 = jrP;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C262224Cq r6 = this.A06;
        ODRController oDRController = this.A03;
        C60795JrQ jrQ = this.A05;
        ODRController$initODRCDLHandlerOrODRAvatarHandler$callback$1 oDRController$initODRCDLHandlerOrODRAvatarHandler$callback$1 = new ODRController$initODRCDLHandlerOrODRAvatarHandler$callback$1(oDRController, this.A04, jrQ, (AnonymousClass4D7) obj3, r6);
        oDRController$initODRCDLHandlerOrODRAvatarHandler$callback$1.A01 = obj;
        oDRController$initODRCDLHandlerOrODRAvatarHandler$callback$1.A02 = obj2;
        return oDRController$initODRCDLHandlerOrODRAvatarHandler$callback$1.invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [com.facebook.avatar.expresso.odr.ODRController$initODRCDLHandlerOrODRAvatarHandler$callback$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        Object emit;
        Object obj2 = 1Hj.A02;
        int i = this.A00;
        if (i == 0) {
            0eS.A00(obj);
            C62696Kkw kkw = (C62696Kkw) this.A01;
            C60787JrI jrI = (C60787JrI) this.A02;
            if (kkw instanceof C60784JrF) {
                C60784JrF jrF = (C60784JrF) kkw;
                jrF.A00.getCanonicalPath();
                C262224Cq r1 = this.A06;
                ODRController oDRController = this.A03;
                AnonymousClass7TE.A1Z(new C59703JUk((Object) kkw, (Object) oDRController, (Object) this.A05, (Object) jrI, (Object) this.A04, (AnonymousClass4D7) null, 8), r1);
                0V2 r14 = oDRController.A0F;
                String A0u = JTP.A0u(jrF.A00);
                String str = jrI.A0A;
                int i2 = jrI.A01;
                int i3 = jrI.A02;
                int i4 = jrI.A03;
                int i5 = jrI.A00;
                String str2 = jrI.A0B;
                String str3 = jrI.A05;
                String str4 = jrI.A08;
                String str5 = jrI.A06;
                String str6 = jrI.A04;
                String str7 = jrI.A07;
                0qQ.A0B(str, 1);
                C51972G9s.A1E(str2, str3);
                C51973G9u.A0u(8, str4, str5, str6);
                0qQ.A0B(str7, 11);
                String str8 = str4;
                String str9 = str5;
                String str10 = str6;
                String str11 = str;
                String str12 = str2;
                String str13 = str3;
                C60787JrI jrI2 = new C60787JrI(A0u, str11, str12, str13, str8, str9, str10, str7, i2, i3, i4, i5);
                this.A01 = null;
                this.A00 = 1;
                emit = r14.emit(jrI2, this);
            } else {
                boolean z = kkw instanceof C60785JrG;
                0V2 r0 = this.A03.A0F;
                this.A01 = null;
                if (z) {
                    this.A00 = 2;
                    if (r0.emit(kkw, this) == obj2) {
                        return obj2;
                    }
                } else {
                    this.A00 = 3;
                    emit = r0.emit(kkw, this);
                }
            }
            if (emit == obj2) {
                return obj2;
            }
            return C60340gF.A00;
        } else if (i == 1 || i != 2) {
            0eS.A00(obj);
            return C60340gF.A00;
        } else {
            0eS.A00(obj);
        }
        ODRController oDRController2 = this.A03;
        MTI mti = oDRController2.A00;
        if (mti != null) {
            mti.onDestroy();
        }
        C64164LRf lRf = oDRController2.A03;
        if (lRf == null) {
            0qQ.A0F("ig4aAvatarRichMediaViewerProvider");
            throw AnonymousClass00P.createAndThrow();
        }
        lRf.A03();
        return C60340gF.A00;
    }
}
