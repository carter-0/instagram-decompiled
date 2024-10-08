package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.6S1  reason: invalid class name */
public final class AnonymousClass6S1 implements C276744tp {
    public final C276744tp A00;

    public AnonymousClass6S1(C276744tp r1) {
        this.A00 = r1;
    }

    public final Object ASw(C307896Rx r10, AnonymousClass6Tm r11, String str) {
        int i = 0;
        switch (str.hashCode()) {
            case -1882328740:
                if (str.equals("bk.action.f32.Sqrt")) {
                    return Q0A.A00(Math.sqrt(((Number) r11.A03(0)).doubleValue()));
                }
                break;
            case -1666855539:
                if (str.equals("bk.action.string.ToUpperCase")) {
                    return ((String) r11.A00.get(0)).toUpperCase(Locale.ROOT);
                }
                break;
            case -1606945202:
                if (str.equals("bk.action.array.Reduce")) {
                    List list = r11.A00;
                    List list2 = (List) list.get(0);
                    C280064zw r8 = (C280064zw) r11.A03(1);
                    Object obj = list.get(2);
                    if (list2 != null) {
                        int i2 = 0;
                        while (i2 < list2.size()) {
                            C308276Tl r1 = new C308276Tl();
                            r1.A03(obj, 0);
                            r1.A03(list2.get(i2), 1);
                            r1.A03(Integer.valueOf(i2), 2);
                            try {
                                obj = AnonymousClass6Tn.A00(r10, new AnonymousClass6Tm(r1.A00), r8.A00);
                                i2++;
                            } catch (AnonymousClass6QV e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                    return obj;
                }
                break;
            case -1225336055:
                if (str.equals("bk.action.string.Contains")) {
                    return Boolean.valueOf(((String) r11.A03(0)).contains((String) r11.A03(1)));
                }
                break;
            case -965327084:
                if (str.equals("bk.action.string.Join")) {
                    List list3 = r11.A00;
                    String str2 = (String) list3.get(0);
                    list3.get(1);
                    List list4 = (List) list3.get(1);
                    if (str2 != null) {
                        StringBuilder sb = new StringBuilder();
                        while (i < list4.size()) {
                            String str3 = (String) list4.get(i);
                            if (str3 != null) {
                                sb.append(str3);
                                if (i < list4.size() - 1) {
                                    sb.append(str2);
                                }
                                i++;
                            } else {
                                throw new IllegalArgumentException("element must not be null");
                            }
                        }
                        return sb.toString();
                    }
                    throw new IllegalArgumentException("delimeter must not be null");
                }
                break;
            case -240276909:
                if (str.equals("bk.action.map.Merge")) {
                    HashMap hashMap = new HashMap();
                    while (true) {
                        List list5 = r11.A00;
                        if (i >= list5.size()) {
                            return hashMap;
                        }
                        Map map = (Map) list5.get(i);
                        if (map != null) {
                            hashMap.putAll(map);
                        }
                        i++;
                    }
                }
                break;
            case 944474301:
                if (str.equals("bk.action.map.Filter")) {
                    C280064zw r3 = (C280064zw) r11.A03(1);
                    HashMap hashMap2 = new HashMap();
                    for (Map.Entry entry : ((Map) r11.A03(0)).entrySet()) {
                        C308276Tl r12 = new C308276Tl();
                        r12.A03(entry.getKey(), 0);
                        r12.A03(entry.getValue(), 1);
                        try {
                            if (Q0A.A01(AnonymousClass6Tn.A00(r10, new AnonymousClass6Tm(r12.A00), r3.A00))) {
                                hashMap2.put(entry.getKey(), entry.getValue());
                            }
                        } catch (AnonymousClass6QV e2) {
                            throw new RuntimeException(e2);
                        }
                    }
                    return hashMap2;
                }
                break;
            case 975567453:
                if (str.equals("bk.action.string.ValueOfNumberInBase")) {
                    long longValue = ((Number) r11.A03(0)).longValue();
                    long intValue = (long) ((Number) r11.A03(1)).intValue();
                    if (intValue >= 2 && intValue <= 36) {
                        return Long.toString(longValue, (int) intValue);
                    }
                    throw new IllegalArgumentException("radix parameter of string.ValueOfNumberInBase must be between 2 and 36");
                }
                break;
            case 1377663097:
                if (str.equals("bk.action.map.Keys")) {
                    return new ArrayList(((Map) r11.A03(0)).keySet());
                }
                break;
            case 1395153511:
                if (str.equals("bk.action.map.Values")) {
                    return new ArrayList(((Map) r11.A03(0)).values());
                }
                break;
            case 1740388232:
                if (str.equals("bk.action.f32.Log")) {
                    return Q0A.A00(Math.log(((Number) r11.A03(0)).doubleValue()));
                }
                break;
            case 1740392092:
                if (str.equals("bk.action.f32.Pow")) {
                    return Q0A.A00(Math.pow(((Number) r11.A03(0)).doubleValue(), ((Number) r11.A03(1)).doubleValue()));
                }
                break;
            case 1867263777:
                if (str.equals("bk.action.string.StartsWith")) {
                    List list6 = r11.A00;
                    return Boolean.valueOf(((String) list6.get(0)).startsWith((String) list6.get(1)));
                }
                break;
            case 1890080876:
                if (str.equals("bk.action.string.ToLowerCase")) {
                    return ((String) r11.A00.get(0)).toLowerCase(Locale.ROOT);
                }
                break;
        }
        C276744tp r0 = this.A00;
        if (r0 != null) {
            return r0.ASw(r10, r11, str);
        }
        throw new RuntimeException(002.A0R("unknown function ", str));
    }
}
