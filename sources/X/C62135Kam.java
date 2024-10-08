package X;

import android.content.Context;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import instagram.features.stories.fragment.ReelMoreOptionsFragment;
import java.util.List;

/* renamed from: X.Kam  reason: case insensitive filesystem */
public final class C62135Kam extends C68504NKx {
    public final /* synthetic */ ReelMoreOptionsFragment A00;

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == -3) {
            int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            ReelMoreOptionsFragment reelMoreOptionsFragment = this.A00;
            C62939Kor kor = reelMoreOptionsFragment.A06;
            kor.getClass();
            return new C249703kE(kor.A02(reelMoreOptionsFragment.requireContext(), viewGroup));
        } else if (i != -2) {
            return super.onCreateViewHolder(viewGroup, i);
        } else {
            int i3 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            ReelMoreOptionsFragment reelMoreOptionsFragment2 = this.A00;
            C62939Kor kor2 = reelMoreOptionsFragment2.A05;
            kor2.getClass();
            return new C249703kE(kor2.A02(reelMoreOptionsFragment2.requireContext(), viewGroup));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62135Kam(Context context, AnonymousClass0iw r2, 0lg r3, ReelMoreOptionsFragment reelMoreOptionsFragment) {
        super(context, r3, r2);
        this.A00 = reelMoreOptionsFragment;
    }

    public final int getItemViewType(int i) {
        int itemViewType;
        int i2;
        int A03 = AnonymousClass0fD.A03(1061781676);
        Object item = getItem(i);
        if (item instanceof C62127Kad) {
            itemViewType = -2;
            i2 = -1910746502;
        } else if (item instanceof C62126Kac) {
            itemViewType = -3;
            i2 = 868380927;
        } else {
            itemViewType = super.getItemViewType(i);
            i2 = 22269046;
        }
        AnonymousClass0fD.A0A(i2, A03);
        return itemViewType;
    }

    public final int getViewTypeCount() {
        return super.getViewTypeCount() + 3;
    }

    public final void onBindViewHolder(C249703kE r7, int i) {
        int itemViewType = getItemViewType(i);
        if (itemViewType == -3) {
            getItem(i);
            Object obj = null;
            obj.getClass();
            throw AnonymousClass00P.createAndThrow();
        } else if (itemViewType != -2) {
            super.onBindViewHolder(r7, i);
        } else {
            C62127Kad kad = (C62127Kad) getItem(i);
            List list = kad.A06;
            list.getClass();
            Integer num = AnonymousClass05K.A0C;
            Integer num2 = kad.A05;
            if (!num.equals(num2) && !AnonymousClass05K.A01.equals(num2)) {
                C62127Kad.A01(kad, AnonymousClass05K.A00, false);
                kad.A02.setVisibility(0);
                L2L l2l = kad.A09;
                UserSession userSession = kad.A08;
                KAR kar = new KAR(6, l2l, kad.A07, userSession);
                1NY A0L = DbZ.A0L(userSession);
                A0L.A0A("creatives/camera_graphql/");
                A0L.A9m("query_id", "2253728161315083");
                A0L.A0Q(CF8.class, D0Z.class);
                1OC A0U = DbT.A0U(A0L, true);
                A0U.A00 = kar;
                1ES.A03(A0U);
            } else if (kad.A06.isEmpty()) {
                C62127Kad.A01(kad, num, false);
            } else {
                C62127Kad.A01(kad, num, true);
                C60401Jku jku = kad.A04;
                jku.A01 = list;
                jku.notifyDataSetChanged();
                C62127Kad.A00(kad);
            }
        }
    }
}
