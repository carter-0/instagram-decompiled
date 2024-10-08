package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.GifUrlImpl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.76x  reason: invalid class name and case insensitive filesystem */
public final class C3264776x implements C3264476u {
    public static final C3264776x A00 = new Object();

    public final C328667Fr AM8(Context context, UserSession userSession, AnonymousClass7FE r71, AnonymousClass9HC r72, AnonymousClass7LQ r73) {
        1Xj r2;
        AnonymousClass774 r27;
        AnonymousClass776 r28;
        0Tu r10;
        long j;
        String str;
        String str2;
        Context context2 = context;
        0qQ.A0B(context2, 0);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 1);
        AnonymousClass7FE r14 = r71;
        0qQ.A0B(r14, 2);
        AnonymousClass9HC r12 = r72;
        0qQ.A0B(r12, 3);
        AnonymousClass7LQ r6 = r73;
        0qQ.A0B(r6, 4);
        C254703su r3 = r6.A0e;
        0qQ.A07(r3);
        User user = r6.A0K;
        Object obj = r3.A1T;
        if (obj != null) {
            if (C376649Iu.A00(6, obj)) {
                r2 = (1Xj) ((C376649Iu) obj).A00;
            } else if (obj instanceof AnonymousClass77X) {
                r2 = ((AnonymousClass77X) obj).A01;
                0qQ.A07(r2);
            } else {
                throw new UnsupportedOperationException(002.A0R("Unsupported message content type: ", obj.getClass().getName()));
            }
            boolean z = true;
            if (!C376649Iu.A00(6, obj)) {
                if (obj instanceof AnonymousClass77X) {
                    z = !(!TextUtils.isEmpty(((AnonymousClass77X) obj).A03));
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid content: ");
                    sb.append(obj);
                    throw new IllegalStateException(sb.toString());
                }
            }
            DirectMessageIdentifier A0V = r3.A0V();
            if (z) {
                User A2A = r2.A2A(userSession2);
                if (A2A != null) {
                    r27 = new AnonymousClass774((Drawable) null, (Drawable) null, A2A.getUsername(), (CharSequence) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (String) null, 0sr.A1N(A2A.Bh3()));
                } else {
                    r27 = null;
                }
            } else {
                r27 = null;
            }
            C73909Plk plk = new C73909Plk(obj, 25);
            ExtendedImageUrl A1n = r2.A1n(context2);
            if (A1n != null) {
                r28 = new AnonymousClass776(A1n, false, (Float) null, (Integer) null, (Integer) null, (Integer) plk.invoke(), (String) null);
            } else {
                r28 = null;
            }
            2FW r9 = r3.A10;
            0qQ.A07(r9);
            C48847El9 el9 = C48847El9.$redex_init_class;
            int ordinal = r9.ordinal();
            AnonymousClass74T r26 = null;
            if (ordinal == 37) {
                String title = r2.A0C.getTitle();
                if (title != null) {
                    r26 = new AnonymousClass74T((ImageUrl) null, (ImageUrl) null, (C254893tE) null, title, (CharSequence) null, (CharSequence) null, (CharSequence) null, (CharSequence) null, (CharSequence) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (String) null, 3);
                }
            } else if (ordinal != 46) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Invalid type: ");
                sb2.append(r9);
                throw new IllegalStateException(sb2.toString());
            }
            2FW r92 = r3.A10;
            0qQ.A07(r92);
            String str3 = r3.A1u;
            0qQ.A07(str3);
            int ordinal2 = r92.ordinal();
            if (ordinal2 == 37) {
                r10 = 0Tu.A05;
                j = 36313334307948421L;
            } else if (ordinal2 == 46) {
                r10 = 0Tu.A05;
                j = 36313334308013958L;
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Invalid contentType: ");
                sb3.append(r92);
                throw new IllegalStateException(sb3.toString());
            }
            boolean A06 = 182.A06(r10, userSession2, j);
            0qQ.A0A(Boolean.valueOf(A06));
            if (A06) {
                str = OP4.A01(userSession2, OP3.A00(), r92, obj, new C41655Ay7(userSession2, 22));
            } else {
                str = "";
            }
            AnonymousClass9J6 r0 = new AnonymousClass9J6(str, str3, 5);
            C254883tD r32 = C254883tD.SINGLE;
            if (user != null) {
                str2 = user.getUsername();
            } else {
                str2 = null;
            }
            return new C328667Fr(C70865OPe.A00(r2), (C376649Iu) null, (AnonymousClass9J0) null, r0, (AnonymousClass9J6) null, (AnonymousClass9J6) null, (C61062Jw0) null, (C3259574v) null, AnonymousClass7FG.A00(context2, userSession2, r12, r6, r3.A10), r14, r26, r27, r28, (AnonymousClass778) null, (AnonymousClass77A) null, (AnonymousClass5FY) null, r32, (AnonymousClass779) null, A0V, (C254793t3) null, (GifUrlImpl) null, (ImageInfo) null, (CharSequence) null, (Long) null, (Long) null, (Long) null, str2, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, 0, 0, 0, false, false, false, false, false, false, false, false, false, false);
        }
        throw new IllegalStateException("Required value was null.");
    }
}
