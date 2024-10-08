package X;

import android.content.Context;
import android.media.MediaFormat;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.SHu  reason: case insensitive filesystem */
public final class C11260SHu {
    public static final SAK A0E = new Object();
    public long A00;
    public QDV A01;
    public File A02;
    public Set A03;
    public final Context A04;
    public final C12329Srb A05;
    public final C12326SrY A06;
    public final C12338Srk A07;
    public final C12339Srl A08;
    public final C12350Srw A09;
    public final File A0A;
    public final ExecutorService A0B;
    public final C12329Srb A0C;
    public final UserSession A0D;

    /* JADX WARNING: type inference failed for: r7v0, types: [X.Tgv, X.Srl, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v2, types: [X.Q4U, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v5, types: [X.SHv, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v22, types: [java.lang.Object, X.TdI] */
    public final void A00() {
        Q1N q1n;
        Context context = this.A04;
        File file = this.A0A;
        ExecutorService executorService = this.A0B;
        0qQ.A06(executorService);
        C12329Srb srb = this.A0C;
        AnonymousClass7TF.A1C(file, 1, srb);
        C7235Q0h q0h = C9955RkA.A00;
        ? obj = new Object();
        obj.A00 = q0h;
        C12350Srw srw = new C12350Srw(q0h);
        C12326SrY srY = new C12326SrY();
        C13853TiW AL8 = new Object().AL8();
        AL8.ETt(file.getAbsolutePath());
        ArrayList A032 = Q1M.A03(AL8, "audio/");
        if (A032.isEmpty()) {
            q1n = null;
        } else {
            q1n = (Q1N) A032.get(0);
        }
        if (q1n != null) {
            MediaFormat mediaFormat = q1n.A01;
            boolean containsKey = mediaFormat.containsKey("sample-rate");
            boolean containsKey2 = mediaFormat.containsKey(TraceFieldType.Bitrate);
            boolean containsKey3 = mediaFormat.containsKey("channel-count");
            if (containsKey && containsKey2 && containsKey3) {
                SQv sQv = new SQv();
                sQv.A0D = SAK.A00(context, File.createTempFile("karaoke_bleep", (String) null));
                SF8 sf8 = new SF8();
                sf8.A02 = mediaFormat.getInteger("sample-rate");
                sf8.A00 = mediaFormat.getInteger(TraceFieldType.Bitrate);
                sf8.A01 = mediaFormat.getInteger("channel-count");
                sQv.A0C = new SFQ(sf8);
                sQv.A07 = srb;
                sQv.A0I = true;
                ? obj2 = new Object();
                obj2.A0C = new C10862RzN(sQv);
                obj2.A00 = context;
                obj2.A05 = new STP();
                obj2.A07 = srY;
                obj2.A0E = executorService;
                obj2.A0A = srw;
                obj2.A08 = new Object();
                obj2.A09 = obj;
                SRj.A00(obj2.A01());
            }
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("mediaFormatInvalid - hasSampleRate: ");
            A1A.append(containsKey);
            A1A.append(", hasBitrate: ");
            A1A.append(containsKey2);
            A1A.append(", hasChannelCount: ");
            A1A.append(containsKey3);
            0kD.A05("KaraokeBleepAudioConcatInteractor_transcodeBleepAudio", A1A.toString(), (Throwable) null);
            return;
        }
        0kD.A05("{KaraokeBleepAudioConcatInteractor}_transcodeBleepAudio", "mediaFormatIsNull", (Throwable) null);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.Srl, java.lang.Object] */
    public C11260SHu(Context context, UserSession userSession, File file, 0sl r6) {
        this.A04 = context;
        this.A0A = file;
        this.A0D = userSession;
        this.A03 = r6 == null ? 0sl.A00 : r6;
        this.A0B = Executors.newCachedThreadPool();
        this.A07 = new C12338Srk();
        C7235Q0h q0h = C9955RkA.A00;
        ? obj = new Object();
        obj.A00 = q0h;
        this.A08 = obj;
        this.A09 = new C12350Srw(q0h);
        this.A06 = new C12326SrY();
        this.A05 = new C12329Srb(this, 1);
        this.A0C = new C12329Srb(this, 2);
    }
}
