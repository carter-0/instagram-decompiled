package X;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.AudioRecordingConfiguration;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import androidx.media.AudioAttributesCompat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.OdK  reason: case insensitive filesystem */
public final class C71125OdK {
    public static AudioAttributesCompat A0M;
    public C70828ONa A00;
    public boolean A01;
    public final Context A02;
    public final AudioManager A03;
    public final Handler A04;
    public final C69729NrE A05;
    public final C74509Pw4 A06;
    public final OUV A07;
    public final OW7 A08;
    public final Queue A09 = new LinkedList();
    public final Set A0A;
    public final C62320sa A0B = new C73912Pln(this, 14);
    public final C262224Cq A0C;
    public final C74466PvL A0D;
    public final C74518PwD A0E;
    public final C70408O5l A0F;
    public final O2C A0G;
    public final ReentrantLock A0H;
    public final AnonymousClass0eM A0I = AnonymousClass0eN.A01(new C73912Pln(this, 12));
    public final C262094Cc A0J;
    public final C62320sa A0K = new C73912Pln(this, 13);
    public final 0sL A0L = new C59344JFw(this, 43);

    public C71125OdK(Context context, AudioManager audioManager, C69729NrE nrE, OUV ouv, C74518PwD pwD, C70408O5l o5l, O2C o2c, C262094Cc r13) {
        C74509Pw4 oqQ;
        DbW.A1O(audioManager, 2, ouv);
        this.A02 = context;
        this.A03 = audioManager;
        this.A0F = o5l;
        this.A0E = pwD;
        this.A0G = o2c;
        this.A07 = ouv;
        this.A05 = nrE;
        this.A0J = r13;
        this.A0C = 19E.A02(new AnonymousClass19G((C262204Co) null).plus(r13));
        C71767OqT oqT = new C71767OqT(this);
        this.A0D = oqT;
        this.A08 = new OW7(audioManager, ouv, oqT);
        this.A04 = AnonymousClass7TF.A0D();
        boolean A062 = 182.A06(0Tu.A05, ((NE0) this.A05).A00, 36323006573718255L);
        Context context2 = this.A02;
        if (A062) {
            oqQ = new C71765OqR(context2, this.A07);
        } else {
            oqQ = new C71764OqQ(context2, this.A03, this.A07, this.A0C);
        }
        this.A06 = oqQ;
        this.A0A = new CopyOnWriteArraySet();
        this.A0H = new ReentrantLock();
    }

    public final synchronized void A04() {
        OUV ouv = this.A07;
        ouv.A00("Calling Stop on the Main thread", new Object[0]);
        ouv.A00("MediaPlayer stopping", new Object[0]);
        this.A08.A02();
        C74509Pw4 pw4 = this.A06;
        pw4.release();
        pw4.reset();
        pw4.EyJ();
        this.A09.clear();
    }

    public final synchronized void A05(C70828ONa oNa, boolean z) {
        0qQ.A0B(oNa, 0);
        String A002 = A00(oNa, this);
        if (A002 != null) {
            this.A07.A00("Request play %s RtcTone", A002);
        }
        if (0qQ.A0K(Looper.myLooper(), Looper.getMainLooper())) {
            if (z) {
                this.A09.clear();
            }
            if (oNa.A04) {
                this.A07.A00("Start Tone Looping on Main Thread", new Object[0]);
                A02(this);
                C74509Pw4 pw4 = this.A06;
                pw4.ASd();
                pw4.Ech(true);
                pw4.EeL(this.A0B);
            } else {
                C62320sa r3 = this.A0K;
                this.A07.A00("Start Tone on Main Thread", new Object[0]);
                A02(this);
                C74509Pw4 pw42 = this.A06;
                pw42.ASd();
                pw42.EeL(r3);
            }
            A01(oNa, this);
        } else {
            throw AnonymousClass7TE.A0z("Must be ran on the UI thread!");
        }
    }

    static {
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setUsage(6);
        builder.setContentType(4);
        A0M = C66583MXo.A0G(builder);
    }

