package X;

import android.content.Context;
import android.media.AudioManager;
import android.view.View;
import com.instagram.android.R;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsWatchAndBrowseData;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.GBn  reason: case insensitive filesystem */
public final class C52016GBn implements JQX, AudioManager.OnAudioFocusChangeListener {
    public AnonymousClass07Z A00;
    public C56036Hrj A01;
    public I4M A02;
    public String A03;
    public C62320sa A04;
    public C62320sa A05;
    public boolean A06;
    public boolean A07;
    public final AudioManager A08;
    public final 1vq A09;
    public final ClipsViewerConfig A0A;
    public final JRO A0B;
    public final AnonymousClass0iw A0C;
    public final AnonymousClass4DM A0D;
    public final UserSession A0E;
    public final AnonymousClass0qK A0F;
    public final 1Av A0G;
    public final GI0 A0H;
    public final Set A0I = DbS.A0y();
    public final Set A0J = DbS.A0y();
    public final AtomicReference A0K;
    public final AnonymousClass0eM A0L = AnonymousClass0eN.A01(C52173GHp.A00);
    public final boolean A0M;
    public final boolean A0N;
    public final Context A0O;
    public final AnonymousClass4O0 A0P;
    public final JU5 A0Q;
    public final C52009GBg A0R;
    public final C62320sa A0S;
    public final C62320sa A0T;
    public final C62320sa A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;

    public C52016GBn(Context context, AudioManager audioManager, AnonymousClass4O0 r6, ClipsViewerConfig clipsViewerConfig, JRO jro, AnonymousClass0iw r9, UserSession userSession, JU5 ju5, C52009GBg gBg, C62320sa r13, C62320sa r14, C62320sa r15, boolean z, boolean z2, boolean z3, boolean z4) {
        C51969G9p.A1Q(audioManager, 6, ju5);
        this.A0O = context;
        this.A0A = clipsViewerConfig;
        this.A0E = userSession;
        this.A0S = r13;
        this.A0P = r6;
        this.A08 = audioManager;
        this.A0R = gBg;
        this.A0B = jro;
        this.A0T = r14;
        this.A0N = z;
        this.A0W = z2;
        this.A0V = z3;
        this.A0U = r15;
        this.A0Q = ju5;
        this.A0C = r9;
        this.A0H = new GI0(z4);
        this.A09 = new 1vq(audioManager, userSession);
        0Tu r2 = 0Tu.A05;
        this.A0X = 182.A06(r2, userSession, 36323552034761986L);
        this.A0K = new AtomicReference((Object) null);
        this.A0M = 182.A06(r2, userSession, 36323552034958597L);
        this.A0D = new IOD(this, 2);
        this.A0G = 1Au.A00(userSession);
        IP4 ip4 = new IP4(this, 2);
        C62670v5.A0B.A03(ip4);
        this.A0F = ip4;
    }

    private final void A05(C267324bN r10, C52078GDy gDy, int i, boolean z) {
        C267324bN r3 = r10;
        C52058GDe A012 = C52019GBq.A01(r10, this);
        int i2 = i;
        boolean z2 = z;
        if (A012.A0J == null && !A012.A0Y) {
            A07(r3, gDy, "start", i2, false, z2);
        } else if (z) {
            for (JRJ Dyc : this.A0J) {
                Dyc.Dyc(i, "currentItemStateIsPausedByUser");
            }
        }
    }

    public final void A0D() {
        C52078GDy A022;
        C267324bN A002;
        if (A01(this).A00.isResumed() && GD6.A00(A01(this).A01.A0N().A09) != 0 && (A022 = C52019GBq.A02(this)) != null && (A002 = A00(this)) != null) {
            if (C52019GBq.A01(A002, this).A0J != null) {
                A06(A002, A022, C52019GBq.A00(this), true, false);
            } else {
                A0R("resume", false);
            }
        }
    }

