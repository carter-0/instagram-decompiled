package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.pendingmedia.model.ClipInfo;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.KsE  reason: case insensitive filesystem */
public abstract class C63145KsE {
    public static final void A00(Activity activity, Context context, UserSession userSession, C293505kq r30, AnonymousClass3Q2 r31, String str, String str2, String str3, List list, boolean z, boolean z2) {
        QP5 qp5;
        String str4;
        String lowerCase;
        String str5;
        String str6;
        AnonymousClass804 r0;
        String typeName;
        AnonymousClass3Q2 r3 = r31;
        UserSession userSession2 = userSession;
        ClipInfo A02 = Q0X.A02(userSession2, AnonymousClass7TE.A0t(str), (long) JTO.A09(r3.A1N));
        String str7 = null;
        C293505kq r4 = r30;
        if (z2) {
            String str8 = r4.A0T;
            AudioOverlayTrack audioOverlayTrack = r4.A0N;
            if (audioOverlayTrack != null) {
                str7 = audioOverlayTrack.A0B;
            }
            qp5 = new QP5(str8, "share_to_direct", str3, str7, 8);
        } else {
            qp5 = null;
        }
        if (z2) {
            str4 = "reels_share_to_direct_share_sheet";
        } else {
            str4 = "";
        }
        AnonymousClass9P8 r6 = r4.A0E;
        if (r6 == null || (r0 = r6.A04) == null || (typeName = r0.getTypeName()) == null) {
            Locale locale = Locale.getDefault();
            0qQ.A07(locale);
            lowerCase = "REMIX".toLowerCase(locale);
        } else {
            Locale locale2 = Locale.getDefault();
            0qQ.A07(locale2);
            lowerCase = typeName.toLowerCase(locale2);
        }
        0qQ.A07(lowerCase);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DirectShareTarget directShareTarget = (DirectShareTarget) it.next();
            if (directShareTarget.A01() instanceof AnonymousClass9HR) {
                C59689JTv.A0B(activity, "thread_target_is_msys");
            } else {
                String str9 = r3.A33;
                if (str9 == null) {
                    str9 = "";
                }
                if (str2 != null) {
                    str5 = str2;
                } else if (r6 == null || (str5 = r6.A09) == null) {
                    str5 = "";
                }
                0qQ.A0B(userSession2, 0);
                Context context2 = context;
                AnonymousClass7TF.A1B(context2, 1, A02);
                AnonymousClass7Z6 A00 = AnonymousClass7Z6.A00(userSession2);
                if (qp5 != null) {
                    str6 = qp5.A02;
                } else {
                    str6 = null;
                }
                A00.EN0(context2, qp5, (C254933tI) null, directShareTarget, A02, (AnonymousClass3Q2) null, (Boolean) null, str9, str6, str4, str5, lowerCase, (String) null, false, true, z);
            }
        }
    }
}
