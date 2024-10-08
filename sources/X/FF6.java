package X;

import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public final class FF6 {
    public TreeMap A00 = new TreeMap();
    public boolean A01;
    public final C47233DtK A02 = new C47233DtK(2131969926);
    public final C47233DtK A03 = new C47233DtK(2131969927);
    public final LinkedHashMap A04 = AnonymousClass7TE.A1H();
    public final LinkedHashMap A05 = AnonymousClass7TE.A1H();
    public final 0sP A06;
    public final C50318FXx A07 = new Object();

    public final void A03(ExW exW) {
        0qQ.A0B(exW, 0);
        LinkedHashMap linkedHashMap = this.A05;
        linkedHashMap.clear();
        linkedHashMap.putAll(exW.A01);
        TreeMap treeMap = new TreeMap(new C51566FwC((0sL) new C59343JFv(exW, 10), 10));
        this.A00 = treeMap;
        treeMap.putAll(exW.A02);
        A00(this);
    }

    public static final void A00(FF6 ff6) {
        LinkedHashMap linkedHashMap = ff6.A04;
        linkedHashMap.clear();
        linkedHashMap.put(2131969927, ff6.A03);
        LinkedHashMap linkedHashMap2 = ff6.A05;
        if (linkedHashMap2.isEmpty()) {
            linkedHashMap.put(1, ff6.A07);
        } else {
            linkedHashMap.putAll(linkedHashMap2);
        }
        ff6.A01(ff6.A01);
        linkedHashMap.put(2131969926, ff6.A02);
        linkedHashMap.putAll(ff6.A00);
        ViewModelListUpdate A0R = DbS.A0R();
        Collection values = linkedHashMap.values();
        0qQ.A07(values);
        A0R.A01(00k.A0a(values));
        ff6.A06.invoke(A0R);
    }

    private final void A01(boolean z) {
        TreeMap treeMap = this.A00;
        ArrayList A0v = DbS.A0v(treeMap.size());
        Iterator A0s = AnonymousClass7TF.A0s(treeMap);
        while (A0s.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
            int A0M = AnonymousClass7TE.A0M(A1J.getKey());
            C47246DtX dtX = (C47246DtX) A1J.getValue();
            Integer valueOf = Integer.valueOf(A0M);
            ImageUrl imageUrl = dtX.A01;
            ImageUrl imageUrl2 = dtX.A02;
            String str = dtX.A06;
            String str2 = dtX.A07;
            boolean z2 = dtX.A0B;
            String str3 = dtX.A08;
            String str4 = dtX.A05;
            Integer num = dtX.A04;
            boolean z3 = dtX.A0A;
            Integer num2 = dtX.A03;
            C2609047m r1 = dtX.A00;
            DbW.A1N(str, 2, str3);
            String str5 = str4;
            String str6 = str3;
            String str7 = str2;
            String str8 = str;
            Integer num3 = num2;
            Integer num4 = num;
            ImageUrl imageUrl3 = imageUrl2;
            ImageUrl imageUrl4 = imageUrl;
            C2609047m r17 = r1;
            AnonymousClass7TF.A1I(valueOf, new C47246DtX(r17, imageUrl4, imageUrl3, num4, num3, str8, str7, str6, str5, z2, z, z3), A0v);
        }
        this.A00.clear();
        0Yt.A0F(A0v, this.A00);
    }

    public final List A02() {
        Collection<C47246DtX> values = this.A05.values();
        0qQ.A07(values);
        ArrayList A0r = AnonymousClass7TG.A0r(values);
        for (C47246DtX dtX : values) {
            A0r.add(002.A0E(dtX.A08, '\"', '\"'));
        }
        return A0r;
    }

    public final void A04(boolean z) {
        boolean z2 = z;
        this.A01 = z2;
        LinkedHashMap linkedHashMap = this.A05;
        ArrayList A0v = DbS.A0v(linkedHashMap.size());
        Iterator A0s = AnonymousClass7TF.A0s(linkedHashMap);
        while (A0s.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
            int A0M = AnonymousClass7TE.A0M(A1J.getKey());
            C47246DtX dtX = (C47246DtX) A1J.getValue();
            Integer valueOf = Integer.valueOf(A0M);
            ImageUrl imageUrl = dtX.A01;
            ImageUrl imageUrl2 = dtX.A02;
            String str = dtX.A06;
            String str2 = dtX.A07;
            boolean z3 = dtX.A0B;
            String str3 = dtX.A08;
            String str4 = dtX.A05;
            Integer num = dtX.A04;
            boolean z4 = dtX.A0A;
            Integer num2 = dtX.A03;
            C2609047m r1 = dtX.A00;
            DbW.A1N(str, 2, str3);
            Integer num3 = num2;
            String str5 = str;
            String str6 = str2;
            ImageUrl imageUrl3 = imageUrl;
            ImageUrl imageUrl4 = imageUrl2;
            Integer num4 = num;
            C2609047m r18 = r1;
            AnonymousClass7TF.A1I(valueOf, new C47246DtX(r18, imageUrl3, imageUrl4, num4, num3, str5, str6, str3, str4, z3, z2, z4), A0v);
        }
        linkedHashMap.clear();
        0Yt.A0F(A0v, linkedHashMap);
        A01(this.A01);
        A00(this);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.FXx] */
    public FF6(0sP r3) {
        this.A06 = r3;
    }
}
