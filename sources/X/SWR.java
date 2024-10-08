package X;

import android.os.Parcelable;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.google.android.gms.fido.u2f.api.common.ChannelIdValue;
import com.google.android.gms.fido.u2f.api.common.ErrorCode;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.google.android.gms.fido.u2f.api.common.KeyHandle;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.RegisterResponseData;
import com.google.android.gms.fido.u2f.api.common.RegisteredKey;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;
import com.google.android.gms.fido.u2f.api.common.SignResponseData;
import com.google.android.gms.internal.auth.zzaq;
import com.google.android.gms.internal.auth.zzav;
import com.google.android.gms.internal.auth.zzax;
import com.google.android.gms.internal.auth.zzaz;
import com.google.android.gms.internal.auth.zzbb;
import com.google.android.gms.internal.auth.zzbw;
import com.google.android.gms.internal.clearcut.zzr;
import com.google.android.gms.internal.gtm.zzbk;
import com.google.android.gms.internal.location.zzac;
import com.google.android.gms.internal.location.zzbc;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.internal.location.zzbg;
import com.google.android.gms.internal.location.zzj;
import com.google.android.gms.internal.location.zzl;
import com.google.android.gms.internal.mlkit_vision_text_common.zzd;
import com.google.android.gms.internal.mlkit_vision_text_common.zzf;
import com.google.android.gms.internal.mlkit_vision_text_common.zzn;
import com.google.android.gms.internal.mlkit_vision_text_common.zznl;
import com.google.android.gms.internal.mlkit_vision_text_common.zznr;
import com.google.android.gms.internal.mlkit_vision_text_common.zznt;
import com.google.android.gms.internal.mlkit_vision_text_common.zznv;
import com.google.android.gms.internal.mlkit_vision_text_common.zznx;
import com.google.android.gms.internal.mlkit_vision_text_common.zzp;
import com.google.android.gms.internal.p002authapi.zbp;
import com.google.android.gms.internal.p002authapi.zbu;
import com.google.android.gms.internal.vision.zzab;
import com.google.android.gms.internal.vision.zzah;
import com.google.android.gms.internal.vision.zzaj;
import com.google.android.gms.internal.vision.zzal;
import com.google.android.gms.internal.vision.zzam;
import com.google.android.gms.internal.vision.zzao;
import com.google.android.gms.internal.vision.zzfz;
import com.google.android.gms.internal.vision.zzk;
import com.google.android.gms.internal.vision.zzs;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.ActivityTransition;
import com.google.android.gms.location.ActivityTransitionEvent;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.ActivityTransitionResult;
import com.google.android.gms.location.DetectedActivity;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.LocationSettingsStates;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.zzay;
import com.google.android.gms.location.zzbd;
import com.google.android.gms.location.zzo;
import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.gms.phenotype.zzi;
import com.google.android.gms.safetynet.HarmfulAppsData;
import com.google.android.gms.safetynet.SafeBrowsingData;
import com.google.android.gms.safetynet.zza;
import com.google.android.gms.safetynet.zzh;
import com.google.android.gms.signin.internal.zaa;
import com.google.android.gms.signin.internal.zag;
import com.google.android.gms.signin.internal.zai;
import com.google.android.gms.signin.internal.zak;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.face.internal.client.FaceParcel;
import com.google.android.gms.vision.face.internal.client.LandmarkParcel;
import com.google.android.material.badge.BadgeDrawable$SavedState;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.CompositeDateValidator;
import com.google.android.material.datepicker.DateValidatorPointBackward;
import com.google.android.material.datepicker.DateValidatorPointForward;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import org.webrtc.EglBase14Impl;

public final class SWR implements Parcelable.Creator {
    public final int A00;

    public SWR(int i) {
        this.A00 = i;
    }

