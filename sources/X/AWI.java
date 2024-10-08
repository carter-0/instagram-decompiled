package X;

import android.graphics.drawable.Drawable;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.List;

public final class AWI implements AnonymousClass2hV {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C40293AZi A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    public AWI(C40293AZi aZi, List list, List list2, int i, boolean z, boolean z2) {
        this.A01 = aZi;
        this.A00 = i;
        this.A02 = list;
        this.A04 = z;
        this.A05 = z2;
        this.A03 = list2;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            return null;
        }
        C40293AZi aZi = this.A01;
        int i = this.A00;
        List list = this.A02;
        boolean z = this.A04;
        boolean z2 = this.A05;
        List list2 = this.A03;
        InteractiveDrawableContainer interactiveDrawableContainer = aZi.A00;
        int intValue = number.intValue();
        Drawable A0M = interactiveDrawableContainer.A0M(intValue);
        AHO.A00(A0M);
        if (i >= 0) {
            AnonymousClass5MJ A022 = AnonymousClass9SF.A02(A0M);
            if (A022 != null) {
                A022.EXC(i, A022.getDurationInMs());
            }
            C321056tV A002 = AnonymousClass9SF.A00(A0M);
            if (A002 instanceof C321016tR) {
                C321016tR r13 = (C321016tR) A002;
                long AzG = r13.AzG();
                C20997X8u x8u = r13.A0A;
                if (x8u != null) {
                    x8u.EL4((int) (((long) i) % AzG), C321016tR.A02(r13, x8u));
                }
            }
        }
        if ((A0M instanceof C389629pw) && ((C389629pw) A0M).A03) {
            0qQ.A0C(A0M, "null cannot be cast to non-null type com.instagram.reels.countdown.view.CountdownStickerDrawable");
            list.add(A0M);
        }
        if (AHO.A02(A0M, z, z2)) {
            return null;
        }
        interactiveDrawableContainer.A0h(intValue, false);
        list2.add(number);
        return null;
    }
}
