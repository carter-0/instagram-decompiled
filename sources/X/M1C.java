package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.reels.prompt.model.PromptStickerModel;

public final class M1C implements C59583JPd {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C62498Kgo A02;
    public final /* synthetic */ PromptStickerModel A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ C62320sa A05;
    public final /* synthetic */ C62320sa A06;
    public final /* synthetic */ C262224Cq A07;

    public final void onFailure(Throwable th) {
    }

    public M1C(FragmentActivity fragmentActivity, UserSession userSession, C62498Kgo kgo, PromptStickerModel promptStickerModel, Integer num, C62320sa r6, C62320sa r7, C262224Cq r8) {
        this.A06 = r6;
        this.A01 = userSession;
        this.A07 = r8;
        this.A02 = kgo;
        this.A04 = num;
        this.A03 = promptStickerModel;
        this.A00 = fragmentActivity;
        this.A05 = r7;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C56064HsD hsD = (C56064HsD) obj;
        0qQ.A0B(hsD, 0);
        C356888Vp r9 = (C356888Vp) 00k.A0J(hsD.A00);
        if (r9 != null) {
            C62320sa r0 = this.A06;
            UserSession userSession = this.A01;
            C262224Cq r6 = this.A07;
            C62498Kgo kgo = this.A02;
            Integer num = this.A04;
            PromptStickerModel promptStickerModel = this.A03;
            FragmentActivity fragmentActivity = this.A00;
            C62320sa r7 = this.A05;
            r0.invoke();
            C349227zn.A00(userSession).A00 = r9.A07;
            AnonymousClass7TE.A1Z(new C59700JUh(promptStickerModel, kgo, userSession, fragmentActivity, r6, r7, num, r9, (AnonymousClass4D7) null, 6), r6);
        }
    }
}
