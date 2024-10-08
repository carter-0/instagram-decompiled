package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.EhJ  reason: case insensitive filesystem */
public abstract class C48610EhJ {
    public static final Object A00(C307896Rx r23, AnonymousClass6Tm r24) {
        AnonymousClass6Tm r2 = r24;
        Object A03 = r2.A03(0);
        Object A0q = DbT.A0q(r2, DbS.A0p(A03), 1);
        List list = r2.A00;
        Object obj = list.get(2);
        String A0d = Dba.A0d(list);
        UserSession A0Z = DbT.A0Z(r23);
        Bundle A00 = Q21.A00(AnonymousClass7TE.A1L("IgSessionManager.SESSION_TOKEN_KEY", A0Z.A05), AnonymousClass7TE.A1L("FollowListFragment.EntryType", AnonymousClass05K.A0u), AnonymousClass7TE.A1L("FollowListFragment.FollowListData", C46451DfE.A00(C46443Df5.GROUP_FOLLOWING, DbT.A0j(A0Z).getId(), (String) null, false)), AnonymousClass7TE.A1L("FollowListFragment.DisplayOnlyMutual", false), AnonymousClass7TE.A1L("FollowListFragment.Group", A03), AnonymousClass7TE.A1L("FollowListFragment.GroupTitle", A0q), AnonymousClass7TE.A1L("FollowListFragment.ShowSearchBar", false), AnonymousClass7TE.A1L("FollowListFragment.GroupSubtitle", obj), AnonymousClass7TE.A1L("FollowListFragment.UserCount", 0), AnonymousClass7TE.A1L("FollowListFragment.AllowActionBarBulkManage", true), AnonymousClass7TE.A1L("FollowListFragment.ShouldHideMoreOptionsMenu", true));
        if (!(A0d == null || A0d.length() == 0)) {
            A00.putString("FollowListFragment.Category", A0d);
        }
        C309516Yo A0Q = DbU.A0Q(C308206Td.A04(r23), A0Z);
        C46339Dch.A00();
        DbW.A0y(A00, new C46430Der(), A0Q);
        return null;
    }
}
