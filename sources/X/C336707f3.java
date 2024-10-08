package X;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

/* renamed from: X.7f3  reason: invalid class name and case insensitive filesystem */
public final class C336707f3 extends C251343mx {
    public final C336557eo A00;
    public final C335477d1 A01;
    public final 0sI A02;
    public final boolean A03 = true;
    public final AnonymousClass3AS A04;
    public final AnonymousClass3B3 A05;
    public final C331097Pn A06;
    public final C249403jg A07;
    public final 2WX A08;
    public final C334327b5 A09;
    public final C336697f2 A0A;
    public final C334997cD A0B;
    public final 2Wd A0C;
    public final 2Wd A0D;
    public final 2Wd A0E;
    public final 2Wd A0F;
    public final Boolean A0G;
    public final Boolean A0H;
    public final Integer A0I;
    public final Integer A0J;
    public final List A0K;
    public final C62320sa A0L;
    public final boolean A0M;
    public final boolean A0N = true;
    public final boolean A0O = true;
    public final boolean A0P;
    public final boolean A0Q;

    public C336707f3(AnonymousClass3AS r3, AnonymousClass3B3 r4, C331097Pn r5, C249403jg r6, 2WX r7, C334327b5 r8, C336697f2 r9, C336557eo r10, C334997cD r11, C335477d1 r12, 2Wd r13, 2Wd r14, 2Wd r15, 2Wd r16, Boolean bool, Boolean bool2, Integer num, Integer num2, List list, C62320sa r22, 0sI r23, boolean z, boolean z2) {
        0qQ.A0B(r10, 37);
        this.A0A = r9;
        this.A04 = r3;
        this.A05 = r4;
        this.A0H = bool;
        this.A0G = bool2;
        this.A0E = r13;
        this.A0C = r14;
        this.A0F = r15;
        this.A0J = num;
        this.A0I = num2;
        this.A09 = r8;
        this.A06 = r5;
        this.A08 = r7;
        this.A02 = r23;
        this.A0L = r22;
        this.A01 = r12;
        this.A07 = r6;
        this.A0K = list;
        this.A0B = r11;
        this.A0P = z;
        this.A0M = true;
        this.A0D = r16;
        this.A0Q = z2;
        this.A00 = r10;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r11) {
        int i;
        int i2;
        int i3;
        0qQ.A0B(r11, 0);
        2V1 r9 = r11.A05;
        new C337557gX(r9);
        C336727f5 r0 = (C336727f5) C243643Zq.A00(r11, C336717f4.A00).A03;
        C336737f6 r5 = new C336737f6(r0, this);
        C336747f7 r4 = new C336747f7(r0, this);
        C337577gZ r7 = new C337577gZ();
        String[] strArr = {"childrenBuilder"};
        BitSet bitSet = new BitSet(1);
        bitSet.clear();
        r7.A01 = new C377189Kw(this, 21);
        bitSet.set(0);
        C62320sa r02 = this.A0L;
        if (r02 != null) {
            r7.A00 = r02;
        }
        r7.A02 = r5;
        r7.A03 = r4;
        C337607gc.A00(bitSet, strArr, 1);
        C336777fA r52 = new C336777fA(r9, new C336757f8());
        C336757f8 r42 = r52.A01;
        r42.A07 = r7;
        BitSet bitSet2 = r52.A02;
        bitSet2.set(0);
        C336697f2 r2 = this.A0A;
        r42.A08 = r2.A00;
        r42.A04 = this.A04;
        r42.A05 = this.A05;
        r42.A0G = r2.A01;
        r42.A0C = this.A0H;
        r42.A0B = this.A0G;
        2Wd r03 = this.A0E;
        if (r03 != null) {
            long j = r03.A00;
            AnonymousClass2V4 r72 = r11.Aqq().A0D;
            0qQ.A07(r72);
            i = 2Wd.A00(r72, j);
        } else {
            i = 0;
        }
        r42.A02 = i;
        2Wd r04 = this.A0C;
        if (r04 != null) {
            long j2 = r04.A00;
            AnonymousClass2V4 r73 = r11.Aqq().A0D;
            0qQ.A07(r73);
            i2 = 2Wd.A00(r73, j2);
        } else {
            i2 = 0;
        }
        r42.A00 = i2;
        2Wd r05 = this.A0F;
        if (r05 != null) {
            long j3 = r05.A00;
            AnonymousClass2V4 r74 = r11.Aqq().A0D;
            0qQ.A07(r74);
            i3 = 2Wd.A00(r74, j3);
        } else {
            i3 = 0;
        }
        r42.A03 = i3;
        r42.A0E = this.A0J;
        r42.A0D = this.A0I;
        r42.A09 = this.A09;
        r42.A06 = this.A06;
        r52.A05((AnonymousClass2VW) null);
        C249403jg r75 = this.A07;
        if (r75 != null) {
            List list = r42.A0F;
            if (list == Collections.EMPTY_LIST) {
                list = new ArrayList();
                r42.A0F = list;
            }
            list.add(r75);
        }
        List list2 = this.A0K;
        if (list2 != null) {
            if (r42.A0F.isEmpty()) {
                r42.A0F = list2;
            } else {
                r42.A0F.addAll(list2);
            }
        }
        r42.A0A = this.A0B;
        r42.A0M = this.A0Q;
        2Wd r06 = this.A0D;
        if (r06 != null) {
            int A002 = 2Wd.A00(r11.Bnf(), r06.A00);
            if (Integer.valueOf(A002) != null && A002 > 0) {
                r42.A01 = A002;
                if (r2.A02) {
                    r42.A0N = true;
                } else {
                    r42.A0H = true;
                }
                r42.A0J = this.A0N;
                r42.A0K = this.A0O;
                r42.A0L = this.A0P;
                r42.A0I = this.A0M;
            }
        }
        C244123ag.A00(r52, this.A08);
        C244113af.A00(bitSet2, r52.A03, 1);
        r52.A02();
        return r42;
    }
}
