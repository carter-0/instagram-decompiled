package X;

import android.content.DialogInterface;
import com.instagram.user.model.User;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.util.ArrayList;

public final class I8Q implements DialogInterface.OnClickListener {
    public final /* synthetic */ C255773uh A00;
    public final /* synthetic */ C250973mM A01;
    public final /* synthetic */ AnonymousClass6Z5 A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ ArrayList A04;

    public I8Q(C255773uh r1, C250973mM r2, AnonymousClass6Z5 r3, String str, ArrayList arrayList) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = arrayList;
        this.A03 = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass6Z5 r0 = this.A02;
        C310096aQ r1 = r0.A0h;
        if (r1 == null) {
            0qQ.A0F("reelProfileOpener");
            throw AnonymousClass00P.createAndThrow();
        }
        C255773uh r3 = this.A00;
        C309426Yf Bz3 = ((ReelViewerFragment) r0.A17).A1E.Bz3(r3);
        r1.A02(HLF.BRAND, r3, this.A01, Bz3, (User) this.A04.get(i), this.A03, C273654mx.A00(929), false);
    }
}
