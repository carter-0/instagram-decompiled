package androidx.preference;

import X.C13991Tnr;
import X.C17166VKv;
import X.C18918WCn;
import X.UEU;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import com.instagram.android.R;

public class SwitchPreferenceCompat extends TwoStatePreference {
    public CharSequence A00;
    public CharSequence A01;
    public final C18918WCn A02 = new C18918WCn(this);

    private void A00(View view) {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.A02);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.A01);
            switchCompat.setTextOff(this.A00);
            switchCompat.setOnCheckedChangeListener(this.A02);
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.switchPreferenceCompatStyle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C17166VKv.A0C, R.attr.switchPreferenceCompatStyle, 0);
        this.A01 = C13991Tnr.A0c(obtainStyledAttributes, 7, 0);
        if (this.A02) {
            A04();
        }
        this.A00 = C13991Tnr.A0c(obtainStyledAttributes, 6, 1);
        if (!this.A02) {
            A04();
        }
        this.A01 = C13991Tnr.A0c(obtainStyledAttributes, 9, 3);
        A04();
        this.A00 = C13991Tnr.A0c(obtainStyledAttributes, 8, 4);
        A04();
        this.A03 = obtainStyledAttributes.getBoolean(5, obtainStyledAttributes.getBoolean(2, false));
        obtainStyledAttributes.recycle();
    }

    public final void A0B(View view) {
        super.A0B(view);
        if (((AccessibilityManager) this.A0a.getSystemService("accessibility")).isEnabled()) {
            A00(view.findViewById(R.id.switchWidget));
            A0N(view.findViewById(16908304));
        }
    }

    public final void A0D(UEU ueu) {
        super.A0D(ueu);
        A00(ueu.A00(R.id.switchWidget));
        A0N(ueu.A00(16908304));
    }
}
