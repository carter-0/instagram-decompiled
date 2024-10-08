package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.TrackSnippet;

/* renamed from: X.9kK  reason: invalid class name and case insensitive filesystem */
public final class C386269kK extends AnonymousClass3NK {
    public final /* synthetic */ C357918a4 A00;

    public C386269kK(C357918a4 r1) {
        this.A00 = r1;
    }

    public final boolean Dqe(View view) {
        C357918a4 r7 = this.A00;
        MusicAssetModel musicAssetModel = r7.A0P;
        if (musicAssetModel == null) {
            0kD.A05("MusicOverlayEditController", "musicAssetModel is null in lyrics onTap()", (Throwable) null);
            return false;
        }
        TrackSnippet trackSnippet = r7.A0Q;
        if (trackSnippet != null) {
            C3506785t r0 = r7.A0b;
            if (r0 != null) {
                AnonymousClass4DH r5 = r7.A0u;
                UserSession userSession = r7.A0v;
                String str = musicAssetModel.A0E;
                0qQ.A07(str);
                String str2 = musicAssetModel.A0B;
                0qQ.A07(str2);
                int i = trackSnippet.A01;
                int BV1 = r0.BV1();
                C358248ab r1 = new C358248ab(r5.requireContext());
                r1.A0m(r5);
                r1.A09(2131967861);
                r1.A08(2131967858);
                r1.A0Q(new C39946AKm(r5, userSession, r7, AnonymousClass05K.A00, str, str2, i, BV1), C358278ae.DEFAULT, 2131967859);
                r1.A0G(new C39946AKm(r5, userSession, r7, AnonymousClass05K.A01, str, str2, i, BV1), 2131967860);
                AnonymousClass7TH.A0a(r1, true);
                return true;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}
