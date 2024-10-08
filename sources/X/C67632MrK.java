package X;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telecom.CallAudioState;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.Collection;

/* renamed from: X.MrK  reason: case insensitive filesystem */
public final class C67632MrK extends BroadcastReceiver {
    public final /* synthetic */ OOE A00;

    public C67632MrK(OOE ooe) {
        this.A00 = ooe;
    }

    public final void onReceive(Context context, Intent intent) {
        C69377NkH nkH;
        CallAudioState callAudioState;
        Collection<BluetoothDevice> supportedBluetoothDevices;
        C69377NkH nkH2;
        OKC okc;
        C69377NkH nkH3;
        int A03 = C66580MXl.A03(this, context, intent, 898106240);
        AnonymousClass7TF.A1H(context, intent);
        boolean z = false;
        boolean A1R = AnonymousClass7TF.A1R(intent.getIntExtra(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, 0));
        if (intent.getIntExtra("microphone", 0) > 0) {
            z = true;
        }
        String stringExtra = intent.getStringExtra(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        OOE ooe = this.A00;
        if (ooe instanceof NDz) {
            NDz nDz = (NDz) ooe;
            nDz.A05.A00("onHeadsetPlugged, isHeadsetAttached=%b", Boolean.valueOf(A1R));
            C71762OqO oqO = nDz.audioManagerQplLogger;
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("is_headset_attached: ");
            A1A.append(A1R);
            A1A.append(", with_microphone: ");
            A1A.append(z);
            A1A.append(", headset_type: ");
            oqO.CmO("on_headset_plugged", AnonymousClass7TF.A0l(stringExtra, A1A));
            nDz.aomIsHeadsetAttached = A1R;
            if (A1R) {
                nDz.aomShouldSpeakerOnHeadsetUnplug = nDz.A0D;
            } else {
                if (nDz.A09.A05.A05()) {
                    nkH3 = C69377NkH.BLUETOOTH;
                } else if (nDz.aomShouldSpeakerOnHeadsetUnplug || nDz.aomDisableEarpieceMode) {
                    nkH3 = C69377NkH.SPEAKERPHONE;
                }
                nDz.A08(nkH3);
                nkH2 = nDz.aomCurrentAudioOutput;
                if (nkH2 == C69377NkH.EARPIECE && nDz.aomIsHeadsetAttached) {
                    nkH2 = C69377NkH.HEADSET;
                }
                okc = nDz.A08;
            }
            nkH3 = C69377NkH.EARPIECE;
            nDz.A08(nkH3);
            nkH2 = nDz.aomCurrentAudioOutput;
            nkH2 = C69377NkH.HEADSET;
            okc = nDz.A08;
        } else {
            C68373NDy nDy = (C68373NDy) ooe;
            OUV ouv = nDy.A05;
            Boolean valueOf = Boolean.valueOf(A1R);
            ouv.A00("onHeadsetPlugged, isHeadsetAttached=%b", valueOf);
            nDy.audioManagerQplLogger.CmO("on_headset_plugged", StringFormatUtil.formatStrLocaleSafe("is_headset_attached: %b, with_microphone: %b, headset_type: %s", valueOf, Boolean.valueOf(z), stringExtra));
            nDy.aomIsHeadsetAttached = A1R;
            if (A1R) {
                nDy.aomShouldSpeakerOnHeadsetUnplug = nDy.A0B();
                nkH = C69377NkH.HEADSET;
            } else {
                C67665Mrv A01 = 1XD.A01(nDy.A05);
                if (A01 != null && (callAudioState = A01.getCallAudioState()) != null && (supportedBluetoothDevices = callAudioState.getSupportedBluetoothDevices()) != null && (!supportedBluetoothDevices.isEmpty())) {
                    nkH = C69377NkH.BLUETOOTH;
                } else if (nDy.aomShouldSpeakerOnHeadsetUnplug || nDy.aomDisableEarpieceMode) {
                    nkH = C69377NkH.SPEAKERPHONE;
                } else {
                    nkH = C69377NkH.EARPIECE;
                }
            }
            nDy.A08(nkH);
            C69377NkH nkH4 = nDy.aomCurrentAudioOutput;
            if (nDy.A0A() && A1R) {
                nkH4 = C69377NkH.HEADSET;
            }
            okc = nDy.A03;
        }
        okc.A00(nkH2);
        AnonymousClass0fD.A0E(-914884698, A03, intent);
    }
}
