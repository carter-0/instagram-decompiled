package com.facebook.commonavatarliveediting.prefetch;

import X.0eS;
import X.0qQ;
import X.0sL;
import X.1Hj;
import X.1IX;
import X.AnonymousClass00P;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C15046UKz;
import X.C18073Vl1;
import X.C20420Wr4;
import X.C60340gF;
import X.JTQ;
import X.MTM;
import X.VLB;
import X.W04;
import X.WF8;
import X.X7R;
import com.facebook.commonavatarliveediting.CdlProviderImpl;
import com.facebook.fbavatar.cdsavatareditor.liveediting.ig.IgCdlProviderBuilder;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.commonavatarliveediting.prefetch.CommonBloksActionHelper$initPrefetch$2$1", f = "CommonBloksActionHelper.kt", i = {0, 0}, l = {641}, m = "invokeSuspend", n = {"prefetchProvider", "resumingContinuation"}, s = {"L$0", "L$1"})
public final class CommonBloksActionHelper$initPrefetch$2$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public Object A02;
    public final /* synthetic */ C15046UKz A03;
    public final /* synthetic */ W04 A04;
    public final /* synthetic */ C18073Vl1 A05;
    public final /* synthetic */ 1IX A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommonBloksActionHelper$initPrefetch$2$1(C15046UKz uKz, W04 w04, C18073Vl1 vl1, AnonymousClass4D7 r5, 1IX r6, boolean z, boolean z2) {
        super(2, r5);
        this.A04 = w04;
        this.A03 = uKz;
        this.A05 = vl1;
        this.A08 = z;
        this.A07 = z2;
        this.A06 = r6;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.commonavatarliveediting.prefetch.CommonBloksActionHelper$initPrefetch$2$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r10) {
        W04 w04 = this.A04;
        return new CommonBloksActionHelper$initPrefetch$2$1(this.A03, w04, this.A05, r10, this.A06, this.A08, this.A07);
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [com.facebook.commonavatarliveediting.prefetch.CommonBloksActionHelper$initPrefetch$2$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        WF8 wf8;
        AtomicBoolean A0k;
        1Hj r8 = 1Hj.A02;
        String str = "cdlProviderHolder";
        if (this.A00 != 0) {
            A0k = (AtomicBoolean) this.A02;
            wf8 = (WF8) this.A01;
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            W04 w04 = this.A04;
            VLB vlb = w04.A00;
            if (vlb == null) {
                str = "avatarEmbodimentSupport";
            } else {
                QuickPerformanceLogger quickPerformanceLogger = w04.A07;
                if (quickPerformanceLogger == null) {
                    str = "quickPerformanceLogger";
                } else {
                    wf8 = WF8.A09;
                    if (wf8 == null) {
                        wf8 = new WF8(vlb, quickPerformanceLogger);
                        WF8.A09 = wf8;
                    }
                    A0k = JTQ.A0k();
                    C15046UKz uKz = this.A03;
                    if (!uKz.A0F) {
                        C18073Vl1 vl1 = this.A05;
                        if (vl1 != null) {
                            vl1.A02("INIT_CDL_HOLDER");
                        }
                        CommonCdlProviderHolder commonCdlProviderHolder = w04.A02;
                        if (commonCdlProviderHolder != null) {
                            boolean z = this.A08;
                            this.A01 = wf8;
                            this.A02 = A0k;
                            this.A00 = 1;
                            if (commonCdlProviderHolder.A00(uKz, vl1, this, z) == r8) {
                                return r8;
                            }
                        }
                    } else {
                        X7R x7r = w04.A01;
                        if (x7r == null) {
                            str = "aleProviderHolder";
                        } else {
                            WeakReference weakReference = wf8.A01;
                            if (weakReference == null || weakReference.get() == null) {
                                x7r.EBP(wf8);
                                x7r.CMo(uKz);
                            }
                            W04.A00(wf8, this.A05, A0k, this.A06);
                            return C60340gF.A00;
                        }
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        C18073Vl1 vl12 = this.A05;
        if (vl12 != null) {
            vl12.A01("INIT_CDL_HOLDER");
        }
        W04 w042 = this.A04;
        IgCdlProviderBuilder igCdlProviderBuilder = w042.A04;
        if (igCdlProviderBuilder == null) {
            str = "cdlProviderBuilder";
        } else {
            igCdlProviderBuilder.A02(this.A07);
            CommonCdlProviderHolder commonCdlProviderHolder2 = w042.A02;
            if (commonCdlProviderHolder2 != null) {
                MTM mtm = commonCdlProviderHolder2.cdlProviderInstance;
                if (mtm != null) {
                    wf8.A02 = new WeakReference(mtm);
                    if (((CdlProviderImpl) mtm).A00 != null) {
                        if (vl12 != null) {
                            vl12.A00("CDL_BRIDGE_ALREADY_INITIALIZED");
                        }
                        W04.A00(wf8, vl12, A0k, this.A06);
                    } else {
                        C20420Wr4 wr4 = new C20420Wr4(wf8, w042, vl12, A0k, this.A06);
                        CommonCdlProviderHolder commonCdlProviderHolder3 = w042.A02;
                        if (commonCdlProviderHolder3 != null) {
                            commonCdlProviderHolder3.A04.add(wr4);
                        }
                    }
                    return C60340gF.A00;
                }
                throw new RuntimeException("initCdlHolder not called");
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CommonBloksActionHelper$initPrefetch$2$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
