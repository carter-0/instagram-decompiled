package X;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import com.facebook.rsys.audio.gen.AudioOutputRoute;
import java.util.List;
import org.webrtc.MediaStreamTrack;

public final class OK2 {
    public final /* synthetic */ OU3 A00;

    public OK2(OU3 ou3) {
        this.A00 = ou3;
    }

    public final void A00() {
        C69132NfD nfD;
        AudioOutputRoute audioOutputRoute;
        String[] strArr;
        long currentTimeMillis;
        BluetoothHeadset bluetoothHeadset;
        List<BluetoothDevice> connectedDevices;
        BluetoothDevice bluetoothDevice;
        AudioDeviceInfo audioDeviceInfo;
        OU3 ou3 = this.A00;
        OOE ooe = ou3.A09.A09.A00;
        if (ooe.A01() == C69377NkH.BLUETOOTH) {
            int i = Build.VERSION.SDK_INT;
            String str = null;
            Context context = ou3.A07;
            if (i > 30) {
                Object systemService = context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                0qQ.A0C(systemService, AnonymousClass000.A00(4));
                AudioDeviceInfo[] devices = ((AudioManager) systemService).getDevices(2);
                0qQ.A07(devices);
                int length = devices.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    audioDeviceInfo = devices[i2];
                    if (audioDeviceInfo.getType() == 7 || audioDeviceInfo.getType() == 8) {
                        CharSequence productName = audioDeviceInfo.getProductName();
                    } else {
                        i2++;
                    }
                }
                CharSequence productName2 = audioDeviceInfo.getProductName();
                if (productName2 != null) {
                    str = productName2.toString();
                }
            } else if (!C69733NrI.A00() || context.checkSelfPermission("android.permission.BLUETOOTH_CONNECT") != -1) {
                if (ooe instanceof NDz) {
                    bluetoothHeadset = ((NDz) ooe).A09.A05.A01;
                } else {
                    bluetoothHeadset = ((C68373NDy) ooe).A00;
                }
                if (bluetoothHeadset != null && (connectedDevices = bluetoothHeadset.getConnectedDevices()) != null && (bluetoothDevice = (BluetoothDevice) 00k.A0J(connectedDevices)) != null) {
                    str = bluetoothDevice.getName();
                }
            }
            nfD = ou3.A0W.A00.A05;
            if (!nfD.A04) {
                nfD.A04 = true;
                C69134NfF nfF = nfD.A09;
                Integer num = AnonymousClass05K.A0G;
                if (str == null) {
                    currentTimeMillis = System.currentTimeMillis();
                    strArr = new String[0];
                } else {
                    strArr = new String[]{str};
                    currentTimeMillis = System.currentTimeMillis();
                }
                nfF.A02(new N9C(num, AnonymousClass05K.A00, strArr, currentTimeMillis, false));
            }
        } else {
            nfD = ou3.A0W.A00.A05;
            nfD.A04 = false;
        }
        int ordinal = ooe.A01().ordinal();
        if (ordinal == 2) {
            audioOutputRoute = AudioOutputRoute.BLUETOOTH;
        } else if (ordinal == 0) {
            audioOutputRoute = AudioOutputRoute.EARPIECE;
        } else if (ordinal != 3) {
            audioOutputRoute = AudioOutputRoute.SPEAKER;
        } else {
            audioOutputRoute = AudioOutputRoute.HEADSET;
        }
        0qQ.A0A(audioOutputRoute);
        ooe.A00();
        0qQ.A0B(audioOutputRoute, 0);
        nfD.A07 = audioOutputRoute.equals(AudioOutputRoute.SPEAKER);
        if (audioOutputRoute.equals(AudioOutputRoute.EARPIECE)) {
            C69132NfD.A00(nfD);
        } else {
            ((C70811OMg) nfD.A0B.getValue()).A01(false);
        }
        05G r1 = nfD.A0C;
        C72833PLv pLv = new C72833PLv(audioOutputRoute);
        0qQ.A0B(r1, 0);
        r1.FIA(pLv);
    }
}
