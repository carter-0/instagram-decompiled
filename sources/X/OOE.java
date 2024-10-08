package X;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceCallback;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import android.telecom.CallAudioState;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;

public abstract class OOE {
    public BroadcastReceiver A00;
    public final Context A01;
    public final AudioManager A02;
    public final 04u A03 = new 04u(0);
    public final C69729NrE A04;
    public final OUV A05;
    public final C70843ONv A06;
    public final O27 A07;
    public final C70406O5j A08 = new C70406O5j(this);
    public final OHF A09;
    public final ExecutorService A0A;
    public C69268NiU aomAudioModeState;
    public volatile C69377NkH aomCurrentAudioOutput;
    public boolean aomDisableEarpieceMode;
    public volatile boolean aomIsHeadsetAttached;
    public int aomSavedAudioMode;
    public volatile boolean aomShouldSpeakerOnHeadsetUnplug;
    public final C71762OqO audioManagerQplLogger;
    public final C71064Oaj audioRecordMonitor;

    public void A04() {
        this.aomShouldSpeakerOnHeadsetUnplug = false;
        this.aomIsHeadsetAttached = false;
        this.aomAudioModeState = C69268NiU.UNKNOWN;
        OHF ohf = this.A09;
        C67637MrQ mrQ = ohf.A00;
        if (mrQ != null) {
            ohf.A03.unregisterContentObserver(mrQ);
        }
        ohf.A00 = null;
        ohf.A02 = null;
        C70843ONv oNv = this.A06;
        AudioDeviceCallback audioDeviceCallback = oNv.A00;
        if (audioDeviceCallback != null) {
            this.A02.unregisterAudioDeviceCallback(audioDeviceCallback);
        }
        oNv.A00 = null;
    }

    public final int A00() {
        int ordinal = this.aomAudioModeState.ordinal();
        if (ordinal == 1) {
            return 1;
        }
        if (ordinal == 2 || ordinal == 0) {
            return 3;
        }
        throw new IllegalStateException();
    }

    public final C69377NkH A01() {
        CallAudioState callAudioState;
        int route;
        if (this instanceof NDz) {
            return this.aomCurrentAudioOutput;
        }
        C67665Mrv A012 = 1XD.A01(((C68373NDy) this).A05);
        if (!(A012 == null || (callAudioState = A012.getCallAudioState()) == null || (route = callAudioState.getRoute()) == 1)) {
            if (route == 2) {
                return C69377NkH.BLUETOOTH;
            }
            if (route == 4) {
                return C69377NkH.HEADSET;
            }
            if (route != 5 && route == 8) {
                return C69377NkH.SPEAKERPHONE;
            }
        }
        return C69377NkH.EARPIECE;
    }

    public void A02() {
        C71064Oaj oaj = this.audioRecordMonitor;
        if (oaj.A04.A00 != null) {
            C71064Oaj.A00(oaj, "system_info_on_call_end");
            oaj.A03.removeCallbacks(oaj.A05);
            AudioManager.AudioRecordingCallback audioRecordingCallback = oaj.A00;
            if (audioRecordingCallback != null) {
                oaj.A02.unregisterAudioRecordingCallback(audioRecordingCallback);
            }
        }
        this.audioManagerQplLogger.AVq();
        C69729NrE nrE = this.A04;
        if (nrE instanceof NE0) {
            if (182.A06(0Tu.A05, ((NE0) nrE).A00, 36316173281136651L)) {
                OHF ohf = this.A09;
                C67637MrQ mrQ = ohf.A00;
                if (mrQ != null) {
                    ohf.A03.unregisterContentObserver(mrQ);
                }
                ohf.A00 = null;
                ohf.A02 = null;
            }
        }
        C70843ONv oNv = this.A06;
        AudioDeviceCallback audioDeviceCallback = oNv.A00;
        if (audioDeviceCallback != null) {
            this.A02.unregisterAudioDeviceCallback(audioDeviceCallback);
        }
        oNv.A00 = null;
    }

    public void A03() {
        this.audioManagerQplLogger.AW1();
        this.aomDisableEarpieceMode = false;
        this.aomIsHeadsetAttached = this.A02.isWiredHeadsetOn();
    }

    public final void A05() {
        Iterator it = AnonymousClass7TE.A1D(this.A03).iterator();
        while (it.hasNext()) {
            ((OK2) it.next()).A00();
        }
    }

    public final void A06() {
        IntentFilter intentFilter = new IntentFilter(AnonymousClass000.A00(4453));
        C67632MrK mrK = new C67632MrK(this);
        this.A00 = mrK;
        0DH.A00(mrK, this.A01, intentFilter);
        C71064Oaj oaj = this.audioRecordMonitor;
        if (oaj.A04.A00 != null) {
            C71064Oaj.A00(oaj, "system_info_on_init_call");
            C71064Oaj.A02(oaj, "recording_configs_on_init", (List) null);
            AudioManager.AudioRecordingCallback audioRecordingCallback = oaj.A00;
            if (audioRecordingCallback != null) {
                oaj.A02.registerAudioRecordingCallback(audioRecordingCallback, (Handler) null);
            }
        }
    }

    public final void A07() {
        OHF ohf = this.A09;
        C70406O5j o5j = this.A08;
        0qQ.A0B(o5j, 0);
        if (ohf.A00 != null) {
            0KC.A0P("VolumeChangeAnnouncer", "Observer already registered", Arrays.copyOf(new Object[0], 0));
            return;
        }
        C67637MrQ mrQ = new C67637MrQ(AnonymousClass7TF.A0D(), o5j, ohf);
        ohf.A03.registerContentObserver(Settings.System.CONTENT_URI, true, mrQ);
        ohf.A00 = mrQ;
    }

