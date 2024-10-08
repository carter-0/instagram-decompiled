package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.G2q  reason: case insensitive filesystem */
public final class C51807G2q extends 0Yg implements 0sP {
    public final /* synthetic */ C284945Oz A00;
    public final /* synthetic */ C61052Jvq A01;
    public final /* synthetic */ AnonymousClass0iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ ImageUrl A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ C62320sa A06;
    public final /* synthetic */ 0sL A07;
    public final /* synthetic */ boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C51807G2q(C284945Oz r2, C61052Jvq jvq, AnonymousClass0iw r4, UserSession userSession, ImageUrl imageUrl, String str, C62320sa r8, 0sL r9, boolean z) {
        super(1);
        this.A04 = imageUrl;
        this.A02 = r4;
        this.A01 = jvq;
        this.A08 = z;
        this.A00 = r2;
        this.A07 = r9;
        this.A05 = str;
        this.A03 = userSession;
        this.A06 = r8;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2;
        View view = (View) obj;
        0qQ.A0B(view, 0);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = (GradientSpinnerAvatarView) view.findViewById(R.id.opal_avatar_view);
        ImageUrl imageUrl = this.A04;
        AnonymousClass0iw r4 = this.A02;
        gradientSpinnerAvatarView.A0F((AnonymousClass9IV) null, r4, imageUrl);
        C61052Jvq jvq = this.A01;
        if (jvq == null || (obj2 = jvq.A01) == null) {
            if (this.A08) {
                FPH.A00(gradientSpinnerAvatarView, r4, this.A03, this.A06, 39);
                DbU.A12(view.getContext(), gradientSpinnerAvatarView, 2131968885);
            }
            gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
        } else {
            boolean z = jvq.A02;
            gradientSpinnerAvatarView.setGradientSpinnerActivated(!z);
            C284945Oz r1 = this.A00;
            AnonymousClass62O r0 = I7S.A00;
            if (AnonymousClass7TE.A1a(r1.getValue()) && !z) {
                gradientSpinnerAvatarView.A08();
                r1.Epw(false);
            }
            AnonymousClass0fU.A00(new FOS(r4, gradientSpinnerAvatarView, this.A03, obj2, this.A07, this.A05, 4), gradientSpinnerAvatarView);
            DbU.A12(view.getContext(), gradientSpinnerAvatarView, 2131968886);
            gradientSpinnerAvatarView.setGradientSpinnerVisible(true);
        }
        if (this.A08) {
            gradientSpinnerAvatarView.setOnLongClickListener(new FPY(3, r4, this.A03, this.A06));
        }
        return C60340gF.A00;
    }
}
