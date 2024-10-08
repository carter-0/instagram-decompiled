package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.P3c  reason: case insensitive filesystem */
public final class C72363P3c implements C74399PuF {
    public final FragmentActivity A00;
    public final UserSession A01;

    public C72363P3c(UserSession userSession, FragmentActivity fragmentActivity) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }

    public final void DUW(OIR oir) {
    }

    public final void DUZ(OIR oir) {
        C69506Nmo nmo;
        Integer num;
        View view;
        0qQ.A0B(oir, 0);
        boolean z = oir.A0H;
        0eP A1L = AnonymousClass7TE.A1L("replace_note", Boolean.valueOf(z));
        0eP A1L2 = AnonymousClass7TE.A1L("arg_prompt_note_id", oir.A09);
        0eP A1L3 = AnonymousClass7TE.A1L("arg_prompt_note_text", oir.A0A);
        0eP A1L4 = AnonymousClass7TE.A1L("arg_friend_map_note_latitude", oir.A07);
        0eP A1L5 = AnonymousClass7TE.A1L("arg_friend_map_note_longitude", oir.A08);
        boolean z2 = oir.A0F;
        0eP A1L6 = AnonymousClass7TE.A1L("profile_creation_point", Boolean.valueOf(z2));
        boolean z3 = oir.A0B;
        Bundle A002 = Q21.A00(A1L, A1L2, A1L3, A1L4, A1L5, A1L6, AnonymousClass7TE.A1L("arg_feed_creation_point", Boolean.valueOf(z3)));
        View view2 = oir.A00;
        if (view2 == null || (view = oir.A01) == null) {
            Dbb.A0i(this.A00, A002, this.A01, ModalActivity.class, "notes_creation");
        } else {
            FragmentActivity fragmentActivity = this.A00;
            AnonymousClass34S[] r2 = {new AnonymousClass34S(view2, C273654mx.A00(122)), new AnonymousClass34S(view, "bubbleTransition")};
            Intent putExtra = C66580MXl.A0A(fragmentActivity, ModalActivity.class).putExtra("fragment_name", "notes_creation").putExtra(AnonymousClass000.A00(610), A002);
            putExtra.setFlags(268435456);
            0kR.A00.A07().A09(fragmentActivity, fragmentActivity, putExtra, r2);
        }
        UserSession userSession = this.A01;
        C3018760k A012 = C3018660j.A01(userSession);
        if (z) {
            nmo = C69506Nmo.A0Q;
        } else {
            nmo = C69506Nmo.A0J;
        }
        A012.A0B(nmo);
        if (z2) {
            num = AnonymousClass05K.A0Y;
        } else if (oir.A0D) {
            num = AnonymousClass05K.A0C;
        } else if (z3) {
            num = AnonymousClass05K.A0j;
        } else {
            num = AnonymousClass05K.A00;
        }
        new AnonymousClass43E(userSession).A00(num);
    }
}