    public static SWR A00(int i) {
        return new SWR(i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: android.os.Parcel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v68, resolved type: com.google.android.gms.location.zzak} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v69, resolved type: com.google.android.gms.location.zzak} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v273, resolved type: com.google.android.gms.location.zzak} */
    /* JADX WARNING: type inference failed for: r15v19, types: [com.google.android.gms.internal.gtm.zzbk, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r15v21, types: [com.google.android.gms.internal.location.zzbc, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r15v25, types: [com.google.android.gms.internal.location.zzj, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r15v26, types: [com.google.android.gms.internal.location.zzl, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v33, types: [com.google.android.gms.internal.location.zzb] */
    /* JADX WARNING: type inference failed for: r15v27, types: [com.google.android.gms.internal.mlkit_vision_text_common.zzd, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r15v45, types: [com.google.android.gms.internal.vision.zzk, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r15v46, types: [java.lang.Object, com.google.android.gms.internal.vision.zzs] */
    /* JADX WARNING: type inference failed for: r15v49, types: [com.google.android.gms.location.LocationAvailability, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r15v51, types: [com.google.android.gms.location.LocationRequest, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r15v59, types: [com.google.android.gms.location.ActivityRecognitionResult, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r15v64, types: [java.lang.Object, com.google.android.gms.location.DetectedActivity] */
    /* JADX WARNING: type inference failed for: r15v65, types: [java.lang.Object, com.google.android.gms.location.zzo] */
    /* JADX WARNING: type inference failed for: r15v74, types: [com.google.android.gms.safetynet.SafeBrowsingData, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r15v79, types: [com.google.android.gms.vision.barcode.Barcode$Address, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r15v81, types: [java.lang.Object, com.google.android.gms.vision.barcode.Barcode] */
    /* JADX WARNING: type inference failed for: r15v82, types: [java.lang.Object, com.google.android.gms.vision.barcode.Barcode$CalendarDateTime] */
    /* JADX WARNING: type inference failed for: r15v83, types: [com.google.android.gms.vision.barcode.Barcode$ContactInfo, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r15v84, types: [com.google.android.gms.vision.barcode.Barcode$CalendarEvent, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r15v85, types: [com.google.android.gms.vision.barcode.Barcode$Email, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r15v87, types: [com.google.android.gms.vision.barcode.Barcode$DriverLicense, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r15v88, types: [com.google.android.gms.vision.barcode.Barcode$PersonName, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r15v89, types: [java.lang.Object, com.google.android.gms.vision.barcode.Barcode$GeoPoint] */
    /* JADX WARNING: type inference failed for: r15v90, types: [com.google.android.gms.vision.barcode.Barcode$Sms, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r15v91, types: [java.lang.Object, com.google.android.gms.vision.barcode.Barcode$Phone] */
    /* JADX WARNING: type inference failed for: r15v92, types: [com.google.android.gms.vision.barcode.Barcode$WiFi, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r15v93, types: [java.lang.Object, com.google.android.gms.vision.barcode.Barcode$UrlBookmark] */
    /* JADX WARNING: type inference failed for: r15v96, types: [com.google.android.gms.vision.face.internal.client.zzf, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r15v98, types: [com.google.android.material.badge.BadgeDrawable$SavedState, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v272 */
    /* JADX WARNING: CFG modification limit reached, blocks count: 1594 */
    /* JADX WARNING: Code restructure failed: missing block: B:533:0x0aea, code lost:
        if (r9.size() <= 0) goto L_0x0aec;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r32) {
        /*
            r31 = this;
            r0 = r31
            int r1 = r0.A00
            r0 = r32
            switch(r1) {
                case 0: goto L_0x1982;
                case 1: goto L_0x0013;
                case 2: goto L_0x195b;
                case 3: goto L_0x1919;
                case 4: goto L_0x190a;
                case 5: goto L_0x18d0;
                case 6: goto L_0x1871;
                case 7: goto L_0x1840;
                case 8: goto L_0x180b;
                case 9: goto L_0x17ae;
                case 10: goto L_0x1774;
                case 11: goto L_0x174b;
                case 12: goto L_0x1722;
                case 13: goto L_0x16fa;
                case 14: goto L_0x16c8;
                case 15: goto L_0x16a0;
                case 16: goto L_0x166e;
                case 17: goto L_0x1632;
                case 18: goto L_0x160b;
                case 19: goto L_0x15ad;
                case 20: goto L_0x1595;
                case 21: goto L_0x156c;
                case 22: goto L_0x14e4;
                case 23: goto L_0x1491;
                case 24: goto L_0x1431;
                case 25: goto L_0x13f3;
                case 26: goto L_0x1362;
                case 27: goto L_0x130e;
                case 28: goto L_0x12bd;
                case 29: goto L_0x123d;
                case 30: goto L_0x11ef;
                case 31: goto L_0x1197;
                case 32: goto L_0x1157;
                case 33: goto L_0x10ff;
                case 34: goto L_0x10cf;
                case 35: goto L_0x10b4;
                case 36: goto L_0x1096;
                case 37: goto L_0x1037;
                case 38: goto L_0x0fe6;
                case 39: goto L_0x0f66;
                case 40: goto L_0x0f3d;
                case 41: goto L_0x0f22;
                case 42: goto L_0x0f04;
                case 43: goto L_0x0ea5;
                case 44: goto L_0x0e57;
                case 45: goto L_0x0e2b;
                case 46: goto L_0x0dd7;
                case 47: goto L_0x0d9d;
                case 48: goto L_0x0d6a;
                case 49: goto L_0x0d11;
                case 50: goto L_0x0ca6;
                case 51: goto L_0x0c7e;
                case 52: goto L_0x0c4c;
                case 53: goto L_0x0c06;
                case 54: goto L_0x0bd0;
                case 55: goto L_0x0b87;
                case 56: goto L_0x0b43;
                case 57: goto L_0x0b0e;
                case 58: goto L_0x0a96;
                case 59: goto L_0x0a6e;
                case 60: goto L_0x0a36;
                case 61: goto L_0x09fb;
                case 62: goto L_0x09cb;
                case 63: goto L_0x099f;
                case 64: goto L_0x094b;
                case 65: goto L_0x0910;
                case 66: goto L_0x08b9;
                case 67: goto L_0x0862;
                case 68: goto L_0x0844;
                case 69: goto L_0x0814;
                case 70: goto L_0x07d0;
                case 71: goto L_0x07b2;
                case 72: goto L_0x078a;
                case 73: goto L_0x0734;
                case 74: goto L_0x06f9;
                case 75: goto L_0x06d2;
                case 76: goto L_0x06a0;
                case 77: goto L_0x0661;
                case 78: goto L_0x062f;
                case 79: goto L_0x0559;
                case 80: goto L_0x04fa;
                case 81: goto L_0x0493;
                case 82: goto L_0x0434;
                case 83: goto L_0x03f2;
                case 84: goto L_0x035d;
                case 85: goto L_0x0306;
                case 86: goto L_0x02d2;
                case 87: goto L_0x02a7;
                case 88: goto L_0x027c;
                case 89: goto L_0x0246;
                case 90: goto L_0x021b;
                case 91: goto L_0x01ef;
                case 92: goto L_0x015a;
                case 93: goto L_0x010a;
                case 94: goto L_0x00d1;
                case 95: goto L_0x0076;
                case 96: goto L_0x0054;
                case 97: goto L_0x0032;
                case 98: goto L_0x0028;
                default: goto L_0x0009;
            }
        L_0x0009:
            long r0 = r0.readLong()
            com.google.android.material.datepicker.DateValidatorPointForward r15 = new com.google.android.material.datepicker.DateValidatorPointForward
            r15.<init>(r0)
        L_0x0012:
            return r15
        L_0x0013:
            int r4 = r0.readInt()
            com.google.android.gms.fido.u2f.api.common.ErrorCode[] r3 = com.google.android.gms.fido.u2f.api.common.ErrorCode.values()
            int r2 = r3.length
            r1 = 0
        L_0x001d:
            if (r1 >= r2) goto L_0x19b3
            r15 = r3[r1]
            int r0 = r15.A00
            if (r4 == r0) goto L_0x0012
            int r1 = r1 + 1
            goto L_0x001d
        L_0x0028:
            long r0 = r0.readLong()
            com.google.android.material.datepicker.DateValidatorPointBackward r15 = new com.google.android.material.datepicker.DateValidatorPointBackward
            r15.<init>(r0)
            return r15
        L_0x0032:
            java.lang.Class<com.google.android.material.datepicker.CalendarConstraints$DateValidator> r1 = com.google.android.material.datepicker.CalendarConstraints.DateValidator.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.util.ArrayList r2 = r0.readArrayList(r1)
            int r1 = r0.readInt()
            r0 = 2
            if (r1 == r0) goto L_0x0051
            r0 = 1
            if (r1 != r0) goto L_0x0051
            X.TgG r0 = com.google.android.material.datepicker.CompositeDateValidator.A03
        L_0x0048:
            r2.getClass()
            com.google.android.material.datepicker.CompositeDateValidator r15 = new com.google.android.material.datepicker.CompositeDateValidator
            r15.<init>(r0, r2)
            return r15
        L_0x0051:
            X.TgG r0 = com.google.android.material.datepicker.CompositeDateValidator.A02
            goto L_0x0048
        L_0x0054:
            java.lang.Class<com.google.android.material.datepicker.Month> r1 = com.google.android.material.datepicker.Month.class
            android.os.Parcelable r4 = X.C41847B3o.A03(r0, r1)
            com.google.android.material.datepicker.Month r4 = (com.google.android.material.datepicker.Month) r4
            android.os.Parcelable r3 = X.C41847B3o.A03(r0, r1)
            com.google.android.material.datepicker.Month r3 = (com.google.android.material.datepicker.Month) r3
            android.os.Parcelable r2 = X.C41847B3o.A03(r0, r1)
            com.google.android.material.datepicker.Month r2 = (com.google.android.material.datepicker.Month) r2
            java.lang.Class<com.google.android.material.datepicker.CalendarConstraints$DateValidator> r1 = com.google.android.material.datepicker.CalendarConstraints.DateValidator.class
            android.os.Parcelable r0 = X.C41847B3o.A03(r0, r1)
            com.google.android.material.datepicker.CalendarConstraints$DateValidator r0 = (com.google.android.material.datepicker.CalendarConstraints.DateValidator) r0
            com.google.android.material.datepicker.CalendarConstraints r15 = new com.google.android.material.datepicker.CalendarConstraints
            r15.<init>(r0, r4, r3, r2)
            return r15
        L_0x0076:
            com.google.android.material.badge.BadgeDrawable$SavedState r15 = new com.google.android.material.badge.BadgeDrawable$SavedState
            r15.<init>()
            r1 = 255(0xff, float:3.57E-43)
            r15.A02 = r1
            r1 = -1
            r15.A0A = r1
            int r1 = r0.readInt()
            r15.A03 = r1
            int r1 = r0.readInt()
            r15.A05 = r1
            int r1 = r0.readInt()
            r15.A02 = r1
            int r1 = r0.readInt()
            r15.A0A = r1
            int r1 = r0.readInt()
            r15.A09 = r1
            java.lang.String r1 = r0.readString()
            r15.A0C = r1
            int r1 = r0.readInt()
            r15.A07 = r1
            int r1 = r0.readInt()
            r15.A04 = r1
            int r1 = r0.readInt()
            r15.A08 = r1
            int r1 = r0.readInt()
            r15.A0B = r1
            int r1 = r0.readInt()
            r15.A00 = r1
            int r1 = r0.readInt()
            r15.A01 = r1
            boolean r0 = X.C41848B3p.A1X(r0)
            r15.A0D = r0
            return r15
        L_0x00d1:
            int r8 = X.C295505oK.A00(r0)
            r2 = 0
            r3 = 0
            r1 = 0
            r7 = 0
        L_0x00d9:
            int r4 = r0.dataPosition()
            if (r4 >= r8) goto L_0x0101
            int r6 = r0.readInt()
            char r5 = (char) r6
            r4 = 1
            if (r5 == r4) goto L_0x00fc
            r4 = 2
            if (r5 == r4) goto L_0x00f7
            r4 = 3
            if (r5 == r4) goto L_0x00f2
            int r7 = X.Pxj.A08(r0, r5, r6, r7)
            goto L_0x00d9
        L_0x00f2:
            float r3 = X.Pxh.A01(r0, r6)
            goto L_0x00d9
        L_0x00f7:
            float r2 = X.Pxh.A01(r0, r6)
            goto L_0x00d9
        L_0x00fc:
            int r1 = X.Pxh.A08(r0, r6)
            goto L_0x00d9
        L_0x0101:
            X.C295505oK.A0B(r0, r8)
            com.google.android.gms.vision.face.internal.client.LandmarkParcel r15 = new com.google.android.gms.vision.face.internal.client.LandmarkParcel
            r15.<init>(r1, r2, r3, r7)
            return r15
        L_0x010a:
            int r9 = X.C295505oK.A00(r0)
            r1 = 0
            r2 = 0
            r3 = 0
            r8 = 0
            r7 = 0
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0115:
            int r5 = r0.dataPosition()
            if (r5 >= r9) goto L_0x0145
            int r6 = r0.readInt()
            char r5 = (char) r6
            switch(r5) {
                case 2: goto L_0x0136;
                case 3: goto L_0x0131;
                case 4: goto L_0x012c;
                case 5: goto L_0x0140;
                case 6: goto L_0x013b;
                case 7: goto L_0x0127;
                default: goto L_0x0123;
            }
        L_0x0123:
            X.C295505oK.A0C(r0, r6)
            goto L_0x0115
        L_0x0127:
            float r4 = X.Pxh.A01(r0, r6)
            goto L_0x0115
        L_0x012c:
            int r3 = X.Pxh.A08(r0, r6)
            goto L_0x0115
        L_0x0131:
            int r2 = X.Pxh.A08(r0, r6)
            goto L_0x0115
        L_0x0136:
            int r1 = X.Pxh.A08(r0, r6)
            goto L_0x0115
        L_0x013b:
            boolean r7 = X.C295505oK.A0G(r0, r6)
            goto L_0x0115
        L_0x0140:
            boolean r8 = X.C295505oK.A0G(r0, r6)
            goto L_0x0115
        L_0x0145:
            X.C295505oK.A0B(r0, r9)
            com.google.android.gms.vision.face.internal.client.zzf r15 = new com.google.android.gms.vision.face.internal.client.zzf
            r15.<init>()
            r15.A01 = r1
            r15.A02 = r2
            r15.A03 = r3
            r15.A04 = r8
            r15.A05 = r7
            r15.A00 = r4
            return r15
        L_0x015a:
            int r3 = X.C295505oK.A00(r0)
            r1 = 0
            r4 = r1
            r29 = 0
            r30 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r23 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r24 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x017d:
            int r2 = r0.dataPosition()
            if (r2 >= r3) goto L_0x01e2
            int r2 = r0.readInt()
            char r5 = (char) r2
            switch(r5) {
                case 1: goto L_0x01cb;
                case 2: goto L_0x01c6;
                case 3: goto L_0x01c1;
                case 4: goto L_0x01bc;
                case 5: goto L_0x01b7;
                case 6: goto L_0x01b2;
                case 7: goto L_0x01ad;
                case 8: goto L_0x01a8;
                case 9: goto L_0x01d9;
                case 10: goto L_0x01a3;
                case 11: goto L_0x019e;
                case 12: goto L_0x0199;
                case 13: goto L_0x01d0;
                case 14: goto L_0x0194;
                case 15: goto L_0x018f;
                default: goto L_0x018b;
            }
        L_0x018b:
            X.C295505oK.A0C(r0, r2)
            goto L_0x017d
        L_0x018f:
            float r28 = X.Pxh.A01(r0, r2)
            goto L_0x017d
        L_0x0194:
            float r24 = X.Pxh.A01(r0, r2)
            goto L_0x017d
        L_0x0199:
            float r27 = X.Pxh.A01(r0, r2)
            goto L_0x017d
        L_0x019e:
            float r26 = X.Pxh.A01(r0, r2)
            goto L_0x017d
        L_0x01a3:
            float r25 = X.Pxh.A01(r0, r2)
            goto L_0x017d
        L_0x01a8:
            float r23 = X.Pxh.A01(r0, r2)
            goto L_0x017d
        L_0x01ad:
            float r22 = X.Pxh.A01(r0, r2)
            goto L_0x017d
        L_0x01b2:
            float r21 = X.Pxh.A01(r0, r2)
            goto L_0x017d
        L_0x01b7:
            float r20 = X.Pxh.A01(r0, r2)
            goto L_0x017d
        L_0x01bc:
            float r19 = X.Pxh.A01(r0, r2)
            goto L_0x017d
        L_0x01c1:
            float r18 = X.Pxh.A01(r0, r2)
            goto L_0x017d
        L_0x01c6:
            int r30 = X.Pxh.A08(r0, r2)
            goto L_0x017d
        L_0x01cb:
            int r29 = X.Pxh.A08(r0, r2)
            goto L_0x017d
        L_0x01d0:
            android.os.Parcelable$Creator r4 = com.google.android.gms.vision.face.internal.client.zza.CREATOR
            java.lang.Object[] r4 = X.C295505oK.A0J(r0, r4, r2)
            com.google.android.gms.vision.face.internal.client.zza[] r4 = (com.google.android.gms.vision.face.internal.client.zza[]) r4
            goto L_0x017d
        L_0x01d9:
            android.os.Parcelable$Creator r1 = com.google.android.gms.vision.face.internal.client.LandmarkParcel.CREATOR
            java.lang.Object[] r1 = X.C295505oK.A0J(r0, r1, r2)
            com.google.android.gms.vision.face.internal.client.LandmarkParcel[] r1 = (com.google.android.gms.vision.face.internal.client.LandmarkParcel[]) r1
            goto L_0x017d
        L_0x01e2:
            X.C295505oK.A0B(r0, r3)
            com.google.android.gms.vision.face.internal.client.FaceParcel r15 = new com.google.android.gms.vision.face.internal.client.FaceParcel
            r16 = r1
            r17 = r4
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            return r15
        L_0x01ef:
            int r6 = X.C295505oK.A00(r0)
            r1 = 0
            r5 = 0
        L_0x01f5:
            int r2 = r0.dataPosition()
            if (r2 >= r6) goto L_0x0212
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 2
            if (r3 == r2) goto L_0x0209
            r2 = 3
            int r5 = X.Pxj.A09(r0, r3, r2, r4, r5)
            goto L_0x01f5
        L_0x0209:
            android.os.Parcelable$Creator r1 = android.graphics.PointF.CREATOR
            java.lang.Object[] r1 = X.C295505oK.A0J(r0, r1, r4)
            android.graphics.PointF[] r1 = (android.graphics.PointF[]) r1
            goto L_0x01f5
        L_0x0212:
            X.C295505oK.A0B(r0, r6)
            com.google.android.gms.vision.face.internal.client.zza r15 = new com.google.android.gms.vision.face.internal.client.zza
            r15.<init>(r1, r5)
            return r15
        L_0x021b:
            int r6 = X.C295505oK.A00(r0)
            r5 = 0
            r4 = r5
        L_0x0221:
            int r1 = r0.dataPosition()
            if (r1 >= r6) goto L_0x0239
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 2
            if (r2 == r1) goto L_0x0234
            java.lang.String r4 = X.Pxj.A0o(r0, r4, r2, r3)
            goto L_0x0221
        L_0x0234:
            java.lang.String r5 = X.C295505oK.A08(r0, r3)
            goto L_0x0221
        L_0x0239:
            X.C295505oK.A0B(r0, r6)
            com.google.android.gms.vision.barcode.Barcode$UrlBookmark r15 = new com.google.android.gms.vision.barcode.Barcode$UrlBookmark
            r15.<init>()
            r15.A00 = r5
            r15.A01 = r4
            return r15
        L_0x0246:
            int r7 = X.C295505oK.A00(r0)
            r6 = 0
            r5 = r6
            r4 = 0
        L_0x024d:
            int r1 = r0.dataPosition()
            if (r1 >= r7) goto L_0x026d
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 2
            if (r2 == r1) goto L_0x0268
            r1 = 3
            if (r2 == r1) goto L_0x0263
            int r4 = X.Pxj.A08(r0, r2, r3, r4)
            goto L_0x024d
        L_0x0263:
            java.lang.String r5 = X.C295505oK.A08(r0, r3)
            goto L_0x024d
        L_0x0268:
            java.lang.String r6 = X.C295505oK.A08(r0, r3)
            goto L_0x024d
        L_0x026d:
            X.C295505oK.A0B(r0, r7)
            com.google.android.gms.vision.barcode.Barcode$WiFi r15 = new com.google.android.gms.vision.barcode.Barcode$WiFi
            r15.<init>()
            r15.A02 = r6
            r15.A01 = r5
            r15.A00 = r4
            return r15
        L_0x027c:
            int r6 = X.C295505oK.A00(r0)
            r1 = 0
            r5 = 0
        L_0x0282:
            int r2 = r0.dataPosition()
            if (r2 >= r6) goto L_0x029a
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 2
            if (r3 == r2) goto L_0x0295
            java.lang.String r5 = X.Pxj.A0o(r0, r5, r3, r4)
            goto L_0x0282
        L_0x0295:
            int r1 = X.Pxh.A08(r0, r4)
            goto L_0x0282
        L_0x029a:
            X.C295505oK.A0B(r0, r6)
            com.google.android.gms.vision.barcode.Barcode$Phone r15 = new com.google.android.gms.vision.barcode.Barcode$Phone
            r15.<init>()
            r15.A00 = r1
            r15.A01 = r5
            return r15
        L_0x02a7:
            int r6 = X.C295505oK.A00(r0)
            r5 = 0
            r4 = r5
        L_0x02ad:
            int r1 = r0.dataPosition()
            if (r1 >= r6) goto L_0x02c5
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 2
            if (r2 == r1) goto L_0x02c0
            java.lang.String r4 = X.Pxj.A0o(r0, r4, r2, r3)
            goto L_0x02ad
        L_0x02c0:
            java.lang.String r5 = X.C295505oK.A08(r0, r3)
            goto L_0x02ad
        L_0x02c5:
            X.C295505oK.A0B(r0, r6)
            com.google.android.gms.vision.barcode.Barcode$Sms r15 = new com.google.android.gms.vision.barcode.Barcode$Sms
            r15.<init>()
            r15.A00 = r5
            r15.A01 = r4
            return r15
        L_0x02d2:
            int r8 = X.C295505oK.A00(r0)
            r1 = 0
            r3 = 0
        L_0x02da:
            int r5 = r0.dataPosition()
            if (r5 >= r8) goto L_0x02f9
            int r7 = r0.readInt()
            char r6 = (char) r7
            r5 = 2
            if (r6 == r5) goto L_0x02f4
            r5 = 3
            if (r6 == r5) goto L_0x02ef
            X.C295505oK.A0C(r0, r7)
            goto L_0x02da
        L_0x02ef:
            double r3 = X.Pxi.A00(r0, r7)
            goto L_0x02da
        L_0x02f4:
            double r1 = X.Pxi.A00(r0, r7)
            goto L_0x02da
        L_0x02f9:
            X.C295505oK.A0B(r0, r8)
            com.google.android.gms.vision.barcode.Barcode$GeoPoint r15 = new com.google.android.gms.vision.barcode.Barcode$GeoPoint
            r15.<init>()
            r15.A00 = r1
            r15.A01 = r3
            return r15
        L_0x0306:
            int r10 = X.C295505oK.A00(r0)
            r9 = 0
            r8 = r9
            r7 = r9
            r6 = r9
            r5 = r9
            r4 = r9
            r3 = r9
        L_0x0311:
            int r1 = r0.dataPosition()
            if (r1 >= r10) goto L_0x0346
            int r2 = r0.readInt()
            char r1 = (char) r2
            switch(r1) {
                case 2: goto L_0x0341;
                case 3: goto L_0x033c;
                case 4: goto L_0x0337;
                case 5: goto L_0x0332;
                case 6: goto L_0x032d;
                case 7: goto L_0x0328;
                case 8: goto L_0x0323;
                default: goto L_0x031f;
            }
        L_0x031f:
            X.C295505oK.A0C(r0, r2)
            goto L_0x0311
        L_0x0323:
            java.lang.String r3 = X.C295505oK.A08(r0, r2)
            goto L_0x0311
        L_0x0328:
            java.lang.String r4 = X.C295505oK.A08(r0, r2)
            goto L_0x0311
        L_0x032d:
            java.lang.String r5 = X.C295505oK.A08(r0, r2)
            goto L_0x0311
        L_0x0332:
            java.lang.String r6 = X.C295505oK.A08(r0, r2)
            goto L_0x0311
        L_0x0337:
            java.lang.String r7 = X.C295505oK.A08(r0, r2)
            goto L_0x0311
        L_0x033c:
            java.lang.String r8 = X.C295505oK.A08(r0, r2)
            goto L_0x0311
        L_0x0341:
            java.lang.String r9 = X.C295505oK.A08(r0, r2)
            goto L_0x0311
        L_0x0346:
            X.C295505oK.A0B(r0, r10)
            com.google.android.gms.vision.barcode.Barcode$PersonName r15 = new com.google.android.gms.vision.barcode.Barcode$PersonName
            r15.<init>()
            r15.A01 = r9
            r15.A05 = r8
            r15.A04 = r7
            r15.A00 = r6
            r15.A03 = r5
            r15.A02 = r4
            r15.A06 = r3
            return r15
        L_0x035d:
            int r15 = X.C295505oK.A00(r0)
            r14 = 0
            r17 = r14
            r16 = r14
            r12 = r14
            r11 = r14
            r10 = r14
            r9 = r14
            r8 = r14
            r7 = r14
            r6 = r14
            r5 = r14
            r4 = r14
            r3 = r14
            r2 = r14
        L_0x0371:
            int r1 = r0.dataPosition()
            if (r1 >= r15) goto L_0x03c9
            int r13 = r0.readInt()
            char r1 = (char) r13
            switch(r1) {
                case 2: goto L_0x03c4;
                case 3: goto L_0x03bf;
                case 4: goto L_0x03ba;
                case 5: goto L_0x03b5;
                case 6: goto L_0x03b0;
                case 7: goto L_0x03ab;
                case 8: goto L_0x03a6;
                case 9: goto L_0x03a1;
                case 10: goto L_0x039c;
                case 11: goto L_0x0397;
                case 12: goto L_0x0392;
                case 13: goto L_0x038d;
                case 14: goto L_0x0388;
                case 15: goto L_0x0383;
                default: goto L_0x037f;
            }
        L_0x037f:
            X.C295505oK.A0C(r0, r13)
            goto L_0x0371
        L_0x0383:
            java.lang.String r2 = X.C295505oK.A08(r0, r13)
            goto L_0x0371
        L_0x0388:
            java.lang.String r3 = X.C295505oK.A08(r0, r13)
            goto L_0x0371
        L_0x038d:
            java.lang.String r4 = X.C295505oK.A08(r0, r13)
            goto L_0x0371
        L_0x0392:
            java.lang.String r5 = X.C295505oK.A08(r0, r13)
            goto L_0x0371
        L_0x0397:
            java.lang.String r6 = X.C295505oK.A08(r0, r13)
            goto L_0x0371
        L_0x039c:
            java.lang.String r7 = X.C295505oK.A08(r0, r13)
            goto L_0x0371
        L_0x03a1:
            java.lang.String r8 = X.C295505oK.A08(r0, r13)
            goto L_0x0371
        L_0x03a6:
            java.lang.String r9 = X.C295505oK.A08(r0, r13)
            goto L_0x0371
        L_0x03ab:
            java.lang.String r10 = X.C295505oK.A08(r0, r13)
            goto L_0x0371
        L_0x03b0:
            java.lang.String r11 = X.C295505oK.A08(r0, r13)
            goto L_0x0371
        L_0x03b5:
            java.lang.String r12 = X.C295505oK.A08(r0, r13)
            goto L_0x0371
        L_0x03ba:
            java.lang.String r16 = X.C295505oK.A08(r0, r13)
            goto L_0x0371
        L_0x03bf:
            java.lang.String r17 = X.C295505oK.A08(r0, r13)
            goto L_0x0371
        L_0x03c4:
            java.lang.String r14 = X.C295505oK.A08(r0, r13)
            goto L_0x0371
        L_0x03c9:
            X.C295505oK.A0B(r0, r15)
            com.google.android.gms.vision.barcode.Barcode$DriverLicense r15 = new com.google.android.gms.vision.barcode.Barcode$DriverLicense
            r15.<init>()
            r15.A05 = r14
            r0 = r17
            r15.A07 = r0
            r0 = r16
            r15.A0D = r0
            r15.A0B = r12
            r15.A08 = r11
            r15.A02 = r10
            r15.A00 = r9
            r15.A01 = r8
            r15.A03 = r7
            r15.A0C = r6
            r15.A09 = r5
            r15.A06 = r4
            r15.A04 = r3
            r15.A0A = r2
            return r15
        L_0x03f2:
            int r8 = X.C295505oK.A00(r0)
            r7 = 0
            r6 = r7
            r5 = r7
            r1 = 0
        L_0x03fa:
            int r2 = r0.dataPosition()
            if (r2 >= r8) goto L_0x0423
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 2
            if (r3 == r2) goto L_0x041e
            r2 = 3
            if (r3 == r2) goto L_0x0419
            r2 = 4
            if (r3 == r2) goto L_0x0414
            r2 = 5
            java.lang.String r5 = X.Pxi.A0f(r0, r5, r3, r2, r4)
            goto L_0x03fa
        L_0x0414:
            java.lang.String r6 = X.C295505oK.A08(r0, r4)
            goto L_0x03fa
        L_0x0419:
            java.lang.String r7 = X.C295505oK.A08(r0, r4)
            goto L_0x03fa
        L_0x041e:
            int r1 = X.Pxh.A08(r0, r4)
            goto L_0x03fa
        L_0x0423:
            X.C295505oK.A0B(r0, r8)
            com.google.android.gms.vision.barcode.Barcode$Email r15 = new com.google.android.gms.vision.barcode.Barcode$Email
            r15.<init>()
            r15.A00 = r1
            r15.A01 = r7
            r15.A03 = r6
            r15.A02 = r5
            return r15
        L_0x0434:
            int r10 = X.C295505oK.A00(r0)
            r9 = 0
            r8 = r9
            r7 = r9
            r6 = r9
            r5 = r9
            r1 = r9
            r2 = r9
        L_0x043f:
            int r3 = r0.dataPosition()
            if (r3 >= r10) goto L_0x047c
            int r4 = r0.readInt()
            char r3 = (char) r4
            switch(r3) {
                case 2: goto L_0x0477;
                case 3: goto L_0x0472;
                case 4: goto L_0x046d;
                case 5: goto L_0x0468;
                case 6: goto L_0x0463;
                case 7: goto L_0x045a;
                case 8: goto L_0x0451;
                default: goto L_0x044d;
            }
        L_0x044d:
            X.C295505oK.A0C(r0, r4)
            goto L_0x043f
        L_0x0451:
            android.os.Parcelable$Creator r2 = com.google.android.gms.vision.barcode.Barcode.CalendarDateTime.CREATOR
            android.os.Parcelable r2 = X.C295505oK.A04(r0, r2, r4)
            com.google.android.gms.vision.barcode.Barcode$CalendarDateTime r2 = (com.google.android.gms.vision.barcode.Barcode.CalendarDateTime) r2
            goto L_0x043f
        L_0x045a:
            android.os.Parcelable$Creator r1 = com.google.android.gms.vision.barcode.Barcode.CalendarDateTime.CREATOR
            android.os.Parcelable r1 = X.C295505oK.A04(r0, r1, r4)
            com.google.android.gms.vision.barcode.Barcode$CalendarDateTime r1 = (com.google.android.gms.vision.barcode.Barcode.CalendarDateTime) r1
            goto L_0x043f
        L_0x0463:
            java.lang.String r5 = X.C295505oK.A08(r0, r4)
            goto L_0x043f
        L_0x0468:
            java.lang.String r6 = X.C295505oK.A08(r0, r4)
            goto L_0x043f
        L_0x046d:
            java.lang.String r7 = X.C295505oK.A08(r0, r4)
            goto L_0x043f
        L_0x0472:
            java.lang.String r8 = X.C295505oK.A08(r0, r4)
            goto L_0x043f
        L_0x0477:
            java.lang.String r9 = X.C295505oK.A08(r0, r4)
            goto L_0x043f
        L_0x047c:
            X.C295505oK.A0B(r0, r10)
            com.google.android.gms.vision.barcode.Barcode$CalendarEvent r15 = new com.google.android.gms.vision.barcode.Barcode$CalendarEvent
            r15.<init>()
            r15.A06 = r9
            r15.A02 = r8
            r15.A03 = r7
            r15.A04 = r6
            r15.A05 = r5
            r15.A01 = r1
            r15.A00 = r2
            return r15
        L_0x0493:
            int r10 = X.C295505oK.A00(r0)
            r1 = 0
            r9 = r1
            r8 = r1
            r2 = r1
            r3 = r1
            r7 = r1
            r4 = r1
        L_0x049e:
            int r5 = r0.dataPosition()
            if (r5 >= r10) goto L_0x04e3
            int r6 = r0.readInt()
            char r5 = (char) r6
            switch(r5) {
                case 2: goto L_0x04da;
                case 3: goto L_0x04d5;
                case 4: goto L_0x04d0;
                case 5: goto L_0x04c7;
                case 6: goto L_0x04be;
                case 7: goto L_0x04b9;
                case 8: goto L_0x04b0;
                default: goto L_0x04ac;
            }
        L_0x04ac:
            X.C295505oK.A0C(r0, r6)
            goto L_0x049e
        L_0x04b0:
            android.os.Parcelable$Creator r4 = com.google.android.gms.vision.barcode.Barcode.Address.CREATOR
            java.lang.Object[] r4 = X.C295505oK.A0J(r0, r4, r6)
            com.google.android.gms.vision.barcode.Barcode$Address[] r4 = (com.google.android.gms.vision.barcode.Barcode.Address[]) r4
            goto L_0x049e
        L_0x04b9:
            java.lang.String[] r7 = X.C295505oK.A0K(r0, r6)
            goto L_0x049e
        L_0x04be:
            android.os.Parcelable$Creator r3 = com.google.android.gms.vision.barcode.Barcode.Email.CREATOR
            java.lang.Object[] r3 = X.C295505oK.A0J(r0, r3, r6)
            com.google.android.gms.vision.barcode.Barcode$Email[] r3 = (com.google.android.gms.vision.barcode.Barcode.Email[]) r3
            goto L_0x049e
        L_0x04c7:
            android.os.Parcelable$Creator r2 = com.google.android.gms.vision.barcode.Barcode.Phone.CREATOR
            java.lang.Object[] r2 = X.C295505oK.A0J(r0, r2, r6)
            com.google.android.gms.vision.barcode.Barcode$Phone[] r2 = (com.google.android.gms.vision.barcode.Barcode.Phone[]) r2
            goto L_0x049e
        L_0x04d0:
            java.lang.String r8 = X.C295505oK.A08(r0, r6)
            goto L_0x049e
        L_0x04d5:
            java.lang.String r9 = X.C295505oK.A08(r0, r6)
            goto L_0x049e
        L_0x04da:
            android.os.Parcelable$Creator r1 = com.google.android.gms.vision.barcode.Barcode.PersonName.CREATOR
            android.os.Parcelable r1 = X.C295505oK.A04(r0, r1, r6)
            com.google.android.gms.vision.barcode.Barcode$PersonName r1 = (com.google.android.gms.vision.barcode.Barcode.PersonName) r1
            goto L_0x049e
        L_0x04e3:
            X.C295505oK.A0B(r0, r10)
            com.google.android.gms.vision.barcode.Barcode$ContactInfo r15 = new com.google.android.gms.vision.barcode.Barcode$ContactInfo
            r15.<init>()
            r15.A00 = r1
            r15.A01 = r9
            r15.A02 = r8
            r15.A05 = r2
            r15.A04 = r3
            r15.A06 = r7
            r15.A03 = r4
            return r15
        L_0x04fa:
            int r11 = X.C295505oK.A00(r0)
            r10 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r9 = 0
        L_0x0506:
            int r7 = r0.dataPosition()
            if (r7 >= r11) goto L_0x0540
            int r8 = r0.readInt()
            char r7 = (char) r8
            switch(r7) {
                case 2: goto L_0x0531;
                case 3: goto L_0x052c;
                case 4: goto L_0x0527;
                case 5: goto L_0x0522;
                case 6: goto L_0x051d;
                case 7: goto L_0x0518;
                case 8: goto L_0x053b;
                case 9: goto L_0x0536;
                default: goto L_0x0514;
            }
        L_0x0514:
            X.C295505oK.A0C(r0, r8)
            goto L_0x0506
        L_0x0518:
            int r6 = X.Pxh.A08(r0, r8)
            goto L_0x0506
        L_0x051d:
            int r5 = X.Pxh.A08(r0, r8)
            goto L_0x0506
        L_0x0522:
            int r4 = X.Pxh.A08(r0, r8)
            goto L_0x0506
        L_0x0527:
            int r3 = X.Pxh.A08(r0, r8)
            goto L_0x0506
        L_0x052c:
            int r2 = X.Pxh.A08(r0, r8)
            goto L_0x0506
        L_0x0531:
            int r1 = X.Pxh.A08(r0, r8)
            goto L_0x0506
        L_0x0536:
            java.lang.String r10 = X.C295505oK.A08(r0, r8)
            goto L_0x0506
        L_0x053b:
            boolean r9 = X.C295505oK.A0G(r0, r8)
            goto L_0x0506
        L_0x0540:
            X.C295505oK.A0B(r0, r11)
            com.google.android.gms.vision.barcode.Barcode$CalendarDateTime r15 = new com.google.android.gms.vision.barcode.Barcode$CalendarDateTime
            r15.<init>()
            r15.A05 = r1
            r15.A03 = r2
            r15.A00 = r3
            r15.A01 = r4
            r15.A02 = r5
            r15.A04 = r6
            r15.A07 = r9
            r15.A06 = r10
            return r15
        L_0x0559:
            int r15 = X.C295505oK.A00(r0)
            r19 = 0
            r18 = r19
            r2 = r19
            r3 = r2
            r4 = r2
            r5 = r2
            r6 = r2
            r7 = r2
            r8 = r2
            r9 = r2
            r10 = r2
            r11 = r2
            r17 = r2
            r13 = 0
            r12 = 0
            r16 = 0
        L_0x0572:
            int r1 = r0.dataPosition()
            if (r1 >= r15) goto L_0x05fe
            int r14 = r0.readInt()
            char r1 = (char) r14
            switch(r1) {
                case 2: goto L_0x0589;
                case 3: goto L_0x05f8;
                case 4: goto L_0x05f2;
                case 5: goto L_0x0584;
                case 6: goto L_0x05e9;
                case 7: goto L_0x05e0;
                case 8: goto L_0x05d7;
                case 9: goto L_0x05ce;
                case 10: goto L_0x05c5;
                case 11: goto L_0x05bc;
                case 12: goto L_0x05b3;
                case 13: goto L_0x05aa;
                case 14: goto L_0x05a1;
                case 15: goto L_0x0598;
                case 16: goto L_0x0593;
                case 17: goto L_0x058e;
                default: goto L_0x0580;
            }
        L_0x0580:
            X.C295505oK.A0C(r0, r14)
            goto L_0x0572
        L_0x0584:
            int r12 = X.Pxh.A08(r0, r14)
            goto L_0x0572
        L_0x0589:
            int r13 = X.Pxh.A08(r0, r14)
            goto L_0x0572
        L_0x058e:
            boolean r16 = X.C295505oK.A0G(r0, r14)
            goto L_0x0572
        L_0x0593:
            byte[] r17 = X.C295505oK.A0H(r0, r14)
            goto L_0x0572
        L_0x0598:
            android.os.Parcelable$Creator r1 = com.google.android.gms.vision.barcode.Barcode.DriverLicense.CREATOR
            android.os.Parcelable r11 = X.C295505oK.A04(r0, r1, r14)
            com.google.android.gms.vision.barcode.Barcode$DriverLicense r11 = (com.google.android.gms.vision.barcode.Barcode.DriverLicense) r11
            goto L_0x0572
        L_0x05a1:
            android.os.Parcelable$Creator r1 = com.google.android.gms.vision.barcode.Barcode.ContactInfo.CREATOR
            android.os.Parcelable r10 = X.C295505oK.A04(r0, r1, r14)
            com.google.android.gms.vision.barcode.Barcode$ContactInfo r10 = (com.google.android.gms.vision.barcode.Barcode.ContactInfo) r10
            goto L_0x0572
        L_0x05aa:
            android.os.Parcelable$Creator r1 = com.google.android.gms.vision.barcode.Barcode.CalendarEvent.CREATOR
            android.os.Parcelable r9 = X.C295505oK.A04(r0, r1, r14)
            com.google.android.gms.vision.barcode.Barcode$CalendarEvent r9 = (com.google.android.gms.vision.barcode.Barcode.CalendarEvent) r9
            goto L_0x0572
        L_0x05b3:
            android.os.Parcelable$Creator r1 = com.google.android.gms.vision.barcode.Barcode.GeoPoint.CREATOR
            android.os.Parcelable r8 = X.C295505oK.A04(r0, r1, r14)
            com.google.android.gms.vision.barcode.Barcode$GeoPoint r8 = (com.google.android.gms.vision.barcode.Barcode.GeoPoint) r8
            goto L_0x0572
        L_0x05bc:
            android.os.Parcelable$Creator r1 = com.google.android.gms.vision.barcode.Barcode.UrlBookmark.CREATOR
            android.os.Parcelable r7 = X.C295505oK.A04(r0, r1, r14)
            com.google.android.gms.vision.barcode.Barcode$UrlBookmark r7 = (com.google.android.gms.vision.barcode.Barcode.UrlBookmark) r7
            goto L_0x0572
        L_0x05c5:
            android.os.Parcelable$Creator r1 = com.google.android.gms.vision.barcode.Barcode.WiFi.CREATOR
            android.os.Parcelable r6 = X.C295505oK.A04(r0, r1, r14)
            com.google.android.gms.vision.barcode.Barcode$WiFi r6 = (com.google.android.gms.vision.barcode.Barcode.WiFi) r6
            goto L_0x0572
        L_0x05ce:
            android.os.Parcelable$Creator r1 = com.google.android.gms.vision.barcode.Barcode.Sms.CREATOR
            android.os.Parcelable r5 = X.C295505oK.A04(r0, r1, r14)
            com.google.android.gms.vision.barcode.Barcode$Sms r5 = (com.google.android.gms.vision.barcode.Barcode.Sms) r5
            goto L_0x0572
        L_0x05d7:
            android.os.Parcelable$Creator r1 = com.google.android.gms.vision.barcode.Barcode.Phone.CREATOR
            android.os.Parcelable r4 = X.C295505oK.A04(r0, r1, r14)
            com.google.android.gms.vision.barcode.Barcode$Phone r4 = (com.google.android.gms.vision.barcode.Barcode.Phone) r4
            goto L_0x0572
        L_0x05e0:
            android.os.Parcelable$Creator r1 = com.google.android.gms.vision.barcode.Barcode.Email.CREATOR
            android.os.Parcelable r3 = X.C295505oK.A04(r0, r1, r14)
            com.google.android.gms.vision.barcode.Barcode$Email r3 = (com.google.android.gms.vision.barcode.Barcode.Email) r3
            goto L_0x0572
        L_0x05e9:
            android.os.Parcelable$Creator r1 = android.graphics.Point.CREATOR
            java.lang.Object[] r2 = X.C295505oK.A0J(r0, r1, r14)
            android.graphics.Point[] r2 = (android.graphics.Point[]) r2
            goto L_0x0572
        L_0x05f2:
            java.lang.String r18 = X.C295505oK.A08(r0, r14)
            goto L_0x0572
        L_0x05f8:
            java.lang.String r19 = X.C295505oK.A08(r0, r14)
            goto L_0x0572
        L_0x05fe:
            X.C295505oK.A0B(r0, r15)
            com.google.android.gms.vision.barcode.Barcode r15 = new com.google.android.gms.vision.barcode.Barcode
            r15.<init>()
            r15.A00 = r13
            r0 = r19
            r15.A0C = r0
            r0 = r17
            r15.A0E = r0
            r0 = r18
            r15.A0B = r0
            r15.A01 = r12
            r15.A0F = r2
            r0 = r16
            r15.A0D = r0
            r15.A05 = r3
            r15.A07 = r4
            r15.A08 = r5
            r15.A0A = r6
            r15.A09 = r7
            r15.A06 = r8
            r15.A02 = r9
            r15.A03 = r10
            r15.A04 = r11
            return r15
        L_0x062f:
            int r6 = X.C295505oK.A00(r0)
            r1 = 0
            r5 = 0
        L_0x0635:
            int r2 = r0.dataPosition()
            if (r2 >= r6) goto L_0x0654
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 2
            if (r3 == r2) goto L_0x064f
            r2 = 3
            if (r3 == r2) goto L_0x064a
            X.C295505oK.A0C(r0, r4)
            goto L_0x0635
        L_0x064a:
            java.lang.String[] r5 = X.C295505oK.A0K(r0, r4)
            goto L_0x0635
        L_0x064f:
            int r1 = X.Pxh.A08(r0, r4)
            goto L_0x0635
        L_0x0654:
            X.C295505oK.A0B(r0, r6)
            com.google.android.gms.vision.barcode.Barcode$Address r15 = new com.google.android.gms.vision.barcode.Barcode$Address
            r15.<init>()
            r15.A00 = r1
            r15.A01 = r5
            return r15
        L_0x0661:
            int r7 = X.C295505oK.A00(r0)
            r2 = 0
            r3 = r2
            r1 = 0
        L_0x0668:
            int r4 = r0.dataPosition()
            if (r4 >= r7) goto L_0x0697
            int r6 = r0.readInt()
            char r5 = (char) r6
            r4 = 1
            if (r5 == r4) goto L_0x0692
            r4 = 2
            if (r5 == r4) goto L_0x0689
            r4 = 3
            if (r5 == r4) goto L_0x0680
            X.C295505oK.A0C(r0, r6)
            goto L_0x0668
        L_0x0680:
            android.os.Parcelable$Creator r3 = com.google.android.gms.common.internal.zav.CREATOR
            android.os.Parcelable r3 = X.C295505oK.A04(r0, r3, r6)
            com.google.android.gms.common.internal.zav r3 = (com.google.android.gms.common.internal.zav) r3
            goto L_0x0668
        L_0x0689:
            android.os.Parcelable$Creator r2 = com.google.android.gms.common.ConnectionResult.CREATOR
            android.os.Parcelable r2 = X.C295505oK.A04(r0, r2, r6)
            com.google.android.gms.common.ConnectionResult r2 = (com.google.android.gms.common.ConnectionResult) r2
            goto L_0x0668
        L_0x0692:
            int r1 = X.Pxh.A08(r0, r6)
            goto L_0x0668
        L_0x0697:
            X.C295505oK.A0B(r0, r7)
            com.google.android.gms.signin.internal.zak r15 = new com.google.android.gms.signin.internal.zak
            r15.<init>(r2, r3, r1)
            return r15
        L_0x06a0:
            int r6 = X.C295505oK.A00(r0)
            r2 = 0
            r1 = 0
        L_0x06a6:
            int r3 = r0.dataPosition()
            if (r3 >= r6) goto L_0x06c9
            int r5 = r0.readInt()
            char r4 = (char) r5
            r3 = 1
            if (r4 == r3) goto L_0x06c4
            r3 = 2
            if (r4 == r3) goto L_0x06bb
            X.C295505oK.A0C(r0, r5)
            goto L_0x06a6
        L_0x06bb:
            android.os.Parcelable$Creator r2 = com.google.android.gms.common.internal.zat.CREATOR
            android.os.Parcelable r2 = X.C295505oK.A04(r0, r2, r5)
            com.google.android.gms.common.internal.zat r2 = (com.google.android.gms.common.internal.zat) r2
            goto L_0x06a6
        L_0x06c4:
            int r1 = X.Pxh.A08(r0, r5)
            goto L_0x06a6
        L_0x06c9:
            X.C295505oK.A0B(r0, r6)
            com.google.android.gms.signin.internal.zai r15 = new com.google.android.gms.signin.internal.zai
            r15.<init>(r2, r1)
            return r15
        L_0x06d2:
            int r6 = X.C295505oK.A00(r0)
            r5 = 0
            r4 = r5
        L_0x06d8:
            int r1 = r0.dataPosition()
            if (r1 >= r6) goto L_0x06f0
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            if (r2 == r1) goto L_0x06eb
            java.lang.String r4 = X.Pxj.A0n(r0, r4, r2, r3)
            goto L_0x06d8
        L_0x06eb:
            java.util.ArrayList r5 = X.C295505oK.A09(r0, r3)
            goto L_0x06d8
        L_0x06f0:
            X.C295505oK.A0B(r0, r6)
            com.google.android.gms.signin.internal.zag r15 = new com.google.android.gms.signin.internal.zag
            r15.<init>(r5, r4)
            return r15
        L_0x06f9:
            int r7 = X.C295505oK.A00(r0)
            r1 = 0
            r6 = 0
            r2 = 0
        L_0x0700:
            int r3 = r0.dataPosition()
            if (r3 >= r7) goto L_0x072b
            int r5 = r0.readInt()
            char r4 = (char) r5
            r3 = 1
            if (r4 == r3) goto L_0x0726
            r3 = 2
            if (r4 == r3) goto L_0x0721
            r3 = 3
            if (r4 == r3) goto L_0x0718
            X.C295505oK.A0C(r0, r5)
            goto L_0x0700
        L_0x0718:
            android.os.Parcelable$Creator r3 = android.content.Intent.CREATOR
            android.os.Parcelable r6 = X.C295505oK.A04(r0, r3, r5)
            android.content.Intent r6 = (android.content.Intent) r6
            goto L_0x0700
        L_0x0721:
            int r2 = X.Pxh.A08(r0, r5)
            goto L_0x0700
        L_0x0726:
            int r1 = X.Pxh.A08(r0, r5)
            goto L_0x0700
        L_0x072b:
            X.C295505oK.A0B(r0, r7)
            com.google.android.gms.signin.internal.zaa r15 = new com.google.android.gms.signin.internal.zaa
            r15.<init>(r1, r2, r6)
            return r15
        L_0x0734:
            int r9 = X.C295505oK.A00(r0)
            r8 = 0
            r1 = r8
            r2 = r8
            r7 = r8
            r3 = 0
        L_0x073e:
            int r5 = r0.dataPosition()
            if (r5 >= r9) goto L_0x0777
            int r6 = r0.readInt()
            char r10 = (char) r6
            r5 = 2
            if (r10 == r5) goto L_0x0772
            r5 = 3
            if (r10 == r5) goto L_0x0769
            r5 = 4
            if (r10 == r5) goto L_0x0760
            r5 = 5
            if (r10 == r5) goto L_0x075b
            r5 = 6
            byte[] r7 = X.Pxi.A1a(r0, r7, r10, r5, r6)
            goto L_0x073e
        L_0x075b:
            long r3 = X.Pxi.A08(r0, r6)
            goto L_0x073e
        L_0x0760:
            android.os.Parcelable$Creator r2 = android.os.ParcelFileDescriptor.CREATOR
            android.os.Parcelable r2 = X.C295505oK.A04(r0, r2, r6)
            android.os.ParcelFileDescriptor r2 = (android.os.ParcelFileDescriptor) r2
            goto L_0x073e
        L_0x0769:
            android.os.Parcelable$Creator r1 = com.google.android.gms.common.data.DataHolder.CREATOR
            android.os.Parcelable r1 = X.C295505oK.A04(r0, r1, r6)
            com.google.android.gms.common.data.DataHolder r1 = (com.google.android.gms.common.data.DataHolder) r1
            goto L_0x073e
        L_0x0772:
            java.lang.String r8 = X.C295505oK.A08(r0, r6)
            goto L_0x073e
        L_0x0777:
            X.C295505oK.A0B(r0, r9)
            com.google.android.gms.safetynet.SafeBrowsingData r15 = new com.google.android.gms.safetynet.SafeBrowsingData
            r15.<init>()
            r15.A03 = r8
            r15.A02 = r1
            r15.A01 = r2
            r15.A00 = r3
            r15.A04 = r7
            return r15
        L_0x078a:
            int r6 = X.C295505oK.A00(r0)
            r1 = 0
            r5 = 0
        L_0x0790:
            int r2 = r0.dataPosition()
            if (r2 >= r6) goto L_0x07a9
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 2
            if (r3 == r2) goto L_0x07a4
            r2 = 3
            boolean r5 = X.Pxi.A1Q(r0, r3, r2, r4, r5)
            goto L_0x0790
        L_0x07a4:
            int r1 = X.Pxh.A08(r0, r4)
            goto L_0x0790
        L_0x07a9:
            X.C295505oK.A0B(r0, r6)
            com.google.android.gms.safetynet.zzh r15 = new com.google.android.gms.safetynet.zzh
            r15.<init>(r1, r5)
            return r15
        L_0x07b2:
            int r4 = X.C295505oK.A00(r0)
            r3 = 0
        L_0x07b7:
            int r1 = r0.dataPosition()
            if (r1 >= r4) goto L_0x07c7
            int r2 = r0.readInt()
            char r1 = (char) r2
            java.lang.String r3 = X.Pxj.A0n(r0, r3, r1, r2)
            goto L_0x07b7
        L_0x07c7:
            X.C295505oK.A0B(r0, r4)
            com.google.android.gms.safetynet.zzf r15 = new com.google.android.gms.safetynet.zzf
            r15.<init>(r3)
            return r15
        L_0x07d0:
            int r6 = X.C295505oK.A00(r0)
            r1 = 0
            r18 = 0
            r17 = 0
            r5 = 0
        L_0x07da:
            int r2 = r0.dataPosition()
            if (r2 >= r6) goto L_0x0807
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 2
            if (r3 == r2) goto L_0x0802
            r2 = 3
            if (r3 == r2) goto L_0x07f9
            r2 = 4
            if (r3 == r2) goto L_0x07f4
            r2 = 5
            boolean r5 = X.Pxi.A1Q(r0, r3, r2, r4, r5)
            goto L_0x07da
        L_0x07f4:
            int r17 = X.Pxi.A05(r0, r4)
            goto L_0x07da
        L_0x07f9:
            android.os.Parcelable$Creator r1 = com.google.android.gms.safetynet.HarmfulAppsData.CREATOR
            java.lang.Object[] r1 = X.C295505oK.A0J(r0, r1, r4)
            com.google.android.gms.safetynet.HarmfulAppsData[] r1 = (com.google.android.gms.safetynet.HarmfulAppsData[]) r1
            goto L_0x07da
        L_0x0802:
            long r18 = X.Pxi.A08(r0, r4)
            goto L_0x07da
        L_0x0807:
            X.C295505oK.A0B(r0, r6)
            com.google.android.gms.safetynet.zzd r15 = new com.google.android.gms.safetynet.zzd
            r20 = r5
            r16 = r1
            r15.<init>(r16, r17, r18, r20)
            return r15
        L_0x0814:
            int r7 = X.C295505oK.A00(r0)
            r6 = 0
            r5 = r6
            r4 = 0
        L_0x081b:
            int r1 = r0.dataPosition()
            if (r1 >= r7) goto L_0x083b
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 2
            if (r2 == r1) goto L_0x0836
            r1 = 3
            if (r2 == r1) goto L_0x0831
            int r4 = X.Pxj.A08(r0, r2, r3, r4)
            goto L_0x081b
        L_0x0831:
            byte[] r5 = X.C295505oK.A0H(r0, r3)
            goto L_0x081b
        L_0x0836:
            java.lang.String r6 = X.C295505oK.A08(r0, r3)
            goto L_0x081b
        L_0x083b:
            X.C295505oK.A0B(r0, r7)
            com.google.android.gms.safetynet.HarmfulAppsData r15 = new com.google.android.gms.safetynet.HarmfulAppsData
            r15.<init>(r5, r4, r6)
            return r15
        L_0x0844:
            int r4 = X.C295505oK.A00(r0)
            r3 = 0
        L_0x0849:
            int r1 = r0.dataPosition()
            if (r1 >= r4) goto L_0x0859
            int r2 = r0.readInt()
            char r1 = (char) r2
            java.lang.String r3 = X.Pxj.A0n(r0, r3, r1, r2)
            goto L_0x0849
        L_0x0859:
            X.C295505oK.A0B(r0, r4)
            com.google.android.gms.safetynet.zza r15 = new com.google.android.gms.safetynet.zza
            r15.<init>(r3)
            return r15
        L_0x0862:
            int r3 = X.C295505oK.A00(r0)
            r16 = 0
            r17 = r16
            r18 = r16
            r23 = 0
            r19 = 0
            r25 = 0
            r21 = 0
            r22 = 0
        L_0x0876:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x08b0
            int r2 = r0.readInt()
            char r1 = (char) r2
            switch(r1) {
                case 2: goto L_0x08ab;
                case 3: goto L_0x0888;
                case 4: goto L_0x08a6;
                case 5: goto L_0x0897;
                case 6: goto L_0x08a1;
                case 7: goto L_0x089c;
                case 8: goto L_0x0892;
                case 9: goto L_0x088d;
                default: goto L_0x0884;
            }
        L_0x0884:
            X.C295505oK.A0C(r0, r2)
            goto L_0x0876
        L_0x0888:
            long r23 = X.Pxi.A08(r0, r2)
            goto L_0x0876
        L_0x088d:
            int r22 = X.Pxh.A08(r0, r2)
            goto L_0x0876
        L_0x0892:
            int r21 = X.Pxh.A08(r0, r2)
            goto L_0x0876
        L_0x0897:
            double r19 = X.Pxi.A00(r0, r2)
            goto L_0x0876
        L_0x089c:
            byte[] r18 = X.C295505oK.A0H(r0, r2)
            goto L_0x0876
        L_0x08a1:
            java.lang.String r17 = X.C295505oK.A08(r0, r2)
            goto L_0x0876
        L_0x08a6:
            boolean r25 = X.C295505oK.A0G(r0, r2)
            goto L_0x0876
        L_0x08ab:
            java.lang.String r16 = X.C295505oK.A08(r0, r2)
            goto L_0x0876
        L_0x08b0:
            X.C295505oK.A0B(r0, r3)
            com.google.android.gms.phenotype.zzi r15 = new com.google.android.gms.phenotype.zzi
            r15.<init>(r16, r17, r18, r19, r21, r22, r23, r25)
            return r15
        L_0x08b9:
            int r3 = X.C295505oK.A00(r0)
            r16 = 0
            r17 = r16
            r19 = r16
            r20 = r16
            r21 = r16
            r22 = r16
            r18 = r16
            r23 = r16
        L_0x08cd:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x0907
            int r2 = r0.readInt()
            char r1 = (char) r2
            switch(r1) {
                case 2: goto L_0x0902;
                case 3: goto L_0x08fd;
                case 4: goto L_0x08f8;
                case 5: goto L_0x08f3;
                case 6: goto L_0x08ee;
                case 7: goto L_0x08e9;
                case 8: goto L_0x08e4;
                case 9: goto L_0x08df;
                default: goto L_0x08db;
            }
        L_0x08db:
            X.C295505oK.A0C(r0, r2)
            goto L_0x08cd
        L_0x08df:
            byte[][] r23 = X.C295505oK.A0L(r0, r2)
            goto L_0x08cd
        L_0x08e4:
            int[] r18 = X.C295505oK.A0I(r0, r2)
            goto L_0x08cd
        L_0x08e9:
            byte[][] r22 = X.C295505oK.A0L(r0, r2)
            goto L_0x08cd
        L_0x08ee:
            byte[][] r21 = X.C295505oK.A0L(r0, r2)
            goto L_0x08cd
        L_0x08f3:
            byte[][] r20 = X.C295505oK.A0L(r0, r2)
            goto L_0x08cd
        L_0x08f8:
            byte[][] r19 = X.C295505oK.A0L(r0, r2)
            goto L_0x08cd
        L_0x08fd:
            byte[] r17 = X.C295505oK.A0H(r0, r2)
            goto L_0x08cd
        L_0x0902:
            java.lang.String r16 = X.C295505oK.A08(r0, r2)
            goto L_0x08cd
        L_0x0907:
            X.C295505oK.A0B(r0, r3)
            com.google.android.gms.phenotype.ExperimentTokens r15 = new com.google.android.gms.phenotype.ExperimentTokens
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            return r15
        L_0x0910:
            int r7 = X.C295505oK.A00(r0)
            r2 = 0
            r6 = r2
            r1 = 0
        L_0x0917:
            int r3 = r0.dataPosition()
            if (r3 >= r7) goto L_0x0942
            int r5 = r0.readInt()
            char r4 = (char) r5
            r3 = 2
            if (r4 == r3) goto L_0x093d
            r3 = 3
            if (r4 == r3) goto L_0x0934
            r3 = 4
            if (r4 == r3) goto L_0x092f
            X.C295505oK.A0C(r0, r5)
            goto L_0x0917
        L_0x092f:
            java.lang.String[] r6 = X.C295505oK.A0K(r0, r5)
            goto L_0x0917
        L_0x0934:
            android.os.Parcelable$Creator r2 = com.google.android.gms.phenotype.zzi.CREATOR
            java.lang.Object[] r2 = X.C295505oK.A0J(r0, r2, r5)
            com.google.android.gms.phenotype.zzi[] r2 = (com.google.android.gms.phenotype.zzi[]) r2
            goto L_0x0917
        L_0x093d:
            int r1 = X.Pxh.A08(r0, r5)
            goto L_0x0917
        L_0x0942:
            X.C295505oK.A0B(r0, r7)
            com.google.android.gms.phenotype.Configuration r15 = new com.google.android.gms.phenotype.Configuration
            r15.<init>(r2, r6, r1)
            return r15
        L_0x094b:
            int r12 = X.C295505oK.A00(r0)
            r11 = 1
            r1 = 50
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = 1
            r3 = 0
            r9 = 2147483647(0x7fffffff, float:NaN)
        L_0x095c:
            int r6 = r0.dataPosition()
            if (r6 >= r12) goto L_0x098c
            int r8 = r0.readInt()
            char r7 = (char) r8
            if (r7 == r11) goto L_0x0987
            r6 = 2
            if (r7 == r6) goto L_0x0982
            r6 = 3
            if (r7 == r6) goto L_0x097d
            r6 = 4
            if (r7 == r6) goto L_0x0978
            r6 = 5
            int r9 = X.Pxj.A09(r0, r7, r6, r8, r9)
            goto L_0x095c
        L_0x0978:
            long r4 = X.Pxi.A08(r0, r8)
            goto L_0x095c
        L_0x097d:
            float r3 = X.Pxh.A01(r0, r8)
            goto L_0x095c
        L_0x0982:
            long r1 = X.Pxi.A08(r0, r8)
            goto L_0x095c
        L_0x0987:
            boolean r10 = X.C295505oK.A0G(r0, r8)
            goto L_0x095c
        L_0x098c:
            X.C295505oK.A0B(r0, r12)
            com.google.android.gms.location.zzo r15 = new com.google.android.gms.location.zzo
            r15.<init>()
            r15.A04 = r10
            r15.A02 = r1
            r15.A00 = r3
            r15.A03 = r4
            r15.A01 = r9
            return r15
        L_0x099f:
            int r6 = X.C295505oK.A00(r0)
            r1 = 0
            r5 = 0
        L_0x09a5:
            int r2 = r0.dataPosition()
            if (r2 >= r6) goto L_0x09be
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 1
            if (r3 == r2) goto L_0x09b9
            r2 = 2
            int r5 = X.Pxj.A09(r0, r3, r2, r4, r5)
            goto L_0x09a5
        L_0x09b9:
            int r1 = X.Pxh.A08(r0, r4)
            goto L_0x09a5
        L_0x09be:
            X.C295505oK.A0B(r0, r6)
            com.google.android.gms.location.DetectedActivity r15 = new com.google.android.gms.location.DetectedActivity
            r15.<init>()
            r15.A00 = r1
            r15.A01 = r5
            return r15
        L_0x09cb:
            int r6 = X.C295505oK.A00(r0)
            r5 = 0
            r4 = r5
        L_0x09d1:
            int r1 = r0.dataPosition()
            if (r1 >= r6) goto L_0x09f2
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            if (r2 == r1) goto L_0x09eb
            r1 = 2
            if (r2 == r1) goto L_0x09e6
            X.C295505oK.A0C(r0, r3)
            goto L_0x09d1
        L_0x09e6:
            android.os.Bundle r4 = X.C295505oK.A02(r0, r3)
            goto L_0x09d1
        L_0x09eb:
            android.os.Parcelable$Creator r1 = com.google.android.gms.location.ActivityTransitionEvent.CREATOR
            java.util.ArrayList r5 = X.C295505oK.A0A(r0, r1, r3)
            goto L_0x09d1
        L_0x09f2:
            X.C295505oK.A0B(r0, r6)
            com.google.android.gms.location.ActivityTransitionResult r15 = new com.google.android.gms.location.ActivityTransitionResult
            r15.<init>(r5, r4)
            return r15
        L_0x09fb:
            int r7 = X.C295505oK.A00(r0)
            r6 = 0
            r5 = r6
            r4 = r6
        L_0x0a02:
            int r1 = r0.dataPosition()
            if (r1 >= r7) goto L_0x0a2d
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            if (r2 == r1) goto L_0x0a26
            r1 = 2
            if (r2 == r1) goto L_0x0a21
            r1 = 3
            if (r2 == r1) goto L_0x0a1a
            X.C295505oK.A0C(r0, r3)
            goto L_0x0a02
        L_0x0a1a:
            android.os.Parcelable$Creator r1 = com.google.android.gms.common.internal.ClientIdentity.CREATOR
            java.util.ArrayList r4 = X.C295505oK.A0A(r0, r1, r3)
            goto L_0x0a02
        L_0x0a21:
            java.lang.String r5 = X.C295505oK.A08(r0, r3)
            goto L_0x0a02
        L_0x0a26:
            android.os.Parcelable$Creator r1 = com.google.android.gms.location.ActivityTransition.CREATOR
            java.util.ArrayList r6 = X.C295505oK.A0A(r0, r1, r3)
            goto L_0x0a02
        L_0x0a2d:
            X.C295505oK.A0B(r0, r7)
            com.google.android.gms.location.ActivityTransitionRequest r15 = new com.google.android.gms.location.ActivityTransitionRequest
            r15.<init>(r6, r4, r5)
            return r15
        L_0x0a36:
            int r8 = X.C295505oK.A00(r0)
            r1 = 0
            r3 = 0
            r2 = 0
        L_0x0a3e:
            int r5 = r0.dataPosition()
            if (r5 >= r8) goto L_0x0a65
            int r7 = r0.readInt()
            char r6 = (char) r7
            r5 = 1
            if (r6 == r5) goto L_0x0a60
            r5 = 2
            if (r6 == r5) goto L_0x0a5b
            r5 = 3
            if (r6 == r5) goto L_0x0a56
            X.C295505oK.A0C(r0, r7)
            goto L_0x0a3e
        L_0x0a56:
            long r3 = X.Pxi.A08(r0, r7)
            goto L_0x0a3e
        L_0x0a5b:
            int r2 = X.Pxh.A08(r0, r7)
            goto L_0x0a3e
        L_0x0a60:
            int r1 = X.Pxh.A08(r0, r7)
            goto L_0x0a3e
        L_0x0a65:
            X.C295505oK.A0B(r0, r8)
            com.google.android.gms.location.ActivityTransitionEvent r15 = new com.google.android.gms.location.ActivityTransitionEvent
            r15.<init>(r1, r2, r3)
            return r15
        L_0x0a6e:
            int r6 = X.C295505oK.A00(r0)
            r1 = 0
            r5 = 0
        L_0x0a74:
            int r2 = r0.dataPosition()
            if (r2 >= r6) goto L_0x0a8d
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 1
            if (r3 == r2) goto L_0x0a88
            r2 = 2
            int r5 = X.Pxj.A09(r0, r3, r2, r4, r5)
            goto L_0x0a74
        L_0x0a88:
            int r1 = X.Pxh.A08(r0, r4)
            goto L_0x0a74
        L_0x0a8d:
            X.C295505oK.A0B(r0, r6)
            com.google.android.gms.location.ActivityTransition r15 = new com.google.android.gms.location.ActivityTransition
            r15.<init>(r1, r5)
            return r15
        L_0x0a96:
            int r10 = X.C295505oK.A00(r0)
            r9 = 0
            r1 = 0
            r3 = 0
            r8 = r9
            r7 = 0
        L_0x0aa1:
            int r5 = r0.dataPosition()
            if (r5 >= r10) goto L_0x0ada
            int r6 = r0.readInt()
            char r11 = (char) r6
            r5 = 1
            if (r11 == r5) goto L_0x0ad3
            r5 = 2
            if (r11 == r5) goto L_0x0ace
            r5 = 3
            if (r11 == r5) goto L_0x0ac9
            r5 = 4
            if (r11 == r5) goto L_0x0ac4
            r5 = 5
            if (r11 == r5) goto L_0x0abf
            X.C295505oK.A0C(r0, r6)
            goto L_0x0aa1
        L_0x0abf:
            android.os.Bundle r8 = X.C295505oK.A02(r0, r6)
            goto L_0x0aa1
        L_0x0ac4:
            int r7 = X.Pxi.A05(r0, r6)
            goto L_0x0aa1
        L_0x0ac9:
            long r3 = X.Pxi.A08(r0, r6)
            goto L_0x0aa1
        L_0x0ace:
            long r1 = X.Pxi.A08(r0, r6)
            goto L_0x0aa1
        L_0x0ad3:
            android.os.Parcelable$Creator r5 = com.google.android.gms.location.DetectedActivity.CREATOR
            java.util.ArrayList r9 = X.C295505oK.A0A(r0, r5, r6)
            goto L_0x0aa1
        L_0x0ada:
            X.C295505oK.A0B(r0, r10)
            com.google.android.gms.location.ActivityRecognitionResult r15 = new com.google.android.gms.location.ActivityRecognitionResult
            r15.<init>()
            r10 = 1
            if (r9 == 0) goto L_0x0aec
            int r0 = r9.size()
            r5 = 1
            if (r0 > 0) goto L_0x0aed
        L_0x0aec:
            r5 = 0
        L_0x0aed:
            java.lang.String r0 = "Must have at least 1 detected activity"
            X.AnonymousClass3Qk.A08(r5, r0)
            r5 = 0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0b0c
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0b0c
        L_0x0afc:
            java.lang.String r0 = "Must set times"
            X.AnonymousClass3Qk.A08(r10, r0)
            r15.A04 = r9
            r15.A01 = r1
            r15.A02 = r3
            r15.A00 = r7
            r15.A03 = r8
            return r15
        L_0x0b0c:
            r10 = 0
            goto L_0x0afc
        L_0x0b0e:
            int r7 = X.C295505oK.A00(r0)
            r6 = 0
            java.lang.String r5 = ""
            r1 = r6
        L_0x0b16:
            int r2 = r0.dataPosition()
            if (r2 >= r7) goto L_0x0b3a
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 1
            if (r3 == r2) goto L_0x0b35
            r2 = 2
            if (r3 == r2) goto L_0x0b2c
            java.lang.String r5 = X.Pxj.A0o(r0, r5, r3, r4)
            goto L_0x0b16
        L_0x0b2c:
            android.os.Parcelable$Creator r1 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r1 = X.C295505oK.A04(r0, r1, r4)
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
            goto L_0x0b16
        L_0x0b35:
            java.util.ArrayList r6 = X.C295505oK.A09(r0, r4)
            goto L_0x0b16
        L_0x0b3a:
            X.C295505oK.A0B(r0, r7)
            com.google.android.gms.location.zzbe r15 = new com.google.android.gms.location.zzbe
            r15.<init>(r1, r5, r6)
            return r15
        L_0x0b43:
            int r5 = X.C295505oK.A00(r0)
            r4 = 1
            r18 = -1
            r20 = -1
            r16 = 1
            r17 = 1
        L_0x0b50:
            int r1 = r0.dataPosition()
            if (r1 >= r5) goto L_0x0b7e
            int r3 = r0.readInt()
            char r2 = (char) r3
            if (r2 == r4) goto L_0x0b79
            r1 = 2
            if (r2 == r1) goto L_0x0b74
            r1 = 3
            if (r2 == r1) goto L_0x0b6f
            r1 = 4
            if (r2 == r1) goto L_0x0b6a
            X.C295505oK.A0C(r0, r3)
            goto L_0x0b50
        L_0x0b6a:
            long r20 = X.Pxi.A08(r0, r3)
            goto L_0x0b50
        L_0x0b6f:
            long r18 = X.Pxi.A08(r0, r3)
            goto L_0x0b50
        L_0x0b74:
            int r17 = X.Pxh.A08(r0, r3)
            goto L_0x0b50
        L_0x0b79:
            int r16 = X.Pxh.A08(r0, r3)
            goto L_0x0b50
        L_0x0b7e:
            X.C295505oK.A0B(r0, r5)
            com.google.android.gms.location.zzbd r15 = new com.google.android.gms.location.zzbd
            r15.<init>(r16, r17, r18, r20)
            return r15
        L_0x0b87:
            int r3 = X.C295505oK.A00(r0)
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
        L_0x0b97:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x0bc7
            int r2 = r0.readInt()
            char r1 = (char) r2
            switch(r1) {
                case 1: goto L_0x0bc2;
                case 2: goto L_0x0bbd;
                case 3: goto L_0x0bb8;
                case 4: goto L_0x0bb3;
                case 5: goto L_0x0bae;
                case 6: goto L_0x0ba9;
                default: goto L_0x0ba5;
            }
        L_0x0ba5:
            X.C295505oK.A0C(r0, r2)
            goto L_0x0b97
        L_0x0ba9:
            boolean r21 = X.C295505oK.A0G(r0, r2)
            goto L_0x0b97
        L_0x0bae:
            boolean r20 = X.C295505oK.A0G(r0, r2)
            goto L_0x0b97
        L_0x0bb3:
            boolean r19 = X.C295505oK.A0G(r0, r2)
            goto L_0x0b97
        L_0x0bb8:
            boolean r18 = X.C295505oK.A0G(r0, r2)
            goto L_0x0b97
        L_0x0bbd:
            boolean r17 = X.C295505oK.A0G(r0, r2)
            goto L_0x0b97
        L_0x0bc2:
            boolean r16 = X.C295505oK.A0G(r0, r2)
            goto L_0x0b97
        L_0x0bc7:
            X.C295505oK.A0B(r0, r3)
            com.google.android.gms.location.LocationSettingsStates r15 = new com.google.android.gms.location.LocationSettingsStates
            r15.<init>(r16, r17, r18, r19, r20, r21)
            return r15
        L_0x0bd0:
            int r6 = X.C295505oK.A00(r0)
            r1 = 0
            r2 = r1
        L_0x0bd6:
            int r3 = r0.dataPosition()
            if (r3 >= r6) goto L_0x0bfd
            int r5 = r0.readInt()
            char r4 = (char) r5
            r3 = 1
            if (r4 == r3) goto L_0x0bf4
            r3 = 2
            if (r4 == r3) goto L_0x0beb
            X.C295505oK.A0C(r0, r5)
            goto L_0x0bd6
        L_0x0beb:
            android.os.Parcelable$Creator r2 = com.google.android.gms.location.LocationSettingsStates.CREATOR
            android.os.Parcelable r2 = X.C295505oK.A04(r0, r2, r5)
            com.google.android.gms.location.LocationSettingsStates r2 = (com.google.android.gms.location.LocationSettingsStates) r2
            goto L_0x0bd6
        L_0x0bf4:
            android.os.Parcelable$Creator r1 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r1 = X.C295505oK.A04(r0, r1, r5)
            com.google.android.gms.common.api.Status r1 = (com.google.android.gms.common.api.Status) r1
            goto L_0x0bd6
        L_0x0bfd:
            X.C295505oK.A0B(r0, r6)
            com.google.android.gms.location.LocationSettingsResult r15 = new com.google.android.gms.location.LocationSettingsResult
            r15.<init>(r1, r2)
            return r15
        L_0x0c06:
            int r8 = X.C295505oK.A00(r0)
            r7 = 0
            r6 = 0
            r2 = r6
            r5 = 0
        L_0x0c0e:
            int r1 = r0.dataPosition()
            if (r1 >= r8) goto L_0x0c43
            int r4 = r0.readInt()
            char r3 = (char) r4
            r1 = 1
            if (r3 == r1) goto L_0x0c3c
            r1 = 2
            if (r3 == r1) goto L_0x0c37
            r1 = 3
            if (r3 == r1) goto L_0x0c32
            r1 = 5
            if (r3 == r1) goto L_0x0c29
            X.C295505oK.A0C(r0, r4)
            goto L_0x0c0e
        L_0x0c29:
            android.os.Parcelable$Creator r1 = com.google.android.gms.location.zzay.CREATOR
            android.os.Parcelable r2 = X.C295505oK.A04(r0, r1, r4)
            com.google.android.gms.location.zzay r2 = (com.google.android.gms.location.zzay) r2
            goto L_0x0c0e
        L_0x0c32:
            boolean r5 = X.C295505oK.A0G(r0, r4)
            goto L_0x0c0e
        L_0x0c37:
            boolean r7 = X.C295505oK.A0G(r0, r4)
            goto L_0x0c0e
        L_0x0c3c:
            android.os.Parcelable$Creator r1 = com.google.android.gms.location.LocationRequest.CREATOR
            java.util.ArrayList r6 = X.C295505oK.A0A(r0, r1, r4)
            goto L_0x0c0e
        L_0x0c43:
            X.C295505oK.A0B(r0, r8)
            com.google.android.gms.location.LocationSettingsRequest r15 = new com.google.android.gms.location.LocationSettingsRequest
            r15.<init>(r2, r6, r7, r5)
            return r15
        L_0x0c4c:
            int r7 = X.C295505oK.A00(r0)
            java.lang.String r6 = ""
            r5 = r6
            r4 = r6
        L_0x0c54:
            int r1 = r0.dataPosition()
            if (r1 >= r7) goto L_0x0c75
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            if (r2 == r1) goto L_0x0c70
            r1 = 2
            if (r2 == r1) goto L_0x0c6b
            r1 = 5
            java.lang.String r6 = X.Pxi.A0f(r0, r6, r2, r1, r3)
            goto L_0x0c54
        L_0x0c6b:
            java.lang.String r4 = X.C295505oK.A08(r0, r3)
            goto L_0x0c54
        L_0x0c70:
            java.lang.String r5 = X.C295505oK.A08(r0, r3)
            goto L_0x0c54
        L_0x0c75:
            X.C295505oK.A0B(r0, r7)
            com.google.android.gms.location.zzay r15 = new com.google.android.gms.location.zzay
            r15.<init>(r6, r5, r4)
            return r15
        L_0x0c7e:
            int r5 = X.C295505oK.A00(r0)
            java.util.List r4 = com.google.android.gms.location.LocationResult.A01
        L_0x0c84:
            int r1 = r0.dataPosition()
            if (r1 >= r5) goto L_0x0c9d
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            if (r2 == r1) goto L_0x0c96
            X.C295505oK.A0C(r0, r3)
            goto L_0x0c84
        L_0x0c96:
            android.os.Parcelable$Creator r1 = android.location.Location.CREATOR
            java.util.ArrayList r4 = X.C295505oK.A0A(r0, r1, r3)
            goto L_0x0c84
        L_0x0c9d:
            X.C295505oK.A0B(r0, r5)
            com.google.android.gms.location.LocationResult r15 = new com.google.android.gms.location.LocationResult
            r15.<init>(r4)
            return r15
        L_0x0ca6:
            int r15 = X.C295505oK.A00(r0)
            r1 = 3600000(0x36ee80, double:1.7786363E-317)
            r3 = 600000(0x927c0, double:2.964394E-318)
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r7 = 0
            r9 = 102(0x66, float:1.43E-43)
            r14 = 0
            r10 = 2147483647(0x7fffffff, float:NaN)
            r11 = 0
        L_0x0cbe:
            int r12 = r0.dataPosition()
            if (r12 >= r15) goto L_0x0cf8
            int r13 = r0.readInt()
            char r12 = (char) r13
            switch(r12) {
                case 1: goto L_0x0cee;
                case 2: goto L_0x0cdf;
                case 3: goto L_0x0cda;
                case 4: goto L_0x0cf3;
                case 5: goto L_0x0cd5;
                case 6: goto L_0x0ce9;
                case 7: goto L_0x0ce4;
                case 8: goto L_0x0cd0;
                default: goto L_0x0ccc;
            }
        L_0x0ccc:
            X.C295505oK.A0C(r0, r13)
            goto L_0x0cbe
        L_0x0cd0:
            long r7 = X.Pxi.A08(r0, r13)
            goto L_0x0cbe
        L_0x0cd5:
            long r5 = X.Pxi.A08(r0, r13)
            goto L_0x0cbe
        L_0x0cda:
            long r3 = X.Pxi.A08(r0, r13)
            goto L_0x0cbe
        L_0x0cdf:
            long r1 = X.Pxi.A08(r0, r13)
            goto L_0x0cbe
        L_0x0ce4:
            float r11 = X.Pxh.A01(r0, r13)
            goto L_0x0cbe
        L_0x0ce9:
            int r10 = X.Pxh.A08(r0, r13)
            goto L_0x0cbe
        L_0x0cee:
            int r9 = X.Pxh.A08(r0, r13)
            goto L_0x0cbe
        L_0x0cf3:
            boolean r14 = X.C295505oK.A0G(r0, r13)
            goto L_0x0cbe
        L_0x0cf8:
            X.C295505oK.A0B(r0, r15)
            com.google.android.gms.location.LocationRequest r15 = new com.google.android.gms.location.LocationRequest
            r15.<init>()
            r15.A01 = r9
            r15.A03 = r1
            r15.A04 = r3
            r15.A07 = r14
            r15.A05 = r5
            r15.A02 = r10
            r15.A00 = r11
            r15.A06 = r7
            return r15
        L_0x0d11:
            int r11 = X.C295505oK.A00(r0)
            r10 = 1
            r5 = 0
            r3 = 0
            r9 = 1000(0x3e8, float:1.401E-42)
            r1 = 1
            r2 = 1
        L_0x0d1d:
            int r6 = r0.dataPosition()
            if (r6 >= r11) goto L_0x0d57
            int r8 = r0.readInt()
            char r7 = (char) r8
            if (r7 == r10) goto L_0x0d52
            r6 = 2
            if (r7 == r6) goto L_0x0d4d
            r6 = 3
            if (r7 == r6) goto L_0x0d48
            r6 = 4
            if (r7 == r6) goto L_0x0d43
            r6 = 5
            if (r7 == r6) goto L_0x0d3a
            X.C295505oK.A0C(r0, r8)
            goto L_0x0d1d
        L_0x0d3a:
            android.os.Parcelable$Creator r5 = com.google.android.gms.location.zzbd.CREATOR
            java.lang.Object[] r5 = X.C295505oK.A0J(r0, r5, r8)
            com.google.android.gms.location.zzbd[] r5 = (com.google.android.gms.location.zzbd[]) r5
            goto L_0x0d1d
        L_0x0d43:
            int r9 = X.Pxi.A05(r0, r8)
            goto L_0x0d1d
        L_0x0d48:
            long r3 = X.Pxi.A08(r0, r8)
            goto L_0x0d1d
        L_0x0d4d:
            int r2 = X.Pxh.A08(r0, r8)
            goto L_0x0d1d
        L_0x0d52:
            int r1 = X.Pxh.A08(r0, r8)
            goto L_0x0d1d
        L_0x0d57:
            X.C295505oK.A0B(r0, r11)
            com.google.android.gms.location.LocationAvailability r15 = new com.google.android.gms.location.LocationAvailability
            r15.<init>()
            r15.A02 = r9
            r15.A00 = r1
            r15.A01 = r2
            r15.A03 = r3
            r15.A04 = r5
            return r15
        L_0x0d6a:
            int r7 = X.C295505oK.A00(r0)
            r6 = 0
            r2 = 0
            java.lang.String r5 = ""
        L_0x0d72:
            int r1 = r0.dataPosition()
            if (r1 >= r7) goto L_0x0d94
            int r4 = r0.readInt()
            char r3 = (char) r4
            r1 = 1
            if (r3 == r1) goto L_0x0d8d
            r1 = 2
            if (r3 == r1) goto L_0x0d88
            java.lang.String r5 = X.Pxj.A0o(r0, r5, r3, r4)
            goto L_0x0d72
        L_0x0d88:
            int r2 = X.Pxh.A08(r0, r4)
            goto L_0x0d72
        L_0x0d8d:
            android.os.Parcelable$Creator r1 = com.google.android.gms.internal.location.zzbg.CREATOR
            java.util.ArrayList r6 = X.C295505oK.A0A(r0, r1, r4)
            goto L_0x0d72
        L_0x0d94:
            X.C295505oK.A0B(r0, r7)
            com.google.android.gms.location.GeofencingRequest r15 = new com.google.android.gms.location.GeofencingRequest
            r15.<init>(r6, r2, r5)
            return r15
        L_0x0d9d:
            int r8 = X.C295505oK.A00(r0)
            r7 = 0
            r6 = r7
            r5 = r7
            r1 = 0
        L_0x0da5:
            int r2 = r0.dataPosition()
            if (r2 >= r8) goto L_0x0dce
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 1
            if (r3 == r2) goto L_0x0dc9
            r2 = 2
            if (r3 == r2) goto L_0x0dc4
            r2 = 3
            if (r3 == r2) goto L_0x0dbf
            r2 = 4
            java.lang.String r5 = X.Pxi.A0f(r0, r5, r3, r2, r4)
            goto L_0x0da5
        L_0x0dbf:
            java.lang.String r6 = X.C295505oK.A08(r0, r4)
            goto L_0x0da5
        L_0x0dc4:
            java.lang.String r7 = X.C295505oK.A08(r0, r4)
            goto L_0x0da5
        L_0x0dc9:
            int r1 = X.Pxh.A08(r0, r4)
            goto L_0x0da5
        L_0x0dce:
            X.C295505oK.A0B(r0, r8)
            com.google.android.gms.location.places.PlaceReport r15 = new com.google.android.gms.location.places.PlaceReport
            r15.<init>(r1, r7, r6, r5)
            return r15
        L_0x0dd7:
            int r10 = X.C295505oK.A00(r0)
            r3 = 0
            r1 = 0
            r2 = 0
            r9 = 0
            r8 = 0
        L_0x0de1:
            int r5 = r0.dataPosition()
            if (r5 >= r10) goto L_0x0e18
            int r7 = r0.readInt()
            char r6 = (char) r7
            r5 = 2
            if (r6 == r5) goto L_0x0e13
            r5 = 3
            if (r6 == r5) goto L_0x0e0e
            r5 = 4
            if (r6 == r5) goto L_0x0e09
            r5 = 5
            if (r6 == r5) goto L_0x0e04
            r5 = 6
            if (r6 == r5) goto L_0x0dff
            X.C295505oK.A0C(r0, r7)
            goto L_0x0de1
        L_0x0dff:
            int r8 = X.Pxi.A05(r0, r7)
            goto L_0x0de1
        L_0x0e04:
            long r3 = X.Pxi.A08(r0, r7)
            goto L_0x0de1
        L_0x0e09:
            int r9 = X.Pxi.A05(r0, r7)
            goto L_0x0de1
        L_0x0e0e:
            int r2 = X.Pxh.A08(r0, r7)
            goto L_0x0de1
        L_0x0e13:
            int r1 = X.Pxh.A08(r0, r7)
            goto L_0x0de1
        L_0x0e18:
            X.C295505oK.A0B(r0, r10)
            com.google.android.gms.internal.vision.zzs r15 = new com.google.android.gms.internal.vision.zzs
            r15.<init>()
            r15.A00 = r1
            r15.A01 = r2
            r15.A02 = r9
            r15.A04 = r3
            r15.A03 = r8
            return r15
        L_0x0e2b:
            int r6 = X.C295505oK.A00(r0)
            r1 = 0
            r5 = 0
        L_0x0e31:
            int r2 = r0.dataPosition()
            if (r2 >= r6) goto L_0x0e4a
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 2
            if (r3 == r2) goto L_0x0e45
            r2 = 3
            boolean r5 = X.Pxi.A1Q(r0, r3, r2, r4, r5)
            goto L_0x0e31
        L_0x0e45:
            int r1 = X.Pxh.A08(r0, r4)
            goto L_0x0e31
        L_0x0e4a:
            X.C295505oK.A0B(r0, r6)
            com.google.android.gms.internal.vision.zzk r15 = new com.google.android.gms.internal.vision.zzk
            r15.<init>()
            r15.A00 = r1
            r15.A01 = r5
            return r15
        L_0x0e57:
            int r4 = X.C295505oK.A00(r0)
            r19 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r21 = 0
        L_0x0e65:
            int r1 = r0.dataPosition()
            if (r1 >= r4) goto L_0x0e9c
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            if (r2 == r1) goto L_0x0e97
            r1 = 2
            if (r2 == r1) goto L_0x0e92
            r1 = 3
            if (r2 == r1) goto L_0x0e8d
            r1 = 4
            if (r2 == r1) goto L_0x0e88
            r1 = 5
            if (r2 == r1) goto L_0x0e83
            X.C295505oK.A0C(r0, r3)
            goto L_0x0e65
        L_0x0e83:
            long r19 = X.Pxi.A08(r0, r3)
            goto L_0x0e65
        L_0x0e88:
            int r21 = X.Pxi.A05(r0, r3)
            goto L_0x0e65
        L_0x0e8d:
            int r18 = X.Pxh.A08(r0, r3)
            goto L_0x0e65
        L_0x0e92:
            int r17 = X.Pxh.A08(r0, r3)
            goto L_0x0e65
        L_0x0e97:
            int r16 = X.Pxh.A08(r0, r3)
            goto L_0x0e65
        L_0x0e9c:
            X.C295505oK.A0B(r0, r4)
            com.google.android.gms.internal.vision.zzfz r15 = new com.google.android.gms.internal.vision.zzfz
            r15.<init>(r16, r17, r18, r19, r21)
            return r15
        L_0x0ea5:
            int r6 = X.C295505oK.A00(r0)
            r1 = 0
            r2 = r1
            r3 = r1
            r18 = r1
            r19 = r1
            r21 = 0
            r22 = 0
        L_0x0eb4:
            int r4 = r0.dataPosition()
            if (r4 >= r6) goto L_0x0ef5
            int r5 = r0.readInt()
            char r4 = (char) r5
            switch(r4) {
                case 2: goto L_0x0eec;
                case 3: goto L_0x0ee3;
                case 4: goto L_0x0eda;
                case 5: goto L_0x0ed5;
                case 6: goto L_0x0ec6;
                case 7: goto L_0x0ed0;
                case 8: goto L_0x0ecb;
                default: goto L_0x0ec2;
            }
        L_0x0ec2:
            X.C295505oK.A0C(r0, r5)
            goto L_0x0eb4
        L_0x0ec6:
            float r21 = X.Pxh.A01(r0, r5)
            goto L_0x0eb4
        L_0x0ecb:
            boolean r22 = X.C295505oK.A0G(r0, r5)
            goto L_0x0eb4
        L_0x0ed0:
            java.lang.String r19 = X.C295505oK.A08(r0, r5)
            goto L_0x0eb4
        L_0x0ed5:
            java.lang.String r18 = X.C295505oK.A08(r0, r5)
            goto L_0x0eb4
        L_0x0eda:
            android.os.Parcelable$Creator r3 = com.google.android.gms.internal.vision.zzab.CREATOR
            android.os.Parcelable r3 = X.C295505oK.A04(r0, r3, r5)
            com.google.android.gms.internal.vision.zzab r3 = (com.google.android.gms.internal.vision.zzab) r3
            goto L_0x0eb4
        L_0x0ee3:
            android.os.Parcelable$Creator r2 = com.google.android.gms.internal.vision.zzab.CREATOR
            android.os.Parcelable r2 = X.C295505oK.A04(r0, r2, r5)
            com.google.android.gms.internal.vision.zzab r2 = (com.google.android.gms.internal.vision.zzab) r2
            goto L_0x0eb4
        L_0x0eec:
            android.os.Parcelable$Creator r1 = com.google.android.gms.internal.vision.zzal.CREATOR
            java.lang.Object[] r1 = X.C295505oK.A0J(r0, r1, r5)
            com.google.android.gms.internal.vision.zzal[] r1 = (com.google.android.gms.internal.vision.zzal[]) r1
            goto L_0x0eb4
        L_0x0ef5:
            X.C295505oK.A0B(r0, r6)
            com.google.android.gms.internal.vision.zzao r15 = new com.google.android.gms.internal.vision.zzao
            r20 = r1
            r16 = r2
            r17 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            return r15
        L_0x0f04:
            int r4 = X.C295505oK.A00(r0)
            r3 = 0
        L_0x0f09:
            int r1 = r0.dataPosition()
            if (r1 >= r4) goto L_0x0f19
            int r2 = r0.readInt()
            char r1 = (char) r2
            java.lang.String r3 = X.Pxj.A0n(r0, r3, r1, r2)
            goto L_0x0f09
        L_0x0f19:
            X.C295505oK.A0B(r0, r4)
            com.google.android.gms.internal.vision.zzam r15 = new com.google.android.gms.internal.vision.zzam
            r15.<init>(r3)
            return r15
        L_0x0f22:
            int r2 = X.C295505oK.A00(r0)
        L_0x0f26:
            int r1 = r0.dataPosition()
            if (r1 >= r2) goto L_0x0f34
            int r1 = r0.readInt()
            X.C295505oK.A0C(r0, r1)
            goto L_0x0f26
        L_0x0f34:
            X.C295505oK.A0B(r0, r2)
            com.google.android.gms.internal.vision.zzal r15 = new com.google.android.gms.internal.vision.zzal
            r15.<init>()
            return r15
        L_0x0f3d:
            int r5 = X.C295505oK.A00(r0)
            r1 = 0
        L_0x0f42:
            int r2 = r0.dataPosition()
            if (r2 >= r5) goto L_0x0f5d
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 2
            if (r3 == r2) goto L_0x0f54
            X.C295505oK.A0C(r0, r4)
            goto L_0x0f42
        L_0x0f54:
            android.os.Parcelable$Creator r1 = android.graphics.Rect.CREATOR
            android.os.Parcelable r1 = X.C295505oK.A04(r0, r1, r4)
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            goto L_0x0f42
        L_0x0f5d:
            X.C295505oK.A0B(r0, r5)
            com.google.android.gms.internal.vision.zzaj r15 = new com.google.android.gms.internal.vision.zzaj
            r15.<init>(r1)
            return r15
        L_0x0f66:
            int r6 = X.C295505oK.A00(r0)
            r1 = 0
            r2 = r1
            r3 = r1
            r4 = r1
            r19 = r1
            r20 = r1
            r22 = 0
            r23 = 0
            r26 = 0
            r24 = 0
            r25 = 0
        L_0x0f7c:
            int r5 = r0.dataPosition()
            if (r5 >= r6) goto L_0x0fd5
            int r5 = r0.readInt()
            char r7 = (char) r5
            switch(r7) {
                case 2: goto L_0x0fcc;
                case 3: goto L_0x0fc3;
                case 4: goto L_0x0fba;
                case 5: goto L_0x0fb1;
                case 6: goto L_0x0fac;
                case 7: goto L_0x0f9d;
                case 8: goto L_0x0fa7;
                case 9: goto L_0x0f98;
                case 10: goto L_0x0fa2;
                case 11: goto L_0x0f93;
                case 12: goto L_0x0f8e;
                default: goto L_0x0f8a;
            }
        L_0x0f8a:
            X.C295505oK.A0C(r0, r5)
            goto L_0x0f7c
        L_0x0f8e:
            int r25 = X.Pxh.A08(r0, r5)
            goto L_0x0f7c
        L_0x0f93:
            int r24 = X.Pxh.A08(r0, r5)
            goto L_0x0f7c
        L_0x0f98:
            int r23 = X.Pxh.A08(r0, r5)
            goto L_0x0f7c
        L_0x0f9d:
            float r22 = X.Pxh.A01(r0, r5)
            goto L_0x0f7c
        L_0x0fa2:
            boolean r26 = X.C295505oK.A0G(r0, r5)
            goto L_0x0f7c
        L_0x0fa7:
            java.lang.String r20 = X.C295505oK.A08(r0, r5)
            goto L_0x0f7c
        L_0x0fac:
            java.lang.String r19 = X.C295505oK.A08(r0, r5)
            goto L_0x0f7c
        L_0x0fb1:
            android.os.Parcelable$Creator r4 = com.google.android.gms.internal.vision.zzab.CREATOR
            android.os.Parcelable r4 = X.C295505oK.A04(r0, r4, r5)
            com.google.android.gms.internal.vision.zzab r4 = (com.google.android.gms.internal.vision.zzab) r4
            goto L_0x0f7c
        L_0x0fba:
            android.os.Parcelable$Creator r3 = com.google.android.gms.internal.vision.zzab.CREATOR
            android.os.Parcelable r3 = X.C295505oK.A04(r0, r3, r5)
            com.google.android.gms.internal.vision.zzab r3 = (com.google.android.gms.internal.vision.zzab) r3
            goto L_0x0f7c
        L_0x0fc3:
            android.os.Parcelable$Creator r2 = com.google.android.gms.internal.vision.zzab.CREATOR
            android.os.Parcelable r2 = X.C295505oK.A04(r0, r2, r5)
            com.google.android.gms.internal.vision.zzab r2 = (com.google.android.gms.internal.vision.zzab) r2
            goto L_0x0f7c
        L_0x0fcc:
            android.os.Parcelable$Creator r1 = com.google.android.gms.internal.vision.zzao.CREATOR
            java.lang.Object[] r1 = X.C295505oK.A0J(r0, r1, r5)
            com.google.android.gms.internal.vision.zzao[] r1 = (com.google.android.gms.internal.vision.zzao[]) r1
            goto L_0x0f7c
        L_0x0fd5:
            X.C295505oK.A0B(r0, r6)
            com.google.android.gms.internal.vision.zzah r15 = new com.google.android.gms.internal.vision.zzah
            r18 = r4
            r21 = r1
            r16 = r2
            r17 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return r15
        L_0x0fe6:
            int r5 = X.C295505oK.A00(r0)
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
        L_0x0ff4:
            int r1 = r0.dataPosition()
            if (r1 >= r5) goto L_0x102e
            int r4 = r0.readInt()
            char r3 = (char) r4
            r1 = 2
            if (r3 == r1) goto L_0x1029
            r1 = 3
            if (r3 == r1) goto L_0x1024
            r2 = 4
            if (r3 == r2) goto L_0x101f
            r1 = 5
            if (r3 == r1) goto L_0x101a
            r1 = 6
            if (r3 == r1) goto L_0x1012
            X.C295505oK.A0C(r0, r4)
            goto L_0x0ff4
        L_0x1012:
            X.C295505oK.A0F(r0, r4, r2)
            float r20 = r0.readFloat()
            goto L_0x0ff4
        L_0x101a:
            int r19 = X.Pxi.A05(r0, r4)
            goto L_0x0ff4
        L_0x101f:
            int r18 = X.Pxi.A05(r0, r4)
            goto L_0x0ff4
        L_0x1024:
            int r17 = X.Pxh.A08(r0, r4)
            goto L_0x0ff4
        L_0x1029:
            int r16 = X.Pxh.A08(r0, r4)
            goto L_0x0ff4
        L_0x102e:
            X.C295505oK.A0B(r0, r5)
            com.google.android.gms.internal.vision.zzab r15 = new com.google.android.gms.internal.vision.zzab
            r15.<init>(r16, r17, r18, r19, r20)
            return r15
        L_0x1037:
            int r6 = X.C295505oK.A00(r0)
            r1 = 0
            r2 = r1
            r3 = r1
            r18 = r1
            r19 = r1
            r21 = 0
            r22 = 0
        L_0x1046:
            int r4 = r0.dataPosition()
            if (r4 >= r6) goto L_0x1087
            int r5 = r0.readInt()
            char r4 = (char) r5
            switch(r4) {
                case 2: goto L_0x107e;
                case 3: goto L_0x1075;
                case 4: goto L_0x106c;
                case 5: goto L_0x1067;
                case 6: goto L_0x1058;
                case 7: goto L_0x1062;
                case 8: goto L_0x105d;
                default: goto L_0x1054;
            }
        L_0x1054:
            X.C295505oK.A0C(r0, r5)
            goto L_0x1046
        L_0x1058:
            float r21 = X.Pxh.A01(r0, r5)
            goto L_0x1046
        L_0x105d:
            boolean r22 = X.C295505oK.A0G(r0, r5)
            goto L_0x1046
        L_0x1062:
            java.lang.String r19 = X.C295505oK.A08(r0, r5)
            goto L_0x1046
        L_0x1067:
            java.lang.String r18 = X.C295505oK.A08(r0, r5)
            goto L_0x1046
        L_0x106c:
            android.os.Parcelable$Creator r3 = com.google.android.gms.internal.mlkit_vision_text_common.zzf.CREATOR
            android.os.Parcelable r3 = X.C295505oK.A04(r0, r3, r5)
            com.google.android.gms.internal.mlkit_vision_text_common.zzf r3 = (com.google.android.gms.internal.mlkit_vision_text_common.zzf) r3
            goto L_0x1046
        L_0x1075:
            android.os.Parcelable$Creator r2 = com.google.android.gms.internal.mlkit_vision_text_common.zzf.CREATOR
            android.os.Parcelable r2 = X.C295505oK.A04(r0, r2, r5)
            com.google.android.gms.internal.mlkit_vision_text_common.zzf r2 = (com.google.android.gms.internal.mlkit_vision_text_common.zzf) r2
            goto L_0x1046
        L_0x107e:
            android.os.Parcelable$Creator r1 = com.google.android.gms.internal.mlkit_vision_text_common.zzn.CREATOR
            java.lang.Object[] r1 = X.C295505oK.A0J(r0, r1, r5)
            com.google.android.gms.internal.mlkit_vision_text_common.zzn[] r1 = (com.google.android.gms.internal.mlkit_vision_text_common.zzn[]) r1
            goto L_0x1046
        L_0x1087:
            X.C295505oK.A0B(r0, r6)
            com.google.android.gms.internal.mlkit_vision_text_common.zzr r15 = new com.google.android.gms.internal.mlkit_vision_text_common.zzr
            r20 = r1
            r16 = r2
            r17 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            return r15
        L_0x1096:
            int r4 = X.C295505oK.A00(r0)
            r3 = 0
        L_0x109b:
            int r1 = r0.dataPosition()
            if (r1 >= r4) goto L_0x10ab
            int r2 = r0.readInt()
            char r1 = (char) r2
            java.lang.String r3 = X.Pxj.A0n(r0, r3, r1, r2)
            goto L_0x109b
        L_0x10ab:
            X.C295505oK.A0B(r0, r4)
            com.google.android.gms.internal.mlkit_vision_text_common.zzp r15 = new com.google.android.gms.internal.mlkit_vision_text_common.zzp
            r15.<init>(r3)
            return r15
        L_0x10b4:
            int r2 = X.C295505oK.A00(r0)
        L_0x10b8:
            int r1 = r0.dataPosition()
            if (r1 >= r2) goto L_0x10c6
            int r1 = r0.readInt()
            X.C295505oK.A0C(r0, r1)
            goto L_0x10b8
        L_0x10c6:
            X.C295505oK.A0B(r0, r2)
            com.google.android.gms.internal.mlkit_vision_text_common.zzn r15 = new com.google.android.gms.internal.mlkit_vision_text_common.zzn
            r15.<init>()
            return r15
        L_0x10cf:
            int r6 = X.C295505oK.A00(r0)
            r5 = 0
            r4 = r5
        L_0x10d5:
            int r1 = r0.dataPosition()
            if (r1 >= r6) goto L_0x10f6
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            if (r2 == r1) goto L_0x10f1
            r1 = 2
            if (r2 == r1) goto L_0x10ea
            X.C295505oK.A0C(r0, r3)
            goto L_0x10d5
        L_0x10ea:
            android.os.Parcelable$Creator r1 = com.google.android.gms.internal.mlkit_vision_text_common.zznr.CREATOR
            java.util.ArrayList r4 = X.C295505oK.A0A(r0, r1, r3)
            goto L_0x10d5
        L_0x10f1:
            java.lang.String r5 = X.C295505oK.A08(r0, r3)
            goto L_0x10d5
        L_0x10f6:
            X.C295505oK.A0B(r0, r6)
            com.google.android.gms.internal.mlkit_vision_text_common.zznx r15 = new com.google.android.gms.internal.mlkit_vision_text_common.zznx
            r15.<init>(r5, r4)
            return r15
        L_0x10ff:
            int r4 = X.C295505oK.A00(r0)
            r20 = 0
            r17 = r20
            r1 = r20
            r19 = r1
            r18 = r1
        L_0x110d:
            int r2 = r0.dataPosition()
            if (r2 >= r4) goto L_0x114c
            int r3 = r0.readInt()
            char r5 = (char) r3
            r2 = 1
            if (r5 == r2) goto L_0x1147
            r2 = 2
            if (r5 == r2) goto L_0x113e
            r2 = 3
            if (r5 == r2) goto L_0x1137
            r2 = 4
            if (r5 == r2) goto L_0x1132
            r2 = 5
            if (r5 == r2) goto L_0x112b
            X.C295505oK.A0C(r0, r3)
            goto L_0x110d
        L_0x112b:
            android.os.Parcelable$Creator r2 = com.google.android.gms.internal.mlkit_vision_text_common.zznt.CREATOR
            java.util.ArrayList r20 = X.C295505oK.A0A(r0, r2, r3)
            goto L_0x110d
        L_0x1132:
            java.lang.String r18 = X.C295505oK.A08(r0, r3)
            goto L_0x110d
        L_0x1137:
            android.os.Parcelable$Creator r2 = android.graphics.Point.CREATOR
            java.util.ArrayList r19 = X.C295505oK.A0A(r0, r2, r3)
            goto L_0x110d
        L_0x113e:
            android.os.Parcelable$Creator r1 = android.graphics.Rect.CREATOR
            android.os.Parcelable r1 = X.C295505oK.A04(r0, r1, r3)
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            goto L_0x110d
        L_0x1147:
            java.lang.String r17 = X.C295505oK.A08(r0, r3)
            goto L_0x110d
        L_0x114c:
            X.C295505oK.A0B(r0, r4)
            com.google.android.gms.internal.mlkit_vision_text_common.zznv r15 = new com.google.android.gms.internal.mlkit_vision_text_common.zznv
            r16 = r1
            r15.<init>(r16, r17, r18, r19, r20)
            return r15
        L_0x1157:
            int r8 = X.C295505oK.A00(r0)
            r7 = 0
            r1 = r7
            r6 = r7
            r5 = r7
        L_0x115f:
            int r2 = r0.dataPosition()
            if (r2 >= r8) goto L_0x118e
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 1
            if (r3 == r2) goto L_0x1189
            r2 = 2
            if (r3 == r2) goto L_0x1180
            r2 = 3
            if (r3 == r2) goto L_0x1179
            r2 = 4
            java.lang.String r5 = X.Pxi.A0f(r0, r5, r3, r2, r4)
            goto L_0x115f
        L_0x1179:
            android.os.Parcelable$Creator r2 = android.graphics.Point.CREATOR
            java.util.ArrayList r6 = X.C295505oK.A0A(r0, r2, r4)
            goto L_0x115f
        L_0x1180:
            android.os.Parcelable$Creator r1 = android.graphics.Rect.CREATOR
            android.os.Parcelable r1 = X.C295505oK.A04(r0, r1, r4)
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            goto L_0x115f
        L_0x1189:
            java.lang.String r7 = X.C295505oK.A08(r0, r4)
            goto L_0x115f
        L_0x118e:
            X.C295505oK.A0B(r0, r8)
            com.google.android.gms.internal.mlkit_vision_text_common.zznt r15 = new com.google.android.gms.internal.mlkit_vision_text_common.zznt
            r15.<init>(r1, r7, r5, r6)
            return r15
        L_0x1197:
            int r4 = X.C295505oK.A00(r0)
            r20 = 0
            r17 = r20
            r1 = r20
            r19 = r1
            r18 = r1
        L_0x11a5:
            int r2 = r0.dataPosition()
            if (r2 >= r4) goto L_0x11e4
            int r3 = r0.readInt()
            char r5 = (char) r3
            r2 = 1
            if (r5 == r2) goto L_0x11df
            r2 = 2
            if (r5 == r2) goto L_0x11d6
            r2 = 3
            if (r5 == r2) goto L_0x11cf
            r2 = 4
            if (r5 == r2) goto L_0x11ca
            r2 = 5
            if (r5 == r2) goto L_0x11c3
            X.C295505oK.A0C(r0, r3)
            goto L_0x11a5
        L_0x11c3:
            android.os.Parcelable$Creator r2 = com.google.android.gms.internal.mlkit_vision_text_common.zznv.CREATOR
            java.util.ArrayList r20 = X.C295505oK.A0A(r0, r2, r3)
            goto L_0x11a5
        L_0x11ca:
            java.lang.String r18 = X.C295505oK.A08(r0, r3)
            goto L_0x11a5
        L_0x11cf:
            android.os.Parcelable$Creator r2 = android.graphics.Point.CREATOR
            java.util.ArrayList r19 = X.C295505oK.A0A(r0, r2, r3)
            goto L_0x11a5
        L_0x11d6:
            android.os.Parcelable$Creator r1 = android.graphics.Rect.CREATOR
            android.os.Parcelable r1 = X.C295505oK.A04(r0, r1, r3)
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            goto L_0x11a5
        L_0x11df:
            java.lang.String r17 = X.C295505oK.A08(r0, r3)
            goto L_0x11a5
        L_0x11e4:
            X.C295505oK.A0B(r0, r4)
            com.google.android.gms.internal.mlkit_vision_text_common.zznr r15 = new com.google.android.gms.internal.mlkit_vision_text_common.zznr
            r16 = r1
            r15.<init>(r16, r17, r18, r19, r20)
            return r15
        L_0x11ef:
            int r4 = X.C295505oK.A00(r0)
            r19 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r21 = 0
        L_0x11fd:
            int r1 = r0.dataPosition()
            if (r1 >= r4) goto L_0x1234
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            if (r2 == r1) goto L_0x122f
            r1 = 2
            if (r2 == r1) goto L_0x122a
            r1 = 3
            if (r2 == r1) goto L_0x1225
            r1 = 4
            if (r2 == r1) goto L_0x1220
            r1 = 5
            if (r2 == r1) goto L_0x121b
            X.C295505oK.A0C(r0, r3)
            goto L_0x11fd
        L_0x121b:
            long r19 = X.Pxi.A08(r0, r3)
            goto L_0x11fd
        L_0x1220:
            int r21 = X.Pxi.A05(r0, r3)
            goto L_0x11fd
        L_0x1225:
            int r18 = X.Pxh.A08(r0, r3)
            goto L_0x11fd
        L_0x122a:
            int r17 = X.Pxh.A08(r0, r3)
            goto L_0x11fd
        L_0x122f:
            int r16 = X.Pxh.A08(r0, r3)
            goto L_0x11fd
        L_0x1234:
            X.C295505oK.A0B(r0, r4)
            com.google.android.gms.internal.mlkit_vision_text_common.zznl r15 = new com.google.android.gms.internal.mlkit_vision_text_common.zznl
            r15.<init>(r16, r17, r18, r19, r21)
            return r15
        L_0x123d:
            int r6 = X.C295505oK.A00(r0)
            r1 = 0
            r2 = r1
            r3 = r1
            r4 = r1
            r19 = r1
            r20 = r1
            r22 = 0
            r23 = 0
            r26 = 0
            r24 = 0
            r25 = 0
        L_0x1253:
            int r5 = r0.dataPosition()
            if (r5 >= r6) goto L_0x12ac
            int r5 = r0.readInt()
            char r7 = (char) r5
            switch(r7) {
                case 2: goto L_0x12a3;
                case 3: goto L_0x129a;
                case 4: goto L_0x1291;
                case 5: goto L_0x1288;
                case 6: goto L_0x1283;
                case 7: goto L_0x1274;
                case 8: goto L_0x127e;
                case 9: goto L_0x126f;
                case 10: goto L_0x1279;
                case 11: goto L_0x126a;
                case 12: goto L_0x1265;
                default: goto L_0x1261;
            }
        L_0x1261:
            X.C295505oK.A0C(r0, r5)
            goto L_0x1253
        L_0x1265:
            int r25 = X.Pxh.A08(r0, r5)
            goto L_0x1253
        L_0x126a:
            int r24 = X.Pxh.A08(r0, r5)
            goto L_0x1253
        L_0x126f:
            int r23 = X.Pxh.A08(r0, r5)
            goto L_0x1253
        L_0x1274:
            float r22 = X.Pxh.A01(r0, r5)
            goto L_0x1253
        L_0x1279:
            boolean r26 = X.C295505oK.A0G(r0, r5)
            goto L_0x1253
        L_0x127e:
            java.lang.String r20 = X.C295505oK.A08(r0, r5)
            goto L_0x1253
        L_0x1283:
            java.lang.String r19 = X.C295505oK.A08(r0, r5)
            goto L_0x1253
        L_0x1288:
            android.os.Parcelable$Creator r4 = com.google.android.gms.internal.mlkit_vision_text_common.zzf.CREATOR
            android.os.Parcelable r4 = X.C295505oK.A04(r0, r4, r5)
            com.google.android.gms.internal.mlkit_vision_text_common.zzf r4 = (com.google.android.gms.internal.mlkit_vision_text_common.zzf) r4
            goto L_0x1253
        L_0x1291:
            android.os.Parcelable$Creator r3 = com.google.android.gms.internal.mlkit_vision_text_common.zzf.CREATOR
            android.os.Parcelable r3 = X.C295505oK.A04(r0, r3, r5)
            com.google.android.gms.internal.mlkit_vision_text_common.zzf r3 = (com.google.android.gms.internal.mlkit_vision_text_common.zzf) r3
            goto L_0x1253
        L_0x129a:
            android.os.Parcelable$Creator r2 = com.google.android.gms.internal.mlkit_vision_text_common.zzf.CREATOR
            android.os.Parcelable r2 = X.C295505oK.A04(r0, r2, r5)
            com.google.android.gms.internal.mlkit_vision_text_common.zzf r2 = (com.google.android.gms.internal.mlkit_vision_text_common.zzf) r2
            goto L_0x1253
        L_0x12a3:
            android.os.Parcelable$Creator r1 = com.google.android.gms.internal.mlkit_vision_text_common.zzr.CREATOR
            java.lang.Object[] r1 = X.C295505oK.A0J(r0, r1, r5)
            com.google.android.gms.internal.mlkit_vision_text_common.zzr[] r1 = (com.google.android.gms.internal.mlkit_vision_text_common.zzr[]) r1
            goto L_0x1253
        L_0x12ac:
            X.C295505oK.A0B(r0, r6)
            com.google.android.gms.internal.mlkit_vision_text_common.zzl r15 = new com.google.android.gms.internal.mlkit_vision_text_common.zzl
            r18 = r4
            r21 = r1
            r16 = r2
            r17 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return r15
        L_0x12bd:
            int r5 = X.C295505oK.A00(r0)
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
        L_0x12cb:
            int r1 = r0.dataPosition()
            if (r1 >= r5) goto L_0x1305
            int r4 = r0.readInt()
            char r3 = (char) r4
            r1 = 2
            if (r3 == r1) goto L_0x1300
            r1 = 3
            if (r3 == r1) goto L_0x12fb
            r2 = 4
            if (r3 == r2) goto L_0x12f6
            r1 = 5
            if (r3 == r1) goto L_0x12f1
            r1 = 6
            if (r3 == r1) goto L_0x12e9
            X.C295505oK.A0C(r0, r4)
            goto L_0x12cb
        L_0x12e9:
            X.C295505oK.A0F(r0, r4, r2)
            float r20 = r0.readFloat()
            goto L_0x12cb
        L_0x12f1:
            int r19 = X.Pxi.A05(r0, r4)
            goto L_0x12cb
        L_0x12f6:
            int r18 = X.Pxi.A05(r0, r4)
            goto L_0x12cb
        L_0x12fb:
            int r17 = X.Pxh.A08(r0, r4)
            goto L_0x12cb
        L_0x1300:
            int r16 = X.Pxh.A08(r0, r4)
            goto L_0x12cb
        L_0x1305:
            X.C295505oK.A0B(r0, r5)
            com.google.android.gms.internal.mlkit_vision_text_common.zzf r15 = new com.google.android.gms.internal.mlkit_vision_text_common.zzf
            r15.<init>(r16, r17, r18, r19, r20)
            return r15
        L_0x130e:
            int r10 = X.C295505oK.A00(r0)
            r3 = 0
            r1 = 0
            r2 = 0
            r9 = 0
            r8 = 0
        L_0x1318:
            int r5 = r0.dataPosition()
            if (r5 >= r10) goto L_0x134f
            int r7 = r0.readInt()
            char r6 = (char) r7
            r5 = 2
            if (r6 == r5) goto L_0x134a
            r5 = 3
            if (r6 == r5) goto L_0x1345
            r5 = 4
            if (r6 == r5) goto L_0x1340
            r5 = 5
            if (r6 == r5) goto L_0x133b
            r5 = 6
            if (r6 == r5) goto L_0x1336
            X.C295505oK.A0C(r0, r7)
            goto L_0x1318
        L_0x1336:
            int r8 = X.Pxi.A05(r0, r7)
            goto L_0x1318
        L_0x133b:
            long r3 = X.Pxi.A08(r0, r7)
            goto L_0x1318
        L_0x1340:
            int r9 = X.Pxi.A05(r0, r7)
            goto L_0x1318
        L_0x1345:
            int r2 = X.Pxh.A08(r0, r7)
            goto L_0x1318
        L_0x134a:
            int r1 = X.Pxh.A08(r0, r7)
            goto L_0x1318
        L_0x134f:
            X.C295505oK.A0B(r0, r10)
            com.google.android.gms.internal.mlkit_vision_text_common.zzd r15 = new com.google.android.gms.internal.mlkit_vision_text_common.zzd
            r15.<init>()
            r15.A00 = r1
            r15.A01 = r2
            r15.A02 = r9
            r15.A04 = r3
            r15.A03 = r8
            return r15
        L_0x1362:
            int r9 = X.C295505oK.A00(r0)
            r8 = 1
            r2 = 0
            r7 = r2
            r4 = r2
            r1 = 1
        L_0x136b:
            int r3 = r0.dataPosition()
            if (r3 >= r9) goto L_0x139d
            int r6 = r0.readInt()
            char r5 = (char) r6
            if (r5 == r8) goto L_0x1398
            r3 = 2
            if (r5 == r3) goto L_0x138f
            r3 = 3
            if (r5 == r3) goto L_0x138a
            r3 = 4
            if (r5 == r3) goto L_0x1385
            X.C295505oK.A0C(r0, r6)
            goto L_0x136b
        L_0x1385:
            android.os.IBinder r4 = X.C295505oK.A03(r0, r6)
            goto L_0x136b
        L_0x138a:
            android.os.IBinder r7 = X.C295505oK.A03(r0, r6)
            goto L_0x136b
        L_0x138f:
            android.os.Parcelable$Creator r2 = com.google.android.gms.internal.location.zzj.CREATOR
            android.os.Parcelable r2 = X.C295505oK.A04(r0, r2, r6)
            com.google.android.gms.internal.location.zzj r2 = (com.google.android.gms.internal.location.zzj) r2
            goto L_0x136b
        L_0x1398:
            int r1 = X.Pxh.A08(r0, r6)
            goto L_0x136b
        L_0x139d:
            X.C295505oK.A0B(r0, r9)
            com.google.android.gms.internal.location.zzl r15 = new com.google.android.gms.internal.location.zzl
            r15.<init>()
            r15.A00 = r1
            r15.A02 = r2
            r3 = 0
            if (r7 != 0) goto L_0x13d3
            r2 = r3
        L_0x13ad:
            r15.A03 = r2
            if (r4 == 0) goto L_0x13bd
            java.lang.String r1 = "com.google.android.gms.location.internal.IFusedLocationProviderCallback"
            android.os.IInterface r3 = r4.queryLocalInterface(r1)
            boolean r0 = r3 instanceof com.google.android.gms.internal.location.zzai
            if (r0 == 0) goto L_0x13c0
            com.google.android.gms.internal.location.zzai r3 = (com.google.android.gms.internal.location.zzai) r3
        L_0x13bd:
            r15.A01 = r3
            return r15
        L_0x13c0:
            com.google.android.gms.internal.location.zzak r3 = new com.google.android.gms.internal.location.zzak
            r3.<init>(r1, r4)
            r0 = -1820971121(0xffffffff93762f8f, float:-3.1073013E-27)
            int r1 = X.AnonymousClass0fD.A03(r0)
            r0 = -911171265(0xffffffffc9b0a13f, float:-1446951.9)
            X.AnonymousClass0fD.A0A(r0, r1)
            goto L_0x13bd
        L_0x13d3:
            java.lang.String r1 = "com.google.android.gms.location.IDeviceOrientationListener"
            android.os.IInterface r2 = r7.queryLocalInterface(r1)
            boolean r0 = r2 instanceof com.google.android.gms.location.zzak
            if (r0 == 0) goto L_0x13e0
            com.google.android.gms.location.zzak r2 = (com.google.android.gms.location.zzak) r2
            goto L_0x13ad
        L_0x13e0:
            com.google.android.gms.location.zzam r2 = new com.google.android.gms.location.zzam
            r2.<init>(r1, r7)
            r0 = -1933781045(0xffffffff8cbcd7cb, float:-2.9095862E-31)
            int r1 = X.AnonymousClass0fD.A03(r0)
            r0 = -873379255(0xffffffffcbf14a49, float:-3.1626386E7)
            X.AnonymousClass0fD.A0A(r0, r1)
            goto L_0x13ad
        L_0x13f3:
            int r7 = X.C295505oK.A00(r0)
            com.google.android.gms.location.zzo r1 = com.google.android.gms.internal.location.zzj.A03
            java.util.List r6 = com.google.android.gms.internal.location.zzj.A04
            r5 = 0
        L_0x13fc:
            int r2 = r0.dataPosition()
            if (r2 >= r7) goto L_0x1422
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 1
            if (r3 == r2) goto L_0x1419
            r2 = 2
            if (r3 == r2) goto L_0x1412
            java.lang.String r5 = X.Pxj.A0o(r0, r5, r3, r4)
            goto L_0x13fc
        L_0x1412:
            android.os.Parcelable$Creator r2 = com.google.android.gms.common.internal.ClientIdentity.CREATOR
            java.util.ArrayList r6 = X.C295505oK.A0A(r0, r2, r4)
            goto L_0x13fc
        L_0x1419:
            android.os.Parcelable$Creator r1 = com.google.android.gms.location.zzo.CREATOR
            android.os.Parcelable r1 = X.C295505oK.A04(r0, r1, r4)
            com.google.android.gms.location.zzo r1 = (com.google.android.gms.location.zzo) r1
            goto L_0x13fc
        L_0x1422:
            X.C295505oK.A0B(r0, r7)
            com.google.android.gms.internal.location.zzj r15 = new com.google.android.gms.internal.location.zzj
            r15.<init>()
            r15.A00 = r1
            r15.A02 = r6
            r15.A01 = r5
            return r15
        L_0x1431:
            int r3 = X.C295505oK.A00(r0)
            r16 = 0
            r17 = 0
            r19 = 0
            r25 = 0
            r22 = 0
            r1 = 0
            r21 = 0
            r23 = 0
            r24 = -1
        L_0x1446:
            int r2 = r0.dataPosition()
            if (r2 >= r3) goto L_0x1486
            int r4 = r0.readInt()
            char r2 = (char) r4
            switch(r2) {
                case 1: goto L_0x1481;
                case 2: goto L_0x1458;
                case 3: goto L_0x147b;
                case 4: goto L_0x1476;
                case 5: goto L_0x1471;
                case 6: goto L_0x146c;
                case 7: goto L_0x1467;
                case 8: goto L_0x1462;
                case 9: goto L_0x145d;
                default: goto L_0x1454;
            }
        L_0x1454:
            X.C295505oK.A0C(r0, r4)
            goto L_0x1446
        L_0x1458:
            long r25 = X.Pxi.A08(r0, r4)
            goto L_0x1446
        L_0x145d:
            int r24 = X.Pxh.A08(r0, r4)
            goto L_0x1446
        L_0x1462:
            int r23 = X.Pxh.A08(r0, r4)
            goto L_0x1446
        L_0x1467:
            int r22 = X.Pxh.A08(r0, r4)
            goto L_0x1446
        L_0x146c:
            float r21 = X.Pxh.A01(r0, r4)
            goto L_0x1446
        L_0x1471:
            double r19 = X.Pxi.A00(r0, r4)
            goto L_0x1446
        L_0x1476:
            double r17 = X.Pxi.A00(r0, r4)
            goto L_0x1446
        L_0x147b:
            int r1 = X.Pxh.A08(r0, r4)
            short r1 = (short) r1
            goto L_0x1446
        L_0x1481:
            java.lang.String r16 = X.C295505oK.A08(r0, r4)
            goto L_0x1446
        L_0x1486:
            X.C295505oK.A0B(r0, r3)
            com.google.android.gms.internal.location.zzbg r15 = new com.google.android.gms.internal.location.zzbg
            r27 = r1
            r15.<init>(r16, r17, r19, r21, r22, r23, r24, r25, r27)
            return r15
        L_0x1491:
            int r5 = X.C295505oK.A00(r0)
            r1 = 0
            r17 = r1
            r2 = r1
            r18 = r1
            r19 = r1
            r21 = 1
        L_0x149f:
            int r3 = r0.dataPosition()
            if (r3 >= r5) goto L_0x14d7
            int r4 = r0.readInt()
            char r3 = (char) r4
            switch(r3) {
                case 1: goto L_0x14b1;
                case 2: goto L_0x14ce;
                case 3: goto L_0x14c9;
                case 4: goto L_0x14c0;
                case 5: goto L_0x14bb;
                case 6: goto L_0x14b6;
                default: goto L_0x14ad;
            }
        L_0x14ad:
            X.C295505oK.A0C(r0, r4)
            goto L_0x149f
        L_0x14b1:
            int r21 = X.Pxh.A08(r0, r4)
            goto L_0x149f
        L_0x14b6:
            android.os.IBinder r19 = X.C295505oK.A03(r0, r4)
            goto L_0x149f
        L_0x14bb:
            android.os.IBinder r18 = X.C295505oK.A03(r0, r4)
            goto L_0x149f
        L_0x14c0:
            android.os.Parcelable$Creator r2 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r2 = X.C295505oK.A04(r0, r2, r4)
            android.app.PendingIntent r2 = (android.app.PendingIntent) r2
            goto L_0x149f
        L_0x14c9:
            android.os.IBinder r17 = X.C295505oK.A03(r0, r4)
            goto L_0x149f
        L_0x14ce:
            android.os.Parcelable$Creator r1 = com.google.android.gms.internal.location.zzbc.CREATOR
            android.os.Parcelable r1 = X.C295505oK.A04(r0, r1, r4)
            com.google.android.gms.internal.location.zzbc r1 = (com.google.android.gms.internal.location.zzbc) r1
            goto L_0x149f
        L_0x14d7:
            X.C295505oK.A0B(r0, r5)
            com.google.android.gms.internal.location.zzbe r15 = new com.google.android.gms.internal.location.zzbe
            r20 = r1
            r16 = r2
            r15.<init>(r16, r17, r18, r19, r20, r21)
            return r15
        L_0x14e4:
            int r13 = X.C295505oK.A00(r0)
            java.util.List r4 = com.google.android.gms.internal.location.zzbc.A0B
            r1 = 0
            r16 = r1
            r12 = r1
            r11 = r1
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = 0
            r9 = 0
            r8 = 0
            r7 = 0
            r6 = 0
        L_0x14f9:
            int r5 = r0.dataPosition()
            if (r5 >= r13) goto L_0x154b
            int r5 = r0.readInt()
            char r15 = (char) r5
            r14 = 1
            if (r15 == r14) goto L_0x1542
            switch(r15) {
                case 5: goto L_0x153b;
                case 6: goto L_0x1536;
                case 7: goto L_0x1531;
                case 8: goto L_0x152c;
                case 9: goto L_0x1527;
                case 10: goto L_0x1522;
                case 11: goto L_0x151d;
                case 12: goto L_0x1518;
                case 13: goto L_0x1513;
                case 14: goto L_0x150e;
                default: goto L_0x150a;
            }
        L_0x150a:
            X.C295505oK.A0C(r0, r5)
            goto L_0x14f9
        L_0x150e:
            long r2 = X.Pxi.A08(r0, r5)
            goto L_0x14f9
        L_0x1513:
            java.lang.String r11 = X.C295505oK.A08(r0, r5)
            goto L_0x14f9
        L_0x1518:
            boolean r6 = X.C295505oK.A0G(r0, r5)
            goto L_0x14f9
        L_0x151d:
            boolean r7 = X.C295505oK.A0G(r0, r5)
            goto L_0x14f9
        L_0x1522:
            java.lang.String r12 = X.C295505oK.A08(r0, r5)
            goto L_0x14f9
        L_0x1527:
            boolean r8 = X.C295505oK.A0G(r0, r5)
            goto L_0x14f9
        L_0x152c:
            boolean r9 = X.C295505oK.A0G(r0, r5)
            goto L_0x14f9
        L_0x1531:
            boolean r10 = X.C295505oK.A0G(r0, r5)
            goto L_0x14f9
        L_0x1536:
            java.lang.String r16 = X.C295505oK.A08(r0, r5)
            goto L_0x14f9
        L_0x153b:
            android.os.Parcelable$Creator r4 = com.google.android.gms.common.internal.ClientIdentity.CREATOR
            java.util.ArrayList r4 = X.C295505oK.A0A(r0, r4, r5)
            goto L_0x14f9
        L_0x1542:
            android.os.Parcelable$Creator r1 = com.google.android.gms.location.LocationRequest.CREATOR
            android.os.Parcelable r1 = X.C295505oK.A04(r0, r1, r5)
            com.google.android.gms.location.LocationRequest r1 = (com.google.android.gms.location.LocationRequest) r1
            goto L_0x14f9
        L_0x154b:
            X.C295505oK.A0B(r0, r13)
            com.google.android.gms.internal.location.zzbc r15 = new com.google.android.gms.internal.location.zzbc
            r15.<init>()
            r15.A01 = r1
            r15.A05 = r4
            r0 = r16
            r15.A02 = r0
            r15.A06 = r10
            r15.A07 = r9
            r15.A08 = r8
            r15.A03 = r12
            r15.A09 = r7
            r15.A0A = r6
            r15.A04 = r11
            r15.A00 = r2
            return r15
        L_0x156c:
            int r5 = X.C295505oK.A00(r0)
            r1 = 0
        L_0x1571:
            int r2 = r0.dataPosition()
            if (r2 >= r5) goto L_0x158c
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 1
            if (r3 == r2) goto L_0x1583
            X.C295505oK.A0C(r0, r4)
            goto L_0x1571
        L_0x1583:
            android.os.Parcelable$Creator r1 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r1 = X.C295505oK.A04(r0, r1, r4)
            com.google.android.gms.common.api.Status r1 = (com.google.android.gms.common.api.Status) r1
            goto L_0x1571
        L_0x158c:
            X.C295505oK.A0B(r0, r5)
            com.google.android.gms.internal.location.zzac r15 = new com.google.android.gms.internal.location.zzac
            r15.<init>(r1)
            return r15
        L_0x1595:
            com.google.android.gms.internal.gtm.zzbk r15 = new com.google.android.gms.internal.gtm.zzbk
            r15.<init>()
            java.lang.String r1 = r0.readString()
            r15.A01 = r1
            java.lang.String r1 = r0.readString()
            r15.A02 = r1
            java.lang.String r0 = r0.readString()
            r15.A00 = r0
            return r15
        L_0x15ad:
            int r3 = X.C295505oK.A00(r0)
            r16 = 0
            r17 = r16
            r18 = r16
            r19 = r16
            r20 = 0
            r21 = 0
            r23 = 1
            r24 = 0
            r22 = 0
        L_0x15c3:
            int r1 = r0.dataPosition()
            if (r1 >= r3) goto L_0x1602
            int r2 = r0.readInt()
            char r1 = (char) r2
            switch(r1) {
                case 2: goto L_0x15fd;
                case 3: goto L_0x15df;
                case 4: goto L_0x15da;
                case 5: goto L_0x15f8;
                case 6: goto L_0x15f3;
                case 7: goto L_0x15ee;
                case 8: goto L_0x15e9;
                case 9: goto L_0x15e4;
                case 10: goto L_0x15d5;
                default: goto L_0x15d1;
            }
        L_0x15d1:
            X.C295505oK.A0C(r0, r2)
            goto L_0x15c3
        L_0x15d5:
            int r22 = X.Pxh.A08(r0, r2)
            goto L_0x15c3
        L_0x15da:
            int r21 = X.Pxh.A08(r0, r2)
            goto L_0x15c3
        L_0x15df:
            int r20 = X.Pxh.A08(r0, r2)
            goto L_0x15c3
        L_0x15e4:
            boolean r24 = X.C295505oK.A0G(r0, r2)
            goto L_0x15c3
        L_0x15e9:
            java.lang.String r19 = X.C295505oK.A08(r0, r2)
            goto L_0x15c3
        L_0x15ee:
            boolean r23 = X.C295505oK.A0G(r0, r2)
            goto L_0x15c3
        L_0x15f3:
            java.lang.String r18 = X.C295505oK.A08(r0, r2)
            goto L_0x15c3
        L_0x15f8:
            java.lang.String r17 = X.C295505oK.A08(r0, r2)
            goto L_0x15c3
        L_0x15fd:
            java.lang.String r16 = X.C295505oK.A08(r0, r2)
            goto L_0x15c3
        L_0x1602:
            X.C295505oK.A0B(r0, r3)
            com.google.android.gms.internal.clearcut.zzr r15 = new com.google.android.gms.internal.clearcut.zzr
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r15
        L_0x160b:
            int r6 = X.C295505oK.A00(r0)
            r5 = 0
            r1 = 0
        L_0x1611:
            int r2 = r0.dataPosition()
            if (r2 >= r6) goto L_0x1629
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 1
            if (r3 == r2) goto L_0x1624
            java.lang.String r5 = X.Pxj.A0n(r0, r5, r3, r4)
            goto L_0x1611
        L_0x1624:
            int r1 = X.Pxh.A08(r0, r4)
            goto L_0x1611
        L_0x1629:
            X.C295505oK.A0B(r0, r6)
            com.google.android.gms.internal.auth.zzbw r15 = new com.google.android.gms.internal.auth.zzbw
            r15.<init>(r1, r5)
            return r15
        L_0x1632:
            int r6 = X.C295505oK.A00(r0)
            r5 = 0
            r1 = r5
        L_0x1638:
            int r2 = r0.dataPosition()
            if (r2 >= r6) goto L_0x1665
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 1
            if (r3 == r2) goto L_0x165e
            r2 = 2
            if (r3 == r2) goto L_0x1659
            r2 = 3
            if (r3 == r2) goto L_0x1650
            X.C295505oK.A0C(r0, r4)
            goto L_0x1638
        L_0x1650:
            android.os.Parcelable$Creator r1 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r1 = X.C295505oK.A04(r0, r1, r4)
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
            goto L_0x1638
        L_0x1659:
            java.lang.String r5 = X.C295505oK.A08(r0, r4)
            goto L_0x1638
        L_0x165e:
            X.C295505oK.A0D(r0, r4)
            r0.readInt()
            goto L_0x1638
        L_0x1665:
            X.C295505oK.A0B(r0, r6)
            com.google.android.gms.internal.auth.zzbb r15 = new com.google.android.gms.internal.auth.zzbb
            r15.<init>(r1, r5)
            return r15
        L_0x166e:
            int r6 = X.C295505oK.A00(r0)
            r5 = 0
            r4 = r5
        L_0x1674:
            int r1 = r0.dataPosition()
            if (r1 >= r6) goto L_0x1697
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            if (r2 == r1) goto L_0x1690
            r1 = 2
            if (r2 == r1) goto L_0x168b
            r1 = 3
            byte[] r4 = X.Pxi.A1a(r0, r4, r2, r1, r3)
            goto L_0x1674
        L_0x168b:
            java.lang.String r5 = X.C295505oK.A08(r0, r3)
            goto L_0x1674
        L_0x1690:
            X.C295505oK.A0D(r0, r3)
            r0.readInt()
            goto L_0x1674
        L_0x1697:
            X.C295505oK.A0B(r0, r6)
            com.google.android.gms.internal.auth.zzaz r15 = new com.google.android.gms.internal.auth.zzaz
            r15.<init>(r4, r5)
            return r15
        L_0x16a0:
            int r5 = X.C295505oK.A00(r0)
            r4 = 0
        L_0x16a5:
            int r1 = r0.dataPosition()
            if (r1 >= r5) goto L_0x16bf
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            if (r2 == r1) goto L_0x16b8
            java.lang.String r4 = X.Pxj.A0n(r0, r4, r2, r3)
            goto L_0x16a5
        L_0x16b8:
            X.C295505oK.A0D(r0, r3)
            r0.readInt()
            goto L_0x16a5
        L_0x16bf:
            X.C295505oK.A0B(r0, r5)
            com.google.android.gms.internal.auth.zzax r15 = new com.google.android.gms.internal.auth.zzax
            r15.<init>(r4)
            return r15
        L_0x16c8:
            int r6 = X.C295505oK.A00(r0)
            r5 = 0
            r4 = 0
        L_0x16ce:
            int r1 = r0.dataPosition()
            if (r1 >= r6) goto L_0x16f1
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            if (r2 == r1) goto L_0x16ea
            r1 = 2
            if (r2 == r1) goto L_0x16e5
            r1 = 3
            int r4 = X.Pxj.A09(r0, r2, r1, r3, r4)
            goto L_0x16ce
        L_0x16e5:
            java.lang.String r5 = X.C295505oK.A08(r0, r3)
            goto L_0x16ce
        L_0x16ea:
            X.C295505oK.A0D(r0, r3)
            r0.readInt()
            goto L_0x16ce
        L_0x16f1:
            X.C295505oK.A0B(r0, r6)
            com.google.android.gms.internal.auth.zzav r15 = new com.google.android.gms.internal.auth.zzav
            r15.<init>(r5, r4)
            return r15
        L_0x16fa:
            int r5 = X.C295505oK.A00(r0)
            r4 = 0
        L_0x16ff:
            int r1 = r0.dataPosition()
            if (r1 >= r5) goto L_0x1719
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 1
            if (r2 == r1) goto L_0x1712
            java.lang.String r4 = X.Pxj.A0n(r0, r4, r2, r3)
            goto L_0x16ff
        L_0x1712:
            X.C295505oK.A0D(r0, r3)
            r0.readInt()
            goto L_0x16ff
        L_0x1719:
            X.C295505oK.A0B(r0, r5)
            com.google.android.gms.internal.auth.zzaq r15 = new com.google.android.gms.internal.auth.zzaq
            r15.<init>(r4)
            return r15
        L_0x1722:
            int r5 = X.C295505oK.A00(r0)
            r1 = 0
        L_0x1727:
            int r2 = r0.dataPosition()
            if (r2 >= r5) goto L_0x1742
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 1
            if (r3 == r2) goto L_0x1739
            X.C295505oK.A0C(r0, r4)
            goto L_0x1727
        L_0x1739:
            android.os.Parcelable$Creator r1 = com.google.android.gms.auth.api.credentials.Credential.CREATOR
            android.os.Parcelable r1 = X.C295505oK.A04(r0, r1, r4)
            com.google.android.gms.auth.api.credentials.Credential r1 = (com.google.android.gms.auth.api.credentials.Credential) r1
            goto L_0x1727
        L_0x1742:
            X.C295505oK.A0B(r0, r5)
            com.google.android.gms.internal.auth-api.zbu r15 = new com.google.android.gms.internal.auth-api.zbu
            r15.<init>(r1)
            return r15
        L_0x174b:
            int r5 = X.C295505oK.A00(r0)
            r1 = 0
        L_0x1750:
            int r2 = r0.dataPosition()
            if (r2 >= r5) goto L_0x176b
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 1
            if (r3 == r2) goto L_0x1762
            X.C295505oK.A0C(r0, r4)
            goto L_0x1750
        L_0x1762:
            android.os.Parcelable$Creator r1 = com.google.android.gms.auth.api.credentials.Credential.CREATOR
            android.os.Parcelable r1 = X.C295505oK.A04(r0, r1, r4)
            com.google.android.gms.auth.api.credentials.Credential r1 = (com.google.android.gms.auth.api.credentials.Credential) r1
            goto L_0x1750
        L_0x176b:
            X.C295505oK.A0B(r0, r5)
            com.google.android.gms.internal.auth-api.zbp r15 = new com.google.android.gms.internal.auth-api.zbp
            r15.<init>(r1)
            return r15
        L_0x1774:
            int r8 = X.C295505oK.A00(r0)
            r7 = 0
            r6 = r7
            r5 = r7
            r4 = r7
        L_0x177c:
            int r1 = r0.dataPosition()
            if (r1 >= r8) goto L_0x17a5
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 2
            if (r2 == r1) goto L_0x17a0
            r1 = 3
            if (r2 == r1) goto L_0x179b
            r1 = 4
            if (r2 == r1) goto L_0x1796
            r1 = 5
            byte[] r4 = X.Pxi.A1a(r0, r4, r2, r1, r3)
            goto L_0x177c
        L_0x1796:
            byte[] r5 = X.C295505oK.A0H(r0, r3)
            goto L_0x177c
        L_0x179b:
            java.lang.String r6 = X.C295505oK.A08(r0, r3)
            goto L_0x177c
        L_0x17a0:
            byte[] r7 = X.C295505oK.A0H(r0, r3)
            goto L_0x177c
        L_0x17a5:
            X.C295505oK.A0B(r0, r8)
            com.google.android.gms.fido.u2f.api.common.SignResponseData r15 = new com.google.android.gms.fido.u2f.api.common.SignResponseData
            r15.<init>(r6, r7, r5, r4)
            return r15
        L_0x17ae:
            int r5 = X.C295505oK.A00(r0)
            r19 = 0
            r18 = r19
            r1 = r19
            r22 = r1
            r21 = r1
            r3 = r1
            r20 = r1
        L_0x17bf:
            int r2 = r0.dataPosition()
            if (r2 >= r5) goto L_0x17fe
            int r4 = r0.readInt()
            char r2 = (char) r4
            switch(r2) {
                case 2: goto L_0x17f9;
                case 3: goto L_0x17f4;
                case 4: goto L_0x17eb;
                case 5: goto L_0x17e6;
                case 6: goto L_0x17df;
                case 7: goto L_0x17d6;
                case 8: goto L_0x17d1;
                default: goto L_0x17cd;
            }
        L_0x17cd:
            X.C295505oK.A0C(r0, r4)
            goto L_0x17bf
        L_0x17d1:
            java.lang.String r20 = X.C295505oK.A08(r0, r4)
            goto L_0x17bf
        L_0x17d6:
            android.os.Parcelable$Creator r2 = com.google.android.gms.fido.u2f.api.common.ChannelIdValue.CREATOR
            android.os.Parcelable r3 = X.C295505oK.A04(r0, r2, r4)
            com.google.android.gms.fido.u2f.api.common.ChannelIdValue r3 = (com.google.android.gms.fido.u2f.api.common.ChannelIdValue) r3
            goto L_0x17bf
        L_0x17df:
            android.os.Parcelable$Creator r2 = com.google.android.gms.fido.u2f.api.common.RegisteredKey.CREATOR
            java.util.ArrayList r21 = X.C295505oK.A0A(r0, r2, r4)
            goto L_0x17bf
        L_0x17e6:
            byte[] r22 = X.C295505oK.A0H(r0, r4)
            goto L_0x17bf
        L_0x17eb:
            android.os.Parcelable$Creator r1 = android.net.Uri.CREATOR
            android.os.Parcelable r1 = X.C295505oK.A04(r0, r1, r4)
            android.net.Uri r1 = (android.net.Uri) r1
            goto L_0x17bf
        L_0x17f4:
            java.lang.Double r18 = X.C295505oK.A05(r0, r4)
            goto L_0x17bf
        L_0x17f9:
            java.lang.Integer r19 = X.C295505oK.A06(r0, r4)
            goto L_0x17bf
        L_0x17fe:
            X.C295505oK.A0B(r0, r5)
            com.google.android.gms.fido.u2f.api.common.SignRequestParams r15 = new com.google.android.gms.fido.u2f.api.common.SignRequestParams
            r16 = r1
            r17 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            return r15
        L_0x180b:
            int r7 = X.C295505oK.A00(r0)
            r1 = 0
            r6 = r1
            r5 = r1
        L_0x1812:
            int r2 = r0.dataPosition()
            if (r2 >= r7) goto L_0x1837
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 2
            if (r3 == r2) goto L_0x182e
            r2 = 3
            if (r3 == r2) goto L_0x1829
            r2 = 4
            java.lang.String r5 = X.Pxi.A0f(r0, r5, r3, r2, r4)
            goto L_0x1812
        L_0x1829:
            java.lang.String r6 = X.C295505oK.A08(r0, r4)
            goto L_0x1812
        L_0x182e:
            android.os.Parcelable$Creator r1 = com.google.android.gms.fido.u2f.api.common.KeyHandle.CREATOR
            android.os.Parcelable r1 = X.C295505oK.A04(r0, r1, r4)
            com.google.android.gms.fido.u2f.api.common.KeyHandle r1 = (com.google.android.gms.fido.u2f.api.common.KeyHandle) r1
            goto L_0x1812
        L_0x1837:
            X.C295505oK.A0B(r0, r7)
            com.google.android.gms.fido.u2f.api.common.RegisteredKey r15 = new com.google.android.gms.fido.u2f.api.common.RegisteredKey
            r15.<init>(r1, r6, r5)
            return r15
        L_0x1840:
            int r7 = X.C295505oK.A00(r0)
            r6 = 0
            r5 = r6
            r4 = r6
        L_0x1847:
            int r1 = r0.dataPosition()
            if (r1 >= r7) goto L_0x1868
            int r3 = r0.readInt()
            char r2 = (char) r3
            r1 = 2
            if (r2 == r1) goto L_0x1863
            r1 = 3
            if (r2 == r1) goto L_0x185e
            r1 = 4
            java.lang.String r4 = X.Pxi.A0f(r0, r4, r2, r1, r3)
            goto L_0x1847
        L_0x185e:
            java.lang.String r5 = X.C295505oK.A08(r0, r3)
            goto L_0x1847
        L_0x1863:
            byte[] r6 = X.C295505oK.A0H(r0, r3)
            goto L_0x1847
        L_0x1868:
            X.C295505oK.A0B(r0, r7)
            com.google.android.gms.fido.u2f.api.common.RegisterResponseData r15 = new com.google.android.gms.fido.u2f.api.common.RegisterResponseData
            r15.<init>(r5, r4, r6)
            return r15
        L_0x1871:
            int r5 = X.C295505oK.A00(r0)
            r19 = 0
            r18 = r19
            r1 = r19
            r21 = r1
            r22 = r1
            r3 = r1
            r20 = r1
        L_0x1882:
            int r2 = r0.dataPosition()
            if (r2 >= r5) goto L_0x18c3
            int r4 = r0.readInt()
            char r2 = (char) r4
            switch(r2) {
                case 2: goto L_0x18be;
                case 3: goto L_0x18b9;
                case 4: goto L_0x18b0;
                case 5: goto L_0x18a9;
                case 6: goto L_0x18a2;
                case 7: goto L_0x1899;
                case 8: goto L_0x1894;
                default: goto L_0x1890;
            }
        L_0x1890:
            X.C295505oK.A0C(r0, r4)
            goto L_0x1882
        L_0x1894:
            java.lang.String r20 = X.C295505oK.A08(r0, r4)
            goto L_0x1882
        L_0x1899:
            android.os.Parcelable$Creator r2 = com.google.android.gms.fido.u2f.api.common.ChannelIdValue.CREATOR
            android.os.Parcelable r3 = X.C295505oK.A04(r0, r2, r4)
            com.google.android.gms.fido.u2f.api.common.ChannelIdValue r3 = (com.google.android.gms.fido.u2f.api.common.ChannelIdValue) r3
            goto L_0x1882
        L_0x18a2:
            android.os.Parcelable$Creator r2 = com.google.android.gms.fido.u2f.api.common.RegisteredKey.CREATOR
            java.util.ArrayList r22 = X.C295505oK.A0A(r0, r2, r4)
            goto L_0x1882
        L_0x18a9:
            android.os.Parcelable$Creator r2 = com.google.android.gms.fido.u2f.api.common.RegisterRequest.CREATOR
            java.util.ArrayList r21 = X.C295505oK.A0A(r0, r2, r4)
            goto L_0x1882
        L_0x18b0:
            android.os.Parcelable$Creator r1 = android.net.Uri.CREATOR
            android.os.Parcelable r1 = X.C295505oK.A04(r0, r1, r4)
            android.net.Uri r1 = (android.net.Uri) r1
            goto L_0x1882
        L_0x18b9:
            java.lang.Double r18 = X.C295505oK.A05(r0, r4)
            goto L_0x1882
        L_0x18be:
            java.lang.Integer r19 = X.C295505oK.A06(r0, r4)
            goto L_0x1882
        L_0x18c3:
            X.C295505oK.A0B(r0, r5)
            com.google.android.gms.fido.u2f.api.common.RegisterRequestParams r15 = new com.google.android.gms.fido.u2f.api.common.RegisterRequestParams
            r16 = r1
            r17 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            return r15
        L_0x18d0:
            int r8 = X.C295505oK.A00(r0)
            r7 = 0
            r6 = r7
            r5 = r7
            r1 = 0
        L_0x18d8:
            int r2 = r0.dataPosition()
            if (r2 >= r8) goto L_0x1901
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 1
            if (r3 == r2) goto L_0x18fc
            r2 = 2
            if (r3 == r2) goto L_0x18f7
            r2 = 3
            if (r3 == r2) goto L_0x18f2
            r2 = 4
            java.lang.String r5 = X.Pxi.A0f(r0, r5, r3, r2, r4)
            goto L_0x18d8
        L_0x18f2:
            byte[] r6 = X.C295505oK.A0H(r0, r4)
            goto L_0x18d8
        L_0x18f7:
            java.lang.String r7 = X.C295505oK.A08(r0, r4)
            goto L_0x18d8
        L_0x18fc:
            int r1 = X.Pxh.A08(r0, r4)
            goto L_0x18d8
        L_0x1901:
            X.C295505oK.A0B(r0, r8)
            com.google.android.gms.fido.u2f.api.common.RegisterRequest r15 = new com.google.android.gms.fido.u2f.api.common.RegisterRequest
            r15.<init>(r7, r5, r6, r1)
            return r15
        L_0x190a:
            java.lang.String r0 = r0.readString()
            com.google.android.gms.fido.u2f.api.common.ProtocolVersion r15 = com.google.android.gms.fido.u2f.api.common.ProtocolVersion.A00(r0)     // Catch:{ RJu -> 0x1913 }
            return r15
        L_0x1913:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r0)
            throw r0
        L_0x1919:
            int r8 = X.C295505oK.A00(r0)
            r7 = 0
            r6 = r7
            r5 = r7
            r1 = 0
        L_0x1921:
            int r2 = r0.dataPosition()
            if (r2 >= r8) goto L_0x1952
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 1
            if (r3 == r2) goto L_0x194d
            r2 = 2
            if (r3 == r2) goto L_0x1948
            r2 = 3
            if (r3 == r2) goto L_0x1943
            r2 = 4
            if (r3 == r2) goto L_0x193c
            X.C295505oK.A0C(r0, r4)
            goto L_0x1921
        L_0x193c:
            android.os.Parcelable$Creator r2 = com.google.android.gms.fido.common.Transport.CREATOR
            java.util.ArrayList r5 = X.C295505oK.A0A(r0, r2, r4)
            goto L_0x1921
        L_0x1943:
            java.lang.String r6 = X.C295505oK.A08(r0, r4)
            goto L_0x1921
        L_0x1948:
            byte[] r7 = X.C295505oK.A0H(r0, r4)
            goto L_0x1921
        L_0x194d:
            int r1 = X.Pxh.A08(r0, r4)
            goto L_0x1921
        L_0x1952:
            X.C295505oK.A0B(r0, r8)
            com.google.android.gms.fido.u2f.api.common.KeyHandle r15 = new com.google.android.gms.fido.u2f.api.common.KeyHandle
            r15.<init>(r6, r5, r7, r1)
            return r15
        L_0x195b:
            int r6 = X.C295505oK.A00(r0)
            r5 = 0
            r1 = 0
        L_0x1961:
            int r2 = r0.dataPosition()
            if (r2 >= r6) goto L_0x1979
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 2
            if (r3 == r2) goto L_0x1974
            java.lang.String r5 = X.Pxj.A0o(r0, r5, r3, r4)
            goto L_0x1961
        L_0x1974:
            int r1 = X.Pxh.A08(r0, r4)
            goto L_0x1961
        L_0x1979:
            X.C295505oK.A0B(r0, r6)
            com.google.android.gms.fido.u2f.api.common.ErrorResponseData r15 = new com.google.android.gms.fido.u2f.api.common.ErrorResponseData
            r15.<init>(r1, r5)
            return r15
        L_0x1982:
            int r7 = X.C295505oK.A00(r0)
            r6 = 0
            r5 = r6
            r1 = 0
        L_0x1989:
            int r2 = r0.dataPosition()
            if (r2 >= r7) goto L_0x19aa
            int r4 = r0.readInt()
            char r3 = (char) r4
            r2 = 2
            if (r3 == r2) goto L_0x19a5
            r2 = 3
            if (r3 == r2) goto L_0x19a0
            r2 = 4
            java.lang.String r5 = X.Pxi.A0f(r0, r5, r3, r2, r4)
            goto L_0x1989
        L_0x19a0:
            java.lang.String r6 = X.C295505oK.A08(r0, r4)
            goto L_0x1989
        L_0x19a5:
            int r1 = X.Pxh.A08(r0, r4)
            goto L_0x1989
        L_0x19aa:
            X.C295505oK.A0B(r0, r7)
            com.google.android.gms.fido.u2f.api.common.ChannelIdValue r15 = new com.google.android.gms.fido.u2f.api.common.ChannelIdValue
            r15.<init>(r1, r6, r5)
            return r15
        L_0x19b3:
            com.google.android.gms.fido.u2f.api.common.ErrorCode r15 = com.google.android.gms.fido.u2f.api.common.ErrorCode.OTHER_ERROR
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SWR.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Deprecated
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new ChannelIdValue[i];
            case 1:
                return new ErrorCode[i];
            case 2:
                return new ErrorResponseData[i];
            case 3:
                return new KeyHandle[i];
            case 4:
                return new ProtocolVersion[i];
            case 5:
                return new RegisterRequest[i];
            case 6:
                return new RegisterRequestParams[i];
            case 7:
                return new RegisterResponseData[i];
            case 8:
                return new RegisteredKey[i];
            case 9:
                return new SignRequestParams[i];
            case 10:
                return new SignResponseData[i];
            case 11:
                return new zbp[i];
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return new zbu[i];
            case 13:
                return new zzaq[i];
            case 14:
                return new zzav[i];
            case 15:
                return new zzax[i];
            case 16:
                return new zzaz[i];
            case 17:
                return new zzbb[i];
            case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
                return new zzbw[i];
            case 19:
                return new zzr[i];
            case 20:
                return new zzbk[i];
            case 21:
                return new zzac[i];
            case 22:
                return new zzbc[i];
            case 23:
                return new zzbe[i];
            case 24:
                return new zzbg[i];
            case 25:
                return new zzj[i];
            case 26:
                return new zzl[i];
            case 27:
                return new zzd[i];
            case 28:
                return new zzf[i];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                return new com.google.android.gms.internal.mlkit_vision_text_common.zzl[i];
            case 30:
                return new zznl[i];
            case 31:
                return new zznr[i];
            case 32:
                return new zznt[i];
            case 33:
                return new zznv[i];
            case 34:
                return new zznx[i];
            case 35:
                return new zzn[i];
            case 36:
                return new zzp[i];
            case 37:
                return new com.google.android.gms.internal.mlkit_vision_text_common.zzr[i];
            case 38:
                return new zzab[i];
            case 39:
                return new zzah[i];
            case 40:
                return new zzaj[i];
            case Seq.NULL_REFNUM /*41*/:
                return new zzal[i];
            case Seq.RefTracker.REF_OFFSET /*42*/:
                return new zzam[i];
            case 43:
                return new zzao[i];
            case 44:
                return new zzfz[i];
            case 45:
                return new zzk[i];
            case 46:
                return new zzs[i];
            case 47:
                return new PlaceReport[i];
            case 48:
                return new GeofencingRequest[i];
            case 49:
                return new LocationAvailability[i];
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
                return new LocationRequest[i];
            case 51:
                return new LocationResult[i];
            case 52:
                return new zzay[i];
            case 53:
                return new LocationSettingsRequest[i];
            case 54:
                return new LocationSettingsResult[i];
            case 55:
                return new LocationSettingsStates[i];
            case 56:
                return new zzbd[i];
            case 57:
                return new com.google.android.gms.location.zzbe[i];
            case 58:
                return new ActivityRecognitionResult[i];
            case 59:
                return new ActivityTransition[i];
            case 60:
                return new ActivityTransitionEvent[i];
            case 61:
                return new ActivityTransitionRequest[i];
            case 62:
                return new ActivityTransitionResult[i];
            case 63:
                return new DetectedActivity[i];
            case 64:
                return new zzo[i];
            case 65:
                return new Configuration[i];
            case 66:
                return new ExperimentTokens[i];
            case 67:
                return new zzi[i];
            case 68:
                return new zza[i];
            case 69:
                return new HarmfulAppsData[i];
            case 70:
                return new com.google.android.gms.safetynet.zzd[i];
            case 71:
                return new com.google.android.gms.safetynet.zzf[i];
            case 72:
                return new zzh[i];
            case 73:
                return new SafeBrowsingData[i];
            case 74:
                return new zaa[i];
            case 75:
                return new zag[i];
            case 76:
                return new zai[i];
            case 77:
                return new zak[i];
            case 78:
                return new Barcode.Address[i];
            case 79:
                return new Barcode[i];
            case 80:
                return new Barcode.CalendarDateTime[i];
            case 81:
                return new Barcode.ContactInfo[i];
            case 82:
                return new Barcode.CalendarEvent[i];
            case 83:
                return new Barcode.Email[i];
            case 84:
                return new Barcode.DriverLicense[i];
            case 85:
                return new Barcode.PersonName[i];
            case 86:
                return new Barcode.GeoPoint[i];
            case 87:
                return new Barcode.Sms[i];
            case 88:
                return new Barcode.Phone[i];
            case 89:
                return new Barcode.WiFi[i];
            case 90:
                return new Barcode.UrlBookmark[i];
            case 91:
                return new com.google.android.gms.vision.face.internal.client.zza[i];
            case 92:
                return new FaceParcel[i];
            case 93:
                return new com.google.android.gms.vision.face.internal.client.zzf[i];
            case 94:
                return new LandmarkParcel[i];
            case 95:
                return new BadgeDrawable$SavedState[i];
            case 96:
                return new CalendarConstraints[i];
            case 97:
                return new CompositeDateValidator[i];
            case 98:
                return new DateValidatorPointBackward[i];
            default:
                return new DateValidatorPointForward[i];
        }
    }
}
