package X;

import android.view.View;
import com.instagram.actionbar.ActionBarTitleViewSwitcher;

public final class HCB extends C249383je implements C13907Tl7 {
    public int A00 = -1;
    public int A01 = -1;
    public final ActionBarTitleViewSwitcher A02;

    public final /* synthetic */ void onCreate(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onDestroy(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onPause(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onStart(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onStop(AnonymousClass07Z r1) {
    }

    private final void A00() {
        int i = this.A00;
        if (i == -1 || this.A01 < i) {
            ActionBarTitleViewSwitcher actionBarTitleViewSwitcher = this.A02;
            if (actionBarTitleViewSwitcher.getDisplayedChild() != 0) {
                actionBarTitleViewSwitcher.A03((String) null, (String) null, false, false);
                return;
            }
            return;
        }
        A01(this);
    }

    public static final void A01(HCB hcb) {
        ActionBarTitleViewSwitcher actionBarTitleViewSwitcher = hcb.A02;
        if (actionBarTitleViewSwitcher.getDisplayedChild() != actionBarTitleViewSwitcher.A0H) {
            actionBarTitleViewSwitcher.A04(false, false, (String) null);
        }
    }

    public HCB(ActionBarTitleViewSwitcher actionBarTitleViewSwitcher) {
        this.A02 = actionBarTitleViewSwitcher;
    }

    public final void onScroll(C238133Ar r5, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int A0D = AnonymousClass7TG.A0D(r5, -870744704);
        View AnE = r5.AnE(i);
        if (AnE != null && AnE.getTop() < 0 && Math.abs(AnE.getTop()) > AnE.getBottom()) {
            i++;
        }
        int i7 = this.A01;
        if (i == i7) {
            i6 = -242732352;
        } else {
            this.A01 = i;
            if (i7 == -1 || i7 > i) {
                A00();
            } else if (i == this.A00) {
                A01(this);
            } else {
                ActionBarTitleViewSwitcher actionBarTitleViewSwitcher = this.A02;
                int displayedChild = actionBarTitleViewSwitcher.getDisplayedChild();
                int i8 = actionBarTitleViewSwitcher.A0G;
                if (displayedChild != i8) {
                    actionBarTitleViewSwitcher.setDisplayedChild(i8);
                }
            }
            i6 = -1121639809;
        }
        AnonymousClass0fD.A0A(i6, A0D);
    }

    public final void onResume(AnonymousClass07Z r1) {
        A00();
    }
}
