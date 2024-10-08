package X;

import android.os.Bundle;
import com.instagram.reels.prompt.model.PromptStickerModel;

public abstract class A0P {
    public static final Bundle A00(AnonymousClass8ZN r3, PromptStickerModel promptStickerModel, String str) {
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("media_id", str);
        A0a.putParcelable(C273654mx.A00(178), 0B0.A00(promptStickerModel.A02()));
        A0a.putSerializable(AnonymousClass000.A00(1727), r3);
        return A0a;
    }
}
