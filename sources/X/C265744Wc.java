package X;

import android.view.View;
import com.instagram.interactive.translations.TranslatedCaptionsStickerViewBinder$Holder;

/* renamed from: X.4Wc  reason: invalid class name and case insensitive filesystem */
public final class C265744Wc implements C265754Wd {
    public boolean A00;
    public final /* synthetic */ C243043Xe A01;
    public final /* synthetic */ C258243yh A02;

    public final void DL5(AnonymousClass4WK r3, C249693kD r4) {
        0qQ.A0B(r4, 0);
        0qQ.A0B(r3, 1);
        if (!this.A00) {
            this.A00 = true;
            this.A01.DF6(new C54396HBn(r3, r4));
        }
    }

    public final void Dtu(View view, AnonymousClass4WK r4, C249693kD r5) {
        0qQ.A0B(view, 0);
        this.A01.DF6(new C54402HBt(view, r4, r5));
    }

    public final void Dtv(AnonymousClass4WK r5, C249693kD r6) {
        0qQ.A0B(r6, 0);
        0qQ.A0B(r5, 1);
        C258243yh r2 = this.A02;
        ((AnonymousClass4WO) r2.A08.getValue()).FLi(r5.CcZ(), false);
        ((TranslatedCaptionsStickerViewBinder$Holder) r2.A07.getValue()).FLi(r5.CcZ(), false);
        this.A01.DF6(new C54400HBr(r5, r6));
    }

    public C265744Wc(C243043Xe r1, C258243yh r2) {
        this.A01 = r1;
        this.A02 = r2;
    }
}
