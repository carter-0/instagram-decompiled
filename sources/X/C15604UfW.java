package X;

import com.instagram.api.schemas.ErrorIdentifier;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.UfW  reason: case insensitive filesystem */
public final class C15604UfW extends 1P0 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C15328Uac A01;

    public C15604UfW(C15328Uac uac, int i) {
        this.A01 = uac;
        this.A00 = i;
    }

    public final void onFail(C268654dm r11) {
        String str;
        String str2;
        int A0D = AnonymousClass7TG.A0D(r11, -1907046475);
        C15328Uac uac = this.A01;
        if (!uac.A0V) {
            WT7 wt7 = uac.A08;
            if (wt7 == null) {
                str2 = "userFlowLogger";
                0qQ.A0F(str2);
                throw AnonymousClass00P.createAndThrow();
            }
            long j = wt7.A00;
            if (j != 0) {
                wt7.A01.flowEndFail(j, "", (String) null);
                wt7.A00 = 0;
            }
        }
        Throwable A012 = r11.A01();
        if (A012 == null || (str = A012.getMessage()) == null) {
            str = "Unknown error";
        }
        C18662VwK vwK = uac.A07;
        if (vwK == null) {
            str2 = "adsManagerLogger";
            0qQ.A0F(str2);
            throw AnonymousClass00P.createAndThrow();
        }
        vwK.A02("promotion_list", str);
        C15328Uac.A03(uac);
        AnonymousClass0fD.A0A(1893705802, A0D);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(735732602);
        C15328Uac uac = this.A01;
        if (!uac.A0V) {
            WT7 wt7 = uac.A08;
            if (wt7 == null) {
                0qQ.A0F("userFlowLogger");
                throw AnonymousClass00P.createAndThrow();
            }
            long j = wt7.A00;
            if (j != 0) {
                wt7.A01.flowMarkPoint(j, "ads_manager_active_boosts_loaded");
            }
        }
        C15328Uac.A05(uac);
        AnonymousClass0fD.A0A(-912126223, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        String str2;
        int A03 = AnonymousClass0fD.A03(1482460794);
        C15255UXp uXp = (C15255UXp) obj;
        int A0D = AnonymousClass7TG.A0D(uXp, 806886405);
        C15328Uac uac = this.A01;
        boolean z = true;
        uac.A0S = true;
        uac.A0T = uXp.A07;
        UKM ukm = uXp.A03;
        String str3 = "adsManagerLogger";
        if (ukm != null) {
            if (!uac.A0V) {
                C18662VwK vwK = uac.A07;
                if (vwK != null) {
                    vwK.A02("promotion_list", ukm.A03);
                }
                0qQ.A0F(str3);
                throw AnonymousClass00P.createAndThrow();
            }
            if (ukm.A01 != ErrorIdentifier.ADVERTISER_SANCTIONED) {
                z = false;
            }
            uac.A0Y = z;
            uac.A0N = ukm.A02;
            UKW ukw = ukm.A00;
            if (ukw != null) {
                str2 = ukw.A03;
            } else {
                str2 = null;
            }
            uac.A0O = str2;
            if (!z) {
                C15328Uac.A03(uac);
            }
        }
        if (uXp.A03 == null || uac.A0Y) {
            uac.A02 = uXp.A01;
            uac.A00 = uXp.A00;
            uac.A03 = uXp.A02;
            uac.A0U = uXp.A06;
            List<Object> list = uXp.A04;
            if (list != null) {
                for (Object add : list) {
                    uac.A0d.add(add);
                }
            }
            List list2 = uXp.A05;
            if (list2 != null) {
                Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C19176WOi wOi = (C19176WOi) it.next();
                    String str4 = uac.A0L;
                    if (str4 == null) {
                        str4 = "";
                    }
                    wOi.A0B = str4;
                    String str5 = uac.A0P;
                    if (str5 == null) {
                        str5 = "";
                    }
                    wOi.A0L = str5;
                    C249803kO A0J = C66580MXl.A0J(wOi.ByH());
                    while (A0J.hasNext()) {
                        C19176WOi A0S = C13989Tnp.A0S(A0J);
                        String str6 = uac.A0L;
                        if (str6 == null) {
                            str6 = "";
                        }
                        A0S.A0B = str6;
                        String str7 = uac.A0P;
                        if (str7 == null) {
                            str7 = "";
                        }
                        A0S.A0L = str7;
                    }
                    uac.A0c.add(wOi);
                    C18662VwK vwK2 = uac.A07;
                    if (vwK2 == null) {
                        break;
                    }
                    if (00k.A0J(wOi.ByH()) != null) {
                        str = "view_ad_comparison_insights";
                    } else {
                        str = "view_insights";
                    }
                    String str8 = uac.A0M;
                    if (str8 == null) {
                        str3 = "entryPoint";
                        break;
                    }
                    vwK2.A06("promotion_list", str, str8);
                }
            }
            uac.A01 += this.A00;
            if (!uac.A0V) {
                C18662VwK vwK3 = uac.A07;
                if (vwK3 != null) {
                    vwK3.A03("promotion_list", (String) null);
                }
                0qQ.A0F(str3);
                throw AnonymousClass00P.createAndThrow();
            }
            C15328Uac.A08(uac);
        }
        AnonymousClass0fD.A0A(-1185894084, A0D);
        AnonymousClass0fD.A0A(-1614225237, A03);
    }
}
