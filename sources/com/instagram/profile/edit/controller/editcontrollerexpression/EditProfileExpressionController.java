package com.instagram.profile.edit.controller.editcontrollerexpression;

import X.0qQ;
import X.0sP;
import X.C62320sa;
import X.X4E;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.form.IgFormField;

public final class EditProfileExpressionController {
    public final Context A00;
    public final UserSession A01;
    public final 0sP A02;
    public final boolean A03;
    public final boolean A04;
    public final X4E A05;
    public final C62320sa A06;
    public IgFormField nameField;
    public IgFormField usernameField;

    public EditProfileExpressionController(Context context, UserSession userSession, X4E x4e, C62320sa r5, 0sP r6, boolean z, boolean z2) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A06 = r5;
        this.A00 = context;
        this.A02 = r6;
        this.A03 = z;
        this.A05 = x4e;
        this.A04 = z2;
    }
}
