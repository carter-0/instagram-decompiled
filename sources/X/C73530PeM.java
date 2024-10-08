package X;

import java.util.AbstractCollection;
import java.util.Iterator;

/* renamed from: X.PeM  reason: case insensitive filesystem */
public final class C73530PeM implements 02o {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C73530PeM(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public static void A00(C69120Nez nez, AbstractCollection abstractCollection, Iterator it) {
        Object next = it.next();
        String str = (String) next;
        if (nez.A03.A00(Long.parseLong(str)) == null) {
            C72187Oxw oxw = nez.A01;
            0qQ.A0B(str, 0);
            if (oxw.A00.get(str) == null) {
                abstractCollection.add(next);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v28, resolved type: X.4D7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v30, resolved type: X.JUG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v38, resolved type: X.MDv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v25, resolved type: X.4D7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v27, resolved type: X.MDv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v46, resolved type: X.ME7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v189, resolved type: X.JwM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v191, resolved type: X.JwM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v41, resolved type: X.ME7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v60, resolved type: X.MEA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v80, resolved type: X.MEA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v83, resolved type: X.JUG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v84, resolved type: X.4D7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v404, resolved type: X.GmM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v85, resolved type: X.JUG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v86, resolved type: X.MDv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v87, resolved type: X.4D7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v406, resolved type: X.Niw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v88, resolved type: X.MDv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v64, resolved type: X.MDv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v65, resolved type: X.4D7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v545, resolved type: X.0gF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v66, resolved type: X.MDv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v89, resolved type: X.4D7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v412, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v91, resolved type: X.ME7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v92, resolved type: X.ME7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v413, resolved type: X.JwM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v67, resolved type: X.ME7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v68, resolved type: X.4D7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v546, resolved type: X.NWF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v547, resolved type: X.NWG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v69, resolved type: X.ME7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v63, resolved type: android.widget.TextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v32, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v94, resolved type: X.ME7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v414, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v70, resolved type: X.MEA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v71, resolved type: X.4D7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v551, resolved type: X.N9O} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v72, resolved type: X.MEA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v101, resolved type: X.MEA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v102, resolved type: X.4D7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v415, resolved type: java.util.AbstractCollection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v103, resolved type: X.MEA} */
    /* JADX WARNING: type inference failed for: r1v206, types: [java.lang.Object, X.Npi] */
    /* JADX WARNING: type inference failed for: r0v234, types: [X.NWE, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v221, types: [java.lang.Object, X.NWD] */
    /* JADX WARNING: type inference failed for: r0v251, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    /* JADX WARNING: type inference failed for: r1v229, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v253, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r2v156, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r2v159, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r2v232, types: [X.1Xx, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:1078:0x1980, code lost:
        r0 = X.C255943uy.LOADING;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1079:0x1982, code lost:
        r1.setLoadingStatus(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1081:0x198c, code lost:
        X.0qQ.A0F(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1097:0x1a20, code lost:
        X.0qQ.A0F(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1147:0x1b0a, code lost:
        X.0qQ.A0F(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1165:0x1b71, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1174:0x1b97, code lost:
        if (r0 == null) goto L_0x1b6f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1175:0x1b99, code lost:
        r0.A0B();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0272, code lost:
        r2 = r6.A03(r2, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0276, code lost:
        if (r2 == null) goto L_0x1b6f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0278, code lost:
        r6 = r2.reinterpretRequired(0, X.B7T.class, 156366738);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0282, code lost:
        if (r6 == null) goto L_0x1b6f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0284, code lost:
        r0 = r6.getRequiredCompactedTreeListField(0, "output", X.B7U.class, 526145780);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x028f, code lost:
        if (r0 == null) goto L_0x1b6f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0291, code lost:
        r5 = r5;
        r0 = X.B7V.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02a0, code lost:
        r1 = (X.C332427Uz) r1.A02;
        X.AnonymousClass5H8.A02(r1.A03.ArX());
        r1.A02.set(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x031c, code lost:
        if (r2 == 0) goto L_0x031e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x03af, code lost:
        X.0qQ.A0F(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x03b6, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x04fb, code lost:
        if (X.0qQ.A0K(r0, r2) != false) goto L_0x1330;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x04fd, code lost:
        r4.Epw(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0627, code lost:
        if (r1 != null) goto L_0x0629;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x0833, code lost:
        if (r1 != null) goto L_0x0835;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:529:0x0dbf, code lost:
        if (r1 == null) goto L_0x0dc1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:555:0x0ea6, code lost:
        if (X.182.A06(X.0Tu.A05, X.AnonymousClass7TE.A0l(r5.A1T), 36324569941880993L) == false) goto L_0x0ea8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:556:0x0ea8, code lost:
        r0 = r5.A0b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:557:0x0eaa, code lost:
        if (r0 != null) goto L_0x0eb6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:558:0x0eac, code lost:
        X.0qQ.A0F("pogViewContainer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:559:0x0eb5, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:560:0x0eb6, code lost:
        com.instagram.direct.inbox.notes.creation.NotesCreationPogView.A00(r0);
        r0.A07.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:561:0x0ec1, code lost:
        if (r5.A0u != false) goto L_0x1b6f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:562:0x0ec3, code lost:
        X.C68449NIn.A0M(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:665:0x10e5, code lost:
        r5.A00 = r8;
        r5 = r5;
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:694:0x11dc, code lost:
        r3.Epw(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:714:0x1259, code lost:
        r0 = r6.emit(r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:789:0x13e3, code lost:
        X.0eS.A00(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:807:0x1424, code lost:
        r0 = r4.emit(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:808:0x1428, code lost:
        if (r0 != r3) goto L_0x1b6f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:809:0x142a, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:823:0x1452, code lost:
        X.0qQ.A0F(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:824:0x1459, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:842:0x14a7, code lost:
        if (r1 == null) goto L_0x14a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:845:0x14b0, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:883:0x154d, code lost:
        X.0qQ.A0F(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:944:0x1689, code lost:
        if (r1 == null) goto L_0x168b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:945:0x168b, code lost:
        X.0qQ.A0F(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:953:0x16a4, code lost:
        X.0qQ.A0F(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:995:0x17f4, code lost:
        if (r1 == null) goto L_0x17f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:996:0x17f6, code lost:
        X.0qQ.A0F(r9);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:1215:0x0c7e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0631  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x066c  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x0683  */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x0742  */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x084a  */
    /* JADX WARNING: Removed duplicated region for block: B:375:0x0855  */
    /* JADX WARNING: Removed duplicated region for block: B:378:0x0867  */
    /* JADX WARNING: Removed duplicated region for block: B:382:0x08e6  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:414:0x0a30  */
    /* JADX WARNING: Removed duplicated region for block: B:426:0x0a81  */
    /* JADX WARNING: Removed duplicated region for block: B:443:0x0b05  */
    /* JADX WARNING: Removed duplicated region for block: B:445:0x0b15  */
    /* JADX WARNING: Removed duplicated region for block: B:447:0x0b2f  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:459:0x0b94  */
    /* JADX WARNING: Removed duplicated region for block: B:481:0x0c5b  */
    /* JADX WARNING: Removed duplicated region for block: B:491:0x0c8d  */
    /* JADX WARNING: Removed duplicated region for block: B:494:0x0ca3  */
    /* JADX WARNING: Removed duplicated region for block: B:501:0x0cdb  */
    /* JADX WARNING: Removed duplicated region for block: B:517:0x0d5f A[LOOP:8: B:515:0x0d57->B:517:0x0d5f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:521:0x0d84 A[LOOP:9: B:519:0x0d7e->B:521:0x0d84, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:524:0x0d9f  */
    /* JADX WARNING: Removed duplicated region for block: B:571:0x0eeb  */
    /* JADX WARNING: Removed duplicated region for block: B:575:0x0ef8  */
    /* JADX WARNING: Removed duplicated region for block: B:587:0x0f56  */
    /* JADX WARNING: Removed duplicated region for block: B:588:0x0f59  */
    /* JADX WARNING: Removed duplicated region for block: B:600:0x0fc6  */
    /* JADX WARNING: Removed duplicated region for block: B:603:0x0fd3  */
    /* JADX WARNING: Removed duplicated region for block: B:605:0x0fef  */
    /* JADX WARNING: Removed duplicated region for block: B:606:0x0ff2  */
    /* JADX WARNING: Removed duplicated region for block: B:607:0x0ff5  */
    /* JADX WARNING: Removed duplicated region for block: B:608:0x0ff8  */
    /* JADX WARNING: Removed duplicated region for block: B:609:0x0ffb  */
    /* JADX WARNING: Removed duplicated region for block: B:658:0x10c5  */
    /* JADX WARNING: Removed duplicated region for block: B:662:0x10d2  */
    /* JADX WARNING: Removed duplicated region for block: B:677:0x111d  */
    /* JADX WARNING: Removed duplicated region for block: B:683:0x1182  */
    /* JADX WARNING: Removed duplicated region for block: B:703:0x1219  */
    /* JADX WARNING: Removed duplicated region for block: B:707:0x1226  */
    /* JADX WARNING: Removed duplicated region for block: B:728:0x12b8  */
    /* JADX WARNING: Removed duplicated region for block: B:732:0x12c5  */
    /* JADX WARNING: Removed duplicated region for block: B:785:0x13d6  */
    /* JADX WARNING: Removed duplicated region for block: B:790:0x13e8  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:976:0x178e  */
    /* JADX WARNING: Removed duplicated region for block: B:977:0x1792  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object emit(java.lang.Object r23, X.AnonymousClass4D7 r24) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            int r2 = r1.A00
            r8 = r24
            switch(r2) {
                case 0: goto L_0x13b7;
                case 1: goto L_0x145a;
                case 2: goto L_0x133a;
                case 3: goto L_0x12fe;
                case 4: goto L_0x1299;
                case 5: goto L_0x11fa;
                case 6: goto L_0x11e1;
                case 7: goto L_0x1187;
                case 8: goto L_0x10eb;
                case 9: goto L_0x148e;
                case 10: goto L_0x10a6;
                case 11: goto L_0x1005;
                case 12: goto L_0x0f5c;
                case 13: goto L_0x0ecc;
                case 14: goto L_0x1991;
                case 15: goto L_0x039e;
                case 16: goto L_0x0dfe;
                case 17: goto L_0x167b;
                case 18: goto L_0x050f;
                case 19: goto L_0x04be;
                case 20: goto L_0x033d;
                case 21: goto L_0x0313;
                case 22: goto L_0x02b5;
                case 23: goto L_0x0224;
                case 24: goto L_0x01cc;
                case 25: goto L_0x0133;
                case 26: goto L_0x00c8;
                default: goto L_0x000b;
            }
        L_0x000b:
            r6 = 25
            boolean r2 = X.MEA.A03(r6, r8)
            if (r2 == 0) goto L_0x0031
            r5 = r8
            X.MEA r5 = (X.MEA) r5
            int r4 = r5.A00
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r4 & r3
            if (r2 == 0) goto L_0x0031
            int r4 = r4 - r3
            r5.A00 = r4
        L_0x0021:
            java.lang.Object r10 = r5.A02
            X.1Hj r3 = X.1Hj.A02
            int r2 = r5.A00
            r9 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 == r9) goto L_0x13e3
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0031:
            X.MEA r5 = new X.MEA
            r5.<init>((java.lang.Object) r1, (X.AnonymousClass4D7) r8, (int) r6)
            goto L_0x0021
        L_0x0037:
            X.0eS.A00(r10)
            java.lang.Object r4 = r1.A01
            X.02o r4 = (X.02o) r4
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            java.lang.Object r11 = r1.A02
            X.Nez r11 = (X.C69120Nez) r11
            X.4Cq r10 = r11.A01
            if (r10 == 0) goto L_0x00c4
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r0.iterator()
        L_0x0050:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x005a
            A00(r11, r6, r2)
            goto L_0x0050
        L_0x005a:
            boolean r1 = X.00k.A0t(r6)
            if (r1 == 0) goto L_0x006f
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()
            java.lang.String r1 = "Missing RtcCallUsers in cache: "
            java.lang.String r2 = X.AnonymousClass7TG.A0m(r6, r1, r2)
            java.lang.String r1 = "RtcUsersInteractor"
            X.0KC.A0E(r1, r2)
        L_0x006f:
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r0.iterator()
        L_0x0077:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0081
            A00(r11, r6, r2)
            goto L_0x0077
        L_0x0081:
            java.util.Iterator r12 = r6.iterator()
        L_0x0085:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x00c4
            java.lang.String r8 = X.AnonymousClass7TE.A18(r12)
            X.OHb r7 = r11.A02
            r1 = 0
            X.0qQ.A0B(r8, r1)
            java.util.HashSet r1 = r7.A04
            boolean r1 = r1.add(r8)
            if (r1 == 0) goto L_0x0085
            X.O9J r1 = r7.A01
            com.instagram.common.session.UserSession r1 = r1.A00
            X.1NY r6 = X.AnonymousClass7TG.A0b(r1)
            java.lang.String r1 = "users/user_by_fbid/"
            r6.A0A(r1)
            java.lang.String r1 = "user_fbid"
            r6.A9m(r1, r8)
            java.lang.Class<X.DvP> r2 = X.DvP.class
            java.lang.Class<X.F7w> r1 = X.C49809F7w.class
            X.1OC r6 = X.DbU.A0S(r6, r2, r1)
            r2 = 13
            X.EDL r1 = new X.EDL
            r1.<init>(r10, r7, r8, r2)
            r6.A00 = r1
            X.1ES.A03(r6)
            goto L_0x0085
        L_0x00c4:
            r5.A00 = r9
            goto L_0x1424
        L_0x00c8:
            r5 = 23
            boolean r2 = X.MEA.A03(r5, r8)
            if (r2 == 0) goto L_0x00ee
            r7 = r8
            X.MEA r7 = (X.MEA) r7
            int r4 = r7.A00
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r4 & r3
            if (r2 == 0) goto L_0x00ee
            int r4 = r4 - r3
            r7.A00 = r4
        L_0x00de:
            java.lang.Object r10 = r7.A02
            X.1Hj r3 = X.1Hj.A02
            int r2 = r7.A00
            r4 = 1
            if (r2 == 0) goto L_0x00f4
            if (r2 == r4) goto L_0x13e3
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00ee:
            X.MEA r7 = new X.MEA
            r7.<init>((java.lang.Object) r1, (X.AnonymousClass4D7) r8, (int) r5)
            goto L_0x00de
        L_0x00f4:
            X.0eS.A00(r10)
            java.lang.Object r6 = r1.A01
            X.02o r6 = (X.02o) r6
            X.N9N r0 = (X.N9N) r0
            java.lang.Object r9 = r1.A02
            X.Net r9 = (X.C69114Net) r9
            com.instagram.common.session.UserSession r8 = r9.A01
            X.0Tu r5 = X.0Tu.A05
            r1 = 36314850430880581(0x81042a00010b45, double:3.02899586842992E-306)
            boolean r1 = X.182.A06(r5, r8, r1)
            r2 = 0
            if (r1 == 0) goto L_0x012d
            boolean r1 = r0.A04
            if (r1 == 0) goto L_0x0122
            boolean r1 = r0.A06
            if (r1 == 0) goto L_0x0122
            boolean r1 = r0.A07
            if (r1 == 0) goto L_0x0122
            boolean r0 = r0.A0A
            if (r0 == 0) goto L_0x0122
            r2 = 1
        L_0x0122:
            boolean r0 = r9.A00
            X.N9O r1 = new X.N9O
            r1.<init>(r2, r0)
        L_0x0129:
            r7.A00 = r4
            goto L_0x1259
        L_0x012d:
            X.N9O r1 = new X.N9O
            r1.<init>(r2, r2)
            goto L_0x0129
        L_0x0133:
            X.Prt r0 = (X.C74265Prt) r0
            boolean r2 = r0 instanceof X.C68283N8w
            if (r2 == 0) goto L_0x1b6f
            java.lang.Object r7 = r1.A02
            X.NJ0 r7 = (X.NJ0) r7
            X.MvE r3 = r7.A00()
            X.N8w r0 = (X.C68283N8w) r0
            java.util.List r0 = r0.A00
            if (r0 != 0) goto L_0x0149
            X.0sn r0 = X.0sn.A00
        L_0x0149:
            r2 = 0
            r3.A00 = r0
            boolean r0 = r7.A07
            r4 = 2131972395(0x7f13512b, float:1.9581796E38)
            if (r0 == 0) goto L_0x0156
            r4 = 2131972396(0x7f13512c, float:1.9581798E38)
        L_0x0156:
            java.lang.Object r9 = r1.A01
            com.instagram.igds.components.headline.IgdsHeadline r9 = (com.instagram.igds.components.headline.IgdsHeadline) r9
            android.content.res.Resources r3 = X.DbV.A05(r7)
            java.lang.String r1 = r7.A05
            if (r1 == 0) goto L_0x01c2
            r8 = 1
            X.MvE r0 = r7.A00()
            int r0 = r0.getItemCount()
            java.lang.Integer r0 = X.JTO.A0w(r0)
            java.lang.String r0 = X.DbV.A0w(r3, r1, r0, r4)
            android.text.SpannableStringBuilder r6 = X.DbS.A0C(r0)
            java.lang.String r1 = X.DbT.A10(r6)
            java.lang.String r0 = r7.A05
            if (r0 == 0) goto L_0x01c2
            int r5 = X.00l.A08(r1, r0, r2, r2)
            java.lang.String r0 = r7.A05
            if (r0 == 0) goto L_0x01c2
            int r4 = X.C51966G9m.A05(r0, r5)
            X.MvE r0 = r7.A00()
            int r0 = r0.getItemCount()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = X.DbT.A10(r6)
            int r3 = X.00l.A08(r0, r1, r2, r2)
            int r2 = X.DbX.A05(r1)
            int r2 = r2 + r3
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan     // Catch:{ IndexOutOfBoundsException -> 0x01b6 }
            r0.<init>(r8)     // Catch:{ IndexOutOfBoundsException -> 0x01b6 }
            r1 = 18
            r6.setSpan(r0, r5, r4, r1)     // Catch:{ IndexOutOfBoundsException -> 0x01b6 }
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan     // Catch:{ IndexOutOfBoundsException -> 0x01b6 }
            r0.<init>(r8)     // Catch:{ IndexOutOfBoundsException -> 0x01b6 }
            r6.setSpan(r0, r3, r2, r1)     // Catch:{ IndexOutOfBoundsException -> 0x01b6 }
        L_0x01b6:
            r9.setBody((java.lang.CharSequence) r6)
            X.MvE r0 = r7.A00()
            r0.notifyDataSetChanged()
            goto L_0x1b6f
        L_0x01c2:
            java.lang.String r0 = "threadName"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x01cc:
            r6 = 40
            boolean r2 = X.ME7.A02(r6, r8)
            if (r2 == 0) goto L_0x01f2
            r5 = r8
            X.ME7 r5 = (X.ME7) r5
            int r4 = r5.A00
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r4 & r3
            if (r2 == 0) goto L_0x01f2
            int r4 = r4 - r3
            r5.A00 = r4
        L_0x01e2:
            java.lang.Object r10 = r5.A02
            X.1Hj r3 = X.1Hj.A02
            int r2 = r5.A00
            r8 = 1
            if (r2 == 0) goto L_0x01f8
            if (r2 == r8) goto L_0x13e3
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x01f2:
            X.ME7 r5 = new X.ME7
            r5.<init>(r1, r8, r6)
            goto L_0x01e2
        L_0x01f8:
            X.0eS.A00(r10)
            java.lang.Object r4 = r1.A01
            X.02o r4 = (X.02o) r4
            X.3Ii r0 = (X.C239803Ii) r0
            boolean r2 = r0 instanceof X.C239793Ih
            if (r2 == 0) goto L_0x021b
            X.3Ih r0 = (X.C239793Ih) r0
            java.lang.Object r0 = r0.A00
            X.3JD r0 = (X.AnonymousClass3JD) r0
            if (r0 == 0) goto L_0x1b6f
            X.3lr r6 = X.C41845B3m.A0U(r0)
            if (r6 == 0) goto L_0x1b6f
            java.lang.Class<X.B7j> r2 = X.C41932B7j.class
            java.lang.String r1 = "ig_get_safety_intervention_for_id(other_user_id:$other_user_id,use_case_id:$use_case_id)"
            r0 = 1455577683(0x56c25a53, float:1.06846598E14)
            goto L_0x0272
        L_0x021b:
            boolean r0 = r0 instanceof X.C297815sO
            if (r0 != 0) goto L_0x02a0
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0224:
            r6 = 39
            boolean r2 = X.ME7.A02(r6, r8)
            if (r2 == 0) goto L_0x024a
            r5 = r8
            X.ME7 r5 = (X.ME7) r5
            int r4 = r5.A00
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r4 & r3
            if (r2 == 0) goto L_0x024a
            int r4 = r4 - r3
            r5.A00 = r4
        L_0x023a:
            java.lang.Object r10 = r5.A02
            X.1Hj r3 = X.1Hj.A02
            int r2 = r5.A00
            r8 = 1
            if (r2 == 0) goto L_0x0250
            if (r2 == r8) goto L_0x13e3
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x024a:
            X.ME7 r5 = new X.ME7
            r5.<init>(r1, r8, r6)
            goto L_0x023a
        L_0x0250:
            X.0eS.A00(r10)
            java.lang.Object r4 = r1.A01
            X.02o r4 = (X.02o) r4
            X.3Ii r0 = (X.C239803Ii) r0
            boolean r2 = r0 instanceof X.C239793Ih
            if (r2 == 0) goto L_0x0297
            X.3Ih r0 = (X.C239793Ih) r0
            java.lang.Object r0 = r0.A00
            X.3JD r0 = (X.AnonymousClass3JD) r0
            if (r0 == 0) goto L_0x1b6f
            X.3lr r6 = X.C41845B3m.A0U(r0)
            if (r6 == 0) goto L_0x1b6f
            java.lang.Class<X.B7l> r2 = X.C41934B7l.class
            java.lang.String r1 = "ig_get_safety_intervention_for_id(other_user_id:$other_user_id,use_case_id:$use_case_id)"
            r0 = 1277057756(0x4c1e5adc, float:4.1511792E7)
        L_0x0272:
            X.3lr r2 = r6.A03(r2, r1, r0)
            if (r2 == 0) goto L_0x1b6f
            java.lang.Class<X.B7T> r1 = X.B7T.class
            r7 = 0
            r0 = 156366738(0x951f792, float:2.5273867E-33)
            X.3lr r6 = r2.reinterpretRequired(r7, r1, r0)
            if (r6 == 0) goto L_0x1b6f
            java.lang.Class<X.B7U> r2 = X.B7U.class
            java.lang.String r1 = "output"
            r0 = 526145780(0x1f5c58f4, float:4.6660392E-20)
            com.google.common.collect.ImmutableList r0 = r6.getRequiredCompactedTreeListField(r7, r1, r2, r0)
            if (r0 == 0) goto L_0x1b6f
            java.util.ArrayList r0 = X.B7V.A00(r0)
            goto L_0x10e5
        L_0x0297:
            boolean r0 = r0 instanceof X.C297815sO
            if (r0 != 0) goto L_0x02a0
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x02a0:
            java.lang.Object r1 = r1.A02
            X.7Uz r1 = (X.C332427Uz) r1
            X.4Cq r0 = r1.A03
            X.4Cc r0 = r0.ArX()
            X.AnonymousClass5H8.A02(r0)
            java.util.concurrent.atomic.AtomicBoolean r1 = r1.A02
            r0 = 0
            r1.set(r0)
            goto L_0x1b6f
        L_0x02b5:
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 != 0) goto L_0x1b6f
            java.lang.Object r7 = r1.A02
            X.MuA r7 = (X.C67755MuA) r7
            X.05G r4 = r7.A08
            java.lang.Object r0 = r4.getValue()
            boolean r0 = r0 instanceof X.C68770NWf
            if (r0 != 0) goto L_0x1b6f
            java.lang.String r2 = r7.A06
            com.instagram.direct.inbox.notes.NotesRepository r0 = r7.A04
            if (r2 == 0) goto L_0x02f0
            X.0Ud r0 = r0.A0r
            java.lang.Object r0 = r0.getValue()
            java.util.Map r0 = (java.util.Map) r0
            X.4zZ r2 = X.C67755MuA.A00(r7, r0)
        L_0x02db:
            if (r2 == 0) goto L_0x02e0
            X.C67755MuA.A02(r2, r7)
        L_0x02e0:
            java.lang.Object r0 = r4.getValue()
            boolean r0 = r0 instanceof X.C68770NWf
            if (r0 != 0) goto L_0x1330
            java.lang.Object r0 = r4.getValue()
            X.NWg r2 = X.C68771NWg.A00
            goto L_0x04f7
        L_0x02f0:
            X.0Ud r0 = r0.A0p
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            long r5 = r7.A00
            java.util.Iterator r3 = r0.iterator()
        L_0x02fe:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0311
            java.lang.Object r2 = r3.next()
            boolean r0 = X.C66582MXn.A1U(r2, r5)
            if (r0 == 0) goto L_0x02fe
        L_0x030e:
            X.4zZ r2 = (X.C279864zZ) r2
            goto L_0x02db
        L_0x0311:
            r2 = 0
            goto L_0x030e
        L_0x0313:
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x031e
            int r2 = r0.length()
            r0 = 0
            if (r2 != 0) goto L_0x031f
        L_0x031e:
            r0 = 1
        L_0x031f:
            r2 = r0 ^ 1
            r0 = 10
            X.JTb r4 = new X.JTb
            r4.<init>(r2, r0)
            java.lang.Object r0 = r1.A02
            X.OdL r0 = (X.C71126OdL) r0
            com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView r3 = r0.A0D
            if (r3 == 0) goto L_0x1b6f
            java.lang.Object r2 = r1.A01
            X.MSJ r2 = (X.MSJ) r2
            X.LEc r1 = r0.A0T
            com.instagram.common.ui.base.IgSimpleImageView r0 = r0.A05
            r1.A00(r4, r0, r2, r3)
            goto L_0x1b6f
        L_0x033d:
            X.PrV r0 = (X.C74242PrV) r0
            boolean r2 = r0 instanceof X.N8D
            java.lang.String r8 = "noteText"
            if (r2 == 0) goto L_0x0370
            java.lang.Object r1 = r1.A02
            X.NJf r1 = (X.C68467NJf) r1
            com.instagram.common.ui.base.IgTextView r4 = r1.A0I
            com.instagram.common.ui.base.IgTextView r3 = r1.A0G
            if (r3 == 0) goto L_0x03af
            X.N8D r0 = (X.N8D) r0
            java.lang.String r2 = r0.A00
            r0 = 2
            X.0qQ.A0B(r2, r0)
            if (r4 == 0) goto L_0x0369
            android.content.Context r1 = r3.getContext()
            if (r1 == 0) goto L_0x036e
            r0 = 2131954893(0x7f130ccd, float:1.9546298E38)
            java.lang.String r0 = r1.getString(r0)
        L_0x0366:
            r4.setText(r0)
        L_0x0369:
            r3.setText(r2)
            goto L_0x1b6f
        L_0x036e:
            r0 = 0
            goto L_0x0366
        L_0x0370:
            boolean r2 = r0 instanceof X.C72378P3r
            if (r2 == 0) goto L_0x0387
            java.lang.Object r0 = r1.A02
            X.NJf r0 = (X.C68467NJf) r0
            com.instagram.common.ui.base.IgTextView r3 = r0.A0I
            com.instagram.common.ui.base.IgTextView r2 = r0.A0G
            if (r2 == 0) goto L_0x03af
            java.lang.Object r0 = r1.A01
            X.NWf r0 = (X.C68770NWf) r0
            X.C66889MeU.A07(r3, r2, r0)
            goto L_0x1b6f
        L_0x0387:
            boolean r0 = r0 instanceof X.C72377P3q
            if (r0 == 0) goto L_0x1b6f
            java.lang.Object r0 = r1.A02
            X.NJf r0 = (X.C68467NJf) r0
            com.instagram.common.ui.base.IgTextView r3 = r0.A0I
            com.instagram.common.ui.base.IgTextView r2 = r0.A0G
            if (r2 == 0) goto L_0x03af
            java.lang.Object r0 = r1.A01
            X.NWf r0 = (X.C68770NWf) r0
            X.C66889MeU.A06(r3, r2, r0)
            goto L_0x1b6f
        L_0x039e:
            android.net.Uri r0 = (android.net.Uri) r0
            java.lang.Object r5 = r1.A02
            X.NIn r5 = (X.C68449NIn) r5
            if (r0 == 0) goto L_0x0ea8
            X.C68449NIn.A0H(r5)
            android.view.View r2 = r5.A02
            if (r2 != 0) goto L_0x03b7
            java.lang.String r8 = "audiencePickerContainer"
        L_0x03af:
            X.0qQ.A0F(r8)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x03b7:
            r1 = 4
            X.C71397Ojw.A00(r2, r1, r5)
            X.0eM r1 = r5.A1E
            java.lang.Object r1 = r1.getValue()
            X.Mtr r1 = (X.C67738Mtr) r1
            com.instagram.direct.inbox.notes.models.NoteAudienceItem r2 = r5.A0c
            if (r2 != 0) goto L_0x03ca
            java.lang.String r8 = "currentAudience"
            goto L_0x03af
        L_0x03ca:
            X.05G r1 = r1.A01
            r1.Epw(r2)
            X.0eM r6 = r5.A1T
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r6)
            X.0Tu r7 = X.0Tu.A05
            r1 = 36324569941815456(0x810d01000030a0, double:3.035142526282464E-306)
            boolean r1 = X.182.A06(r7, r3, r1)
            java.lang.String r8 = "pogViewContainer"
            com.instagram.direct.inbox.notes.creation.NotesCreationPogView r4 = r5.A0b
            if (r1 == 0) goto L_0x0414
            if (r4 == 0) goto L_0x03af
            com.instagram.direct.inbox.notes.creation.NotesCreationPogView.A00(r4)
            androidx.cardview.widget.CardView r1 = r4.A00
            r3 = 0
            r1.setVisibility(r3)
            X.3oV r1 = r4.A05
            r1.setVisibility(r3)
            com.instagram.direct.inbox.notes.creation.NotesCreationPogView r1 = r5.A0b
            if (r1 == 0) goto L_0x03af
            X.3oV r7 = r1.A05
            X.Mm0 r2 = r5.A0d
            if (r2 == 0) goto L_0x0467
            java.lang.String r1 = "notes_creation_sheet"
            java.lang.String r0 = " resume"
            java.lang.String r1 = X.002.A0R(r1, r0)
            X.0qQ.A0B(r1, r3)
            X.Tol r0 = r2.A00
            if (r0 == 0) goto L_0x1b6f
            r0.A0C(r1, r3)
            goto L_0x1b6f
        L_0x0414:
            if (r4 == 0) goto L_0x03af
            com.instagram.direct.inbox.notes.creation.NotesCreationPogView.A00(r4)
            androidx.cardview.widget.CardView r1 = r4.A00
            r2 = 0
            r1.setVisibility(r2)
            X.3oV r1 = r4.A06
            r1.setVisibility(r2)
            com.instagram.direct.inbox.notes.creation.NotesCreationPogView r1 = r5.A0b
            if (r1 == 0) goto L_0x03af
            X.3oV r4 = r1.A06
            android.view.View r3 = r4.getView()
            android.widget.VideoView r3 = (android.widget.VideoView) r3
            r2 = 3
            X.LVJ r1 = new X.LVJ
            r1.<init>(r5, r2)
            r3.setOnPreparedListener(r1)
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r6)
            r1 = 36318058774468429(0x810715002f174d, double:3.0310248378338376E-306)
            boolean r1 = X.182.A06(r7, r3, r1)
            if (r1 == 0) goto L_0x0453
            android.view.View r2 = r4.getView()
            android.widget.VideoView r2 = (android.widget.VideoView) r2
            X.OgS r1 = X.C71261OgS.A00
            r2.setOnErrorListener(r1)
        L_0x0453:
            android.view.View r1 = r4.getView()
            android.widget.VideoView r1 = (android.widget.VideoView) r1
            r1.setVideoURI(r0)
            android.view.View r0 = r4.getView()
            android.widget.VideoView r0 = (android.widget.VideoView) r0
            r0.start()
            goto L_0x1b6f
        L_0x0467:
            X.1Xx r2 = new X.1Xx
            r2.<init>()
            java.lang.String r1 = ""
            r2.A5j = r1
            r9 = 0
            java.lang.String r15 = r0.toString()
            com.instagram.model.mediasize.VideoVersion r8 = new com.instagram.model.mediasize.VideoVersion
            r10 = r9
            r11 = r9
            r12 = r9
            r13 = r9
            r14 = r9
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            java.util.List r1 = X.AnonymousClass7TE.A1I(r8)
            r2.EqT(r1)
            X.1iA r1 = X.1iA.A0a
            int r1 = r1.A00
            java.lang.Integer r1 = X.JTO.A0w(r1)
            r2.A4m = r1
            java.util.concurrent.atomic.AtomicBoolean r1 = X.1Xj.A0i
            X.1Xj r4 = X.1Xv.A02(r2)
            if (r4 == 0) goto L_0x1b6f
            java.lang.String r0 = r0.toString()
            r4.A0M = r0
            android.view.View r0 = r7.getView()
            android.content.Context r3 = X.AnonymousClass7TE.A0S(r0)
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r6)
            java.lang.String r0 = "notes_creation_sheet"
            X.Mm0 r1 = new X.Mm0
            r1.<init>(r3, r2, r0)
            android.view.View r0 = r7.getView()
            X.3Ua r0 = (X.C242423Ua) r0
            r1.A01(r4, r0)
            r5.A0d = r1
            goto L_0x1b6f
        L_0x04be:
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 != 0) goto L_0x1b6f
            java.lang.Object r3 = r1.A02
            X.MuG r3 = (X.C67760MuG) r3
            X.05G r4 = r3.A05
            java.lang.Object r0 = r4.getValue()
            boolean r0 = r0 instanceof X.C68766NWb
            if (r0 != 0) goto L_0x1b6f
            java.lang.String r2 = r3.A03
            com.instagram.direct.inbox.notes.NotesRepository r0 = r3.A01
            if (r2 == 0) goto L_0x0502
            X.0Ud r0 = r0.A0r
            java.lang.Object r0 = X.JTR.A0z(r2, r0)
            X.4zc r0 = (X.C279894zc) r0
            X.4zZ r0 = X.C67760MuG.A00(r0, r3)
        L_0x04e4:
            if (r0 == 0) goto L_0x04e9
            X.C67760MuG.A03(r0, r3)
        L_0x04e9:
            java.lang.Object r0 = r4.getValue()
            boolean r0 = r0 instanceof X.C68766NWb
            if (r0 != 0) goto L_0x1330
            java.lang.Object r0 = r4.getValue()
            X.NWd r2 = X.C68768NWd.A00
        L_0x04f7:
            boolean r0 = X.0qQ.A0K(r0, r2)
            if (r0 != 0) goto L_0x1330
            r4.Epw(r2)
            goto L_0x1330
        L_0x0502:
            X.0Ud r0 = r0.A0p
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            X.4zZ r0 = X.C67760MuG.A01(r3, r0)
            goto L_0x04e4
        L_0x050f:
            X.Nod r0 = (X.C69595Nod) r0
            boolean r2 = r0 instanceof X.C68766NWb
            if (r2 == 0) goto L_0x0db5
            java.lang.Object r5 = r1.A02
            X.NKL r5 = (X.NKL) r5
            X.NWb r0 = (X.C68766NWb) r0
            java.lang.Object r7 = r1.A01
            android.view.View r7 = (android.view.View) r7
            com.instagram.ui.widget.spinner.SpinnerImageView r2 = r5.A0P
            if (r2 != 0) goto L_0x0527
            java.lang.String r13 = "loadingIndicator"
            goto L_0x168b
        L_0x0527:
            X.3uy r1 = X.C255943uy.SUCCESS
            r2.setLoadingStatus(r1)
            X.NKL.A04(r5, r0)
            java.lang.String r1 = r0.A0F
            r17 = r1
            java.lang.String r13 = "title"
            r21 = r13
            if (r1 == 0) goto L_0x055b
            com.instagram.common.ui.base.IgTextView r2 = r5.A0B
            if (r2 == 0) goto L_0x168b
            X.NKL.A02(r2, r5, r0, r1)
            com.instagram.common.ui.base.IgTextView r2 = r5.A0A
            java.lang.String r13 = "subtitle"
            if (r2 == 0) goto L_0x168b
            r1 = 0
            r2.setVisibility(r1)
            java.lang.String r8 = r0.A0C
            com.instagram.common.ui.base.IgTextView r1 = r5.A0A
        L_0x054e:
            if (r1 == 0) goto L_0x168b
            X.NKL.A02(r1, r5, r0, r8)
            com.instagram.common.ui.base.IgTextView r9 = r5.A06
            if (r9 != 0) goto L_0x0560
            java.lang.String r20 = "audienceText"
            goto L_0x0a0e
        L_0x055b:
            java.lang.String r8 = r0.A0C
            com.instagram.common.ui.base.IgTextView r1 = r5.A0B
            goto L_0x054e
        L_0x0560:
            X.0eM r6 = r5.A0S
            r6.getValue()
            android.content.res.Resources r11 = X.C66580MXl.A0B(r9)
            com.instagram.direct.inbox.notes.models.NoteAudienceItem r10 = r0.A0A
            boolean r4 = X.DbW.A1Y(r10)
            r2 = 2131954072(0x7f130998, float:1.9544633E38)
            java.lang.String r1 = X.C69982NvM.A00(r11, r10)
            r3 = 0
            java.lang.String r1 = X.AnonymousClass7TF.A0e(r11, r1, r2)
            X.0qQ.A07(r1)
            r9.setText(r1)
            r9.setVisibility(r3)
            com.instagram.direct.inbox.notes.models.NoteAudience r2 = r10.A00
            com.instagram.direct.inbox.notes.models.NoteAudience r1 = com.instagram.direct.inbox.notes.models.NoteAudience.CLOSE_FRIENDS
            if (r2 != r1) goto L_0x05b1
            r1 = 2131238089(0x7f081cc9, float:1.8092447E38)
            r9.setCompoundDrawablesRelativeWithIntrinsicBounds(r3, r3, r1, r3)
            android.content.Context r2 = r9.getContext()
            android.content.Context r1 = r5.getContext()
            int r1 = X.2Yu.A08(r1)
            int r1 = r2.getColor(r1)
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r9.setCompoundDrawableTintList(r1)
            r2 = 16
            X.LYE r1 = new X.LYE
            r1.<init>((java.lang.Object) r5, (int) r2)
            X.AnonymousClass0fU.A00(r1, r9)
        L_0x05b1:
            com.instagram.api.schemas.MusicNoteResponseInfo r9 = r0.A03
            if (r9 == 0) goto L_0x05cb
            com.instagram.user.model.User r13 = r9.A01
            if (r13 == 0) goto L_0x0625
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r6)
            boolean r1 = X.AnonymousClass4AJ.A07(r1)
            if (r1 == 0) goto L_0x0625
            com.instagram.common.ui.base.IgTextView r2 = r5.A07
            if (r2 != 0) goto L_0x05d6
            java.lang.String r20 = "musicReshareSubtitle"
            goto L_0x0a0e
        L_0x05cb:
            com.instagram.api.schemas.ListeningNowResponseInfo r1 = r0.A01
            if (r1 == 0) goto L_0x05d4
            java.lang.Integer r1 = r1.A03
            if (r1 == 0) goto L_0x05d4
            goto L_0x0629
        L_0x05d4:
            r11 = 0
            goto L_0x062d
        L_0x05d6:
            android.content.res.Resources r11 = r2.getResources()
            r10 = 2131968625(0x7f134271, float:1.957415E38)
            java.lang.String r1 = r13.getUsername()
            java.lang.String r1 = X.AnonymousClass7TF.A0e(r11, r1, r10)
            android.text.SpannableStringBuilder r12 = X.DbS.A0C(r1)
            java.lang.String r14 = r13.getUsername()
            android.content.Context r11 = r2.getContext()
            int r1 = X.DbV.A01(r11)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            X.7AK r1 = new X.7AK
            r1.<init>(r10)
            X.AnonymousClass7AV.A03(r12, r1, r14)
            r1 = 11
            X.C71408Ok7.A00(r2, r1, r5, r13)
            r2.setText(r12)
            r2.setVisibility(r3)
            r1 = 2131238719(0x7f081f3f, float:1.8093725E38)
            r2.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r3, r3, r3)
            android.content.Context r1 = r5.getContext()
            int r1 = X.2Yu.A08(r1)
            int r1 = r11.getColor(r1)
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r2.setCompoundDrawableTintList(r1)
        L_0x0625:
            java.lang.Integer r1 = r9.A04
            if (r1 == 0) goto L_0x05cb
        L_0x0629:
            int r11 = r1.intValue()
        L_0x062d:
            java.lang.String r13 = "spotifySavesSubtitleStub"
            if (r11 <= 0) goto L_0x067f
            X.0lg r12 = X.AnonymousClass7TF.A0L(r6, r3)
            X.0Tu r10 = X.0Tu.A05
            r1 = 36328499836894587(0x81109400003d7b, double:3.037627807754924E-306)
            boolean r1 = X.182.A06(r10, r12, r1)
            if (r1 == 0) goto L_0x067f
            X.3oV r1 = r5.A0H
            if (r1 == 0) goto L_0x168b
            r1.setVisibility(r3)
            X.3oV r1 = r5.A0H
            if (r1 == 0) goto L_0x168b
            android.view.View r2 = r1.getView()
            r1 = 2131441633(0x7f0b37e1, float:1.8505283E38)
            android.widget.TextView r10 = X.AnonymousClass7TG.A0R(r2, r1)
            android.content.res.Resources r2 = X.DbV.A05(r5)
            r1 = 2131820857(0x7f110139, float:1.927444E38)
            java.lang.String r1 = X.DbY.A0d(r2, r11, r1)
            r10.setText(r1)
        L_0x0666:
            com.instagram.api.schemas.NotePogVideoDict r1 = r0.A06
            r16 = r1
            if (r1 == 0) goto L_0x0742
            r5.A04 = r1
            java.util.List r2 = r1.A03
            boolean r1 = X.AnonymousClass7TE.A1b(r2)
            if (r1 == 0) goto L_0x0838
            com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView r1 = r5.A0N
            r10 = 0
            if (r1 != 0) goto L_0x0689
            java.lang.String r2 = "profilePicNoteHeader"
            goto L_0x16a4
        L_0x067f:
            X.3oV r2 = r5.A0H
            if (r2 == 0) goto L_0x168b
            r1 = 8
            r2.setVisibility(r1)
            goto L_0x0666
        L_0x0689:
            r12 = 8
            r1.setVisibility(r12)
            java.lang.Object r1 = r2.get(r3)
            com.instagram.model.mediasize.VideoVersion r1 = (com.instagram.model.mediasize.VideoVersion) r1
            java.lang.String r11 = r1.A06
            androidx.cardview.widget.CardView r1 = r5.A00
            if (r1 != 0) goto L_0x069e
            java.lang.String r2 = "avatarVideoViewContainer"
            goto L_0x16a4
        L_0x069e:
            r1.setVisibility(r3)
            X.0lg r14 = X.DbT.A0X(r6)
            X.0Tu r13 = X.0Tu.A05
            r1 = 36324569941815456(0x810d01000030a0, double:3.035142526282464E-306)
            boolean r1 = X.182.A06(r13, r14, r1)
            java.lang.String r2 = "avatarVideoView"
            java.lang.String r13 = "avatarSimpleVideoLayout"
            if (r1 == 0) goto L_0x0713
            X.3oV r1 = r5.A0E
            if (r1 == 0) goto L_0x16a4
            r1.setVisibility(r12)
            X.3oV r1 = r5.A0D
            if (r1 == 0) goto L_0x168b
            r1.setVisibility(r3)
            X.Mm0 r10 = r5.A0L
            if (r10 == 0) goto L_0x06dc
            java.lang.String r2 = "note_self_note_bottom_sheet"
            java.lang.String r1 = " resume"
            java.lang.String r2 = X.002.A0R(r2, r1)
            X.0qQ.A0B(r2, r3)
            X.Tol r1 = r10.A00
            if (r1 == 0) goto L_0x0838
            r1.A0C(r2, r3)
            goto L_0x0838
        L_0x06dc:
            X.1Xj r11 = X.AnonymousClass4A2.A02(r16)
            if (r11 == 0) goto L_0x0838
            X.3oV r1 = r5.A0D
            if (r1 == 0) goto L_0x168b
            android.view.View r1 = r1.getView()
            android.content.Context r12 = X.AnonymousClass7TE.A0S(r1)
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r6)
            java.lang.String r1 = "note_self_note_bottom_sheet"
            X.Mm0 r10 = new X.Mm0
            r10.<init>(r12, r2, r1)
            r2 = 10
            X.JG2 r1 = new X.JG2
            r1.<init>(r2, r0, r5)
            r10.A02 = r1
            X.3oV r1 = r5.A0D
            if (r1 == 0) goto L_0x168b
            android.view.View r1 = r1.getView()
            X.3Ua r1 = (X.C242423Ua) r1
            r10.A01(r11, r1)
            r5.A0L = r10
            goto L_0x0838
        L_0x0713:
            X.3oV r1 = r5.A0D
            if (r1 == 0) goto L_0x168b
            r1.setVisibility(r12)
            X.3oV r1 = r5.A0E
            if (r1 == 0) goto L_0x16a4
            android.view.View r2 = r1.getView()
            android.widget.VideoView r2 = (android.widget.VideoView) r2
            r2.setAudioFocusRequest(r3)
            if (r11 == 0) goto L_0x072d
            android.net.Uri r10 = X.0cp.A03(r11)
        L_0x072d:
            r2.setVideoURI(r10)
            r2.start()
            X.OgV r1 = X.C71264OgV.A00
            r2.setOnPreparedListener(r1)
            X.OgR r1 = new X.OgR
            r1.<init>(r3, r5, r0)
            r2.setOnErrorListener(r1)
            goto L_0x0838
        L_0x0742:
            com.instagram.api.schemas.NotePogImageDict r1 = r0.A05
            if (r1 == 0) goto L_0x0772
            r5.A03 = r1
            java.lang.String r1 = r1.A01
            if (r1 == 0) goto L_0x0838
            com.instagram.common.typedurl.SimpleImageUrl r2 = X.DbS.A0V(r1)
            com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView r1 = r5.A0N
            java.lang.String r13 = "profilePicNoteHeader"
            if (r1 == 0) goto L_0x168b
            r1.setVisibility(r3)
            com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView r1 = r5.A0N
            if (r1 == 0) goto L_0x168b
            r1.A04(r2, r5)
            androidx.cardview.widget.CardView r2 = r5.A00
            if (r2 != 0) goto L_0x0768
            java.lang.String r13 = "avatarVideoViewContainer"
            goto L_0x168b
        L_0x0768:
            r1 = 8
            r2.setVisibility(r1)
            X.NKL.A03(r5)
            goto L_0x0838
        L_0x0772:
            java.lang.Boolean r1 = r0.A0B
            boolean r1 = X.AnonymousClass7TF.A1Y(r1, r4)
            if (r1 == 0) goto L_0x0838
            com.instagram.api.schemas.NoteChatResponseInfo r11 = r0.A04
            if (r11 == 0) goto L_0x07a1
            java.util.List r1 = r11.BxY()
            java.util.ArrayList r12 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r10 = r1.iterator()
        L_0x078a:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x07b1
            com.instagram.user.model.User r1 = X.DbT.A0k(r10)
            com.instagram.common.typedurl.ImageUrl r2 = r1.Bh3()
            com.instagram.common.typedurl.SimpleImageUrl r1 = new com.instagram.common.typedurl.SimpleImageUrl
            r1.<init>(r2)
            r12.add(r1)
            goto L_0x078a
        L_0x07a1:
            com.instagram.common.typedurl.ImageUrl r1 = r0.A09
            if (r1 == 0) goto L_0x0804
            java.lang.String r1 = r1.getUrl()
            com.instagram.common.typedurl.SimpleImageUrl r1 = X.DbS.A0V(r1)
            java.util.List r12 = X.AnonymousClass7TE.A1I(r1)
        L_0x07b1:
            com.instagram.common.ui.widget.imageview.IgImageView r13 = r5.A0C
            java.lang.String r14 = "noteChatFaceSwarm"
            if (r13 == 0) goto L_0x1452
            android.content.Context r10 = r5.requireContext()
            r2 = 1065353216(0x3f800000, float:1.0)
            X.NQo r1 = new X.NQo
            r1.<init>(r10, r12, r2)
            r13.setImageDrawable(r1)
            androidx.cardview.widget.CardView r1 = r5.A00
            if (r1 != 0) goto L_0x07cd
            java.lang.String r14 = "avatarVideoViewContainer"
            goto L_0x1452
        L_0x07cd:
            r2 = 8
            r1.setVisibility(r2)
            com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView r1 = r5.A0N
            if (r1 != 0) goto L_0x07da
            java.lang.String r14 = "profilePicNoteHeader"
            goto L_0x1452
        L_0x07da:
            r1.setVisibility(r2)
            androidx.constraintlayout.widget.ConstraintLayout r1 = r5.A01
            if (r1 != 0) goto L_0x07e5
            java.lang.String r14 = "profilePicContainer"
            goto L_0x1452
        L_0x07e5:
            r1.setVisibility(r2)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r5.A0C
            if (r1 == 0) goto L_0x1452
            r1.setVisibility(r3)
            com.instagram.common.ui.base.IgTextView r2 = r5.A0B
            if (r2 != 0) goto L_0x07f7
            r13 = r21
            goto L_0x168b
        L_0x07f7:
            r1 = 8
            r2.setVisibility(r1)
            com.instagram.common.ui.base.IgTextView r1 = r5.A09
            if (r1 != 0) goto L_0x0809
            java.lang.String r13 = "noteChatTitle"
            goto L_0x168b
        L_0x0804:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0809:
            X.NKL.A02(r1, r5, r0, r8)
            com.instagram.common.ui.base.IgTextView r1 = r5.A08
            java.lang.String r2 = "noteChatMemberCount"
            if (r1 == 0) goto L_0x16a4
            r1.setVisibility(r3)
            com.instagram.common.ui.base.IgTextView r10 = r5.A08
            if (r10 == 0) goto L_0x16a4
            if (r11 == 0) goto L_0x0c63
            android.content.res.Resources r12 = X.DbV.A05(r5)
            int r1 = r11.BWz()
            r2 = 2131968533(0x7f134215, float:1.9573963E38)
            if (r1 != r4) goto L_0x082b
            r2 = 2131968536(0x7f134218, float:1.957397E38)
        L_0x082b:
            int r1 = r11.BWz()
            java.lang.String r1 = X.JTS.A0i(r12, r1, r2)
            if (r1 == 0) goto L_0x0c63
        L_0x0835:
            r10.setText(r1)
        L_0x0838:
            if (r9 == 0) goto L_0x08e2
            com.instagram.api.schemas.MusicInfo r12 = r9.A00
            if (r12 == 0) goto L_0x08e2
            com.instagram.api.schemas.TrackData r1 = r12.BUk()
            java.lang.String r10 = r1.getTitle()
            java.lang.String r2 = ""
            if (r10 != 0) goto L_0x084b
            r10 = r2
        L_0x084b:
            com.instagram.api.schemas.TrackData r1 = r12.BUk()
            java.lang.String r9 = r1.getDisplayArtist()
            if (r9 != 0) goto L_0x0856
            r9 = r2
        L_0x0856:
            com.instagram.api.schemas.TrackData r1 = r12.BUk()
            boolean r2 = r1.isExplicit()
            r1 = 2131436678(0x7f0b2486, float:1.8495233E38)
            android.view.ViewStub r1 = X.DbS.A0F(r7, r1)
            if (r1 == 0) goto L_0x0c5b
            r1.inflate()
        L_0x086a:
            r1 = 2131428986(0x7f0b067a, float:1.8479632E38)
            android.widget.TextView r1 = X.DbU.A0G(r7, r1)
            r1.setText(r9)
            r1 = 2131428988(0x7f0b067c, float:1.8479636E38)
            android.widget.TextView r9 = X.DbU.A0G(r7, r1)
            android.content.res.Resources r1 = r9.getResources()
            int r11 = X.AnonymousClass7TE.A0F(r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            X.6KL r11 = X.AnonymousClass6KK.A00(r1, r11, r4)
            r11.A05 = r4
            r11.invalidateSelf()
            android.view.View r1 = r9.getRootView()
            android.content.Context r13 = r1.getContext()
            android.content.Context r1 = r9.getContext()
            int r1 = X.2Yu.A0B(r1)
            int r13 = r13.getColor(r1)
            android.graphics.Paint r1 = r11.A0A
            r1.setColor(r13)
            r1 = 0
            r9.setCompoundDrawablesRelativeWithIntrinsicBounds(r11, r1, r1, r1)
            android.text.SpannableStringBuilder r1 = X.NKL.A00(r5, r10, r2)
            r9.setText(r1)
            r9.setSelected(r4)
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()
            java.lang.CharSequence r1 = r9.getText()
            r2.append(r1)
            r1 = 32
            r2.append(r1)
            java.lang.String r1 = X.AnonymousClass7TF.A0l(r8, r2)
            java.lang.String r11 = X.DbV.A12(r1)
            android.content.Context r10 = r5.requireContext()
            X.0h9 r9 = r5.mLifecycleRegistry
            X.0qQ.A07(r9)
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r6)
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            X.C71121OdF.A00(r10, r9, r2, r1, r11)
            X.NKL.A01(r12, r5)
        L_0x08e2:
            com.instagram.api.schemas.ListeningNowResponseInfo r9 = r0.A01
            if (r9 == 0) goto L_0x0a2c
            X.3oV r1 = r5.A0G
            java.lang.String r20 = "spotifyNoteHeaderStub"
            if (r1 == 0) goto L_0x0a0e
            android.view.View r2 = r1.getView()
            r1 = 2131441630(0x7f0b37de, float:1.8505277E38)
            android.widget.TextView r12 = X.AnonymousClass7TG.A0R(r2, r1)
            X.3oV r1 = r5.A0G
            if (r1 == 0) goto L_0x0a0e
            android.view.View r2 = r1.getView()
            r1 = 2131441627(0x7f0b37db, float:1.850527E38)
            android.widget.TextView r11 = X.AnonymousClass7TG.A0R(r2, r1)
            com.instagram.api.schemas.MusicInfo r10 = r9.A01
            if (r10 == 0) goto L_0x09d6
            com.instagram.api.schemas.TrackData r1 = r10.BUk()
            java.lang.String r2 = r1.getTitle()
            java.lang.String r18 = ""
            if (r2 != 0) goto L_0x0918
            r2 = r18
        L_0x0918:
            com.instagram.api.schemas.TrackData r1 = r10.BUk()
            boolean r1 = r1.isExplicit()
            android.text.SpannableStringBuilder r19 = X.NKL.A00(r5, r2, r1)
            android.text.SpannableStringBuilder r1 = X.C51965G9l.A0E()
            java.lang.String r15 = " "
            android.text.SpannableStringBuilder r14 = r1.append(r15)
            X.0qQ.A07(r14)
            android.text.style.StyleSpan r13 = new android.text.style.StyleSpan
            r13.<init>(r4)
            int r2 = r14.length()
            r1 = r19
            r14.append(r1)
            X.C66582MXn.A12(r14, r13, r2)
            android.text.SpannableStringBuilder r13 = r14.append(r15)
            android.content.Context r2 = r5.requireContext()
            r1 = 2131965115(0x7f1334bb, float:1.956703E38)
            java.lang.CharSequence r1 = r2.getText(r1)
            android.text.SpannableStringBuilder r1 = r13.append(r1)
            android.text.SpannableStringBuilder r2 = r1.append(r15)
            com.instagram.api.schemas.TrackData r1 = r10.BUk()
            java.lang.String r1 = r1.getDisplayArtist()
            if (r1 == 0) goto L_0x0965
            r18 = r1
        L_0x0965:
            r1 = r18
            android.text.SpannableStringBuilder r14 = r2.append(r1)
            com.instagram.api.schemas.ListeningNowState r2 = r9.A00
            com.instagram.api.schemas.ListeningNowState r1 = com.instagram.api.schemas.ListeningNowState.LISTENING_INVALID_SONG
            r15 = 2130970273(0x7f0406a1, float:1.7549251E38)
            if (r2 != r1) goto L_0x0977
            r15 = 2130970306(0x7f0406c2, float:1.7549318E38)
        L_0x0977:
            android.content.Context r18 = r5.requireContext()
            r13 = 2131238353(0x7f081dd1, float:1.8092982E38)
            android.content.Context r2 = r5.requireContext()
            android.content.Context r1 = r5.getContext()
            int r2 = X.JTP.A02(r1, r2, r15)
            r1 = r18
            android.graphics.drawable.Drawable r1 = X.AnonymousClass3JT.A05(r1, r13, r2)
            r2 = 1094713344(0x41400000, float:12.0)
            int r2 = X.C66583MXo.A04(r5, r2)
            r1.setBounds(r3, r3, r2, r2)
            X.46l r2 = new X.46l
            r2.<init>(r1)
            android.content.Context r1 = r5.requireContext()
            int r1 = X.AnonymousClass7TG.A04(r1)
            r2.A01 = r1
            r1 = 33
            r14.setSpan(r2, r3, r4, r1)
            r12.setText(r14)
            java.lang.StringBuilder r2 = X.JTQ.A0d(r19)
            r1 = 32
            r2.append(r1)
            java.lang.String r1 = X.AnonymousClass7TF.A0l(r8, r2)
            java.lang.String r15 = X.DbV.A12(r1)
            android.content.Context r14 = r5.requireContext()
            X.0h9 r13 = r5.mLifecycleRegistry
            X.0qQ.A07(r13)
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r6)
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            X.C71121OdF.A00(r14, r13, r2, r1, r15)
            X.NKL.A01(r10, r5)
        L_0x09d6:
            X.3oV r1 = r5.A0G
            if (r1 == 0) goto L_0x0a0e
            android.view.View r2 = r1.getView()
            r1 = 2131441629(0x7f0b37dd, float:1.8505275E38)
            android.widget.TextView r14 = X.DbU.A0G(r2, r1)
            androidx.fragment.app.FragmentActivity r13 = r5.requireActivity()
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r6)
            java.lang.String r1 = "note_self_note_bottom_sheet"
            java.lang.CharSequence r1 = X.C66889MeU.A03(r13, r2, r8, r1)
            r14.setText(r1)
            int r1 = r8.length()
            boolean r2 = X.AnonymousClass7TF.A1Q(r1)
            r13 = 8
            r1 = 0
            if (r2 == 0) goto L_0x0a05
            r1 = 8
        L_0x0a05:
            r14.setVisibility(r1)
            com.instagram.common.ui.base.IgTextView r1 = r5.A0B
            if (r1 != 0) goto L_0x0a13
            r20 = r21
        L_0x0a0e:
            X.0qQ.A0F(r20)
            goto L_0x14ac
        L_0x0a13:
            r1.setVisibility(r13)
            boolean r8 = X.AnonymousClass7TF.A1V(r10)
            com.instagram.api.schemas.ListeningNowState r2 = r9.A00
            com.instagram.api.schemas.ListeningNowState r1 = com.instagram.api.schemas.ListeningNowState.NOT_LISTENING
            if (r2 != r1) goto L_0x0c0b
            android.content.res.Resources r2 = X.DbV.A05(r5)
            if (r8 == 0) goto L_0x0bbf
            r1 = 2131965117(0x7f1334bd, float:1.9567035E38)
            X.DbU.A1A(r2, r11, r1)
        L_0x0a2c:
            com.instagram.api.schemas.GIFNoteResponseInfo r10 = r0.A00
            if (r10 == 0) goto L_0x0a7d
            X.0lg r11 = X.AnonymousClass7TF.A0L(r6, r3)
            X.0Tu r8 = X.0Tu.A05
            r1 = 36328727470161463(0x8110c900003e37, double:3.037771763949502E-306)
            boolean r1 = X.182.A06(r8, r11, r1)
            if (r1 == 0) goto L_0x0a7d
            r1 = 2131433556(0x7f0b1854, float:1.8488901E38)
            android.view.View r2 = X.JTR.A0V(r7, r1)
            com.instagram.api.schemas.CommentGiphyMediaInfoIntf r1 = r10.B9E()
            if (r1 == 0) goto L_0x0a7d
            com.instagram.api.schemas.CommentGiphyMediaInfo r8 = r1.F1x()
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r6)
            boolean r1 = X.AnonymousClass4AJ.A04(r1)
            java.lang.String r11 = "profilePicNoteHeader"
            r10 = 8
            if (r1 == 0) goto L_0x0ba5
            r1 = 2131433557(0x7f0b1855, float:1.8488903E38)
            android.view.View r2 = r2.findViewById(r1)
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r2 = (com.instagram.common.ui.widget.imageview.RoundedCornerImageView) r2
            r2.setVisibility(r3)
            com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView r1 = r5.A0N
            if (r1 == 0) goto L_0x198c
            r1.setVisibility(r10)
            X.PaW r1 = new X.PaW
            r1.<init>(r8, r2, r5)
        L_0x0a78:
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r2.post(r1)
        L_0x0a7d:
            com.instagram.api.schemas.LocationNoteResponseInfo r1 = r0.A02
            if (r1 == 0) goto L_0x0aea
            r5.A02 = r1
            r1 = 2131435683(0x7f0b20a3, float:1.8493215E38)
            android.view.View r8 = X.JTR.A0V(r7, r1)
            X.0qQ.A0A(r8)
            com.instagram.api.schemas.LocationNoteResponseInfo r1 = r5.A02
            r10 = 0
            if (r1 == 0) goto L_0x0ba2
            java.lang.String r12 = r1.BNl()
        L_0x0a96:
            android.content.Context r2 = r5.requireContext()
            r1 = 2131238501(0x7f081e65, float:1.8093282E38)
            android.graphics.drawable.Drawable r11 = r2.getDrawable(r1)
            if (r11 == 0) goto L_0x0ab9
            android.graphics.drawable.Drawable r13 = r11.mutate()
            if (r13 == 0) goto L_0x0ab9
            android.content.Context r2 = r5.requireContext()
            r1 = 2131100354(0x7f0602c2, float:1.7813087E38)
            int r2 = r2.getColor(r1)
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            X.C51969G9p.A12(r1, r13, r2)
        L_0x0ab9:
            int r1 = X.DbZ.A02(r5)
            if (r11 == 0) goto L_0x0ac2
            r11.setBounds(r3, r3, r1, r1)
        L_0x0ac2:
            r1 = 32
            java.lang.String r1 = X.002.A0D(r12, r1)
            android.text.SpannableString r2 = X.C66580MXl.A0D(r1)
            if (r11 == 0) goto L_0x0adb
            X.46l r10 = new X.46l
            r10.<init>(r11)
            r1 = 1082130432(0x40800000, float:4.0)
            int r1 = X.C66583MXo.A04(r5, r1)
            r10.A01 = r1
        L_0x0adb:
            r1 = 33
            r2.setSpan(r10, r3, r4, r1)
            r1 = 2131435685(0x7f0b20a5, float:1.849322E38)
            android.widget.TextView r1 = X.AnonymousClass7TE.A0d(r8, r1)
            r1.setText(r2)
        L_0x0aea:
            r1 = 2131437026(0x7f0b25e2, float:1.849594E38)
            android.view.View r8 = r7.findViewById(r1)
            X.61u r8 = (X.C3021461u) r8
            r2 = 12
            X.Ok7 r1 = new X.Ok7
            r1.<init>((X.NKL) r5, (X.C68766NWb) r0, (int) r2)
            r8.setPrimaryActionOnClickListener(r1)
            java.lang.Boolean r1 = r0.A0B
            boolean r1 = X.AnonymousClass7TF.A1Y(r1, r4)
            if (r1 == 0) goto L_0x0b13
            android.content.res.Resources r2 = r8.getResources()
            r1 = 2131968556(0x7f13422c, float:1.957401E38)
            java.lang.String r1 = r2.getString(r1)
            r8.setPrimaryActionText(r1)
        L_0x0b13:
            if (r17 == 0) goto L_0x0b2d
            android.content.res.Resources r2 = r8.getResources()
            r1 = 2131970841(0x7f134b19, float:1.9578644E38)
            java.lang.String r1 = r2.getString(r1)
            r8.setPrimaryActionText(r1)
            r1 = 2131970840(0x7f134b18, float:1.9578642E38)
            java.lang.String r1 = r2.getString(r1)
            r8.setSecondaryActionText(r1)
        L_0x0b2d:
            if (r9 == 0) goto L_0x0b3d
            android.content.res.Resources r2 = r8.getResources()
            r1 = 2131974226(0x7f135852, float:1.958551E38)
            java.lang.String r1 = r2.getString(r1)
            r8.setSecondaryActionText(r1)
        L_0x0b3d:
            r2 = 13
            X.Ok7 r1 = new X.Ok7
            r1.<init>((X.NKL) r5, (X.C68766NWb) r0, (int) r2)
            r8.setSecondaryActionOnClickListener(r1)
            X.0lg r9 = X.AnonymousClass7TF.A0L(r6, r3)
            X.0Tu r8 = X.0Tu.A05
            r1 = 36321237047715005(0x8109f9000824bd, double:3.0330347906328514E-306)
            boolean r1 = X.182.A06(r8, r9, r1)
            if (r1 != 0) goto L_0x0c89
            X.0lg r9 = X.AnonymousClass7TF.A0L(r6, r3)
            r1 = 36321237047256252(0x8109f9000124bc, double:3.033034790342734E-306)
            boolean r1 = X.182.A06(r8, r9, r1)
            if (r1 == 0) goto L_0x0c89
            java.util.List r2 = r0.A0I
            boolean r1 = X.AnonymousClass7TE.A1b(r2)
            if (r1 == 0) goto L_0x0c89
            r1 = 2131437069(0x7f0b260d, float:1.8496026E38)
            android.view.View r10 = r7.findViewById(r1)
            android.view.ViewStub r10 = (android.view.ViewStub) r10
            if (r10 == 0) goto L_0x0c89
            X.0eM r1 = r5.A0R
            java.lang.Object r9 = r1.getValue()
            X.OLu r9 = (X.C70799OLu) r9
            androidx.fragment.app.FragmentActivity r11 = r5.requireActivity()
            java.util.ArrayList r12 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r7 = r2.iterator()
        L_0x0b8e:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0c73
            java.lang.Object r1 = r7.next()
            com.instagram.api.schemas.NoteEmojiReactionInfo r1 = (com.instagram.api.schemas.NoteEmojiReactionInfo) r1
            com.instagram.user.model.User r1 = r1.A00
            if (r1 == 0) goto L_0x0b8e
            r12.add(r1)
            goto L_0x0b8e
        L_0x0ba2:
            r12 = r10
            goto L_0x0a96
        L_0x0ba5:
            r1 = 2131433550(0x7f0b184e, float:1.8488889E38)
            android.view.View r2 = r2.findViewById(r1)
            com.instagram.common.ui.widget.imageview.CircularImageView r2 = (com.instagram.common.ui.widget.imageview.CircularImageView) r2
            r2.setVisibility(r3)
            com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView r1 = r5.A0N
            if (r1 == 0) goto L_0x198c
            r1.setVisibility(r10)
            X.PaX r1 = new X.PaX
            r1.<init>(r8, r2, r5)
            goto L_0x0a78
        L_0x0bbf:
            int r10 = X.AnonymousClass7TE.A0B(r2)
            android.content.Context r8 = r5.requireContext()
            r2 = 2131237895(0x7f081c07, float:1.8092053E38)
            int r1 = X.C66584MXp.A05(r5)
            android.graphics.drawable.Drawable r8 = X.AnonymousClass3JT.A05(r8, r2, r1)
            r8.setBounds(r3, r3, r10, r10)
            android.content.res.Resources r2 = r12.getResources()
            r1 = 2131965118(0x7f1334be, float:1.9567037E38)
            X.DbU.A1A(r2, r12, r1)
            r2 = 0
            r12.setTypeface(r2, r4)
            android.content.Context r1 = r5.requireContext()
            int r1 = X.JTR.A05(r1)
            r12.setCompoundDrawablePadding(r1)
            r12.setCompoundDrawables(r8, r2, r2, r2)
            android.content.res.Resources r2 = X.DbV.A05(r5)
            r1 = 2131973461(0x7f135555, float:1.9583958E38)
            X.DbU.A1A(r2, r11, r1)
            X.3oV r1 = r5.A0G
            if (r1 == 0) goto L_0x0a0e
            android.view.View r2 = r1.getView()
            r1 = 2131435367(0x7f0b1f67, float:1.8492574E38)
            android.view.View r10 = r2.requireViewById(r1)
            goto L_0x0c56
        L_0x0c0b:
            com.instagram.api.schemas.ListeningNowState r1 = com.instagram.api.schemas.ListeningNowState.LISTENING_INVALID_SONG
            if (r2 != r1) goto L_0x0a2c
            r1 = 0
            if (r8 != 0) goto L_0x0c1f
            r12.setTypeface(r1, r4)
            android.content.res.Resources r2 = r12.getResources()
            r1 = 2131965116(0x7f1334bc, float:1.9567033E38)
            X.DbU.A1A(r2, r12, r1)
        L_0x0c1f:
            int r1 = X.Dbb.A05(r5)
            r12.setTextColor(r1)
            X.3oV r1 = r5.A0G
            if (r1 == 0) goto L_0x0a0e
            android.view.View r2 = r1.getView()
            r1 = 2131441628(0x7f0b37dc, float:1.8505273E38)
            X.DbT.A1F(r2, r1, r13)
            X.3oV r1 = r5.A0F
            if (r1 != 0) goto L_0x0c3c
            java.lang.String r20 = "spotifyNoteDisclaimerStub"
            goto L_0x0a0e
        L_0x0c3c:
            android.view.View r2 = r1.getView()
            r1 = 2131435570(0x7f0b2032, float:1.8492986E38)
            android.widget.TextView r10 = X.DbU.A0G(r2, r1)
            android.content.Context r2 = r5.requireContext()
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r6)
            android.text.SpannableStringBuilder r1 = X.AnonymousClass4A2.A00(r2, r1, r3, r8)
            X.DbX.A1G(r10, r1)
        L_0x0c56:
            r10.setVisibility(r3)
            goto L_0x0a2c
        L_0x0c5b:
            r1 = 2131428987(0x7f0b067b, float:1.8479634E38)
            r7.findViewById(r1)
            goto L_0x086a
        L_0x0c63:
            android.content.res.Resources r2 = X.DbV.A05(r5)
            r1 = 2131968536(0x7f134218, float:1.957397E38)
            java.lang.String r1 = X.JTS.A0i(r2, r4, r1)
            X.0qQ.A07(r1)
            goto L_0x0835
        L_0x0c73:
            boolean r1 = r2 instanceof java.util.Collection
            r14 = 0
            if (r1 == 0) goto L_0x0cd1
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L_0x0cd1
        L_0x0c7e:
            r14 = 1
        L_0x0c7f:
            r1 = 22
            X.Plr r13 = new X.Plr
            r13.<init>(r1, r0, r5)
            r9.A00(r10, r11, r12, r13, r14)
        L_0x0c89:
            X.OIR r1 = r5.A0I
            if (r1 != 0) goto L_0x0c9f
            X.4zZ r2 = r0.A08
            java.lang.String r1 = r0.A0E
            r9 = r16
            r10 = r2
            r11 = r1
            r12 = r17
            r13 = r3
            r14 = r3
            X.OIR r1 = X.C71047OaP.A03(r9, r10, r11, r12, r13, r14)
            r5.A0I = r1
        L_0x0c9f:
            X.60L r2 = r0.A07
            if (r2 == 0) goto L_0x0d05
            X.0eM r1 = r5.A0R
            java.lang.Object r13 = r1.getValue()
            X.OLu r13 = (X.C70799OLu) r13
            java.util.List r1 = r2.A00
            X.0qQ.A0B(r1, r3)
            java.util.Set r11 = r13.A0A
            java.util.ArrayList r12 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r10 = r1.iterator()
        L_0x0cba:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x0cee
            com.instagram.user.model.User r9 = X.DbT.A0k(r10)
            java.lang.Integer r7 = X.AnonymousClass05K.A01
            java.lang.String r2 = ""
            X.N5n r1 = new X.N5n
            r1.<init>(r9, r7, r2)
            r12.add(r1)
            goto L_0x0cba
        L_0x0cd1:
            java.util.Iterator r7 = r2.iterator()
        L_0x0cd5:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0c7e
            java.lang.Object r1 = r7.next()
            com.instagram.api.schemas.NoteEmojiReactionInfo r1 = (com.instagram.api.schemas.NoteEmojiReactionInfo) r1
            java.lang.String r2 = r1.A02
            java.lang.String r1 = "❤️"
            if (r2 == 0) goto L_0x0c7f
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0cd5
            goto L_0x0c7f
        L_0x0cee:
            r11.addAll(r12)
            X.PIF r1 = r13.A01
            if (r1 == 0) goto L_0x0db1
            X.2t9 r7 = r1.A00
            com.instagram.common.recyclerview.ViewModelListUpdate r2 = X.DbS.A0R()
            java.util.List r1 = X.00k.A0a(r11)
            r2.A01(r1)
            r7.A05(r2)
        L_0x0d05:
            java.util.List r7 = r0.A0H
            boolean r1 = X.AnonymousClass7TE.A1b(r7)
            if (r1 != 0) goto L_0x0d15
            java.util.List r1 = r0.A0G
            boolean r1 = X.AnonymousClass7TE.A1b(r1)
            if (r1 == 0) goto L_0x1b6f
        L_0x0d15:
            X.0lg r6 = X.AnonymousClass7TF.A0L(r6, r3)
            r1 = 36329577873686732(0x81118f000040cc, double:3.038309562563182E-306)
            boolean r1 = X.182.A06(r8, r6, r1)
            if (r1 == 0) goto L_0x1b6f
            X.0eM r2 = r5.A0R
            java.lang.Object r1 = r2.getValue()
            X.OLu r1 = (X.C70799OLu) r1
            r1.A04 = r4
            java.lang.Object r6 = r2.getValue()
            X.OLu r6 = (X.C70799OLu) r6
            java.util.List r2 = r0.A0G
            X.0qQ.A0B(r2, r3)
            X.0qQ.A0B(r7, r4)
            java.util.Set r5 = r6.A0A
            androidx.fragment.app.Fragment r1 = r6.A05
            r0 = 2131954057(0x7f130989, float:1.9544602E38)
            java.lang.String r1 = X.DbU.A0m(r1, r0)
            X.NPH r0 = new X.NPH
            r0.<init>(r1)
            r5.add(r0)
            java.util.ArrayList r4 = X.AnonymousClass7TF.A0p(r2)
            java.util.Iterator r3 = r2.iterator()
        L_0x0d57:
            boolean r0 = r3.hasNext()
            java.lang.String r8 = ""
            if (r0 == 0) goto L_0x0d76
            com.instagram.user.model.User r2 = X.DbT.A0k(r3)
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            X.N5n r0 = new X.N5n
            r0.<init>(r2, r1, r8)
            boolean r0 = r5.add(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.add(r0)
            goto L_0x0d57
        L_0x0d76:
            java.util.ArrayList r4 = X.AnonymousClass7TF.A0p(r7)
            java.util.Iterator r3 = r7.iterator()
        L_0x0d7e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0d9b
            com.instagram.user.model.User r2 = X.DbT.A0k(r3)
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            X.N5n r0 = new X.N5n
            r0.<init>(r2, r1, r8)
            boolean r0 = r5.add(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.add(r0)
            goto L_0x0d7e
        L_0x0d9b:
            X.PIF r0 = r6.A01
            if (r0 == 0) goto L_0x0db1
            X.2t9 r2 = r0.A00
            com.instagram.common.recyclerview.ViewModelListUpdate r1 = X.DbS.A0R()
            java.util.List r0 = X.00k.A0a(r5)
            r1.A01(r0)
            r2.A05(r1)
            goto L_0x1b6f
        L_0x0db1:
            java.lang.String r14 = "userRowsAdapter"
            goto L_0x1452
        L_0x0db5:
            boolean r2 = r0 instanceof X.C68769NWe
            if (r2 == 0) goto L_0x0dc5
            java.lang.Object r0 = r1.A02
            X.NKL r0 = (X.NKL) r0
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = r0.A0P
            if (r1 != 0) goto L_0x1980
        L_0x0dc1:
            java.lang.String r14 = "loadingIndicator"
            goto L_0x1452
        L_0x0dc5:
            boolean r0 = r0 instanceof X.C68767NWc
            java.lang.Object r4 = r1.A02
            X.NKL r4 = (X.NKL) r4
            if (r0 == 0) goto L_0x0dd1
            X.37D r0 = r4.A0O
            goto L_0x1b97
        L_0x0dd1:
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r4.A0P
            if (r0 == 0) goto L_0x0dc1
            X.DbS.A1T(r0)
            X.6ap r3 = X.DbV.A0X()
            java.lang.String r0 = "self_note_bottom_sheet_note_unavailable"
            r3.A0H = r0
            android.content.res.Resources r2 = X.DbV.A05(r4)
            r0 = 2131968548(0x7f134224, float:1.9573994E38)
            X.DbT.A1D(r2, r3, r0)
            X.Dc2 r0 = r3.A00()
            java.lang.Object r3 = r1.A01
            android.view.View r3 = (android.view.View) r3
            X.PYp r2 = new X.PYp
            r2.<init>(r4, r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            r3.postDelayed(r2, r0)
            goto L_0x1b6f
        L_0x0dfe:
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r5 = r1.A02
            X.NIn r5 = (X.C68449NIn) r5
            if (r0 == 0) goto L_0x0e72
            com.instagram.direct.inbox.notes.creation.NotesCreationPogView r3 = r5.A0b
            if (r3 != 0) goto L_0x0e0e
            java.lang.String r14 = "pogViewContainer"
            goto L_0x1452
        L_0x0e0e:
            r4 = 0
            com.instagram.direct.inbox.notes.creation.NotesCreationPogView.A00(r3)
            android.content.Context r2 = X.AnonymousClass7TE.A0S(r3)
            r1 = 1125122048(0x43100000, float:144.0)
            float r1 = X.0nA.A00(r2, r1)
            int r1 = (int) r1
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888
            r7 = r0
            r8 = r1
            r9 = r1
            r10 = r1
            r11 = r1
            android.graphics.Bitmap r1 = X.1MF.A03(r6, r7, r8, r9, r10, r11)
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r3.A02
            r0.setImageBitmap(r1)
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = r3.A02
            r0 = 2131970082(0x7f134822, float:1.9577105E38)
            X.DbU.A12(r2, r1, r0)
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r3.A02
            r0.setVisibility(r4)
            X.C68449NIn.A0H(r5)
            X.0eM r0 = X.C227642jf.A02(r5)
            X.0lg r3 = X.AnonymousClass7TF.A0L(r0, r4)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320502608241155(0x81094e00072203, double:3.032570328152238E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x1b6f
            X.0eM r0 = r5.A1E
            java.lang.Object r3 = r0.getValue()
            X.Mtr r3 = (X.C67738Mtr) r3
            com.instagram.direct.inbox.notes.models.NoteAudience r2 = com.instagram.direct.inbox.notes.models.NoteAudience.INTERNAL_ONLY
            r0 = 0
            com.instagram.direct.inbox.notes.models.NoteAudienceItem r1 = new com.instagram.direct.inbox.notes.models.NoteAudienceItem
            r1.<init>(r2, r0, r0, r4)
            X.05G r0 = r3.A01
            r0.Epw(r1)
            android.view.View r1 = r5.A02
            if (r1 == 0) goto L_0x0ec8
            r0 = 23
            X.C71397Ojw.A00(r1, r0, r5)
            goto L_0x1b6f
        L_0x0e72:
            android.view.View r1 = r5.A02
            if (r1 == 0) goto L_0x0ec8
            r0 = 5
            X.C71397Ojw.A00(r1, r0, r5)
            X.0eM r0 = r5.A1E
            java.lang.Object r0 = r0.getValue()
            X.Mtr r0 = (X.C67738Mtr) r0
            com.instagram.direct.inbox.notes.models.NoteAudienceItem r1 = r5.A0c
            if (r1 != 0) goto L_0x0e8a
            java.lang.String r14 = "currentAudience"
            goto L_0x1452
        L_0x0e8a:
            X.05G r0 = r0.A01
            r0.Epw(r1)
            java.lang.Object r0 = X.C67761MuH.A00(r5)
            if (r0 == 0) goto L_0x0ea8
            X.0eM r0 = r5.A1T
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36324569941880993(0x810d01000130a1, double:3.03514252632391E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x1b6f
        L_0x0ea8:
            com.instagram.direct.inbox.notes.creation.NotesCreationPogView r0 = r5.A0b
            if (r0 != 0) goto L_0x0eb6
            java.lang.String r0 = "pogViewContainer"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0eb6:
            com.instagram.direct.inbox.notes.creation.NotesCreationPogView.A00(r0)
            com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView r1 = r0.A07
            r0 = 0
            r1.setVisibility(r0)
            boolean r0 = r5.A0u
            if (r0 != 0) goto L_0x1b6f
            X.C68449NIn.A0M(r5)
            goto L_0x1b6f
        L_0x0ec8:
            java.lang.String r14 = "audiencePickerContainer"
            goto L_0x1452
        L_0x0ecc:
            r5 = 12
            boolean r2 = X.ME7.A02(r5, r8)
            if (r2 == 0) goto L_0x0ef2
            r7 = r8
            X.ME7 r7 = (X.ME7) r7
            int r4 = r7.A00
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r4 & r3
            if (r2 == 0) goto L_0x0ef2
            int r4 = r4 - r3
            r7.A00 = r4
        L_0x0ee2:
            java.lang.Object r10 = r7.A02
            X.1Hj r3 = X.1Hj.A02
            int r2 = r7.A00
            r9 = 1
            if (r2 == 0) goto L_0x0ef8
            if (r2 == r9) goto L_0x13e3
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0ef2:
            X.ME7 r7 = new X.ME7
            r7.<init>(r1, r8, r5)
            goto L_0x0ee2
        L_0x0ef8:
            X.0eS.A00(r10)
            java.lang.Object r6 = r1.A01
            X.02o r6 = (X.02o) r6
            X.NoX r0 = (X.C69589NoX) r0
            boolean r2 = r0 instanceof X.NW5
            if (r2 == 0) goto L_0x0f48
            r2 = r0
            X.NW5 r2 = (X.NW5) r2
            java.lang.Object r13 = r2.A00
        L_0x0f0a:
            X.Npi r13 = (X.C69660Npi) r13
            if (r13 == 0) goto L_0x0f52
            java.lang.Object r0 = r1.A02
            X.Mtj r0 = (X.C67730Mtj) r0
            X.KWk r0 = r0.A00
            java.lang.String r12 = r0.A04
            java.lang.String r11 = r13.A04
            com.instagram.common.typedurl.ImageUrl r10 = r13.A00
            java.lang.Integer r8 = r0.A03
            java.lang.String r5 = r13.A02
            java.lang.String r4 = r13.A05
            java.lang.String r2 = r13.A03
            java.lang.String r1 = r13.A01
            r0 = 2
            X.0qQ.A0B(r11, r0)
            X.NWE r0 = new X.NWE
            r0.<init>()
            r0.A07 = r12
            r0.A04 = r11
            r0.A00 = r10
            r0.A01 = r8
            r0.A02 = r5
            r0.A06 = r4
            r0.A03 = r2
            r0.A05 = r1
            X.NWD r1 = new X.NWD
            r1.<init>()
            r1.A00 = r0
        L_0x0f44:
            r7.A00 = r9
            goto L_0x1259
        L_0x0f48:
            boolean r2 = r0 instanceof X.NW7
            if (r2 == 0) goto L_0x0f52
            r2 = r0
            X.NW7 r2 = (X.NW7) r2
            java.lang.Object r13 = r2.A00
            goto L_0x0f0a
        L_0x0f52:
            boolean r0 = r0 instanceof X.KR4
            if (r0 == 0) goto L_0x0f59
            X.NWG r1 = X.NWG.A00
            goto L_0x0f44
        L_0x0f59:
            X.NWF r1 = X.NWF.A00
            goto L_0x0f44
        L_0x0f5c:
            X.NoZ r0 = (X.C69591NoZ) r0
            boolean r2 = r0 instanceof X.NWD
            if (r2 == 0) goto L_0x1b6f
            java.lang.Object r7 = r1.A02
            X.NJR r7 = (X.NJR) r7
            X.NWD r0 = (X.NWD) r0
            X.NWE r6 = r0.A00
            java.lang.String r3 = r6.A07
            r7.A08 = r3
            java.lang.Integer r0 = r6.A01
            r7.A07 = r0
            java.lang.String r5 = r6.A02
            java.lang.String r4 = r6.A06
            java.lang.String r2 = r6.A03
            java.lang.String r0 = r6.A05
            X.NJR.A03(r7, r5, r4, r2, r0)
            com.instagram.common.typedurl.ImageUrl r5 = r6.A00
            if (r5 == 0) goto L_0x0faf
            java.lang.Object r1 = r1.A01
            android.view.View r1 = (android.view.View) r1
            java.lang.String r6 = r6.A04
            r0 = 2131429263(0x7f0b078f, float:1.8480194E38)
            android.view.View r4 = X.AnonymousClass7TF.A0G(r1, r0)
            com.instagram.igds.components.headline.IgdsHeadline r4 = (com.instagram.igds.components.headline.IgdsHeadline) r4
            android.content.Context r1 = r7.requireContext()
            r0 = 2131959544(0x7f131ef8, float:1.9555731E38)
            java.lang.String r0 = X.DbW.A0h(r1, r6, r0)
            r4.setHeadline((java.lang.CharSequence) r0)
            r0 = 2131959543(0x7f131ef7, float:1.955573E38)
            r4.setBody((int) r0)
            r0 = 2131165236(0x7f070034, float:1.7944683E38)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r9 = 0
            r4.setCircularImageUrl(r5, r6, r7, r8, r9)
        L_0x0faf:
            X.NJR.A01(r7)
            java.lang.Integer r1 = r7.A07
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x0ffe
            java.lang.Integer r0 = X.AnonymousClass05K.A01
        L_0x0fba:
            r7.A06 = r0
        L_0x0fbc:
            X.0eM r0 = r7.A0F
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r0)
            java.lang.Integer r0 = r7.A07
            if (r0 == 0) goto L_0x0ffb
            java.lang.String r1 = X.C69971NvB.A00(r0)
        L_0x0fca:
            java.lang.Integer r0 = r7.A06
            int r0 = r0.intValue()
            switch(r0) {
                case 1: goto L_0x0fef;
                case 2: goto L_0x0ff2;
                case 3: goto L_0x0ff5;
                case 4: goto L_0x0ff8;
                default: goto L_0x0fd3;
            }
        L_0x0fd3:
            java.lang.String r2 = "disabled"
        L_0x0fd5:
            r0 = 0
            X.AnonymousClass7TF.A1C(r4, r0, r3)
            java.lang.String r0 = "entry_point"
            X.0eP r1 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.String r0 = "view_mode"
            java.util.LinkedHashMap r1 = X.DbY.A0p(r0, r2, r1)
            java.lang.String r0 = "customer_details_page_impression"
            X.OZ3.A00(r4, r0, r3, r1)
            X.C66582MXn.A16(r7)
            goto L_0x1b6f
        L_0x0fef:
            java.lang.String r2 = "view"
            goto L_0x0fd5
        L_0x0ff2:
            java.lang.String r2 = "edit"
            goto L_0x0fd5
        L_0x0ff5:
            java.lang.String r2 = "editing"
            goto L_0x0fd5
        L_0x0ff8:
            java.lang.String r2 = "none"
            goto L_0x0fd5
        L_0x0ffb:
            java.lang.String r1 = ""
            goto L_0x0fca
        L_0x0ffe:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x0fbc
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            goto L_0x0fba
        L_0x1005:
            X.MQ0 r0 = (X.MQ0) r0
            java.lang.Object r7 = r1.A02
            X.KWk r7 = (X.C62032KWk) r7
            java.lang.Object r2 = r1.A01
            X.NoX r2 = (X.C69589NoX) r2
            boolean r1 = r0 instanceof X.C59702JUj
            if (r1 != 0) goto L_0x107f
            r9 = 1
            boolean r1 = X.C59678JTj.A01(r9, r0)
            if (r1 == 0) goto L_0x1096
            X.JTj r0 = (X.C59678JTj) r0
            java.lang.Object r11 = r0.A01
            X.NHL r11 = (X.NHL) r11
            X.05G r10 = r7.A05
            X.NW6 r2 = (X.NW6) r2
            java.lang.Object r1 = r2.A00
            X.Npi r1 = (X.C69660Npi) r1
            java.lang.String r8 = r1.A04
            com.instagram.common.typedurl.ImageUrl r6 = r1.A00
            java.lang.String r5 = r1.A02
            if (r5 == 0) goto L_0x1036
            int r0 = r5.length()
            if (r0 != 0) goto L_0x1038
        L_0x1036:
            java.lang.String r5 = r11.A01
        L_0x1038:
            java.lang.String r4 = r1.A05
            if (r4 == 0) goto L_0x1042
            int r0 = r4.length()
            if (r0 != 0) goto L_0x1044
        L_0x1042:
            java.lang.String r4 = r11.A03
        L_0x1044:
            java.lang.String r3 = r1.A03
            if (r3 == 0) goto L_0x104e
            int r0 = r3.length()
            if (r0 != 0) goto L_0x1050
        L_0x104e:
            java.lang.String r3 = r11.A02
        L_0x1050:
            java.lang.String r2 = r1.A01
            if (r2 == 0) goto L_0x105a
            int r0 = r2.length()
            if (r0 != 0) goto L_0x105c
        L_0x105a:
            java.lang.String r2 = r11.A00
        L_0x105c:
            X.0qQ.A0B(r8, r9)
            X.Npi r1 = new X.Npi
            r1.<init>()
            r1.A04 = r8
            r1.A00 = r6
            r1.A02 = r5
            r1.A05 = r4
            r1.A03 = r3
            r1.A01 = r2
            X.NW5 r0 = new X.NW5
            r0.<init>(r1)
            r10.Epw(r0)
            X.0gF r1 = X.C60340gF.A00
            X.JTj r0 = new X.JTj
            r0.<init>(r1, r9)
        L_0x107f:
            boolean r1 = r0 instanceof X.C59702JUj
            if (r1 != 0) goto L_0x1b6f
            r1 = 1
            boolean r1 = X.C59678JTj.A01(r1, r0)
            if (r1 != 0) goto L_0x1b6f
            boolean r0 = X.C59678JTj.A02(r0)
            if (r0 == 0) goto L_0x10a1
            X.05G r3 = r7.A05
            X.NW8 r1 = X.NW8.A00
            goto L_0x11dc
        L_0x1096:
            boolean r1 = X.C59678JTj.A02(r0)
            if (r1 != 0) goto L_0x107f
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x10a1:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x10a6:
            r6 = 9
            boolean r2 = X.ME7.A02(r6, r8)
            if (r2 == 0) goto L_0x10cc
            r5 = r8
            X.ME7 r5 = (X.ME7) r5
            int r4 = r5.A00
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r4 & r3
            if (r2 == 0) goto L_0x10cc
            int r4 = r4 - r3
            r5.A00 = r4
        L_0x10bc:
            java.lang.Object r10 = r5.A02
            X.1Hj r3 = X.1Hj.A02
            int r2 = r5.A00
            r8 = 1
            if (r2 == 0) goto L_0x10d2
            if (r2 == r8) goto L_0x13e3
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x10cc:
            X.ME7 r5 = new X.ME7
            r5.<init>(r1, r8, r6)
            goto L_0x10bc
        L_0x10d2:
            X.0eS.A00(r10)
            java.lang.Object r4 = r1.A01
            X.02o r4 = (X.02o) r4
            X.MeZ r0 = (X.MeZ) r0
            if (r0 == 0) goto L_0x10e9
            java.lang.Object r1 = r1.A02
            X.Mj7 r1 = (X.C67149Mj7) r1
            X.JwM r0 = X.C67149Mj7.A00(r0, r1)
        L_0x10e5:
            r5.A00 = r8
            goto L_0x1424
        L_0x10e9:
            r0 = 0
            goto L_0x10e5
        L_0x10eb:
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r6 = r1.A02
            X.NKG r6 = (X.NKG) r6
            java.lang.Object r5 = r1.A01
            X.7L2 r5 = (X.AnonymousClass7L2) r5
            com.instagram.common.recyclerview.ViewModelListUpdate r4 = X.DbS.A0R()
            if (r0 == 0) goto L_0x117c
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x1122
            boolean r0 = r6.A01
            if (r0 != 0) goto L_0x117c
            X.0eM r0 = r6.A03
            java.lang.Object r1 = r0.getValue()
            X.72b r1 = (X.C3253572b) r1
            X.6rr r0 = X.C320156rr.EMPTY
            X.NPA r2 = new X.NPA
            r2.<init>(r1, r0)
        L_0x1114:
            X.2tL r2 = (X.C232262tL) r2
            r4.A00(r2)
        L_0x1119:
            X.2t9 r0 = r6.A00
            if (r0 == 0) goto L_0x1182
            r0.A05(r4)
            goto L_0x1b6f
        L_0x1122:
            r7 = 0
            r6.A01 = r7
            java.util.Iterator r8 = r0.iterator()
        L_0x1129:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x1119
            int r3 = r7 + 1
            X.3su r2 = X.C66580MXl.A0a(r8)
            int r1 = r7 + -1
            java.lang.Object r1 = X.00k.A0O(r0, r1)
            X.3su r1 = (X.C254703su) r1
            boolean r7 = X.NKG.A01(r2, r1)
            java.lang.Object r1 = X.00k.A0O(r0, r3)
            X.3su r1 = (X.C254703su) r1
            boolean r1 = X.NKG.A01(r2, r1)
            X.7Fo r12 = X.C328037De.A01(r7, r1)
            X.7Ky r1 = r5.A03
            android.graphics.drawable.Drawable r10 = r1.A04()
            X.7Kz r9 = r5.A05
            int r7 = r9.A04
            int r1 = r9.A05
            r13 = 1
            r14 = 0
            r11 = 0
            r15 = r14
            r16 = r14
            r17 = r14
            r9.A00(r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r16 = X.NKG.A00(r2)
            X.OkI r11 = new X.OkI
            r11.<init>(r13, r2, r6)
            X.N5w r9 = new X.N5w
            r13 = r2
            r14 = r7
            r15 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r4.A00(r9)
            r7 = r3
            goto L_0x1129
        L_0x117c:
            X.LhT r2 = new X.LhT
            r2.<init>()
            goto L_0x1114
        L_0x1182:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x1187:
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r2 = r1.A02
            X.Mtg r2 = (X.C67727Mtg) r2
            X.05G r3 = r2.A01
            java.lang.Object r1 = r1.A01
            X.JwG r1 = (X.C61078JwG) r1
            java.lang.Object r1 = r1.A00
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r4 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r5 = r1.iterator()
        L_0x119f:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x11d6
            com.instagram.pendingmedia.model.recipients.PendingRecipient r2 = X.C66580MXl.A0k(r5)
            java.lang.Long r1 = r2.A08
            if (r1 == 0) goto L_0x11d1
            long r12 = r1.longValue()
            java.lang.String r8 = r2.getId()
            com.instagram.common.typedurl.ImageUrl r7 = r2.A03
            java.lang.String r9 = r2.A0f
            java.lang.String r10 = r2.A0C
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r12)
            java.lang.Number r1 = X.C51966G9m.A14(r1, r0)
            int r11 = X.DbX.A01(r1)
            X.N2t r6 = new X.N2t
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r4.add(r6)
            goto L_0x119f
        L_0x11d1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x11d6:
            r0 = 1
            X.JwG r1 = new X.JwG
            r1.<init>((java.util.List) r4, (int) r0)
        L_0x11dc:
            r3.Epw(r1)
            goto L_0x1b6f
        L_0x11e1:
            X.4Yx r0 = (X.C266444Yx) r0
            java.lang.Object r2 = r1.A01
            X.2da r2 = (X.2da) r2
            java.lang.Object r1 = r1.A02
            android.content.Context r1 = X.DbT.A08(r1)
            java.lang.CharSequence r0 = X.C66909Mes.A00(r1, r0)
            java.lang.String r0 = r0.toString()
            r2.setTitle(r0)
            goto L_0x1b6f
        L_0x11fa:
            r5 = 44
            boolean r2 = X.C66143MDv.A02(r5, r8)
            if (r2 == 0) goto L_0x1220
            r7 = r8
            X.MDv r7 = (X.C66143MDv) r7
            int r4 = r7.A00
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r4 & r3
            if (r2 == 0) goto L_0x1220
            int r4 = r4 - r3
            r7.A00 = r4
        L_0x1210:
            java.lang.Object r10 = r7.A02
            X.1Hj r3 = X.1Hj.A02
            int r2 = r7.A00
            r5 = 1
            if (r2 == 0) goto L_0x1226
            if (r2 == r5) goto L_0x13e3
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x1220:
            X.MDv r7 = new X.MDv
            r7.<init>(r1, r8, r5)
            goto L_0x1210
        L_0x1226:
            X.0eS.A00(r10)
            java.lang.Object r6 = r1.A01
            X.02o r6 = (X.02o) r6
            boolean r2 = r0 instanceof X.C239793Ih
            if (r2 == 0) goto L_0x125f
            java.lang.Object r10 = r1.A02
            X.NVG r10 = (X.NVG) r10
            X.05G r9 = r10.A01
        L_0x1237:
            java.lang.Object r8 = r9.getValue()
            r0 = r8
            X.N4R r0 = (X.N4R) r0
            java.lang.Integer r4 = X.AnonymousClass05K.A0C
            java.lang.Object r2 = r0.A00
            r1 = 4
            X.N4R r0 = new X.N4R
            r0.<init>((int) r1, (java.lang.Object) r4, (java.lang.Object) r2)
            boolean r0 = r9.AIY(r8, r0)
            if (r0 == 0) goto L_0x1237
            com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository r0 = r10.A06
            X.05G r0 = r0.A09
            X.AnonymousClass7TF.A1O(r0, r5)
        L_0x1255:
            X.0gF r1 = X.C60340gF.A00
            r7.A00 = r5
        L_0x1259:
            java.lang.Object r0 = r6.emit(r1, r7)
            goto L_0x1428
        L_0x125f:
            boolean r2 = r0 instanceof X.C297815sO
            java.lang.Object r0 = r1.A02
            X.NVG r0 = (X.NVG) r0
            X.05G r9 = r0.A01
            if (r2 == 0) goto L_0x1281
        L_0x1269:
            java.lang.Object r8 = r9.getValue()
            r0 = r8
            X.N4R r0 = (X.N4R) r0
            java.lang.Integer r4 = X.AnonymousClass05K.A0N
            java.lang.Object r2 = r0.A00
            r1 = 4
            X.N4R r0 = new X.N4R
            r0.<init>((int) r1, (java.lang.Object) r4, (java.lang.Object) r2)
            boolean r0 = r9.AIY(r8, r0)
            if (r0 == 0) goto L_0x1269
            goto L_0x1255
        L_0x1281:
            java.lang.Object r8 = r9.getValue()
            r0 = r8
            X.N4R r0 = (X.N4R) r0
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            java.lang.Object r2 = r0.A00
            r1 = 4
            X.N4R r0 = new X.N4R
            r0.<init>((int) r1, (java.lang.Object) r4, (java.lang.Object) r2)
            boolean r0 = r9.AIY(r8, r0)
            if (r0 == 0) goto L_0x1281
            goto L_0x1255
        L_0x1299:
            r6 = 41
            boolean r2 = X.C66143MDv.A02(r6, r8)
            if (r2 == 0) goto L_0x12bf
            r5 = r8
            X.MDv r5 = (X.C66143MDv) r5
            int r4 = r5.A00
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r4 & r3
            if (r2 == 0) goto L_0x12bf
            int r4 = r4 - r3
            r5.A00 = r4
        L_0x12af:
            java.lang.Object r10 = r5.A02
            X.1Hj r3 = X.1Hj.A02
            int r2 = r5.A00
            r6 = 1
            if (r2 == 0) goto L_0x12c5
            if (r2 == r6) goto L_0x13e3
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x12bf:
            X.MDv r5 = new X.MDv
            r5.<init>(r1, r8, r6)
            goto L_0x12af
        L_0x12c5:
            X.0eS.A00(r10)
            java.lang.Object r4 = r1.A01
            X.02o r4 = (X.02o) r4
            X.Nj3 r0 = (X.C69302Nj3) r0
            java.lang.Object r2 = r1.A02
            X.MuD r2 = (X.C67758MuD) r2
            X.Nj3 r1 = X.C69302Nj3.Loading
            X.05G r2 = r2.A0M
            if (r0 != r1) goto L_0x12e9
            X.NiO r1 = X.C69262NiO.ON
        L_0x12da:
            r2.FIA(r1)
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x12f8;
                case 1: goto L_0x12f5;
                case 2: goto L_0x12f2;
                case 3: goto L_0x12ef;
                case 4: goto L_0x12ec;
                case 5: goto L_0x12f8;
                default: goto L_0x12e4;
            }
        L_0x12e4:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x12e9:
            X.NiO r1 = X.C69262NiO.OFF
            goto L_0x12da
        L_0x12ec:
            X.Niw r0 = X.C69296Niw.DEVICE_ON_BOARDED
            goto L_0x12fa
        L_0x12ef:
            X.Niw r0 = X.C69296Niw.DEVICE_NOT_ON_BOARDED
            goto L_0x12fa
        L_0x12f2:
            X.Niw r0 = X.C69296Niw.NO_BACKUP
            goto L_0x12fa
        L_0x12f5:
            X.Niw r0 = X.C69296Niw.LOADING
            goto L_0x12fa
        L_0x12f8:
            X.Niw r0 = X.C69296Niw.ERROR
        L_0x12fa:
            r5.A00 = r6
            goto L_0x1424
        L_0x12fe:
            X.OEx r0 = (X.C70650OEx) r0
            X.Nj3 r3 = r0.A00
            X.Niu r4 = r0.A01
            X.Niv r5 = r0.A03
            X.Niv r6 = r0.A02
            X.Nj3 r0 = X.C69302Nj3.Loading
            if (r3 == r0) goto L_0x1b6f
            X.Nj3 r0 = X.C69302Nj3.Unknown
            if (r3 == r0) goto L_0x1b6f
            X.Niu r0 = X.C69294Niu.Loading
            if (r4 == r0) goto L_0x1b6f
            X.Niu r0 = X.C69294Niu.Unknown
            if (r4 == r0) goto L_0x1b6f
            X.Niv r2 = X.C69295Niv.Loading
            if (r5 == r2) goto L_0x1b6f
            X.Niv r0 = X.C69295Niv.Unknown
            if (r5 == r0) goto L_0x1b6f
            if (r6 == r2) goto L_0x1b6f
            if (r6 == r0) goto L_0x1b6f
            java.lang.Object r7 = r1.A02
            X.0sJ r7 = (X.0sJ) r7
            X.Pbf r2 = new X.Pbf
            r2.<init>(r3, r4, r5, r6, r7)
            X.11Z.A02(r2)
        L_0x1330:
            java.lang.Object r1 = r1.A01
            X.4Cq r1 = (X.C262224Cq) r1
            r0 = 0
            X.19E.A05(r0, r1)
            goto L_0x1b6f
        L_0x133a:
            X.N3o r0 = (X.C68173N3o) r0
            java.lang.Object r6 = r1.A02
            X.NgS r6 = (X.C69179NgS) r6
            X.2da r3 = r6.A00
            if (r3 == 0) goto L_0x1349
            int r2 = r0.A01
            r3.Eom(r2)
        L_0x1349:
            java.lang.Object r7 = r1.A01
            X.PR9 r7 = (X.PR9) r7
            boolean r1 = r0.A03
            r7.A0D = r1
            android.content.Context r2 = r6.getContext()
            r1 = 0
            if (r2 == 0) goto L_0x135e
            int r1 = r0.A01
            java.lang.String r1 = r2.getString(r1)
        L_0x135e:
            r7.A0B = r1
            android.content.Context r3 = r6.getContext()
            r8 = 1
            if (r3 == 0) goto L_0x1371
            int r2 = r0.A00
            java.lang.String r1 = r0.A02
            java.lang.String r3 = X.DbW.A0h(r3, r1, r2)
            if (r3 != 0) goto L_0x1373
        L_0x1371:
            java.lang.String r3 = ""
        L_0x1373:
            boolean r1 = r0.A04
            if (r1 == 0) goto L_0x139f
            r1 = 2131952632(0x7f1303f8, float:1.9541712E38)
            java.lang.String r2 = X.DbU.A0m(r6, r1)
            java.lang.String r1 = "https://help.instagram.com/1309322983792227"
            android.net.Uri r1 = android.net.Uri.parse(r1)
            X.0qQ.A07(r1)
            android.text.SpannableStringBuilder r5 = X.AnonymousClass7AV.A00(r1, r2, r3)
        L_0x138b:
            r7.A0C = r8
            r7.A0A = r5
            boolean r1 = r0.A05
            r1 = r1 ^ 1
            r7.A0E = r1
            r2 = 0
            X.Ol0 r1 = new X.Ol0
            r1.<init>(r2, r6, r0)
            r7.A08 = r1
            goto L_0x1b6f
        L_0x139f:
            android.text.SpannableStringBuilder r5 = X.DbS.A0C(r3)
            X.1px r4 = X.AnonymousClass1q4.A00()
            androidx.fragment.app.FragmentActivity r3 = r6.requireActivity()
            X.0eM r1 = r6.A04
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r1)
            X.PiW r1 = X.C73709PiW.A00
            r4.ABX(r3, r5, r2, r1)
            goto L_0x138b
        L_0x13b7:
            r6 = 15
            boolean r2 = X.JUG.A03(r6, r8)
            if (r2 == 0) goto L_0x13dd
            r5 = r8
            X.JUG r5 = (X.JUG) r5
            int r4 = r5.A00
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r4 & r3
            if (r2 == 0) goto L_0x13dd
            int r4 = r4 - r3
            r5.A00 = r4
        L_0x13cd:
            java.lang.Object r10 = r5.A02
            X.1Hj r3 = X.1Hj.A02
            int r4 = r5.A00
            r2 = 1
            if (r4 == 0) goto L_0x13e8
            if (r4 == r2) goto L_0x13e3
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x13dd:
            X.JUG r5 = new X.JUG
            r5.<init>(r1, r8, r6)
            goto L_0x13cd
        L_0x13e3:
            X.0eS.A00(r10)
            goto L_0x1b6f
        L_0x13e8:
            X.0eS.A00(r10)
            java.lang.Object r4 = r1.A01
            X.02o r4 = (X.02o) r4
            X.MQ0 r0 = (X.MQ0) r0
            boolean r1 = X.C59678JTj.A01(r2, r0)
            r6 = 0
            if (r1 == 0) goto L_0x142b
            X.JTj r0 = (X.C59678JTj) r0
            java.lang.Object r0 = r0.A01
            X.NHR r0 = (X.NHR) r0
            java.lang.String r11 = r0.A05
            if (r11 == 0) goto L_0x144d
            java.lang.String r12 = r0.A04
            if (r12 == 0) goto L_0x144a
            java.lang.String r13 = r0.A03
            if (r13 == 0) goto L_0x1447
            java.lang.String r14 = r0.A06
            if (r14 == 0) goto L_0x1444
            com.instagram.business.promote.model.InstagramMediaProductType r8 = r0.A00
            if (r8 == 0) goto L_0x1441
            com.instagram.business.promote.model.PromoteButtonAction r9 = r0.A01
            if (r9 == 0) goto L_0x1450
            com.instagram.business.promote.model.PromoteButtonAction r10 = r0.A02
            X.QP7 r7 = new X.QP7
            r7.<init>((com.instagram.business.promote.model.InstagramMediaProductType) r8, (com.instagram.business.promote.model.PromoteButtonAction) r9, (com.instagram.business.promote.model.PromoteButtonAction) r10, (java.lang.String) r11, (java.lang.String) r12, (java.lang.String) r13, (java.lang.String) r14)
        L_0x141d:
            X.GmM r0 = new X.GmM
            r0.<init>(r7, r6)
        L_0x1422:
            r5.A00 = r2
        L_0x1424:
            java.lang.Object r0 = r4.emit(r0, r5)
        L_0x1428:
            if (r0 != r3) goto L_0x1b6f
            return r3
        L_0x142b:
            boolean r1 = r0 instanceof X.C59702JUj
            r7 = 0
            if (r1 == 0) goto L_0x1436
            X.GmM r0 = new X.GmM
            r0.<init>(r7, r2)
            goto L_0x1422
        L_0x1436:
            boolean r0 = X.C59678JTj.A01(r6, r0)
            if (r0 != 0) goto L_0x141d
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x1441:
            java.lang.String r14 = "mediaProductType"
            goto L_0x1452
        L_0x1444:
            java.lang.String r14 = "thumbnailUrl"
            goto L_0x1452
        L_0x1447:
            java.lang.String r14 = "displayBody"
            goto L_0x1452
        L_0x144a:
            java.lang.String r14 = "displayTitle"
            goto L_0x1452
        L_0x144d:
            java.lang.String r14 = "screenTitle"
            goto L_0x1452
        L_0x1450:
            java.lang.String r14 = "primaryButton"
        L_0x1452:
            X.0qQ.A0F(r14)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x145a:
            X.JwC r0 = (X.C61074JwC) r0
            java.lang.Object r9 = r0.A00
            java.lang.Number r9 = (java.lang.Number) r9
            int r4 = r9.intValue()
            r3 = 0
            java.lang.String r7 = "containerStub"
            r6 = 8
            if (r4 == r3) goto L_0x1481
            java.lang.String r13 = "messageListRecyclerView"
            java.lang.String r11 = "settings"
            java.lang.String r5 = "shadow"
            r10 = 1
            r8 = 2
            java.lang.String r12 = "header"
            if (r4 == r8) goto L_0x1501
            if (r4 == r10) goto L_0x156a
            r2 = 3
            if (r4 == r2) goto L_0x156a
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x1481:
            java.lang.Object r0 = r1.A02
            X.7Rx r0 = (X.C331677Rx) r0
            X.3oV r0 = r0.A06
            if (r0 == 0) goto L_0x1a20
            r0.setVisibility(r6)
            goto L_0x1b6f
        L_0x148e:
            X.NoV r0 = (X.C69587NoV) r0
            boolean r3 = r0 instanceof X.C68763NVy
            java.lang.String r10 = "groupPreviewSpinner"
            java.lang.String r12 = "contentViewGroup"
            r2 = 8
            if (r3 == 0) goto L_0x14b1
            java.lang.Object r1 = r1.A02
            X.NKN r1 = (X.NKN) r1
            android.view.ViewGroup r0 = r1.A00
            if (r0 == 0) goto L_0x154d
            r0.setVisibility(r2)
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = r1.A0H
            if (r1 != 0) goto L_0x1980
        L_0x14a9:
            X.0qQ.A0F(r10)
        L_0x14ac:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x14b1:
            boolean r3 = r0 instanceof X.C68762NVx
            r5 = 1
            if (r3 == 0) goto L_0x1b5c
            java.lang.Object r4 = r1.A02
            X.NKN r4 = (X.NKN) r4
            android.view.ViewGroup r1 = r4.A00
            if (r1 == 0) goto L_0x154d
            r7 = 0
            r1.setVisibility(r7)
            com.instagram.ui.widget.spinner.SpinnerImageView r3 = r4.A0H
            if (r3 == 0) goto L_0x14a9
            X.3uy r1 = X.C255943uy.SUCCESS
            r3.setLoadingStatus(r1)
            X.NVx r0 = (X.C68762NVx) r0
            java.lang.String r8 = r0.A05
            android.os.Bundle r3 = r4.mArguments
            r6 = 0
            if (r3 == 0) goto L_0x14ff
            java.lang.String r1 = "GroupPreviewFragment.CUSTOM_PROFILE_IMAGES"
            java.io.Serializable r3 = r3.getSerializable(r1)
        L_0x14da:
            boolean r1 = r3 instanceof java.util.List
            if (r1 == 0) goto L_0x14fd
            java.util.List r3 = (java.util.List) r3
        L_0x14e0:
            r10 = 0
            if (r3 == 0) goto L_0x17fb
            java.util.ArrayList r11 = X.AnonymousClass7TG.A0r(r3)
            java.util.Iterator r3 = r3.iterator()
        L_0x14eb:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x17de
            java.lang.String r1 = X.AnonymousClass7TE.A18(r3)
            com.instagram.common.typedurl.SimpleImageUrl r1 = X.DbS.A0V(r1)
            r11.add(r1)
            goto L_0x14eb
        L_0x14fd:
            r3 = r6
            goto L_0x14e0
        L_0x14ff:
            r3 = r6
            goto L_0x14da
        L_0x1501:
            java.lang.Object r4 = r1.A02
            X.7Rx r4 = (X.C331677Rx) r4
            X.3oV r2 = r4.A06
            if (r2 == 0) goto L_0x1a20
            r2.setVisibility(r3)
            android.view.View r2 = r4.A00
            if (r2 == 0) goto L_0x154d
            r2.setVisibility(r3)
            android.view.View r2 = r4.A03
            if (r2 == 0) goto L_0x1b0a
            r2.setVisibility(r3)
            android.view.View r2 = r4.A02
            if (r2 == 0) goto L_0x198c
            r2.setVisibility(r3)
            android.view.View r2 = r4.A00
            if (r2 == 0) goto L_0x154d
            android.view.ViewGroup$LayoutParams r5 = r2.getLayoutParams()
            java.lang.Object r7 = r1.A01
            android.view.View r7 = (android.view.View) r7
            android.content.Context r2 = r7.getContext()
            int r1 = X.C66582MXn.A01(r2)
            r5.height = r1
            android.view.View r5 = r4.A00
            if (r5 == 0) goto L_0x154d
            X.Oji r1 = X.C71384Oji.A00
            X.AnonymousClass0fU.A00(r1, r5)
            androidx.recyclerview.widget.RecyclerView r1 = r4.A04
            if (r1 == 0) goto L_0x168b
            r1.setVisibility(r3)
            com.instagram.igds.components.button.IgdsButton r1 = r4.A08
            if (r1 != 0) goto L_0x1552
            java.lang.String r12 = "edit"
        L_0x154d:
            X.0qQ.A0F(r12)
            goto L_0x14ac
        L_0x1552:
            r1.setVisibility(r3)
            com.instagram.igds.components.button.IgdsButton r1 = r4.A0A
            if (r1 != 0) goto L_0x155c
            java.lang.String r12 = "send"
            goto L_0x154d
        L_0x155c:
            r1.setVisibility(r3)
            com.instagram.igds.components.button.IgdsButton r1 = r4.A09
            if (r1 != 0) goto L_0x1566
            java.lang.String r12 = "refresh"
            goto L_0x154d
        L_0x1566:
            r1.setVisibility(r3)
            goto L_0x15b7
        L_0x156a:
            java.lang.Object r4 = r1.A02
            X.7Rx r4 = (X.C331677Rx) r4
            X.3oV r2 = r4.A06
            if (r2 == 0) goto L_0x1a20
            r2.setVisibility(r3)
            android.view.View r2 = r4.A00
            if (r2 == 0) goto L_0x154d
            r2.setVisibility(r3)
            android.view.View r2 = r4.A03
            if (r2 == 0) goto L_0x1b0a
            r2.setVisibility(r6)
            android.view.View r2 = r4.A02
            if (r2 == 0) goto L_0x198c
            r2.setVisibility(r6)
            android.view.View r2 = r4.A00
            if (r2 == 0) goto L_0x154d
            android.view.ViewGroup$LayoutParams r11 = r2.getLayoutParams()
            java.lang.Object r7 = r1.A01
            android.view.View r7 = (android.view.View) r7
            android.content.Context r2 = r7.getContext()
            android.content.res.Resources r5 = r2.getResources()
            r1 = 2131165214(0x7f07001e, float:1.7944639E38)
            X.DbT.A1B(r5, r11, r1)
            androidx.recyclerview.widget.RecyclerView r1 = r4.A04
            if (r1 == 0) goto L_0x168b
            r1.setVisibility(r6)
            android.view.View r5 = r4.A00
            if (r5 == 0) goto L_0x154d
            r1 = 10
            X.C71405Ok4.A01(r5, r1, r0, r4)
            X.C331677Rx.A01(r4)
        L_0x15b7:
            java.lang.Object r5 = r0.A03
            X.7L2 r5 = (X.AnonymousClass7L2) r5
            java.lang.Object r1 = r0.A01
            int r1 = X.AnonymousClass7TE.A0M(r1)
            java.lang.String r13 = "messageListRecyclerViewAdapter"
            java.lang.String r11 = "cancel"
            if (r1 == r3) goto L_0x164a
            if (r1 == r10) goto L_0x15f5
            if (r1 != r8) goto L_0x1c32
            if (r5 == 0) goto L_0x15dd
            X.2t9 r1 = r4.A05
            if (r1 == 0) goto L_0x168b
            X.N5N r0 = new X.N5N
            r0.<init>(r5)
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            r1.A08(r0)
        L_0x15dd:
            com.instagram.igds.components.button.IgdsButton r0 = r4.A07
            if (r0 == 0) goto L_0x198c
            r0.setVisibility(r3)
            X.C331677Rx.A01(r4)
        L_0x15e7:
            if (r5 == 0) goto L_0x1b6f
            X.7Kx r0 = r5.A04
            int r1 = r0.A07
            android.view.View r0 = r4.A01
            if (r0 != 0) goto L_0x197b
            java.lang.String r5 = "mainContentView"
            goto L_0x1b0a
        L_0x15f5:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r9 != r0) goto L_0x15e7
            X.4DH r0 = r4.A0B
            androidx.fragment.app.FragmentActivity r0 = r0.requireActivity()
            boolean r0 = X.C61970qY.A0E(r0)
            if (r0 == 0) goto L_0x1639
            com.instagram.creator.agent.suggestedreplies.viewmodel.CreatorAgentSuggestedRepliesViewModel r0 = X.C331677Rx.A00(r4)
            r0.onNonNetworkError()
            X.0sa r0 = r4.A0E
            r0.invoke()
            X.6ap r1 = X.DbV.A0X()
            java.lang.String r0 = "suggested_replies"
            r1.A0H = r0
            r0 = 2131974704(0x7f135a30, float:1.958648E38)
            X.DbS.A19(r2, r1, r0)
            r0 = 2131974703(0x7f135a2f, float:1.9586478E38)
            java.lang.String r0 = r2.getString(r0)
            r1.A0I = r0
            X.Dc2 r1 = r1.A00()
            com.instagram.igds.components.button.IgdsButton r0 = r4.A07
            if (r0 == 0) goto L_0x198c
            r0.setVisibility(r6)
        L_0x1633:
            X.1xC r0 = X.1xC.A01
            X.JTQ.A1F(r0, r1)
            goto L_0x15e7
        L_0x1639:
            X.C331677Rx.A01(r4)
            android.content.res.Resources r1 = X.C66580MXl.A0B(r7)
            X.PHs r0 = new X.PHs
            r0.<init>(r4, r3)
            X.Dc2 r1 = X.Dc5.A02(r1, r0)
            goto L_0x1633
        L_0x164a:
            if (r5 == 0) goto L_0x1672
            X.2t9 r7 = r4.A05
            if (r7 == 0) goto L_0x168b
            java.lang.Object r0 = r0.A02
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x165c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x166f
            java.lang.String r1 = X.AnonymousClass7TE.A18(r2)
            X.N5X r0 = new X.N5X
            r0.<init>(r5, r1)
            r3.add(r0)
            goto L_0x165c
        L_0x166f:
            r7.A08(r3)
        L_0x1672:
            com.instagram.igds.components.button.IgdsButton r0 = r4.A07
            if (r0 == 0) goto L_0x198c
            r0.setVisibility(r6)
            goto L_0x15e7
        L_0x167b:
            X.Nob r0 = (X.C69593Nob) r0
            boolean r2 = r0 instanceof X.NWY
            java.lang.String r13 = "loadingIndicator"
            if (r2 == 0) goto L_0x1690
            java.lang.Object r0 = r1.A02
            X.NKE r0 = (X.NKE) r0
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = r0.A0G
            if (r1 != 0) goto L_0x1980
        L_0x168b:
            X.0qQ.A0F(r13)
            goto L_0x14ac
        L_0x1690:
            boolean r2 = r0 instanceof X.NWW
            java.lang.Object r4 = r1.A02
            X.NKE r4 = (X.NKE) r4
            if (r2 == 0) goto L_0x17c5
            X.4AF r3 = r4.A0C
            java.lang.String r2 = "listener"
            if (r3 == 0) goto L_0x16a4
            java.lang.String r2 = r4.A0H
            if (r2 != 0) goto L_0x16a9
            java.lang.String r2 = "promptId"
        L_0x16a4:
            X.0qQ.A0F(r2)
            goto L_0x14ac
        L_0x16a9:
            X.NWW r0 = (X.NWW) r0
            java.lang.String r7 = r0.A03
            r3.A00 = r7
            java.lang.Object r3 = r1.A01
            android.view.View r3 = (android.view.View) r3
            android.content.Context r10 = X.AnonymousClass7TE.A0S(r3)
            com.instagram.user.model.User r8 = r0.A01
            java.lang.String r6 = r0.A02
            java.lang.String r9 = "promptAuthorAttribute"
            if (r6 == 0) goto L_0x171b
            com.instagram.common.ui.base.IgTextView r8 = r4.A07
            if (r8 == 0) goto L_0x17f6
            X.DbT.A1H(r8)
            r1 = 0
            X.PqO r5 = new X.PqO
            r5.<init>(r4, r1)
            java.lang.String r2 = "\\{(.*?)\\}"
            X.11S r1 = new X.11S
            r1.<init>(r2)
            android.text.SpannableStringBuilder r9 = X.C51965G9l.A0E()
            r2 = 0
            X.2Ya r1 = r1.A04(r6)
            java.util.Iterator r12 = r1.iterator()
        L_0x16e0:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x1780
            java.lang.Object r11 = r12.next()
            X.5gs r11 = (X.C291265gs) r11
            X.2HY r1 = r11.A01()
            int r1 = r1.A00
            java.lang.String r1 = X.C51967G9n.A0q(r6, r2, r1)
            r9.append(r1)
            java.util.List r2 = r11.A00()
            r1 = 1
            java.lang.String r1 = X.AnonymousClass7TE.A19(r2, r1)
            X.GRE r2 = new X.GRE
            r2.<init>(r1)
            boolean r1 = X.AnonymousClass3HA.A00(r10)
            android.text.SpannedString r1 = r2.A00(r10, r5, r1)
            r9.append(r1)
            X.2HY r1 = r11.A01()
            int r1 = r1.A01
            int r2 = r1 + 1
            goto L_0x16e0
        L_0x171b:
            r11 = 1
            if (r8 == 0) goto L_0x1750
            android.content.res.Resources r5 = X.DbV.A05(r4)
            r2 = 2131970846(0x7f134b1e, float:1.9578655E38)
            java.lang.String r1 = r8.getUsername()
            java.lang.String r1 = X.AnonymousClass7TF.A0e(r5, r1, r2)
            android.text.SpannableStringBuilder r6 = X.DbS.A0C(r1)
            java.lang.String r5 = r8.getUsername()
            int r2 = X.DbV.A01(r10)
            X.Ngt r1 = new X.Ngt
            r1.<init>((X.NKE) r4, (com.instagram.user.model.User) r8, (int) r2)
            X.AnonymousClass7AV.A03(r6, r1, r5)
            com.instagram.common.ui.base.IgTextView r1 = r4.A07
            if (r1 == 0) goto L_0x17f6
            X.DbT.A1H(r1)
            com.instagram.common.ui.base.IgTextView r1 = r4.A07
            if (r1 == 0) goto L_0x17f6
            r1.setText(r6)
            goto L_0x178a
        L_0x1750:
            com.instagram.common.ui.base.IgTextView r8 = r4.A07
            if (r8 == 0) goto L_0x17f6
            android.content.res.Resources r5 = X.DbV.A05(r4)
            r2 = 2131970846(0x7f134b1e, float:1.9578655E38)
            java.lang.String r1 = ""
            java.lang.String r1 = X.AnonymousClass7TF.A0e(r5, r1, r2)
            android.text.SpannableStringBuilder r9 = X.DbS.A0C(r1)
            android.text.style.StyleSpan r6 = new android.text.style.StyleSpan
            r6.<init>(r11)
            int r5 = r9.length()
            android.content.res.Resources r2 = r10.getResources()
            r1 = 2131970850(0x7f134b22, float:1.9578663E38)
            java.lang.String r1 = r2.getString(r1)
            r9.append(r1)
            X.C66582MXn.A12(r9, r6, r5)
            goto L_0x1787
        L_0x1780:
            java.lang.String r1 = X.C66580MXl.A0z(r6, r2)
            r9.append(r1)
        L_0x1787:
            r8.setText(r9)
        L_0x178a:
            com.instagram.common.ui.base.IgTextView r1 = r4.A0A
            if (r1 != 0) goto L_0x1792
            java.lang.String r2 = "promptTitleView"
            goto L_0x16a4
        L_0x1792:
            r1.setText(r7)
            X.2t9 r1 = r4.A04     // Catch:{ IllegalStateException -> 0x17a9 }
            if (r1 != 0) goto L_0x17a3
            java.lang.String r0 = "responsesAdapter"
            X.0qQ.A0F(r0)     // Catch:{ IllegalStateException -> 0x17a9 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ IllegalStateException -> 0x17a9 }
            throw r0     // Catch:{ IllegalStateException -> 0x17a9 }
        L_0x17a3:
            com.instagram.common.recyclerview.ViewModelListUpdate r0 = r0.A00     // Catch:{ IllegalStateException -> 0x17a9 }
            r1.A05(r0)     // Catch:{ IllegalStateException -> 0x17a9 }
            goto L_0x17bd
        L_0x17a9:
            r2 = move-exception
            java.lang.String r1 = "PromptNoteConsumptionSheetFragment"
            java.lang.String r0 = "exception when binding recyclerview"
            X.0wb.A06(r1, r0, r2)
            X.0qQ.A0A(r3)
            java.lang.String r2 = "prompt_note_consumption_sheet_bind_responses_failed"
            r1 = 2131968538(0x7f13421a, float:1.9573973E38)
            r0 = 1
            X.NKE.A00(r3, r4, r2, r1, r0)
        L_0x17bd:
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = r4.A0G
            if (r1 == 0) goto L_0x168b
            X.3uy r0 = X.C255943uy.SUCCESS
            goto L_0x1982
        L_0x17c5:
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r4.A0G
            if (r0 == 0) goto L_0x168b
            X.DbS.A1T(r0)
            java.lang.Object r3 = r1.A01
            android.view.View r3 = (android.view.View) r3
            X.0qQ.A0A(r3)
            java.lang.String r2 = "prompt_note_bottom_sheet_note_unavailable"
            r1 = 2131968548(0x7f134224, float:1.9573994E38)
            r0 = 1
            X.NKE.A00(r3, r4, r2, r1, r0)
            goto L_0x1b6f
        L_0x17de:
            com.instagram.common.ui.widget.imageview.IgImageView r8 = r4.A09
            java.lang.String r9 = "customProfileImage"
            if (r8 == 0) goto L_0x17f6
            android.content.Context r6 = r4.requireContext()
            r3 = 1065353216(0x3f800000, float:1.0)
            X.NQo r1 = new X.NQo
            r1.<init>(r6, r11, r3)
            r8.setImageDrawable(r1)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r4.A09
            if (r1 != 0) goto L_0x1812
        L_0x17f6:
            X.0qQ.A0F(r9)
            goto L_0x14ac
        L_0x17fb:
            java.lang.String r9 = "profilePhotos"
            if (r8 == 0) goto L_0x180a
            com.instagram.reels.interactive.view.AvatarView r3 = r4.A0F
            if (r3 == 0) goto L_0x17f6
            com.instagram.common.typedurl.SimpleImageUrl r1 = X.DbS.A0V(r8)
            r3.setAvatarUrl(r1)
        L_0x180a:
            com.instagram.reels.interactive.view.AvatarView r1 = r4.A0F
            if (r1 == 0) goto L_0x17f6
            if (r8 != 0) goto L_0x1812
            r10 = 8
        L_0x1812:
            r1.setVisibility(r10)
            com.instagram.common.ui.widget.imageview.IgImageView r3 = r4.A0A
            if (r3 != 0) goto L_0x181d
            java.lang.String r10 = "subscriberBadgeView"
            goto L_0x14a9
        L_0x181d:
            boolean r1 = r0.A06
            int r1 = X.DbW.A01(r1)
            r3.setVisibility(r1)
            X.N4G r9 = r0.A01
            java.lang.String r8 = "avatarView"
            if (r9 == 0) goto L_0x184a
            com.instagram.reels.interactive.view.AvatarView r3 = r4.A0E
            if (r3 == 0) goto L_0x1987
            java.lang.String r1 = r9.A01
            com.instagram.common.typedurl.SimpleImageUrl r1 = X.DbS.A0V(r1)
            r3.setAvatarUrl(r1)
            com.instagram.reels.interactive.view.AvatarView r6 = r4.A0E
            if (r6 == 0) goto L_0x1987
            android.content.res.Resources r3 = X.DbV.A05(r4)
            int r1 = r9.A00
            float r1 = X.AnonymousClass7TE.A01(r3, r1)
            r6.setTranslationX(r1)
        L_0x184a:
            com.instagram.reels.interactive.view.AvatarView r3 = r4.A0E
            if (r3 == 0) goto L_0x1987
            r1 = 0
            if (r9 != 0) goto L_0x1853
            r1 = 8
        L_0x1853:
            r3.setVisibility(r1)
            X.Jvk r6 = r0.A02
            com.instagram.common.ui.base.IgTextView r1 = r4.A08
            java.lang.String r3 = "titleTextView"
            if (r1 == 0) goto L_0x1897
            r1.setVisibility(r7)
            boolean r1 = r6.A01
            com.instagram.common.ui.base.IgTextView r8 = r4.A08
            if (r1 == 0) goto L_0x1972
            if (r8 == 0) goto L_0x1897
            java.lang.String r6 = r6.A00
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            X.Jw4 r1 = new X.Jw4
            r1.<init>((java.lang.Integer) r3)
            X.C46334Dcc.A00(r8, r1, r6, r7)
        L_0x1875:
            android.os.Bundle r3 = r4.mArguments
            java.lang.String r10 = "explainerTextView"
            java.lang.String r9 = "connectedTextView"
            if (r3 == 0) goto L_0x18f3
            java.lang.String r1 = "GroupPreviewFragment.GROUP_AUTHOR_NAME"
            java.lang.String r8 = r3.getString(r1)
            if (r8 == 0) goto L_0x18f3
            com.instagram.common.ui.base.IgTextView r6 = r4.A05
            java.lang.String r3 = "groupAuthorView"
            if (r6 == 0) goto L_0x1897
            r1 = 2131968555(0x7f13422b, float:1.9574008E38)
            X.DbX.A1F(r6, r4, r8, r1)
            com.instagram.common.ui.base.IgTextView r1 = r4.A07
            if (r1 != 0) goto L_0x189c
            java.lang.String r3 = "memberCountView"
        L_0x1897:
            X.0qQ.A0F(r3)
            goto L_0x14ac
        L_0x189c:
            r1.setVisibility(r2)
            com.instagram.common.ui.base.IgTextView r1 = r4.A05
            if (r1 == 0) goto L_0x1897
            r1.setVisibility(r7)
            com.instagram.common.ui.base.IgTextView r1 = r4.A01
            java.lang.String r3 = "connectedTextEnhancedView"
            if (r1 == 0) goto L_0x1897
            r1.setVisibility(r7)
            com.instagram.common.ui.base.IgTextView r1 = r4.A02
            if (r1 == 0) goto L_0x17f6
            r1.setVisibility(r2)
            com.instagram.common.ui.base.IgTextView r1 = r4.A01
            if (r1 == 0) goto L_0x1897
            java.lang.String r0 = r0.A03
            r1.setText(r0)
            com.instagram.common.ui.base.IgTextView r0 = r4.A04
            if (r0 == 0) goto L_0x14a9
            r0.setVisibility(r2)
            com.instagram.common.ui.base.IgTextView r0 = r4.A06
            java.lang.String r10 = "linkifiedExplainerTextView"
            if (r0 == 0) goto L_0x14a9
            r0.setVisibility(r7)
            com.instagram.common.ui.base.IgTextView r6 = r4.A06
            if (r6 == 0) goto L_0x14a9
            r0 = 2131955081(0x7f130d89, float:1.954668E38)
            java.lang.String r3 = X.DbU.A0m(r4, r0)
            r0 = 2131961857(0x7f132801, float:1.9560423E38)
            java.lang.String r2 = r4.getString(r0)
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            java.lang.String r0 = "https://help.instagram.com/183346930723987"
            java.lang.String r0 = X.SQU.A01(r1, r0)
            android.net.Uri r0 = X.DbT.A09(r0)
            X.AnonymousClass7AV.A01(r0, r6, r3, r2)
            goto L_0x193c
        L_0x18f3:
            X.MfE r3 = r0.A00
            r1 = 0
            r6 = 0
            if (r3 == 0) goto L_0x1916
            boolean r1 = r3.A02
            if (r1 == 0) goto L_0x1963
            int r3 = r3.A01
            if (r3 != 0) goto L_0x1957
            r2 = 2131974609(0x7f1359d1, float:1.9586287E38)
            X.0eM r1 = r4.A0N
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            int r1 = X.C375479Ds.A00(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = X.DbV.A0z(r4, r1, r2)
        L_0x1916:
            com.instagram.common.ui.base.IgTextView r2 = r4.A07
            java.lang.String r3 = "memberCountView"
            if (r2 == 0) goto L_0x1897
            r2.setText(r1)
            com.instagram.common.ui.base.IgTextView r2 = r4.A07
            if (r2 == 0) goto L_0x1897
            if (r1 != 0) goto L_0x1927
            r6 = 8
        L_0x1927:
            r2.setVisibility(r6)
            com.instagram.common.ui.base.IgTextView r2 = r4.A02
            if (r2 == 0) goto L_0x17f6
            java.lang.String r1 = r0.A03
            r2.setText(r1)
            com.instagram.common.ui.base.IgTextView r1 = r4.A04
            if (r1 == 0) goto L_0x14a9
            java.lang.String r0 = r0.A04
            r1.setText(r0)
        L_0x193c:
            android.view.ViewGroup r0 = r4.A00
            if (r0 == 0) goto L_0x154d
            android.view.View[] r0 = new android.view.View[]{r0}
            X.C294975nL.A07(r0, r5)
            android.os.Handler r3 = X.AnonymousClass7TF.A0D()
            X.PVV r2 = new X.PVV
            r2.<init>(r4)
            r0 = 50
            r3.postDelayed(r2, r0)
            goto L_0x1b6f
        L_0x1957:
            android.content.res.Resources r2 = X.DbV.A05(r4)
            r1 = 2131820739(0x7f1100c3, float:1.9274201E38)
            java.lang.String r1 = X.DbY.A0d(r2, r3, r1)
            goto L_0x1916
        L_0x1963:
            android.content.res.Resources r2 = X.JTR.A0R(r4)
            int r1 = r3.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = X.C66637Ma6.A01(r2, r1, r7)
            goto L_0x1916
        L_0x1972:
            if (r8 == 0) goto L_0x1897
            java.lang.String r1 = r6.A00
            r8.setText(r1)
            goto L_0x1875
        L_0x197b:
            r0.setBackgroundColor(r1)
            goto L_0x1b6f
        L_0x1980:
            X.3uy r0 = X.C255943uy.LOADING
        L_0x1982:
            r1.setLoadingStatus(r0)
            goto L_0x1b6f
        L_0x1987:
            X.0qQ.A0F(r8)
            goto L_0x14ac
        L_0x198c:
            X.0qQ.A0F(r11)
            goto L_0x14ac
        L_0x1991:
            X.Noa r0 = (X.C69592Noa) r0
            java.lang.Object r3 = r1.A02
            X.NIn r3 = (X.C68449NIn) r3
            if (r0 == 0) goto L_0x1a8e
            boolean r1 = r0 instanceof X.NWS
            r6 = 1
            r4 = 0
            if (r1 == 0) goto L_0x1ad7
            X.NWS r0 = (X.NWS) r0
            com.instagram.api.schemas.MusicInfo r0 = r0.A00
            com.instagram.api.schemas.TrackData r0 = r0.BUk()
            com.instagram.music.common.model.MusicAssetModel r8 = com.instagram.music.common.model.MusicAssetModel.A01(r0, r4)
            X.0qQ.A0A(r8)
            java.lang.String r1 = r8.A0I
            java.lang.String r7 = ""
            if (r1 != 0) goto L_0x19b5
            r1 = r7
        L_0x19b5:
            boolean r0 = r8.A0S
            android.text.SpannableStringBuilder r5 = X.C68449NIn.A00(r3, r1, r0)
            android.text.SpannableStringBuilder r2 = X.C51965G9l.A0E()
            android.text.style.StyleSpan r1 = new android.text.style.StyleSpan
            r1.<init>(r6)
            int r0 = r2.length()
            r2.append(r5)
            X.C66582MXn.A12(r2, r1, r0)
            java.lang.String r5 = " "
            android.text.SpannableStringBuilder r2 = r2.append(r5)
            android.content.Context r1 = r3.requireContext()
            r0 = 2131965115(0x7f1334bb, float:1.956703E38)
            java.lang.CharSequence r0 = r1.getText(r0)
            android.text.SpannableStringBuilder r0 = r2.append(r0)
            android.text.SpannableStringBuilder r1 = r0.append(r5)
            java.lang.String r0 = r8.A0D
            if (r0 == 0) goto L_0x19ec
            r7 = r0
        L_0x19ec:
            android.text.SpannableStringBuilder r9 = r1.append(r7)
            android.content.Context r2 = r3.requireContext()
            r1 = 2131238353(0x7f081dd1, float:1.8092982E38)
            int r0 = X.C66584MXp.A05(r3)
            android.graphics.drawable.Drawable r8 = X.AnonymousClass3JT.A05(r2, r1, r0)
            X.3oV r0 = r3.A0X
            java.lang.String r7 = "spotifyMusicBubble"
            r2 = 0
            if (r0 == 0) goto L_0x1a20
            android.view.View r1 = r0.getView()
            r0 = 2131441625(0x7f0b37d9, float:1.8505267E38)
            android.widget.TextView r5 = X.AnonymousClass7TE.A0d(r1, r0)
            r5.setText(r9)
            r5.setCompoundDrawablesRelativeWithIntrinsicBounds(r8, r2, r2, r2)
            r5.setSelected(r6)
            X.3oV r1 = r3.A0Y
            if (r1 != 0) goto L_0x1a25
            java.lang.String r7 = "spotifyPlaceholderBubble"
        L_0x1a20:
            X.0qQ.A0F(r7)
            goto L_0x14ac
        L_0x1a25:
            r0 = 8
            r1.setVisibility(r0)
            X.C66581MXm.A1K(r3, r0)
            X.3oV r0 = r3.A0X
            if (r0 == 0) goto L_0x1a20
            r0.setVisibility(r4)
            r2 = 1093664768(0x41300000, float:11.0)
            r0 = 1061158912(0x3f400000, float:0.75)
            float r2 = r2 / r0
            r5.setTextSize(r2)
            X.3oV r0 = r3.A0X
            if (r0 == 0) goto L_0x1a20
            android.view.View r1 = r0.getView()
            r0 = 2131435576(0x7f0b2038, float:1.8492998E38)
            android.widget.TextView r0 = X.AnonymousClass7TE.A0d(r1, r0)
            r0.setTextSize(r2)
            com.instagram.common.ui.base.IgEditText r0 = r3.A0H
            java.lang.String r5 = "noteEditText"
            if (r0 == 0) goto L_0x1b0a
            r0.setTextSize(r2)
            com.instagram.direct.inbox.notes.creation.NotesCreationBubbleView r0 = r3.A0a
            java.lang.String r7 = "bubbleView"
            if (r0 == 0) goto L_0x1a20
            float r0 = X.C66584MXp.A00(r3, r0)
            com.instagram.common.ui.base.IgEditText r1 = r3.A0H
            if (r1 == 0) goto L_0x1b0a
            int r0 = X.C66583MXo.A04(r3, r0)
            r1.setMaxWidth(r0)
            boolean r0 = r3.A0s
            if (r0 != 0) goto L_0x1a7f
            com.instagram.direct.inbox.notes.creation.NotesCreationBubbleView r2 = r3.A0a
            if (r2 == 0) goto L_0x1a20
            r0 = 1119092736(0x42b40000, float:90.0)
            int r1 = X.C66583MXo.A04(r3, r0)
            androidx.cardview.widget.CardView r0 = r2.A00
            X.C66580MXl.A1B(r0, r1)
        L_0x1a7f:
            com.instagram.direct.inbox.notes.creation.NotesCreationBubbleView r1 = r3.A0a
            if (r1 == 0) goto L_0x1a20
            com.instagram.direct.inbox.notes.creation.NotesCreationPogView r0 = r3.A0b
            if (r0 != 0) goto L_0x1a8a
            java.lang.String r7 = "pogViewContainer"
            goto L_0x1a20
        L_0x1a8a:
            X.C319756rA.A01(r1, r0)
            goto L_0x1ae2
        L_0x1a8e:
            X.3oV r0 = r3.A0X
            if (r0 != 0) goto L_0x1a95
            java.lang.String r5 = "spotifyMusicBubble"
            goto L_0x1b0a
        L_0x1a95:
            r1 = 8
            r0.setVisibility(r1)
            X.3oV r0 = r3.A0W
            if (r0 != 0) goto L_0x1aa1
            java.lang.String r5 = "spotifyDisclaimerBanner"
            goto L_0x1b0a
        L_0x1aa1:
            r0.setVisibility(r1)
            X.3oV r0 = r3.A0Y
            if (r0 != 0) goto L_0x1aab
            java.lang.String r5 = "spotifyPlaceholderBubble"
            goto L_0x1b0a
        L_0x1aab:
            r0.setVisibility(r1)
            X.C66581MXm.A1K(r3, r1)
            com.instagram.common.ui.base.IgEditText r0 = r3.A0H
            java.lang.String r5 = "noteEditText"
            if (r0 == 0) goto L_0x1b0a
            r0.requestFocus()
            com.instagram.common.ui.base.IgEditText r0 = r3.A0H
            if (r0 == 0) goto L_0x1b0a
            X.C66580MXl.A1E(r0)
            com.instagram.common.ui.base.IgEditText r1 = r3.A0H
            if (r1 == 0) goto L_0x1b0a
            r0 = 1
            r1.setEnabled(r0)
            com.instagram.common.ui.base.IgEditText r1 = r3.A0H
            if (r1 == 0) goto L_0x1b0a
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT
            r1.setTypeface(r0)
            X.C68449NIn.A0N(r3)
            goto L_0x1b6f
        L_0x1ad7:
            X.NWV r1 = X.NWV.A00
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x1b25
            X.C68449NIn.A0V(r3, r6)
        L_0x1ae2:
            X.3oV r0 = r3.A0W
            java.lang.String r5 = "spotifyDisclaimerBanner"
            if (r0 == 0) goto L_0x1b0a
            android.view.View r1 = r0.getView()
            r0 = 2131435367(0x7f0b1f67, float:1.8492574E38)
            android.view.View r2 = r1.findViewById(r0)
            r1 = 14
            X.LYE r0 = new X.LYE
            r0.<init>((java.lang.Object) r3, (int) r1)
            X.AnonymousClass0fU.A00(r0, r2)
            X.3oV r0 = r3.A0W
            if (r0 == 0) goto L_0x1b0a
            r0.setVisibility(r4)
            com.instagram.common.ui.base.IgEditText r2 = r3.A0H
            if (r2 != 0) goto L_0x1b0f
            java.lang.String r5 = "noteEditText"
        L_0x1b0a:
            X.0qQ.A0F(r5)
            goto L_0x14ac
        L_0x1b0f:
            r1 = 1093664768(0x41300000, float:11.0)
            r0 = 1061158912(0x3f400000, float:0.75)
            float r1 = r1 / r0
            r2.setTextSize(r1)
            com.instagram.direct.inbox.notes.creation.NotesCreationBubbleView r1 = r3.A0a
            if (r1 != 0) goto L_0x1b1e
            java.lang.String r5 = "bubbleView"
            goto L_0x1b0a
        L_0x1b1e:
            com.instagram.direct.inbox.notes.creation.NotesCreationPogView r0 = r3.A0b
            if (r0 != 0) goto L_0x1b58
            java.lang.String r5 = "pogViewContainer"
            goto L_0x1b0a
        L_0x1b25:
            X.NWT r1 = X.NWT.A00
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x1b54
            X.C68449NIn.A0V(r3, r6)
            X.1xC r2 = X.1xC.A01
            X.6ap r1 = X.DbS.A0a()
            r0 = 2131965111(0x7f1334b7, float:1.9567023E38)
            java.lang.String r0 = r3.getString(r0)
            r1.A0D = r0
            r1.A0L = r6
            r0 = 2131965110(0x7f1334b6, float:1.956702E38)
            java.lang.String r0 = X.DbU.A0m(r3, r0)
            r1.A0G = r0
            r0 = 6
            X.C72737PHr.A00(r1, r3, r0)
            r1.A0R = r6
            X.DbY.A1K(r2, r1)
            goto L_0x1ae2
        L_0x1b54:
            X.C68449NIn.A0V(r3, r4)
            goto L_0x1ae2
        L_0x1b58:
            X.C319756rA.A01(r1, r0)
            goto L_0x1b6f
        L_0x1b5c:
            boolean r3 = r0 instanceof X.C68759NVu
            if (r3 == 0) goto L_0x1b72
            java.lang.Object r1 = r1.A02
            X.NKN r1 = (X.NKN) r1
            X.PvP r1 = r1.A0C
            if (r1 == 0) goto L_0x1b6f
            X.NVu r0 = (X.C68759NVu) r0
            java.lang.String r0 = r0.A00
            r1.DEp(r0)
        L_0x1b6f:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x1b72:
            boolean r3 = r0 instanceof X.C68760NVv
            if (r3 == 0) goto L_0x1b9d
            java.lang.Object r3 = r1.A02
            X.NKN r3 = (X.NKN) r3
            X.NVv r0 = (X.C68760NVv) r0
            boolean r1 = r0.A01
            r3.A0I = r1
            java.lang.String r2 = r0.A00
            if (r2 == 0) goto L_0x1c37
            com.instagram.direct.perf.constants.ThreadFetchReason r1 = com.instagram.direct.perf.constants.ThreadFetchReason.GROUP_PREVIEW_NAVIGATE_TO_THREAD
        L_0x1b86:
            androidx.fragment.app.FragmentActivity r0 = r3.getActivity()
            X.NKN.A00(r0, r3, r1, r2)
            androidx.fragment.app.FragmentActivity r0 = r3.getActivity()
            if (r0 == 0) goto L_0x1b6f
            X.37D r0 = X.DbT.A0i(r0)
        L_0x1b97:
            if (r0 == 0) goto L_0x1b6f
            r0.A0B()
            goto L_0x1b6f
        L_0x1b9d:
            boolean r3 = r0 instanceof X.C68761NVw
            if (r3 == 0) goto L_0x1bba
            java.lang.Object r12 = r1.A02
            X.NKN r12 = (X.NKN) r12
            X.NVw r0 = (X.C68761NVw) r0
            com.instagram.user.model.User r9 = r0.A00
            java.lang.String r14 = r0.A01
            com.instagram.direct.perf.constants.ThreadFetchReason r11 = com.instagram.direct.perf.constants.ThreadFetchReason.GROUP_PREVIEW_FOLLOW_USER
            boolean r0 = r0.A02
            r1 = 0
            if (r0 == 0) goto L_0x1c0f
            com.instagram.ui.widget.progressbutton.ProgressButton r0 = r12.A0G
            if (r0 != 0) goto L_0x1bd6
            java.lang.String r10 = "ctaButton"
            goto L_0x14a9
        L_0x1bba:
            boolean r2 = r0 instanceof X.C68758NVt
            if (r2 == 0) goto L_0x1c3c
            java.lang.Object r3 = r1.A02
            X.NKN r3 = (X.NKN) r3
            boolean r1 = r3.A0J
            if (r1 != 0) goto L_0x1bc8
            r3.A0I = r5
        L_0x1bc8:
            X.PvP r1 = r3.A0C
            if (r1 == 0) goto L_0x1bcf
            r1.DIJ()
        L_0x1bcf:
            X.NVt r0 = (X.C68758NVt) r0
            java.lang.String r2 = r0.A00
            com.instagram.direct.perf.constants.ThreadFetchReason r1 = com.instagram.direct.perf.constants.ThreadFetchReason.GROUP_PREVIEW_JOIN_CHANNEL
            goto L_0x1b86
        L_0x1bd6:
            r0.setShowProgressBar(r1)
            X.8ab r3 = X.DbW.A0U(r12)
            r1 = 2131962542(0x7f132aae, float:1.9561812E38)
            java.lang.String r0 = r9.getUsername()
            java.lang.String r0 = X.DbV.A0z(r12, r0, r1)
            r3.A05 = r0
            r1 = 2131962541(0x7f132aad, float:1.956181E38)
            java.lang.String r0 = r9.getUsername()
            java.lang.String r0 = X.DbV.A0z(r12, r0, r1)
            r3.A0q(r0)
            r2 = 2131962530(0x7f132aa2, float:1.9561788E38)
            r1 = 5
            X.Of1 r0 = new X.Of1
            r0.<init>(r1, r9, r12)
            r3.A0I(r0, r2)
            r0 = 46
            X.OgE r0 = X.C71249OgE.A00(r12, r0)
            X.DbX.A16(r0, r3)
            goto L_0x1b6f
        L_0x1c0f:
            r15 = 11
            X.IoE r10 = new X.IoE
            r13 = r9
            r10.<init>(r11, r12, r13, r14, r15)
            X.0rm r1 = X.C51965G9l.A11()
            androidx.fragment.app.FragmentActivity r3 = r12.requireActivity()
            X.0eM r0 = r12.A0N
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r0)
            r4 = 0
            X.NMH r5 = new X.NMH
            r5.<init>(r2, r10, r1)
            r7 = r4
            r8 = r4
            X.FH6.A00(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x1b6f
        L_0x1c32:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x1c37:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x1c3c:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73530PeM.emit(java.lang.Object, X.4D7):java.lang.Object");
    }
}
