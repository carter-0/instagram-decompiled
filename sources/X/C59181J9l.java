package X;

import com.instagram.common.session.UserSession;
import com.instagram.interactive.translations.TranslatedCaptionsStickerViewBinder$Holder;

/* renamed from: X.J9l  reason: case insensitive filesystem */
public final class C59181J9l extends 0Yg implements 0sL {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ TranslatedCaptionsStickerViewBinder$Holder A01;
    public final /* synthetic */ C265754Wd A02;
    public final /* synthetic */ C255783ui A03;
    public final /* synthetic */ C249693kD A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59181J9l(UserSession userSession, TranslatedCaptionsStickerViewBinder$Holder translatedCaptionsStickerViewBinder$Holder, C265754Wd r4, C255783ui r5, C249693kD r6, String str, String str2, boolean z) {
        super(2);
        this.A07 = z;
        this.A01 = translatedCaptionsStickerViewBinder$Holder;
        this.A02 = r4;
        this.A04 = r6;
        this.A00 = userSession;
        this.A06 = str;
        this.A05 = str2;
        this.A03 = r5;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        TranslatedCaptionsStickerViewBinder$Holder translatedCaptionsStickerViewBinder$Holder;
        boolean A1a = AnonymousClass7TE.A1a(obj);
        boolean A1a2 = AnonymousClass7TE.A1a(obj2);
        if (this.A07) {
            AnonymousClass19S A022 = 19E.A02(AnonymousClass12T.A00.A04);
            translatedCaptionsStickerViewBinder$Holder = this.A01;
            UserSession userSession = this.A00;
            String str = this.A06;
            AnonymousClass7TE.A1Z(new C66153MEv(this.A03, userSession, translatedCaptionsStickerViewBinder$Holder, this.A05, str, (AnonymousClass4D7) null, 1, A1a), A022);
        } else {
            translatedCaptionsStickerViewBinder$Holder = this.A01;
            TranslatedCaptionsStickerViewBinder$Holder.A00(translatedCaptionsStickerViewBinder$Holder).setAlpha(C51971G9r.A00(A1a ? 1 : 0));
        }
        if (A1a2) {
            this.A02.Dtv(translatedCaptionsStickerViewBinder$Holder, this.A04);
        }
        return C60340gF.A00;
    }
}
