package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import com.meta.foa.session.FoaUserSession;
import java.util.concurrent.atomic.AtomicBoolean;

public final class MJD extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MJD(Object obj, Object obj2, String str, String str2, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = str;
        this.A04 = str2;
    }

    /* JADX WARNING: type inference failed for: r0v36, types: [X.Prw, java.lang.Object] */
    public final /* bridge */ /* synthetic */ Object invoke() {
        long j;
        Long A10;
        switch (this.A00) {
            case 0:
                new LTH((UserSession) this.A02).A0C(this.A03, "welcome_message");
                ((0sL) this.A01).invoke("welcome_message", this.A04);
                break;
            case 1:
                int ordinal = ((C54629HLm) this.A01).ordinal();
                if (ordinal != 1) {
                    if (ordinal == 0) {
                        ((0sL) this.A02).invoke(this.A04, this.A03);
                        break;
                    } else if (!(ordinal == 2 || ordinal == 3)) {
                        throw AnonymousClass7TE.A1K();
                    }
                } else {
                    ((0sL) this.A02).invoke((Object) null, (Object) null);
                    break;
                }
            case 2:
                0lg r0 = (0lg) this.A02;
                AnonymousClass0iw r7 = (AnonymousClass0iw) this.A01;
                String str = this.A04;
                String str2 = this.A03;
                AnonymousClass7TG.A1N(r0, r7);
                0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r7, r0), "barcelona_follow_button_tap_prompt_cancel");
                if (A0e.isSampled()) {
                    long j2 = 0;
                    if (str == null || (A10 = AnonymousClass7TE.A10(str)) == null) {
                        j = 0;
                    } else {
                        j = A10.longValue();
                    }
                    A0e.A9F("target_id", Long.valueOf(j));
                    C51969G9p.A1A(A0e, r7);
                    if (str2 != null) {
                        AtomicBoolean atomicBoolean = 1Xj.A0i;
                        String A06 = 1Xv.A06(str2);
                        if (A06 != null) {
                            j2 = JTR.A0M(A06);
                        }
                    }
                    A0e.A9F("media_id", Long.valueOf(j2));
                    AnonymousClass7TH.A0V(A0e);
                    break;
                }
                break;
            case 3:
                C52971GgO ggO = (C52971GgO) this.A02;
                ggO.A0B.A00(new C74192PqY(ggO, (User) this.A01, this.A03, this.A04, 17));
                05G r2 = ggO.A0O;
                ((I0j) ggO.A0M.getValue()).A01(ggO.A0C, C318116oQ.A00(ggO), r2);
                break;
            case 4:
                C52971GgO ggO2 = (C52971GgO) this.A02;
                ggO2.A0B.A00(new C74192PqY(ggO2, (User) this.A01, this.A03, this.A04, 18));
                ggO2.A0A.A0D();
                break;
            case 5:
                String str3 = this.A03;
                C50672FgX fgX = (C50672FgX) this.A02;
                FEC.A01(fgX.A04.requireContext(), (AnonymousClass0iw) this.A01, fgX.A02, str3, this.A04);
                break;
            case 6:
                C65819M0l m0l = (C65819M0l) this.A02;
                m0l.A04 = false;
                C65819M0l.A0K = (C21478XcN) this.A01;
                C72192OyC oyC = m0l.A08;
                oyC.A0A.A7I(new Object());
                String str4 = this.A04;
                C340307l3 r22 = m0l.A07;
                OAP oap = m0l.A02;
                String str5 = this.A03;
                C18014Vjq vjq = m0l.A09;
                DbZ.A0t(0, str4, oap, str5);
                C70989OVd oVd = oyC.A09;
                C71143Odx odx = oVd.A0Z;
                odx.A04 = r22;
                odx.A08 = oap;
                odx.A07 = vjq;
                C71143Odx.A06(odx, new C73939PmJ(odx, str4, str5), AnonymousClass7TF.A1Q((182.A01(0Tu.A05, odx.A0H, 36600646144626624L) > 2 ? 1 : (182.A01(0Tu.A05, odx.A0H, 36600646144626624L) == 2 ? 0 : -1))), false);
                oVd.A0T.A08.put(str4, str5);
                break;
            default:
                AnonymousClass7TF.A0D().post(new C57957IjC((Context) this.A01, (FoaUserSession) this.A02, this.A03, this.A04));
                break;
        }
        return C60340gF.A00;
    }
}
