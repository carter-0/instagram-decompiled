package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.ClipInfo;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Lj2  reason: case insensitive filesystem */
public final class C64840Lj2 implements 1NU {
    public final int A00;
    public final int A01;
    public final Object A02;

    public C64840Lj2(C65293Lqm lqm, int i, int i2) {
        this.A00 = i2;
        this.A02 = lqm;
        this.A01 = i;
    }

    public final /* bridge */ /* synthetic */ Object then(Object obj) {
        String str;
        ArrayList arrayList;
        String str2;
        Context context;
        Resources resources;
        int i;
        Object[] objArr;
        String str3;
        String str4;
        int i2 = this.A00;
        1GK r9 = (1GK) obj;
        0qQ.A0B(r9, 0);
        boolean A0D = r9.A0D();
        if (i2 == 0) {
            C65293Lqm lqm = (C65293Lqm) this.A02;
            if (A0D) {
                Context context2 = lqm.A00;
                C59689JTv.A03(context2, context2.getResources().getString(2131960324), C66579MXk.A00(301), 0);
                0wb.A04("DirectExternalMediaShareJob:PhotoShareFailure", C66579MXk.A00(626), 1);
                return null;
            }
            UserSession userSession = lqm.A01;
            DirectShareTarget directShareTarget = lqm.A03;
            AnonymousClass7Z7 A0O = JTS.A0O(userSession, directShareTarget);
            Context context3 = lqm.A00;
            Object A07 = r9.A07();
            0qQ.A0A(A07);
            C352218Cl r2 = (C352218Cl) A07;
            if (this.A01 != lqm.A05.size() - 1 || ((arrayList = lqm.A06) != null && !arrayList.isEmpty())) {
                str = null;
            } else {
                str = lqm.A04;
            }
            A0O.EMI(context3, (C254933tI) null, directShareTarget, (AnonymousClass3Q2) null, r2, str, "share_extension", (String) null, lqm.A07);
            return null;
        } else if (A0D) {
            C65293Lqm.A00((C65293Lqm) this.A02);
            return null;
        } else {
            Object A072 = r9.A07();
            0qQ.A0A(A072);
            ClipInfo clipInfo = ((L4R) A072).A00;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            int i3 = (((long) JTO.A09(clipInfo)) > timeUnit.toMillis(60) ? 1 : (((long) JTO.A09(clipInfo)) == timeUnit.toMillis(60) ? 0 : -1));
            C65293Lqm lqm2 = (C65293Lqm) this.A02;
            if (i3 > 0) {
                UserSession userSession2 = lqm2.A01;
                0Tu r22 = 0Tu.A05;
                if (182.A06(r22, userSession2, 36323895631949397L)) {
                    if (((long) JTO.A09(clipInfo)) <= timeUnit.toMillis(90)) {
                        DirectShareTarget directShareTarget2 = lqm2.A03;
                        AnonymousClass7Z7 A0O2 = JTS.A0O(userSession2, directShareTarget2);
                        Context context4 = lqm2.A00;
                        Object A073 = r9.A07();
                        0qQ.A0A(A073);
                        String str5 = ((L4R) A073).A01;
                        if (this.A01 == lqm2.A06.size() - 1) {
                            str4 = lqm2.A04;
                        } else {
                            str4 = null;
                        }
                        A0O2.EN0(context4, (QP5) null, (C254933tI) null, directShareTarget2, clipInfo, (AnonymousClass3Q2) null, (Boolean) null, str5, str4, "share_extension", (String) null, (String) null, (String) null, lqm2.A07, false, false);
                        return null;
                    }
                    context = lqm2.A00;
                    resources = context.getResources();
                    i = 2131960343;
                    objArr = new Object[1];
                    str3 = "90";
                } else if (182.A06(r22, userSession2, 36323895632014934L)) {
                    context = lqm2.A00;
                    resources = context.getResources();
                    i = 2131960343;
                    objArr = new Object[1];
                    str3 = "60";
                } else {
                    C65293Lqm.A00(lqm2);
                    return null;
                }
                objArr[0] = str3;
                C59689JTv.A03(context, resources.getString(i, objArr), "direct_share_video_too_long", 0);
                return null;
            }
            UserSession userSession3 = lqm2.A01;
            DirectShareTarget directShareTarget3 = lqm2.A03;
            AnonymousClass7Z7 A0O3 = JTS.A0O(userSession3, directShareTarget3);
            Context context5 = lqm2.A00;
            Object A074 = r9.A07();
            0qQ.A0A(A074);
            String str6 = ((L4R) A074).A01;
            if (this.A01 == lqm2.A06.size() - 1) {
                str2 = lqm2.A04;
            } else {
                str2 = null;
            }
            A0O3.EN0(context5, (QP5) null, (C254933tI) null, directShareTarget3, clipInfo, (AnonymousClass3Q2) null, (Boolean) null, str6, str2, "share_extension", (String) null, (String) null, (String) null, lqm2.A07, false, false);
            return null;
        }
    }
}
