package X;

import android.view.ViewGroup;
import com.instagram.ui.widget.shutterbutton.ShutterButton;

/* renamed from: X.Agu  reason: case insensitive filesystem */
public final class C40680Agu implements C353058Gc {
    public final /* synthetic */ AS8 A00;

    public final boolean CNh() {
        return false;
    }

    public final void D0b(String str, String str2) {
    }

    public final void Dke() {
    }

    public final void Dmk(boolean z) {
    }

    public final void Dy5(float f) {
    }

    public C40680Agu(AS8 as8) {
        this.A00 = as8;
    }

    public final void Dmi(String str) {
        AS8 as8 = this.A00;
        ShutterButton shutterButton = as8.A03;
        if (shutterButton == null) {
            0qQ.A0F("shutterButton");
            throw AnonymousClass00P.createAndThrow();
        }
        shutterButton.A03(AnonymousClass05K.A00);
        as8.A08.A00();
        Aa7 aa7 = as8.A09;
        if (AnonymousClass7TF.A1V(aa7.A07)) {
            aa7.E4E();
            aa7.FL7(0.0f);
        }
        ViewGroup viewGroup = as8.A07.A00;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
    }

    public final void DnV(int i, String str) {
        AS8 as8 = this.A00;
        ShutterButton shutterButton = as8.A03;
        if (shutterButton == null) {
            0qQ.A0F("shutterButton");
            throw AnonymousClass00P.createAndThrow();
        }
        shutterButton.DnW(str);
        as8.A08.A00.A01().A03.A09.A02();
        AnonymousClass7TF.A16(as8.A07.A00);
    }
}
