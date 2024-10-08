package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.IVd  reason: case insensitive filesystem */
public final class C57268IVd implements MVB {
    public boolean A00 = false;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ 1P0 A02;
    public final /* synthetic */ 1Xj A03;
    public final /* synthetic */ C54722HQb A04;
    public final /* synthetic */ Integer A05;

    /* JADX WARNING: type inference failed for: r0v4, types: [X.1qK, java.lang.Object] */
    public final void onButtonClick(View view) {
        this.A00 = true;
        UserSession userSession = this.A04.A01;
        1Av A002 = 1Au.A00(userSession);
        String id = this.A03.getId();
        id.getClass();
        A002.A0r(id);
        AnonymousClass1Nd.A00(userSession).A05(new Object());
    }

    public final /* synthetic */ void onTextClick(View view) {
    }

    public C57268IVd(AnonymousClass0iw r2, 1P0 r3, 1Xj r4, C54722HQb hQb, Integer num) {
        this.A04 = hQb;
        this.A03 = r4;
        this.A05 = num;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final void onDismiss() {
        if (!this.A00) {
            C54722HQb hQb = this.A04;
            UserSession userSession = hQb.A01;
            1Av A002 = 1Au.A00(userSession);
            1Xj r1 = this.A03;
            String id = r1.getId();
            id.getClass();
            A002.A0r(id);
            Integer num = this.A05;
            1P0 r5 = this.A02;
            if (num.intValue() != 1) {
                try {
                    1OC A012 = C56333Hwk.A01(hQb.A01, hQb.A02, Collections.singleton(r1.getId()));
                    A012.A00 = new C54244H4n(r5, hQb, AnonymousClass05K.A0C);
                    1ES.A03(A012);
                } catch (IOException unused) {
                    C59689JTv.A0F(C51966G9m.A0P(hQb.A01), "photos_and_videos_of_you_fail_to_remove_io_exception", 2131969435);
                }
            } else {
                1OC A003 = C56333Hwk.A00(hQb.A01, "remove", hQb.A02, Collections.singleton(r1.getId()));
                A003.A00 = new C54244H4n(r5, hQb, AnonymousClass05K.A01);
                1ES.A03(A003);
            }
            AnonymousClass1pc.A00().Cnc(hQb.A00, this.A01, userSession, C54660HMr.SINGLE_UNTAG, 1);
        }
    }

    public final void onShow() {
        Set A1F;
        1Av A002 = 1Au.A00(this.A04.A01);
        String id = this.A03.getId();
        id.getClass();
        0xa r3 = A002.A01;
        String A003 = AnonymousClass000.A00(3800);
        if (r3.contains(A003)) {
            A1F = 00k.A0j(r3.C1t(A003));
        } else {
            A1F = AnonymousClass7TE.A1F();
        }
        A1F.add(id);
        0xY AR4 = r3.AR4();
        AR4.E5h(A003, A1F);
        AR4.apply();
    }
}
