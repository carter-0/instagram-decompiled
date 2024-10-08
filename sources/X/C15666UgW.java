package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.UgW  reason: case insensitive filesystem */
public abstract class C15666UgW extends C14097Tpp {
    public View A00;
    public 1Xj A01;
    public W1W A02;
    public C18065Vkr A03;
    public UAW A04;
    public XCC A05;
    public X9L A06;
    public C18588Vuf A07;
    public C17661Vbr A08;
    public C18044VkS A09;
    public AnonymousClass4DU A0A;
    public C18001Vjd A0B;
    public final VZO A0C;
    public final C307786Rm A0D;
    public final C276544tV A0E;
    public final UserSession A0F;

    public final /* bridge */ /* synthetic */ Object ALg(Context context) {
        0qQ.A0B(context, 0);
        return A0O(context);
    }

    public final FrameLayout A0O(Context context) {
        View A0A2;
        Object vyw;
        if ((this instanceof C15445Ucv) || (this instanceof C15444Ucu)) {
            A0A2 = DbU.A0A(LayoutInflater.from(context), (ViewGroup) null, R.layout.hero_carousel_media_video, false);
            vyw = new VYW(A0A2);
        } else {
            boolean z = this instanceof C15443Uct;
            LayoutInflater from = LayoutInflater.from(context);
            if (z) {
                A0A2 = DbU.A0A(from, (ViewGroup) null, R.layout.hero_carousel_media_photo, false);
                vyw = new VWR(A0A2);
            } else {
                A0A2 = DbU.A0A(from, (ViewGroup) null, R.layout.hero_carousel_product_video, false);
                vyw = new VYV(A0A2);
            }
        }
        A0A2.setTag(vyw);
        FrameLayout A002 = C18680Vwd.A00(A0A2);
        this.A00 = A002;
        return A002;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007f, code lost:
        if (r1.A01.A0F != null) goto L_0x0081;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0P(android.view.View r33, X.C307786Rm r34, boolean r35) {
        /*
            r32 = this;
            r5 = r32
            boolean r4 = r5 instanceof X.C15445Ucv
            r6 = r34
            if (r4 == 0) goto L_0x0234
            r10 = 1
            X.0qQ.A0B(r6, r10)
            r0 = 18
        L_0x000e:
            X.Wvs r7 = new X.Wvs
            r7.<init>(r5, r0)
            r14 = 0
            r0 = r33
            r5.A00 = r0
            r3 = r5
            if (r4 == 0) goto L_0x0217
            r0 = r3
            X.Ucv r0 = (X.C15445Ucv) r0
            X.VZO r2 = r0.A02
        L_0x0020:
            com.instagram.shopping.intf.ProductDetailsPageArguments r9 = r2.A00
            com.instagram.user.model.Product r1 = r9.A06
            if (r1 == 0) goto L_0x0186
            if (r4 == 0) goto L_0x01e9
            r0 = r3
            X.Ucv r0 = (X.C15445Ucv) r0
            X.Vjd r8 = r0.A01
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.shopping.model.pdp.herocarousel.HeroCarouselFeedMediaModel"
            X.0qQ.A0C(r8, r0)
            X.UrZ r8 = (X.C16272UrZ) r8
            X.1Xj r0 = r8.A01
        L_0x0036:
            r5.A01 = r0
            android.content.Context r8 = r6.A00
            if (r4 == 0) goto L_0x01cc
            r0 = r3
            X.Ucv r0 = (X.C15445Ucv) r0
            com.instagram.common.session.UserSession r0 = r0.A03
        L_0x0041:
            X.0qQ.A0B(r0, r10)
            X.UAW r11 = new X.UAW
            r11.<init>(r8, r0)
            r5.A04 = r11
            if (r4 != 0) goto L_0x01c8
            boolean r11 = r5 instanceof X.C15444Ucu
            if (r11 == 0) goto L_0x01c0
            java.lang.String r19 = "CPDPHeroCarouselReelsVideoRenderUnit"
        L_0x0053:
            r20 = 0
            X.Uxz r17 = X.C16605Uxz.LOADED
            X.Vbr r11 = new X.Vbr
            r18 = r1
            r21 = r10
            r22 = r14
            r23 = r14
            r16 = r11
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            X.Uw7 r10 = X.Uw7.PLAYING
            X.0qQ.A0B(r10, r14)
            r11.A00 = r10
            r5.A08 = r11
            com.instagram.model.shopping.productfeed.ProductTileMedia r12 = r9.A03
            boolean r11 = r2.A03
            boolean r10 = r1.A04()
            if (r10 == 0) goto L_0x0081
            com.instagram.user.model.ProductDetailsProductItemDict r10 = r1.A01
            com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformation r10 = r10.A0F
            r23 = 1
            if (r10 == 0) goto L_0x0083
        L_0x0081:
            r23 = 0
        L_0x0083:
            com.instagram.user.model.ProductDetailsProductItemDict r10 = r1.A01
            com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformation r10 = r10.A0F
            boolean r24 = X.DbW.A1a(r10)
            boolean r10 = r9.A0a
            java.lang.String r9 = r9.A0N
            X.WdB r15 = new X.WdB
            r21 = r9
            r22 = r11
            r25 = r10
            r18 = r12
            r19 = r1
            r17 = r0
            r16 = r8
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r5.A06 = r15
            if (r4 == 0) goto L_0x01a3
            r9 = r3
            X.Ucv r9 = (X.C15445Ucv) r9
            X.4DU r9 = r9.A00
        L_0x00ab:
            X.Wcf r11 = X.C19616Wcf.A00
            X.AnonymousClass7TG.A1Q(r9, r11)
            X.Vkr r10 = new X.Vkr
            r10.<init>(r8, r0, r9, r11)
            r5.A03 = r10
            X.1wY r30 = X.1wY.A00(r0)
            X.0qQ.A07(r30)
            X.VYb r26 = new X.VYb
            r31 = r35
            r27 = r8
            r28 = r0
            r29 = r9
            r26.<init>(r27, r28, r29, r30, r31)
            X.W2j r8 = new X.W2j
            r8.<init>()
            r8.A09 = r1
            r8.A08 = r1
            X.VuM r10 = new X.VuM
            r10.<init>()
            if (r4 == 0) goto L_0x0189
            X.Ucv r3 = (X.C15445Ucv) r3
            X.Vjd r3 = r3.A01
        L_0x00df:
            java.util.List r3 = X.AnonymousClass7TE.A1I(r3)
            r10.A00(r0, r1, r3)
            X.W1L r3 = new X.W1L
            r3.<init>(r10)
            r8.A04 = r3
            X.Vuf r13 = new X.Vuf
            r13.<init>(r8)
            r5.A07 = r13
            r3 = 12
            X.Wvs r12 = new X.Wvs
            r12.<init>(r5, r3)
            X.X9L r15 = r5.A06
            r3 = 13
            X.Wvs r11 = new X.Wvs
            r11.<init>(r5, r3)
            r3 = 23
            X.J6I r10 = new X.J6I
            r10.<init>(r5, r3)
            r3 = 47
            X.J6j r8 = new X.J6j
            r8.<init>((int) r3, (java.lang.Object) r5, (java.lang.Object) r7)
            r3 = 48
            X.J6j r4 = new X.J6j
            r4.<init>((int) r3, (java.lang.Object) r5, (java.lang.Object) r7)
            X.Wd9 r3 = new X.Wd9
            r26 = r8
            r27 = r4
            r21 = r3
            r22 = r15
            r23 = r12
            r24 = r11
            r25 = r10
            r21.<init>(r22, r23, r24, r25, r26, r27)
            X.Vkr r8 = r5.A03
            if (r8 == 0) goto L_0x025b
            X.Wcn r4 = new X.Wcn
            r22 = r2
            r23 = r9
            r24 = r6
            r25 = r0
            r26 = r8
            r27 = r20
            r28 = r3
            r29 = r13
            r30 = r1
            r21 = r4
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r5.A05 = r4
            X.2el r6 = X.2el.A00()
            android.view.View r4 = r5.A00
            if (r4 == 0) goto L_0x0187
            X.2eX r8 = new X.2eX
            r8.<init>(r4)
        L_0x0158:
            android.view.View r4 = r5.A00
            r6.A06(r4, r8)
            java.lang.String r1 = r1.A0H
            X.W1W r2 = X.C18182Vmw.A01(r2, r0, r9, r3, r1)
            r5.A02 = r2
            X.XCC r1 = r5.A05
            if (r1 == 0) goto L_0x0258
            X.VkS r8 = new X.VkS
            r9 = r0
            r10 = r6
            r11 = r20
            r12 = r2
            r13 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r5.A09 = r8
            if (r35 == 0) goto L_0x0183
            X.Vkr r1 = r5.A03
            if (r1 == 0) goto L_0x025b
            X.1Xj r0 = r5.A01
            if (r0 == 0) goto L_0x0253
            r1.A00(r0)
        L_0x0183:
            r7.invoke()
        L_0x0186:
            return
        L_0x0187:
            r8 = 0
            goto L_0x0158
        L_0x0189:
            boolean r4 = r5 instanceof X.C15444Ucu
            if (r4 == 0) goto L_0x0193
            X.Ucu r3 = (X.C15444Ucu) r3
            X.Vjd r3 = r3.A01
            goto L_0x00df
        L_0x0193:
            boolean r4 = r5 instanceof X.C15443Uct
            if (r4 == 0) goto L_0x019d
            X.Uct r3 = (X.C15443Uct) r3
            X.Vjd r3 = r3.A01
            goto L_0x00df
        L_0x019d:
            X.Ucs r3 = (X.C15442Ucs) r3
            X.Vjd r3 = r3.A01
            goto L_0x00df
        L_0x01a3:
            boolean r9 = r5 instanceof X.C15444Ucu
            if (r9 == 0) goto L_0x01ae
            r9 = r3
            X.Ucu r9 = (X.C15444Ucu) r9
            X.4DU r9 = r9.A00
            goto L_0x00ab
        L_0x01ae:
            boolean r9 = r5 instanceof X.C15443Uct
            if (r9 == 0) goto L_0x01b9
            r9 = r3
            X.Uct r9 = (X.C15443Uct) r9
            X.4DU r9 = r9.A00
            goto L_0x00ab
        L_0x01b9:
            r9 = r3
            X.Ucs r9 = (X.C15442Ucs) r9
            X.4DU r9 = r9.A00
            goto L_0x00ab
        L_0x01c0:
            boolean r11 = r5 instanceof X.C15443Uct
            if (r11 == 0) goto L_0x01c8
            java.lang.String r19 = "CPDPHeroCarouselReelsPhotoRenderUnit"
            goto L_0x0053
        L_0x01c8:
            java.lang.String r19 = "CPDPHeroCarouselVideoRenderUnit"
            goto L_0x0053
        L_0x01cc:
            boolean r0 = r5 instanceof X.C15444Ucu
            if (r0 == 0) goto L_0x01d7
            r0 = r3
            X.Ucu r0 = (X.C15444Ucu) r0
            com.instagram.common.session.UserSession r0 = r0.A03
            goto L_0x0041
        L_0x01d7:
            boolean r0 = r5 instanceof X.C15443Uct
            if (r0 == 0) goto L_0x01e2
            r0 = r3
            X.Uct r0 = (X.C15443Uct) r0
            com.instagram.common.session.UserSession r0 = r0.A03
            goto L_0x0041
        L_0x01e2:
            r0 = r3
            X.Ucs r0 = (X.C15442Ucs) r0
            com.instagram.common.session.UserSession r0 = r0.A03
            goto L_0x0041
        L_0x01e9:
            boolean r0 = r5 instanceof X.C15444Ucu
            if (r0 == 0) goto L_0x01fd
            r0 = r3
            X.Ucu r0 = (X.C15444Ucu) r0
            X.Vjd r8 = r0.A01
        L_0x01f2:
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.shopping.model.pdp.herocarousel.HeroCarouselReelModel"
            X.0qQ.A0C(r8, r0)
            X.Urb r8 = (X.C16274Urb) r8
            X.1Xj r0 = r8.A00
            goto L_0x0036
        L_0x01fd:
            boolean r0 = r5 instanceof X.C15443Uct
            if (r0 == 0) goto L_0x0207
            r0 = r3
            X.Uct r0 = (X.C15443Uct) r0
            X.Vjd r8 = r0.A01
            goto L_0x01f2
        L_0x0207:
            r0 = r3
            X.Ucs r0 = (X.C15442Ucs) r0
            X.Vjd r8 = r0.A01
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.shopping.model.pdp.herocarousel.HeroCarouselProductVideoModel"
            X.0qQ.A0C(r8, r0)
            X.UrY r8 = (X.C16271UrY) r8
            X.1Xj r0 = r8.A00
            goto L_0x0036
        L_0x0217:
            boolean r0 = r5 instanceof X.C15444Ucu
            if (r0 == 0) goto L_0x0222
            r0 = r3
            X.Ucu r0 = (X.C15444Ucu) r0
            X.VZO r2 = r0.A02
            goto L_0x0020
        L_0x0222:
            boolean r0 = r5 instanceof X.C15443Uct
            if (r0 == 0) goto L_0x022d
            r0 = r3
            X.Uct r0 = (X.C15443Uct) r0
            X.VZO r2 = r0.A02
            goto L_0x0020
        L_0x022d:
            r0 = r3
            X.Ucs r0 = (X.C15442Ucs) r0
            X.VZO r2 = r0.A02
            goto L_0x0020
        L_0x0234:
            boolean r0 = r5 instanceof X.C15444Ucu
            if (r0 == 0) goto L_0x0240
            r10 = 1
            X.0qQ.A0B(r6, r10)
            r0 = 16
            goto L_0x000e
        L_0x0240:
            boolean r0 = r5 instanceof X.C15443Uct
            r10 = 1
            if (r0 == 0) goto L_0x024c
            X.0qQ.A0B(r6, r10)
            r0 = 15
            goto L_0x000e
        L_0x024c:
            X.0qQ.A0B(r6, r10)
            r0 = 14
            goto L_0x000e
        L_0x0253:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0258:
            java.lang.String r0 = "delegate"
            goto L_0x025d
        L_0x025b:
            java.lang.String r0 = "videoController"
        L_0x025d:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15666UgW.A0P(android.view.View, X.6Rm, boolean):void");
    }

    public C15666UgW(VZO vzo, C307786Rm r2, C276544tV r3, UserSession userSession, AnonymousClass4DU r5, C18001Vjd vjd) {
        super(r2, r3);
        this.A0E = r3;
        this.A0D = r2;
        this.A0F = userSession;
        this.A0A = r5;
        this.A0B = vjd;
        this.A0C = vzo;
    }
}
