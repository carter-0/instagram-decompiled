package com.instagram.connections.notifyme.modules.fragments;

import X.0eO;
import X.0qQ;
import X.19B;
import X.1Eo;
import X.2YL;
import X.AnonymousClass00P;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass0xx;
import X.AnonymousClass4D7;
import X.AnonymousClass4DH;
import X.AnonymousClass7TE;
import X.C227642jf;
import X.C318116oQ;
import X.C60176Jgv;
import X.DbS;
import X.DbV;
import X.GNG;
import X.JTP;
import X.JTR;
import X.MG7;
import X.MGE;
import X.MMC;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.lifecycleannotations.LifecycleUtil;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.user.follow.FollowButton;

public final class NotifyMeNotFollowedFragment extends AnonymousClass4DH {
    public String A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);
    public CircularImageView avatar;
    public FollowButton followButton;
    public View loadingIndicator;
    public IgTextView message;
    public IgTextView title;

    public final String getModuleName() {
        return "notify_me_not_followed";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        CircularImageView circularImageView = (CircularImageView) view.requireViewById(R.id.notify_me_not_followed_avatar);
        0qQ.A0B(circularImageView, 0);
        this.avatar = circularImageView;
        this.title = JTR.A0h(view, R.id.notify_me_not_followed_title);
        this.message = JTR.A0h(view, R.id.notify_me_not_followed_message);
        FollowButton followButton2 = (FollowButton) view.requireViewById(R.id.notify_me_not_followed_follow_button);
        0qQ.A0B(followButton2, 0);
        this.followButton = followButton2;
        View requireViewById = view.requireViewById(R.id.notify_me_not_followed_loading_indicator);
        0qQ.A0B(requireViewById, 0);
        this.loadingIndicator = requireViewById;
        AnonymousClass0xx A0J = DbV.A0J(this);
        MG7 mg7 = new MG7(this, (AnonymousClass4D7) null, 36);
        19B r3 = 19B.A00;
        1Eo.A05(r3, mg7, A0J);
        1Eo.A05(r3, new MG7(this, (AnonymousClass4D7) null, 37), DbV.A0J(this));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public NotifyMeNotFollowedFragment() {
        MMC mmc = new MMC(this, 1);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new MMC(new MMC(this, 2), 3));
        this.A01 = DbS.A0I(new MMC(A002, 4), mmc, new GNG(25, (Object) null, A002), DbS.A0z(C60176Jgv.class));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-122702806);
        NotifyMeNotFollowedFragment.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A00 = JTP.A0m(bundle2, "otherUserId");
            2YL A0H = DbS.A0H(this.A01);
            String str = this.A00;
            if (str == null) {
                0qQ.A0F("otherUserId");
                throw AnonymousClass00P.createAndThrow();
            }
            MGE.A01(A0H, str, C318116oQ.A00(A0H), 35);
            AnonymousClass0fD.A09(376595599, A022);
            return;
        }
        IllegalStateException A0z = AnonymousClass7TE.A0z("Arguments should be set on the fragment");
        AnonymousClass0fD.A09(1170966719, A022);
        throw A0z;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1230184013);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_notify_me_not_followed, viewGroup, false);
        AnonymousClass0fD.A09(-243125543, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1551267187);
        super.onDestroyView();
        LifecycleUtil.cleanupReferences(this);
        AnonymousClass0fD.A09(-765875862, A022);
    }
}
