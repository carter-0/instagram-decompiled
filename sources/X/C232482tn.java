package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.LithoView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.2tn  reason: invalid class name and case insensitive filesystem */
public final class C232482tn extends C231632rz {
    public final C232492to A00;
    public final C230072os A01;
    public final boolean A02;
    public final C229382nI A03;

    public C232482tn(Context context, AnonymousClass07Z r3, C229382nI r4, UserSession userSession, C230072os r6) {
        0qQ.A0B(context, 1);
        0qQ.A0B(r4, 3);
        0qQ.A0B(r6, 4);
        0qQ.A0B(r3, 5);
        this.A03 = r4;
        this.A01 = r6;
        this.A00 = new C232492to(context, r3, r4, userSession);
        this.A02 = C231492rl.A00(userSession).A0T;
    }

    public final String getBinderGroupName() {
        return "BloksNetego";
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        0qQ.A0B(obj, 1);
        return ((C270464gm) obj).A06.hashCode();
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r3, Object obj, Object obj2) {
        C270464gm r4 = (C270464gm) obj;
        GY3 gy3 = (GY3) obj2;
        0qQ.A0B(r3, 0);
        0qQ.A0B(r4, 1);
        0qQ.A0B(gy3, 2);
        r3.A7V(0, r4, gy3);
        this.A01.A9R(r4, gy3);
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A032 = AnonymousClass0fD.A03(1188761350);
        0qQ.A0B(view, 1);
        0qQ.A0B(obj, 2);
        C270464gm r12 = (C270464gm) obj;
        if (this.A02) {
            String str = r12.A06;
            0qQ.A07(str);
            this.A00.A05((LithoView) view, str, C298995uP.A00, new C377409Ls(3, r12, this), C299005uQ.A00);
        } else {
            Object tag = view.getTag();
            0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.feed.adapter.row.bloks.BloksNetegoViewBinder.Holder");
            C54978HaB.A00(this.A03, (C55722HmJ) tag, r12);
        }
        this.A01.EBq(view, r12);
        AnonymousClass0fD.A0A(1892454465, A032);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        LithoView inflate;
        int A032 = AnonymousClass0fD.A03(-1015931175);
        0qQ.A0B(viewGroup, 1);
        if (this.A02) {
            inflate = this.A00.A03();
        } else {
            inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bloks_netego_feed_item, viewGroup, false);
            inflate.setTag(new C55722HmJ(viewGroup, inflate));
            0qQ.A0A(inflate);
        }
        AnonymousClass0fD.A0A(-1797570672, A032);
        return inflate;
    }
}
