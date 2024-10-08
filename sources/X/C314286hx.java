package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.6hx  reason: invalid class name and case insensitive filesystem */
public abstract class C314286hx {
    public Set A03() {
        C314266hv r3 = (C314266hv) this;
        return 00k.A0j(00k.A0X(1Al.A01(r3.A01).A04(1An.A35, r3.getClass()).C1t("story_quick_reactions_recent_emojis")));
    }

    public void A06(Set set) {
        C314266hv r3 = (C314266hv) this;
        0xY AR4 = 1Al.A01(r3.A01).A04(1An.A35, r3.getClass()).AR4();
        AR4.E5h("story_quick_reactions_recent_emojis", set);
        AR4.apply();
    }

    public int A01() {
        if (this instanceof C314266hv) {
            return 37;
        }
        return 32;
    }

    public boolean A07() {
        if (this instanceof C314266hv) {
            return true;
        }
        return false;
    }

    public final ArrayList A02() {
        Set<String> A03 = A03();
        ArrayList arrayList = new ArrayList();
        for (String A00 : A03) {
            try {
                arrayList.add(AAY.parseFromJson(16P.A00(A00)));
            } catch (IOException unused) {
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public final void A04(C40291AZg aZg) {
        String str;
        String str2;
        HashSet hashSet = new HashSet(A03());
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList A02 = A02();
        String str3 = null;
        for (int i = 0; i < A02.size(); i++) {
            C40291AZg aZg2 = (C40291AZg) A02.get(i);
            if (aZg2 != null) {
                try {
                    String A00 = AAY.A00(aZg2);
                    if (A07()) {
                        C317486nL r3 = aZg2.A04;
                        r3.getClass();
                        C317486nL r2 = aZg.A04;
                        r2.getClass();
                        if (C337097fg.A01(r3, r2)) {
                            if ((this instanceof C314266hv) && i < 7) {
                                aZg.A00 = aZg2.A00;
                            }
                            str2 = AAY.A00(aZg);
                            hashSet.remove(A00);
                            hashSet.add(str2);
                            A06(hashSet);
                            return;
                        }
                    }
                    if (new C239023El(",").A02(aZg2.A00()).equals(new C239023El(",").A02(aZg.A00()))) {
                        str2 = AAY.A00(aZg);
                        hashSet.remove(A00);
                        hashSet.add(str2);
                        A06(hashSet);
                        return;
                    } else if (aZg2.A00 < currentTimeMillis) {
                        currentTimeMillis = aZg2.A00;
                        str3 = A00;
                    }
                } catch (IOException unused) {
                    continue;
                }
            }
        }
        if (hashSet.size() < A01()) {
            str = AAY.A00(aZg);
        } else if (str3 != null) {
            try {
                str = AAY.A00(aZg);
                hashSet.remove(str3);
            } catch (IOException unused2) {
                return;
            }
        } else {
            return;
        }
        hashSet.add(str);
        A06(hashSet);
    }

    public final void A05(C317486nL r4) {
        A04(new C40291AZg(r4, System.currentTimeMillis()));
    }
}
