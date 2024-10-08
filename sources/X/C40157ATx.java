package X;

import android.os.Handler;
import com.instagram.ui.widget.shutterbutton.ShutterButton;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.ATx  reason: case insensitive filesystem */
public final class C40157ATx implements C370288w9 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Handler A02;
    public final /* synthetic */ C357638Yz A03;
    public final /* synthetic */ AnonymousClass8G7 A04;
    public final /* synthetic */ AnonymousClass9QO A05;
    public final /* synthetic */ ShutterButton A06;

    public C40157ATx(Handler handler, C357638Yz r2, AnonymousClass8G7 r3, AnonymousClass9QO r4, ShutterButton shutterButton, int i, int i2) {
        this.A05 = r4;
        this.A03 = r2;
        this.A02 = handler;
        this.A06 = shutterButton;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = r3;
    }

    public final /* bridge */ /* synthetic */ void DYh(Object obj) {
        Object obj2;
        List list = (List) obj;
        0qQ.A0B(list, 0);
        AnonymousClass9QO r5 = this.A05;
        if (!r5.A04.get() && r5.A00) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (0qQ.A0K(((C39782A9b) obj2).A01, "open_hand")) {
                    break;
                }
            }
            C39782A9b a9b = (C39782A9b) obj2;
            if (C357638Yz.A03(C358088aL.A0J, this.A03) && a9b != null) {
                this.A02.post(new C41245Aqh(a9b, this.A04, r5, this.A06, this.A01, this.A00));
            }
        }
    }
}
