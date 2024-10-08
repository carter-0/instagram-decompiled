package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.Arrays;

/* renamed from: X.8Oo  reason: invalid class name and case insensitive filesystem */
public abstract class C355098Oo {
    public static final void A00(View view, int i) {
        0qQ.A0B(view, 0);
        View requireViewById = view.requireViewById(R.id.post_capture_button_share_container_stub);
        0qQ.A07(requireViewById);
        ViewStub viewStub = (ViewStub) requireViewById;
        viewStub.setLayoutResource(i);
        viewStub.inflate();
    }

    public static final void A01(View view, UserSession userSession, boolean z) {
        0qQ.A0B(view, 2);
        if (z && !1Au.A00(userSession).A01.getBoolean("has_seen_valentines_sticker_tray_icon", false) && 182.A06(0Tu.A05, userSession, 36323028048554742L)) {
            Handler handler = new Handler(Looper.getMainLooper());
            handler.postDelayed(new C41041AnP(view, userSession), 1000);
            handler.postDelayed(new C40829Ajz(view), 6000);
        }
    }

    public static final void A04(ImageView imageView, Integer num) {
        Context context;
        int i;
        boolean z;
        0qQ.A0B(imageView, 0);
        0qQ.A0B(num, 1);
        int intValue = num.intValue();
        if (intValue == 0) {
            imageView.setSelected(false);
            context = imageView.getContext();
            i = R.drawable.instagram_volume_outline_44;
            imageView.setImageDrawable(context.getDrawable(i));
            z = true;
        } else if (intValue == 1) {
            imageView.setSelected(true);
            context = imageView.getContext();
            i = R.drawable.instagram_volume_off_outline_44;
            imageView.setImageDrawable(context.getDrawable(i));
            z = true;
        } else if (intValue == 2) {
            z = false;
        } else {
            throw new RuntimeException();
        }
        A05(new View[]{imageView}, z);
    }

    public static final void A05(View[] viewArr, boolean z) {
        A06((View[]) Arrays.copyOf(viewArr, 1), z, false);
    }

    public static final void A06(View[] viewArr, boolean z, boolean z2) {
        0qQ.A0B(viewArr, 2);
        View[] viewArr2 = (View[]) Arrays.copyOf(viewArr, viewArr.length);
        0qQ.A0B(viewArr2, 3);
        for (View view : viewArr2) {
            if (view != null) {
                if (z) {
                    view.setEnabled(true);
                    C294975nL.A04((C295005nO) null, new View[]{view}, z2);
                } else {
                    C294975nL.A05(new View[]{view}, z2);
                }
            }
        }
    }

    public static final boolean A07(C3499482o r5) {
        0qQ.A0B(r5, 0);
        AnonymousClass82Y r2 = r5.A01;
        boolean A0K = 0qQ.A0K(r2.A0l, "expiring_media_message");
        boolean z = false;
        boolean z2 = false;
        if (r2.A0D == AnonymousClass05K.A0I) {
            z2 = true;
        }
        if (A0K || z2 || r5.A0A()) {
            z = true;
        }
        return !z;
    }

    public static final void A02(View view, 0sP r3, 0sP r4) {
        AnonymousClass3NG r1 = new AnonymousClass3NG(view);
        r1.A04 = new C346657vX(r3, r4);
        r1.A00();
    }

    public static final boolean A08(AnonymousClass80V r2, AnonymousClass80X r3) {
        if (r3 != AnonymousClass80X.POST_CAPTURE || r2 == AnonymousClass80V.CONFIGURE_CAMERA || r2 == AnonymousClass80V.CAPTURE || r2 == AnonymousClass80V.PRE_CAPTURE_AR_EFFECT_TRAY) {
            return true;
        }
        return false;
    }

    public static void A03(View view, boolean z) {
        A05(new View[]{view}, z);
    }
}
