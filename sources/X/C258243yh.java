package X;

import android.view.View;
import android.view.ViewStub;
import com.instagram.interactive.translations.TranslatedCaptionsStickerViewBinder$Holder;

/* renamed from: X.3yh  reason: invalid class name and case insensitive filesystem */
public final class C258243yh implements AnonymousClass2xU {
    public final AnonymousClass0eM A00 = AnonymousClass0eN.A01(new AnonymousClass9L3(this, 21));
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A01(new AnonymousClass9L3(this, 23));
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A01(new AnonymousClass9L3(this, 24));
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A01(new AnonymousClass9L3(this, 25));
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A01(new AnonymousClass9L3(this, 26));
    public final AnonymousClass0eM A05 = AnonymousClass0eN.A01(new AnonymousClass9L3(this, 27));
    public final AnonymousClass0eM A06 = AnonymousClass0eN.A01(new AnonymousClass9L3(this, 28));
    public final AnonymousClass0eM A07 = AnonymousClass0eN.A01(new AnonymousClass9L3(this, 29));
    public final AnonymousClass0eM A08 = AnonymousClass0eN.A01(new AnonymousClass9L3(this, 30));
    public final AnonymousClass0eM A09;

    public C258243yh(ViewStub viewStub) {
        0qQ.A0B(viewStub, 1);
        this.A09 = AnonymousClass0eN.A01(new AnonymousClass9L3(viewStub, 22));
    }

    public final void DQp(AnonymousClass3W1 r6, int i) {
        0qQ.A0B(r6, 0);
        if (i == 48) {
            A00().setAlpha(1.0f);
            ((TranslatedCaptionsStickerViewBinder$Holder) this.A07.getValue()).A05(r6.A05, r6.A0C);
            ((AnonymousClass4WO) this.A08.getValue()).A04(r6.A05);
        } else if (i == 81) {
            Object obj = r6.A3b.A00;
            TranslatedCaptionsStickerViewBinder$Holder translatedCaptionsStickerViewBinder$Holder = (TranslatedCaptionsStickerViewBinder$Holder) this.A07.getValue();
            AnonymousClass3W9 r3 = AnonymousClass3W9.Translated;
            boolean z = true;
            boolean z2 = false;
            if (obj == r3) {
                z2 = true;
            }
            translatedCaptionsStickerViewBinder$Holder.FLi(z2, true);
            AnonymousClass4WO r1 = (AnonymousClass4WO) this.A08.getValue();
            if (obj != r3) {
                z = false;
            }
            r1.FLi(z, true);
        }
    }

    public final View A00() {
        Object value = this.A09.getValue();
        0qQ.A07(value);
        return (View) value;
    }
}
