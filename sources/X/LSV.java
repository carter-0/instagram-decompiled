package X;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import com.instagram.api.schemas.BrandedContentGatingInfoIntf;
import com.instagram.api.schemas.BrandedContentProjectAction;
import com.instagram.api.schemas.BrandedContentProjectMetadataIntf;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.BrandedContentTag;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;
import java.util.Locale;

public abstract class LSV {
    public static final String A00(Context context, BrandedContentProjectMetadataIntf brandedContentProjectMetadataIntf, List list, boolean z) {
        int i;
        String Ahm;
        if (brandedContentProjectMetadataIntf != null && (Ahm = brandedContentProjectMetadataIntf.Ahm()) != null && brandedContentProjectMetadataIntf.AYA() != BrandedContentProjectAction.REMOVE_MEDIA_FROM_PROJECT) {
            return Ahm;
        }
        if (list == null || list.isEmpty()) {
            if (!z) {
                return "";
            }
            i = 2131968777;
        } else if (list.size() == 1) {
            return ((BrandedContentTag) list.get(0)).A02;
        } else {
            i = 2131975609;
        }
        return AnonymousClass7TE.A16(context, i);
    }

    public static final void A01(TextView textView) {
        textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        textView.setMarqueeRepeatLimit(-1);
        textView.setHorizontalFadingEdgeEnabled(true);
        textView.setSelected(true);
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 0) {
            textView.setHorizontallyScrolling(true);
        }
    }

    public static final void A02(1NY r4, BrandedContentGatingInfoIntf brandedContentGatingInfoIntf) {
        if (brandedContentGatingInfoIntf != null) {
            try {
                StringWriter A0v = JTO.A0v();
                17W A0Q = JTO.A0Q(A0v);
                C45512Cxm.A00(A0Q, brandedContentGatingInfoIntf.F0x());
                r4.A9m("media_gating_info", JTR.A12(A0Q, A0v));
            } catch (IOException e) {
                0KC.A0F("Branded content gating edit error", "Unable to convert gating info to json", e);
            }
        }
    }

    public static final void A03(1NY r4, BrandedContentProjectMetadataIntf brandedContentProjectMetadataIntf) {
        if (brandedContentProjectMetadataIntf != null) {
            try {
                StringWriter A0v = JTO.A0v();
                17W A0Q = JTO.A0Q(A0v);
                LGt.A00(A0Q, brandedContentProjectMetadataIntf.F0y());
                r4.A9m("branded_content_project_metadata", JTR.A12(A0Q, A0v));
            } catch (IOException e) {
                0KC.A0F(AnonymousClass000.A00(877), "Unable to convert branded content project metadata to json", e);
            }
        }
    }

    public static final void A04(1NY r2, UserSession userSession, 0sn r4, 0sn r5, boolean z) {
        if (AnonymousClass430.A00(userSession)) {
            r2.A0H("is_paid_partnership", z);
            if (r4 == null) {
                try {
                    r4 = 0sn.A00;
                } catch (IOException e) {
                    0KC.A0F(AnonymousClass000.A00(877), AnonymousClass000.A00(2517), e);
                    return;
                }
            }
            if (r5 == null) {
                r5 = 0sn.A00;
            }
            r2.A9m("sponsor_tags", C347037wA.A02(r4, r5));
        }
    }
}
