package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.creation.fragment.AlbumEditFragment;
import com.instagram.creation.fragment.EditMediaInfoFragment;
import com.instagram.creation.fragment.ManageDraftsFragment;

public final class LGR {
    public final AnonymousClass4DH A00(UserSession userSession) {
        Fragment manageDraftsFragment;
        if (182.A06(DbS.A0J(userSession, 0), userSession, 36328237844937842L)) {
            manageDraftsFragment = new K4A();
        } else {
            manageDraftsFragment = new ManageDraftsFragment();
        }
        Bundle A09 = DbY.A09(userSession);
        A09.putBoolean("is_navigating_from_content_management", false);
        manageDraftsFragment.setArguments(A09);
        return manageDraftsFragment;
    }

    public final AlbumEditFragment A01(UserSession userSession, boolean z, boolean z2) {
        0qQ.A0B(userSession, 0);
        AlbumEditFragment albumEditFragment = new AlbumEditFragment();
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putBoolean("standalone_mode", z);
        if (!182.A06(0Tu.A05, userSession, 2342166123162250093L)) {
            A0a.putBoolean("is_legacy_feed_creation", z2);
        }
        albumEditFragment.setArguments(A0a);
        return albumEditFragment;
    }

    public final C59962JcV A03(UserSession userSession, int i, boolean z, boolean z2) {
        0qQ.A0B(userSession, 0);
        C59962JcV jcV = new C59962JcV();
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putBoolean("standalone_mode", z);
        if (!182.A06(0Tu.A05, userSession, 2342166123162250093L)) {
            A0a.putBoolean("is_legacy_feed_creation", z2);
        }
        A0a.putSerializable("default_open_tool", C62499Kgp.values()[i]);
        jcV.setArguments(A0a);
        return jcV;
    }

    public final EditMediaInfoFragment A02(String str, int i, int i2, int i3, boolean z) {
        EditMediaInfoFragment editMediaInfoFragment = new EditMediaInfoFragment();
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString(C66579MXk.A00(96), str);
        A0a.putInt(C66579MXk.A00(235), i);
        A0a.putInt(C66579MXk.A00(95), i2);
        A0a.putInt(C66579MXk.A00(234), i3);
        A0a.putBoolean(C66579MXk.A00(233), z);
        editMediaInfoFragment.setArguments(A0a);
        return editMediaInfoFragment;
    }

    public final C390579rV A04(Bundle bundle, C279284yO r6) {
        String str = r6.A02;
        C390579rV r3 = new C390579rV();
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putStringArrayList(AnonymousClass000.A00(1048), 0sr.A1L(new String[]{str}));
        A0a.putAll(bundle);
        r3.setArguments(A0a);
        return r3;
    }
}
