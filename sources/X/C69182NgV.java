package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.NgV  reason: case insensitive filesystem */
public final class C69182NgV extends C47518E6c implements AnonymousClass4DS {
    public static final List A02 = 0sr.A1P(new C327857Cl[]{C327857Cl.ADMIN_ONLY, C327857Cl.ALL_MEMBERS});
    public static final String __redex_internal_original_name = "DirectMemberAddModeFragment";
    public O7K A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);

    public final void afterOnCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, View view) {
        int i;
        0qQ.A0B(layoutInflater, 0);
        super.afterOnCreateView(layoutInflater, viewGroup, bundle, view);
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (C327857Cl r1 : A02) {
            String valueOf = String.valueOf(r1.A00);
            int ordinal = r1.ordinal();
            if (ordinal == 2 || ordinal == 0) {
                i = 2131958567;
            } else if (ordinal == 1) {
                i = 2131958568;
            } else {
                throw AnonymousClass7TE.A1K();
            }
            DbV.A1V(valueOf, getString(i), A1C);
        }
        int i2 = requireArguments().getInt("DIRECT_MEMBER_ADD_MODE_SELECTED");
        if (C327847Ck.A00(Integer.valueOf(i2)) == C327857Cl.UNKNOWN) {
            i2 = 0;
        }
        setItems(AnonymousClass7TE.A1I(new C70962OTj(new C71472OlG(this, 2), String.valueOf(i2), A1C, false)));
    }

    public final String getModuleName() {
        return "direct_member_add_mode";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final void configureActionBar(2da r2) {
        Dbb.A1I(r2);
        r2.Eom(2131958569);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1638349875);
        super.onCreate(bundle);
        AnonymousClass0fD.A09(-414088699, A022);
    }
}
