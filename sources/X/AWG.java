package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.List;

public final class AWG implements AnonymousClass2hV {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AWG(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C318046oG r1;
        C347017w8 r0;
        Drawable A04;
        switch (this.A00) {
            case 0:
                Number number = (Number) obj;
                if (number == null) {
                    return null;
                }
                C387569mQ r7 = (C387569mQ) this.A02;
                List list = (List) this.A01;
                int intValue = number.intValue();
                InteractiveDrawableContainer interactiveDrawableContainer = r7.A00;
                Drawable A0M = interactiveDrawableContainer.A0M(intValue);
                if (!(!(A0M instanceof C347017w8) || (r0 = (C347017w8) A0M) == null || (A04 = r0.A04()) == null)) {
                    A0M = A04;
                }
                if (((A0M instanceof C369908vW) || ((A0M instanceof C369768vI) && (r1 = ((C369768vI) A0M).A0M) != C318046oG.AVATAR_STATIC && r1 != C318046oG.AVATAR_ANIMATED)) && 00k.A0k(((C352168Bz) r7.A01.getValue()).A00).contains(number)) {
                    return null;
                }
                interactiveDrawableContainer.A0h(intValue, false);
                list.add(number);
                return null;
            case 1:
                Throwable th = (Throwable) obj;
                ((C2818659w) this.A01).A02(C11097S9y.A01(th));
                return th;
            default:
                Context context = (Context) this.A01;
                0nC.A00(context, (String) obj);
                C49118Eph.A00(context, (View) this.A02, (String) null, true);
                return null;
        }
    }
}
