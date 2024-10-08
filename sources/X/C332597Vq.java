package X;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.7Vq  reason: invalid class name and case insensitive filesystem */
public final class C332597Vq implements 1wn {
    public final /* synthetic */ C332567Vn A00;

    public C332597Vq(C332567Vn r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(744053605);
        AY2 ay2 = (AY2) obj;
        int A032 = AnonymousClass0fD.A03(-229884566);
        0qQ.A0B(ay2, 0);
        Integer num = ay2.A00;
        if (num != null && num.intValue() == 475) {
            C332567Vn r3 = this.A00;
            FragmentActivity activity = r3.A02.getActivity();
            if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
                C358248ab r2 = new C358248ab((Activity) activity);
                r2.A09(2131954911);
                r2.A08(2131954910);
                r2.A06();
                r2.A0G(new AKB(r3), 2131954909);
                AnonymousClass0fN.A00(r2.A02());
            }
        }
        AnonymousClass0fD.A0A(-1744177042, A032);
        AnonymousClass0fD.A0A(1775226403, A03);
    }
}
