package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.igds.components.peoplecell.IgdsPeopleCell;
import com.instagram.user.model.User;

public final class EH0 extends C232232tF {
    public final /* synthetic */ C47514E5x A00;

    public EH0(C47514E5x e5x) {
        this.A00 = e5x;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r7, C249703kE r8) {
        FYB fyb = (FYB) r7;
        C46947Do1 do1 = (C46947Do1) r8;
        AnonymousClass7TG.A1N(fyb, do1);
        IgdsPeopleCell igdsPeopleCell = do1.A00;
        igdsPeopleCell.A01();
        User user = fyb.A00;
        igdsPeopleCell.A08(user.getUsername(), false);
        igdsPeopleCell.A07(user.getFullName());
        C47514E5x e5x = do1.A01;
        igdsPeopleCell.A03(AnonymousClass7TE.A0l(e5x.A04), new C49550Exl(e5x, user), (User) null);
        igdsPeopleCell.A07.setVisibility(DbW.A01(C308436Ug.A02(user) ? 1 : 0));
    }

    public final Class modelClass() {
        return FYB.class;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        DbS.A1W(viewGroup);
        return new C46947Do1(new IgdsPeopleCell(AnonymousClass7TE.A0S(viewGroup), true), this.A00);
    }
}
