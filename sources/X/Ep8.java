package X;

import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.editphonenumber.EditPhoneNumberView;

public abstract class Ep8 {
    public static final C49509Ewo A00(UserSession userSession, EditPhoneNumberView editPhoneNumberView) {
        C49509Ewo ewo = null;
        if (editPhoneNumberView.getTag() == null || (editPhoneNumberView.getTag() instanceof C49509Ewo)) {
            Object tag = editPhoneNumberView.getTag();
            if (!(tag instanceof C49509Ewo) || (ewo = (C49509Ewo) tag) == null) {
                C49509Ewo ewo2 = new C49509Ewo();
                editPhoneNumberView.setTag(ewo2);
                return ewo2;
            }
        } else {
            C46436Dey.A00(userSession, AnonymousClass05K.A0j, 002.A0R("EditPhoneNumberView tag used unexpectedly: ", editPhoneNumberView.getTag().getClass().getName()), (Throwable) null);
        }
        return ewo;
    }
}
