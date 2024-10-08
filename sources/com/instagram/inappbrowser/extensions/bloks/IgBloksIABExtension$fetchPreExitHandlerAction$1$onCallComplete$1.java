package com.instagram.inappbrowser.extensions.bloks;

import X.0eS;
import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C3034368u;
import X.C360998fV;
import X.C46620Di0;
import X.C60340gF;
import X.C8814RAq;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.inappbrowser.extensions.bloks.IgBloksIABExtension$fetchPreExitHandlerAction$1$onCallComplete$1", f = "IgBloksIABExtension.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class IgBloksIABExtension$fetchPreExitHandlerAction$1$onCallComplete$1 extends AnonymousClass1Ek implements 0sL {
    public final /* synthetic */ C8814RAq A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgBloksIABExtension$fetchPreExitHandlerAction$1$onCallComplete$1(C8814RAq rAq, String str, String str2, String str3, AnonymousClass4D7 r6) {
        super(2, r6);
        this.A00 = rAq;
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.inappbrowser.extensions.bloks.IgBloksIABExtension$fetchPreExitHandlerAction$1$onCallComplete$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r8) {
        return new IgBloksIABExtension$fetchPreExitHandlerAction$1$onCallComplete$1(this.A00, this.A03, this.A02, this.A01, r8);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((IgBloksIABExtension$fetchPreExitHandlerAction$1$onCallComplete$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0eS.A00(obj);
        C8814RAq rAq = this.A00;
        AtomicReference atomicReference = rAq.A06;
        String str = this.A03;
        C46620Di0 di0 = null;
        if (str != null) {
            try {
                C3034368u A002 = C360998fV.A00(rAq.A07, str, (String) null);
                if (A002 != null) {
                    di0 = C46620Di0.A00(A002);
                }
            } catch (Exception unused) {
            }
        }
        atomicReference.set(di0);
        AtomicReference atomicReference2 = rAq.A05;
        String str2 = this.A02;
        C46620Di0 di02 = null;
        if (str2 != null) {
            try {
                C3034368u A003 = C360998fV.A00(rAq.A07, str2, (String) null);
                if (A003 != null) {
                    di02 = C46620Di0.A00(A003);
                }
            } catch (Exception unused2) {
            }
        }
        atomicReference2.set(di02);
        AtomicReference atomicReference3 = rAq.A04;
        String str3 = this.A01;
        C46620Di0 di03 = null;
        if (str3 != null) {
            try {
                C3034368u A004 = C360998fV.A00(rAq.A07, str3, (String) null);
                if (A004 != null) {
                    di03 = C46620Di0.A00(A004);
                }
            } catch (Exception unused3) {
            }
        }
        atomicReference3.set(di03);
        return C60340gF.A00;
    }
}
