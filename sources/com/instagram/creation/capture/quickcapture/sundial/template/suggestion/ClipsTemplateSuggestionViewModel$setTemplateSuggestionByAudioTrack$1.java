package com.instagram.creation.capture.quickcapture.sundial.template.suggestion;

import X.05G;
import X.0Tu;
import X.0eS;
import X.0sL;
import X.182;
import X.1Hj;
import X.1Xj;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass8I6;
import X.AnonymousClass8IE;
import X.AnonymousClass8JL;
import X.C382019cx;
import X.C60340gF;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.capture.quickcapture.sundial.template.suggestion.repository.ClipsTemplateSuggestionRepository;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.quickcapture.sundial.template.suggestion.ClipsTemplateSuggestionViewModel$setTemplateSuggestionByAudioTrack$1", f = "ClipsTemplateSuggestionViewModel.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
public final class ClipsTemplateSuggestionViewModel$setTemplateSuggestionByAudioTrack$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final /* synthetic */ ImageUrl A01;
    public final /* synthetic */ AnonymousClass8I6 A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClipsTemplateSuggestionViewModel$setTemplateSuggestionByAudioTrack$1(ImageUrl imageUrl, AnonymousClass8I6 r3, String str, AnonymousClass4D7 r5, boolean z) {
        super(2, r5);
        this.A01 = imageUrl;
        this.A02 = r3;
        this.A03 = str;
        this.A04 = z;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.creation.capture.quickcapture.sundial.template.suggestion.ClipsTemplateSuggestionViewModel$setTemplateSuggestionByAudioTrack$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r8) {
        return new ClipsTemplateSuggestionViewModel$setTemplateSuggestionByAudioTrack$1(this.A01, this.A02, this.A03, r8, this.A04);
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [com.instagram.creation.capture.quickcapture.sundial.template.suggestion.ClipsTemplateSuggestionViewModel$setTemplateSuggestionByAudioTrack$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        05G r0;
        Object obj2;
        Object obj3 = obj;
        1Hj r5 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            ImageUrl imageUrl = this.A01;
            if (imageUrl != null) {
                AnonymousClass8I6 r6 = this.A02;
                UserSession userSession = r6.A00;
                0Tu r2 = 0Tu.A05;
                if (182.A06(r2, userSession, 36316654317146671L)) {
                    r6.A02.Epw(new C382019cx(AnonymousClass8JL.TEMPLATE_BROWSER, imageUrl, (1Xj) null, this.A03, this.A04));
                    return C60340gF.A00;
                } else if (182.A06(r2, userSession, 36316654317081134L)) {
                    String str = this.A03;
                    this.A00 = 1;
                    obj3 = ((ClipsTemplateSuggestionRepository) r6.A01.getValue()).A00(str, this);
                    if (obj3 == r5) {
                        return r5;
                    }
                }
            }
            r0 = this.A02.A02;
            obj2 = AnonymousClass8IE.A00;
            r0.Epw(obj2);
            return C60340gF.A00;
        }
        1Xj r62 = (1Xj) obj3;
        if (r62 != null && r62.A6B()) {
            r0 = this.A02.A02;
            obj2 = new C382019cx(AnonymousClass8JL.TEMPLATE, this.A01, r62, this.A03, this.A04);
            r0.Epw(obj2);
            return C60340gF.A00;
        }
        r0 = this.A02.A02;
        obj2 = AnonymousClass8IE.A00;
        r0.Epw(obj2);
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ClipsTemplateSuggestionViewModel$setTemplateSuggestionByAudioTrack$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
