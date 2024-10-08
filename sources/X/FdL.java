package X;

import android.content.Context;
import com.instagram.api.schemas.AppSwitcherBadgeStatus;
import com.instagram.api.schemas.TextPostAppBadgeStatus;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.profile.edit.controller.editcontrollerbarcelona.EditProfileBarcelonaController;
import com.instagram.user.model.User;

public final class FdL implements C358618bC {
    public final /* synthetic */ EditProfileBarcelonaController A00;
    public final /* synthetic */ boolean A01;

    public FdL(EditProfileBarcelonaController editProfileBarcelonaController, boolean z) {
        this.A01 = z;
        this.A00 = editProfileBarcelonaController;
    }

    public final boolean onToggle(boolean z) {
        String str;
        String str2;
        TextPostAppBadgeStatus textPostAppBadgeStatus;
        AppSwitcherBadgeStatus appSwitcherBadgeStatus;
        if (this.A01) {
            EditProfileBarcelonaController editProfileBarcelonaController = this.A00;
            FFO.A02(editProfileBarcelonaController.A01, editProfileBarcelonaController.A03, "threads_toggle");
            return false;
        }
        EditProfileBarcelonaController editProfileBarcelonaController2 = this.A00;
        editProfileBarcelonaController2.A00 = z;
        editProfileBarcelonaController2.A05.invoke();
        boolean z2 = editProfileBarcelonaController2.A00;
        User user = editProfileBarcelonaController2.A04;
        if (z2 == user.A1i()) {
            return true;
        }
        if (editProfileBarcelonaController2.A00) {
            str = "show_profile_badge";
        } else {
            str = "hide_profile_badge";
        }
        String id = user.getId();
        UserSession userSession = editProfileBarcelonaController2.A03;
        AnonymousClass0iw r10 = editProfileBarcelonaController2.A02;
        Context context = editProfileBarcelonaController2.A01;
        C321406u6.A03(r10, userSession, (Integer) null, (Integer) null, (Integer) null, str, id, (String) null, (String) null, (String) null, 0oI.A0A(context));
        if (editProfileBarcelonaController2.A00) {
            str2 = "show_profile_switcher";
        } else {
            str2 = "hide_profile_switcher";
        }
        C321406u6.A03(r10, userSession, (Integer) null, (Integer) null, (Integer) null, str2, user.getId(), (String) null, (String) null, (String) null, 0oI.A0A(context));
        IgdsListCell igdsListCell = editProfileBarcelonaController2.toggleBarcelonaSwitchCell;
        if (igdsListCell != null) {
            igdsListCell.setEnabled(false);
            if (editProfileBarcelonaController2.A00) {
                textPostAppBadgeStatus = TextPostAppBadgeStatus.SHOW_TEXT_POST_APP_BADGE;
            } else {
                textPostAppBadgeStatus = TextPostAppBadgeStatus.HIDE_TEXT_POST_APP_BADGE;
            }
            1NY r4 = new 1NY(userSession, -2);
            r4.A04();
            r4.A02();
            r4.A0A("api/v1/text_feed/toggle_text_post_app_badge/");
            Class<C43775CCt> cls = C43775CCt.class;
            Class<C45542CyG> cls2 = C45542CyG.class;
            r4.A0Q(cls, cls2);
            1OC A0T = DbT.A0T(r4, "text_post_app_badge_status", textPostAppBadgeStatus.A00);
            String A002 = AnonymousClass000.A00(8);
            0qQ.A0C(A0T, A002);
            A0T.A00 = new C47691EDa(editProfileBarcelonaController2, 18);
            if (editProfileBarcelonaController2.A00) {
                appSwitcherBadgeStatus = AppSwitcherBadgeStatus.SHOW_IG_APP_SWITCHER_BADGE;
            } else {
                appSwitcherBadgeStatus = AppSwitcherBadgeStatus.HIDE_IG_APP_SWITCHER_BADGE;
            }
            1NY r5 = new 1NY(userSession, -2);
            r5.A04();
            r5.A02();
            String A0u = 002.A0u("api/", "v1/", "text_feed/", "toggle_app_switcher_badge/");
            0qQ.A07(A0u);
            r5.A0E = A0u;
            r5.A0Q(cls, cls2);
            1OC A0T2 = DbT.A0T(r5, "app_switcher_badge_status", appSwitcherBadgeStatus.A00);
            0qQ.A0C(A0T2, A002);
            A0T2.A00 = new C47691EDa(editProfileBarcelonaController2, 19);
            0sP r0 = editProfileBarcelonaController2.A06;
            r0.invoke(A0T);
            r0.invoke(A0T2);
            return true;
        }
        0qQ.A0F("toggleBarcelonaSwitchCell");
        throw AnonymousClass00P.createAndThrow();
    }
}
