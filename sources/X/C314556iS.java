package X;

import com.instagram.common.session.UserSession;
import com.instagram.reels.comments.repository.StoryCommentsRepository;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.6iS  reason: invalid class name and case insensitive filesystem */
public final class C314556iS extends 2YL {
    public 1Xj A00;
    public C255773uh A01;
    public Map A02 = new HashMap();
    public boolean A03;
    public final UserSession A04;
    public final 1Av A05;
    public final C317376nA A06;
    public final C317746nl A07;
    public final StoryCommentsRepository A08;
    public final AnonymousClass0t1 A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B;
    public final 0V2 A0C;
    public final 05G A0D;

    public C314556iS(UserSession userSession, 1Av r14, C317376nA r15, C317746nl r16, StoryCommentsRepository storyCommentsRepository, AnonymousClass0t1 r18) {
        AnonymousClass0t1 r3 = r18;
        0qQ.A0B(r3, 2);
        0qQ.A0B(r14, 5);
        0qQ.A0B(r15, 6);
        this.A04 = userSession;
        this.A09 = r3;
        this.A08 = storyCommentsRepository;
        C317746nl r8 = r16;
        this.A07 = r8;
        this.A05 = r14;
        this.A06 = r15;
        0eO r2 = 0eO.A02;
        this.A0B = AnonymousClass0eN.A00(r2, new AnonymousClass9M1(12, (Object) null, this));
        this.A0A = AnonymousClass0eN.A00(r2, new AnonymousClass9LS(this, 1));
        this.A0D = 106.A01(C317356n8.A01(userSession, (C255773uh) null, r15, r8, r3.A00(), 0sn.A00, (List) null));
        this.A0C = 10D.A01(AnonymousClass05K.A00, 0, 0);
    }

    public static final void A00(AnonymousClass9JK r13, 1Xj r14, C314556iS r15, String str, String str2) {
        C309496Ym r2 = (C309496Ym) r15.A0A.getValue();
        0qQ.A0B(r13, 0);
        List singletonList = Collections.singletonList(r13);
        0qQ.A07(singletonList);
        r2.A02(00k.A0S(r2.A01, singletonList));
        A04(r15, true);
        05G r1 = r15.A0D;
        r1.Epw(C317366n9.A00(r13, (AnonymousClass9JK) null, (C247733gp) null, (C317376nA) null, (C317366n9) r1.getValue(), (CharSequence) null, (List) null, (List) null, 0, 0, 0, 536870773, false, true, false, false, false, false, false, false, false, false, false, false));
        MGN mgn = new MGN(r15, r14, str2, str, (AnonymousClass4D7) null, 18);
        1Eo.A05(19B.A00, mgn, (C262224Cq) r15.A0B.getValue());
    }

