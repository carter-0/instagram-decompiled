package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2lJ  reason: invalid class name and case insensitive filesystem */
public class C228312lJ extends C249383je implements C61110lV, C252243on {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public JPT A04;
    public AnonymousClass2mA A05;
    public boolean A06;
    public boolean A07;
    public final int A08;
    public final 02m A09;
    public final String A0A;
    public final 01W A0B = new 01W();
    public final boolean A0C;
    public final boolean A0D;
    public final DisplayMetrics A0E;

    public C228312lJ(Context context, 02m r5, UserSession userSession, String str, int i) {
        0qQ.A0B(str, 3);
        0qQ.A0B(userSession, 4);
        this.A08 = i;
        this.A0A = str;
        this.A09 = r5;
        this.A0E = context.getResources().getDisplayMetrics();
        0Tu r2 = 0Tu.A06;
        this.A0D = 182.A06(r2, userSession, 36314532603234978L);
        this.A0C = 182.A06(r2, userSession, 36314532603300515L);
    }

    public final void A02() {
        this.A03 = 0;
        this.A01 = 0;
        this.A00 = 0;
        this.A02 = 0;
    }

    public void A03(short s, boolean z) {
        short s2 = s;
        if (z) {
            02m r2 = this.A09;
            int i = this.A08;
            14i r0 = 14i.A08;
            r2.markerEnd(i, s2, AwakeTimeSinceBootClock.INSTANCE.now() - LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT, TimeUnit.MILLISECONDS);
            return;
        }
        if (this.A0B.size() > 0) {
            0KC.A0E("TailLoadPerfLogger", "On-going requests in flight on end marker.");
        }
        this.A09.markerEnd(this.A08, s);
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public final /* synthetic */ void onDestroyView() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0026, code lost:
        if (r7.A0C == false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPause() {
        /*
            r7 = this;
            r6 = 0
            r7.A01(r6)
            boolean r0 = r7.A06
            if (r0 != 0) goto L_0x0043
            int r1 = r7.A02
            int r0 = r7.A01
            if (r1 <= r0) goto L_0x0043
            X.02m r5 = r7.A09
            int r4 = r7.A08
            r5.markerStart(r4)
            java.lang.String r1 = "module"
            java.lang.String r0 = r7.A0A
            r5.markerAnnotate(r4, r1, r0)
            java.lang.String r2 = "is_user_sampled"
            boolean r0 = r7.A0D
            r3 = 1
            if (r0 == 0) goto L_0x0028
            boolean r1 = r7.A0C
            r0 = 1
            if (r1 != 0) goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            r5.markerAnnotate(r4, r2, r0)
            java.lang.String r2 = "scroll_distance"
            int r1 = r7.A02
            int r0 = r7.A01
            int r1 = r1 - r0
            r5.markerAnnotate(r4, r2, r1)
            java.lang.String r0 = "scroll_event"
            r5.markerAnnotate(r4, r0, r3)
            r0 = 2
            r7.A03(r0, r6)
            int r0 = r7.A02
            r7.A01 = r0
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C228312lJ.onPause():void");
    }

    public final /* synthetic */ void onResume() {
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

    public static final void A00(C228312lJ r5, boolean z) {
        JPT jpt;
        if (!z && (jpt = r5.A04) != null) {
            jpt.DC4(AnonymousClass05K.A00);
        }
        if (r5.A06 && !r5.A07 && r5.A05 == null) {
            02m r4 = r5.A09;
            if (z) {
                r4.markerPoint(r5.A08, "tail_load_interruption_end");
            }
            r4.markerAnnotate(r5.A08, "scroll_distance", r5.A00 - r5.A01);
            r5.A01 = r5.A00;
            r5.A03(2, false);
            r5.A06 = false;
            14i.A06(r5);
        }
    }

    private final void A01(boolean z) {
        JPT jpt = this.A04;
        if (jpt != null) {
            jpt.DC4(AnonymousClass05K.A0C);
        }
        if (this.A06) {
            this.A09.markerAnnotate(this.A08, "scroll_distance", this.A00 - this.A01);
            this.A01 = this.A00;
            A03(4, z);
            this.A06 = false;
            14i.A06(this);
        }
    }

    public final void onAppBackgrounded() {
        int A032 = AnonymousClass0fD.A03(773167759);
        A01(true);
        AnonymousClass0fD.A0A(-1878493089, A032);
    }

    public final void onAppForegrounded() {
        AnonymousClass0fD.A0A(-565875453, AnonymousClass0fD.A03(-616180119));
    }

    public final void onScroll(C238133Ar r8, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int A032 = AnonymousClass0fD.A03(-1496942068);
        0qQ.A0B(r8, 0);
        if (i5 == 0) {
            i6 = -1689167369;
        } else {
            int i8 = this.A03;
            DisplayMetrics displayMetrics = this.A0E;
            0qQ.A06(displayMetrics);
            RectF rectF = 0nA.A01;
            int i9 = i8 + ((int) (((float) i5) / displayMetrics.density));
            this.A03 = i9;
            if (i9 > this.A02) {
                this.A02 = i9;
            }
            if (((double) i9) < 0.0d) {
                if (r8.CEd() instanceof RecyclerView) {
                    ViewGroup CEd = r8.CEd();
                    0qQ.A0C(CEd, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
                    i7 = (int) (((float) ((RecyclerView) CEd).computeVerticalScrollOffset()) / displayMetrics.density);
                } else {
                    i7 = 0;
                }
                this.A03 = i7;
            }
            i6 = 2065069188;
        }
        AnonymousClass0fD.A0A(i6, A032);
    }

    public final void onScrollStateChanged(C238133Ar r3, int i) {
        AnonymousClass0fD.A0A(-1679543903, AnonymousClass0fD.A03(1398150722));
    }
}
