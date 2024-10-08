package X;

import com.instagram.common.recyclerview.ViewModelListUpdate;
import java.util.List;

/* renamed from: X.Pwd  reason: case insensitive filesystem */
public interface C74544Pwd {
    Integer Bz7();

    void CgL();

    void EIC(String str);

    void onDestroy();

    static void A00(C68488NKh nKh, C74544Pwd pwd, String str) {
        pwd.EIC(str);
        nKh.A0E.clear();
        ViewModelListUpdate viewModelListUpdate = new ViewModelListUpdate();
        nKh.A02 = viewModelListUpdate;
        nKh.A01.A05(viewModelListUpdate);
        C46445Df7.A00(nKh.mView, true);
        C74544Pwd pwd2 = nKh.A04;
        if (pwd2 != null) {
            pwd2.CgL();
        } else {
            C68488NKh.A00(nKh, (List) null);
        }
    }
}
