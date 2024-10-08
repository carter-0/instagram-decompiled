package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.UeG  reason: case insensitive filesystem */
public final class C15527UeG extends C231632rz {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;

    public final int getViewTypeCount() {
        return 2;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r4, Object obj, Object obj2) {
        C61071Jw9 jw9 = (C61071Jw9) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, r4, jw9);
        int A0M = AnonymousClass7TE.A0M(jw9.A00);
        if (A0M == 0) {
            r4.A7U(0);
        } else if (A0M == A1U) {
            r4.A7U(A1U ? 1 : 0);
        } else {
            throw new RuntimeException();
        }
    }

    public C15527UeG(Context context, AnonymousClass0iw r2, UserSession userSession) {
        this.A00 = context;
        this.A01 = r2;
        this.A02 = userSession;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A04 = DbX.A04(view, 2078285879);
        0qQ.A0B(obj, 2);
        Context context = this.A00;
        AnonymousClass0iw r6 = this.A01;
        Object tag = view.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.business.promote.adtools.binder.AdToolsListViewBinder.Holder");
        C14873UDb uDb = (C14873UDb) tag;
        C61071Jw9 jw9 = (C61071Jw9) obj;
        UserSession userSession = this.A02;
        boolean A1U = AnonymousClass7TF.A1U(0, context, r6);
        AnonymousClass7TG.A0w(2, uDb, jw9, userSession);
        int A0M = AnonymousClass7TE.A0M(jw9.A00);
        if (A0M == 0) {
            DbT.A18(context, uDb.A02, 2131970147);
            TextView textView = uDb.A03;
            textView.setVisibility(DbW.A01(jw9.A02 ? 1 : 0));
            AnonymousClass0fU.A00((View.OnClickListener) jw9.A04, textView);
        } else if (A0M == A1U) {
            uDb.A02.setVisibility(8);
            uDb.A01.setVisibility(0);
            uDb.A00.setVisibility(8);
        } else {
            throw new RuntimeException();
        }
        RecyclerView recyclerView = uDb.A04;
        recyclerView.A15(new C53096GiU(A1U ? 1 : 0, jw9, uDb, userSession));
        VAD.A00(jw9, uDb, userSession);
        U9z u9z = recyclerView.A0A;
        if (u9z == null) {
            U9z u9z2 = new U9z(context, r6, userSession, (Integer) jw9.A00);
            List list = (List) jw9.A01;
            0qQ.A0B(list, 0);
            if (!list.equals(u9z2.A00)) {
                u9z2.A00 = list;
                u9z2.notifyDataSetChanged();
            }
            recyclerView.setAdapter(u9z2);
        } else {
            List list2 = (List) jw9.A01;
            0qQ.A0B(list2, 0);
            if (C51966G9m.A1a(u9z.A00, list2)) {
                if (!list2.equals(u9z.A00)) {
                    u9z.A00 = list2;
                    u9z.notifyDataSetChanged();
                }
                recyclerView.A0o(0);
            } else {
                u9z.notifyDataSetChanged();
            }
        }
        AnonymousClass0fD.A0A(-1121455550, A04);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        LinearLayoutManager linearLayoutManager;
        int A03 = AnonymousClass0fD.A03(943249331);
        0qQ.A0B(viewGroup, 1);
        Context context = this.A00;
        View A09 = DbU.A09(DbT.A0B(context), viewGroup, R.layout.promote_ad_tools_highlights_hub_container, false);
        C14873UDb uDb = new C14873UDb(A09);
        A09.setTag(uDb);
        if (i != 0) {
            linearLayoutManager = new LinearLayoutManager(context, 0, false);
        }
        RecyclerView recyclerView = uDb.A04;
        recyclerView.setLayoutManager(linearLayoutManager);
        try {
            JTP.A1D(recyclerView, context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap), AnonymousClass7TF.A02(context, R.dimen.account_discovery_bottom_gap));
        } catch (Resources.NotFoundException unused) {
            recyclerView.A11(new AnonymousClass3V7(12, 12));
        }
        C238133Ar A002 = C238103Ao.A00(recyclerView);
        0qQ.A0C(A002, "null cannot be cast to non-null type com.instagram.migration.scrollingviewproxy.RefreshableScrollingViewProxy<*>");
        ((C238143As) A002).ARa();
        AnonymousClass0fD.A0A(667823986, A03);
        return A09;
    }
}
