package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;

public final class KQV extends C61887KQc {
    public static final String __redex_internal_original_name = "EncryptedBackupsGDriveRestoreFlowFragment";
    public IgdsBottomButtonLayout A00;
    public C62320sa A01 = new C73904Plf(this, 49);
    public boolean A02;
    public boolean A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;

    public final void A0K(S5E s5e) {
        A0L(false);
        JTT.A0T(this).A0H(s5e);
    }

    public final String getModuleName() {
        return "encrypted_backups_gdrive_restore_flow";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        JTT.A0T(this).A0I(C71145Oe2.A01(this), AnonymousClass7TF.A1Z(this.A06));
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new C66171MGi(viewLifecycleOwner, r3, this, (AnonymousClass4D7) null, 39), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public KQV() {
        C73904Plf plf = new C73904Plf(this, 48);
        C73904Plf plf2 = new C73904Plf(this, 45);
        0eO r6 = 0eO.A02;
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(r6, new C73904Plf(plf2, 46));
        this.A05 = DbS.A0I(new C73904Plf(A002, 47), plf, new C73664Phd(42, A002, (Object) null), DbS.A0z(C67715MtU.class));
        this.A06 = AnonymousClass1YB.A00(new C67485Mof(this, 0));
        this.A04 = AnonymousClass0eN.A00(r6, new C73904Plf(this, 40));
    }

    public final void A0E() {
        JTT.A0T(this).A0E();
    }

    public final boolean onBackPressed() {
        JTT.A0T(this).A0E();
        return false;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-282853501);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_eb_gdrive_restore_flow_layout, viewGroup, false);
        IgdsHeadline igdsHeadline = (IgdsHeadline) AnonymousClass7TF.A0F(inflate, R.id.headline);
        igdsHeadline.setHeadline(2131961105);
        igdsHeadline.setBody(2131961109);
        IgdsBottomButtonLayout A0c = DbT.A0c(inflate, R.id.bottom_buttons);
        this.A00 = A0c;
        if (A0c != null) {
            A0c.setPrimaryActionOnClickListener(LYD.A01(this, 65));
        }
        AnonymousClass0fD.A09(303039783, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1854039167);
        this.A00 = null;
        super.onDestroyView();
        AnonymousClass0fD.A09(-323504165, A022);
    }
}