    public final void A0H(C267324bN r3, int i) {
        C52078GDy A052;
        if (i != -1 && (A052 = A01(this).A05(i)) != null) {
            this.A03 = r3.getId();
            A05(r3, A052, i, true);
            A03(i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b1, code lost:
        if (r0.A0n != null) goto L_0x00b3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0N(X.C267324bN r8, java.lang.String r9, boolean r10, boolean r11) {
        /*
            r7 = this;
            r4 = 0
            X.GDy r1 = X.C52019GBq.A02(r7)
            if (r1 == 0) goto L_0x0111
            X.JRN r2 = A02(r7, r1)
            if (r2 != 0) goto L_0x00d5
            r6 = 0
        L_0x000e:
            java.lang.String r0 = "percent_visibility"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x001a
            X.4bN r8 = A00(r7)
        L_0x001a:
            if (r8 == 0) goto L_0x0111
            r3 = 1
            if (r10 == 0) goto L_0x00bd
            r4 = 0
            if (r11 == 0) goto L_0x00a1
            com.instagram.common.session.UserSession r5 = r7.A0E
            boolean r0 = X.1KU.A07(r5)
            if (r0 == 0) goto L_0x009d
            if (r6 != 0) goto L_0x0050
            boolean r0 = r8.CcK()
            if (r0 == 0) goto L_0x004a
            X.3OA r0 = r8.A06()
            boolean r0 = r0.A06()
            if (r0 == 0) goto L_0x004a
            X.3OA r0 = r8.A06()
            X.3y4 r0 = r0.A0I
            if (r0 == 0) goto L_0x004a
            X.XB5 r0 = r0.BUi()
            if (r0 != 0) goto L_0x0050
        L_0x004a:
            boolean r0 = r8.A0E()
            if (r0 == 0) goto L_0x0068
        L_0x0050:
            X.C52078GDy.A01(r1, r3, r3)
            X.0Tu r2 = X.0Tu.A06
            r0 = 36321254227780816(0x8109fd000b24d0, double:3.033045655375649E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x00b3
            X.JRO r0 = r7.A0B
            r0.Ear(r8, r4)
            r0.EaS(r8, r3)
        L_0x0068:
            com.instagram.common.session.UserSession r4 = r7.A0E
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320674406474511(0x8109760000230f, double:3.0326789740467886E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            java.lang.String r3 = "fragment_paused"
            if (r0 == 0) goto L_0x00e6
            boolean r0 = r9.equals(r3)
            if (r0 == 0) goto L_0x00e6
            java.util.Set r0 = r7.A0I
            java.util.Iterator r2 = r0.iterator()
        L_0x0085:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00e6
            java.lang.Object r1 = r2.next()
            X.JRF r1 = (X.JRF) r1
            X.GBq r0 = A01(r7)
            int r0 = r0.A03()
            r1.Dxg(r8, r0)
            goto L_0x0085
        L_0x009d:
            X.C52078GDy.A01(r1, r3, r3)
            goto L_0x00b3
        L_0x00a1:
            boolean r0 = r8.A0J()
            if (r0 == 0) goto L_0x0068
            X.GDe r0 = X.C52019GBq.A01(r8, r7)
            X.3W1 r0 = r0.A0E
            if (r0 == 0) goto L_0x0068
            X.GJF r0 = r0.A0n
            if (r0 == 0) goto L_0x0068
        L_0x00b3:
            X.JRO r1 = r7.A0B
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r1.Ear(r8, r0)
            goto L_0x0068
        L_0x00bd:
            X.JRO r1 = r7.A0B
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r1.Eap(r8, r0)
            r1.EaS(r8, r4)
            java.lang.String r0 = "stop_reason_sticker_tap"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0068
            r1.EaW(r8, r3)
            goto L_0x0068
        L_0x00d5:
            X.Hrj r0 = r7.A01
            if (r0 == 0) goto L_0x00e0
            X.2xy r0 = r0.A00
            if (r0 == 0) goto L_0x00e0
            r0.pause()
        L_0x00e0:
            int r6 = r2.E20(r9)
            goto L_0x000e
        L_0x00e6:
            boolean r0 = X.1KU.A07(r4)
            if (r0 == 0) goto L_0x00f3
            boolean r0 = r9.equals(r3)
            if (r0 == 0) goto L_0x00f3
            return
        L_0x00f3:
            java.util.Set r0 = r7.A0I
            java.util.Iterator r2 = r0.iterator()
        L_0x00f9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0111
            java.lang.Object r1 = r2.next()
            X.JRF r1 = (X.JRF) r1
            X.GBq r0 = A01(r7)
            int r0 = r0.A03()
            r1.Dxi(r8, r0)
            goto L_0x00f9
        L_0x0111:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52016GBn.A0N(X.4bN, java.lang.String, boolean, boolean):void");
    }

    public final void A0R(String str, boolean z) {
        C267324bN A002;
        C52078GDy A022 = C52019GBq.A02(this);
        if (A022 != null && (A002 = A00(this)) != null) {
            A07(A002, A022, str, C52019GBq.A00(this), z, false);
        }
    }

    public final boolean A0X(C267324bN r3) {
        0qQ.A0B(r3, 0);
        if (A0V() && r3.A0V && (r3.A01 != C295365o2.AD_PREVIEW || this.A0A.A0Q == null)) {
            if (AnonymousClass3ZJ.A0D(this.A0E, r3.A02)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final synchronized void A94(JRF jrf) {
        0qQ.A0B(jrf, 0);
        this.A0I.add(jrf);
    }

    public final C263754Nf Auf() {
        JRN jrn;
        try {
            C52019GBq A012 = A01(this);
            C52078GDy A052 = A012.A05(A012.A03());
            if (A052 == null || (jrn = (JRN) this.A0H.A01.get(A052)) == null) {
                return null;
            }
            return jrn.CEB();
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public final synchronized void EDu(JRF jrf) {
        0qQ.A0B(jrf, 0);
        this.A0I.remove(jrf);
    }

    public static final C267324bN A00(C52016GBn gBn) {
        C267324bN r2;
        C295365o2 r1;
        boolean z = gBn.A0V;
        C52019GBq A012 = A01(gBn);
        if (!z) {
            return A012.A03.A02();
        }
        C52078GDy A052 = A012.A05(A012.A03());
        if (A052 != null) {
            r2 = A052.A00;
            if (r2 != null) {
                r1 = r2.A01;
            }
            r1 = null;
        } else {
            r2 = null;
            r1 = null;
        }
        if (r1 != C295365o2.GHOST) {
            return r2;
        }
        return null;
    }

    public static final C52019GBq A01(C52016GBn gBn) {
        Object obj = new WeakReference(gBn.A0S.invoke()).get();
        if (obj != null) {
            return (C52019GBq) obj;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static JRN A02(C52016GBn gBn, Object obj) {
        return (JRN) gBn.A0H.A01.get(obj);
    }

    private final void A03(int i) {
        String str;
        int i2 = i - 1;
        int i3 = i + 1;
        LinkedHashSet A0y = DbS.A0y();
        if (i2 <= i3) {
            while (true) {
                if (i2 != i) {
                    C52078GDy A052 = A01(this).A05(i2);
                    if (A052 != null) {
                        C267324bN A032 = A01(this).A03.A03(i2);
                        C267324bN r2 = A052.A00;
                        String str2 = null;
                        if (A032 != null) {
                            str = A032.getId();
                        } else {
                            str = null;
                        }
                        if (r2 != null) {
                            str2 = r2.getId();
                        }
                        if (0qQ.A0K(str, str2) && A032 != null) {
                            A06(A032, A052, i2, true, false);
                            A0y.add(A032.getId());
                        }
                    }
                }
                if (i2 != i3) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    private final void A04(int i) {
        int i2;
        C267324bN Atp;
        Collection values = this.A0H.A01.values();
        ArrayList<JRN> A1C = AnonymousClass7TE.A1C();
        00k.A0r(values, A1C);
        for (JRN jrn : A1C) {
            C263754Nf CEB = jrn.CEB();
            if (CEB != null) {
                i2 = CEB.A01;
            } else {
                i2 = Integer.MAX_VALUE;
            }
            if (Math.abs(i - i2) > 1 && (Atp = jrn.Atp()) != null) {
                A0A(Atp.getId());
            }
        }
    }

    /* JADX WARNING: type inference failed for: r9v3, types: [X.GaZ] */
    /* JADX WARNING: type inference failed for: r9v6, types: [X.HKg] */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00bc, code lost:
        if (r6 > 0) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c2, code lost:
        if (r5 != null) goto L_0x00c4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A06(X.C267324bN r23, X.C52078GDy r24, int r25, boolean r26, boolean r27) {
        /*
            r22 = this;
            r3 = r22
            java.util.Set r4 = r3.A0J
            java.util.Iterator r1 = r4.iterator()
        L_0x0008:
            boolean r0 = r1.hasNext()
            r15 = r25
            if (r0 == 0) goto L_0x001a
            java.lang.Object r0 = r1.next()
            X.JRJ r0 = (X.JRJ) r0
            r0.Dxr(r15)
            goto L_0x0008
        L_0x001a:
            if (r26 != 0) goto L_0x002e
            boolean r0 = r3.A0N
            if (r0 == 0) goto L_0x002e
            X.0sa r0 = r3.A04
            if (r0 == 0) goto L_0x0027
            r0.invoke()
        L_0x0027:
            X.0sa r0 = r3.A05
            if (r0 == 0) goto L_0x002e
            r0.invoke()
        L_0x002e:
            X.GI0 r2 = r3.A0H
            r11 = r23
            r13 = r24
            X.JRN r0 = r2.A00(r11, r13)
            if (r0 == 0) goto L_0x0040
            boolean r0 = r0.Cqv(r11, r13)
            if (r0 == 0) goto L_0x0155
        L_0x0040:
            boolean r0 = r3.A0W
            if (r0 == 0) goto L_0x0050
            boolean r0 = r13.A07
            if (r0 != 0) goto L_0x0050
            boolean r0 = r13.A06
            if (r0 != 0) goto L_0x0050
            X.JRK r0 = r13.A04
            if (r0 == 0) goto L_0x0155
        L_0x0050:
            X.JRN r9 = r2.A00(r11, r13)
            if (r9 != 0) goto L_0x0087
            X.GBq r0 = A01(r3)
            X.4DH r8 = r0.A00
            com.instagram.common.session.UserSession r7 = r3.A0E
            X.4O0 r6 = r3.A0P
            X.0eM r0 = r3.A0L
            java.lang.Object r5 = r0.getValue()
            X.Hf6 r5 = (X.C55277Hf6) r5
            r0 = 4
            X.0qQ.A0B(r5, r0)
            java.lang.String r1 = r6.A09()
            if (r1 != 0) goto L_0x0074
            java.lang.String r1 = "Not set on client"
        L_0x0074:
            boolean r0 = r11.CcK()
            if (r0 == 0) goto L_0x00dc
            boolean r0 = X.C51968G9o.A1V(r11)
            if (r0 == 0) goto L_0x00dc
            X.HKg r9 = new X.HKg
            r9.<init>(r8, r7, r6, r1)
        L_0x0085:
            X.JRN r9 = (X.JRN) r9
        L_0x0087:
            r9.AHf()
            r9.A95(r3)
            boolean r0 = r3.A0X(r11)
            if (r0 == 0) goto L_0x00da
            r14 = 1065353216(0x3f800000, float:1.0)
            if (r26 == 0) goto L_0x009a
            r14 = 981668463(0x3a83126f, float:0.001)
        L_0x009a:
            X.GDe r12 = X.C52019GBq.A01(r11, r3)
            java.lang.Integer r5 = r12.A0J
            if (r5 != 0) goto L_0x00c4
            java.lang.Integer r5 = r12.A0I
            if (r5 != 0) goto L_0x00c4
            com.instagram.clips.intf.ClipsViewerConfig r1 = r3.A0A
            boolean r0 = r1.A1u
            if (r0 == 0) goto L_0x00d8
            int r6 = r1.A09
            com.instagram.common.session.UserSession r7 = r3.A0E
            X.0Tu r5 = X.0Tu.A05
            r0 = 36599671187312233(0x82073500040e69, double:3.2091176616784274E-306)
            int r0 = X.DbS.A04(r5, r7, r0)
            int r6 = r6 - r0
            if (r6 <= 0) goto L_0x00d8
        L_0x00be:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            if (r5 == 0) goto L_0x0156
        L_0x00c4:
            java.util.Iterator r1 = r4.iterator()
        L_0x00c8:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0104
            java.lang.Object r0 = r1.next()
            X.JRJ r0 = (X.JRJ) r0
            r0.Dxt(r15)
            goto L_0x00c8
        L_0x00d8:
            r6 = 0
            goto L_0x00be
        L_0x00da:
            r14 = 0
            goto L_0x009a
        L_0x00dc:
            boolean r0 = r11.CcK()
            if (r0 == 0) goto L_0x00f2
            X.3OA r0 = r11.A06()
            boolean r0 = r0.A08()
            if (r0 == 0) goto L_0x00f2
            X.GaZ r9 = new X.GaZ
            r9.<init>(r7, r1)
            goto L_0x0085
        L_0x00f2:
            X.GI2 r9 = new X.GI2
            r16 = r9
            r17 = r8
            r18 = r7
            r19 = r6
            r20 = r5
            r21 = r1
            r16.<init>(r17, r18, r19, r20, r21)
            goto L_0x0085
        L_0x0104:
            r17 = r26 ^ 1
            int r16 = r5.intValue()
            X.0sa r0 = r3.A0T
            java.lang.Object r10 = r0.invoke()
            X.2nI r10 = (X.C229382nI) r10
            r18 = 0
            boolean r7 = r9.E4I(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            java.util.Iterator r1 = r4.iterator()
        L_0x011c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x012c
            java.lang.Object r0 = r1.next()
            X.JRJ r0 = (X.JRJ) r0
            r0.Dxs(r15, r7)
            goto L_0x011c
        L_0x012c:
            com.instagram.common.session.UserSession r6 = r3.A0E
            X.0Tu r5 = X.0Tu.A05
            r0 = 36317444591129750(0x81068600011496, double:3.030636425817339E-306)
            boolean r0 = X.182.A06(r5, r6, r0)
            if (r0 == 0) goto L_0x0153
            if (r7 == 0) goto L_0x0155
            if (r17 == 0) goto L_0x0156
            java.util.Iterator r1 = r4.iterator()
        L_0x0143:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0156
            java.lang.Object r0 = r1.next()
            X.JRJ r0 = (X.JRJ) r0
            r0.DyP(r15)
            goto L_0x0143
        L_0x0153:
            if (r7 != 0) goto L_0x0156
        L_0x0155:
            return
        L_0x0156:
            com.instagram.clips.intf.ClipsViewerConfig r0 = r3.A0A
            com.instagram.music.common.model.AudioOverlayTrack r7 = r0.A0Q
            if (r7 == 0) goto L_0x017b
            com.instagram.music.common.model.MusicAssetModel r0 = r7.A08
            if (r0 == 0) goto L_0x017b
            com.instagram.music.common.model.MusicDataSource r6 = r0.A05
            if (r6 == 0) goto L_0x017b
            X.5o2 r1 = r11.A01
            X.5o2 r0 = X.C295365o2.AD_PREVIEW
            if (r1 != r0) goto L_0x017b
            X.Hrj r0 = r3.A01
            if (r0 != 0) goto L_0x017b
            android.content.Context r5 = r3.A0O
            com.instagram.common.session.UserSession r4 = r3.A0E
            int r1 = r7.A03
            X.Hrj r0 = new X.Hrj
            r0.<init>(r5, r4, r6, r1)
            r3.A01 = r0
        L_0x017b:
            java.lang.String r4 = r11.getId()
            if (r27 != 0) goto L_0x0185
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x01b2
        L_0x0185:
            java.util.Map r0 = r2.A00
            java.lang.Object r5 = r0.get(r4)
            X.JRN r5 = (X.JRN) r5
            if (r5 == 0) goto L_0x01b2
            boolean r0 = r5.equals(r9)
            if (r0 != 0) goto L_0x01b2
            X.0wj r3 = X.0wj.A01
            r1 = 817902720(0x30c03480, float:1.398476E-9)
            java.lang.String r0 = "CLIPS_ITEM_VIEW_HOLDER_MISMATCH"
            X.0f9 r1 = r3.AEf(r0, r1)
            java.lang.String r0 = "An old videoPlayer is associated with the same clipItem "
            java.lang.String r0 = X.002.A0R(r0, r4)
            X.C51969G9p.A1K(r1, r0)
            r0 = 338(0x152, float:4.74E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r5.ECP(r0)
        L_0x01b2:
            java.util.Map r0 = r2.A01
            r0.put(r13, r9)
            java.util.Map r0 = r2.A00
            r0.put(r4, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52016GBn.A06(X.4bN, X.GDy, int, boolean, boolean):void");
    }

    private final void A07(C267324bN r21, C52078GDy gDy, String str, int i, boolean z, boolean z2) {
        C234502xy r0;
        C234502xy r1;
        UserSession userSession = this.A0E;
        C52078GDy gDy2 = gDy;
        if (1KU.A07(userSession)) {
            C52078GDy.A01(gDy2, false, false);
        } else {
            IgImageView igImageView = gDy2.A02;
            if (igImageView != null) {
                C294975nL.A05(new View[]{igImageView}, true);
            }
        }
        if (!this.A06) {
            C267324bN r8 = r21;
            AnonymousClass3W1 r02 = C52019GBq.A01(r8, this).A0E;
            int i2 = i;
            boolean z3 = z2;
            if (r02 == null || r02.A10 != AnonymousClass05K.A01 || 182.A06(0Tu.A06, userSession, 36315563396107650L)) {
                if (z2) {
                    for (JRJ Dyd : this.A0J) {
                        Dyd.Dyd(i2);
                    }
                }
                A06(r8, gDy2, i2, false, z3);
                JRN A022 = A02(this, gDy2);
                if (A022 != null) {
                    C52058GDe A012 = C52019GBq.A01(r8, this);
                    if (r8.A02 != null && !C52146GGo.A00(r8, A012, userSession)) {
                        boolean z4 = this.A0X;
                        boolean A032 = C52076GDw.A03(r8);
                        boolean z5 = z;
                        if (!z4 ? !A032 : !(A032 || z)) {
                            int i3 = r8.A00;
                            if (i3 > 0) {
                                A022.EKy(i3, false);
                                C56036Hrj hrj = this.A01;
                                if (!(hrj == null || (r1 = hrj.A00) == null)) {
                                    r1.seekTo(hrj.A01 + i3);
                                }
                                this.A0R.A0Q(r8, 0);
                            }
                        }
                        C56036Hrj hrj2 = this.A01;
                        if (!(hrj2 == null || (r0 = hrj2.A00) == null)) {
                            r0.E2p();
                        }
                        A08(r8, A022, this, -5);
                        JRO jro = this.A0B;
                        jro.Ear(r8, (Integer) null);
                        jro.EaS(r8, false);
                        jro.EaW(r8, false);
                        boolean EJ0 = A022.EJ0(str, z5);
                        for (JRF jrf : this.A0I) {
                            if (!EJ0) {
                                C267324bN r15 = r8;
                                jrf.Dxl(r15, A01(this).A04(r8), A01(this), gDy2, this.A0A.A1u);
                                0Tu r3 = 0Tu.A05;
                                if (!182.A06(r3, userSession, 36317444591129750L) && !182.A06(r3, userSession, 36317444591064213L)) {
                                    for (JRJ DyP : this.A0J) {
                                        DyP.DyP(i2);
                                    }
                                }
                            }
                        }
                        0Tu r32 = 0Tu.A05;
                        if (!182.A06(r32, userSession, 36317444591129750L) && 182.A06(r32, userSession, 36317444591064213L)) {
                            for (JRJ DyP2 : this.A0J) {
                                DyP2.DyP(i2);
                            }
                        }
                        if (182.A06(r32, userSession, 36317444591129750L) && EJ0) {
                            for (JRJ DyP3 : this.A0J) {
                                DyP3.DyP(i2);
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            C52078GDy A052 = A01(this).A05(i2);
            if (A052 != null) {
                A06(r8, A052, i2, true, false);
            }
            A0N((C267324bN) null, "end_scene", false, true);
            if (z2) {
                for (JRJ Dyc : this.A0J) {
                    Dyc.Dyc(i2, "mediaStateEndSceneState_showing_or_start");
                }
            }
        }
    }

    private final void A0A(String str) {
        GI0 gi0 = this.A0H;
        JRN jrn = (JRN) gi0.A00.remove(str);
        Iterator A0u = AnonymousClass7TF.A0u(gi0.A01);
        while (A0u.hasNext()) {
            if (0qQ.A0K(((Map.Entry) A0u.next()).getValue(), jrn)) {
                A0u.remove();
            }
        }
        if (jrn != null) {
            jrn.ECP("out_of_playback_range");
            jrn.EDv(this);
        }
    }

    public final void A0C() {
        for (JRJ DyZ : this.A0J) {
            DyZ.DyZ(A01(this).A03());
        }
    }

    public final void A0I(C267324bN r2, int i) {
        if (this.A0N) {
            A04(C52019GBq.A00(this));
        } else if (r2 != null || (r2 = A01(this).A03.A03(i)) != null) {
            A0A(r2.getId());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0092, code lost:
        if (r2 < r15) goto L_0x0094;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0J(X.C267324bN r18, int r19) {
        /*
            r17 = this;
            r9 = r17
            X.Hrj r0 = r9.A01
            if (r0 == 0) goto L_0x0009
            r0.A01()
        L_0x0009:
            r10 = 0
            r12 = r19
            r8 = r18
            if (r19 == 0) goto L_0x0031
            X.71K r2 = X.GJ7.A00
            com.instagram.common.session.UserSession r7 = r9.A0E
            r6 = 1
            boolean r0 = r2.A0J(r8, r7, r10)
            if (r0 == 0) goto L_0x0031
            boolean r0 = r2.A0I(r8, r7)
            if (r0 != 0) goto L_0x0031
            X.GDe r0 = X.C52019GBq.A01(r8, r9)
            X.3W1 r1 = r0.A0E
            if (r1 == 0) goto L_0x005c
            boolean r0 = r1.A1q
            if (r0 == r6) goto L_0x0031
            boolean r0 = r1.A1p
            if (r0 != r6) goto L_0x005c
        L_0x0031:
            X.JU5 r2 = r9.A0Q
            X.4Cq r1 = r2.A0N
            r0 = 7
            X.C51971G9r.A1P(r2, r1, r0)
            X.JRO r0 = r9.A0B
            r0.CM6(r8)
            java.util.Set r0 = r9.A0I
            java.util.Iterator r2 = r0.iterator()
        L_0x0044:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00d2
            java.lang.Object r1 = r2.next()
            X.JRF r1 = (X.JRF) r1
            X.GBq r0 = A01(r9)
            int r0 = r0.A03()
            r1.DxZ(r8, r0, r12)
            goto L_0x0044
        L_0x005c:
            X.1Xj r0 = r8.A02
            if (r0 == 0) goto L_0x0031
            long r15 = r0.A1B()
            long r4 = r2.A0F(r8, r7)
            X.0Tu r11 = X.0Tu.A06
            r0 = 36315563396500871(0x8104d000110d87, double:3.0294467507590734E-306)
            boolean r0 = X.182.A06(r11, r7, r0)
            if (r0 == 0) goto L_0x007c
            r0 = 2
            long r0 = r0 * r15
            long r4 = java.lang.Math.max(r0, r4)
        L_0x007c:
            long r2 = (long) r12
            long r2 = r2 * r15
            X.0Tu r13 = X.0Tu.A05
            r0 = 36315563396369798(0x8104d0000f0d86, double:3.029446750676182E-306)
            boolean r0 = X.182.A06(r13, r7, r0)
            if (r0 == 0) goto L_0x00ca
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x0031
            long r15 = r15 + r4
        L_0x0090:
            int r0 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x0031
        L_0x0094:
            X.0sa r0 = r9.A0U
            java.lang.Object r2 = r0.invoke()
            X.GBm r2 = (X.C52015GBm) r2
            X.GBj r0 = r2.A02
            if (r0 == 0) goto L_0x0103
            X.4bN r1 = X.C52012GBj.A04(r0)
            if (r1 == 0) goto L_0x0103
            X.GD6 r0 = r2.A00
            X.GDe r0 = X.JSx.A00(r1, r0)
            if (r0 == 0) goto L_0x00b7
            X.3W1 r1 = r0.A0E
            if (r1 == 0) goto L_0x00b7
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r1.A0Z(r0)
        L_0x00b7:
            r0 = 36315563396107650(0x8104d0000b0d82, double:3.029446750510399E-306)
            boolean r0 = X.182.A06(r11, r7, r0)
            if (r0 != 0) goto L_0x0031
            r1 = 0
            java.lang.String r0 = "end_scene"
            r9.A0N(r1, r0, r10, r6)
            goto L_0x0031
        L_0x00ca:
            r13 = 0
            int r0 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x0094
            long r2 = r2 % r4
            goto L_0x0090
        L_0x00d2:
            X.I4M r2 = r9.A02
            if (r2 == 0) goto L_0x0102
            java.lang.String r1 = r8.getId()
            java.lang.String r0 = r2.A02
            boolean r0 = X.00l.A0d(r1, r0, r10)
            if (r0 == 0) goto L_0x0102
            boolean r0 = r2.A03
            if (r0 == 0) goto L_0x0102
            boolean r0 = r2.A09
            if (r0 == 0) goto L_0x0102
            r0 = 1
            r2.A06 = r0
            boolean r0 = r2.A07
            if (r0 == 0) goto L_0x0102
            X.3Oq r1 = r2.A00
            if (r1 == 0) goto L_0x0102
            com.instagram.user.model.User r0 = r1.CCd()
            boolean r0 = r0.A29()
            if (r0 != 0) goto L_0x0102
            X.I4M.A01(r1, r2)
        L_0x0102:
            return
        L_0x0103:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52016GBn.A0J(X.4bN, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004b, code lost:
        if (X.182.A06(X.0Tu.A06, r7, 36320541264192089L) == false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b0, code lost:
        if (r10.EOZ() != false) goto L_0x00bd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0M(X.C267324bN r21, X.JRN r22, boolean r23) {
        /*
            r20 = this;
            r18 = 0
            r3 = 1
            r2 = r20
            r12 = r21
            X.GDe r4 = X.C52019GBq.A01(r12, r2)
            java.util.Set r0 = r2.A0J
            java.util.Iterator r5 = r0.iterator()
        L_0x0011:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0027
            java.lang.Object r1 = r5.next()
            X.JRJ r1 = (X.JRJ) r1
            int r0 = r4.A09()
            r6 = r23
            r1.Dxk(r0, r6)
            goto L_0x0011
        L_0x0027:
            com.instagram.common.session.UserSession r7 = r2.A0E
            X.0Tu r5 = X.0Tu.A05
            r0 = 36323156897967015(0x810bb800062ba7, double:3.034248911662839E-306)
            boolean r0 = X.182.A06(r5, r7, r0)
            if (r0 == 0) goto L_0x0039
            r2.A0T(r3)
        L_0x0039:
            boolean r0 = r12.CcK()
            if (r0 == 0) goto L_0x004d
            X.0Tu r6 = X.0Tu.A06
            r0 = 36320541264192089(0x810957001a2259, double:3.032594774331264E-306)
            boolean r1 = X.182.A06(r6, r7, r0)
            r0 = 1
            if (r1 != 0) goto L_0x004e
        L_0x004d:
            r0 = 0
        L_0x004e:
            r11 = 0
            if (r0 == 0) goto L_0x00bd
            X.GDy r0 = X.C52019GBq.A02(r2)
            if (r0 == 0) goto L_0x00b2
            X.JRN r10 = A02(r2, r0)
            if (r10 == 0) goto L_0x0104
            boolean r9 = r10.CJa()
        L_0x0061:
            X.0iw r8 = r2.A0C
            java.util.concurrent.atomic.AtomicReference r0 = r2.A0K
            java.lang.Object r6 = r0.get()
            java.lang.Number r6 = (java.lang.Number) r6
            r0 = 36320541264192089(0x810957001a2259, double:3.032594774331264E-306)
            X.182.A06(r5, r7, r0)
            X.0wc r1 = X.AnonymousClass0kN.A01(r8, r7)
            java.lang.String r0 = "ig_reels_alternative_audio_track_usage"
            X.0Aj r5 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r5.isSampled()
            if (r0 == 0) goto L_0x00a8
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)
            java.lang.String r0 = "has_alternative_track"
            r5.A7p(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            java.lang.String r0 = "should_use_alternative_track"
            r5.A7p(r0, r1)
            if (r6 == 0) goto L_0x0102
            float r0 = r6.floatValue()
            double r0 = (double) r0
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
        L_0x00a0:
            java.lang.String r0 = "current_volume"
            r5.A8D(r0, r1)
            r5.Cgf()
        L_0x00a8:
            if (r9 == 0) goto L_0x00b2
            if (r10 == 0) goto L_0x00b2
            boolean r0 = r10.EOZ()
            if (r0 != 0) goto L_0x00bd
        L_0x00b2:
            X.0iw r0 = r2.A0C
            java.lang.String r1 = r0.getModuleName()
            java.lang.String r0 = "Setting alternative track unexpectedly failed"
            X.0kD.A07(r1, r0, r11)
        L_0x00bd:
            X.JU5 r13 = r2.A0Q
            X.0iw r0 = r2.A0C
            java.lang.String r14 = r0.getModuleName()
            int r16 = r4.A09()
            X.07Z r0 = r2.A00
            if (r0 == 0) goto L_0x00d1
            X.07V r11 = r0.getLifecycle()
        L_0x00d1:
            X.0qQ.A0B(r14, r3)
            X.4Cq r0 = r13.A0N
            r15 = 0
            X.MH6 r10 = new X.MH6
            r10.<init>((X.AnonymousClass07V) r11, (X.C267324bN) r12, (X.JU5) r13, (java.lang.String) r14, (X.AnonymousClass4D7) r15, (int) r16)
            X.AnonymousClass7TE.A1Z(r10, r0)
            X.GDy r1 = r22.CEb()
            if (r1 == 0) goto L_0x0101
            X.GDy r0 = X.C52019GBq.A02(r2)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0101
            java.lang.Integer r0 = r4.A0J
            if (r0 != 0) goto L_0x0101
            int r17 = X.C52019GBq.A00(r2)
            java.lang.String r16 = "start"
            r13 = r2
            r14 = r12
            r15 = r1
            r19 = r18
            r13.A07(r14, r15, r16, r17, r18, r19)
        L_0x0101:
            return
        L_0x0102:
            r1 = 0
            goto L_0x00a0
        L_0x0104:
            r9 = 0
            goto L_0x0061
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52016GBn.A0M(X.4bN, X.JRN, boolean):void");
    }

    public final void A0O(C52078GDy gDy) {
        int i;
        C234502xy r1;
        Map map = this.A0H.A01;
        Iterator A16 = DbV.A16(map);
        while (A16.hasNext()) {
            C52078GDy gDy2 = (C52078GDy) A16.next();
            if (!0qQ.A0K(gDy2, gDy)) {
                0qQ.A0B(gDy2, 0);
                JRN jrn = (JRN) map.get(gDy2);
                if (jrn != null) {
                    AnonymousClass3OB BdI = jrn.BdI();
                    if (BdI == AnonymousClass3OB.PLAYING || BdI == AnonymousClass3OB.STOPPING) {
                        jrn.E20("out_of_playback_range");
                    }
                    C267324bN Atp = jrn.Atp();
                    if (Atp != null) {
                        C52058GDe A042 = A01(this).A04(Atp);
                        AnonymousClass3W1 r0 = A042.A0E;
                        if (r0 == null || !r0.A0p()) {
                            i = -1;
                        } else {
                            i = A042.A09();
                        }
                        C52012GBj A0N2 = A01(this).A01.A0N();
                        if ((A0N2.A07() > i || i > A0N2.A09()) && !this.A0M) {
                            jrn.EL3();
                            C56036Hrj hrj = this.A01;
                            if (!(hrj == null || (r1 = hrj.A00) == null)) {
                                r1.seekTo(hrj.A01);
                            }
                        }
                        JRO jro = this.A0B;
                        jro.Ear(Atp, (Integer) null);
                        jro.EaS(Atp, false);
                    }
                    C52078GDy.A01(gDy2, false, false);
                }
            }
        }
    }

    public final void A0Q(String str) {
        for (JRJ DXk : this.A0J) {
            DXk.DXk(C52019GBq.A00(this), str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0026, code lost:
        if (X.182.A06(X.0Tu.A06, r1.A00, 36331089702699918L) == false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0V() {
        /*
            r6 = this;
            com.instagram.common.session.UserSession r5 = r6.A0E
            boolean r4 = r6.A07
            com.instagram.clips.intf.ClipsViewerConfig r0 = r6.A0A
            com.instagram.clips.intf.ClipsViewerSource r0 = r0.A0J
            int r1 = r0.ordinal()
            r0 = 84
            if (r1 != r0) goto L_0x0028
            X.1Pn r1 = X.1Pm.A00(r5)
            boolean r0 = X.1Pn.A02
            if (r0 == 0) goto L_0x0028
            com.instagram.common.session.UserSession r3 = r1.A00
            X.0Tu r2 = X.0Tu.A06
            r0 = 36331089702699918(0x8112ef0008438e, double:3.0392656493187676E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            r1 = r0 ^ 1
            r0 = 0
            boolean r0 = X.C255613uQ.A00(r5, r0, r4, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52016GBn.A0V():boolean");
    }

    public final boolean A0Y(String str) {
        JRN jrn = (JRN) this.A0H.A00.get(str);
        if (jrn != null) {
            return jrn.CeZ();
        }
        return false;
    }

    public static final void A08(C267324bN r0, JRN jrn, C52016GBn gBn, int i) {
        if (gBn.A0X(r0)) {
            gBn.A09(jrn, 1.0f, i);
            gBn.A09.A04(gBn);
            return;
        }
        gBn.A09(jrn, 0.0f, i);
        gBn.A09.A03(gBn);
    }

    private final void A09(JRN jrn, float f, int i) {
        boolean z;
        jrn.Eqr(f, i);
        C267324bN A002 = A00(this);
        if (A002 != null) {
            AnonymousClass3W1 r2 = C52019GBq.A01(A002, this).A0E;
            if (r2 != null) {
                C263754Nf Auf = Auf();
                if (Auf != null) {
                    z = Auf.A00;
                } else {
                    z = false;
                }
                if (r2.A1s != z) {
                    r2.A1s = z;
                    AnonymousClass3W1.A00(r2, 55);
                }
            }
            if (!0qQ.A0I((Float) this.A0K.getAndSet(Float.valueOf(f)), f) || i == -5) {
                UserSession userSession = this.A0E;
                if (1KU.A07(userSession) && 182.A06(0Tu.A05, userSession, 36321254227125448L)) {
                    11Z.A03(new C57793IgY(this));
                }
            }
        }
    }

    public final C376689Iy A0B() {
        JRN A022;
        C52078GDy A023 = C52019GBq.A02(this);
        if (A023 == null || (A022 = A02(this, A023)) == null) {
            return null;
        }
        return A022.Ato();
    }

    public final void A0E(int i) {
        C267324bN A002;
        C234502xy r1;
        C52078GDy A022 = C52019GBq.A02(this);
        if (A022 != null && (A002 = A00(this)) != null) {
            this.A0R.A0Q(A002, i);
            JRN A023 = A02(this, A022);
            if (A023 != null) {
                A023.EKy(i, true);
                C56036Hrj hrj = this.A01;
                if (!(hrj == null || (r1 = hrj.A00) == null)) {
                    r1.seekTo(hrj.A01 + i);
                }
                A0R("resume", true);
            }
        }
    }

    public final void A0F(int i) {
        JRN A022;
        C263754Nf CEB;
        Object obj;
        int i2;
        ClipsWatchAndBrowseData clipsWatchAndBrowseData;
        GJF gjf;
        C52078GDy A023 = C52019GBq.A02(this);
        if (A023 != null && (A022 = A02(this, A023)) != null && (CEB = A022.CEB()) != null && (obj = CEB.A03) != null) {
            C267324bN r1 = (C267324bN) obj;
            if (r1.A0V) {
                1Xj r0 = r1.A02;
                UserSession userSession = this.A0E;
                if (!AnonymousClass3ZJ.A0D(userSession, r0)) {
                    boolean z = !CEB.A00;
                    1GE.A00(userSession).A00(z);
                    CEB.A00 = z;
                    A08(r1, A022, this, i);
                    if (!1KU.A07(userSession)) {
                        C267324bN A002 = A00(this);
                        if (A002 != null && A002.A0J() && ((clipsWatchAndBrowseData = this.A0A.A0K) == null || !clipsWatchAndBrowseData.A0M)) {
                            AnonymousClass3W1 r02 = C52019GBq.A01(A002, this).A0E;
                            if (r02 != null) {
                                gjf = r02.A0n;
                            } else {
                                gjf = null;
                            }
                            if (gjf == GJF.COLLAPSED) {
                                if (clipsWatchAndBrowseData != null && !clipsWatchAndBrowseData.A0E) {
                                    return;
                                }
                            } else if (gjf == GJF.ANCHORED) {
                                return;
                            }
                        }
                        Context context = A023.A08.getContext();
                        if (z) {
                            i2 = R.drawable.instagram_volume_pano_filled_24;
                        } else {
                            i2 = R.drawable.instagram_volume_off_pano_filled_24;
                        }
                        C52078GDy.A00(context.getDrawable(i2), A023);
                        if (182.A06(0Tu.A05, userSession, 36322018731239315L)) {
                            0xY A0p = AnonymousClass7TE.A0p(this.A0G);
                            A0p.E5T("last_clips_volume_is_mute", !z);
                            A0p.apply();
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            C52078GDy.A00(A023.A08.getContext().getDrawable(R.drawable.instagram_volume_none_pano_filled_24), A023);
        }
    }

    public final void A0G(C267324bN r5) {
        C52058GDe A012 = C52019GBq.A01(r5, this);
        for (JRJ Dxj : this.A0J) {
            Dxj.Dxj(r5, A012.A09());
        }
    }

    public final void A0K(C267324bN r3, int i, int i2, boolean z) {
        AnonymousClass3W1 r0 = A01(this).A04(r3).A0E;
        if (r0 != null) {
            r0.A0C(i);
        }
        for (JRF DaS : this.A0I) {
            DaS.DaS(r3, i, i2, z);
        }
    }

    public final void A0L(C267324bN r4, C52058GDe gDe, JRN jrn) {
        C52078GDy CEb = jrn.CEb();
        if (CEb != null) {
            C52019GBq A012 = A01(this);
            if (CEb == A012.A05(A012.A03())) {
                C52146GGo.A00(r4, gDe, this.A0E);
            }
        }
    }

    public final void A0P(JRN jrn, boolean z) {
        C52078GDy CEb = jrn.CEb();
        if (CEb != null) {
            for (JRF DaP : this.A0I) {
                DaP.DaP(CEb, z);
            }
        }
    }

    public final void A0S(boolean z) {
        07U r1;
        07U r0;
        AnonymousClass07V lifecycle;
        AnonymousClass07V lifecycle2;
        int A002 = C52019GBq.A00(this);
        if (z) {
            for (JRJ Dyb : this.A0J) {
                Dyb.Dyb(A002);
            }
        }
        AnonymousClass07Z r02 = this.A00;
        if (r02 == null || (lifecycle2 = r02.getLifecycle()) == null) {
            r1 = null;
        } else {
            r1 = lifecycle2.A07();
        }
        if (r1 == 07U.A04) {
            C267324bN A003 = A00(this);
            C52078GDy A022 = C52019GBq.A02(this);
            A0O(A022);
            if (A022 != null) {
                if (A003 != null) {
                    A05(A003, A022, A002, z);
                }
                int A004 = C52019GBq.A00(this);
                if (this.A0N) {
                    A04(A004);
                }
                A03(A004);
                if (A003 != null) {
                    return;
                }
            }
            if (z) {
                for (JRJ Dyc : this.A0J) {
                    Dyc.Dyc(A002, "currentViewHolderOrClipItemIsNull");
                }
            }
        } else if (z) {
            for (JRJ jrj : this.A0J) {
                StringBuilder sb = new StringBuilder();
                sb.append("LifeCycleNotResumed: ");
                AnonymousClass07Z r03 = this.A00;
                if (r03 == null || (lifecycle = r03.getLifecycle()) == null) {
                    r0 = null;
                } else {
                    r0 = lifecycle.A07();
                }
                sb.append(r0);
                jrj.Dyc(A002, sb.toString());
            }
        }
    }

    public final void A0T(boolean z) {
        JRN A022;
        C52078GDy A023 = C52019GBq.A02(this);
        if (A023 != null && (A022 = A02(this, A023)) != null) {
            A022.EPC(z);
        }
    }

    public final void A0U(boolean z, String str) {
        JRN A022;
        C52078GDy A023 = C52019GBq.A02(this);
        if (A023 != null && (A022 = A02(this, A023)) != null) {
            A022.EnT(z, str);
        }
    }

    public final boolean A0W() {
        C267324bN r0;
        C263754Nf Auf = Auf();
        if (Auf == null || (r0 = (C267324bN) Auf.A03) == null || A0X(r0)) {
            return true;
        }
        return false;
    }

    public final void onAudioFocusChange(int i) {
        JRN A022;
        C52078GDy A023 = C52019GBq.A02(this);
        if (A023 != null && (A022 = A02(this, A023)) != null) {
            float f = 0.5f;
            if (i != -3) {
                f = 0.0f;
                if (i != -2) {
                    if (i == -1) {
                        A09(A022, 0.0f, 0);
                        this.A09.A03(this);
                        return;
                    } else if (i == 1 || i == 2 || i == 3 || i == 4) {
                        f = 1.0f;
                    } else {
                        return;
                    }
                }
            }
            A09(A022, f, 0);
        }
    }
}
