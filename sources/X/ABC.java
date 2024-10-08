package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.Iterator;

public abstract class ABC {
    public static final void A00(Bundle bundle, FragmentActivity fragmentActivity, UserSession userSession, 1Xj r7) {
        Object obj;
        PromptStickerModel A0F;
        0qQ.A0B(r7, 0);
        FragmentActivity fragmentActivity2 = fragmentActivity;
        UserSession userSession2 = userSession;
        AnonymousClass7TG.A1Q(userSession, fragmentActivity2);
        Iterator it = r7.A3F().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C255783ui) obj).A0F() != null) {
                break;
            }
        }
        C255783ui r1 = (C255783ui) obj;
        if (r1 != null && (A0F = r1.A0F()) != null) {
            bundle.putString(AnonymousClass000.A00(3815), A0F.A03);
            bundle.putParcelable(C273654mx.A00(178), 0B0.A00(A0F.A02()));
            bundle.putSerializable(AnonymousClass000.A00(1727), AnonymousClass8ZN.PROMPT_STICKER_PIN_NOTIF);
            new AnonymousClass6W8(fragmentActivity2, bundle, userSession2, ModalActivity.class, C273654mx.A00(127)).A0C(fragmentActivity2);
        }
    }

    public static final void A01(C39890ADo aDo, Float f) {
        C390069qg r0;
        aDo.A0F = true;
        aDo.A0H = true;
        aDo.A01 = 1.0f;
        aDo.A00 = 2.0f;
        if (f != null) {
            r0 = new C390069qg(f.floatValue());
        } else {
            r0 = new C390069qg();
        }
        aDo.A06 = r0;
        aDo.A05 = 7;
        aDo.A0P = true;
    }
}