    public static final void A02(C314556iS r7) {
        String id;
        C314556iS r4 = r7;
        if (182.A06(0Tu.A05, r7.A07.A00, 36318247751456810L)) {
            1Xj r3 = r7.A00;
            if (r3 != null && (id = r3.getId()) != null) {
                C66173MGk mGk = new C66173MGk(r3, r4, id, (AnonymousClass4D7) null, 11);
                1Eo.A05(19B.A00, mGk, (C262224Cq) r7.A0B.getValue());
                return;
            }
            return;
        }
        A03(r7);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a6, code lost:
        if (r1.A6b(r2.A04) != false) goto L_0x00a8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09(java.util.List r27) {
        /*
            r26 = this;
            r10 = 0
            r8 = r27
            X.0qQ.A0B(r8, r10)
            r2 = r26
            X.1Xj r0 = r2.A00
            java.util.LinkedHashMap r0 = X.C317356n8.A02(r0)
            if (r0 != 0) goto L_0x0015
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
        L_0x0015:
            r2.A02 = r0
            r0 = 10
            int r0 = X.0Yv.A1E(r8, r0)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r0)
            java.util.Iterator r3 = r8.iterator()
        L_0x0026:
            boolean r0 = r3.hasNext()
            r4 = 0
            if (r0 == 0) goto L_0x004c
            java.lang.Object r0 = r3.next()
            X.9JK r0 = (X.AnonymousClass9JK) r0
            java.util.Map r1 = r2.A02
            java.lang.String r0 = r0.A04
            java.lang.Object r1 = r1.get(r0)
            X.1bM r1 = (X.C65211bM) r1
            if (r1 == 0) goto L_0x0048
            boolean r0 = r1 instanceof X.1bK
            if (r0 == 0) goto L_0x0048
            X.3gp r4 = new X.3gp
            r4.<init>(r1)
        L_0x0048:
            r5.add(r4)
            goto L_0x0026
        L_0x004c:
            java.util.List r9 = X.00k.A0a(r5)
            java.util.Iterator r3 = r9.iterator()
        L_0x0054:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0068
            java.lang.Object r1 = r3.next()
            X.3gp r1 = (X.C247733gp) r1
            if (r1 == 0) goto L_0x0054
            X.1Xj r0 = r2.A00
            r1.A02(r0)
            goto L_0x0054
        L_0x0068:
            java.util.Map r0 = r2.A02
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 == 0) goto L_0x00a8
            X.3uh r0 = r2.A01
            if (r0 == 0) goto L_0x0077
            com.instagram.user.model.User r4 = r0.A0i
        L_0x0077:
            X.0t1 r0 = r2.A09
            com.instagram.user.model.User r0 = r0.A00()
            boolean r0 = X.0qQ.A0K(r4, r0)
            if (r0 == 0) goto L_0x00a8
            X.3uh r0 = r2.A01
            if (r0 == 0) goto L_0x00a8
            boolean r0 = r0.A0k()
            if (r0 != r1) goto L_0x00a8
            X.3uh r0 = r2.A01
            if (r0 == 0) goto L_0x00a8
            boolean r0 = r0.A0j()
            if (r0 != 0) goto L_0x00a8
            X.3uh r0 = r2.A01
            if (r0 == 0) goto L_0x00a8
            X.1Xj r1 = r0.A0b
            if (r1 == 0) goto L_0x00a8
            com.instagram.common.session.UserSession r0 = r2.A04
            boolean r0 = r1.A6b(r0)
            r14 = 1
            if (r0 == 0) goto L_0x00a9
        L_0x00a8:
            r14 = 0
        L_0x00a9:
            boolean r0 = r8.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00c5
            X.0eM r1 = r2.A0A
            java.lang.Object r0 = r1.getValue()
            X.6Ym r0 = (X.C309496Ym) r0
            r0.A01()
            java.lang.Object r0 = r1.getValue()
            X.6Ym r0 = (X.C309496Ym) r0
            r0.A02(r8)
        L_0x00c5:
            A04(r2, r10)
            X.05G r1 = r2.A0D
            java.lang.Object r6 = r1.getValue()
            X.6n9 r6 = (X.C317366n9) r6
            boolean r0 = r9.isEmpty()
            r15 = r0 ^ 1
            r2 = 0
            r13 = 536674229(0x1ffcffb5, float:1.0714918E-19)
            r3 = r2
            r4 = r2
            r5 = r2
            r7 = r2
            r11 = r10
            r12 = r10
            r16 = r10
            r17 = r10
            r18 = r10
            r19 = r10
            r20 = r10
            r21 = r10
            r22 = r10
            r23 = r10
            r24 = r10
            r25 = r10
            X.6n9 r0 = X.C317366n9.A00(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r1.Epw(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C314556iS.A09(java.util.List):void");
    }

    public static final void A01(C66413MQt mQt, C314556iS r5) {
        AnonymousClass9K1 r2 = new AnonymousClass9K1((Object) mQt, (Object) r5, (AnonymousClass4D7) null, 26);
        19B r1 = 19B.A00;
        1Eo.A03(AnonymousClass05K.A00, r1, r2, (C262224Cq) r5.A0B.getValue());
    }

    public static final void A03(C314556iS r26) {
        05G r1;
        C317366n9 A002;
        C314556iS r2 = r26;
        if (!r2.A05.A01.getBoolean("has_seen_story_comments_dialog_nux", false)) {
            if (182.A06(0Tu.A05, r2.A07.A00, 2342161256964495392L)) {
                r1 = r2.A0D;
                A002 = C317366n9.A00((AnonymousClass9JK) null, (AnonymousClass9JK) null, (C247733gp) null, (C317376nA) null, (C317366n9) r1.getValue(), (CharSequence) null, (List) null, (List) null, 0, 0, 0, 536870895, false, false, true, false, false, false, false, false, false, false, false, false);
                r1.Epw(A002);
                ((C309496Ym) r2.A0A.getValue()).A00();
            }
        }
        if (!r2.A07.A01()) {
            r1 = r2.A0D;
            if (!(!((C317366n9) r1.getValue()).A0B.isEmpty()) && ((C317366n9) r1.getValue()).A04 == null) {
                A002 = C317366n9.A00((AnonymousClass9JK) null, (AnonymousClass9JK) null, (C247733gp) null, (C317376nA) null, (C317366n9) r1.getValue(), (CharSequence) null, (List) null, (List) null, 0, 0, 0, 536870879, false, false, false, true, false, false, false, false, false, false, false, false);
                r1.Epw(A002);
                ((C309496Ym) r2.A0A.getValue()).A00();
            }
        }
        r1 = r2.A0D;
        A002 = C317366n9.A00((AnonymousClass9JK) null, (AnonymousClass9JK) null, (C247733gp) null, (C317376nA) null, (C317366n9) r1.getValue(), (CharSequence) null, (List) null, (List) null, 0, 0, 0, 536870831, false, false, false, false, true, false, false, false, false, false, false, false);
        r1.Epw(A002);
        ((C309496Ym) r2.A0A.getValue()).A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (r0.A4l() != true) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.C314556iS r25, boolean r26) {
        /*
            r4 = r25
            X.05G r2 = r4.A0D
            java.lang.Object r7 = r2.getValue()
            X.6n9 r7 = (X.C317366n9) r7
            if (r26 == 0) goto L_0x0064
            java.lang.String r8 = ""
        L_0x000e:
            X.6nl r0 = r4.A07
            com.instagram.common.session.UserSession r5 = r0.A00
            X.0Tu r3 = X.0Tu.A05
            r0 = 2342161256966068280(0x2081074100251838, double:4.064100122889807E-152)
            boolean r23 = X.182.A06(r3, r5, r0)
            X.1Xj r0 = r4.A00
            if (r0 == 0) goto L_0x0062
            X.3QO r3 = r0.A1t()
        L_0x0025:
            X.3QO r0 = X.AnonymousClass3QO.HALLPASS
            r1 = 1
            r24 = 0
            if (r3 != r0) goto L_0x002e
            r24 = 1
        L_0x002e:
            X.1Xj r0 = r4.A00
            if (r0 == 0) goto L_0x003a
            boolean r0 = r0.A4l()
            r25 = 1
            if (r0 == r1) goto L_0x003c
        L_0x003a:
            r25 = 0
        L_0x003c:
            X.6nA r6 = r4.A06
            r11 = 0
            r3 = 0
            r14 = 352523663(0x1503158f, float:2.6472246E-26)
            r4 = r3
            r5 = r3
            r9 = r3
            r10 = r3
            r12 = r11
            r13 = r11
            r15 = r11
            r16 = r11
            r17 = r11
            r18 = r11
            r19 = r11
            r20 = r11
            r21 = r11
            r22 = r1
            r26 = r11
            X.6n9 r0 = X.C317366n9.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r2.Epw(r0)
            return
        L_0x0062:
            r3 = 0
            goto L_0x0025
        L_0x0064:
            java.lang.Object r0 = r2.getValue()
            X.6n9 r0 = (X.C317366n9) r0
            java.lang.CharSequence r8 = r0.A08
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C314556iS.A04(X.6iS, boolean):void");
    }

    public final void A05() {
        String id;
        UserSession userSession;
        0Tu r2;
        long j;
        1Xj r0 = this.A00;
        if (r0 != null && (id = r0.getId()) != null) {
            if (r0.A1t() == AnonymousClass3QO.HALLPASS) {
                userSession = this.A04;
                r2 = 0Tu.A05;
                j = 36320313631056119L;
            } else {
                userSession = this.A07.A00;
                r2 = 0Tu.A05;
                j = 36318247751653421L;
            }
            boolean A062 = 182.A06(r2, userSession, j);
            A01(C65581LwF.A00, this);
            A01(new Lw9(id, A062), this);
            ((C309496Ym) this.A0A.getValue()).A00();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = (instagram.features.stories.fragment.ReelViewerFragment) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06() {
        /*
            r8 = this;
            X.6nA r2 = r8.A06
            X.4mU r1 = r2.A01
            if (r1 == 0) goto L_0x002c
            r0 = r1
            instagram.features.stories.fragment.ReelViewerFragment r0 = (instagram.features.stories.fragment.ReelViewerFragment) r0
            X.3mM r3 = r0.A0a
            if (r3 == 0) goto L_0x002c
            X.3uh r1 = r1.Au5()
            if (r1 == 0) goto L_0x002c
            X.4gh r0 = r0.A1E
            X.6bG r0 = (X.C310566bG) r0
            X.6bN r0 = r0.A0B
            X.6Yf r0 = r0.Bz3(r1)
            X.6aI r2 = r2.A00
            if (r2 == 0) goto L_0x002c
            float r6 = r0.A0B
            float r7 = r0.A0A
            java.lang.String r4 = "tap"
            java.lang.String r5 = "story_comment_button"
            r2.A0Q(r3, r4, r5, r6, r7)
        L_0x002c:
            A02(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C314556iS.A06():void");
    }

    public final void A07() {
        0sn A042 = C317356n8.A04(this.A00);
        if (A042 == null) {
            A042 = 0sn.A00;
        }
        05G r1 = this.A0D;
        r1.Epw(C317366n9.A00((AnonymousClass9JK) null, (AnonymousClass9JK) null, (C247733gp) null, (C317376nA) null, (C317366n9) r1.getValue(), (CharSequence) null, (List) null, (List) null, 0, 0, 0, 536870839, false, !A042.isEmpty(), false, false, false, false, false, false, false, false, false, false));
        A01(C65582LwG.A00, this);
        if (!A042.equals(((C317366n9) r1.getValue()).A0B)) {
            A09(A042);
        } else {
            ((C309496Ym) this.A0A.getValue()).A01();
        }
    }

    public final void A08() {
        05G r1 = this.A0D;
        A01(new Lw8(((C317366n9) r1.getValue()).A07, ((C317366n9) r1.getValue()).A0A), this);
    }
}
