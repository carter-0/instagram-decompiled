package X;

import com.meta.cal.AudioSessionError;
import com.meta.cal.AudioSessionInfo;
import com.meta.cal.AudioSessionResult;
import com.meta.cal.CaptionCallback;

/* renamed from: X.Nht  reason: case insensitive filesystem */
public final class C69239Nht extends CaptionCallback {
    public int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C3259374t A02;
    public final /* synthetic */ C70764OKk A03;

    public final void onCompleteText(String str, AudioSessionInfo audioSessionInfo) {
        String str2;
        0qQ.A0B(audioSessionInfo, 1);
        if (str != null) {
            0qQ.A0K(DbV.A12(str), "");
        }
        C3259374t r5 = this.A02;
        AnonymousClass930 r6 = r5.A02;
        if (r6 != null) {
            int i = this.A01;
            String languageId = audioSessionInfo.getLanguageId();
            Double confidenceScoreLogP = audioSessionInfo.getConfidenceScoreLogP();
            if (languageId != null) {
                r6.A00.markerAnnotate(331815788, i, "LANGUAGE_ID", languageId);
            }
            if (confidenceScoreLogP != null) {
                r6.A00.markerAnnotate(331815788, i, "CONFIDENCE_SCORE", confidenceScoreLogP.doubleValue());
            }
            r6.A00.markerPoint(331815788, i, "AUDIO_PROCESSING_END");
        }
        AudioSessionResult result = audioSessionInfo.getResult();
        if (result == null || result == AudioSessionResult.TRANSCRIPTION_ERROR) {
            C70764OKk oKk = this.A03;
            AudioSessionError error = audioSessionInfo.getError();
            if (error == null || (str2 = error.toString()) == null) {
                str2 = "Unknown error";
            }
            oKk.A00(new Exception(str2));
        } else {
            C70764OKk oKk2 = this.A03;
            if (str == null) {
                str = "";
            }
            11Z.A02(new C73362PbL(new C61055Jvt(audioSessionInfo.getConfidenceScoreLogP(), str, audioSessionInfo.getLanguageId(), AnonymousClass7TF.A1W(result, AudioSessionResult.UNSUPPORTED_LANGUAGE)), oKk2.A00, oKk2.A01, oKk2.A02));
        }
        r5.A03.remove(this);
    }

    public final void onTentativeTextFragment(String str) {
    }

    public C69239Nht(C3259374t r1, C70764OKk oKk, int i) {
        this.A03 = oKk;
        this.A02 = r1;
        this.A01 = i;
    }

    public final void onTextFragment(String str) {
        this.A00++;
    }
}
