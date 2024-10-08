package com.instagram.save.repository;

import X.0sP;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.C60340gF;
import X.C62037KWw;
import X.C62852KnS;
import X.MU9;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.save.repository.SavedAudioRepository$setIsAudioSaved$4", f = "SavedAudioRepository.kt", i = {}, l = {135, 137}, m = "invokeSuspend", n = {}, s = {})
public final class SavedAudioRepository$setIsAudioSaved$4 extends AnonymousClass1Ek implements 0sP {
    public int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C62852KnS A02;
    public final /* synthetic */ MU9 A03;
    public final /* synthetic */ C62037KWw A04;
    public final /* synthetic */ String A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SavedAudioRepository$setIsAudioSaved$4(C62852KnS knS, MU9 mu9, C62037KWw kWw, String str, AnonymousClass4D7 r6, long j) {
        super(1, r6);
        this.A01 = j;
        this.A04 = kWw;
        this.A02 = knS;
        this.A03 = mu9;
        this.A05 = str;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.save.repository.SavedAudioRepository$setIsAudioSaved$4, X.4D7] */
    public final AnonymousClass4D7 create(AnonymousClass4D7 r9) {
        long j = this.A01;
        return new SavedAudioRepository$setIsAudioSaved$4(this.A02, this.A03, this.A04, this.A05, r9, j);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((SavedAudioRepository$setIsAudioSaved$4) create((AnonymousClass4D7) obj)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [com.instagram.save.repository.SavedAudioRepository$setIsAudioSaved$4, X.4D7] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ec  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.1Hj r2 = X.1Hj.A02
            int r0 = r8.A00
            r5 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0072
            if (r0 == r3) goto L_0x0080
            X.0eS.A00(r9)
        L_0x000d:
            X.MU9 r5 = r8.A03
            X.KnS r6 = r8.A02
            boolean r0 = r9 instanceof X.C239793Ih
            r7 = 0
            if (r0 == 0) goto L_0x0069
            if (r5 == 0) goto L_0x0067
            boolean r0 = r6 instanceof X.KXK
            if (r0 == 0) goto L_0x0061
            r0 = r6
            X.KXK r0 = (X.KXK) r0
            boolean r0 = r0.A02
        L_0x0021:
            r5.Dol(r0)
            X.0gF r0 = X.C60340gF.A00
        L_0x0026:
            X.3Ih r9 = X.C41845B3m.A0d(r0)
        L_0x002a:
            X.KWw r4 = r8.A04
            java.lang.String r3 = r8.A05
            boolean r0 = r9 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0055
            boolean r0 = r9 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00f2
            boolean r2 = r6 instanceof X.KXK
            if (r2 == 0) goto L_0x005b
            r0 = r6
            X.KXK r0 = (X.KXK) r0
            boolean r1 = r0.A02
        L_0x003f:
            r0 = r1 ^ 1
            X.C62037KWw.A00(r4, r3, r0)
            if (r5 == 0) goto L_0x0051
            if (r2 == 0) goto L_0x0056
            X.KXK r6 = (X.KXK) r6
            java.lang.Integer r0 = r6.A00
        L_0x004c:
            r5.DCu(r0, r3, r1)
            X.0gF r7 = X.C60340gF.A00
        L_0x0051:
            X.5sO r9 = X.C41845B3m.A0c(r7)
        L_0x0055:
            return r9
        L_0x0056:
            X.KXL r6 = (X.KXL) r6
            java.lang.Integer r0 = r6.A00
            goto L_0x004c
        L_0x005b:
            r0 = r6
            X.KXL r0 = (X.KXL) r0
            boolean r1 = r0.A03
            goto L_0x003f
        L_0x0061:
            r0 = r6
            X.KXL r0 = (X.KXL) r0
            boolean r0 = r0.A03
            goto L_0x0021
        L_0x0067:
            r0 = r7
            goto L_0x0026
        L_0x0069:
            boolean r0 = r9 instanceof X.C297815sO
            if (r0 != 0) goto L_0x002a
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0072:
            X.0eS.A00(r9)
            long r0 = r8.A01
            r8.A00 = r3
            java.lang.Object r0 = X.C241603Pv.A01(r8, r0)
            if (r0 != r2) goto L_0x0083
            return r2
        L_0x0080:
            X.0eS.A00(r9)
        L_0x0083:
            X.KWw r0 = r8.A04
            com.instagram.common.session.UserSession r0 = r0.A02
            X.KnS r4 = r8.A02
            r8.A00 = r5
            X.1NY r3 = X.AnonymousClass7TG.A0a(r0)
            boolean r5 = r4 instanceof X.KXK
            if (r5 == 0) goto L_0x00ec
            r0 = r4
            X.KXK r0 = (X.KXK) r0
            boolean r0 = r0.A02
        L_0x0098:
            if (r0 == 0) goto L_0x00e9
            java.lang.String r0 = "music/bookmark_music/"
        L_0x009c:
            r3.A0E = r0
            java.lang.Class<X.K11> r1 = X.K11.class
            java.lang.Class<X.LJn> r0 = X.C64026LJn.class
            r3.A0Q(r1, r0)
            if (r5 == 0) goto L_0x00e3
            r0 = r4
            X.KXK r0 = (X.KXK) r0
            java.lang.Integer r0 = r0.A00
        L_0x00ac:
            java.lang.String r1 = X.C55119HcS.A00(r0)
            java.lang.String r0 = "surface_requested_from"
            r3.A9m(r0, r1)
            boolean r0 = r4 instanceof X.KXL
            if (r0 == 0) goto L_0x00d7
            X.KXL r4 = (X.KXL) r4
            java.lang.String r1 = r4.A02
            java.lang.String r0 = "audio_cluster_id"
            r3.A9m(r0, r1)
            java.lang.String r1 = r4.A01
            java.lang.String r0 = "audio_asset_id"
            r3.A0G(r0, r1)
        L_0x00c9:
            X.1OC r1 = r3.A0M()
            r0 = 840899784(0x321f1cc8, float:9.261562E-9)
            java.lang.Object r9 = r1.A00(r0, r8)
            if (r9 != r2) goto L_0x000d
            return r2
        L_0x00d7:
            if (r5 == 0) goto L_0x00f7
            X.KXK r4 = (X.KXK) r4
            java.lang.String r1 = r4.A01
            java.lang.String r0 = "original_audio_id"
            r3.A9m(r0, r1)
            goto L_0x00c9
        L_0x00e3:
            r0 = r4
            X.KXL r0 = (X.KXL) r0
            java.lang.Integer r0 = r0.A00
            goto L_0x00ac
        L_0x00e9:
            java.lang.String r0 = "music/unbookmark_music/"
            goto L_0x009c
        L_0x00ec:
            r0 = r4
            X.KXL r0 = (X.KXL) r0
            boolean r0 = r0.A03
            goto L_0x0098
        L_0x00f2:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00f7:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.save.repository.SavedAudioRepository$setIsAudioSaved$4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