    public final void A08(C69377NkH nkH) {
        BluetoothDevice bluetoothDevice;
        CallAudioState callAudioState;
        Collection<BluetoothDevice> supportedBluetoothDevices;
        int i;
        if (this instanceof NDz) {
            NDz nDz = (NDz) this;
            0qQ.A0B(nkH, 0);
            nDz.A05.A00("changeAudio to %s", nkH);
            nDz.audioManagerQplLogger.CmO("change_audio", String.valueOf(nkH));
            PUJ.A00(nDz, nDz.A00(), false);
            int ordinal = nkH.ordinal();
            if (ordinal != 2) {
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        C71017OYs oYs = nDz.A09;
                        int i2 = oYs.A05.A00;
                        if (i2 == 1 || i2 == 2) {
                            C71017OYs.A01(oYs, true);
                        }
                        nDz.A06.A02(true);
                        nDz.A0D = true;
                    } else if (ordinal != 3) {
                        throw AnonymousClass7TE.A1K();
                    }
                } else if (!nDz.aomIsHeadsetAttached && nDz.aomDisableEarpieceMode) {
                    return;
                }
                C71017OYs oYs2 = nDz.A09;
                int i3 = oYs2.A05.A00;
                if (i3 == 1 || i3 == 2) {
                    C71017OYs.A01(oYs2, true);
                }
                nDz.A06.A02(false);
                nDz.A0D = false;
            } else {
                C71017OYs oYs3 = nDz.A09;
                OZz oZz = oYs3.A05;
                if (!(!oZz.A05() || (i = oZz.A00) == 1 || i == 2)) {
                    C71017OYs.A00(oYs3);
                }
            }
            Thread currentThread = Thread.currentThread();
            Handler handler = nDz.A07;
            if (0qQ.A0K(currentThread, handler.getLooper().getThread())) {
                nDz.A0D();
            } else {
                handler.post(new PUZ(nDz));
            }
        } else {
            C68373NDy nDy = (C68373NDy) this;
            0qQ.A0B(nkH, 0);
            nDy.A05.A00("changeAudio to %s", nkH);
            nDy.audioManagerQplLogger.CmO("change_audio", String.valueOf(nkH));
            1XD r4 = nDy.A05;
            int ordinal2 = nkH.ordinal();
            int i4 = 4;
            if (ordinal2 == 2) {
                i4 = 2;
            } else if (ordinal2 == 0) {
                i4 = 1;
            } else if (ordinal2 == 1) {
                i4 = 8;
            } else if (ordinal2 != 3) {
                throw AnonymousClass7TE.A1K();
            }
            C67665Mrv A012 = 1XD.A01(r4);
            if (A012 == null || (callAudioState = A012.getCallAudioState()) == null || (supportedBluetoothDevices = callAudioState.getSupportedBluetoothDevices()) == null) {
                bluetoothDevice = null;
            } else {
                bluetoothDevice = (BluetoothDevice) 00k.A0A(supportedBluetoothDevices);
            }
            if (i4 == 2 && bluetoothDevice != null) {
                A012.requestBluetoothAudio(bluetoothDevice);
            } else if (A012 != null) {
                A012.setAudioRoute(i4);
            }
        }
    }

    public final void A09(boolean z) {
        C69377NkH nkH;
        this.A05.A00("setSpeakerphone: %s", Boolean.valueOf(z));
        this.audioManagerQplLogger.CmO("set_speakerphone", String.valueOf(z));
        if (z) {
            nkH = C69377NkH.SPEAKERPHONE;
        } else if (this.aomIsHeadsetAttached) {
            nkH = C69377NkH.HEADSET;
        } else {
            nkH = C69377NkH.EARPIECE;
        }
        A08(nkH);
        this.aomShouldSpeakerOnHeadsetUnplug = z;
    }

    public final boolean A0A() {
        CallAudioState callAudioState;
        if (this instanceof NDz) {
            return AnonymousClass7TF.A1W(this.aomCurrentAudioOutput, C69377NkH.EARPIECE);
        }
        C67665Mrv A012 = 1XD.A01(((C68373NDy) this).A05);
        if (A012 == null || (callAudioState = A012.getCallAudioState()) == null || callAudioState.getRoute() == 1) {
            return true;
        }
        return false;
    }

    public final boolean A0B() {
        CallAudioState callAudioState;
        if (this instanceof NDz) {
            return AnonymousClass7TF.A1W(this.aomCurrentAudioOutput, C69377NkH.SPEAKERPHONE);
        }
        C67665Mrv A012 = 1XD.A01(((C68373NDy) this).A05);
        if (A012 == null || (callAudioState = A012.getCallAudioState()) == null || callAudioState.getRoute() != 8) {
            return false;
        }
        return true;
    }

    public OOE(Context context, AudioManager audioManager, C69729NrE nrE, C74437Pus pus, OUV ouv, C70843ONv oNv, O27 o27, ExecutorService executorService) {
        this.A01 = context;
        this.A07 = o27;
        this.A02 = audioManager;
        OUV ouv2 = ouv;
        this.A05 = ouv2;
        ExecutorService executorService2 = executorService;
        this.A0A = executorService2;
        C69729NrE nrE2 = nrE;
        this.A04 = nrE2;
        this.A06 = oNv;
        C71762OqO oqO = new C71762OqO(pus);
        this.audioManagerQplLogger = oqO;
        this.A09 = new OHF(context, audioManager, nrE2, ouv2, executorService2);
        this.audioRecordMonitor = new C71064Oaj(context, audioManager, oqO, ouv2, executorService2);
        this.aomSavedAudioMode = -2;
        this.aomCurrentAudioOutput = C69377NkH.EARPIECE;
        this.aomAudioModeState = C69268NiU.UNKNOWN;
    }
}
