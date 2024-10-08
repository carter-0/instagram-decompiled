package com.instagram.debug.devoptions.intf;

import X.AnonymousClass07i;
import X.AnonymousClass4DH;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

public interface DeveloperOptionsSection {
    List getItems(UserSession userSession, FragmentActivity fragmentActivity, AnonymousClass4DH r3, AnonymousClass07i r4);

    int getTitleRes();
}
