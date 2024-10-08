package X;

import com.instagram.common.session.UserSession;
import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.Ixz  reason: case insensitive filesystem */
public final class C58814Ixz extends 0Yg implements 0sP {
    public final /* synthetic */ 2Wb A00;
    public final /* synthetic */ 2Wa A01;
    public final /* synthetic */ 2Wa A02;
    public final /* synthetic */ C45374CvG A03;
    public final /* synthetic */ C45427Cw7 A04;
    public final /* synthetic */ C53918GwO A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ 0rm A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58814Ixz(2Wb r2, 2Wa r3, 2Wa r4, C45374CvG cvG, C45427Cw7 cw7, C53918GwO gwO, String str, String str2, 0rm r10) {
        super(1);
        this.A05 = gwO;
        this.A01 = r3;
        this.A03 = cvG;
        this.A08 = r10;
        this.A02 = r4;
        this.A07 = str;
        this.A06 = str2;
        this.A04 = cw7;
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C45397Cvd cvd;
        List<C45374CvG> list;
        C53918GwO gwO = this.A05;
        2Wa r6 = this.A01;
        C45374CvG cvG = this.A03;
        HashSet hashSet = (HashSet) this.A08.A00;
        2Wa r9 = this.A02;
        String str = this.A07;
        String str2 = this.A06;
        AnonymousClass4DU r12 = gwO.A01;
        C45427Cw7 cw7 = this.A04;
        2V1 r8 = this.A00.A00;
        if (!00k.A0u(C53918GwO.A04, str2)) {
            AbstractCollection abstractCollection = (AbstractCollection) r6.A03;
            if (abstractCollection != null && abstractCollection.contains(cvG.A03)) {
                abstractCollection.remove(cvG.A03);
            } else if (hashSet != null) {
                hashSet.add(cvG.A03);
            }
            r6.A01(hashSet);
            r9.A03(C59081J5o.A00);
            if (!"multiple".equals(str)) {
                UserSession userSession = gwO.A00;
                0qQ.A0C(hashSet, C273654mx.A00(854));
                C53918GwO.A00(r8, r9, cw7, userSession, r12, str2, hashSet);
            } else {
                List list2 = cw7.A09;
                if (!(list2 == null || (cvd = (C45397Cvd) 00k.A0O(list2, 0)) == null)) {
                    HashMap hashMap = C53918GwO.A03;
                    0qQ.A0B(hashMap, 2);
                    AbstractCollection abstractCollection2 = (AbstractCollection) hashMap.get(cvd.A01);
                    if (cvG != null) {
                        Boolean bool = cvG.A00;
                        if (bool == null || !bool.booleanValue()) {
                            List<C45374CvG> list3 = cvd.A04;
                            if (list3 != null) {
                                for (C45374CvG cvG2 : list3) {
                                    if (!0qQ.A0K(cvG.A03, cvG2.A03) && abstractCollection2 != null && abstractCollection2.contains(cvG2.A03) && AnonymousClass7TF.A1Y(cvG2.A00, true)) {
                                        abstractCollection2.remove(cvG2.A03);
                                    }
                                }
                            }
                        } else {
                            String str3 = cvG.A03;
                            if (!(abstractCollection2 == null || !abstractCollection2.contains(str3) || (list = cvd.A04) == null)) {
                                for (C45374CvG cvG3 : list) {
                                    if (!0qQ.A0K(cvG.A03, cvG3.A03)) {
                                        abstractCollection2.remove(cvG3.A03);
                                    }
                                }
                            }
                        }
                    }
                    hashMap.put(cvd.A01, abstractCollection2);
                }
            }
        }
        return C60340gF.A00;
    }
}
