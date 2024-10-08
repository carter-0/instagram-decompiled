package X;

import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.feed.audio.AudioIntf;
import java.util.Collections;
import java.util.List;

/* renamed from: X.47v  reason: invalid class name and case insensitive filesystem */
public final class C2609947v {
    public int A00 = 0;
    public C282485Dg A01;
    public 1Xj A02;
    @Deprecated
    public AnonymousClass3Q2 A03;
    public Integer A04;
    public Integer A05;
    public Long A06;
    public String A07;
    public String A08;
    public List A09;

    public final Integer A00() {
        1Xj r0 = this.A02;
        if (r0 == null || r0.A0C.AdR() == null || this.A02.A0C.AdR().AzI() == null) {
            return this.A04;
        }
        return Integer.valueOf(this.A02.A0C.AdR().AzI().intValue());
    }

    public final Integer A01() {
        int i;
        1Xj r0 = this.A02;
        if (r0 == null) {
            return this.A05;
        }
        AudioIntf AdR = r0.A0C.AdR();
        AdR.getClass();
        Integer CGE = AdR.CGE();
        if (CGE != null) {
            i = IgNetworkConsentStorage.MAX_ENTRIES / CGE.intValue();
        } else {
            i = 100;
        }
        return Integer.valueOf(i);
    }

    public final String A02() {
        C273744n7 r1;
        AnonymousClass3Q2 r12 = this.A03;
        if (r12 == null || (r1 = r12.A1L) == null) {
            return null;
        }
        return r1.A01;
    }

    public final List A03() {
        1Xj r0 = this.A02;
        if (r0 != null) {
            AudioIntf AdR = r0.A0C.AdR();
            AdR.getClass();
            if (AdR.CGD() != null) {
                List unmodifiableList = Collections.unmodifiableList(AdR.CGD());
                0qQ.A07(unmodifiableList);
                return unmodifiableList;
            }
            Long AzI = AdR.AzI();
            if (AzI != null) {
                long longValue = AzI.longValue();
                if (longValue < 4500) {
                    List list = C55337Hg5.A00;
                    return list.subList(0, (int) Math.ceil(((double) list.size()) * ((double) (longValue / 4500))));
                }
            }
            return C55337Hg5.A00;
        }
        List list2 = this.A09;
        if (list2 != null) {
            return Collections.unmodifiableList(list2);
        }
        return null;
    }

    public C2609947v(AnonymousClass3Q2 r4, List list, int i, int i2) {
        boolean z = false;
        02V.A05(r4.A1G == 1iA.A07 ? true : z);
        this.A03 = r4;
        this.A07 = r4.A35;
        this.A04 = Integer.valueOf(i);
        this.A09 = list;
        this.A05 = Integer.valueOf(i2);
    }

    public C2609947v() {
    }
}
