package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.HJx  reason: case insensitive filesystem */
public final class C54588HJx extends GFP {
    public 1wn A00;
    public ReboundViewPager A01;
    public final Context A02;
    public final 2V5 A03;
    public final 2V5 A04;
    public final 2V5 A05 = new 2V5((Object) null);
    public final C267324bN A06;
    public final UserSession A07;
    public final AnonymousClass0eM A08;
    public final int A09;
    public final C52186GIc A0A;
    public final C56516Hzn A0B;
    public final C55820Ho3 A0C;
    public final String A0D;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.Gmw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: X.Gmw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: X.Gmw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: X.Gmw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: X.Gmw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: X.Gmw} */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b9, code lost:
        if (r3 == null) goto L_0x00bb;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C54588HJx(android.content.Context r9, X.C267324bN r10, X.C52186GIc r11, com.instagram.common.session.UserSession r12, X.C55820Ho3 r13, int r14) {
        /*
            r8 = this;
            r0 = 2
            X.0qQ.A0B(r12, r0)
            r8.<init>()
            r8.A02 = r9
            r8.A07 = r12
            r8.A09 = r14
            r8.A06 = r10
            r8.A0A = r11
            r8.A0C = r13
            r5 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            X.2V5 r6 = new X.2V5
            r6.<init>(r0)
            r8.A04 = r6
            X.0sn r0 = X.0sn.A00
            X.2V5 r2 = new X.2V5
            r2.<init>(r0)
            r8.A03 = r2
            r1 = 0
            X.2V5 r0 = new X.2V5
            r0.<init>(r1)
            r8.A05 = r0
            X.93T r0 = X.AnonymousClass93S.A00(r12)
            java.lang.String r0 = r0.A00
            r8.A0D = r0
            X.Hzn r0 = new X.Hzn
            r0.<init>(r12)
            r8.A0B = r0
            X.0eO r1 = X.0eO.A02
            r0 = 19
            X.0eM r0 = X.C58715IwO.A00(r8, r1, r0)
            r8.A08 = r0
            r1 = 23
            X.IO4 r0 = new X.IO4
            r0.<init>((java.lang.Object) r8, (int) r1)
            r8.A00 = r0
            X.1Xj r0 = r10.A02
            java.util.List r7 = r8.A02(r0)
            if (r7 == 0) goto L_0x005d
            r2.A00(r7)
        L_0x005d:
            X.2V5 r1 = r13.A00
            X.1Xj r0 = r10.A02
            if (r0 == 0) goto L_0x00d0
            X.1Xy r0 = r0.A0C
            X.DUG r0 = r0.AoE()
            if (r0 == 0) goto L_0x00d0
            boolean r0 = r0.BUF()
        L_0x006f:
            X.C51967G9n.A1B(r1, r0)
            X.2V5 r1 = r13.A02
            X.1Xj r0 = r10.A02
            if (r0 == 0) goto L_0x00ce
            X.1Xy r0 = r0.A0C
            X.DUG r0 = r0.AoE()
            if (r0 == 0) goto L_0x00ce
            java.lang.String r0 = r0.BaN()
        L_0x0084:
            r1.A00(r0)
            X.2V5 r0 = r13.A01
            X.C51967G9n.A1B(r0, r5)
            r3 = 0
            if (r7 == 0) goto L_0x00c1
            X.4bN r0 = r8.A06
            X.1Xj r0 = r0.A02
            if (r0 == 0) goto L_0x00bb
            X.1Xy r0 = r0.A0C
            java.lang.String r4 = r0.Brb()
            if (r4 == 0) goto L_0x00bb
            java.util.Iterator r2 = r7.iterator()
        L_0x00a1:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00b7
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.Gmw r0 = (X.C53372Gmw) r0
            java.lang.String r0 = r0.A06
            boolean r0 = X.00p.A0k(r0, r4, r5)
            if (r0 == 0) goto L_0x00a1
            r3 = r1
        L_0x00b7:
            X.Gmw r3 = (X.C53372Gmw) r3
            if (r3 != 0) goto L_0x00c1
        L_0x00bb:
            java.lang.Object r3 = X.00k.A0J(r7)
            X.Gmw r3 = (X.C53372Gmw) r3
        L_0x00c1:
            A00(r3, r8)
            if (r7 == 0) goto L_0x00ca
            int r5 = r7.indexOf(r3)
        L_0x00ca:
            X.C51967G9n.A1A(r6, r5)
            return
        L_0x00ce:
            r0 = 0
            goto L_0x0084
        L_0x00d0:
            r0 = 0
            goto L_0x006f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54588HJx.<init>(android.content.Context, X.4bN, X.GIc, com.instagram.common.session.UserSession, X.Ho3, int):void");
    }

    public final List A02(1Xj r16) {
        DUG AoE;
        List AoF;
        List AoD;
        User A11;
        String str;
        1Xj r0 = r16;
        if (r16 == null || (AoE = r0.A0C.AoE()) == null || (AoF = AoE.AoF()) == null) {
            return null;
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = AoF.iterator();
        while (it.hasNext()) {
            1Xj A0t = C51966G9m.A0t(it);
            User A112 = C51966G9m.A11(A0t);
            if (!(A112 == null || (AoD = A0t.A0C.AoD()) == null || (A11 = C51966G9m.A11(A0t)) == null)) {
                ImageUrl Bh3 = A11.Bh3();
                User A113 = C51966G9m.A11(A0t);
                if (A113 != null) {
                    String id = A113.getId();
                    String id2 = A0t.getId();
                    if (id2 != null) {
                        List A1I = AnonymousClass7TE.A1I(Bh3);
                        boolean A5d = A0t.A5d();
                        int A0v = A0t.A0v();
                        String A34 = A0t.A34(this.A02);
                        if (A34 != null) {
                            str = A34.toString();
                        } else {
                            str = null;
                        }
                        A1C.add(new C53372Gmw(A112, id2, id, str, AoD, A1I, A0v, A5d));
                    }
                }
            }
        }
        return A1C;
    }

    public static final void A00(C53372Gmw gmw, C54588HJx hJx) {
        String str;
        String str2;
        User user;
        hJx.A05.A00(gmw);
        C52186GIc gIc = hJx.A0A;
        String str3 = null;
        if (gIc != null) {
            1Xj r0 = hJx.A06.A02;
            if (r0 != null) {
                str = r0.A30();
            } else {
                str = null;
            }
            gIc.A02 = str;
            if (gmw != null) {
                str2 = gmw.A06;
            } else {
                str2 = null;
            }
            gIc.A01 = str2;
            if (!(gmw == null || (user = (User) gmw.A04) == null)) {
                str3 = user.getUsername();
            }
            gIc.A00 = str3;
        }
    }

    public static final void A01(C54588HJx hJx, int i) {
        String str;
        boolean A1Q = AnonymousClass7TF.A1Q(i);
        C56516Hzn hzn = hJx.A0B;
        C53372Gmw gmw = (C53372Gmw) hJx.A05.A00;
        if (gmw != null) {
            str = gmw.A06;
        } else {
            str = null;
        }
        int i2 = hJx.A09;
        String str2 = hJx.A0D;
        0qQ.A0B(str2, 2);
        0Aj A0e = AnonymousClass7TE.A0e(hzn.A00, "instagram_clips_spin_impression");
        Long A002 = C56516Hzn.A00(str);
        if (A0e.isSampled() && A002 != null) {
            int i3 = 43;
            if (A1Q) {
                i3 = 16;
            }
            C51968G9o.A1I(A0e, A002, "containermodule", "spins_impression_reels_viewer");
            C51969G9p.A16(A0e, i2);
            C51965G9l.A1O(A0e, str2);
            AnonymousClass7TE.A1W(A0e, "media_creation_product_type", i3);
            A0e.A9F("h_scroll_position", DbV.A0p(A0e, "chaining_session_id", str2, i));
            DbY.A1C(A0e);
            DbX.A1L(A0e);
        }
    }
}
