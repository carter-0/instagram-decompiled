package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Vi1  reason: case insensitive filesystem */
public final class C17910Vi1 {
    public Integer A00 = AnonymousClass05K.A0C;
    public final UserSession A01;
    public final VP9 A02;
    public final String A03;
    public final Context A04;
    public final AnonymousClass07i A05;
    public final C15622Ufo A06 = new C15622Ufo(this, 9);

    public final void A00(String str) {
        Integer num = this.A00;
        Integer num2 = AnonymousClass05K.A00;
        if (num != num2) {
            this.A00 = num2;
            1NY A0b = AnonymousClass7TG.A0b(this.A01);
            A0b.A0A(this.A03);
            A0b.A0G("initially_selected_catalog_id", str);
            1OC A0S = DbU.A0S(A0b, UXZ.class, C18254VoL.class);
            A0S.A00 = this.A06;
            1ES.A00(this.A04, this.A05, A0S);
        }
    }

    public C17910Vi1(Context context, AnonymousClass07i r4, UserSession userSession, VP9 vp9, String str) {
        AnonymousClass7TG.A1O(vp9, userSession);
        this.A02 = vp9;
        this.A01 = userSession;
        this.A04 = context;
        this.A05 = r4;
        this.A03 = str;
    }
}
