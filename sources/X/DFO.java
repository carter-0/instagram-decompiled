package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.user.model.User;

public final class DFO implements AnonymousClass2Kv {
    public final /* synthetic */ 1wn A00;
    public final /* synthetic */ 1wn A01;

    public DFO(1wn r1, 1wn r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    /* JADX WARNING: type inference failed for: r5v4, types: [java.lang.Object, X.4Cl, X.4Ck] */
    public final void invoke(AnonymousClass3JD r15) {
        C250663lr A0U;
        C250663lr A05;
        long j;
        User user;
        Object uto;
        if (r15 != null && (A0U = C41845B3m.A0U(r15)) != null && (A05 = A0U.A05(C43024Bqo.class, "xdt_live_active_question_event(input:$input)", -1452445418)) != null) {
            1wn r3 = this.A01;
            1wn r2 = this.A00;
            String requiredStringField = A05.getRequiredStringField(8, "source");
            0qQ.A07(requiredStringField);
            try {
                if (requiredStringField.equals("story")) {
                    String requiredStringField2 = A05.getRequiredStringField(4, "story_question_id");
                    0qQ.A07(requiredStringField2);
                    j = Long.parseLong(requiredStringField2);
                } else {
                    String requiredStringField3 = A05.getRequiredStringField(3, "question_id");
                    0qQ.A07(requiredStringField3);
                    j = Long.parseLong(requiredStringField3);
                }
                C250663lr optionalTreeField = A05.getOptionalTreeField(9, PublicKeyCredentialControllerUtility.JSON_KEY_USER, C43023Bqn.class, 2122535321);
                if (optionalTreeField != null) {
                    ? obj = new Object();
                    obj.A6n = optionalTreeField.getRequiredStringField(0, "strong_id__");
                    obj.A7d = optionalTreeField.getRequiredStringField(1, MYP.A01(226, 8, 99));
                    obj.A15 = new SimpleImageUrl(optionalTreeField.getRequiredStringField(2, "profile_pic_url"));
                    obj.A6k = optionalTreeField.getRequiredStringField(3, "full_name");
                    obj.A41 = Boolean.valueOf(optionalTreeField.getRequiredBooleanField(4, "is_private"));
                    obj.A4a = Boolean.valueOf(optionalTreeField.getRequiredBooleanField(5, "is_verified"));
                    user = new User(obj);
                } else {
                    user = null;
                }
                if (A05.getRequiredBooleanField(2, "is_active")) {
                    uto = new C16372Utp(user, C41846B3n.A0i(A05, "question_body", 6), A05.getRequiredStringField(1, TraceFieldType.BroadcastId), requiredStringField, A05.getRequiredTimeField(7, "video_timestamp_ms"), j);
                } else {
                    uto = new C16371Uto(A05.getRequiredTimeField(7, "video_timestamp_ms"), A05.getRequiredStringField(1, TraceFieldType.BroadcastId), j);
                }
                if (uto instanceof C16372Utp) {
                    r3.onEvent(uto);
                } else if (uto instanceof C16371Uto) {
                    r2.onEvent(uto);
                }
            } catch (NumberFormatException e) {
                0KC.A0F("QuestionStickerRepository", "Error converting question ID to Long", e);
            }
        }
    }
}
