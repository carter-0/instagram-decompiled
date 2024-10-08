package X;

import android.app.Activity;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.ViewConfiguration;
import com.facebook.msys.mci.TraceLogger;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9Mn  reason: invalid class name and case insensitive filesystem */
public final class C377619Mn extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377619Mn(String str, Object obj, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        UserSession userSession;
        String str;
        switch (this.A00) {
            case 0:
                AnonymousClass9IV r9 = (AnonymousClass9IV) obj;
                0qQ.A0B(r9, 0);
                C376459Ib r6 = (C376459Ib) r9.A00;
                String str2 = this.A02;
                0sP r4 = (0sP) this.A01;
                List<C335907dj> list = (List) r6.A01;
                ArrayList arrayList = new ArrayList(0Yv.A1E(list, 10));
                for (C335907dj r1 : list) {
                    arrayList.add(0qQ.A0K(r1.A0K, str2) ? r4.invoke(r1) : r1);
                }
                return AnonymousClass9IV.A00(C376459Ib.A00((C335917dk) r6.A00, arrayList, (List) r6.A02), (C335907dj) r9.A01);
            case 1:
                C351978Be r5 = ((C346607vS) this.A01).A0F;
                String str3 = this.A02;
                AnonymousClass8BA r2 = r5.A00;
                C314676if r7 = r2.A1g;
                if (((AnonymousClass8ME) r7.get()).A1V()) {
                    userSession = r2.A0v;
                    str = "has_seen_template_disclosure";
                    if (!1Au.A00(userSession).A01.getBoolean(str, false)) {
                        AEF.A02(r2.A0n, new LXK(str3, r5, 9), userSession);
                        0xY AR4 = 1Au.A00(userSession).A01.AR4();
                        AR4.E5T(str, true);
                        AR4.apply();
                        break;
                    }
                }
                if (AnonymousClass8ME.A03((AnonymousClass8ME) r7.get(), C346997w6.class) != null) {
                    userSession = r2.A0v;
                    str = "has_seen_music_pick_disclosure";
                    if (!1Au.A00(userSession).A01.getBoolean(str, false)) {
                        A14.A00(r2.A0n, new LXK(str3, r5, 10), userSession);
                        0xY AR42 = 1Au.A00(userSession).A01.AR4();
                        AR42.E5T(str, true);
                        AR42.apply();
                    }
                }
                C351978Be.A00(r5, str3);
                break;
            case 2:
                C346607vS r12 = (C346607vS) this.A01;
                C351978Be r0 = r12.A0F;
                boolean z = r12.A03;
                String str4 = this.A02;
                C357088Wk r3 = (C357088Wk) r0.A00.A1x.get();
                if (r3 != null) {
                    C357088Wk.A04(r3);
                    r3.A06.requestDisallowInterceptTouchEvent(true);
                    if (!z && !AnonymousClass8PU.A07(r3.A05)) {
                        if (!C357088Wk.A0C(new AKK(r3, 1), r3)) {
                            C357088Wk.A03(r3);
                            break;
                        }
                    } else {
                        C61362K4e k4e = new C61362K4e();
                        Bundle bundle = new Bundle();
                        bundle.putBoolean(AnonymousClass000.A00(3460), z);
                        bundle.putBoolean(AnonymousClass000.A00(2762), !AnonymousClass8BA.A0L(r3.A0A));
                        k4e.setArguments(bundle);
                        k4e.A02 = new C63709L3t(r3, str4);
                        C331127Pr r22 = new C331127Pr(r3.A05);
                        r22.A0a = false;
                        Activity activity = r3.A00;
                        r22.A0F = ViewConfiguration.get(activity).getScaledPagingTouchSlop();
                        r22.A00().A0D(activity, k4e);
                        C357088Wk.A02(C368278sM.VIEW, r3, str4, z);
                        break;
                    }
                }
                break;
            case 3:
                List list2 = (List) obj;
                0qQ.A0B(list2, 0);
                AnonymousClass7OQ.A03(((AnonymousClass7ZX) this.A01).A0g, this.A02, list2);
                break;
            case 4:
                return TraceLogger.getTraceIdForAliasId(((Number) obj).intValue(), this.A02);
            case 5:
                ((0sL) this.A01).invoke(this.A02, obj);
                break;
            case 6:
                long longValue = ((Number) obj).longValue();
                SparseIntArray sparseIntArray = 2bq.A02;
                ((2bq) this.A01).A01.flowEndFail(longValue, this.A02, "");
                break;
            case 7:
                long longValue2 = ((Number) obj).longValue();
                SparseIntArray sparseIntArray2 = 2bq.A02;
                ((2bq) this.A01).A01.flowMarkPoint(longValue2, this.A02);
                break;
            default:
                String str5 = (String) obj;
                0qQ.A0B(str5, 0);
                ((C249813kP) this.A01).A07(str5, this.A02);
                return C60340gF.A00;
        }
        return C60340gF.A00;
    }
}
