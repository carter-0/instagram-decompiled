package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.ViX  reason: case insensitive filesystem */
public final class C17942ViX {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public List A0B;
    public List A0C;
    public final C21045XAz A0D;

    public final UNZ A00() {
        ArrayList arrayList;
        Integer num = this.A02;
        String str = this.A04;
        String str2 = this.A05;
        Boolean bool = this.A00;
        String str3 = this.A06;
        List list = this.A0B;
        ArrayList arrayList2 = null;
        if (list != null) {
            arrayList = AnonymousClass7TF.A0p(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C13991Tnr.A1Q(arrayList, it);
            }
        } else {
            arrayList = null;
        }
        String str4 = this.A07;
        String str5 = this.A08;
        String str6 = this.A09;
        List list2 = this.A0C;
        if (list2 != null) {
            arrayList2 = AnonymousClass7TF.A0p(list2);
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                C13991Tnr.A1Q(arrayList2, it2);
            }
        }
        return new UNZ(bool, this.A01, num, this.A03, str, str2, str3, str4, str5, str6, this.A0A, arrayList, arrayList2);
    }

    public C17942ViX(UNZ unz) {
        this.A0D = unz;
        this.A02 = unz.A02;
        this.A04 = unz.A04;
        this.A05 = unz.A05;
        this.A00 = unz.A00;
        this.A06 = unz.A06;
        this.A0B = unz.A0B;
        this.A07 = unz.A07;
        this.A08 = unz.A08;
        this.A09 = unz.A09;
        this.A0C = unz.A0C;
        this.A0A = unz.A0A;
        this.A03 = unz.A03;
        this.A01 = unz.A01;
    }
}
