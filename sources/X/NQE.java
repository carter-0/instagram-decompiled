package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.Set;

public final class NQE extends C232232tF {
    public final Context A00;
    public final C66093MBb A01;
    public final AnonymousClass7NT A02;
    public final UserSession A03;
    public final AnonymousClass7NH A04;
    public final String A05 = AnonymousClass7TG.A0j();
    public final AnonymousClass0eM A06 = AnonymousClass1YB.A00(new MMO(this, 12));

    public /* synthetic */ NQE(Context context, C66093MBb mBb, UserSession userSession, boolean z) {
        AnonymousClass7NH r2 = new AnonymousClass7NH(userSession, new C52649GaN(z, 2));
        AnonymousClass7NT r3 = new AnonymousClass7NT((ViewGroup) null, new AnonymousClass7ND(context, userSession, new C52649GaN(z, 3)), (AnonymousClass7NA) null, C71789Oqq.A00, C74002PnT.A00);
        this.A03 = userSession;
        this.A00 = context;
        this.A01 = mBb;
        this.A04 = r2;
        this.A02 = r3;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        View A09 = DbW.A09(layoutInflater, viewGroup, R.layout.avatar_powerup_composer, false);
        View A0H = JTP.A0H(JTR.A0X(A09, R.id.direct_text_message_text_view_stub), R.layout.direct_text_message_text_view);
        0qQ.A0C(A0H, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) A0H;
        C66580MXl.A1F(textView, this.A00);
        C67693MsX msX = new C67693MsX(AnonymousClass7TE.A0S(viewGroup));
        msX.addView(A09);
        return new C68064MzV(msX, (ViewGroup) AnonymousClass7TF.A0G(A09, R.id.powerups_background_decoration), (ViewGroup) AnonymousClass7TF.A0G(A09, R.id.powerups_foreground_decoration), textView, AnonymousClass7TF.A0G(A09, R.id.avatar_image));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r33, C249703kE r34) {
        AnonymousClass763 r15;
        int i;
        String A002;
        C71972Otx otx = (C71972Otx) r33;
        C68064MzV mzV = (C68064MzV) r34;
        boolean A1U = AnonymousClass7TF.A1U(0, otx, mzV);
        Drawable drawable = mzV.A00;
        C331277Qg A0F = C66581MXm.A0F(drawable);
        TextView textView = mzV.A04;
        AnonymousClass79c r3 = otx.A01;
        C61008Jv7 jv7 = otx.A00;
        AnonymousClass5FV r2 = (AnonymousClass5FV) jv7.A04;
        C3271479o.A00(drawable, textView, r2, r3);
        Context context = this.A00;
        textView.setMinimumWidth((int) 0nA.A00(context, 96.0f));
        UserSession userSession = this.A03;
        String A0o = JTP.A0o((ImageUrl) jv7.A02);
        AnonymousClass0eM r0 = this.A06;
        Drawable A012 = C320996tP.A01(context, userSession, (C320986tO) null, A0o, "direct_composer", (String) null, "avatar_power_up", DbX.A07(r0), DbX.A07(r0), A1U, A1U, C63282KuR.A00(userSession), A1U, false);
        IgImageView igImageView = mzV.A05;
        igImageView.setImageDrawable(A012);
        igImageView.setVisibility(0);
        AnonymousClass7NT r13 = this.A02;
        r13.A00.A00 = (float) C3265577g.A00(r3.A03);
        String CBF = r3.CBF();
        ViewGroup viewGroup = mzV.A01;
        viewGroup.setTag(CBF);
        ViewGroup viewGroup2 = mzV.A03;
        ViewGroup viewGroup3 = mzV.A02;
        boolean CU2 = r3.CU2();
        boolean z = r3.A0D;
        ShapeDrawable shapeDrawable = null;
        if (A0F != null) {
            r15 = A0F.A04;
            shapeDrawable = A0F.A01;
        } else {
            r15 = null;
        }
        r13.A00(context, shapeDrawable, viewGroup2, viewGroup, viewGroup3, igImageView, r15, r2, CBF, CU2, z);
        C71405Ok4.A01(viewGroup2, 13, otx, this);
        C69855NtJ ntJ = C69855NtJ.$redex_init_class;
        int ordinal = r2.ordinal();
        if (ordinal != 5) {
            if (ordinal == 6) {
                i = 2131958641;
            } else if (ordinal == 7) {
                i = 2131958644;
            } else if (ordinal != 8) {
                mzV.itemView.setContentDescription((CharSequence) null);
                textView.setImportantForAccessibility(A1U ? 1 : 0);
            } else {
                i = 2131958642;
            }
            DbU.A12(context, mzV.itemView, i);
            textView.setImportantForAccessibility(2);
        } else {
            i = 2131958643;
            DbU.A12(context, mzV.itemView, i);
            textView.setImportantForAccessibility(2);
        }
        03v.A0B(mzV.itemView, new C67703MtH(0));
        AnonymousClass7NH r5 = this.A04;
        String str = this.A05;
        int absoluteAdapterPosition = mzV.getAbsoluteAdapterPosition();
        0qQ.A0B(str, 0);
        if (r2.A01) {
            Set set = r5.A01;
            if (!set.contains(r2)) {
                set.add(r2);
                0Aj A0e = AnonymousClass7TE.A0e(r5.A00, "ig_composer_impression_avatar_power_up");
                if (A0e.isSampled()) {
                    A0e.A9F("client_timestamp_ms", C51968G9o.A0u());
                    A0e.AAJ("creation_session_id", str);
                    A0e.AAJ("send_source", "direct_composer");
                    if (C51971G9r.A1b(r5.A02)) {
                        A002 = C273654mx.A00(3453);
                    } else {
                        A002 = AnonymousClass7NH.A00(r2);
                    }
                    A0e.A9F("absolute_position", DbV.A0p(A0e, "item_id", A002, absoluteAdapterPosition));
                    A0e.Cgf();
                }
            }
        }
    }

    public final Class modelClass() {
        return C71972Otx.class;
    }

    public final /* bridge */ /* synthetic */ void unbind(C249703kE r3) {
        C68064MzV mzV = (C68064MzV) r3;
        0qQ.A0B(mzV, 0);
        ViewGroup viewGroup = mzV.A01;
        if (viewGroup.getTag() != null) {
            this.A02.A01(viewGroup.getTag().toString());
        }
    }
}
