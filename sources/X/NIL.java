package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import java.util.ArrayList;

public final class NIL extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "EncryptedBackupsFishfoodingScreensFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.2tF, java.lang.Object] */
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView A0c = JTR.A0c(view, R.id.screens_recyclerview);
        Context context = view.getContext();
        AnonymousClass2t9 A0U = DbU.A0U(AnonymousClass2t9.A00(context), new Object());
        A0c.setAdapter(A0U);
        DbU.A15(context, A0c, 1, false);
        ArrayList A1C = AnonymousClass7TE.A1C();
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            str = bundle2.getString("BUNDLE_SURFACE");
        } else {
            str = null;
        }
        C69271NiX niX = C69271NiX.FULLSCREEN_MODAL;
        if (!Dba.A1X(niX, str)) {
            niX = C69271NiX.BOTTOM_SHEET;
        }
        for (C69358Njy n5y : C69358Njy.values()) {
            A1C.add(new N5Y(n5y, new C74191PqX(31, (Object) niX, (Object) this)));
        }
        A0U.A08(A1C);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-278727129);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.encrypted_backups_fishfooding_screens_layout, viewGroup, false);
        AnonymousClass0fD.A09(1778373145, A02);
        return inflate;
    }
}
