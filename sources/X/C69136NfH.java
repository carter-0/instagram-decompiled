package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.os.Build;
import android.widget.Toast;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.rtc.rsys.models.EngineModel;
import java.util.Set;

/* renamed from: X.NfH  reason: case insensitive filesystem */
public final class C69136NfH extends OTZ {
    public EngineModel A00;
    public N9B A01;
    public String A02;
    public C62320sa A03;
    public boolean A04;
    public final long A05;
    public final Context A06;
    public final UserSession A07;
    public final C74487Pvh A08;
    public final OEQ A09;
    public final C69134NfF A0A;
    public final C72187Oxw A0B;
    public final OWA A0C;
    public final C70503O9c A0D;
    public final N9B A0E;
    public final C62320sa A0F;
    public final 05G A0G;
    public final boolean A0H;
    public final boolean A0I;

    public final void A04(C74582PxV pxV) {
        C69307Nj8 nj8;
        0qQ.A0B(pxV, 0);
        if (this.A0H) {
            if (pxV instanceof PPU) {
                this.A08.EzT();
                if (this.A0I) {
                    N9B n9b = this.A01;
                    C69307Nj8 nj82 = n9b.A00;
                    if (nj82 == C69307Nj8.UNAVAILABLE && n9b.A01 == AnonymousClass05K.A01) {
                        C69134NfF.A01(this.A0A, AnonymousClass05K.A0T, System.currentTimeMillis());
                        return;
                    } else if (nj82 == C69307Nj8.IDLE) {
                        nj8 = C69307Nj8.REQUESTING_PERMISSIONS;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else if (pxV instanceof PPV) {
                if (this.A0I && A03(this.A01.A00)) {
                    this.A04 = false;
                    A00(this, C69307Nj8.IDLE);
                }
                this.A08.APN();
                return;
            } else if (pxV instanceof PPR) {
                PPR ppr = (PPR) pxV;
                Intent intent = ppr.A00;
                Point point = ppr.A01;
                if (this.A0I) {
                    C69307Nj8 nj83 = C69307Nj8.REQUESTING_PERMISSIONS;
                    nj8 = C69307Nj8.IDLE;
                    C69307Nj8[] nj8Arr = {nj83, nj8};
                    C69307Nj8 nj84 = this.A01.A00;
                    if (!03t.A0O(nj84, nj8Arr)) {
                        0KC.A0P("RtcScreenShareInter", "unexpected state %s: (expected %s)", new Object[]{nj84, 03t.A07(", ", "", "", (0sP) null, nj8Arr)});
                        return;
                    } else if (intent != null && !0qQ.A0K(point, new Point())) {
                        C74487Pvh pvh = this.A08;
                        pvh.DWk();
                        if (Build.VERSION.SDK_INT >= 34) {
                            this.A03 = new C20704Wxb(9, this, point, intent);
                            C71116OdA odA = (C71116OdA) this.A07.A00(C71116OdA.class);
                            if (odA != null && odA.A0M && odA.A05.add(32)) {
                                C71004OWb.A00.A00("RtcNotificationController", "Added media projection permission to FG Service");
                                C69662Npk npk = odA.A02;
                                if (npk != null) {
                                    C71116OdA.A00(npk, odA, false, true);
                                }
                            }
                            nj8 = C69307Nj8.PERMISSION_GRANTED;
                        } else {
                            pvh.ARe(intent, point);
                            nj8 = C69307Nj8.PAUSED;
                        }
                    }
                } else {
                    return;
                }
            } else if (pxV instanceof PPS) {
                if (this.A0I) {
                    this.A08.FJc(true);
                    return;
                }
                return;
            } else if (!(pxV instanceof PPT)) {
                throw AnonymousClass7TE.A1K();
            } else if (this.A0I) {
                this.A08.FJc(false);
                return;
            } else {
                return;
            }
            A00(this, nj8);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C69136NfH(Context context, UserSession userSession, C74487Pvh pvh, C69134NfF nfF, O9R o9r, OWA owa, C70503O9c o9c) {
        super(o9r);
        0Tu r2 = 0Tu.A06;
        boolean A062 = 182.A06(r2, userSession, 2342157434442746402L);
        boolean A063 = 182.A06(0Tu.A05, userSession, 2342157434443139619L);
        long A012 = 182.A01(r2, userSession, 36595900205959443L);
        C73925Pm5 A013 = C73925Pm5.A01(userSession, 27);
        OEQ oeq = new OEQ(context);
        C72187Oxw oxw = (C72187Oxw) userSession.A01(C72187Oxw.class, C73852Pkp.A00);
        0qQ.A0B(oxw, 13);
        this.A06 = context;
        this.A07 = userSession;
        this.A0C = owa;
        this.A0D = o9c;
        this.A0A = nfF;
        this.A0H = A062;
        this.A0I = A063;
        this.A05 = A012;
        this.A0F = A013;
        this.A09 = oeq;
        this.A0B = oxw;
        this.A08 = !A063 ? new POQ() : pvh;
        N9B n9b = new N9B(C69307Nj8.UNAVAILABLE, AnonymousClass05K.A00, 0sl.A00);
        this.A0E = n9b;
        this.A0G = DbS.A10(n9b);
        this.A01 = n9b;
    }

    public static final void A00(C69136NfH nfH, C69307Nj8 nj8) {
        N9B n9b = nfH.A01;
        Integer num = AnonymousClass05K.A00;
        Set set = n9b.A02;
        0qQ.A0B(set, 1);
        A01(nfH, new N9B(nj8, num, set));
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C69136NfH r5, X.N9B r6) {
        /*
            X.N9B r0 = r5.A01
            boolean r0 = X.0qQ.A0K(r0, r6)
            if (r0 != 0) goto L_0x00ad
            X.N9B r2 = r5.A01
            X.Nj8 r1 = r2.A00
            X.Nj8 r3 = r6.A00
            if (r1 == r3) goto L_0x003a
            X.Nj8 r0 = X.C69307Nj8.SHARING
            if (r1 == r0) goto L_0x00d3
            if (r3 != r0) goto L_0x001f
            X.OWA r1 = r5.A0C
            X.PKl r0 = X.C72797PKl.A00
        L_0x001a:
            X.Prv r0 = (X.C74267Prv) r0
            r1.A02(r0)
        L_0x001f:
            boolean r0 = r2.A03
            if (r0 == 0) goto L_0x00c6
            boolean r0 = r6.A03
            if (r0 != 0) goto L_0x003a
            boolean r0 = r5.A04
            if (r0 == 0) goto L_0x00c3
            java.lang.Integer r2 = X.AnonymousClass05K.A00
        L_0x002d:
            X.OWA r1 = r5.A0C
            X.PKv r0 = new X.PKv
            r0.<init>(r2)
            r1.A02(r0)
            r0 = 0
            r5.A04 = r0
        L_0x003a:
            X.N9B r0 = r5.A01
            X.Nj8 r0 = r0.A00
            boolean r0 = A03(r0)
            if (r0 != 0) goto L_0x00ae
            boolean r0 = A03(r3)
            if (r0 == 0) goto L_0x0075
            X.OEQ r4 = r5.A09
            r0 = 28
            X.Pm5 r2 = X.C73925Pm5.A01(r5, r0)
            X.0QS r0 = r4.A00
            if (r0 != 0) goto L_0x0075
            r1 = 3
            X.Oqi r0 = new X.Oqi
            r0.<init>(r2, r1)
            r4.A01 = r0
            X.0bo[] r0 = new X.C59900bo[]{r0}
            X.0QS r3 = new X.0QS
            r3.<init>(r0)
            r4.A00 = r3
            android.content.Context r2 = r4.A02
            java.lang.String r1 = "android.intent.action.SCREEN_ON"
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>(r1)
            X.0DH.A00(r3, r2, r0)
        L_0x0075:
            boolean r0 = r6.A03
            if (r0 != 0) goto L_0x0081
            java.util.Set r0 = r6.A02
            boolean r0 = X.C66580MXl.A1b(r0)
            if (r0 == 0) goto L_0x00a6
        L_0x0081:
            X.O9c r0 = r5.A0D
            X.OVd r0 = r0.A00
            X.O9M r0 = r0.A0J
            X.OK3 r0 = r0.A00
            r0.A00()
            X.OVd r3 = r0.A00
            X.NfE r1 = r3.A0R
            X.PP6 r0 = X.PP6.A00
            X.N32 r2 = r1.A01(r0)
            if (r2 == 0) goto L_0x009f
            X.Odx r1 = r3.A0Z
            r0 = 11
            X.C71143Odx.A02(r1, r2, r0)
        L_0x009f:
            X.NfJ r1 = r3.A0N
            X.PP0 r0 = X.PP0.A00
            r1.A0K(r0)
        L_0x00a6:
            r5.A01 = r6
            X.05G r0 = r5.A0G
            X.C66581MXm.A1T(r6, r0)
        L_0x00ad:
            return
        L_0x00ae:
            boolean r0 = A03(r3)
            if (r0 != 0) goto L_0x0075
            X.OEQ r2 = r5.A09
            X.0QS r1 = r2.A00
            if (r1 == 0) goto L_0x00bf
            android.content.Context r0 = r2.A02
            r0.unregisterReceiver(r1)
        L_0x00bf:
            r0 = 0
            r2.A00 = r0
            goto L_0x0075
        L_0x00c3:
            r2 = 0
            goto L_0x002d
        L_0x00c6:
            boolean r0 = r6.A03
            if (r0 == 0) goto L_0x003a
            X.OWA r1 = r5.A0C
            X.PKo r0 = X.C72800PKo.A00
            r1.A02(r0)
            goto L_0x003a
        L_0x00d3:
            if (r3 == r0) goto L_0x001f
            X.OWA r1 = r5.A0C
            X.PKm r0 = X.C72798PKm.A00
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69136NfH.A01(X.NfH, X.N9B):void");
    }

    public static final void A02(C69136NfH nfH, Integer num, String str) {
        int i;
        C72187Oxw oxw = nfH.A0B;
        String str2 = str;
        0qQ.A0B(str2, 0);
        C61034JvY jvY = (C61034JvY) oxw.A00.get(str2);
        if (jvY != null) {
            Integer num2 = num;
            int intValue = num.intValue();
            if (intValue == 34) {
                i = 2131972740;
            } else if (intValue == 36) {
                i = 2131972735;
            } else if (intValue != 37) {
                0KC.A0C("RtcScreenShareInter", "Invalid Screen Sharing Message");
                return;
            } else {
                i = 2131972736;
            }
            String A0c = DbY.A0c(nfH.A06, jvY.A06, i);
            C69134NfF nfF = nfH.A0A;
            String url = ((ImageUrl) jvY.A03).getUrl();
            long currentTimeMillis = System.currentTimeMillis();
            Integer num3 = AnonymousClass05K.A00;
            N9C n9c = new N9C(num2, num3, new String[]{A0c, url}, currentTimeMillis, false);
            C310336ap A0a = DbS.A0a();
            A0a.A0D = A0c;
            if (C66580MXl.A06(url) > 0) {
                A0a.A09 = DbS.A0V(url);
                A0a.A0B(C310356ar.AVATAR);
            }
            A0a.A01 = Dc5.A00();
            boolean z = true;
            boolean A1W = AnonymousClass7TF.A1W(nfF.A00, num3);
            if (!14i.A05 || 14i.A08()) {
                z = false;
            }
            if (A1W) {
                nfF.A02(n9c);
            } else if (z) {
                Dbb.A1Q(A0a);
            } else {
                Toast.makeText(nfF.A03, A0c, 1).show();
            }
        }
    }

    public static final boolean A03(C69307Nj8 nj8) {
        int ordinal = nj8.ordinal();
        if (ordinal == 1 || ordinal == 0) {
            return false;
        }
        return true;
    }
}
