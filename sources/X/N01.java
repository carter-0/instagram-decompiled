package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction;
import com.instagram.direct.reactions.tabbedreaction.model.DirectCustomReactionTabModel;
import java.util.List;

public final class N01 extends C14191TrW {
    public final Fragment A00;
    public final List A01;
    public final int A02;
    public final long A03;
    public final UserSession A04;
    public final C70458O7j A05;
    public final 2FW A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public final Fragment A03(int i) {
        DirectCountBasedReaction directCountBasedReaction;
        UserSession userSession = this.A04;
        List list = this.A01;
        String str = null;
        if (((DirectCustomReactionTabModel) list.get(i)).A01 == DirectCustomReactionTabModel.TabType.CUSTOM_EMOJI_TAB && (directCountBasedReaction = ((DirectCustomReactionTabModel) list.get(i)).A00) != null) {
            str = directCountBasedReaction.A01;
        }
        DirectCustomReactionTabModel.TabType tabType = ((DirectCustomReactionTabModel) list.get(i)).A01;
        String str2 = this.A09;
        String str3 = this.A08;
        String str4 = this.A07;
        long j = this.A03;
        2FW r5 = this.A06;
        int i2 = this.A02;
        C70458O7j o7j = this.A05;
        AnonymousClass7TF.A1C(userSession, 0, tabType);
        0qQ.A0B(r5, 8);
        NKD nkd = new NKD();
        nkd.A03 = o7j;
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("DirectFragment.DIRECT_TABBED_REACTION_EMOJI", str);
        A0a.putParcelable("DirectFragment.DIRECT_CUSTOM_REACTION_TAB_TYPE", tabType);
        A0a.putInt("OFFSCREEN_PAGE_LIMIT", i2);
        A0a.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_MESSAGE_ID", str3);
        A0a.putInt("TAB_POSITION", i);
        C66583MXo.A0t(A0a, r5, str4, j);
        A0a.putString("direct_emoji_thread_id", str2);
        AnonymousClass0Dg.A00(A0a, userSession);
        nkd.setArguments(A0a);
        return nkd;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public N01(Fragment fragment, UserSession userSession, C70458O7j o7j, 2FW r4, String str, String str2, String str3, List list, int i, long j) {
        super(fragment);
        AnonymousClass7TG.A1Q(list, userSession);
        this.A00 = fragment;
        this.A01 = list;
        this.A04 = userSession;
        this.A09 = str;
        this.A08 = str2;
        this.A07 = str3;
        this.A03 = j;
        this.A06 = r4;
        this.A02 = i;
        this.A05 = o7j;
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(-1006649875);
        int size = this.A01.size();
        AnonymousClass0fD.A0A(-712758032, A032);
        return size;
    }
}
