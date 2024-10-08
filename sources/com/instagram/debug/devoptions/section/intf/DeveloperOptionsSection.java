package com.instagram.debug.devoptions.section.intf;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

public interface DeveloperOptionsSection {
    List getItems(UserSession userSession, FragmentActivity fragmentActivity);

    Integer getTitleRes();

    /* renamed from: com.instagram.debug.devoptions.section.intf.DeveloperOptionsSection$-CC  reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static Integer $default$getTitleRes(DeveloperOptionsSection developerOptionsSection) {
            return null;
        }
    }
}
