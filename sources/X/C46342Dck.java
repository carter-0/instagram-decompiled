package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import org.webrtc.CameraCapturer;

/* renamed from: X.Dck  reason: case insensitive filesystem */
public final class C46342Dck {
    public static final C46342Dck A00 = new Object();

    public static final boolean A02(UserSession userSession, 1Xj r5) {
        C46276DTf At2;
        0qQ.A0B(userSession, 0);
        if (r5.A5G() && C338007hG.A02(r5)) {
            return true;
        }
        if (!r5.A5G() || (At2 = r5.A0C.At2()) == null || !0qQ.A0K(At2.CBS(), true) || !182.A06(0Tu.A05, userSession, 36320854795166613L)) {
            return false;
        }
        return true;
    }

    public final String A04(Resources resources, CharSequence charSequence, int i, int i2, boolean z) {
        int i3;
        Object[] objArr;
        String str;
        String A0e = DbY.A0e(resources, C253673rC.A04(resources, Integer.valueOf(i), CameraCapturer.OPEN_CAMERA_TIMEOUT, false, false), R.plurals.unified_feedback_reactions_from_fb, i);
        int i4 = R.plurals.unified_feedback_plays_from_fb;
        if (z) {
            i4 = R.plurals.unified_feedback_views_from_fb;
        }
        String A0e2 = DbY.A0e(resources, C253673rC.A04(resources, Integer.valueOf(i2), CameraCapturer.OPEN_CAMERA_TIMEOUT, false, false), i4, i2);
        if (i > 0) {
            if (i2 > 0) {
                i3 = 2131975901;
                objArr = new Object[]{A0e, A0e2, charSequence};
            } else {
                i3 = 2131975902;
                objArr = new Object[2];
                objArr[0] = A0e;
                objArr[1] = charSequence;
            }
        } else if (i2 > 0) {
            i3 = 2131975902;
            objArr = new Object[2];
            objArr[0] = A0e2;
            objArr[1] = charSequence;
        } else {
            0f9 AEf = 0wj.A01.AEf("FeedbackFromFacebookUtil", 817892340);
            AEf.ABQ(DialogModule.KEY_MESSAGE, "Reel has no plays or reactions. you shouldn't get here");
            AEf.report();
            str = "";
            0qQ.A0A(str);
            return str;
        }
        str = resources.getString(i3, objArr);
        0qQ.A0A(str);
        return str;
    }

    public static final void A00(Context context, View.OnClickListener onClickListener, 2da r6) {
        AnonymousClass3JR A0K = DbS.A0K();
        A0K.A0F = C14091Tpi.A00(context, XDU.A4n, GOg.SIZE_16, C52337GOf.OUTLINE);
        A0K.A05 = 2131976689;
        A0K.A03 = 2Yu.A05(context);
        A0K.A0G = onClickListener;
        A0K.A09 = 16;
        r6.AA3(new AnonymousClass3Jb(A0K));
    }

    public static final boolean A01(UserSession userSession, 1Xj r2) {
        AnonymousClass7TG.A1N(userSession, r2);
        if (!r2.A5G() || r2.A0C.getClipsMetadata() == null || !(!C338007hG.A00(userSession, r2)) || !C338007hG.A02(r2) || !C338007hG.A01(r2)) {
            return false;
        }
        return true;
    }

    public final SpannableStringBuilder A03(Resources resources, C49723F3m f3m) {
        String A0d = AnonymousClass7TF.A0d(resources, 2131973485);
        String A03 = f3m.A03(resources, A0d);
        C46678Dj7 dj7 = new C46678Dj7(DbT.A09(AnonymousClass000.A00(79)));
        SpannableStringBuilder A0C = DbS.A0C(A03);
        AnonymousClass7AV.A03(A0C, dj7, A0d);
        return A0C;
    }
}
