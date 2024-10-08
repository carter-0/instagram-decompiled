package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.igds.components.bulletcell.IgdsBulletCell;

/* renamed from: X.E0w  reason: case insensitive filesystem */
public final class C47404E0w extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "ConnectToGlassesEducationFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);
    public final AnonymousClass0eM A01 = DbS.A0I(new C73903Ple(this, 44), new C73903Ple(this, 45), new C73667Phg(37, (Object) null, this), DbS.A0z(C67708MtN.class));

    public final String getModuleName() {
        return "smart_glasses_sharing";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        String A16 = AnonymousClass7TE.A16(requireContext(), 2131963315);
        SpannableStringBuilder A08 = DbW.A08(requireContext(), 2131963314);
        AnonymousClass7AV.A05(A08, new ESx(this, DbZ.A01(this)), A16);
        ((IgdsBulletCell) view.requireViewById(R.id.share_from_your_glasses)).setIcon((int) R.drawable.instagram_glasses_pano_outline_24);
        TextView A0G = DbU.A0G(view, R.id.help_center_text);
        A0G.setEnabled(true);
        DbT.A1H(A0G);
        A0G.setText(A08);
        View requireViewById = view.requireViewById(R.id.cancel_provider_linking);
        requireViewById.setEnabled(true);
        FP8.A01(requireViewById, 48, this);
        View requireViewById2 = view.requireViewById(R.id.connect_button);
        requireViewById2.setEnabled(true);
        FP8.A01(requireViewById2, 49, this);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-2021012203);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.share_from_glasses_education_fragment, false);
        AnonymousClass0fD.A09(465712480, A02);
        return A0D;
    }
}
