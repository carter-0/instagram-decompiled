package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public final class WVc implements C41841B2w {
    public int A00 = 0;
    public int A01 = 0;
    public C17493VXw A02 = new C17493VXw();
    public C18579VuV A03 = new C18579VuV();
    public int A04 = 0;
    public boolean A05 = false;
    public final String A06;
    public final HashMap A07 = new HashMap();

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009f, code lost:
        if (java.lang.Character.charCount(r9.codePointAt(r4 - 2)) != 2) goto L_0x00a1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List AVM(java.lang.String r19, boolean r20, boolean r21) {
        /*
            r18 = this;
            java.util.LinkedList r10 = new java.util.LinkedList
            r10.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1 = r19
            r0.add(r1)
            java.util.Iterator r17 = r0.iterator()
        L_0x0013:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x00d4
            java.lang.String r9 = X.AnonymousClass7TE.A18(r17)
            r11 = r18
            X.VuV r6 = r11.A03
            r8 = 0
        L_0x0022:
            int r7 = r9.length()
            if (r8 >= r7) goto L_0x0013
            int r16 = r9.codePointAt(r8)
            java.util.HashMap r1 = r11.A07
            r0 = r16
            java.lang.Object r1 = X.C51968G9o.A0z(r1, r0)
            java.lang.Number r1 = (java.lang.Number) r1
            if (r1 != 0) goto L_0x004c
        L_0x0038:
            X.VuV r6 = r11.A03
        L_0x003a:
            int r0 = java.lang.Character.charCount(r16)
            int r8 = r8 + r0
            goto L_0x0022
        L_0x0040:
            int r0 = r1.intValue()
            X.VuV r0 = r6.A00(r0)
            if (r0 != 0) goto L_0x0051
            X.VuV r6 = r6.A00
        L_0x004c:
            X.VuV r0 = r6.A06
            if (r0 == r6) goto L_0x0051
            goto L_0x0040
        L_0x0051:
            int r0 = r1.intValue()
            X.VuV r6 = r6.A00(r0)
            if (r6 == 0) goto L_0x0038
            X.VuV[] r12 = r6.A03
            if (r12 == 0) goto L_0x003a
            r5 = 0
        L_0x0060:
            int r0 = r12.length
            if (r5 >= r0) goto L_0x003a
            r0 = r12[r5]
            int r0 = r0.A04
            int r4 = r8 - r0
            int r0 = java.lang.Character.charCount(r16)
            int r4 = r4 + r0
            r0 = r12[r5]
            int r3 = r0.A04
            X.VXw r14 = r11.A02
            r1 = 2
            java.util.regex.Pattern r2 = r14.A01
            int r13 = r3 + r4
            java.lang.CharSequence r0 = r9.subSequence(r4, r13)
            boolean r0 = X.DbV.A1b(r0, r2)
            r2 = 1
            if (r0 != 0) goto L_0x00ca
            java.util.regex.Pattern r15 = r14.A00
            java.lang.CharSequence r0 = r9.subSequence(r4, r13)
            boolean r0 = X.DbV.A1b(r0, r15)
            if (r0 != 0) goto L_0x00ca
            if (r4 <= 0) goto L_0x00b0
            if (r4 <= r2) goto L_0x00a1
            int r0 = r4 + -2
            int r0 = r9.codePointAt(r0)
            int r15 = java.lang.Character.charCount(r0)
            r0 = 2
            if (r15 == r1) goto L_0x00a2
        L_0x00a1:
            r0 = 1
        L_0x00a2:
            java.util.regex.Pattern r15 = r14.A02
            int r0 = r4 - r0
            java.lang.CharSequence r0 = r9.subSequence(r0, r4)
            boolean r0 = X.DbV.A1b(r0, r15)
            if (r0 == 0) goto L_0x00d5
        L_0x00b0:
            if (r13 >= r7) goto L_0x00ca
            int r0 = r9.codePointAt(r13)
            int r0 = java.lang.Character.charCount(r0)
            if (r0 != r1) goto L_0x00bd
            r2 = 2
        L_0x00bd:
            java.util.regex.Pattern r1 = r14.A02
            int r2 = r2 + r13
            java.lang.CharSequence r0 = r9.subSequence(r13, r2)
            boolean r0 = X.DbV.A1b(r0, r1)
            if (r0 == 0) goto L_0x00d5
        L_0x00ca:
            java.lang.String r1 = r11.A06
            X.9J7 r0 = new X.9J7
            r0.<init>(r4, r3, r1)
            r10.add(r0)
        L_0x00d4:
            return r10
        L_0x00d5:
            int r5 = r5 + 1
            goto L_0x0060
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WVc.AVM(java.lang.String, boolean, boolean):java.util.List");
    }

    public final int BXR() {
        return this.A01;
    }

    public final int BXV() {
        return this.A04;
    }

    public final C295715om C1X() {
        return C295715om.A05;
    }

    public final void Ezd() {
        this.A07.clear();
        this.A05 = false;
        this.A00 = 0;
        this.A04 = 0;
        this.A01 = 0;
        this.A03 = new C18579VuV();
    }

    public final void FL6(List list, List list2, List list3) {
        if (this.A05) {
            EpX(list3);
        }
    }

    public WVc(String str) {
        this.A06 = str;
    }

    public final void EpX(List list) {
        C18579VuV vuV;
        C18579VuV vuV2;
        Ezd();
        this.A04 = list.size();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A18 = AnonymousClass7TE.A18(it);
            Locale locale = Locale.ROOT;
            String lowerCase = A18.toLowerCase(locale).toLowerCase(locale);
            C18579VuV vuV3 = this.A03;
            int i = 0;
            while (i < lowerCase.length()) {
                int codePointAt = lowerCase.codePointAt(i);
                HashMap hashMap = this.A07;
                Integer valueOf = Integer.valueOf(codePointAt);
                Number A0z = JTO.A0z(valueOf, hashMap);
                if (A0z == null && (A0z = JTO.A0z(valueOf, hashMap)) == null) {
                    A0z = Integer.valueOf(this.A00);
                    hashMap.put(valueOf, A0z);
                    this.A00++;
                }
                int intValue = A0z.intValue();
                int charCount = Character.charCount(codePointAt);
                List list2 = vuV3.A01;
                if (list2 == null) {
                    list2 = new LinkedList();
                    vuV3.A01 = list2;
                }
                BitSet bitSet = vuV3.A08;
                if (!bitSet.get(intValue)) {
                    bitSet.set(intValue);
                    vuV2 = new C18579VuV(vuV3, vuV3.A07, intValue, charCount);
                    List list3 = vuV3.A01;
                    int i2 = 0;
                    for (int nextSetBit = bitSet.nextSetBit(0); nextSetBit < intValue; nextSetBit = bitSet.nextSetBit(nextSetBit + 1)) {
                        i2++;
                    }
                    list3.add(i2, vuV2);
                } else {
                    int i3 = 0;
                    for (int nextSetBit2 = bitSet.nextSetBit(0); nextSetBit2 < intValue; nextSetBit2 = bitSet.nextSetBit(nextSetBit2 + 1)) {
                        i3++;
                    }
                    vuV2 = (C18579VuV) list2.get(i3);
                }
                vuV3 = vuV2;
                this.A01++;
                i += Character.charCount(codePointAt);
            }
            if (vuV3 != null) {
                if (vuV3.A02 == null) {
                    HashSet hashSet = new HashSet();
                    vuV3.A02 = hashSet;
                    C18579VuV[] vuVArr = vuV3.A03;
                    if (vuVArr != null) {
                        hashSet.addAll(Arrays.asList(vuVArr));
                    }
                }
                vuV3.A02.add(vuV3);
            }
        }
        List list4 = this.A03.A01;
        if (list4 != null) {
            LinkedList linkedList = new LinkedList();
            LinkedList linkedList2 = new LinkedList();
            linkedList.addAll(list4);
            while (!linkedList.isEmpty()) {
                C18579VuV vuV4 = (C18579VuV) linkedList.removeFirst();
                vuV4.A00 = this.A03;
                linkedList2.add(vuV4);
            }
            while (!linkedList2.isEmpty()) {
                C18579VuV vuV5 = (C18579VuV) linkedList2.removeFirst();
                List<C18579VuV> list5 = vuV5.A01;
                if (list5 != null) {
                    for (C18579VuV vuV6 : list5) {
                        linkedList2.addLast(vuV6);
                        C18579VuV vuV7 = vuV5.A00;
                        while (vuV7.A06 != vuV7 && vuV7.A00(vuV6.A05) == null) {
                            vuV7 = vuV7.A00;
                        }
                        C18579VuV A002 = vuV7.A00(vuV6.A05);
                        if (A002 != null) {
                            vuV = A002;
                        } else {
                            vuV = this.A03;
                        }
                        vuV6.A00 = vuV;
                        if (A002 != null) {
                            C18579VuV[] vuVArr2 = A002.A03;
                            if (vuVArr2 != null && A002.A02 == null) {
                                HashSet hashSet2 = new HashSet();
                                A002.A02 = hashSet2;
                                hashSet2.addAll(Arrays.asList(vuVArr2));
                            }
                            Collection collection = A002.A02;
                            if (collection != null) {
                                Set set = vuV6.A02;
                                if (set == null) {
                                    set = new HashSet(collection);
                                    vuV6.A02 = set;
                                    C18579VuV[] vuVArr3 = vuV6.A03;
                                    if (vuVArr3 != null) {
                                        collection = Arrays.asList(vuVArr3);
                                    }
                                }
                                set.addAll(collection);
                            }
                        }
                    }
                }
            }
        }
        LinkedList linkedList3 = new LinkedList();
        linkedList3.add(this.A03);
        while (!linkedList3.isEmpty()) {
            C18579VuV vuV8 = (C18579VuV) linkedList3.removeFirst();
            List list6 = vuV8.A01;
            if (list6 != null) {
                linkedList3.addAll(list6);
            }
            List list7 = vuV8.A01;
            if (list7 != null && !(list7 instanceof ArrayList)) {
                vuV8.A01 = new ArrayList(list7);
            }
            Set set2 = vuV8.A02;
            if (set2 != null) {
                vuV8.A03 = (C18579VuV[]) set2.toArray(new C18579VuV[set2.size()]);
                vuV8.A02 = null;
            }
        }
        this.A05 = true;
    }
}
