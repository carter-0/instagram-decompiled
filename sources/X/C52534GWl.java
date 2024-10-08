package X;

import com.instagram.explore.topiccluster.ExploreTopicCluster;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.GWl  reason: case insensitive filesystem */
public final class C52534GWl {
    public final C300145wb A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final List A0C;
    public final List A0D;

    public C52534GWl(C296995qz r4, C296905qq r5, ExploreTopicCluster exploreTopicCluster, 1Xj r7) {
        String str;
        String str2;
        C300145wb r0;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        List list;
        List<String> BRs;
        ArrayList arrayList = null;
        if (r7 != null) {
            str = r7.getId();
        } else {
            str = null;
        }
        this.A04 = str;
        if (exploreTopicCluster != null) {
            str2 = exploreTopicCluster.A06;
        } else {
            str2 = null;
        }
        this.A09 = str2;
        if (r7 != null) {
            r0 = r7.BR7().A00();
        } else {
            r0 = C300145wb.UNKNOWN;
        }
        this.A00 = r0;
        if (exploreTopicCluster != null) {
            str3 = C296875qn.A00(exploreTopicCluster.A00());
        } else {
            str3 = null;
        }
        this.A0B = str3;
        if (exploreTopicCluster != null) {
            str4 = exploreTopicCluster.A0A;
        } else {
            str4 = null;
        }
        this.A0A = str4;
        if (exploreTopicCluster != null) {
            str5 = exploreTopicCluster.A05;
        } else {
            str5 = null;
        }
        this.A08 = str5;
        if (r7 != null) {
            str6 = r7.A0C.getMezqlToken();
        } else {
            str6 = null;
        }
        this.A03 = str6;
        if (r7 != null) {
            str7 = r7.A0C.getAlgorithm();
        } else {
            str7 = null;
        }
        this.A01 = str7;
        if (r7 != null) {
            str8 = r7.A0C.getConnectionId();
        } else {
            str8 = null;
        }
        this.A02 = str8;
        if (r4 != null) {
            str9 = C320166rs.A01(r4.A01, r4.A00);
        } else {
            str9 = null;
        }
        this.A05 = str9;
        if (r7 != null) {
            str10 = r7.A0C.getLoggingInfoToken();
        } else {
            str10 = null;
        }
        this.A06 = str10;
        if (r5 != null) {
            str11 = C320166rs.A01(r5.A01, r5.A03);
        } else {
            str11 = null;
        }
        this.A07 = str11;
        if (r7 != null) {
            list = r7.A3g();
        } else {
            list = null;
        }
        this.A0D = list;
        if (!(r7 == null || (BRs = r7.BRs()) == null)) {
            arrayList = new ArrayList(0Yv.A1E(BRs, 10));
            for (String A002 : BRs) {
                arrayList.add(C263944Ny.A00(A002));
            }
        }
        this.A0C = arrayList;
    }
}
