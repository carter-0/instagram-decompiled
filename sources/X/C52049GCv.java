package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.textureview.ScalingTextureView;
import java.util.List;
import java.util.Map;

/* renamed from: X.GCv  reason: case insensitive filesystem */
public final class C52049GCv implements JRF, AnonymousClass32U {
    public C52352GOw A00;
    public final 1Ng A01;
    public final UserSession A02;
    public final C52019GBq A03;
    public final C52016GBn A04;
    public final C52012GBj A05;
    public final GD9 A06;
    public final String A07;
    public final Map A08 = AnonymousClass7TE.A1H();
    public final Map A09 = AnonymousClass7TE.A1H();
    public final AnonymousClass0eM A0A;
    public final Context A0B;

    public final /* synthetic */ void DVz(int i) {
    }

    public final /* synthetic */ void DW0(int i) {
    }

    public final /* synthetic */ void DW8(int i, int i2) {
    }

    public final /* synthetic */ void DWY() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0037, code lost:
        if (X.182.A06(r4, r5, 2342164310685852915L) != false) goto L_0x0039;
     */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DaS(X.C267324bN r13, int r14, int r15, boolean r16) {
        /*
            r12 = this;
            r6 = 0
            X.0qQ.A0B(r13, r6)
            X.GD9 r0 = r12.A06
            X.4bN r0 = r0.A02()
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x00f6
            if (r16 != 0) goto L_0x00f6
            java.util.Map r1 = r12.A08
            java.lang.String r0 = r13.getId()
            boolean r1 = r1.containsKey(r0)
            java.util.Map r3 = r12.A09
            java.lang.String r0 = r13.getId()
            boolean r0 = r3.containsKey(r0)
            if (r0 != 0) goto L_0x00a8
            if (r1 != 0) goto L_0x00ce
            com.instagram.common.session.UserSession r5 = r12.A02
            X.0Tu r4 = X.0Tu.A05
            r0 = 2342164310685852915(0x20810a08000724f3, double:4.066689418227397E-152)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x00ce
        L_0x0039:
            X.GBj r0 = r12.A05
            java.lang.Integer r1 = r0.A0D()
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x00f6
            boolean r0 = r13.CcK()
            if (r0 != 0) goto L_0x00f3
            boolean r0 = r12.A06(r13)
            if (r0 != 0) goto L_0x00f3
            boolean r0 = r12.A05()
            if (r0 != 0) goto L_0x00f3
            X.GBq r1 = r12.A03
            int r0 = r1.A03()
            X.GDy r0 = r1.A05(r0)
            if (r0 == 0) goto L_0x00ee
            android.view.View r1 = r0.A08
            r0 = 0
            r12.A03(r13, r0)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            android.view.View r7 = r12.A00(r1)
            android.view.TextureView r7 = (android.view.TextureView) r7
            if (r7 == 0) goto L_0x00ee
            r2 = 37165726403133840(0x840a0800140190, double:3.567093259485414E-306)
            double r10 = X.182.A00(r4, r5, r2)
            r8 = 0
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x0087
            android.graphics.Bitmap r1 = r7.getBitmap()
        L_0x0084:
            if (r1 == 0) goto L_0x00ee
            goto L_0x00e2
        L_0x0087:
            int r0 = r7.getWidth()
            double r0 = (double) r0
            double r8 = X.182.A00(r4, r5, r2)
            double r0 = r0 / r8
            int r8 = X.AnonymousClass1GB.A00(r0)
            int r0 = r7.getHeight()
            double r0 = (double) r0
            double r2 = X.182.A00(r4, r5, r2)
            double r0 = r0 / r2
            int r0 = X.AnonymousClass1GB.A00(r0)
            android.graphics.Bitmap r1 = r7.getBitmap(r8, r0)
            goto L_0x0084
        L_0x00a8:
            com.instagram.common.session.UserSession r5 = r12.A02
            X.0Tu r4 = X.0Tu.A05
            r0 = 36602776448668412(0x820a08000412fc, double:3.211081441463959E-306)
            long r9 = X.182.A01(r4, r5, r0)
            r7 = 0
            int r2 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x00f6
            java.lang.String r2 = r13.getId()
            java.lang.Object r2 = r3.get(r2)
            X.HQX r2 = (X.HQX) r2
            if (r2 == 0) goto L_0x00f6
            long r2 = r2.A00
            long r2 = X.C51966G9m.A07(r2)
            goto L_0x00d8
        L_0x00ce:
            long r2 = (long) r14
            com.instagram.common.session.UserSession r5 = r12.A02
            X.0Tu r4 = X.0Tu.A05
            r0 = 36602776448996093(0x820a08000912fd, double:3.2110814416711857E-306)
        L_0x00d8:
            long r7 = X.182.A01(r4, r5, r0)
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x00f6
            goto L_0x0039
        L_0x00e2:
            r12.A01(r1, r13, r6)     // Catch:{ all -> 0x00e9 }
            r1.recycle()
            return
        L_0x00e9:
            r0 = move-exception
            r1.recycle()
            throw r0
        L_0x00ee:
            r0 = 1
            r12.A04(r13, r6, r0)
            return
        L_0x00f3:
            r12.A04(r13, r6, r6)
        L_0x00f6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52049GCv.DaS(X.4bN, int, int, boolean):void");
    }

    public final /* synthetic */ void DhG(float f, float f2) {
    }

    public final /* synthetic */ void DhU(Integer num) {
    }

    public final /* synthetic */ void Dpv() {
    }

    public final /* synthetic */ void Dpy(C267324bN r1, int i) {
    }

    private final View A00(ViewGroup viewGroup) {
        View A002;
        Class<ScalingTextureView> cls = ScalingTextureView.class;
        int childCount = viewGroup.getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = viewGroup.getChildAt(i);
            if (cls.isInstance(childAt)) {
                0qQ.A0C(childAt, "null cannot be cast to non-null type T of instagram.features.clips.viewer.background.ClipsGradientBackgroundHelper.findChildOfType");
                return childAt;
            } else if ((childAt instanceof ViewGroup) && (A002 = A00((ViewGroup) childAt)) != null) {
                return A002;
            } else {
                i++;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0068, code lost:
        if (r0.A05 == -16758784) goto L_0x006a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A01(android.graphics.Bitmap r19, X.C267324bN r20, boolean r21) {
        /*
            r18 = this;
            X.TqF r5 = new X.TqF
            r4 = r19
            r5.<init>(r4)
            int r0 = r4.getHeight()
            double r2 = (double) r0
            r10 = r18
            com.instagram.common.session.UserSession r12 = r10.A02
            X.0Tu r11 = X.0Tu.A05
            r0 = 37165726402216332(0x840a080006018c, double:3.5670932589051785E-306)
            double r0 = X.182.A00(r11, r12, r0)
            double r2 = r2 * r0
            int r6 = (int) r2
            int r0 = r4.getWidth()
            double r0 = (double) r0
            r2 = 4606281698874543309(0x3feccccccccccccd, double:0.9)
            double r0 = r0 * r2
            int r2 = (int) r0
            int r0 = r4.getHeight()
            r15 = 0
            r5.A01(r6, r2, r0)
            r0 = 3
            r5.A00 = r0
            java.util.List r0 = r5.A03
            r0.clear()
            X.TqI r0 = r5.A00()
            java.util.List r3 = r0.A02
            java.util.List r2 = X.C51966G9m.A1J(r3)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x006a
            int r0 = r2.size()
            r1 = 1
            if (r0 > r1) goto L_0x017f
            int r0 = r2.size()
            if (r0 != r1) goto L_0x006a
            java.util.List r0 = X.C51966G9m.A1J(r3)
            java.lang.Object r0 = X.00k.A0I(r0)
            X.TqH r0 = (X.C14122TqH) r0
            X.0qQ.A0A(r0)
            int r1 = r0.A05
            r0 = -16758784(0xffffffffff004800, float:-1.7051503E38)
            if (r1 != r0) goto L_0x017f
        L_0x006a:
            int r0 = r4.getHeight()
            double r0 = (double) r0
            r2 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            double r0 = r0 * r2
            int r2 = (int) r0
            int r0 = r4.getPixel(r15, r2)
        L_0x007a:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x0171
            int r0 = r0.intValue()
            float r2 = X.0nH.A01(r0)
            double r0 = (double) r2
            r5 = 37165726402347405(0x840a080008018d, double:3.5670932589880696E-306)
            double r7 = X.182.A00(r11, r12, r5)
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            boolean r9 = X.AnonymousClass7TF.A1R(r3)
            r0 = 36321301472683254(0x810a08000f24f6, double:3.0330755332421906E-306)
            boolean r8 = X.C51965G9l.A1a(r11, r12, r0)
            r1 = r20
            java.lang.String r3 = r1.getId()
            java.util.Map r0 = r10.A08
            java.lang.Object r0 = r0.get(r3)
            X.HQX r0 = (X.HQX) r0
            r16 = 0
            if (r0 == 0) goto L_0x00bb
            java.lang.Boolean r0 = r0.A01
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r8)
            if (r0 != 0) goto L_0x00cd
        L_0x00bb:
            java.util.Map r0 = r10.A09
            java.lang.Object r0 = r0.get(r3)
            X.HQX r0 = (X.HQX) r0
            if (r0 == 0) goto L_0x00cf
            java.lang.Boolean r0 = r0.A01
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r8)
            if (r0 == 0) goto L_0x00cf
        L_0x00cd:
            r16 = 1
        L_0x00cf:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            if (r21 == 0) goto L_0x017a
            r10.A02(r1, r0)
        L_0x00d8:
            r14 = 1
            X.GP0 r7 = new X.GP0
            r7.<init>(r1, r2, r9)
            boolean r0 = r7.A02
            r17 = r0
            float r13 = r7.A00
            X.4bN r2 = r7.A01
            r2.getId()
            X.0eM r0 = r10.A0A
            java.lang.Object r1 = r0.getValue()
            X.0wc r1 = (X.0wc) r1
            java.lang.String r0 = "instagram_clips_gradient"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r1, r0)
            X.1Xj r0 = r2.A02
            if (r0 == 0) goto L_0x0178
            java.lang.String r1 = r0.A30()
        L_0x00ff:
            boolean r0 = r4.isSampled()
            if (r0 == 0) goto L_0x0166
            java.lang.String r0 = r10.A07
            X.C51965G9l.A1M(r4, r0)
            r2 = 0
            if (r1 == 0) goto L_0x0175
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r1)
            if (r0 == 0) goto L_0x0175
            long r0 = r0.longValue()
        L_0x0118:
            X.C51970G9q.A18(r4, r0)
            X.C51970G9q.A1C(r4, r2)
            X.C51969G9p.A16(r4, r14)
            java.lang.String r2 = ""
            X.C51965G9l.A1O(r4, r2)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r17)
            java.lang.String r0 = "has_gradient"
            r4.A7p(r0, r1)
            double r0 = (double) r13
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "luminosity"
            r4.A8D(r0, r1)
            java.lang.String r3 = "android3Luminance"
            double r0 = X.182.A00(r11, r12, r5)
            java.lang.String r1 = X.002.A0M(r3, r0)
            java.lang.String r0 = "algorithm"
            r4.AAJ(r0, r1)
            if (r21 == 0) goto L_0x0172
            java.lang.String r1 = "photo"
        L_0x014c:
            java.lang.String r0 = "frame_type"
            r4.AAJ(r0, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            java.lang.String r0 = "frame_time"
            r4.A8k(r0, r1)
            X.C51965G9l.A1R(r4, r2)
            X.C51965G9l.A1Q(r4, r2)
            X.C51965G9l.A1K(r4, r2)
            r4.Cgf()
        L_0x0166:
            if (r9 != r8) goto L_0x0171
            if (r21 != 0) goto L_0x016c
            if (r16 != 0) goto L_0x0171
        L_0x016c:
            X.1Ng r0 = r10.A01
            r0.A00(r7)
        L_0x0171:
            return
        L_0x0172:
            java.lang.String r1 = "video"
            goto L_0x014c
        L_0x0175:
            r0 = 0
            goto L_0x0118
        L_0x0178:
            r1 = 0
            goto L_0x00ff
        L_0x017a:
            r10.A03(r1, r0)
            goto L_0x00d8
        L_0x017f:
            java.util.Iterator r5 = X.DbY.A0o(r3)
            boolean r0 = r5.hasNext()
            if (r0 != 0) goto L_0x0192
            r4 = 0
        L_0x018a:
            X.TqH r4 = (X.C14122TqH) r4
            if (r4 == 0) goto L_0x0171
            int r0 = r4.A05
            goto L_0x007a
        L_0x0192:
            java.lang.Object r4 = r5.next()
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x018a
            r0 = r4
            X.TqH r0 = (X.C14122TqH) r0
            int r0 = r0.A05
            float r3 = X.0nH.A01(r0)
        L_0x01a5:
            java.lang.Object r2 = r5.next()
            r0 = r2
            X.TqH r0 = (X.C14122TqH) r0
            int r0 = r0.A05
            float r1 = X.0nH.A01(r0)
            int r0 = java.lang.Float.compare(r3, r1)
            if (r0 >= 0) goto L_0x01ba
            r4 = r2
            r3 = r1
        L_0x01ba:
            boolean r0 = r5.hasNext()
            if (r0 != 0) goto L_0x01a5
            goto L_0x018a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52049GCv.A01(android.graphics.Bitmap, X.4bN, boolean):void");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.HQX, java.lang.Object] */
    private final void A02(C267324bN r6, Boolean bool) {
        Map map = this.A08;
        String id = r6.getId();
        long currentTimeMillis = System.currentTimeMillis();
        ? obj = new Object();
        obj.A01 = bool;
        obj.A00 = currentTimeMillis;
        map.put(id, obj);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.HQX, java.lang.Object] */
    private final void A03(C267324bN r6, Boolean bool) {
        Map map = this.A09;
        String id = r6.getId();
        long currentTimeMillis = System.currentTimeMillis();
        ? obj = new Object();
        obj.A01 = bool;
        obj.A00 = currentTimeMillis;
        map.put(id, obj);
    }

    private final void A04(C267324bN r4, boolean z, boolean z2) {
        if (!z2) {
            Boolean A0u = AnonymousClass7TE.A0u();
            if (z) {
                A02(r4, A0u);
            } else {
                A03(r4, A0u);
            }
        }
        this.A01.A00(new GP0(r4, 0.0f, true));
        r4.getId();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
        if (r1 != X.0TS.A03) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A05() {
        /*
            r5 = this;
            com.instagram.common.session.UserSession r4 = r5.A02
            X.0Tu r3 = X.0Tu.A05
            r0 = 36321301472879863(0x810a08001224f7, double:3.033075533366527E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            r2 = 1
            if (r0 == 0) goto L_0x001b
            X.GOw r0 = r5.A00
            if (r0 == 0) goto L_0x0031
            X.0TS r1 = r0.A00
        L_0x0016:
            X.0TS r0 = X.0TS.A02
            if (r1 != r0) goto L_0x0031
        L_0x001a:
            return r2
        L_0x001b:
            r0 = 36321301472945400(0x810a08001324f8, double:3.033075533407973E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 == 0) goto L_0x0031
            X.GOw r0 = r5.A00
            if (r0 == 0) goto L_0x0031
            X.0TS r1 = r0.A00
            X.0TS r0 = X.0TS.A03
            if (r1 == r0) goto L_0x001a
            goto L_0x0016
        L_0x0031:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52049GCv.A05():boolean");
    }

    private final boolean A06(C267324bN r7) {
        UserSession userSession = this.A02;
        List list = null;
        AnonymousClass3WR A092 = r7.A09(userSession, (Integer) null);
        if (A092 != null) {
            if (!182.A06(0Tu.A05, userSession, 36321988666468225L)) {
                String A042 = A092.A04();
                if (A042 != null) {
                    list = AnonymousClass7TE.A1I(A042);
                }
            } else {
                list = A092.A01(this.A0B);
            }
        }
        return new GI8(userSession, "clips_viewer_clips_tab", list).A04();
    }

    public final void DWA(int i, int i2) {
        boolean z;
        C267324bN A022 = this.A06.A02();
        if (A022 != null) {
            String id = A022.getId();
            if (!this.A08.containsKey(id) && !this.A09.containsKey(id)) {
                if (A022.CcK() || A06(A022) || A05()) {
                    A04(A022, true, false);
                    return;
                }
                C52019GBq gBq = this.A03;
                C52078GDy A052 = gBq.A05(gBq.A03());
                if (A052 != null) {
                    IgImageView A023 = A052.A02();
                    if (!A023.A0N) {
                        z = true;
                    } else {
                        A02(A022, (Boolean) null);
                        Bitmap bitmap = A023.A06;
                        z = true;
                        if (bitmap != null) {
                            A01(bitmap, A022, true);
                            return;
                        }
                    }
                    A04(A022, z, z);
                }
            }
        }
    }

    public final void Dzs() {
    }

    public C52049GCv(Context context, 1Ng r6, UserSession userSession, C52019GBq gBq, C52016GBn gBn, C52012GBj gBj, GD9 gd9, String str) {
        C51974G9v.A1M(userSession, gBn, gd9);
        C51972G9s.A1E(r6, str);
        this.A0B = context;
        this.A02 = userSession;
        this.A04 = gBn;
        this.A06 = gd9;
        this.A05 = gBj;
        this.A01 = r6;
        this.A07 = str;
        this.A03 = gBq;
        0Tu r3 = 0Tu.A05;
        if (182.A06(r3, userSession, 36321301472027890L)) {
            this.A00 = new C52352GOw(19e.A01());
            if (182.A06(r3, this.A02, 36321301472355572L)) {
                this.A04.A94(this);
            }
            if (182.A06(r3, this.A02, 2342164310685852915L)) {
                this.A05.A0J(this);
            }
        }
        this.A0A = AnonymousClass0eN.A01(C58715IwO.A01(this, 44));
    }

    public final void D7O(C267324bN r1, List list) {
    }

    public final void DaP(C52078GDy gDy, boolean z) {
    }

    public final void Dxg(C267324bN r1, int i) {
    }

    public final void Dxi(C267324bN r1, int i) {
    }

    public final void DxZ(C267324bN r1, int i, int i2) {
    }

    public final void Dxm(C267324bN r1, Integer num, int i) {
    }

    public final void Dzr(C267324bN r1, JRO jro, boolean z) {
    }

    public final void Dxl(C267324bN r1, C52058GDe gDe, C52019GBq gBq, C52078GDy gDy, boolean z) {
    }
}
