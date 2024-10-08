package X;

import com.instagram.api.schemas.ClipsMidCardType;
import com.instagram.api.schemas.MidCardLayoutType;
import com.instagram.api.schemas.MusicInfo;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class GDI extends C247303g7 {
    public final JU4 A00;
    public final GDK A01;
    public final GDH A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;

    public static final C2606046i A00(1Xj r2) {
        C67231sQ A0n;
        if (r2 == null || (A0n = C51966G9m.A0n(r2)) == null) {
            return null;
        }
        MusicInfo BUr = A0n.BUr();
        if (BUr != null) {
            return new C2605946h(BUr);
        }
        OriginalSoundDataIntf BZB = A0n.BZB();
        if (BZB != null) {
            return new C282025Bc(BZB);
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: X.46i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: X.8ZN[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: X.46i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: X.8ZN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: X.46i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: X.46i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: X.46i} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v5, types: [int] */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.JNG A01(X.C53450Goi r9, X.GDI r10, java.lang.String r11, X.C62320sa r12) {
        /*
            r8 = 0
            if (r9 != 0) goto L_0x0009
            X.Gaq r0 = new X.Gaq
            r0.<init>(r8)
            return r0
        L_0x0009:
            X.Goj r7 = r9.A00
            X.JSB r2 = r7.A01
            if (r2 == 0) goto L_0x0030
            java.lang.Object r9 = r12.invoke()
            X.1Xj r9 = (X.1Xj) r9
            int r0 = r2.B1y()
            long r0 = (long) r0
            X.28D r5 = X.AnonymousClass3QU.A00(r0)
            com.instagram.api.schemas.ClipsCameraCommandAction r6 = r2.AYB()
            if (r9 == 0) goto L_0x0028
            X.46i r8 = A00(r9)
        L_0x0028:
            X.GaW r4 = new X.GaW
            r4.<init>(r5, r6, r7, r8, r9)
        L_0x002d:
            X.JNG r4 = (X.JNG) r4
            return r4
        L_0x0030:
            X.JSD r2 = r7.A03
            if (r2 == 0) goto L_0x004b
            int r0 = r2.B1y()
            long r0 = (long) r0
            X.28D r0 = X.AnonymousClass3QU.A00(r0)
            if (r11 != 0) goto L_0x0043
            java.lang.String r11 = r2.Ayq()
        L_0x0043:
            X.GrC r3 = new X.GrC
            r3.<init>(r0, r7, r11)
        L_0x0048:
            X.JNG r3 = (X.JNG) r3
            return r3
        L_0x004b:
            com.instagram.api.schemas.OpenDraftGalleryCommand r0 = r7.A04
            if (r0 == 0) goto L_0x0057
            X.JVj r0 = X.C59725JVj.DRAFT_MIDCARD
            X.GrD r4 = new X.GrD
            r4.<init>((X.C59725JVj) r0, (X.C53451Goj) r7)
            goto L_0x002d
        L_0x0057:
            X.Gon r6 = r7.A00
            r3 = 0
            if (r6 == 0) goto L_0x0084
            X.8ZN[] r5 = X.AnonymousClass8ZN.values()
            int r4 = r5.length
        L_0x0061:
            if (r3 >= r4) goto L_0x0070
            r2 = r5[r3]
            java.lang.String r1 = r2.A00
            java.lang.String r0 = r6.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0081
            r8 = r2
        L_0x0070:
            java.lang.Object r0 = r12.invoke()
            X.1Xj r0 = (X.1Xj) r0
            X.46i r1 = A00(r0)
            r0 = 0
            X.GaM r4 = new X.GaM
            r4.<init>(r0, r7, r8, r1)
            goto L_0x002d
        L_0x0081:
            int r3 = r3 + 1
            goto L_0x0061
        L_0x0084:
            java.lang.Boolean r0 = r7.A08
            if (r0 == 0) goto L_0x00bb
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00bb
            java.lang.Object r0 = r12.invoke()
            X.1Xj r0 = (X.1Xj) r0
            X.46i r2 = A00(r0)
            if (r2 == 0) goto L_0x00ac
            java.lang.String r1 = r2.getAssetId()
            if (r1 == 0) goto L_0x00ac
            X.0eM r0 = r10.A08
            java.lang.Object r0 = r0.getValue()
            X.KWw r0 = (X.C62037KWw) r0
            boolean r3 = X.C51973G9u.A1a(r0, r1, r3)
        L_0x00ac:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            X.02z r1 = X.106.A01(r0)
            r0 = 2
            X.GaM r3 = new X.GaM
            r3.<init>(r0, r7, r1, r2)
            goto L_0x0048
        L_0x00bb:
            java.lang.Object r1 = r12.invoke()
            X.1Xj r1 = (X.1Xj) r1
            if (r1 == 0) goto L_0x00ce
            X.Gor r0 = r7.A07
            if (r0 == 0) goto L_0x00ce
            X.GaM r4 = new X.GaM
            r4.<init>(r7, r1)
            goto L_0x002d
        L_0x00ce:
            X.JS7 r0 = r7.A05
            if (r0 == 0) goto L_0x00de
            java.lang.String r0 = r0.AgH()
            X.GrB r2 = new X.GrB
            r2.<init>(r7, r0, r3)
        L_0x00db:
            X.JNG r2 = (X.JNG) r2
            return r2
        L_0x00de:
            X.JSC r0 = r7.A02
            if (r0 == 0) goto L_0x00e8
            X.GrD r2 = new X.GrD
            r2.<init>((X.C53451Goj) r7, (X.JSC) r0)
            goto L_0x00db
        L_0x00e8:
            java.lang.String r1 = r7.A0A
            if (r1 == 0) goto L_0x00f3
            r0 = 2
        L_0x00ed:
            X.GrB r2 = new X.GrB
            r2.<init>(r7, r1, r0)
            goto L_0x00db
        L_0x00f3:
            java.lang.String r1 = r7.A09
            if (r1 == 0) goto L_0x00f9
            r0 = 1
            goto L_0x00ed
        L_0x00f9:
            com.instagram.api.schemas.OpenInspirationHubCommand r0 = r7.A06
            if (r0 == 0) goto L_0x010c
            com.instagram.api.schemas.XDTCreatorInspirationHubType r0 = r0.C4R()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            X.GrA r3 = new X.GrA
            r3.<init>(r7, r0)
            goto L_0x0048
        L_0x010c:
            X.Gaq r4 = new X.Gaq
            r4.<init>(r7)
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GDI.A01(X.Goi, X.GDI, java.lang.String, X.0sa):X.JNG");
    }

    public /* synthetic */ GDI(UserSession userSession, GDH gdh) {
        AnonymousClass0eM A002 = AnonymousClass1YB.A00(new C58703IwC(userSession, 40));
        AnonymousClass0eM A003 = AnonymousClass1YB.A00(new C58703IwC(userSession, 41));
        AnonymousClass0eM A004 = AnonymousClass1YB.A00(new C58703IwC(userSession, 42));
        0t0 A012 = AnonymousClass0eN.A01(new C58703IwC(userSession, 43));
        0t0 A013 = AnonymousClass0eN.A01(new C58703IwC(userSession, 44));
        0t0 A014 = AnonymousClass0eN.A01(new C58703IwC(userSession, 45));
        C51974G9v.A1S(gdh, A002, A003, A004, A012);
        AnonymousClass7TF.A1F(A013, 7, A014);
        this.A02 = gdh;
        this.A06 = A002;
        this.A03 = A003;
        this.A07 = A004;
        this.A04 = A012;
        this.A05 = A013;
        this.A08 = A014;
        JU4 ju4 = new JU4((DefaultConstructorMarker) null, (C249513ju) null, 1);
        this.A00 = ju4;
        this.A01 = new GDK(0u9.A04(ju4));
    }

    public static final List A02(C53452Gok gok, C53332GmI gmI, GDI gdi) {
        ArrayList arrayList;
        List<String> list;
        ClipsMidCardType clipsMidCardType = gok.A04;
        if (clipsMidCardType == ClipsMidCardType.POPULAR_REELS && gok.A07 == MidCardLayoutType.MEGA_CARD) {
            C53449Goh goh = gok.A06;
            List<Object> list2 = goh.A08;
            arrayList = AnonymousClass7TF.A0p(list2);
            for (Object iwC : list2) {
                arrayList.add(A01(goh.A01, gdi, (String) null, new C58703IwC(iwC, 46)));
            }
        } else {
            int i = 0;
            if (clipsMidCardType != ClipsMidCardType.DRAFT || gok.A07 != MidCardLayoutType.MEGA_CARD) {
                List list3 = gok.A06.A09;
                arrayList = AnonymousClass7TF.A0p(list3);
                for (Object next : list3) {
                    int i2 = i + 1;
                    if (i < 0) {
                        0sr.A1T();
                        throw AnonymousClass00P.createAndThrow();
                    }
                    arrayList.add(A01((C53450Goi) next, gdi, (String) null, new C58184Ino(gok, i, 2)));
                    i = i2;
                }
            } else if (gmI == null || (list = gmI.A0F) == null) {
                throw AnonymousClass7TE.A0y();
            } else {
                arrayList = AnonymousClass7TF.A0p(list);
                for (String A012 : list) {
                    arrayList.add(A01((C53450Goi) 00k.A0O(gok.A06.A09, 0), gdi, A012, C58662IvX.A00));
                }
            }
        }
        return arrayList;
    }
}
