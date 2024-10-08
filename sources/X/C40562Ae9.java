package X;

import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.List;

/* renamed from: X.Ae9  reason: case insensitive filesystem */
public final class C40562Ae9 implements C66516MUu {
    public C258823zh A00;
    public Integer A01 = AnonymousClass05K.A00;
    public final C64418LbZ A02;
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A00(0eO.A02, new MMJ(this, 24));
    public final UserSession A04;

    private final Integer A00() {
        Integer num = this.A01;
        if (num == AnonymousClass05K.A00) {
            File A002 = C39893ADv.A00((C39893ADv) this.A03.getValue());
            if (!A002.exists() || !A002.canRead()) {
                num = AnonymousClass05K.A01;
            } else {
                num = AnonymousClass05K.A0C;
            }
            this.A01 = num;
        }
        return num;
    }

    public C40562Ae9(UserSession userSession, C64418LbZ lbZ) {
        AnonymousClass7TG.A1O(userSession, lbZ);
        this.A04 = userSession;
        this.A02 = lbZ;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0033, code lost:
        if (r2 != null) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A01() {
        /*
            r6 = this;
            java.lang.Integer r0 = r6.A00()
            java.lang.Integer r5 = X.AnonymousClass05K.A0N
            if (r0 == r5) goto L_0x00c4
            X.3zh r0 = r6.A00
            if (r0 != 0) goto L_0x00c4
            X.0eM r0 = r6.A03     // Catch:{ all -> 0x0019 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0019 }
            X.ADv r0 = (X.C39893ADv) r0     // Catch:{ all -> 0x0019 }
            X.40G r1 = r0.A01()     // Catch:{ all -> 0x0019 }
            goto L_0x001f
        L_0x0019:
            r0 = move-exception
            X.0eQ r1 = new X.0eQ
            r1.<init>(r0)
        L_0x001f:
            boolean r0 = r1 instanceof X.0eQ
            if (r0 == 0) goto L_0x0024
            r1 = 0
        L_0x0024:
            X.40G r1 = (X.AnonymousClass40G) r1
            r4 = 1
            if (r1 == 0) goto L_0x0046
            boolean r0 = r1.A02
            if (r0 != r4) goto L_0x0046
            java.lang.Object r2 = r1.A00
            if (r2 == 0) goto L_0x0046
            com.facebook.odin.prediction.litennmodelparams.DynamicNNModelParams r2 = (com.facebook.odin.prediction.litennmodelparams.DynamicNNModelParams) r2
            if (r2 == 0) goto L_0x0041
        L_0x0035:
            X.AT9 r1 = new X.AT9
            r1.<init>(r2)
            X.3zh r0 = new X.3zh
            r0.<init>(r1)
            r6.A00 = r0
        L_0x0041:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r6.A01 = r0
            return
        L_0x0046:
            com.instagram.common.session.UserSession r3 = r6.A04
            X.950 r1 = X.C3733194w.A00(r3)
            X.LbZ r2 = r6.A02
            java.util.List r0 = X.AnonymousClass7TE.A1I(r2)
            X.40G r1 = r1.A01(r0)
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x00af
            X.S4A r1 = X.C9265RVq.A00(r3)
            r0 = 2
            X.0qQ.A0B(r1, r0)     // Catch:{ Exception -> 0x009f }
            X.Awz r0 = X.C41585Awz.A00     // Catch:{ Exception -> 0x009f }
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)     // Catch:{ Exception -> 0x009f }
            X.40G r3 = X.SKQ.A00(r1, r2, r0)     // Catch:{ Exception -> 0x009f }
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x008c
            java.lang.Object r2 = r3.A00
            if (r2 == 0) goto L_0x008c
            X.411 r2 = (X.AnonymousClass411) r2
            if (r2 == 0) goto L_0x0041
            X.0eM r0 = r6.A03     // Catch:{ Exception -> 0x0087 }
            java.lang.Object r1 = r0.getValue()     // Catch:{ Exception -> 0x0087 }
            X.ADv r1 = (X.C39893ADv) r1     // Catch:{ Exception -> 0x0087 }
            r0 = r2
            com.facebook.odin.prediction.litennmodelparams.DynamicNNModelParams r0 = (com.facebook.odin.prediction.litennmodelparams.DynamicNNModelParams) r0     // Catch:{ Exception -> 0x0087 }
            r1.A02(r0)     // Catch:{ Exception -> 0x0087 }
            goto L_0x0035
        L_0x0087:
            r0 = move-exception
            r0.getMessage()
            goto L_0x0035
        L_0x008c:
            java.lang.String r1 = "Failed to parse lite nn params from loaded model: "
            java.lang.String r0 = r3.A01
            r6.A01 = r5
            java.lang.String r1 = X.002.A0R(r1, r0)
            X.0qQ.A0B(r1, r4)
            X.9GL r0 = new X.9GL
            r0.<init>(r1)
            throw r0
        L_0x009f:
            r1 = move-exception
            java.lang.String r0 = "Failed to parse nn params with exception: "
            java.lang.String r1 = X.AnonymousClass7TF.A0m(r0, r1)
            X.0qQ.A0B(r1, r4)
            X.9GL r0 = new X.9GL
            r0.<init>(r1)
            throw r0
        L_0x00af:
            java.lang.String r2 = "Failed to load pyTroch module and model "
            java.lang.String r1 = r1.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r6.A01 = r0
            java.lang.String r1 = X.002.A0R(r2, r1)
            X.0qQ.A0B(r1, r4)
            X.9GL r0 = new X.9GL
            r0.<init>(r1)
            throw r0
        L_0x00c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40562Ae9.A01():void");
    }

    public final void Cg1() {
        A01();
    }

    public final boolean CoV() {
        return AnonymousClass7TF.A1W(A00(), AnonymousClass05K.A0C);
    }

    public final AnonymousClass40G EHa(List list) {
        A01();
        C258823zh r1 = this.A00;
        if (r1 != null) {
            return r1.E3X((C258993zy) null, list);
        }
        throw new Exception("LiteNN predictor was not ready");
    }
}
