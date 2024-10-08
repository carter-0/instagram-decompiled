package X;

import com.instagram.common.session.UserSession;
import com.instagram.reels.prompt.model.PromptStickerModel;

/* renamed from: X.Tta  reason: case insensitive filesystem */
public final class C14300Tta implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C255783ui A01;
    public final /* synthetic */ C249693kD A02;
    public final /* synthetic */ AnonymousClass4X0 A03;
    public final /* synthetic */ boolean A04;

    public C14300Tta(UserSession userSession, C255783ui r2, C249693kD r3, AnonymousClass4X0 r4, boolean z) {
        this.A03 = r4;
        this.A00 = userSession;
        this.A02 = r3;
        this.A01 = r2;
        this.A04 = z;
    }

    public final void run() {
        String str;
        AnonymousClass4X0 r3 = this.A03;
        UserSession userSession = this.A00;
        C249693kD r2 = this.A02;
        C255783ui r1 = this.A01;
        boolean z = this.A04;
        PromptStickerModel promptStickerModel = r3.A0B;
        if (promptStickerModel == null) {
            str = "model";
        } else {
            C354808Nl r4 = r3.A0A;
            if (r4 == null) {
                str = "sticker";
            } else {
                AnonymousClass4X0.A00(userSession, r1, r2, r3, r4, promptStickerModel, z);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
