package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class H47 extends C231632rz {
    public final C55742Hmd A00;
    public final C229382nI A01;

    public final String getBinderGroupName() {
        return "Nudge";
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

    public final void onViewDetachedFromWindow(View view, int i, Object obj, Object obj2) {
        0qQ.A0B(view, 0);
        this.A00.A00.A04(view);
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r5, Object obj, Object obj2) {
        C270464gm r6 = (C270464gm) obj;
        C51973G9u.A1E(r5, r6, obj2);
        r5.A7V(0, r6, obj2);
        C55742Hmd hmd = this.A00;
        C229932oe r3 = hmd.A01;
        String str = r6.A06;
        0qQ.A07(str);
        r3.A01(DbU.A0a(hmd.A02, AnonymousClass30Y.A00(r6, obj2, str)), str);
    }

    public H47(C229382nI r1, C55742Hmd hmd) {
        this.A01 = r1;
        this.A00 = hmd;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(1185592021);
        AnonymousClass7TG.A1O(view, obj);
        C270464gm r6 = (C270464gm) obj;
        Object tag = view.getTag();
        if (tag != null) {
            C54978HaB.A00(this.A01, (C55722HmJ) tag, r6);
            AnonymousClass0fD.A0A(1757124378, A03);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A0A(-1489727396, A03);
        throw A0y;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(-347032625);
        View A0C = DbT.A0C(DbX.A0F(viewGroup, 1), viewGroup, R.layout.bloks_netego_feed_item);
        A0C.setTag(new C55722HmJ(viewGroup, A0C));
        AnonymousClass0fD.A0A(378930936, A03);
        return A0C;
    }

    public final void onViewAttachedToWindow(View view, int i, Object obj, Object obj2) {
        DbY.A1S(view, obj);
        C270464gm r6 = (C270464gm) obj;
        C55742Hmd hmd = this.A00;
        0qQ.A0B(r6, 0);
        2el r2 = hmd.A00;
        C229932oe r1 = hmd.A01;
        String str = r6.A06;
        0qQ.A07(str);
        r2.A05(view, r1.A00(str));
    }
}
