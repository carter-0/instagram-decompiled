package com.instagram.interactive.translations;

import X.0eS;
import X.0sL;
import X.1Hj;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass4WN;
import X.AnonymousClass5MH;
import X.AnonymousClass5MM;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.BFH;
import X.C18192Vn6;
import X.C18439Vri;
import X.C252063oV;
import X.C255783ui;
import X.C60340gF;
import X.JTO;
import X.UOC;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.interactive.translations.TranslatedCaptionsStickerViewBinder$Holder$bind$5", f = "TranslatedCaptionsStickerViewBinder.kt", i = {}, l = {187}, m = "invokeSuspend", n = {}, s = {})
public final class TranslatedCaptionsStickerViewBinder$Holder$bind$5 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C18439Vri A03;
    public final /* synthetic */ TranslatedCaptionsStickerViewBinder$Holder A04;
    public final /* synthetic */ C255783ui A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TranslatedCaptionsStickerViewBinder$Holder$bind$5(UserSession userSession, C18439Vri vri, TranslatedCaptionsStickerViewBinder$Holder translatedCaptionsStickerViewBinder$Holder, C255783ui r5, String str, String str2, AnonymousClass4D7 r8, float f, boolean z) {
        super(2, r8);
        this.A04 = translatedCaptionsStickerViewBinder$Holder;
        this.A02 = userSession;
        this.A08 = z;
        this.A07 = str;
        this.A06 = str2;
        this.A05 = r5;
        this.A01 = f;
        this.A03 = vri;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.interactive.translations.TranslatedCaptionsStickerViewBinder$Holder$bind$5, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r12) {
        TranslatedCaptionsStickerViewBinder$Holder translatedCaptionsStickerViewBinder$Holder = this.A04;
        UserSession userSession = this.A02;
        boolean z = this.A08;
        String str = this.A07;
        String str2 = this.A06;
        return new TranslatedCaptionsStickerViewBinder$Holder$bind$5(userSession, this.A03, translatedCaptionsStickerViewBinder$Holder, this.A05, str, str2, r12, this.A01, z);
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [com.instagram.interactive.translations.TranslatedCaptionsStickerViewBinder$Holder$bind$5, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        String str;
        Integer num;
        1Hj r5 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            TranslatedCaptionsStickerViewBinder$Holder translatedCaptionsStickerViewBinder$Holder = this.A04;
            UserSession userSession = this.A02;
            if (translatedCaptionsStickerViewBinder$Holder.A04 || !this.A08) {
                str = this.A07;
            } else {
                str = this.A06;
            }
            BFH bfh = this.A05.A0J;
            this.A00 = 1;
            obj = TranslatedCaptionsStickerViewBinder$Holder.A03(bfh, userSession, translatedCaptionsStickerViewBinder$Holder, str, this);
            if (obj == r5) {
                return r5;
            }
        }
        UOC uoc = (UOC) obj;
        if (uoc != null) {
            TranslatedCaptionsStickerViewBinder$Holder translatedCaptionsStickerViewBinder$Holder2 = this.A04;
            AnonymousClass4WN A022 = TranslatedCaptionsStickerViewBinder$Holder.A02(translatedCaptionsStickerViewBinder$Holder2);
            C255783ui r7 = this.A05;
            TranslatedCaptionsStickerViewBinder$Holder.A04(A022, translatedCaptionsStickerViewBinder$Holder2, r7, this.A01);
            if (!this.A08) {
                TranslatedCaptionsStickerViewBinder$Holder.A00(translatedCaptionsStickerViewBinder$Holder2).setBackgroundColor(AnonymousClass7TG.A0A(uoc.A04));
            }
            C252063oV r2 = translatedCaptionsStickerViewBinder$Holder2.A06;
            AnonymousClass5MM A012 = C18192Vn6.A01(AnonymousClass7TE.A0S(r2.getView()), uoc, this.A03);
            Float f = r7.A1K;
            Integer num2 = null;
            if (f != null) {
                num = JTO.A0w((int) f.floatValue());
            } else {
                num = null;
            }
            Float f2 = r7.A1J;
            if (f2 != null) {
                num2 = JTO.A0w((int) f2.floatValue());
            }
            if (num == null || num2 == null) {
                TranslatedCaptionsStickerViewBinder$Holder.A01(translatedCaptionsStickerViewBinder$Holder2).setImageDrawable(A012);
            } else {
                int i = AnonymousClass5MH.A0D;
                AnonymousClass5MH r22 = new AnonymousClass5MH(AnonymousClass7TE.A0S(r2.getView()), (Drawable) A012, AnonymousClass7TG.A0j());
                r22.Eog(num.intValue(), num2.intValue());
                TranslatedCaptionsStickerViewBinder$Holder.A01(translatedCaptionsStickerViewBinder$Holder2).setImageDrawable(r22);
            }
        }
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((TranslatedCaptionsStickerViewBinder$Holder$bind$5) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
