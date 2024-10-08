package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

public final class UEG extends C249703kE {
    public final int A00;
    public final int A01;
    public final C14723U4m A02;
    public final IgTextView A03;
    public final IgTextView A04;
    public final Context A05;
    public final ViewGroup A06;
    public final C18585Vuc A07;
    public final AnonymousClass0iw A08;
    public final UserSession A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UEG(View view, AnonymousClass0iw r7, UserSession userSession) {
        super(view);
        AnonymousClass7TG.A1O(userSession, r7);
        this.A09 = userSession;
        this.A08 = r7;
        Context A0S = AnonymousClass7TE.A0S(view);
        this.A05 = A0S;
        C18585Vuc vuc = new C18585Vuc();
        vuc.A0A = false;
        vuc.A07 = false;
        vuc.A0B = false;
        vuc.A0E = false;
        vuc.A09 = false;
        vuc.A06 = "ig_places_map";
        vuc.A01("PlacesMapRowViewHolder.kt");
        vuc.A08 = AnonymousClass1GD.A03();
        this.A07 = vuc;
        ViewGroup A0I = DbX.A0I(view, R.id.map_container);
        this.A06 = A0I;
        C14723U4m u4m = new C14723U4m(A0S, vuc);
        this.A02 = u4m;
        this.A01 = A0S.getResources().getDimensionPixelOffset(R.dimen.clips_midcard_three_clips_adjacent_video_width_new_design);
        this.A00 = AnonymousClass1GB.A01(0nA.A04(A0S, 20));
        this.A03 = DbX.A0Z(view, R.id.places_cta_button);
        this.A04 = DbX.A0Z(view, R.id.place_info);
        A0I.addView(u4m);
        u4m.D6V((Bundle) null);
    }
}
