package X;

import android.content.Context;
import android.view.View;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.BitSet;
import java.util.HashMap;

/* renamed from: X.IAf  reason: case insensitive filesystem */
public final class C56736IAf implements View.OnClickListener {
    public final /* synthetic */ C227802jw A00;

    public C56736IAf(C227802jw r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-802002238);
        AnonymousClass57Q r9 = this.A00.A0A;
        if (r9 != null) {
            AnonymousClass57Q.A00(r9, AnonymousClass05K.A01, "unknown");
            IgBloksScreenConfig A0N = DbS.A0N(r9.A0I);
            Context context = r9.A0H;
            HashMap A1E = AnonymousClass7TE.A1E();
            HashMap A1E2 = AnonymousClass7TE.A1E();
            HashMap A1E3 = AnonymousClass7TE.A1E();
            new BitSet(0);
            C46649DiU A06 = C46649DiU.A06(AnonymousClass000.A00(1186), C359608dC.A01(A1E), A1E2);
            C46649DiU.A0B(A06, -1);
            A06.A03 = null;
            A06.A02 = null;
            A06.A04 = null;
            A06.A0H(A1E3);
            A06.A0E(context, A0N);
            r9.A0J.A00();
        }
        AnonymousClass0fD.A0C(1088108755, A05);
    }
}
