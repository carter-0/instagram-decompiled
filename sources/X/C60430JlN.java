package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.JlN  reason: case insensitive filesystem */
public final class C60430JlN extends 2Rw {
    public User A00;
    public Integer A01 = AnonymousClass05K.A00;
    public String A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final UserSession A06;
    public final List A07 = AnonymousClass7TE.A1C();
    public final Context A08;
    public final AnonymousClass0iw A09;
    public final C55809Hnp A0A;
    public final C61417K6o A0B;
    public final C61417K6o A0C;
    public final C61417K6o A0D;

    /* JADX WARNING: type inference failed for: r2v15, types: [android.widget.TextView, com.instagram.igtv.widget.ExpandableTextView, android.view.View] */
    /* JADX WARNING: type inference failed for: r1v19, types: [com.instagram.igtv.widget.ExpandableTextView, android.view.View] */
    public final void onBindViewHolder(C249703kE r12, int i) {
        View view;
        int i2;
        Object[] A1Z;
        Integer num;
        IPB ipb;
        Drawable drawable;
        View view2;
        int i3;
        int i4;
        0qQ.A0B(r12, 0);
        if (r12 instanceof C60676JpN) {
            C60676JpN jpN = (C60676JpN) r12;
            User user = this.A00;
            String str = this.A02;
            boolean z = this.A04;
            boolean z2 = this.A03;
            AnonymousClass0iw r6 = this.A09;
            if (user != null) {
                FollowButton followButton = jpN.A09;
                C267064at r0 = followButton.A0J;
                UserSession userSession = jpN.A05;
                r0.A03(r6, userSession, user);
                DbU.A1S(r6, jpN.A06, user);
                TextView textView = jpN.A04;
                DbU.A1H(textView, user);
                jpN.A03.setText(user.getFullName());
                if (user.isVerified()) {
                    drawable = JTO.A0D(jpN.A0A);
                } else {
                    drawable = null;
                }
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
                if (z) {
                    0qQ.A0B(userSession, 0);
                    if (AnonymousClass2f1.A00(userSession).A0N(user) == FollowStatus.A05) {
                        i4 = jpN.A01;
                    } else {
                        i4 = jpN.A00;
                    }
                    followButton.setTextColor(i4);
                    view2 = jpN.A02;
                    i3 = 0;
                } else {
                    view2 = jpN.A02;
                    i3 = 8;
                }
                view2.setVisibility(i3);
                followButton.setVisibility(i3);
            }
            if (str != null) {
                r6.getModuleName();
                if (00l.A0W(str)) {
                    jpN.A08.setVisibility(8);
                    return;
                }
                ? r2 = jpN.A08;
                if (z2) {
                    r2.setText(str);
                } else {
                    r2.setExpandableText(str, jpN.A05, (1Xj) null);
                }
                r2.setVisibility(0);
            }
        } else if (r12 instanceof C60678JpP) {
            C65322LrL lrL = (C65322LrL) this.A07.get(i - 1);
            C60678JpP jpP = (C60678JpP) r12;
            AnonymousClass0iw r22 = this.A09;
            0qQ.A0B(lrL, 0);
            jpP.A00 = lrL.A07;
            ImageUrl imageUrl = lrL.A03;
            IgImageView igImageView = jpP.A0A;
            if (imageUrl != null) {
                igImageView.setUrl(imageUrl, r22);
            } else {
                igImageView.A09();
            }
            TextView textView2 = jpP.A05;
            long j = lrL.A02;
            textView2.setText(1G0.A02(j));
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            int minutes = (int) timeUnit.toMinutes(j);
            int seconds = ((int) timeUnit.toSeconds(j)) % 60;
            Resources resources = textView2.getResources();
            if (seconds == 0) {
                i2 = R.plurals.igtv_video_seconds_duration_description_one_min;
                A1Z = AnonymousClass7TF.A1b(seconds);
            } else {
                i2 = R.plurals.igtv_video_minute_duration_description;
                A1Z = C51968G9o.A1Z(Integer.valueOf(minutes), seconds);
            }
            String quantityString = resources.getQuantityString(i2, seconds, A1Z);
            0qQ.A0A(quantityString);
            textView2.setContentDescription(quantityString);
            jpP.A06.setText(lrL.A06);
            jpP.A04.setText(lrL.A05);
            int i5 = lrL.A00;
            TextView textView3 = jpP.A08;
            if (i5 > 0) {
                Resources resources2 = textView3.getResources();
                0qQ.A07(resources2);
                Integer valueOf = Integer.valueOf(i5);
                textView3.setText(AnonymousClass3f0.A01(resources2, valueOf));
                textView3.setContentDescription(DbV.A0v(resources2, valueOf, R.plurals.number_of_views, i5));
                textView3.setVisibility(0);
                jpP.A02.setVisibility(0);
            } else {
                textView3.setVisibility(8);
                jpP.A02.setVisibility(8);
            }
            TextView textView4 = jpP.A07;
            long j2 = lrL.A01;
            Context A0S = AnonymousClass7TE.A0S(textView4);
            textView4.setText(1G0.A07(A0S, j2));
            textView4.setContentDescription(1G0.A03(A0S, (double) j2));
            1Xj r7 = lrL.A04;
            if (1sd.A00(jpP.A09).A05(r7)) {
                num = AnonymousClass05K.A00;
            } else {
                num = AnonymousClass05K.A0C;
            }
            Integer num2 = AnonymousClass05K.A0C;
            View view3 = jpP.A01;
            if (num == num2) {
                view3.setVisibility(8);
                view3 = jpP.A03;
            } else {
                0qQ.A0B(view3, 0);
                ImageUrl A1Q = r7.A1Q();
                MOO moo = MOO.A00;
                0qQ.A0B(moo, 5);
                if (A1Q != null) {
                    1OO A0J = 1NK.A00().A0J(A1Q, "IGTVEpisodeViewHolder");
                    A0J.A08 = r7;
                    A0J.A02(new C19214WPu(3, view3, r7, moo));
                    A0J.A01();
                }
                DbS.A0G(view3, R.id.hidden_item_icon).setImageResource(R.drawable.instagram_eye_off_pano_outline_24);
                C51967G9n.A0x(view3, R.id.hidden_item_title, 8);
                C51967G9n.A0x(view3, R.id.hidden_item_description, 8);
                C51967G9n.A0x(view3, R.id.hidden_item_button, 8);
                C51967G9n.A0x(view3, R.id.hidden_item_see_why, 8);
                jpP.A03.setVisibility(8);
            }
            view3.setVisibility(0);
            C55809Hnp hnp = this.A0A;
            View A0F = JTO.A0F(r12);
            C2354830a A002 = AnonymousClass30Y.A00(lrL, new C55510His(i), 002.A0T(lrL.A08, r7.getId(), '_'));
            A002.A00(hnp.A01);
            boolean CcK = r7.CcK();
            C56527Hzy hzy = hnp.A02;
            if (!CcK || !AnonymousClass3WX.A02(lrL, hzy.A00)) {
                ipb = hzy.A01;
            } else {
                ipb = hzy.A02;
            }
            A002.A00(ipb);
            C51967G9n.A0z(A0F, A002, hnp.A00);
        } else if (r12 instanceof C60597Jo6) {
            C60597Jo6 jo6 = (C60597Jo6) r12;
            boolean z3 = this.A05;
            int i6 = 0;
            C323716xz r1 = jo6.A00;
            if (z3) {
                if (r1 != null) {
                    r1.A02(true);
                    r1.A01(1.0f);
                    view = jo6.A01;
                }
                0qQ.A0F("spinnerDrawable");
                throw AnonymousClass00P.createAndThrow();
            }
            if (r1 != null) {
                r1.A02(false);
                view = jo6.A01;
                i6 = 8;
            }
            0qQ.A0F("spinnerDrawable");
            throw AnonymousClass00P.createAndThrow();
            view.setVisibility(i6);
        }
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        if (i == 0) {
            int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            return new C60676JpN(DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.igtv_series_info, false), this.A06, this.A0D);
        } else if (i == 1) {
            int i3 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            return new C60678JpP(DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.igtv_series_episode, false), this.A06, this.A0B);
        } else if (i == 2) {
            return new C60597Jo6(DbU.A0A(JTP.A0G(viewGroup), viewGroup, R.layout.igtv_loading_spinner, false));
        } else {
            if (i == 3) {
                int i4 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                View A0A2 = DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.igtv_empty_state, false);
                C249703kE r4 = new C249703kE(A0A2);
                View requireViewById = A0A2.requireViewById(R.id.message);
                0qQ.A0C(requireViewById, AnonymousClass000.A00(9));
                ((TextView) requireViewById).setText(2131964071);
                return r4;
            } else if (i == 4) {
                int i5 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                C61417K6o k6o = this.A0C;
                View A0A3 = DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.igtv_error_state, false);
                C249703kE r42 = new C249703kE(A0A3);
                DbU.A0G(A0A3, R.id.message).setText(2131964072);
                LY6.A01(A0A3.requireViewById(R.id.retry), 5, k6o);
                return r42;
            } else {
                throw AnonymousClass7TE.A0w(002.A0c("View type ", " is not supported", i));
            }
        }
    }

    public final void A00(boolean z) {
        if (this.A05 != z) {
            this.A05 = z;
            int size = this.A07.size() + 1;
            if (this.A05) {
                notifyItemInserted(size);
            } else {
                notifyItemRemoved(size);
            }
        }
    }

    public C60430JlN(Context context, AnonymousClass0iw r4, UserSession userSession, C55809Hnp hnp, C61417K6o k6o, C61417K6o k6o2, C61417K6o k6o3) {
        boolean A1Y = DbW.A1Y(userSession);
        this.A08 = context;
        this.A06 = userSession;
        this.A09 = r4;
        this.A0D = k6o;
        this.A0B = k6o2;
        this.A0C = k6o3;
        this.A0A = hnp;
        this.A05 = A1Y;
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(771008764);
        int size = this.A07.size() + 1 + 1;
        AnonymousClass0fD.A0A(-298091399, A032);
        return size;
    }

    public final int getItemViewType(int i) {
        int A032 = AnonymousClass0fD.A03(1027014002);
        int i2 = 1;
        if (i == getItemCount() - 1) {
            switch (this.A01.intValue()) {
                case 1:
                    i2 = 3;
                    break;
                case 3:
                    i2 = 4;
                    break;
                default:
                    i2 = 2;
                    break;
            }
        } else if (i == 0) {
            i2 = 0;
        }
        AnonymousClass0fD.A0A(1369182579, A032);
        return i2;
    }
}
