package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;
import com.instagram.common.gallery.RemoteMedia;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.creation.activity.MediaCaptureActivity;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class AJ5 {
    public static final RemoteMedia A00(C381769cI r12) {
        Integer num;
        0qQ.A0B(r12, 0);
        String str = r12.A06;
        Uri A03 = 0cp.A03(str);
        0qQ.A07(A03);
        SimpleImageUrl A00 = C253833rU.A00(A03, -1, -1);
        Uri A032 = 0cp.A03(r12.A07);
        0qQ.A07(A032);
        SimpleImageUrl A002 = C253833rU.A00(A032, -1, -1);
        if (r12.A08) {
            num = Integer.valueOf(r12.A00);
        } else {
            num = null;
        }
        String str2 = r12.A05;
        boolean z = r12.A09;
        return new RemoteMedia(r12.A04, A00, A002, num, Integer.valueOf(r12.A02), Integer.valueOf(r12.A03), str2, str, r12.A01, z, false, false);
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [com.instagram.common.gallery.metadata.ImmersiveMediaFields, java.lang.Object] */
    public static final C381769cI A01(C383579fo r25, List list, int i, boolean z, boolean z2) {
        String str;
        C250663lr optionalTreeField;
        C383579fo r4 = r25;
        String requiredStringField = r4.getRequiredStringField(0, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        0qQ.A07(requiredStringField);
        int coercedIntField = r4.getCoercedIntField(1, IgReactMediaPickerNativeModule.HEIGHT);
        int A00 = r4.A00(IgReactMediaPickerNativeModule.WIDTH);
        String requiredStringField2 = r4.getRequiredStringField(3, "src");
        0qQ.A07(requiredStringField2);
        String A0B = r4.A0B("thumbnail");
        if (A0B == null) {
            A0B = r4.getRequiredStringField(3, "src");
            0qQ.A07(A0B);
        }
        boolean hasFieldValue = r4.A0E().hasFieldValue("ctime");
        int coercedIntField2 = r4.A0E().getCoercedIntField(1, "ctime");
        String requiredStringField3 = r4.getRequiredStringField(0, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        String A09 = r4.A0E().A09(AnonymousClass000.A00(508));
        C250663lr optionalTreeField2 = r4.getOptionalTreeField(6, AnonymousClass000.A00(646), C382779eV.class, -932699525);
        if (optionalTreeField2 == null || (optionalTreeField = optionalTreeField2.getOptionalTreeField(0, "photo3d_info", C42502Bdj.class, -1193210058)) == null) {
            str = null;
        } else {
            str = optionalTreeField.getOptionalStringField(0, "url");
        }
        ? obj = new Object();
        obj.A00 = str;
        obj.A01 = false;
        return new C381769cI(new MediaUploadMetadata(obj, A09, (String) null, (String) null, (String) null, requiredStringField3, (String) null, (String) null, (String) null, (String) null, (String) null, false), requiredStringField, requiredStringField2, A0B, list, coercedIntField, A00, coercedIntField2, i, z, hasFieldValue, z2);
    }

    public static final List A04(Set set) {
        0qQ.A0B(set, 0);
        ArrayList A0r = AnonymousClass7TG.A0r(set);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            A0r.add(A00((C381769cI) it.next()));
        }
        return 00k.A0g(A0r, new C41283ArO(6));
    }

    public static final void A05(Context context, UserSession userSession) {
        Context context2 = context;
        new SUL(context2, userSession, 2EG.A2X, 182.A04(0Tu.A05, userSession, 36882683762049482L), false).A0A();
    }

    public final void A07(Activity activity, 28D r5, UserSession userSession, String str, String str2) {
        0qQ.A0B(r5, 2);
        if (activity != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1884266413) {
                if (hashCode != 106855379) {
                    if (hashCode == 108390809 && str.equals("reels")) {
                        Bundle A00 = C250563lf.A0C(r5).A00();
                        A00.putString("META_GALLERY_ALBUM_TYPE", str2);
                        AnonymousClass6W8.A02(activity, A00, userSession, TransparentModalActivity.class, "clips_camera").A0A(activity, 9587);
                    }
                } else if (str.equals("posts")) {
                    Intent intent = new Intent(activity, MediaCaptureActivity.class);
                    intent.putExtra("META_GALLERY_ALBUM_TYPE", str2);
                    intent.putExtra("IgSessionManager.SESSION_TOKEN_KEY", userSession.A05);
                    intent.putExtra("cameraEntryPoint", r5);
                    AnonymousClass0b5.A00(activity, intent, 100);
                }
            } else if (str.equals("stories")) {
                Bundle A0a = AnonymousClass7TE.A0a();
                A0a.putString("META_GALLERY_ALBUM_TYPE", str2);
                A0a.putSerializable("camera_entry_point", r5);
                AnonymousClass6W8 A02 = AnonymousClass6W8.A02(activity, A0a, userSession, ModalActivity.class, C273654mx.A00(27));
                A02.A07();
                A02.A0C(activity);
            }
        }
    }

    public static final C391339sj A02(AnonymousClass3JD r3) {
        C250663lr r32;
        C250663lr A03;
        if (r3 == null || (r32 = (C250663lr) r3.Bny()) == null || (A03 = r32.A03(C42510Bdr.class, "meta_gallery", -1545310103)) == null) {
            return null;
        }
        return (C391339sj) A03.getRequiredEnumField(0, C66579MXk.A00(150), C391339sj.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
    }

    public static final ArrayList A03(C383579fo r3) {
        String str;
        ImmutableList requiredCompactedEnumListField = r3.A0E().getRequiredCompactedEnumListField(0, "source_albums", C391269sc.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        0qQ.A07(requiredCompactedEnumListField);
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = requiredCompactedEnumListField.iterator();
        while (it.hasNext()) {
            C391269sc r0 = (C391269sc) it.next();
            if (r0 != null) {
                int ordinal = r0.ordinal();
                if (ordinal == 2) {
                    str = "HORIZON";
                } else if (ordinal == 4) {
                    str = "OCULUS";
                }
                A1C.add(str);
            }
        }
        return A1C;
    }

    public static final boolean A06(UserSession userSession, int i) {
        0Tu A0H = AnonymousClass7TF.A0H(userSession);
        if (i <= ((int) 182.A01(A0H, userSession, 36601208785866878L)) || !182.A06(A0H, userSession, 36316662908195394L)) {
            return false;
        }
        return true;
    }
}
