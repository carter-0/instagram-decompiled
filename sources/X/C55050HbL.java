package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.foa.session.IgMetaSessionImpl;

/* renamed from: X.HbL  reason: case insensitive filesystem */
public abstract class C55050HbL {
    /* JADX WARNING: type inference failed for: r10v0, types: [X.Hrw, java.lang.Object] */
    public static final void A00(Activity activity, UserSession userSession, Integer num, String str, String str2, String str3, String str4, C62320sa r31, 0sL r32, boolean z) {
        String str5 = str4;
        String str6 = "";
        if (str4 == null) {
            str5 = str6;
        }
        String str7 = str2;
        if (str2 != null) {
            str6 = str7;
        }
        C57595IdM idM = new C57595IdM(str5, str6);
        Integer num2 = AnonymousClass05K.A00;
        C56131HtJ htJ = new C56131HtJ(idM, num2, str7, str3, "");
        C56552I1g i1g = new C56552I1g(true, false);
        String A0c = AnonymousClass7TF.A0c();
        String str8 = str;
        C56568I1x i1x = new C56568I1x(new C56092Hsf(A0c, str8), htJ, new Object(), i1g, num, str8, (String) null, (String) null, A0c, 0sn.A00, 3, false, true, false, false, z);
        IgMetaSessionImpl igMetaSessionImpl = new IgMetaSessionImpl(userSession);
        C59097J6f A01 = C59097J6f.A01(new C57573Id0(1, r31, r32), 6);
        C55236HeR heR = C54554HIp.A0C;
        C56095Hsi hsi = new C56095Hsi(igMetaSessionImpl, i1x);
        synchronized (heR) {
            if (!C54554HIp.A0B) {
                C54554HIp hIp = new C54554HIp(activity, hsi.A00, hsi, A01);
                if (!hIp.A08.A01.A04.A00) {
                    num2 = AnonymousClass05K.A0C;
                }
                hIp.A03 = num2;
                I45 i45 = hIp.A06;
                C56507Hzd hzd = i45.A02;
                Integer num3 = i45.A03.A05;
                XSJ A00 = XXw.A00(num3);
                C54673HOe hOe = C54673HOe.WRITE;
                0qQ.A0B(A00, 0);
                C56507Hzd.A00(hOe, A00, hzd, "bottom_sheet_open", (String) null);
                XSJ A002 = XXw.A00(num3);
                0qQ.A0B(A002, 0);
                C56507Hzd.A00(hOe, A002, hzd, "open_intent", (String) null);
                hIp.A0F(C54554HIp.A00(hIp), "WriteWithAIActivity", C59097J6f.A01(hIp, 7));
                C54554HIp.A0B = true;
            }
        }
    }
}
