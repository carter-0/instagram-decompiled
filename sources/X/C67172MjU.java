package X;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.banner.IgdsBanner;

/* renamed from: X.MjU  reason: case insensitive filesystem */
public final class C67172MjU extends C232232tF {
    public final UserSession A00;

    public C67172MjU(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C68011Myd(DbT.A0D(layoutInflater, viewGroup, R.layout.direct_inbox_encrypted_backup_banner, false), this.A00);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r11, C249703kE r12) {
        C74444Puz p0r;
        C71973Oty oty = (C71973Oty) r11;
        C68011Myd myd = (C68011Myd) r12;
        boolean A1U = AnonymousClass7TF.A1U(0, oty, myd);
        C69293Nit nit = oty.A01;
        Integer num = oty.A02;
        View view = myd.A01;
        Activity A002 = C61270mF.A00(AnonymousClass7TE.A0S(view));
        UserSession userSession = myd.A03;
        int ordinal = nit.ordinal();
        if (ordinal == 0) {
            p0r = new C72300P0r(A002, userSession, num);
        } else if (ordinal == A1U) {
            p0r = new C72302P0t(A002, userSession, num);
        } else if (ordinal == 2) {
            p0r = new C72303P0u(A002, userSession, num);
        } else if (ordinal == 3) {
            p0r = new C72299P0q(A002, userSession, num);
        } else if (ordinal == 4) {
            p0r = new C72301P0s(A002, userSession, num);
        } else {
            throw AnonymousClass7TE.A1K();
        }
        C74444Puz puz = p0r;
        int A0M = AnonymousClass7TE.A0M(puz.BTX().A05);
        if (A0M == 0) {
            C69664Npm npm = oty.A00;
            AnonymousClass7TH.A0R(myd.A00);
            IgdsBanner igdsBanner = myd.A04;
            igdsBanner.setVisibility(0);
            DbT.A1U(igdsBanner, (CharSequence) puz.BTX().A04, false);
            igdsBanner.setIcon(puz.BTX().A03);
            igdsBanner.setAction((CharSequence) puz.BTX().A00);
            igdsBanner.setDismissible(A1U);
            igdsBanner.setIconBackground((Drawable) null);
            igdsBanner.A00 = new PHJ(0, npm, puz);
        } else if (A0M == A1U) {
            C69664Npm npm2 = oty.A00;
            myd.A04.setVisibility(8);
            ViewStub viewStub = myd.A02;
            if (viewStub.getParent() == null) {
                View view2 = myd.A00;
                if (view2 == null) {
                    view2 = view.requireViewById(R.id.megaphone);
                    myd.A00 = view2;
                    if (view2 == null) {
                        return;
                    }
                }
                C69890Nts.A00(view2, npm2, puz);
                view2.setVisibility(0);
                return;
            }
            viewStub.setOnInflateListener(new C71441Okg(A1U ? 1 : 0, npm2, puz, myd));
            viewStub.setVisibility(0);
        } else {
            throw AnonymousClass7TE.A1K();
        }
    }

    public final Class modelClass() {
        return C71973Oty.class;
    }
}
