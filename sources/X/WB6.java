package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

public final class WB6 implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ TextView A02;
    public final /* synthetic */ RecyclerView A03;
    public final /* synthetic */ AnonymousClass0iw A04;
    public final /* synthetic */ UserSession A05;
    public final /* synthetic */ C230212pD A06;
    public final /* synthetic */ AnonymousClass5GH A07;
    public final /* synthetic */ Integer A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ boolean A0A;

    public WB6(Context context, TextView textView, RecyclerView recyclerView, AnonymousClass0iw r4, UserSession userSession, C230212pD r6, AnonymousClass5GH r7, Integer num, String str, int i, boolean z) {
        this.A05 = userSession;
        this.A06 = r6;
        this.A03 = recyclerView;
        this.A09 = str;
        this.A08 = num;
        this.A0A = z;
        this.A07 = r7;
        this.A01 = context;
        this.A02 = textView;
        this.A04 = r4;
        this.A00 = i;
    }

    public static void A00(WB6 wb6) {
        C230212pD r1 = wb6.A06;
        RecyclerView recyclerView = wb6.A03;
        String str = wb6.A09;
        r1.A05(recyclerView, wb6.A08, str, C293305kV.A00(wb6.A07.A00()), wb6.A0A);
    }

    public final void onClick(View view) {
        int A052 = AnonymousClass0fD.A05(135016363);
        UserSession userSession = this.A05;
        if (ORX.A01(userSession)) {
            ORX.A00(this.A01, userSession, new C19852WgX(this));
        } else {
            Integer num = AnonymousClass05K.A00;
            if (C70349O3b.A00(userSession, num)) {
                1Av A002 = 1Au.A00(userSession);
                int i = A002.A01.getInt(AnonymousClass000.A00(200), 0);
                1R7 C82 = AnonymousClass1Qz.A00(userSession).C82();
                WB3 wb3 = new WB3(i, 8, this, A002);
                Context context = this.A02.getContext();
                AnonymousClass0iw r7 = this.A04;
                boolean z = true;
                if (this.A00 > 0) {
                    z = false;
                }
                C49256Erz.A00(context, wb3, C82, r7, (ImageUrl) null, Boolean.valueOf(z), num);
            } else {
                A00(this);
            }
        }
        AnonymousClass0fD.A0C(-1092793672, A052);
    }
}
