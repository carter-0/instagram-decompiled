package X;

import com.facebook.systrace.Systrace;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: X.EDc  reason: case insensitive filesystem */
public final class C47693EDc extends 1P0 {
    public static final /* synthetic */ AnonymousClass0YZ[] A04 = {new 01B(C47693EDc.class, "view", "getView()Lcom/instagram/profile/fragment/UserDetailRequestCallback$UserDetailView;", 0)};
    public final 1E6 A00;
    public final Dda A01;
    public final C323066wt A02;
    public final 0w6 A03;

    public C47693EDc(1E6 r4, C267604bt r5, Dda dda, C323066wt r7) {
        0qQ.A0B(r4, 3);
        this.A02 = r7;
        this.A00 = r4;
        this.A01 = dda;
        this.A03 = new C51618Fx7(new WeakReference(r5), 1);
    }

    public static final C267604bt A00(C47693EDc eDc) {
        return (C267604bt) eDc.A03.CDM(eDc, A04[0]);
    }

    public final void onFail(C268654dm r8) {
        int i;
        String str;
        AnonymousClass3JC r0;
        int A032 = AnonymousClass0fD.A03(11056262);
        0qQ.A0B(r8, 0);
        if (Systrace.A0E(1)) {
            0fS.A01("UserDetailRequestGraphQLCallback.onFail", 677330244);
        }
        try {
            C267604bt A002 = A00(this);
            if (A002 != null) {
                A002.Cl8();
            }
            C267604bt A003 = A00(this);
            boolean z = false;
            if (A003 == null || !A003.isValid()) {
                if (Systrace.A0E(1)) {
                    0fS.A00(-401888460);
                }
                i = -1564536695;
            } else {
                C267604bt A004 = A00(this);
                if (A004 != null) {
                    A004.EaM(false);
                }
                boolean z2 = r8 instanceof C268674do;
                if (!z2 || ((r0 = (AnonymousClass3JC) ((C268674do) r8).A00) != null && r0.mStatusCode == 404)) {
                    z = true;
                }
                C267604bt A005 = A00(this);
                if (A005 != null) {
                    Throwable A012 = r8.A01();
                    if (A012 != null) {
                        str = A012.getMessage();
                    } else {
                        str = null;
                    }
                    A005.DFR(z2, z, str);
                }
                if (Systrace.A0E(1)) {
                    0fS.A00(1136380224);
                }
                i = 767685188;
            }
            AnonymousClass0fD.A0A(i, A032);
        } catch (Throwable th) {
            if (Systrace.A0E(1)) {
                0fS.A00(-931231581);
            }
            AnonymousClass0fD.A0A(-1317926523, A032);
            throw th;
        }
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int i;
        C2Q c2q;
        String A11;
        Long A10;
        int A032 = AnonymousClass0fD.A03(480708613);
        AnonymousClass3JC r11 = (AnonymousClass3JC) obj;
        int A033 = AnonymousClass0fD.A03(-2015742019);
        0qQ.A0B(r11, 0);
        if (Systrace.A0E(1)) {
            0fS.A01("UserDetailRequestGraphQLCallback.onSuccessInBackground", -228193867);
        }
        try {
            Dda dda = this.A01;
            dda.A0E("fetch_user_on_data_bg");
            C267604bt A002 = A00(this);
            if (A002 == null || !A002.isValid()) {
                if (Systrace.A0E(1)) {
                    0fS.A00(-2074983061);
                }
                i = 2042553249;
            } else {
                C2G c2g = (C2G) r11.A01;
                if (c2g != null) {
                    C2F c2f = (C2F) c2g.getRequiredTreeField(0, AnonymousClass000.A00(826), C2F.class, 958712321);
                    if (!(c2f == null || (c2q = (C2Q) c2f.reinterpretRequired(0, C2Q.class, -294452885)) == null)) {
                        dda.A0E("graphql_model_conversion_start");
                        C298925uG A0q = ((C389419pa) c2q.reinterpret(C389419pa.class)).A0q(new 1E9(this.A00, AnonymousClass7TE.A1F(), false));
                        dda.A0E("graphql_model_conversion_end");
                        C3727892k r4 = new C3727892k();
                        r4.A02 = A0q;
                        r4.mStatus = "ok";
                        r4.EQG(r11.AjP());
                        r4.EQE(r11.AjJ());
                        Map map = r11.A00.trackedResponseHeaders;
                        if (!(map == null || (A11 = DbT.A11(AnonymousClass000.A00(63), map)) == null || (A10 = AnonymousClass7TE.A10(A11)) == null)) {
                            r4.mServerElapsedTime = A10.longValue();
                        }
                        11Z.A02(new C51399FtV(r4, this));
                        if (Systrace.A0E(1)) {
                            0fS.A00(-1702162339);
                        }
                        i = 614665408;
                    }
                }
                throw AnonymousClass7TE.A0y();
            }
            AnonymousClass0fD.A0A(i, A033);
            AnonymousClass0fD.A0A(-698833891, A032);
        } catch (Throwable th) {
            if (Systrace.A0E(1)) {
                0fS.A00(1307166163);
            }
            AnonymousClass0fD.A0A(-1859371247, A033);
            throw th;
        }
    }
}
