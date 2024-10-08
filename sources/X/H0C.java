package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class H0C extends AnonymousClass4DH {
    public static final C55904HpR A03 = new Object();
    public static final String __redex_internal_original_name = "CutoutStickerFirstTimeNuxFragment";
    public boolean A00;
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A00(0eO.A02, new MMT(this, 7));
    public final AnonymousClass0eM A02 = C227642jf.A02(this);

    public final String getModuleName() {
        return "cutout_sticker_first_time_nux_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        boolean z;
        AnonymousClass5DW r11;
        String str;
        String str2;
        String str3;
        String BRI;
        Integer num;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && (string = bundle2.getString("media_id")) != null) {
            AnonymousClass0eM r10 = this.A02;
            1Xj A022 = DbX.A0d(r10).A02(string);
            if (A022 != null) {
                Bundle bundle3 = this.mArguments;
                boolean z2 = false;
                if (bundle3 != null) {
                    z = bundle3.getBoolean("is_story", false);
                } else {
                    z = false;
                }
                H3S h3s = (H3S) 00k.A0J(H3S.A08.A00(requireContext(), AnonymousClass7TE.A0l(r10), A022, z));
                if (h3s != null) {
                    AnonymousClass5DY r0 = h3s.A00;
                    if (r0 != null && r0.CbA() && !z) {
                        z2 = true;
                    }
                    this.A00 = z2;
                    AnonymousClass5DY r02 = h3s.A00;
                    String str4 = null;
                    if (r02 != null) {
                        r11 = r02.BzX();
                    } else {
                        r11 = null;
                    }
                    IgImageView A0b = DbT.A0b(view2, R.id.user_image);
                    if (r11 != null) {
                        str = r11.getProfilePicUrl();
                    } else {
                        str = null;
                    }
                    DbV.A1P(this, A0b, str);
                    TextView A0G = DbU.A0G(view2, R.id.username_text);
                    if (r11 != null) {
                        str2 = r11.getUsername();
                    } else {
                        str2 = null;
                    }
                    A0G.setText(str2);
                    View requireViewById = view2.requireViewById(R.id.verified_badge);
                    int i = 0;
                    if (r11 == null || !r11.isVerified()) {
                        i = 8;
                    }
                    requireViewById.setVisibility(i);
                    IgImageView A0b2 = DbX.A0b(view2, R.id.cutout_sticker);
                    View requireViewById2 = view2.requireViewById(R.id.image_background);
                    Resources A09 = Dbb.A09(this, requireViewById2);
                    LRr.A02(A09, requireViewById2, (float) Dbb.A09(this, A09).getDimensionPixelSize(R.dimen.abc_dialog_padding_material));
                    AnonymousClass5DY r8 = h3s.A00;
                    if (r8 != null) {
                        str3 = r8.Bzp();
                    } else {
                        str3 = null;
                    }
                    boolean A0K = 0qQ.A0K(str3, "image");
                    AnonymousClass5DY r82 = h3s.A00;
                    if (A0K) {
                        if (r82 != null) {
                            str4 = r82.BRI();
                        }
                        DbV.A1P(this, A0b2, str4);
                    } else if (!(r82 == null || (BRI = r82.BRI()) == null)) {
                        A0b2.setImageDrawable(new AnonymousClass8N6(requireContext(), (Resources.Theme) null, AnonymousClass7TE.A0l(r10), h3s.A04, BRI, DbV.A05(this).getDimensionPixelSize(R.dimen.call_participant_text_max_width), DbV.A05(this).getDimensionPixelSize(R.dimen.video_cutout_sticker_height)));
                    }
                    int i2 = 2131957293;
                    int i3 = 2131957292;
                    if (this.A00) {
                        i2 = 2131957296;
                        i3 = 2131957295;
                    }
                    TextView A0G2 = DbU.A0G(view2, R.id.title);
                    Context context = view2.getContext();
                    DbT.A18(context, A0G2, i2);
                    DbT.A18(context, DbU.A0G(view2, R.id.subtitle), i3);
                    C3021461u r83 = (C3021461u) AnonymousClass7TF.A0F(view2, R.id.action_buttons);
                    int i4 = 2131957291;
                    if (this.A00) {
                        i4 = 2131957294;
                    }
                    r83.setPrimaryAction(context.getString(i4), new ICA(1, h3s, A022, this, z));
                    C358148aR r2 = (C358148aR) this.A01.getValue();
                    if (z) {
                        num = AnonymousClass05K.A0C;
                    } else {
                        num = AnonymousClass05K.A0N;
                    }
                    0qQ.A0B(num, 0);
                    C358148aR.A00(r2, num, (Integer) null, (Integer) null, (Long) null, "attribution_upsell_impression");
                    1Av A0h = DbX.A0h(r10);
                    AnonymousClass7TF.A1J(A0h, A0h.A32, 1Av.A8a, 328, true);
                }
            }
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-2042145848);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.cutout_sticker_first_time_nux_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-1291037253, A022);
        return inflate;
    }
}
