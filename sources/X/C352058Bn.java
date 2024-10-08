package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.ui.widget.drawing.EyedropperColorPickerTool;

/* renamed from: X.8Bn  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C352058Bn implements AnonymousClass0eK {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AnonymousClass8BA A01;
    public final /* synthetic */ AnonymousClass88K A02;

    public /* synthetic */ C352058Bn(View view, AnonymousClass8BA r2, AnonymousClass88K r3) {
        this.A01 = r2;
        this.A00 = view;
        this.A02 = r3;
    }

    public final Object get() {
        AnonymousClass8BA r4 = this.A01;
        View view = this.A00;
        AnonymousClass88K r3 = this.A02;
        C41457AuH auH = new C41457AuH(r4);
        return new C40316AaB(r4.A17, r3, r4, r4.A1U, (EyedropperColorPickerTool) view.requireViewById(R.id.eyedropper_color_picker_tool), auH);
    }
}
