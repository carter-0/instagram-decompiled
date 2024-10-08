package X;

import com.instagram.igsignals.core.IgSignalsPredictor$Metadata$Companion;
import kotlinx.serialization.Serializable;

@Serializable
/* renamed from: X.Vzm  reason: case insensitive filesystem */
public final class C18751Vzm {
    public static final IgSignalsPredictor$Metadata$Companion Companion = new Object();
    public final long A00;
    public final String A01;
    public final String A02;

    public C18751Vzm(String str, String str2, long j) {
        0qQ.A0B(str, 1);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = j;
    }

    public final String A00() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A02);
        sb.append('_');
        sb.append(this.A00);
        sb.append('_');
        return AnonymousClass7TF.A0l(this.A01, sb);
    }

    public /* synthetic */ C18751Vzm(int i, String str, String str2, long j) {
        if (7 != (i & 7)) {
            VJ6.A00(C20510Wsq.A01, i, 7);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A02 = str;
        this.A01 = str2;
        this.A00 = j;
    }
}
