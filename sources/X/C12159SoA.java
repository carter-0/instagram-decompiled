package X;

import com.facebook.spm.SentencePieceModel;
import java.util.List;

/* renamed from: X.SoA  reason: case insensitive filesystem */
public final class C12159SoA implements C258833zi {
    public final C10872RzY A00;
    public final C258743zZ A01;
    public final C258743zZ A02;
    public final SentencePieceModel A03;
    public final C348037xm A04;

    public final AnonymousClass40G E3X(C258993zy r6, List list) {
        if (r6 != null) {
            try {
                r6.A01("prediction_start");
            } catch (Exception e) {
                if (r6 != null) {
                    r6.A01("prediction_end");
                }
                return Pxg.A0Q(e);
            }
        }
        A00(r6, this.A02, "");
        A00(r6, this.A01, "spm");
        if (list.isEmpty() || list.size() > 1) {
            if (r6 != null) {
                r6.A01("prediction_end");
            }
            return new AnonymousClass40G(0sn.A00, "Currently, only 1 example is supported", false);
        }
        AnonymousClass40G A002 = this.A00.A00(r6, this.A03, list, this.A04);
        if (r6 == null) {
            return A002;
        }
        r6.A01("prediction_end");
        return A002;
    }

    public static final void A00(C258993zy r3, C258743zZ r4, String str) {
        if (r3 != null) {
            r3.A02(002.A0R("model_name", str), r4.BTg());
            r3.A02(002.A0R("model_version", str), String.valueOf(r4.BTh()));
            r3.A02(002.A0R("model_asset_name", str), r4.BTd());
        }
    }

    public C12159SoA(C10872RzY rzY, C258743zZ r2, C258743zZ r3, SentencePieceModel sentencePieceModel, C348037xm r5) {
        C51972G9s.A1D(r5, sentencePieceModel);
        this.A02 = r2;
        this.A01 = r3;
        this.A04 = r5;
        this.A03 = sentencePieceModel;
        this.A00 = rzY;
    }
}
