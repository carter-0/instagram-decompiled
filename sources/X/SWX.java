package X;

import android.os.Parcelable;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.google.android.gms.auth.AccountChangeEvent;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.auth.api.identity.SignInPassword;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.blockstore.DeleteBytesRequest;
import com.google.android.gms.auth.blockstore.RetrieveBytesRequest;
import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;
import com.google.android.gms.auth.blockstore.StoreBytesData;
import com.google.android.gms.clearcut.zzc;
import com.google.android.gms.clearcut.zze;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.common.internal.zax;
import com.google.android.gms.common.internal.zzak;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.server.converter.zac;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.SafeParcelResponse;
import com.google.android.gms.common.server.response.zal;
import com.google.android.gms.common.server.response.zam;
import com.google.android.gms.common.server.response.zan;
import com.google.android.gms.common.stats.WakeLockEvent;
import com.google.android.gms.common.zzo;
import com.google.android.gms.common.zzq;
import com.google.android.gms.common.zzs;
import com.google.android.gms.deviceperformance.MediaPerformanceClassResult;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.Attachment;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension;
import com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails;
import com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension;
import com.google.android.gms.fido.fido2.api.common.UserVerificationRequirement;
import com.google.android.gms.fido.fido2.api.common.UvmEntries;
import com.google.android.gms.fido.fido2.api.common.UvmEntry;
import com.google.android.gms.fido.fido2.api.common.zzab;
import com.google.android.gms.fido.fido2.api.common.zzad;
import com.google.android.gms.fido.fido2.api.common.zzag;
import com.google.android.gms.fido.fido2.api.common.zzai;
import com.google.android.gms.fido.fido2.api.common.zzaw;
import com.google.android.gms.fido.fido2.api.common.zzf;
import com.google.android.gms.fido.fido2.api.common.zzh;
import com.google.android.gms.fido.fido2.api.common.zzu;
import com.google.android.gms.fido.fido2.api.common.zzz;
import com.google.android.gms.fido.u2f.api.common.ChannelIdValue;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import org.webrtc.EglBase14Impl;

public final class SWX implements Parcelable.Creator {
    public final int A00;

    public SWX(int i) {
        this.A00 = i;
    }

