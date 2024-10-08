package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.List;

/* renamed from: X.Kpu  reason: case insensitive filesystem */
public abstract class C63004Kpu {
    public static final C61061Jvz A00(C61073JwB jwB, C62629Kj0 kj0, C43173Btx btx, String str, String str2, List list, List list2, List list3, List list4, boolean z, boolean z2) {
        String str3;
        List list5 = list3;
        String str4 = str;
        0qQ.A0B(str4, 1);
        C43173Btx btx2 = btx;
        String optionalStringField = btx2.getOptionalStringField(0, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        String str5 = "";
        if (optionalStringField == null) {
            optionalStringField = str5;
        }
        String optionalStringField2 = btx2.getOptionalStringField(1, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        if (optionalStringField2 == null) {
            optionalStringField2 = str5;
        }
        String A09 = btx2.A09(DevServerEntity.COLUMN_DESCRIPTION);
        if (A09 == null) {
            A09 = str5;
        }
        String optionalStringField3 = btx2.getOptionalStringField(7, "image_prompt");
        if (optionalStringField3 == null) {
            optionalStringField3 = str5;
        }
        String A0A = btx2.A0A("profile_image_url");
        SimpleImageUrl simpleImageUrl = null;
        if (A0A != null) {
            simpleImageUrl = DbS.A0V(A0A);
        }
        ImmutableList requiredCompactedEnumListField = btx2.getRequiredCompactedEnumListField(8, AnonymousClass000.A00(3617), C62609Kig.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        0qQ.A07(requiredCompactedEnumListField);
        Object A0J = 00k.A0J(requiredCompactedEnumListField);
        if (A0J == null || (str3 = A0J.toString()) == null) {
            str3 = str5;
        }
        String A0C = btx2.A0C("tagline");
        if (A0C == null) {
            A0C = str5;
        }
        String optionalStringField4 = btx2.getOptionalStringField(6, "welcome_message");
        if (optionalStringField4 != null) {
            str5 = optionalStringField4;
        }
        ImmutableList requiredCompactedStringListField = btx2.getRequiredCompactedStringListField(9, "facts");
        0qQ.A07(requiredCompactedStringListField);
        01N A1H = 0jo.A1H();
        String optionalStringField5 = btx2.getOptionalStringField(10, AnonymousClass000.A00(1322));
        if (optionalStringField5 != null) {
            JTP.A1T(optionalStringField5, btx2.getOptionalStringField(13, AnonymousClass000.A00(1319)), A1H, 5);
        }
        String optionalStringField6 = btx2.getOptionalStringField(11, AnonymousClass000.A00(1323));
        if (optionalStringField6 != null) {
            JTP.A1T(optionalStringField6, btx2.getOptionalStringField(14, AnonymousClass000.A00(1320)), A1H, 5);
        }
        String optionalStringField7 = btx2.getOptionalStringField(12, AnonymousClass000.A00(1324));
        if (optionalStringField7 != null) {
            JTP.A1T(optionalStringField7, btx2.getOptionalStringField(15, AnonymousClass000.A00(1321)), A1H, 5);
        }
        01N A1I = 0jo.A1I(A1H);
        if (list3 == null) {
            list5 = 0sn.A00;
        }
        return new C61061Jvz(jwB, simpleImageUrl, kj0, str4, optionalStringField, optionalStringField2, A09, optionalStringField3, (String) null, str3, A0C, str5, str2, A1I, requiredCompactedStringListField, 0sn.A00, list, list2, list5, list4, false, z, z2);
    }
}
