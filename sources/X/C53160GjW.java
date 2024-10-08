package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.feed.su.model.MiddleStateCardUser;
import java.util.List;

/* renamed from: X.GjW  reason: case insensitive filesystem */
public final class C53160GjW extends C14191TrW {
    public final int A00;
    public final int A01;
    public final UserSession A02;
    public final String A03;
    public final String A04;
    public final List A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53160GjW(Fragment fragment, UserSession userSession, String str, String str2, List list, int i, int i2) {
        super(fragment);
        0qQ.A0B(userSession, 2);
        this.A02 = userSession;
        this.A05 = list;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = str;
        this.A03 = str2;
    }

    public final Fragment A03(int i) {
        H09 h09 = new H09();
        Bundle A0a = AnonymousClass7TE.A0a();
        DbU.A1D(A0a, this.A02);
        A0a.putParcelable("ARG_MIDDLE_STATE_CARD_USER", (MiddleStateCardUser) this.A05.get(i));
        A0a.putInt("ARG_INITIAL_NAVIGATION_BAR_COLOR", this.A00);
        A0a.putInt("ARG_ITEM_POSITION", i);
        A0a.putInt(C66579MXk.A00(86), this.A01);
        A0a.putString(C66579MXk.A00(85), this.A04);
        A0a.putString(C66579MXk.A00(84), this.A03);
        h09.setArguments(A0a);
        return h09;
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(-1592348440);
        int size = this.A05.size();
        AnonymousClass0fD.A0A(-1344242682, A032);
        return size;
    }
}
