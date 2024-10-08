package X;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.CameraTool;
import com.instagram.api.schemas.StoryPromptType;
import com.instagram.common.session.UserSession;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.LXg  reason: case insensitive filesystem */
public final class C64254LXg implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    public C64254LXg(Object obj, Object obj2, Object obj3, Object obj4, String str, int i) {
        this.A00 = i;
        this.A04 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
        this.A05 = str;
        this.A03 = obj4;
    }

    public final void onClick(View view) {
        int i;
        int i2;
        Integer num;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A05(-1842911824);
                LRN lrn = (LRN) this.A02;
                User user = (User) this.A03;
                boolean CPV = user.CPV();
                String id = user.getId();
                String str = this.A05;
                0qQ.A0B(str, 2);
                Integer num2 = AnonymousClass05K.A0N;
                if (CPV) {
                    num = AnonymousClass05K.A02;
                } else {
                    num = AnonymousClass05K.A1I;
                }
                LRO.A01(LRN.A00(lrn, (Boolean) null, (Boolean) null, num2, num, (Long) null, str, id, (List) null), lrn);
                FragmentActivity fragmentActivity = (FragmentActivity) this.A01;
                1Z4.A00.A00(fragmentActivity, fragmentActivity, AnonymousClass7TE.A0l(((K8G) this.A04).A08), user, (G8B) null, "appreciation_gift_feed", (String) null, user.getUsername());
                i2 = -1657677780;
                break;
            case 1:
                i = AnonymousClass0fD.A05(-1951649182);
                LNN lnn = LNN.A00;
                UserSession userSession = (UserSession) this.A04;
                Activity activity = (Activity) this.A01;
                28D r5 = 28D.A4k;
                CameraTool cameraTool = (CameraTool) this.A02;
                String str2 = this.A05;
                PromptStickerModel promptStickerModel = (PromptStickerModel) this.A03;
                String text = promptStickerModel.A00.getText();
                if (promptStickerModel.A03() != StoryPromptType.MAGIC_MOD_RESTYLE) {
                    promptStickerModel = null;
                }
                lnn.A00(activity, r5, cameraTool, userSession, promptStickerModel, str2, text);
                i2 = 678878276;
                break;
            case 2:
                i = AnonymousClass0fD.A05(2081848096);
                LNN lnn2 = LNN.A00;
                UserSession userSession2 = (UserSession) this.A04;
                Activity activity2 = (Activity) this.A01;
                28D r52 = 28D.A4k;
                CameraTool cameraTool2 = (CameraTool) this.A02;
                String str3 = this.A05;
                PromptStickerModel promptStickerModel2 = (PromptStickerModel) this.A03;
                String text2 = promptStickerModel2.A00.getText();
                if (promptStickerModel2.A03() != StoryPromptType.MAGIC_MOD_BACKDROP) {
                    promptStickerModel2 = null;
                }
                lnn2.A00(activity2, r52, cameraTool2, userSession2, promptStickerModel2, str3, text2);
                i2 = -174524039;
                break;
            case 3:
                i = AnonymousClass0fD.A05(-2102146218);
                LNN lnn3 = LNN.A00;
                UserSession userSession3 = (UserSession) this.A04;
                Activity activity3 = (Activity) this.A01;
                28D r53 = 28D.A0I;
                CameraTool cameraTool3 = (CameraTool) this.A02;
                String str4 = this.A05;
                PromptStickerModel promptStickerModel3 = (PromptStickerModel) this.A03;
                String text3 = promptStickerModel3.A00.getText();
                if (promptStickerModel3.A03() != StoryPromptType.MAGIC_MOD_ADD_YOURS_WITH_BACKDROP) {
                    promptStickerModel3 = null;
                }
                lnn3.A00(activity3, r53, cameraTool3, userSession3, promptStickerModel3, str4, text3);
                i2 = 1595468637;
                break;
            default:
                return;
        }
        AnonymousClass0fD.A0C(i2, i);
    }
}
