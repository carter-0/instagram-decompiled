package X;

import com.instagram.music.common.model.MusicAssetBeatInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Vmz  reason: case insensitive filesystem */
public abstract class C18185Vmz {
    public static final List A01(List list, int i) {
        ArrayList arrayList;
        0qQ.A0B(list, 0);
        if (00k.A02(list) <= i) {
            arrayList = AnonymousClass7TF.A0p(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new C56077HsQ(0, AnonymousClass7TG.A0F(it)));
            }
        } else {
            int size = list.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                AnonymousClass7TF.A1M(arrayList2, 0);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it2 = 00k.A0p(list).iterator();
            while (it2.hasNext()) {
                0k0 r2 = (0k0) it2.next();
                linkedHashMap.put(Integer.valueOf(r2.A00), r2.A01);
            }
            while ((!linkedHashMap.isEmpty()) && i / linkedHashMap.size() > 0) {
                int size2 = i / linkedHashMap.size();
                Iterator A0s = AnonymousClass7TF.A0s(linkedHashMap);
                while (A0s.hasNext()) {
                    Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                    int A0M = AnonymousClass7TE.A0M(A1J.getKey());
                    int A08 = C66582MXn.A08(A1J);
                    int min = Math.min(size2, A08);
                    arrayList2.set(A0M, Integer.valueOf(AnonymousClass7TE.A0M(arrayList2.get(A0M)) + min));
                    i -= min;
                    int i3 = A08 - min;
                    if (i3 > 0) {
                        C66580MXl.A1T(Integer.valueOf(A0M), linkedHashMap, i3);
                    } else {
                        A0s.remove();
                    }
                }
            }
            arrayList = AnonymousClass7TF.A0p(arrayList2);
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                arrayList.add(new C56077HsQ(0, AnonymousClass7TG.A0F(it3)));
            }
        }
        return arrayList;
    }

    public static ArrayList A00(List list, List list2, int i, int i2) {
        ArrayList arrayList;
        List list3;
        C18036VkG vkG;
        MusicAssetBeatInfo musicAssetBeatInfo;
        C16520UwP uwP;
        int i3 = i2;
        List list4 = list;
        0qQ.A0B(list4, 0);
        if (list4.size() == 1) {
            arrayList = AnonymousClass7TF.A0p(list4);
            Iterator it = list4.iterator();
            while (it.hasNext()) {
                arrayList.add(new C56077HsQ(0, Math.min(AnonymousClass7TG.A0F(it), i3)));
            }
        } else {
            int i4 = i;
            int i5 = i3 + i;
            int i6 = 0;
            while (true) {
                list3 = list2;
                if (i6 >= list3.size() || i4 < ((MusicAssetBeatInfo) list3.get(i6)).A00) {
                    C18036VkG vkG2 = new C18036VkG(i4, i6);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put(vkG2, new 0eP(new C19874Wh1(0), new ArrayList()));
                    ArrayList A0p = AnonymousClass7TF.A0p(list4);
                    Iterator it2 = list4.iterator();
                } else {
                    i6++;
                }
            }
            C18036VkG vkG22 = new C18036VkG(i4, i6);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put(vkG22, new 0eP(new C19874Wh1(0), new ArrayList()));
            ArrayList A0p2 = AnonymousClass7TF.A0p(list4);
            Iterator it22 = list4.iterator();
            while (it22.hasNext()) {
                int A0F = AnonymousClass7TG.A0F(it22);
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                Iterator A0s = AnonymousClass7TF.A0s(linkedHashMap2);
                while (A0s.hasNext()) {
                    Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                    int i7 = ((C18036VkG) A1J.getKey()).A00;
                    C19874Wh1 wh1 = (C19874Wh1) ((0eP) A1J.getValue()).A00;
                    Collection collection = (Collection) ((0eP) A1J.getValue()).A01;
                    int size = list3.size();
                    for (int i8 = ((C18036VkG) A1J.getKey()).A01; i8 < size; i8++) {
                        int min = Math.min(((MusicAssetBeatInfo) list3.get(i8)).A00, i5);
                        int i9 = min - i7;
                        if (i9 >= 1000) {
                            C19874Wh1 wh12 = new C19874Wh1(wh1.A00);
                            int[] iArr = wh1.A01;
                            int[] iArr2 = wh12.A01;
                            0Yw.A0T(iArr, iArr2, 0, 0, iArr.length);
                            ArrayList A0U = 00k.A0U(collection);
                            if (A0F >= i9) {
                                AnonymousClass7TF.A1M(A0U, i9);
                                if (min == ((MusicAssetBeatInfo) list3.get(i8)).A00) {
                                    musicAssetBeatInfo = (MusicAssetBeatInfo) list3.get(i8);
                                } else {
                                    musicAssetBeatInfo = null;
                                }
                                wh12.A00 += i9;
                                if (musicAssetBeatInfo != null) {
                                    boolean z = musicAssetBeatInfo.A04;
                                    if (!z || !musicAssetBeatInfo.A01 || !musicAssetBeatInfo.A02) {
                                        boolean z2 = musicAssetBeatInfo.A02;
                                        if (z) {
                                            if (z2) {
                                                uwP = C16520UwP.TWO_BAR_AND_PHRASE;
                                            } else if (musicAssetBeatInfo.A01) {
                                                uwP = C16520UwP.TWO_BAR_AND_DOWN_BEAT;
                                            } else {
                                                uwP = C16520UwP.TWO_BAR;
                                            }
                                        } else if (z2) {
                                            uwP = C16520UwP.PHRASE;
                                        } else if (musicAssetBeatInfo.A01) {
                                            uwP = C16520UwP.DOWN_BEAT;
                                        } else {
                                            uwP = C16520UwP.STRONG;
                                        }
                                    } else {
                                        uwP = C16520UwP.TWO_BAR_AND_PHRASE_AND_DOWN_BEAT;
                                    }
                                    C13990Tnq.A1Z(iArr2, uwP.ordinal());
                                }
                                vkG = new C18036VkG(min, i8 + 1);
                            } else {
                                AnonymousClass7TF.A1M(A0U, A0F);
                                wh12.A00 += A0F;
                                vkG = new C18036VkG(i7 + A0F, i8);
                            }
                            if (vkG.A00 <= i5 && (!linkedHashMap3.containsKey(vkG) || wh12.compareTo((C19874Wh1) ((0eP) 0Yt.A01(vkG, linkedHashMap3)).A00) > 0)) {
                                linkedHashMap3.put(vkG, new 0eP(wh12, A0U));
                            }
                            if (A0F <= i9 || min >= i5) {
                                break;
                            }
                        }
                    }
                }
                A0p2.add(C60340gF.A00);
                linkedHashMap2 = linkedHashMap3;
            }
            Iterator A0s2 = AnonymousClass7TF.A0s(linkedHashMap2);
            C19874Wh1 wh13 = new C19874Wh1(0);
            List list5 = 0sn.A00;
            while (A0s2.hasNext()) {
                Map.Entry A1J2 = AnonymousClass7TE.A1J(A0s2);
                if (((C19874Wh1) ((0eP) A1J2.getValue()).A00).compareTo(wh13) >= 0) {
                    wh13 = (C19874Wh1) ((0eP) A1J2.getValue()).A00;
                    list5 = (List) ((0eP) A1J2.getValue()).A01;
                }
            }
            arrayList = AnonymousClass7TF.A0p(list5);
            Iterator it3 = list5.iterator();
            while (it3.hasNext()) {
                arrayList.add(new C56077HsQ(0, AnonymousClass7TG.A0F(it3)));
            }
        }
        return arrayList;
    }
}
