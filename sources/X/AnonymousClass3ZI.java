package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3ZI  reason: invalid class name */
public abstract class AnonymousClass3ZI {
    public static final SpannableStringBuilder A00(Context context, UserSession userSession, 1Xj r23, User user, Integer num, String str, C62320sa r27, 0sL r28, int i, boolean z) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        int i2 = 0;
        Context context2 = context;
        1Xj r2 = r23;
        String str2 = str;
        C62320sa r7 = r27;
        0sL r8 = r28;
        int i3 = i;
        boolean z2 = z;
        if (num != null && num.intValue() > 0) {
            User user2 = user;
            if (user != null) {
                List A0a = 00k.A0a(0sc.A07(new User[]{r2.A0C.CCd(), user2}));
                return A01(context2, userSession2, str2, A0a, r7, r8, A0a.size(), i3, 2, z2, false);
            }
        }
        List A3m = r2.A3m(userSession2);
        Integer AoG = r2.A0C.AoG();
        if (AoG != null) {
            i2 = AoG.intValue() + 1;
        }
        if (i2 <= A3m.size()) {
            i2 = A3m.size();
        }
        return A01(context2, userSession2, str2, A3m, r7, r8, i2, i3, 1, z2, false);
    }

    public static final SpannableStringBuilder A01(Context context, UserSession userSession, String str, List list, C62320sa r8, 0sL r9, int i, int i2, int i3, boolean z, boolean z2) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r9, 9);
        SpannableStringBuilder A00 = AnonymousClass4i2.A00(context, userSession2, new C52279GLv(list, r8, r9), str, new ArrayList(list), i, i2, AnonymousClass4i2.A03(userSession2, new ArrayList(list), i3), z2, z).A00();
        0qQ.A07(A00);
        return A00;
    }

    public static final void A02(Context context, SpannableStringBuilder spannableStringBuilder, C243683Zu r3, Integer num, boolean z) {
        boolean z2;
        0qQ.A0B(r3, 4);
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
            case 2:
                if (z && spannableStringBuilder != null) {
                    if (1 - intValue != 0) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    C244273av.A08(context, spannableStringBuilder, z2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public static final void A03(C252063oV r1) {
        View view;
        0qQ.A0B(r1, 0);
        if (r1.CVM() && (view = r1.getView()) != null) {
            2eQ.A04(view, 4);
        }
    }

    public static final boolean A04(Context context, UserSession userSession, 1Xj r6) {
        OriginalSoundDataIntf BZB;
        OriginalSoundDataIntf BZB2;
        OriginalSoundDataIntf BZB3;
        C67231sQ clipsMetadata = r6.A0C.getClipsMetadata();
        if (!(clipsMetadata == null || AnonymousClass3ZJ.A0D(userSession, r6) || (clipsMetadata.BUr() == null && clipsMetadata.BZB() == null))) {
            C67231sQ clipsMetadata2 = r6.A0C.getClipsMetadata();
            String str = null;
            if (!(clipsMetadata2 == null || (BZB2 = clipsMetadata2.BZB()) == null || BZB2.getOriginalAudioTitle() == null)) {
                C67231sQ clipsMetadata3 = r6.A0C.getClipsMetadata();
                if (!(clipsMetadata3 == null || (BZB3 = clipsMetadata3.BZB()) == null)) {
                    str = BZB3.getOriginalAudioTitle();
                }
                if (!0qQ.A0K(str, context.getString(2131955706))) {
                    return true;
                }
            }
            C67231sQ clipsMetadata4 = r6.A0C.getClipsMetadata();
            User user = null;
            if (clipsMetadata4 == null || clipsMetadata4.BZB() == null) {
                return true;
            }
            C67231sQ clipsMetadata5 = r6.A0C.getClipsMetadata();
            if (!(clipsMetadata5 == null || (BZB = clipsMetadata5.BZB()) == null)) {
                user = BZB.BEv();
            }
            if (0qQ.A0K(user, r6.A2A(userSession))) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r1 != false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A06(X.1Xj r1) {
        /*
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.1Xy r0 = r1.A0C
            com.instagram.model.venue.LocationDictIntf r0 = r0.BNh()
            if (r0 == 0) goto L_0x0019
            java.lang.String r0 = r0.getName()
            if (r0 == 0) goto L_0x0019
            boolean r1 = X.00l.A0W(r0)
            r0 = 0
            if (r1 == 0) goto L_0x001a
        L_0x0019:
            r0 = 1
        L_0x001a:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3ZI.A06(X.1Xj):boolean");
    }

    public static final boolean A05(UserSession userSession, 1Xj r4) {
        if (!182.A06(0Tu.A06, userSession, 36325703813641372L) || !r4.A6R(userSession)) {
            return false;
        }
        return true;
    }
}
