package X;

import android.view.View;
import com.instagram.api.schemas.StoryThenAndNowStickerDict;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9Ui  reason: invalid class name and case insensitive filesystem */
public final class C379549Ui implements View.OnClickListener {
    public final /* synthetic */ C255783ui A00;
    public final /* synthetic */ C249693kD A01;
    public final /* synthetic */ C265964Wz A02;
    public final /* synthetic */ AnonymousClass4X0 A03;
    public final /* synthetic */ boolean A04;

    public C379549Ui(C255783ui r1, C249693kD r2, C265964Wz r3, AnonymousClass4X0 r4, boolean z) {
        this.A03 = r4;
        this.A04 = z;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    /* JADX WARNING: type inference failed for: r0v14, types: [X.Aef, java.lang.Object] */
    public final void onClick(View view) {
        int i;
        C310416b1 r10;
        AnonymousClass8ZN r7;
        int A05 = AnonymousClass0fD.A05(-1411262875);
        AnonymousClass4X0 r4 = this.A03;
        PromptStickerModel promptStickerModel = r4.A0B;
        ArrayList arrayList = null;
        if (promptStickerModel != null) {
            boolean z = this.A04;
            if (promptStickerModel.A08 || z) {
                i = 1722847169;
            } else {
                C249693kD r2 = this.A01;
                List<C255783ui> Bkd = r2.Bkd(AnonymousClass3WT.BEFORE_AND_AFTER);
                C265964Wz r6 = this.A02;
                PromptStickerModel promptStickerModel2 = r4.A0B;
                if (promptStickerModel2 != null) {
                    if (promptStickerModel2.A0M()) {
                        r10 = AEF.A01(this.A00);
                    } else {
                        r10 = null;
                    }
                    1Xj BPf = r2.BPf();
                    if (Bkd != null) {
                        arrayList = AnonymousClass7TE.A1C();
                        for (C255783ui r0 : Bkd) {
                            StoryThenAndNowStickerDict storyThenAndNowStickerDict = r0.A0d;
                            if (storyThenAndNowStickerDict != null) {
                                ? obj = new Object();
                                obj.A00 = storyThenAndNowStickerDict;
                                arrayList.add(obj);
                            }
                        }
                    }
                    PromptStickerModel promptStickerModel3 = r4.A0B;
                    if (promptStickerModel3 != null) {
                        if (promptStickerModel3.A07) {
                            r7 = AnonymousClass8ZN.CLIPS_VIEWER_CREATOR_INVITE_STICKER;
                        } else {
                            r7 = AnonymousClass8ZN.CLIPS_VIEWER_ADD_YOURS_STICKER;
                        }
                        r6.Dal(r7, BPf, promptStickerModel2, r10, arrayList);
                        i = 105320284;
                    }
                }
            }
            AnonymousClass0fD.A0C(i, A05);
            return;
        }
        0qQ.A0F("model");
        throw AnonymousClass00P.createAndThrow();
    }
}
