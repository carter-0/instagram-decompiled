package androidx.preference;

import X.C18917WCm;
import X.UEU;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;

public class SwitchPreference extends TwoStatePreference {
    public CharSequence A00;
    public CharSequence A01;
    public final C18917WCm A02 = new C18917WCm(this);

    private void A00(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.A02);
        }
        if (z) {
            Switch switchR = (Switch) view;
            switchR.setTextOn(this.A01);
            switchR.setTextOff(this.A00);
            switchR.setOnCheckedChangeListener(this.A02);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SwitchPreference(android.content.Context r5, android.util.AttributeSet r6) {
        /*
            r4 = this;
            r1 = 2130971325(0x7f040abd, float:1.7551385E38)
            r0 = 16843629(0x101036d, float:2.3696016E-38)
            int r1 = X.C18666VwO.A00(r5, r1, r0)
            r3 = 0
            r4.<init>(r5, r6, r1)
            X.WCm r0 = new X.WCm
            r0.<init>(r4)
            r4.A02 = r0
            int[] r0 = X.C17166VKv.A0B
            android.content.res.TypedArray r2 = r5.obtainStyledAttributes(r6, r0, r1, r3)
            r0 = 7
            java.lang.String r0 = X.C13991Tnr.A0c(r2, r0, r3)
            r4.A01 = r0
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x0029
            r4.A04()
        L_0x0029:
            r1 = 6
            r0 = 1
            java.lang.String r0 = X.C13991Tnr.A0c(r2, r1, r0)
            r4.A00 = r0
            boolean r0 = r4.A02
            if (r0 != 0) goto L_0x0038
            r4.A04()
        L_0x0038:
            r1 = 9
            r0 = 3
            java.lang.String r0 = X.C13991Tnr.A0c(r2, r1, r0)
            r4.A01 = r0
            r4.A04()
            r1 = 8
            r0 = 4
            java.lang.String r0 = X.C13991Tnr.A0c(r2, r1, r0)
            r4.A00 = r0
            r4.A04()
            r1 = 5
            r0 = 2
            boolean r0 = r2.getBoolean(r0, r3)
            boolean r0 = r2.getBoolean(r1, r0)
            r4.A03 = r0
            r2.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.SwitchPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final void A0B(View view) {
        super.A0B(view);
        if (((AccessibilityManager) this.A0a.getSystemService("accessibility")).isEnabled()) {
            A00(view.findViewById(16908352));
            A0N(view.findViewById(16908304));
        }
    }

    public final void A0D(UEU ueu) {
        super.A0D(ueu);
        A00(ueu.A00(16908352));
        A0N(ueu.A00(16908304));
    }
}
