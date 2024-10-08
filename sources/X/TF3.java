package X;

import android.net.Uri;
import com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessor;
import java.net.URI;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public final class TF3 implements Runnable {
    public final /* synthetic */ VideoStickerAnythingProcessor A00;
    public final /* synthetic */ String A01;

    public TF3(VideoStickerAnythingProcessor videoStickerAnythingProcessor, String str) {
        this.A00 = videoStickerAnythingProcessor;
        this.A01 = str;
    }

    public final void run() {
        VideoStickerAnythingProcessor videoStickerAnythingProcessor = this.A00;
        AnonymousClass3Q2 r0 = videoStickerAnythingProcessor.A0A;
        if (r0 != null) {
            String str = r0.A3t;
            Uri.Builder A0I = Pxe.A0I();
            Uri.Builder scheme = A0I.scheme("https");
            C11224SFy sFy = videoStickerAnythingProcessor.A08;
            if (sFy != null) {
                scheme.encodedAuthority(sFy.A09).path("api/v1/media/save_edit/");
                try {
                    JSONObject A11 = DbS.A11();
                    Pxh.A1N(str, "upload_id", A11);
                    String str2 = this.A01;
                    Pxh.A1N(str2, "edit_id", A11);
                    C10392RrT A002 = C266784aL.A00(A11);
                    URI A112 = Pxg.A11(A0I);
                    videoStickerAnythingProcessor.Db4(C8917RFk.IGMLSegmentAnythingVideoStatusRequestingSaveEdit);
                    S1R s1r = videoStickerAnythingProcessor.A0B;
                    if (s1r != null) {
                        Integer num = AnonymousClass05K.A01;
                        LinkedHashMap A1H = AnonymousClass7TE.A1H();
                        AnonymousClass3Q2 r02 = videoStickerAnythingProcessor.A0A;
                        if (r02 != null) {
                            s1r.A00(new QN7(videoStickerAnythingProcessor, videoStickerAnythingProcessor, str, r02.A0H()), A002, num, A112, A1H);
                            VideoStickerAnythingProcessor.A03(0Yt.A06(JTQ.A1b("upload_id", str, AnonymousClass7TE.A1L("edit_id", str2))));
                            return;
                        }
                        0qQ.A0F("pendingMedia");
                    } else {
                        0qQ.A0F("httpRequestExecutor");
                    }
                    throw AnonymousClass00P.createAndThrow();
                } catch (JSONException e) {
                    VideoStickerAnythingProcessor.A03(DbY.A0p("error_message", "[IGSegmentAnything] Failed to save the sticker.", AnonymousClass7TE.A1L("error", e.toString())));
                    videoStickerAnythingProcessor.Db5(C8917RFk.IGMLSegmentAnythingVideoStatusRequestingSaveEdit, AnonymousClass7TG.A0m(e, "Save edit request failed ", AnonymousClass7TE.A1A()));
                }
            } else {
                0qQ.A0F("igUploaderConfig");
                throw AnonymousClass00P.createAndThrow();
            }
        }
    }
}
