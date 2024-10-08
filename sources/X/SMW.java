package X;

import com.facebook.react.modules.intent.IntentModule;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class SMW {
    public static final char[] A00;

    static {
        char[] cArr = new char[80];
        A00 = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX WARNING: Removed duplicated region for block: B:98:0x0056 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C13475Tb2 r18, java.lang.StringBuilder r19, int r20) {
        /*
            r13 = r18
            java.util.HashSet r12 = X.AnonymousClass7TE.A1F()
            java.util.HashMap r11 = X.AnonymousClass7TE.A1E()
            java.util.TreeMap r10 = new java.util.TreeMap
            r10.<init>()
            java.lang.Class r0 = r13.getClass()
            java.lang.reflect.Method[] r4 = r0.getDeclaredMethods()
            int r2 = r4.length
            r9 = 0
            r1 = 0
        L_0x001a:
            java.lang.String r8 = "get"
            java.lang.String r7 = "has"
            java.lang.String r6 = "set"
            r3 = 3
            if (r1 >= r2) goto L_0x0052
            r5 = r4[r1]
            int r0 = r5.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 != 0) goto L_0x004b
            java.lang.String r0 = r5.getName()
            int r0 = r0.length()
            if (r0 < r3) goto L_0x004b
            java.lang.String r0 = r5.getName()
            boolean r0 = r0.startsWith(r6)
            if (r0 == 0) goto L_0x004e
            java.lang.String r0 = r5.getName()
            r12.add(r0)
        L_0x004b:
            int r1 = r1 + 1
            goto L_0x001a
        L_0x004e:
            X.Pxk.A0d(r5, r11, r10)
            goto L_0x004b
        L_0x0052:
            java.util.Iterator r18 = X.AnonymousClass7TF.A0s(r10)
        L_0x0056:
            boolean r0 = r18.hasNext()
            r5 = r19
            r4 = r20
            if (r0 == 0) goto L_0x0194
            java.util.Map$Entry r15 = X.AnonymousClass7TE.A1J(r18)
            java.lang.String r0 = X.DbT.A13(r15)
            java.lang.String r2 = r0.substring(r3)
            java.lang.String r1 = "List"
            boolean r0 = r2.endsWith(r1)
            if (r0 == 0) goto L_0x00aa
            java.lang.String r0 = "OrBuilderList"
            boolean r0 = r2.endsWith(r0)
            if (r0 != 0) goto L_0x00aa
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto L_0x00aa
            java.lang.Object r1 = r15.getValue()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            if (r1 == 0) goto L_0x00aa
            java.lang.Class r14 = r1.getReturnType()
            java.lang.Class<java.util.List> r0 = java.util.List.class
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x00aa
            int r0 = r2.length()
            int r0 = r0 + -4
        L_0x009c:
            java.lang.String r2 = r2.substring(r9, r0)
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Object r0 = X.C8424QuF.A01(r13, r1, r0)
            A01(r0, r2, r5, r4)
            goto L_0x0056
        L_0x00aa:
            java.lang.String r1 = "Map"
            boolean r0 = r2.endsWith(r1)
            if (r0 == 0) goto L_0x00e5
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto L_0x00e5
            java.lang.Object r1 = r15.getValue()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            if (r1 == 0) goto L_0x00e5
            java.lang.Class r14 = r1.getReturnType()
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x00e5
            java.lang.Class<java.lang.Deprecated> r0 = java.lang.Deprecated.class
            boolean r0 = r1.isAnnotationPresent(r0)
            if (r0 != 0) goto L_0x00e5
            int r0 = r1.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isPublic(r0)
            if (r0 == 0) goto L_0x00e5
            int r0 = r2.length()
            int r0 = r0 + -3
            goto L_0x009c
        L_0x00e5:
            java.lang.String r0 = java.lang.String.valueOf(r2)
            java.lang.String r0 = r6.concat(r0)
            boolean r0 = r12.contains(r0)
            if (r0 == 0) goto L_0x0056
            java.lang.String r0 = "Bytes"
            boolean r0 = r2.endsWith(r0)
            if (r0 == 0) goto L_0x0113
            int r0 = r2.length()
            int r0 = r0 + -5
            java.lang.String r0 = r2.substring(r9, r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r8.concat(r0)
            boolean r0 = r10.containsKey(r0)
            if (r0 != 0) goto L_0x0056
        L_0x0113:
            java.lang.Object r1 = r15.getValue()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            java.lang.String r0 = java.lang.String.valueOf(r2)
            java.lang.String r0 = r7.concat(r0)
            java.lang.Object r14 = r11.get(r0)
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14
            if (r1 == 0) goto L_0x0056
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Object r1 = X.C8424QuF.A01(r13, r1, r0)
            if (r14 != 0) goto L_0x018d
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x0141
            r0 = r1
        L_0x0136:
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
        L_0x013a:
            if (r0 == 0) goto L_0x0056
        L_0x013c:
            A01(r1, r2, r5, r4)
            goto L_0x0056
        L_0x0141:
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x014a
            int r0 = X.AnonymousClass7TE.A0M(r1)
            goto L_0x013a
        L_0x014a:
            boolean r0 = r1 instanceof java.lang.Float
            if (r0 == 0) goto L_0x0157
            float r0 = X.AnonymousClass7TE.A04(r1)
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            goto L_0x013a
        L_0x0157:
            boolean r0 = r1 instanceof java.lang.Double
            if (r0 == 0) goto L_0x0164
            long r16 = X.Pxg.A0G(r1)
            r14 = 0
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            goto L_0x013a
        L_0x0164:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x0171
            java.lang.String r0 = ""
        L_0x016a:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0056
            goto L_0x013c
        L_0x0171:
            boolean r0 = r1 instanceof X.TAN
            if (r0 == 0) goto L_0x0178
            X.TAN r0 = X.TAN.A01
            goto L_0x016a
        L_0x0178:
            boolean r0 = r1 instanceof X.C13475Tb2
            if (r0 == 0) goto L_0x0181
            X.QuE r0 = X.C8423QuE.zzb
            if (r1 == r0) goto L_0x0056
            goto L_0x013c
        L_0x0181:
            boolean r0 = r1 instanceof java.lang.Enum
            if (r0 == 0) goto L_0x013c
            r0 = r1
            java.lang.Enum r0 = (java.lang.Enum) r0
            int r0 = r0.ordinal()
            goto L_0x013a
        L_0x018d:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Object r0 = X.C8424QuF.A01(r13, r14, r0)
            goto L_0x0136
        L_0x0194:
            X.QuF r13 = (X.C8424QuF) r13
            X.SRM r3 = r13.zzc
            if (r3 == 0) goto L_0x01b3
            r2 = 0
        L_0x019b:
            int r0 = r3.A00
            if (r2 >= r0) goto L_0x01b3
            int[] r0 = r3.A02
            r0 = r0[r2]
            int r0 = r0 >>> 3
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.Object[] r0 = r3.A03
            r0 = r0[r2]
            A01(r0, r1, r5, r4)
            int r2 = r2 + 1
            goto L_0x019b
        L_0x01b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SMW.A00(X.Tb2, java.lang.StringBuilder, int):void");
    }

    public static void A01(Object obj, String str, StringBuilder sb, int i) {
        TAN tan;
        if (obj instanceof List) {
            Iterator A1H = C51966G9m.A1H(obj);
            while (A1H.hasNext()) {
                A01(A1H.next(), str, sb, i);
            }
        } else if (obj instanceof Map) {
            Iterator A0u = AnonymousClass7TF.A0u((Map) obj);
            while (A0u.hasNext()) {
                A01(A0u.next(), str, sb, i);
            }
        } else {
            sb.append(10);
            int i2 = i;
            while (i2 > 0) {
                int i3 = 80;
                if (i2 <= 80) {
                    i3 = i2;
                }
                sb.append(A00, 0, i3);
                i2 -= i3;
            }
            if (!str.isEmpty()) {
                StringBuilder A1A = AnonymousClass7TE.A1A();
                A1A.append(Character.toLowerCase(Pxe.A00(str)));
                for (int i4 = 1; i4 < str.length(); i4++) {
                    A1A.append(Character.toLowerCase(Pxj.A02(str, A1A, i4)));
                }
                str = A1A.toString();
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                TAN tan2 = TAN.A01;
                tan = new C8426QuH(((String) obj).getBytes(C10132Rn9.A03));
            } else if (obj instanceof TAN) {
                sb.append(": \"");
                tan = (TAN) obj;
            } else {
                if (obj instanceof C8424QuF) {
                    sb.append(" {");
                    A00((Sy2) obj, sb, i + 2);
                } else if (obj instanceof Map.Entry) {
                    int i5 = i + 2;
                    sb.append(" {");
                    Map.Entry entry = (Map.Entry) obj;
                    A01(entry.getKey(), "key", sb, i5);
                    A01(entry.getValue(), IntentModule.EXTRA_MAP_KEY_FOR_VALUE, sb, i5);
                } else {
                    sb.append(": ");
                    sb.append(obj);
                    return;
                }
                sb.append("\n");
                while (i > 0) {
                    int i6 = 80;
                    if (i <= 80) {
                        i6 = i;
                    }
                    sb.append(A00, 0, i6);
                    i -= i6;
                }
                sb.append("}");
                return;
            }
            sb.append(C9703RfM.A00(tan));
            sb.append('\"');
        }
    }
}
