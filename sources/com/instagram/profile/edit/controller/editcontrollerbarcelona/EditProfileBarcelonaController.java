package com.instagram.profile.edit.controller.editcontrollerbarcelona;

import X.0qQ;
import X.0sP;
import X.AnonymousClass00P;
import X.AnonymousClass0iw;
import X.AnonymousClass7TG;
import X.C252063oV;
import X.C262184Cl;
import X.C62320sa;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.user.model.User;

public final class EditProfileBarcelonaController {
    public boolean A00;
    public final Context A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final User A04;
    public final C62320sa A05;
    public final 0sP A06;
    public final boolean A07;
    public IgdsListCell toggleBarcelonaSwitchCell;
    public C252063oV toggleBarcelonaViewStubber;

    public static final void A00(EditProfileBarcelonaController editProfileBarcelonaController) {
        User user = editProfileBarcelonaController.A04;
        boolean z = editProfileBarcelonaController.A00;
        C262184Cl r0 = user.A03;
        Boolean valueOf = Boolean.valueOf(z);
        r0.ElC(valueOf);
        user.A03.El0(valueOf);
        IgdsListCell igdsListCell = editProfileBarcelonaController.toggleBarcelonaSwitchCell;
        if (igdsListCell != null) {
            igdsListCell.setChecked(editProfileBarcelonaController.A00);
        } else {
            0qQ.A0F("toggleBarcelonaSwitchCell");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public EditProfileBarcelonaController(Context context, AnonymousClass0iw r3, UserSession userSession, User user, C62320sa r6, 0sP r7, boolean z) {
        AnonymousClass7TG.A1P(userSession, r3);
        this.A03 = userSession;
        this.A04 = user;
        this.A02 = r3;
        this.A05 = r6;
        this.A01 = context;
        this.A06 = r7;
        this.A07 = z;
        this.A00 = user.A1i();
    }
}
