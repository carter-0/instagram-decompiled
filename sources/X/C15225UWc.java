package X;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: X.UWc  reason: case insensitive filesystem */
public final class C15225UWc extends U7E {
    public final /* synthetic */ C15224UWb A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15225UWc(C15224UWb uWb, TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.A00 = uWb;
    }

    public final void A0T(View view, AccessibilityEvent accessibilityEvent) {
        C15225UWc.super.A0T(view, accessibilityEvent);
        C15224UWb uWb = this.A00;
        TextInputLayout textInputLayout = uWb.A02;
        EditText editText = textInputLayout.A0F;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (accessibilityEvent.getEventType() == 1 && uWb.A04.isTouchExplorationEnabled() && textInputLayout.A0F.getKeyListener() == null) {
                C15224UWb.A01(autoCompleteTextView, uWb);
                return;
            }
            return;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.A0Y(view, accessibilityNodeInfoCompat);
        if (this.A00.A02.A0F.getKeyListener() == null) {
            accessibilityNodeInfoCompat.setClassName(Spinner.class.getName());
        }
        if (accessibilityNodeInfoCompat.mInfo.isShowingHintText()) {
            accessibilityNodeInfoCompat.mInfo.setHintText((CharSequence) null);
        }
    }
}
