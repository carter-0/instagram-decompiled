package X;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.lang.ref.WeakReference;

/* renamed from: X.6Z0  reason: invalid class name */
public final class AnonymousClass6Z0 implements C252243on, AnonymousClass6Z1, AnonymousClass6Z2 {
    public UserSession A00;
    public C314976j9 A01;
    public C315396jp A02;
    public AnonymousClass32V A03;
    public AnonymousClass3BQ A04;
    public C314966j8 A05;
    public C315416jr A06;
    public C315356jl A07;
    public C314496iM A08;
    public C315376jn A09;
    public C314626ia A0A;
    public C314766io A0B;
    public C314716ij A0C;
    public C311676d4 A0D;
    public C315446ju A0E;
    public C315456jv A0F;
    public C315466jw A0G;
    public C315006jC A0H;
    public C315436jt A0I;
    public C315496jz A0J;
    public C315346jk A0K;
    public C314796ir A0L;
    public C314756in A0M;
    public C314776ip A0N;
    public C314786iq A0O;
    public AnonymousClass6ZN A0P;
    public String A0Q;
    public VYH A0R;
    public boolean A0S;
    public final AnonymousClass0iw A0T;
    public final C273384mU A0U;
    public final WeakReference A0V;
    public final C273434mZ A0W;
    public final AnonymousClass6Z4 A0X = new AnonymousClass6Z4(this);

    public final /* synthetic */ void ADC(View view) {
    }

    public final void Cvb() {
    }

