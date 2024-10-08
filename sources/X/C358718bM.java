package X;

import android.widget.EditText;
import com.instagram.android.R;
import com.instagram.realtimeclient.GraphQLSubscriptionID;

/* renamed from: X.8bM  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C358718bM implements AnonymousClass0eK {
    public final /* synthetic */ AnonymousClass8AL A00;
    public final /* synthetic */ C358368an A01;

    public /* synthetic */ C358718bM(AnonymousClass8AL r1, C358368an r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final Object get() {
        C358368an r9 = this.A01;
        AnonymousClass8AL r8 = this.A00;
        1Av r3 = r9.A1i;
        String str = (String) r3.A8E.CDM(r3, 1Av.A8a[60]);
        C358868bb r10 = null;
        if (2Ob.A00(str, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT)) {
            r3.A0y((String) null);
            str = null;
        }
        if (!AnonymousClass5He.A00(str)) {
            0qQ.A0B(str, 0);
            r10 = C358878bc.A01(str, false, false, false, false);
        }
        return new C360778f8(r9.A0q, r9.A0x, (EditText) r9.A15.requireViewById(R.id.text_overlay_edit_text), r9.A1G, r9.A1J, r9.A1P, r8, r9, r10, false, false);
    }
}
