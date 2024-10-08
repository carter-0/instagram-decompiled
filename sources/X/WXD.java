package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.hashtag.HashtagImpl;

public final class WXD implements C318716pP {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C17590Vai A02;
    public final /* synthetic */ String A03;

    public WXD(Activity activity, UserSession userSession, C17590Vai vai, String str) {
        this.A01 = userSession;
        this.A03 = str;
        this.A00 = activity;
        this.A02 = vai;
    }

    public final void DCX(C255253tp r11) {
        int intValue = C3253371z.A00(r11).intValue();
        if (intValue == 1) {
            Hashtag BCW = r11.BCW();
            BCW.getClass();
            UserSession userSession = this.A01;
            String str = this.A03;
            Activity activity = this.A00;
            Context context = this.A02.A00;
            context.getClass();
            Bundle bundle = new Bundle();
            HashtagImpl FEY = BCW.FEY();
            bundle.putParcelable(C66579MXk.A00(30), FEY);
            bundle.putString(AnonymousClass000.A00(447), str);
            new AnonymousClass6W8(activity, W0l.A00(FEY, str, "story_donation_sticker_sheet"), userSession, ModalActivity.class, "hashtag_feed").A0C(context);
        } else if (intValue == 0) {
            C255233tn CCb = r11.CCb();
            CCb.getClass();
            String id = CCb.getId();
            Activity activity2 = this.A00;
            UserSession userSession2 = this.A01;
            String str2 = this.A03;
            Context context2 = this.A02.A00;
            context2.getClass();
            C17035VFj.A00(activity2, context2, userSession2, id, str2);
        }
    }
}
