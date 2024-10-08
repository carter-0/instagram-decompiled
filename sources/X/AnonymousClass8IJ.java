package X;

import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import com.instagram.android.R;
import com.instagram.api.schemas.AudioFilterType;

/* renamed from: X.8IJ  reason: invalid class name */
public enum AnonymousClass8IJ {
    A0C(r3, "None", "", 1.0f, 0, 2131955522, R.drawable.instagram_circle_x_pano_outline_24),
    A0F(r3, "Spedup", "", 1.3f, 1, 2131955773, R.drawable.instagram_audio_sped_up_pano_outline_24),
    A0E(r3, "Slowed", "", 0.75f, 2, 2131955772, R.drawable.instagram_audio_slowed_down_pano_outline_24),
    A0A(r3, "Crunchy", "fba/effect_graphs/crunchy.json", 1.0f, 3, 2131955769, R.drawable.instagram_audio_crunchy_pano_outline_24),
    A0B(r3, "Dreamy", "fba/effect_graphs/dreamy.json", 1.0f, 4, 2131955770, R.drawable.instagram_moon_pano_outline_24),
    A0D(r3, "Radio", "fba/effect_graphs/radio.json", 1.0f, 5, 2131955771, R.drawable.instagram_audio_radio_pano_outline_24),
    A0G(r20, "Swirl", "cvat/engines/multifxprocessor/resources/json/psychedelic.json", 1.0f, 6, 2131955774, R.drawable.instagram_audio_swirl_pano_outline_24),
    A0H(r20, "Vinyl", "cvat/engines/multifxprocessor/resources/json/vinyl.json", 1.0f, 7, 2131955775, R.drawable.instagram_audio_vinyl_pano_outline_24);
    
    public MediaEffect A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final AudioFilterType A04;
    public final Float A05;
    public final Integer A06;
    public final String A07;

    /* access modifiers changed from: public */
    static {
        AnonymousClass8IJ[] r0;
        A08 = 0oU.A00(r0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0052, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0055, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        X.1zE.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0059, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.facebook.videolite.transcoder.base.composition.MediaEffect A00(android.content.Context r8) {
        /*
            r7 = this;
            com.facebook.videolite.transcoder.base.composition.MediaEffect r3 = r7.A00
            if (r3 != 0) goto L_0x0075
            java.lang.Integer r1 = r7.A06
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            java.lang.String r5 = r7.A07
            if (r1 != r0) goto L_0x0062
            java.lang.String r4 = "AudioEffectUtil_toCTVoiceEffect"
            r0 = 1
            X.0qQ.A0B(r5, r0)
            r3 = 0
            java.lang.String r2 = "ct-voice-effect-"
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ FileNotFoundException -> 0x005a, IOException -> 0x0067 }
            java.lang.String r1 = X.002.A0Q(r2, r0)     // Catch:{ FileNotFoundException -> 0x005a, IOException -> 0x0067 }
            java.lang.String r0 = ".json"
            java.io.File r1 = java.io.File.createTempFile(r1, r0)     // Catch:{ FileNotFoundException -> 0x005a, IOException -> 0x0067 }
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x005a, IOException -> 0x0067 }
            r6.<init>(r1)     // Catch:{ FileNotFoundException -> 0x005a, IOException -> 0x0067 }
            android.content.res.AssetManager r0 = r8.getAssets()     // Catch:{ all -> 0x0053 }
            java.io.InputStream r2 = r0.open(r5)     // Catch:{ all -> 0x0053 }
            X.0qQ.A0A(r2)     // Catch:{ all -> 0x004c }
            X.C11108SAj.A00(r2, r6)     // Catch:{ all -> 0x004c }
            if (r2 == 0) goto L_0x003b
            r2.close()     // Catch:{ all -> 0x0053 }
        L_0x003b:
            r6.close()     // Catch:{ FileNotFoundException -> 0x005a, IOException -> 0x0067 }
            java.lang.String r1 = r1.getPath()     // Catch:{ FileNotFoundException -> 0x005a, IOException -> 0x0067 }
            X.0qQ.A07(r1)     // Catch:{ FileNotFoundException -> 0x005a, IOException -> 0x0067 }
            X.Srg r0 = new X.Srg     // Catch:{ FileNotFoundException -> 0x005a, IOException -> 0x0067 }
            r0.<init>(r1)     // Catch:{ FileNotFoundException -> 0x005a, IOException -> 0x0067 }
            r3 = r0
            goto L_0x0071
        L_0x004c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004e }
        L_0x004e:
            r0 = move-exception
            X.1zE.A00(r2, r1)     // Catch:{ all -> 0x0053 }
            throw r0     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0055 }
        L_0x0055:
            r0 = move-exception
            X.1zE.A00(r6, r1)     // Catch:{ FileNotFoundException -> 0x005a, IOException -> 0x0067 }
            throw r0     // Catch:{ FileNotFoundException -> 0x005a, IOException -> 0x0067 }
        L_0x005a:
            r1 = move-exception
            java.lang.String r0 = "Unable to open temp file "
            java.lang.String r0 = X.002.A0R(r0, r5)
            goto L_0x006e
        L_0x0062:
            X.Srd r3 = X.C394729yb.A00(r8, r5)
            goto L_0x0071
        L_0x0067:
            r1 = move-exception
            r0 = 71
            java.lang.String r0 = X.Pxd.A00(r0)
        L_0x006e:
            X.0kD.A05(r4, r0, r1)
        L_0x0071:
            com.facebook.videolite.transcoder.base.composition.MediaEffect r3 = (com.facebook.videolite.transcoder.base.composition.MediaEffect) r3
            r7.A00 = r3
        L_0x0075:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8IJ.A00(android.content.Context):com.facebook.videolite.transcoder.base.composition.MediaEffect");
    }

    /* access modifiers changed from: public */
    AnonymousClass8IJ(Integer num, String str, String str2, float f, int i, int i2, int i3) {
        this.A04 = r1;
        this.A07 = str2;
        this.A03 = i2;
        this.A02 = i3;
        this.A01 = f;
        this.A05 = r2;
        this.A06 = num;
    }
}
