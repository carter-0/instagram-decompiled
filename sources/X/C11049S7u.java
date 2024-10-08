package X;

import com.facebook.react.modules.intent.IntentModule;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.S7u  reason: case insensitive filesystem */
public abstract class C11049S7u {
    public static final void A01(Object obj, String str, StringBuilder sb, int i) {
        String A00;
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
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                AnonymousClass5L9 r0 = AnonymousClass5L9.A02;
                A00 = C9169RRu.A00(new AnonymousClass5LA(((String) obj).getBytes(C284045Ks.A03)));
            } else if (obj instanceof AnonymousClass5L9) {
                sb.append(": \"");
                A00 = C9169RRu.A00((AnonymousClass5L9) obj);
            } else {
                String str2 = "}";
                if (obj instanceof C283985Kk) {
                    sb.append(" {");
                    A00((C283995Kl) obj, sb, i + 2);
                    sb.append("\n");
                    while (i2 < i) {
                        sb.append(' ');
                        i2++;
                    }
                } else if (obj instanceof Map.Entry) {
                    sb.append(" {");
                    Map.Entry entry = (Map.Entry) obj;
                    int i4 = i + 2;
                    A01(entry.getKey(), "key", sb, i4);
                    A01(entry.getValue(), IntentModule.EXTRA_MAP_KEY_FOR_VALUE, sb, i4);
                    sb.append("\n");
                    while (i2 < i) {
                        sb.append(' ');
                        i2++;
                    }
                } else {
                    sb.append(": ");
                    str2 = obj.toString();
                }
                sb.append(str2);
                return;
            }
            sb.append(A00);
            sb.append('\"');
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006f, code lost:
        if (r1.getReturnType().equals(java.util.List.class) != false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0071, code lost:
        r7 = X.AnonymousClass7TE.A1A();
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007a, code lost:
        if (r6 >= r9.length()) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007c, code lost:
        r7.append(java.lang.Character.toLowerCase(X.Pxj.A02(r9, r7, r6)));
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008a, code lost:
        A01(X.C283985Kk.A00(r13, r1, new java.lang.Object[0]), r7.toString(), r14, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d8, code lost:
        if (java.lang.reflect.Modifier.isPublic(r1.getModifiers()) != false) goto L_0x0071;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C284005Km r13, java.lang.StringBuilder r14, int r15) {
        /*
            java.util.HashMap r5 = X.AnonymousClass7TE.A1E()
            java.util.HashMap r4 = X.AnonymousClass7TE.A1E()
            java.util.TreeSet r8 = new java.util.TreeSet
            r8.<init>()
            java.lang.Class r0 = r13.getClass()
            java.lang.reflect.Method[] r7 = r0.getDeclaredMethods()
            int r6 = r7.length
            r3 = 0
            r1 = 0
        L_0x0018:
            java.lang.String r2 = "get"
            if (r1 >= r6) goto L_0x0024
            r0 = r7[r1]
            X.Pxk.A0c(r0, r8, r4, r5)
            int r1 = r1 + 1
            goto L_0x0018
        L_0x0024:
            java.util.Iterator r12 = r8.iterator()
        L_0x0028:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x01ac
            java.lang.String r10 = X.AnonymousClass7TE.A18(r12)
            java.lang.String r7 = ""
            java.lang.String r8 = r10.replaceFirst(r2, r7)
            java.lang.String r1 = "List"
            boolean r0 = r8.endsWith(r1)
            r6 = 1
            if (r0 == 0) goto L_0x0098
            java.lang.String r0 = "OrBuilderList"
            boolean r0 = r8.endsWith(r0)
            if (r0 != 0) goto L_0x0098
            boolean r0 = r8.equals(r1)
            if (r0 != 0) goto L_0x0098
            java.lang.String r1 = X.Pxi.A0i(r8)
            int r0 = r8.length()
            int r0 = r0 + -4
            java.lang.String r9 = X.Pxi.A0Z(r6, r0, r8, r1)
            java.lang.Object r1 = r5.get(r10)
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            if (r1 == 0) goto L_0x0098
            java.lang.Class r11 = r1.getReturnType()
            java.lang.Class<java.util.List> r0 = java.util.List.class
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0098
        L_0x0071:
            java.lang.StringBuilder r7 = X.AnonymousClass7TE.A1A()
            r6 = 0
        L_0x0076:
            int r0 = r9.length()
            if (r6 >= r0) goto L_0x008a
            char r0 = X.Pxj.A02(r9, r7, r6)
            char r0 = java.lang.Character.toLowerCase(r0)
            r7.append(r0)
            int r6 = r6 + 1
            goto L_0x0076
        L_0x008a:
            java.lang.String r6 = r7.toString()
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Object r0 = X.C283985Kk.A00(r13, r1, r0)
            A01(r0, r6, r14, r15)
            goto L_0x0028
        L_0x0098:
            java.lang.String r1 = "Map"
            boolean r0 = r8.endsWith(r1)
            if (r0 == 0) goto L_0x00db
            boolean r0 = r8.equals(r1)
            if (r0 != 0) goto L_0x00db
            java.lang.String r1 = X.Pxi.A0i(r8)
            int r0 = r8.length()
            int r0 = r0 + -3
            java.lang.String r9 = X.Pxi.A0Z(r6, r0, r8, r1)
            java.lang.Object r1 = r5.get(r10)
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            if (r1 == 0) goto L_0x00db
            java.lang.Class r10 = r1.getReturnType()
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x00db
            java.lang.Class<java.lang.Deprecated> r0 = java.lang.Deprecated.class
            boolean r0 = r1.isAnnotationPresent(r0)
            if (r0 != 0) goto L_0x00db
            int r0 = r1.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isPublic(r0)
            if (r0 == 0) goto L_0x00db
            goto L_0x0071
        L_0x00db:
            java.lang.String r0 = "set"
            java.lang.Object r0 = X.Pxi.A0W(r0, r8, r4)
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = "Bytes"
            boolean r0 = r8.endsWith(r0)
            if (r0 == 0) goto L_0x00fe
            int r0 = r8.length()
            int r0 = r0 + -5
            java.lang.String r0 = X.Pxi.A0Z(r3, r0, r8, r2)
            boolean r0 = r5.containsKey(r0)
            if (r0 == 0) goto L_0x00fe
            goto L_0x0028
        L_0x00fe:
            java.lang.String r1 = X.Pxi.A0i(r8)
            java.lang.String r0 = r8.substring(r6)
            java.lang.String r6 = X.002.A0R(r1, r0)
            java.lang.Object r1 = X.Pxi.A0W(r2, r8, r5)
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            java.lang.String r0 = "has"
            java.lang.Object r8 = X.Pxi.A0W(r0, r8, r5)
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            if (r1 == 0) goto L_0x0028
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Object r1 = X.C283985Kk.A00(r13, r1, r0)
            if (r8 != 0) goto L_0x0196
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x0147
            boolean r0 = X.AnonymousClass7TE.A1a(r1)
            r0 = r0 ^ 1
        L_0x012c:
            if (r0 != 0) goto L_0x0028
        L_0x012e:
            java.lang.StringBuilder r8 = X.AnonymousClass7TE.A1A()
            r7 = 0
        L_0x0133:
            int r0 = r6.length()
            if (r7 >= r0) goto L_0x01a3
            char r0 = X.Pxj.A02(r6, r8, r7)
            char r0 = java.lang.Character.toLowerCase(r0)
            r8.append(r0)
            int r7 = r7 + 1
            goto L_0x0133
        L_0x0147:
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x0153
            int r0 = X.AnonymousClass7TE.A0M(r1)
        L_0x014f:
            if (r0 != 0) goto L_0x012e
            goto L_0x0028
        L_0x0153:
            boolean r0 = r1 instanceof java.lang.Float
            if (r0 == 0) goto L_0x015f
            float r7 = X.AnonymousClass7TE.A04(r1)
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            goto L_0x014f
        L_0x015f:
            boolean r0 = r1 instanceof java.lang.Double
            if (r0 == 0) goto L_0x016c
            double r9 = X.JTO.A00(r1)
            r7 = 0
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            goto L_0x014f
        L_0x016c:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 != 0) goto L_0x0176
            boolean r0 = r1 instanceof X.AnonymousClass5L9
            if (r0 == 0) goto L_0x017b
            X.5L9 r7 = X.AnonymousClass5L9.A02
        L_0x0176:
            boolean r0 = r1.equals(r7)
            goto L_0x012c
        L_0x017b:
            boolean r0 = r1 instanceof X.C284005Km
            if (r0 == 0) goto L_0x018a
            r0 = r1
            X.5Kn r0 = (X.AnonymousClass5Kn) r0
            X.5Kk r0 = r0.Avr()
            if (r1 != r0) goto L_0x012e
            goto L_0x0028
        L_0x018a:
            boolean r0 = r1 instanceof java.lang.Enum
            if (r0 == 0) goto L_0x012e
            r0 = r1
            java.lang.Enum r0 = (java.lang.Enum) r0
            int r0 = r0.ordinal()
            goto L_0x014f
        L_0x0196:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Object r0 = X.C283985Kk.A00(r13, r8, r0)
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 == 0) goto L_0x0028
            goto L_0x012e
        L_0x01a3:
            java.lang.String r0 = r8.toString()
            A01(r1, r0, r14, r15)
            goto L_0x0028
        L_0x01ac:
            X.5Kk r13 = (X.C283985Kk) r13
            X.5Ko r3 = r13.unknownFields
            if (r3 == 0) goto L_0x01cb
            r2 = 0
        L_0x01b3:
            int r0 = r3.A00
            if (r2 >= r0) goto L_0x01cb
            int[] r0 = r3.A03
            r0 = r0[r2]
            int r0 = r0 >>> 3
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.Object[] r0 = r3.A04
            r0 = r0[r2]
            A01(r0, r1, r14, r15)
            int r2 = r2 + 1
            goto L_0x01b3
        L_0x01cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11049S7u.A00(X.5Km, java.lang.StringBuilder, int):void");
    }
}
