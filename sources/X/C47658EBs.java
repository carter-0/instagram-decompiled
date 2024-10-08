package X;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.EBs  reason: case insensitive filesystem */
public final class C47658EBs extends 1P0 {
    public final /* synthetic */ G75 A00;
    public final /* synthetic */ C317826nu A01;
    public final /* synthetic */ String A02;

    public C47658EBs(G75 g75, C317826nu r2, String str) {
        this.A00 = g75;
        this.A01 = r2;
        this.A02 = str;
    }

    public final void onFail(C268654dm r5) {
        int A0D = AnonymousClass7TG.A0D(r5, 2024990259);
        G75 g75 = this.A00;
        if (g75 != null) {
            g75.onFail(002.A0R("Prefetch Failed: server onFail: ", Dbb.A0b(r5)));
        }
        C317826nu.A05(this.A01, "native auth response: failure");
        AnonymousClass0fD.A0A(-2070975137, A0D);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        ImmutableList immutableList;
        String str;
        int A03 = AnonymousClass0fD.A03(-1691593579);
        AnonymousClass3JC r14 = (AnonymousClass3JC) obj;
        int A0D = AnonymousClass7TG.A0D(r14, -80736006);
        AnonymousClass3FZ r3 = (AnonymousClass3FZ) r14.A01;
        if (r3 != null) {
            Class<C47083DqK> cls = C47083DqK.class;
            if (r3.A00(cls, "fx_growth") != null) {
                AnonymousClass3FZ A002 = r3.A00(cls, "fx_growth");
                if (A002 == null || (immutableList = A002.A02("can_user_see_ac_upsell_multi_native_auth", C47082DqJ.class)) == null) {
                    immutableList = ImmutableList.of();
                    0qQ.A07(immutableList);
                }
                C317826nu r6 = this.A01;
                Map map = r6.A03;
                String str2 = this.A02;
                boolean z = false;
                if (!(immutableList instanceof Collection) || !immutableList.isEmpty()) {
                    Iterator it = immutableList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((AnonymousClass3FZ) it.next()).A04("eligibility", EXH.A03) == EXH.A02) {
                                z = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                map.put(str2, Boolean.valueOf(z));
                Map map2 = r6.A04;
                ArrayList A0r = AnonymousClass7TG.A0r(immutableList);
                Iterator it2 = immutableList.iterator();
                while (it2.hasNext()) {
                    String A05 = ((AnonymousClass3FZ) it2.next()).A05(AnonymousClass000.A00(342));
                    if (A05 == null) {
                        A05 = "";
                    }
                    A0r.add(A05);
                }
                map2.put(str2, A0r);
                C317826nu.A04(immutableList, (ImmutableList) null, r6, str2);
                G75 g75 = this.A00;
                if (g75 != null) {
                    g75.onSuccess();
                }
                if (AnonymousClass7TF.A1Y(map.get(str2), true)) {
                    str = 002.A0R(str2, ": native auth response: eligible");
                } else {
                    str = "native auth response: ineligible";
                }
                C317826nu.A05(r6, str);
                i = 1256558642;
                AnonymousClass0fD.A0A(i, A0D);
                AnonymousClass0fD.A0A(60914369, A03);
            }
        }
        G75 g752 = this.A00;
        if (g752 != null) {
            g752.onFail("Prefetch Failed: server response.result?.fxGrowth is null");
        }
        i = -487565222;
        AnonymousClass0fD.A0A(i, A0D);
        AnonymousClass0fD.A0A(60914369, A03);
    }
}
