package X;

import android.view.View;
import java.util.List;
import java.util.Map;

/* renamed from: X.FNx  reason: case insensitive filesystem */
public final class C50082FNx implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass0iw A00;
    public final /* synthetic */ 1Xj A01;
    public final /* synthetic */ AnonymousClass70J A02;
    public final /* synthetic */ List A03;

    public C50082FNx(AnonymousClass0iw r1, 1Xj r2, AnonymousClass70J r3, List list) {
        this.A02 = r3;
        this.A03 = list;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(637417580);
        AnonymousClass70J r3 = this.A02;
        if (r3 != null) {
            List list = this.A03;
            if (list.size() == 1) {
                r3.A02().D1Q((C2609247o) AnonymousClass7TE.A13(list), this.A00, "user_profile_header");
            } else {
                C50672FgX A022 = r3.A02();
                C48096EVo eVo = C48096EVo.Channels;
                A022.A08(this.A00, this.A01, eVo, (Map) null, false);
            }
        }
        AnonymousClass0fD.A0C(-886876199, A05);
    }
}
