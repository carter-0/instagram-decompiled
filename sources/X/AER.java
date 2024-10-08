package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Spannable;
import com.instagram.android.R;
import com.instagram.api.schemas.GenAIToolInfoDict;
import com.instagram.api.schemas.StoryPromptType;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.user.model.User;
import java.util.List;

public abstract class AER {
    public static final C339177jB A01(Context context, String str, List list, int i) {
        List list2 = list;
        0qQ.A0B(list2, 2);
        int i2 = i;
        PromptStickerModel promptStickerModel = new PromptStickerModel((GenAIToolInfoDict) null, StoryPromptType.DEFAULT, (User) null, AnonymousClass05K.A00, "", "", (String) null, (String) null, (String) null, list2, i2, 0, false, false, false);
        Integer num = AnonymousClass05K.A01;
        int i3 = 3;
        if (i2 > 100) {
            i3 = 2;
        }
        Context context2 = context;
        String str2 = str;
        PromptStickerModel promptStickerModel2 = promptStickerModel;
        C339177jB r2 = new C339177jB(context2, promptStickerModel2, num, str2, (float) AnonymousClass7TG.A05(context2), -1, i3, AnonymousClass7TG.A07(context2));
        r2.A09(0.4f);
        return r2;
    }

    public static final C306386Ly A02(Context context, String str, int i, int i2, int i3) {
        Spannable spannable = C306386Ly.A0d;
        C306386Ly A0s = AnonymousClass7TE.A0s(context, AnonymousClass7TF.A02(context, i));
        Typeface A0N = AnonymousClass7TG.A0N(context);
        if (A0N != null) {
            A0s.A0I(A0N);
            AJB.A0B(A0s, (float) AnonymousClass7TF.A02(context, i3), 0.0f, 0.0f);
            AnonymousClass7TE.A1O(context, A0s, i2);
            A0s.A0G(2, "...");
            A0s.A0M(str);
            return A0s;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final AnonymousClass6KL A00(Context context) {
        AnonymousClass6KL A00 = AnonymousClass6KK.A00(1.0f, context.getResources().getDimensionPixelSize(R.dimen.ai_agent_share_profile_sticker_padding), false);
        A00.A0A.setColor(context.getColor(R.color.igds_icon_on_color));
        return A00;
    }
}
