package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.nux.ndx.util.NdxStepsFilterer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;

public final class EDO extends 1P0 {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass35E A01;
    public final /* synthetic */ Integer A02;

    public EDO(AnonymousClass35E r1, Integer num, long j) {
        this.A01 = r1;
        this.A00 = j;
        this.A02 = num;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        int i;
        Integer num;
        String str2;
        int A03 = AnonymousClass0fD.A03(-1320734051);
        DvB dvB = (DvB) obj;
        int A032 = AnonymousClass0fD.A03(-832751050);
        0qQ.A0B(dvB, 0);
        List list = dvB.A00;
        0qQ.A0C(list, AnonymousClass000.A00(52));
        ArrayList arrayList = (ArrayList) list;
        AnonymousClass35E r5 = this.A01;
        UserSession userSession = r5.A01;
        0xY AR4 = 1Al.A01(userSession).A03(1An.A2I).AR4();
        AR4.E5c("ndx_immersive_written_timestamp", System.currentTimeMillis());
        AR4.apply();
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.A00;
        AnonymousClass35F r7 = r5.A02;
        Integer num2 = this.A02;
        Integer num3 = num2;
        r7.A01(num2, arrayList, currentTimeMillis - j);
        if (arrayList.isEmpty()) {
            A00(r7, AnonymousClass05K.A15, j);
            i = -1486879032;
        } else {
            AnonymousClass4DH r9 = r5.A00;
            Activity rootActivity = r9.getRootActivity();
            if (rootActivity == null) {
                A00(r7, AnonymousClass05K.A0D, j);
                i = -1198366184;
            } else {
                NdxStepsFilterer ndxStepsFilterer = new NdxStepsFilterer(rootActivity, userSession, r7, num3, arrayList);
                ArrayList arrayList2 = ndxStepsFilterer.A04;
                if (arrayList2.contains("contact_importer") && !ndxStepsFilterer.A02()) {
                    arrayList2.remove("contact_importer");
                }
                String A002 = AnonymousClass000.A00(1559);
                if (arrayList2.contains(A002)) {
                    C19198WPe A003 = VFP.A00(ndxStepsFilterer.A01);
                    Context applicationContext = ndxStepsFilterer.A00.getApplicationContext();
                    AnonymousClass4OA r13 = AnonymousClass4OA.UNSPECIFIED;
                    0qQ.A0A(applicationContext);
                    AnonymousClass4OB A004 = A003.A00(applicationContext, r13, "IG4A_NDX", AnonymousClass7TE.A1I(AnonymousClass4O8.UNKNOWN));
                    AnonymousClass4OB r4 = AnonymousClass4OB.GRANTED;
                    AnonymousClass35F r0 = ndxStepsFilterer.A02;
                    Integer num4 = ndxStepsFilterer.A03;
                    boolean z = true;
                    if (A004 == r4) {
                        z = false;
                    }
                    0qQ.A0B(num4, 0);
                    if (z) {
                        num = AnonymousClass05K.A00;
                    } else {
                        num = AnonymousClass05K.A01;
                    }
                    0Aj A0e = AnonymousClass7TE.A0e(r0.A00, "ig4a_ndx_request");
                    A0e.AAJ("flow_name", A002);
                    if (num.intValue() != 0) {
                        str2 = "fail_client_filter";
                    } else {
                        str2 = "pass_client_filter";
                    }
                    DbY.A1F(A0e, str2);
                    DbV.A1K(A0e, C49048EoS.A00(num4));
                    if (!z) {
                        arrayList2.remove(A002);
                    }
                }
                if (arrayList2.isEmpty()) {
                    i = -2065298308;
                } else {
                    A00(r7, AnonymousClass05K.A0u, j);
                    HashMap A1E = AnonymousClass7TE.A1E();
                    A1E.put("ndx_eligible_flows", new JSONArray(arrayList2).toString());
                    A1E.put("qp_id", "3");
                    A1E.put("family_device_id", DbT.A0P(userSession).A02(19f.A25));
                    A1E.put(Pxd.A00(189), DbV.A0t());
                    A1E.put("app_id", "567067343352427");
                    if (1 - num3.intValue() != 0) {
                        str = "NDX_IG_IMMERSIVE_A13";
                    } else {
                        str = "NDX_IG_IMMERSIVE";
                    }
                    A1E.put("ig_ndx_source", str);
                    try {
                        C229382nI A033 = C229382nI.A03(r9, userSession, (2el) null);
                        C360678ey A022 = C359988do.A02((AnonymousClass1O9) null, userSession, "com.instagram.ndx.common.push_ig_ndx_screen", A1E);
                        A022.A00(new C47556E7t(A033, r5, j));
                        r9.schedule(A022);
                        i = 1722689896;
                    } catch (IllegalStateException e) {
                        AnonymousClass7TG.A1I(0wj.A01, "ig_ndx_show_flows_error", e, 817895070);
                        A00(r7, AnonymousClass05K.A07, j);
                        AnonymousClass0fD.A0A(-103151592, A032);
                    }
                }
            }
        }
        AnonymousClass0fD.A0A(i, A032);
        AnonymousClass0fD.A0A(-160228574, A03);
    }

    public static void A00(AnonymousClass35F r2, Integer num, long j) {
        r2.A00(num, Long.valueOf(System.currentTimeMillis() - j));
    }

    public final void onFail(C268654dm r8) {
        String str;
        int A0D = AnonymousClass7TG.A0D(r8, 1336312353);
        AnonymousClass1XT A0L = DbT.A0L(r8);
        if (A0L != null) {
            str = A0L.getErrorMessage();
        } else {
            str = null;
        }
        0f9 AEf = 0wj.A01.AEf("ig_ndx_server_request_error", 817895070);
        AEf.ERJ(new Exception(str));
        AEf.report();
        this.A01.A02.A00(AnonymousClass05K.A1I, Long.valueOf(System.currentTimeMillis() - this.A00));
        AnonymousClass0fD.A0A(-1881079797, A0D);
    }
}
