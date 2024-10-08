package X;

/* renamed from: X.Mcq  reason: case insensitive filesystem */
public final /* synthetic */ class C66804Mcq extends 03J implements C62320sa {
    public C66804Mcq(Object obj) {
        super(0, obj, C3258874o.class, "onPlaybackSpeedClick", "onPlaybackSpeedClick()Lcom/instagram/direct/messagethread/voice/VoiceMessagePlaybackSpeed;", 0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        C66802Mco mco;
        C69470NmE nmE;
        C3258874o r5 = (C3258874o) this.receiver;
        int ordinal = C66803Mcp.A00(r5.A06.A01()).ordinal();
        if (ordinal == 0) {
            mco = C66802Mco.ONE_POINT_FIVE;
        } else if (ordinal != 1) {
            mco = C66802Mco.ONE;
        } else {
            mco = C66802Mco.TWO;
        }
        AnonymousClass7GP r3 = r5.A05;
        int ordinal2 = mco.ordinal();
        if (ordinal2 == 0) {
            nmE = C69470NmE.SPEED_1X;
        } else if (ordinal2 != 1) {
            nmE = C69470NmE.SPEED_2X;
        } else {
            nmE = C69470NmE.SPEED_1_5X;
        }
        0Aj A0e = AnonymousClass7TE.A0e(r3.A00, "audio_clips_playback_speed_click");
        if (A0e.isSampled()) {
            A0e.A8M(nmE, "playback_speed");
            A0e.Cgf();
        }
        C3258874o.A03(r5, mco);
        return mco;
    }
}
