package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

public final class EDS extends 1P0 {
    public static final Map A05 = DbY.A0p("/share/stories/", C51837G3v.A00, AnonymousClass7TE.A1L("/share/reel/", C51836G3u.A00));
    public final Activity A00;
    public final Context A01;
    public final Intent A02;
    public final Bundle A03;
    public final String A04;

    public EDS(Activity activity, Context context, Intent intent, Bundle bundle, String str) {
        this.A00 = activity;
        this.A01 = context;
        this.A04 = str;
        this.A02 = intent;
        this.A03 = bundle;
    }

    public final void onFail(C268654dm r7) {
        int i;
        int A032 = AnonymousClass0fD.A03(-1670257072);
        0qQ.A0B(r7, 0);
        EDS.super.onFail(r7);
        Iterator A0u = AnonymousClass7TF.A0u(A05);
        while (true) {
            if (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                if (00l.A0d(this.A04, (CharSequence) A1J.getKey(), false)) {
                    Intent A09 = DbS.A09();
                    Context context = this.A01;
                    A09.setClassName(context, "com.instagram.url.UrlHandlerActivity");
                    A09.setData(0cp.A03((String) ((0sP) A1J.getValue()).invoke(this.A02)));
                    A09.setFlags(67108864);
                    0kR.A0B(context, A09);
                    this.A00.finish();
                    i = -1289810698;
                    break;
                }
            } else {
                C61037Jvb jvb = (C61037Jvb) r7.A00();
                if (!(jvb == null || jvb.A00 == null)) {
                    C59689JTv.A0D(C60960kU.A00, "link_revamp_network_error");
                }
                Uri A092 = DbT.A09(this.A04);
                Bundle bundle = this.A03;
                DbZ.A11(A092, bundle, "mainfeed");
                Activity activity = this.A00;
                FHB.A03(activity, bundle);
                activity.finish();
                i = -318980579;
            }
        }
        AnonymousClass0fD.A0A(i, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(235779962);
        C61037Jvb jvb = (C61037Jvb) obj;
        int A0D = AnonymousClass7TG.A0D(jvb, 250103944);
        EDS.super.onSuccess(jvb);
        String str = jvb.A01;
        if (str != null) {
            Intent A09 = DbS.A09();
            Context context = this.A01;
            A09.setClassName(context, "com.instagram.url.UrlHandlerActivity");
            A09.setData(0cp.A03(str));
            A09.setFlags(67108864);
            0kR.A0B(context, A09);
            this.A00.finish();
        }
        AnonymousClass0fD.A0A(230676242, A0D);
        AnonymousClass0fD.A0A(-1005841962, A032);
    }
}
