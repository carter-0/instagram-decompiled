package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.List;

public final class NOV extends C232222tE {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final C70431O6i A02;
    public final String A03;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        return new C67893Mwb(DbU.A09(layoutInflater, viewGroup, R.layout.direct_cutout_sticker_tray_item, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r13, C249703kE r14) {
        C68185N5a n5a = (C68185N5a) r13;
        C67893Mwb mwb = (C67893Mwb) r14;
        boolean A1U = AnonymousClass7TF.A1U(0, n5a, mwb);
        IgImageView igImageView = mwb.A00;
        Context context = igImageView.getContext();
        C317966o8 r10 = n5a.A01;
        Integer A04 = r10.A04();
        Integer num = AnonymousClass05K.A01;
        if (A04 == num) {
            0qQ.A0A(context);
            igImageView.setImageDrawable(new AnonymousClass8N6(context, context.getTheme(), this.A01, r10, (C321086tY) null));
        } else {
            igImageView.setUrl(new SimpleImageUrl(r10.A0H), this.A00);
        }
        2eS.A04(igImageView, num);
        C68642NQw.A00(AnonymousClass7TE.A0m(igImageView), n5a, this, 0);
        if (!n5a.A00) {
            n5a.A00 = A1U;
            UserSession userSession = this.A01;
            List A1I = AnonymousClass7TE.A1I(r10.A0S);
            AnonymousClass0iw r0 = this.A00;
            String str = this.A03;
            AnonymousClass7TF.A1B(userSession, 0, r0);
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r0, userSession), "ig_direct_sticker_impression");
            if (A0e.isSampled()) {
                A0e.A8M(C69480NmO.CUSTOM, "sticker_type");
                A0e.AAe("sticker_ids", A1I);
                A0e.AAJ("bottom_sheet_session_id", str);
                A0e.Cgf();
            }
        }
    }

    public final Class modelClass() {
        return C68185N5a.class;
    }

    public NOV(AnonymousClass0iw r1, UserSession userSession, C70431O6i o6i, String str) {
        this.A01 = userSession;
        this.A00 = r1;
        this.A02 = o6i;
        this.A03 = str;
    }
}
