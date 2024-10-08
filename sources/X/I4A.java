package X;

import android.content.Context;
import android.os.Bundle;
import android.os.TransactionTooLargeException;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.android.R;
import com.instagram.api.schemas.ACRType;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class I4A {
    public 0sP A00 = J67.A00;
    public final Context A01;
    public final FragmentActivity A02;
    public final AnonymousClass4DH A03;
    public final UserSession A04;
    public final AnonymousClass0eM A05 = AnonymousClass1YB.A00(new C58703IwC(this, 35));
    public final AnonymousClass0eM A06 = AnonymousClass1YB.A00(new C58703IwC(this, 36));
    public final AnonymousClass0eM A07 = AnonymousClass1YB.A00(new C58703IwC(this, 37));

    public I4A(Context context, FragmentActivity fragmentActivity, AnonymousClass4DH r5, UserSession userSession) {
        0qQ.A0B(userSession, 4);
        this.A01 = context;
        this.A02 = fragmentActivity;
        this.A03 = r5;
        this.A04 = userSession;
    }

    public static final void A00(Bundle bundle, 28D r8, I4A i4a, boolean z) {
        AnonymousClass6W8 r7;
        AnonymousClass4DH r0;
        if (z) {
            AnonymousClass8ZO.A00(i4a.A04).A00(r8, (ACRType) null);
        }
        try {
            UserSession userSession = i4a.A04;
            boolean A062 = 182.A06(0Tu.A05, userSession, 36315808208522803L);
            String A002 = AnonymousClass000.A00(19);
            if (A062) {
                r7 = AnonymousClass6W8.A02(i4a.A02, bundle, userSession, ModalActivity.class, "clips_camera");
                r7.A0J = new int[]{R.anim.bottom_in, R.anim.top_out, R.anim.top_in, R.anim.bottom_out};
                r0 = i4a.A03;
                0qQ.A0C(r0, A002);
            } else {
                r7 = AnonymousClass6W8.A02(i4a.A02, bundle, userSession, TransparentModalActivity.class, "clips_camera");
                r7.A0J = new int[]{R.anim.bottom_in, R.anim.top_out, R.anim.top_in, R.anim.bottom_out};
                r0 = i4a.A03;
                0qQ.A0C(r0, A002);
            }
            r7.A0D(r0, 9587);
        } catch (TransactionTooLargeException unused) {
            if (z) {
                AnonymousClass8ZO.A00(i4a.A04).A02(C273654mx.A00(3436));
            }
            String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("ClipsMidcardViewBinderDelegate:navigateToCamera: Failed to pass the media list into camera due to TransactionTooLarge for %s", r8.name());
            0qQ.A07(formatStrLocaleSafe);
            0kD.A0I(formatStrLocaleSafe, (Throwable) null, 0Yt.A0E());
        }
    }

    public static final void A01(28D r5, AudioOverlayTrack audioOverlayTrack, I4A i4a, String str, List list) {
        if (!list.isEmpty()) {
            UserSession userSession = i4a.A04;
            C56044Hrt A0C = C250563lf.A0C(r5);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C51967G9n.A1K(userSession, (1Xj) it.next());
            }
            ArrayList A0r = AnonymousClass7TG.A0r(list);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String A0v = C51971G9r.A0v(it2);
                if (A0v != null) {
                    A0r.add(A0v);
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
            A0C.A0g = A0r;
            A0C.A0y = true;
            if (audioOverlayTrack != null) {
                A0C.A09 = audioOverlayTrack;
            }
            if (r5 == 28D.A1W) {
                1Xj A0T = DbZ.A0T(list, 0);
                0qQ.A0B(A0T, 0);
                MusicOverlayStickerModel A032 = C271404in.A03((MusicProduct) null, A0T, (Integer) null);
                if (A032 != null) {
                    A0C.A08 = new MusicAttributionConfig(A032);
                    A0C.A0G = A032.A0S;
                }
            }
            Bundle A002 = A0C.A00();
            if (str != null) {
                A002.putString(C273654mx.A00(33), str);
            }
            A00(A002, r5, i4a, true);
        }
    }
}
