package X;

import android.graphics.RectF;
import android.os.Bundle;
import android.view.ViewGroup;
import com.instagram.api.schemas.GenAIToolInfoDict;
import com.instagram.api.schemas.GenAIToolInfoDictIntf;
import com.instagram.api.schemas.StoryPromptType;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.io.File;

/* renamed from: X.9rA  reason: invalid class name and case insensitive filesystem */
public final class C390369rA extends C15291UZw {
    public static final String __redex_internal_original_name = "ReelPromptShareFragment";
    public 28D A00 = 28D.A46;
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A01(new MJ2(this, 4));

    public final AnonymousClass80D A02(ViewGroup viewGroup) {
        PendingRecipient pendingRecipient;
        RectF A0M = AnonymousClass7TG.A0M(this, viewGroup);
        Bundle bundle = this.mArguments;
        GenAIToolInfoDict genAIToolInfoDict = null;
        if (bundle != null) {
            pendingRecipient = (PendingRecipient) bundle.getParcelable(C273654mx.A00(31));
        } else {
            pendingRecipient = null;
        }
        AnonymousClass80D A002 = AnonymousClass80D.A00();
        AnonymousClass80D.A0F(A002, this);
        AnonymousClass80D.A09(AnonymousClass7TE.A0k(this), AnonymousClass80H.A02, A002, this);
        A002.A09 = viewGroup;
        28D r0 = this.A00;
        if (r0 == null) {
            r0 = 28D.A46;
        }
        AnonymousClass80D.A07(r0, this, A002);
        AnonymousClass0eM r6 = this.A01;
        RectF rectF = null;
        if (((PromptStickerModel) r6.getValue()).A03() != StoryPromptType.IMAGINE_ME) {
            rectF = A0M;
        }
        AnonymousClass80D.A01(rectF, (RectF) null, A002);
        AnonymousClass80D.A0A(A002);
        AnonymousClass80D.A0B(A002);
        A002.A3Q = true;
        A002.A1h = (PromptStickerModel) r6.getValue();
        A002.A1S = pendingRecipient;
        GenAIToolInfoDictIntf B91 = ((PromptStickerModel) r6.getValue()).A00.B91();
        if (B91 != null) {
            genAIToolInfoDict = B91.F3O();
        }
        A002.A0I = genAIToolInfoDict;
        String string = requireArguments().getString("prompt_sticker_photo_prefill_file_path");
        if (string != null) {
            File A0t = AnonymousClass7TE.A0t(string);
            0qQ.A0B(A0t, 0);
            A002.A0P = C282665Eg.A03(A0t, 1, 0);
            A002.A0w = null;
            A002.A3y = true;
        }
        return A002;
    }

    public final String getModuleName() {
        return "reel_prompt_share_fragment";
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-2093292096);
        super.onCreate(bundle);
        28D serializable = requireArguments().getSerializable(AnonymousClass000.A00(117));
        if (serializable != null) {
            this.A00 = serializable;
        }
        AnonymousClass0fD.A09(842950680, A02);
    }
}
