package X;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.os.Handler;
import android.util.SparseIntArray;
import androidx.media.AudioAttributesCompat;
import com.facebook.proxygen.LigerSamplePolicy;
import java.util.Arrays;

/* renamed from: X.PY3  reason: case insensitive filesystem */
public final class C73168PY3 implements Runnable {
    public final /* synthetic */ NCR A00;
    public final /* synthetic */ boolean A01;

    public C73168PY3(NCR ncr, boolean z) {
        this.A00 = ncr;
        this.A01 = z;
    }

    /* JADX WARNING: type inference failed for: r1v12, types: [X.9uV, java.lang.Object] */
    public final void run() {
        BluetoothManager bluetoothManager;
        BluetoothAdapter adapter;
        NCR ncr = this.A00;
        boolean z = ncr.A04;
        boolean z2 = this.A01;
        if (z != z2) {
            ODF odf = ncr.A09;
            OOE ooe = odf.A00;
            if (z2) {
                ooe.A03();
                OW7 ow7 = odf.A02;
                ow7.A05.A00("requesting audio focus for call", new Object[0]);
                ow7.A01();
                ow7.A02();
                SparseIntArray sparseIntArray = AudioAttributesCompat.A01;
                AudioAttributes.Builder builder = new AudioAttributes.Builder();
                builder.setUsage(2);
                builder.setContentType(1);
                AudioAttributesCompat A0G = C66583MXo.A0G(builder);
                AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = ow7.A02;
                ? obj = new Object();
                obj.A03 = C39894ADw.A05;
                obj.A00 = 2;
                obj.A01(onAudioFocusChangeListener);
                obj.A03 = A0G;
                C39894ADw A002 = obj.A00();
                ow7.A01 = A002;
                if (!OW7.A00(A002, ow7)) {
                    odf.A01.A00("Failed to acquire audio focus.", new Object[0]);
                }
                C69268NiU niU = C69268NiU.IN_CALL;
                if (ooe instanceof NDz) {
                    NDz nDz = (NDz) ooe;
                    0qQ.A0B(niU, 0);
                    nDz.aomAudioModeState = niU;
                    PUJ.A00(nDz, nDz.A00(), false);
                    C71064Oaj oaj = nDz.audioRecordMonitor;
                    if (oaj.A04.A00 != null) {
                        Handler handler = oaj.A03;
                        Runnable runnable = oaj.A05;
                        handler.removeCallbacks(runnable);
                        handler.postDelayed(runnable, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
                    }
                }
            } else {
                if (ooe instanceof NDz) {
                    NDz nDz2 = (NDz) ooe;
                    nDz2.A09.A05.A02();
                    AudioManager audioManager = nDz2.A02;
                    if (false != audioManager.isMicrophoneMute()) {
                        try {
                            audioManager.setMicrophoneMute(false);
                            nDz2.audioManagerQplLogger.CmO("set_microphone_mute", String.valueOf(false));
                        } catch (SecurityException e) {
                            0KC.A0L("RtcAudioOutputManagerBase", "Exception when calling AudioManager#setMicrophoneMute", e, Arrays.copyOf(new Object[0], 0));
                        }
                    }
                    C70843ONv oNv = nDz2.A06;
                    oNv.A02(false);
                    int i = nDz2.aomSavedAudioMode;
                    if (i != -2) {
                        PUJ.A00(nDz2, i, true);
                    }
                    nDz2.A08.A00((C69377NkH) null);
                    if (nDz2.A00 != null && nDz2.A04) {
                        nDz2.A04 = false;
                        nDz2.A07.post(new C73043PUa(nDz2));
                    }
                    BroadcastReceiver broadcastReceiver = nDz2.A00;
                    if (broadcastReceiver != null) {
                        nDz2.A01.unregisterReceiver(broadcastReceiver);
                        nDz2.A00 = null;
                    }
                    oNv.A01(nDz2.A01);
                } else {
                    C68373NDy nDy = (C68373NDy) ooe;
                    AudioManager audioManager2 = nDy.A02;
                    audioManager2.setMicrophoneMute(false);
                    if (audioManager2.isSpeakerphoneOn()) {
                        nDy.A08(C69377NkH.EARPIECE);
                    }
                    nDy.A03.A00((C69377NkH) null);
                    BroadcastReceiver broadcastReceiver2 = nDy.A00;
                    if (broadcastReceiver2 != null) {
                        nDy.A01.unregisterReceiver(broadcastReceiver2);
                        nDy.A00 = null;
                    }
                    if (!(nDy.A00 == null || (bluetoothManager = (BluetoothManager) nDy.A06.getValue()) == null || (adapter = bluetoothManager.getAdapter()) == null)) {
                        adapter.closeProfileProxy(1, nDy.A00);
                    }
                }
                odf.A02.A01();
                ooe.A02();
            }
            C73167PY2 py2 = new C73167PY2(ncr, z2);
            if (ncr.A00 != null) {
                py2.run();
            } else {
                ncr.A0B.add(py2);
            }
            ncr.A04 = z2;
        }
    }
}
