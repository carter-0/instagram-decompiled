package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class GF2 extends C270664h6 implements JRF {
    public C59721JVf A00;
    public AnonymousClass1DQ A01 = new AnonymousClass1DQ();
    public Integer A02;
    public final C61410nE A03 = C61410nE.A00;
    public final AnonymousClass1DQ A04 = new AnonymousClass1DQ();
    public final UserSession A05;
    public final C249763kK A06;

    public final void D3u(C52263GLe gLe) {
        A02(true);
        this.A04.A01.clear();
    }

    public final void DaS(C267324bN r9, int i, int i2, boolean z) {
        0qQ.A0B(r9, 0);
        1Xj r6 = r9.A02;
        if (r6 != null) {
            C243993aT A002 = this.A01.A00(r6);
            0qQ.A0B(this.A03, 0);
            C55607HkS hkS = A002.A0A;
            hkS.A01 = ((long) i) + (((long) i2) * A002.A07.A01);
            hkS.A00 = System.currentTimeMillis() / 1000;
            C243993aT A003 = this.A01.A00(r6);
            A003.A0B = Double.valueOf((((double) i) / ((double) i2)) + ((double) A003.A07.A01));
        }
    }

    public final void DxZ(C267324bN r6, int i, int i2) {
        0qQ.A0B(r6, 0);
        1Xj r1 = r6.A02;
        if (r1 != null) {
            C243993aT A002 = this.A01.A00(r1);
            0qQ.A0B(this.A03, 0);
            C55606HkR hkR = A002.A07;
            hkR.A01++;
            hkR.A00 = AnonymousClass7TG.A0I();
        }
    }

    public static final void A00(GF2 gf2, Integer num) {
        if (gf2.A00 != null) {
            0f9 AEf = 0wj.A01.AEf("ClipsViewerSessionMediaInfo#onDestinationEntry", 817902720);
            AEf.ABQ(DialogModule.KEY_MESSAGE, "Entering destination when previous destination has not been finalized");
            AEf.report();
        }
        gf2.A02 = num;
        C59721JVf jVf = new C59721JVf((Long) null, (DefaultConstructorMarker) null, 1, 29);
        0qQ.A0B(gf2.A03, 0);
        jVf.A00 = C51968G9o.A0u();
        gf2.A00 = jVf;
    }

    public final String A01() {
        AnonymousClass1DQ r3 = this.A04;
        r3.A01(this.A01);
        this.A01 = new AnonymousClass1DQ();
        try {
            r3.A00 = this.A06.getSessionId();
            StringWriter stringWriter = new StringWriter();
            17W A0K = AnonymousClass7TF.A0K(stringWriter);
            String str = r3.A00;
            if (str != null) {
                A0K.A0R(C46346Dcp.A00(), str);
            }
            Map map = r3.A01;
            A0K.A0q("media_info");
            A0K.A0c();
            Iterator A0u = AnonymousClass7TF.A0u(map);
            while (A0u.hasNext()) {
                Map.Entry entry = (Map.Entry) A0u.next();
                if (!16P.A04(A0K, entry)) {
                    C243993aT r32 = (C243993aT) entry.getValue();
                    A0K.A0c();
                    C55607HkS hkS = r32.A0A;
                    A0K.A0q("total_watch_time_ms");
                    A0K.A0c();
                    A0K.A0Q(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, hkS.A01);
                    A0K.A0Q("latest_play_end_ts", hkS.A00);
                    A0K.A0Z();
                    C55606HkR hkR = r32.A07;
                    A0K.A0q("num_loops");
                    A0K.A0c();
                    A0K.A0Q(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, hkR.A01);
                    A0K.A0Q("last_loop_end_ts", hkR.A00);
                    A0K.A0Z();
                    if (r32.A08 != null) {
                        A0K.A0q("reshare_button_tap");
                        C55458Hi2 hi2 = r32.A08;
                        A0K.A0c();
                        A0K.A0S("did_tap", hi2.A00);
                        A0K.A0Z();
                    }
                    if (r32.A04 != null) {
                        A0K.A0q("external_reshare_button_tap");
                        C55455Hhz hhz = r32.A04;
                        A0K.A0c();
                        A0K.A0S("did_tap", hhz.A00);
                        A0K.A0Z();
                    }
                    if (r32.A02 != null) {
                        A0K.A0q("profile_visit");
                        HWT.A00(r32.A02, A0K);
                    }
                    if (r32.A00 != null) {
                        A0K.A0q("audio_page_visit");
                        HWT.A00(r32.A00, A0K);
                    }
                    if (r32.A01 != null) {
                        A0K.A0q("effect_page_visit");
                        HWT.A00(r32.A01, A0K);
                    }
                    if (r32.A03 != null) {
                        A0K.A0q("comment_button_tap");
                        C55454Hhy hhy = r32.A03;
                        A0K.A0c();
                        A0K.A0S("did_tap", hhy.A00);
                        A0K.A0Z();
                    }
                    if (r32.A09 != null) {
                        A0K.A0q("screenshot");
                        C55459Hi3 hi3 = r32.A09;
                        A0K.A0c();
                        A0K.A0S("did_capture", hi3.A00);
                        A0K.A0Z();
                    }
                    if (r32.A05 != null) {
                        A0K.A0q("interested");
                        C55456Hi0 hi0 = r32.A05;
                        A0K.A0c();
                        A0K.A0S("impression_control_button_tap", hi0.A00);
                        A0K.A0Z();
                    }
                    if (r32.A06 != null) {
                        A0K.A0q("not_interested");
                        C55457Hi1 hi1 = r32.A06;
                        A0K.A0c();
                        A0K.A0S("impression_control_button_tap", hi1.A00);
                        A0K.A0Z();
                    }
                    A0K.A0Z();
                }
            }
            A0K.A0Z();
            A0K.A0Z();
            A0K.close();
            return stringWriter.toString();
        } catch (IOException unused) {
            return null;
        }
    }

    public final void A02(boolean z) {
        AnonymousClass1DQ r4;
        1DP A002 = 1DO.A00(this.A05);
        if (z) {
            r4 = this.A04;
        } else {
            r4 = this.A01;
        }
        0qQ.A0B(r4, 0);
        if (182.A06(0Tu.A05, A002.A01, 36323174078950371L)) {
            A002.A00.A01(r4);
        }
    }

    public final void Dzs() {
    }

    public GF2(UserSession userSession) {
        this.A05 = userSession;
        this.A06 = AnonymousClass93S.A00(userSession);
    }

    public final void D7O(C267324bN r1, List list) {
    }

    public final void DaP(C52078GDy gDy, boolean z) {
    }

    public final void Dxg(C267324bN r1, int i) {
    }

    public final void Dxi(C267324bN r1, int i) {
    }

    public final void Dxm(C267324bN r1, Integer num, int i) {
    }

    public final void Dzr(C267324bN r1, JRO jro, boolean z) {
    }

    public final void Dxl(C267324bN r1, C52058GDe gDe, C52019GBq gBq, C52078GDy gDy, boolean z) {
    }
}
