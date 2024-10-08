package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.text.fittingtextview.FittingTextView;
import com.instagram.ui.widget.drawing.EyedropperColorPickerTool;
import com.instagram.ui.widget.drawing.FloatingIndicator;
import com.instagram.ui.widget.drawing.StrokeWidthTool;

/* renamed from: X.8Bj  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C352018Bj implements AnonymousClass0eK {
    public final /* synthetic */ View A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C71662eb A02;
    public final /* synthetic */ AnonymousClass8BA A03;
    public final /* synthetic */ AnonymousClass88K A04;
    public final /* synthetic */ C3502083s A05;

    public /* synthetic */ C352018Bj(View view, UserSession userSession, C71662eb r3, AnonymousClass8BA r4, AnonymousClass88K r5, C3502083s r6) {
        this.A03 = r4;
        this.A01 = userSession;
        this.A00 = view;
        this.A02 = r3;
        this.A04 = r5;
        this.A05 = r6;
    }

    public final Object get() {
        AnonymousClass8BA r11 = this.A03;
        UserSession userSession = this.A01;
        View view = this.A00;
        C71662eb r14 = this.A02;
        AnonymousClass88K r12 = this.A04;
        C3502083s r10 = this.A05;
        Context context = r11.A0o.getContext();
        Resources resources = view.getResources();
        AnonymousClass8BQ r7 = r11.A17;
        AnonymousClass8O0 r6 = new AnonymousClass8O0(r11);
        AnonymousClass8O2 r5 = new AnonymousClass8O2(r11);
        FloatingIndicator floatingIndicator = r11.A1r;
        EyedropperColorPickerTool eyedropperColorPickerTool = (EyedropperColorPickerTool) view.findViewById(R.id.eyedropper_color_picker_tool);
        FloatingIndicator floatingIndicator2 = floatingIndicator;
        StrokeWidthTool strokeWidthTool = (StrokeWidthTool) view.requireViewById(R.id.stroke_width_tool);
        AnonymousClass8BA r28 = r11;
        FittingTextView fittingTextView = (FittingTextView) view.findViewById(R.id.done_button);
        FittingTextView fittingTextView2 = (FittingTextView) view.findViewById(R.id.undo_button);
        AnonymousClass8O0 r25 = r6;
        AnonymousClass88K r26 = r12;
        C3502083s r27 = r10;
        C71662eb r22 = r14;
        AnonymousClass8BQ r23 = r7;
        AnonymousClass8O2 r24 = r5;
        return new AnonymousClass8O4(context, resources, (ViewStub) view.requireViewById(R.id.brush_palette_stub), (ViewStub) view.requireViewById(R.id.collapsed_brush_palette_stub), userSession, r22, r23, r24, r25, r26, r27, r28, fittingTextView, fittingTextView2, eyedropperColorPickerTool, floatingIndicator2, strokeWidthTool, r11.A18.A0K());
    }
}
