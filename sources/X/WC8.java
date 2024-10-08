package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.ui.widget.radiogroup.IgRadioGroup;

public final class WC8 implements ViewGroup.OnHierarchyChangeListener {
    public ViewGroup.OnHierarchyChangeListener A00;
    public final /* synthetic */ IgRadioGroup A01;

    public WC8(IgRadioGroup igRadioGroup) {
        this.A01 = igRadioGroup;
    }

    public final void onChildViewAdded(View view, View view2) {
        IgRadioGroup igRadioGroup = this.A01;
        if (view == igRadioGroup && (view2 instanceof XBN)) {
            if (view2.getId() == -1) {
                JTP.A13(view2);
            }
            ((XBN) view2).A9W(igRadioGroup.A01);
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.A00;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    public final void onChildViewRemoved(View view, View view2) {
        IgRadioGroup igRadioGroup = this.A01;
        if (view == igRadioGroup && (view2 instanceof XBN)) {
            ((XBN) view2).EEF(igRadioGroup.A01);
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.A00;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
