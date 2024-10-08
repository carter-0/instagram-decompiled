package X;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import com.google.common.util.concurrent.ListenableFuture;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.ClipInfo;

public final class AGu {
    public static final void A00(Context context, UserSession userSession, DirectShareTarget directShareTarget, C381779cJ r13, String str, String str2) {
        Long A10;
        Context context2 = context;
        UserSession userSession2 = userSession;
        boolean A1Z = AnonymousClass7TG.A1Z(context, userSession);
        C352218Cl r2 = new C352218Cl();
        r2.A0D(str2);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = A1Z;
        BitmapFactory.decodeFile(str2, options);
        r2.A06 = options.outHeight;
        r2.A09 = options.outWidth;
        String str3 = r13.A06;
        if (str3 == null) {
            str3 = "replayable";
        }
        String str4 = r13.A01;
        if (str4 == null && (str4 = r13.A05) == null) {
            A10 = null;
        } else {
            A10 = AnonymousClass7TE.A10(str4);
        }
        C254783t2 r1 = directShareTarget.A09;
        r1.getClass();
        1aU EN3 = OXC.A00(userSession2, r1).EN3(r1, r2, A10, str3, (String) null, r13.A07);
        0qQ.A07(EN3);
        C39622A2m.A01.A02(EN3, new PSX(context2, userSession2, directShareTarget, str, A1Z ? 1 : 0));
    }

    public final void A02(Context context, UserSession userSession, DirectShareTarget directShareTarget, C381779cJ r13, AnonymousClass3Q2 r14, String str) {
        AnonymousClass7TG.A1N(context, userSession);
        ListenableFuture Eyk = C39622A2m.A00.Eyk(new C13146TNe(3, r14, userSession, context));
        0qQ.A07(Eyk);
        C255183ti.A04(new AWW(context, userSession, directShareTarget, r13, r14, str), Eyk, 1Lf.A01);
    }

    public static final void A01(Context context, UserSession userSession, DirectShareTarget directShareTarget, C381779cJ r9, String str, String str2) {
        long j;
        Long A10;
        Long A102;
        AnonymousClass7TG.A1N(context, userSession);
        0qQ.A0B(str2, 3);
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(str2);
        String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
        if (extractMetadata == null || (A102 = AnonymousClass7TE.A10(extractMetadata)) == null) {
            j = 0;
        } else {
            j = A102.longValue();
        }
        ClipInfo A02 = Q0X.A02(userSession, AnonymousClass7TE.A0t(str2), j);
        String str3 = r9.A06;
        if (str3 == null) {
            str3 = "replayable";
        }
        String str4 = r9.A01;
        if (str4 == null && (str4 = r9.A05) == null) {
            A10 = null;
        } else {
            A10 = AnonymousClass7TE.A10(str4);
        }
        C254783t2 r1 = directShareTarget.A09;
        r1.getClass();
        1aU EN2 = OXC.A00(userSession, r1).EN2(r1, A02, A10, str3, (String) null);
        0qQ.A07(EN2);
        C39622A2m.A01.A02(EN2, new PUA(context, str, 2));
    }
}
