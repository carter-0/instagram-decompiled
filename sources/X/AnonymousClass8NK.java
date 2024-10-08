package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;

/* renamed from: X.8NK  reason: invalid class name */
public final class AnonymousClass8NK implements AnonymousClass0eK {
    public final /* synthetic */ AnonymousClass8BQ A00;
    public final /* synthetic */ AnonymousClass8AL A01;
    public final /* synthetic */ AnonymousClass8ME A02;

    public AnonymousClass8NK(AnonymousClass8BQ r1, AnonymousClass8AL r2, AnonymousClass8ME r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        AnonymousClass8ME r12 = this.A02;
        View view = r12.A0h;
        Fragment fragment = r12.A0l;
        C66540MVu A09 = AnonymousClass8ME.A09((C279284yO) r12.A0t.A08.A00, r12);
        UserSession userSession = r12.A0r;
        AnonymousClass80U r11 = r12.A1B;
        TargetViewSizeProvider targetViewSizeProvider = r12.A10;
        AnonymousClass3E6 r5 = r12.A0s;
        C354538Mk r6 = r12.A0z;
        AnonymousClass8AL r9 = this.A01;
        return new C64724Lh1(view, fragment.requireActivity(), fragment, userSession, r5, r6, targetViewSizeProvider, this.A00, r9, A09, r11, r12);
    }
}
