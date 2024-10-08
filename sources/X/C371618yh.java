package X;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.services.avatars.AvatarsDataProviderConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.services.avatars.AvatarsDataProviderDelegateBridge;
import com.facebook.cameracore.mediapipeline.services.avatars.AvatarsNativeInputDelegate;
import com.facebook.cameracore.mediapipeline.services.cameracontrol.CameraControlServiceConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.services.camerashare.CameraShareServiceConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.services.captureevent.CaptureEventServiceConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.services.externalasset.ExternalAssetProviderConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceConfiguration;
import com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.services.haptic.HapticServiceConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.services.instruction.InstructionServiceConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.services.locale.LocaleServiceConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.services.memoryinfo.MemoryInfoServiceConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.services.music.MusicServiceConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.services.touch.implementation.TouchGesturesDataProviderConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.services.uicontrol.UIControlServiceConfigurationHybrid;
import com.facebook.cameracore.mediapipeline.services.voiceinteraction.VoiceInteractionServiceConfigurationHybrid;

/* renamed from: X.8yh  reason: invalid class name and case insensitive filesystem */
public abstract class C371618yh {
    public final ServiceConfiguration A00() {
        int i;
        AvatarsDataProviderDelegateBridge avatarsDataProviderDelegateBridge;
        if (this instanceof C371948zP) {
            return new VoiceInteractionServiceConfigurationHybrid((C371948zP) this);
        }
        if (this instanceof C371608yg) {
            return new UIControlServiceConfigurationHybrid((C371608yg) this);
        }
        if (this instanceof C372008zW) {
            return new TouchGesturesDataProviderConfigurationHybrid((C372008zW) this);
        }
        if (this instanceof C371898zJ) {
            return new MemoryInfoServiceConfigurationHybrid((C371898zJ) this);
        }
        if (this instanceof C371888zI) {
            return new LocaleServiceConfigurationHybrid((C371888zI) this);
        }
        if (this instanceof C371728yy) {
            return new InstructionServiceConfigurationHybrid((C371728yy) this);
        }
        if (this instanceof C371918zM) {
            return new HapticServiceConfigurationHybrid((C371918zM) this);
        }
        if (this instanceof GalleryPickerServiceConfiguration) {
            return new GalleryPickerServiceConfigurationHybrid((GalleryPickerServiceConfiguration) this);
        }
        if (this instanceof C371828zA) {
            return new ExternalAssetProviderConfigurationHybrid((C371828zA) this);
        }
        if (this instanceof C371678yq) {
            return new CaptureEventServiceConfigurationHybrid((C371678yq) this);
        }
        if (this instanceof C371668yo) {
            return new CameraControlServiceConfigurationHybrid((C371668yo) this);
        }
        if (this instanceof C371908zL) {
            return new MusicServiceConfigurationHybrid((C371908zL) this);
        }
        if (this instanceof C380899ah) {
            return new CameraShareServiceConfigurationHybrid((C380899ah) this);
        }
        if (!(this instanceof C380949am)) {
            return null;
        }
        C380949am r5 = (C380949am) this;
        AvatarsDataProviderConfigurationHybrid avatarsDataProviderConfigurationHybrid = AvatarsDataProviderConfigurationHybrid.$redex_init_class;
        String str = r5.A04;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String str3 = r5.A03;
        if (str3 != null) {
            str2 = str3;
        }
        switch (r5.A02.intValue()) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            default:
                i = 0;
                break;
        }
        C22559YAv yAv = r5.A00;
        if (yAv != null) {
            avatarsDataProviderDelegateBridge = new AvatarsDataProviderDelegateBridge(yAv);
        } else {
            avatarsDataProviderDelegateBridge = null;
        }
        AvatarsNativeInputDelegate avatarsNativeInputDelegate = r5.A01;
        if (avatarsNativeInputDelegate == null) {
            avatarsNativeInputDelegate = new AvatarsNativeInputDelegate();
        }
        return new ServiceConfiguration(AvatarsDataProviderConfigurationHybrid.initHybrid(str, str2, i, avatarsDataProviderDelegateBridge, avatarsNativeInputDelegate));
    }
}
