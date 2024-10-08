package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.5jp  reason: invalid class name and case insensitive filesystem */
public final class C292975jp extends 2Rw {
    public RecyclerView A00;
    public C311496cm A01;
    public OFR A02;
    public AnonymousClass3UH A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Activity A08;
    public final Context A09;
    public final View A0A;
    public final AnonymousClass0iw A0B;
    public final UserSession A0C;
    public final C229992ok A0D;
    public final C266934aa A0E;
    public final C230022on A0F;
    public final C293005js A0G;
    public final Integer A0H;
    public final Runnable A0I;
    public final Set A0J = new HashSet();
    public final boolean A0K;
    public final boolean A0L;
    public final int A0M;
    public final 1Ng A0N;
    public final AnonymousClass4D6 A0O;
    public final C231722sA A0P;

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        0qQ.A0B(recyclerView, 0);
        this.A00 = recyclerView;
    }

    /* JADX WARNING: type inference failed for: r8v3, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    /* JADX WARNING: type inference failed for: r10v1, types: [android.widget.TextView, com.instagram.common.ui.text.TightTextView] */
    /* JADX WARNING: type inference failed for: r1v6, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        if (i == 0) {
            View view = (View) this.A0P.A04.poll();
            if (view == null || view.findViewById(R.id.suggested_entity_card_chaining_context) == null) {
                view = LayoutInflater.from(this.A09).inflate(R.layout.suggested_entity_card, viewGroup, false);
            }
            if (view != null) {
                if (view.getLayoutParams() == null) {
                    view.setLayoutParams(new AnonymousClass3MX(this.A0M, -1));
                } else {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.width = this.A0M;
                    }
                }
            }
            int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            Context context = this.A09;
            AnonymousClass0iw r9 = this.A0B;
            AnonymousClass4D6 r11 = this.A0O;
            UserSession userSession = this.A0C;
            0qQ.A0A(view);
            C293735lG r6 = new C293735lG(context, view, r9, userSession, r11);
            Integer num = this.A0H;
            C293985lf.A00(r6.A01, r6.A09, r6.A06, r6.A08, num, false);
            return r6;
        } else if (i == 1) {
            View inflate = LayoutInflater.from(this.A09).inflate(R.layout.suggested_upsell_card, viewGroup, false);
            inflate.getLayoutParams().width = this.A0M;
            C68036Mz3 mz3 = new C68036Mz3(inflate);
            Integer num2 = this.A0H;
            C293985lf.A00(mz3.A00, mz3.A05, (TextView) null, mz3.A03, num2, true);
            return mz3;
        } else {
            throw new IllegalStateException(002.A0O("Unknown view type: ", i));
        }
    }

    public C292975jp(Activity activity, Context context, View view, UserSession userSession, AnonymousClass4D6 r8, C229992ok r9, C231722sA r10, C266934aa r11, C230022on r12, Integer num, Runnable runnable, boolean z, boolean z2) {
        0qQ.A0B(num, 8);
        this.A09 = context;
        this.A08 = activity;
        this.A0O = r8;
        this.A0C = userSession;
        this.A0D = r9;
        this.A0P = r10;
        this.A0F = r12;
        this.A0H = num;
        this.A0A = view;
        this.A0E = r11;
        this.A0K = z;
        this.A0L = z2;
        this.A0I = runnable;
        AnonymousClass0iw AbT = r9.AbT();
        this.A0B = AbT;
        this.A0N = AnonymousClass1Nd.A00(userSession);
        Resources resources = context.getResources();
        0qQ.A07(resources);
        this.A0M = C292995jr.A00(resources, num, 0nA.A09(context));
        this.A0G = new C293005js(AbT, userSession);
    }

    public static final String A00(C292975jp r2) {
        AnonymousClass3UH r0 = r2.A03;
        if (r0 != null) {
            int ordinal = r0.B5J().ordinal();
            if (ordinal == 5) {
                return "feed_suggested_users_netego";
            }
            if (ordinal == 7) {
                return "feed_suggested_producers_netego";
            }
        }
        return r2.A0B.getModuleName();
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.1qK, java.lang.Object] */
    public static final void A01(C292975jp r1, int i) {
        List list;
        AnonymousClass3UH r0 = r1.A03;
        if (!(r0 == null || (list = r0.A0P) == null)) {
            list.remove(i);
        }
        r1.notifyItemRemoved(i);
        if (r1.getItemCount() == 0) {
            r1.A0N.A00(new Object());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        if (r1 != X.1UQ.A0v) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0219, code lost:
        if (r3 == X.1UQ.A0r) goto L_0x021b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0064, code lost:
        if (r1 == X.1UQ.A0r) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0066, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0086, code lost:
        if (r1 != X.1UQ.A0r) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009d, code lost:
        if (r1 == X.1UQ.A0v) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009f, code lost:
        r5 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.AnonymousClass3UH r22) {
        /*
            r21 = this;
            r15 = r21
            r0 = r22
            r15.A03 = r0
            com.instagram.common.session.UserSession r2 = r15.A0C
            X.0Tu r4 = X.0Tu.A06
            r0 = 36321327241700625(0x810a0e00032511, double:3.0330918296725396E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            r5 = 0
            r3 = 0
            if (r0 != 0) goto L_0x002d
            r0 = 36321327241831699(0x810a0e00052513, double:3.033091829755431E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            if (r0 != 0) goto L_0x002d
            r0 = 36321327242159380(0x810a0e000a2514, double:3.033091829962658E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            if (r0 == 0) goto L_0x0039
        L_0x002d:
            X.3UH r0 = r15.A03
            if (r0 == 0) goto L_0x02c2
            X.1UQ r1 = r0.B5J()
        L_0x0035:
            X.1UQ r0 = X.1UQ.A0v
            if (r1 == r0) goto L_0x0066
        L_0x0039:
            r0 = 36321327241766162(0x810a0e00042512, double:3.0330918297139854E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            if (r0 != 0) goto L_0x005a
            r0 = 36321327242290453(0x810a0e000c2515, double:3.033091830045549E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            if (r0 != 0) goto L_0x005a
            r0 = 36321327242159380(0x810a0e000a2514, double:3.033091829962658E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            if (r0 == 0) goto L_0x02bf
        L_0x005a:
            X.3UH r0 = r15.A03
            if (r0 == 0) goto L_0x02bc
            X.1UQ r1 = r0.B5J()
        L_0x0062:
            X.1UQ r0 = X.1UQ.A0r
            if (r1 != r0) goto L_0x02bf
        L_0x0066:
            r0 = 1
        L_0x0067:
            r15.A07 = r0
            android.content.Context r0 = r15.A09
            boolean r0 = X.C267044ar.A01(r0, r2)
            if (r0 == 0) goto L_0x00a0
            r0 = 36322190530586616(0x810ad7000a27f8, double:3.0336377770402256E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            if (r0 == 0) goto L_0x0088
            X.3UH r0 = r15.A03
            if (r0 == 0) goto L_0x02b9
            X.1UQ r1 = r0.B5J()
        L_0x0084:
            X.1UQ r0 = X.1UQ.A0r
            if (r1 == r0) goto L_0x009f
        L_0x0088:
            r0 = 36322190530783225(0x810ad7000d27f9, double:3.033637777164562E-306)
            boolean r0 = X.182.A06(r4, r2, r0)
            if (r0 == 0) goto L_0x00a0
            X.3UH r0 = r15.A03
            if (r0 == 0) goto L_0x02b6
            X.1UQ r1 = r0.B5J()
        L_0x009b:
            X.1UQ r0 = X.1UQ.A0v
            if (r1 != r0) goto L_0x00a0
        L_0x009f:
            r5 = 1
        L_0x00a0:
            r15.A06 = r5
            boolean r0 = r15.A07
            if (r0 == 0) goto L_0x0151
            X.3UH r0 = r15.A03
            if (r0 == 0) goto L_0x0151
            java.util.List r0 = r0.A0P
            if (r0 == 0) goto L_0x0151
            r7 = 0
            int r4 = r0.size()
        L_0x00b3:
            if (r7 >= r4) goto L_0x0151
            X.3UH r0 = r15.A03
            if (r0 == 0) goto L_0x02b2
            java.util.List r1 = r0.A0P
            if (r1 == 0) goto L_0x02b2
            int r0 = r1.size()
            if (r7 >= r0) goto L_0x02b2
            java.lang.Object r0 = r1.get(r7)
            X.3UI r0 = (X.AnonymousClass3UI) r0
            if (r0 == 0) goto L_0x02b2
            X.3UO r1 = r0.A07
            X.3UO r0 = X.AnonymousClass3UO.CI_UPSELL
            if (r1 != r0) goto L_0x02b2
            X.1Av r5 = X.1Au.A00(r2)
            long r13 = java.lang.System.currentTimeMillis()
            X.3UH r0 = r15.A03
            r4 = 0
            if (r0 == 0) goto L_0x02a5
            X.1UQ r6 = r0.B5J()
            java.lang.String r1 = X.1Av.A01(r6)
            if (r1 == 0) goto L_0x02a5
            java.lang.String r0 = "num_times_dismissed_ci_upsell_feed_"
            java.lang.String r0 = X.002.A0R(r0, r1)
            X.0xa r5 = r5.A01
            int r1 = r5.getInt(r0, r4)
            r0 = 3
            if (r1 >= r0) goto L_0x02a5
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.DAYS
            r0 = 7
            long r11 = r8.toMillis(r0)
            java.lang.String r6 = X.1Av.A01(r6)
            if (r6 == 0) goto L_0x029e
            java.lang.String r0 = "last_time_dismissed_ci_upsell_feed_"
            java.lang.String r9 = X.002.A0R(r0, r6)
            r0 = 0
            long r0 = r5.getLong(r9, r0)
        L_0x0111:
            long r9 = r13 - r0
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x02a5
            if (r6 == 0) goto L_0x0126
            java.lang.String r0 = "num_times_seen_ci_upsell_feed_"
            java.lang.String r0 = X.002.A0R(r0, r6)
            int r1 = r5.getInt(r0, r4)
            r0 = 5
            if (r1 < r0) goto L_0x0151
        L_0x0126:
            r0 = 90
            long r9 = r8.toMillis(r0)
            if (r6 == 0) goto L_0x0297
            java.lang.String r0 = "last_time_seen_ci_upsell_feed_"
            java.lang.String r8 = X.002.A0R(r0, r6)
            r0 = 0
            long r0 = r5.getLong(r8, r0)
        L_0x013a:
            long r13 = r13 - r0
            int r0 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x02a5
            if (r6 == 0) goto L_0x0151
            java.lang.String r0 = "num_times_seen_ci_upsell_feed_"
            java.lang.String r1 = X.002.A0R(r0, r6)
            X.0xY r0 = r5.AR4()
            r0.E5Z(r1, r4)
            r0.apply()
        L_0x0151:
            X.3UH r0 = r15.A03
            if (r0 == 0) goto L_0x0200
            java.util.List r0 = r0.A0P
            if (r0 == 0) goto L_0x0200
            r7 = 0
            int r4 = r0.size()
        L_0x015e:
            if (r7 >= r4) goto L_0x0200
            X.3UH r0 = r15.A03
            if (r0 == 0) goto L_0x0293
            java.util.List r1 = r0.A0P
            if (r1 == 0) goto L_0x0293
            int r0 = r1.size()
            if (r7 >= r0) goto L_0x0293
            java.lang.Object r0 = r1.get(r7)
            X.3UI r0 = (X.AnonymousClass3UI) r0
            if (r0 == 0) goto L_0x0293
            X.3UO r1 = r0.A07
            X.3UO r0 = X.AnonymousClass3UO.INVITE_UPSELL
            if (r1 != r0) goto L_0x0293
            boolean r0 = r15.A06
            if (r0 == 0) goto L_0x0286
            X.1Av r5 = X.1Au.A00(r2)
            long r13 = java.lang.System.currentTimeMillis()
            X.3UH r0 = r15.A03
            r4 = 0
            if (r0 == 0) goto L_0x0286
            X.1UQ r6 = r0.B5J()
            java.lang.String r1 = X.1Av.A01(r6)
            if (r1 == 0) goto L_0x0286
            java.lang.String r0 = "num_times_dismissed_invite_upsell_feed"
            java.lang.String r0 = X.002.A0R(r0, r1)
            X.0xa r5 = r5.A01
            int r1 = r5.getInt(r0, r4)
            r0 = 3
            if (r1 >= r0) goto L_0x0286
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.DAYS
            r0 = 7
            long r11 = r8.toMillis(r0)
            java.lang.String r6 = X.1Av.A01(r6)
            if (r6 == 0) goto L_0x027f
            java.lang.String r0 = "last_time_dismissed_invite_upsell_feed"
            java.lang.String r9 = X.002.A0R(r0, r6)
            r0 = 0
            long r0 = r5.getLong(r9, r0)
        L_0x01c0:
            long r9 = r13 - r0
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x0286
            if (r6 == 0) goto L_0x01d5
            java.lang.String r0 = "num_times_seen_invite_upsell_feed"
            java.lang.String r0 = X.002.A0R(r0, r6)
            int r1 = r5.getInt(r0, r4)
            r0 = 5
            if (r1 < r0) goto L_0x0200
        L_0x01d5:
            r0 = 90
            long r9 = r8.toMillis(r0)
            if (r6 == 0) goto L_0x0278
            java.lang.String r0 = "last_time_seen_invite_upsell_feed"
            java.lang.String r8 = X.002.A0R(r0, r6)
            r0 = 0
            long r0 = r5.getLong(r8, r0)
        L_0x01e9:
            long r13 = r13 - r0
            int r0 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x0286
            if (r6 == 0) goto L_0x0200
            java.lang.String r0 = "num_times_seen_invite_upsell_feed"
            java.lang.String r1 = X.002.A0R(r0, r6)
            X.0xY r0 = r5.AR4()
            r0.E5Z(r1, r4)
            r0.apply()
        L_0x0200:
            java.util.Set r0 = r15.A0J
            r0.clear()
            X.3UH r4 = r15.A03
            if (r4 == 0) goto L_0x0276
            X.1UQ r1 = r4.B5J()
        L_0x020d:
            X.1UQ r0 = X.1UQ.A0v
            if (r1 == r0) goto L_0x021b
            if (r4 == 0) goto L_0x0217
            X.1UQ r3 = r4.B5J()
        L_0x0217:
            X.1UQ r0 = X.1UQ.A0r
            if (r3 != r0) goto L_0x026f
        L_0x021b:
            X.4aa r3 = r15.A0E
            boolean r0 = r3.A09
            if (r0 != 0) goto L_0x026f
            r1 = 1
            r3.A09 = r1
            r3 = 36327713858009736(0x810fdd00023a88, double:3.037130751543261E-306)
            X.1AA r0 = X.182.A02(r2, r3)
            if (r0 == 0) goto L_0x026f
            X.0Tu r5 = X.0Tu.A04
            boolean r0 = r0.Ah0(r5, r3)
            if (r0 != r1) goto L_0x026f
            X.3UH r0 = r15.A03
            r17 = 0
            if (r0 == 0) goto L_0x026f
            java.util.List r0 = r0.A0P
            if (r0 == 0) goto L_0x026f
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            X.12T r3 = X.AnonymousClass12T.A00
            r1 = 879196953(0x34677b19, float:2.1558334E-7)
            r0 = 3
            X.0nV r0 = r3.AOJ(r1, r0)
            X.19S r18 = X.19E.A02(r0)
            r0 = 36609188834973514(0x820fdd0006174a, double:3.2151366603839125E-306)
            X.1AA r2 = X.182.A02(r2, r0)
            if (r2 == 0) goto L_0x0273
            long r19 = r2.BOa(r5, r0)
        L_0x0263:
            X.9KG r14 = new X.9KG
            r16 = r4
            r14.<init>(r15, r16, r17, r18, r19)
            X.19B r0 = X.19B.A00
            X.C67351tA.A00(r0, r14)
        L_0x026f:
            r15.notifyDataSetChanged()
            return
        L_0x0273:
            r19 = 5000(0x1388, double:2.4703E-320)
            goto L_0x0263
        L_0x0276:
            r1 = r3
            goto L_0x020d
        L_0x0278:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x01e9
        L_0x027f:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x01c0
        L_0x0286:
            X.3UH r0 = r15.A03
            if (r0 == 0) goto L_0x0200
            java.util.List r0 = r0.A0P
            if (r0 == 0) goto L_0x0200
            r0.remove(r7)
            goto L_0x0200
        L_0x0293:
            int r7 = r7 + 1
            goto L_0x015e
        L_0x0297:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x013a
        L_0x029e:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x0111
        L_0x02a5:
            X.3UH r0 = r15.A03
            if (r0 == 0) goto L_0x0151
            java.util.List r0 = r0.A0P
            if (r0 == 0) goto L_0x0151
            r0.remove(r7)
            goto L_0x0151
        L_0x02b2:
            int r7 = r7 + 1
            goto L_0x00b3
        L_0x02b6:
            r1 = r3
            goto L_0x009b
        L_0x02b9:
            r1 = r3
            goto L_0x0084
        L_0x02bc:
            r1 = r3
            goto L_0x0062
        L_0x02bf:
            r0 = 0
            goto L_0x0067
        L_0x02c2:
            r1 = r3
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C292975jp.A02(X.3UH):void");
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v18, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v59, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v66, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r1v19, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r1v32, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    /* JADX WARNING: type inference failed for: r5v6, types: [android.widget.TextView, com.instagram.common.ui.text.TightTextView] */
    /* JADX WARNING: type inference failed for: r5v7, types: [android.widget.TextView, com.instagram.common.ui.text.TightTextView] */
    /* JADX WARNING: type inference failed for: r5v9, types: [android.widget.TextView, com.instagram.common.ui.text.TightTextView] */
    /* JADX WARNING: type inference failed for: r4v3, types: [android.widget.TextView, com.instagram.common.ui.text.TightTextView] */
    /* JADX WARNING: type inference failed for: r5v11 */
    /* JADX WARNING: type inference failed for: r5v12 */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02ad, code lost:
        r33 = r0.getDimensionPixelSize(com.instagram.android.R.dimen.asset_picker_cell_margin);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02b3, code lost:
        r28 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02b7, code lost:
        r1 = r2.A05;
        r1.setVisibility(8);
        r1.setImageDrawable((android.graphics.drawable.Drawable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0599, code lost:
        if (r3.A06 != false) goto L_0x03af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x059d, code lost:
        if (r9 != X.AnonymousClass3UO.A06) goto L_0x03b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0189, code lost:
        if (r15 != X.1UQ.A0v) goto L_0x018b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01a0, code lost:
        if (r14 == X.1UQ.A0r) goto L_0x01a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01a2, code lost:
        r14 = r3.A09;
        X.0nA.A0T(r11, (int) X.C295305nv.A00(r14, 3));
        r5.setGravity(8388627);
        r5.A00 = true;
        r32 = r6.getSocialContextFacepileUsers();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01b8, code lost:
        if (r32 == null) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c0, code lost:
        if ((!r32.isEmpty()) == false) goto L_0x02b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01c2, code lost:
        r13 = X.0Tu.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01cd, code lost:
        if (X.182.A06(r13, r7, 36325484769850347L) == false) goto L_0x02b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01cf, code lost:
        r28 = java.lang.Integer.valueOf(r14.getColor(X.2Yu.A0H(r14, com.instagram.android.R.attr.igds_color_elevated_background)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01de, code lost:
        r15 = r2.A05;
        r31 = r8.getModuleName();
        r16 = X.182.A06(r13, r7, 36323796847767056L);
        r0 = r14.getResources();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01f6, code lost:
        if (r16 == false) goto L_0x02ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01f8, code lost:
        r33 = r0.getDimensionPixelSize(com.instagram.android.R.dimen.abc_dropdownitem_icon_width);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01ff, code lost:
        r15.setImageDrawable(X.C244283aw.A04(r14, (android.graphics.drawable.Drawable) null, java.lang.Float.valueOf(0.6f), X.AnonymousClass05K.A01, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, r28, (java.lang.Integer) null, (java.lang.Integer) null, r31, r32, r33, X.182.A06(r13, r7, 36325501949719552L), true, false, true, false));
        r15.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0233, code lost:
        r5.A01 = true;
        r5.setBreakStrategy(2);
     */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0326  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x032c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0449  */
    /* JADX WARNING: Removed duplicated region for block: B:214:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:215:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:217:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0125  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBindViewHolder(X.C249703kE r44, int r45) {
        /*
            r43 = this;
            r2 = r44
            r4 = 0
            X.0qQ.A0B(r2, r4)
            r3 = r43
            com.instagram.common.session.UserSession r7 = r3.A0C
            X.0Tu r13 = X.0Tu.A06
            r0 = 36327713858402954(0x810fdd00083a8a, double:3.037130751791934E-306)
            boolean r0 = X.182.A06(r13, r7, r0)
            r42 = r45
            if (r0 == 0) goto L_0x0306
            boolean r0 = r2 instanceof X.C68036Mz3
            if (r0 != 0) goto L_0x0312
            boolean r0 = r2 instanceof X.C293735lG
            if (r0 == 0) goto L_0x0124
        L_0x0021:
            X.5lG r2 = (X.C293735lG) r2
            X.3UH r1 = r3.A03
            r9 = 0
            if (r1 == 0) goto L_0x0124
            r0 = r42
            X.3UI r0 = r1.A02(r0)
            if (r0 == 0) goto L_0x0124
            X.3UL r6 = r0.A00()
            if (r6 == 0) goto L_0x0124
            com.instagram.user.model.User r0 = r6.A03
            r41 = r0
            r41.getClass()
            com.instagram.common.typedurl.ImageUrl r0 = r6.A00
            r12 = 1
            r20 = 0
            r39 = 0
            if (r0 == 0) goto L_0x0048
            r39 = 1
        L_0x0048:
            android.view.View r0 = r2.A01
            r40 = r0
            X.5lg r1 = new X.5lg
            r33 = r1
            r34 = r2
            r35 = r3
            r36 = r41
            r37 = r6
            r38 = r42
            r33.<init>(r34, r35, r36, r37, r38, r39)
            X.AnonymousClass0fU.A00(r1, r0)
            java.lang.Integer r1 = r3.A0H
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 == r0) goto L_0x02f9
            com.instagram.model.mediasize.ExtendedImageUrl r1 = r6.A01
            if (r1 == 0) goto L_0x02f9
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r2.A09
            X.0iw r8 = r3.A0B
            r0.setUrl(r1, r8)
        L_0x0071:
            android.widget.TextView r11 = r2.A07
            boolean r0 = r41.isVerified()
            X.C244273av.A0B(r11, r0)
            android.view.View r1 = r2.A02
            X.5lh r0 = new X.5lh
            r33 = r0
            r33.<init>(r34, r35, r36, r37, r38, r39)
            X.AnonymousClass0fU.A00(r0, r1)
            X.3UH r0 = r3.A03
            if (r0 == 0) goto L_0x02f6
            X.1UQ r10 = r0.B5J()
        L_0x008e:
            X.1UQ r5 = X.1UQ.A0o
            r0 = 8
            com.instagram.ui.widget.textview.UpdatableButton r1 = r2.A0B
            if (r10 != r5) goto L_0x0146
            if (r1 == 0) goto L_0x009b
            r1.setVisibility(r4)
        L_0x009b:
            X.5le r8 = r2.A00
            if (r8 == 0) goto L_0x00b3
            com.instagram.user.model.User r5 = r6.A03
            X.0qQ.A0B(r5, r4)
            boolean r1 = r5.A1z()
            if (r1 == 0) goto L_0x0142
            java.lang.Integer r1 = X.AnonymousClass05K.A00
        L_0x00ac:
            r8.A01 = r1
            r8.A00 = r5
            X.C293975le.A01(r8)
        L_0x00b3:
            com.instagram.common.ui.text.TightTextView r4 = r2.A08
            com.instagram.user.model.User r1 = r6.A03
            java.lang.String r1 = r1.getFullName()
            r4.setText(r1)
            com.instagram.user.follow.FollowButton r1 = r2.A0C
            r1.setVisibility(r0)
        L_0x00c3:
            java.lang.String r0 = r41.getUsername()
        L_0x00c7:
            r11.setText(r0)
            android.view.View r1 = r2.A03
            if (r1 == 0) goto L_0x00d9
            boolean r0 = r6.A0D
            if (r0 != 0) goto L_0x00d4
            r20 = 8
        L_0x00d4:
            r0 = r20
            r1.setVisibility(r0)
        L_0x00d9:
            if (r39 == 0) goto L_0x0125
            java.lang.String r0 = r6.A06
            if (r0 == 0) goto L_0x0125
            java.util.Set r1 = r3.A0J
            java.lang.String r0 = r41.getId()
            boolean r0 = r1.add(r0)
            if (r0 == 0) goto L_0x0125
            java.lang.String r10 = r6.A06
            if (r10 == 0) goto L_0x0105
            X.5js r8 = r3.A0G
            java.lang.String r9 = r41.getId()
            java.lang.String r11 = "feed_timeline"
            java.lang.String r12 = r41.A0P()
            r15 = -1
            java.lang.String r0 = r6.A05
            r13 = r0
            r14 = r42
            r8.A04(r9, r10, r11, r12, r13, r14, r15)
        L_0x0105:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325484769850347(0x810dd6000033eb, double:3.035721067215446E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x0124
            android.content.Context r6 = r3.A09
        L_0x0114:
            r0 = 2130968861(0x7f04011d, float:1.7546388E38)
            int r0 = X.2Yu.A0H(r6, r0)
            android.graphics.drawable.Drawable r1 = r6.getDrawable(r0)
            r0 = r40
            r0.setBackground(r1)
        L_0x0124:
            return
        L_0x0125:
            X.3UH r1 = r3.A03
            if (r1 == 0) goto L_0x012e
            X.2on r0 = r3.A0F
            r0.A00(r1, r6)
        L_0x012e:
            X.2on r0 = r3.A0F
            X.2el r2 = r0.A00
            X.2oe r1 = r0.A01
            java.lang.String r0 = r6.getId()
            X.30Y r1 = r1.A00(r0)
            r0 = r40
            r2.A05(r0, r1)
            goto L_0x0105
        L_0x0142:
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            goto L_0x00ac
        L_0x0146:
            if (r1 == 0) goto L_0x014b
            r1.setVisibility(r0)
        L_0x014b:
            boolean r19 = r41.A2A()
            com.instagram.user.follow.FollowButton r10 = r2.A0C
            r1 = r19
            r10.A0A = r1
            com.instagram.common.typedurl.ImageUrl r5 = r6.A00
            r18 = 2
            android.view.ViewGroup r1 = r2.A04
            if (r5 == 0) goto L_0x02e5
            r1.setVisibility(r4)
            com.instagram.common.typedurl.ImageUrl r5 = r6.A00
            if (r5 == 0) goto L_0x0169
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = r2.A0A
            r1.setUrl(r5, r8)
        L_0x0169:
            com.instagram.common.ui.text.TightTextView r5 = r2.A08
            r5.setLines(r12)
        L_0x016e:
            java.lang.String r1 = r6.A05
            r5.setText(r1)
            r14 = 36315172553362484(0x81047500000c34, double:3.0291995799845585E-306)
            boolean r14 = X.182.A06(r13, r7, r14)
            r1 = 3
            if (r14 == 0) goto L_0x018b
            X.3UH r14 = r3.A03
            if (r14 == 0) goto L_0x02e2
            X.1UQ r15 = r14.B5J()
        L_0x0187:
            X.1UQ r14 = X.1UQ.A0v
            if (r15 == r14) goto L_0x01a2
        L_0x018b:
            r14 = 36315172553559093(0x81047500030c35, double:3.029199580108895E-306)
            boolean r13 = X.182.A06(r13, r7, r14)
            if (r13 == 0) goto L_0x02c4
            X.3UH r13 = r3.A03
            if (r13 == 0) goto L_0x02c1
            X.1UQ r14 = r13.B5J()
        L_0x019e:
            X.1UQ r13 = X.1UQ.A0r
            if (r14 != r13) goto L_0x02c4
        L_0x01a2:
            android.content.Context r14 = r3.A09
            float r1 = X.C295305nv.A00(r14, r1)
            int r1 = (int) r1
            X.0nA.A0T(r11, r1)
            r1 = 8388627(0x800013, float:1.175497E-38)
            r5.setGravity(r1)
            r5.A00 = r12
            com.google.common.collect.ImmutableList r32 = r6.getSocialContextFacepileUsers()
            if (r32 == 0) goto L_0x0233
            boolean r1 = r32.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x02b7
            X.0Tu r13 = X.0Tu.A05
            r0 = 36325484769850347(0x810dd6000033eb, double:3.035721067215446E-306)
            boolean r0 = X.182.A06(r13, r7, r0)
            if (r0 == 0) goto L_0x02b3
            r0 = 2130970208(0x7f040660, float:1.754912E38)
            int r0 = X.2Yu.A0H(r14, r0)
            int r0 = r14.getColor(r0)
            java.lang.Integer r28 = java.lang.Integer.valueOf(r0)
        L_0x01de:
            android.widget.ImageView r15 = r2.A05
            java.lang.String r31 = r8.getModuleName()
            r16 = 36323796847767056(0x810c4d00012e10, double:3.034653618493256E-306)
            r0 = r16
            boolean r16 = X.182.A06(r13, r7, r0)
            android.content.res.Resources r0 = r14.getResources()
            r1 = 2131165285(0x7f070065, float:1.7944783E38)
            if (r16 == 0) goto L_0x02ad
            r1 = 2131165205(0x7f070015, float:1.794462E38)
            int r33 = r0.getDimensionPixelSize(r1)
        L_0x01ff:
            java.lang.Integer r24 = X.AnonymousClass05K.A01
            r16 = 36325501949719552(0x810dda00003400, double:3.035731931833909E-306)
            r0 = r16
            boolean r34 = X.182.A06(r13, r7, r0)
            r0 = 1058642330(0x3f19999a, float:0.6)
            java.lang.Float r23 = java.lang.Float.valueOf(r0)
            r25 = r9
            r26 = r9
            r27 = r9
            r29 = r9
            r30 = r9
            r35 = r12
            r36 = r4
            r37 = r12
            r38 = r4
            r21 = r14
            r22 = r9
            X.3b0 r0 = X.C244283aw.A04(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            r15.setImageDrawable(r0)
            r15.setVisibility(r4)
        L_0x0233:
            r5.A01 = r12
            r0 = r18
            r5.setBreakStrategy(r0)
        L_0x023a:
            r10.setVisibility(r4)
            X.0xF r4 = new X.0xF
            r4.<init>()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r19)
            java.lang.String r0 = "can_show_follow_back"
            X.0xF.A00(r4, r1, r0)
            boolean r0 = r41.A2A()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "following_current_user"
            X.0xF.A00(r4, r1, r0)
            X.3UH r0 = r3.A03
            if (r0 == 0) goto L_0x0265
            java.lang.String r1 = r0.A0C
            if (r1 == 0) goto L_0x0265
            java.lang.String r0 = "insertion_context"
            X.0xF.A00(r4, r1, r0)
        L_0x0265:
            java.lang.String r1 = "format"
            java.lang.String r0 = "profile"
            X.0xF.A00(r4, r0, r1)
            X.3UH r0 = r3.A03
            if (r0 == 0) goto L_0x0274
            java.lang.String r9 = r0.getId()
        L_0x0274:
            java.lang.String r0 = "unit_id"
            X.0xF.A00(r4, r9, r0)
            X.4at r1 = r10.A0J
            X.5li r0 = new X.5li
            r34 = r0
            r35 = r2
            r36 = r3
            r37 = r6
            r38 = r42
            r34.<init>(r35, r36, r37, r38, r39)
            r1.A07(r0)
            r1.A03 = r4
            r0 = r41
            r1.A03(r8, r7, r0)
            java.lang.String r0 = r41.getId()
            X.C267154b3.A02(r10, r7, r0)
            java.lang.String r0 = r41.getFullName()
            if (r0 == 0) goto L_0x00c3
            int r0 = r0.length()
            if (r0 == 0) goto L_0x00c3
            java.lang.String r0 = r41.getFullName()
            goto L_0x00c7
        L_0x02ad:
            int r33 = r0.getDimensionPixelSize(r1)
            goto L_0x01ff
        L_0x02b3:
            r28 = r9
            goto L_0x01de
        L_0x02b7:
            android.widget.ImageView r1 = r2.A05
            r1.setVisibility(r0)
            r1.setImageDrawable(r9)
            goto L_0x0233
        L_0x02c1:
            r14 = r9
            goto L_0x019e
        L_0x02c4:
            android.widget.ImageView r13 = r2.A05
            r13.setVisibility(r0)
            r13.setImageDrawable(r9)
            android.content.Context r0 = r3.A09
            float r0 = X.C295305nv.A00(r0, r1)
            int r0 = (int) r0
            X.0nA.A0T(r11, r0)
            r0 = 17
            r5.setGravity(r0)
            r5.A01 = r4
            r5.setBreakStrategy(r12)
            goto L_0x023a
        L_0x02e2:
            r15 = r9
            goto L_0x0187
        L_0x02e5:
            r1.setVisibility(r0)
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = r2.A0A
            r1.setImageDrawable(r9)
            com.instagram.common.ui.text.TightTextView r5 = r2.A08
            r1 = r18
            r5.setLines(r1)
            goto L_0x016e
        L_0x02f6:
            r10 = r9
            goto L_0x008e
        L_0x02f9:
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = r2.A09
            com.instagram.common.typedurl.ImageUrl r0 = r41.Bh3()
            X.0iw r8 = r3.A0B
            r1.setUrl(r0, r8)
            goto L_0x0071
        L_0x0306:
            r0 = r42
            int r1 = r3.getItemViewType(r0)
            if (r1 == 0) goto L_0x0021
            r0 = 1
            if (r1 == r0) goto L_0x0312
            return
        L_0x0312:
            X.Mz3 r2 = (X.C68036Mz3) r2
            X.3UH r1 = r3.A03
            if (r1 == 0) goto L_0x05c4
            r0 = r42
            X.3UI r0 = r1.A02(r0)
            if (r0 == 0) goto L_0x05c4
            X.3UN r10 = r0.A06
            boolean r0 = r10 instanceof X.C266904aX
            if (r0 == 0) goto L_0x05c4
            X.4aX r10 = (X.C266904aX) r10
        L_0x0328:
            X.3UH r11 = r3.A03
            if (r11 == 0) goto L_0x0124
            if (r10 == 0) goto L_0x0124
            X.3UO r9 = r10.C2m()
            long r16 = java.lang.System.currentTimeMillis()
            android.view.View r1 = r2.A01
            X.OjJ r0 = new X.OjJ
            r18 = r0
            r19 = r2
            r20 = r3
            r21 = r10
            r22 = r11
            r23 = r42
            r24 = r16
            r18.<init>(r19, r20, r21, r22, r23, r24)
            X.AnonymousClass0fU.A00(r0, r1)
            android.widget.TextView r13 = r2.A04
            X.4Zk r12 = r10.A00
            java.lang.String r0 = r12.A03
            r13.setText(r0)
            X.3UO r8 = X.AnonymousClass3UO.INVITE_UPSELL
            if (r9 != r8) goto L_0x035f
            boolean r0 = r3.A06
            if (r0 != 0) goto L_0x05a1
        L_0x035f:
            X.3UO r0 = X.AnonymousClass3UO.DP_UPSELL
            if (r9 == r0) goto L_0x05a1
            android.widget.TextView r1 = r2.A03
            r1.setVisibility(r4)
            java.lang.String r0 = r12.A02
            r1.setText(r0)
            android.content.Context r6 = r3.A09
            float r0 = X.C295305nv.A00(r6, r4)
            int r0 = (int) r0
            X.0nA.A0X(r13, r0)
            r0 = 3
            r13.setMaxLines(r0)
        L_0x037b:
            com.instagram.igds.components.button.IgdsButton r15 = r2.A07
            java.lang.String r0 = r12.A01
            r15.setText((java.lang.String) r0)
            X.Oj4 r14 = new X.Oj4
            r0 = r42
            r14.<init>(r3, r10, r11, r0)
            X.3UO r5 = X.AnonymousClass3UO.CI_UPSELL
            if (r9 != r5) goto L_0x0595
            boolean r0 = r3.A07
            if (r0 == 0) goto L_0x059b
            r0 = 6
            float r0 = X.C295305nv.A00(r6, r0)
            int r0 = (int) r0
            X.0nA.A0X(r13, r0)
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1.setMaxLines(r0)
            android.content.res.Resources r13 = r6.getResources()
            r0 = 2131165216(0x7f070020, float:1.7944643E38)
            int r0 = r13.getDimensionPixelSize(r0)
            float r0 = (float) r0
            r1.setTextSize(r4, r0)
        L_0x03af:
            android.view.View r15 = r2.A00
        L_0x03b1:
            X.AnonymousClass0fU.A00(r14, r15)
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = r2.A05
            r1.clearColorFilter()
            X.3UO r0 = r10.C2m()
            int r14 = r0.ordinal()
            r0 = 6
            r13 = 8
            if (r14 == r0) goto L_0x0555
            r0 = 1
            if (r14 == r0) goto L_0x0533
            r0 = 2
            r12 = 10
            if (r14 == r0) goto L_0x04e2
            r0 = 3
            if (r14 == r0) goto L_0x0512
            java.lang.String r1 = "SuggestedItemsAdapter"
            java.lang.String r0 = "Unhandled suggested upsell `SuggestedItemType`. Please fix ASAP because otherwise the icon for your upsell will be totally empty. "
            X.0wb.A03(r1, r0)
        L_0x03d8:
            X.3UO r0 = r10.C2m()
            int r1 = r0.ordinal()
            r13 = 1
            r0 = 6
            if (r1 == r0) goto L_0x04a7
            r0 = 2
            if (r1 == r0) goto L_0x0483
            r0 = 3
            if (r1 != r0) goto L_0x03f3
            X.EZn r1 = X.C48145EZn.FEED_SUGGESTED_USERS
            boolean r0 = X.C267044ar.A01(r6, r7)
            X.C49947FGb.A05(r1, r7, r0)
        L_0x03f3:
            if (r9 != r5) goto L_0x044f
            boolean r0 = r3.A07
            if (r0 == 0) goto L_0x043c
            X.1Av r1 = X.1Au.A00(r7)
            X.1UQ r0 = r11.B5J()
            java.lang.String r5 = X.1Av.A01(r0)
            if (r5 == 0) goto L_0x043c
            java.lang.String r0 = "num_times_seen_ci_upsell_feed_"
            java.lang.String r3 = X.002.A0R(r0, r5)
            X.0xa r8 = r1.A01
            int r0 = r8.getInt(r3, r4)
            X.0xY r1 = r8.AR4()
            int r0 = r0 + 1
            r1.E5Z(r3, r0)
            r1.apply()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "last_time_seen_ci_upsell_feed_"
        L_0x0426:
            r1.append(r0)
            r1.append(r5)
            java.lang.String r4 = r1.toString()
            X.0xY r3 = r8.AR4()
            r0 = r16
            r3.E5c(r4, r0)
            r3.apply()
        L_0x043c:
            X.0Tu r3 = X.0Tu.A05
            r0 = 36325484769850347(0x810dd6000033eb, double:3.035721067215446E-306)
            boolean r0 = X.182.A06(r3, r7, r0)
            if (r0 == 0) goto L_0x0124
            android.view.View r0 = r2.A00
            r40 = r0
            goto L_0x0114
        L_0x044f:
            if (r9 != r8) goto L_0x043c
            boolean r0 = r3.A06
            if (r0 == 0) goto L_0x043c
            X.1Av r1 = X.1Au.A00(r7)
            X.1UQ r0 = r11.B5J()
            java.lang.String r5 = X.1Av.A01(r0)
            if (r5 == 0) goto L_0x043c
            java.lang.String r0 = "num_times_seen_invite_upsell_feed"
            java.lang.String r3 = X.002.A0R(r0, r5)
            X.0xa r8 = r1.A01
            int r0 = r8.getInt(r3, r4)
            X.0xY r1 = r8.AR4()
            int r0 = r0 + 1
            r1.E5Z(r3, r0)
            r1.apply()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "last_time_seen_invite_upsell_feed"
            goto L_0x0426
        L_0x0483:
            boolean r0 = r3.A04
            if (r0 != 0) goto L_0x03f3
            X.6cm r12 = r3.A01
            if (r12 != 0) goto L_0x0494
            X.0iw r0 = r3.A0B
            X.6cm r12 = new X.6cm
            r12.<init>(r0, r7)
            r3.A01 = r12
        L_0x0494:
            java.lang.String r10 = A00(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r42)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r12.A01(r0, r1, r10)
            r3.A04 = r13
            goto L_0x03f3
        L_0x04a7:
            boolean r0 = r3.A05
            if (r0 != 0) goto L_0x03f3
            X.OFR r15 = r3.A02
            if (r15 != 0) goto L_0x04b8
            X.0iw r0 = r3.A0B
            X.OFR r15 = new X.OFR
            r15.<init>(r0, r7)
            r3.A02 = r15
        L_0x04b8:
            java.lang.String r14 = A00(r3)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r42)
            X.0wc r10 = r15.A00
            java.lang.String r1 = "discover_people_upsell_impression"
            X.0kJ r0 = r10.A00
            X.0Aj r10 = r10.A00(r0, r1)
            java.lang.String r1 = r15.A01
            java.lang.String r0 = "module"
            r10.AAJ(r0, r1)
            java.lang.String r0 = "view_module"
            r10.AAJ(r0, r14)
            java.lang.String r0 = "position"
            r10.A8k(r0, r12)
            r10.Cgf()
            r3.A05 = r13
            goto L_0x03f3
        L_0x04e2:
            r1.setVisibility(r4)
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r2.A06
            r0.setVisibility(r13)
            android.widget.ImageView r0 = r2.A02
            r0.setVisibility(r13)
            r14 = 2131238154(0x7f081d0a, float:1.8092579E38)
            java.lang.Integer r13 = r3.A0H
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r13 != r0) goto L_0x04ff
            boolean r0 = r3.A07
            if (r0 == 0) goto L_0x04ff
            r14 = 2131237562(0x7f081aba, float:1.8091378E38)
        L_0x04ff:
            android.graphics.drawable.Drawable r0 = r6.getDrawable(r14)
            r1.setImageDrawable(r0)
            boolean r0 = r3.A07
            if (r0 != 0) goto L_0x0529
            r0 = 2130970128(0x7f040610, float:1.7548957E38)
            int r0 = X.2Yu.A0H(r6, r0)
            goto L_0x0548
        L_0x0512:
            r1.setVisibility(r13)
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = r2.A06
            r1.setVisibility(r4)
            android.widget.ImageView r0 = r2.A02
            r0.setVisibility(r13)
            r0 = 2131237623(0x7f081af7, float:1.8091502E38)
            android.graphics.drawable.Drawable r0 = r6.getDrawable(r0)
            r1.setImageDrawable(r0)
        L_0x0529:
            float r0 = X.0nA.A04(r6, r12)
            int r0 = (int) r0
            r1.setPadding(r0, r0, r0, r0)
            goto L_0x03d8
        L_0x0533:
            r1.setVisibility(r4)
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r2.A06
            r0.setVisibility(r13)
            r0 = 2131231789(0x7f08042d, float:1.8079669E38)
            android.graphics.drawable.Drawable r0 = r6.getDrawable(r0)
            r1.setImageDrawable(r0)
            r0 = 2131100342(0x7f0602b6, float:1.7813063E38)
        L_0x0548:
            int r0 = r6.getColor(r0)
            android.graphics.ColorFilter r0 = X.AnonymousClass37O.A00(r0)
            r1.setColorFilter(r0)
            goto L_0x03d8
        L_0x0555:
            r1.setVisibility(r13)
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r2.A06
            r0.setVisibility(r13)
            android.widget.ImageView r1 = r2.A02
            X.0iw r0 = r3.A0B
            java.lang.String r21 = r0.getModuleName()
            java.util.List r0 = r12.A05
            if (r0 != 0) goto L_0x056b
            X.0sn r0 = X.0sn.A00
        L_0x056b:
            android.content.res.Resources r13 = r6.getResources()
            r12 = 2131165289(0x7f070069, float:1.794479E38)
            int r23 = r13.getDimensionPixelSize(r12)
            java.lang.Integer r20 = X.AnonymousClass05K.A01
            r12 = 1058642330(0x3f19999a, float:0.6)
            java.lang.Float r19 = java.lang.Float.valueOf(r12)
            r25 = 1
            r22 = r0
            r24 = r4
            r26 = r4
            r18 = r6
            android.graphics.drawable.Drawable r0 = X.C244283aw.A01(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r1.setImageDrawable(r0)
            r1.setVisibility(r4)
            goto L_0x03d8
        L_0x0595:
            if (r9 != r8) goto L_0x059b
            boolean r0 = r3.A06
            if (r0 != 0) goto L_0x03af
        L_0x059b:
            X.3UO r0 = X.AnonymousClass3UO.DP_UPSELL
            if (r9 != r0) goto L_0x03b1
            goto L_0x03af
        L_0x05a1:
            android.widget.TextView r1 = r2.A03
            r0 = 8
            r1.setVisibility(r0)
            android.content.Context r6 = r3.A09
            r0 = 26
            float r0 = X.C295305nv.A00(r6, r0)
            int r0 = (int) r0
            X.0nA.A0X(r13, r0)
            r0 = 2
            r13.setLines(r0)
            r0 = 130(0x82, float:1.82E-43)
            float r0 = X.C295305nv.A00(r6, r0)
            int r0 = (int) r0
            r13.setWidth(r0)
            goto L_0x037b
        L_0x05c4:
            r10 = 0
            goto L_0x0328
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C292975jp.onBindViewHolder(X.3kE, int):void");
    }

    public final int getItemCount() {
        int i;
        int i2;
        int A032 = AnonymousClass0fD.A03(116098169);
        AnonymousClass3UH r0 = this.A03;
        if (r0 != null) {
            List list = r0.A0P;
            if (list != null) {
                i = list.size();
            } else {
                i = 0;
            }
            i2 = -309438366;
        } else {
            i = 0;
            i2 = -1952085330;
        }
        AnonymousClass0fD.A0A(i2, A032);
        return i;
    }

    public final int getItemViewType(int i) {
        AnonymousClass3UO r0;
        int i2;
        int i3;
        AnonymousClass3UI A022;
        int A032 = AnonymousClass0fD.A03(-312481517);
        AnonymousClass3UH r02 = this.A03;
        if (r02 == null || (A022 = r02.A02(i)) == null) {
            r0 = null;
        } else {
            r0 = A022.A07;
        }
        if (r0 != null) {
            int ordinal = r0.ordinal();
            int i4 = 1;
            if (ordinal == 6 || ordinal == 1 || ordinal == 2 || ordinal == 3) {
                i3 = 717046396;
            } else {
                i4 = 0;
                i2 = -231331650;
                if (ordinal == 0) {
                    i3 = 1080099793;
                }
            }
            AnonymousClass0fD.A0A(i3, A032);
            return i4;
        }
        i2 = -698870369;
        AnonymousClass0fD.A0A(i2, A032);
        return -1;
    }
}
