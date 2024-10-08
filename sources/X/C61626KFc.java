package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;

/* renamed from: X.KFc  reason: case insensitive filesystem */
public final class C61626KFc extends C232222tE {
    public final UserSession A00;
    public final C63647L1j A01;

    public C61626KFc(UserSession userSession, C63647L1j l1j) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = l1j;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C60666JpD(DbT.A0D(layoutInflater, viewGroup, R.layout.add_event, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r9, C249703kE r10) {
        View view;
        View view2;
        C64765Lhh lhh = (C64765Lhh) r9;
        C60666JpD jpD = (C60666JpD) r10;
        AnonymousClass7TF.A1H(lhh, jpD);
        UpcomingEvent upcomingEvent = lhh.A00;
        if (upcomingEvent != null) {
            jpD.A06.setText(upcomingEvent.getTitle());
            jpD.A05.setText(C14240TsN.A02(AnonymousClass7TE.A0S(jpD.A01), this.A00, C18810W3l.A02(upcomingEvent)));
            jpD.A04.setVisibility(8);
            jpD.A02.setVisibility(0);
            boolean equals = "video_edit_metadata_fragment".equals("video_edit_metadata_fragment");
            View view3 = jpD.A00;
            if (equals) {
                view3.setVisibility(0);
                view = jpD.A03;
                view.setVisibility(8);
            } else {
                view3.setVisibility(8);
                view2 = jpD.A03;
                view = view2;
                view2.setVisibility(0);
            }
        } else {
            jpD.A04.setVisibility(0);
            jpD.A05.setVisibility(8);
            view = jpD.A03;
            view.setVisibility(8);
            view2 = jpD.A00;
            view2.setVisibility(0);
        }
        LY6.A01(jpD.A01, 27, this);
        LY6.A01(view, 28, this);
    }

    public final Class modelClass() {
        return C64765Lhh.class;
    }
}
