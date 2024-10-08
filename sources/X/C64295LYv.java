package X;

import android.view.ViewTreeObserver;
import com.instagram.interactive.translations.TranslatedCaptionsStickerViewBinder$Holder;

/* renamed from: X.LYv  reason: case insensitive filesystem */
public final class C64295LYv implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ TranslatedCaptionsStickerViewBinder$Holder A01;
    public final /* synthetic */ C255783ui A02;

    public C64295LYv(TranslatedCaptionsStickerViewBinder$Holder translatedCaptionsStickerViewBinder$Holder, C255783ui r2, float f) {
        this.A01 = translatedCaptionsStickerViewBinder$Holder;
        this.A02 = r2;
        this.A00 = f;
    }

    public final void onGlobalLayout() {
        TranslatedCaptionsStickerViewBinder$Holder translatedCaptionsStickerViewBinder$Holder = this.A01;
        AnonymousClass4WN A022 = TranslatedCaptionsStickerViewBinder$Holder.A02(translatedCaptionsStickerViewBinder$Holder);
        if (A022.A00()) {
            C51967G9n.A0y(TranslatedCaptionsStickerViewBinder$Holder.A00(translatedCaptionsStickerViewBinder$Holder), this);
            TranslatedCaptionsStickerViewBinder$Holder.A04(A022, translatedCaptionsStickerViewBinder$Holder, this.A02, this.A00);
        }
    }
}
