package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.view.animation.OvershootInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineVideoTrackController$scrollingLinearLayoutManager$1;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import java.util.List;

public final class KMS extends LPJ {
    public int A00 = -1;
    public int A01;
    public C63848L9d A02;
    public boolean A03;
    public int A04;
    public C62320sa A05;
    public final int A06;
    public final Context A07;
    public final Handler A08;
    public final C355568Qm A09;
    public final RecyclerView A0A;
    public final UserSession A0B;
    public final C64163LRe A0C;
    public final C60428JlL A0D;
    public final ClipsStackedTimelineVideoTrackController$scrollingLinearLayoutManager$1 A0E;
    public final C64340LaF A0F;
    public final C62517Kh8 A0G = C62517Kh8.VIDEO_TRACK;
    public final AnonymousClass89v A0H;
    public final ClipsCreationViewModel A0I;
    public final AnonymousClass8RF A0J;
    public final C60108Jfo A0K;
    public final Runnable A0L = new M30(this);
    public final C66508MUm A0M;
    public final C60369JkK A0N;
    public final AnonymousClass88B A0O;

    public KMS(Context context, RecyclerView recyclerView, UserSession userSession, C60428JlL jlL, AnonymousClass89v r18, ClipsCreationViewModel clipsCreationViewModel, AnonymousClass8RF r20, C60108Jfo jfo, AnonymousClass88B r22, int i) {
        UserSession userSession2 = userSession;
        AnonymousClass7TF.A1F(userSession2, 1, recyclerView);
        this.A0B = userSession2;
        this.A07 = context;
        AnonymousClass8RF r2 = r20;
        this.A0J = r2;
        ClipsCreationViewModel clipsCreationViewModel2 = clipsCreationViewModel;
        this.A0I = clipsCreationViewModel2;
        this.A0O = r22;
        C60108Jfo jfo2 = jfo;
        this.A0K = jfo2;
        C60428JlL jlL2 = jlL;
        this.A0D = jlL2;
        this.A0A = recyclerView;
        this.A0H = r18;
        this.A06 = i;
        ClipsStackedTimelineVideoTrackController$scrollingLinearLayoutManager$1 clipsStackedTimelineVideoTrackController$scrollingLinearLayoutManager$1 = new ClipsStackedTimelineVideoTrackController$scrollingLinearLayoutManager$1(context, this);
        this.A0E = clipsStackedTimelineVideoTrackController$scrollingLinearLayoutManager$1;
        this.A08 = new Handler(context.getMainLooper());
        this.A0C = new C64163LRe(userSession2, jfo2, MMB.A00(this, 42), MMB.A00(this, 43), new MIW(this, 70));
        boolean z = false;
        clipsStackedTimelineVideoTrackController$scrollingLinearLayoutManager$1.A0w(false);
        recyclerView.setLayoutManager(clipsStackedTimelineVideoTrackController$scrollingLinearLayoutManager$1);
        recyclerView.setAdapter(jlL2);
        AnonymousClass8JI r1 = null;
        recyclerView.setItemAnimator((AnonymousClass3AS) null);
        this.A02 = new C63848L9d(context);
        C64340LaF laF = new C64340LaF(recyclerView, new LnG(this, 2), true, false);
        this.A0F = laF;
        recyclerView.A13(laF);
        A0K(context, jfo2, MMB.A00(this, 41));
        jlL2.A01 = new LnI(this);
        jlL2.A03 = new C59112J6u(this, 31);
        AnonymousClass8J0 r0 = clipsCreationViewModel2.A0L.A00;
        jlL2.A04 = (r0 != null ? r0.A03 : r1) == AnonymousClass8JI.SEQUENTIAL_REMIX ? true : z;
        C65070Lmq lmq = new C65070Lmq(this);
        this.A0M = lmq;
        C60369JkK jkK = new C60369JkK(userSession2, lmq, clipsCreationViewModel2, r2);
        this.A0N = jkK;
        this.A09 = new C355568Qm(jkK);
        A0F();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0061, code lost:
        if (r2 == 0) goto L_0x0063;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0P(java.util.List r9) {
        /*
            r8 = this;
            r0 = 0
            X.0qQ.A0B(r9, r0)
            X.0sa r2 = r8.A05
            if (r2 == 0) goto L_0x0015
            android.os.Handler r1 = r8.A08
            X.M31 r0 = new X.M31
            r0.<init>(r2)
            r1.removeCallbacks(r0)
            r0 = 0
            r8.A05 = r0
        L_0x0015:
            androidx.recyclerview.widget.RecyclerView r0 = r8.A0A
            boolean r0 = r0.A1E()
            if (r0 == 0) goto L_0x0030
            r0 = 13
            X.MMa r2 = X.C66291MMa.A00(r9, r8, r0)
            android.os.Handler r1 = r8.A08
            X.M31 r0 = new X.M31
            r0.<init>(r2)
            r1.post(r0)
            r8.A05 = r2
        L_0x002f:
            return
        L_0x0030:
            android.content.Context r7 = r8.A07
            X.JlL r6 = r8.A0D
            java.util.List r5 = r6.A02
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineVideoTrackController$scrollingLinearLayoutManager$1 r0 = r8.A0E
            int r4 = r0.A1a()
            r3 = 0
            r0 = -1
            if (r4 == r0) goto L_0x0057
            int r0 = r9.size()
            if (r4 >= r0) goto L_0x0057
            r2 = 0
            r1 = 0
        L_0x0048:
            if (r3 >= r4) goto L_0x0059
            int r0 = A00(r7, r5, r3)
            int r2 = r2 + r0
            int r0 = A00(r7, r9, r3)
            int r1 = r1 + r0
            int r3 = r3 + 1
            goto L_0x0048
        L_0x0057:
            r2 = 0
            goto L_0x005a
        L_0x0059:
            int r2 = r2 - r1
        L_0x005a:
            X.Jfo r5 = r8.A0K
            boolean r0 = r5.A07
            if (r0 != 0) goto L_0x0063
            r4 = 1
            if (r2 != 0) goto L_0x0064
        L_0x0063:
            r4 = 0
        L_0x0064:
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1D(r9)
            java.util.List r1 = r6.A02
            r6.A02 = r3
            X.Jk3 r0 = new X.Jk3
            r0.<init>(r1, r3)
            r1 = 1
            X.JTP.A1C(r0, r6)
            if (r4 == 0) goto L_0x002f
            X.8RF r0 = r8.A0J
            X.8RH r0 = r0.A0E()
            boolean r0 = r0 instanceof X.AnonymousClass8RW
            if (r0 == 0) goto L_0x002f
            r5.A08 = r1
            float r0 = (float) r2
            r8.A0G(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KMS.A0P(java.util.List):void");
    }

    public static final void A01(KMS kms, int i, long j, boolean z) {
        int i2;
        int i3;
        if (z) {
            i2 = kms.A04;
            C63848L9d l9d = kms.A02;
            int i4 = l9d.A00;
            int i5 = l9d.A03;
            i3 = ((i4 - (i + i5)) / 2) - l9d.A02;
            if (i3 < i5) {
                i3 = i5;
            }
        } else {
            C63848L9d l9d2 = kms.A02;
            int i6 = l9d2.A00;
            int i7 = l9d2.A03;
            i2 = ((i6 - (i + i7)) / 2) - l9d2.A02;
            if (i2 < i7) {
                i2 = i7;
            }
            i3 = kms.A04;
        }
        0nA.A0e(kms.A0A, i2);
        float[] A1b = C51965G9l.A1b();
        // fill-array-data instruction
        A1b[0] = 0;
        A1b[1] = 1065353216;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(A1b);
        if (z) {
            ofFloat.setInterpolator(new OvershootInterpolator(1.0f));
        }
        ofFloat.addUpdateListener(new C64202LTp(kms, i2, i3, 0));
        if (j > 0) {
            ofFloat.setDuration(j);
        }
        ofFloat.start();
    }

    public final void A0N(int i) {
        C63848L9d l9d = this.A02;
        if (i < 2) {
            i = 2;
        }
        int i2 = l9d.A05;
        int i3 = l9d.A00;
        int i4 = l9d.A03;
        int i5 = ((i3 - ((i2 + i4) * i)) / 2) - l9d.A02;
        if (i5 < i4) {
            i5 = i4;
        }
        this.A04 = i5;
        0nA.A0e(this.A0A, i5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (X.JTO.A08(r0) == 1) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0O(int r7) {
        /*
            r6 = this;
            X.Jfo r1 = r6.A0K
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r1.A0E
            X.831 r0 = X.JTQ.A0K(r0)
            if (r0 == 0) goto L_0x00c3
            int r0 = X.JTO.A08(r0)
            r2 = 1
            if (r0 != r2) goto L_0x00c3
        L_0x0011:
            X.861 r0 = r1.A0K
            r0.A01()
            boolean r0 = r6.A0M()
            if (r0 != 0) goto L_0x0026
            X.8RF r1 = r6.A0J
            X.KM4 r0 = new X.KM4
            r0.<init>(r7)
            r1.A0G(r0)
        L_0x0026:
            com.instagram.common.session.UserSession r0 = r6.A0B
            X.29R r5 = X.JTO.A0b(r0)
            X.0wc r0 = r5.A02
            X.1Ln r3 = X.1Ln.A08(r0)
            boolean r0 = X.DbT.A1Y(r3)
            if (r0 == 0) goto L_0x008b
            r0 = 2299(0x8fb, float:3.222E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.A0t(r0)
            r0 = 2125(0x84d, float:2.978E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.A0r(r0)
            X.29R.A00(r3, r5)
            X.283 r4 = r5.A04
            int r0 = X.JTR.A0C(r4)
            r3.A0V(r0)
            r0 = -1
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "capture_format_index"
            r3.A0Q(r0, r1)
            X.JTQ.A18(r3, r5)
            X.JTQ.A1B(r3, r4)
            X.JTU.A14(r3, r7)
            X.4yP r0 = r5.A0J()
            r3.A0a(r0)
            java.lang.String r1 = r4.A0O
            java.lang.String r0 = "discovery_session_id"
            r3.A0R(r0, r1)
            java.lang.String r1 = r4.A0P
            java.lang.String r0 = "search_session_id"
            r3.A0R(r0, r1)
            java.lang.Boolean r1 = X.AnonymousClass7TE.A0v()
            java.lang.String r0 = "is_timeline"
            r3.A0O(r0, r1)
            X.JTS.A1E(r3)
        L_0x008b:
            android.content.Context r0 = r6.A07
            X.8ab r3 = X.DbS.A0Y(r0)
            r0 = 2131955357(0x7f130e9d, float:1.954724E38)
            if (r2 == 0) goto L_0x0099
            r0 = 2131955360(0x7f130ea0, float:1.9547245E38)
        L_0x0099:
            r3.A09(r0)
            r0 = 2131955356(0x7f130e9c, float:1.9547237E38)
            if (r2 == 0) goto L_0x00a4
            r0 = 2131955359(0x7f130e9f, float:1.9547243E38)
        L_0x00a4:
            r3.A08(r0)
            r2 = 2131960790(0x7f1323d6, float:1.9558259E38)
            r1 = 0
            X.LUK r0 = new X.LUK
            r0.<init>(r6, r7, r1)
            r3.A0K(r0, r2)
            r2 = 2131964550(0x7f133286, float:1.9565885E38)
            r1 = 1
            X.LUK r0 = new X.LUK
            r0.<init>(r6, r7, r1)
            r3.A0G(r0, r2)
            X.DbT.A1V(r3)
            return
        L_0x00c3:
            r2 = 0
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KMS.A0O(int):void");
    }

    public final boolean A0Q() {
        AnonymousClass8RH A0E2 = this.A0J.A0E();
        if ((A0E2 instanceof AnonymousClass8RU) || (A0E2 instanceof C355708Ra) || (A0E2 instanceof C355718Rb) || (A0E2 instanceof AnonymousClass8RY) || (A0E2 instanceof AnonymousClass8RV) || (A0E2 instanceof C355828Rn) || (A0E2 instanceof AnonymousClass8RX)) {
            return false;
        }
        return true;
    }

    public static int A00(Context context, List list, int i) {
        L0V l0v = (L0V) list.get(i);
        if (l0v instanceof KMG) {
            return ((KMG) l0v).A00;
        }
        if (!(l0v instanceof KMJ)) {
            return 0;
        }
        KMJ kmj = (KMJ) l0v;
        return C63117Krl.A00(context, kmj.A03) - C63117Krl.A00(context, kmj.A04);
    }
}
