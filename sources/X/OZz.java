package X;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceCallback;
import android.media.AudioManager;
import android.os.Build;
import java.util.Arrays;
import java.util.List;

public final class OZz {
    public int A00;
    public BluetoothHeadset A01;
    public BroadcastReceiver A02;
    public AudioDeviceCallback A03;
    public boolean A04;
    public BluetoothAdapter A05;
    public final Context A06;
    public final C69729NrE A07;
    public final BluetoothProfile.ServiceListener A08;
    public final BroadcastReceiver A09 = new C67634MrN(this, 1);
    public final AudioManager A0A;
    public final C74437Pus A0B;
    public final OUV A0C;
    public final C70843ONv A0D;
    public final C262094Cc A0E;
    public final C262224Cq A0F;
    public volatile OJP A0G;

    public OZz(Context context, AudioManager audioManager, C69729NrE nrE, C74437Pus pus, OUV ouv, C262094Cc r8) {
        0qQ.A0B(audioManager, 2);
        this.A06 = context;
        this.A07 = nrE;
        this.A0E = r8;
        this.A08 = new C71172Oem(this, ouv);
        this.A0A = audioManager;
        this.A0C = ouv;
        this.A0B = new C71762OqO(pus);
        this.A0F = 19E.A02(r8);
        this.A0D = new C70843ONv(audioManager);
    }

    public static final void A00(OZz oZz, boolean z) {
        if (z) {
            try {
                AudioManager audioManager = oZz.A0A;
                audioManager.startBluetoothSco();
                audioManager.setBluetoothScoOn(true);
            } catch (NullPointerException e) {
                0KC.A0L("DefaultBluetoothManager", "AudioManager#startBluetoothSco failed", e, Arrays.copyOf(new Object[0], 0));
                oZz.A04 = false;
            }
        } else {
            AudioManager audioManager2 = oZz.A0A;
            audioManager2.setBluetoothScoOn(false);
            audioManager2.stopBluetoothSco();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A01(X.OZz r6) {
        /*
            r5 = 0
            r4 = 1
            android.media.AudioManager r1 = r6.A0A
            r0 = 2
            android.media.AudioDeviceInfo[] r0 = r1.getDevices(r0)
            X.0qQ.A07(r0)
            java.util.List r0 = java.util.Arrays.asList(r0)
            X.0qQ.A07(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x0017:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0033
            java.lang.Object r2 = r3.next()
            android.media.AudioDeviceInfo r2 = (android.media.AudioDeviceInfo) r2
            int r1 = r2.getType()
            r0 = 7
            if (r1 == r0) goto L_0x0032
            int r1 = r2.getType()
            r0 = 8
            if (r1 != r0) goto L_0x0017
        L_0x0032:
            return r4
        L_0x0033:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OZz.A01(X.OZz):boolean");
    }

    public final void A02() {
        BluetoothAdapter bluetoothAdapter;
        A04(false);
        BroadcastReceiver broadcastReceiver = this.A02;
        if (broadcastReceiver != null) {
            try {
                this.A06.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException unused) {
            }
        }
        try {
            this.A06.unregisterReceiver(this.A09);
        } catch (IllegalArgumentException unused2) {
        }
        BluetoothHeadset bluetoothHeadset = this.A01;
        if (!(bluetoothHeadset == null || (bluetoothAdapter = this.A05) == null)) {
            bluetoothAdapter.closeProfileProxy(1, bluetoothHeadset);
        }
        C70843ONv oNv = this.A0D;
        AudioDeviceCallback audioDeviceCallback = oNv.A00;
        if (audioDeviceCallback != null) {
            this.A0A.unregisterAudioDeviceCallback(audioDeviceCallback);
        }
        AudioDeviceCallback audioDeviceCallback2 = this.A03;
        if (audioDeviceCallback2 != null) {
            this.A0A.unregisterAudioDeviceCallback(audioDeviceCallback2);
        }
        oNv.A00 = null;
        this.A03 = null;
        this.A05 = null;
    }

    public final void A03(OJP ojp) {
        0qQ.A0B(ojp, 0);
        A02();
        this.A0G = ojp;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        this.A05 = defaultAdapter;
        if (defaultAdapter != null) {
            Context context = this.A06;
            defaultAdapter.getProfileProxy(context, this.A08, 1);
            if (Build.VERSION.SDK_INT < 31) {
                BroadcastReceiver broadcastReceiver = this.A02;
                if (broadcastReceiver == null) {
                    broadcastReceiver = new C67634MrN(this, 2);
                    this.A02 = broadcastReceiver;
                }
                0DH.A00(broadcastReceiver, context, new IntentFilter("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED"));
            } else {
                C70843ONv oNv = this.A0D;
                AudioManager audioManager = this.A0A;
                0qQ.A0B(audioManager, 0);
                if (oNv.A00 == null) {
                    C67653Mrg mrg = new C67653Mrg(oNv);
                    oNv.A00 = mrg;
                    audioManager.registerAudioDeviceCallback(mrg, AnonymousClass7TF.A0D());
                }
                if (this.A03 == null) {
                    C67654Mrh mrh = new C67654Mrh(this);
                    this.A03 = mrh;
                    audioManager.registerAudioDeviceCallback(mrh, AnonymousClass7TF.A0D());
                }
            }
            Intent A002 = 0DH.A00(this.A09, context, new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"));
            if (A002 != null) {
                this.A00 = A002.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1);
            }
        }
    }

    public final void A04(boolean z) {
        this.A0B.CmO("toggle_bluetooth_headset", String.valueOf(z));
        if (this.A04 != z) {
            this.A04 = z;
            if (182.A06(0Tu.A05, ((NE0) this.A07).A00, 36323006573783792L)) {
                AnonymousClass7TE.A1Z(new MG9(this, (AnonymousClass4D7) null, 0, z), this.A0F);
                return;
            }
            A00(this, z);
        }
    }

    public final boolean A05() {
        BluetoothAdapter bluetoothAdapter = this.A05;
        BluetoothHeadset bluetoothHeadset = this.A01;
        if ((!182.A06(0Tu.A05, ((NE0) this.A07).A00, 36316173281071114L) && (bluetoothAdapter == null || !bluetoothAdapter.isEnabled() || !this.A0A.isBluetoothScoAvailableOffCall())) || bluetoothHeadset == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT <= 30) {
            List<BluetoothDevice> connectedDevices = bluetoothHeadset.getConnectedDevices();
            0qQ.A07(connectedDevices);
            if (!connectedDevices.isEmpty()) {
                return true;
            }
            return false;
        } else if (A01(this)) {
            return true;
        } else {
            return false;
        }
    }
}
