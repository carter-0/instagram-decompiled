package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Gainmap;
import android.os.Build;
import java.util.HashMap;

public final class ADq {
    public static final ADq A00 = new Object();
    public static final BitmapFactory.Options A01;

    /* JADX WARNING: type inference failed for: r0v0, types: [X.ADq, java.lang.Object] */
    static {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = 64;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        A01 = options;
    }

    public final boolean A01(String str) {
        if (Build.VERSION.SDK_INT < 34 || str == null) {
            return false;
        }
        String A0j = AnonymousClass7TF.A0j(str);
        if (00p.A0i(A0j, "jpg", false) || 00p.A0i(A0j, "jpeg", false)) {
            return AGx.A00.A01(str);
        }
        return false;
    }

    public final HashMap A00(String str) {
        Bitmap decodeFile;
        Bitmap gainmapContents;
        HashMap A1E = AnonymousClass7TE.A1E();
        if (Build.VERSION.SDK_INT >= 34 && str != null) {
            String A0j = AnonymousClass7TF.A0j(str);
            if ((00p.A0i(A0j, "jpg", false) || 00p.A0i(A0j, "jpeg", false)) && (decodeFile = BitmapFactory.decodeFile(str, A01)) != null) {
                decodeFile.getAllocationByteCount();
                boolean hasGainmap = decodeFile.hasGainmap();
                Gainmap gainmap = decodeFile.getGainmap();
                A1E.put("has_gainmap", String.valueOf(hasGainmap));
                if (gainmap != null) {
                    float[] gamma = gainmap.getGamma();
                    0qQ.A07(gamma);
                    A1E.put("gamma", 03t.A0F(gamma).toString());
                    A1E.put("display_ratio_full_hdr", String.valueOf(gainmap.getDisplayRatioForFullHdr()));
                    float[] epsilonHdr = gainmap.getEpsilonHdr();
                    0qQ.A07(epsilonHdr);
                    A1E.put("epsilon_hdr", 03t.A0F(epsilonHdr).toString());
                    float[] epsilonSdr = gainmap.getEpsilonSdr();
                    0qQ.A07(epsilonSdr);
                    A1E.put("epsilon_sdr", 03t.A0F(epsilonSdr).toString());
                    float[] ratioMax = gainmap.getRatioMax();
                    0qQ.A07(ratioMax);
                    A1E.put("ratio_max", 03t.A0F(ratioMax).toString());
                    float[] ratioMin = gainmap.getRatioMin();
                    0qQ.A07(ratioMin);
                    A1E.put("ratio_min", 03t.A0F(ratioMin).toString());
                    A1E.put("min_display_ratio_hdr_transition", String.valueOf(gainmap.getMinDisplayRatioForHdrTransition()));
                }
                Gainmap gainmap2 = decodeFile.getGainmap();
                if (!(gainmap2 == null || (gainmapContents = gainmap2.getGainmapContents()) == null)) {
                    gainmapContents.recycle();
                }
                decodeFile.recycle();
            }
        }
        return A1E;
    }
}
