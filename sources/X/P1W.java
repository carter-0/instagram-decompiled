package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.google.common.collect.ImmutableList;
import com.instagram.modal.ModalActivity;
import com.instagram.model.direct.DirectMessageSearchMessage;
import com.instagram.model.direct.DirectMessageSearchThread;
import com.instagram.model.direct.DirectSearchResult;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.Collection;
import java.util.Iterator;

public final class P1W implements C74448Pv3 {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C71874OsH A01;

    public final void DfX(View view, DirectSearchResult directSearchResult, int i, int i2, int i3, int i4) {
        View view2 = view;
        if (view != null) {
            this.A01.A0I.DpB(view2, (C67058MhZ) null, directSearchResult, "inbox_search", 25, i, i2, i4, false);
        }
    }

    public P1W(Activity activity, C71874OsH osH) {
        this.A01 = osH;
        this.A00 = activity;
    }

    public final void DRl(DirectMessageSearchMessage directMessageSearchMessage, int i, int i2, int i3, int i4) {
        C254783t2 A0j;
        C71874OsH osH = this.A01;
        osH.A0I.Dk6((C67058MhZ) null, directMessageSearchMessage, "inbox_search", i, i2, i3, i4, 25);
        if (!directMessageSearchMessage.A00()) {
            C72200OyM A002 = C72200OyM.A00(osH.A0D);
            A002.A05(osH.A0F.A06, "thread_deeplinking", "integrated_message_search", false);
            String A03 = osH.A03();
            String str = directMessageSearchMessage.A0A;
            A002.A04(A03, str, "thread_deeplinking", directMessageSearchMessage.A02);
            A002.A03(osH.A03(), str);
        }
        Activity activity = this.A00;
        String str2 = directMessageSearchMessage.A0A;
        if (str2.equals("secure_group") || str2.equals("secure_one_to_one")) {
            A0j = C66580MXl.A0j((Long) null, Long.parseLong(directMessageSearchMessage.A09));
        } else {
            A0j = C66580MXl.A0g(directMessageSearchMessage.A09);
        }
        C66584MXp.A0h(activity, osH, osH.A0D, directMessageSearchMessage, A0j);
    }

    public final void DRr(DirectMessageSearchThread directMessageSearchThread, int i, int i2, int i3, int i4) {
        C71874OsH osH = this.A01;
        int i5 = i3;
        osH.A0I.Dk6((C67058MhZ) null, directMessageSearchThread, "inbox_search", i, i2, i5, i4, 25);
        ImmutableList immutableList = directMessageSearchThread.A03;
        if (!(immutableList instanceof Collection) || !immutableList.isEmpty()) {
            Iterator it = immutableList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                PendingRecipient A0k = C66580MXl.A0k(it);
                0qQ.A0A(A0k);
                if (A0k.A02 == 1) {
                    break;
                }
            }
            Bundle A0a = AnonymousClass7TE.A0a();
            A0a.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_ID", directMessageSearchThread.A08);
            A0a.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_NAME", directMessageSearchThread.A09);
            A0a.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_QUERY", osH.A03());
            A0a.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_TYPE", directMessageSearchThread.A0A);
            A0a.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_CATEGORY", directMessageSearchThread.A07);
            A0a.putInt("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_SEE_ALL_SECTION_RANK_INDEX", i5);
            DbV.A0Y(this.A00, A0a, osH.A0D, ModalActivity.class, "direct_message_search_message_list_fragment").A0C(osH.A07);
        }
        C72200OyM A002 = C72200OyM.A00(osH.A0D);
        A002.A05(osH.A0F.A06, "message_list", "integrated_message_search", false);
        A002.A03(osH.A03(), directMessageSearchThread.A0A);
        Bundle A0a2 = AnonymousClass7TE.A0a();
        A0a2.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_ID", directMessageSearchThread.A08);
        A0a2.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_NAME", directMessageSearchThread.A09);
        A0a2.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_QUERY", osH.A03());
        A0a2.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_TYPE", directMessageSearchThread.A0A);
        A0a2.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_CATEGORY", directMessageSearchThread.A07);
        A0a2.putInt("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_SEE_ALL_SECTION_RANK_INDEX", i5);
        DbV.A0Y(this.A00, A0a2, osH.A0D, ModalActivity.class, "direct_message_search_message_list_fragment").A0C(osH.A07);
    }
}
