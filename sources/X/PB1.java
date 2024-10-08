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

public final class PB1 implements AnonymousClass7D2 {
    public final AnonymousClass7XR A00;
    public final AnonymousClass768 A01;
    public final UserSession A02;

    public final /* bridge */ /* synthetic */ void ADp(C328007Db r12, AnonymousClass7FW r13) {
        AnonymousClass5FV r6;
        ImageUrl imageUrl;
        C68076Mzh mzh = (C68076Mzh) r12;
        NYH nyh = (NYH) r13;
        AnonymousClass7TG.A1N(mzh, nyh);
        AnonymousClass76M r2 = mzh.A05;
        AnonymousClass768 r0 = this.A01;
        AnonymousClass79c r1 = nyh.A01;
        r0.ADp(r2, r1);
        AnonymousClass7XR r3 = this.A00;
        AnonymousClass7NT BeR = ((C332857Wq) r3).BeR();
        if (BeR == null) {
            r6 = AnonymousClass5FV.None;
        } else {
            r6 = r1.A00;
        }
        N4R n4r = nyh.A00;
        String str = null;
        if (n4r != null) {
            imageUrl = (ImageUrl) n4r.A00;
        } else {
            imageUrl = null;
        }
        if (r6.A01 && BeR != null && !0mp.A0E(r1.A04.toString())) {
            r2.A03.setMinimumWidth((int) 0nA.A00(JTQ.A06(mzh), 96.0f));
            if (imageUrl != null) {
                str = imageUrl.getUrl();
                if (C66834MdS.A08(str)) {
                    0qQ.A07(str);
                    mzh.A00 = ((AnonymousClass7X5) r3).Cg8(new P92(BeR, r6, this, mzh, nyh), str);
                    return;
                }
            }
            A00(BeR, r6, this, mzh, nyh, str);
        }
    }

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        ViewGroup viewGroup2 = (ViewGroup) DbW.A09(layoutInflater, viewGroup, R.layout.avatar_powerup_message, false);
        View A0H = JTP.A0H(JTR.A0X(viewGroup2, R.id.direct_text_message_text_view_stub), R.layout.direct_text_message_text_view);
        0qQ.A0C(A0H, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) A0H;
        C66580MXl.A1F(textView, AnonymousClass7TE.A0S(textView));
        AnonymousClass76M r6 = new AnonymousClass76M(textView);
        this.A01.A03.A00(r6);
        return new C68076Mzh(viewGroup2, (ViewGroup) AnonymousClass7TF.A0G(viewGroup2, R.id.powerups_background_decoration), (ViewGroup) AnonymousClass7TF.A0G(viewGroup2, R.id.powerups_foreground_decoration), AnonymousClass7TF.A0G(viewGroup2, R.id.avatar_image), r6);
    }

    public static final void A00(AnonymousClass7NT r20, AnonymousClass5FV r21, PB1 pb1, C68076Mzh mzh, NYH nyh, String str) {
        ShapeDrawable shapeDrawable;
        C68076Mzh mzh2 = mzh;
        C331277Qg A0F = C66581MXm.A0F(mzh2.A05.A03.getBackground());
        AnonymousClass79c r2 = nyh.A01;
        String CBF = r2.CBF();
        String str2 = str;
        if (str != null) {
            IgImageView igImageView = mzh2.A04;
            if (igImageView.getDrawable() == null) {
                int A03 = DbS.A03(mzh2.itemView.getResources(), R.dimen.avatar_powerups_avatar_height);
                Drawable A012 = C320996tP.A01(JTQ.A06(mzh2), pb1.A02, (C320986tO) null, str2, "direct_thread", (String) null, "avatar_power_up", A03, A03, true, false, false, true, false);
                0qQ.A0C(A012, C273654mx.A00(3083));
                C321016tR r6 = (C321016tR) A012;
                r6.A0A(1);
                igImageView.setImageDrawable(r6);
                igImageView.setVisibility(8);
            }
        }
        AnonymousClass7NT r62 = r20;
        r62.A00.A00 = (float) C3265577g.A00(r2.A03);
        ViewGroup viewGroup = mzh2.A01;
        viewGroup.setTag(CBF);
        ViewGroup viewGroup2 = mzh2.A03;
        Context A0S = AnonymousClass7TE.A0S(viewGroup2);
        ViewGroup viewGroup3 = mzh2.A02;
        IgImageView igImageView2 = mzh2.A04;
        boolean CU2 = r2.CU2();
        boolean z = r2.A0D;
        AnonymousClass763 r13 = null;
        if (A0F != null) {
            r13 = A0F.A04;
            shapeDrawable = A0F.A01;
        } else {
            shapeDrawable = null;
        }
        r62.A00(A0S, shapeDrawable, viewGroup2, viewGroup, viewGroup3, igImageView2, r13, r21, CBF, CU2, z);
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r4) {
        C68076Mzh mzh = (C68076Mzh) r4;
        0qQ.A0B(mzh, 0);
        AnonymousClass7NT BeR = ((C332857Wq) this.A00).BeR();
        if (BeR != null) {
            ViewGroup viewGroup = mzh.A01;
            if (viewGroup.getTag() != null) {
                BeR.A01(viewGroup.getTag().toString());
            }
        }
        mzh.A04.setImageDrawable((Drawable) null);
        this.A01.FIP(mzh.A05);
        C70440O6r o6r = mzh.A00;
        if (o6r != null) {
            o6r.A00.set(true);
        }
        mzh.A00 = null;
    }

    public PB1(UserSession userSession, AnonymousClass7XR r2, AnonymousClass768 r3) {
        this.A02 = userSession;
        this.A00 = r2;
        this.A01 = r3;
    }
}
