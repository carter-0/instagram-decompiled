package X;

import android.app.Activity;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.ArrayList;
import java.util.Set;
import java.util.UUID;

/* renamed from: X.Hf3  reason: case insensitive filesystem */
public abstract class C55274Hf3 {
    public static final void A00(Activity activity, Fragment fragment, 28D r28, 293 r29, UserSession userSession, 1Xj r31, ArrayList arrayList, boolean z) {
        String str;
        String str2;
        C279584ys r11;
        MusicAssetModel musicAssetModel;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        28D r9 = r28;
        1Xj r6 = r31;
        C51972G9s.A1D(r6, r9);
        if (r6.A6B()) {
            C55605HkQ hkQ = (C55605HkQ) userSession2.A01(C55605HkQ.class, new C58710IwJ(userSession2, 30));
            if (hkQ.A00 == 0) {
                hkQ.A00 = C51967G9n.A08(C51965G9l.A0a(hkQ.A01).flowStartIfNotOngoingForMarker(357639549, UUID.randomUUID().hashCode(), PublicKeyCredentialControllerUtility.JSON_KEY_USER, false, 30000), 0);
            }
            Activity activity2 = activity;
            MusicAttributionConfig A0E = C52345GOp.A00.A0E(activity2, r6);
            String id = r6.getId();
            if (id != null) {
                str = 1Xv.A06(id);
            } else {
                str = null;
            }
            C2801950r r12 = C2801950r.CLIPS;
            Set A0N = C51976G9y.A0N(r9);
            String id2 = r6.getId();
            AnonymousClass8JI r13 = AnonymousClass8JI.TEMPLATE;
            if (A0E == null || (musicAssetModel = A0E.A02) == null) {
                str2 = null;
            } else {
                str2 = musicAssetModel.A0E;
            }
            String A0x = DbT.A0x(r6);
            C270564gw A1P = r6.A1P();
            if (A1P != null) {
                r11 = A1P.FDm();
            } else {
                r11 = null;
            }
            AnonymousClass6W8 A02 = AnonymousClass6W8.A02(activity2, AEX.A01(r9, r29, r11, r12, r13, A0E, (PendingRecipient) null, (String) null, (String) null, str2, str, A0x, id2, arrayList, A0N, false, true, true), userSession2, TransparentModalActivity.class, "clips_camera");
            A02.A0D = z;
            Dbc.A0y(A02);
            A02.A0D(fragment, 9587);
        }
    }
}
