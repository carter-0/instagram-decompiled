package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.android.billingclient.api.Purchase;
import com.facebook.react.modules.core.RCTNativeAppEventEmitter;
import com.instagram.model.creation.MediaCaptureConfig;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.nio.charset.Charset;
import java.util.HashMap;
import org.json.JSONException;

public final class SV1 implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public SV1(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DialogInterface.OnClickListener onClickListener;
        int i2;
        switch (this.A00) {
            case 0:
                try {
                    C7610QOs qOs = (C7610QOs) this.A02;
                    String str = qOs.A02;
                    String str2 = qOs.A04;
                    HashMap A1E = AnonymousClass7TE.A1E();
                    A1E.put("productId", str);
                    A1E.put("purchaseToken", "mockPayment");
                    A1E.put("obfuscatedProfileId", str2);
                    A1E.put("obfuscatedAccountId", str2);
                    String A0c = JTQ.A0c(A1E);
                    C11032S6k s6k = C11032S6k.A01;
                    Charset charset = AnonymousClass2RN.A05;
                    0qQ.A08(charset);
                    ((S1D) this.A01).A00.A0L(AnonymousClass7TE.A1I(new Purchase(A0c, s6k.A02(Pxf.A1V("mockSignature", charset)))), true);
                } catch (JSONException unused) {
                    ((S1D) this.A01).A00();
                }
                dialogInterface.dismiss();
                return;
            case 1:
                dialogInterface.cancel();
                onClickListener = ((C11351SOk) this.A02).A07;
                if (onClickListener != null) {
                    i2 = -2;
                    break;
                } else {
                    return;
                }
            case 2:
                dialogInterface.dismiss();
                onClickListener = ((C11351SOk) this.A02).A09;
                if (onClickListener != null) {
                    i2 = -1;
                    break;
                } else {
                    return;
                }
            case 3:
                Context context = (Context) this.A02;
                Intent A0G = Pxe.A0G("android.settings.FINGERPRINT_ENROLL");
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && A0G.resolveActivity(packageManager) != null) {
                    0b6.A00().A04().A0G(context, A0G);
                    return;
                }
                return;
            default:
                AnonymousClass36W r3 = AnonymousClass36W.REACT_MEDIA_PICKER;
                JWU jwu = new JWU(r3);
                jwu.A05 = false;
                jwu.A09 = true;
                jwu.A0A = false;
                jwu.A0C = false;
                jwu.A0D = false;
                MediaCaptureConfig mediaCaptureConfig = new MediaCaptureConfig(jwu);
                IgReactMediaPickerNativeModule igReactMediaPickerNativeModule = (IgReactMediaPickerNativeModule) this.A01;
                igReactMediaPickerNativeModule.mIgEventBus.A01(igReactMediaPickerNativeModule.mImageSelectedEventListener, C64649Lfb.class);
                Context context2 = (Context) this.A02;
                if (igReactMediaPickerNativeModule.matches(context2, i, 2131971317)) {
                    ((RCTNativeAppEventEmitter) Pxe.A0T(igReactMediaPickerNativeModule).A02(RCTNativeAppEventEmitter.class)).emit(IgReactMediaPickerNativeModule.IG_MEDIA_PICKER_PHOTO_SELECTED, (Object) null);
                    return;
                } else if (igReactMediaPickerNativeModule.matches(context2, i, 2131971318)) {
                    igReactMediaPickerNativeModule.mCaptureFlowHelper.Exx(EXF.A0P, mediaCaptureConfig, r3);
                    return;
                } else if (igReactMediaPickerNativeModule.matches(context2, i, 2131971316)) {
                    igReactMediaPickerNativeModule.mCaptureFlowHelper.Exv(EXF.A0P, mediaCaptureConfig, r3);
                    return;
                } else {
                    return;
                }
        }
        onClickListener.onClick(dialogInterface, i2);
    }
}
