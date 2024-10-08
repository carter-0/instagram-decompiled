package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.textview.IgAutoCompleteTextView;

public final class LFX {
    public View A00;
    public IgAutoCompleteTextView A01;
    public final View A02;
    public final AnonymousClass4DH A03;
    public final UserSession A04;
    public final C64722Lgz A05;
    public final C64723Lh0 A06;
    public final AnonymousClass3Q2 A07;
    public final C358448av A08;
    public final String A09;

    public LFX(View view, AnonymousClass4DH r6, UserSession userSession, C64722Lgz lgz, C64723Lh0 lh0, AnonymousClass3Q2 r10, String str) {
        0qQ.A0B(userSession, 1);
        this.A04 = userSession;
        this.A03 = r6;
        this.A02 = view;
        this.A07 = r10;
        this.A09 = str;
        this.A06 = lh0;
        this.A05 = lgz;
        this.A08 = C358428at.A01(r6, userSession, AnonymousClass7TG.A0j(), 182.A06(0Tu.A05, userSession, 36311173939003852L));
    }

    public final void A00() {
        View view = this.A02;
        FrameLayout frameLayout = (FrameLayout) AnonymousClass7TF.A0F(view, R.id.metadata_thumbnail_container);
        AnonymousClass4DH r1 = this.A03;
        int A052 = JTP.A05(DbV.A05(r1));
        int i = (int) ((((float) A052) * 1.7777778f) + 0.5f);
        ImageView imageView = (ImageView) AnonymousClass7TF.A0G(view, R.id.metadata_imageview);
        ImageView imageView2 = (ImageView) AnonymousClass7TF.A0G(view, R.id.metadata_loading_spinner);
        ViewGroup viewGroup = (ViewGroup) AnonymousClass7TF.A0G(view, R.id.metadata_cta_view);
        TextView textView = (TextView) AnonymousClass7TF.A0G(view, R.id.cta_text);
        String str = this.A09;
        if (str == null || !JTQ.A1Z(str)) {
            imageView.setVisibility(4);
            imageView2.setVisibility(0);
            Drawable drawable = imageView2.getDrawable();
            if (drawable != null) {
                DbX.A11(r1.requireContext(), drawable.mutate(), R.color.grey_5);
                viewGroup.setVisibility(8);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
        C64612Lew lew = new C64612Lew(viewGroup, frameLayout, imageView, imageView2, textView, this, i, A052);
        boolean z = 1MF.A02;
        0nY.A00().ATE(new KJ3(lew, str, i, A052));
    }

    public final void A01(int i) {
        UserSession userSession = this.A04;
        27p.A01(userSession).A1X(AnonymousClass80P.PUBLISH_SCREEN_PREVIEW);
        AnonymousClass6SR.A01().A0T = true;
        C59847JaN.A00(userSession).A04("MEDIA_PREVIEW_TAPPED");
        C59888JbD.A01(userSession, new KPQ(i));
    }
}
