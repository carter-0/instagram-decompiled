package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public final class DEX implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AnonymousClass4DU A02;
    public final /* synthetic */ C42124BIc A03;
    public final /* synthetic */ C255773uh A04;
    public final /* synthetic */ C250973mM A05;
    public final /* synthetic */ C309426Yf A06;
    public final /* synthetic */ C307286Pn A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ boolean A09;

    public DEX(UserSession userSession, AnonymousClass4DU r2, C42124BIc bIc, C255773uh r4, C250973mM r5, C309426Yf r6, C307286Pn r7, String str, int i, boolean z) {
        this.A08 = str;
        this.A03 = bIc;
        this.A00 = i;
        this.A09 = z;
        this.A07 = r7;
        this.A01 = userSession;
        this.A05 = r5;
        this.A04 = r4;
        this.A06 = r6;
        this.A02 = r2;
    }

    public final void onClick(View view) {
        int i;
        String str;
        int A052 = AnonymousClass0fD.A05(1570910981);
        HashSet hashSet = C307976Sf.A06;
        String str2 = this.A08;
        if (hashSet.contains(str2)) {
            i = 136391628;
        } else {
            C307976Sf.A03 = true;
            C42124BIc bIc = this.A03;
            C42103BHg bHg = null;
            List<C42103BHg> list = bIc.A04;
            if (list != null) {
                bHg = (C42103BHg) list.get(this.A00);
            }
            HashMap hashMap = C307976Sf.A05;
            String str3 = bIc.A01;
            AbstractCollection abstractCollection = (AbstractCollection) hashMap.get(str3);
            if (bHg != null) {
                if (abstractCollection != null) {
                    String str4 = bHg.A03;
                    if (abstractCollection.contains(str4)) {
                        abstractCollection.remove(str4);
                    }
                } else {
                    abstractCollection = AnonymousClass7TE.A1F();
                }
                abstractCollection.add(bHg.A03);
                String str5 = str3;
                if (str3 == null) {
                    str5 = "";
                }
                hashMap.put(str5, abstractCollection);
            }
            if (this.A09) {
                AbstractCollection abstractCollection2 = (AbstractCollection) hashMap.get(str3);
                if (bHg != null) {
                    Boolean bool = bHg.A00;
                    if (bool == null || !bool.booleanValue()) {
                        String str6 = bHg.A03;
                        if (!(str6 == null || list == null)) {
                            for (C42103BHg bHg2 : list) {
                                String str7 = bHg2.A03;
                                if (!0qQ.A0K(str6, str7) && abstractCollection2 != null && abstractCollection2.contains(str7) && AnonymousClass7TF.A1Y(bHg2.A00, true)) {
                                    abstractCollection2.remove(str7);
                                }
                            }
                        }
                    } else {
                        String str8 = bHg.A03;
                        if (!(str8 == null || abstractCollection2 == null || !abstractCollection2.contains(str8) || list == null)) {
                            for (C42103BHg bHg3 : list) {
                                String str9 = bHg3.A03;
                                if (!str8.equals(str9)) {
                                    abstractCollection2.remove(str9);
                                }
                            }
                        }
                    }
                }
                if (str3 == null) {
                    str3 = "";
                }
                hashMap.put(str3, abstractCollection2);
                C307286Pn r6 = this.A07;
                C307976Sf.A03(bIc, r6, str2, true);
                UserSession userSession = this.A01;
                C250973mM r4 = this.A05;
                C307976Sf.A02(userSession, this.A02, this.A04, r4, this.A06, r6, false);
            } else {
                C307286Pn r8 = this.A07;
                UserSession userSession2 = this.A01;
                C250973mM r62 = this.A05;
                C255773uh r5 = this.A04;
                C309426Yf r7 = this.A06;
                AnonymousClass4DU r42 = this.A02;
                C307976Sf.A02(userSession2, r42, r5, r62, r7, r8, false);
                AnonymousClass3IB r2 = r62.A0H.A0I;
                if (r2 == null || (str = r2.A06) == null) {
                    str = "";
                }
                C307976Sf.A01(userSession2, r42, r2, str);
            }
            i = -1113854137;
        }
        AnonymousClass0fD.A0C(i, A052);
    }
}
