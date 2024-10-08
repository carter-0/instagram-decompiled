package X;

import android.media.MediaFormat;
import android.text.TextUtils;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

public final class Q4X implements C13591TdJ {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public String A08;

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Q4X, java.lang.Object] */
    public static Q4X A00(C13780Tgv tgv, String str) {
        String string;
        int i;
        C13853TiW AL8 = tgv.AL8();
        try {
            AL8.ETt(str);
            MediaFormat mediaFormat = Q1M.A00(AL8).A01;
            ? obj = new Object();
            if (mediaFormat.containsKey(IgReactMediaPickerNativeModule.HEIGHT)) {
                obj.A05 = mediaFormat.getInteger(IgReactMediaPickerNativeModule.HEIGHT);
                if (mediaFormat.containsKey(IgReactMediaPickerNativeModule.WIDTH)) {
                    obj.A07 = mediaFormat.getInteger(IgReactMediaPickerNativeModule.WIDTH);
                    if (mediaFormat.containsKey("frame-rate")) {
                        obj.A04 = mediaFormat.getInteger("frame-rate");
                        if (mediaFormat.containsKey("durationUs")) {
                            mediaFormat.getLong("durationUs");
                            if (mediaFormat.containsKey("rotation-degrees")) {
                                obj.A06 = mediaFormat.getInteger("rotation-degrees");
                            } else if (mediaFormat.containsKey("rotation")) {
                                obj.A06 = mediaFormat.getInteger("rotation");
                            } else {
                                obj.A06 = 0;
                            }
                            if (mediaFormat.containsKey("mime") && (string = mediaFormat.getString("mime")) != null) {
                                obj.A08 = string;
                                if (mediaFormat.containsKey("profile")) {
                                    obj.A03 = mediaFormat.getInteger("profile");
                                    if (mediaFormat.containsKey("color-transfer")) {
                                        obj.A00 = mediaFormat.getInteger("color-range");
                                        obj.A02 = mediaFormat.getInteger("color-transfer");
                                        i = mediaFormat.getInteger("color-standard");
                                    } else {
                                        obj.A00 = 2;
                                        obj.A02 = 3;
                                        i = 1;
                                    }
                                    obj.A01 = i;
                                    return obj;
                                }
                            }
                        }
                    }
                }
            }
            AL8.release();
            return null;
        } catch (C7960Qe1 | Qe5 | IOException unused) {
            return null;
        } finally {
            AL8.release();
        }
    }

    public final boolean CSl(C13591TdJ tdJ) {
        if (!(tdJ instanceof Q4X)) {
            return false;
        }
        Q4X q4x = (Q4X) tdJ;
        if (this.A05 == q4x.A05 && this.A07 == q4x.A07 && this.A06 == q4x.A06 && this.A03 == q4x.A03 && this.A02 == q4x.A02 && TextUtils.equals(this.A08, q4x.A08)) {
            return true;
        }
        return false;
    }
}
