package X;

import android.content.Context;
import android.graphics.Rect;
import android.os.MessageQueue;
import android.util.Log;
import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CropInfo;
import java.io.File;

public final class GVC extends 0Yg implements C62320sa {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GVC(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        super(0);
        this.A00 = i2;
        this.A03 = obj;
        this.A05 = obj2;
        this.A04 = obj3;
        this.A01 = i;
        this.A02 = obj4;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                Context context = (Context) this.A03;
                OYc oYc = (OYc) this.A05;
                0rk r5 = (0rk) this.A04;
                int i = this.A01;
                AnonymousClass5PL r2 = (AnonymousClass5PL) this.A02;
                0fg.A01("MetaComposeViewPool#queueIdle", -1533671705);
                try {
                    GWO gwo = new GWO(context);
                    gwo.A07(r2);
                    MessageQueue messageQueue = OYc.A02;
                    oYc.A00.add(gwo);
                } catch (Exception e) {
                    Log.e("MetaComposeViewPool", AnonymousClass7TG.A0m(e, "Failed to prepare views: ", AnonymousClass7TE.A1A()), e);
                } catch (Throwable th) {
                    0fg.A00(-1861452310);
                    throw th;
                }
                boolean z = true;
                int i2 = r5.A00 + 1;
                r5.A00 = i2;
                if (i2 >= i) {
                    z = false;
                }
                Boolean valueOf = Boolean.valueOf(z);
                0fg.A00(599858048);
                return valueOf;
            case 1:
                long A002 = ((GQN) this.A05).A00(GQF.A00(Float.MAX_VALUE, Float.MAX_VALUE));
                long A003 = C289325dP.A00(C51971G9r.A01(A002), C51972G9s.A00(A002));
                C287805an r22 = C287765aj.A06;
                C55595HkF hkF = (C55595HkF) this.A04;
                if (C289295dM.A00(GQI.A00((AnonymousClass6HR) this.A02, r22, C51965G9l.A0M(C51969G9p.A0H(hkF.A00.A04)), C51965G9l.A0M(A003))) <= ((float) this.A01)) {
                    AnonymousClass7TE.A1Z(new MGA((Object) hkF, (AnonymousClass4D7) null, 8, A003), hkF.A01);
                    break;
                } else {
                    C51971G9r.A1N(this.A03, A003);
                    break;
                }
            case 4:
                File file = (File) this.A05;
                int i3 = this.A01;
                C64188LSv.A02((AnonymousClass3Q2) this.A04, file, i3, i3, 50);
                C64168LRo lRo = (C64168LRo) this.A02;
                Context context2 = (Context) this.A03;
                lRo.A02(context2, new CropInfo(new Rect(0, 0, i3, i3), i3, i3), 0, false);
                lRo.A05(context2, file.getAbsolutePath());
                break;
            case 5:
                OMU omu = (OMU) this.A04;
                if (omu != null) {
                    omu.A00();
                }
                C243473Yx.A06((FragmentActivity) this.A03, (ClipsViewerConfig) this.A02, ((OJc) this.A05).A00, this.A01);
                break;
            case 6:
                int i4 = this.A01;
                ((JQG) this.A02).Dkx((AnonymousClass3V2) this.A03, (1Xj) this.A04, (GQ0) null, (AnonymousClass3W1) this.A05, i4);
                break;
            case 7:
                ((AnonymousClass5V5) ((AnonymousClass5V6) this.A02)).A00.performHapticFeedback(0);
                ((0sK) this.A04).invoke(((C53311Glx) this.A03).A04, Integer.valueOf(this.A01), this.A05);
                break;
            default:
                UserSession userSession = (UserSession) this.A05;
                int i5 = this.A01;
                AnonymousClass86D r23 = (AnonymousClass86D) this.A04;
                AnonymousClass86A r4 = (AnonymousClass86A) this.A03;
                AnonymousClass7TG.A0w(1, userSession, r23, r4);
                return new C357358Xo(r23, userSession, r4, (C357348Xn) this.A02, i5);
        }
        return C60340gF.A00;
    }
}
