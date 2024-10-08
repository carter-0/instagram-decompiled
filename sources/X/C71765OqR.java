package X;

import android.content.Context;
import android.content.res.Resources;
import android.media.AudioAttributes;
import android.media.SoundPool;
import android.os.Handler;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.OqR  reason: case insensitive filesystem */
public final class C71765OqR implements C74509Pw4 {
    public int A00 = -1;
    public int A01 = -1;
    public SoundPool A02;
    public C62320sa A03;
    public long A04;
    public final ConcurrentHashMap A05;
    public final Context A06;
    public final Handler A07 = AnonymousClass7TF.A0D();
    public final OB3 A08;
    public final OUV A09;

    public C71765OqR(Context context, OUV ouv) {
        0qQ.A0B(ouv, 2);
        this.A06 = context;
        this.A09 = ouv;
        this.A08 = new OB3(context);
        this.A05 = new ConcurrentHashMap();
    }

    public final void EeL(C62320sa r2) {
        0qQ.A0B(r2, 0);
        this.A03 = r2;
    }

    public final void EeN(0sL r1) {
    }

    public final void EnH() {
    }

    public final void EwM(C70828ONa oNa) {
        String str;
        if (this.A01 == -1) {
            int i = -1;
            this.A09.A00("SoundPool starting", new Object[0]);
            SoundPool soundPool = this.A02;
            if (soundPool != null) {
                i = soundPool.play(this.A00, 1.0f, 1.0f, 1, 0, 1.0f);
            }
            this.A01 = i;
            if (this.A03 != null) {
                long j = this.A04;
                if (j > 0) {
                    this.A07.postDelayed(new C73046PUd(this), j);
                    return;
                }
                StringBuilder A1A = AnonymousClass7TE.A1A();
                A1A.append("No duration for sound ");
                A1A.append(oNa.A00);
                A1A.append(" or ");
                try {
                    str = this.A06.getResources().getResourceName(0);
                } catch (Resources.NotFoundException unused) {
                    str = "Unknown";
                }
                String A0l = AnonymousClass7TF.A0l(str, A1A);
                0qQ.A0B(A0l, 1);
                0KC.A0O("SoundPoolPlayer", A0l, Arrays.copyOf(new Object[0], 0));
            }
        }
    }

    public final void reset() {
    }

    public final void ASd() {
        if (this.A02 == null) {
            throw AnonymousClass7TE.A0y();
        }
    }

    public final void CNA() {
        if (this.A02 == null) {
            this.A02 = new SoundPool.Builder().setMaxStreams(2).setAudioAttributes(new AudioAttributes.Builder().setUsage(3).build()).build();
            this.A05.clear();
        }
    }

