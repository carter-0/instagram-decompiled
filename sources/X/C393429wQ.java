package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.NotePogVideoDictIntf;
import com.instagram.model.mediasize.VideoVersionIntf;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.9wQ  reason: invalid class name and case insensitive filesystem */
public abstract /* synthetic */ class C393429wQ {
    public static Map A00(NotePogVideoDictIntf notePogVideoDictIntf) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (notePogVideoDictIntf.getId() != null) {
            A1H.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, notePogVideoDictIntf.getId());
        }
        if (notePogVideoDictIntf.BGO() != null) {
            A1H.put("image_versions2", notePogVideoDictIntf.BGO().FHC());
        }
        if (notePogVideoDictIntf.getPk() != null) {
            A1H.put("pk", notePogVideoDictIntf.getPk());
        }
        if (notePogVideoDictIntf.CEY() != null) {
            List<VideoVersionIntf> CEY = notePogVideoDictIntf.CEY();
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (VideoVersionIntf videoVersionIntf : CEY) {
                if (videoVersionIntf != null) {
                    A1C.add(videoVersionIntf.FHC());
                }
            }
            A1H.put("video_versions", A1C);
        }
        return 0Yt.A0B(A1H);
    }
}
