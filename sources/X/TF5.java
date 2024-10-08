package X;

import android.net.Uri;
import com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessorV2;
import java.net.URI;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public final class TF5 implements Runnable {
    public final /* synthetic */ VideoStickerAnythingProcessorV2 A00;
    public final /* synthetic */ String A01;

    public TF5(VideoStickerAnythingProcessorV2 videoStickerAnythingProcessorV2, String str) {
        this.A00 = videoStickerAnythingProcessorV2;
        this.A01 = str;
    }

    public final void run() {
        VideoStickerAnythingProcessorV2 videoStickerAnythingProcessorV2 = this.A00;
        AnonymousClass3Q2 r0 = videoStickerAnythingProcessorV2.A0B;
        if (r0 != null) {
            String str = r0.A3t;
            Uri.Builder A0I = Pxe.A0I();
            Uri.Builder scheme = A0I.scheme("https");
            C11224SFy sFy = videoStickerAnythingProcessorV2.A09;
            if (sFy != null) {
                scheme.encodedAuthority(sFy.A09).path("api/v1/media/save_edit/");
                try {
                    JSONObject A11 = DbS.A11();
                    Pxh.A1N(str, "upload_id", A11);
                    String str2 = this.A01;
                    Pxh.A1N(str2, "edit_id", A11);
                    C10392RrT A002 = C266784aL.A00(A11);
                    URI A112 = Pxg.A11(A0I);
                    C11039S6r s6r = videoStickerAnythingProcessorV2.A06;
                    if (s6r != null) {
                        s6r.A02("save_edit_start", C13291TTq.A00);
                    }
                    S1R s1r = videoStickerAnythingProcessorV2.A0C;
                    if (s1r != null) {
                        Integer num = AnonymousClass05K.A01;
                        LinkedHashMap A1H = AnonymousClass7TE.A1H();
                        AnonymousClass3Q2 r02 = videoStickerAnythingProcessorV2.A0B;
                        if (r02 != null) {
                            s1r.A00(new QN8(videoStickerAnythingProcessorV2.A06, videoStickerAnythingProcessorV2, str, r02.A0H()), A002, num, A112, A1H);
                            C11039S6r s6r2 = videoStickerAnythingProcessorV2.A06;
                            if (s6r2 != null) {
                                s6r2.A03(0Yt.A06(JTQ.A1b("upload_id", new QGF(str), AnonymousClass7TE.A1L("edit_id", new QGF(str2)))));
                                return;
                            }
                            return;
                        }
                        0qQ.A0F("pendingMedia");
                    } else {
                        0qQ.A0F("httpRequestExecutor");
                    }
                    throw AnonymousClass00P.createAndThrow();
                } catch (JSONException e) {
                    C11039S6r s6r3 = videoStickerAnythingProcessorV2.A06;
                    if (s6r3 != null) {
                        s6r3.A03(DbY.A0p("error_message", new QGF("[IGSegmentAnything] Failed to save the sticker."), AnonymousClass7TE.A1L("error", new QGF(e.toString()))));
                    }
                    C11039S6r s6r4 = videoStickerAnythingProcessorV2.A06;
                    if (s6r4 != null) {
                        s6r4.A01("save_edit_start");
                    }
                }
            } else {
                0qQ.A0F("igUploaderConfig");
                throw AnonymousClass00P.createAndThrow();
            }
        }
    }
}
