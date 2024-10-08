package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.instagram.archive.data.HighlightsSettingsRepository;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import com.instagram.pendingmedia.store.PendingMediaStore;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.GhW  reason: case insensitive filesystem */
public final class C53040GhW extends 2YL {
    public AnonymousClass3Q2 A00;
    public List A01;
    public Map A02;
    public String A03;
    public final int A04;
    public final HighlightsSettingsRepository A05;
    public final C54428HDa A06;
    public final UserSession A07;
    public final AnonymousClass2sT A08;
    public final C323016wn A09;
    public final C230252pH A0A;
    public final String A0B;
    public final Set A0C;
    public final C262224Cq A0D = 19E.A02(AnonymousClass12T.A00.AOJ(-18, 3));
    public final 05G A0E;
    public final AnonymousClass0Ud A0F;
    public final AnonymousClass0iw A0G;
    public final String A0H;

    public static final Reel A00(C53040GhW ghW) {
        Object obj;
        UserSession userSession = ghW.A07;
        1OP r0 = 1OP.$redex_init_class;
        Iterator it = 00k.A0U(AnonymousClass3PA.A00(userSession).A00.values()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Reel) obj).A0l()) {
                break;
            }
        }
        return (Reel) obj;
    }

    public static final void A02(C53040GhW ghW, Reel reel) {
        int size;
        ImageUrl A072;
        boolean z;
        Object value;
        C53377Gn7 gn7;
        String id;
        Bitmap bitmap;
        String str;
        Bitmap bitmap2;
        Object value2;
        C53377Gn7 gn72;
        C53309Glv glv;
        Reel reel2 = reel;
        if (reel != null) {
            C53040GhW ghW2 = ghW;
            05G r3 = ghW2.A0E;
            C53309Glv glv2 = ((C53377Gn7) r3.getValue()).A01;
            Integer num = reel2.A0e;
            if (num != null) {
                size = num.intValue();
            } else {
                size = reel2.A0O(ghW2.A07).size();
            }
            if (size == 0) {
                A072 = null;
            } else {
                A072 = reel2.A07();
            }
            UserSession userSession = ghW2.A07;
            if (2O0.A00(userSession).A01(reel2) > 0 || !(glv2 == null || glv2.A01 == null)) {
                z = true;
            } else {
                z = false;
            }
            do {
                value = r3.getValue();
                gn7 = (C53377Gn7) value;
                id = reel2.getId();
                0qQ.A07(id);
                AnonymousClass3Q2 r7 = ghW2.A00;
                if (r7 == null || !r7.A0n() || glv2 == null) {
                    bitmap = null;
                } else {
                    bitmap = glv2.A01;
                }
            } while (!r3.AIY(value, C53377Gn7.A00((C59479JLd) null, gn7, new C53309Glv(bitmap, A072, reel2, id, (String) null, size, false, false, z), (AnonymousClass62P) null, 239, false, false)));
            AnonymousClass3Q2 r1 = ghW2.A00;
            if (r1 != null) {
                r1.A0Z(ghW2.A08);
            }
            ghW2.A00 = null;
            PendingMediaStore A002 = 28K.A00(userSession);
            ArrayList A052 = A002.A05(AnonymousClass05K.A0N);
            ArrayList A1C = AnonymousClass7TE.A1C();
            Iterator it = A052.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (((AnonymousClass3Q2) next).A0n()) {
                    A1C.add(next);
                }
            }
            ArrayList A053 = A002.A05(AnonymousClass05K.A0C);
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            Iterator it2 = A053.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                if (((AnonymousClass3Q2) next2).A0n()) {
                    A1C2.add(next2);
                }
            }
            ArrayList A0S = 00k.A0S(A1C2, A1C);
            if (!A0S.isEmpty()) {
                AnonymousClass3Q2 r72 = (AnonymousClass3Q2) 00k.A0I(A0S);
                AnonymousClass8VT r0 = r72.A1Y;
                if (r0 == null || (str = r0.A00) == null) {
                    str = "myWeek";
                }
                if (00l.A0d(str, "myWeek", false)) {
                    bitmap2 = BitmapFactory.decodeFile(r72.A33);
                } else {
                    bitmap2 = null;
                }
                r72.A0Y(ghW2.A08);
                ghW2.A00 = r72;
                do {
                    value2 = r3.getValue();
                    gn72 = (C53377Gn7) value2;
                    C53309Glv glv3 = gn72.A01;
                    if (glv3 != null) {
                        String str2 = r72.A3t;
                        String str3 = glv3.A05;
                        Reel reel3 = glv3.A03;
                        ImageUrl imageUrl = glv3.A02;
                        boolean z2 = glv3.A07;
                        int i = glv3.A00;
                        0qQ.A0B(str3, 0);
                        0qQ.A0B(reel3, 1);
                        glv = new C53309Glv(bitmap2, imageUrl, reel3, str3, str2, i, z2, true, true);
                    } else {
                        glv = null;
                    }
                } while (!r3.AIY(value2, C53377Gn7.A00((C59479JLd) null, gn72, glv, (AnonymousClass62P) null, 239, false, false)));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f8, code lost:
        if (r19 != null) goto L_0x0104;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.C53040GhW r41, java.lang.String r42) {
        /*
            r3 = r41
            X.05G r7 = r3.A0E
        L_0x0004:
            java.lang.Object r2 = r7.getValue()
            r1 = r2
            X.Gn7 r1 = (X.C53377Gn7) r1
            X.6wn r0 = r3.A09
            X.0xa r5 = r0.A00
            java.lang.String r4 = "my_week_enabled"
            r0 = 0
            boolean r40 = r5.getBoolean(r4, r0)
            X.Glv r4 = r1.A01
            r30 = 0
            r13 = r42
            if (r4 == 0) goto L_0x004a
            java.lang.String r12 = r4.A05
            boolean r37 = X.0qQ.A0K(r12, r13)
            com.instagram.model.reels.Reel r11 = r4.A03
            com.instagram.common.typedurl.ImageUrl r10 = r4.A02
            boolean r9 = r4.A08
            android.graphics.Bitmap r8 = r4.A01
            java.lang.String r6 = r4.A04
            boolean r5 = r4.A06
            int r4 = r4.A00
            X.AnonymousClass7TF.A1H(r12, r11)
            X.Glv r30 = new X.Glv
            r31 = r8
            r32 = r10
            r33 = r11
            r34 = r12
            r35 = r6
            r36 = r4
            r38 = r9
            r39 = r5
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39)
        L_0x004a:
            java.util.List r4 = r3.A01
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r9 = r4.iterator()
        L_0x0054:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L_0x0071
            java.lang.Object r6 = r9.next()
            r4 = r6
            com.instagram.model.reels.Reel r4 = (com.instagram.model.reels.Reel) r4
            com.instagram.user.model.User r4 = r4.A0D()
            java.lang.String r5 = X.C51968G9o.A15(r4)
            com.instagram.common.session.UserSession r4 = r3.A07
            java.lang.String r4 = r4.A06
            X.DbY.A1T(r5, r4, r6, r8)
            goto L_0x0054
        L_0x0071:
            java.util.ArrayList r6 = X.AnonymousClass7TG.A0r(r8)
            r27 = 0
            java.util.Iterator r17 = r8.iterator()
        L_0x007b:
            boolean r4 = r17.hasNext()
            if (r4 == 0) goto L_0x0184
            java.lang.Object r4 = r17.next()
            int r16 = r27 + 1
            if (r27 >= 0) goto L_0x0091
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0091:
            com.instagram.model.reels.Reel r4 = (com.instagram.model.reels.Reel) r4
            java.lang.String r12 = r3.A0H
            java.lang.String r22 = r4.getId()
            X.0qQ.A07(r22)
            com.instagram.common.session.UserSession r9 = r3.A07
            X.2O0 r5 = X.2O0.A00(r9)
            java.lang.String r11 = r5.A03(r4)
            X.0qQ.A07(r11)
            java.lang.String r5 = r4.getId()
            X.0qQ.A07(r5)
            com.instagram.model.reels.Reel r5 = X.Dba.A0L(r9, r5)
            r15 = 0
            if (r5 == 0) goto L_0x00fa
            java.util.List r5 = r5.A0O(r9)
            if (r5 == 0) goto L_0x00fa
            java.util.Iterator r14 = r5.iterator()
        L_0x00c1:
            boolean r5 = r14.hasNext()
            if (r5 == 0) goto L_0x0181
            java.lang.Object r10 = r14.next()
            r5 = r10
            X.3uh r5 = (X.C255773uh) r5
            X.1Xj r5 = r5.A0b
            if (r5 == 0) goto L_0x017e
            java.lang.String r8 = r5.getId()
            if (r8 == 0) goto L_0x017e
            java.lang.String r5 = "_"
            java.util.List r5 = X.DbV.A18(r8, r5)
            if (r5 == 0) goto L_0x017e
            java.lang.Object r5 = r5.get(r0)
        L_0x00e4:
            boolean r5 = X.0qQ.A0K(r5, r11)
            if (r5 == 0) goto L_0x00c1
        L_0x00ea:
            X.3uh r10 = (X.C255773uh) r10
            if (r10 == 0) goto L_0x00fa
            X.1Xj r8 = r10.A0b
            if (r8 == 0) goto L_0x00fa
            int r5 = r3.A04
            com.instagram.model.mediasize.ExtendedImageUrl r19 = r8.A1m(r5)
            if (r19 != 0) goto L_0x0104
        L_0x00fa:
            com.instagram.common.typedurl.SimpleImageUrl r19 = r4.A08()
            if (r19 != 0) goto L_0x0104
            com.instagram.common.typedurl.ImageUrl r19 = r4.A07()
        L_0x0104:
            X.2O0 r5 = X.2O0.A00(r9)
            int r26 = r5.A01(r4)
            java.util.List r8 = r4.A16
            if (r8 != 0) goto L_0x0114
            java.util.List r8 = java.util.Collections.emptyList()
        L_0x0114:
            X.0qQ.A07(r8)
            boolean r5 = r8 instanceof java.util.Collection
            if (r5 == 0) goto L_0x0161
            boolean r5 = r8.isEmpty()
            if (r5 == 0) goto L_0x0161
        L_0x0121:
            r28 = 0
        L_0x0123:
            com.instagram.user.model.User r5 = r4.A0D()
            r20 = 0
            if (r5 == 0) goto L_0x015e
            java.lang.String r23 = r5.getId()
        L_0x012f:
            X.1Ns r5 = r4.A0W
            if (r5 != 0) goto L_0x0159
            r24 = 0
        L_0x0135:
            com.instagram.user.model.User r5 = r4.A0D()
            if (r5 == 0) goto L_0x013f
            com.instagram.common.typedurl.ImageUrl r20 = r5.Bh3()
        L_0x013f:
            java.lang.String r5 = r4.getId()
            boolean r29 = X.0qQ.A0K(r13, r5)
            X.Gm3 r5 = new X.Gm3
            r21 = r4
            r25 = r12
            r18 = r5
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r6.add(r5)
            r27 = r16
            goto L_0x007b
        L_0x0159:
            java.lang.String r24 = r5.getName()
            goto L_0x0135
        L_0x015e:
            r23 = r20
            goto L_0x012f
        L_0x0161:
            java.util.Iterator r10 = r8.iterator()
        L_0x0165:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L_0x0121
            java.lang.String r8 = X.AnonymousClass7TE.A18(r10)
            X.2O0 r5 = X.2O0.A00(r9)
            boolean r5 = r5.A07(r4, r8)
            r5 = r5 ^ 1
            if (r5 == 0) goto L_0x0165
            r28 = 1
            goto L_0x0123
        L_0x017e:
            r5 = r15
            goto L_0x00e4
        L_0x0181:
            r10 = r15
            goto L_0x00ea
        L_0x0184:
            X.62P r9 = X.AnonymousClass62Q.A00(r6)
            boolean r8 = r1.A04
            boolean r6 = r1.A05
            boolean r5 = r1.A07
            X.62P r4 = r1.A02
            X.JLd r1 = r1.A00
            X.C51974G9v.A1N(r9, r4, r1)
            X.Gn7 r0 = new X.Gn7
            r33 = r0
            r34 = r1
            r35 = r30
            r36 = r9
            r37 = r4
            r38 = r8
            r39 = r6
            r41 = r5
            r33.<init>(r34, r35, r36, r37, r38, r39, r40, r41)
            boolean r0 = r7.AIY(r2, r0)
            if (r0 == 0) goto L_0x0004
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53040GhW.A03(X.GhW, java.lang.String):void");
    }

    public static final void A04(C53040GhW ghW, boolean z) {
        if (!z || ((C53377Gn7) ghW.A0E.getValue()).A01 == null) {
            A02(ghW, A00(ghW));
            if (!z) {
                return;
            }
        }
        AnonymousClass3PP A002 = AnonymousClass3PO.A00(ghW.A07);
        String str = ghW.A0B;
        A002.A00(AnonymousClass3BU.FOREGROUND_PREFETCH, new C57302IWl(ghW, 0), str, "reel_highlights_updates_hub", 0Yt.A07(DbW.A1b(C273654mx.A00(289), RealtimeSubscription.GRAPHQL_MQTT_VERSION)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006c, code lost:
        if (X.0qQ.A0K(r8, r6) == false) goto L_0x006e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(java.lang.String r19) {
        /*
            r18 = this;
            r4 = r18
            java.lang.String r0 = r4.A03
            r3 = r19
            if (r0 == 0) goto L_0x000b
            if (r19 == 0) goto L_0x000b
            return
        L_0x000b:
            r10 = 0
            if (r19 == 0) goto L_0x00a7
            java.util.Map r0 = r4.A02
            java.util.Iterator r2 = X.AnonymousClass7TF.A0v(r0)
        L_0x0014:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00a5
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.34S r0 = (X.AnonymousClass34S) r0
            java.lang.Object r0 = r0.A01
            com.instagram.model.reels.Reel r0 = (com.instagram.model.reels.Reel) r0
            java.lang.String r0 = r0.getId()
            boolean r0 = X.0qQ.A0K(r0, r3)
            if (r0 == 0) goto L_0x0014
        L_0x002f:
            X.34S r1 = (X.AnonymousClass34S) r1
            if (r1 == 0) goto L_0x00a7
            java.lang.Object r2 = r1.A00
            X.Jun r2 = (X.C60991Jun) r2
        L_0x0037:
            X.05G r1 = r4.A0E
        L_0x0039:
            java.lang.Object r5 = r1.getValue()
            r0 = r5
            X.Gn7 r0 = (X.C53377Gn7) r0
            X.62P r6 = r0.A02
            java.util.ArrayList r7 = X.AnonymousClass7TG.A0r(r6)
            java.util.Iterator r9 = r6.iterator()
        L_0x004a:
            boolean r6 = r9.hasNext()
            if (r6 == 0) goto L_0x0088
            java.lang.Object r11 = r9.next()
            X.JLc r11 = (X.C59478JLc) r11
            boolean r6 = r11 instanceof X.C54085Gz9
            if (r6 == 0) goto L_0x0082
            X.Gz9 r11 = (X.C54085Gz9) r11
            X.Jun r12 = r11.A01
            if (r12 == 0) goto L_0x006e
            java.lang.String r8 = r12.A04
            if (r2 == 0) goto L_0x0086
            java.lang.String r6 = r2.A04
        L_0x0066:
            boolean r6 = X.0qQ.A0K(r8, r6)
            r16 = 1
            if (r6 != 0) goto L_0x0070
        L_0x006e:
            r16 = 0
        L_0x0070:
            int r15 = r11.A00
            java.lang.String r13 = r11.A03
            java.lang.String r14 = r11.A02
            boolean r6 = r11.A05
            X.AnonymousClass7TG.A1O(r13, r14)
            X.Gz9 r11 = new X.Gz9
            r17 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17)
        L_0x0082:
            r7.add(r11)
            goto L_0x004a
        L_0x0086:
            r6 = r10
            goto L_0x0066
        L_0x0088:
            X.62P r14 = X.AnonymousClass62Q.A00(r7)
            r16 = 0
            r11 = 0
            r15 = 191(0xbf, float:2.68E-43)
            r13 = r11
            r17 = r16
            r12 = r0
            X.Gn7 r0 = X.C53377Gn7.A00(r11, r12, r13, r14, r15, r16, r17)
            boolean r0 = r1.AIY(r5, r0)
            if (r0 == 0) goto L_0x0039
            A03(r4, r3)
            r4.A03 = r3
            return
        L_0x00a5:
            r1 = r10
            goto L_0x002f
        L_0x00a7:
            r2 = r10
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53040GhW.A05(java.lang.String):void");
    }

    public final void onCleared() {
        AnonymousClass3Q2 r1 = this.A00;
        if (r1 != null) {
            r1.A0Z(this.A08);
        }
        this.A00 = null;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.6wo, java.lang.Object] */
    public C53040GhW(C54428HDa hDa, AnonymousClass0iw r13, UserSession userSession, String str, int i) {
        C59479JLd jLd;
        boolean A1Y = DbW.A1Y(r13);
        0qQ.A0B(str, 3);
        this.A07 = userSession;
        this.A0G = r13;
        this.A0H = str;
        this.A06 = hDa;
        this.A04 = i;
        this.A05 = C323036wp.A00(new Object(), userSession);
        C323016wn A002 = C323006wm.A00(userSession);
        this.A09 = A002;
        this.A02 = 0Yt.A0E();
        0sn r1 = 0sn.A00;
        this.A01 = r1;
        this.A08 = new C65527Luq(this, 0);
        0xa r2 = A002.A00;
        if (r2.getBoolean(C273654mx.A00(388), false) || r2.getBoolean("my_week_enabled", false)) {
            jLd = ILI.A00;
        } else {
            jLd = ILK.A00;
        }
        boolean z = r2.getBoolean("my_week_enabled", false);
        02z A10 = DbS.A10(new C53377Gn7(jLd, (C53309Glv) null, AnonymousClass62M.A01, A01(this, r1), A1Y, false, z, false));
        this.A0E = A10;
        this.A0F = 10b.A03(A10);
        this.A0C = DbS.A0y();
        this.A0A = 1OP.A02(r13, userSession, (String) null);
        this.A0B = 002.A0R("myWeek:", AnonymousClass7TF.A0Q(userSession).getId());
        A06(A1Y);
        AnonymousClass11O.A03(C318116oQ.A00(this), new C58028IkL(0, this, hDa.A03));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: X.Gz8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: X.Gz9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v2, resolved type: X.Gz9} */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00b8, code lost:
        r2 = null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass62P A01(X.C53040GhW r26, java.util.List r27) {
        /*
            java.util.Calendar r10 = java.util.Calendar.getInstance()
            int r9 = r10.getFirstDayOfWeek()
            r8 = 7
            int r7 = r10.getActualMaximum(r8)
            int r9 = r9 + r7
            int r1 = r10.get(r8)
            r6 = 1
            X.ILH r0 = X.ILH.A00
            r25 = 0
            X.JLc[] r0 = new X.C59478JLc[]{r0}
            java.util.ArrayList r19 = X.0sr.A1M(r0)
            java.util.ArrayList r18 = X.AnonymousClass7TE.A1C()
            int r9 = r9 - r1
            int r9 = r9 % r7
            int r0 = -r7
            r5 = 5
            r10.add(r5, r0)
            r11 = r26
            com.instagram.common.session.UserSession r0 = r11.A07
            com.instagram.reels.store.ReelStore r4 = com.instagram.reels.store.ReelStore.A03(r0)
            X.0qQ.A07(r4)
            com.instagram.user.model.User r3 = X.DbT.A0j(r0)
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            r1 = 0
            r0 = r27
            java.util.LinkedHashMap r0 = X.LHI.A00(r4, r3, r2, r1, r0)
            r11.A02 = r0
            int r9 = r9 + r7
            if (r9 < 0) goto L_0x0101
            r4 = 0
            r3 = 0
        L_0x0049:
            int r15 = r10.get(r5)
            java.text.DateFormatSymbols r0 = java.text.DateFormatSymbols.getInstance()
            java.lang.String[] r1 = r0.getShortWeekdays()
            int r0 = r10.get(r8)
            r13 = r1[r0]
            java.util.Calendar r11 = java.util.Calendar.getInstance()
        L_0x005f:
            int r0 = r27.size()
            if (r4 >= r0) goto L_0x00b8
            r0 = r27
            java.lang.Object r2 = r0.get(r4)
            X.Jun r2 = (X.C60991Jun) r2
            X.0qQ.A0A(r11)
            java.lang.String r0 = "UTC"
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)
            java.util.Calendar r12 = java.util.Calendar.getInstance(r0)
            long r0 = r2.A01
            r16 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r16
            java.util.Date r14 = new java.util.Date
            r14.<init>(r0)
            r12.setTime(r14)
            int r21 = r12.get(r6)
            r0 = 2
            int r22 = r12.get(r0)
            int r23 = r12.get(r5)
            r11.clear()
            r20 = r11
            r24 = r25
            r20.set(r21, r22, r23, r24, r25)
            int r1 = r10.get(r5)
            int r0 = r11.get(r5)
            if (r1 == r0) goto L_0x00b9
            long r16 = r11.getTimeInMillis()
            long r1 = r10.getTimeInMillis()
            int r0 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00b8
            int r4 = r4 + 1
            goto L_0x005f
        L_0x00b8:
            r2 = 0
        L_0x00b9:
            r1 = 2
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r10.getDisplayName(r8, r1, r0)
            if (r0 != 0) goto L_0x00c5
            r0 = r13
        L_0x00c5:
            if (r3 > r7) goto L_0x00f5
            X.0qQ.A0A(r13)
            boolean r26 = X.AnonymousClass7TF.A1S(r3, r7)
            X.0qQ.A0A(r0)
            X.Gz9 r1 = new X.Gz9
            r20 = r1
            r21 = r2
            r22 = r13
            r23 = r0
            r24 = r15
            r20.<init>(r21, r22, r23, r24, r25, r26)
        L_0x00e0:
            r0 = r19
            r0.add(r1)
            if (r2 == 0) goto L_0x00ec
            r0 = r18
            r0.add(r2)
        L_0x00ec:
            r10.add(r5, r6)
            if (r3 == r9) goto L_0x0101
            int r3 = r3 + 1
            goto L_0x0049
        L_0x00f5:
            X.0qQ.A0A(r13)
            X.0qQ.A0A(r0)
            X.Gz8 r1 = new X.Gz8
            r1.<init>(r15, r13, r0)
            goto L_0x00e0
        L_0x0101:
            X.62P r0 = X.AnonymousClass62Q.A00(r19)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53040GhW.A01(X.GhW, java.util.List):X.62P");
    }

    public final void A06(boolean z) {
        Object value;
        A04(this, z);
        if (z) {
            05G r2 = this.A0E;
            do {
                value = r2.getValue();
            } while (!r2.AIY(value, C53377Gn7.A00((C59479JLd) null, (C53377Gn7) value, (C53309Glv) null, (AnonymousClass62P) null, 254, true, false)));
            C54428HDa hDa = this.A06;
            C262224Cq r22 = hDa.A01;
            JV6 jv6 = new JV6((Object) hDa, (AnonymousClass4D7) null, 2, false);
            19B r3 = 19B.A00;
            1Eo.A05(r3, new MFS(this, (AnonymousClass4D7) null, 9), C51967G9n.A0M(this, r3, jv6, r22));
            return;
        }
        A03(this, (String) null);
    }
}
