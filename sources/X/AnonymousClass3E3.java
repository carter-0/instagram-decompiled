package X;

import android.content.Context;
import com.instagram.actionbar.ActionBarTitleViewSwitcher;

/* renamed from: X.3E3  reason: invalid class name */
public final class AnonymousClass3E3 extends C249383je implements C13907Tl7 {
    public ActionBarTitleViewSwitcher A00;
    public final float A01;
    public final Context A02;
    public final C238133Ar A03;

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
        ActionBarTitleViewSwitcher actionBarTitleViewSwitcher;
        ActionBarTitleViewSwitcher actionBarTitleViewSwitcher2 = this.A00;
        if (actionBarTitleViewSwitcher2 != null && actionBarTitleViewSwitcher2.getDisplayedChild() == 0 && C227752jr.A02(this.A03, this.A01) && (actionBarTitleViewSwitcher = this.A00) != null) {
            actionBarTitleViewSwitcher.A04(false, true, this.A02.getString(2131962337));
        }
    }

    private final boolean A01() {
        ActionBarTitleViewSwitcher actionBarTitleViewSwitcher = this.A00;
        if (actionBarTitleViewSwitcher == null || actionBarTitleViewSwitcher.getDisplayedChild() == 0 || C227752jr.A02(this.A03, this.A01)) {
            return false;
        }
        ActionBarTitleViewSwitcher actionBarTitleViewSwitcher2 = this.A00;
        if (actionBarTitleViewSwitcher2 != null) {
            actionBarTitleViewSwitcher2.A03((String) null, (String) null, false, false);
        }
        return true;
    }

    public final void onResume(AnonymousClass07Z r2) {
        if (this.A00 != null) {
            A00();
        }
    }

    public AnonymousClass3E3(Context context, C238133Ar r2, float f) {
        this.A02 = context;
        this.A01 = f;
        this.A03 = r2;
    }

    public final void onScroll(C238133Ar r3, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int A032 = AnonymousClass0fD.A03(1740453935);
        if (this.A00 == null) {
            i6 = 2135639924;
        } else {
            if (i5 < 0) {
                A01();
            } else if (i5 != 0 || !A01()) {
                A00();
            }
            i6 = 944900827;
        }
        AnonymousClass0fD.A0A(i6, A032);
    }
}
