package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import java.util.ArrayList;
import java.util.Iterator;

public final class WFQ implements X2E {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ VS4 A01;
    public final /* synthetic */ C298775u0 A02;
    public final /* synthetic */ VOB A03;

    public WFQ(UserSession userSession, VS4 vs4, C298775u0 r3, VOB vob) {
        this.A02 = r3;
        this.A00 = userSession;
        this.A01 = vs4;
        this.A03 = vob;
    }

    public final void DPZ(WFU wfu) {
        WFU wfu2 = wfu;
        0qQ.A0B(wfu, 0);
        C298775u0 r4 = this.A02;
        ArrayList arrayList = r4.A01;
        UserSession userSession = this.A00;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MediaMapPin mediaMapPin = (MediaMapPin) it.next();
            if (mediaMapPin.A00() != null) {
                arrayList2.add(mediaMapPin);
            }
        }
        VS4 vs4 = this.A01;
        if (!arrayList2.equals(vs4.A00)) {
            WZ4 wz4 = new WZ4();
            Context context = wfu.A0G;
            0qQ.A07(context);
            int A012 = AnonymousClass1GB.A01(0nA.A04(context, 44));
            wfu.A0A(new UH0((X8E) new WFB(wfu2, userSession, wz4, arrayList2, A012, Math.round(C16079Uo6.A00(context, (float) A012))), wfu));
            C14723U4m u4m = vs4.A01;
            C18682Vwg.A01(wfu, arrayList2, u4m.getHeight(), u4m.getWidth());
            wfu.A06 = new WFH(1, r4, this.A03);
            vs4.A00 = arrayList2;
        }
    }
}
