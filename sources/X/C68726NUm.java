package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.NUm  reason: case insensitive filesystem */
public final class C68726NUm extends NJT {
    public static final String __redex_internal_original_name = "EncryptedBackupsOneTimeCodeDisplayCodeIntroFragment";
    public final AnonymousClass0eM A00 = AnonymousClass1YB.A00(new C73908Plj(this, 26));

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C3021461u r1 = (C3021461u) AnonymousClass7TF.A0F(requireView(), R.id.bottom_button);
        C71407Ok6.A02(r1, this, 19);
        NJT.A07(r1, this, 20);
        IgdsHeadline igdsHeadline = (IgdsHeadline) AnonymousClass7TF.A0F(requireView(), R.id.display_code_headline);
        igdsHeadline.setHeadline(2131961663);
        igdsHeadline.setBody(2131961661);
        igdsHeadline.ENc(new C71407Ok6(this, 21), 2131961658);
        C66913Mex A0U = C66580MXl.A0U(this.A00);
        Integer A02 = C71145Oe2.A02(this);
        0qQ.A0B(A02, 0);
        A0U.A0B("OTC_DISPLAY_CODE_CONFIRM_IMPRESSION");
        A0U.A0D("ENTRY_POINT", C69894Ntw.A00(A02));
        A0U.A0E("IS_OTC_V2", false);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-166141941);
        0qQ.A0B(layoutInflater, 0);
        C68726NUm.super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.encrypted_backups_display_code_intro_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-1625186160, A02);
        return inflate;
    }

    public final void onDestroy() {
        int A02 = AnonymousClass0fD.A02(553549566);
        super.onDestroy();
        C66580MXl.A0U(this.A00).A08();
        AnonymousClass0fD.A09(1919827603, A02);
    }
}
