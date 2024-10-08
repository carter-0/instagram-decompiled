package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.user.model.User;

/* renamed from: X.Uey  reason: case insensitive filesystem */
public final class C15570Uey extends C336937fQ {
    public final VOQ A00;
    public final Context A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final OJ1 A04 = new UlN(this);
    public final VNA A05;
    public final C18420VrP A06;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v19, types: [X.V3j, java.lang.Object] */
    public final View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int i2;
        C16726V3j v3j;
        VNB vnb;
        VNB vnb2;
        View view2 = view;
        int A032 = AnonymousClass0fD.A03(334316289);
        V3U v3u = (V3U) obj;
        AnonymousClass6u8 r8 = (AnonymousClass6u8) obj2;
        if (view == null) {
            Context context = this.A01;
            view2 = LayoutInflater.from(context).inflate(R.layout.location_page_single_section_rounded_corner_linear_layout, viewGroup, false);
            ViewGroup A0C = DbU.A0C(view2, R.id.container);
            C16726V3j v3j2 = null;
            if (v3u.A00 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setTag(new VNB(linearLayout));
                A0C.addView(linearLayout);
                vnb2 = (VNB) linearLayout.getTag();
            } else {
                vnb2 = null;
            }
            if (v3u.A01 != null) {
                View inflate = LayoutInflater.from(context).inflate(R.layout.location_page_business_row, A0C, false);
                TextView A0d = AnonymousClass7TE.A0d(inflate, R.id.username);
                TextView A0d2 = AnonymousClass7TE.A0d(inflate, R.id.view_profile);
                ? obj3 = new Object();
                obj3.A02 = (CircularImageView) inflate.findViewById(R.id.profile_imageview);
                obj3.A00 = A0d;
                obj3.A01 = A0d2;
                inflate.setTag(obj3);
                A0C.addView(inflate);
                v3j2 = (C16726V3j) inflate.getTag();
            }
            view2.setTag(new VW2(A0C, vnb2, v3j2));
        }
        Context context2 = this.A01;
        VW2 vw2 = (VW2) DbT.A0o(view2);
        if (r8 == null) {
            i2 = 0;
        } else {
            i2 = r8.A00;
        }
        OJ1 oj1 = this.A04;
        AnonymousClass0iw r82 = this.A02;
        UserSession userSession = this.A03;
        C18420VrP vrP = this.A06;
        VNA vna = this.A05;
        VNC vnc = v3u.A00;
        if (!(vnc == null || (vnb = vw2.A01) == null)) {
            C16938VBq.A00(r82, userSession, oj1, vna, vnb, vnc, i2);
        }
        User user = v3u.A01;
        if (!(user == null || (v3j = vw2.A02) == null)) {
            CircularImageView circularImageView = v3j.A02;
            if (circularImageView != null) {
                DbU.A1S(r82, circularImageView, user);
            }
            TextView textView = v3j.A00;
            if (textView != null) {
                textView.setText(user.B8Q());
            }
            TextView textView2 = v3j.A01;
            if (textView2 != null) {
                DbU.A1A(context2.getResources(), textView2, 2131976660);
            }
            TextView textView3 = v3j.A01;
            textView3.getClass();
            WBA.A00(textView3, 48, vrP);
            ? r1 = v3j.A02;
            r1.getClass();
            WBA.A00(r1, 49, vrP);
            TextView textView4 = v3j.A00;
            textView4.getClass();
            WBA.A00(textView4, 50, vrP);
        }
        AnonymousClass0fD.A0A(-1259500212, A032);
        return view2;
    }

    public C15570Uey(Context context, AnonymousClass0iw r3, UserSession userSession, VNA vna, VOQ voq, C18420VrP vrP) {
        this.A01 = context;
        this.A05 = vna;
        this.A02 = r3;
        this.A03 = userSession;
        this.A06 = vrP;
        this.A00 = voq;
    }
}
