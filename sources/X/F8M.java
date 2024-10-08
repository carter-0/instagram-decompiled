package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.LruCache;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

public abstract class F8M {
    public static final void A01(Fragment fragment, C48145EZn eZn, C48142EZk eZk, UserSession userSession, Integer num, String str) {
        AnonymousClass7TG.A1N(fragment, userSession);
        Context requireContext = fragment.requireContext();
        boolean A01 = C267044ar.A01(requireContext, userSession);
        EQb eQb = new EQb(requireContext, fragment.mFragmentManager, eZn, eZk, userSession, num, str, A01);
        1OC A00 = C49120Epj.A00(eZn, userSession, num);
        A00.A00 = eQb;
        ((AnonymousClass4D6) fragment).schedule(A00);
    }

    public static final void A00(Context context, Integer num, String str, String str2, String str3) {
        if (num == AnonymousClass05K.A0u) {
            if (str3 == null) {
                str3 = "";
            }
            C49899FCc.A02(context, str3, str2);
        } else if (num == AnonymousClass05K.A0j) {
            Intent A06 = DbY.A06("android.intent.action.SENDTO");
            LruCache lruCache = 0cp.A00;
            A06.setData(Uri.parse("mailto:"));
            A06.putExtra("android.intent.extra.SUBJECT", str);
            A06.putExtra("android.intent.extra.TEXT", str2);
            0kR.A0D(context, A06);
        } else {
            Intent A09 = DbS.A09();
            A09.setAction("android.intent.action.SEND");
            A09.putExtra("android.intent.extra.SUBJECT", str);
            A09.putExtra("android.intent.extra.TEXT", str2);
            A09.setType("text/plain");
            if (num == AnonymousClass05K.A1F) {
                A09.setPackage("com.whatsapp");
            }
            0kR.A00(context, Intent.createChooser(A09, (CharSequence) null));
        }
    }
}
