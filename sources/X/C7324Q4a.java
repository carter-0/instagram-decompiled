package X;

import android.media.MediaFormat;
import java.io.IOException;

/* renamed from: X.Q4a  reason: case insensitive filesystem */
public abstract class C7324Q4a {
    /* JADX WARNING: type inference failed for: r0v0, types: [X.Tgv, java.lang.Object] */
    public static int A00(String str) {
        try {
            Q4X A00 = Q4X.A00(new Object(), str);
            if (A00 != null) {
                return A00.A02;
            }
            return 3;
        } catch (Exception e) {
            0KC.A0F("MediaFormatUtil", "Exception while extracting video media format metadata:", e);
            return 3;
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.Srp, java.lang.Object, X.TdJ] */
    public static C13591TdJ A01(C266714aE r7, C13780Tgv tgv, String str) {
        String string;
        if (r7 != C266714aE.AUDIO) {
            return null;
        }
        C13853TiW AL8 = tgv.AL8();
        try {
            AL8.ETt(str);
            Q1N A01 = Q1M.A01(AL8, false);
            if (A01 != null) {
                MediaFormat mediaFormat = A01.A01;
                ? obj = new Object();
                if (mediaFormat.containsKey("channel-count")) {
                    obj.A00 = mediaFormat.getInteger("channel-count");
                    if (mediaFormat.containsKey("sample-rate")) {
                        obj.A01 = mediaFormat.getInteger("sample-rate");
                        if (mediaFormat.containsKey("mime") && (string = mediaFormat.getString("mime")) != null) {
                            obj.A02 = string;
                            return obj;
                        }
                    }
                }
            }
            AL8.release();
            return null;
        } catch (C7960Qe1 | IOException unused) {
            return null;
        } finally {
            AL8.release();
        }
    }
}