    public static final String A00(C70828ONa oNa, C71125OdK odK) {
        String lastPathSegment = oNa.A00.getLastPathSegment();
        if (lastPathSegment == null) {
            odK.A07.A00("Resource name for tone could not be found.", new Object[0]);
        }
        return lastPathSegment;
    }

    public static final void A01(C70828ONa oNa, C71125OdK odK) {
        C74509Pw4 pw4 = odK.A06;
        pw4.ASd();
        pw4.EnH();
        pw4.EeN(odK.A0L);
        float f = oNa.A01;
        if (f != -1.0f) {
            pw4.Eqq(f);
        }
        String A002 = A00(oNa, odK);
        if (A002 != null) {
            try {
                odK.A07.A00("Setting up MediaPlayer for tone: %s at volume: %.2f", A002, Float.valueOf(f));
            } catch (Exception unused) {
                if (A002 != null) {
                    Arrays.copyOf(new Object[]{A002}, 1);
                }
                odK.A04();
                return;
            }
        }
        odK.A00 = oNa;
        pw4.Eld(oNa, odK.A0B, new C73912Pln(odK, 15));
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [X.9uV, java.lang.Object] */
    public static final void A02(C71125OdK odK) {
        OUV ouv = odK.A07;
        ouv.A00("Preparing Media Player for tone", new Object[0]);
        ouv.A00("MediaPlayer stopping", new Object[0]);
        OW7 ow7 = odK.A08;
        ow7.A02();
        C74509Pw4 pw4 = odK.A06;
        pw4.reset();
        pw4.EyJ();
        if (ow7.A01 == null && ow7.A00 == null) {
            ow7.A05.A00("requesting audio focus for tones", new Object[0]);
            SparseIntArray sparseIntArray = AudioAttributesCompat.A01;
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setUsage(2);
            builder.setContentType(1);
            AudioAttributesCompat A0G2 = C66583MXo.A0G(builder);
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = ow7.A02;
            ? obj = new Object();
            obj.A03 = C39894ADw.A05;
            obj.A00 = 2;
            obj.A01(onAudioFocusChangeListener);
            obj.A03 = A0G2;
            C39894ADw A002 = obj.A00();
            OW7.A00(A002, ow7);
            ow7.A00 = A002;
        } else {
            ow7.A05.A00("ignoring request for audio focus for tones", new Object[0]);
        }
        ouv.A00("request audio focus on the Main thread", new Object[0]);
        pw4.CNA();
    }

    public static final void A03(C71125OdK odK) {
        int i;
        OUV ouv = odK.A07;
        AudioManager audioManager = odK.A03;
        int size = audioManager.getActiveRecordingConfigurations().size();
        List<AudioRecordingConfiguration> activeRecordingConfigurations = audioManager.getActiveRecordingConfigurations();
        0qQ.A07(activeRecordingConfigurations);
        boolean z = false;
        if (!(activeRecordingConfigurations instanceof Collection) || !activeRecordingConfigurations.isEmpty()) {
            i = 0;
            for (AudioRecordingConfiguration isClientSilenced : activeRecordingConfigurations) {
                if (isClientSilenced.isClientSilenced() && (i = i + 1) < 0) {
                    0sr.A1S();
                    throw AnonymousClass00P.createAndThrow();
                }
            }
        } else {
            i = 0;
        }
        ouv.A00(002.A02(size, i, "updateIsAudioDisabledBySystem - size: ", ", numIsClientSilenced: "), new Object[0]);
        List<AudioRecordingConfiguration> activeRecordingConfigurations2 = audioManager.getActiveRecordingConfigurations();
        0qQ.A07(activeRecordingConfigurations2);
        if (!(activeRecordingConfigurations2 instanceof Collection) || !activeRecordingConfigurations2.isEmpty()) {
            Iterator<AudioRecordingConfiguration> it = activeRecordingConfigurations2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AudioRecordingConfiguration next = it.next();
                if (next.isClientSilenced() || !(next.getClientAudioSource() == 7 || next.getClientAudioSource() == 6)) {
                }
            }
            z = true;
        }
        boolean z2 = !z;
        boolean z3 = odK.A01;
        odK.A01 = z2;
        if (z3 != z2) {
            odK.A04.postDelayed(new C73171PY6(odK, z2), 500);
        }
    }
}
