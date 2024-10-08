package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.K3z  reason: case insensitive filesystem */
public final class C61357K3z extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "IgLiveCopyrightWarningFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);
    public final AnonymousClass0eM A01;

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            str = bundle2.getString("live_visibility_mode");
        } else {
            str = null;
        }
        boolean A0K = 0qQ.A0K(str, "fan_club");
        TextView A0d = AnonymousClass7TE.A0d(view, R.id.text_title);
        Context context = view.getContext();
        int i = 2131963921;
        if (A0K) {
            i = 2131963922;
        }
        DbT.A18(context, A0d, i);
        TextView A0d2 = AnonymousClass7TE.A0d(view, R.id.text_body);
        int i2 = 2131963919;
        if (A0K) {
            i2 = 2131963920;
        }
        DbT.A18(context, A0d2, i2);
        C3021461u r2 = (C3021461u) view.findViewById(R.id.bottom_buttons);
        r2.setPrimaryAction(context.getString(2131963945), LY5.A00(this, 42));
        r2.setSecondaryAction(context.getString(2131963942), LY5.A00(this, 43));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public C61357K3z() {
        MM8 mm8 = new MM8(this, 46);
        AnonymousClass0eM A002 = MM8.A00(new MM8(this, 43), 0eO.A02, 44);
        this.A01 = DbS.A0I(new MM8(A002, 45), mm8, C66304MMn.A01(A002, (Object) null, 19), DbS.A0z(C60160Jgf.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-212819159);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.iglive_capture_rights_manager_warning_bottom_sheet, viewGroup, false);
        AnonymousClass0fD.A09(1305804238, A02);
        return inflate;
    }
}
