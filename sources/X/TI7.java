package X;

import android.graphics.RectF;
import android.net.Uri;
import com.aiplatform.processors.stickeranything.ig.VideoStickerAnythingProcessor;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class TI7 implements Runnable {
    public final /* synthetic */ VideoStickerAnythingProcessor A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ boolean A02;

    public TI7(VideoStickerAnythingProcessor videoStickerAnythingProcessor, List list, boolean z) {
        this.A00 = videoStickerAnythingProcessor;
        this.A01 = list;
        this.A02 = z;
    }

    public final void run() {
        JSONArray jSONArray;
        int i;
        VideoStickerAnythingProcessor videoStickerAnythingProcessor = this.A00;
        AnonymousClass3Q2 r0 = videoStickerAnythingProcessor.A0A;
        if (r0 != null) {
            String str = r0.A3t;
            Uri.Builder A0I = Pxe.A0I();
            Uri.Builder scheme = A0I.scheme("https");
            C11224SFy sFy = videoStickerAnythingProcessor.A08;
            if (sFy != null) {
                scheme.encodedAuthority(sFy.A09).path("api/v1/media/upload_edit/");
                try {
                    JSONObject A11 = DbS.A11();
                    List<C63959LFj> list = this.A01;
                    if (AnonymousClass7TE.A1b(list)) {
                        ArrayList A1C = AnonymousClass7TE.A1C();
                        for (C63959LFj lFj : list) {
                            float[] fArr = lFj.A01;
                            0eP A0q = Pxi.A0q("x", Math.max(Math.min(fArr[0], 0.9999f), 1.0E-4f));
                            0eP A0q2 = Pxi.A0q("y", Math.max(Math.min(fArr[1], 0.9999f), 1.0E-4f));
                            switch (lFj.A00.intValue()) {
                                case 2:
                                    i = 2;
                                    break;
                                case 3:
                                    i = 3;
                                    break;
                                default:
                                    i = 0;
                                    break;
                            }
                            A1C.add(0Yt.A06(Pxg.A1b("input_type", Double.valueOf((double) i), A0q, A0q2)));
                        }
                        jSONArray = new JSONArray(A1C.toArray(new Map[0]));
                    } else {
                        RectF rectF = videoStickerAnythingProcessor.A03;
                        jSONArray = new JSONArray(new Map[]{0Yt.A06(new 0eP[]{Pxi.A0q("x", rectF.left), Pxi.A0q("y", rectF.top), AnonymousClass7TF.A0x("input_type", 2)}), 0Yt.A06(new 0eP[]{Pxi.A0q("x", rectF.right), Pxi.A0q("y", rectF.bottom), AnonymousClass7TF.A0x("input_type", 3)})});
                    }
                    Pxh.A1N(str, "upload_id", A11);
                    A11.put("points", jSONArray);
                    boolean z = this.A02;
                    if (z) {
                        A11.put("sticker_anything_audio_enabled", z);
                    }
                    URI A112 = Pxg.A11(A0I);
                    videoStickerAnythingProcessor.Db4(C8917RFk.IGMLSegmentAnythingVideoStatusRequestingEdit);
                    videoStickerAnythingProcessor.AR5(A112, A11);
                    VideoStickerAnythingProcessor.A03(0Yt.A06(JTQ.A1b("upload_id", str, AnonymousClass7TE.A1L("points", jSONArray.toString()))));
                } catch (JSONException e) {
                    VideoStickerAnythingProcessor.A03(DbY.A0p("error_message", "[IGSegmentAnythingGenerateBoundingBoxPoints] Failed to convert points JSON to string.", AnonymousClass7TE.A1L("error", e.toString())));
                    videoStickerAnythingProcessor.Db5(C8917RFk.IGMLSegmentAnythingVideoStatusRequestingEdit, AnonymousClass7TG.A0m(e, "Edit request failed ", AnonymousClass7TE.A1A()));
                }
            } else {
                0qQ.A0F("igUploaderConfig");
                throw AnonymousClass00P.createAndThrow();
            }
        }
    }
}
