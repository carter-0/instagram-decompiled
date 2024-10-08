package X;

import android.view.View;
import com.google.common.collect.ImmutableMap;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: X.303  reason: invalid class name */
public final class AnonymousClass303 extends C235412zs {
    public final boolean A00;

    public final void ATF(AnonymousClass30Y r8, C252093oY r9) {
        View view;
        int i;
        IgProgressImageView igProgressImageView;
        IgShowreelNativeAnimationIntf BwB;
        S1s s1s;
        S1s s1s2;
        C240983Nk r0;
        0qQ.A0B(r8, 0);
        0qQ.A0B(r9, 1);
        Object obj = r8.A03;
        0qQ.A06(obj);
        1Xj r4 = (1Xj) obj;
        AnonymousClass59J A02 = A02(r4);
        if (r9.CEk(r8) != AnonymousClass05K.A0C && (view = (View) this.A00.get(obj)) != null) {
            if (r4.A5H()) {
                i = R.id.collection_main_image;
            } else if (r4.A0C.AsQ() != null) {
                i = R.id.progress_image_view;
            } else {
                i = R.id.row_feed_photo_imageview;
            }
            View findViewById = view.findViewById(i);
            if ((findViewById instanceof IgProgressImageView) && (igProgressImageView = (IgProgressImageView) findViewById) != null) {
                if (igProgressImageView.getIgImageView().A0N) {
                    A02.A02 = igProgressImageView.getHeight();
                    A02.A03 = igProgressImageView.getWidth();
                    WeakReference weakReference = ((AnonymousClass3W1) r8.A04).A1c;
                    if (weakReference != null) {
                        r0 = (C240983Nk) weakReference.get();
                    } else {
                        r0 = null;
                    }
                    A02.A03 = r0;
                    if (this.A00 && A02.A07 == null) {
                        StringBuilder sb = new StringBuilder(144);
                        A02.A07 = igProgressImageView.getIgImageView().A08(sb);
                        A02.A09 = sb.toString();
                        r4.getId();
                    }
                }
                AnonymousClass59L r42 = (AnonymousClass59L) igProgressImageView.findViewById(R.id.showreel_native_media_view);
                if (r42 != null && r42.CWX()) {
                    1Xj r3 = A02.A0K;
                    0qQ.A0B(r3, 0);
                    if (r3.A0C.AsQ() != null && !r3.A5H()) {
                        ImmutableMap renderingComponentInfos = r42.getRenderingComponentInfos();
                        if (!(renderingComponentInfos == null || (s1s2 = (S1s) renderingComponentInfos.get("image")) == null)) {
                            C10952S2k s2k = s1s2.A00;
                            A02.A02 = s2k.A00;
                            A02.A03 = s2k.A01;
                            A02.A07 = s2k.A02;
                        }
                        ImmutableMap renderingComponentInfos2 = r42.getRenderingComponentInfos();
                        if (!(renderingComponentInfos2 == null || (s1s = (S1s) renderingComponentInfos2.get("text")) == null)) {
                            C10952S2k s2k2 = s1s.A00;
                            A02.A04 = s2k2.A00;
                            A02.A05 = s2k2.A01;
                        }
                        C257643xj AsQ = r3.A0C.AsQ();
                        if (AsQ == null || (BwB = AsQ.BwB()) == null) {
                            throw new IllegalStateException(AnonymousClass000.A00(1239));
                        }
                        A02.A0A = BwB.Anf();
                        A02.A0B = BwB.C4b();
                    }
                }
            }
        }
    }

    public AnonymousClass303(UserSession userSession, Map map) {
        super(map);
        this.A00 = 182.A06(0Tu.A05, userSession, 36310366484955171L);
    }
}
