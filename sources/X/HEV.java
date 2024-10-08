package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.showreel.IgShowreelComposition;
import com.instagram.showreel.composition.ui.IgShowreelCompositionView;

public final class HEV extends IgShowreelCompositionView implements C3028265o {
    public final C59668JSn A00;

    public void setShowreelAnimation(UserSession userSession, IgShowreelComposition igShowreelComposition, AnonymousClass6LO r11, C229392nJ r12, AnonymousClass6NN r13, C54705HPk hPk, C307786Rm r15) {
        C51974G9v.A1O(userSession, igShowreelComposition, r11, r12);
        this.A00.ElG(userSession, igShowreelComposition, r11, r12, new C56989IKh(r13, this), hPk, r15);
    }

    public C59668JSn getCompositionController() {
        return this.A00;
    }

    public HEV(Context context) {
        super(context);
        Context context2 = getContext();
        0qQ.A0B(context2, 0);
        this.A00 = new C57328IXl(context2, this, this);
    }
}