    public static SWX A00(int i) {
        return new SWX(i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: android.os.Parcel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: com.google.android.gms.common.data.DataHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v28, resolved type: com.google.android.gms.common.data.DataHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v138, resolved type: com.google.android.gms.fido.fido2.api.common.ErrorCode[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v99, resolved type: com.google.android.gms.fido.fido2.api.common.ErrorCode} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v143, resolved type: com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v102, resolved type: com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v103, resolved type: com.google.android.gms.common.data.DataHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v104, resolved type: com.google.android.gms.common.data.DataHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v105, resolved type: com.google.android.gms.common.data.DataHolder} */
    /* JADX WARNING: type inference failed for: r11v24, types: [com.google.android.gms.clearcut.zze, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r11v101, types: [com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails] */
    /* JADX WARNING: CFG modification limit reached, blocks count: 1490 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r31) {
        /*
            r30 = this;
            r0 = r30
            int r1 = r0.A00
            r0 = r31
            switch(r1) {
                case 0: goto L_0x15b5;
                case 1: goto L_0x159c;
                case 2: goto L_0x1567;
                case 3: goto L_0x154e;
                case 4: goto L_0x14ec;
                case 5: goto L_0x14c5;
                case 6: goto L_0x1476;
                case 7: goto L_0x1423;
                case 8: goto L_0x13ec;
                case 9: goto L_0x13ba;
                case 10: goto L_0x1345;
                case 11: goto L_0x12bc;
                case 12: goto L_0x1285;
                case 13: goto L_0x125e;
                case 14: goto L_0x1236;
                case 15: goto L_0x120e;
                case 16: goto L_0x11de;
                case 17: goto L_0x11a9;
                case 18: goto L_0x1164;
                case 19: goto L_0x1120;
                case 20: goto L_0x10f0;
                case 21: goto L_0x10a4;
                case 22: goto L_0x106a;
                case 23: goto L_0x1003;
                case 24: goto L_0x0fdc;
                case 25: goto L_0x0fa7;
                case 26: goto L_0x0f1e;
                case 27: goto L_0x0ee1;
                case 28: goto L_0x0eba;
                case 29: goto L_0x0e8a;
                case 30: goto L_0x0e30;
                case 31: goto L_0x0de8;
                case 32: goto L_0x0d9f;
                case 33: goto L_0x0d5b;
                case 34: goto L_0x0d3c;
                case 35: goto L_0x0d36;
                case 36: goto L_0x0cfa;
                case 37: goto L_0x0cd2;
                case 38: goto L_0x0cb9;
                case 39: goto L_0x0c91;
                case 40: goto L_0x0c4c;
                case 41: goto L_0x0c1a;
                case 42: goto L_0x0bea;
                case 43: goto L_0x0bb9;
                case 44: goto L_0x0b5b;
                case 45: goto L_0x0b20;
                case 46: goto L_0x0aee;
                case 47: goto L_0x0ab5;
                case 48: goto L_0x0a67;
                case 49: goto L_0x0a36;
                case 50: goto L_0x09b2;
                case 51: goto L_0x096d;
                case 52: goto L_0x0934;
                case 53: goto L_0x08fa;
                case 54: goto L_0x08db;
                case 55: goto L_0x08cc;
                case 56: goto L_0x08bd;
                case 57: goto L_0x08a4;
                case 58: goto L_0x087e;
                case 59: goto L_0x0865;
                case 60: goto L_0x084c;
                case 61: goto L_0x082d;
                case 62: goto L_0x07da;
                case 63: goto L_0x07b5;
                case 64: goto L_0x0721;
                case 65: goto L_0x06b9;
                case 66: goto L_0x0680;
                case 67: goto L_0x064e;
                case 68: goto L_0x05d7;
                case 69: goto L_0x05a6;
                case 70: goto L_0x0597;
                case 71: goto L_0x055d;
                case 72: goto L_0x054a;
                case 73: goto L_0x052b;
                case 74: goto L_0x051c;
                case 75: goto L_0x04f5;
                case 76: goto L_0x04e6;
                case 77: goto L_0x04cd;
                case 78: goto L_0x04be;
                case 79: goto L_0x0497;
                case 80: goto L_0x045e;
                case 81: goto L_0x0409;
                case 82: goto L_0x0362;
                case 83: goto L_0x0349;
                case 84: goto L_0x0310;
                case 85: goto L_0x02e0;
                case 86: goto L_0x029b;
                case 87: goto L_0x025b;
                case 88: goto L_0x022b;
                case 89: goto L_0x01e1;
                case 90: goto L_0x01a8;
                case 91: goto L_0x016f;
                case 92: goto L_0x0160;
                case 93: goto L_0x011f;
                case 94: goto L_0x00f8;
                case 95: goto L_0x00d5;
                case 96: goto L_0x00a7;
                case 97: goto L_0x0089;
                case 98: goto L_0x0034;
                default: goto L_0x0009;
            }
        L_0x0009:
            int r4 = r0.readInt()
            com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType[] r3 = com.google.android.gms.fido.u2f.api.common.ChannelIdValue.ChannelIdValueType.values()     // Catch:{ RJt -> 0x002e }
            int r2 = r3.length     // Catch:{ RJt -> 0x002e }
            r1 = 0
        L_0x0013:
            if (r1 >= r2) goto L_0x001e
            r11 = r3[r1]     // Catch:{ RJt -> 0x002e }
            int r0 = r11.A00     // Catch:{ RJt -> 0x002e }
            if (r4 == r0) goto L_0x0fa6
            int r1 = r1 + 1
            goto L_0x0013
        L_0x001e:
            java.lang.Object[] r1 = X.AnonymousClass7TF.A1b(r4)     // Catch:{ RJt -> 0x002e }
            java.lang.String r0 = "ChannelIdValueType %s not supported"
            java.lang.String r1 = java.lang.String.format(r0, r1)     // Catch:{ RJt -> 0x002e }
            X.RJt r0 = new X.RJt     // Catch:{ RJt -> 0x002e }
            r0.<init>(r1)     // Catch:{ RJt -> 0x002e }
            throw r0     // Catch:{ RJt -> 0x002e }
        L_0x002e:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r0)
            throw r0
        L_0x0034:
            int r3 = X.C295505oK.A00(r0)
            r13 = 0
            r14 = r13
            r15 = r13
            r16 = r13
            r12 = r13
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
        L_0x0046:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x0f9e
            int r2 = r0.readInt()
            char r1 = (char) r2
            switch(r1) {
                case 1: goto L_0x0084;
                case 2: goto L_0x007f;
                case 3: goto L_0x007a;
                case 4: goto L_0x0075;
                case 5: goto L_0x0070;
                case 6: goto L_0x006b;
                case 7: goto L_0x0058;
                case 8: goto L_0x0062;
                case 9: goto L_0x005d;
                default: goto L_0x0054;
            }
        L_0x0054:
            X.C295505oK.A0C(r0, r2)
            goto L_0x0046
        L_0x0058:
            long r17 = X.Pxi.A08(r0, r2)
            goto L_0x0046
        L_0x005d:
            boolean r21 = X.C295505oK.A0G(r0, r2)
            goto L_0x0046
        L_0x0062:
            android.os.Parcelable$Creator r1 = android.accounts.Account.CREATOR
            android.os.Parcelable r12 = X.C295505oK.A04(r0, r1, r2)
            android.accounts.Account r12 = (android.accounts.Account) r12
            goto L_0x0046
        L_0x006b:
            boolean r20 = X.C295505oK.A0G(r0, r2)
            goto L_0x0046
        L_0x0070:
            boolean r19 = X.C295505oK.A0G(r0, r2)
            goto L_0x0046
        L_0x0075:
            byte[] r16 = X.C295505oK.A0H(r0, r2)
            goto L_0x0046
        L_0x007a:
            byte[] r15 = X.C295505oK.A0H(r0, r2)
            goto L_0x0046
        L_0x007f:
            java.lang.String r14 = X.C295505oK.A08(r0, r2)
            goto L_0x0046
        L_0x0084:
            java.lang.String r13 = X.C295505oK.A08(r0, r2)
            goto L_0x0046
        L_0x0089:
            int r4 = X.C295505oK.A00(r0)
            r3 = 0
        L_0x008e:
            int r1 = r0.dataPosition()
            if (r1 >= r4) goto L_0x009e
            int r2 = r0.readInt()
            char r1 = (char) r2
            java.lang.String r3 = X.Pxj.A0n(r0, r3, r1, r2)
            goto L_0x008e
        L_0x009e:
            X.C295505oK.A0B(r0, r4)
            com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension r11 = new com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension
            r11.<init>(r3)
            return r11
        L_0x00a7:
            int r4 = r0.readInt()
            com.google.android.gms.fido.fido2.api.common.ErrorCode[] r3 = com.google.android.gms.fido.fido2.api.common.ErrorCode.values()     // Catch:{ RJo -> 0x00ce }
            int r2 = r3.length     // Catch:{ RJo -> 0x00ce }
            r1 = 0
        L_0x00b1:
            if (r1 >= r2) goto L_0x00bc
            r11 = r3[r1]     // Catch:{ RJo -> 0x00ce }
            int r0 = r11.A00     // Catch:{ RJo -> 0x00ce }
            if (r4 == r0) goto L_0x0fa6
            int r1 = r1 + 1
            goto L_0x00b1
        L_0x00bc:
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ RJo -> 0x00ce }
            java.lang.Object[] r1 = X.AnonymousClass7TF.A1b(r4)     // Catch:{ RJo -> 0x00ce }
            java.lang.String r0 = "Error code %d is not supported"
            java.lang.String r1 = java.lang.String.format(r2, r0, r1)     // Catch:{ RJo -> 0x00ce }
            X.RJo r0 = new X.RJo     // Catch:{ RJo -> 0x00ce }
            r0.<init>(r1)     // Catch:{ RJo -> 0x00ce }
            throw r0     // Catch:{ RJo -> 0x00ce }
        L_0x00ce:
            r1 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x00d5:
            int r4 = X.C295505oK.A00(r0)
        L_0x00d9:
            int r1 = r0.dataPosition()
            if (r1 >= r4) goto L_0x00ef
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            if (r2 == r1) goto L_0x00eb
            X.C295505oK.A0C(r0, r3)
            goto L_0x00d9
        L_0x00eb:
            X.C295505oK.A0G(r0, r3)
            goto L_0x00d9
        L_0x00ef:
            X.C295505oK.A0B(r0, r4)
            com.google.android.gms.fido.fido2.api.common.zzu r11 = new com.google.android.gms.fido.fido2.api.common.zzu
            r11.<init>()
            return r11
        L_0x00f8:
            int r5 = X.C295505oK.A00(r0)
            r4 = 0
        L_0x00fd:
            int r1 = r0.dataPosition()
            if (r1 >= r5) goto L_0x0116
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            if (r2 == r1) goto L_0x010f
            X.C295505oK.A0C(r0, r3)
            goto L_0x00fd
        L_0x010f:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.fido2.api.common.zzq.CREATOR
            java.util.ArrayList r4 = X.C295505oK.A0A(r0, r1, r3)
            goto L_0x00fd
        L_0x0116:
            X.C295505oK.A0B(r0, r5)
            com.google.android.gms.fido.fido2.api.common.zzs r11 = new com.google.android.gms.fido.fido2.api.common.zzs
            r11.<init>(r4)
            return r11
        L_0x011f:
            int r4 = X.C295505oK.A00(r0)
            r12 = 0
            r13 = r12
            r14 = r12
            r15 = 0
        L_0x0128:
            int r1 = r0.dataPosition()
            if (r1 >= r4) goto L_0x0157
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            if (r2 == r1) goto L_0x0152
            r1 = 2
            if (r2 == r1) goto L_0x014d
            r1 = 3
            if (r2 == r1) goto L_0x0148
            r1 = 4
            if (r2 == r1) goto L_0x0143
            X.C295505oK.A0C(r0, r3)
            goto L_0x0128
        L_0x0143:
            byte[] r14 = X.C295505oK.A0H(r0, r3)
            goto L_0x0128
        L_0x0148:
            byte[] r13 = X.C295505oK.A0H(r0, r3)
            goto L_0x0128
        L_0x014d:
            byte[] r12 = X.C295505oK.A0H(r0, r3)
            goto L_0x0128
        L_0x0152:
            long r15 = X.Pxi.A08(r0, r3)
            goto L_0x0128
        L_0x0157:
            X.C295505oK.A0B(r0, r4)
            com.google.android.gms.fido.fido2.api.common.zzq r11 = new com.google.android.gms.fido.fido2.api.common.zzq
            r11.<init>(r12, r13, r14, r15)
            return r11
        L_0x0160:
            int r0 = r0.readInt()
            com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier r11 = com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier.A00(r0)     // Catch:{ RJn -> 0x0169 }
            return r11
        L_0x0169:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r0)
            throw r0
        L_0x016f:
            int r7 = X.C295505oK.A00(r0)
            r1 = 0
            r2 = r1
            r6 = r1
        L_0x0176:
            int r3 = r0.dataPosition()
            if (r3 >= r7) goto L_0x019f
            int r5 = r0.readInt()
            char r4 = (char) r5
            r3 = 2
            if (r4 == r3) goto L_0x0196
            r3 = 3
            if (r4 == r3) goto L_0x018d
            r3 = 4
            byte[] r6 = X.Pxi.A1a(r0, r6, r4, r3, r5)
            goto L_0x0176
        L_0x018d:
            android.os.Parcelable$Creator r2 = android.net.Uri.CREATOR
            android.os.Parcelable r2 = X.C295505oK.A04(r0, r2, r5)
            android.net.Uri r2 = (android.net.Uri) r2
            goto L_0x0176
        L_0x0196:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions.CREATOR
            android.os.Parcelable r1 = X.C295505oK.A04(r0, r1, r5)
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions r1 = (com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions) r1
            goto L_0x0176
        L_0x019f:
            X.C295505oK.A0B(r0, r7)
            com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions r11 = new com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions
            r11.<init>(r2, r1, r6)
            return r11
        L_0x01a8:
            int r7 = X.C295505oK.A00(r0)
            r1 = 0
            r2 = r1
            r6 = r1
        L_0x01af:
            int r3 = r0.dataPosition()
            if (r3 >= r7) goto L_0x01d8
            int r5 = r0.readInt()
            char r4 = (char) r5
            r3 = 2
            if (r4 == r3) goto L_0x01cf
            r3 = 3
            if (r4 == r3) goto L_0x01c6
            r3 = 4
            byte[] r6 = X.Pxi.A1a(r0, r6, r4, r3, r5)
            goto L_0x01af
        L_0x01c6:
            android.os.Parcelable$Creator r2 = android.net.Uri.CREATOR
            android.os.Parcelable r2 = X.C295505oK.A04(r0, r2, r5)
            android.net.Uri r2 = (android.net.Uri) r2
            goto L_0x01af
        L_0x01cf:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.CREATOR
            android.os.Parcelable r1 = X.C295505oK.A04(r0, r1, r5)
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions r1 = (com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions) r1
            goto L_0x01af
        L_0x01d8:
            X.C295505oK.A0B(r0, r7)
            com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions r11 = new com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions
            r11.<init>(r2, r1, r6)
            return r11
        L_0x01e1:
            int r8 = X.C295505oK.A00(r0)
            r7 = 0
            r1 = r7
            r6 = r7
            r5 = r7
        L_0x01e9:
            int r2 = r0.dataPosition()
            if (r2 >= r8) goto L_0x0222
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 2
            if (r3 == r2) goto L_0x021d
            r2 = 3
            if (r3 == r2) goto L_0x0208
            r2 = 4
            if (r3 == r2) goto L_0x0203
            r2 = 5
            java.lang.String r5 = X.Pxi.A0f(r0, r5, r3, r2, r4)
            goto L_0x01e9
        L_0x0203:
            java.lang.String r6 = X.C295505oK.A08(r0, r4)
            goto L_0x01e9
        L_0x0208:
            int r2 = X.C295505oK.A01(r0, r4)
            if (r2 != 0) goto L_0x0210
            r1 = 0
            goto L_0x01e9
        L_0x0210:
            r1 = 4
            X.C295505oK.A0E(r0, r2, r1)
            boolean r1 = X.C41848B3p.A1X(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            goto L_0x01e9
        L_0x021d:
            java.lang.String r7 = X.C295505oK.A08(r0, r4)
            goto L_0x01e9
        L_0x0222:
            X.C295505oK.A0B(r0, r8)
            com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria r11 = new com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria
            r11.<init>(r1, r7, r6, r5)
            return r11
        L_0x022b:
            int r7 = X.C295505oK.A00(r0)
            r1 = 0
            r6 = 0
            r5 = 0
        L_0x0232:
            int r2 = r0.dataPosition()
            if (r2 >= r7) goto L_0x0252
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 2
            if (r3 == r2) goto L_0x024d
            r2 = 3
            if (r3 == r2) goto L_0x0248
            int r5 = X.Pxj.A08(r0, r3, r4, r5)
            goto L_0x0232
        L_0x0248:
            java.lang.String r6 = X.C295505oK.A08(r0, r4)
            goto L_0x0232
        L_0x024d:
            int r1 = X.Pxh.A08(r0, r4)
            goto L_0x0232
        L_0x0252:
            X.C295505oK.A0B(r0, r7)
            com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse r11 = new com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse
            r11.<init>(r1, r6, r5)
            return r11
        L_0x025b:
            int r8 = X.C295505oK.A00(r0)
            r7 = 0
            r6 = r7
            r5 = r7
            r4 = r7
        L_0x0263:
            int r1 = r0.dataPosition()
            if (r1 >= r8) goto L_0x0292
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 2
            if (r2 == r1) goto L_0x028d
            r1 = 3
            if (r2 == r1) goto L_0x0288
            r1 = 4
            if (r2 == r1) goto L_0x0283
            r1 = 5
            if (r2 == r1) goto L_0x027e
            X.C295505oK.A0C(r0, r3)
            goto L_0x0263
        L_0x027e:
            java.lang.String[] r4 = X.C295505oK.A0K(r0, r3)
            goto L_0x0263
        L_0x0283:
            byte[] r5 = X.C295505oK.A0H(r0, r3)
            goto L_0x0263
        L_0x0288:
            byte[] r6 = X.C295505oK.A0H(r0, r3)
            goto L_0x0263
        L_0x028d:
            byte[] r7 = X.C295505oK.A0H(r0, r3)
            goto L_0x0263
        L_0x0292:
            X.C295505oK.A0B(r0, r8)
            com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse r11 = new com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse
            r11.<init>(r7, r6, r5, r4)
            return r11
        L_0x029b:
            int r5 = X.C295505oK.A00(r0)
            r12 = 0
            r13 = r12
            r14 = r12
            r15 = r12
            r4 = r12
        L_0x02a4:
            int r1 = r0.dataPosition()
            if (r1 >= r5) goto L_0x02d5
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 2
            if (r2 == r1) goto L_0x02d0
            r1 = 3
            if (r2 == r1) goto L_0x02cb
            r1 = 4
            if (r2 == r1) goto L_0x02c6
            r1 = 5
            if (r2 == r1) goto L_0x02c1
            r1 = 6
            byte[] r4 = X.Pxi.A1a(r0, r4, r2, r1, r3)
            goto L_0x02a4
        L_0x02c1:
            byte[] r15 = X.C295505oK.A0H(r0, r3)
            goto L_0x02a4
        L_0x02c6:
            byte[] r14 = X.C295505oK.A0H(r0, r3)
            goto L_0x02a4
        L_0x02cb:
            byte[] r13 = X.C295505oK.A0H(r0, r3)
            goto L_0x02a4
        L_0x02d0:
            byte[] r12 = X.C295505oK.A0H(r0, r3)
            goto L_0x02a4
        L_0x02d5:
            X.C295505oK.A0B(r0, r5)
            com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse r11 = new com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse
            r16 = r4
            r11.<init>(r12, r13, r14, r15, r16)
            return r11
        L_0x02e0:
            int r7 = X.C295505oK.A00(r0)
            r6 = 0
            r5 = r6
            r4 = 0
        L_0x02e7:
            int r1 = r0.dataPosition()
            if (r1 >= r7) goto L_0x0300
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            if (r2 == r1) goto L_0x02fb
            r1 = 2
            byte[] r5 = X.Pxi.A1a(r0, r5, r2, r1, r3)
            goto L_0x02e7
        L_0x02fb:
            boolean r4 = X.C295505oK.A0G(r0, r3)
            goto L_0x02e7
        L_0x0300:
            X.C295505oK.A0B(r0, r7)
            if (r5 == 0) goto L_0x030a
            int r0 = r5.length
            X.QvC r6 = X.TAO.A01(r5, r0)
        L_0x030a:
            com.google.android.gms.fido.fido2.api.common.zzh r11 = new com.google.android.gms.fido.fido2.api.common.zzh
            r11.<init>(r6, r4)
            return r11
        L_0x0310:
            int r7 = X.C295505oK.A00(r0)
            r6 = 0
            r5 = r6
            r4 = r6
        L_0x0317:
            int r1 = r0.dataPosition()
            if (r1 >= r7) goto L_0x0330
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            if (r2 == r1) goto L_0x032b
            r1 = 2
            byte[] r4 = X.Pxi.A1a(r0, r4, r2, r1, r3)
            goto L_0x0317
        L_0x032b:
            byte[] r5 = X.C295505oK.A0H(r0, r3)
            goto L_0x0317
        L_0x0330:
            X.C295505oK.A0B(r0, r7)
            if (r5 != 0) goto L_0x0343
            r1 = r6
        L_0x0336:
            if (r4 == 0) goto L_0x033d
            int r0 = r4.length
            X.QvC r6 = X.TAO.A01(r4, r0)
        L_0x033d:
            com.google.android.gms.fido.fido2.api.common.zzf r11 = new com.google.android.gms.fido.fido2.api.common.zzf
            r11.<init>(r1, r6)
            return r11
        L_0x0343:
            int r0 = r5.length
            X.QvC r1 = X.TAO.A01(r5, r0)
            goto L_0x0336
        L_0x0349:
            int r3 = X.C295505oK.A00(r0)
            r2 = 0
        L_0x034e:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x0359
            boolean r2 = X.Pxj.A1X(r0, r2)
            goto L_0x034e
        L_0x0359:
            X.C295505oK.A0B(r0, r3)
            com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs r11 = new com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs
            r11.<init>(r2)
            return r11
        L_0x0362:
            int r11 = X.C295505oK.A00(r0)
            r12 = 0
            r2 = r12
            r14 = r12
            r3 = r12
            r15 = r12
            r4 = r12
            r5 = r12
            r6 = r12
            r13 = r12
            r7 = r12
            r8 = r12
            r9 = r12
        L_0x0372:
            int r1 = r0.dataPosition()
            if (r1 >= r11) goto L_0x03f0
            int r10 = r0.readInt()
            char r1 = (char) r10
            switch(r1) {
                case 2: goto L_0x03e7;
                case 3: goto L_0x03de;
                case 4: goto L_0x03d5;
                case 5: goto L_0x03cc;
                case 6: goto L_0x03c3;
                case 7: goto L_0x03ba;
                case 8: goto L_0x03b1;
                case 9: goto L_0x03a8;
                case 10: goto L_0x039f;
                case 11: goto L_0x0396;
                case 12: goto L_0x038d;
                case 13: goto L_0x0384;
                default: goto L_0x0380;
            }
        L_0x0380:
            X.C295505oK.A0C(r0, r10)
            goto L_0x0372
        L_0x0384:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.fido2.api.common.zzai.CREATOR
            android.os.Parcelable r9 = X.C295505oK.A04(r0, r1, r10)
            com.google.android.gms.fido.fido2.api.common.zzai r9 = (com.google.android.gms.fido.fido2.api.common.zzai) r9
            goto L_0x0372
        L_0x038d:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.fido2.api.common.zzaw.CREATOR
            android.os.Parcelable r8 = X.C295505oK.A04(r0, r1, r10)
            com.google.android.gms.fido.fido2.api.common.zzaw r8 = (com.google.android.gms.fido.fido2.api.common.zzaw) r8
            goto L_0x0372
        L_0x0396:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.fido2.api.common.zzak.CREATOR
            android.os.Parcelable r7 = X.C295505oK.A04(r0, r1, r10)
            com.google.android.gms.fido.fido2.api.common.zzak r7 = (com.google.android.gms.fido.fido2.api.common.zzak) r7
            goto L_0x0372
        L_0x039f:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension.CREATOR
            android.os.Parcelable r13 = X.C295505oK.A04(r0, r1, r10)
            com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension r13 = (com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension) r13
            goto L_0x0372
        L_0x03a8:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.fido2.api.common.zzag.CREATOR
            android.os.Parcelable r6 = X.C295505oK.A04(r0, r1, r10)
            com.google.android.gms.fido.fido2.api.common.zzag r6 = (com.google.android.gms.fido.fido2.api.common.zzag) r6
            goto L_0x0372
        L_0x03b1:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.fido2.api.common.zzu.CREATOR
            android.os.Parcelable r5 = X.C295505oK.A04(r0, r1, r10)
            com.google.android.gms.fido.fido2.api.common.zzu r5 = (com.google.android.gms.fido.fido2.api.common.zzu) r5
            goto L_0x0372
        L_0x03ba:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.fido2.api.common.zzad.CREATOR
            android.os.Parcelable r4 = X.C295505oK.A04(r0, r1, r10)
            com.google.android.gms.fido.fido2.api.common.zzad r4 = (com.google.android.gms.fido.fido2.api.common.zzad) r4
            goto L_0x0372
        L_0x03c3:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.fido2.api.common.zzab.CREATOR
            android.os.Parcelable r15 = X.C295505oK.A04(r0, r1, r10)
            com.google.android.gms.fido.fido2.api.common.zzab r15 = (com.google.android.gms.fido.fido2.api.common.zzab) r15
            goto L_0x0372
        L_0x03cc:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.fido2.api.common.zzz.CREATOR
            android.os.Parcelable r3 = X.C295505oK.A04(r0, r1, r10)
            com.google.android.gms.fido.fido2.api.common.zzz r3 = (com.google.android.gms.fido.fido2.api.common.zzz) r3
            goto L_0x0372
        L_0x03d5:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension.CREATOR
            android.os.Parcelable r14 = X.C295505oK.A04(r0, r1, r10)
            com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension r14 = (com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension) r14
            goto L_0x0372
        L_0x03de:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.fido2.api.common.zzs.CREATOR
            android.os.Parcelable r2 = X.C295505oK.A04(r0, r1, r10)
            com.google.android.gms.fido.fido2.api.common.zzs r2 = (com.google.android.gms.fido.fido2.api.common.zzs) r2
            goto L_0x0372
        L_0x03e7:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension.CREATOR
            android.os.Parcelable r12 = X.C295505oK.A04(r0, r1, r10)
            com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension r12 = (com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension) r12
            goto L_0x0372
        L_0x03f0:
            X.C295505oK.A0B(r0, r11)
            com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions r11 = new com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions
            r17 = r6
            r18 = r9
            r19 = r7
            r20 = r8
            r21 = r2
            r22 = r5
            r23 = r3
            r16 = r4
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r11
        L_0x0409:
            int r4 = X.C295505oK.A00(r0)
            r13 = 0
            r14 = r13
            r12 = r13
            r15 = r13
            r3 = r13
        L_0x0412:
            int r1 = r0.dataPosition()
            if (r1 >= r4) goto L_0x0453
            int r2 = r0.readInt()
            char r5 = (char) r2
            r1 = 1
            if (r5 == r1) goto L_0x044a
            r1 = 2
            if (r5 == r1) goto L_0x0441
            r1 = 3
            if (r5 == r1) goto L_0x0438
            r1 = 4
            if (r5 == r1) goto L_0x042f
            r1 = 5
            java.lang.String r3 = X.Pxi.A0f(r0, r3, r5, r1, r2)
            goto L_0x0412
        L_0x042f:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.fido2.api.common.zzh.CREATOR
            android.os.Parcelable r15 = X.C295505oK.A04(r0, r1, r2)
            com.google.android.gms.fido.fido2.api.common.zzh r15 = (com.google.android.gms.fido.fido2.api.common.zzh) r15
            goto L_0x0412
        L_0x0438:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs.CREATOR
            android.os.Parcelable r12 = X.C295505oK.A04(r0, r1, r2)
            com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs r12 = (com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs) r12
            goto L_0x0412
        L_0x0441:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.fido2.api.common.zzf.CREATOR
            android.os.Parcelable r14 = X.C295505oK.A04(r0, r1, r2)
            com.google.android.gms.fido.fido2.api.common.zzf r14 = (com.google.android.gms.fido.fido2.api.common.zzf) r14
            goto L_0x0412
        L_0x044a:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.fido2.api.common.UvmEntries.CREATOR
            android.os.Parcelable r13 = X.C295505oK.A04(r0, r1, r2)
            com.google.android.gms.fido.fido2.api.common.UvmEntries r13 = (com.google.android.gms.fido.fido2.api.common.UvmEntries) r13
            goto L_0x0412
        L_0x0453:
            X.C295505oK.A0B(r0, r4)
            com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs r11 = new com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs
            r16 = r3
            r11.<init>(r12, r13, r14, r15, r16)
            return r11
        L_0x045e:
            int r7 = X.C295505oK.A00(r0)
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x0465:
            int r4 = r0.dataPosition()
            if (r4 >= r7) goto L_0x048e
            int r6 = r0.readInt()
            char r5 = (char) r6
            r4 = 1
            if (r5 == r4) goto L_0x0489
            r4 = 2
            if (r5 == r4) goto L_0x0483
            r4 = 3
            if (r5 == r4) goto L_0x047d
            X.C295505oK.A0C(r0, r6)
            goto L_0x0465
        L_0x047d:
            int r3 = X.Pxh.A08(r0, r6)
            short r3 = (short) r3
            goto L_0x0465
        L_0x0483:
            int r2 = X.Pxh.A08(r0, r6)
            short r2 = (short) r2
            goto L_0x0465
        L_0x0489:
            int r1 = X.Pxh.A08(r0, r6)
            goto L_0x0465
        L_0x048e:
            X.C295505oK.A0B(r0, r7)
            com.google.android.gms.fido.fido2.api.common.UvmEntry r11 = new com.google.android.gms.fido.fido2.api.common.UvmEntry
            r11.<init>(r1, r2, r3)
            return r11
        L_0x0497:
            int r5 = X.C295505oK.A00(r0)
            r4 = 0
        L_0x049c:
            int r1 = r0.dataPosition()
            if (r1 >= r5) goto L_0x04b5
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            if (r2 == r1) goto L_0x04ae
            X.C295505oK.A0C(r0, r3)
            goto L_0x049c
        L_0x04ae:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.fido2.api.common.UvmEntry.CREATOR
            java.util.ArrayList r4 = X.C295505oK.A0A(r0, r1, r3)
            goto L_0x049c
        L_0x04b5:
            X.C295505oK.A0B(r0, r5)
            com.google.android.gms.fido.fido2.api.common.UvmEntries r11 = new com.google.android.gms.fido.fido2.api.common.UvmEntries
            r11.<init>(r4)
            return r11
        L_0x04be:
            java.lang.String r0 = r0.readString()
            com.google.android.gms.fido.fido2.api.common.UserVerificationRequirement r11 = com.google.android.gms.fido.fido2.api.common.UserVerificationRequirement.A00(r0)     // Catch:{ RJs -> 0x04c7 }
            return r11
        L_0x04c7:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r0)
            throw r0
        L_0x04cd:
            int r3 = X.C295505oK.A00(r0)
            r2 = 0
        L_0x04d2:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x04dd
            boolean r2 = X.Pxj.A1X(r0, r2)
            goto L_0x04d2
        L_0x04dd:
            X.C295505oK.A0B(r0, r3)
            com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension r11 = new com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension
            r11.<init>(r2)
            return r11
        L_0x04e6:
            java.lang.String r0 = r0.readString()
            com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference r11 = com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference.A00(r0)     // Catch:{ RJm -> 0x04ef }
            return r11
        L_0x04ef:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r0)
            throw r0
        L_0x04f5:
            int r6 = X.C295505oK.A00(r0)
            r5 = 0
            r4 = r5
        L_0x04fb:
            int r1 = r0.dataPosition()
            if (r1 >= r6) goto L_0x0513
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 2
            if (r2 == r1) goto L_0x050e
            java.lang.String r4 = X.Pxj.A0o(r0, r4, r2, r3)
            goto L_0x04fb
        L_0x050e:
            java.lang.String r5 = X.C295505oK.A08(r0, r3)
            goto L_0x04fb
        L_0x0513:
            X.C295505oK.A0B(r0, r6)
            com.google.android.gms.fido.fido2.api.common.TokenBinding r11 = new com.google.android.gms.fido.fido2.api.common.TokenBinding
            r11.<init>(r5, r4)
            return r11
        L_0x051c:
            java.lang.String r0 = r0.readString()
            com.google.android.gms.fido.fido2.api.common.TokenBinding$TokenBindingStatus r11 = com.google.android.gms.fido.fido2.api.common.TokenBinding.TokenBindingStatus.A00(r0)     // Catch:{ RJr -> 0x0525 }
            return r11
        L_0x0525:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r0)
            throw r0
        L_0x052b:
            int r5 = X.C295505oK.A00(r0)
            r4 = 0
        L_0x0530:
            int r1 = r0.dataPosition()
            if (r1 >= r5) goto L_0x0541
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            java.lang.String r4 = X.Pxi.A0f(r0, r4, r2, r1, r3)
            goto L_0x0530
        L_0x0541:
            X.C295505oK.A0B(r0, r5)
            com.google.android.gms.fido.fido2.api.common.zzaw r11 = new com.google.android.gms.fido.fido2.api.common.zzaw
            r11.<init>(r4)
            return r11
        L_0x054a:
            java.lang.String r0 = r0.readString()
            if (r0 != 0) goto L_0x0552
            java.lang.String r0 = ""
        L_0x0552:
            com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement r11 = com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement.A00(r0)     // Catch:{ RJq -> 0x0557 }
            return r11
        L_0x0557:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r0)
            throw r0
        L_0x055d:
            int r8 = X.C295505oK.A00(r0)
            r7 = 0
            r6 = r7
            r5 = r7
            r4 = r7
        L_0x0565:
            int r1 = r0.dataPosition()
            if (r1 >= r8) goto L_0x058e
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 2
            if (r2 == r1) goto L_0x0589
            r1 = 3
            if (r2 == r1) goto L_0x0584
            r1 = 4
            if (r2 == r1) goto L_0x057f
            r1 = 5
            java.lang.String r4 = X.Pxi.A0f(r0, r4, r2, r1, r3)
            goto L_0x0565
        L_0x057f:
            java.lang.String r5 = X.C295505oK.A08(r0, r3)
            goto L_0x0565
        L_0x0584:
            java.lang.String r6 = X.C295505oK.A08(r0, r3)
            goto L_0x0565
        L_0x0589:
            byte[] r7 = X.C295505oK.A0H(r0, r3)
            goto L_0x0565
        L_0x058e:
            X.C295505oK.A0B(r0, r8)
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity r11 = new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity
            r11.<init>(r6, r7, r5, r4)
            return r11
        L_0x0597:
            java.lang.String r0 = r0.readString()
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType r11 = com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType.A00(r0)     // Catch:{ RJp -> 0x05a0 }
            return r11
        L_0x05a0:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r0)
            throw r0
        L_0x05a6:
            int r7 = X.C295505oK.A00(r0)
            r6 = 0
            r5 = r6
            r4 = r6
        L_0x05ad:
            int r1 = r0.dataPosition()
            if (r1 >= r7) goto L_0x05ce
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 2
            if (r2 == r1) goto L_0x05c9
            r1 = 3
            if (r2 == r1) goto L_0x05c4
            r1 = 4
            java.lang.String r4 = X.Pxi.A0f(r0, r4, r2, r1, r3)
            goto L_0x05ad
        L_0x05c4:
            java.lang.String r5 = X.C295505oK.A08(r0, r3)
            goto L_0x05ad
        L_0x05c9:
            java.lang.String r6 = X.C295505oK.A08(r0, r3)
            goto L_0x05ad
        L_0x05ce:
            X.C295505oK.A0B(r0, r7)
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity r11 = new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity
            r11.<init>(r6, r5, r4)
            return r11
        L_0x05d7:
            int r3 = X.C295505oK.A00(r0)
            r22 = 0
            r15 = r22
            r18 = r15
            r21 = r15
            r16 = r15
            r14 = r15
            r19 = r15
            r13 = r15
            r17 = r15
            r20 = r15
            r12 = r15
        L_0x05ee:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x0645
            int r2 = r0.readInt()
            char r1 = (char) r2
            switch(r1) {
                case 2: goto L_0x0640;
                case 3: goto L_0x063b;
                case 4: goto L_0x0636;
                case 5: goto L_0x062f;
                case 6: goto L_0x062a;
                case 7: goto L_0x0621;
                case 8: goto L_0x061c;
                case 9: goto L_0x0613;
                case 10: goto L_0x060e;
                case 11: goto L_0x0609;
                case 12: goto L_0x0600;
                default: goto L_0x05fc;
            }
        L_0x05fc:
            X.C295505oK.A0C(r0, r2)
            goto L_0x05ee
        L_0x0600:
            android.os.Parcelable$Creator r1 = android.os.ResultReceiver.CREATOR
            android.os.Parcelable r12 = X.C295505oK.A04(r0, r1, r2)
            android.os.ResultReceiver r12 = (android.os.ResultReceiver) r12
            goto L_0x05ee
        L_0x0609:
            java.lang.String r20 = X.C295505oK.A08(r0, r2)
            goto L_0x05ee
        L_0x060e:
            java.lang.Long r17 = X.C295505oK.A07(r0, r2)
            goto L_0x05ee
        L_0x0613:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions.CREATOR
            android.os.Parcelable r13 = X.C295505oK.A04(r0, r1, r2)
            com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions r13 = (com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions) r13
            goto L_0x05ee
        L_0x061c:
            java.lang.String r19 = X.C295505oK.A08(r0, r2)
            goto L_0x05ee
        L_0x0621:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.fido2.api.common.TokenBinding.CREATOR
            android.os.Parcelable r14 = X.C295505oK.A04(r0, r1, r2)
            com.google.android.gms.fido.fido2.api.common.TokenBinding r14 = (com.google.android.gms.fido.fido2.api.common.TokenBinding) r14
            goto L_0x05ee
        L_0x062a:
            java.lang.Integer r16 = X.C295505oK.A06(r0, r2)
            goto L_0x05ee
        L_0x062f:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor.CREATOR
            java.util.ArrayList r21 = X.C295505oK.A0A(r0, r1, r2)
            goto L_0x05ee
        L_0x0636:
            java.lang.String r18 = X.C295505oK.A08(r0, r2)
            goto L_0x05ee
        L_0x063b:
            java.lang.Double r15 = X.C295505oK.A05(r0, r2)
            goto L_0x05ee
        L_0x0640:
            byte[] r22 = X.C295505oK.A0H(r0, r2)
            goto L_0x05ee
        L_0x0645:
            X.C295505oK.A0B(r0, r3)
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions r11 = new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r11
        L_0x064e:
            int r6 = X.C295505oK.A00(r0)
            r5 = 0
            r4 = r5
        L_0x0654:
            int r1 = r0.dataPosition()
            if (r1 >= r6) goto L_0x0673
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 2
            if (r2 == r1) goto L_0x066e
            r1 = 3
            if (r2 == r1) goto L_0x0669
            X.C295505oK.A0C(r0, r3)
            goto L_0x0654
        L_0x0669:
            java.lang.Integer r4 = X.C295505oK.A06(r0, r3)
            goto L_0x0654
        L_0x066e:
            java.lang.String r5 = X.C295505oK.A08(r0, r3)
            goto L_0x0654
        L_0x0673:
            X.C295505oK.A0B(r0, r6)
            int r0 = r4.intValue()
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters r11 = new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters
            r11.<init>(r5, r0)
            return r11
        L_0x0680:
            int r7 = X.C295505oK.A00(r0)
            r6 = 0
            r5 = r6
            r4 = r6
        L_0x0687:
            int r1 = r0.dataPosition()
            if (r1 >= r7) goto L_0x06b0
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 2
            if (r2 == r1) goto L_0x06ab
            r1 = 3
            if (r2 == r1) goto L_0x06a6
            r1 = 4
            if (r2 == r1) goto L_0x069f
            X.C295505oK.A0C(r0, r3)
            goto L_0x0687
        L_0x069f:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.common.Transport.CREATOR
            java.util.ArrayList r4 = X.C295505oK.A0A(r0, r1, r3)
            goto L_0x0687
        L_0x06a6:
            byte[] r5 = X.C295505oK.A0H(r0, r3)
            goto L_0x0687
        L_0x06ab:
            java.lang.String r6 = X.C295505oK.A08(r0, r3)
            goto L_0x0687
        L_0x06b0:
            X.C295505oK.A0B(r0, r7)
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor r11 = new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor
            r11.<init>(r6, r4, r5)
            return r11
        L_0x06b9:
            int r3 = X.C295505oK.A00(r0)
            r16 = 0
            r17 = r16
            r19 = r16
            r14 = r16
            r13 = r14
            r15 = r14
            r12 = r14
            r18 = r14
        L_0x06ca:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x0718
            int r2 = r0.readInt()
            char r1 = (char) r2
            switch(r1) {
                case 1: goto L_0x0713;
                case 2: goto L_0x070e;
                case 3: goto L_0x0709;
                case 4: goto L_0x0700;
                case 5: goto L_0x06f7;
                case 6: goto L_0x06ee;
                case 7: goto L_0x06e5;
                case 8: goto L_0x06e0;
                case 9: goto L_0x06dc;
                default: goto L_0x06d8;
            }
        L_0x06d8:
            X.C295505oK.A0C(r0, r2)
            goto L_0x06ca
        L_0x06dc:
            X.C295505oK.A08(r0, r2)
            goto L_0x06ca
        L_0x06e0:
            java.lang.String r18 = X.C295505oK.A08(r0, r2)
            goto L_0x06ca
        L_0x06e5:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs.CREATOR
            android.os.Parcelable r12 = X.C295505oK.A04(r0, r1, r2)
            com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs r12 = (com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs) r12
            goto L_0x06ca
        L_0x06ee:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse.CREATOR
            android.os.Parcelable r15 = X.C295505oK.A04(r0, r1, r2)
            com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse r15 = (com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse) r15
            goto L_0x06ca
        L_0x06f7:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse.CREATOR
            android.os.Parcelable r13 = X.C295505oK.A04(r0, r1, r2)
            com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse r13 = (com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse) r13
            goto L_0x06ca
        L_0x0700:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse.CREATOR
            android.os.Parcelable r14 = X.C295505oK.A04(r0, r1, r2)
            com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse r14 = (com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse) r14
            goto L_0x06ca
        L_0x0709:
            byte[] r19 = X.C295505oK.A0H(r0, r2)
            goto L_0x06ca
        L_0x070e:
            java.lang.String r17 = X.C295505oK.A08(r0, r2)
            goto L_0x06ca
        L_0x0713:
            java.lang.String r16 = X.C295505oK.A08(r0, r2)
            goto L_0x06ca
        L_0x0718:
            X.C295505oK.A0B(r0, r3)
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredential r11 = new com.google.android.gms.fido.fido2.api.common.PublicKeyCredential
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            return r11
        L_0x0721:
            int r4 = X.C295505oK.A00(r0)
            r15 = 0
            r1 = r15
            r24 = r15
            r22 = r15
            r18 = r15
            r23 = r15
            r14 = r15
            r19 = r15
            r2 = r15
            r20 = r15
            r13 = r15
            r21 = r15
            r12 = r15
        L_0x0739:
            int r3 = r0.dataPosition()
            if (r3 >= r4) goto L_0x07a8
            int r3 = r0.readInt()
            char r5 = (char) r3
            switch(r5) {
                case 2: goto L_0x079f;
                case 3: goto L_0x0796;
                case 4: goto L_0x0791;
                case 5: goto L_0x078a;
                case 6: goto L_0x0785;
                case 7: goto L_0x077e;
                case 8: goto L_0x0775;
                case 9: goto L_0x0770;
                case 10: goto L_0x0767;
                case 11: goto L_0x0762;
                case 12: goto L_0x0759;
                case 13: goto L_0x0754;
                case 14: goto L_0x074b;
                default: goto L_0x0747;
            }
        L_0x0747:
            X.C295505oK.A0C(r0, r3)
            goto L_0x0739
        L_0x074b:
            android.os.Parcelable$Creator r5 = android.os.ResultReceiver.CREATOR
            android.os.Parcelable r12 = X.C295505oK.A04(r0, r5, r3)
            android.os.ResultReceiver r12 = (android.os.ResultReceiver) r12
            goto L_0x0739
        L_0x0754:
            java.lang.String r21 = X.C295505oK.A08(r0, r3)
            goto L_0x0739
        L_0x0759:
            android.os.Parcelable$Creator r5 = com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions.CREATOR
            android.os.Parcelable r13 = X.C295505oK.A04(r0, r5, r3)
            com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions r13 = (com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions) r13
            goto L_0x0739
        L_0x0762:
            java.lang.String r20 = X.C295505oK.A08(r0, r3)
            goto L_0x0739
        L_0x0767:
            android.os.Parcelable$Creator r2 = com.google.android.gms.fido.fido2.api.common.TokenBinding.CREATOR
            android.os.Parcelable r2 = X.C295505oK.A04(r0, r2, r3)
            com.google.android.gms.fido.fido2.api.common.TokenBinding r2 = (com.google.android.gms.fido.fido2.api.common.TokenBinding) r2
            goto L_0x0739
        L_0x0770:
            java.lang.Integer r19 = X.C295505oK.A06(r0, r3)
            goto L_0x0739
        L_0x0775:
            android.os.Parcelable$Creator r5 = com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria.CREATOR
            android.os.Parcelable r14 = X.C295505oK.A04(r0, r5, r3)
            com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria r14 = (com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria) r14
            goto L_0x0739
        L_0x077e:
            android.os.Parcelable$Creator r5 = com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor.CREATOR
            java.util.ArrayList r23 = X.C295505oK.A0A(r0, r5, r3)
            goto L_0x0739
        L_0x0785:
            java.lang.Double r18 = X.C295505oK.A05(r0, r3)
            goto L_0x0739
        L_0x078a:
            android.os.Parcelable$Creator r5 = com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters.CREATOR
            java.util.ArrayList r22 = X.C295505oK.A0A(r0, r5, r3)
            goto L_0x0739
        L_0x0791:
            byte[] r24 = X.C295505oK.A0H(r0, r3)
            goto L_0x0739
        L_0x0796:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity.CREATOR
            android.os.Parcelable r1 = X.C295505oK.A04(r0, r1, r3)
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity r1 = (com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity) r1
            goto L_0x0739
        L_0x079f:
            android.os.Parcelable$Creator r5 = com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity.CREATOR
            android.os.Parcelable r15 = X.C295505oK.A04(r0, r5, r3)
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity r15 = (com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity) r15
            goto L_0x0739
        L_0x07a8:
            X.C295505oK.A0B(r0, r4)
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions r11 = new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions
            r17 = r2
            r16 = r1
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r11
        L_0x07b5:
            int r5 = X.C295505oK.A00(r0)
            r4 = 0
        L_0x07ba:
            int r1 = r0.dataPosition()
            if (r1 >= r5) goto L_0x07d1
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            if (r2 == r1) goto L_0x07cc
            X.C295505oK.A0C(r0, r3)
            goto L_0x07ba
        L_0x07cc:
            byte[][] r4 = X.C295505oK.A0L(r0, r3)
            goto L_0x07ba
        L_0x07d1:
            X.C295505oK.A0B(r0, r5)
            com.google.android.gms.fido.fido2.api.common.zzak r11 = new com.google.android.gms.fido.fido2.api.common.zzak
            r11.<init>(r4)
            return r11
        L_0x07da:
            int r9 = X.C295505oK.A00(r0)
            r7 = 0
            r8 = r7
            r6 = r7
            r5 = r7
            r4 = 0
        L_0x07e3:
            int r1 = r0.dataPosition()
            if (r1 >= r9) goto L_0x080b
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            if (r2 == r1) goto L_0x0806
            r1 = 2
            if (r2 == r1) goto L_0x0801
            r1 = 3
            if (r2 == r1) goto L_0x07fc
            int r4 = X.Pxj.A08(r0, r2, r3, r4)
            goto L_0x07e3
        L_0x07fc:
            byte[] r5 = X.C295505oK.A0H(r0, r3)
            goto L_0x07e3
        L_0x0801:
            byte[] r6 = X.C295505oK.A0H(r0, r3)
            goto L_0x07e3
        L_0x0806:
            byte[] r8 = X.C295505oK.A0H(r0, r3)
            goto L_0x07e3
        L_0x080b:
            X.C295505oK.A0B(r0, r9)
            if (r8 != 0) goto L_0x0827
            r2 = r7
        L_0x0811:
            if (r6 != 0) goto L_0x0821
            r1 = r7
        L_0x0814:
            if (r5 == 0) goto L_0x081b
            int r0 = r5.length
            X.QvC r7 = X.TAO.A01(r5, r0)
        L_0x081b:
            com.google.android.gms.fido.fido2.api.common.zzai r11 = new com.google.android.gms.fido.fido2.api.common.zzai
            r11.<init>(r2, r1, r7, r4)
            return r11
        L_0x0821:
            int r0 = r6.length
            X.QvC r1 = X.TAO.A01(r6, r0)
            goto L_0x0814
        L_0x0827:
            int r0 = r8.length
            X.QvC r2 = X.TAO.A01(r8, r0)
            goto L_0x0811
        L_0x082d:
            int r5 = X.C295505oK.A00(r0)
            r4 = 0
        L_0x0832:
            int r1 = r0.dataPosition()
            if (r1 >= r5) goto L_0x0843
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            java.lang.String r4 = X.Pxi.A0f(r0, r4, r2, r1, r3)
            goto L_0x0832
        L_0x0843:
            X.C295505oK.A0B(r0, r5)
            com.google.android.gms.fido.fido2.api.common.zzag r11 = new com.google.android.gms.fido.fido2.api.common.zzag
            r11.<init>(r4)
            return r11
        L_0x084c:
            int r3 = X.C295505oK.A00(r0)
            r2 = 0
        L_0x0851:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x085c
            boolean r2 = X.Pxj.A1X(r0, r2)
            goto L_0x0851
        L_0x085c:
            X.C295505oK.A0B(r0, r3)
            com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension r11 = new com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension
            r11.<init>(r2)
            return r11
        L_0x0865:
            int r3 = X.C295505oK.A00(r0)
            r2 = 0
        L_0x086a:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x0875
            boolean r2 = X.Pxj.A1X(r0, r2)
            goto L_0x086a
        L_0x0875:
            X.C295505oK.A0B(r0, r3)
            com.google.android.gms.fido.fido2.api.common.zzad r11 = new com.google.android.gms.fido.fido2.api.common.zzad
            r11.<init>(r2)
            return r11
        L_0x087e:
            int r6 = X.C295505oK.A00(r0)
            r1 = 0
        L_0x0884:
            int r3 = r0.dataPosition()
            if (r3 >= r6) goto L_0x089b
            int r5 = r0.readInt()
            char r4 = (char) r5
            r3 = 1
            if (r4 == r3) goto L_0x0896
            X.C295505oK.A0C(r0, r5)
            goto L_0x0884
        L_0x0896:
            long r1 = X.Pxi.A08(r0, r5)
            goto L_0x0884
        L_0x089b:
            X.C295505oK.A0B(r0, r6)
            com.google.android.gms.fido.fido2.api.common.zzab r11 = new com.google.android.gms.fido.fido2.api.common.zzab
            r11.<init>(r1)
            return r11
        L_0x08a4:
            int r3 = X.C295505oK.A00(r0)
            r2 = 0
        L_0x08a9:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x08b4
            boolean r2 = X.Pxj.A1X(r0, r2)
            goto L_0x08a9
        L_0x08b4:
            X.C295505oK.A0B(r0, r3)
            com.google.android.gms.fido.fido2.api.common.zzz r11 = new com.google.android.gms.fido.fido2.api.common.zzz
            r11.<init>(r2)
            return r11
        L_0x08bd:
            java.lang.String r0 = r0.readString()
            com.google.android.gms.fido.fido2.api.common.Attachment r11 = com.google.android.gms.fido.fido2.api.common.Attachment.A00(r0)     // Catch:{ RJl -> 0x08c6 }
            return r11
        L_0x08c6:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r0)
            throw r0
        L_0x08cc:
            java.lang.String r0 = r0.readString()
            com.google.android.gms.fido.common.Transport r11 = com.google.android.gms.fido.common.Transport.A00(r0)     // Catch:{ RJk -> 0x08d5 }
            return r11
        L_0x08d5:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r0)
            throw r0
        L_0x08db:
            int r5 = X.C295505oK.A00(r0)
            r4 = 0
        L_0x08e0:
            int r1 = r0.dataPosition()
            if (r1 >= r5) goto L_0x08f1
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            int r4 = X.Pxj.A09(r0, r2, r1, r3, r4)
            goto L_0x08e0
        L_0x08f1:
            X.C295505oK.A0B(r0, r5)
            com.google.android.gms.deviceperformance.MediaPerformanceClassResult r11 = new com.google.android.gms.deviceperformance.MediaPerformanceClassResult
            r11.<init>(r4)
            return r11
        L_0x08fa:
            int r8 = X.C295505oK.A00(r0)
            r7 = 0
            r6 = r7
            r5 = 0
            r4 = 0
        L_0x0902:
            int r1 = r0.dataPosition()
            if (r1 >= r8) goto L_0x092b
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            if (r2 == r1) goto L_0x0926
            r1 = 2
            if (r2 == r1) goto L_0x0921
            r1 = 3
            if (r2 == r1) goto L_0x091c
            r1 = 4
            boolean r4 = X.Pxi.A1Q(r0, r2, r1, r3, r4)
            goto L_0x0902
        L_0x091c:
            boolean r5 = X.C295505oK.A0G(r0, r3)
            goto L_0x0902
        L_0x0921:
            android.os.IBinder r6 = X.C295505oK.A03(r0, r3)
            goto L_0x0902
        L_0x0926:
            java.lang.String r7 = X.C295505oK.A08(r0, r3)
            goto L_0x0902
        L_0x092b:
            X.C295505oK.A0B(r0, r8)
            com.google.android.gms.common.zzs r11 = new com.google.android.gms.common.zzs
            r11.<init>(r6, r7, r5, r4)
            return r11
        L_0x0934:
            int r8 = X.C295505oK.A00(r0)
            r7 = 0
            r6 = 0
            r1 = 0
            r5 = 0
        L_0x093c:
            int r2 = r0.dataPosition()
            if (r2 >= r8) goto L_0x0964
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 1
            if (r3 == r2) goto L_0x095f
            r2 = 2
            if (r3 == r2) goto L_0x095a
            r2 = 3
            if (r3 == r2) goto L_0x0955
            int r5 = X.Pxj.A08(r0, r3, r4, r5)
            goto L_0x093c
        L_0x0955:
            int r1 = X.Pxh.A08(r0, r4)
            goto L_0x093c
        L_0x095a:
            java.lang.String r6 = X.C295505oK.A08(r0, r4)
            goto L_0x093c
        L_0x095f:
            boolean r7 = X.C295505oK.A0G(r0, r4)
            goto L_0x093c
        L_0x0964:
            X.C295505oK.A0B(r0, r8)
            com.google.android.gms.common.zzq r11 = new com.google.android.gms.common.zzq
            r11.<init>(r1, r5, r6, r7)
            return r11
        L_0x096d:
            int r3 = X.C295505oK.A00(r0)
            r13 = 0
            r12 = r13
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x0979:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x09a9
            int r2 = r0.readInt()
            char r1 = (char) r2
            switch(r1) {
                case 1: goto L_0x09a4;
                case 2: goto L_0x099f;
                case 3: goto L_0x099a;
                case 4: goto L_0x0995;
                case 5: goto L_0x0990;
                case 6: goto L_0x098b;
                default: goto L_0x0987;
            }
        L_0x0987:
            X.C295505oK.A0C(r0, r2)
            goto L_0x0979
        L_0x098b:
            boolean r17 = X.C295505oK.A0G(r0, r2)
            goto L_0x0979
        L_0x0990:
            boolean r16 = X.C295505oK.A0G(r0, r2)
            goto L_0x0979
        L_0x0995:
            android.os.IBinder r12 = X.C295505oK.A03(r0, r2)
            goto L_0x0979
        L_0x099a:
            boolean r15 = X.C295505oK.A0G(r0, r2)
            goto L_0x0979
        L_0x099f:
            boolean r14 = X.C295505oK.A0G(r0, r2)
            goto L_0x0979
        L_0x09a4:
            java.lang.String r13 = X.C295505oK.A08(r0, r2)
            goto L_0x0979
        L_0x09a9:
            X.C295505oK.A0B(r0, r3)
            com.google.android.gms.common.zzo r11 = new com.google.android.gms.common.zzo
            r11.<init>(r12, r13, r14, r15, r16, r17)
            return r11
        L_0x09b2:
            int r2 = X.C295505oK.A00(r0)
            r12 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r17 = r12
            r13 = r12
            r14 = r12
            r15 = r12
            r16 = r12
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r18 = 0
            r29 = 0
        L_0x09d0:
            int r1 = r0.dataPosition()
            if (r1 >= r2) goto L_0x0a2d
            int r1 = r0.readInt()
            char r3 = (char) r1
            switch(r3) {
                case 1: goto L_0x09e2;
                case 2: goto L_0x09e7;
                case 3: goto L_0x09de;
                case 4: goto L_0x09ec;
                case 5: goto L_0x09f1;
                case 6: goto L_0x09f6;
                case 7: goto L_0x09de;
                case 8: goto L_0x09fb;
                case 9: goto L_0x09de;
                case 10: goto L_0x0a00;
                case 11: goto L_0x0a05;
                case 12: goto L_0x0a0a;
                case 13: goto L_0x0a0f;
                case 14: goto L_0x0a14;
                case 15: goto L_0x0a19;
                case 16: goto L_0x0a1e;
                case 17: goto L_0x0a23;
                case 18: goto L_0x0a28;
                default: goto L_0x09de;
            }
        L_0x09de:
            X.C295505oK.A0C(r0, r1)
            goto L_0x09d0
        L_0x09e2:
            int r19 = X.Pxh.A08(r0, r1)
            goto L_0x09d0
        L_0x09e7:
            long r23 = X.Pxi.A08(r0, r1)
            goto L_0x09d0
        L_0x09ec:
            java.lang.String r12 = X.C295505oK.A08(r0, r1)
            goto L_0x09d0
        L_0x09f1:
            int r21 = X.Pxh.A08(r0, r1)
            goto L_0x09d0
        L_0x09f6:
            java.util.ArrayList r17 = X.C295505oK.A09(r0, r1)
            goto L_0x09d0
        L_0x09fb:
            long r25 = X.Pxi.A08(r0, r1)
            goto L_0x09d0
        L_0x0a00:
            java.lang.String r14 = X.C295505oK.A08(r0, r1)
            goto L_0x09d0
        L_0x0a05:
            int r20 = X.Pxh.A08(r0, r1)
            goto L_0x09d0
        L_0x0a0a:
            java.lang.String r13 = X.C295505oK.A08(r0, r1)
            goto L_0x09d0
        L_0x0a0f:
            java.lang.String r15 = X.C295505oK.A08(r0, r1)
            goto L_0x09d0
        L_0x0a14:
            int r22 = X.Pxh.A08(r0, r1)
            goto L_0x09d0
        L_0x0a19:
            float r18 = X.Pxh.A01(r0, r1)
            goto L_0x09d0
        L_0x0a1e:
            long r27 = X.Pxi.A08(r0, r1)
            goto L_0x09d0
        L_0x0a23:
            java.lang.String r16 = X.C295505oK.A08(r0, r1)
            goto L_0x09d0
        L_0x0a28:
            boolean r29 = X.C295505oK.A0G(r0, r1)
            goto L_0x09d0
        L_0x0a2d:
            X.C295505oK.A0B(r0, r2)
            com.google.android.gms.common.stats.WakeLockEvent r11 = new com.google.android.gms.common.stats.WakeLockEvent
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r25, r27, r29)
            return r11
        L_0x0a36:
            int r7 = X.C295505oK.A00(r0)
            r1 = 0
            r6 = 0
            r5 = 0
        L_0x0a3d:
            int r2 = r0.dataPosition()
            if (r2 >= r7) goto L_0x0a5e
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 1
            if (r3 == r2) goto L_0x0a59
            r2 = 2
            if (r3 == r2) goto L_0x0a54
            r2 = 3
            int r5 = X.Pxj.A09(r0, r3, r2, r4, r5)
            goto L_0x0a3d
        L_0x0a54:
            java.lang.String r6 = X.C295505oK.A08(r0, r4)
            goto L_0x0a3d
        L_0x0a59:
            int r1 = X.Pxh.A08(r0, r4)
            goto L_0x0a3d
        L_0x0a5e:
            X.C295505oK.A0B(r0, r7)
            com.google.android.gms.common.server.FavaDiagnosticsEntity r11 = new com.google.android.gms.common.server.FavaDiagnosticsEntity
            r11.<init>(r1, r6, r5)
            return r11
        L_0x0a67:
            int r7 = X.C295505oK.A00(r0)
            r2 = 0
            r5 = r2
            r1 = 0
        L_0x0a6e:
            int r3 = r0.dataPosition()
            if (r3 >= r7) goto L_0x0aac
            int r6 = r0.readInt()
            char r4 = (char) r6
            r3 = 1
            if (r4 == r3) goto L_0x0aa7
            r3 = 2
            if (r4 == r3) goto L_0x0a8f
            r3 = 3
            if (r4 == r3) goto L_0x0a86
            X.C295505oK.A0C(r0, r6)
            goto L_0x0a6e
        L_0x0a86:
            android.os.Parcelable$Creator r3 = com.google.android.gms.common.server.response.zan.CREATOR
            android.os.Parcelable r5 = X.C295505oK.A04(r0, r3, r6)
            com.google.android.gms.common.server.response.zan r5 = (com.google.android.gms.common.server.response.zan) r5
            goto L_0x0a6e
        L_0x0a8f:
            int r4 = X.C295505oK.A01(r0, r6)
            int r3 = r0.dataPosition()
            if (r4 != 0) goto L_0x0a9b
            r2 = 0
            goto L_0x0a6e
        L_0x0a9b:
            android.os.Parcel r2 = android.os.Parcel.obtain()
            r2.appendFrom(r0, r3, r4)
            int r3 = r3 + r4
            r0.setDataPosition(r3)
            goto L_0x0a6e
        L_0x0aa7:
            int r1 = X.Pxh.A08(r0, r6)
            goto L_0x0a6e
        L_0x0aac:
            X.C295505oK.A0B(r0, r7)
            com.google.android.gms.common.server.response.SafeParcelResponse r11 = new com.google.android.gms.common.server.response.SafeParcelResponse
            r11.<init>(r2, r5, r1)
            return r11
        L_0x0ab5:
            int r7 = X.C295505oK.A00(r0)
            r6 = 0
            r5 = r6
            r1 = 0
        L_0x0abc:
            int r2 = r0.dataPosition()
            if (r2 >= r7) goto L_0x0ae5
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 1
            if (r3 == r2) goto L_0x0ae0
            r2 = 2
            if (r3 == r2) goto L_0x0adb
            r2 = 3
            if (r3 == r2) goto L_0x0ad4
            X.C295505oK.A0C(r0, r4)
            goto L_0x0abc
        L_0x0ad4:
            android.os.Parcelable$Creator r2 = com.google.android.gms.common.server.response.zam.CREATOR
            java.util.ArrayList r5 = X.C295505oK.A0A(r0, r2, r4)
            goto L_0x0abc
        L_0x0adb:
            java.lang.String r6 = X.C295505oK.A08(r0, r4)
            goto L_0x0abc
        L_0x0ae0:
            int r1 = X.Pxh.A08(r0, r4)
            goto L_0x0abc
        L_0x0ae5:
            X.C295505oK.A0B(r0, r7)
            com.google.android.gms.common.server.response.zal r11 = new com.google.android.gms.common.server.response.zal
            r11.<init>(r6, r5, r1)
            return r11
        L_0x0aee:
            int r7 = X.C295505oK.A00(r0)
            r6 = 0
            r5 = r6
            r1 = 0
        L_0x0af5:
            int r2 = r0.dataPosition()
            if (r2 >= r7) goto L_0x0b17
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 1
            if (r3 == r2) goto L_0x0b12
            r2 = 2
            if (r3 == r2) goto L_0x0b0b
            java.lang.String r5 = X.Pxj.A0o(r0, r5, r3, r4)
            goto L_0x0af5
        L_0x0b0b:
            android.os.Parcelable$Creator r2 = com.google.android.gms.common.server.response.zal.CREATOR
            java.util.ArrayList r6 = X.C295505oK.A0A(r0, r2, r4)
            goto L_0x0af5
        L_0x0b12:
            int r1 = X.Pxh.A08(r0, r4)
            goto L_0x0af5
        L_0x0b17:
            X.C295505oK.A0B(r0, r7)
            com.google.android.gms.common.server.response.zan r11 = new com.google.android.gms.common.server.response.zan
            r11.<init>(r5, r6, r1)
            return r11
        L_0x0b20:
            int r7 = X.C295505oK.A00(r0)
            r6 = 0
            r2 = r6
            r1 = 0
        L_0x0b27:
            int r3 = r0.dataPosition()
            if (r3 >= r7) goto L_0x0b52
            int r5 = r0.readInt()
            char r4 = (char) r5
            r3 = 1
            if (r4 == r3) goto L_0x0b4d
            r3 = 2
            if (r4 == r3) goto L_0x0b48
            r3 = 3
            if (r4 == r3) goto L_0x0b3f
            X.C295505oK.A0C(r0, r5)
            goto L_0x0b27
        L_0x0b3f:
            X.SWX r2 = com.google.android.gms.common.server.response.FastJsonResponse$Field.CREATOR
            android.os.Parcelable r2 = X.C295505oK.A04(r0, r2, r5)
            com.google.android.gms.common.server.response.FastJsonResponse$Field r2 = (com.google.android.gms.common.server.response.FastJsonResponse$Field) r2
            goto L_0x0b27
        L_0x0b48:
            java.lang.String r6 = X.C295505oK.A08(r0, r5)
            goto L_0x0b27
        L_0x0b4d:
            int r1 = X.Pxh.A08(r0, r5)
            goto L_0x0b27
        L_0x0b52:
            X.C295505oK.A0B(r0, r7)
            com.google.android.gms.common.server.response.zam r11 = new com.google.android.gms.common.server.response.zam
            r11.<init>(r2, r6, r1)
            return r11
        L_0x0b5b:
            int r3 = X.C295505oK.A00(r0)
            r13 = 0
            r14 = r13
            r12 = r13
            r15 = 0
            r16 = 0
            r19 = 0
            r17 = 0
            r20 = 0
            r18 = 0
        L_0x0b6d:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x0bb0
            int r2 = r0.readInt()
            char r1 = (char) r2
            switch(r1) {
                case 1: goto L_0x0b8e;
                case 2: goto L_0x0b89;
                case 3: goto L_0x0bab;
                case 4: goto L_0x0b84;
                case 5: goto L_0x0ba6;
                case 6: goto L_0x0ba1;
                case 7: goto L_0x0b7f;
                case 8: goto L_0x0b9c;
                case 9: goto L_0x0b93;
                default: goto L_0x0b7b;
            }
        L_0x0b7b:
            X.C295505oK.A0C(r0, r2)
            goto L_0x0b6d
        L_0x0b7f:
            int r18 = X.Pxh.A08(r0, r2)
            goto L_0x0b6d
        L_0x0b84:
            int r17 = X.Pxh.A08(r0, r2)
            goto L_0x0b6d
        L_0x0b89:
            int r16 = X.Pxh.A08(r0, r2)
            goto L_0x0b6d
        L_0x0b8e:
            int r15 = X.Pxh.A08(r0, r2)
            goto L_0x0b6d
        L_0x0b93:
            android.os.Parcelable$Creator r1 = com.google.android.gms.common.server.converter.zaa.CREATOR
            android.os.Parcelable r12 = X.C295505oK.A04(r0, r1, r2)
            com.google.android.gms.common.server.converter.zaa r12 = (com.google.android.gms.common.server.converter.zaa) r12
            goto L_0x0b6d
        L_0x0b9c:
            java.lang.String r14 = X.C295505oK.A08(r0, r2)
            goto L_0x0b6d
        L_0x0ba1:
            java.lang.String r13 = X.C295505oK.A08(r0, r2)
            goto L_0x0b6d
        L_0x0ba6:
            boolean r20 = X.C295505oK.A0G(r0, r2)
            goto L_0x0b6d
        L_0x0bab:
            boolean r19 = X.C295505oK.A0G(r0, r2)
            goto L_0x0b6d
        L_0x0bb0:
            X.C295505oK.A0B(r0, r3)
            com.google.android.gms.common.server.response.FastJsonResponse$Field r11 = new com.google.android.gms.common.server.response.FastJsonResponse$Field
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r11
        L_0x0bb9:
            int r7 = X.C295505oK.A00(r0)
            r1 = 0
            r6 = 0
            r5 = 0
        L_0x0bc0:
            int r2 = r0.dataPosition()
            if (r2 >= r7) goto L_0x0be1
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 1
            if (r3 == r2) goto L_0x0bdc
            r2 = 2
            if (r3 == r2) goto L_0x0bd7
            r2 = 3
            int r5 = X.Pxj.A09(r0, r3, r2, r4, r5)
            goto L_0x0bc0
        L_0x0bd7:
            java.lang.String r6 = X.C295505oK.A08(r0, r4)
            goto L_0x0bc0
        L_0x0bdc:
            int r1 = X.Pxh.A08(r0, r4)
            goto L_0x0bc0
        L_0x0be1:
            X.C295505oK.A0B(r0, r7)
            com.google.android.gms.common.server.converter.zac r11 = new com.google.android.gms.common.server.converter.zac
            r11.<init>(r1, r6, r5)
            return r11
        L_0x0bea:
            int r6 = X.C295505oK.A00(r0)
            r5 = 0
            r1 = 0
        L_0x0bf0:
            int r2 = r0.dataPosition()
            if (r2 >= r6) goto L_0x0c11
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 1
            if (r3 == r2) goto L_0x0c0c
            r2 = 2
            if (r3 == r2) goto L_0x0c05
            X.C295505oK.A0C(r0, r4)
            goto L_0x0bf0
        L_0x0c05:
            android.os.Parcelable$Creator r2 = com.google.android.gms.common.server.converter.zac.CREATOR
            java.util.ArrayList r5 = X.C295505oK.A0A(r0, r2, r4)
            goto L_0x0bf0
        L_0x0c0c:
            int r1 = X.Pxh.A08(r0, r4)
            goto L_0x0bf0
        L_0x0c11:
            X.C295505oK.A0B(r0, r6)
            com.google.android.gms.common.server.converter.StringToIntConverter r11 = new com.google.android.gms.common.server.converter.StringToIntConverter
            r11.<init>(r1, r5)
            return r11
        L_0x0c1a:
            int r6 = X.C295505oK.A00(r0)
            r2 = 0
            r1 = 0
        L_0x0c20:
            int r3 = r0.dataPosition()
            if (r3 >= r6) goto L_0x0c43
            int r5 = r0.readInt()
            char r4 = (char) r5
            r3 = 1
            if (r4 == r3) goto L_0x0c3e
            r3 = 2
            if (r4 == r3) goto L_0x0c35
            X.C295505oK.A0C(r0, r5)
            goto L_0x0c20
        L_0x0c35:
            android.os.Parcelable$Creator r2 = com.google.android.gms.common.server.converter.StringToIntConverter.CREATOR
            android.os.Parcelable r2 = X.C295505oK.A04(r0, r2, r5)
            com.google.android.gms.common.server.converter.StringToIntConverter r2 = (com.google.android.gms.common.server.converter.StringToIntConverter) r2
            goto L_0x0c20
        L_0x0c3e:
            int r1 = X.Pxh.A08(r0, r5)
            goto L_0x0c20
        L_0x0c43:
            X.C295505oK.A0B(r0, r6)
            com.google.android.gms.common.server.converter.zaa r11 = new com.google.android.gms.common.server.converter.zaa
            r11.<init>(r2, r1)
            return r11
        L_0x0c4c:
            int r5 = X.C295505oK.A00(r0)
            r12 = 0
            r13 = r12
            r14 = 0
            r15 = 0
            r4 = 0
        L_0x0c55:
            int r1 = r0.dataPosition()
            if (r1 >= r5) goto L_0x0c86
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            if (r2 == r1) goto L_0x0c81
            r1 = 2
            if (r2 == r1) goto L_0x0c7c
            r1 = 3
            if (r2 == r1) goto L_0x0c77
            r1 = 4
            if (r2 == r1) goto L_0x0c72
            r1 = 5
            int r4 = X.Pxj.A09(r0, r2, r1, r3, r4)
            goto L_0x0c55
        L_0x0c72:
            java.lang.Long r13 = X.C295505oK.A07(r0, r3)
            goto L_0x0c55
        L_0x0c77:
            java.lang.Long r12 = X.C295505oK.A07(r0, r3)
            goto L_0x0c55
        L_0x0c7c:
            int r15 = X.Pxh.A08(r0, r3)
            goto L_0x0c55
        L_0x0c81:
            int r14 = X.Pxh.A08(r0, r3)
            goto L_0x0c55
        L_0x0c86:
            X.C295505oK.A0B(r0, r5)
            com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate r11 = new com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate
            r16 = r4
            r11.<init>(r12, r13, r14, r15, r16)
            return r11
        L_0x0c91:
            int r6 = X.C295505oK.A00(r0)
            r1 = 0
            r5 = 0
        L_0x0c97:
            int r2 = r0.dataPosition()
            if (r2 >= r6) goto L_0x0cb0
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 1
            if (r3 == r2) goto L_0x0cab
            r2 = 2
            boolean r5 = X.Pxi.A1Q(r0, r3, r2, r4, r5)
            goto L_0x0c97
        L_0x0cab:
            int r1 = X.Pxh.A08(r0, r4)
            goto L_0x0c97
        L_0x0cb0:
            X.C295505oK.A0B(r0, r6)
            com.google.android.gms.common.moduleinstall.ModuleInstallResponse r11 = new com.google.android.gms.common.moduleinstall.ModuleInstallResponse
            r11.<init>(r1, r5)
            return r11
        L_0x0cb9:
            int r3 = X.C295505oK.A00(r0)
            r2 = 0
        L_0x0cbe:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x0cc9
            android.app.PendingIntent r2 = X.Pxk.A08(r2, r0)
            goto L_0x0cbe
        L_0x0cc9:
            X.C295505oK.A0B(r0, r3)
            com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse r11 = new com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse
            r11.<init>(r2)
            return r11
        L_0x0cd2:
            int r6 = X.C295505oK.A00(r0)
            r5 = 0
            r4 = 0
        L_0x0cd8:
            int r1 = r0.dataPosition()
            if (r1 >= r6) goto L_0x0cf1
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            if (r2 == r1) goto L_0x0cec
            r1 = 2
            int r4 = X.Pxj.A09(r0, r2, r1, r3, r4)
            goto L_0x0cd8
        L_0x0cec:
            boolean r5 = X.C295505oK.A0G(r0, r3)
            goto L_0x0cd8
        L_0x0cf1:
            X.C295505oK.A0B(r0, r6)
            com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse r11 = new com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse
            r11.<init>(r5, r4)
            return r11
        L_0x0cfa:
            int r8 = X.C295505oK.A00(r0)
            r7 = 0
            r6 = r7
            r5 = r7
            r4 = 0
        L_0x0d02:
            int r1 = r0.dataPosition()
            if (r1 >= r8) goto L_0x0d2d
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            if (r2 == r1) goto L_0x0d26
            r1 = 2
            if (r2 == r1) goto L_0x0d21
            r1 = 3
            if (r2 == r1) goto L_0x0d1c
            r1 = 4
            java.lang.String r5 = X.Pxi.A0f(r0, r5, r2, r1, r3)
            goto L_0x0d02
        L_0x0d1c:
            java.lang.String r6 = X.C295505oK.A08(r0, r3)
            goto L_0x0d02
        L_0x0d21:
            boolean r4 = X.C295505oK.A0G(r0, r3)
            goto L_0x0d02
        L_0x0d26:
            android.os.Parcelable$Creator r1 = com.google.android.gms.common.Feature.CREATOR
            java.util.ArrayList r7 = X.C295505oK.A0A(r0, r1, r3)
            goto L_0x0d02
        L_0x0d2d:
            X.C295505oK.A0B(r0, r8)
            com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest r11 = new com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest
            r11.<init>(r7, r4, r6, r5)
            return r11
        L_0x0d36:
            com.google.android.gms.common.internal.BinderWrapper r11 = new com.google.android.gms.common.internal.BinderWrapper
            r11.<init>(r0)
            return r11
        L_0x0d3c:
            int r5 = X.C295505oK.A00(r0)
            r4 = 0
        L_0x0d41:
            int r1 = r0.dataPosition()
            if (r1 >= r5) goto L_0x0d52
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            int r4 = X.Pxj.A09(r0, r2, r1, r3, r4)
            goto L_0x0d41
        L_0x0d52:
            X.C295505oK.A0B(r0, r5)
            com.google.android.gms.common.internal.zzak r11 = new com.google.android.gms.common.internal.zzak
            r11.<init>(r4)
            return r11
        L_0x0d5b:
            int r8 = X.C295505oK.A00(r0)
            r1 = 0
            r7 = 0
            r2 = 0
            r3 = 0
        L_0x0d63:
            int r4 = r0.dataPosition()
            if (r4 >= r8) goto L_0x0d96
            int r6 = r0.readInt()
            char r5 = (char) r6
            r4 = 1
            if (r5 == r4) goto L_0x0d91
            r4 = 2
            if (r5 == r4) goto L_0x0d8c
            r4 = 3
            if (r5 == r4) goto L_0x0d87
            r4 = 4
            if (r5 == r4) goto L_0x0d7e
            X.C295505oK.A0C(r0, r6)
            goto L_0x0d63
        L_0x0d7e:
            android.os.Parcelable$Creator r4 = com.google.android.gms.common.api.Scope.CREATOR
            java.lang.Object[] r7 = X.C295505oK.A0J(r0, r4, r6)
            com.google.android.gms.common.api.Scope[] r7 = (com.google.android.gms.common.api.Scope[]) r7
            goto L_0x0d63
        L_0x0d87:
            int r3 = X.Pxh.A08(r0, r6)
            goto L_0x0d63
        L_0x0d8c:
            int r2 = X.Pxh.A08(r0, r6)
            goto L_0x0d63
        L_0x0d91:
            int r1 = X.Pxh.A08(r0, r6)
            goto L_0x0d63
        L_0x0d96:
            X.C295505oK.A0B(r0, r8)
            com.google.android.gms.common.internal.zax r11 = new com.google.android.gms.common.internal.zax
            r11.<init>(r7, r1, r2, r3)
            return r11
        L_0x0d9f:
            int r5 = X.C295505oK.A00(r0)
            r12 = 0
            r13 = r12
            r14 = 0
            r15 = 0
            r4 = 0
        L_0x0da8:
            int r1 = r0.dataPosition()
            if (r1 >= r5) goto L_0x0ddd
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            if (r2 == r1) goto L_0x0dd8
            r1 = 2
            if (r2 == r1) goto L_0x0dd3
            r1 = 3
            if (r2 == r1) goto L_0x0dca
            r1 = 4
            if (r2 == r1) goto L_0x0dc5
            r1 = 5
            boolean r4 = X.Pxi.A1Q(r0, r2, r1, r3, r4)
            goto L_0x0da8
        L_0x0dc5:
            boolean r15 = X.C295505oK.A0G(r0, r3)
            goto L_0x0da8
        L_0x0dca:
            android.os.Parcelable$Creator r1 = com.google.android.gms.common.ConnectionResult.CREATOR
            android.os.Parcelable r13 = X.C295505oK.A04(r0, r1, r3)
            com.google.android.gms.common.ConnectionResult r13 = (com.google.android.gms.common.ConnectionResult) r13
            goto L_0x0da8
        L_0x0dd3:
            android.os.IBinder r12 = X.C295505oK.A03(r0, r3)
            goto L_0x0da8
        L_0x0dd8:
            int r14 = X.Pxh.A08(r0, r3)
            goto L_0x0da8
        L_0x0ddd:
            X.C295505oK.A0B(r0, r5)
            com.google.android.gms.common.internal.zav r11 = new com.google.android.gms.common.internal.zav
            r16 = r4
            r11.<init>(r12, r13, r14, r15, r16)
            return r11
        L_0x0de8:
            int r8 = X.C295505oK.A00(r0)
            r1 = 0
            r7 = 0
            r4 = r7
            r3 = 0
        L_0x0df0:
            int r2 = r0.dataPosition()
            if (r2 >= r8) goto L_0x0e27
            int r6 = r0.readInt()
            char r5 = (char) r6
            r2 = 1
            if (r5 == r2) goto L_0x0e22
            r2 = 2
            if (r5 == r2) goto L_0x0e19
            r2 = 3
            if (r5 == r2) goto L_0x0e14
            r2 = 4
            if (r5 == r2) goto L_0x0e0b
            X.C295505oK.A0C(r0, r6)
            goto L_0x0df0
        L_0x0e0b:
            android.os.Parcelable$Creator r2 = com.google.android.gms.auth.api.signin.GoogleSignInAccount.CREATOR
            android.os.Parcelable r4 = X.C295505oK.A04(r0, r2, r6)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r4 = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) r4
            goto L_0x0df0
        L_0x0e14:
            int r3 = X.Pxh.A08(r0, r6)
            goto L_0x0df0
        L_0x0e19:
            android.os.Parcelable$Creator r2 = android.accounts.Account.CREATOR
            android.os.Parcelable r7 = X.C295505oK.A04(r0, r2, r6)
            android.accounts.Account r7 = (android.accounts.Account) r7
            goto L_0x0df0
        L_0x0e22:
            int r1 = X.Pxh.A08(r0, r6)
            goto L_0x0df0
        L_0x0e27:
            X.C295505oK.A0B(r0, r8)
            com.google.android.gms.common.internal.zat r11 = new com.google.android.gms.common.internal.zat
            r11.<init>(r7, r4, r1, r3)
            return r11
        L_0x0e30:
            int r3 = X.C295505oK.A00(r0)
            r12 = 0
            r19 = 0
            r21 = 0
            r13 = r12
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = -1
        L_0x0e42:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x0e81
            int r2 = r0.readInt()
            char r1 = (char) r2
            switch(r1) {
                case 1: goto L_0x0e72;
                case 2: goto L_0x0e6d;
                case 3: goto L_0x0e68;
                case 4: goto L_0x0e59;
                case 5: goto L_0x0e54;
                case 6: goto L_0x0e7c;
                case 7: goto L_0x0e77;
                case 8: goto L_0x0e63;
                case 9: goto L_0x0e5e;
                default: goto L_0x0e50;
            }
        L_0x0e50:
            X.C295505oK.A0C(r0, r2)
            goto L_0x0e42
        L_0x0e54:
            long r21 = X.Pxi.A08(r0, r2)
            goto L_0x0e42
        L_0x0e59:
            long r19 = X.Pxi.A08(r0, r2)
            goto L_0x0e42
        L_0x0e5e:
            int r18 = X.Pxh.A08(r0, r2)
            goto L_0x0e42
        L_0x0e63:
            int r17 = X.Pxh.A08(r0, r2)
            goto L_0x0e42
        L_0x0e68:
            int r16 = X.Pxh.A08(r0, r2)
            goto L_0x0e42
        L_0x0e6d:
            int r15 = X.Pxh.A08(r0, r2)
            goto L_0x0e42
        L_0x0e72:
            int r14 = X.Pxh.A08(r0, r2)
            goto L_0x0e42
        L_0x0e77:
            java.lang.String r13 = X.C295505oK.A08(r0, r2)
            goto L_0x0e42
        L_0x0e7c:
            java.lang.String r12 = X.C295505oK.A08(r0, r2)
            goto L_0x0e42
        L_0x0e81:
            X.C295505oK.A0B(r0, r3)
            com.google.android.gms.common.internal.MethodInvocation r11 = new com.google.android.gms.common.internal.MethodInvocation
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r21)
            return r11
        L_0x0e8a:
            int r6 = X.C295505oK.A00(r0)
            r5 = 0
            r1 = 0
        L_0x0e90:
            int r2 = r0.dataPosition()
            if (r2 >= r6) goto L_0x0eb1
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 1
            if (r3 == r2) goto L_0x0eac
            r2 = 2
            if (r3 == r2) goto L_0x0ea5
            X.C295505oK.A0C(r0, r4)
            goto L_0x0e90
        L_0x0ea5:
            android.os.Parcelable$Creator r2 = com.google.android.gms.common.internal.MethodInvocation.CREATOR
            java.util.ArrayList r5 = X.C295505oK.A0A(r0, r2, r4)
            goto L_0x0e90
        L_0x0eac:
            int r1 = X.Pxh.A08(r0, r4)
            goto L_0x0e90
        L_0x0eb1:
            X.C295505oK.A0B(r0, r6)
            com.google.android.gms.common.internal.TelemetryData r11 = new com.google.android.gms.common.internal.TelemetryData
            r11.<init>(r1, r5)
            return r11
        L_0x0eba:
            int r6 = X.C295505oK.A00(r0)
            r5 = 0
            r1 = 0
        L_0x0ec0:
            int r2 = r0.dataPosition()
            if (r2 >= r6) goto L_0x0ed8
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 1
            if (r3 == r2) goto L_0x0ed3
            java.lang.String r5 = X.Pxj.A0n(r0, r5, r3, r4)
            goto L_0x0ec0
        L_0x0ed3:
            int r1 = X.Pxh.A08(r0, r4)
            goto L_0x0ec0
        L_0x0ed8:
            X.C295505oK.A0B(r0, r6)
            com.google.android.gms.common.internal.ClientIdentity r11 = new com.google.android.gms.common.internal.ClientIdentity
            r11.<init>(r1, r5)
            return r11
        L_0x0ee1:
            int r8 = X.C295505oK.A00(r0)
            r1 = 0
            r7 = 0
            r3 = 0
            r6 = 0
        L_0x0ee9:
            int r2 = r0.dataPosition()
            if (r2 >= r8) goto L_0x0f15
            int r5 = r0.readInt()
            char r4 = (char) r5
            r2 = 1
            if (r4 == r2) goto L_0x0f10
            r2 = 2
            if (r4 == r2) goto L_0x0f07
            r2 = 3
            if (r4 == r2) goto L_0x0f02
            int r6 = X.Pxj.A08(r0, r4, r5, r6)
            goto L_0x0ee9
        L_0x0f02:
            int r3 = X.Pxh.A08(r0, r5)
            goto L_0x0ee9
        L_0x0f07:
            android.os.Parcelable$Creator r2 = android.net.Uri.CREATOR
            android.os.Parcelable r7 = X.C295505oK.A04(r0, r2, r5)
            android.net.Uri r7 = (android.net.Uri) r7
            goto L_0x0ee9
        L_0x0f10:
            int r1 = X.Pxh.A08(r0, r5)
            goto L_0x0ee9
        L_0x0f15:
            X.C295505oK.A0B(r0, r8)
            com.google.android.gms.common.images.WebImage r11 = new com.google.android.gms.common.images.WebImage
            r11.<init>(r7, r1, r3, r6)
            return r11
        L_0x0f1e:
            int r4 = X.C295505oK.A00(r0)
            r14 = 0
            r13 = r14
            r12 = r14
            r15 = 0
            r16 = 0
        L_0x0f28:
            int r1 = r0.dataPosition()
            if (r1 >= r4) goto L_0x0f5e
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            if (r2 == r1) goto L_0x0f59
            r1 = 2
            if (r2 == r1) goto L_0x0f50
            r1 = 3
            if (r2 == r1) goto L_0x0f4b
            r1 = 4
            if (r2 == r1) goto L_0x0f46
            r1 = 1000(0x3e8, float:1.401E-42)
            int r15 = X.Pxj.A09(r0, r2, r1, r3, r15)
            goto L_0x0f28
        L_0x0f46:
            android.os.Bundle r12 = X.C295505oK.A02(r0, r3)
            goto L_0x0f28
        L_0x0f4b:
            int r16 = X.Pxh.A08(r0, r3)
            goto L_0x0f28
        L_0x0f50:
            android.os.Parcelable$Creator r1 = android.database.CursorWindow.CREATOR
            java.lang.Object[] r13 = X.C295505oK.A0J(r0, r1, r3)
            android.database.CursorWindow[] r13 = (android.database.CursorWindow[]) r13
            goto L_0x0f28
        L_0x0f59:
            java.lang.String[] r14 = X.C295505oK.A0K(r0, r3)
            goto L_0x0f28
        L_0x0f5e:
            X.C295505oK.A0B(r0, r4)
            com.google.android.gms.common.data.DataHolder r11 = new com.google.android.gms.common.data.DataHolder
            r11.<init>(r12, r13, r14, r15, r16)
            android.os.Bundle r0 = X.AnonymousClass7TE.A0a()
            r11.A00 = r0
            r5 = 0
            r3 = 0
        L_0x0f6e:
            java.lang.String[] r2 = r11.A07
            int r0 = r2.length
            if (r3 >= r0) goto L_0x0f7d
            android.os.Bundle r1 = r11.A00
            r0 = r2[r3]
            r1.putInt(r0, r3)
            int r3 = r3 + 1
            goto L_0x0f6e
        L_0x0f7d:
            android.database.CursorWindow[] r4 = r11.A06
            int r3 = r4.length
            int[] r0 = new int[r3]
            r11.A02 = r0
            r2 = 0
        L_0x0f85:
            if (r5 >= r3) goto L_0x0fa6
            int[] r0 = r11.A02
            r0[r5] = r2
            r0 = r4[r5]
            int r0 = r0.getStartPosition()
            int r1 = r2 - r0
            r0 = r4[r5]
            int r0 = r0.getNumRows()
            int r0 = r0 - r1
            int r2 = r2 + r0
            int r5 = r5 + 1
            goto L_0x0f85
        L_0x0f9e:
            X.C295505oK.A0B(r0, r3)
            com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails r11 = new com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails
            r11.<init>(r12, r13, r14, r15, r16, r17, r19, r20, r21)
        L_0x0fa6:
            return r11
        L_0x0fa7:
            int r7 = X.C295505oK.A00(r0)
            r1 = 0
            r6 = 0
            r5 = 0
        L_0x0fae:
            int r2 = r0.dataPosition()
            if (r2 >= r7) goto L_0x0fd3
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 1
            if (r3 == r2) goto L_0x0fce
            r2 = 2
            if (r3 == r2) goto L_0x0fc5
            r2 = 3
            int r5 = X.Pxj.A09(r0, r3, r2, r4, r5)
            goto L_0x0fae
        L_0x0fc5:
            android.os.Parcelable$Creator r2 = android.os.ParcelFileDescriptor.CREATOR
            android.os.Parcelable r6 = X.C295505oK.A04(r0, r2, r4)
            android.os.ParcelFileDescriptor r6 = (android.os.ParcelFileDescriptor) r6
            goto L_0x0fae
        L_0x0fce:
            int r1 = X.Pxh.A08(r0, r4)
            goto L_0x0fae
        L_0x0fd3:
            X.C295505oK.A0B(r0, r7)
            com.google.android.gms.common.data.BitmapTeleporter r11 = new com.google.android.gms.common.data.BitmapTeleporter
            r11.<init>(r6, r1, r5)
            return r11
        L_0x0fdc:
            int r6 = X.C295505oK.A00(r0)
            r5 = 0
            r1 = 0
        L_0x0fe2:
            int r2 = r0.dataPosition()
            if (r2 >= r6) goto L_0x0ffa
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 1
            if (r3 == r2) goto L_0x0ff5
            java.lang.String r5 = X.Pxj.A0n(r0, r5, r3, r4)
            goto L_0x0fe2
        L_0x0ff5:
            int r1 = X.Pxh.A08(r0, r4)
            goto L_0x0fe2
        L_0x0ffa:
            X.C295505oK.A0B(r0, r6)
            com.google.android.gms.common.api.Scope r11 = new com.google.android.gms.common.api.Scope
            r11.<init>(r1, r5)
            return r11
        L_0x1003:
            int r11 = X.C295505oK.A00(r0)
            r1 = 0
            r10 = r1
            r9 = r1
            r8 = r1
            r7 = r1
            r6 = r1
            r2 = r1
            r5 = 1
        L_0x100f:
            int r3 = r0.dataPosition()
            if (r3 >= r11) goto L_0x1051
            int r4 = r0.readInt()
            char r3 = (char) r4
            switch(r3) {
                case 2: goto L_0x1048;
                case 3: goto L_0x1043;
                case 4: goto L_0x103e;
                case 5: goto L_0x1039;
                case 6: goto L_0x1034;
                case 7: goto L_0x102f;
                case 8: goto L_0x102a;
                case 9: goto L_0x1021;
                default: goto L_0x101d;
            }
        L_0x101d:
            X.C295505oK.A0C(r0, r4)
            goto L_0x100f
        L_0x1021:
            android.os.Parcelable$Creator r2 = com.google.android.gms.phenotype.ExperimentTokens.CREATOR
            java.lang.Object[] r2 = X.C295505oK.A0J(r0, r2, r4)
            com.google.android.gms.phenotype.ExperimentTokens[] r2 = (com.google.android.gms.phenotype.ExperimentTokens[]) r2
            goto L_0x100f
        L_0x102a:
            boolean r5 = X.C295505oK.A0G(r0, r4)
            goto L_0x100f
        L_0x102f:
            byte[][] r6 = X.C295505oK.A0L(r0, r4)
            goto L_0x100f
        L_0x1034:
            int[] r7 = X.C295505oK.A0I(r0, r4)
            goto L_0x100f
        L_0x1039:
            java.lang.String[] r8 = X.C295505oK.A0K(r0, r4)
            goto L_0x100f
        L_0x103e:
            int[] r9 = X.C295505oK.A0I(r0, r4)
            goto L_0x100f
        L_0x1043:
            byte[] r10 = X.C295505oK.A0H(r0, r4)
            goto L_0x100f
        L_0x1048:
            android.os.Parcelable$Creator r1 = com.google.android.gms.internal.clearcut.zzr.CREATOR
            android.os.Parcelable r1 = X.C295505oK.A04(r0, r1, r4)
            com.google.android.gms.internal.clearcut.zzr r1 = (com.google.android.gms.internal.clearcut.zzr) r1
            goto L_0x100f
        L_0x1051:
            X.C295505oK.A0B(r0, r11)
            com.google.android.gms.clearcut.zze r11 = new com.google.android.gms.clearcut.zze
            r11.<init>()
            r11.A00 = r1
            r11.A02 = r10
            r11.A03 = r9
            r11.A06 = r8
            r11.A04 = r7
            r11.A07 = r6
            r11.A05 = r2
            r11.A01 = r5
            return r11
        L_0x106a:
            int r4 = X.C295505oK.A00(r0)
            r12 = 0
            r14 = 0
            r16 = 0
        L_0x1074:
            int r1 = r0.dataPosition()
            if (r1 >= r4) goto L_0x109b
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            if (r2 == r1) goto L_0x1096
            r1 = 2
            if (r2 == r1) goto L_0x1091
            r1 = 3
            if (r2 == r1) goto L_0x108c
            X.C295505oK.A0C(r0, r3)
            goto L_0x1074
        L_0x108c:
            long r12 = X.Pxi.A08(r0, r3)
            goto L_0x1074
        L_0x1091:
            long r14 = X.Pxi.A08(r0, r3)
            goto L_0x1074
        L_0x1096:
            boolean r16 = X.C295505oK.A0G(r0, r3)
            goto L_0x1074
        L_0x109b:
            X.C295505oK.A0B(r0, r4)
            com.google.android.gms.clearcut.zzc r11 = new com.google.android.gms.clearcut.zzc
            r11.<init>(r12, r14, r16)
            return r11
        L_0x10a4:
            int r3 = X.C295505oK.A00(r0)
            r13 = 0
            r12 = r13
            r15 = r13
            r14 = r13
            r16 = 0
            r17 = 0
            r18 = 0
        L_0x10b2:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x10e7
            int r2 = r0.readInt()
            char r1 = (char) r2
            switch(r1) {
                case 1: goto L_0x10c4;
                case 2: goto L_0x10e2;
                case 3: goto L_0x10dd;
                case 4: goto L_0x10d8;
                case 5: goto L_0x10d3;
                case 6: goto L_0x10ce;
                case 7: goto L_0x10c9;
                default: goto L_0x10c0;
            }
        L_0x10c0:
            X.C295505oK.A0C(r0, r2)
            goto L_0x10b2
        L_0x10c4:
            int r16 = X.Pxh.A08(r0, r2)
            goto L_0x10b2
        L_0x10c9:
            java.lang.String r14 = X.C295505oK.A08(r0, r2)
            goto L_0x10b2
        L_0x10ce:
            java.util.ArrayList r15 = X.C295505oK.A09(r0, r2)
            goto L_0x10b2
        L_0x10d3:
            boolean r18 = X.C295505oK.A0G(r0, r2)
            goto L_0x10b2
        L_0x10d8:
            boolean r17 = X.C295505oK.A0G(r0, r2)
            goto L_0x10b2
        L_0x10dd:
            java.lang.Long r12 = X.C295505oK.A07(r0, r2)
            goto L_0x10b2
        L_0x10e2:
            java.lang.String r13 = X.C295505oK.A08(r0, r2)
            goto L_0x10b2
        L_0x10e7:
            X.C295505oK.A0B(r0, r3)
            com.google.android.gms.auth.TokenData r11 = new com.google.android.gms.auth.TokenData
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            return r11
        L_0x10f0:
            int r6 = X.C295505oK.A00(r0)
            r5 = 0
            r1 = 0
        L_0x10f6:
            int r2 = r0.dataPosition()
            if (r2 >= r6) goto L_0x1117
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 1
            if (r3 == r2) goto L_0x1112
            r2 = 2
            if (r3 == r2) goto L_0x110b
            X.C295505oK.A0C(r0, r4)
            goto L_0x10f6
        L_0x110b:
            android.os.Parcelable$Creator r2 = com.google.android.gms.auth.AccountChangeEvent.CREATOR
            java.util.ArrayList r5 = X.C295505oK.A0A(r0, r2, r4)
            goto L_0x10f6
        L_0x1112:
            int r1 = X.Pxh.A08(r0, r4)
            goto L_0x10f6
        L_0x1117:
            X.C295505oK.A0B(r0, r6)
            com.google.android.gms.auth.AccountChangeEventsResponse r11 = new com.google.android.gms.auth.AccountChangeEventsResponse
            r11.<init>(r1, r5)
            return r11
        L_0x1120:
            int r8 = X.C295505oK.A00(r0)
            r1 = 0
            r7 = 0
            r3 = r7
            r2 = 0
        L_0x1128:
            int r4 = r0.dataPosition()
            if (r4 >= r8) goto L_0x115b
            int r6 = r0.readInt()
            char r5 = (char) r6
            r4 = 1
            if (r5 == r4) goto L_0x1156
            r4 = 2
            if (r5 == r4) goto L_0x1151
            r4 = 3
            if (r5 == r4) goto L_0x114c
            r4 = 4
            if (r5 == r4) goto L_0x1143
            X.C295505oK.A0C(r0, r6)
            goto L_0x1128
        L_0x1143:
            android.os.Parcelable$Creator r3 = android.accounts.Account.CREATOR
            android.os.Parcelable r3 = X.C295505oK.A04(r0, r3, r6)
            android.accounts.Account r3 = (android.accounts.Account) r3
            goto L_0x1128
        L_0x114c:
            java.lang.String r7 = X.C295505oK.A08(r0, r6)
            goto L_0x1128
        L_0x1151:
            int r2 = X.Pxh.A08(r0, r6)
            goto L_0x1128
        L_0x1156:
            int r1 = X.Pxh.A08(r0, r6)
            goto L_0x1128
        L_0x115b:
            X.C295505oK.A0B(r0, r8)
            com.google.android.gms.auth.AccountChangeEventsRequest r11 = new com.google.android.gms.auth.AccountChangeEventsRequest
            r11.<init>(r3, r7, r1, r2)
            return r11
        L_0x1164:
            int r3 = X.C295505oK.A00(r0)
            r12 = 0
            r13 = r12
            r17 = 0
            r14 = 0
            r15 = 0
            r16 = 0
        L_0x1170:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x11a0
            int r2 = r0.readInt()
            char r1 = (char) r2
            switch(r1) {
                case 1: goto L_0x1191;
                case 2: goto L_0x1182;
                case 3: goto L_0x119b;
                case 4: goto L_0x118c;
                case 5: goto L_0x1187;
                case 6: goto L_0x1196;
                default: goto L_0x117e;
            }
        L_0x117e:
            X.C295505oK.A0C(r0, r2)
            goto L_0x1170
        L_0x1182:
            long r17 = X.Pxi.A08(r0, r2)
            goto L_0x1170
        L_0x1187:
            int r16 = X.Pxh.A08(r0, r2)
            goto L_0x1170
        L_0x118c:
            int r15 = X.Pxh.A08(r0, r2)
            goto L_0x1170
        L_0x1191:
            int r14 = X.Pxh.A08(r0, r2)
            goto L_0x1170
        L_0x1196:
            java.lang.String r13 = X.C295505oK.A08(r0, r2)
            goto L_0x1170
        L_0x119b:
            java.lang.String r12 = X.C295505oK.A08(r0, r2)
            goto L_0x1170
        L_0x11a0:
            X.C295505oK.A0B(r0, r3)
            com.google.android.gms.auth.AccountChangeEvent r11 = new com.google.android.gms.auth.AccountChangeEvent
            r11.<init>(r12, r13, r14, r15, r16, r17)
            return r11
        L_0x11a9:
            int r7 = X.C295505oK.A00(r0)
            r1 = 278(0x116, float:3.9E-43)
            java.lang.String r6 = X.C66579MXk.A00(r1)
            r5 = 0
            r4 = 0
        L_0x11b5:
            int r1 = r0.dataPosition()
            if (r1 >= r7) goto L_0x11d5
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            if (r2 == r1) goto L_0x11d0
            r1 = 2
            if (r2 == r1) goto L_0x11cb
            java.lang.String r6 = X.Pxj.A0o(r0, r6, r2, r3)
            goto L_0x11b5
        L_0x11cb:
            boolean r5 = X.C295505oK.A0G(r0, r3)
            goto L_0x11b5
        L_0x11d0:
            byte[] r4 = X.C295505oK.A0H(r0, r3)
            goto L_0x11b5
        L_0x11d5:
            X.C295505oK.A0B(r0, r7)
            com.google.android.gms.auth.blockstore.StoreBytesData r11 = new com.google.android.gms.auth.blockstore.StoreBytesData
            r11.<init>(r6, r4, r5)
            return r11
        L_0x11de:
            int r6 = X.C295505oK.A00(r0)
            r5 = 0
            r4 = r5
        L_0x11e4:
            int r1 = r0.dataPosition()
            if (r1 >= r6) goto L_0x1205
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            if (r2 == r1) goto L_0x1200
            r1 = 2
            if (r2 == r1) goto L_0x11f9
            X.C295505oK.A0C(r0, r3)
            goto L_0x11e4
        L_0x11f9:
            android.os.Parcelable$Creator r1 = com.google.android.gms.auth.blockstore.RetrieveBytesResponse.BlockstoreData.CREATOR
            java.util.ArrayList r4 = X.C295505oK.A0A(r0, r1, r3)
            goto L_0x11e4
        L_0x1200:
            android.os.Bundle r5 = X.C295505oK.A02(r0, r3)
            goto L_0x11e4
        L_0x1205:
            X.C295505oK.A0B(r0, r6)
            com.google.android.gms.auth.blockstore.RetrieveBytesResponse r11 = new com.google.android.gms.auth.blockstore.RetrieveBytesResponse
            r11.<init>(r4, r5)
            return r11
        L_0x120e:
            int r6 = X.C295505oK.A00(r0)
            r5 = 0
            r4 = 0
        L_0x1214:
            int r1 = r0.dataPosition()
            if (r1 >= r6) goto L_0x122d
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            if (r2 == r1) goto L_0x1228
            r1 = 2
            boolean r5 = X.Pxi.A1Q(r0, r2, r1, r3, r5)
            goto L_0x1214
        L_0x1228:
            java.util.ArrayList r4 = X.C295505oK.A09(r0, r3)
            goto L_0x1214
        L_0x122d:
            X.C295505oK.A0B(r0, r6)
            com.google.android.gms.auth.blockstore.RetrieveBytesRequest r11 = new com.google.android.gms.auth.blockstore.RetrieveBytesRequest
            r11.<init>(r4, r5)
            return r11
        L_0x1236:
            int r6 = X.C295505oK.A00(r0)
            r5 = 0
            r4 = 0
        L_0x123c:
            int r1 = r0.dataPosition()
            if (r1 >= r6) goto L_0x1255
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            if (r2 == r1) goto L_0x1250
            r1 = 2
            boolean r5 = X.Pxi.A1Q(r0, r2, r1, r3, r5)
            goto L_0x123c
        L_0x1250:
            java.util.ArrayList r4 = X.C295505oK.A09(r0, r3)
            goto L_0x123c
        L_0x1255:
            X.C295505oK.A0B(r0, r6)
            com.google.android.gms.auth.blockstore.DeleteBytesRequest r11 = new com.google.android.gms.auth.blockstore.DeleteBytesRequest
            r11.<init>(r4, r5)
            return r11
        L_0x125e:
            int r6 = X.C295505oK.A00(r0)
            r5 = 0
            r4 = r5
        L_0x1264:
            int r1 = r0.dataPosition()
            if (r1 >= r6) goto L_0x127c
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            if (r2 == r1) goto L_0x1277
            java.lang.String r4 = X.Pxj.A0n(r0, r4, r2, r3)
            goto L_0x1264
        L_0x1277:
            byte[] r5 = X.C295505oK.A0H(r0, r3)
            goto L_0x1264
        L_0x127c:
            X.C295505oK.A0B(r0, r6)
            com.google.android.gms.auth.blockstore.RetrieveBytesResponse$BlockstoreData r11 = new com.google.android.gms.auth.blockstore.RetrieveBytesResponse$BlockstoreData
            r11.<init>(r5, r4)
            return r11
        L_0x1285:
            int r7 = X.C295505oK.A00(r0)
            java.lang.String r6 = ""
            r5 = 0
            r4 = r6
        L_0x128d:
            int r1 = r0.dataPosition()
            if (r1 >= r7) goto L_0x12b3
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 4
            if (r2 == r1) goto L_0x12ae
            r1 = 7
            if (r2 == r1) goto L_0x12a5
            r1 = 8
            java.lang.String r4 = X.Pxi.A0f(r0, r4, r2, r1, r3)
            goto L_0x128d
        L_0x12a5:
            android.os.Parcelable$Creator r1 = com.google.android.gms.auth.api.signin.GoogleSignInAccount.CREATOR
            android.os.Parcelable r5 = X.C295505oK.A04(r0, r1, r3)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r5 = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) r5
            goto L_0x128d
        L_0x12ae:
            java.lang.String r6 = X.C295505oK.A08(r0, r3)
            goto L_0x128d
        L_0x12b3:
            X.C295505oK.A0B(r0, r7)
            com.google.android.gms.auth.api.signin.SignInAccount r11 = new com.google.android.gms.auth.api.signin.SignInAccount
            r11.<init>(r6, r5, r4)
            return r11
        L_0x12bc:
            int r3 = X.C295505oK.A00(r0)
            r16 = 0
            r12 = r16
            r13 = r12
            r14 = r12
            r4 = r12
            r15 = r12
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
        L_0x12d0:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x131c
            int r2 = r0.readInt()
            char r1 = (char) r2
            switch(r1) {
                case 1: goto L_0x12e2;
                case 2: goto L_0x1315;
                case 3: goto L_0x130c;
                case 4: goto L_0x1307;
                case 5: goto L_0x1302;
                case 6: goto L_0x12fd;
                case 7: goto L_0x12f8;
                case 8: goto L_0x12f3;
                case 9: goto L_0x12ec;
                case 10: goto L_0x12e7;
                default: goto L_0x12de;
            }
        L_0x12de:
            X.C295505oK.A0C(r0, r2)
            goto L_0x12d0
        L_0x12e2:
            int r18 = X.Pxh.A08(r0, r2)
            goto L_0x12d0
        L_0x12e7:
            java.lang.String r15 = X.C295505oK.A08(r0, r2)
            goto L_0x12d0
        L_0x12ec:
            android.os.Parcelable$Creator r1 = com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable.CREATOR
            java.util.ArrayList r4 = X.C295505oK.A0A(r0, r1, r2)
            goto L_0x12d0
        L_0x12f3:
            java.lang.String r14 = X.C295505oK.A08(r0, r2)
            goto L_0x12d0
        L_0x12f8:
            java.lang.String r13 = X.C295505oK.A08(r0, r2)
            goto L_0x12d0
        L_0x12fd:
            boolean r21 = X.C295505oK.A0G(r0, r2)
            goto L_0x12d0
        L_0x1302:
            boolean r20 = X.C295505oK.A0G(r0, r2)
            goto L_0x12d0
        L_0x1307:
            boolean r19 = X.C295505oK.A0G(r0, r2)
            goto L_0x12d0
        L_0x130c:
            android.os.Parcelable$Creator r1 = android.accounts.Account.CREATOR
            android.os.Parcelable r12 = X.C295505oK.A04(r0, r1, r2)
            android.accounts.Account r12 = (android.accounts.Account) r12
            goto L_0x12d0
        L_0x1315:
            android.os.Parcelable$Creator r1 = com.google.android.gms.common.api.Scope.CREATOR
            java.util.ArrayList r16 = X.C295505oK.A0A(r0, r1, r2)
            goto L_0x12d0
        L_0x131c:
            X.C295505oK.A0B(r0, r3)
            android.os.Parcelable$Creator r0 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.CREATOR
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()
            if (r4 == 0) goto L_0x133d
            java.util.Iterator r2 = r4.iterator()
        L_0x132b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x133d
            java.lang.Object r1 = r2.next()
            com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable r1 = (com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable) r1
            int r0 = r1.A00
            X.Pxh.A1I(r1, r3, r0)
            goto L_0x132b
        L_0x133d:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r11 = new com.google.android.gms.auth.api.signin.GoogleSignInOptions
            r17 = r3
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r11
        L_0x1345:
            int r2 = X.C295505oK.A00(r0)
            r13 = 0
            r14 = r13
            r15 = r13
            r16 = r13
            r12 = r13
            r17 = r13
            r18 = r13
            r21 = r13
            r19 = r13
            r20 = r13
            r23 = 0
            r22 = 0
        L_0x135d:
            int r1 = r0.dataPosition()
            if (r1 >= r2) goto L_0x13b1
            int r1 = r0.readInt()
            char r3 = (char) r1
            switch(r3) {
                case 1: goto L_0x1374;
                case 2: goto L_0x13ac;
                case 3: goto L_0x13a7;
                case 4: goto L_0x13a2;
                case 5: goto L_0x139d;
                case 6: goto L_0x1394;
                case 7: goto L_0x138f;
                case 8: goto L_0x136f;
                case 9: goto L_0x138a;
                case 10: goto L_0x1383;
                case 11: goto L_0x137e;
                case 12: goto L_0x1379;
                default: goto L_0x136b;
            }
        L_0x136b:
            X.C295505oK.A0C(r0, r1)
            goto L_0x135d
        L_0x136f:
            long r23 = X.Pxi.A08(r0, r1)
            goto L_0x135d
        L_0x1374:
            int r22 = X.Pxh.A08(r0, r1)
            goto L_0x135d
        L_0x1379:
            java.lang.String r20 = X.C295505oK.A08(r0, r1)
            goto L_0x135d
        L_0x137e:
            java.lang.String r19 = X.C295505oK.A08(r0, r1)
            goto L_0x135d
        L_0x1383:
            android.os.Parcelable$Creator r3 = com.google.android.gms.common.api.Scope.CREATOR
            java.util.ArrayList r21 = X.C295505oK.A0A(r0, r3, r1)
            goto L_0x135d
        L_0x138a:
            java.lang.String r18 = X.C295505oK.A08(r0, r1)
            goto L_0x135d
        L_0x138f:
            java.lang.String r17 = X.C295505oK.A08(r0, r1)
            goto L_0x135d
        L_0x1394:
            android.os.Parcelable$Creator r3 = android.net.Uri.CREATOR
            android.os.Parcelable r12 = X.C295505oK.A04(r0, r3, r1)
            android.net.Uri r12 = (android.net.Uri) r12
            goto L_0x135d
        L_0x139d:
            java.lang.String r16 = X.C295505oK.A08(r0, r1)
            goto L_0x135d
        L_0x13a2:
            java.lang.String r15 = X.C295505oK.A08(r0, r1)
            goto L_0x135d
        L_0x13a7:
            java.lang.String r14 = X.C295505oK.A08(r0, r1)
            goto L_0x135d
        L_0x13ac:
            java.lang.String r13 = X.C295505oK.A08(r0, r1)
            goto L_0x135d
        L_0x13b1:
            X.C295505oK.A0B(r0, r2)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r11 = new com.google.android.gms.auth.api.signin.GoogleSignInAccount
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r11
        L_0x13ba:
            int r6 = X.C295505oK.A00(r0)
            r5 = 0
            r1 = r5
        L_0x13c0:
            int r2 = r0.dataPosition()
            if (r2 >= r6) goto L_0x13e3
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 2
            if (r3 == r2) goto L_0x13de
            r2 = 5
            if (r3 == r2) goto L_0x13d5
            X.C295505oK.A0C(r0, r4)
            goto L_0x13c0
        L_0x13d5:
            android.os.Parcelable$Creator r1 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.CREATOR
            android.os.Parcelable r1 = X.C295505oK.A04(r0, r1, r4)
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r1 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r1
            goto L_0x13c0
        L_0x13de:
            java.lang.String r5 = X.C295505oK.A08(r0, r4)
            goto L_0x13c0
        L_0x13e3:
            X.C295505oK.A0B(r0, r6)
            com.google.android.gms.auth.api.signin.internal.SignInConfiguration r11 = new com.google.android.gms.auth.api.signin.internal.SignInConfiguration
            r11.<init>(r1, r5)
            return r11
        L_0x13ec:
            int r7 = X.C295505oK.A00(r0)
            r1 = 0
            r6 = 0
            r2 = 0
        L_0x13f3:
            int r3 = r0.dataPosition()
            if (r3 >= r7) goto L_0x141a
            int r5 = r0.readInt()
            char r4 = (char) r5
            r3 = 1
            if (r4 == r3) goto L_0x1415
            r3 = 2
            if (r4 == r3) goto L_0x1410
            r3 = 3
            if (r4 == r3) goto L_0x140b
            X.C295505oK.A0C(r0, r5)
            goto L_0x13f3
        L_0x140b:
            android.os.Bundle r6 = X.C295505oK.A02(r0, r5)
            goto L_0x13f3
        L_0x1410:
            int r2 = X.Pxh.A08(r0, r5)
            goto L_0x13f3
        L_0x1415:
            int r1 = X.Pxh.A08(r0, r5)
            goto L_0x13f3
        L_0x141a:
            X.C295505oK.A0B(r0, r7)
            com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable r11 = new com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable
            r11.<init>(r6, r1, r2)
            return r11
        L_0x1423:
            int r3 = X.C295505oK.A00(r0)
            r12 = 0
            r13 = r12
            r14 = r12
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x142f:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x146d
            int r2 = r0.readInt()
            char r4 = (char) r2
            r1 = 1
            if (r4 == r1) goto L_0x1468
            r1 = 2
            if (r4 == r1) goto L_0x145f
            r1 = 3
            if (r4 == r1) goto L_0x145a
            r1 = 4
            if (r4 == r1) goto L_0x1455
            r1 = 5
            if (r4 == r1) goto L_0x1450
            r1 = 1000(0x3e8, float:1.401E-42)
            int r15 = X.Pxj.A09(r0, r4, r1, r2, r15)
            goto L_0x142f
        L_0x1450:
            byte[] r14 = X.C295505oK.A0H(r0, r2)
            goto L_0x142f
        L_0x1455:
            android.os.Bundle r13 = X.C295505oK.A02(r0, r2)
            goto L_0x142f
        L_0x145a:
            int r17 = X.Pxh.A08(r0, r2)
            goto L_0x142f
        L_0x145f:
            android.os.Parcelable$Creator r1 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r12 = X.C295505oK.A04(r0, r1, r2)
            android.app.PendingIntent r12 = (android.app.PendingIntent) r12
            goto L_0x142f
        L_0x1468:
            int r16 = X.Pxh.A08(r0, r2)
            goto L_0x142f
        L_0x146d:
            X.C295505oK.A0B(r0, r3)
            com.google.android.gms.auth.api.proxy.ProxyResponse r11 = new com.google.android.gms.auth.api.proxy.ProxyResponse
            r11.<init>(r12, r13, r14, r15, r16, r17)
            return r11
        L_0x1476:
            int r4 = X.C295505oK.A00(r0)
            r13 = 0
            r14 = r13
            r12 = r13
            r17 = 0
            r15 = 0
            r16 = 0
        L_0x1482:
            int r1 = r0.dataPosition()
            if (r1 >= r4) goto L_0x14bc
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            if (r2 == r1) goto L_0x14b7
            r1 = 2
            if (r2 == r1) goto L_0x14b2
            r1 = 3
            if (r2 == r1) goto L_0x14ad
            r1 = 4
            if (r2 == r1) goto L_0x14a8
            r1 = 5
            if (r2 == r1) goto L_0x14a3
            r1 = 1000(0x3e8, float:1.401E-42)
            int r15 = X.Pxj.A09(r0, r2, r1, r3, r15)
            goto L_0x1482
        L_0x14a3:
            android.os.Bundle r12 = X.C295505oK.A02(r0, r3)
            goto L_0x1482
        L_0x14a8:
            byte[] r14 = X.C295505oK.A0H(r0, r3)
            goto L_0x1482
        L_0x14ad:
            long r17 = X.Pxi.A08(r0, r3)
            goto L_0x1482
        L_0x14b2:
            int r16 = X.Pxh.A08(r0, r3)
            goto L_0x1482
        L_0x14b7:
            java.lang.String r13 = X.C295505oK.A08(r0, r3)
            goto L_0x1482
        L_0x14bc:
            X.C295505oK.A0B(r0, r4)
            com.google.android.gms.auth.api.proxy.ProxyRequest r11 = new com.google.android.gms.auth.api.proxy.ProxyRequest
            r11.<init>(r12, r13, r14, r15, r16, r17)
            return r11
        L_0x14c5:
            int r6 = X.C295505oK.A00(r0)
            r5 = 0
            r4 = r5
        L_0x14cb:
            int r1 = r0.dataPosition()
            if (r1 >= r6) goto L_0x14e3
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            if (r2 == r1) goto L_0x14de
            java.lang.String r4 = X.Pxj.A0n(r0, r4, r2, r3)
            goto L_0x14cb
        L_0x14de:
            java.lang.String r5 = X.C295505oK.A08(r0, r3)
            goto L_0x14cb
        L_0x14e3:
            X.C295505oK.A0B(r0, r6)
            com.google.android.gms.auth.api.identity.SignInPassword r11 = new com.google.android.gms.auth.api.identity.SignInPassword
            r11.<init>(r5, r4)
            return r11
        L_0x14ec:
            int r3 = X.C295505oK.A00(r0)
            r14 = 0
            r15 = r14
            r16 = r14
            r17 = r14
            r12 = r14
            r18 = r14
            r19 = r14
            r20 = r14
            r13 = r14
        L_0x14fe:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x1545
            int r2 = r0.readInt()
            char r1 = (char) r2
            switch(r1) {
                case 1: goto L_0x1540;
                case 2: goto L_0x153b;
                case 3: goto L_0x1536;
                case 4: goto L_0x1531;
                case 5: goto L_0x1528;
                case 6: goto L_0x1523;
                case 7: goto L_0x151e;
                case 8: goto L_0x1519;
                case 9: goto L_0x1510;
                default: goto L_0x150c;
            }
        L_0x150c:
            X.C295505oK.A0C(r0, r2)
            goto L_0x14fe
        L_0x1510:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.fido2.api.common.PublicKeyCredential.CREATOR
            android.os.Parcelable r13 = X.C295505oK.A04(r0, r1, r2)
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredential r13 = (com.google.android.gms.fido.fido2.api.common.PublicKeyCredential) r13
            goto L_0x14fe
        L_0x1519:
            java.lang.String r20 = X.C295505oK.A08(r0, r2)
            goto L_0x14fe
        L_0x151e:
            java.lang.String r19 = X.C295505oK.A08(r0, r2)
            goto L_0x14fe
        L_0x1523:
            java.lang.String r18 = X.C295505oK.A08(r0, r2)
            goto L_0x14fe
        L_0x1528:
            android.os.Parcelable$Creator r1 = android.net.Uri.CREATOR
            android.os.Parcelable r12 = X.C295505oK.A04(r0, r1, r2)
            android.net.Uri r12 = (android.net.Uri) r12
            goto L_0x14fe
        L_0x1531:
            java.lang.String r17 = X.C295505oK.A08(r0, r2)
            goto L_0x14fe
        L_0x1536:
            java.lang.String r16 = X.C295505oK.A08(r0, r2)
            goto L_0x14fe
        L_0x153b:
            java.lang.String r15 = X.C295505oK.A08(r0, r2)
            goto L_0x14fe
        L_0x1540:
            java.lang.String r14 = X.C295505oK.A08(r0, r2)
            goto L_0x14fe
        L_0x1545:
            X.C295505oK.A0B(r0, r3)
            com.google.android.gms.auth.api.identity.SignInCredential r11 = new com.google.android.gms.auth.api.identity.SignInCredential
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r11
        L_0x154e:
            int r3 = X.C295505oK.A00(r0)
            r2 = 0
        L_0x1553:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x155e
            android.app.PendingIntent r2 = X.Pxk.A08(r2, r0)
            goto L_0x1553
        L_0x155e:
            X.C295505oK.A0B(r0, r3)
            com.google.android.gms.auth.api.identity.SavePasswordResult r11 = new com.google.android.gms.auth.api.identity.SavePasswordResult
            r11.<init>(r2)
            return r11
        L_0x1567:
            int r7 = X.C295505oK.A00(r0)
            r1 = 0
            r6 = r1
            r5 = 0
        L_0x156e:
            int r2 = r0.dataPosition()
            if (r2 >= r7) goto L_0x1593
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 1
            if (r3 == r2) goto L_0x158a
            r2 = 2
            if (r3 == r2) goto L_0x1585
            r2 = 3
            int r5 = X.Pxj.A09(r0, r3, r2, r4, r5)
            goto L_0x156e
        L_0x1585:
            java.lang.String r6 = X.C295505oK.A08(r0, r4)
            goto L_0x156e
        L_0x158a:
            android.os.Parcelable$Creator r1 = com.google.android.gms.auth.api.identity.SignInPassword.CREATOR
            android.os.Parcelable r1 = X.C295505oK.A04(r0, r1, r4)
            com.google.android.gms.auth.api.identity.SignInPassword r1 = (com.google.android.gms.auth.api.identity.SignInPassword) r1
            goto L_0x156e
        L_0x1593:
            X.C295505oK.A0B(r0, r7)
            com.google.android.gms.auth.api.identity.SavePasswordRequest r11 = new com.google.android.gms.auth.api.identity.SavePasswordRequest
            r11.<init>(r1, r6, r5)
            return r11
        L_0x159c:
            int r3 = X.C295505oK.A00(r0)
            r2 = 0
        L_0x15a1:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x15ac
            android.app.PendingIntent r2 = X.Pxk.A08(r2, r0)
            goto L_0x15a1
        L_0x15ac:
            X.C295505oK.A0B(r0, r3)
            com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult r11 = new com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult
            r11.<init>(r2)
            return r11
        L_0x15b5:
            int r3 = X.C295505oK.A00(r0)
            r12 = 0
            r13 = r12
            r14 = r12
            r16 = r12
            r15 = r12
            r17 = 0
        L_0x15c1:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x15f5
            int r2 = r0.readInt()
            char r1 = (char) r2
            switch(r1) {
                case 1: goto L_0x15ec;
                case 2: goto L_0x15e7;
                case 3: goto L_0x15e2;
                case 4: goto L_0x15dd;
                case 5: goto L_0x15d8;
                case 6: goto L_0x15d3;
                default: goto L_0x15cf;
            }
        L_0x15cf:
            X.C295505oK.A0C(r0, r2)
            goto L_0x15c1
        L_0x15d3:
            int r17 = X.Pxh.A08(r0, r2)
            goto L_0x15c1
        L_0x15d8:
            java.lang.String r15 = X.C295505oK.A08(r0, r2)
            goto L_0x15c1
        L_0x15dd:
            java.util.ArrayList r16 = X.C295505oK.A09(r0, r2)
            goto L_0x15c1
        L_0x15e2:
            java.lang.String r14 = X.C295505oK.A08(r0, r2)
            goto L_0x15c1
        L_0x15e7:
            java.lang.String r13 = X.C295505oK.A08(r0, r2)
            goto L_0x15c1
        L_0x15ec:
            android.os.Parcelable$Creator r1 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r12 = X.C295505oK.A04(r0, r1, r2)
            android.app.PendingIntent r12 = (android.app.PendingIntent) r12
            goto L_0x15c1
        L_0x15f5:
            X.C295505oK.A0B(r0, r3)
            com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest r11 = new com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest
            r11.<init>(r12, r13, r14, r15, r16, r17)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SWX.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new SaveAccountLinkingTokenRequest[i];
            case 1:
                return new SaveAccountLinkingTokenResult[i];
            case 2:
                return new SavePasswordRequest[i];
            case 3:
                return new SavePasswordResult[i];
            case 4:
                return new SignInCredential[i];
            case 5:
                return new SignInPassword[i];
            case 6:
                return new ProxyRequest[i];
            case 7:
                return new ProxyResponse[i];
            case 8:
                return new GoogleSignInOptionsExtensionParcelable[i];
            case 9:
                return new SignInConfiguration[i];
            case 10:
                return new GoogleSignInAccount[i];
            case 11:
                return new GoogleSignInOptions[i];
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return new SignInAccount[i];
            case 13:
                return new RetrieveBytesResponse.BlockstoreData[i];
            case 14:
                return new DeleteBytesRequest[i];
            case 15:
                return new RetrieveBytesRequest[i];
            case 16:
                return new RetrieveBytesResponse[i];
            case 17:
                return new StoreBytesData[i];
            case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
                return new AccountChangeEvent[i];
            case 19:
                return new AccountChangeEventsRequest[i];
            case 20:
                return new AccountChangeEventsResponse[i];
            case 21:
                return new TokenData[i];
            case 22:
                return new zzc[i];
            case 23:
                return new zze[i];
            case 24:
                return new Scope[i];
            case 25:
                return new BitmapTeleporter[i];
            case 26:
                return new DataHolder[i];
            case 27:
                return new WebImage[i];
            case 28:
                return new ClientIdentity[i];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                return new TelemetryData[i];
            case 30:
                return new MethodInvocation[i];
            case 31:
                return new zat[i];
            case 32:
                return new zav[i];
            case 33:
                return new zax[i];
            case 34:
                return new zzak[i];
            case 35:
                return new BinderWrapper[i];
            case 36:
                return new ApiFeatureRequest[i];
            case 37:
                return new ModuleAvailabilityResponse[i];
            case 38:
                return new ModuleInstallIntentResponse[i];
            case 39:
                return new ModuleInstallResponse[i];
            case 40:
                return new ModuleInstallStatusUpdate[i];
            case Seq.NULL_REFNUM /*41*/:
                return new zaa[i];
            case Seq.RefTracker.REF_OFFSET /*42*/:
                return new StringToIntConverter[i];
            case 43:
                return new zac[i];
            case 44:
                return new FastJsonResponse$Field[i];
            case 45:
                return new zam[i];
            case 46:
                return new zan[i];
            case 47:
                return new zal[i];
            case 48:
                return new SafeParcelResponse[i];
            case 49:
                return new FavaDiagnosticsEntity[i];
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
                return new WakeLockEvent[i];
            case 51:
                return new zzo[i];
            case 52:
                return new zzq[i];
            case 53:
                return new zzs[i];
            case 54:
                return new MediaPerformanceClassResult[i];
            case 55:
                return new Transport[i];
            case 56:
                return new Attachment[i];
            case 57:
                return new zzz[i];
            case 58:
                return new zzab[i];
            case 59:
                return new zzad[i];
            case 60:
                return new GoogleThirdPartyPaymentExtension[i];
            case 61:
                return new zzag[i];
            case 62:
                return new zzai[i];
            case 63:
                return new com.google.android.gms.fido.fido2.api.common.zzak[i];
            case 64:
                return new PublicKeyCredentialCreationOptions[i];
            case 65:
                return new PublicKeyCredential[i];
            case 66:
                return new PublicKeyCredentialDescriptor[i];
            case 67:
                return new PublicKeyCredentialParameters[i];
            case 68:
                return new PublicKeyCredentialRequestOptions[i];
            case 69:
                return new PublicKeyCredentialRpEntity[i];
            case 70:
                return new PublicKeyCredentialType[i];
            case 71:
                return new PublicKeyCredentialUserEntity[i];
            case 72:
                return new ResidentKeyRequirement[i];
            case 73:
                return new zzaw[i];
            case 74:
                return new TokenBinding.TokenBindingStatus[i];
            case 75:
                return new TokenBinding[i];
            case 76:
                return new AttestationConveyancePreference[i];
            case 77:
                return new UserVerificationMethodExtension[i];
            case 78:
                return new UserVerificationRequirement[i];
            case 79:
                return new UvmEntries[i];
            case 80:
                return new UvmEntry[i];
            case 81:
                return new AuthenticationExtensionsClientOutputs[i];
            case 82:
                return new AuthenticationExtensions[i];
            case 83:
                return new AuthenticationExtensionsCredPropsOutputs[i];
            case 84:
                return new zzf[i];
            case 85:
                return new zzh[i];
            case 86:
                return new AuthenticatorAssertionResponse[i];
            case 87:
                return new AuthenticatorAttestationResponse[i];
            case 88:
                return new AuthenticatorErrorResponse[i];
            case 89:
                return new AuthenticatorSelectionCriteria[i];
            case 90:
                return new BrowserPublicKeyCredentialCreationOptions[i];
            case 91:
                return new BrowserPublicKeyCredentialRequestOptions[i];
            case 92:
                return new COSEAlgorithmIdentifier[i];
            case 93:
                return new com.google.android.gms.fido.fido2.api.common.zzq[i];
            case 94:
                return new com.google.android.gms.fido.fido2.api.common.zzs[i];
            case 95:
                return new zzu[i];
            case 96:
                return new ErrorCode[i];
            case 97:
                return new FidoAppIdExtension[i];
            case 98:
                return new FidoCredentialDetails[i];
            default:
                return new ChannelIdValue.ChannelIdValueType[i];
        }
    }
}
