package X;

import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.AbstractCollection;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public abstract class LTI {
    public static final SimpleDateFormat A00;
    public static final SimpleDateFormat A01;

    public static final String A01(0eP r6) {
        StringBuilder A0n;
        0qQ.A0B(r6, 0);
        Date date = new Date(AnonymousClass7TE.A0R(r6.A00));
        Date date2 = new Date(AnonymousClass7TE.A0R(r6.A01));
        SimpleDateFormat simpleDateFormat = A00;
        String format = simpleDateFormat.format(date);
        String format2 = simpleDateFormat.format(date2);
        SimpleDateFormat simpleDateFormat2 = A01;
        String format3 = simpleDateFormat2.format(date);
        String format4 = simpleDateFormat2.format(date2);
        if (0qQ.A0K(format, format2)) {
            boolean A0K = 0qQ.A0K(format3, format4);
            A0n = AnonymousClass7TF.A0n(format);
            A0n.append(' ');
            if (A0K) {
                A0n.append(format3);
            } else {
                A0n.append(format3);
                A0n.append(" - ");
                A0n.append(format4);
            }
        } else {
            A0n = AnonymousClass7TF.A0n(format3);
            A0n.append(' ');
            A0n.append(format);
            A0n.append(" - ");
            A0n.append(format4);
            A0n.append(' ');
            A0n.append(format2);
        }
        return A0n.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02ba, code lost:
        if (X.AnonymousClass7TF.A1Y(r5.A03, true) == false) goto L_0x02bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0121, code lost:
        r5 = r10.getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x012d, code lost:
        X.0qQ.A0A(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x017e, code lost:
        r0 = r10.getString(r1, r0);
        X.0qQ.A07(r0);
        r5.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0188, code lost:
        r5 = A00(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01e6, code lost:
        X.0qQ.A0B(r5, 0);
        r4.A06 = r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(android.content.Context r10, X.C390879rz r11, java.util.List r12) {
        /*
            r4 = 2
            X.0qQ.A0B(r11, r4)
            X.9rz r0 = X.C390879rz.MAGIC_MEDIA_REMIX
            java.util.Iterator r9 = r12.iterator()
            if (r11 != r0) goto L_0x0205
        L_0x000c:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x02eb
            java.lang.Object r4 = r9.next()
            X.Juu r4 = (X.C60998Juu) r4
            r3 = 0
            r1 = 1
            X.0qQ.A0B(r4, r1)
            java.lang.String r7 = r4.A04
            X.0eP r2 = r4.A08
            java.lang.String r6 = A01(r2)
            X.KhF r0 = r4.A01
            int r0 = r0.ordinal()
            java.lang.String r5 = ""
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r1)
            switch(r0) {
                case 0: goto L_0x0039;
                case 1: goto L_0x0132;
                case 2: goto L_0x0081;
                case 3: goto L_0x0086;
                case 4: goto L_0x011e;
                case 5: goto L_0x0126;
                case 6: goto L_0x01b9;
                default: goto L_0x0034;
            }
        L_0x0034:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0039:
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            long r7 = r0.getTimeInMillis()
            r0 = 604800000(0x240c8400, double:2.988109026E-315)
            long r7 = r7 - r0
            java.lang.Object r0 = r2.A00
            long r1 = X.AnonymousClass7TE.A0R(r0)
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x01e6
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            r0 = 2131965718(0x7f133716, float:1.9568254E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r10, r0)
            r1.add(r0)
            r0 = 2131965717(0x7f133715, float:1.9568252E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r10, r0)
            r1.add(r0)
            r0 = 2131965716(0x7f133714, float:1.956825E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r10, r0)
            r1.add(r0)
            r0 = 2131965726(0x7f13371e, float:1.956827E38)
            java.lang.String r0 = X.DbY.A0c(r10, r6, r0)
            r1.add(r0)
            java.lang.String r5 = A00(r1)
            goto L_0x01e6
        L_0x0081:
            r0 = 2131974748(0x7f135a5c, float:1.9586569E38)
            goto L_0x0121
        L_0x0086:
            java.util.Calendar r2 = X.C361828gs.A00()
            java.util.List r0 = r4.A07
            java.util.Iterator r8 = r0.iterator()
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x01ff
            com.instagram.common.gallery.Medium r0 = X.JTO.A0W(r8)
            long r0 = r0.A0D
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
        L_0x00a0:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00b8
            com.instagram.common.gallery.Medium r0 = X.JTO.A0W(r8)
            long r0 = r0.A0D
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            int r0 = r5.compareTo(r1)
            if (r0 <= 0) goto L_0x00a0
            r5 = r1
            goto L_0x00a0
        L_0x00b8:
            long r0 = r5.longValue()
            r2.setTimeInMillis(r0)
            r0 = 11
            int r1 = r2.get(r0)
            r0 = 7
            if (r0 > r1) goto L_0x0107
            r0 = 10
            if (r1 >= r0) goto L_0x00df
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            r0 = 2131965701(0x7f133705, float:1.956822E38)
            A03(r10, r7, r6, r5, r0)
            r1 = 2131965702(0x7f133706, float:1.9568221E38)
        L_0x00d9:
            java.lang.Object[] r0 = new java.lang.Object[]{r7, r6}
            goto L_0x017e
        L_0x00df:
            r0 = 12
            if (r1 < r0) goto L_0x0107
            r0 = 16
            if (r1 >= r0) goto L_0x00f5
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            r0 = 2131965719(0x7f133717, float:1.9568256E38)
            A03(r10, r7, r6, r5, r0)
            r1 = 2131965720(0x7f133718, float:1.9568258E38)
            goto L_0x00d9
        L_0x00f5:
            r0 = 21
            if (r1 >= r0) goto L_0x0115
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            r0 = 2131965705(0x7f133709, float:1.9568227E38)
            A03(r10, r7, r6, r5, r0)
            r1 = 2131965706(0x7f13370a, float:1.956823E38)
            goto L_0x00d9
        L_0x0107:
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            r0 = 2131965703(0x7f133707, float:1.9568223E38)
            A03(r10, r7, r6, r5, r0)
            r1 = 2131965704(0x7f133708, float:1.9568225E38)
            goto L_0x00d9
        L_0x0115:
            r0 = 2131965736(0x7f133728, float:1.956829E38)
            java.lang.String r5 = X.AnonymousClass7TE.A16(r10, r0)
            goto L_0x01e6
        L_0x011e:
            r0 = 2131965730(0x7f133722, float:1.9568278E38)
        L_0x0121:
            java.lang.String r5 = r10.getString(r0)
            goto L_0x012d
        L_0x0126:
            r0 = 2131965700(0x7f133704, float:1.9568217E38)
            java.lang.String r5 = X.DbV.A0u(r10, r7, r6, r0)
        L_0x012d:
            X.0qQ.A0A(r5)
            goto L_0x01e6
        L_0x0132:
            java.lang.Boolean r1 = r4.A03
            boolean r0 = X.0qQ.A0K(r1, r8)
            if (r0 == 0) goto L_0x01a1
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            r0 = 2131965710(0x7f13370e, float:1.9568238E38)
            A03(r10, r7, r6, r5, r0)
            r0 = 2131965711(0x7f13370f, float:1.956824E38)
            java.lang.String r0 = X.DbY.A0c(r10, r6, r0)
            r5.add(r0)
            r0 = 2131965713(0x7f133711, float:1.9568244E38)
            java.lang.String r0 = X.DbY.A0c(r10, r7, r0)
            r5.add(r0)
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            long r6 = r0.getTimeInMillis()
            r0 = 604800000(0x240c8400, double:2.988109026E-315)
            long r6 = r6 - r0
            java.lang.Object r0 = r2.A00
            long r1 = X.AnonymousClass7TE.A0R(r0)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x018d
            r0 = 2131965691(0x7f1336fb, float:1.95682E38)
        L_0x0171:
            java.lang.String r0 = r10.getString(r0)
            if (r0 == 0) goto L_0x0188
            r1 = 2131965714(0x7f133712, float:1.9568246E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
        L_0x017e:
            java.lang.String r0 = r10.getString(r1, r0)
            X.0qQ.A07(r0)
            r5.add(r0)
        L_0x0188:
            java.lang.String r5 = A00(r5)
            goto L_0x01e6
        L_0x018d:
            boolean r0 = A05(r4)
            if (r0 == 0) goto L_0x0197
            r0 = 2131965692(0x7f1336fc, float:1.9568201E38)
            goto L_0x0171
        L_0x0197:
            boolean r0 = A04(r4)
            if (r0 == 0) goto L_0x0188
            r0 = 2131965690(0x7f1336fa, float:1.9568197E38)
            goto L_0x0171
        L_0x01a1:
            boolean r0 = X.AnonymousClass7TF.A1Y(r1, r3)
            if (r0 == 0) goto L_0x01b2
            r0 = 2131965712(0x7f133710, float:1.9568242E38)
            java.lang.String r5 = X.DbV.A0u(r10, r7, r6, r0)
            X.0qQ.A0A(r5)
            goto L_0x01e6
        L_0x01b2:
            if (r1 == 0) goto L_0x01e6
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x01b9:
            java.lang.Boolean r0 = r4.A03
            boolean r0 = X.0qQ.A0K(r0, r8)
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            if (r0 == 0) goto L_0x01ed
            r0 = 2131965707(0x7f13370b, float:1.9568231E38)
            A03(r10, r7, r6, r2, r0)
            r0 = 2131965732(0x7f133724, float:1.9568282E38)
            A03(r10, r7, r6, r2, r0)
            r1 = 2131965728(0x7f133720, float:1.9568274E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r7, r6}
        L_0x01d8:
            java.lang.String r0 = r10.getString(r1, r0)
            X.0qQ.A07(r0)
            r2.add(r0)
            java.lang.String r5 = A00(r2)
        L_0x01e6:
            X.0qQ.A0B(r5, r3)
            r4.A06 = r5
            goto L_0x000c
        L_0x01ed:
            r0 = 2131965731(0x7f133723, float:1.956828E38)
            java.lang.String r0 = X.DbY.A0c(r10, r6, r0)
            r2.add(r0)
            r1 = 2131965727(0x7f13371f, float:1.9568272E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r6}
            goto L_0x01d8
        L_0x01ff:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L_0x0205:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x02eb
            java.lang.Object r5 = r9.next()
            X.Juu r5 = (X.C60998Juu) r5
            java.lang.String r3 = r5.A04
            X.KhF r0 = r5.A01
            int r1 = r0.ordinal()
            r2 = 0
            r6 = 1
            if (r1 == r2) goto L_0x02b1
            if (r1 == r6) goto L_0x0298
            if (r1 == r4) goto L_0x0294
            r0 = 3
            if (r1 == r0) goto L_0x023a
            r0 = 4
            if (r1 == r0) goto L_0x02c0
            java.lang.String r0 = ""
        L_0x0229:
            X.0qQ.A0B(r0, r2)
            r5.A06 = r0
            X.0eP r0 = r5.A08
            java.lang.String r0 = A01(r0)
            X.0qQ.A0B(r0, r2)
            r5.A05 = r0
            goto L_0x0205
        L_0x023a:
            java.util.Calendar r6 = X.C361828gs.A00()
            java.util.List r0 = r5.A07
            java.util.Iterator r8 = r0.iterator()
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x02e5
            com.instagram.common.gallery.Medium r0 = X.JTO.A0W(r8)
            long r0 = r0.A0D
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
        L_0x0254:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x026c
            com.instagram.common.gallery.Medium r0 = X.JTO.A0W(r8)
            long r0 = r0.A0D
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            int r0 = r7.compareTo(r1)
            if (r0 <= 0) goto L_0x0254
            r7 = r1
            goto L_0x0254
        L_0x026c:
            long r0 = r7.longValue()
            r6.setTimeInMillis(r0)
            r0 = 11
            int r6 = r6.get(r0)
            r0 = 10
            if (r6 >= r0) goto L_0x0281
            r1 = 2131974736(0x7f135a50, float:1.9586544E38)
            goto L_0x02d1
        L_0x0281:
            r0 = 12
            if (r6 >= r0) goto L_0x0289
            r1 = 2131974737(0x7f135a51, float:1.9586546E38)
            goto L_0x02d1
        L_0x0289:
            r0 = 16
            r1 = 2131974738(0x7f135a52, float:1.9586549E38)
            if (r6 >= r0) goto L_0x02d1
            r1 = 2131974742(0x7f135a56, float:1.9586557E38)
            goto L_0x02d1
        L_0x0294:
            r1 = 2131974747(0x7f135a5b, float:1.9586567E38)
            goto L_0x02d1
        L_0x0298:
            java.lang.Boolean r1 = r5.A03
            boolean r0 = X.AnonymousClass7TF.A1Y(r1, r6)
            if (r0 != 0) goto L_0x02da
            boolean r0 = X.AnonymousClass7TF.A1Y(r1, r2)
            if (r0 == 0) goto L_0x02aa
            r1 = 2131974741(0x7f135a55, float:1.9586555E38)
            goto L_0x02d1
        L_0x02aa:
            if (r1 == 0) goto L_0x02bc
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x02b1:
            java.lang.Boolean r0 = r5.A03
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r6)
            r1 = 2131974746(0x7f135a5a, float:1.9586565E38)
            if (r0 != 0) goto L_0x02d1
        L_0x02bc:
            r1 = 2131974743(0x7f135a57, float:1.9586559E38)
            goto L_0x02d1
        L_0x02c0:
            java.lang.Boolean r1 = r5.A03
            boolean r0 = X.AnonymousClass7TF.A1Y(r1, r6)
            if (r0 != 0) goto L_0x02da
            boolean r0 = X.AnonymousClass7TF.A1Y(r1, r2)
            if (r0 == 0) goto L_0x02de
            r1 = 2131974745(0x7f135a59, float:1.9586563E38)
        L_0x02d1:
            java.lang.String r0 = X.DbW.A0h(r10, r3, r1)
            X.0qQ.A0A(r0)
            goto L_0x0229
        L_0x02da:
            r1 = 2131974739(0x7f135a53, float:1.958655E38)
            goto L_0x02d1
        L_0x02de:
            if (r1 == 0) goto L_0x02bc
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x02e5:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L_0x02eb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LTI.A02(android.content.Context, X.9rz, java.util.List):void");
    }

    static {
        Locale locale = 13s.A06;
        A01 = new SimpleDateFormat("dd", locale);
        A00 = new SimpleDateFormat("MMM", locale);
    }

    public static final String A00(List list) {
        return AnonymousClass7TE.A19(list, new Random().nextInt(list.size()));
    }

    public static void A03(Context context, Object obj, Object obj2, AbstractCollection abstractCollection, int i) {
        String string = context.getString(i, new Object[]{obj, obj2});
        0qQ.A07(string);
        abstractCollection.add(string);
    }

    public static final boolean A04(C60998Juu juu) {
        Calendar A0o = JTS.A0o();
        long timeInMillis = A0o.getTimeInMillis();
        A0o.add(5, -30);
        long timeInMillis2 = A0o.getTimeInMillis();
        0eP r3 = juu.A08;
        if (AnonymousClass7TE.A0R(r3.A00) < timeInMillis2 || AnonymousClass7TE.A0R(r3.A01) > timeInMillis) {
            return false;
        }
        return true;
    }

    public static final boolean A05(C60998Juu juu) {
        Calendar A0o = JTS.A0o();
        while (A0o.get(7) != 2) {
            A0o.add(5, -1);
        }
        long timeInMillis = A0o.getTimeInMillis();
        A0o.add(5, -2);
        long timeInMillis2 = A0o.getTimeInMillis();
        0eP r3 = juu.A08;
        if (AnonymousClass7TE.A0R(r3.A00) < timeInMillis2 || AnonymousClass7TE.A0R(r3.A01) > timeInMillis) {
            return false;
        }
        return true;
    }

    public static final boolean A06(C60998Juu juu, int i, int i2) {
        Calendar A002 = C361828gs.A00();
        A002.set(2, i);
        A002.set(5, i2);
        A002.set(11, 0);
        A002.set(12, 0);
        A002.set(13, 0);
        A002.set(14, 0);
        long timeInMillis = A002.getTimeInMillis();
        long j = 86400000 + timeInMillis;
        0eP r3 = juu.A08;
        if (AnonymousClass7TE.A0R(r3.A00) < timeInMillis || AnonymousClass7TE.A0R(r3.A01) > j) {
            return false;
        }
        return true;
    }
}
