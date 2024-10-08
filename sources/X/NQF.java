package X;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.api.schemas.RingSpec;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import java.util.List;

public final class NQF extends C232232tF {
    public final C69447Nlr A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C74479PvZ A03;
    public final C70439O6q A04 = new C70439O6q(this);
    public final C69319NjK A05;
    public final OME A06;
    public final String A07;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C249703kE(DbT.A0D(layoutInflater, viewGroup, R.layout.direct_ai_sticker_grid_item, false));
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.widget.ImageView, android.view.View] */
    public final /* bridge */ /* synthetic */ void unbind(C249703kE r3) {
        0qQ.A0B(r3, 0);
        ? r1 = (RoundedCornerImageView) AnonymousClass7TF.A0F(r3.itemView, R.id.ai_sticker_grid_item);
        r1.setImageDrawable((Drawable) null);
        r1.A04 = null;
        r1.setVisibility(8);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r25, C249703kE r26) {
        Object obj;
        AnonymousClass3O0 r12;
        AnonymousClass3O4 r10;
        Drawable drawable;
        String A16;
        C317966o8 r4;
        Drawable drawable2;
        N60 n60 = (N60) r25;
        C249703kE r11 = r26;
        boolean A1U = AnonymousClass7TF.A1U(0, n60, r11);
        ImageView A0J = DbX.A0J(r11.itemView, R.id.ai_sticker_grid_item);
        C61077JwF jwF = n60.A01;
        if (jwF != null) {
            obj = jwF.A00;
        } else {
            obj = null;
        }
        if (obj != null) {
            C317966o8 r9 = (C317966o8) jwF.A00;
            if (00l.A0d(JTP.A0o(r9.A0H), ".webp", false)) {
                drawable2 = new NdJ(AnonymousClass7TE.A0S(A0J), this.A02, r9, A1U);
            } else {
                C369768vI r122 = new C369768vI(A0J.getContext(), (RingSpec) null, this.A02, r9, C318046oG.NORMAL, (AnonymousClass3ID) null, r9.A0S);
                r122.A06 = this.A04;
                r122.A04();
                drawable2 = r122;
            }
            drawable = drawable2;
        } else {
            if (this.A00 == C69447Nlr.AI_STICKER) {
                if (182.A06(0Tu.A05, this.A02, 36317732356494829L)) {
                    AnonymousClass3O0 r123 = new AnonymousClass3O0();
                    AnonymousClass3O4 r102 = new AnonymousClass3O3();
                    r102.A02(0.88f);
                    r12 = r123;
                    r10 = r102;
                    r10.A03(1.0f);
                    r12.A03(r10.A01());
                    drawable = r12;
                }
            }
            AnonymousClass3O0 r124 = new AnonymousClass3O0();
            C336007du r103 = new C336007du();
            r103.A02(1.0f);
            r103.A05(AnonymousClass7TF.A03(DbS.A07(r11), R.attr.igds_color_elevated_highlight_background));
            r103.A00.A09 = AnonymousClass7TF.A03(DbS.A07(r11), R.attr.igds_color_ai_sticker_loading_shimmer);
            r12 = r124;
            r10 = r103;
            r10.A03(1.0f);
            r12.A03(r10.A01());
            drawable = r12;
        }
        A0J.setImageDrawable(drawable);
        A0J.setVisibility(0);
        if (jwF == null || (r4 = (C317966o8) jwF.A00) == null || (A16 = r4.A0M) == null) {
            A16 = AnonymousClass7TE.A16(A0J.getContext(), 2131958588);
        }
        A0J.setContentDescription(A16);
        if (jwF != null) {
            boolean A0d = 00l.A0d(JTP.A0o(((C317966o8) jwF.A00).A0H), ".webp", false);
            AnonymousClass3NG A0m = AnonymousClass7TE.A0m(A0J);
            A0m.A04 = new NQu(this, n60, A0d);
            A0m.A00();
            if (!jwF.A02) {
                UserSession userSession = this.A02;
                AnonymousClass0iw r104 = this.A01;
                C317966o8 r42 = (C317966o8) jwF.A00;
                String str = r42.A0U;
                if (str == null) {
                    str = "";
                }
                List A1I = AnonymousClass7TE.A1I(r42.A0S);
                String str2 = jwF.A01;
                C69447Nlr nlr = this.A00;
                String str3 = this.A07;
                boolean A0d2 = 00l.A0d(JTP.A0o(r42.A0H), ".webp", false);
                Long A0j = DbS.A0j(n60.A00);
                C71048OaQ.A01(nlr, r104, userSession, A0j, str, str2, str3, A1I, A0d2);
                String str4 = r42.A0U;
                if (str4 == null) {
                    str4 = "";
                }
                C71048OaQ.A03(C69480NmO.PAIR_AI_GENERATED, r104, userSession, A0j, str4, str3, AnonymousClass7TE.A1I(r42.A0S), 00l.A0d(JTP.A0o(r42.A0H), ".webp", false));
                jwF.A02 = A1U;
            }
        }
    }

    public final Class modelClass() {
        return N60.class;
    }

    public NQF(C69447Nlr nlr, AnonymousClass0iw r3, UserSession userSession, C74479PvZ pvZ, C69319NjK njK, String str) {
        this.A02 = userSession;
        this.A01 = r3;
        this.A03 = pvZ;
        this.A00 = nlr;
        this.A05 = njK;
        this.A07 = str;
        this.A06 = C73918Ply.A00(userSession);
    }
}
