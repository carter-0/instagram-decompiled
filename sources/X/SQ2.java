package X;

import com.facebook.quicklog.MarkerEditor;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.Iterator;
import java.util.Map;

public abstract class SQ2 {
    public static final void A02(int i, int i2, short s) {
        if (s == 3 || s == 2) {
            A00(i, i2, "display", 0Yt.A0E());
        }
        if (AnonymousClass2E0.A02().A00.isMarkerOn(i, i2)) {
            AnonymousClass2E0.A02().A00.markerEnd(i, i2, s);
        }
    }

    public static final void A00(int i, int i2, String str, Map map) {
        if (AnonymousClass2E0.A02().A00.isMarkerOn(i, i2)) {
            AnonymousClass2E0.A02().A00.markerPoint(i, i2, str);
            A01(i, i2, map);
        }
    }

    public static final void A01(int i, int i2, Map map) {
        if (AnonymousClass2E0.A02().A00.isMarkerOn(i, i2)) {
            Iterator A0u = AnonymousClass7TF.A0u(map);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                AnonymousClass2E0.A02().A00.markerAnnotate(i, i2, DbT.A13(A1J), DbS.A0s(A1J));
            }
        }
    }

    public static final void A03(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, int i2) {
        AnonymousClass2E0.A02().A00.markerStart(i, i2, true);
        MarkerEditor withMarker = AnonymousClass2E0.A02().A00.withMarker(i, i2);
        if (str2 != null) {
            withMarker.annotate(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2);
            withMarker.point("entry_point_clicked");
        }
        if (str != null) {
            withMarker.annotate("financial_entity_id", str);
        }
        if (str3 != null) {
            withMarker.annotate("payout_record_id", str3);
        }
        if (str5 != null) {
            withMarker.annotate("managed_merchant_account_id", str5);
        }
        if (str4 != null) {
            withMarker.annotate("batch_item_id", str4);
        }
        if (str6 != null) {
            withMarker.annotate("view_name", str6);
        }
        if (str7 != null) {
            withMarker.annotate("transaction_type_filter", str7);
        }
        if (str8 != null) {
            withMarker.annotate("start_cursor", str8);
        }
        if (str9 != null) {
            withMarker.annotate("end_cursor", str9);
        }
        withMarker.markerEditingCompleted();
    }
}
