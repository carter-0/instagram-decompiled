package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import java.util.List;

public final class KGZ extends C232232tF {
    public final AnonymousClass0iw A00;
    public final 0sL A01;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        return new C60606JoF(DbU.A09(layoutInflater, viewGroup, R.layout.avatar_mentionable_friends_tray_layout, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r8, C249703kE r9) {
        C61152Jy3 jy3 = (C61152Jy3) r8;
        C60606JoF joF = (C60606JoF) r9;
        AnonymousClass7TF.A1H(jy3, joF);
        C62723KlN klN = jy3.A00;
        if (klN instanceof K3F) {
            DbS.A1T(joF.A02);
        } else if (klN instanceof K3D) {
            RecyclerView recyclerView = joF.A00;
            recyclerView.setVisibility(0);
            JTO.A1X(joF.A02);
            C60391Jkk jkk = recyclerView.A0A;
            if (jkk == null) {
                DbV.A1A(DbS.A07(joF), recyclerView);
                C60391Jkk jkk2 = new C60391Jkk(this.A00, this.A01);
                List list = ((K3D) klN).A00;
                0qQ.A0B(list, 0);
                DbW.A0z(jkk2, list, jkk2.A00);
                recyclerView.setAdapter(jkk2);
                return;
            }
            List list2 = jkk.A00;
            List list3 = ((K3D) klN).A00;
            if (!0qQ.A0K(list2, list3)) {
                C60391Jkk jkk3 = recyclerView.A0A;
                0qQ.A0C(jkk3, "null cannot be cast to non-null type com.instagram.avatars.mentions.adapter.AvatarsMentionableFriendsTrayAdapter");
                C60391Jkk jkk4 = jkk3;
                0qQ.A0B(list3, 0);
                DbW.A0z(jkk4, list3, jkk4.A00);
                recyclerView.A0o(0);
            }
        } else if (klN instanceof K3E) {
            JTO.A1X(joF.A02);
            joF.A01.setVisibility(0);
        } else {
            throw AnonymousClass7TE.A1K();
        }
    }

    public final Class modelClass() {
        return C61152Jy3.class;
    }

    public KGZ(AnonymousClass0iw r1, 0sL r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
