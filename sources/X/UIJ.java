package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class UIJ extends C19023WGz {
    public final C17399VUa A00;
    public final C17399VUa A01;
    public final C17400VUb A02;
    public final Map A03;
    public final W2K[] A04;

    /* JADX WARNING: type inference failed for: r0v5, types: [X.VUd, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Object, X.VQd] */
    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.VQc] */
    /* JADX WARNING: type inference failed for: r1v4, types: [java.lang.Object, X.VQd] */
    public UIJ(S7E s7e, X5t x5t, UIL uil, 0kX r15) {
        super(s7e, x5t, uil);
        C18471VsN vsN = uil.A00;
        if (vsN != null) {
            this.A00 = W0W.A00(r15, Collections.singletonList(vsN));
            this.A01 = null;
            String str = uil.A01;
            ? obj = new Object();
            obj.A02 = str;
            obj.A01 = "DUMMY_PARAM_NAME";
            C17400VUb A012 = W0W.A01(Collections.singletonList(obj));
            this.A02 = A012;
            String str2 = uil.A02;
            ? obj2 = new Object();
            obj2.A00 = "DUMMY_PARAM_NAME";
            obj2.A01 = str2;
            W2K[] A032 = W0W.A03(A012, Collections.singletonList(obj2));
            this.A04 = A032;
            List<C17303VQe> list = uil.A03;
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (C17303VQe vQe : list) {
                    ? obj3 = new Object();
                    obj3.A00 = vQe.A00;
                    ArrayList arrayList2 = new ArrayList(1);
                    obj3.A01 = arrayList2;
                    ? obj4 = new Object();
                    obj4.A01 = vQe.A01;
                    obj4.A00 = "DUMMY_PARAM_NAME";
                    arrayList2.add(obj4);
                    arrayList.add(obj3);
                }
                this.A03 = W0W.A02(A012, arrayList, A032);
                return;
            }
            throw new Exception("Missing table");
        }
        throw new Exception("Missing context in config");
    }

    public final C10384RrL EIR(VXH vxh) {
        W2K[] w2kArr;
        String str;
        C17399VUa vUa = this.A00;
        W2K[] A002 = C16776V5j.A00(vUa, vxh);
        int i = vUa.A00;
        VLQ[] vlqArr = vUa.A01;
        String[] strArr = new String[i];
        int i2 = 0;
        while (true) {
            w2kArr = null;
            if (i2 >= i) {
                break;
            }
            W2K w2k = A002[i2];
            if (w2k != null) {
                List list = vlqArr[i2].A00;
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        X5s x5s = (X5s) it.next();
                        if (x5s.CmQ(w2k)) {
                            str = x5s.getName();
                            break;
                        }
                    }
                } else {
                    str = w2k.toString().toLowerCase(Locale.US);
                }
                if (str != null) {
                    strArr[i2] = str;
                    i2++;
                }
            }
            str = "n/a";
            strArr[i2] = str;
            i2++;
        }
        C17399VUa vUa2 = this.A01;
        if (vUa2 != null) {
            w2kArr = C16776V5j.A00(vUa2, vxh);
        }
        W2K[] w2kArr2 = (W2K[]) this.A03.get(TextUtils.join(", ", strArr));
        if (w2kArr2 == null) {
            w2kArr2 = this.A04;
        }
        this.A06.EAs(this, A002, w2kArr, w2kArr2, strArr, this.A00);
        return new C10384RrL(this, w2kArr2);
    }

    public final C18556Vu8[] Aqy() {
        return this.A00.A02;
    }

    public final C18556Vu8[] BU2() {
        C17399VUa vUa = this.A01;
        if (vUa != null) {
            return vUa.A02;
        }
        return null;
    }

    public final int BaR(String str) {
        Number A14 = C51966G9m.A14("min_bitrate", this.A02.A01);
        if (A14 == null) {
            return -1;
        }
        return A14.intValue();
    }

    public UIJ(S7E s7e, X5t x5t, UIN uin, 0kX r7) {
        super(s7e, x5t, uin);
        C17399VUa vUa;
        this.A00 = W0W.A00(r7, uin.A00);
        List list = uin.A02;
        if (list == null || list.isEmpty()) {
            vUa = null;
        } else {
            vUa = W0W.A00(r7, uin.A02);
        }
        this.A01 = vUa;
        C17400VUb A012 = W0W.A01(uin.A03);
        this.A02 = A012;
        W2K[] A032 = W0W.A03(A012, uin.A01);
        this.A04 = A032;
        this.A03 = W0W.A02(A012, uin.A04, A032);
    }
}
