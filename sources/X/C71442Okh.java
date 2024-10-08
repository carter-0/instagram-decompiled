package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Okh  reason: case insensitive filesystem */
public final class C71442Okh implements ViewStub.OnInflateListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C255773uh A03;
    public final /* synthetic */ C250973mM A04;
    public final /* synthetic */ C317116mk A05;
    public final /* synthetic */ C316136lA A06;
    public final /* synthetic */ String A07;

    public C71442Okh(Context context, AnonymousClass0iw r2, UserSession userSession, C255773uh r4, C250973mM r5, C317116mk r6, C316136lA r7, String str) {
        this.A06 = r7;
        this.A00 = context;
        this.A07 = str;
        this.A05 = r6;
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = userSession;
        this.A01 = r2;
    }

    public final void onInflate(ViewStub viewStub, View view) {
        this.A06.A06 = view;
        ImageView imageView = (ImageView) view;
        if (imageView != null) {
            Context context = this.A00;
            boolean A0K = 0qQ.A0K(this.A07, "story_remix_reply");
            int i = R.drawable.instagram_camera_reaction_pano_outline_24;
            if (A0K) {
                i = R.drawable.instagram_remix_reactions_pano_outline_24;
            }
            DbU.A13(context, imageView, i);
        }
        C317116mk r5 = this.A05;
        C250973mM r4 = this.A04;
        C255773uh r2 = this.A03;
        String str = this.A07;
        AnonymousClass0fU.A00(new FOS(this.A01, r2, this.A02, r4, r5, str, 6), view);
    }
}
