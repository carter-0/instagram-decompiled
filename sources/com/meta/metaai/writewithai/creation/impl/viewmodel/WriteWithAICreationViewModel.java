package com.meta.metaai.writewithai.creation.impl.viewmodel;

import X.00k;
import X.02z;
import X.05G;
import X.0qQ;
import X.0sn;
import X.106;
import X.2YL;
import X.AnonymousClass0Ud;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C318116oQ;
import X.C54562HIx;
import X.C54563HIy;
import X.C54674HOf;
import X.C54675HOg;
import X.C54721HQa;
import X.C56097Hsk;
import X.C56131HtJ;
import X.C56141HtT;
import X.C56550I1e;
import X.C56551I1f;
import X.C56552I1g;
import X.C56557I1l;
import X.C56568I1x;
import X.C56661I6q;
import X.C57589IdG;
import X.C57591IdI;
import X.C57593IdK;
import X.C66147MDz;
import X.DbS;
import X.I45;
import X.MGN;
import android.app.Application;
import com.meta.foa.session.FoaUserSession;
import com.meta.metaai.writewithai.creation.impl.data.WriteSuggestionsRepository;
import java.util.ArrayList;
import java.util.List;

public final class WriteWithAICreationViewModel extends 2YL {
    public C56097Hsk A00;
    public String A01;
    public final Application A02;
    public final FoaUserSession A03;
    public final I45 A04;
    public final C56661I6q A05;
    public final WriteSuggestionsRepository A06;
    public final C56568I1x A07;
    public final 05G A08;
    public final 05G A09;
    public final 05G A0A;
    public final AnonymousClass0Ud A0B;
    public final AnonymousClass0Ud A0C;
    public final AnonymousClass0Ud A0D;

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MDz, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0076 A[EDGE_INSN: B:40:0x0076->B:19:0x0076 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(X.C54562HIx r11, com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel r12, java.lang.String r13, java.lang.String r14, X.AnonymousClass4D7 r15) {
        /*
            r7 = r12
            r9 = r14
            r2 = r11
            r4 = 26
            r5 = r15
            boolean r0 = X.C66147MDz.A02(r4, r15)
            if (r0 == 0) goto L_0x0070
            r6 = r5
            X.MDz r6 = (X.C66147MDz) r6
            int r3 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x0070
            int r3 = r3 - r1
            r6.A00 = r3
        L_0x001a:
            java.lang.Object r4 = r6.A04
            X.1Hj r5 = X.1Hj.A02
            int r0 = r6.A00
            r3 = 1
            if (r0 == 0) goto L_0x005a
            if (r0 != r3) goto L_0x00da
            java.lang.Object r2 = r6.A03
            X.HIx r2 = (X.C54562HIx) r2
            java.lang.Object r9 = r6.A02
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r7 = r6.A01
            com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel r7 = (com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel) r7
            X.0eS.A00(r4)
        L_0x0034:
            X.I1r r4 = (X.C56563I1r) r4
            java.util.List r0 = r4.A05
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r0.iterator()
        L_0x0040:
            boolean r0 = r3.hasNext()
            r15 = 0
            if (r0 == 0) goto L_0x0076
            java.lang.Object r1 = r3.next()
            r0 = r1
            X.Hsk r0 = (X.C56097Hsk) r0
            java.lang.String r0 = r0.A01
            boolean r0 = X.00l.A0W(r0)
            if (r0 != 0) goto L_0x0040
            r5.add(r1)
            goto L_0x0040
        L_0x005a:
            X.0eS.A00(r4)
            com.meta.metaai.writewithai.creation.impl.data.WriteSuggestionsRepository r1 = r12.A06
            X.I1x r0 = r12.A07
            X.I1x r0 = A00(r12, r0, r14, r6)
            r6.A03 = r11
            r6.A00 = r3
            java.lang.Object r4 = r1.A02(r0, r13, r14, r6)
            if (r4 != r5) goto L_0x0034
            return r5
        L_0x0070:
            X.MDz r6 = new X.MDz
            r6.<init>(r12, r15, r4)
            goto L_0x001a
        L_0x0076:
            r0 = 3
            java.util.List r1 = X.00k.A0d(r5, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x009b
            X.I1f r8 = r4.A00
            A04(r7, r8)
            r12 = 0
            if (r2 == 0) goto L_0x0097
            java.util.List r14 = r2.A03
            java.lang.String r10 = r2.A00
            java.lang.String r11 = r2.A01
        L_0x008f:
            java.lang.String r13 = r4.A01
            A05(r7, r8, r9, r10, r11, r12, r13, r14, r15)
        L_0x0094:
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x0097:
            r14 = r12
            r10 = r12
            r11 = r12
            goto L_0x008f
        L_0x009b:
            java.util.ArrayList r5 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r3 = r1.iterator()
        L_0x00a3:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00c5
            java.lang.Object r2 = r3.next()
            int r1 = r15 + 1
            if (r15 >= 0) goto L_0x00b9
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00b9:
            X.Hsk r2 = (X.C56097Hsk) r2
            X.IdH r0 = new X.IdH
            r0.<init>(r2, r15)
            r5.add(r0)
            r15 = r1
            goto L_0x00a3
        L_0x00c5:
            java.lang.String r3 = r4.A02
            java.lang.String r2 = r4.A03
            java.lang.String r1 = r4.A04
            java.lang.String r0 = r4.A01
            r13 = 0
            r6 = r7
            r7 = r9
            r8 = r3
            r9 = r2
            r10 = r1
            r11 = r0
            r12 = r5
            r14 = r13
            A07(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0094
        L_0x00da:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel.A01(X.HIx, com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel, java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MDz, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0074 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel r9, X.AnonymousClass4D7 r10) {
        /*
            r7 = 0
            r3 = 27
            boolean r0 = X.C66147MDz.A02(r3, r10)
            if (r0 == 0) goto L_0x0075
            r6 = r10
            X.MDz r6 = (X.C66147MDz) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0075
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0017:
            java.lang.Object r8 = r6.A04
            X.1Hj r5 = X.1Hj.A02
            int r1 = r6.A00
            r4 = 3
            r3 = 2
            r0 = 1
            if (r1 == 0) goto L_0x002e
            if (r1 == r0) goto L_0x0046
            if (r1 == r3) goto L_0x0046
            if (r1 != r4) goto L_0x007b
            X.0eS.A00(r8)
        L_0x002b:
            X.0gF r5 = X.C60340gF.A00
        L_0x002d:
            return r5
        L_0x002e:
            X.0eS.A00(r8)
            X.I1x r0 = r9.A07
            com.meta.metaai.writewithai.creation.impl.data.WriteSuggestionsRepository r1 = r9.A06
            X.I1x r0 = A00(r9, r0, r7, r6)
            r6.A03 = r7
            r6.A00 = r3
            java.lang.Object r8 = r1.A04(r0, r6)
            if (r8 == r5) goto L_0x002d
            r2 = r7
            r1 = r7
            goto L_0x0055
        L_0x0046:
            java.lang.Object r1 = r6.A03
            X.HIx r1 = (X.C54562HIx) r1
            java.lang.Object r2 = r6.A02
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r9 = r6.A01
            com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel r9 = (com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel) r9
            X.0eS.A00(r8)
        L_0x0055:
            X.0r6 r8 = (X.AnonymousClass0r6) r8
            X.Ima r0 = new X.Ima
            r0.<init>((X.C54562HIx) r1, (com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel) r9, (java.lang.String) r2, (X.AnonymousClass4D7) r7)
            X.0ro r1 = new X.0ro
            r1.<init>(r0, r8)
            X.IkO r0 = new X.IkO
            r0.<init>(r2, r9, r3)
            r6.A01 = r7
            r6.A02 = r7
            r6.A03 = r7
            r6.A00 = r4
            java.lang.Object r0 = r1.collect(r0, r6)
            if (r0 != r5) goto L_0x002b
            return r5
        L_0x0075:
            X.MDz r6 = new X.MDz
            r6.<init>(r9, r10, r3)
            goto L_0x0017
        L_0x007b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel.A02(com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel, X.4D7):java.lang.Object");
    }

    public static final void A05(WriteWithAICreationViewModel writeWithAICreationViewModel, C56551I1f i1f, String str, String str2, String str3, String str4, String str5, List list, boolean z) {
        05G r4;
        Object htT;
        WriteWithAICreationViewModel writeWithAICreationViewModel2 = writeWithAICreationViewModel;
        if (!z) {
            C56661I6q i6q = writeWithAICreationViewModel.A05;
            C56661I6q.A04(i6q, "error_message", "empty_response");
            C56661I6q.A05(i6q, "error_message", "empty_response");
            C56661I6q.A00(i6q);
            C56661I6q.A01(i6q);
        }
        C56551I1f i1f2 = i1f;
        String str6 = str;
        List list2 = list;
        if (list == null || list2.isEmpty()) {
            r4 = writeWithAICreationViewModel2.A0A;
            C56141HtT htT2 = (C56141HtT) r4.getValue();
            C54563HIy hIy = new C54563HIy(i1f);
            C56557I1l i1l = ((C56141HtT) r4.getValue()).A02;
            boolean z2 = !i1f.A01;
            htT = new C56141HtT(new C56550I1e(((C56141HtT) r4.getValue()).A00.A01, z2), hIy, new C56557I1l(i1l.A00, i1l.A03, i1l.A02, z2), htT2.A03, str, htT2.A05, htT2.A04);
        } else {
            A07(writeWithAICreationViewModel2, str6, str2, str3, str4, str5, list2, !i1f.A01, false);
            r4 = writeWithAICreationViewModel2.A08;
            htT = new C57591IdI(i1f2);
        }
        r4.Epw(htT);
    }

    public static final void A07(WriteWithAICreationViewModel writeWithAICreationViewModel, String str, String str2, String str3, String str4, String str5, List list, boolean z, boolean z2) {
        List list2 = list;
        if (z2 && list.size() < 3) {
            int size = 3 - list.size();
            ArrayList A0v = DbS.A0v(size);
            for (int i = 0; i < size; i++) {
                A0v.add(new C57589IdG((list.size() + i) - 1));
            }
            list2 = 00k.A0S(A0v, list);
        }
        C54562HIx hIx = new C54562HIx(str2, str3, str4, list2);
        05G r4 = writeWithAICreationViewModel.A0A;
        C56141HtT htT = (C56141HtT) r4.getValue();
        C56557I1l i1l = ((C56141HtT) r4.getValue()).A02;
        boolean z3 = z;
        C56557I1l i1l2 = new C56557I1l(i1l.A00, i1l.A03, i1l.A02, z3);
        r4.Epw(new C56141HtT(new C56550I1e(((C56141HtT) r4.getValue()).A00.A01, z3), hIx, i1l2, htT.A03, str, htT.A05, str5));
    }

    public /* synthetic */ WriteWithAICreationViewModel(Application application, FoaUserSession foaUserSession, C56568I1x i1x) {
        C56661I6q i6q = new C56661I6q(i1x);
        WriteSuggestionsRepository writeSuggestionsRepository = new WriteSuggestionsRepository(application, foaUserSession, i6q);
        I45 i45 = new I45(foaUserSession, i1x);
        0qQ.A0B(i1x, 3);
        this.A02 = application;
        this.A03 = foaUserSession;
        this.A07 = i1x;
        this.A05 = i6q;
        this.A06 = writeSuggestionsRepository;
        this.A04 = i45;
        C56131HtJ htJ = i1x.A02;
        String str = htJ.A02;
        String str2 = htJ.A04;
        ArrayList A0v = DbS.A0v(3);
        int i = 0;
        do {
            A0v.add(new C57589IdG(i));
            i++;
        } while (i < 3);
        C54562HIx hIx = new C54562HIx((String) null, (String) null, (String) null, A0v);
        C56552I1g i1g = i1x.A04;
        02z A10 = DbS.A10(new C56141HtT(new C56550I1e(i1g.A01, true), hIx, new C56557I1l(0sn.A00, true, true, true), new C56551I1f((String) null, true), str2, str, (String) null));
        this.A0A = A10;
        this.A0D = A10;
        02z A012 = 106.A01(A08());
        this.A09 = A012;
        this.A0C = A012;
        02z A013 = 106.A01(C57593IdK.A00);
        this.A08 = A013;
        this.A0B = A013;
    }

    public static C56568I1x A00(WriteWithAICreationViewModel writeWithAICreationViewModel, C56568I1x i1x, Object obj, C66147MDz mDz) {
        C56131HtJ htJ = i1x.A02;
        05G r1 = writeWithAICreationViewModel.A0A;
        C56568I1x A002 = C56568I1x.A00(new C56131HtJ(htJ.A00, htJ.A01, ((C56141HtT) r1.getValue()).A05, htJ.A04, htJ.A03), i1x);
        r1.getValue();
        mDz.A01 = writeWithAICreationViewModel;
        mDz.A02 = obj;
        return A002;
    }

    public static final String A03(WriteWithAICreationViewModel writeWithAICreationViewModel) {
        String A0c;
        if (writeWithAICreationViewModel.A01 == null) {
            A0c = writeWithAICreationViewModel.A07.A02.A03;
            if (A0c == null) {
                A0c = "";
            }
        } else {
            A0c = AnonymousClass7TF.A0c();
            0qQ.A0A(A0c);
        }
        writeWithAICreationViewModel.A01 = A0c;
        return A0c;
    }

    public static final void A04(WriteWithAICreationViewModel writeWithAICreationViewModel, C56551I1f i1f) {
        05G r1 = writeWithAICreationViewModel.A0A;
        C56141HtT htT = (C56141HtT) r1.getValue();
        String str = htT.A06;
        String str2 = htT.A05;
        String str3 = htT.A04;
        r1.Epw(new C56141HtT(htT.A00, htT.A01, htT.A02, i1f, str, str2, str3));
    }

    public static final void A06(WriteWithAICreationViewModel writeWithAICreationViewModel, String str, String str2, String str3) {
        WriteWithAICreationViewModel writeWithAICreationViewModel2 = writeWithAICreationViewModel;
        05G r2 = writeWithAICreationViewModel2.A0A;
        C54721HQa hQa = ((C56141HtT) r2.getValue()).A01;
        C54721HQa hQa2 = null;
        if (hQa instanceof C54562HIx) {
            hQa2 = hQa;
        }
        C56141HtT htT = (C56141HtT) r2.getValue();
        ArrayList A0v = DbS.A0v(3);
        int i = 0;
        do {
            A0v.add(new C57589IdG(i));
            i++;
        } while (i < 3);
        C54562HIx hIx = new C54562HIx((String) null, (String) null, (String) null, A0v);
        C56557I1l i1l = ((C56141HtT) r2.getValue()).A02;
        C56557I1l i1l2 = new C56557I1l(i1l.A00, i1l.A03, i1l.A02, true);
        r2.Epw(new C56141HtT(new C56550I1e(((C56141HtT) r2.getValue()).A00.A01, true), hIx, i1l2, htT.A03, str, htT.A05, htT.A04));
        writeWithAICreationViewModel2.A09.Epw(writeWithAICreationViewModel2.A08());
        String str4 = str3;
        if (str3 != null) {
            C56141HtT htT2 = (C56141HtT) r2.getValue();
            String str5 = htT2.A06;
            String str6 = htT2.A04;
            C54721HQa hQa3 = htT2.A01;
            C56557I1l i1l3 = htT2.A02;
            r2.Epw(new C56141HtT(htT2.A00, hQa3, i1l3, htT2.A03, str5, str4, str6));
        }
        AnonymousClass7TE.A1Z(new MGN(writeWithAICreationViewModel2, hQa2, str2, str, (AnonymousClass4D7) null, 23), C318116oQ.A00(writeWithAICreationViewModel2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x005e, code lost:
        if (((X.C56141HtT) r2.getValue()).A03.A01 == false) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C56145HtX A08() {
        /*
            r20 = this;
            r1 = r20
            android.app.Application r3 = r1.A02
            r0 = 2131966434(0x7f1339e2, float:1.9569706E38)
            java.lang.String r5 = X.AnonymousClass7TE.A16(r3, r0)
            X.0Ud r0 = r1.A0D
            java.lang.Object r0 = r0.getValue()
            X.HtT r0 = (X.C56141HtT) r0
            X.I1e r0 = r0.A00
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0041
            r3 = 0
        L_0x001a:
            r1 = 0
            java.lang.Integer r7 = X.AnonymousClass05K.A05
            long r9 = X.C51970G9q.A0J()
            r11 = 1
            java.lang.String r18 = "Close Bottom Sheet"
            X.HNN r13 = X.HNN.A0G
            X.HNO r15 = X.HNO.A0W
            java.lang.Integer r17 = X.AnonymousClass05K.A00
            X.J5X r19 = X.J5X.A00
            X.I1u r4 = new X.I1u
            r12 = r4
            r14 = r1
            r16 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r12 = 0
            java.lang.Integer r8 = X.AnonymousClass05K.A0C
            X.HtX r0 = new X.HtX
            r2 = r1
            r6 = r1
            r13 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r13)
            return r0
        L_0x0041:
            java.lang.Integer r11 = X.AnonymousClass05K.A00
            X.05G r2 = r1.A0A
            java.lang.Object r0 = r2.getValue()
            X.HtT r0 = (X.C56141HtT) r0
            X.HQa r0 = r0.A01
            boolean r0 = r0.A00()
            if (r0 != 0) goto L_0x0060
            java.lang.Object r0 = r2.getValue()
            X.HtT r0 = (X.C56141HtT) r0
            X.I1f r0 = r0.A03
            boolean r0 = r0.A01
            r14 = 1
            if (r0 != 0) goto L_0x0061
        L_0x0060:
            r14 = 0
        L_0x0061:
            r0 = 2131966425(0x7f1339d9, float:1.9569688E38)
            java.lang.String r12 = X.AnonymousClass7TE.A16(r3, r0)
            X.HNN r7 = X.HNN.A0V
            r10 = 0
            r0 = 7
            X.JGB r13 = new X.JGB
            r13.<init>(r1, r0)
            if (r14 == 0) goto L_0x007e
            X.HNO r8 = X.HNO.A0W
            X.HNO r9 = X.HNO.A0O
        L_0x0077:
            X.HtV r3 = new X.HtV
            r6 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x001a
        L_0x007e:
            X.HNO r8 = X.HNO.A0B
            r9 = r8
            goto L_0x0077
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.writewithai.creation.impl.viewmodel.WriteWithAICreationViewModel.A08():X.HtX");
    }

    public final void A09(Boolean bool, String str, String str2) {
        boolean z;
        C54674HOf hOf;
        C54675HOg hOg;
        String A032 = A03(this);
        I45 i45 = this.A04;
        String str3 = this.A01;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = true;
        }
        if (str == null || str.length() == 0) {
            hOf = C54674HOf.SERVER_GENERATED;
        } else if (!z || i45.A00 != (hOf = C54674HOf.SUGGESTED)) {
            hOf = C54674HOf.USER_GENERATED;
            hOg = C54675HOg.NEW_PROMPT_INPUT;
            I45.A01(hOf, hOg, i45, str, str3);
            A06(this, str, A032, str2);
        }
        hOg = C54675HOg.REGENERATE_BUTTON;
        I45.A01(hOf, hOg, i45, str, str3);
        A06(this, str, A032, str2);
    }

    public final void A0A(String str) {
        String A032 = A03(this);
        I45 i45 = this.A04;
        C54675HOg hOg = C54675HOg.SUGGESTED_PROMPT;
        I45.A00((C54674HOf) null, hOg, i45, (Long) null, "retry_on_error_click", (String) null, (String) null, i45.A03.A02.A03);
        String str2 = this.A01;
        C54674HOf hOf = i45.A00;
        if (hOf == null) {
            hOf = C54674HOf.SERVER_GENERATED;
        }
        I45.A01(hOf, hOg, i45, str, str2);
        A06(this, str, A032, (String) null);
    }
}
