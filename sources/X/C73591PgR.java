package X;

/* renamed from: X.PgR  reason: case insensitive filesystem */
public final /* synthetic */ class C73591PgR extends 03J implements 0sP {
    public C73591PgR(Object obj) {
        super(1, obj, C3258874o.class, "logTranscriptionTextExpand", "logTranscriptionTextExpand(Ljava/lang/CharSequence;)V", 0);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        0qQ.A0B(charSequence, 0);
        AnonymousClass7GP r1 = ((C3258874o) this.receiver).A05;
        long size = (long) DbV.A18(charSequence, " ").size();
        0Aj A0e = AnonymousClass7TE.A0e(r1.A00, "audio_clips_transcription_expand_click");
        if (A0e.isSampled()) {
            A0e.A9F("word_count", Long.valueOf(size));
            A0e.Cgf();
        }
        return C60340gF.A00;
    }
}
