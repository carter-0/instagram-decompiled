package X;

import android.text.Editable;
import android.view.View;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.igds.components.button.IgdsButton;

public final class WTX implements C252213ok {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public WTX(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void DMr(int i, boolean z) {
        Editable editable;
        switch (this.A00) {
            case 0:
                View view = (View) this.A01;
                if (i > 0) {
                    view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
                    ((0sP) this.A02).invoke(Integer.valueOf(i));
                    return;
                }
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), 0);
                return;
            case 1:
                0rk r1 = (0rk) this.A01;
                int i2 = r1.A00;
                if (i > i2) {
                    C331677Rx.A00((C331677Rx) this.A02).onKeyboardExpanded();
                } else if (i < i2) {
                    C331677Rx.A00((C331677Rx) this.A02).onKeyboardCollapsed();
                }
                r1.A00 = i;
                return;
            default:
                C14894UDw uDw = (C14894UDw) this.A01;
                View view2 = uDw.A00;
                IgEditText igEditText = uDw.A02;
                IgdsButton igdsButton = uDw.A03;
                if (i == 0) {
                    if (igEditText != null) {
                        editable = igEditText.getText();
                    } else {
                        editable = null;
                    }
                    if (String.valueOf(editable).length() == 0) {
                        view2.setVisibility(8);
                        if (igdsButton != null) {
                            igdsButton.setVisibility(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
