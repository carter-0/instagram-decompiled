package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.ui.text.fittingtextview.FittingTextView;
import com.instagram.ui.widget.drawing.EyedropperColorPickerTool;

/* renamed from: X.8Bp  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C352078Bp implements AnonymousClass0eK {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AnonymousClass8BA A01;
    public final /* synthetic */ AnonymousClass88K A02;

    public /* synthetic */ C352078Bp(View view, AnonymousClass8BA r2, AnonymousClass88K r3) {
        this.A01 = r2;
        this.A00 = view;
        this.A02 = r3;
    }

    public final Object get() {
        AnonymousClass8BA r6 = this.A01;
        View view = this.A00;
        return new C40317AaC(new A8V(r6), r6.A14, r6.A17, this.A02, r6, (FittingTextView) view.findViewById(R.id.undo_button), (FittingTextView) view.findViewById(R.id.done_button), (EyedropperColorPickerTool) view.findViewById(R.id.eyedropper_color_picker_tool));
    }
}
