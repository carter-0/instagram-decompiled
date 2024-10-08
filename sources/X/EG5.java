package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.button.IgdsRadioButton;
import com.instagram.igds.components.peoplecell.IgdsPeopleCell;

public final class EG5 extends C232222tE {
    public final AnonymousClass4DH A00;
    public final UserSession A01;

    public EG5(AnonymousClass4DH r2, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        Context context = viewGroup.getContext();
        0qQ.A0A(context);
        IgdsRadioButton igdsRadioButton = new IgdsRadioButton(context);
        igdsRadioButton.setBackgroundResource(R.drawable.radio_button_state_selector);
        IgdsPeopleCell igdsPeopleCell = new IgdsPeopleCell(context, (AttributeSet) null, 0, false);
        igdsPeopleCell.A05(igdsRadioButton, (AnonymousClass3Z5) null);
        return new C46941Dnv(igdsRadioButton, igdsPeopleCell);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r2, C249703kE r3) {
        throw AnonymousClass7TE.A11("getUser");
    }

    public final Class modelClass() {
        return C50313FXs.class;
    }
}
