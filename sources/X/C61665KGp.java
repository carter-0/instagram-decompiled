package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.ui.ConstrainedTextureView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.KGp  reason: case insensitive filesystem */
public final class C61665KGp extends C232232tF {
    public final float A00;
    public final int A01;
    public final int A02;
    public final Context A03;
    public final UserSession A04;
    public final C63619L0h A05;

    public C61665KGp(Context context, UserSession userSession, C63619L0h l0h, float f, int i, int i2) {
        0qQ.A0B(userSession, 2);
        this.A03 = context;
        this.A04 = userSession;
        this.A05 = l0h;
        this.A02 = i;
        this.A01 = i2;
        this.A00 = f;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r23, C249703kE r24) {
        C64762Lhe lhe = (C64762Lhe) r23;
        C60634Joh joh = (C60634Joh) r24;
        boolean A1U = AnonymousClass7TF.A1U(0, lhe, joh);
        C63619L0h l0h = this.A05;
        float f = this.A00;
        Context context = this.A03;
        UserSession userSession = this.A04;
        C51973G9u.A0r(2, l0h, context, userSession);
        AnonymousClass3Q2 r5 = lhe.A00;
        String str = r5.A33;
        int i = r5.A0H;
        int i2 = r5.A0G;
        C64611Lev lev = new C64611Lev(joh);
        boolean z = 1MF.A02;
        0nY.A00().ATE(new KJ3(lev, str, i, i2));
        C378369Pn r9 = new C378369Pn(context, userSession, (C39888ADk) null, "feed", false, false);
        joh.A00 = r9;
        C378379Po r15 = new C378379Po(context, userSession, r5.A1D, "feed", A1U, 182.A06(0Tu.A05, userSession, 36318183327668184L));
        r9.A08(r5, 0);
        int i3 = r5.A0H;
        int i4 = r5.A0G;
        r15.A01 = i3;
        r15.A00 = i4;
        0qQ.A0B(r9, 0);
        r15.A06 = r9;
        ConstrainedTextureView constrainedTextureView = joh.A02;
        constrainedTextureView.setSurfaceTextureListener(r15);
        constrainedTextureView.setAspectRatio(f);
        r15.A03 = constrainedTextureView;
        MediaFrameLayout mediaFrameLayout = joh.A03;
        LYG.A02(mediaFrameLayout, 32, joh, l0h);
        mediaFrameLayout.A00 = f;
    }

    public final Class modelClass() {
        return C64762Lhe.class;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        int i = this.A02;
        int i2 = this.A01;
        View inflate = layoutInflater.inflate(R.layout.share_video_media_preview_layout, viewGroup, false);
        0qQ.A0C(inflate, C273654mx.A00(172));
        MediaFrameLayout mediaFrameLayout = (MediaFrameLayout) inflate;
        JTQ.A0w(mediaFrameLayout, i, i2);
        mediaFrameLayout.setTag(new C60634Joh(mediaFrameLayout));
        Object tag = mediaFrameLayout.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.creation.fragment.sharepreview.ShareVideoMediaPreviewViewBinder.Companion.Holder");
        return (C249703kE) tag;
    }
}
