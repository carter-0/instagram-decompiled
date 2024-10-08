package X;

import com.facebook.spm.SentencePieceModel;
import java.util.Arrays;

public final class LGH {
    public SentencePieceModel A00;
    public final String A01;

    public final boolean A00() {
        return AnonymousClass7TF.A1V(this.A00);
    }

    public final boolean A01() {
        if (this.A00 != null) {
            return true;
        }
        try {
            ZNl zNl = SentencePieceModel.Companion;
            this.A00 = new SentencePieceModel(this.A01);
            return true;
        } catch (Exception e) {
            0KC.A0F("Text2Filter Llama2 Tokenizer", "Failed to load spm model", e);
            return false;
        }
    }

    public final long[] A03(String str) {
        0qQ.A0B(str, 0);
        int[] A02 = A02(str);
        long[] jArr = new long[512];
        Arrays.fill(jArr, 0, 512, 0);
        if (A02 != null) {
            int i = 0;
            loop0:
            while (true) {
                long j = 2;
                while (true) {
                    jArr[i] = j;
                    i++;
                    if (i >= 512) {
                        break loop0;
                    } else if (i != 0) {
                        if (1 <= i && i <= Math.min(A02.length, 510)) {
                            j = ((long) A02[i - 1]) + 1;
                        } else if (i == Math.min(A02.length + 1, 511)) {
                            j = 3;
                        } else {
                            j = 0;
                        }
                    }
                }
            }
        }
        return jArr;
    }

    public LGH(String str) {
        this.A01 = str;
    }

    public final int[] A02(String str) {
        if (!A00()) {
            A01();
        }
        SentencePieceModel sentencePieceModel = this.A00;
        if (sentencePieceModel != null) {
            return sentencePieceModel.encode(str);
        }
        return null;
    }
}
