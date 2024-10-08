package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.regex.Pattern;

/* renamed from: X.5jo  reason: invalid class name and case insensitive filesystem */
public final class C292965jo implements View.OnClickListener {
    public final /* synthetic */ C229992ok A00;
    public final /* synthetic */ C243493Yz A01;
    public final /* synthetic */ AnonymousClass3UH A02;

    public C292965jo(C229992ok r1, C243493Yz r2, AnonymousClass3UH r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public final void onClick(View view) {
        int i;
        int A05 = AnonymousClass0fD.A05(1998108065);
        C252553pI r1 = this.A01.A0A.A0D;
        if (!(r1 instanceof LinearLayoutManager) || r1 == null) {
            i = 0;
        } else {
            i = ((LinearLayoutManager) r1).A1a();
        }
        C229992ok r4 = this.A00;
        AnonymousClass3UH r0 = this.A02;
        1UQ B5J = r0.B5J();
        int i2 = r0.A01;
        String str = r0.A0I;
        String id = r0.getId();
        String str2 = r0.A0D;
        String str3 = r0.A0E;
        Pattern pattern = 0mp.A00;
        if (str3 == null) {
            str3 = "";
        }
        r4.DpM(B5J, Integer.valueOf(i), str, id, str2, str3, i2);
        AnonymousClass0fD.A0C(2065372496, A05);
    }
}
