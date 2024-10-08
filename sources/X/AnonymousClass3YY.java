package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import com.instagram.android.R;
import com.instagram.api.schemas.PollType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;
import org.webrtc.CameraCapturer;

/* renamed from: X.3YY  reason: invalid class name */
public abstract class AnonymousClass3YY {
    public static final C272034jz A00(1Xj r4) {
        List list;
        C255783ui r0;
        C272034jz r2;
        if (r4 != null) {
            C272054k1 AlM = r4.A0C.AlM();
            if (AlM != null) {
                r2 = AlM.BdV();
            } else {
                r2 = null;
            }
            list = r4.A3o(AnonymousClass3WT.POLLING);
            if (r2 != null) {
                return r2;
            }
        } else {
            list = null;
        }
        if (!A05(list) || list == null || (r0 = (C255783ui) list.get(0)) == null) {
            return null;
        }
        return r0.A0E();
    }

    public static final CharSequence A01(Context context, UserSession userSession, C272034jz r15, C62320sa r16, 0sP r17, boolean z, boolean z2) {
        int i;
        Integer num;
        int i2;
        List<User> BxQ;
        Context context2 = context;
        if (r15 != null) {
            UserSession userSession2 = userSession;
            float f = 0.0f;
            for (int i3 : C297825sP.A03(userSession, r15, true)) {
                f += (float) i3;
            }
            i = (int) f;
            C258223yf BxM = r15.BxM();
            if (!(BxM == null || (BxQ = BxM.BxQ()) == null)) {
                Integer A00 = C52319GNl.A00(userSession).A00(r15);
                boolean z3 = false;
                if (A00 != null) {
                    z3 = true;
                }
                C270624h2 r5 = C270624h2.A00;
                ArrayList arrayList = new ArrayList(0Yv.A1E(BxQ, 10));
                for (User username : BxQ) {
                    arrayList.add(username.getUsername());
                }
                SpannableStringBuilder A04 = r5.A04(context2, userSession2, Integer.valueOf(i), arrayList, r16, r17, true, z2, z3);
                if (A04.length() != 0) {
                    return A04;
                }
            }
            num = C52319GNl.A00(userSession2).A00(r15);
        } else {
            i = 0;
            num = null;
        }
        if (z) {
            i2 = R.plurals.voters_count;
        } else {
            i2 = R.plurals.voter_count_on_surfaces_voted_viewer;
            if (num == null) {
                i2 = R.plurals.voter_count_on_surfaces;
            }
        }
        Resources resources = context2.getResources();
        0qQ.A07(resources);
        return A02(resources, i2, i);
    }

    public static final void A03(1P0 r3, UserSession userSession, AnonymousClass4D6 r5, String str, String str2) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(str, 2);
        0qQ.A0B(str2, 3);
        1NY r2 = new 1NY(userSession, -2);
        r2.A04();
        r2.A0A(0mp.A06("media/%s/%s/async_delete_poll/", new Object[]{str, str2}));
        r2.A0Q(C43775CCt.class, C45542CyG.class);
        1OC A0M = r2.A0M();
        A0M.A00 = r3;
        r5.schedule(A0M);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A04(com.instagram.common.session.UserSession r3, X.1Xj r4) {
        /*
            r2 = 1
            X.0qQ.A0B(r3, r2)
            X.4jz r0 = A00(r4)
            r1 = 1
            if (r0 == 0) goto L_0x0025
            if (r4 == 0) goto L_0x0020
            boolean r0 = r4.A5b()
            if (r0 == r2) goto L_0x001f
            boolean r0 = r4.A5G()
            if (r0 != r2) goto L_0x0020
            boolean r0 = X.JUO.A00(r3)
        L_0x001d:
            if (r0 == 0) goto L_0x0025
        L_0x001f:
            return r1
        L_0x0020:
            boolean r0 = X.JUO.A01(r3)
            goto L_0x001d
        L_0x0025:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3YY.A04(com.instagram.common.session.UserSession, X.1Xj):boolean");
    }

    public static final boolean A05(List list) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        C272024jy A0E = ((C255783ui) list.get(0)).A0E();
        if (A0E != null) {
            return A0E.A00 == PollType.COMMENT_POLL;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final String A02(Resources resources, int i, int i2) {
        String A04 = C253673rC.A04(resources, Integer.valueOf(i2), CameraCapturer.OPEN_CAMERA_TIMEOUT, true, false);
        if (i2 != 0) {
            return resources.getQuantityString(i, i2, new Object[]{A04});
        }
        try {
            return resources.getString(2131976723);
        } catch (Resources.NotFoundException unused) {
            0wj.A01.AEf("Resource.NotFoundException when getting R.plurals.voter_count_on_surfaces", 817896325).report();
            return "";
        }
    }
}
