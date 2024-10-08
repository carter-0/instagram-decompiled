package X;

import android.content.Context;
import com.facebook.react.modules.dialog.DialogModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.6Bc  reason: invalid class name and case insensitive filesystem */
public final class C303866Bc {
    public static final long A00 = AnonymousClass5Z7.A01(10);
    public static final C303866Bc A01 = new Object();
    public static final Pattern A02 = Pattern.compile("(\\v\\h*){2,}");

    public static final C286025Tq A01(AnonymousClass5ZB r8, String str) {
        0qQ.A0B(r8, 1);
        int i = 0;
        C303876Bd r5 = new C303876Bd(16);
        r5.A09(00p.A0g(str, "@", "", false));
        Matcher A09 = 0mp.A09(str);
        while (A09.find()) {
            String group = A09.group(1);
            if (group != null) {
                int start = A09.start(1) - i;
                int end = (A09.end(1) - 1) - i;
                r5.A06(r8, start, end);
                r5.A0A("mention_span", group, start, end);
                i++;
            }
        }
        return r5.A02();
    }

    public static final void A02(Context context, C303876Bd r42, AnonymousClass5ZB r43, String str) {
        Context context2 = context;
        0qQ.A0B(context2, 1);
        String str2 = str;
        0qQ.A0B(str2, 2);
        C268454dQ A002 = C303936Bj.A00(context2);
        Matcher matcher = 0mp.A02.matcher(str2);
        0qQ.A07(matcher);
        if (A002 != null) {
            while (matcher.find()) {
                String group = matcher.group(1);
                if (group != null) {
                    int start = matcher.start(1);
                    int end = matcher.end(1);
                    C303876Bd r12 = r42;
                    AnonymousClass5ZB r0 = r43;
                    r12.A06(r0, start, end);
                    r12.A0A("ig_mention_span", group, start, end);
                    long A012 = AnonymousClass5Z7.A01(3);
                    AnonymousClass5ZA r8 = r0.A0C;
                    long Aoz = r8.Aoz();
                    long j = r0.A01;
                    AnonymousClass5ZD r24 = r0.A08;
                    C291715hl r27 = r0.A06;
                    C291725hm r28 = r0.A07;
                    String str3 = r0.A0E;
                    C291735hn r15 = r0.A0A;
                    C291745ho r14 = r0.A0D;
                    C286155Ud r13 = r0.A09;
                    long j2 = r0.A00;
                    C291795ht r7 = r0.A0B;
                    C291805hu r6 = r0.A03;
                    C289645dx r1 = r0.A04;
                    long Aoz2 = r8.Aoz();
                    long j3 = AnonymousClass5RW.A01;
                    if (Aoz != Aoz2) {
                        r8 = AnonymousClass5Z8.A00(Aoz);
                    }
                    r12.A06(new AnonymousClass5ZB(r6, r1, A002, r27, r28, r24, r13, r15, r7, r8, r14, str3, j, A012, j2), start, start + 1);
                }
            }
        }
    }

