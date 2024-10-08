package X;

import android.content.Context;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.constants.AudioTrackType;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.search.tabloader.MusicOverlaySearchTab;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Lo9  reason: case insensitive filesystem */
public final class C65145Lo9 implements C66482MTk {
    public C331157Pu A00;
    public C331127Pr A01;
    public final Context A02;
    public final Fragment A03;
    public final C65507LuV A04 = new C65507LuV(this, 2);
    public final UserSession A05;
    public final String A06;
    public final String A07 = AnonymousClass7TG.A0j();
    public final AnonymousClass0iw A08;

    public final void Exg(C62642Kk4 kk4, C371088xY r23, AudioOverlayTrack audioOverlayTrack, Integer num, String str, Map map) {
        C3515589i r5;
        FragmentActivity activity;
        Resources.Theme theme;
        Integer num2 = num;
        0qQ.A0B(num2, 1);
        UserSession userSession = this.A05;
        JTU.A1A(userSession, num2);
        int intValue = num2.intValue();
        if (intValue == 12) {
            r5 = C3515589i.ADD_AUDIO;
        } else if (intValue != 13) {
            r5 = null;
        } else {
            r5 = C3515589i.FEED_DIALOG_REPLACE_AUDIO;
        }
        if (this.A00 == null) {
            AnonymousClass80X r13 = AnonymousClass80X.UNINITIALIZED;
            String str2 = this.A07;
            MusicProduct musicProduct = MusicProduct.MUSIC_IN_FEED;
            ImmutableList of = ImmutableList.of(AudioTrackType.ORIGINAL, AudioTrackType.REACTIVE);
            0qQ.A07(of);
            AtomicBoolean atomicBoolean = 1Xj.A0i;
            K6I A002 = LJS.A00((C62642Kk4) null, r5, (C371088xY) null, of, (ImmutableList) null, musicProduct, userSession, (MusicAttributionConfig) null, (MusicOverlaySearchTab) null, r13, str2, 1Xv.A06(this.A06), (String) null, (Map) null, false, !AnonymousClass1GD.A03(), false);
            A002.A03 = this.A04;
            if (!(AnonymousClass1GD.A03() || (activity = this.A03.getActivity()) == null || (theme = activity.getTheme()) == null)) {
                theme.applyStyle(R.style.MusicCreationLightOverlayTheme, true);
            }
            C331127Pr A0e = DbX.A0e(userSession, true);
            A0e.A03 = 1.0f;
            Context context = this.A02;
            A0e.A06 = context.getColor(2Yu.A0C(context));
            A0e.A0T = A002;
            this.A01 = A0e;
            this.A00 = A0e.A00().A03(context, A002);
        }
    }

    public final void dismiss() {
        DbW.A1K(this.A00);
        this.A00 = null;
    }

    public C65145Lo9(Context context, Fragment fragment, AnonymousClass0iw r5, UserSession userSession, String str) {
        this.A02 = context;
        this.A05 = userSession;
        this.A03 = fragment;
        this.A06 = str;
        this.A08 = r5;
    }
}
