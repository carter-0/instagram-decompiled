package X;

import android.content.Context;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.creation.base.MediaSession;
import java.util.List;

public final /* synthetic */ class M9T implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C3499682q A01;
    public final /* synthetic */ K9C A02;
    public final /* synthetic */ C267834cI A03;

    public /* synthetic */ M9T(Context context, C3499682q r2, K9C k9c, C267834cI r4) {
        this.A02 = k9c;
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = context;
    }

    public final void run() {
        List list;
        L49 l49;
        Context applicationContext;
        int i;
        String str;
        K9C k9c = this.A02;
        C3499682q r7 = this.A01;
        C267834cI r2 = this.A03;
        Context context = this.A00;
        if (r7.COf()) {
            AnonymousClass3Q2 A05 = JWE.A05(r2, r7);
            AnonymousClass3Q2 BbQ = r2.BbQ(JTU.A0X(r7, 0));
            if (BbQ == null) {
                0kD.A01("MediaPreviewAdapter", 002.A0u("firstMedia is null and path for media type video mediasession", ((MediaSession) r7.Co4().get(0)).B5g(), "pendingMediakey value ", JTU.A0X(r7, 0)));
                applicationContext = context.getApplicationContext();
                i = 2131974093;
                str = "first_media_is_null";
            } else {
                String str2 = BbQ.A33;
                if (str2 == null) {
                    0kD.A01("MediaPreviewAdapter", 002.A0u("firstMedia thumbnail is null", ((MediaSession) r7.Co4().get(0)).B5g(), "pendingMediakey value ", JTU.A0X(r7, 0)));
                    applicationContext = context.getApplicationContext();
                    i = 2131974093;
                    str = "first_media_thumbnail_is_null";
                } else {
                    SimpleImageUrl A0G = JTQ.A0G(str2);
                    list = k9c.A05;
                    l49 = new L49(A0G, A05);
                    list.add(l49);
                    return;
                }
            }
        } else {
            AnonymousClass3Q2 BbQ2 = r2.BbQ(r7.E2M());
            BbQ2.getClass();
            String str3 = BbQ2.A33;
            if (str3 == null) {
                applicationContext = context.getApplicationContext();
                i = 2131974093;
                str = "media_thumbnail_is_null";
            } else {
                SimpleImageUrl A0G2 = JTQ.A0G(str3);
                list = k9c.A05;
                l49 = new L49(A0G2, BbQ2);
                list.add(l49);
                return;
            }
        }
        C59689JTv.A01(applicationContext, str, i, 0);
    }
}
