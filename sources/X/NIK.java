package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import java.util.ArrayList;

public final class NIK extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "EncryptedBackupsFishfoodingBannersFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.2tF, java.lang.Object] */
    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView A0c = JTR.A0c(view, R.id.banner_recyclerview);
        Context context = view.getContext();
        AnonymousClass2tC A002 = AnonymousClass2t9.A00(context);
        A002.A01(new C67172MjU(AnonymousClass7TE.A0l(this.A00)));
        AnonymousClass2t9 A0U = DbU.A0U(A002, new Object());
        A0c.setAdapter(A0U);
        DbU.A15(context, A0c, 1, false);
        C68699NTl nTl = new C68699NTl(this);
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (C69293Nit nit : C69293Nit.values()) {
            A1C.add(new N5O(nit.toString()));
            A1C.add(new C71973Oty(nTl, nit, (Integer) null));
        }
        A0U.A08(A1C);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1616385171);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.encrypted_backups_fishfooding_banners_layout, viewGroup, false);
        AnonymousClass0fD.A09(191542765, A02);
        return inflate;
    }
}
