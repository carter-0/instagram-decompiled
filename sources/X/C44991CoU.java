package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.reels.question.model.MusicQuestionResponseModel;
import com.instagram.reels.question.model.QuestionResponseModel;
import com.instagram.reels.question.model.responsetype.QuestionResponseType;
import com.instagram.reels.questionv2.model.QuestionMediaResponseModel;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.CoU  reason: case insensitive filesystem */
public abstract class C44991CoU {
    public static QuestionResponseModel parseFromJson(16F r20) {
        String str;
        16F r6 = r20;
        0qQ.A0B(r6, 0);
        try {
            Boolean bool = null;
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            Integer num = null;
            String str2 = null;
            QuestionMediaResponseModel questionMediaResponseModel = null;
            MusicQuestionResponseModel musicQuestionResponseModel = null;
            String str3 = null;
            QuestionResponseType questionResponseType = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            User user = null;
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if ("has_shared_response".equals(A17)) {
                    bool = AnonymousClass7TF.A0S(r6);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r6.A1P();
                    }
                } else if ("media_response".equals(A17)) {
                    questionMediaResponseModel = D2F.parseFromJson(r6);
                } else if ("music_response".equals(A17)) {
                    musicQuestionResponseModel = D2E.parseFromJson(r6);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE.equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r6.A1P();
                    }
                } else if ("response_type".equals(A17)) {
                    if (r6.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r6.A1P();
                    }
                    questionResponseType = C369268u8.A00(str);
                } else if ("seen".equals(A17)) {
                    bool2 = AnonymousClass7TF.A0S(r6);
                } else if ("should_enable_reply_creation".equals(A17)) {
                    bool3 = AnonymousClass7TF.A0S(r6);
                } else if ("ts".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r6);
                } else {
                    user = C41846B3n.A0a(r6, user, A17, PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                }
                r6.A0z();
            }
            if (bool == null && (r6 instanceof 0c9)) {
                AnonymousClass7TF.A1L("has_shared_response", r6, "QuestionResponseModel");
            } else if (str2 == null && (r6 instanceof 0c9)) {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r6, "QuestionResponseModel");
            } else if (questionResponseType == null && (r6 instanceof 0c9)) {
                AnonymousClass7TF.A1L("response_type", r6, "QuestionResponseModel");
            } else if (num == null && (r6 instanceof 0c9)) {
                AnonymousClass7TF.A1L("ts", r6, "QuestionResponseModel");
            } else if (user != null || !(r6 instanceof 0c9)) {
                return new QuestionResponseModel(musicQuestionResponseModel, questionResponseType, questionMediaResponseModel, user, bool2, bool3, str2, str3, num.intValue(), bool.booleanValue());
            } else {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_USER, r6, "QuestionResponseModel");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
