package X;

import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrlBase;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.feed.widget.IgProgressImageViewProgressBar;
import java.io.File;
import java.util.Map;

/* renamed from: X.7RZ  reason: invalid class name */
public final class AnonymousClass7RZ {
    public static final void A02(AnonymousClass90H r5, C68819NYd nYd, boolean z) {
        C242463Uf r0;
        IgProgressImageView igProgressImageView = r5.A0A;
        igProgressImageView.setBackgroundColor(0);
        r5.A08.setVisibility(8);
        IgImageView igImageView = igProgressImageView.getIgImageView();
        igImageView.setImageRendererAndReset(C3265577g.A05(igImageView, nYd.A02));
        ImageView imageView = r5.A05;
        if (z) {
            imageView.setVisibility(0);
            r0 = C242463Uf.A02;
        } else {
            imageView.setVisibility(8);
            r0 = C242463Uf.RETRY_TEXT;
        }
        igProgressImageView.A03 = r0;
    }

    public final void A03(AnonymousClass9IP r7, AnonymousClass0iw r8, AnonymousClass90H r9, String str, String str2, int i, boolean z) {
        0qQ.A0B(r7, 1);
        boolean z2 = true;
        if (2 - ((Number) r7.A01).intValue() == 0 && r7.A02) {
            z2 = false;
        }
        IgProgressImageView igProgressImageView = r9.A0A;
        igProgressImageView.setEnableProgressBar(false);
        View view = r9.A03;
        int i2 = 8;
        if (z2) {
            i2 = 0;
        }
        view.setVisibility(i2);
        IgProgressImageViewProgressBar igProgressImageViewProgressBar = r9.A0B;
        igProgressImageViewProgressBar.setVisibility(0);
        SimpleImageUrl simpleImageUrl = null;
        if (!z) {
            if (!z2) {
                str = null;
            }
            igProgressImageViewProgressBar.setIndeterminate(true);
        } else {
            if (!z2) {
                str = null;
            } else if (str2 != null) {
                str = str2;
            }
            igProgressImageViewProgressBar.setIndeterminate(false);
            igProgressImageViewProgressBar.setProgress(i);
        }
        if (str != null) {
            Uri fromFile = Uri.fromFile(new File(str));
            0qQ.A07(fromFile);
            simpleImageUrl = C253833rU.A00(fromFile, -1, -1);
        }
        if (C253833rU.A02(simpleImageUrl)) {
            igProgressImageView.A04();
        } else if (simpleImageUrl != null) {
            igProgressImageView.setUrl(simpleImageUrl, r8);
        }
    }

    public static final void A00(AnonymousClass0iw r3, UserSession userSession, AnonymousClass90H r5, String str) {
        r5.A03.setVisibility(8);
        r5.A0B.setVisibility(8);
        SimpleImageUrl simpleImageUrl = new SimpleImageUrl(str);
        ImageUrlBase.A00(simpleImageUrl);
        0Sd.A00(simpleImageUrl.A00);
        String str2 = simpleImageUrl.A00.A03;
        0qQ.A07(str2);
        C66819MdB mdB = r5.A01;
        if (mdB != null) {
            mdB.DQn(new C66793Mcf(str2));
        }
        r5.A0A.setUrl(userSession, new SimpleImageUrl(str), r3);
    }

    public static final void A01(UserSession userSession, AnonymousClass90H r4, Map map) {
        AnonymousClass3Q2 A03;
        AnonymousClass34S r0 = (AnonymousClass34S) map.get(r4);
        if (r0 != null) {
            AnonymousClass2sT r2 = (AnonymousClass2sT) r0.A01;
            String str = (String) r0.A00;
            if (str != null && r2 != null && (A03 = 28K.A00(userSession).A03(str)) != null) {
                A03.A0Z(r2);
            }
        }
    }
}
