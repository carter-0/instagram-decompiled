package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.listview.StickyHeaderListView;
import java.util.List;

/* renamed from: X.35L  reason: invalid class name */
public final class AnonymousClass35L implements C252243on, C2355130d {
    public long A00;
    public long A01;
    public StickyHeaderListView A02;
    public final AnonymousClass0JR A03;
    public final C227812jx A04;
    public final AnonymousClass0iw A05;
    public final 0wc A06;
    public final UserSession A07;
    public final AnonymousClass2rI A08;
    public final C229782oC A09;
    public final C249763kK A0A;

    public AnonymousClass35L(AnonymousClass0JR r2, C227812jx r3, AnonymousClass0iw r4, 0wc r5, UserSession userSession, AnonymousClass2rI r7, C229782oC r8, C249763kK r9) {
        0qQ.A0B(r9, 6);
        this.A04 = r3;
        this.A07 = userSession;
        this.A06 = r5;
        this.A08 = r7;
        this.A09 = r8;
        this.A0A = r9;
        this.A05 = r4;
        this.A03 = r2;
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final void D6z(View view) {
        0qQ.A0B(view, 0);
        this.A02 = (StickyHeaderListView) view.findViewById(R.id.sticky_header_list);
    }

    public final void FN9(AnonymousClass345 r10, int i) {
        AnonymousClass345 r3 = r10;
        0qQ.A0B(r10, 0);
        AnonymousClass2rI r1 = this.A08;
        Object item = r1.getItem(i);
        if (item != null) {
            1sU r5 = (1sU) item;
            String str = r5.A04.A0B;
            if (str != null) {
                r10.FNB(str, r5, r1.A05(r5).getPosition());
                C238133Ar scrollingViewProxy = this.A04.getScrollingViewProxy();
                int B6L = scrollingViewProxy.B6L();
                View AnE = scrollingViewProxy.AnE(i);
                if (AnE == null) {
                    0KC.A0Q("EndOfFeedDemarcatorTracked", "row View is null, position:%d, first visible position: %d", new Object[]{Integer.valueOf(i), Integer.valueOf(B6L)});
                    return;
                }
                ViewGroup CEd = scrollingViewProxy.CEd();
                0qQ.A07(CEd);
                double A012 = ((double) C253923rd.A01(CEd, AnE, this.A02)) / ((double) AnE.getHeight());
                if (A012 > 0.0d) {
                    r3.FNC(AnE, r5, str, A012);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final void onCreate() {
    }

    public final void onDestroy() {
    }

    public final void onDestroyView() {
        this.A02 = null;
    }

    public final void onPause() {
    }

    public final void onResume() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final void onViewCreated(View view, Bundle bundle) {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public final Class C9I() {
        return 1sU.class;
    }

    public final /* bridge */ /* synthetic */ void Crz(Object obj) {
        String str;
        Long A0n;
        int i;
        1sU r11 = (1sU) obj;
        0qQ.A0B(r11, 0);
        C297535ru r16 = C297535ru.OTHER;
        if (this.A01 != 0) {
            long now = this.A03.now();
            long j = now - this.A01;
            this.A01 = 0;
            if (now - this.A00 >= 3000) {
                AnonymousClass2rI r9 = this.A08;
                AnonymousClass523 A052 = r9.A05(r11);
                C297555rw A002 = C297545rv.A00(this.A07);
                C249763kK r10 = this.A0A;
                String sessionId = r10.getSessionId();
                AnonymousClass0iw r12 = this.A05;
                String moduleName = r12.getModuleName();
                0wc A012 = AnonymousClass0kN.A01(new 0xG(moduleName), A002.A00);
                0Aj A003 = A012.A00(A012.A00, "instagram_feed_demarcator");
                if (A003.isSampled()) {
                    A003.AAJ("module", moduleName);
                    A003.A9F("ig_media_id", Long.MIN_VALUE);
                    A003.AAJ("inventory_source", r11.A07.toString());
                    A003.A9F("m_ix", Long.valueOf((long) A052.getPosition()));
                    A003.AAJ("ranking_session_id", sessionId);
                    A003.AAJ("detail", A052.A02);
                    A003.Cgf();
                }
                if (!(r11.A07 != 1UQ.A0F || (str = r11.A04.A0B) == null || (A0n = 00y.A0n(10, str)) == null)) {
                    0wc r5 = this.A06;
                    0Aj A004 = r5.A00(r5.A00, "ig_main_feed_seen_eof_demarcator");
                    if (A004.isSampled()) {
                        A004.A9F("demarcator_id", A0n);
                        A004.AAJ("module", r12.getModuleName());
                        A004.AAJ("ranking_session_id", r10.getSessionId());
                        A004.A8D("dwell_time", Double.valueOf((double) j));
                        A004.AAJ(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r16.toString());
                        int[] modelIndex = r9.getModelIndex(r11);
                        if (!(modelIndex == null || modelIndex.length == 0)) {
                            int i2 = modelIndex[0];
                            C231352rU r92 = (C231352rU) r9.A00;
                            synchronized (r92.A03) {
                                i = -1;
                                List list = r92.A01;
                                0qQ.A07(list);
                                int i3 = 0;
                                while (i3 < list.size() && i3 <= i2) {
                                    if (((1Xg) r92.A01.get(i3)).A05 instanceof 1Xl) {
                                        i++;
                                    }
                                    i3++;
                                }
                            }
                            if (i != -1) {
                                A004.A9F("last_media_index", Long.valueOf((long) i));
                            }
                        }
                        A004.Cgf();
                    }
                }
                this.A00 = now;
            }
        }
    }

    public final /* bridge */ /* synthetic */ void Cs1(Object obj, int i) {
        if (this.A01 == 0) {
            this.A01 = this.A03.now();
        }
        if (this.A04.getContext() != null) {
            AnonymousClass2yJ.A00(AnonymousClass05K.A1F);
            if (i == 0) {
                AnonymousClass2yJ.A00(AnonymousClass05K.A15);
            }
        }
    }

    public final /* bridge */ /* synthetic */ void Cs3(View view, Object obj, double d) {
        1sU r6 = (1sU) obj;
        0qQ.A0B(r6, 0);
        AnonymousClass523 A052 = this.A08.A05(r6);
        if ((!0qQ.A0K(r6.A04.A07, false)) && d > 0.800000011920929d && !A052.A03) {
            A052.A03 = true;
            this.A09.ANZ(r6);
        }
        if (d > 0.75d) {
            A052.A00();
        }
    }

    public final /* bridge */ /* synthetic */ void Cry(Object obj) {
    }

    public final /* bridge */ /* synthetic */ void Cs0(Object obj, int i) {
    }
}
