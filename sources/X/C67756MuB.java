package X;

import com.instagram.api.schemas.NoteCustomTheme;
import com.instagram.api.schemas.NotePogImageDict;
import com.instagram.api.schemas.NotePogVideoDict;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.NotesRepository;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.MuB  reason: case insensitive filesystem */
public final class C67756MuB extends 2YL {
    public long A00;
    public AnonymousClass4AS A01;
    public String A02;
    public ArrayList A03;
    public Map A04 = AnonymousClass7TE.A1H();
    public boolean A05 = true;
    public boolean A06;
    public boolean A07;
    public final UserSession A08;
    public final NotesRepository A09;
    public final C2615249x A0A;
    public final C72372P3l A0B = new C72372P3l(this);
    public final C71126OdL A0C;
    public final String A0D;
    public final C249513ju A0E;
    public final C249533jw A0F;
    public final 05G A0G;
    public final AnonymousClass0Ud A0H;
    public final String A0I;
    public final String A0J;

    /* JADX WARNING: type inference failed for: r0v4, types: [X.3Eu, X.3ju, X.3jw] */
    public C67756MuB(UserSession userSession, NotesRepository notesRepository, C2615249x r7, C71126OdL odL, String str, String str2, String str3) {
        0qQ.A0B(userSession, 1);
        C51974G9v.A1M(r7, notesRepository, str);
        0qQ.A0B(str2, 5);
        this.A08 = userSession;
        this.A0A = r7;
        this.A09 = notesRepository;
        this.A0D = str;
        this.A0I = str2;
        this.A0J = str3;
        this.A0C = odL;
        02z A012 = 106.A01(NWY.A00);
        this.A0G = A012;
        this.A0H = 10b.A03(A012);
        ? r0 = new AnonymousClass3Eu(1, AnonymousClass05K.A01);
        this.A0E = r0;
        this.A0F = r0;
        DbY.A19(this, new C66167MGe(this, (AnonymousClass4D7) null, 6), notesRepository.A0r);
        DbY.A19(this, new C66167MGe(this, (AnonymousClass4D7) null, 7), notesRepository.A0k);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0199, code lost:
        if (r1 == X.1Hj.A02) goto L_0x019b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(X.C279894zc r19, X.C67756MuB r20, X.AnonymousClass4D7 r21) {
        /*
            r4 = 1
            r5 = r20
            r5.A06 = r4
            r1 = r19
            java.util.List r10 = r1.A05
            int r0 = r10.size()
            if (r0 <= 0) goto L_0x01ab
            com.instagram.user.model.User r11 = r1.A00
            java.lang.String r6 = r5.A0J
            java.lang.Object r0 = X.00k.A0J(r10)
            X.4zZ r0 = (X.C279864zZ) r0
            if (r0 == 0) goto L_0x0027
            X.5y2 r0 = r0.A0A
            if (r0 == 0) goto L_0x0027
            X.60F r0 = r0.A0B
            if (r0 == 0) goto L_0x0027
            java.lang.String r9 = r0.A03
            if (r9 != 0) goto L_0x0029
        L_0x0027:
            java.lang.String r9 = ""
        L_0x0029:
            X.05G r8 = r5.A0G
            java.lang.String r1 = r5.A0D
            java.lang.String r2 = r5.A02
            com.instagram.common.recyclerview.ViewModelListUpdate r7 = X.DbS.A0R()
            com.instagram.common.session.UserSession r3 = r5.A08
            java.util.Map r0 = r5.A04
            r12 = r3
            r16 = r10
            r17 = r0
            r13 = r1
            r14 = r9
            r15 = r2
            java.util.List r2 = X.AnonymousClass911.A03(r12, r13, r14, r15, r16, r17)
            java.util.Iterator r16 = r2.iterator()
        L_0x0047:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0074
            java.lang.Object r14 = r16.next()
            X.4AB r14 = (X.AnonymousClass4AB) r14
            X.0gF r13 = X.C60340gF.A00
            com.instagram.user.model.User r0 = r14.A0A
            java.lang.String r15 = r0.getId()
            java.lang.String r12 = r14.A0G
            java.lang.String r0 = r14.A0F
            java.lang.String r0 = X.002.A0g(r15, r12, r0)
            X.30a r13 = X.AnonymousClass30Y.A00(r14, r13, r0)
            X.P3l r12 = r5.A0B
            X.Mg1 r0 = new X.Mg1
            r0.<init>(r3, r12)
            r13.A00(r0)
            r14.A00 = r13
            goto L_0x0047
        L_0x0074:
            boolean r0 = r2 instanceof java.util.Collection
            r13 = 0
            if (r0 == 0) goto L_0x00e1
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x00e1
        L_0x007f:
            r0 = r13 ^ 1
            r12 = 0
            if (r0 == 0) goto L_0x00dd
            com.instagram.user.model.User r13 = X.AnonymousClass69P.A05(r3)
            android.content.Context r14 = X.C51966G9m.A0P(r3)
            r18 = r12
            r19 = r12
            r20 = r12
            r16 = r4
            r17 = r12
            r15 = r3
            java.lang.String r3 = X.AnonymousClass4A2.A03(r14, r15, r16, r17, r18, r19, r20)
            X.4AS r0 = new X.4AS
            r0.<init>(r13, r3, r12)
            r5.A01 = r0
            r7.A00(r0)
        L_0x00a5:
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1D(r2)
            r5.A03 = r0
            r0 = 10
            int r0 = X.0Yv.A1E(r2, r0)
            int r0 = X.AnonymousClass7TG.A01(r0)
            java.util.LinkedHashMap r13 = X.DbS.A0x(r0)
            java.util.Iterator r15 = r2.iterator()
        L_0x00bd:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x00ff
            java.lang.Object r14 = r15.next()
            X.4AB r14 = (X.AnonymousClass4AB) r14
            java.util.List r0 = r14.A0J
            java.lang.Object r0 = r0.get(r12)
            X.913 r0 = (X.AnonymousClass913) r0
            X.4zZ r0 = r0.BWY()
            java.lang.String r3 = r0.A0H
            boolean r0 = r14.A0U
            X.JTP.A1R(r3, r13, r0)
            goto L_0x00bd
        L_0x00dd:
            r0 = 0
            r5.A01 = r0
            goto L_0x00a5
        L_0x00e1:
            java.util.Iterator r12 = r2.iterator()
        L_0x00e5:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x007f
            java.lang.Object r0 = r12.next()
            X.4AB r0 = (X.AnonymousClass4AB) r0
            com.instagram.user.model.User r0 = r0.A0A
            java.lang.String r0 = r0.getId()
            boolean r0 = X.C51966G9m.A1W(r3, r0)
            if (r0 == 0) goto L_0x00e5
            r13 = 1
            goto L_0x007f
        L_0x00ff:
            java.util.LinkedHashMap r0 = X.0Yt.A03(r13)
            r5.A04 = r0
            r7.A01(r2)
            com.instagram.direct.inbox.notes.NotesRepository r0 = r5.A09
            X.0Ud r0 = r0.A0r
            java.lang.Object r0 = X.JTR.A0z(r1, r0)
            X.4zc r0 = (X.C279894zc) r0
            if (r0 == 0) goto L_0x013c
            java.lang.String r12 = r0.A01
        L_0x0116:
            java.util.Map r0 = r5.A04
            java.util.Set r0 = r0.keySet()
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r13 = r0.iterator()
        L_0x0124:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x013e
            java.lang.Object r2 = r13.next()
            java.util.Map r0 = r5.A04
            java.lang.Object r1 = r0.get(r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            X.JTR.A1P(r1, r0, r2, r3)
            goto L_0x0124
        L_0x013c:
            r12 = 0
            goto L_0x0116
        L_0x013e:
            java.util.ArrayList r4 = X.AnonymousClass7TF.A0p(r3)
            java.util.Iterator r3 = r3.iterator()
        L_0x0146:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x015d
            java.lang.String r0 = X.AnonymousClass7TE.A18(r3)
            long r1 = java.lang.Long.parseLong(r0)
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r1)
            r4.add(r0)
            goto L_0x0146
        L_0x015d:
            X.NWW r13 = new X.NWW
            r14 = r7
            r15 = r11
            r16 = r9
            r17 = r12
            r18 = r4
            r13.<init>(r14, r15, r16, r17, r18)
            r8.Epw(r13)
            if (r6 == 0) goto L_0x01a8
            int r0 = r6.length()
            if (r0 == 0) goto L_0x01a8
            java.util.Iterator r1 = r10.iterator()
        L_0x0179:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01a6
            java.lang.Object r2 = r1.next()
            boolean r0 = X.C66583MXo.A1a(r2, r6)
            if (r0 == 0) goto L_0x0179
        L_0x0189:
            X.4zZ r2 = (X.C279864zZ) r2
            X.3ju r1 = r5.A0E
            if (r2 != 0) goto L_0x01a0
            X.KR6 r0 = X.KR6.A00
        L_0x0191:
            r2 = r21
            java.lang.Object r1 = r1.ELH(r0, r2)
            X.1Hj r0 = X.1Hj.A02
            if (r1 != r0) goto L_0x01a8
        L_0x019b:
            X.1Hj r0 = X.1Hj.A02
            if (r1 != r0) goto L_0x01b6
            return r1
        L_0x01a0:
            X.KR5 r0 = new X.KR5
            r0.<init>(r2)
            goto L_0x0191
        L_0x01a6:
            r2 = 0
            goto L_0x0189
        L_0x01a8:
            X.0gF r1 = X.C60340gF.A00
            goto L_0x019b
        L_0x01ab:
            boolean r0 = r5.A07
            if (r0 != 0) goto L_0x01b6
            X.05G r1 = r5.A0G
            X.NWX r0 = X.NWX.A00
            r1.Epw(r0)
        L_0x01b6:
            X.0gF r1 = X.C60340gF.A00
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67756MuB.A01(X.4zc, X.MuB, X.4D7):java.lang.Object");
    }

    public static final C279894zc A00(C67756MuB muB, Map map) {
        C279894zc r4 = (C279894zc) map.get(muB.A0D);
        if (r4 != null) {
            List list = r4.A05;
            String str = muB.A0J;
            if (str == null || str.length() == 0 || !muB.A05 || C69984NvO.A00(str, list)) {
                return r4;
            }
        }
        return null;
    }

    public static final void A02(C67756MuB muB) {
        Set keySet = muB.A04.keySet();
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : keySet) {
            JTR.A1P(muB.A04.get(next), AnonymousClass7TE.A0v(), next, A1C);
        }
        ArrayList A0r = AnonymousClass7TG.A0r(A1C);
        Iterator it = A1C.iterator();
        while (it.hasNext()) {
            JTS.A1V(A0r, it);
        }
        C69593Nob nob = (C69593Nob) muB.A0H.getValue();
        if (nob instanceof NWW) {
            05G r1 = muB.A0G;
            NWW nww = (NWW) nob;
            ViewModelListUpdate A0R = DbS.A0R();
            AnonymousClass4AS r0 = muB.A01;
            if (r0 != null) {
                A0R.A00(r0);
            }
            ArrayList arrayList = muB.A03;
            if (arrayList != null) {
                A0R.A01(arrayList);
            }
            String str = nww.A03;
            User user = nww.A01;
            String str2 = nww.A02;
            0qQ.A0B(str, 0);
            r1.Epw(new NWW(A0R, user, str, str2, A0r));
        }
    }

    public final void A03() {
        int i;
        ArrayList arrayList;
        A04();
        ArrayList A1D = AnonymousClass7TE.A1D(this.A03);
        Iterator A16 = DbV.A16(this.A04);
        while (true) {
            i = 0;
            if (!A16.hasNext()) {
                break;
            }
            JTP.A1R(A16.next(), this.A04, false);
        }
        Iterator it = A1D.iterator();
        while (it.hasNext()) {
            int i2 = i + 1;
            AnonymousClass4AB r4 = (AnonymousClass4AB) it.next();
            if (r4.A0U && (arrayList = this.A03) != null) {
                User user = r4.A0A;
                boolean z = r4.A0P;
                List list = r4.A0J;
                Integer num = r4.A02;
                String str = r4.A03;
                Integer num2 = r4.A01;
                boolean z2 = r4.A0W;
                boolean z3 = r4.A04;
                boolean z4 = r4.A0S;
                boolean z5 = r4.A0O;
                boolean z6 = r4.A0T;
                String str2 = r4.A0G;
                Integer num3 = r4.A0D;
                Integer num4 = r4.A0C;
                List list2 = r4.A0M;
                String str3 = r4.A0H;
                boolean z7 = r4.A0R;
                int i3 = r4.A05;
                NotePogVideoDict notePogVideoDict = r4.A08;
                NotePogImageDict notePogImageDict = r4.A07;
                String str4 = r4.A0E;
                boolean z8 = r4.A0Q;
                List list3 = r4.A0L;
                Boolean bool = r4.A0B;
                List list4 = r4.A0N;
                boolean z9 = r4.A0Y;
                boolean z10 = r4.A0V;
                NoteCustomTheme noteCustomTheme = r4.A06;
                List list5 = r4.A0I;
                List list6 = r4.A0K;
                AnonymousClass7TF.A1B(user, 0, list);
                arrayList.set(i, new AnonymousClass4AB(noteCustomTheme, notePogImageDict, notePogVideoDict, r4.A09, user, bool, num, num2, num3, num4, str, str2, str3, str4, list, list2, list3, list4, list5, list6, i3, z, z2, z3, z4, z5, z6, z7, r4.A0X, z8, z9, z10, false));
            }
            i = i2;
        }
        A02(this);
    }

    public final void A04() {
        Long l;
        Long l2;
        UserSession userSession = this.A08;
        if (AnonymousClass4AJ.A0A(userSession) && !182.A06(0Tu.A05, userSession, 36329028118068986L)) {
            Set keySet = this.A04.keySet();
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (Object next : keySet) {
                JTR.A1P(this.A04.get(next), true, next, A1C);
            }
            ArrayList A0r = AnonymousClass7TG.A0r(A1C);
            Iterator it = A1C.iterator();
            while (it.hasNext()) {
                JTS.A1V(A0r, it);
            }
            if (DbT.A1b(A0r)) {
                C3018760k A012 = C3018660j.A01(userSession);
                String str = this.A0I;
                double A062 = (double) (C66581MXm.A06() - this.A00);
                long A0R = AnonymousClass7TE.A0R(A0r.get(0));
                C71126OdL odL = this.A0C;
                if (odL == null || (l2 = odL.A0E) == null) {
                    l = null;
                } else {
                    l = Long.valueOf(l2.longValue() - this.A00);
                }
                A012.A0Q(l, str, A062, A0R, false);
            }
        }
    }
}
