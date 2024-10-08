package androidx.preference;

import X.C18916WCl;
import X.UEU;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;

public class CheckBoxPreference extends TwoStatePreference {
    public final C18916WCl A00 = new C18916WCl(this);

    private void A00(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.A02);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.A00);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CheckBoxPreference(android.content.Context r5, android.util.AttributeSet r6) {
        /*
            r4 = this;
            r1 = 2130969006(0x7f0401ae, float:1.7546682E38)
            r0 = 16842895(0x101008f, float:2.369396E-38)
            int r1 = X.C18666VwO.A00(r5, r1, r0)
            r3 = 0
            r4.<init>(r5, r6, r1)
            X.WCl r0 = new X.WCl
            r0.<init>(r4)
            r4.A00 = r0
            int[] r0 = X.C17166VKv.A01
            android.content.res.TypedArray r2 = r5.obtainStyledAttributes(r6, r0, r1, r3)
            r0 = 5
            java.lang.String r0 = X.C13991Tnr.A0c(r2, r0, r3)
            r4.A01 = r0
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x0029
            r4.A04()
        L_0x0029:
            r1 = 4
            r0 = 1
            java.lang.String r0 = X.C13991Tnr.A0c(r2, r1, r0)
            r4.A00 = r0
            boolean r0 = r4.A02
            if (r0 != 0) goto L_0x0038
            r4.A04()
        L_0x0038:
            r1 = 3
            r0 = 2
            boolean r0 = r2.getBoolean(r0, r3)
            boolean r0 = r2.getBoolean(r1, r0)
            r4.A03 = r0
            r2.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.CheckBoxPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final void A0B(View view) {
        super.A0B(view);
        if (((AccessibilityManager) this.A0a.getSystemService("accessibility")).isEnabled()) {
            A00(view.findViewById(16908289));
            A0N(view.findViewById(16908304));
        }
    }

    public final void A0D(UEU ueu) {
        super.A0D(ueu);
        A00(ueu.A00(16908289));
        A0N(ueu.A00(16908304));
    }
}
