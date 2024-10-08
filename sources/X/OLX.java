package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public final class OLX {
    public 0QS A00;
    public boolean A01;
    public final Context A02;
    public final C69661Npj A03;
    public final ODL A04;
    public final List A05;

    public final void A00() {
        0QS r1 = this.A00;
        if (r1 != null) {
            try {
                this.A02.unregisterReceiver(r1);
            } catch (IllegalArgumentException unused) {
                this.A03.A00("client_flashcall_unregister_error", (Map) null);
            }
            this.A00 = null;
        }
    }

    public OLX(Context context, C69661Npj npj, ODL odl, String[] strArr) {
        this.A02 = context;
        ArrayList A0v = DbS.A0v(r3);
        for (String compile : strArr) {
            A0v.add(Pattern.compile(compile));
        }
        this.A05 = A0v;
        this.A04 = odl;
        this.A03 = npj;
    }
}
