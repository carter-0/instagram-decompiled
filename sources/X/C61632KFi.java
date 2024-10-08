package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.KFi  reason: case insensitive filesystem */
public final class C61632KFi extends C232222tE {
    public final C63586KzZ A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C60604JoD(DbT.A0D(layoutInflater, viewGroup, R.layout.item_appreciation_gift, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        C64803LiN liN = (C64803LiN) r4;
        C60604JoD joD = (C60604JoD) r5;
        AnonymousClass7TG.A1N(liN, joD);
        ConstraintLayout constraintLayout = joD.A00;
        constraintLayout.setSelected(liN.A05);
        constraintLayout.setContentDescription(liN.A02);
        2eS.A02(constraintLayout, joD.itemView.getResources().getString(2131953047));
        joD.A01.setText(liN.A04);
        LY8.A00(constraintLayout, 10, liN, this);
        joD.A02.setUrl(liN.A01, this.A01);
        Context A07 = DbS.A07(joD);
        C331897Sw r0 = C331897Sw.A0A;
        0qQ.A0A(A07);
        C331917Sy.A00(A07).A05(new C65338Lre(), liN.A00.getUrl());
    }

    public final Class modelClass() {
        return C64803LiN.class;
    }

    public C61632KFi(C63586KzZ kzZ, AnonymousClass0iw r2, UserSession userSession) {
        AnonymousClass7TG.A1P(userSession, kzZ);
        this.A02 = userSession;
        this.A01 = r2;
        this.A00 = kzZ;
    }
}
