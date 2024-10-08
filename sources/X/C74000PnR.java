package X;

/* renamed from: X.PnR  reason: case insensitive filesystem */
public final class C74000PnR extends 0Yg implements 0sP {
    public static final C74000PnR A00 = new C74000PnR();

    public C74000PnR() {
        super(1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
        if (r2 != null) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r7) {
        /*
            r6 = this;
            X.N4A r7 = (X.N4A) r7
            r0 = 0
            X.0qQ.A0B(r7, r0)
            java.lang.Class<com.facebook.rsys.call.gen.CallModel> r0 = com.facebook.rsys.call.gen.CallModel.class
            java.lang.Object r0 = r7.A00(r0)
            com.facebook.rsys.call.gen.CallModel r0 = (com.facebook.rsys.call.gen.CallModel) r0
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L_0x005d
            java.util.ArrayList r0 = r0.remoteParticipants
            if (r0 == 0) goto L_0x005d
            java.util.Iterator r3 = r0.iterator()
        L_0x001a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x005b
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.facebook.rsys.call.gen.CallParticipant r0 = (com.facebook.rsys.call.gen.CallParticipant) r0
            java.lang.String r1 = r0.userId
            java.lang.String r0 = "0"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x001a
        L_0x0031:
            com.facebook.rsys.call.gen.CallParticipant r2 = (com.facebook.rsys.call.gen.CallParticipant) r2
            if (r2 == 0) goto L_0x005d
            com.facebook.rsys.call.gen.ParticipantMediaState r0 = r2.mediaState
            if (r0 == 0) goto L_0x005d
            java.util.ArrayList r0 = r0.audioStreams
            if (r0 == 0) goto L_0x005d
            java.util.Iterator r3 = r0.iterator()
        L_0x0041:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x005d
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.facebook.rsys.audio.gen.AudioStream r0 = (com.facebook.rsys.audio.gen.AudioStream) r0
            int r1 = r0.type
            r0 = 9
            if (r1 != r0) goto L_0x0041
            if (r2 == 0) goto L_0x005d
        L_0x0056:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            return r0
        L_0x005b:
            r2 = r4
            goto L_0x0031
        L_0x005d:
            r5 = 0
            goto L_0x0056
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74000PnR.invoke(java.lang.Object):java.lang.Object");
    }
}
