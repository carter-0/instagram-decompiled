package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.Gzx  reason: case insensitive filesystem */
public final class C54128Gzx extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "WhatsAppBackedProfileBottomSheetFragment";
    public String A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);

    public final String getModuleName() {
        return "instagram_profile_visit";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View A0G = AnonymousClass7TF.A0G(view, R.id.whatsapp_backed_profile_bottom_sheet);
        DbX.A1F(AnonymousClass7TG.A0R(A0G, R.id.title), this, this.A00, 2131976857);
        DbX.A1F(AnonymousClass7TG.A0R(A0G, R.id.body), this, this.A00, 2131976855);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final void onCreate(Bundle bundle) {
        String str;
        int A02 = AnonymousClass0fD.A02(2008075270);
        C54128Gzx.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            str = bundle2.getString("user_name");
        } else {
            str = null;
        }
        this.A00 = str;
        AnonymousClass0fD.A09(-1950823827, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(1873649364);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.whatsapp_backed_profile_bottom_sheet, viewGroup, false);
        AnonymousClass0fD.A09(396595498, A02);
        return inflate;
    }
}
