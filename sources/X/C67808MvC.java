package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.loadmore.LoadMoreButton;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.MvC  reason: case insensitive filesystem */
public final class C67808MvC extends 2Rw {
    public List A00 = AnonymousClass7TE.A1C();
    public boolean A01;
    public final AnonymousClass0iw A02;
    public final PRX A03;
    public final AnonymousClass2f1 A04;
    public final C229122ms A05;

    /* JADX WARNING: type inference failed for: r2v0, types: [X.3kE, X.Mw0] */
    /* JADX WARNING: type inference failed for: r2v1, types: [X.3kE, X.Mw1] */
    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        if (i != 0) {
            View A002 = LoadMoreButton.A00(viewGroup.getContext(), R.layout.thread_message_load_more_empty, viewGroup);
            ? r2 = new C249703kE(A002);
            r2.A00 = (LoadMoreButton) AnonymousClass7TE.A0b(A002, R.id.row_load_more_button);
            return r2;
        }
        View A003 = F8B.A00(viewGroup);
        ? r22 = new C249703kE(A003);
        Object tag = A003.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.user.userlist.adapter.SelectableUserBinder.UserRowWithCheckboxHolder");
        r22.A00 = (C46974DoS) tag;
        return r22;
    }

    public final void onBindViewHolder(C249703kE r19, int i) {
        String str;
        String fullName;
        C249703kE r6 = r19;
        0qQ.A0B(r6, 0);
        if (r6 instanceof C67856Mw0) {
            Context A07 = DbS.A07(r6);
            User user = (User) this.A00.get(i);
            PRX prx = this.A03;
            NJ6 nj6 = prx.A00;
            nj6.A02.getClass();
            Object obj = nj6.A02.A03.get(user.getId());
            if (this.A04.A0N(user) == FollowStatus.A05) {
                str = A07.getString(2131962634);
            } else {
                str = null;
            }
            C46974DoS doS = ((C67856Mw0) r6).A00;
            String username = user.getUsername();
            if (obj != null) {
                fullName = DbW.A0h(A07, obj, 2131972249);
            } else {
                fullName = user.getFullName();
            }
            F06 f06 = new F06(user, username, fullName, str, nj6.A0C.contains(user));
            AnonymousClass0iw r62 = this.A02;
            0qQ.A0B(doS, 0);
            F8B.A01((Context) null, r62, prx, doS, f06, true, false, false);
        } else if (r6 instanceof C67857Mw1) {
            ((C67857Mw1) r6).A00.A03(this.A05, (C230682q1) null);
        }
    }

    public C67808MvC(AnonymousClass0iw r2, UserSession userSession, PRX prx, C229122ms r5) {
        AnonymousClass7TG.A1U(userSession, r5, prx);
        this.A05 = r5;
        this.A03 = prx;
        this.A02 = r2;
        this.A04 = AnonymousClass2f1.A00(userSession);
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(-188002636);
        int size = this.A00.size() + (this.A01 ? 1 : 0);
        AnonymousClass0fD.A0A(-1767617751, A032);
        return size;
    }

    public final int getItemViewType(int i) {
        int A032 = AnonymousClass0fD.A03(-1425456461);
        int i2 = 1;
        if (i < this.A00.size()) {
            i2 = 0;
        }
        AnonymousClass0fD.A0A(636604919, A032);
        return i2;
    }
}
