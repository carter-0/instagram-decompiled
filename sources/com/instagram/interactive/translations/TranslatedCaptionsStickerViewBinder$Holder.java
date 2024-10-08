package com.instagram.interactive.translations;

import X.0eP;
import X.0qQ;
import X.0sL;
import X.AnonymousClass05K;
import X.AnonymousClass4WK;
import X.AnonymousClass4WL;
import X.AnonymousClass4WM;
import X.AnonymousClass4WN;
import X.AnonymousClass5MH;
import X.AnonymousClass5MJ;
import X.AnonymousClass5MM;
import X.C252063oV;
import X.C255783ui;
import X.C306406Ma;
import X.C62320sa;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;

public final class TranslatedCaptionsStickerViewBinder$Holder implements AnonymousClass4WK {
    public String A00;
    public C62320sa A01 = AnonymousClass4WL.A00;
    public 0sL A02 = AnonymousClass4WM.A00;
    public boolean A03;
    public boolean A04 = true;
    public AnonymousClass4WN A05 = new AnonymousClass4WN((Integer) null, (Integer) null, (Integer) null);
    public final C252063oV A06;

    public TranslatedCaptionsStickerViewBinder$Holder(C252063oV r4) {
        this.A06 = r4;
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.MDx, X.4D7] */
    /* JADX WARNING: type inference failed for: r0v46, types: [X.UOk, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: type inference failed for: r7v8 */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x011f, code lost:
        if (r15.isEmpty() != false) goto L_0x0121;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A03(X.C46297DUa r14, com.instagram.common.session.UserSession r15, com.instagram.interactive.translations.TranslatedCaptionsStickerViewBinder$Holder r16, java.lang.String r17, X.AnonymousClass4D7 r18) {
        /*
            r6 = r15
            r5 = r14
            r3 = 47
            r4 = r18
            boolean r0 = X.C66145MDx.A02(r3, r4)
            if (r0 == 0) goto L_0x0107
            r7 = r4
            X.MDx r7 = (X.C66145MDx) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0107
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x001a:
            java.lang.Object r1 = r7.A03
            X.1Hj r8 = X.1Hj.A02
            int r0 = r7.A00
            r15 = 0
            r4 = 1
            if (r0 == 0) goto L_0x00d5
            if (r0 != r4) goto L_0x01c9
            java.lang.Object r5 = r7.A02
            X.DUa r5 = (X.C46297DUa) r5
            java.lang.Object r6 = r7.A01
            X.0lg r6 = (X.0lg) r6
            X.0eS.A00(r1)
        L_0x0031:
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0110
            r11 = 0
            java.lang.CharSequence r0 = X.00l.A0B(r1)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "\n"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r10 = 0
            java.util.List r9 = X.00l.A0R(r1, r0, r11)
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
        L_0x004e:
            int r0 = r9.size()
            if (r10 >= r0) goto L_0x0110
            int r2 = r10 + 2
            int r0 = r9.size()
            if (r2 >= r0) goto L_0x0110
            int r7 = r10 + 1
            java.lang.Object r0 = r9.get(r7)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r3 = " --> "
            boolean r0 = X.00l.A0d(r0, r3, r11)
            if (r0 == 0) goto L_0x00d1
            java.lang.Object r1 = r9.get(r7)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String[] r0 = new java.lang.String[]{r3}
            java.util.List r0 = X.00l.A0R(r1, r0, r11)
            java.lang.Object r0 = r0.get(r11)
            java.lang.String r0 = (java.lang.String) r0
            int r8 = X.A18.A00(r0)
            java.lang.Object r1 = r9.get(r7)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String[] r0 = new java.lang.String[]{r3}
            java.util.List r0 = X.00l.A0R(r1, r0, r11)
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            int r7 = X.A18.A00(r0)
            java.lang.Object r3 = r9.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            r0 = -1
            if (r8 == r0) goto L_0x00d1
            if (r7 == r0) goto L_0x00d1
            r2 = 1065353216(0x3f800000, float:1.0)
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r1 = r0.toString()
            X.0qQ.A0B(r3, r4)
            r0 = 8
            X.0qQ.A0B(r1, r0)
            X.UOk r0 = new X.UOk
            r0.<init>()
            r0.A06 = r3
            r0.A00 = r2
            r0.A04 = r8
            r0.A02 = r7
            r0.A07 = r11
            r0.A03 = r11
            r0.A01 = r2
            r0.A05 = r1
            r15.add(r0)
        L_0x00d1:
            int r10 = r10 + 4
            goto L_0x004e
        L_0x00d5:
            X.0eS.A00(r1)
            if (r14 == 0) goto L_0x01d1
            if (r17 == 0) goto L_0x01d1
            int r0 = r17.length()
            if (r0 == 0) goto L_0x01d1
            android.net.Uri r3 = X.0cp.A03(r17)
            X.0qQ.A07(r3)
            r7.A01 = r6
            r7.A02 = r14
            r7.A00 = r4
            X.12T r2 = X.AnonymousClass12T.A00
            r1 = 480314591(0x1ca104df, float:1.0655345E-21)
            r0 = 3
            X.0nV r2 = r2.CO6(r1, r0)
            r1 = 29
            X.MG3 r0 = new X.MG3
            r0.<init>((java.lang.Object) r3, (X.AnonymousClass4D7) r15, (int) r1)
            java.lang.Object r1 = X.1Eo.A00(r7, r2, r0)
            if (r1 != r8) goto L_0x0031
            return r8
        L_0x0107:
            X.MDx r7 = new X.MDx
            r0 = r16
            r7.<init>(r0, r4, r3)
            goto L_0x001a
        L_0x0110:
            r0 = 0
            X.0qQ.A0B(r6, r0)
            r0 = 2
            X.0qQ.A0B(r5, r0)
            if (r15 == 0) goto L_0x0121
            boolean r1 = r15.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x0122
        L_0x0121:
            r0 = 1
        L_0x0122:
            r8 = 0
            if (r0 != 0) goto L_0x0151
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323002279013099(0x810b9400042aeb, double:3.034151130013782E-306)
            boolean r7 = X.182.A06(r2, r6, r0)
            java.lang.String r2 = r5.Bzi()
            if (r2 != 0) goto L_0x0138
            java.lang.String r2 = ""
        L_0x0138:
            java.util.Map r1 = X.C16609Uy5.A03
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L_0x0152
            java.lang.Object r9 = r1.get(r2)
            X.0qQ.A0A(r9)
            X.Uy5 r9 = (X.C16609Uy5) r9
        L_0x0149:
            boolean r0 = X.VBE.A00(r9)
            if (r0 == 0) goto L_0x0155
            if (r7 != 0) goto L_0x0155
        L_0x0151:
            return r8
        L_0x0152:
            X.Uy5 r9 = X.C16609Uy5.DYNAMIC_REVEAL
            goto L_0x0149
        L_0x0155:
            java.lang.String r0 = r5.B0s()
            X.6Mr r6 = X.A1S.A00(r0)
            java.lang.String r2 = r5.getTextColor()
            java.lang.String r0 = r5.getBackgroundColor()
            X.6Mr r1 = X.C306576Mr.DEFAULT
            if (r6 != r1) goto L_0x016a
            r2 = r0
        L_0x016a:
            java.lang.Integer r0 = X.0nH.A0D(r2)
            if (r0 == 0) goto L_0x01c6
            int r17 = r0.intValue()
        L_0x0174:
            java.lang.String r0 = r5.getTextColor()
            java.lang.Integer r3 = X.0nH.A0D(r0)
            java.lang.String r0 = r5.getBackgroundColor()
            java.lang.Integer r13 = X.0nH.A0D(r0)
            java.lang.Object r0 = X.00k.A0K(r15)
            X.UOk r0 = (X.C15092UOk) r0
            int r2 = r0.A02
            r10 = r6
            if (r7 == 0) goto L_0x01a2
            r12 = r3
        L_0x0190:
            java.lang.String r14 = r5.getId()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)
            X.UOC r8 = new X.UOC
            r18 = r4
            r16 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r8
        L_0x01a2:
            boolean r0 = X.VBE.A00(r9)
            if (r0 != 0) goto L_0x01c3
            X.6Mr r0 = X.C306576Mr.INVERTED
        L_0x01aa:
            if (r6 != r0) goto L_0x01ad
            r10 = r1
        L_0x01ad:
            r12 = r3
            X.6Mr r1 = X.C306576Mr.INVERTED
            if (r6 != r1) goto L_0x01b9
            boolean r0 = X.VBE.A00(r9)
            if (r0 != 0) goto L_0x01b9
            r12 = r13
        L_0x01b9:
            if (r6 != r1) goto L_0x0190
            boolean r0 = X.VBE.A00(r9)
            if (r0 != 0) goto L_0x0190
            r13 = r3
            goto L_0x0190
        L_0x01c3:
            X.6Mr r0 = X.C306576Mr.DISABLED
            goto L_0x01aa
        L_0x01c6:
            int r17 = X.C17153VKf.A00
            goto L_0x0174
        L_0x01c9:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x01d1:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.interactive.translations.TranslatedCaptionsStickerViewBinder$Holder.A03(X.DUa, com.instagram.common.session.UserSession, com.instagram.interactive.translations.TranslatedCaptionsStickerViewBinder$Holder, java.lang.String, X.4D7):java.lang.Object");
    }

    public static final ViewGroup A00(TranslatedCaptionsStickerViewBinder$Holder translatedCaptionsStickerViewBinder$Holder) {
        View requireViewById = translatedCaptionsStickerViewBinder$Holder.A06.getView().requireViewById(R.id.translated_captions_sticker_container);
        0qQ.A07(requireViewById);
        return (ViewGroup) requireViewById;
    }

    public static final IgSimpleImageView A01(TranslatedCaptionsStickerViewBinder$Holder translatedCaptionsStickerViewBinder$Holder) {
        View requireViewById = translatedCaptionsStickerViewBinder$Holder.A06.getView().requireViewById(R.id.translated_captions_sticker);
        0qQ.A07(requireViewById);
        return (IgSimpleImageView) requireViewById;
    }

    public static final AnonymousClass4WN A02(TranslatedCaptionsStickerViewBinder$Holder translatedCaptionsStickerViewBinder$Holder) {
        Integer num;
        AnonymousClass4WN r1 = translatedCaptionsStickerViewBinder$Holder.A05;
        if (r1.A00()) {
            return r1;
        }
        View view = (View) translatedCaptionsStickerViewBinder$Holder.A06.getView().getParent();
        Integer num2 = null;
        if (view != null) {
            num = Integer.valueOf(view.getWidth());
            num2 = Integer.valueOf(view.getHeight());
        } else {
            num = null;
        }
        AnonymousClass4WN r0 = new AnonymousClass4WN(num, num2, 0);
        translatedCaptionsStickerViewBinder$Holder.A05 = r0;
        return r0;
    }

    public final void A05(int i, int i2) {
        AnonymousClass5MJ r1;
        if (!this.A03 && this.A06.CFV() == 0) {
            this.A03 = true;
            this.A01.invoke();
        }
        Drawable drawable = A01(this).getDrawable();
        if (!(drawable instanceof AnonymousClass5MH) || (r1 = (AnonymousClass5MH) drawable) == null) {
            Drawable drawable2 = A01(this).getDrawable();
            if (!(drawable2 instanceof AnonymousClass5MM) || (r1 = (AnonymousClass5MM) drawable2) == null) {
                return;
            }
        }
        r1.EXC(i, i2);
    }

    public final boolean CcZ() {
        return this.A04;
    }

    public final boolean FLi(boolean z, boolean z2) {
        if (z == this.A04) {
            return false;
        }
        this.A04 = z;
        this.A02.invoke(Boolean.valueOf(z), Boolean.valueOf(z2));
        return true;
    }

    public static final void A04(AnonymousClass4WN r8, TranslatedCaptionsStickerViewBinder$Holder translatedCaptionsStickerViewBinder$Holder, C255783ui r10, float f) {
        int i;
        int i2;
        ViewGroup A002 = A00(translatedCaptionsStickerViewBinder$Holder);
        Integer num = r8.A01;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        Integer num2 = r8.A00;
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = 0;
        }
        Integer num3 = AnonymousClass05K.A0C;
        C306406Ma r0 = C306406Ma.A00;
        ViewGroup viewGroup = A002;
        C306406Ma.A03(A002, viewGroup, r10, num3, new 0eP(0, 0), f, i, i2);
    }
}
