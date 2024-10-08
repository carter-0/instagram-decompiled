package X;

import android.view.View;
import com.instagram.interactive.translations.TranslatedCaptionsStickerViewBinder$Holder;

/* renamed from: X.4We  reason: invalid class name and case insensitive filesystem */
public abstract class C265764We {
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f3, code lost:
        if (r3 != null) goto L_0x009c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(com.instagram.common.session.UserSession r19, com.instagram.interactive.translations.TranslatedCaptionsStickerViewBinder$Holder r20, X.C265754Wd r21, X.C249693kD r22) {
        /*
            r4 = 0
            r3 = 1
            r7 = r20
            X.0qQ.A0B(r7, r3)
            X.3WT r0 = X.AnonymousClass3WT.CLIPS_KARAOKE_CAPTIONS_STICKER
            r2 = r22
            java.util.List r1 = r2.Bkd(r0)
            if (r1 == 0) goto L_0x00fe
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00fe
            java.lang.Object r8 = r1.get(r4)
            X.3ui r8 = (X.C255783ui) r8
            X.0qQ.A0B(r8, r3)
            X.3oV r0 = r7.A06
            r0.setVisibility(r4)
            java.lang.String r1 = r7.A00
            X.1Xj r0 = r2.BPf()
            r10 = 0
            if (r0 == 0) goto L_0x00fb
            java.lang.String r0 = r0.getId()
        L_0x0032:
            boolean r0 = X.0qQ.A0K(r1, r0)
            r5 = r19
            if (r0 != 0) goto L_0x0062
            r7.A03 = r4
            boolean r4 = X.AnonymousClass3WS.A07(r5)
            r7.A04 = r4
            X.0Tu r3 = X.0Tu.A05
            r0 = 36323002279013099(0x810b9400042aeb, double:3.034151130013782E-306)
            boolean r0 = X.182.A06(r3, r5, r0)
            if (r0 != 0) goto L_0x005b
            android.view.ViewGroup r1 = com.instagram.interactive.translations.TranslatedCaptionsStickerViewBinder$Holder.A00(r7)
            r0 = 0
            if (r4 == 0) goto L_0x0058
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x0058:
            r1.setAlpha(r0)
        L_0x005b:
            com.instagram.common.ui.base.IgSimpleImageView r0 = com.instagram.interactive.translations.TranslatedCaptionsStickerViewBinder$Holder.A01(r7)
            r0.setImageDrawable(r10)
        L_0x0062:
            X.1Xj r0 = r2.BPf()
            r11 = 0
            if (r0 == 0) goto L_0x00f8
            java.lang.String r0 = r0.getId()
        L_0x006d:
            r7.A00 = r0
            X.0Tu r3 = X.0Tu.A05
            r0 = 36323002279013099(0x810b9400042aeb, double:3.034151130013782E-306)
            boolean r13 = X.182.A06(r3, r5, r0)
            float r1 = r8.A02
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f6
            X.Vri r6 = X.VK0.A00
        L_0x0084:
            float r12 = r2.AcY(r5)
            X.BFH r3 = r8.A0J
            if (r3 == 0) goto L_0x00f2
            java.util.List r0 = r3.A06
            if (r0 == 0) goto L_0x00f2
            java.lang.Object r0 = X.00k.A0J(r0)
            X.DSf r0 = (X.C46250DSf) r0
            if (r0 == 0) goto L_0x00f2
            java.lang.String r9 = r0.getUri()
        L_0x009c:
            java.lang.String r10 = r3.A03
        L_0x009e:
            r1 = 18
            X.Iw4 r0 = new X.Iw4
            r4 = r21
            r0.<init>((int) r1, (java.lang.Object) r2, (java.lang.Object) r7, (java.lang.Object) r4)
            r7.A01 = r0
            X.J9l r14 = new X.J9l
            r15 = r5
            r16 = r7
            r17 = r4
            r18 = r8
            r19 = r2
            r20 = r9
            r21 = r10
            r22 = r13
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            r7.A02 = r14
            com.instagram.common.ui.base.IgSimpleImageView r1 = com.instagram.interactive.translations.TranslatedCaptionsStickerViewBinder$Holder.A01(r7)
            X.IBP r0 = new X.IBP
            r0.<init>(r7, r4, r2)
            X.AnonymousClass0fU.A00(r0, r1)
            android.view.ViewGroup r0 = com.instagram.interactive.translations.TranslatedCaptionsStickerViewBinder$Holder.A00(r7)
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            X.LYv r0 = new X.LYv
            r0.<init>(r7, r8, r12)
            r1.addOnGlobalLayoutListener(r0)
            if (r3 == 0) goto L_0x00f1
            if (r9 == 0) goto L_0x00f1
            X.12T r0 = X.AnonymousClass12T.A00
            X.4CZ r0 = r0.A04
            X.19S r1 = X.19E.A02(r0)
            com.instagram.interactive.translations.TranslatedCaptionsStickerViewBinder$Holder$bind$5 r4 = new com.instagram.interactive.translations.TranslatedCaptionsStickerViewBinder$Holder$bind$5
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            X.19B r0 = X.19B.A00
            X.1Eo.A05(r0, r4, r1)
        L_0x00f1:
            return
        L_0x00f2:
            r9 = r10
            if (r3 == 0) goto L_0x009e
            goto L_0x009c
        L_0x00f6:
            r6 = r10
            goto L_0x0084
        L_0x00f8:
            r0 = r10
            goto L_0x006d
        L_0x00fb:
            r0 = r10
            goto L_0x0032
        L_0x00fe:
            X.3oV r2 = r7.A06
            boolean r0 = r2.CVM()
            if (r0 == 0) goto L_0x010e
            com.instagram.common.ui.base.IgSimpleImageView r1 = com.instagram.interactive.translations.TranslatedCaptionsStickerViewBinder$Holder.A01(r7)
            r0 = 0
            r1.setOnClickListener(r0)
        L_0x010e:
            r0 = 8
            r2.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C265764We.A00(com.instagram.common.session.UserSession, com.instagram.interactive.translations.TranslatedCaptionsStickerViewBinder$Holder, X.4Wd, X.3kD):void");
    }

    public static final void A01(TranslatedCaptionsStickerViewBinder$Holder translatedCaptionsStickerViewBinder$Holder) {
        0qQ.A0B(translatedCaptionsStickerViewBinder$Holder, 0);
        C252063oV r2 = translatedCaptionsStickerViewBinder$Holder.A06;
        if (r2.CVM()) {
            TranslatedCaptionsStickerViewBinder$Holder.A01(translatedCaptionsStickerViewBinder$Holder).setOnClickListener((View.OnClickListener) null);
        }
        r2.setVisibility(8);
    }
}
