package com.instagram.feed.opencarousel.reviewpage.viewmodel;

import X.0eS;
import X.0sL;
import X.0sn;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C324356z9;
import X.C53039GhV;
import X.C54662HMt;
import X.C57093IOh;
import X.C60340gF;
import X.GMQ;
import X.H4H;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.feed.opencarousel.reviewpage.viewmodel.OpenCarouselReviewPageViewModel$fetchSubmission$2", f = "OpenCarouselReviewPageViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class OpenCarouselReviewPageViewModel$fetchSubmission$2 extends AnonymousClass1Ek implements 0sL {
    public final /* synthetic */ C324356z9 A00;
    public final /* synthetic */ C53039GhV A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenCarouselReviewPageViewModel$fetchSubmission$2(C324356z9 r2, C53039GhV ghV, AnonymousClass4D7 r4, boolean z, boolean z2) {
        super(2, r4);
        this.A03 = z;
        this.A01 = ghV;
        this.A02 = z2;
        this.A00 = r2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4D7, com.instagram.feed.opencarousel.reviewpage.viewmodel.OpenCarouselReviewPageViewModel$fetchSubmission$2] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r8) {
        boolean z = this.A03;
        return new OpenCarouselReviewPageViewModel$fetchSubmission$2(this.A00, this.A01, r8, z, this.A02);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((OpenCarouselReviewPageViewModel$fetchSubmission$2) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0eS.A00(obj);
        if (this.A03) {
            C57093IOh iOh = this.A01.A02;
            iOh.A01 = 0sn.A00;
            iOh.A00 = null;
        }
        C53039GhV ghV = this.A01;
        C57093IOh iOh2 = ghV.A02;
        boolean z = this.A02;
        C54662HMt hMt = (C54662HMt) ((GMQ) ghV.A04.getValue()).A01;
        C324356z9 r3 = this.A00;
        AnonymousClass7TG.A1O(hMt, r3);
        String str = iOh2.A04;
        if (str != null) {
            H4H h4h = new H4H(0, r3, iOh2, ghV, z);
            AnonymousClass7TE.A1Z(new OpenCarouselReviewPageRepository$fetchSubmissions$1(h4h, r3, hMt, iOh2, ghV, str, (AnonymousClass4D7) null, z), iOh2.A05);
        }
        return C60340gF.A00;
    }
}
