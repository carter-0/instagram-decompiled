package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.profile.intf.UserDetailEntryInfo;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.E1c  reason: case insensitive filesystem */
public final class C47410E1c extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "FollowFromOtherAccountsFragment";
    public UserSession A00;
    public 1Xj A01;
    public C47572E8k A02;
    public UserDetailEntryInfo A03;
    public ProgressButton A04;
    public User A05;
    public String A06;
    public String A07;
    public String A08;
    public ListView A09;
    public final Map A0A = new ConcurrentHashMap();

    public final String getModuleName() {
        return "follow_from_other_accounts_fragment";
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1488841330);
        C47410E1c.super.onCreate(bundle);
        17k.A07(this.mArguments, "Fragment arguments cannot be null in FollowFromOtherAccountsFragment!");
        Object value = C227642jf.A02(this).getValue();
        17k.A07(value, "Usersession cannot be null in FollowFromOtherAccountsFragment!");
        this.A00 = (UserSession) value;
        this.A02 = new C47572E8k(this, this);
        ArrayList A012 = FFT.A01(this.A00, this.A05);
        C47572E8k e8k = this.A02;
        List<Object> list = e8k.A01;
        list.clear();
        Iterator it = A012.iterator();
        while (it.hasNext()) {
            list.add(new C49487EwS(DbT.A0k(it)));
        }
        e8k.A06();
        for (Object A082 : list) {
            e8k.A08(e8k.A00, A082);
        }
        e8k.A07();
        AnonymousClass0fD.A09(2003732060, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1288085557);
        View inflate = layoutInflater.inflate(R.layout.follow_from_other_accounts_bottom_sheet_layout, viewGroup, false);
        IgImageView A0b = DbT.A0b(inflate, R.id.displayed_user_avatar);
        User user = this.A05;
        if (user != null) {
            ImageUrl Bh3 = user.Bh3();
            0qQ.A0B(A0b, 0);
            A0b.setUrl(Bh3, this);
        }
        ListView listView = (ListView) inflate.requireViewById(R.id.list_view);
        this.A09 = listView;
        listView.setAdapter(this.A02);
        ProgressButton progressButton = (ProgressButton) inflate.requireViewById(R.id.follow_button);
        this.A04 = progressButton;
        FP3.A00(progressButton, 60, this);
        ProgressButton progressButton2 = this.A04;
        progressButton2.getClass();
        progressButton2.setEnabled(DbT.A1b(this.A02.A0C()));
        AnonymousClass0fD.A09(1911244168, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1333906008);
        super.onDestroyView();
        this.A09 = null;
        this.A04 = null;
        AnonymousClass0fD.A09(-393101080, A022);
    }
}
