package com.instagram.feed.opencarousel.reviewpage.viewmodel;

import X.0eS;
import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C324356z9;
import X.C3724090s;
import X.C53039GhV;
import X.C54381HAw;
import X.C54662HMt;
import X.C57093IOh;
import X.C60340gF;
import X.H4H;
import X.I0v;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.feed.opencarousel.reviewpage.viewmodel.OpenCarouselReviewPageRepository$fetchSubmissions$1", f = "OpenCarouselReviewPageRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class OpenCarouselReviewPageRepository$fetchSubmissions$1 extends AnonymousClass1Ek implements 0sL {
    public final /* synthetic */ H4H A00;
    public final /* synthetic */ C324356z9 A01;
    public final /* synthetic */ C54662HMt A02;
    public final /* synthetic */ C57093IOh A03;
    public final /* synthetic */ C53039GhV A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenCarouselReviewPageRepository$fetchSubmissions$1(H4H h4h, C324356z9 r3, C54662HMt hMt, C57093IOh iOh, C53039GhV ghV, String str, AnonymousClass4D7 r8, boolean z) {
        super(2, r8);
        this.A06 = z;
        this.A03 = iOh;
        this.A01 = r3;
        this.A04 = ghV;
        this.A05 = str;
        this.A02 = hMt;
        this.A00 = h4h;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.feed.opencarousel.reviewpage.viewmodel.OpenCarouselReviewPageRepository$fetchSubmissions$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r11) {
        boolean z = this.A06;
        C57093IOh iOh = this.A03;
        C324356z9 r2 = this.A01;
        C53039GhV ghV = this.A04;
        String str = this.A05;
        return new OpenCarouselReviewPageRepository$fetchSubmissions$1(this.A00, r2, this.A02, iOh, ghV, str, r11, z);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((OpenCarouselReviewPageRepository$fetchSubmissions$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0eS.A00(obj);
        if (this.A06) {
            C57093IOh iOh = this.A03;
            if (AnonymousClass7TE.A1b(iOh.A01)) {
                List list = iOh.A01;
                this.A01.A03(C3724090s.A01(iOh.A02, list, false, false), new C54381HAw(1, this.A04, true));
                return C60340gF.A00;
            }
        }
        C57093IOh iOh2 = this.A03;
        I0v i0v = iOh2.A03;
        String str = this.A05;
        i0v.A02(this.A00, this.A02, str, iOh2.A00);
        return C60340gF.A00;
    }
}
