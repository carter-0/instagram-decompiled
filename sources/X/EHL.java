package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.avatars.coinflip.ProfileCoinFlipView;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;

public final class EHL extends C232232tF {
    public final Context A00;
    public final UserSession A01;

    public EHL(UserSession userSession, Context context) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = context;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C46932Dnm(DbT.A0D(layoutInflater, viewGroup, R.layout.avatar_pose_customization_v2_grid_item, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r14, C249703kE r15) {
        C47248DtZ dtZ = (C47248DtZ) r14;
        C46932Dnm dnm = (C46932Dnm) r15;
        boolean A1U = AnonymousClass7TF.A1U(0, dtZ, dnm);
        ProfileCoinFlipView profileCoinFlipView = dnm.A00;
        UserSession userSession = this.A01;
        Context context = this.A00;
        C43746C7q c7q = dtZ.A00;
        C320966tM.A02(context, profileCoinFlipView, userSession, false, String.valueOf(((C250663lr) c7q.A0E().get(0)).A09("cdn_url")), ((float) ((C250663lr) c7q.A0E().get(0)).getCoercedIntField(4, "margin_top")) / ((float) ((C250663lr) c7q.A0E().get(0)).getCoercedIntField(8, IgReactMediaPickerNativeModule.HEIGHT)), R.dimen.abc_list_item_height_large_material);
        profileCoinFlipView.setCircleBackgroundColor(AnonymousClass7TF.A03(context, R.attr.igds_color_status_pill));
        dnm.A01.setSelected(dtZ.A02);
        profileCoinFlipView.setContentDescription(((C250663lr) c7q.A0E().get(0)).getOptionalStringField(9, C273654mx.A00(64)));
        AnonymousClass3NG r1 = new AnonymousClass3NG(profileCoinFlipView);
        r1.A04 = new C47794EHf(dtZ, A1U ? 1 : 0);
        r1.A00();
    }

    public final Class modelClass() {
        return C47248DtZ.class;
    }

    public final /* bridge */ /* synthetic */ void unbind(C249703kE r4) {
        C46932Dnm dnm = (C46932Dnm) r4;
        0qQ.A0B(dnm, 0);
        dnm.A00.setAvatarImageDrawable((Drawable) null);
        dnm.A01.setSelected(false);
    }
}
