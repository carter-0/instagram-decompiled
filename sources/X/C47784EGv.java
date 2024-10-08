package X;

import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.api.schemas.FanClubCategoryType;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.igds.components.peoplecell.IgdsPeopleCell;
import com.instagram.ui.widget.stackedavatar.StackedAvatarView;
import com.instagram.user.model.User;

/* renamed from: X.EGv  reason: case insensitive filesystem */
public final class C47784EGv extends C232232tF {
    public final C51872G5j A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C46912DnS(new IgdsPeopleCell(AnonymousClass7TE.A0S(viewGroup), (AttributeSet) null, 0, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r11, C249703kE r12) {
        FYJ fyj = (FYJ) r11;
        C46912DnS dnS = (C46912DnS) r12;
        AnonymousClass7TG.A1N(fyj, dnS);
        FanClubCategoryType fanClubCategoryType = fyj.A00;
        String str = fyj.A04;
        String str2 = fyj.A03;
        User user = fyj.A02;
        User user2 = fyj.A01;
        C51872G5j g5j = this.A00;
        0qQ.A0B(g5j, 5);
        IgdsPeopleCell igdsPeopleCell = dnS.A00;
        igdsPeopleCell.A08(str, false);
        igdsPeopleCell.A07(str2);
        ImageUrl Bh3 = user.Bh3();
        ImageUrl Bh32 = user2.Bh3();
        StackedAvatarView stackedAvatarView = igdsPeopleCell.A09;
        stackedAvatarView.setVisibility(0);
        stackedAvatarView.setUrls(Bh3, Bh32, igdsPeopleCell);
        stackedAvatarView.setOnClickListener((View.OnClickListener) null);
        igdsPeopleCell.A08.setVisibility(8);
        AnonymousClass0fU.A00(new C50072FNn(fanClubCategoryType, g5j, str, 3), igdsPeopleCell);
    }

    public final Class modelClass() {
        return FYJ.class;
    }

    public C47784EGv(C51872G5j g5j) {
        this.A00 = g5j;
    }
}
