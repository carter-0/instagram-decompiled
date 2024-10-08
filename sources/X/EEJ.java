package X;

import android.content.res.Resources;
import android.view.View;
import com.instagram.business.ui.BusinessNavBar;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

public final class EEJ extends C252233om {
    public BusinessNavBar A00;
    public C51925G7t A01;
    public IgdsBottomButtonLayout A02;
    public boolean A03;
    public String A04;

    public EEJ(C51925G7t g7t, IgdsBottomButtonLayout igdsBottomButtonLayout, int i, int i2) {
        0qQ.A0B(igdsBottomButtonLayout, 4);
        this.A01 = g7t;
        this.A02 = igdsBottomButtonLayout;
        Resources resources = igdsBottomButtonLayout.getResources();
        igdsBottomButtonLayout.setPrimaryActionText(resources.getString(i));
        boolean z = false;
        if (i2 != -1) {
            z = true;
            this.A04 = resources.getString(i2);
        }
        A02(z);
    }

    public final void A00() {
        this.A03 = false;
        BusinessNavBar businessNavBar = this.A00;
        if (businessNavBar != null) {
            businessNavBar.setShowProgressBarOnPrimaryButton(false);
        } else {
            IgdsBottomButtonLayout igdsBottomButtonLayout = this.A02;
            if (igdsBottomButtonLayout != null) {
                igdsBottomButtonLayout.setPrimaryActionIsLoading(false);
            }
        }
        C51925G7t g7t = this.A01;
        if (g7t != null) {
            g7t.ARL();
        }
    }

    public final void A01() {
        this.A03 = true;
        BusinessNavBar businessNavBar = this.A00;
        if (businessNavBar != null) {
            businessNavBar.setShowProgressBarOnPrimaryButton(true);
        } else {
            IgdsBottomButtonLayout igdsBottomButtonLayout = this.A02;
            if (igdsBottomButtonLayout != null) {
                igdsBottomButtonLayout.setPrimaryActionIsLoading(true);
            }
        }
        C51925G7t g7t = this.A01;
        if (g7t != null) {
            g7t.APF();
        }
    }

    public final void D6z(View view) {
        0qQ.A0B(view, 0);
        FP5 A002 = FP5.A00(this, 21);
        FP5 A003 = FP5.A00(this, 22);
        BusinessNavBar businessNavBar = this.A00;
        if (businessNavBar != null) {
            businessNavBar.setPrimaryButtonOnclickListeners(A002);
            BusinessNavBar businessNavBar2 = this.A00;
            if (businessNavBar2 != null) {
                businessNavBar2.setSecondaryButtonOnclickListeners(A003);
                return;
            }
            return;
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.A02;
        if (igdsBottomButtonLayout != null) {
            igdsBottomButtonLayout.setPrimaryActionOnClickListener(A002);
            IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.A02;
            if (igdsBottomButtonLayout2 != null) {
                igdsBottomButtonLayout2.setSecondaryActionOnClickListener(A003);
            }
        }
    }

    public final void onDestroyView() {
        this.A01 = null;
        this.A00 = null;
        this.A02 = null;
    }

    public final void A02(boolean z) {
        String str;
        BusinessNavBar businessNavBar = this.A00;
        if (businessNavBar != null) {
            businessNavBar.A02(z);
            return;
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.A02;
        if (igdsBottomButtonLayout != null) {
            if (z) {
                str = this.A04;
            } else {
                str = null;
            }
            igdsBottomButtonLayout.setSecondaryActionText(str);
        }
    }

    public EEJ(BusinessNavBar businessNavBar, C51925G7t g7t, int i, int i2) {
        this.A01 = g7t;
        this.A00 = businessNavBar;
        if (businessNavBar != null) {
            businessNavBar.setPrimaryButtonText(i);
        }
        BusinessNavBar businessNavBar2 = this.A00;
        if (i2 != -1) {
            if (businessNavBar2 != null) {
                businessNavBar2.setSecondaryButtonText(i2);
            }
        } else if (businessNavBar2 != null) {
            businessNavBar2.A02(false);
        }
    }
}