    public final void Ech(boolean z) {
        SoundPool soundPool;
        int i = this.A01;
        if (i != -1 && (soundPool = this.A02) != null) {
            soundPool.setLoop(i, -1);
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0018 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x004e A[Catch:{ FileNotFoundException -> 0x0098, NotFoundException -> 0x00a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0058 A[Catch:{ FileNotFoundException -> 0x0098, NotFoundException -> 0x00a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0080 A[Catch:{ FileNotFoundException -> 0x0098, NotFoundException -> 0x00a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0032 A[Catch:{ FileNotFoundException -> 0x0098, NotFoundException -> 0x00a0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Eld(X.C70828ONa r11, X.C62320sa r12, X.C62320sa r13) {
        /*
            r10 = this;
            java.lang.String r3 = "SoundPoolPlayer"
            r9 = 0
            r7 = 1
            X.0qQ.A0B(r12, r7)
            android.content.Context r1 = r10.A06
            android.net.Uri r8 = r11.A00
            java.lang.String r0 = r8.toString()
            if (r0 != 0) goto L_0x0018
            android.content.res.Resources r0 = r1.getResources()     // Catch:{ NotFoundException -> 0x0018 }
            r0.getResourceName(r9)     // Catch:{ NotFoundException -> 0x0018 }
        L_0x0018:
            X.OB3 r1 = r10.A08     // Catch:{ FileNotFoundException -> 0x0098, NotFoundException -> 0x00a0 }
            java.lang.StringBuilder r0 = X.JTQ.A0d(r8)     // Catch:{ FileNotFoundException -> 0x0098, NotFoundException -> 0x00a0 }
            r6 = 95
            r0.append(r6)     // Catch:{ FileNotFoundException -> 0x0098, NotFoundException -> 0x00a0 }
            r0.append(r9)     // Catch:{ FileNotFoundException -> 0x0098, NotFoundException -> 0x00a0 }
            java.lang.String r5 = r0.toString()     // Catch:{ FileNotFoundException -> 0x0098, NotFoundException -> 0x00a0 }
            java.util.HashMap r4 = r1.A01     // Catch:{ FileNotFoundException -> 0x0098, NotFoundException -> 0x00a0 }
            java.lang.Number r0 = X.JTO.A0z(r5, r4)     // Catch:{ FileNotFoundException -> 0x0098, NotFoundException -> 0x00a0 }
            if (r0 == 0) goto L_0x0058
            long r1 = r0.longValue()     // Catch:{ FileNotFoundException -> 0x0098, NotFoundException -> 0x00a0 }
        L_0x0036:
            r10.A04 = r1     // Catch:{ FileNotFoundException -> 0x0098, NotFoundException -> 0x00a0 }
            java.lang.StringBuilder r0 = X.JTQ.A0d(r8)     // Catch:{ FileNotFoundException -> 0x0098, NotFoundException -> 0x00a0 }
            r0.append(r6)     // Catch:{ FileNotFoundException -> 0x0098, NotFoundException -> 0x00a0 }
            r0.append(r9)     // Catch:{ FileNotFoundException -> 0x0098, NotFoundException -> 0x00a0 }
            java.lang.String r2 = r0.toString()     // Catch:{ FileNotFoundException -> 0x0098, NotFoundException -> 0x00a0 }
            java.util.concurrent.ConcurrentHashMap r0 = r10.A05     // Catch:{ FileNotFoundException -> 0x0098, NotFoundException -> 0x00a0 }
            java.lang.Number r0 = X.JTO.A0z(r2, r0)     // Catch:{ FileNotFoundException -> 0x0098, NotFoundException -> 0x00a0 }
            if (r0 == 0) goto L_0x0080
            int r0 = r0.intValue()     // Catch:{ FileNotFoundException -> 0x0098, NotFoundException -> 0x00a0 }
            r10.A00 = r0     // Catch:{ FileNotFoundException -> 0x0098, NotFoundException -> 0x00a0 }
            r12.invoke()     // Catch:{ FileNotFoundException -> 0x0098, NotFoundException -> 0x00a0 }
            goto L_0x007f
        L_0x0058:
            android.media.MediaMetadataRetriever r1 = new android.media.MediaMetadataRetriever     // Catch:{ FileNotFoundException -> 0x0098, NotFoundException -> 0x00a0 }
            r1.<init>()     // Catch:{ FileNotFoundException -> 0x0098, NotFoundException -> 0x00a0 }
            java.lang.String r0 = r8.getPath()     // Catch:{ FileNotFoundException -> 0x0098, NotFoundException -> 0x00a0 }
            r1.setDataSource(r0)     // Catch:{ FileNotFoundException -> 0x0098, NotFoundException -> 0x00a0 }
            r0 = 9
            java.lang.String r0 = r1.extractMetadata(r0)     // Catch:{ FileNotFoundException -> 0x0098, NotFoundException -> 0x00a0 }
            r1.release()     // Catch:{ FileNotFoundException -> 0x0098, NotFoundException -> 0x00a0 }
            if (r0 == 0) goto L_0x0070
            goto L_0x0073
        L_0x0070:
            r1 = 0
            goto L_0x0077
        L_0x0073:
            long r1 = java.lang.Long.parseLong(r0)     // Catch:{ FileNotFoundException -> 0x0098, NotFoundException -> 0x00a0 }
        L_0x0077:
            java.lang.Long r0 = java.lang.Long.valueOf(r1)     // Catch:{ FileNotFoundException -> 0x0098, NotFoundException -> 0x00a0 }
            r4.put(r5, r0)     // Catch:{ FileNotFoundException -> 0x0098, NotFoundException -> 0x00a0 }
            goto L_0x0036
        L_0x007f:
            return
        L_0x0080:
            java.lang.String r1 = r8.getPath()     // Catch:{ FileNotFoundException -> 0x0098, NotFoundException -> 0x00a0 }
            android.media.SoundPool r0 = r10.A02     // Catch:{ FileNotFoundException -> 0x0098, NotFoundException -> 0x00a0 }
            if (r0 == 0) goto L_0x008b
            r0.load(r1, r7)     // Catch:{ FileNotFoundException -> 0x0098, NotFoundException -> 0x00a0 }
        L_0x008b:
            android.media.SoundPool r1 = r10.A02     // Catch:{ FileNotFoundException -> 0x0098, NotFoundException -> 0x00a0 }
            if (r1 == 0) goto L_0x00ae
            X.OgX r0 = new X.OgX     // Catch:{ FileNotFoundException -> 0x0098, NotFoundException -> 0x00a0 }
            r0.<init>(r10, r2, r12, r13)     // Catch:{ FileNotFoundException -> 0x0098, NotFoundException -> 0x00a0 }
            r1.setOnLoadCompleteListener(r0)     // Catch:{ FileNotFoundException -> 0x0098, NotFoundException -> 0x00a0 }
            return
        L_0x0098:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "File not found: "
            goto L_0x00a7
        L_0x00a0:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Res not found: "
        L_0x00a7:
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r11, r0, r1)
            X.0KC.A0F(r3, r0, r2)
        L_0x00ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71765OqR.Eld(X.ONa, X.0sa, X.0sa):void");
    }

    public final void Eqq(float f) {
        SoundPool soundPool;
        int i = this.A01;
        if (i != -1 && (soundPool = this.A02) != null) {
            soundPool.setVolume(i, f, f);
        }
    }

    public final void EyJ() {
        SoundPool soundPool = this.A02;
        if (soundPool != null) {
            soundPool.stop(this.A01);
        }
        this.A01 = -1;
    }

    public final void pause() {
        if (this.A01 != -1) {
            this.A09.A00("SoundPool paused", new Object[0]);
            SoundPool soundPool = this.A02;
            if (soundPool != null) {
                soundPool.pause(this.A01);
            }
        }
    }

    public final void release() {
        int i = this.A01;
        if (i != -1) {
            SoundPool soundPool = this.A02;
            if (soundPool != null) {
                soundPool.stop(i);
            }
            this.A01 = -1;
        }
    }
}
