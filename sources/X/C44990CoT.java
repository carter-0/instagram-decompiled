package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.reels.question.model.MusicQuestionResponseModelIntf;
import com.instagram.reels.question.model.QuestionResponseModelIntf;
import com.instagram.reels.question.model.responsetype.QuestionResponseType;
import com.instagram.reels.questionv2.model.QuestionMediaResponseModelIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CoT  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44990CoT {
    public static Map A00(QuestionResponseModelIntf questionResponseModelIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        questionResponseModelIntf.BC5();
        A1H.put("has_shared_response", Boolean.valueOf(questionResponseModelIntf.BC5()));
        if (questionResponseModelIntf.getId() != null) {
            C41845B3m.A0x(questionResponseModelIntf.getId(), A1H);
        }
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (questionResponseModelIntf.BQj() != null) {
            QuestionMediaResponseModelIntf BQj = questionResponseModelIntf.BQj();
            if (BQj != null) {
                treeUpdaterJNI = BQj.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("media_response", treeUpdaterJNI);
        }
        if (questionResponseModelIntf.BUz() != null) {
            MusicQuestionResponseModelIntf BUz = questionResponseModelIntf.BUz();
            if (BUz != null) {
                treeUpdaterJNI2 = BUz.FHC();
            }
            A1H.put("music_response", treeUpdaterJNI2);
        }
        if (questionResponseModelIntf.Bnm() != null) {
            A1H.put(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, questionResponseModelIntf.Bnm());
        }
        if (questionResponseModelIntf.Bnr() != null) {
            QuestionResponseType Bnr = questionResponseModelIntf.Bnr();
            0qQ.A0B(Bnr, 0);
            A1H.put("response_type", Bnr.A00);
        }
        if (questionResponseModelIntf.BrC() != null) {
            A1H.put("seen", questionResponseModelIntf.BrC());
        }
        if (questionResponseModelIntf.Bu5() != null) {
            A1H.put("should_enable_reply_creation", questionResponseModelIntf.Bu5());
        }
        questionResponseModelIntf.CA6();
        A1H.put("ts", Integer.valueOf(questionResponseModelIntf.CA6()));
        if (questionResponseModelIntf.CCd() != null) {
            A1H.put(PublicKeyCredentialControllerUtility.JSON_KEY_USER, questionResponseModelIntf.CCd().A08());
        }
        return 0Yt.A0B(A1H);
    }
}
