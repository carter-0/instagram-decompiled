package X;

import android.view.View;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import java.util.Map;

/* renamed from: X.Oj3  reason: case insensitive filesystem */
public final class C71352Oj3 implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass9JN A00;
    public final /* synthetic */ AnonymousClass7Ws A01;
    public final /* synthetic */ C328667Fr A02;
    public final /* synthetic */ C3263876o A03;

    public C71352Oj3(AnonymousClass9JN r1, AnonymousClass7Ws r2, C328667Fr r3, C3263876o r4) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1851681584);
        AnonymousClass7Ws r4 = this.A01;
        AnonymousClass9JN r0 = this.A00;
        String str = r0.A04;
        String str2 = r0.A05;
        String str3 = r0.A06;
        String str4 = r0.A02;
        String str5 = r0.A03;
        C328667Fr r2 = this.A02;
        String str6 = r2.A08.A00;
        DirectMessageIdentifier directMessageIdentifier = r2.A0L;
        r4.CJS(0nA.A0F(this.A03.A0V), r2.A0B.A04, directMessageIdentifier, (GradientSpinner) null, 0, str, str2, str3, str4, str5, str6, (String) null, (String) null, (String) null, (Map) null);
        AnonymousClass0fD.A0C(1644738767, A05);
    }
}
