package X;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import com.instagram.ui.widget.emitter.PulseEmitter;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.ui.widget.imageview.PulsingMultiImageView;
import com.instagram.user.model.User;

/* renamed from: X.MnY  reason: case insensitive filesystem */
public final class C67417MnY extends C232222tE {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final C67418MnZ A02;
    public final XAH A03;
    public final Activity A04;

    public C67417MnY(Activity activity, AnonymousClass0iw r3, UserSession userSession, C67418MnZ mnZ, XAH xah) {
        0qQ.A0B(userSession, 2);
        this.A04 = activity;
        this.A01 = userSession;
        this.A00 = r3;
        this.A02 = mnZ;
        this.A03 = xah;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r28, C249703kE r29) {
        FrameLayout frameLayout;
        String string;
        Reel reel;
        boolean z;
        C277954w0 r0;
        C277884vt r02;
        C277954w0 r03;
        C277884vt r04;
        C66974Mg7 mg7 = (C66974Mg7) r28;
        C249703kE r2 = r29;
        AnonymousClass7TG.A1N(mg7, r2);
        Context A06 = JTQ.A06(r2);
        UserSession userSession = this.A01;
        AnonymousClass0iw r11 = this.A00;
        C66632Ma1 ma1 = mg7.A00;
        C66967Mg0 mg0 = mg7.A00;
        C67418MnZ mnZ = this.A02;
        XAH xah = this.A03;
        Object tag = r2.itemView.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.search.common.ui.UserSearchAvatarViewBinder.Holder");
        PJR pjr = (PJR) tag;
        AnonymousClass7TG.A1Q(userSession, r11);
        0qQ.A0B(mnZ, 6);
        0qQ.A0B(xah, 7);
        0qQ.A0B(pjr, 8);
        User A062 = ma1.A06();
        xah.ECK(pjr.A04, ma1, mg0);
        IgImageView igImageView = pjr.A07;
        igImageView.setVisibility(0);
        DbU.A1S(r11, igImageView, A062);
        C67434Mnp.A03(igImageView);
        C67418MnZ mnZ2 = mnZ;
        C66967Mg0 mg02 = mg0;
        C71400Ojz ojz = new C71400Ojz(17, (Object) mnZ2, (Object) ma1, (Object) mg02, (Object) r11);
        boolean z2 = true;
        boolean A1V = AnonymousClass7TF.A1V(A062.A03.BNG());
        if (A062.A03.BNG() == null || !mg0.A0F || !182.A06(0Tu.A05, userSession, 36313141033830189L)) {
            z2 = false;
        }
        if (A062.A03.BNG() == null || !A1V || z2) {
            1OP r05 = 1OP.$redex_init_class;
            Reel A022 = AnonymousClass3PQ.A02(userSession, A062);
            pjr.A08.setVisibility(8);
            pjr.A09.setVisibility(8);
            C252063oV r06 = pjr.A0A;
            if (A022 != null) {
                r06.setVisibility(8);
                GradientSpinner gradientSpinner = pjr.A0B;
                gradientSpinner.setVisibility(0);
                FrameLayout frameLayout2 = pjr.A05;
                AnonymousClass0fU.A00(new C71367OjM(6, mnZ2, userSession, mg02, pjr, ma1, A062), frameLayout2);
                DbT.A1A(A06.getResources(), frameLayout2, 2131974507);
                gradientSpinner.A02();
                Reel A023 = AnonymousClass3PQ.A02(userSession, A062);
                if (A023 != null) {
                    AnonymousClass3NW.A02(userSession, A023, gradientSpinner);
                }
                ViewGroup viewGroup = pjr.A03;
                AnonymousClass0fU.A00(ojz, viewGroup);
                viewGroup.setOnLongClickListener(new C71420OkL(4, A06, userSession, mnZ, A062));
                IgTextView igTextView = pjr.A06;
                DbU.A1H(igTextView, A062);
                C244273av.A0C(igTextView, A062.isVerified());
            }
            r06.setVisibility(8);
            frameLayout = pjr.A05;
            AnonymousClass0fU.A00(ojz, frameLayout);
            pjr.A0B.setVisibility(4);
            string = A06.getResources().getString(2131973912);
        } else {
            Boolean bool = null;
            if (A062.A03.BNG() != null) {
                1OP r07 = 1OP.$redex_init_class;
                ReelStore A032 = ReelStore.A03(userSession);
                0qQ.A07(A032);
                reel = A032.A0M(A062.A03.BNG());
            } else {
                reel = null;
            }
            GradientSpinner gradientSpinner2 = pjr.A0B;
            gradientSpinner2.setVisibility(0);
            gradientSpinner2.A02();
            C252063oV r13 = pjr.A08;
            r13.setVisibility(0);
            if (pjr.A00 == null) {
                pjr.A00 = r13.getView().requireViewById(R.id.badge_background);
            }
            if (pjr.A02 == null) {
                pjr.A02 = DbT.A0b(r13.getView(), R.id.badge_icon);
            }
            if (pjr.A01 == null) {
                pjr.A01 = DbT.A0a(r13.getView(), R.id.badge_label);
            }
            if (reel != null) {
                AnonymousClass3NV A0E = reel.A0E();
                C270194gL r08 = reel.A0H;
                if (r08 == null || (r03 = r08.A02) == null || (r04 = r03.A0A) == null) {
                    z = false;
                } else {
                    z = r04.CVs();
                }
                AnonymousClass3NW.A03(gradientSpinner2, A0E, z);
                AnonymousClass3NV A0E2 = reel.A0E();
                Boolean valueOf = Boolean.valueOf(reel.A0j());
                C270194gL r09 = reel.A0H;
                if (!(r09 == null || (r0 = r09.A02) == null || (r02 = r0.A0A) == null)) {
                    bool = Boolean.valueOf(r02.CVs());
                }
                C278194wQ.A00(pjr.A00, pjr.A02, pjr.A01, A0E2, valueOf, bool);
            }
            C252063oV r010 = pjr.A09;
            r010.setVisibility(0);
            ((PulseEmitter) r010.getView()).A01();
            C252063oV r011 = pjr.A0A;
            r011.setVisibility(0);
            ((PulsingMultiImageView) r011.getView()).setAnimatingImageUrl(A062.Bh3(), r11);
            igImageView.setVisibility(8);
            frameLayout = pjr.A05;
            AnonymousClass0fU.A00(new C71367OjM(7, mnZ, userSession, mg0, pjr, ma1, A062), frameLayout);
            string = A06.getString(2131976354);
        }
        frameLayout.setContentDescription(string);
        ViewGroup viewGroup2 = pjr.A03;
        AnonymousClass0fU.A00(ojz, viewGroup2);
        viewGroup2.setOnLongClickListener(new C71420OkL(4, A06, userSession, mnZ, A062));
        IgTextView igTextView2 = pjr.A06;
        DbU.A1H(igTextView2, A062);
        C244273av.A0C(igTextView2, A062.isVerified());
    }

    public final Class modelClass() {
        return C66974Mg7.class;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        boolean A1Y = C66580MXl.A1Y(viewGroup);
        Context context = viewGroup.getContext();
        ViewGroup viewGroup2 = (ViewGroup) DbW.A09(LayoutInflater.from(context), viewGroup, R.layout.avatar_search_user, A1Y);
        if (context != null) {
            PJR pjr = new PJR(viewGroup2);
            pjr.A06.A00 = true;
            viewGroup2.setTag(pjr);
            return new C67433Mno(viewGroup2);
        }
        throw DbU.A0h();
    }
}