    public final /* synthetic */ void D6z(View view) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0583, code lost:
        if (X.C314496iM.A01(r12, r8) == true) goto L_0x0585;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0585, code lost:
        r1 = r4.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0587, code lost:
        if (r1 == null) goto L_0x0591;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0589, code lost:
        r1.A03(new X.C65584LwI(r10, r5, r4, r8), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x05c0, code lost:
        if (X.C314496iM.A01(r12, r8) == true) goto L_0x0585;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D7Q(X.C255773uh r26, X.C250973mM r27, X.C316026kz r28, X.C309426Yf r29) {
        /*
            r25 = this;
            r7 = 0
            r5 = r28
            X.0qQ.A0B(r5, r7)
            r2 = 1
            r3 = r26
            X.0qQ.A0B(r3, r2)
            r1 = 3
            r6 = r27
            X.0qQ.A0B(r6, r1)
            r4 = r25
            java.lang.ref.WeakReference r0 = r4.A0V
            java.lang.Object r0 = r0.get()
            X.4DH r0 = (X.AnonymousClass4DH) r0
            if (r0 == 0) goto L_0x00fd
            androidx.fragment.app.FragmentActivity r10 = r0.getActivity()
            if (r10 == 0) goto L_0x00fd
            android.app.Activity r18 = r0.getRootActivity()
            if (r18 == 0) goto L_0x00fd
            android.view.View r8 = r0.mView
            if (r8 == 0) goto L_0x00fd
            r0 = 2131439693(0x7f0b304d, float:1.8501348E38)
            android.view.View r0 = r8.findViewById(r0)
            if (r0 == 0) goto L_0x00fd
            com.instagram.common.session.UserSession r0 = r4.A00
            java.lang.String r12 = "userSession"
            if (r0 == 0) goto L_0x07db
            X.3BK r0 = X.AnonymousClass3BJ.A00(r0)
            boolean r0 = r0.A02(r3)
            if (r0 != 0) goto L_0x00fd
            com.instagram.common.session.UserSession r11 = r4.A00
            if (r11 == 0) goto L_0x07db
            r9 = 7
            X.Plc r0 = new X.Plc
            r0.<init>(r11, r9)
            java.lang.Class<X.6Yj> r8 = X.C309466Yj.class
            java.lang.Object r0 = r11.A01(r8, r0)
            X.6Yj r0 = (X.C309466Yj) r0
            boolean r0 = r0.A00(r3)
            if (r0 != 0) goto L_0x00fd
            X.3BQ r11 = r4.A04
            java.lang.String r13 = "reelViewerSource"
            if (r11 == 0) goto L_0x07d3
            X.3BQ r0 = X.AnonymousClass3BQ.STORY_MENTIONS_ACTIVITY_FEED
            if (r11 != r0) goto L_0x00fe
            com.instagram.common.session.UserSession r0 = r4.A00
            if (r0 == 0) goto L_0x07db
            X.1Av r0 = X.1Au.A00(r0)
            X.0xa r0 = r0.A01
            java.lang.String r11 = "has_seen_story_mentions_nux_dialog"
            boolean r0 = r0.getBoolean(r11, r7)
            if (r0 != 0) goto L_0x00fe
            com.instagram.common.session.UserSession r1 = r4.A00
            if (r1 == 0) goto L_0x07db
            X.VQF r0 = new X.VQF
            r0.<init>(r4)
            X.VYH r3 = new X.VYH
            r3.<init>(r10, r1, r0)
            r4.A0R = r3
            android.app.Activity r0 = r3.A01
            X.8ab r6 = new X.8ab
            r6.<init>((android.app.Activity) r0)
            com.instagram.common.session.UserSession r5 = r3.A02
            android.content.Context r0 = r0.getApplicationContext()
            X.0qQ.A07(r0)
            X.AIr r1 = new X.AIr
            r1.<init>(r5, r0)
            r0 = 2131966140(0x7f1338bc, float:1.956911E38)
            r1.A09(r0)
            int[] r0 = X.AnonymousClass91M.A02
            r1.A0A(r0)
            r0 = 2131165767(0x7f070247, float:1.794576E38)
            r1.A00 = r0
            X.6Ly r0 = r1.A04()
            r6.A0j(r0)
            r0 = 2131974243(0x7f135863, float:1.9585545E38)
            r6.A09(r0)
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r0 = r0.A01(r5)
            boolean r1 = r0.A2L()
            r0 = 2131974242(0x7f135862, float:1.9585543E38)
            if (r1 == 0) goto L_0x00cf
            r0 = 2131974241(0x7f135861, float:1.958554E38)
        L_0x00cf:
            r6.A08(r0)
            r6.A06()
            X.W5X r0 = new X.W5X
            r0.<init>(r3)
            r6.A0f(r0)
            android.app.Dialog r0 = r6.A02()
            X.AnonymousClass0fN.A00(r0)
            r3.A00 = r2
            X.1Av r0 = X.1Au.A00(r5)
            X.0xa r0 = r0.A01
            X.0xY r0 = r0.AR4()
            r0.E5T(r11, r2)
            r0.apply()
            X.4mU r1 = r4.A0U
            java.lang.String r0 = "fragment_paused"
            r1.EHY(r0)
        L_0x00fd:
            return
        L_0x00fe:
            com.instagram.model.reels.Reel r0 = r6.A0H
            r24 = r0
            boolean r0 = r24.A0t()
            java.lang.String r17 = "dialog"
            if (r0 == 0) goto L_0x020e
            X.6jn r5 = r4.A09
            if (r5 == 0) goto L_0x00fd
            X.0eM r8 = r5.A06
            java.lang.Object r0 = r8.getValue()
            X.0xa r0 = (X.0xa) r0
            java.lang.String r6 = "IS_SUPERLATIVE_OPEN_FIRST_TIME"
            boolean r0 = r0.getBoolean(r6, r2)
            if (r0 == 0) goto L_0x00fd
            X.4mU r1 = r4.A0U
            r0 = r17
            r1.EHY(r0)
            r5.A01 = r2
            java.lang.Object r0 = r8.getValue()
            X.0xa r0 = (X.0xa) r0
            X.0xY r0 = r0.AR4()
            r0.E5T(r6, r7)
            r0.apply()
            X.AL0 r7 = new X.AL0
            r7.<init>(r5)
            android.content.Context r8 = r5.A02
            r0 = 2131237645(0x7f081b0d, float:1.8091546E38)
            android.graphics.drawable.Drawable r6 = r8.getDrawable(r0)
            if (r6 == 0) goto L_0x079d
            r0 = 2131974753(0x7f135a61, float:1.9586579E38)
            java.lang.String r1 = r8.getString(r0)
            X.0qQ.A07(r1)
            r0 = 2131974752(0x7f135a60, float:1.9586577E38)
            java.lang.String r0 = r8.getString(r0)
            X.0qQ.A07(r0)
            X.8ab r14 = new X.8ab
            r14.<init>((android.content.Context) r8)
            r14.A0j(r6)
            r14.A05 = r1
            r14.A0q(r0)
            r0 = 2131968772(0x7f134304, float:1.9574448E38)
            java.lang.String r17 = r8.getString(r0)
            X.0qQ.A07(r17)
            X.8ae r16 = X.C358278ae.BLUE_BOLD
            r15 = 0
            r18 = r15
            r19 = r2
            r14.A0V(r15, r16, r17, r18, r19)
            X.I9E r0 = new X.I9E
            r0.<init>(r7, r5)
            r14.A0f(r0)
            android.app.Dialog r1 = r14.A02()
            java.lang.Runnable r0 = r5.A00
            java.lang.String r2 = "Required value was null."
            if (r0 != 0) goto L_0x01fe
            X.FrT r0 = new X.FrT
            r0.<init>(r1)
            r5.A00 = r0
        L_0x0195:
            X.0eM r0 = r5.A05
            java.lang.Object r1 = r0.getValue()
            android.os.Handler r1 = (android.os.Handler) r1
            java.lang.Runnable r0 = r5.A00
            if (r0 == 0) goto L_0x0791
            r1.post(r0)
            X.Tr2 r2 = X.C14164Tr2.A00
            com.instagram.common.session.UserSession r1 = r4.A00
            if (r1 == 0) goto L_0x07db
            X.3BQ r5 = r4.A04
            if (r5 == 0) goto L_0x07d3
            boolean r0 = r3.A1k()
            if (r0 == 0) goto L_0x00fd
            X.0wc r2 = X.AnonymousClass0kN.A01(r2, r1)
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r4 = r0.toString()
            X.0qQ.A07(r4)
            java.lang.String r1 = "ig_story_standouts_initial_dialog_impression"
            X.0kJ r0 = r2.A00
            X.0Aj r2 = r2.A00(r0, r1)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x00fd
            java.lang.String r0 = "tracking_token"
            r2.AAJ(r0, r4)
            X.LOb r0 = r3.A0E
            r0.getClass()
            X.UwR r0 = r0.A04
            java.lang.String r1 = X.C18241Vo8.A01(r0)
            java.lang.String r0 = "reel_id_type"
            r2.AAJ(r0, r1)
            java.lang.String r1 = r3.A0k
            java.lang.String r0 = "reel_id"
            r2.AAJ(r0, r1)
            X.28D r0 = X.C14164Tr2.A00(r5)
            java.lang.String r1 = r0.name()
            java.lang.String r0 = "entry_point"
            r2.AAJ(r0, r1)
            r2.Cgf()
            return
        L_0x01fe:
            X.0eM r0 = r5.A05
            java.lang.Object r1 = r0.getValue()
            android.os.Handler r1 = (android.os.Handler) r1
            java.lang.Runnable r0 = r5.A00
            if (r0 == 0) goto L_0x0797
            r1.removeCallbacks(r0)
            goto L_0x0195
        L_0x020e:
            boolean r0 = r3.CWu()
            if (r0 == 0) goto L_0x021e
            X.1Xj r0 = r3.A0b
            if (r0 == 0) goto L_0x0224
            boolean r0 = r0.A5f()
            if (r0 != r2) goto L_0x0224
        L_0x021e:
            boolean r0 = r3.A12()
            if (r0 == 0) goto L_0x00fd
        L_0x0224:
            boolean r0 = r4.A02()
            if (r0 != 0) goto L_0x0360
            boolean r0 = r4.A0S
            if (r0 != 0) goto L_0x0360
            X.4mU r0 = r4.A0U
            r16 = r0
            r0 = r16
            instagram.features.stories.fragment.ReelViewerFragment r0 = (instagram.features.stories.fragment.ReelViewerFragment) r0
            boolean r0 = r0.A2Q
            if (r0 != 0) goto L_0x03e8
            X.6jz r12 = r4.A0J
            if (r12 == 0) goto L_0x03e8
            X.3BQ r14 = r4.A04
            if (r14 == 0) goto L_0x07d3
            java.lang.String r13 = r4.A0Q
            com.instagram.common.session.UserSession r11 = r12.A0L
            X.1Av r0 = X.1Au.A00(r11)
            X.0xa r15 = r0.A01
            java.lang.String r0 = "reel_viewer_gestures_nux_impression_count"
            int r0 = r15.getInt(r0, r7)
            if (r0 != 0) goto L_0x03d2
            com.instagram.reels.store.ReelStore r0 = com.instagram.reels.store.ReelStore.A03(r11)
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x03d2
            boolean r0 = r12.A0I
            if (r0 != 0) goto L_0x03e8
            X.3BQ r0 = X.AnonymousClass3BQ.MAIN_FEED_TRAY
            if (r14 == r0) goto L_0x0268
            X.3BQ r0 = X.AnonymousClass3BQ.IN_FEED_STORIES_TRAY
            if (r14 != r0) goto L_0x03e8
        L_0x0268:
            java.lang.String r0 = r3.A0j
            boolean r0 = X.0qQ.A0K(r0, r13)
            if (r0 != 0) goto L_0x03e8
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r11 = r0.A01(r11)
            com.instagram.user.model.User r0 = r3.A0i
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x03e8
            boolean r0 = r3.A0R
            if (r0 != 0) goto L_0x03e8
            boolean r0 = r3.CcK()
            if (r0 != 0) goto L_0x03e8
            android.content.Context r0 = r12.A0J
            boolean r0 = X.2eO.A00(r0)
            if (r0 != 0) goto L_0x03e8
            X.6jz r6 = r4.A0J
            if (r6 == 0) goto L_0x0360
            com.instagram.common.session.UserSession r8 = r6.A0L
            X.1Av r0 = X.1Au.A00(r8)
            X.0xa r1 = r0.A01
            java.lang.String r0 = "reel_viewer_zoom_gestures_nux_impression_count"
            r1.getInt(r0, r7)
            X.1Av r0 = X.1Au.A00(r8)
            X.0xa r1 = r0.A01
            java.lang.String r0 = "reel_viewer_zoom_gestures_nux_seen"
            r1.getBoolean(r0, r7)
            r6.A0I = r2
            long r0 = android.os.SystemClock.elapsedRealtime()
            r6.A06 = r0
            r6.A0D = r5
            X.3oV r0 = r6.A0M
            android.view.View r1 = r0.getView()
            r6.A09 = r1
            X.0qQ.A0A(r1)
            r0 = 2131428531(0x7f0b04b3, float:1.847871E38)
            android.view.View r0 = r1.findViewById(r0)
            r6.A08 = r0
            android.view.View r1 = r6.A09
            X.0qQ.A0A(r1)
            r0 = 2131442864(0x7f0b3cb0, float:1.850778E38)
            android.view.View r0 = r1.requireViewById(r0)
            r6.A0A = r0
            android.view.View r1 = r6.A09
            X.0qQ.A0A(r1)
            r0 = 2131428821(0x7f0b05d5, float:1.8479297E38)
            android.view.View r0 = r1.findViewById(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = (com.instagram.common.ui.widget.imageview.IgImageView) r0
            r6.A0C = r0
            android.content.Context r8 = r6.A0J
            r0 = 8
            float r0 = X.0nA.A04(r8, r0)
            r6.A05 = r0
            android.view.View r5 = r6.A0A
            X.0qQ.A0A(r5)
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131165740(0x7f07022c, float:1.7945706E38)
            int r0 = r1.getDimensionPixelOffset(r0)
            float r0 = (float) r0
            r5.setCameraDistance(r0)
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r6.A07 = r0
            X.2cp r0 = X.C61340me.A00()
            X.2cs r1 = r0.A02()
            r1.A06 = r2
            X.K09 r0 = new X.K09
            r0.<init>(r6)
            r1.A0A(r0)
            r6.A0B = r1
            X.Jde r0 = new X.Jde
            r0.<init>(r6)
            android.view.GestureDetector r5 = new android.view.GestureDetector
            r5.<init>(r8, r0)
            android.view.View r1 = r6.A09
            if (r1 == 0) goto L_0x07a5
            X.LYg r0 = new X.LYg
            r0.<init>(r5, r6)
            r1.setOnTouchListener(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r6.A0F = r0
            X.6Z4 r0 = r6.A0E
            if (r0 == 0) goto L_0x034e
            X.6Z0 r0 = r0.A00
            X.4mU r0 = r0.A0U
            instagram.features.stories.fragment.ReelViewerFragment r0 = (instagram.features.stories.fragment.ReelViewerFragment) r0
            X.6fm r0 = r0.mViewPager
            X.6fl r0 = (X.C313046fl) r0
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = r0.A04
            r0.setDraggingEnabled(r7)
        L_0x034e:
            X.6kz r0 = r6.A0D
            if (r0 == 0) goto L_0x0360
            com.instagram.feed.widget.IgProgressImageView r1 = r0.BGP()
            if (r1 == 0) goto L_0x0360
            X.M4q r0 = new X.M4q
            r0.<init>(r6)
            r1.post(r0)
        L_0x0360:
            X.6jk r1 = r4.A0K
            if (r1 == 0) goto L_0x00fd
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x00fd
            r0 = r24
            boolean r0 = r0.A1a
            if (r0 != 0) goto L_0x00fd
            X.3YL r1 = r1.A02
            X.1Xj r0 = r3.A0b
            boolean r0 = r1.A02(r0)
            if (r0 == 0) goto L_0x00fd
            X.6jk r3 = r4.A0K
            if (r3 == 0) goto L_0x00fd
            X.4mU r4 = r4.A0U
            boolean r0 = r3.A00
            if (r0 != 0) goto L_0x00fd
            r3.A00 = r2
            X.8ab r5 = new X.8ab
            r5.<init>((android.content.Context) r10)
            r0 = 2131237575(0x7f081ac7, float:1.8091404E38)
            android.graphics.drawable.Drawable r0 = r10.getDrawable(r0)
            r5.A0j(r0)
            r0 = 2131960830(0x7f1323fe, float:1.955834E38)
            r5.A09(r0)
            r0 = 2131960827(0x7f1323fb, float:1.9558334E38)
            r5.A08(r0)
            r1 = 2131960829(0x7f1323fd, float:1.9558338E38)
            r0 = 0
            r5.A0I(r0, r1)
            r0 = 2131960828(0x7f1323fc, float:1.9558336E38)
            java.lang.String r2 = r10.getString(r0)
            X.0qQ.A07(r2)
            X.I8D r1 = new X.I8D
            r1.<init>(r10, r3)
            X.8ae r0 = X.C358278ae.DEFAULT
            r5.A0X(r1, r0, r2, r7)
            X.I9K r0 = new X.I9K
            r0.<init>(r4, r3)
            r5.A0g(r0)
            X.I9F r0 = new X.I9F
            r0.<init>(r4, r3)
            r5.A0f(r0)
            android.app.Dialog r0 = r5.A02()
            X.AnonymousClass0fN.A00(r0)
            return
        L_0x03d2:
            X.1Av r0 = X.1Au.A00(r11)
            X.0xa r12 = r0.A01
            java.lang.String r0 = "reel_viewer_zoom_gestures_nux_impression_count"
            r12.getInt(r0, r7)
            X.1Av r0 = X.1Au.A00(r11)
            X.0xa r11 = r0.A01
            java.lang.String r0 = "reel_viewer_zoom_gestures_nux_seen"
            r11.getBoolean(r0, r7)
        L_0x03e8:
            X.6j9 r11 = r4.A01
            if (r11 == 0) goto L_0x0454
            com.instagram.common.session.UserSession r0 = r11.A05
            boolean r0 = X.AnonymousClass2o2.A00(r0)
            if (r0 == 0) goto L_0x0454
            X.6jB r0 = r11.A06
            X.0xa r12 = r0.A01
            java.lang.String r0 = "exclusive_story_highlight_dialog_count"
            int r0 = r12.getInt(r0, r7)
            if (r0 >= r1) goto L_0x0454
            long r13 = java.lang.System.currentTimeMillis()
            java.lang.String r11 = "exclusive_story_highlight_dialog_timestamp"
            r0 = 0
            long r0 = r12.getLong(r11, r0)
            long r13 = r13 - r0
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.DAYS
            r0 = 7
            long r11 = r11.toMillis(r0)
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x0454
            r0 = r24
            boolean r0 = r0.A1a
            if (r0 == 0) goto L_0x0454
            boolean r0 = r3.A1D()
            if (r0 == 0) goto L_0x0454
            boolean r0 = r3.A1J()
            if (r0 != 0) goto L_0x0454
            X.6j9 r6 = r4.A01
            if (r6 == 0) goto L_0x0591
            boolean r0 = r6.A01
            if (r0 != 0) goto L_0x0591
            r6.A01 = r2
            java.lang.Runnable r1 = r6.A00
            java.lang.String r5 = "Required value was null."
            if (r1 != 0) goto L_0x044e
            X.Fsr r0 = new X.Fsr
            r0.<init>(r6, r3)
            r6.A00 = r0
        L_0x0442:
            android.os.Handler r1 = r6.A04
            java.lang.Runnable r0 = r6.A00
            if (r0 != 0) goto L_0x0559
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x044e:
            android.os.Handler r0 = r6.A04
            r0.removeCallbacks(r1)
            goto L_0x0442
        L_0x0454:
            X.6jC r11 = r4.A0H
            if (r11 == 0) goto L_0x04ae
            com.instagram.model.reels.ReelViewerConfig r0 = r11.A05
            boolean r0 = r0.A0J
            if (r0 != 0) goto L_0x04ae
            X.5Gv r0 = r11.A00
            if (r0 != 0) goto L_0x04ae
            com.instagram.common.session.UserSession r12 = r11.A04
            X.Plc r0 = new X.Plc
            r0.<init>(r12, r9)
            java.lang.Object r0 = r12.A01(r8, r0)
            X.6Yj r0 = (X.C309466Yj) r0
            boolean r0 = r0.A00(r3)
            if (r0 != 0) goto L_0x04ae
            X.6jD[] r13 = X.C315016jD.values()
            int r9 = r13.length
            r8 = 0
        L_0x047b:
            if (r8 >= r9) goto L_0x04ae
            r1 = r13[r8]
            java.util.Map r0 = r11.A06
            java.lang.Object r1 = r0.get(r1)
            X.6jF r1 = (X.C315036jF) r1
            if (r1 == 0) goto L_0x04ab
            boolean r0 = r1.EtQ(r12, r3, r6, r5)
            if (r0 == 0) goto L_0x04ab
            android.view.Window r0 = r18.getWindow()
            r0.getClass()
            android.view.View r0 = r0.getDecorView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r12 = r0
            r13 = r3
            r14 = r6
            r15 = r5
            r16 = r1
            r17 = r11
            X.C315006jC.A00(r12, r13, r14, r15, r16, r17)
            r4.A0S = r2
            goto L_0x0360
        L_0x04ab:
            int r8 = r8 + 1
            goto L_0x047b
        L_0x04ae:
            X.6jl r1 = r4.A07
            if (r1 == 0) goto L_0x055d
            boolean r0 = r24.A0k()
            if (r0 == 0) goto L_0x055d
            X.0eM r0 = r1.A06
            java.lang.Object r1 = r0.getValue()
            X.0xa r1 = (X.0xa) r1
            java.lang.String r0 = "HAS_DISMISSED_STORY_MEMORY_DIALOG_NUX"
            boolean r0 = r1.getBoolean(r0, r7)
            if (r0 != 0) goto L_0x055d
            X.6jl r6 = r4.A07
            if (r6 == 0) goto L_0x0591
            r6.A01 = r2
            X.AKz r8 = new X.AKz
            r8.<init>(r6)
            android.content.Context r1 = r6.A02
            X.8ab r5 = new X.8ab
            r5.<init>((android.content.Context) r1)
            r0 = 2131974449(0x7f135931, float:1.9585962E38)
            java.lang.String r0 = r1.getString(r0)
            r5.A05 = r0
            r0 = 2131974448(0x7f135930, float:1.958596E38)
            java.lang.String r0 = r1.getString(r0)
            r5.A0q(r0)
            r0 = 2131968772(0x7f134304, float:1.9574448E38)
            java.lang.String r21 = r1.getString(r0)
            X.0qQ.A07(r21)
            X.8ae r20 = X.C358278ae.BLUE_BOLD
            r19 = 0
            r22 = r19
            r23 = r2
            r18 = r5
            r18.A0V(r19, r20, r21, r22, r23)
            X.I9D r0 = new X.I9D
            r0.<init>(r8, r6)
            r5.A0f(r0)
            android.content.res.Resources r1 = r1.getResources()
            r0 = 2131238412(0x7f081e0c, float:1.8093102E38)
            android.graphics.drawable.Drawable r1 = X.AnonymousClass2dd.A00(r1, r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.ui.widget.imageview.IgNetworkDrawable"
            X.0qQ.A0C(r1, r0)
            X.4Dk r1 = (X.C262364Dk) r1
            X.WTR r0 = new X.WTR
            r0.<init>(r5)
            r1.A01(r0)
            android.app.Dialog r1 = r5.A02()
            java.lang.Runnable r0 = r6.A00
            java.lang.String r5 = "Required value was null."
            if (r0 != 0) goto L_0x0549
            X.FrR r0 = new X.FrR
            r0.<init>(r1)
            r6.A00 = r0
        L_0x0537:
            X.0eM r0 = r6.A05
            java.lang.Object r1 = r0.getValue()
            android.os.Handler r1 = (android.os.Handler) r1
            java.lang.Runnable r0 = r6.A00
            if (r0 != 0) goto L_0x0559
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x0549:
            X.0eM r0 = r6.A05
            java.lang.Object r1 = r0.getValue()
            android.os.Handler r1 = (android.os.Handler) r1
            java.lang.Runnable r0 = r6.A00
            if (r0 == 0) goto L_0x07ad
            r1.removeCallbacks(r0)
            goto L_0x0537
        L_0x0559:
            r1.post(r0)
            goto L_0x0591
        L_0x055d:
            X.6iM r12 = r4.A08
            java.lang.String r8 = "story_remix_reply"
            if (r12 == 0) goto L_0x059a
            r0 = r24
            boolean r0 = r0.A1Q
            if (r0 != 0) goto L_0x059a
            com.instagram.common.session.UserSession r11 = r12.A04
            X.0Tu r9 = X.0Tu.A06
            r0 = 36315009345063874(0x81044f00070bc2, double:3.0290963663993304E-306)
            boolean r1 = X.182.A06(r9, r11, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            X.0qQ.A0A(r0)
            if (r1 == 0) goto L_0x059a
            boolean r0 = X.C314496iM.A01(r12, r8)
            if (r0 != r2) goto L_0x059a
        L_0x0585:
            X.6iM r1 = r4.A08
            if (r1 == 0) goto L_0x0591
            X.LwI r0 = new X.LwI
            r0.<init>(r10, r5, r4, r8)
            r1.A03(r0, r8)
        L_0x0591:
            r1 = r16
            r0 = r17
            r1.EHY(r0)
            goto L_0x0360
        L_0x059a:
            X.6iM r12 = r4.A08
            java.lang.String r8 = "story_selfie_reply"
            if (r12 == 0) goto L_0x05c3
            r0 = r24
            boolean r0 = r0.A1T
            if (r0 != 0) goto L_0x05c3
            com.instagram.common.session.UserSession r11 = r12.A04
            X.0Tu r9 = X.0Tu.A06
            r0 = 36315009345260483(0x81044f000a0bc3, double:3.029096366523667E-306)
            boolean r1 = X.182.A06(r9, r11, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            X.0qQ.A0A(r0)
            if (r1 == 0) goto L_0x05c3
            boolean r0 = X.C314496iM.A01(r12, r8)
            if (r0 != r2) goto L_0x05c3
            goto L_0x0585
        L_0x05c3:
            X.6jp r9 = r4.A02
            if (r9 == 0) goto L_0x0656
            com.instagram.common.session.UserSession r8 = r9.A04
            boolean r0 = X.AnonymousClass6YK.A02(r8, r3, r6)
            if (r0 != 0) goto L_0x0656
            X.3QO r1 = r3.A0B()
            X.3QO r0 = X.AnonymousClass3QO.HALLPASS
            if (r1 != r0) goto L_0x0656
            X.1Xj r5 = r3.A0b
            if (r5 == 0) goto L_0x0656
            X.1Xy r0 = r5.A0C
            X.82k r0 = r0.BAJ()
            if (r0 == 0) goto L_0x0656
            boolean r0 = X.AnonymousClass37B.A01(r8, r2)
            if (r0 == 0) goto L_0x0656
            boolean r0 = X.AnonymousClass37B.A00(r8)
            if (r0 == 0) goto L_0x0656
            X.0eM r0 = r9.A07
            java.lang.Object r0 = r0.getValue()
            X.1Av r0 = (X.1Av) r0
            X.0xa r1 = r0.A01
            java.lang.String r0 = "has_seen_group_stories_notification_nux"
            boolean r0 = r1.getBoolean(r0, r7)
            if (r0 != 0) goto L_0x0656
            X.6jp r6 = r4.A02
            if (r6 == 0) goto L_0x0360
            X.1Xy r0 = r5.A0C
            X.82k r0 = r0.BAJ()
            if (r0 == 0) goto L_0x0360
            X.Fm0 r9 = new X.Fm0
            r9.<init>(r6)
            r6.A01 = r2
            java.lang.Runnable r0 = r6.A00
            java.lang.String r5 = "Required value was null."
            if (r0 != 0) goto L_0x0646
            com.instagram.common.session.UserSession r1 = r6.A04
            X.0iw r0 = r6.A03
            X.34q r8 = new X.34q
            r8.<init>(r0, r1)
            X.EZX r1 = X.EZX.STORY_VIEWER
            X.1QJ r0 = X.AnonymousClass1QI.A00
            X.1QM r0 = r0.A02
            java.lang.String r0 = r0.A00
            r8.A01(r1, r0)
            X.Fsw r0 = new X.Fsw
            r0.<init>(r6, r9)
            r6.A00 = r0
        L_0x0635:
            X.0eM r0 = r6.A06
            java.lang.Object r1 = r0.getValue()
            android.os.Handler r1 = (android.os.Handler) r1
            java.lang.Runnable r0 = r6.A00
            if (r0 == 0) goto L_0x07b3
            r1.post(r0)
            goto L_0x0360
        L_0x0646:
            X.0eM r0 = r6.A06
            java.lang.Object r1 = r0.getValue()
            android.os.Handler r1 = (android.os.Handler) r1
            java.lang.Runnable r0 = r6.A00
            if (r0 == 0) goto L_0x07b9
            r1.removeCallbacks(r0)
            goto L_0x0635
        L_0x0656:
            X.6jr r1 = r4.A06
            if (r1 == 0) goto L_0x0360
            X.0eM r8 = r1.A06
            java.lang.Object r0 = r8.getValue()
            X.0xa r0 = (X.0xa) r0
            java.lang.String r14 = "HIGHLIGHTS_TO_GRID_STORY_NUX_LAST_SEEN_TIMESTAMP"
            r5 = -9223372036854775808
            long r17 = r0.getLong(r14, r5)
            boolean r0 = r24.A0h()
            if (r0 == 0) goto L_0x0360
            r0 = r24
            boolean r0 = r0.A1a
            if (r0 == 0) goto L_0x0360
            boolean r0 = r24.A0l()
            if (r0 != 0) goto L_0x0360
            com.instagram.common.session.UserSession r12 = r1.A03
            X.0Tu r11 = X.0Tu.A05
            r0 = 36319884132818633(0x8108be00051ec9, double:3.032179201804635E-306)
            boolean r0 = X.182.A06(r11, r12, r0)
            if (r0 == 0) goto L_0x0360
            java.lang.Object r0 = r8.getValue()
            X.0xa r0 = (X.0xa) r0
            java.lang.String r13 = "HIGHLIGHTS_TO_GRID_STORY_NUX_VIEW_COUNT"
            int r0 = r0.getInt(r13, r7)
            long r8 = (long) r0
            r0 = 36601359109656723(0x8208be00071093, double:3.2101851105658007E-306)
            long r15 = X.182.A01(r11, r12, r0)
            int r0 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x0360
            int r0 = (r17 > r5 ? 1 : (r17 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x06c2
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r17
            long r8 = r5.toHours(r0)
            r0 = 36601359109591186(0x8208be00061092, double:3.210185110524355E-306)
            long r5 = X.182.A01(r11, r12, r0)
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x0360
        L_0x06c2:
            X.6jr r5 = r4.A06
            if (r5 == 0) goto L_0x0360
            X.W5m r8 = new X.W5m
            r8.<init>(r4)
            r5.A01 = r2
            X.FJn r6 = new X.FJn
            r6.<init>(r5)
            X.FIC r9 = new X.FIC
            r9.<init>(r3, r5)
            androidx.fragment.app.FragmentActivity r11 = r5.A02
            X.8ab r15 = new X.8ab
            r15.<init>((android.app.Activity) r11)
            r0 = 2131238631(0x7f081ee7, float:1.8093546E38)
            android.graphics.drawable.Drawable r0 = r11.getDrawable(r0)
            if (r0 == 0) goto L_0x07cb
            r15.A0j(r0)
            android.content.res.Resources r1 = r11.getResources()
            r0 = 2131963471(0x7f132e4f, float:1.9563696E38)
            java.lang.String r0 = r1.getString(r0)
            r15.A05 = r0
            android.content.res.Resources r1 = r11.getResources()
            r0 = 2131963470(0x7f132e4e, float:1.9563694E38)
            java.lang.String r0 = r1.getString(r0)
            r15.A0q(r0)
            android.content.res.Resources r1 = r11.getResources()
            r0 = 2131963472(0x7f132e50, float:1.9563698E38)
            java.lang.String r18 = r1.getString(r0)
            X.0qQ.A07(r18)
            r1 = 0
            X.8ae r17 = X.C358278ae.BLUE_BOLD
            r19 = r1
            r20 = r2
            r16 = r9
            r15.A0V(r16, r17, r18, r19, r20)
            r0 = 2131963464(0x7f132e48, float:1.9563682E38)
            r15.A0M(r1, r0, r2)
            X.FJo r0 = new X.FJo
            r0.<init>(r6, r5)
            r15.A0f(r0)
            r15.A0g(r8)
            android.app.Dialog r1 = r15.A02()
            java.lang.Runnable r0 = r5.A00
            java.lang.String r6 = "Required value was null."
            if (r0 != 0) goto L_0x0781
            X.FrQ r0 = new X.FrQ
            r0.<init>(r1)
            r5.A00 = r0
        L_0x0741:
            X.0eM r0 = r5.A05
            java.lang.Object r1 = r0.getValue()
            android.os.Handler r1 = (android.os.Handler) r1
            java.lang.Runnable r0 = r5.A00
            if (r0 == 0) goto L_0x07bf
            r1.post(r0)
            X.0eM r5 = r5.A06
            java.lang.Object r0 = r5.getValue()
            X.0xa r0 = (X.0xa) r0
            X.0xY r1 = r0.AR4()
            java.lang.Object r0 = r5.getValue()
            X.0xa r0 = (X.0xa) r0
            int r0 = r0.getInt(r13, r7)
            int r0 = r0 + 1
            r1.E5Z(r13, r0)
            r1.apply()
            java.lang.Object r0 = r5.getValue()
            X.0xa r0 = (X.0xa) r0
            X.0xY r5 = r0.AR4()
            long r0 = java.lang.System.currentTimeMillis()
            r5.E5c(r14, r0)
            goto L_0x0360
        L_0x0781:
            X.0eM r0 = r5.A05
            java.lang.Object r1 = r0.getValue()
            android.os.Handler r1 = (android.os.Handler) r1
            java.lang.Runnable r0 = r5.A00
            if (r0 == 0) goto L_0x07c5
            r1.removeCallbacks(r0)
            goto L_0x0741
        L_0x0791:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x0797:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x079d:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x07a5:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x07ad:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x07b3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x07b9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x07bf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r6)
            throw r0
        L_0x07c5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r6)
            throw r0
        L_0x07cb:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x07d3:
            X.0qQ.A0F(r13)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x07db:
            X.0qQ.A0F(r12)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Z0.D7Q(X.3uh, X.3mM, X.6kz, X.6Yf):void");
    }

    public final /* synthetic */ void DLs(Reel reel) {
    }

    public final /* synthetic */ void DMq(int i) {
    }

    public final /* synthetic */ void DNx() {
    }

    public final /* synthetic */ void DNy() {
    }

    public final /* synthetic */ void DVL() {
    }

    public final /* synthetic */ void DWT(String str) {
    }

    public final /* synthetic */ void Dfe() {
    }

    public final /* synthetic */ void DiL(int i) {
    }

    public final /* synthetic */ void DiM(int i, int i2) {
    }

    public final /* synthetic */ void DiO(int i, int i2) {
    }

    public final /* synthetic */ void DiP() {
    }

    public final void DsB() {
        this.A0S = false;
        this.A0U.EHd();
    }

    public final /* synthetic */ void DxL() {
    }

    public final /* synthetic */ void DxN() {
    }

    public final /* synthetic */ void DxU() {
    }

    public final /* synthetic */ void DyN(C255773uh r1, C316036l0 r2) {
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onCreate() {
    }

    public final void onDestroy() {
    }

    public final void onDestroyView() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public final void A00(C255773uh r10, C250973mM r11, C315016jD r12, C316026kz r13) {
        C315036jF r7;
        AnonymousClass4DH r1 = (AnonymousClass4DH) this.A0V.get();
        if (r1 != null && r1.isAdded()) {
            Activity rootActivity = r1.getRootActivity();
            C315006jC r8 = this.A0H;
            if (r8 != null) {
                C316026kz r6 = r13;
                if (r13 == null) {
                    throw new IllegalStateException("Required value was null.");
                } else if (rootActivity == null) {
                    throw new IllegalStateException("Required value was null.");
                } else if (!r8.A05.A0J && r8.A00 == null) {
                    UserSession userSession = r8.A04;
                    C255773uh r4 = r10;
                    if (!((C309466Yj) userSession.A01(C309466Yj.class, new C73901Plc(userSession, 7))).A00(r10) && (r7 = (C315036jF) r8.A06.get(r12)) != null) {
                        C250973mM r5 = r11;
                        if (r7.EtQ(userSession, r10, r11, r13)) {
                            Window window = rootActivity.getWindow();
                            window.getClass();
                            C315006jC.A00((ViewGroup) window.getDecorView(), r4, r5, r6, r7, r8);
                        }
                    }
                }
            }
        }
    }

    public final void A01(boolean z, boolean z2) {
        C275794rx r0;
        C275794rx r02;
        C275794rx r03;
        AnonymousClass5Gv r04;
        AnonymousClass5Gv r2;
        AnonymousClass5Gv r22;
        AnonymousClass5Gv r1;
        AnonymousClass5Gv r05;
        AnonymousClass5Gv r06;
        C314626ia r12 = this.A0A;
        if (r12 != null) {
            r12.A03((C255783ui) null, z, z2);
        }
        C315006jC r07 = this.A0H;
        if (!(r07 == null || (r06 = r07.A00) == null)) {
            r06.A08(z);
        }
        AnonymousClass32V r08 = this.A03;
        if (!(r08 == null || (r05 = r08.A00) == null)) {
            r05.A08(z);
        }
        C315436jt r09 = this.A0I;
        if (!(r09 == null || (r1 = r09.A00) == null || !r1.A09())) {
            r1.A08(z);
        }
        C315446ju r010 = this.A0E;
        if (!(r010 == null || (r22 = r010.A00) == null || !r22.A09())) {
            r22.A08(z);
        }
        C315456jv r011 = this.A0F;
        if (!(r011 == null || (r2 = r011.A00) == null || !r2.A09())) {
            r2.A08(z);
        }
        C314716ij r012 = this.A0C;
        if (r012 != null) {
            r012.A06.A00(z, z2);
        }
        C311676d4 r013 = this.A0D;
        if (r013 != null) {
            r013.A00(z, z2);
        }
        C315466jw r014 = this.A0G;
        if (!(r014 == null || (r04 = r014.A00) == null)) {
            r04.A08(z);
        }
        C314776ip r23 = this.A0N;
        if (r23 != null) {
            if (z2 && (r03 = r23.A00) != null) {
                r03.A03 = null;
            }
            C275794rx r015 = r23.A00;
            if (r015 != null) {
                r015.A03(z);
            }
            r23.A00 = null;
        }
        C314786iq r24 = this.A0O;
        if (r24 != null) {
            if (z2 && (r02 = r24.A00) != null) {
                r02.A03 = null;
            }
            C275794rx r016 = r24.A00;
            if (r016 != null) {
                r016.A03(z);
            }
            r24.A00 = null;
        }
        C314796ir r25 = this.A0L;
        if (r25 != null) {
            if (z2 && (r0 = r25.A00) != null) {
                r0.A03 = null;
            }
            C275794rx r017 = r25.A00;
            if (r017 != null) {
                r017.A03(z);
            }
            r25.A00 = null;
        }
    }

    public final boolean A02() {
        C315006jC r0;
        AnonymousClass32V r02;
        C315436jt r03;
        C315446ju r04;
        C315456jv r05;
        C314716ij r06;
        C311676d4 r07;
        C315466jw r08;
        C314776ip r09;
        C314786iq r010;
        C314796ir r011;
        C275794rx r012;
        C275794rx r013;
        C275794rx r014;
        AnonymousClass5Gv r015;
        C275794rx r016;
        C275794rx r017;
        AnonymousClass5Gv r018;
        AnonymousClass5Gv r019;
        AnonymousClass5Gv r020;
        C314626ia r021 = this.A0A;
        if ((r021 == null || !r021.A04()) && (((r0 = this.A0H) == null || r0.A00 == null) && (((r02 = this.A03) == null || !r02.A02) && (((r03 = this.A0I) == null || (r020 = r03.A00) == null || !r020.A09()) && (((r04 = this.A0E) == null || (r019 = r04.A00) == null || !r019.A09()) && (((r05 = this.A0F) == null || (r018 = r05.A00) == null || !r018.A09()) && (((r06 = this.A0C) == null || (r017 = r06.A06.A05) == null || !r017.isShowing()) && (((r07 = this.A0D) == null || (r016 = r07.A05) == null || !r016.isShowing()) && (((r08 = this.A0G) == null || (r015 = r08.A00) == null || !r015.A09()) && (((r09 = this.A0N) == null || (r014 = r09.A00) == null || !r014.isShowing()) && (((r010 = this.A0O) == null || (r013 = r010.A00) == null || !r013.isShowing()) && ((r011 = this.A0L) == null || (r012 = r011.A00) == null || !r012.isShowing())))))))))))) {
            return false;
        }
        return true;
    }

    public final boolean A03() {
        C315496jz r0 = this.A0J;
        if (r0 == null || r0.A0F == AnonymousClass05K.A00) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ boolean BVb() {
        return false;
    }

    public final /* synthetic */ int BrB() {
        return 0;
    }

    public final /* synthetic */ boolean Bu3() {
        return false;
    }

    public final /* synthetic */ boolean Cau() {
        return false;
    }

    public final void DkX() {
        this.A0U.EHY("dialog");
    }

    public final /* synthetic */ boolean Dpr() {
        return false;
    }

    public final /* synthetic */ boolean Dq0() {
        return false;
    }

    public final /* synthetic */ boolean Dqd() {
        return false;
    }

    public final void onPause() {
        C315006jC r0 = this.A0H;
        if (r0 != null) {
            r0.A01 = null;
        }
        AnonymousClass32V r02 = this.A03;
        if (r02 != null) {
            r02.A01 = null;
        }
        C315496jz r03 = this.A0J;
        if (r03 != null) {
            r03.A0E = null;
        }
        C315436jt r04 = this.A0I;
        if (r04 != null) {
            r04.A01 = null;
        }
        C315446ju r05 = this.A0E;
        if (r05 != null) {
            r05.A01 = null;
        }
        C315456jv r06 = this.A0F;
        if (r06 != null) {
            r06.A01 = null;
        }
        C315466jw r07 = this.A0G;
        if (r07 != null) {
            r07.A01 = null;
        }
    }

    public final void onResume() {
        C315006jC r0 = this.A0H;
        if (r0 != null) {
            r0.A01 = this;
        }
        AnonymousClass32V r02 = this.A03;
        if (r02 != null) {
            r02.A01 = this;
        }
        C315496jz r1 = this.A0J;
        if (r1 != null) {
            r1.A0E = this.A0X;
        }
        C315436jt r03 = this.A0I;
        if (r03 != null) {
            r03.A01 = this;
        }
        C315446ju r04 = this.A0E;
        if (r04 != null) {
            r04.A01 = this;
        }
        C315456jv r05 = this.A0F;
        if (r05 != null) {
            r05.A01 = this;
        }
        C315466jw r06 = this.A0G;
        if (r06 != null) {
            r06.A01 = this;
        }
    }

    public AnonymousClass6Z0(AnonymousClass0iw r2, C273434mZ r3, C273384mU r4, WeakReference weakReference) {
        this.A0V = weakReference;
        this.A0U = r4;
        this.A0W = r3;
        this.A0T = r2;
    }

    public final boolean A04() {
        VYH vyh;
        C314976j9 r0;
        C315346jk r02;
        C315356jl r03;
        C314496iM r04;
        C315376jn r05;
        C315396jp r06;
        C315416jr r07;
        if (!A03()) {
            AnonymousClass6ZN r08 = this.A0P;
            if (r08 == null) {
                0qQ.A0F("storyReactionDelegate");
                throw AnonymousClass00P.createAndThrow();
            } else if (r08.A0B || (((vyh = this.A0R) != null && vyh.A00) || (((r0 = this.A01) != null && r0.A01) || (((r02 = this.A0K) != null && r02.A00) || (((r03 = this.A07) != null && r03.A01) || (((r04 = this.A08) != null && r04.A02) || (((r05 = this.A09) != null && r05.A01) || (((r06 = this.A02) != null && r06.A01) || ((r07 = this.A06) != null && r07.A01))))))))) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }
}
