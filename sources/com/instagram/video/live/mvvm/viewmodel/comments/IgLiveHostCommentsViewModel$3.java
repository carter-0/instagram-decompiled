package com.instagram.video.live.mvvm.viewmodel.comments;

import X.0eS;
import X.0sK;
import X.1Hj;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C249513ju;
import X.C60340gF;
import X.C62287KdL;
import X.C62292KdQ;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.video.live.mvvm.viewmodel.comments.IgLiveHostCommentsViewModel$3", f = "IgLiveHostCommentsViewModel.kt", i = {}, l = {156}, m = "invokeSuspend", n = {}, s = {})
public final class IgLiveHostCommentsViewModel$3 extends AnonymousClass1Ek implements 0sK {
    public int A00;
    public /* synthetic */ boolean A01;
    public /* synthetic */ boolean A02;
    public final /* synthetic */ C62287KdL A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgLiveHostCommentsViewModel$3(C62287KdL kdL, AnonymousClass4D7 r3) {
        super(3, r3);
        this.A03 = kdL;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.video.live.mvvm.viewmodel.comments.IgLiveHostCommentsViewModel$3, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        1Hj r3 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            boolean z = this.A01;
            boolean z2 = this.A02;
            if (!z || z2) {
                C249513ju r1 = this.A03.A03;
                C62292KdQ kdQ = C62292KdQ.A00;
                this.A00 = 1;
                if (r1.ELH(kdQ, this) == r3) {
                    return r3;
                }
            }
        }
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean A1a = AnonymousClass7TE.A1a(obj);
        boolean A1a2 = AnonymousClass7TE.A1a(obj2);
        IgLiveHostCommentsViewModel$3 igLiveHostCommentsViewModel$3 = new IgLiveHostCommentsViewModel$3(this.A03, (AnonymousClass4D7) obj3);
        igLiveHostCommentsViewModel$3.A01 = A1a;
        igLiveHostCommentsViewModel$3.A02 = A1a2;
        return igLiveHostCommentsViewModel$3.invokeSuspend(C60340gF.A00);
    }
}
