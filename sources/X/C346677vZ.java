package X;

import com.instagram.closefriends.audiencelists.model.AudienceListViewModel;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.7vZ  reason: invalid class name and case insensitive filesystem */
public final class C346677vZ {
    public int A00;
    public long A01;
    public C346687va A02;
    public boolean A03;
    public final UserSession A04;

    public C346677vZ(UserSession userSession) {
        C346687va r4;
        List list;
        0qQ.A0B(userSession, 1);
        this.A04 = userSession;
        this.A00 = 1Au.A00(userSession).A01.getInt("story_audience_lists_count", 0);
        this.A03 = 1Au.A00(userSession).A01.getBoolean("has_fetched_audience_lists_share_info", false);
        this.A01 = 1Au.A00(userSession).A01.getLong("last_fetched_audience_lists_share_info_timestamp_ms", 0);
        0xa r3 = 1Au.A00(this.A04).A01;
        String string = r3.getString("last_used_audience_list_id", (String) null);
        String string2 = r3.getString("last_used_audience_list_name", (String) null);
        if (string == null || string2 == null) {
            r4 = null;
        } else {
            int i = r3.getInt("last_used_audience_list_member_count", 0);
            Set stringSet = r3.getStringSet("last_used_audience_list_social_context_members", (Set) null);
            if (stringSet != null) {
                list = 00k.A0a(stringSet);
            } else {
                list = 0sn.A00;
            }
            r4 = new C346687va(string, string2, list, i, r3.getBoolean("last_used_audience_list_is_default", true), r3.getBoolean("last_used_audience_list_is_named", false));
        }
        this.A02 = r4;
    }

    public final void A03(String str, String str2, List list, int i, boolean z, boolean z2) {
        C346687va r3;
        List list2 = list;
        if (list == null) {
            list2 = new ArrayList();
        }
        String str3 = str;
        String str4 = str2;
        int i2 = i;
        boolean z3 = z;
        boolean z4 = z2;
        if (str == null || str2 == null) {
            r3 = null;
        } else {
            r3 = new C346687va(str3, str4, list2, i2, z3, z4);
        }
        this.A02 = r3;
        0xa r32 = 1Au.A00(this.A04).A01;
        0xY AR4 = r32.AR4();
        AR4.E5g("last_used_audience_list_id", str);
        AR4.apply();
        0xY AR42 = r32.AR4();
        AR42.E5g("last_used_audience_list_name", str2);
        AR42.apply();
        0xY AR43 = r32.AR4();
        AR43.E5Z("last_used_audience_list_member_count", i);
        AR43.apply();
        List A0X = 00k.A0X(list2);
        0xY AR44 = r32.AR4();
        AR44.E5h("last_used_audience_list_social_context_members", 00k.A0k(A0X));
        AR44.apply();
        0xY AR45 = r32.AR4();
        AR45.E5T("last_used_audience_list_is_default", z);
        AR45.apply();
        0xY AR46 = r32.AR4();
        AR46.E5T("last_used_audience_list_is_named", z4);
        AR46.apply();
    }

    public final void A01(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            1Av A002 = 1Au.A00(this.A04);
            int i2 = this.A00;
            0xY AR4 = A002.A01.AR4();
            AR4.E5Z("story_audience_lists_count", i2);
            AR4.apply();
        }
    }

    public final void A02(AudienceListViewModel audienceListViewModel) {
        List<User> list = audienceListViewModel.A03;
        ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
        for (User Bh3 : list) {
            arrayList.add(Bh3.Bh3().getUrl());
        }
        A03(audienceListViewModel.A01, audienceListViewModel.A02, arrayList, audienceListViewModel.A00, audienceListViewModel.A05, audienceListViewModel.A06);
    }

    public final void A00() {
        this.A01 = System.currentTimeMillis();
        1Av A002 = 1Au.A00(this.A04);
        long j = this.A01;
        0xY AR4 = A002.A01.AR4();
        AR4.E5c("last_fetched_audience_lists_share_info_timestamp_ms", j);
        AR4.apply();
    }
}
