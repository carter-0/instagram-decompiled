package X;

import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ViewGroup;
import com.instagram.api.schemas.StoryPromptTappableData;
import com.instagram.api.schemas.StoryPromptTappableDataIntf;
import com.instagram.api.schemas.StoryThenAndNowStickerDict;
import com.instagram.common.gallery.Medium;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.9rD  reason: invalid class name and case insensitive filesystem */
public final class C390399rD extends C15291UZw {
    public static final String __redex_internal_original_name = "ReelBeforeAndAfterPromptShareFragment";
    public Medium A00;
    public C39869ACq A01;
    public File A02;

    public final String getModuleName() {
        return C273654mx.A00(915);
    }

    public final AnonymousClass80D A02(ViewGroup viewGroup) {
        String str;
        RectF A0M = AnonymousClass7TG.A0M(this, viewGroup);
        AnonymousClass80D A002 = AnonymousClass80D.A00();
        AnonymousClass80D.A0F(A002, this);
        AnonymousClass80D.A09(AnonymousClass7TE.A0k(this), AnonymousClass80H.A02, A002, this);
        A002.A09 = viewGroup;
        AnonymousClass80D.A07(28D.A46, this, A002);
        AnonymousClass80D.A01(A0M, (RectF) null, A002);
        AnonymousClass80D.A0A(A002);
        AnonymousClass80D.A0B(A002);
        A002.A3Q = true;
        A002.A3y = true;
        C39869ACq aCq = this.A01;
        if (aCq == null) {
            str = "beforeAndAfterStickersModel";
        } else {
            A002.A1U = aCq;
            Medium medium = this.A00;
            if (medium == null) {
                str = "medium";
            } else {
                A002.A0P = medium;
                A002.A0w = null;
                return A002;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r0v17, types: [X.Aef, java.lang.Object] */
    public final void onCreate(Bundle bundle) {
        PromptStickerModel promptStickerModel;
        int A022 = AnonymousClass0fD.A02(-1928446198);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        ArrayList A023 = C320236s2.A02(requireArguments(), Parcelable.class, AnonymousClass000.A00(522));
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator A1G = AnonymousClass7TE.A1G(A023);
        while (A1G.hasNext()) {
            Parcelable parcelable = (Parcelable) AnonymousClass7TF.A0a(A1G);
            if (parcelable instanceof StoryThenAndNowStickerDict) {
                StoryThenAndNowStickerDict storyThenAndNowStickerDict = (StoryThenAndNowStickerDict) parcelable;
                0qQ.A0B(storyThenAndNowStickerDict, 1);
                ? obj = new Object();
                obj.A00 = storyThenAndNowStickerDict;
                promptStickerModel = obj;
            } else if (parcelable instanceof StoryPromptTappableData) {
                promptStickerModel = new PromptStickerModel((StoryPromptTappableDataIntf) parcelable);
            }
            A1C.add(promptStickerModel);
        }
        this.A01 = new C39869ACq(A1C);
        0qQ.A0A(requireArguments);
        File A0t = AnonymousClass7TE.A0t(C320236s2.A01(requireArguments, AnonymousClass000.A00(2693)));
        this.A02 = A0t;
        this.A00 = C282665Eg.A03(A0t, 1, 0);
        AnonymousClass0fD.A09(1988958700, A022);
    }
}
