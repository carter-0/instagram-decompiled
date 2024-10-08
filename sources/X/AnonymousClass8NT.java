package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.drawing.EyedropperColorPickerTool;

/* renamed from: X.8NT  reason: invalid class name */
public final class AnonymousClass8NT implements AnonymousClass0eK {
    public final /* synthetic */ AnonymousClass8BQ A00;
    public final /* synthetic */ AnonymousClass8AL A01;
    public final /* synthetic */ AnonymousClass8ME A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public AnonymousClass8NT(AnonymousClass8BQ r1, AnonymousClass8AL r2, AnonymousClass8ME r3, boolean z, boolean z2) {
        this.A02 = r3;
        this.A03 = z;
        this.A04 = z2;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        AnonymousClass8ME r10 = this.A02;
        AnonymousClass80U r9 = r10.A1B;
        View view = r10.A0h;
        UserSession userSession = r10.A0r;
        AnonymousClass88K r6 = r10.A14;
        EyedropperColorPickerTool eyedropperColorPickerTool = r10.A1l;
        AnonymousClass4DH r2 = r10.A0l;
        AnonymousClass8AL r7 = this.A01;
        return new AYL(view, r2, userSession, r10.A10, this.A00, r6, r7, AnonymousClass8ME.A0A(r10), r9, r10, eyedropperColorPickerTool);
    }
}
