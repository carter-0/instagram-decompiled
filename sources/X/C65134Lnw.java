package X;

import com.instagram.reels.prompt.model.PromptStickerModel;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.Lnw  reason: case insensitive filesystem */
public final class C65134Lnw implements C66509MUn {
    public final /* synthetic */ C310016aI A00;
    public final /* synthetic */ C273384mU A01;
    public final /* synthetic */ PromptStickerModel A02;

    public C65134Lnw(C310016aI r1, C273384mU r2, PromptStickerModel promptStickerModel) {
        this.A01 = r2;
        this.A02 = promptStickerModel;
        this.A00 = r1;
    }

    public final void Ckx() {
        C250973mM r2;
        C273384mU r0 = this.A01;
        if (r0 != null && (r2 = ((ReelViewerFragment) r0).A0a) != null) {
            PromptStickerModel promptStickerModel = this.A02;
            C310016aI r1 = this.A00;
            if (promptStickerModel.A0A && r1 != null) {
                r1.A0O(r2, AnonymousClass000.A00(1591));
                r1.A0O(r2, AnonymousClass000.A00(1590));
            }
        }
    }

    public final void Cky(boolean z) {
        C250973mM r2;
        int i;
        C273384mU r0 = this.A01;
        if (r0 != null && (r2 = ((ReelViewerFragment) r0).A0a) != null) {
            PromptStickerModel promptStickerModel = this.A02;
            C310016aI r1 = this.A00;
            if (promptStickerModel.A0B) {
                if (z) {
                    i = 1591;
                } else {
                    i = 1590;
                }
                String A002 = AnonymousClass000.A00(i);
                if (r1 != null) {
                    r1.A0Q(r2, (String) null, A002, 0.0f, 0.0f);
                }
            }
        }
    }

    public final void Cl1() {
        C250973mM r2;
        C310016aI r1;
        C273384mU r0 = this.A01;
        if (r0 != null && (r2 = ((ReelViewerFragment) r0).A0a) != null && (r1 = this.A00) != null) {
            r1.A0O(r2, AnonymousClass000.A00(307));
        }
    }
}
