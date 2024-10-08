package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.model.User;

/* renamed from: X.Uea  reason: case insensitive filesystem */
public final class C15546Uea extends C231632rz {
    public final Context A00;
    public final EtU A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final OJ1 A04 = new Object();
    public final VNA A05;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int i2;
        int A032 = AnonymousClass0fD.A03(961997382);
        V3U v3u = (V3U) obj;
        AnonymousClass6u8 r1 = (AnonymousClass6u8) obj2;
        Context context = this.A00;
        VRS vrs = (VRS) DbT.A0o(view);
        if (r1 == null) {
            i2 = 0;
        } else {
            i2 = r1.A00;
        }
        OJ1 oj1 = this.A04;
        AnonymousClass0iw r10 = this.A02;
        UserSession userSession = this.A03;
        VNA vna = this.A05;
        EtU etU = this.A01;
        0qQ.A0B(context, 0);
        AnonymousClass7TF.A1B(vrs, 1, v3u);
        C51974G9v.A1N(oj1, r10, userSession);
        AnonymousClass7TF.A1G(vna, 8, etU);
        VNC vnc = v3u.A00;
        if (vnc != null) {
            C16938VBq.A00(r10, userSession, oj1, vna, vrs.A01, vnc, i2);
        }
        User user = v3u.A01;
        if (user != null) {
            C17482VXj vXj = vrs.A00;
            IgImageView igImageView = vXj.A02;
            DbU.A1S(r10, igImageView, user);
            TextView textView = vXj.A01;
            textView.setText(user.B8Q());
            C244273av.A0C(textView, user.isVerified());
            TextView textView2 = vXj.A00;
            textView2.setVisibility(0);
            DbT.A17(context, textView2, R.color.grey_5);
            textView2.setText(user.A03.getCategory());
            FollowButton followButton = vXj.A03;
            followButton.setVisibility(0);
            followButton.A0J.A03(r10, userSession, user);
            FPE fpe = new FPE(25, (Object) etU, (Object) user);
            AnonymousClass0fU.A00(fpe, igImageView);
            AnonymousClass0fU.A00(fpe, textView);
            AnonymousClass0fU.A00(fpe, textView2);
        }
        AnonymousClass0fD.A0A(1322993149, A032);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.OJ1] */
    public C15546Uea(Context context, EtU etU, AnonymousClass0iw r4, UserSession userSession, VNA vna) {
        this.A00 = context;
        this.A05 = vna;
        this.A02 = r4;
        this.A03 = userSession;
        this.A01 = etU;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A032 = AnonymousClass0fD.A03(2140022864);
        Context context = this.A00;
        View inflate = DbT.A0B(context).inflate(R.layout.location_page_single_section_rounded_corner_linear_layout, viewGroup, false);
        0qQ.A0C(inflate, C273654mx.A00(1));
        ViewGroup A0I = DbX.A0I(inflate, R.id.container);
        View inflate2 = LayoutInflater.from(context).inflate(R.layout.location_page_business_row, A0I, false);
        DbX.A1B(inflate2, R.id.view_profile);
        inflate2.setTag(new C17482VXj(DbU.A0G(inflate2, R.id.username), Dba.A05(inflate2), DbU.A0X(inflate2, R.id.profile_imageview), (FollowButton) inflate2.requireViewById(R.id.follow_button)));
        A0I.addView(inflate2);
        Object tag = inflate2.getTag();
        if (tag != null) {
            C17482VXj vXj = (C17482VXj) tag;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setTag(new VNB(linearLayout));
            A0I.addView(linearLayout);
            Object tag2 = linearLayout.getTag();
            if (tag2 != null) {
                inflate.setTag(new VRS(vXj, (VNB) tag2));
                AnonymousClass0fD.A0A(-2103393901, A032);
                return inflate;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
