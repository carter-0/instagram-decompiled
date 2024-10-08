package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.ArrayList;

public final class LNA {
    public final int A00;
    public final View A01;
    public final ArrayList A02;
    public final AnonymousClass0eM A03 = C66293MMc.A00(this, 6);
    public final AnonymousClass0eM A04 = C66293MMc.A00(this, 8);
    public final AnonymousClass0eM A05 = C66293MMc.A00(this, 12);
    public final AnonymousClass0eM A06 = C66293MMc.A00(this, 13);
    public final AnonymousClass0eM A07 = C66293MMc.A00(this, 14);
    public final AnonymousClass0eM A08;
    public final int[] A09;
    public final int[] A0A;
    public final Context A0B;
    public final AnonymousClass0eM A0C = C66293MMc.A00(this, 7);

    public LNA(View view, AnonymousClass4DH r17, UserSession userSession) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 2);
        View view2 = view;
        this.A01 = view2;
        AnonymousClass4DH r2 = r17;
        C66304MMn A012 = C66304MMn.A01(userSession2, r2, 23);
        AnonymousClass0eM A013 = C66293MMc.A01(new C66293MMc(r2, 9), 0eO.A02, 10);
        this.A08 = DbS.A0I(new C66293MMc(A013, 11), A012, C66304MMn.A01(A013, (Object) null, 22), DbS.A0z(C60195JhE.class));
        Context context = view2.getContext();
        this.A0B = context;
        this.A00 = AnonymousClass7TG.A05(context);
        Integer num = AnonymousClass05K.A00;
        ArrayList A1L = 0sr.A1L(new L5S[]{new L5S(R.id.live_invite_button, num), new L5S(R.id.iglive_header_avatar_text_container, AnonymousClass05K.A0N), new L5S(R.id.iglive_face_filter_button, AnonymousClass05K.A0C), new L5S(R.id.qa_mode_button, num)});
        this.A02 = A1L;
        this.A0A = new int[]{context.getColor(R.color.fds_transparent), AnonymousClass7TF.A03(context, R.attr.igds_color_secondary_button_on_media), AnonymousClass7TF.A03(context, R.attr.igds_color_secondary_button_on_media), AnonymousClass7TF.A03(context, R.attr.igds_color_secondary_button_on_media), AnonymousClass7TF.A03(context, R.attr.igds_color_secondary_button_on_media), AnonymousClass7TF.A03(context, R.attr.igds_color_secondary_button_on_media), AnonymousClass7TF.A03(context, R.attr.igds_color_secondary_button_on_media)};
        this.A09 = new int[]{context.getColor(R.color.fds_transparent), AnonymousClass7TF.A03(context, R.attr.igds_color_secondary_button_on_media), AnonymousClass7TF.A03(context, R.attr.igds_color_secondary_button_on_media), AnonymousClass7TF.A03(context, R.attr.igds_color_secondary_button_on_media), AnonymousClass7TF.A03(context, R.attr.igds_color_secondary_button_on_media)};
        ((C60195JhE) this.A08.getValue()).A00 = A1L.size();
        LY5.A01(AnonymousClass7TH.A06(this.A03), 44, this);
        DbV.A1F(r2.getViewLifecycleOwner(), ((C60195JhE) this.A08.getValue()).A01, new MPC(this, 0), 62);
    }

    public static final IgImageView A00(LNA lna) {
        return (IgImageView) AnonymousClass7TE.A14(lna.A0C);
    }
}
