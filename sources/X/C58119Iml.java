package X;

import android.view.View;

/* renamed from: X.Iml  reason: case insensitive filesystem */
public final class C58119Iml extends 0Yk implements 0sP {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C58119Iml(java.lang.Object r9, int r10) {
        /*
            r8 = this;
            r1 = r8
            r8.A00 = r10
            switch(r10) {
                case 0: goto L_0x0013;
                case 1: goto L_0x0016;
                case 2: goto L_0x0026;
                case 3: goto L_0x002e;
                case 4: goto L_0x0038;
                case 5: goto L_0x0038;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Class<X.GwZ> r4 = X.C53929GwZ.class
            r2 = 1
            java.lang.String r5 = "onCardClick"
            java.lang.String r6 = "onCardClick(Landroid/view/View;Linstagram/features/clips/intentawareads/logging/ClipsIntentAwareAdsLogger$CardAdClickType;)V"
        L_0x000d:
            r7 = 0
        L_0x000e:
            r3 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        L_0x0013:
            java.lang.Class<X.JjJ> r4 = X.C60316JjJ.class
            goto L_0x0018
        L_0x0016:
            java.lang.Class<X.JjI> r4 = X.C60315JjI.class
        L_0x0018:
            r2 = 1
            r0 = 3868(0xf1c, float:5.42E-42)
            java.lang.String r5 = X.AnonymousClass000.A00(r0)
            r0 = 3869(0xf1d, float:5.422E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r0)
            goto L_0x000d
        L_0x0026:
            java.lang.Class<X.K65> r4 = X.K65.class
            r2 = 1
            java.lang.String r5 = "onFetchArchive"
            java.lang.String r6 = "onFetchArchive(ZLjava/lang/String;)V"
            goto L_0x000d
        L_0x002e:
            java.lang.Class<X.GhL> r4 = X.C53030GhL.class
            r2 = 1
            java.lang.String r5 = "toggleAutoReplies"
            java.lang.String r6 = "toggleAutoReplies(Z)Z"
            r7 = 8
            goto L_0x000e
        L_0x0038:
            java.lang.Class<X.GgP> r4 = X.C52972GgP.class
            r2 = 1
            java.lang.String r5 = "handleImagineAction"
            java.lang.String r6 = "handleImagineAction(Lcom/meta/metaai/imagine/creation/impl/viewmodel/ImagineMediaAction;Z)V"
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58119Iml.<init>(java.lang.Object, int):void");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.A00) {
            case 0:
                ((C60316JjJ) this.receiver).A09((Integer) null, C41847B3o.A1E(obj), (String) null, (String) null);
                break;
            case 1:
                ((C60315JjI) this.receiver).A0B((Integer) null, C41847B3o.A1E(obj), (String) null, (String) null);
                break;
            case 2:
                C60308Jj7.A01((C60308Jj7) ((K65) this.receiver).A0A.getValue(), (String) null, AnonymousClass7TE.A1a(obj));
                break;
            case 3:
                ((C53030GhL) this.receiver).A01(AnonymousClass7TE.A1a(obj));
                break;
            case 4:
            case 5:
                HQ1 hq1 = (HQ1) obj;
                0qQ.A0B(hq1, 0);
                ((C52972GgP) this.receiver).A0F(hq1, false);
                break;
            default:
                View A0O = C51969G9p.A0O(obj);
                C53929GwZ gwZ = (C53929GwZ) this.receiver;
                Integer num = AnonymousClass05K.A00;
                C53929GwZ.A0C(gwZ);
                C53929GwZ.A09(A0O, gwZ, num);
                break;
        }
        return C60340gF.A00;
    }
}
