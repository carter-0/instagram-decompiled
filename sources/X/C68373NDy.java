package X;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothManager;
import android.bluetooth.BluetoothProfile;
import android.telecom.CallAudioState;
import java.util.Collection;
import java.util.List;

/* renamed from: X.NDy  reason: case insensitive filesystem */
public final class C68373NDy extends OOE {
    public BluetoothHeadset A00;
    public List A01 = AnonymousClass7TE.A1C();
    public final BluetoothProfile.ServiceListener A02;
    public final OKC A03;
    public final OZz A04;
    public final 1XD A05;
    public final AnonymousClass0eM A06;

    /* JADX WARNING: type inference failed for: r5v0, types: [X.NrE, java.lang.Object] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C68373NDy(android.content.Context r12, android.media.AudioManager r13, X.OKC r14, X.OZz r15, X.C74437Pus r16, X.OUV r17, X.C70843ONv r18, X.O27 r19, X.1XD r20, java.util.concurrent.ExecutorService r21) {
        /*
            r11 = this;
            X.NrE r5 = new X.NrE
            r5.<init>()
            r0 = 4
            r4 = r13
            X.0qQ.A0B(r13, r0)
            r2 = r11
            r3 = r12
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r11.A04 = r15
            r11.A03 = r14
            r0 = r20
            r11.A05 = r0
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r11.A01 = r0
            r1 = 10
            X.Pln r0 = new X.Pln
            r0.<init>(r12, r1)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r11.A06 = r0
            X.Oel r0 = new X.Oel
            r0.<init>(r11)
            r11.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68373NDy.<init>(android.content.Context, android.media.AudioManager, X.OKC, X.OZz, X.Pus, X.OUV, X.ONv, X.O27, X.1XD, java.util.concurrent.ExecutorService):void");
    }

    public final void A0C() {
        this.A05.A00("updateAudioOutput to %s", this.aomCurrentAudioOutput);
        this.A03.A00(this.aomCurrentAudioOutput);
    }

    public final void A02() {
        super.A02();
        this.A05.A00.remove(this);
    }

    public final void A03() {
        C67665Mrv A012;
        Collection<BluetoothDevice> supportedBluetoothDevices;
        BluetoothAdapter adapter;
        super.A03();
        1XD r4 = this.A05;
        r4.A00.add(this);
        BluetoothManager bluetoothManager = (BluetoothManager) this.A06.getValue();
        if (!(bluetoothManager == null || (adapter = bluetoothManager.getAdapter()) == null)) {
            adapter.getProfileProxy(this.A01, this.A02, 1);
        }
        if (this.aomDisableEarpieceMode && !this.aomIsHeadsetAttached && (A012 = 1XD.A01(r4)) != null) {
            CallAudioState callAudioState = A012.getCallAudioState();
            if (!(callAudioState == null || (supportedBluetoothDevices = callAudioState.getSupportedBluetoothDevices()) == null)) {
                00k.A0A(supportedBluetoothDevices);
            }
            A012.setAudioRoute(8);
        }
        C69377NkH A013 = A01();
        0qQ.A0B(A013, 0);
        this.aomCurrentAudioOutput = A013;
        A0C();
        A07();
        A06();
        A05();
    }

    public final void A04() {
        super.A04();
        C69377NkH nkH = C69377NkH.EARPIECE;
        0qQ.A0B(nkH, 0);
        this.aomCurrentAudioOutput = nkH;
    }
}
