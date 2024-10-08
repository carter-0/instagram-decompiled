package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.instagram.react.modules.base.IgReactQEModule;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;

public final class TGJ implements Runnable {
    public final /* synthetic */ C10416Rrs A00;
    public final /* synthetic */ C10938S1r A01;

    public TGJ(C10416Rrs rrs, C10938S1r s1r) {
        this.A00 = rrs;
        this.A01 = s1r;
    }

    public final void run() {
        int i;
        ST3 st3;
        String str;
        C11026S6d s6d;
        long j;
        long j2;
        C10416Rrs rrs = this.A00;
        ST9 st9 = rrs.A01;
        if (st9.A0w == rrs.A00) {
            T9D t9d = C7860Qbk.A00;
            C10938S1r s1r = this.A01;
            SNX snx = s1r.A00;
            switch (snx.A03.ordinal()) {
                case 2:
                    if (snx.A02 == 1) {
                        st9.A09();
                        break;
                    }
                    break;
                case 3:
                case 8:
                case 10:
                    i = ((S0O) s1r.A02).A00;
                    break;
                case 11:
                    st9.A09();
                    if (st9.A07.A00 && (st3 = st9.A0w) != null && st3.A0Y == AnonymousClass05K.A0C) {
                        long A0C = Pxe.A0C(st3.A0V);
                        ST2 st2 = st9.A0D;
                        try {
                            str = C9559Rcw.A00((C10675RwE) null, (C7862Qbm) null, (C7866Qbq) null, ST2.A00(st2), (C7864Qbo) st2.A05(C7864Qbo.class), ST2.A01(st2, A0C), (C7867Qbr) null, (C7868Qbs) null, false, true).toString();
                        } catch (JSONException unused) {
                            str = "";
                        }
                        if (!TextUtils.isEmpty(str)) {
                            try {
                                st9.A04((C13719Tfk) null, AnonymousClass05K.A00, "/mqtt_health_stats", str.getBytes(ReactWebViewManager.HTML_ENCODING));
                                break;
                            } catch (UnsupportedEncodingException unused2) {
                                throw AnonymousClass7TE.A15("UTF-8 not supported");
                            } catch (C241873Rq unused3) {
                                break;
                            }
                        }
                    }
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    i = -1;
                    break;
            }
            t9d = C7861Qbl.A00(Integer.valueOf(i));
            if (!(t9d instanceof C7860Qbk)) {
                t9d.A01();
                SIa sIa = st9.A0O;
                Number number = (Number) t9d.A01();
                int intValue = number.intValue();
                Map map = sIa.A02;
                synchronized (map) {
                    s6d = (C11026S6d) map.remove(number);
                }
                if (s6d != null) {
                    if (s6d.A07 != null) {
                        s6d.A07.onSuccess(s6d.A01);
                    }
                    if (s6d.A06 != null) {
                        s6d.A06.cancel(false);
                    }
                    SystemClock.elapsedRealtime();
                    long elapsedRealtime = SystemClock.elapsedRealtime() - s6d.A02;
                    if (s6d.A04.equals(RFZ.PUBACK)) {
                        AtomicLong atomicLong = (AtomicLong) ((C12249Sq3) sIa.A01.A05(C7864Qbo.class)).A01(RJ0.PublishAcknowledgementMs);
                        if (elapsedRealtime > 0) {
                            do {
                                j = atomicLong.get();
                                if (j == 0) {
                                    j2 = elapsedRealtime;
                                } else {
                                    j2 = (long) ((((double) j) * 0.8d) + (((double) elapsedRealtime) * 0.2d));
                                }
                            } while (!atomicLong.compareAndSet(j, j2));
                        }
                    }
                    sIa.A00.A04(s6d.A05, elapsedRealtime, 1, intValue, s6d.A01, s6d.A03.A0V);
                }
                t9d.A01();
            }
            st9.A0M.DRj(s1r);
        }
    }
}