    public static /* synthetic */ C286025Tq A00(Context context, C299725vk r40, String str, long j, boolean z) {
        boolean z2;
        0f9 r3;
        StringBuilder sb;
        int i;
        long j2 = j;
        AnonymousClass5ZB r16 = new AnonymousClass5ZB((C268454dQ) null, (C291715hl) null, (C291725hm) null, (AnonymousClass5ZD) null, (C291795ht) null, 65534, j2, 0, 0);
        String str2 = str;
        0qQ.A0B(str2, 1);
        C303876Bd r7 = new C303876Bd(16);
        Matcher matcher = A02.matcher(str2);
        long j3 = A00;
        AnonymousClass5ZC r29 = new AnonymousClass5ZC((AnonymousClass5Z3) null, (C291815hv) null, (C291825hw) null, AnonymousClass972.MUTABLE_FLAG_MASK, AnonymousClass972.MUTABLE_FLAG_MASK, 0, AnonymousClass972.MUTABLE_FLAG_MASK, j3);
        AnonymousClass5ZB r18 = new AnonymousClass5ZB((C268454dQ) null, (C291715hl) null, (C291725hm) null, (AnonymousClass5ZD) null, (C291795ht) null, 65533, 0, j3, 0);
        ArrayList arrayList = new ArrayList();
        String str3 = "";
        String str4 = str3;
        int i2 = 0;
        while (true) {
            z2 = z;
            if (!matcher.find()) {
                break;
            }
            String substring = str2.substring(i2, matcher.start());
            0qQ.A07(substring);
            AnonymousClass9IV A002 = C303886Be.A00(substring, str2.codePointCount(0, i2), j2, z2);
            C286025Tq r8 = (C286025Tq) A002.A00;
            r7.A05(r8);
            String A0R = 002.A0R(str3, r8.A00);
            C303896Bf r0 = (C303896Bf) A002.A01;
            0qQ.A0B(r0, 0);
            arrayList.addAll(r0.A00);
            C303916Bh r10 = new C303916Bh(r29, str4, r7.A00.length(), AnonymousClass972.MUTABLE_FLAG_MASK);
            List list = r7.A03;
            list.add(r10);
            r7.A02.add(r10);
            int size = list.size() - 1;
            try {
                size = r7.A00(r18);
                r7.A09(" ");
                r7.A04(size);
                str3 = 002.A0C(A0R, ' ');
                String substring2 = str2.substring(matcher.start(), matcher.end());
                0qQ.A07(substring2);
                arrayList.add(new C303926Bi(str2.codePointCount(0, matcher.start()), 1 - substring2.codePointCount(0, substring2.length())));
                i2 = matcher.end();
            } catch (Throwable th) {
                throw th;
            } finally {
                r7.A04(size);
            }
        }
        String substring3 = str2.substring(i2, str2.length());
        0qQ.A07(substring3);
        AnonymousClass9IV A003 = C303886Be.A00(substring3, str2.codePointCount(0, i2), j2, z2);
        C286025Tq r02 = (C286025Tq) A003.A00;
        r7.A05(r02);
        String A0R2 = 002.A0R(str3, r02.A00);
        C303896Bf r03 = (C303896Bf) A003.A01;
        0qQ.A0B(r03, 0);
        arrayList.addAll(r03.A00);
        Matcher A09 = 0mp.A09(A0R2);
        while (A09.find()) {
            String group = A09.group(1);
            if (group != null) {
                int start = A09.start(1);
                int end = A09.end(1);
                r7.A06(r16, start, end);
                r7.A0A("mention_span", group, start, end);
            }
        }
        A02(context, r7, r16, A0R2);
        C299725vk r2 = r40;
        if (r40 != null) {
            String str5 = r2.A02;
            if (!(str5 == null || str5.length() == 0)) {
                j2 = AnonymousClass5RW.A07;
            }
            int i3 = r2.A00;
            Iterator it = arrayList.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                C303926Bi r32 = (C303926Bi) it.next();
                if (r32.A01 <= i3) {
                    i = r32.A00;
                } else {
                    i = 0;
                }
                i4 += i;
            }
            int i5 = i3 + i4;
            0qQ.A0B(A0R2, 1);
            try {
                int length = A0R2.length();
                if (i5 < A0R2.codePointCount(0, length)) {
                    String str6 = r2.A01;
                    int length2 = str6.length();
                    int offsetByCodePoints = A0R2.offsetByCodePoints(0, i5);
                    int i6 = length2 + offsetByCodePoints;
                    if (offsetByCodePoints < length && i6 <= length) {
                        r7.A06(new AnonymousClass5ZB((C268454dQ) null, (C291715hl) null, (C291725hm) null, (AnonymousClass5ZD) null, (C291795ht) null, 65534, j2, 0, 0), offsetByCodePoints, i6);
                        r7.A0A("tag_span", str6, offsetByCodePoints, i6);
                    }
                }
            } catch (IndexOutOfBoundsException e) {
                r3 = 0wj.A01.AEf("SpanUtil::addTagAnnotation", 817899461);
                sb = new StringBuilder();
                sb.append(e.getMessage());
                if (!(!z)) {
                    A0R2 = null;
                }
                sb.append(A0R2);
                sb.append(", codePointOffset: ");
                sb.append(i5);
                r3.ABQ(DialogModule.KEY_MESSAGE, sb.toString());
                r3.report();
                return r7.A02();
            } catch (StringIndexOutOfBoundsException e2) {
                r3 = 0wj.A01.AEf("SpanUtil::addTagAnnotation", 817899461);
                sb = new StringBuilder();
                sb.append(e2.getMessage());
                if (!(!z)) {
                    A0R2 = null;
                }
                sb.append(A0R2);
                sb.append(", codePointOffset: ");
                sb.append(i5);
                r3.ABQ(DialogModule.KEY_MESSAGE, sb.toString());
                r3.report();
                return r7.A02();
            }
        }
        return r7.A02();
    }
}
