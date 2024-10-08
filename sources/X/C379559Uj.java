package X;

import android.view.View;
import com.instagram.api.schemas.StoryTemplateDictIntf;
import com.instagram.api.schemas.StoryThenAndNowStickerDict;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9Uj  reason: invalid class name and case insensitive filesystem */
public final class C379559Uj implements View.OnClickListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C255783ui A01;
    public final /* synthetic */ C249693kD A02;
    public final /* synthetic */ C265964Wz A03;
    public final /* synthetic */ AnonymousClass4X0 A04;
    public final /* synthetic */ boolean A05;

    public C379559Uj(View view, C255783ui r2, C249693kD r3, C265964Wz r4, AnonymousClass4X0 r5, boolean z) {
        this.A04 = r5;
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r2;
        this.A05 = z;
        this.A00 = view;
    }

    /* JADX WARNING: type inference failed for: r0v23, types: [X.Aef, java.lang.Object] */
    public final void onClick(View view) {
        StoryTemplateDictIntf storyTemplateDictIntf;
        int A052 = AnonymousClass0fD.A05(1432166796);
        AnonymousClass4X0 r8 = this.A04;
        PromptStickerModel promptStickerModel = r8.A0B;
        CreativeConfigIntf creativeConfigIntf = null;
        if (promptStickerModel != null) {
            if (promptStickerModel.A0G()) {
                List<C255783ui> Bkd = this.A02.Bkd(AnonymousClass3WT.BEFORE_AND_AFTER);
                if (Bkd != null) {
                    C265964Wz r7 = this.A03;
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    ArrayList A1C2 = AnonymousClass7TE.A1C();
                    for (C255783ui r0 : Bkd) {
                        StoryThenAndNowStickerDict storyThenAndNowStickerDict = r0.A0d;
                        if (storyThenAndNowStickerDict != null) {
                            ? obj = new Object();
                            obj.A00 = storyThenAndNowStickerDict;
                            A1C2.add(obj);
                        }
                    }
                    A1C.addAll(A1C2);
                    PromptStickerModel promptStickerModel2 = r8.A0B;
                    if (promptStickerModel2 != null) {
                        A1C.add(promptStickerModel2);
                        r7.CzJ(A1C);
                    }
                }
            } else {
                PromptStickerModel promptStickerModel3 = r8.A0B;
                if (promptStickerModel3 != null) {
                    if (promptStickerModel3.A0M()) {
                        C249693kD r72 = this.A02;
                        1Xj BPf = r72.BPf();
                        if (BPf != null && 0qQ.A0K(BPf.A0C.CU1(), true)) {
                            PromptStickerModel promptStickerModel4 = r8.A0B;
                            if (promptStickerModel4 != null) {
                                PromptStickerModel A042 = promptStickerModel4.A04();
                                StoryTemplateDictIntf C1M = A042.A00.C1M();
                                if (C1M != null) {
                                    A9D AKS = C1M.AKS();
                                    AKS.A05 = true;
                                    storyTemplateDictIntf = AKS.A00();
                                } else {
                                    storyTemplateDictIntf = null;
                                }
                                A042.A07(storyTemplateDictIntf);
                                r8.A0B = A042;
                            }
                        }
                        C265964Wz r6 = this.A03;
                        PromptStickerModel promptStickerModel5 = r8.A0B;
                        if (promptStickerModel5 != null) {
                            C310416b1 A012 = AEF.A01(this.A01);
                            1Xj BPf2 = r72.BPf();
                            if (BPf2 != null) {
                                creativeConfigIntf = BPf2.A0C.AsO();
                            }
                            r6.Dnh(creativeConfigIntf, promptStickerModel5, A012);
                        }
                    } else {
                        PromptStickerModel promptStickerModel6 = r8.A0B;
                        if (promptStickerModel6 != null) {
                            if (promptStickerModel6.A0B) {
                                this.A03.DKH(promptStickerModel6);
                            } else if (promptStickerModel6.A0A) {
                                this.A03.DKI(promptStickerModel6);
                            } else if (!promptStickerModel6.A0D) {
                                this.A03.Dak(this.A02.BPf(), promptStickerModel6);
                            } else if (!this.A05) {
                                this.A03.Dae(promptStickerModel6);
                            }
                        }
                    }
                }
            }
            View view2 = this.A00;
            if (view2.isHapticFeedbackEnabled()) {
                view2.performHapticFeedback(1);
            }
            AnonymousClass0fD.A0C(-1567953183, A052);
            return;
        }
        0qQ.A0F("model");
        throw AnonymousClass00P.createAndThrow();
    }
}
